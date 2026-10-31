package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jzm1 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qzm1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jzm1(qzm1 qzm1Var, byte b) {
        super(4);
        this.a = b;
        this.b = qzm1Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qzm1 qzm1Var = this.b;
        switch (b) {
            case 0:
                hzm1 hzm1Var = (hzm1) obj;
                iu30 iu30Var = (iu30) obj2;
                x340 x340Var = (b0k) obj3;
                int iIntValue = ((Number) obj4).intValue();
                int i = (iIntValue & 6) == 0 ? ((iIntValue & 8) == 0 ? x340Var.g(hzm1Var) : x340Var.i(hzm1Var) ? 4 : 2) | iIntValue : iIntValue;
                if ((iIntValue & 48) == 0) {
                    i |= x340Var.i(iu30Var) ? 32 : 16;
                }
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(i & 1, (i & 147) != 146)) {
                    x340Var2.b0();
                } else {
                    hzm1Var.getClass();
                    cgq cgqVar = qzm1Var.n;
                    dgq dgqVar = qzm1Var.o;
                    u911 u911Var = (u911) qzm1Var.t.getValue();
                    boolean zI = x340Var2.i(qzm1Var);
                    Object objT = x340Var2.T();
                    if (zI || objT == fkj0.X) {
                        objT = new c4m1(qzm1Var, (byte) 18);
                        x340Var2.s0(objT);
                    }
                    wqn1.j(hzm1Var, iu30Var, cgqVar, dgqVar, u911Var, (iu30) objT, qzm1Var.q, qzm1Var.m.b.K(), (qim0) null, x340Var2, i & 112);
                }
                break;
            default:
                nb81 nb81Var = (nb81) obj;
                x340 x340Var3 = (b0k) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                idd1 idd1Var = qzm1Var.u;
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= (iIntValue2 & 8) == 0 ? x340Var3.g(nb81Var) : x340Var3.i(nb81Var) ? 4 : 2;
                }
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 131) != 130)) {
                    x340Var4.b0();
                } else {
                    nb81Var.getClass();
                    uvq uvqVar = qzm1Var.f;
                    lzn0 lzn0Var = qzm1Var.k;
                    bzl0 bzl0Var = (bzl0) idd1Var.getValue();
                    uvqVar.getClass();
                    kls0 kls0Var = new kls0(lzn0Var, bzl0Var);
                    vvq vvqVar = qzm1Var.g;
                    bzl0 bzl0Var2 = (bzl0) idd1Var.getValue();
                    uu00 uu00Var = (uu00) ((rzm1) ((wdm) vvqVar.a.c).b).l.get();
                    c8o.l(uu00Var);
                    et90 et90Var = new et90(new jo8(uu00Var), lzn0Var, bzl0Var2);
                    uu00 uu00Var2 = (uu00) ((rzm1) ((wdm) qzm1Var.h.a.c).b).l.get();
                    c8o.l(uu00Var2);
                    f7p1.d(nb81Var, kls0Var, et90Var, qzm1Var.i, qzm1Var.j, new j7a1(new jo8(uu00Var2), lzn0Var), (kb81) qzm1Var.v.getValue(), (qim0) null, x340Var4, 2396736);
                }
                break;
        }
        return rih1Var;
    }
}
