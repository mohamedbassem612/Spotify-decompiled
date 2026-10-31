package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class aja1 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uha1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aja1(uha1 uha1Var, byte b) {
        super(3);
        this.a = b;
        this.b = uha1Var;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:69:0x0144  */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        Integer numValueOf;
        hux huxVar;
        int i2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        uha1 uha1Var = this.b;
        Integer num = null;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                qha1 qha1Var = uha1Var.d;
                if (qha1Var != null) {
                    if (!uha1Var.c) {
                        qha1Var = null;
                    }
                    if (qha1Var != null) {
                        int i3 = qha1Var.b;
                        int i4 = qha1Var.a;
                        int iC = l1d.C(i3);
                        if (iC == 0) {
                            int iC2 = l1d.C(i4);
                            if (iC2 == 0) {
                                i = 2131962781;
                            } else {
                                if (iC2 != 1) {
                                    eg.o();
                                    return null;
                                }
                                i = 2131962782;
                            }
                            numValueOf = Integer.valueOf(i);
                            if (i != -1) {
                                num = numValueOf;
                            }
                        } else if (iC == 1) {
                            int iC3 = l1d.C(i4);
                            if (iC3 == 0) {
                                i = 2131962807;
                            } else {
                                if (iC3 != 1) {
                                    eg.o();
                                    return null;
                                }
                                i = 2131962808;
                            }
                            numValueOf = Integer.valueOf(i);
                            if (i != -1) {
                                num = numValueOf;
                            }
                        } else {
                            if (iC != 2) {
                                eg.o();
                                return null;
                            }
                            i = -1;
                            numValueOf = Integer.valueOf(i);
                            if (i != -1) {
                                num = numValueOf;
                            }
                        }
                    }
                }
                x340 x340Var2 = x340Var;
                if (num == null) {
                    x340Var2.i0(-13112111);
                } else {
                    x340Var2.i0(-13112110);
                    String strO0 = cwl1.o0(x340Var2, num.intValue());
                    uwr uwrVar = cbx.a;
                    uwo1.e(strO0, (qim0) null, cbx.d(x340Var2).j, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2042);
                }
                x340Var2.r(false);
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj2;
                ((Number) obj3).intValue();
                if (!uha1Var.c) {
                    x340 x340Var4 = x340Var3;
                    x340Var4.i0(1031343134);
                    x340Var4.r(false);
                    return rih1Var;
                }
                x340 x340Var5 = x340Var3;
                x340Var5.i0(1030570490);
                qha1 qha1Var2 = uha1Var.d;
                if (qha1Var2 == null) {
                    huxVar = ilx.c;
                } else {
                    boolean z = qha1Var2.a == 1;
                    int iC4 = l1d.C(qha1Var2.b);
                    if (iC4 == 0 || iC4 == 1) {
                        huxVar = z ? mkx.c : hkx.c;
                    } else {
                        if (iC4 != 2) {
                            eg.o();
                            return null;
                        }
                        huxVar = ilx.c;
                    }
                    if (huxVar == null) {
                        huxVar = ilx.c;
                    }
                }
                hux huxVar2 = huxVar;
                uwr uwrVar2 = cbx.a;
                long j = cbx.a(x340Var5).b.c;
                zov0 zov0Var = cbx.b(x340Var5).g;
                w0h1.a(huxVar2, isl.a, u291.r(nim0.a, 16.0f), j, 0L, false, x340Var5, 56, 48);
                x340Var5.r(false);
                return rih1Var;
            default:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                int iOrdinal = uha1Var.b.ordinal();
                if (iOrdinal == 0) {
                    i2 = 2131962818;
                } else if (iOrdinal == 1) {
                    i2 = 2131962816;
                } else if (iOrdinal == 2) {
                    i2 = 2131962817;
                } else {
                    if (iOrdinal != 3) {
                        eg.o();
                        return null;
                    }
                    i2 = 2131962815;
                }
                String strO1 = cwl1.o0(b0kVar, i2);
                uwr uwrVar3 = cbx.a;
                uwo1.e(strO1, (qim0) null, cbx.d(b0kVar).g, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar, 0, 0, 2042);
                return rih1Var;
        }
    }
}
