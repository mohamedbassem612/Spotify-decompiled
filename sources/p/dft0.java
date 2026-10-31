package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dft0 extends a8d1 implements zu30 {
    public /* synthetic */ boolean a;
    public /* synthetic */ boolean b;
    public /* synthetic */ boolean c;
    public final /* synthetic */ qet0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dft0(qet0 qet0Var, lnm lnmVar) {
        super(4, lnmVar);
        this.d = qet0Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
        dft0 dft0Var = new dft0(this.d, (lnm) obj4);
        dft0Var.a = zBooleanValue;
        dft0Var.b = zBooleanValue2;
        dft0Var.c = zBooleanValue3;
        return dft0Var.invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        hm5.M(obj);
        return new vet0(this.d, z, z2, z3);
    }
}
