package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class st20 implements vr20 {
    public final /* synthetic */ n811 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ vr20 c;

    public st20(n811 n811Var, int i, vr20 vr20Var) {
        this.a = n811Var;
        this.b = i;
        this.c = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p.vr20
    public final Object emit(Object obj, lnm lnmVar) {
        rt20 rt20Var;
        if (lnmVar instanceof rt20) {
            rt20Var = (rt20) lnmVar;
            int i = rt20Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rt20Var.c = i - Integer.MIN_VALUE;
            } else {
                rt20Var = new rt20(this, lnmVar);
            }
        } else {
            rt20Var = new rt20(this, lnmVar);
        }
        Object obj2 = rt20Var.a;
        int i2 = rt20Var.c;
        rih1 rih1Var = rih1.a;
        if (i2 != 0) {
            if (i2 == 1) {
                hm5.M(obj2);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj2);
        n811 n811Var = this.a;
        int i3 = n811Var.a;
        if (i3 < this.b) {
            n811Var.a = i3 + 1;
            return rih1Var;
        }
        rt20Var.c = 1;
        Object objEmit = this.c.emit(obj, rt20Var);
        d9n d9nVar = d9n.a;
        return objEmit == d9nVar ? d9nVar : rih1Var;
    }
}
