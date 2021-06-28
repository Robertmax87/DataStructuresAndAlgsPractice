package com.DataStructureImplementation;

public class SLList {
    public class IntNode{
      private int curr;
      private  IntNode next;
      public IntNode(int i, IntNode n){
         curr = i;
         next = n;

      }
    }
    private IntNode first;
    private IntNode last;
    public int size;
    public SLList(int x){
       first = new IntNode(x, null);
       size++;
    }
    public void addFirst(int x){
        first = new IntNode(x, first);
        size++;

    }
    public void addLast(int x){
        IntNode p = first;
        while(p.next != null){
            p = p.next;
        }
        p.next = new IntNode(x, null);
        p.next = last;
    }
    public void removeLast(){
        last = new IntNode(0, null);
    }
    public int getFirst(){
        return first.curr;
    }
    public int getLast(){
        return last.curr;
    }
    public int size(){
        return size;
    }
}
