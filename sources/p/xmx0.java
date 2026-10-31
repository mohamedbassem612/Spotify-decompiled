package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xmx0 extends hab0 implements bv30 {
    public final /* synthetic */ gw70 a;
    public final /* synthetic */ idd1 b;
    public final /* synthetic */ idd1 c;
    public final /* synthetic */ idd1 d;
    public final /* synthetic */ idd1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xmx0(gw70 gw70Var, idd1 idd1Var, idd1 idd1Var2, idd1 idd1Var3, idd1 idd1Var4) {
        super(5);
        this.a = gw70Var;
        this.b = idd1Var;
        this.c = idd1Var2;
        this.d = idd1Var3;
        this.e = idd1Var4;
    }

    @Override // p.bv30
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        umx0 umx0Var = (umx0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 48) == 0) {
            i = (x340Var.g(umx0Var) ? 32 : 16) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 1169) != 1168)) {
            boolean z = (i & 896) == 256;
            Object objT = x340Var2.T();
            if (z || objT == fkj0.X) {
                objT = new ppv0(iu30Var, (byte) 10);
                x340Var2.s0(objT);
            }
            kln1.h(umx0Var, this.a, this.b, this.c, this.d, this.e, iu30Var, jzn1.w(nim0.a, (iu30) objT, x340Var2), x340Var2, ((i >> 3) & 14) | ((i << 12) & 3670016));
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
