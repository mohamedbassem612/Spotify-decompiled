package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class y46 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y46(Object obj, Object obj2, Object obj3, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // p.vu30
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                z46 z46Var = (z46) obj4;
                return fa6.a(((a56) obj5).e((v46) obj), null, z46Var.h.j() && z46Var.g.a((String) obj3), false, null, null, false, null, null, 2031);
            case 1:
                ((Number) obj2).intValue();
                ((l8a) obj5).b((z7a) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 2:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    aym.d((hqk) obj5, tgk.e((tgk) obj4), (iu30) obj3, (qim0) null, x340Var2, 0);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 3:
                return ((hrk) obj5).b((zob1) obj, (iac0) obj2, (xk00) obj4, ((ji50) obj3).a);
            case 4:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    irn1.u((qim0) null, e0j.a, (vu30) null, (erl1) null, apo.r(685345869, new iwf0((w5i0) obj5, (n5i0) obj4, (ipb1) obj3, (byte) 14), x340Var4), x340Var4, 24624, 13);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 5:
                float fFloatValue = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                c921.y((c9n) obj5, (o8n) null, 0, new kkr(fFloatValue, (jo51) obj4, (hnn0) obj3, (lnm) null), 3);
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                myo1.l((uhd1) obj5, (qim0) obj4, (j2i) obj3, (b0k) obj, czo1.p(385));
                return rih1Var;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                o6k1 o6k1Var = (o6k1) obj5;
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    mod.b(oi7.a.a(o6k1Var.e), apo.r(-519622633, new pej1(o6k1Var, (iu30) obj4, (n6k1) obj3, (byte) 10), x340Var6), x340Var6, 56);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y46(Object obj, Object obj2, Object obj3, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
