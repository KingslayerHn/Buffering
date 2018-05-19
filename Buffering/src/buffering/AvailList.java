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
    protected int pos;
    protected int size;
    protected int location;

    public int getPos() {
        return pos;
    }

    public int getSize() {
        return size;
    }

    public int getLocation() {
        return location;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "AvailList{" + "pos=" + pos + ", size=" + size + ", location=" + location + '}';
    }
    
    
}
