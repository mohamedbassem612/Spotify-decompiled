package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class a6b1 {
    public final /* synthetic */ wi01 a;

    public a6b1(wi01 wi01Var) {
        this.a = wi01Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        z5b1 z5b1Var;
        if (onmVar instanceof z5b1) {
            z5b1Var = (z5b1) onmVar;
            int i = z5b1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                z5b1Var.c = i - Integer.MIN_VALUE;
            } else {
                z5b1Var = new z5b1(this, onmVar);
            }
        } else {
            z5b1Var = new z5b1(this, onmVar);
        }
        Object obj = z5b1Var.a;
        int i2 = z5b1Var.c;
        if (i2 != 0) {
            if (i2 == 1) {
                hm5.M(obj);
                return ((e331) obj).a;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        vi01 vi01Var = new vi01();
        z5b1Var.c = 1;
        Object objA = this.a.a(vi01Var, 60000L, z5b1Var);
        d9n d9nVar = d9n.a;
        return objA == d9nVar ? d9nVar : objA;
    }
}
