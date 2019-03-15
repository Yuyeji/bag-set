public class Set {

    int first = 0;
    int index = 0;
    Object set[] = new Object[10];

    boolean add(Object object){

        for(int i = 0; i<=index ; i++){
            if(set[i] == object){
                return false;
            }
        }
        set[index] = object;
        index++;
        return true;
    }

    boolean contains(Object object){

        if(index > 0){  // 객체가 있는 경우
            return true;
        }else{          // 객체가 없는 경우
            return false;
        }
    }

    Object getFirst(){

        if(first < index){
            return set[first];
        }

        return null;
    }

    Object getNext(){
        first++;

        if(first < index){
            return set[first];
        }

        return null;
    }

    boolean remove(Object object){
        for(int i = 0; i<=index ; i++){
            if(set[i] == object){
                set[i] = null;
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
