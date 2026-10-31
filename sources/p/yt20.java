package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yt20 implements vr20 {
    public final /* synthetic */ n811 a;
    public final /* synthetic */ byte b;
    public final /* synthetic */ vr20 c;
    public final /* synthetic */ Object d;

    /* JADX WARN: Multi-variable type inference failed */
    public yt20(n811 n811Var, int i, vr20 vr20Var, Object obj) {
        this.a = n811Var;
        this.b = i;
        this.c = vr20Var;
        this.d = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p.vr20
    public final Object emit(Object obj, lnm lnmVar) {
        xt20 xt20Var;
        if (lnmVar instanceof xt20) {
            xt20Var = (xt20) lnmVar;
            int i = xt20Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xt20Var.c = i - Integer.MIN_VALUE;
            } else {
                xt20Var = new xt20(this, lnmVar);
            }
        } else {
            xt20Var = new xt20(this, lnmVar);
        }
        Object obj2 = xt20Var.a;
        int i2 = xt20Var.c;
        rih1 rih1Var = rih1.a;
        if (i2 != 0) {
            if (i2 == 1) {
                hm5.M(obj2);
                return rih1Var;
            }
            if (i2 == 2) {
                hm5.M(obj2);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj2);
        n811 n811Var = this.a;
        int i3 = n811Var.a + 1;
        n811Var.a = i3;
        d9n d9nVar = d9n.a;
        byte b = this.b;
        vr20 vr20Var = this.c;
        if (i3 < b) {
            xt20Var.c = 1;
            return vr20Var.emit(obj, xt20Var) == d9nVar ? d9nVar : rih1Var;
        }
        xt20Var.c = 2;
        z4p1.r(vr20Var, obj, this.d, xt20Var);
        return d9nVar;
    }
}
