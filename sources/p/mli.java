package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mli extends hab0 implements bv30 {
    public static final mli N0;
    public static final mli O0;
    public static final mli P0;
    public static final mli Q0;
    public static final mli R0;
    public static final mli S0;
    public static final mli T0;
    public static final mli U0;
    public static final mli V0;
    public static final mli W0;
    public static final mli X;
    public static final mli X0;
    public static final mli Y;
    public static final mli Y0;
    public static final mli Z;
    public static final mli Z0;
    public static final mli a1;
    public static final mli b;
    public static final mli b1;
    public static final mli c;
    public static final mli c1;
    public static final mli d;
    public static final mli d1;
    public static final mli e;
    public static final mli e1;
    public static final mli f;
    public static final mli g;
    public static final mli h;
    public static final mli i;
    public static final mli t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 5;
        b = new mli(i2, (byte) 0);
        c = new mli(i2, (byte) 1);
        d = new mli(i2, (byte) 2);
        e = new mli(i2, (byte) 3);
        f = new mli(i2, (byte) 4);
        g = new mli(i2, (byte) 5);
        h = new mli(i2, (byte) 6);
        i = new mli(i2, (byte) 7);
        t = new mli(i2, (byte) 8);
        X = new mli(i2, (byte) 9);
        Y = new mli(i2, (byte) 10);
        Z = new mli(i2, (byte) 11);
        N0 = new mli(i2, (byte) 12);
        O0 = new mli(i2, (byte) 13);
        P0 = new mli(i2, (byte) 14);
        Q0 = new mli(i2, (byte) 15);
        R0 = new mli(i2, (byte) 16);
        S0 = new mli(i2, (byte) 17);
        T0 = new mli(i2, (byte) 18);
        U0 = new mli(i2, (byte) 19);
        V0 = new mli(i2, (byte) 20);
        W0 = new mli(i2, (byte) 21);
        X0 = new mli(i2, (byte) 22);
        Y0 = new mli(i2, (byte) 23);
        Z0 = new mli(i2, (byte) 24);
        a1 = new mli(i2, (byte) 25);
        b1 = new mli(i2, (byte) 26);
        c1 = new mli(i2, (byte) 27);
        d1 = new mli(i2, (byte) 28);
        e1 = new mli(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mli(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iq00 iq00Var = (iq00) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        String str = iq00Var.a;
        if (str == null || str.length() == 0) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(58031990);
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(57639902);
            String str2 = iq00Var.a;
            qim0 qim0VarN = anm1.N("expandable_playlist_description", nim0.a);
            int i2 = (iIntValue & 896) ^ 384;
            boolean z = true;
            boolean z2 = (i2 > 256 && x340Var3.g(iu30Var)) || (iIntValue & 384) == 256;
            Object objT = x340Var3.T();
            if (z2 || objT == m4cVar) {
                objT = new cci(iu30Var, (byte) 16);
                x340Var3.s0(objT);
            }
            iu30 iu30Var2 = (iu30) objT;
            if ((i2 <= 256 || !x340Var3.g(iu30Var)) && (iIntValue & 384) != 256) {
                z = false;
            }
            Object objT2 = x340Var3.T();
            if (z || objT2 == m4cVar) {
                objT2 = new cci(iu30Var, (byte) 17);
                x340Var3.s0(objT2);
            }
            iho1.f(str2, qim0VarN, iu30Var2, (iu30) objT2, x340Var3, 0);
            x340Var3.r(false);
        }
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ws00 ws00Var = (ws00) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new pki(iu30Var, (byte) 27);
            x340Var2.s0(objT);
        }
        Function0 function0 = (Function0) objT;
        qim0 qim0VarR = d7e.r(1.0f, nim0.a, false);
        cr31 cr31VarB = er31.b(16.0f);
        qsd qsdVarP = s3o1.p((dah) x340Var2.k(eah.a));
        u7h u7hVar = ws00Var.d;
        l4o1.a(function0, qim0VarR, false, cr31VarB, qsdVarP.a(u7hVar != null ? u7hVar.a : u7h.c, qsdVarP.b, qsdVarP.c, qsdVarP.d), null, apo.r(1620435400, new okg(ws00Var, (byte) 17), x340Var2), x340Var2, 100663296, 228);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        so10 so10Var = (vo10) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        so10 so10Var2 = so10Var instanceof so10 ? so10Var : null;
        boolean z = so10Var2 != null ? so10Var2.Y : false;
        x340 x340Var2 = x340Var;
        boolean zI = x340Var2.i(so10Var) | ((((iIntValue & 896) ^ 384) > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256);
        Object objT = x340Var2.T();
        if (zI || objT == fkj0.X) {
            objT = new dfi((byte) 6, so10Var, iu30Var);
            x340Var2.s0(objT);
        }
        vxo1.d(so10Var, (Function0) objT, null, z, x340Var2, (iIntValue >> 3) & 14);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        gp10 gp10Var = (ip10) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if (gp10Var instanceof hp10) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(221505556);
            x340Var2.r(false);
        } else {
            if (!(gp10Var instanceof gp10)) {
                throw p3d1.k(x340Var, 221497526, false);
            }
            x340 x340Var3 = x340Var;
            x340Var3.i0(221507006);
            gp10 gp10Var2 = gp10Var;
            boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var3.g(iu30Var)) || (iIntValue & 384) == 256;
            Object objT = x340Var3.T();
            if (z || objT == fkj0.X) {
                objT = new pki(iu30Var, (byte) 28);
                x340Var3.s0(objT);
            }
            wxo1.f(gp10Var2, (Function0) objT, null, gp10Var2.i, gp10Var2.t, x340Var3, (iIntValue >> 3) & 14);
            x340Var3.r(false);
        }
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i2;
        t820 t820Var = (t820) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        if ((iIntValue & 48) == 0) {
            i2 = (x340Var.g(t820Var) ? 32 : 16) | iIntValue;
        } else {
            i2 = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i2 & 1, (i2 & 1169) != 1168)) {
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objT = x340Var2.T();
            if (z || objT == m4cVar) {
                objT = new pki(iu30Var, (byte) 29);
                x340Var2.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            boolean z2 = i3 == 256;
            Object objT2 = x340Var2.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new sm(iu30Var, (byte) 28);
                x340Var2.s0(objT2);
            }
            h0p1.e(function0, t820Var, (vu30) objT2, null, x340Var2, i2 & 112);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:282:0x0816  */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        mmr0 mmr0Var;
        int i2;
        boolean z;
        qim0 qim0Var;
        boolean z2;
        Object objT;
        int i3;
        byte b2 = this.a;
        f36 f36Var = h36.c;
        z50 z50Var = z50.c;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                q7x q7xVar = (q7x) obj2;
                x340 x340Var = (b0k) obj4;
                int iIntValue = ((Number) obj5).intValue();
                if ((iIntValue & 48) == 0) {
                    iIntValue |= x340Var.g(q7xVar) ? 32 : 16;
                }
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 1041) != 1040)) {
                    String str = q7xVar.a;
                    uwr uwrVar = cbx.a;
                    lee1 lee1Var = cbx.d(x340Var2).j;
                    long j = cbx.a(x340Var2).b.b;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    uwo1.e(str, uyn1.B(nim0.a, 0.0f, 0.0f, 0.0f, 8.0f, 7), lee1Var, j, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2032);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                b8x b8xVar = (b8x) obj2;
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var3 = (b0k) obj4;
                ((Number) obj5).intValue();
                if (b8xVar.b) {
                    x340 x340Var4 = x340Var3;
                    x340Var4.i0(1928752959);
                    qim0 qim0VarR = u291.r(nim0Var, 1.0f);
                    Object objT2 = x340Var4.T();
                    if (objT2 == fkj0.X) {
                        objT2 = ovh.b1;
                        x340Var4.s0(objT2);
                    }
                    op71.g(x340Var4, s161.a(qim0VarR, (iu30) objT2));
                    nyx.a(2, (wux) null, apo.r(-837251098, new l2i(b8xVar, iu30Var, (byte) 6), x340Var4), x340Var4, 3078, 6);
                    x340Var4.r(false);
                } else {
                    x340 x340Var5 = x340Var3;
                    x340Var5.i0(1929009546);
                    x340Var5.r(false);
                }
                return rih1Var;
            case 2:
                m8x m8xVar = (m8x) obj2;
                x340 x340Var6 = (b0k) obj4;
                int iIntValue2 = ((Number) obj5).intValue();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= x340Var6.g(m8xVar) ? 32 : 16;
                }
                x340 x340Var7 = x340Var6;
                if (x340Var7.Y(iIntValue2 & 1, (iIntValue2 & 1041) != 1040)) {
                    eko1.f(0, x340Var7, (qim0) null, m8xVar.a);
                } else {
                    x340Var7.b0();
                }
                return rih1Var;
            case 3:
                l8x l8xVar = (l8x) obj2;
                x340 x340Var8 = (b0k) obj4;
                int iIntValue3 = ((Number) obj5).intValue();
                if ((iIntValue3 & 48) == 0) {
                    iIntValue3 |= x340Var8.g(l8xVar) ? 32 : 16;
                }
                x340 x340Var9 = x340Var8;
                if (x340Var9.Y(iIntValue3 & 1, (iIntValue3 & 1041) != 1040)) {
                    dko1.f(0, l8xVar.a, l8xVar.b, x340Var9, null);
                } else {
                    x340Var9.b0();
                }
                return rih1Var;
            case 4:
                n8x n8xVar = (n8x) obj2;
                x340 x340Var10 = (b0k) obj4;
                ((Number) obj5).intValue();
                if (n8xVar instanceof i8x) {
                    x340 x340Var11 = x340Var10;
                    x340Var11.i0(-1617102614);
                    mmr0Var = new mmr0(cwl1.o0(x340Var11, 2131953576), cwl1.o0(x340Var11, 2131953575));
                    i2 = 0;
                    x340Var11.r(false);
                } else if (n8xVar instanceof j8x) {
                    x340 x340Var12 = x340Var10;
                    x340Var12.i0(-1617096659);
                    mmr0Var = new mmr0(cwl1.n0(2131953574, new Object[]{((j8x) n8xVar).a}, x340Var12), cwl1.o0(x340Var12, 2131953573));
                    i2 = 0;
                    x340Var12.r(false);
                } else {
                    if (!(n8xVar instanceof h8x)) {
                        throw p3d1.k(x340Var10, -1617104146, false);
                    }
                    x340 x340Var13 = x340Var10;
                    x340Var13.i0(-1617089770);
                    mmr0Var = new mmr0(cwl1.o0(x340Var13, 2131953572), cwl1.o0(x340Var13, 2131953571));
                    i2 = 0;
                    x340Var13.r(false);
                }
                iko1.d((String) mmr0Var.a, (String) mmr0Var.b, x340Var10, i2);
                return rih1Var;
            case 5:
                iu30 iu30Var2 = (iu30) obj3;
                x340 x340Var14 = (b0k) obj4;
                int iIntValue4 = ((Number) obj5).intValue();
                boolean z3 = (((iIntValue4 & 896) ^ 384) > 256 && x340Var14.g(iu30Var2)) || (iIntValue4 & 384) == 256;
                x340 x340Var15 = x340Var14;
                Object objT3 = x340Var15.T();
                if (z3 || objT3 == fkj0.X) {
                    objT3 = new pki(iu30Var2, (byte) 11);
                    x340Var15.s0(objT3);
                }
                blo1.b(0, (Function0) objT3, x340Var15, null);
                return rih1Var;
            case 6:
                b0k b0kVar = (b0k) obj4;
                ((Number) obj5).intValue();
                nyx.a(0, (wux) null, apo.r(-1383384880, new l8i((b9x) obj2, (byte) 10), b0kVar), b0kVar, 3072, 7);
                return rih1Var;
            case 7:
                ((Number) obj5).intValue();
                ilo1.f(((l9x) obj2).a, null, (b0k) obj4, 0);
                return rih1Var;
            case 8:
                w9x w9xVar = (w9x) obj2;
                iu30 iu30Var3 = (iu30) obj3;
                x340 x340Var16 = (b0k) obj4;
                int iIntValue5 = ((Number) obj5).intValue();
                m4c m4cVar = fkj0.X;
                String strO0 = cwl1.o0(x340Var16, 2131953605);
                String strO1 = cwl1.o0(x340Var16, 2131953606);
                i3u i3uVar = new i3u(4, false, false, false);
                Function0 function0 = w9xVar.b;
                String strN0 = cwl1.n0(2131953608, new Object[]{w9xVar.a}, x340Var16);
                String strO2 = cwl1.o0(x340Var16, 2131953607);
                int i4 = (iIntValue5 & 896) ^ 384;
                boolean z4 = (i4 > 256 && x340Var16.g(iu30Var3)) || (iIntValue5 & 384) == 256;
                x340 x340Var17 = x340Var16;
                Object objT4 = x340Var17.T();
                if (z4 || objT4 == m4cVar) {
                    objT4 = new pki(iu30Var3, (byte) 12);
                    x340Var17.s0(objT4);
                }
                Function0 function1 = (Function0) objT4;
                if (ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                } else {
                    zgx zgxVar = new zgx(strO0, new gbx(new y50(strO0), function1));
                    boolean zI = x340Var17.i(w9xVar) | ((i4 > 256 && x340Var17.g(iu30Var3)) || (iIntValue5 & 384) == 256);
                    Object objT5 = x340Var17.T();
                    if (zI || objT5 == m4cVar) {
                        objT5 = new dfi(iu30Var3, w9xVar, (byte) 3);
                        x340Var17.s0(objT5);
                    }
                    Function0 function2 = (Function0) objT5;
                    if (!ihc1.y0(strO1)) {
                        mqo1.d(function0, i3uVar, null, strN0, strO2, zgxVar, new zgx(strO1, new gbx(new y50(strO1), function2)), x340Var17, 2359296, 4);
                        return rih1Var;
                    }
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                }
                return null;
            case 9:
                q7y q7yVar = (q7y) obj2;
                iu30 iu30Var4 = (iu30) obj3;
                x340 x340Var18 = (b0k) obj4;
                int iIntValue6 = ((Number) obj5).intValue();
                m4c m4cVar2 = fkj0.X;
                String str2 = q7yVar.a;
                String str3 = q7yVar.b;
                String str4 = q7yVar.d;
                String str5 = q7yVar.e;
                String str6 = q7yVar.g;
                String str7 = q7yVar.c;
                int i5 = (iIntValue6 & 896) ^ 384;
                boolean z5 = (i5 > 256 && x340Var18.g(iu30Var4)) || (iIntValue6 & 384) == 256;
                x340 x340Var19 = x340Var18;
                Object objT6 = x340Var19.T();
                if (z5 || objT6 == m4cVar2) {
                    objT6 = new pki(iu30Var4, (byte) 13);
                    x340Var19.s0(objT6);
                }
                Function0 function3 = (Function0) objT6;
                boolean z6 = (i5 > 256 && x340Var19.g(iu30Var4)) || (iIntValue6 & 384) == 256;
                Object objT7 = x340Var19.T();
                if (z6 || objT7 == m4cVar2) {
                    objT7 = new pki(iu30Var4, (byte) 14);
                    x340Var19.s0(objT7);
                }
                mym.b(str2, str3, str4, str5, str6, str7, function3, (Function0) objT7, x340Var19, 0, 0);
                return rih1Var;
            case 10:
                xdy.c((zdy) obj2, (iu30) obj3, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 126);
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                dey deyVar = (dey) obj2;
                ((Number) obj5).intValue();
                cuo1.v(deyVar.a, deyVar.b, (b0k) obj4, 0);
                return rih1Var;
            case grn1.d /* 12 */:
                ypy ypyVar = (ypy) obj2;
                iu30 iu30Var5 = (iu30) obj3;
                x340 x340Var20 = (b0k) obj4;
                int iIntValue7 = ((Number) obj5).intValue();
                m4c m4cVar3 = fkj0.X;
                qim0 qim0Var2 = nim0.a;
                qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var20).b;
                qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarF);
                mbh mbhVarA = jbh.a(f36Var, een.P0, x340Var20, 0);
                x340 x340Var21 = x340Var20;
                int iHashCode = Long.hashCode(x340Var21.T);
                xos0 xos0VarM = x340Var21.m();
                qim0 qim0VarE = zr7.E(x340Var20, qim0VarZ);
                hzj.A.getClass();
                x340 x340Var22 = x340Var20;
                if (x340Var22.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var22.m0();
                if (x340Var22.S) {
                    x340Var22.l(n4kVar);
                } else {
                    x340Var22.v0();
                }
                nko1.H(mbhVarA, x340Var20, y580.O0);
                nko1.H(xos0VarM, x340Var20, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var20, y580.R0);
                nko1.F(x340Var20);
                nko1.H(qim0VarE, x340Var20, y580.Y);
                String str8 = ypyVar.a;
                int i6 = (iIntValue7 & 896) ^ 384;
                boolean z7 = (i6 > 256 && x340Var22.g(iu30Var5)) || (iIntValue7 & 384) == 256;
                Object objT8 = x340Var22.T();
                if (z7 || objT8 == m4cVar3) {
                    objT8 = new cci(iu30Var5, (byte) 15);
                    x340Var22.s0(objT8);
                }
                iu30 iu30Var6 = (iu30) objT8;
                boolean z8 = (i6 > 256 && x340Var22.g(iu30Var5)) || (iIntValue7 & 384) == 256;
                Object objT9 = x340Var22.T();
                if (z8 || objT9 == m4cVar3) {
                    objT9 = new pki(iu30Var5, (byte) 15);
                    x340Var22.s0(objT9);
                }
                cqy.c(0, str8, (Function0) objT9, x340Var20, iu30Var6, (qim0) null);
                Integer num = ypyVar.c;
                int i7 = ypyVar.d;
                if (i7 != 2) {
                    z = false;
                    if (i7 == 3) {
                        x340Var22.i0(-2143548485);
                        cqy.d(cwl1.o0(x340Var20, 2131955557), cwl1.o0(x340Var20, 2131955556), x340Var20, 0);
                        x340Var22.r(false);
                    } else if (num != null && ihc1.y0(ypyVar.a) && ypyVar.b.isEmpty()) {
                        x340Var22.i0(-2143539022);
                        qim0Var = qim0Var2;
                        cqy.a(cwl1.U(2131820678, num.intValue(), new Object[]{num}, x340Var20), cbx.d(x340Var20).f, cbx.a(x340Var20).b.b, uyn1.B(qim0Var2, 0.0f, cqy.b, 0.0f, 0.0f, 13), x340Var20, 0, 0);
                        z = false;
                        x340Var22.r(false);
                    } else {
                        qim0Var = qim0Var2;
                        z = false;
                        x340Var22.i0(-2024881901);
                        x340Var22.r(false);
                    }
                    cvx cvxVar3 = cbx.b(x340Var20).b;
                    op71.g(x340Var20, u291.h(qim0Var, 12.0f));
                    qim0 qim0VarL = bmq0.L(new wnb0(1.0f, z), k1o1.q(x340Var20), (g6o0) null);
                    z2 = ((((iIntValue7 & 112) ^ 48) <= 32 && x340Var22.g(ypyVar)) || (iIntValue7 & 48) == 32) | ((i6 <= 256 && x340Var22.g(iu30Var5)) || (iIntValue7 & 384) == 256);
                    objT = x340Var22.T();
                    if (z2 || objT == m4cVar3) {
                        objT = new puh(ypyVar, iu30Var5, (byte) 9);
                        x340Var22.s0(objT);
                    }
                    ujo1.d(qim0VarL, null, null, false, null, null, null, false, null, (iu30) objT, x340Var20, 0, 510);
                    x340Var22.r(true);
                    return rih1Var;
                }
                x340Var22.i0(-2143557127);
                z = false;
                cqy.d(cwl1.o0(x340Var20, 2131955559), cwl1.o0(x340Var20, 2131955558), x340Var20, 0);
                x340Var22.r(false);
                qim0Var = qim0Var2;
                cvx cvxVar4 = cbx.b(x340Var20).b;
                op71.g(x340Var20, u291.h(qim0Var, 12.0f));
                qim0 qim0VarL2 = bmq0.L(new wnb0(1.0f, z), k1o1.q(x340Var20), (g6o0) null);
                z2 = ((((iIntValue7 & 112) ^ 48) <= 32 && x340Var22.g(ypyVar)) || (iIntValue7 & 48) == 32) | ((i6 <= 256 && x340Var22.g(iu30Var5)) || (iIntValue7 & 384) == 256);
                objT = x340Var22.T();
                if (z2) {
                    objT = new puh(ypyVar, iu30Var5, (byte) 9);
                    x340Var22.s0(objT);
                } else {
                    objT = new puh(ypyVar, iu30Var5, (byte) 9);
                    x340Var22.s0(objT);
                }
                ujo1.d(qim0VarL2, null, null, false, null, null, null, false, null, (iu30) objT, x340Var20, 0, 510);
                x340Var22.r(true);
                return rih1Var;
            case 13:
                b0z b0zVar = (b0z) obj2;
                iu30 iu30Var7 = (iu30) obj3;
                x340 x340Var23 = (b0k) obj4;
                int iIntValue8 = ((Number) obj5).intValue();
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                x340 x340Var24 = x340Var23;
                int iHashCode2 = Long.hashCode(x340Var24.T);
                xos0 xos0VarM2 = x340Var24.m();
                qim0 qim0VarE2 = zr7.E(x340Var23, qim0VarF2);
                hzj.A.getClass();
                x340 x340Var25 = x340Var23;
                if (x340Var25.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var25.m0();
                if (x340Var25.S) {
                    x340Var25.l(n4kVar);
                } else {
                    x340Var25.v0();
                }
                nko1.H(gfh0VarC, x340Var23, y580.O0);
                nko1.H(xos0VarM2, x340Var23, y580.N0);
                nko1.H(Integer.valueOf(iHashCode2), x340Var23, y580.R0);
                nko1.F(x340Var23);
                nko1.H(qim0VarE2, x340Var23, y580.Y);
                p60 p60Var = b0zVar.b;
                qim0 qim0VarA = h2c.a.a(nim0Var, een.h);
                boolean z9 = ((((iIntValue8 & 896) ^ 384) > 256 && x340Var25.g(iu30Var7)) || (iIntValue8 & 384) == 256) | ((((iIntValue8 & 112) ^ 48) > 32 && x340Var25.i(b0zVar)) || (iIntValue8 & 48) == 32);
                Object objT10 = x340Var25.T();
                if (z9 || objT10 == fkj0.X) {
                    objT10 = new dfi(iu30Var7, b0zVar, (byte) 5);
                    x340Var25.s0(objT10);
                }
                kln1.c(p60Var, qim0VarA, (Function0) objT10, x340Var23, 0, 8);
                x340Var25.r(true);
                return rih1Var;
            case 14:
                n4z n4zVar = (n4z) obj2;
                iu30 iu30Var8 = (iu30) obj3;
                x340 x340Var26 = (b0k) obj4;
                int iIntValue9 = ((Number) obj5).intValue();
                m4c m4cVar4 = fkj0.X;
                int i8 = (iIntValue9 & 896) ^ 384;
                boolean z10 = (i8 > 256 && x340Var26.g(iu30Var8)) || (iIntValue9 & 384) == 256;
                x340 x340Var27 = x340Var26;
                Object objT11 = x340Var27.T();
                if (z10 || objT11 == m4cVar4) {
                    objT11 = new pki(iu30Var8, (byte) 16);
                    x340Var27.s0(objT11);
                }
                Function0 function4 = (Function0) objT11;
                boolean z11 = (i8 > 256 && x340Var27.g(iu30Var8)) || (iIntValue9 & 384) == 256;
                Object objT12 = x340Var27.T();
                if (z11 || objT12 == m4cVar4) {
                    objT12 = new pki(iu30Var8, (byte) 17);
                    x340Var27.s0(objT12);
                }
                qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
                uwr uwrVar3 = cbx.a;
                cvx cvxVar5 = cbx.b(x340Var27).b;
                cvx cvxVar6 = cbx.b(x340Var27).b;
                oon1.b(n4zVar, function4, (Function0) objT12, uyn1.y(qim0VarF3, 16.0f, 12.0f), x340Var27, (iIntValue9 >> 3) & 14);
                return rih1Var;
            case 15:
                xfz xfzVar = (xfz) obj2;
                iu30 iu30Var9 = (iu30) obj3;
                x340 x340Var28 = (b0k) obj4;
                int iIntValue10 = ((Number) obj5).intValue();
                nim0 nim0Var2 = nim0.a;
                qim0 qim0VarD = u291.d(nim0Var2, 1.0f);
                uwr uwrVar4 = cbx.a;
                qim0 qim0VarZ2 = uyn1.z(cbx.b(x340Var28).b.e, 0.0f, 2, qim0VarD);
                gfh0 gfh0VarC2 = t1c.c(een.h, false);
                x340 x340Var29 = x340Var28;
                int iHashCode3 = Long.hashCode(x340Var29.T);
                xos0 xos0VarM3 = x340Var29.m();
                qim0 qim0VarE3 = zr7.E(x340Var28, qim0VarZ2);
                hzj.A.getClass();
                x340 x340Var30 = x340Var28;
                if (x340Var30.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var30.m0();
                if (x340Var30.S) {
                    x340Var30.l(n4kVar);
                } else {
                    x340Var30.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(gfh0VarC2, x340Var28, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM3, x340Var28, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode3);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var28, lljVar3);
                nko1.F(x340Var28);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE3, x340Var28, lljVar4);
                mbh mbhVarA2 = jbh.a(f36Var, een.Q0, x340Var28, 0);
                int iHashCode4 = Long.hashCode(x340Var30.T);
                xos0 xos0VarM4 = x340Var30.m();
                qim0 qim0VarE4 = zr7.E(x340Var28, nim0Var2);
                x340Var30.m0();
                if (x340Var30.S) {
                    x340Var30.l(n4kVar);
                } else {
                    x340Var30.v0();
                }
                nko1.H(mbhVarA2, x340Var28, lljVar);
                nko1.H(xos0VarM4, x340Var28, lljVar2);
                i3a.l(iHashCode4, x340Var28, lljVar3, x340Var28);
                nko1.H(qim0VarE4, x340Var28, lljVar4);
                uwo1.e(xfzVar.a, null, cbx.d(x340Var28).e, cbx.a(x340Var28).b.a, new a0e1(3), null, 0, false, null, 0, null, x340Var28, 0, 0, 2018);
                String str9 = xfzVar.b;
                lee1 lee1Var2 = cbx.d(x340Var28).j;
                long j2 = cbx.a(x340Var28).b.b;
                cvx cvxVar7 = cbx.b(x340Var28).b;
                uwo1.e(str9, uyn1.B(nim0Var2, 0.0f, 8.0f, 0.0f, 0.0f, 13), lee1Var2, j2, new a0e1(3), null, 0, false, null, 0, null, x340Var28, 0, 0, 2016);
                boolean z12 = (((iIntValue10 & 896) ^ 384) > 256 && x340Var30.g(iu30Var9)) || (iIntValue10 & 384) == 256;
                Object objT13 = x340Var30.T();
                if (z12 || objT13 == fkj0.X) {
                    objT13 = new pki(iu30Var9, (byte) 18);
                    x340Var30.s0(objT13);
                }
                foo1.c(new gbx(z50Var, (Function0) objT13), new idx(6), uyn1.B(nim0Var2, 0.0f, cbx.b(x340Var28).b.e, 0.0f, 0.0f, 13), null, null, null, null, null, null, null, apo.r(1666865242, new l8i(xfzVar, (byte) 11), x340Var28), x340Var28, 0, 48, 2040);
                x340Var30.r(true);
                x340Var30.r(true);
                return rih1Var;
            case 16:
                b0k b0kVar2 = (b0k) obj4;
                ((Number) obj5).intValue();
                nyx.a(2, (wux) null, apo.r(258829936, new l2i((dhz) obj2, (iu30) obj3, (byte) 7), b0kVar2), b0kVar2, 3078, 6);
                return rih1Var;
            case 17:
                ((Number) obj5).intValue();
                rzn1.c((b0k) obj4, 0);
                return rih1Var;
            case 18:
                ojz ojzVar = (ojz) obj2;
                iu30 iu30Var10 = (iu30) obj3;
                x340 x340Var31 = (b0k) obj4;
                int iIntValue11 = ((Number) obj5).intValue();
                if ((iIntValue11 & 48) == 0) {
                    i3 = iIntValue11 | (x340Var31.g(ojzVar) ? 32 : 16);
                } else {
                    i3 = iIntValue11;
                }
                if ((iIntValue11 & 384) == 0) {
                    i3 |= x340Var31.i(iu30Var10) ? 256 : 128;
                }
                x340 x340Var32 = x340Var31;
                if (x340Var32.Y(i3 & 1, (i3 & 1169) != 1168)) {
                    String str10 = ojzVar.a;
                    String str11 = ojzVar.b;
                    String str12 = ojzVar.c;
                    boolean z13 = (i3 & 896) == 256;
                    Object objT14 = x340Var32.T();
                    if (z13 || objT14 == fkj0.X) {
                        objT14 = new pki(iu30Var10, (byte) 20);
                        x340Var32.s0(objT14);
                    }
                    bzn1.c(0, str10, str11, str12, (Function0) objT14, x340Var32, null);
                } else {
                    x340Var32.b0();
                }
                return rih1Var;
            case 19:
                iu30 iu30Var11 = (iu30) obj3;
                x340 x340Var33 = (b0k) obj4;
                int iIntValue12 = ((Number) obj5).intValue();
                boolean z14 = (((iIntValue12 & 896) ^ 384) > 256 && x340Var33.g(iu30Var11)) || (iIntValue12 & 384) == 256;
                x340 x340Var34 = x340Var33;
                Object objT15 = x340Var34.T();
                if (z14 || objT15 == fkj0.X) {
                    objT15 = new pki(iu30Var11, (byte) 21);
                    x340Var34.s0(objT15);
                }
                guo1.t((Function0) objT15, x340Var34, 0);
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                iu30 iu30Var12 = (iu30) obj3;
                x340 x340Var35 = (b0k) obj4;
                int iIntValue13 = ((Number) obj5).intValue();
                m4c m4cVar5 = fkj0.X;
                int i9 = (iIntValue13 & 896) ^ 384;
                boolean z15 = (i9 > 256 && x340Var35.g(iu30Var12)) || (iIntValue13 & 384) == 256;
                x340 x340Var36 = x340Var35;
                Object objT16 = x340Var36.T();
                if (z15 || objT16 == m4cVar5) {
                    objT16 = new pki(iu30Var12, (byte) 22);
                    x340Var36.s0(objT16);
                }
                Function0 function5 = (Function0) objT16;
                String strO3 = cwl1.o0(x340Var36, 2131959015);
                String strO4 = cwl1.o0(x340Var36, 2131959013);
                String strO5 = cwl1.o0(x340Var36, 2131959012);
                boolean z16 = (i9 > 256 && x340Var36.g(iu30Var12)) || (iIntValue13 & 384) == 256;
                Object objT17 = x340Var36.T();
                if (z16 || objT17 == m4cVar5) {
                    objT17 = new pki(iu30Var12, (byte) 23);
                    x340Var36.s0(objT17);
                }
                zgx zgxVar2 = new zgx(strO5, new gbx(z50Var, (Function0) objT17));
                String strO6 = cwl1.o0(x340Var36, 2131959014);
                boolean z17 = (i9 > 256 && x340Var36.g(iu30Var12)) || (iIntValue13 & 384) == 256;
                Object objT18 = x340Var36.T();
                if (z17 || objT18 == m4cVar5) {
                    objT18 = new pki(iu30Var12, (byte) 24);
                    x340Var36.s0(objT18);
                }
                mqo1.d(function5, null, null, strO3, strO4, zgxVar2, new zgx(strO6, new gbx(z50Var, (Function0) objT18)), x340Var36, 2359296, 6);
                return rih1Var;
            case 21:
                iu30 iu30Var13 = (iu30) obj3;
                x340 x340Var37 = (b0k) obj4;
                int iIntValue14 = ((Number) obj5).intValue();
                m4c m4cVar6 = fkj0.X;
                int i10 = (iIntValue14 & 896) ^ 384;
                boolean z18 = (i10 > 256 && x340Var37.g(iu30Var13)) || (iIntValue14 & 384) == 256;
                x340 x340Var38 = x340Var37;
                Object objT19 = x340Var38.T();
                if (z18 || objT19 == m4cVar6) {
                    objT19 = new pki(iu30Var13, (byte) 25);
                    x340Var38.s0(objT19);
                }
                Function0 function6 = (Function0) objT19;
                boolean z19 = (i10 > 256 && x340Var38.g(iu30Var13)) || (iIntValue14 & 384) == 256;
                Object objT20 = x340Var38.T();
                if (z19 || objT20 == m4cVar6) {
                    objT20 = new pki(iu30Var13, (byte) 26);
                    x340Var38.s0(objT20);
                }
                wgo1.i(function6, (Function0) objT20, null, null, null, null, x340Var38, 0, 60);
                return rih1Var;
            case 22:
                return a(obj, obj2, obj3, obj4, obj5);
            case 23:
                return d(obj, obj2, obj3, obj4, obj5);
            case 24:
                int iIntValue15 = ((Number) obj5).intValue();
                wro1.m((t710) obj2, null, (iu30) obj3, (b0k) obj4, (iIntValue15 & 896) | ((iIntValue15 >> 3) & 14));
                return rih1Var;
            case 25:
                return e(obj, obj2, obj3, obj4, obj5);
            case 26:
                return f(obj, obj2, obj3, obj4, obj5);
            case 27:
                return g(obj, obj2, obj3, obj4, obj5);
            case 28:
                a920 a920Var = (a920) obj2;
                ((Number) obj5).intValue();
                i0p1.h(a920Var.a, a920Var.b, a920Var.c, (b0k) obj4, 0);
                return rih1Var;
            default:
                int iIntValue16 = ((Number) obj5).intValue();
                j0p1.c((b920) obj2, u291.f(nim0Var, 1.0f), (iu30) obj3, (b0k) obj4, (iIntValue16 & 896) | ((iIntValue16 >> 3) & 14));
                return rih1Var;
        }
    }
}
