/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudexample;

import java.util.HashMap;

/**
 *
 * @author thesinding
 */
public class CRUD {
    private HashMap _dbCon;
    private boolean _debug;
    public CRUD(HashMap db) {
        this._dbCon = db;
    }
    public CRUD(HashMap db, boolean debug) {
        this._dbCon = db;
        this._debug = debug;
    }
    
    public boolean createEntry(String key, double val){
        try{
            this._dbCon.put(key, val);
            return true;
        } catch(Exception e){
            if(this._debug){
                System.out.println(e);            
            } 
            return false;
        }
    }
    
    public double readEntry(String key){
        try{
            return (double) this._dbCon.get(key);
        } catch(Exception e){
        if(this._debug){
                System.out.println(e);            
            }
            return -1;
        }
    }
    
    public boolean updateEntry(String key, double val){
        try{
            this._dbCon.put(key, val);
            return true;
        } catch(Exception e){
        if(this._debug){
                System.out.println(e);            
            }
            return false;
        }
    }
    
    public boolean deleteEntry(String key){
        try{
            this._dbCon.remove(key);
            return true;
        } catch(Exception e){
        if(this._debug){
                System.out.println(e);            
            }
            return false;
        }
    }
    
    
}
