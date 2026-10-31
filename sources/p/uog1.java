package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class uog1 implements tol1 {
    public final vx40 a;

    public uog1(vx40 vx40Var) {
        this.a = vx40Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum a(int i, onm onmVar) {
        tog1 tog1Var;
        if (onmVar instanceof tog1) {
            tog1Var = (tog1) onmVar;
            int i2 = tog1Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tog1Var.c = i2 - Integer.MIN_VALUE;
            } else {
                tog1Var = new tog1(this, onmVar);
            }
        } else {
            tog1Var = new tog1(this, onmVar);
        }
        Object objU = tog1Var.a;
        int i3 = tog1Var.c;
        if (i3 == 0) {
            hm5.M(objU);
            tog1Var.c = 1;
            objU = this.a.u(i, tog1Var);
            d9n d9nVar = d9n.a;
            if (objU == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objU);
        }
        return ((Boolean) objU).booleanValue() ? sol1.e : sol1.d;
    }
}
