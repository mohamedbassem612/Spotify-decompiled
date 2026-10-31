package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rbk0 extends a8d1 implements bv30 {
    public /* synthetic */ boolean a;
    public /* synthetic */ boolean b;
    public /* synthetic */ boolean c;
    public /* synthetic */ ibk0 d;
    public final /* synthetic */ nbk0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rbk0(nbk0 nbk0Var, lnm lnmVar) {
        super(5, lnmVar);
        this.e = nbk0Var;
    }

    @Override // p.bv30
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
        rbk0 rbk0Var = new rbk0(this.e, (lnm) obj5);
        rbk0Var.a = zBooleanValue;
        rbk0Var.b = zBooleanValue2;
        rbk0Var.c = zBooleanValue3;
        rbk0Var.d = (ibk0) obj4;
        return rbk0Var.invokeSuspend(rih1.a);
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        ibk0 ibk0Var = this.d;
        hm5.M(obj);
        boolean zA = ibk0Var.a();
        nbk0 nbk0Var = this.e;
        return new pbk0(nbk0Var, z, z2, zA && nbk0Var.a(), z3);
    }
}
