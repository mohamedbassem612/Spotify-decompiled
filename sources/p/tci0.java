package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class tci0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ znb0 b;
    public final /* synthetic */ hob1 c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tci0(znb0 znb0Var, hob1 hob1Var, iu30 iu30Var, byte b) {
        super(2);
        this.a = b;
        this.b = znb0Var;
        this.c = hob1Var;
        this.d = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        wcm wcmVarA = null;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.d;
        znb0 znb0Var = this.b;
        hob1 hob1Var = this.c;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    uho uhoVar = hob1Var.p;
                    if (uhoVar != null) {
                        x340Var2.i0(-362493884);
                        maa maaVar = (maa) znb0Var.getValue();
                        boolean zG = x340Var2.g(iu30Var);
                        Object objT = x340Var2.T();
                        if (zG || objT == fkj0.X) {
                            objT = new msh0(iu30Var, (byte) 13);
                            x340Var2.s0(objT);
                        }
                        otw.c(maaVar, uho.a(uhoVar, (Function0) objT), (qim0) null, (ipb1) null, x340Var2, 8, 12);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-362493885);
                        x340Var2.r(false);
                    }
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else if (!upo1.A(x340Var4)) {
                    x340Var4.i0(1621164204);
                    x340Var4.r(false);
                } else {
                    x340Var4.i0(1620887436);
                    maa maaVar2 = (maa) znb0Var.getValue();
                    wcm wcmVar = hob1Var.o;
                    boolean zG2 = x340Var4.g(iu30Var);
                    Object objT2 = x340Var4.T();
                    if (zG2 || objT2 == fkj0.X) {
                        objT2 = new msh0(iu30Var, (byte) 18);
                        x340Var4.s0(objT2);
                    }
                    otw.c(maaVar2, wcm.a(wcmVar, (Function0) objT2, (nx2) null, false, (String) null, 1007), (qim0) null, (ipb1) null, x340Var4, 0, 12);
                    x340Var4.r(false);
                }
                break;
            case 2:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    maa maaVar3 = (maa) znb0Var.getValue();
                    wcm wcmVar2 = hob1Var.o;
                    boolean zG3 = x340Var6.g(iu30Var);
                    Object objT3 = x340Var6.T();
                    if (zG3 || objT3 == fkj0.X) {
                        objT3 = new msh0(iu30Var, (byte) 19);
                        x340Var6.s0(objT3);
                    }
                    otw.c(maaVar3, wcm.a(wcmVar2, (Function0) objT3, (nx2) null, false, (String) null, 1007), (qim0) null, (ipb1) null, x340Var6, 0, 12);
                }
                break;
            case 3:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (!x340Var8.Y(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                    x340Var8.b0();
                } else {
                    maa maaVar4 = (maa) znb0Var.getValue();
                    lfi0 lfi0Var = hob1Var.k;
                    wcm wcmVar3 = lfi0Var.k;
                    if (wcmVar3 == null) {
                        x340Var8.i0(-558408082);
                        x340Var8.r(false);
                    } else {
                        x340Var8.i0(-1126391821);
                        boolean zG4 = x340Var8.g(iu30Var);
                        Object objT4 = x340Var8.T();
                        if (zG4 || objT4 == fkj0.X) {
                            objT4 = new msh0(iu30Var, (byte) 22);
                            x340Var8.s0(objT4);
                        }
                        wcmVarA = wcm.a(wcmVar3, (Function0) objT4, (nx2) null, false, (String) null, 1007);
                        x340Var8.r(false);
                    }
                    otw.c(maaVar4, lfi0.a(lfi0Var, wcmVarA, false, (Function0) null, (Function0) null, (hfi0) null, 33544191), (qim0) null, (ipb1) null, x340Var8, 0, 12);
                }
                break;
            case 4:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (!x340Var10.Y(1 & iIntValue5, (iIntValue5 & 3) != 2)) {
                    x340Var10.b0();
                } else {
                    maa maaVar5 = (maa) znb0Var.getValue();
                    lfi0 lfi0Var2 = hob1Var.k;
                    wcm wcmVar4 = lfi0Var2.k;
                    if (wcmVar4 == null) {
                        x340Var10.i0(-1675766093);
                        x340Var10.r(false);
                    } else {
                        x340Var10.i0(777227022);
                        boolean zG5 = x340Var10.g(iu30Var);
                        Object objT5 = x340Var10.T();
                        if (zG5 || objT5 == fkj0.X) {
                            objT5 = new msh0(iu30Var, (byte) 23);
                            x340Var10.s0(objT5);
                        }
                        wcmVarA = wcm.a(wcmVar4, (Function0) objT5, (nx2) null, false, (String) null, 1007);
                        x340Var10.r(false);
                    }
                    otw.c(maaVar5, lfi0.a(lfi0Var2, wcmVarA, false, (Function0) null, (Function0) null, (hfi0) null, 33552383), (qim0) null, (ipb1) null, x340Var10, 0, 12);
                }
                break;
            default:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (!x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x340Var12.b0();
                } else {
                    rpo1.j(hob1Var, znb0Var, iu30Var, x340Var12);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tci0(hob1 hob1Var, znb0 znb0Var, iu30 iu30Var, byte b) {
        super(2);
        this.a = b;
        this.c = hob1Var;
        this.b = znb0Var;
        this.d = iu30Var;
    }
}
