package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kw5 implements hn41 {
    public final ayh a = sap1.a();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p.hn41
    public final Object a(onm onmVar) {
        jw5 jw5Var;
        if (onmVar instanceof jw5) {
            jw5Var = (jw5) onmVar;
            int i = jw5Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jw5Var.c = i - Integer.MIN_VALUE;
            } else {
                jw5Var = new jw5(this, onmVar);
            }
        } else {
            jw5Var = new jw5(this, onmVar);
        }
        Object objQ = jw5Var.a;
        int i2 = jw5Var.c;
        if (i2 == 0) {
            hm5.M(objQ);
            jw5Var.c = 1;
            objQ = this.a.Q(jw5Var);
            d9n d9nVar = d9n.a;
            if (objQ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objQ);
        }
        return ((pvg1) objQ).a;
    }
}
