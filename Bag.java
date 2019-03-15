class Bag{

    int first = 0;
    int index = 0;
    Object bag[] = new Object[10];


    void add(Object object){

        bag[index] = object;
        index++;

    }

    boolean contains(Object object){

        for(int i = 0; i<=index ; i++){ // 주어진 객체가 있으면
            if(bag[i] == object){
                return true;
            }
        }

        return false;
    }

    Object getFirst(){

        if(first < index){
            return bag[first];
        }

        return null;
    }

    Object getNext(){
        first++;

        if(first < index){
            return bag[first];
        }

        return null;
    }

    boolean remove(Object object){
        for(int i = 0; i<=index ; i++){
            if(bag[i] == object){
                bag[i] = null;
                index--;
                return true;
            }
        }

        return false;
    }

    int size(){
        return index;
    }
}