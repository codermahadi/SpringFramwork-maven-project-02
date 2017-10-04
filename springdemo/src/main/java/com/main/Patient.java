package com.main;

import java.util.List;

/**
 * Created by Mahadi on 9/28/2017.
 */
public class Patient {

    private List<EmarhencyContact> emarhencyContacts;
    private EmarhencyContact criticalContact;

    public Patient(){

    }

    public EmarhencyContact getCriticalContact() {
        return criticalContact;
    }

    public void setCriticalContact(EmarhencyContact criticalContact) {
        this.criticalContact = criticalContact;
    }

    public List<EmarhencyContact> getEmarhencyContacts() {

        return emarhencyContacts;
    }

    public void setEmarhencyContacts(List<EmarhencyContact> emarhencyContacts) {
        this.emarhencyContacts = emarhencyContacts;
    }

    @Override
    public String toString() {
        return "Patient{" +
                ", criticalContact=" + criticalContact +
                '}';
    }
}
