package org.acme.rest.json;

class Alticci {

    public int index;
    public Double value;

    public Alticci(int index) {
        this.index = index;
        this.value = this.calc(index);
    }

    public Double calc(int index) {
        Double[] sequence = new Double[index+1];
        for(int i = 0; i < sequence.length; i++) {
            if (i == 0){
                sequence[i] = 0.0;
            } else if (i <= 2) {
                sequence[i] = 1.0;
            } else if (i > 2) {
                sequence[i] = sequence[i-3] + sequence[i - 2];
            }
        }
        return sequence[index];
    }
}