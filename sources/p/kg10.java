package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kg10 extends a8d1 implements zu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ boolean b;
    public /* synthetic */ boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kg10(Object obj, lnm lnmVar, byte b) {
        super(4, lnmVar);
        this.a = b;
        this.e = obj;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj5 = this.e;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                kg10 kg10Var = new kg10((dp5) obj5, (lnm) obj4, (byte) 0);
                kg10Var.d = (r2q0) obj;
                kg10Var.b = zBooleanValue;
                kg10Var.c = zBooleanValue2;
                return kg10Var.invokeSuspend(rih1Var);
            default:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                boolean zBooleanValue4 = ((Boolean) obj2).booleanValue();
                kg10 kg10Var2 = new kg10((amj1) obj5, (lnm) obj4, (byte) 1);
                kg10Var2.b = zBooleanValue3;
                kg10Var2.c = zBooleanValue4;
                kg10Var2.d = (slj1) obj3;
                return kg10Var2.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                r2q0 r2q0Var = (r2q0) this.d;
                boolean z = this.b;
                boolean z2 = this.c;
                hm5.M(obj);
                if (z || r2q0Var == r2q0.d || z2) {
                    return xzc0.c;
                }
                return r2q0Var == r2q0.c ? xzc0.b : xzc0.a;
            default:
                boolean z3 = this.b;
                boolean z4 = this.c;
                slj1 slj1Var = (slj1) this.d;
                hm5.M(obj);
                if ((!z3 && z4) || (z3 && z4 && (slj1Var.b || slj1Var.a))) {
                    return rlj1.d;
                }
                if (z3 && z4) {
                    return rlj1.b;
                }
                return (!z3 || z4) ? rlj1.a : rlj1.c;
        }
    }
}
