/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buffering;

/**
 *
 * @author andre
 */
public class AvailList {
    int pos;
    int size;

    public AvailList(int pos, int size) {
        this.pos = pos;
        this.size = size;
    }

    public int getPos() {
        return pos;
    }

    public int getSize() {
        return size;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "AvailList{" + "pos=" + pos + ", size=" + size + '}';
    }
    
    
}
