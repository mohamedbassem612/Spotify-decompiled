package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class a541 implements hn41 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p.hn41
    public final Object a(onm onmVar) {
        z441 z441Var;
        if (onmVar instanceof z441) {
            z441Var = (z441) onmVar;
            int i = z441Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                z441Var.c = i - Integer.MIN_VALUE;
            } else {
                z441Var = new z441(this, onmVar);
            }
        } else {
            z441Var = new z441(this, onmVar);
        }
        Object obj = z441Var.a;
        int i2 = z441Var.c;
        if (i2 != 0) {
            if (i2 == 1) {
                hm5.M(obj);
                return "time_out";
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        ytw0 ytw0Var = jfv.b;
        long jL0 = fdg1.l0(20L, ngv.e);
        z441Var.c = 1;
        Object objJ = hap1.j(jL0, z441Var);
        d9n d9nVar = d9n.a;
        return objJ == d9nVar ? d9nVar : "time_out";
    }
}
