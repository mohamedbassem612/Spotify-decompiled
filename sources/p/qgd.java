package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qgd extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qgd(String str, iu30 iu30Var, byte b) {
        super(2);
        this.a = b;
        switch (b) {
            case 13:
                this.c = str;
                this.b = iu30Var;
                super(2);
                break;
            default:
                this.c = str;
                this.b = iu30Var;
                break;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        z50 z50Var = z50.c;
        byte b2 = 24;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        String str = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    qim0 qim0VarN = anm1.N("cancelButton", uyn1.x(nim0Var, 16.0f));
                    boolean zG = x340Var2.g(iu30Var);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        objT = new gob(iu30Var, (byte) 6);
                        x340Var2.s0(objT);
                    }
                    Function0 function0 = (Function0) objT;
                    if (ihc1.y0(str)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    foo1.c(new gbx(new y50(str), function0), new idx(13), qim0VarN, null, yla.r(x340Var2), null, null, null, null, null, apo.r(-1638084283, new j3b(str, (byte) 12), x340Var2), x340Var2, 0, 48, 2008);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    boolean zG2 = x340Var4.g(iu30Var);
                    Object objT2 = x340Var4.T();
                    if (zG2 || objT2 == fkj0.X) {
                        objT2 = new gob(iu30Var, (byte) 10);
                        x340Var4.s0(objT2);
                    }
                    foo1.f(new gbx(z50Var, (Function0) objT2), qim0VarF, null, null, null, null, null, apo.r(-330578801, new j3b(str, (byte) 13), x340Var4), x340Var4, 12582912, 124);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                e9k.j(czo1.p(1), str, (b0k) obj, iu30Var);
                return rih1Var;
            case 3:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    idx idxVar = new idx();
                    boolean zG3 = x340Var6.g(iu30Var);
                    Object objT3 = x340Var6.T();
                    if (zG3 || objT3 == fkj0.X) {
                        objT3 = new y9y(iu30Var, (byte) 22);
                        x340Var6.s0(objT3);
                    }
                    Function0 function1 = (Function0) objT3;
                    if (ihc1.y0(str)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    foo1.c(new gbx(new y50(str), function1), idxVar, null, null, null, null, null, null, null, null, apo.r(6251117, new qeu(str, (byte) 27), x340Var6), x340Var6, 0, 48, 2044);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    tq60 tq60Var = new tq60(een.Q0);
                    uwr uwrVar2 = cbx.a;
                    qim0 qim0VarB = uyn1.B(tq60Var, 0.0f, cbx.b(x340Var8).b.b, 0.0f, 0.0f, 13);
                    boolean zG4 = x340Var8.g(iu30Var);
                    Object objT4 = x340Var8.T();
                    if (zG4 || objT4 == fkj0.X) {
                        objT4 = new y9y(iu30Var, (byte) 24);
                        x340Var8.s0(objT4);
                    }
                    Function0 function2 = (Function0) objT4;
                    if (ihc1.y0(str)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    foo1.f(new gbx(new y50(str), function2), qim0VarB, null, yla.s(x340Var8), null, null, null, apo.r(-1835287033, new qeu(str, (byte) 29), x340Var8), x340Var8, 12582912, 116);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 5:
                b0k b0kVar = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                b0k b0kVar2 = (x340) b0kVar;
                if (b0kVar2.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    vrg vrgVar = vrg.Z;
                    qim0 qim0VarU = qxy0.u(nim0Var, (idn0) null, 2);
                    boolean zG5 = b0kVar2.g(iu30Var);
                    Object objT5 = b0kVar2.T();
                    if (zG5 || objT5 == m4cVar) {
                        objT5 = new y720(iu30Var, (byte) 1);
                        b0kVar2.s0(objT5);
                    }
                    qim0 qim0VarX = bin.x(qim0VarU, false, null, null, null, (Function0) objT5, 15);
                    boolean zG6 = b0kVar2.g(str);
                    Object objT6 = b0kVar2.T();
                    if (zG6 || objT6 == m4cVar) {
                        objT6 = new kq00(str, (byte) 17);
                        b0kVar2.s0(objT6);
                    }
                    qim0 qim0VarB2 = s161.b(qim0VarX, false, (iu30) objT6);
                    boolean zG7 = b0kVar2.g(iu30Var);
                    Object objT7 = b0kVar2.T();
                    if (zG7 || objT7 == m4cVar) {
                        objT7 = new z720(iu30Var, (byte) 0);
                        b0kVar2.s0(objT7);
                    }
                    vrgVar.a(y9g1.s(qim0VarB2, (iu30) objT7), 0.0f, 0.0f, null, 0L, b0kVar2, 0, 30);
                } else {
                    b0kVar2.b0();
                }
                return rih1Var;
            case 6:
                x340 x340Var9 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    boolean zG8 = x340Var10.g(iu30Var);
                    Object objT8 = x340Var10.T();
                    if (zG8 || objT8 == fkj0.X) {
                        objT8 = new bb30(iu30Var, (byte) 3);
                        x340Var10.s0(objT8);
                    }
                    Function0 function3 = (Function0) objT8;
                    if (ihc1.y0(str)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    foo1.f(new gbx(new y50(str), function3), null, null, null, null, null, null, apo.r(-198843543, new ps00(str, (byte) 14), x340Var10), x340Var10, 12582912, 126);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 7:
                x340 x340Var11 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    boolean zG9 = x340Var12.g(iu30Var);
                    Object objT9 = x340Var12.T();
                    if (zG9 || objT9 == fkj0.X) {
                        objT9 = new bb30(iu30Var, (byte) 5);
                        x340Var12.s0(objT9);
                    }
                    Function0 function4 = (Function0) objT9;
                    if (ihc1.y0(str)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    foo1.f(new gbx(new y50(str), function4), null, null, null, null, null, null, apo.r(-538061011, new ps00(str, (byte) 16), x340Var12), x340Var12, 12582912, 126);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 8:
                x340 x340Var13 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    boolean zG10 = x340Var14.g(iu30Var);
                    Object objT10 = x340Var14.T();
                    if (zG10 || objT10 == fkj0.X) {
                        objT10 = new zi80(iu30Var, (byte) 17);
                        x340Var14.s0(objT10);
                    }
                    Function0 function5 = (Function0) objT10;
                    if (ihc1.y0(str)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    foo1.f(new gbx(new y50(str), function5), null, null, null, null, null, null, apo.r(1808267189, new dz40(str, (byte) 24), x340Var14), x340Var14, 12582912, 126);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                gyo1.B(czo1.p(1), str, (b0k) obj, iu30Var);
                return rih1Var;
            case 10:
                x340 x340Var15 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    ldx ldxVar = ldx.c;
                    boolean zG11 = x340Var16.g(iu30Var);
                    Object objT11 = x340Var16.T();
                    if (zG11 || objT11 == fkj0.X) {
                        objT11 = new edi0(iu30Var, (byte) 29);
                        x340Var16.s0(objT11);
                    }
                    foo1.c(new gbx(z50Var, (Function0) objT11), ldxVar, null, null, null, null, null, null, null, null, apo.r(1057155270, new tej0(str, (byte) 0), x340Var16), x340Var16, 0, 48, 2044);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                x340 x340Var17 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    boolean zG12 = x340Var18.g(iu30Var);
                    Object objT12 = x340Var18.T();
                    if (zG12 || objT12 == fkj0.X) {
                        objT12 = new nfk0(iu30Var, (byte) 21);
                        x340Var18.s0(objT12);
                    }
                    Function0 function6 = (Function0) objT12;
                    if (ihc1.y0(str)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    foo1.f(new gbx(new y50(str), function6), null, null, null, null, null, null, apo.r(94345366, new tej0(str, (byte) 11), x340Var18), x340Var18, 12582912, 126);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case grn1.d /* 12 */:
                ((Number) obj2).intValue();
                ud11.d(czo1.p(1), str, (b0k) obj, iu30Var);
                return rih1Var;
            case 13:
                x340 x340Var19 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    uwr uwrVar3 = cbx.a;
                    cvx cvxVar2 = cbx.b(x340Var20).b;
                    qim0 qim0VarN2 = anm1.N("startJamButton", uyn1.x(nim0Var, 16.0f));
                    boolean zG13 = x340Var20.g(iu30Var);
                    Object objT13 = x340Var20.T();
                    if (zG13 || objT13 == fkj0.X) {
                        objT13 = new pba1(iu30Var, (byte) 17);
                        x340Var20.s0(objT13);
                    }
                    Function0 function7 = (Function0) objT13;
                    if (ihc1.y0(str)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    foo1.c(new gbx(new y50(str), function7), new idx(13), qim0VarN2, null, yla.r(x340Var20), null, null, null, ykj.a, null, apo.r(893998984, new nl41(str, b2), x340Var20), x340Var20, 805306368, 48, 1496);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                cvd1.f(czo1.p(1), str, (b0k) obj, iu30Var);
                return rih1Var;
            default:
                x340 x340Var21 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    boolean zG14 = x340Var22.g(iu30Var);
                    Object objT14 = x340Var22.T();
                    if (zG14 || objT14 == fkj0.X) {
                        objT14 = new pwc1(iu30Var, (byte) 20);
                        x340Var22.s0(objT14);
                    }
                    vbe.t(0, str, (Function0) objT14, x340Var22, (qim0) null);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qgd(String str, iu30 iu30Var) {
        super(2);
        this.a = (byte) 1;
        this.b = iu30Var;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qgd(byte b, String str, iu30 iu30Var, boolean z) {
        super(2);
        this.a = b;
        this.c = str;
        this.b = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qgd(String str, iu30 iu30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.c = str;
        this.b = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qgd(iu30 iu30Var, String str, byte b) {
        super(2);
        this.a = b;
        this.b = iu30Var;
        this.c = str;
    }
}
