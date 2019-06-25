/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import View.ChatBox;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Ashen Koralage
 */
public class ChatObserverImpl extends UnicastRemoteObject implements ChatObserver {

    private ChatBox chatWindow;

    public ChatObserverImpl(ChatBox chatWindow) throws RemoteException {
        this.chatWindow = chatWindow;
    }

    @Override
    public void update(String message) throws RemoteException {
        chatWindow.setMessage(message);
    }

}
