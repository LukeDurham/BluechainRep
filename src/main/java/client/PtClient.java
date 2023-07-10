package client;
import java.util.*;
import java.io.*;
import java.net.Socket;
import java.security.KeyPair;
import java.security.PrivateKey;

import node.communication.Address;
import node.communication.messaging.Message;
import node.communication.messaging.Messager;
import node.communication.utils.DSA;
import node.blockchain.defi.Account;
import node.blockchain.defi.DefiTransaction;
import node.blockchain.merkletree.MerkleTreeProof;

// How would we interpret account in our use case? Make sure peyton addresses this. import node.blockchain.defi.Account; 
import node.blockchain.prescription.PtTransaction;


public class PtClient {

    Object updateLock;
    BufferedReader reader;
    Address myAddress;
    ArrayList<Address> inQuorum; //list of Doctors addresses in the quorum 

    public PtClient(Object updateLock, BufferedReader reader, Address myAddress, ArrayList<Address> inQuorum) {
        this.updateLock = updateLock;
        this.reader = reader;
        this.myAddress = myAddress;
        this.inQuorum = inQuorum;
    }

    protected void submitPrescription() throws IOException {
        System.out.println("Generating Transaction");
        System.out.println("Enter the Pharamacy"); //improve on this concept.
        String pharmacy = reader.readLine();
        System.out.println("Enter the medication name"); 
        String medication = reader.readLine();
        System.out.println("What is the dosage"); 
        String dosage = reader.readLine();
        System.out.println("How many?");
        int amount = Integer.valueOf(reader.readLine());

        Account chosenPharmacy = null;

        //need Arraylist of pharamcies for doctor to send to. 

        // reference line above
        //for(Account account : accounts){
        //     if(account.getNickname().equals(nickname)) chosenAccount = account;
        // }

        if(chosenPharmacy == null){
            System.out.println("Pharmacy with the nickname " + pharmacy + " is not found.");
            return;
        } 

        PrivateKey pk = chosenPharmacy.getKeyPair().getPrivate();
        String myPublicKeyString = DSA.bytesToString(chosenPharmacy.getKeyPair().getPublic().getEncoded());

        



        

    }
    
}
