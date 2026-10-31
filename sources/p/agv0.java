package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class agv0 extends a8d1 implements xu30 {
    public final /* synthetic */ oei1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agv0(oei1 oei1Var, int i, boolean z, lnm lnmVar) {
        super(3, lnmVar);
        this.a = oei1Var;
        this.b = i;
        this.c = z;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.b;
        boolean z = this.c;
        agv0 agv0Var = new agv0(this.a, i, z, (lnm) obj3);
        rih1 rih1Var = rih1.a;
        agv0Var.invokeSuspend(rih1Var);
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        hm5.M(obj);
        return rih1.a;
    }
}
