package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class cre0 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ boolean b;
    public /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cre0(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }

    @Override // p.xu30
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = 3;
        Boolean bool = (Boolean) obj;
        switch (b) {
            case 0:
                boolean zBooleanValue = bool.booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                cre0 cre0Var = new cre0(i, (lnm) obj3, (byte) 0);
                cre0Var.b = zBooleanValue;
                cre0Var.c = zBooleanValue2;
                return cre0Var.invokeSuspend(rih1Var);
            case 1:
                boolean zBooleanValue3 = bool.booleanValue();
                boolean zBooleanValue4 = ((Boolean) obj2).booleanValue();
                cre0 cre0Var2 = new cre0(i, (lnm) obj3, (byte) 1);
                cre0Var2.b = zBooleanValue3;
                cre0Var2.c = zBooleanValue4;
                return cre0Var2.invokeSuspend(rih1Var);
            default:
                boolean zBooleanValue5 = bool.booleanValue();
                boolean zBooleanValue6 = ((Boolean) obj2).booleanValue();
                cre0 cre0Var3 = new cre0(i, (lnm) obj3, (byte) 2);
                cre0Var3.b = zBooleanValue5;
                cre0Var3.c = zBooleanValue6;
                return cre0Var3.invokeSuspend(rih1Var);
        }
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                boolean z = this.b;
                boolean z2 = this.c;
                hm5.M(obj);
                return oqn1.n(yah0.m(z), yah0.m(z2));
            case 1:
                boolean z3 = this.b;
                boolean z4 = this.c;
                hm5.M(obj);
                return (z3 && z4) ? h6r0.b : h6r0.c;
            default:
                boolean z5 = this.b;
                boolean z6 = this.c;
                hm5.M(obj);
                return oqn1.n(yah0.m(z5), yah0.m(z6));
        }
    }
}
