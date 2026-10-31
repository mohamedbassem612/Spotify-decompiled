package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class u690 {
    public final zwz0 a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Enum a(k771 k771Var, onm onmVar) {
        j771 j771Var;
        if (onmVar instanceof j771) {
            j771Var = (j771) onmVar;
            int i = j771Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                j771Var.d = i - Integer.MIN_VALUE;
            } else {
                j771Var = new j771(this, onmVar);
            }
        } else {
            j771Var = new j771(this, onmVar);
        }
        Object objI = j771Var.b;
        int i2 = j771Var.d;
        if (i2 == 0) {
            hm5.M(objI);
            j771Var.a = k771Var;
            j771Var.d = 1;
            objI = b5p1.i(this.a.b(), j771Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k771Var = j771Var.a;
            hm5.M(objI);
        }
        return ((Boolean) objI).booleanValue() ? k771.S0 : k771Var;
    }
}
