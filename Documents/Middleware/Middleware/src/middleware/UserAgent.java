/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package middleware;

/**
 *
 * @author 44789
 */
public class UserAgent extends MetaAgent {

//    public UserAgent(Portal portal) {
//        super(portal);
//    }
    
    
    
    public String getSender(Message msg)
    {
        return msg.sender;
    }
    
    public String getRecipient(Message msg)
    {
        return msg.recipient;
    }
    
    public String getRawMessage(Message msg) throws InterruptedException
    {
        msg = queue.take();
        return msg.wrap();
    }
    
    public int getMessageId(Message msg)
    {
        return msg.id;
    }
    
    
    
}
