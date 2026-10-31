package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class s721 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s721(Function0 function0, String str, byte b) {
        super(2);
        this.a = b;
        switch (b) {
            case 7:
                this.c = function0;
                this.b = str;
                super(2);
                break;
            default:
                this.c = function0;
                this.b = str;
                break;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.c;
        String strO0 = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ldx ldxVar = ldx.c;
                    if (ihc1.y0(strO0)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    foo1.c(new gbx(new y50(strO0), function0), ldxVar, (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(1572604620, new p9y0(strO0, (byte) 21), x340Var2), x340Var2, 0, 48, 2044);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                boo1.p(czo1.p(1), strO0, function0, (b0k) obj);
                return rih1Var;
            case 2:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var4).b;
                    qim0 qim0VarB = uyn1.B(nim0.a, 0.0f, 12.0f, 0.0f, 0.0f, 13);
                    if (ihc1.y0(strO0)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    foo1.f(new gbx(new y50(strO0), function0), qim0VarB, (max) null, yla.s(x340Var4), (idn0) null, (vu30) null, (vu30) null, apo.r(-1439521146, new nl41(strO0, (byte) 12), x340Var4), x340Var4, 12582912, 116);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 3:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    uwr uwrVar2 = cbx.a;
                    long j = cbx.a(x340Var6).a.c;
                    cqs0 cqs0Var = huj.a;
                    long j2 = u7h.f;
                    float fB = z4p1.B(j) + 0.05f;
                    float fB2 = z4p1.B(j2) + 0.05f;
                    float f = fB > fB2 ? fB / fB2 : fB2 / fB;
                    long j3 = u7h.b;
                    float fB3 = z4p1.B(j) + 0.05f;
                    float fB4 = z4p1.B(j3) + 0.05f;
                    if (f < (fB3 > fB4 ? fB3 / fB4 : fB4 / fB3)) {
                        j2 = j3;
                    }
                    gdx gdxVarP = yla.p(x340Var6);
                    qim0 qim0VarB2 = uyn1.B(u291.f(nim0Var, 1.0f), 0.0f, 16.0f, 0.0f, 0.0f, 13);
                    boolean zG = x340Var6.g(function0);
                    Object objT = x340Var6.T();
                    if (zG || objT == fkj0.X) {
                        objT = new pt61(function0, (byte) 26);
                        x340Var6.s0(objT);
                    }
                    foo1.c(new gbx(z50.c, (Function0) objT), new idx(19), qim0VarB2, (max) null, gdxVarP, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(2083750543, new icc((byte) 8, j2, strO0), x340Var6), x340Var6, 0, 48, 2008);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x340Var8.i0(501459134);
                    if (strO0.length() == 0) {
                        strO0 = cwl1.o0(x340Var8, 2131963214);
                    }
                    x340Var8.r(false);
                    vbe.t(0, strO0, function0, x340Var8, (qim0) null);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 5:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ti5.a(apo.r(-849287042, new zsd1(strO0, (byte) 4), x340Var10), nim0.a, apo.r(-1721697604, new h621(function0, (byte) 16), x340Var10), (xu30) null, 0.0f, (erl1) null, (x7f1) null, x340Var10, 390, 248);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                no80.a(czo1.p(1), strO0, function0, (b0k) obj);
                return rih1Var;
            case 7:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    qim0 qim0VarN = anm1.N("CtaButton", nim0Var);
                    idx idxVar = new idx(19);
                    String strO1 = cwl1.o0(x340Var12, 2131954724);
                    if (ihc1.y0(strO1)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    foo1.c(new gbx(new y50(strO1), function0), idxVar, qim0VarN, (max) null, yla.p(x340Var12), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(1625488084, new zsd1(strO0, (byte) 15), x340Var12), x340Var12, 0, 48, 2008);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                r2p1.g(czo1.p(49), strO0, function0, (b0k) obj);
                return rih1Var;
            default:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (!x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x340Var14.b0();
                } else {
                    if (ihc1.y0(strO0)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    foo1.c(new gbx(new y50(strO0), function0), new idx(4), (qim0) null, (max) null, yla.s(x340Var14), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-93480525, new zsd1(strO0, (byte) 26), x340Var14), x340Var14, 0, 48, 2012);
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s721(String str, Function0 function0, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s721(String str, Function0 function0, int i, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s721(String str, Function0 function0) {
        super(2);
        this.a = (byte) 5;
        this.b = str;
        this.c = function0;
    }
}
