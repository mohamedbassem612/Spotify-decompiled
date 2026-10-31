package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hd21 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ vu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hd21(Object obj, vu30 vu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = vu30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vu30 vu30Var = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                rtb0.f((rtb0) obj, obj2, new j2i(1221565999, new p3k(vu30Var, (byte) 1), true), 2);
                break;
            default:
                epb0 epb0Var = (epb0) obj;
                final j2i j2iVar = new j2i(121491733, new p3k(vu30Var, (byte) 2), true);
                edn0 edn0Var = epb0Var.f;
                if (edn0Var == null) {
                    edn0Var = new edn0();
                    epb0Var.f = edn0Var;
                }
                final int i = epb0Var.d.b;
                edn0Var.a(i);
                final byte b2 = 0;
                epb0Var.P(obj2, new pv40((byte) 13), (Object) null, new j2i(46791243, new xu30() { // from class: p.cpb0
                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                        byte b3 = b2;
                        rih1 rih1Var2 = rih1.a;
                        int i2 = i;
                        j2i j2iVar2 = j2iVar;
                        switch (b3) {
                            case 0:
                                gpb0 gpb0Var = (gpb0) obj3;
                                x340 x340Var = (b0k) obj4;
                                int iIntValue = ((Integer) obj5).intValue();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= x340Var.g(gpb0Var) ? 4 : 2;
                                }
                                x340 x340Var2 = x340Var;
                                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    x340Var2.b0();
                                } else {
                                    j2iVar2.J(gpb0Var, Integer.valueOf(i2), x340Var2, Integer.valueOf(iIntValue & 14));
                                }
                                break;
                            default:
                                aqb0 aqb0Var = (aqb0) obj3;
                                x340 x340Var3 = (b0k) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                if ((iIntValue2 & 6) == 0) {
                                    iIntValue2 |= x340Var3.g(aqb0Var) ? 4 : 2;
                                }
                                x340 x340Var4 = x340Var3;
                                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                    x340Var4.b0();
                                } else {
                                    j2iVar2.J(aqb0Var, Integer.valueOf(i2), x340Var4, Integer.valueOf(iIntValue2 & 14));
                                }
                                break;
                        }
                        return rih1Var2;
                    }
                }, true));
                break;
        }
        return rih1Var;
    }
}
