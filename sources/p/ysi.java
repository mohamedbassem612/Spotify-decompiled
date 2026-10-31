package p;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ysi extends hab0 implements bv30 {
    public static final ysi N0;
    public static final ysi O0;
    public static final ysi P0;
    public static final ysi Q0;
    public static final ysi R0;
    public static final ysi S0;
    public static final ysi T0;
    public static final ysi U0;
    public static final ysi V0;
    public static final ysi W0;
    public static final ysi X;
    public static final ysi X0;
    public static final ysi Y;
    public static final ysi Y0;
    public static final ysi Z;
    public static final ysi Z0;
    public static final ysi a1;
    public static final ysi b;
    public static final ysi b1;
    public static final ysi c;
    public static final ysi c1;
    public static final ysi d;
    public static final ysi d1;
    public static final ysi e;
    public static final ysi e1;
    public static final ysi f;
    public static final ysi g;
    public static final ysi h;
    public static final ysi i;
    public static final ysi t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 5;
        b = new ysi(i2, (byte) 0);
        c = new ysi(i2, (byte) 1);
        d = new ysi(i2, (byte) 2);
        e = new ysi(i2, (byte) 3);
        f = new ysi(i2, (byte) 4);
        g = new ysi(i2, (byte) 5);
        h = new ysi(i2, (byte) 6);
        i = new ysi(i2, (byte) 7);
        t = new ysi(i2, (byte) 8);
        X = new ysi(i2, (byte) 9);
        Y = new ysi(i2, (byte) 10);
        Z = new ysi(i2, (byte) 11);
        N0 = new ysi(i2, (byte) 12);
        O0 = new ysi(i2, (byte) 13);
        P0 = new ysi(i2, (byte) 14);
        Q0 = new ysi(i2, (byte) 15);
        R0 = new ysi(i2, (byte) 16);
        S0 = new ysi(i2, (byte) 17);
        T0 = new ysi(i2, (byte) 18);
        U0 = new ysi(i2, (byte) 19);
        V0 = new ysi(i2, (byte) 20);
        W0 = new ysi(i2, (byte) 21);
        X0 = new ysi(i2, (byte) 22);
        Y0 = new ysi(i2, (byte) 23);
        Z0 = new ysi(i2, (byte) 24);
        a1 = new ysi(i2, (byte) 25);
        b1 = new ysi(i2, (byte) 26);
        c1 = new ysi(i2, (byte) 27);
        d1 = new ysi(i2, (byte) 28);
        e1 = new ysi(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ysi(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        qgc0.b((ygc0) obj2, (qim0) null, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 14);
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        h2d0 h2d0Var = (h2d0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        qim0 qim0VarF = u291.f(nim0.a, 1.0f);
        mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
        x340 x340Var2 = x340Var;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
        hzj.A.getClass();
        x340 x340Var3 = x340Var;
        if (x340Var3.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var3.m0();
        if (x340Var3.S) {
            x340Var3.l(hmb0.t1);
        } else {
            x340Var3.v0();
        }
        nko1.H(mbhVarA, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
        nko1.F(x340Var);
        nko1.H(qim0VarE, x340Var, y580.Y);
        String str = h2d0Var.b;
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var3.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT = x340Var3.T();
        if (z || objT == fkj0.X) {
            objT = new rri(iu30Var, (byte) 23);
            x340Var3.s0(objT);
        }
        Function0 function0 = (Function0) objT;
        if (ihc1.y0(str)) {
            hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            return null;
        }
        foo1.g(new gbx(new y50(str), function0), null, null, yla.s(x340Var), null, null, null, apo.r(957516932, new l8i(h2d0Var, (byte) 17), x340Var), x340Var, 12582912, 118);
        x340Var3.r(true);
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        String strO0 = cwl1.o0(x340Var, 2131957370);
        enx enxVar = enx.c;
        t2g t2gVar = new t2g(zBooleanValue, false, null, 6);
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new rri(iu30Var, (byte) 24);
            x340Var2.s0(objT);
        }
        kyo1.c(strO0, enxVar, (Function0) objT, null, false, null, t2gVar, null, x340Var2, enx.d << 3, 184);
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        uwr uwrVar = cbx.a;
        zov0 zov0Var = cbx.b(x340Var).g;
        qim0 qim0VarR = u291.r(nim0.a, 16.0f);
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new rri(iu30Var, (byte) 25);
            x340Var2.s0(objT);
        }
        w0h1.a(xmx.c, isl.a, bin.x(qim0VarR, false, null, null, null, (Function0) objT, 15), cbx.a(x340Var2).b.b, cbx.a(x340Var2).b.b, true, x340Var2, xmx.d | 196656, 0);
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        gm61 gm61Var = (gm61) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == m4cVar) {
            objT = new cci(iu30Var, (byte) 24);
            x340Var2.s0(objT);
        }
        iu30 iu30Var2 = (iu30) objT;
        boolean zI = x340Var2.i(gm61Var);
        Object objT2 = x340Var2.T();
        if (zI || objT2 == m4cVar) {
            objT2 = new mwh(gm61Var, (byte) 4);
            x340Var2.s0(objT2);
        }
        dm5.a(iu30Var2, (qim0) null, (iu30) objT2, x340Var2, 0, 2);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        yad0 yad0Var = (yad0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new rri(iu30Var, (byte) 26);
            x340Var2.s0(objT);
        }
        Function0 function0 = (Function0) objT;
        had0 had0Var = yad0Var.c;
        if (had0Var instanceof iad0) {
            x340Var2.i0(1706610459);
            x340Var2.r(false);
        } else if (had0Var instanceof had0) {
            x340Var2.i0(1706643598);
            had0 had0Var2 = had0Var;
            String str = had0Var2.b;
            String str2 = had0Var2.f;
            if (str == null || str2 == null) {
                x340Var2.i0(1707111357);
                x340Var2.r(false);
            } else {
                x340Var2.i0(1706792956);
                yzo1.f(had0Var2.e, str, str2, had0Var2.g, had0Var2.h, function0, null, x340Var2, 0);
                x340Var2.r(false);
            }
            x340Var2.r(false);
        } else {
            if (!(had0Var instanceof qad0)) {
                throw p3d1.k(x340Var2, 886335207, false);
            }
            x340Var2.i0(1707159252);
            qad0 qad0Var = (qad0) had0Var;
            if (qad0Var instanceof mad0) {
                x340Var2.i0(886354743);
                xzo1.a(0, ((mad0) had0Var).b, function0, x340Var2);
                x340Var2.r(false);
            } else if (qad0Var instanceof nad0) {
                x340Var2.i0(886357623);
                xzo1.a(0, ((nad0) had0Var).a, function0, x340Var2);
                x340Var2.r(false);
            } else if (qad0Var instanceof oad0) {
                x340Var2.i0(886360137);
                oad0 oad0Var = (oad0) had0Var;
                xzo1.e(oad0Var.b, oad0Var.c, function0, x340Var2, 0);
                x340Var2.r(false);
            } else if (qad0Var instanceof jad0) {
                x340Var2.i0(886363313);
                xzo1.f(((jad0) had0Var).a, 0, function0, x340Var2);
                x340Var2.r(false);
            } else {
                if (!(qad0Var instanceof kad0)) {
                    throw p3d1.k(x340Var2, 886353646, false);
                }
                x340Var2.i0(886365664);
                xzo1.g(function0, x340Var2, 0);
                x340Var2.r(false);
            }
            x340Var2.r(false);
        }
        return rih1.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        dgd0.g((vfd0) obj2, (iu30) obj3, null, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 126);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        int i2;
        int i3;
        int i4;
        byte b2 = this.a;
        nim0 nim0Var = nim0.a;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                il80 il80Var = (il80) obj2;
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var = (b0k) obj4;
                int iIntValue = ((Number) obj5).intValue();
                m4c m4cVar = fkj0.X;
                if ((iIntValue & 48) == 0) {
                    i2 = ((iIntValue & 64) == 0 ? x340Var.g(il80Var) : x340Var.i(il80Var) ? 32 : 16) | iIntValue;
                } else {
                    i2 = iIntValue;
                }
                if ((iIntValue & 384) == 0) {
                    i2 |= x340Var.i(iu30Var) ? 256 : 128;
                }
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(i2 & 1, (i2 & 1169) != 1168)) {
                    xk80 xk80Var = il80Var.a;
                    if (xk80Var instanceof zk80) {
                        x340Var2.i0(-462895513);
                        zk80 zk80Var = (zk80) xk80Var;
                        String str = il80Var.b;
                        String str2 = il80Var.c;
                        String str3 = il80Var.d;
                        u7h u7hVar = il80Var.e;
                        u7h u7hVar2 = il80Var.f;
                        int i5 = i2 & 896;
                        boolean z2 = i5 == 256;
                        Object objT = x340Var2.T();
                        if (z2 || objT == m4cVar) {
                            objT = new rri(iu30Var, (byte) 11);
                            x340Var2.s0(objT);
                        }
                        Function0 function0 = (Function0) objT;
                        boolean z3 = i5 == 256;
                        Object objT2 = x340Var2.T();
                        if (z3 || objT2 == m4cVar) {
                            objT2 = new rri(iu30Var, (byte) 12);
                            x340Var2.s0(objT2);
                        }
                        grn1.j(zk80Var, function0, (Function0) objT2, str, str2, str3, u7hVar, u7hVar2, null, x340Var2, 0, 256);
                        x340Var2.r(false);
                    } else {
                        if (!(xk80Var instanceof yk80)) {
                            throw p3d1.k(x340Var2, 400707832, false);
                        }
                        x340Var2.i0(400724132);
                        yk80 yk80Var = (yk80) xk80Var;
                        String str4 = il80Var.b;
                        String str5 = il80Var.c;
                        String str6 = il80Var.d;
                        int i6 = i2 & 896;
                        boolean z4 = i6 == 256;
                        Object objT3 = x340Var2.T();
                        if (z4 || objT3 == m4cVar) {
                            objT3 = new rri(iu30Var, (byte) 13);
                            x340Var2.s0(objT3);
                        }
                        Function0 function1 = (Function0) objT3;
                        boolean z5 = i6 == 256;
                        Object objT4 = x340Var2.T();
                        if (z5 || objT4 == m4cVar) {
                            objT4 = new rri(iu30Var, (byte) 14);
                            x340Var2.s0(objT4);
                        }
                        ply.b(yk80Var, str4, str5, str6, function1, (Function0) objT4, null, x340Var2, 0, 64);
                        x340Var2.r(false);
                    }
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                mt80 mt80Var = (mt80) obj2;
                iu30 iu30Var2 = (iu30) obj3;
                x340 x340Var3 = (b0k) obj4;
                int iIntValue2 = ((Number) obj5).intValue();
                String str7 = mt80Var.a;
                String str8 = mt80Var.f;
                boolean z6 = mt80Var.h;
                if ((((iIntValue2 & 896) ^ 384) <= 256 || !x340Var3.g(iu30Var2)) && (iIntValue2 & 384) != 256) {
                    z = false;
                }
                x340 x340Var4 = x340Var3;
                Object objT5 = x340Var4.T();
                if (z || objT5 == fkj0.X) {
                    objT5 = new rri(iu30Var2, (byte) 15);
                    x340Var4.s0(objT5);
                }
                fae1.d(0, str7, str8, (Function0) objT5, x340Var4, (qim0) null, z6);
                return rih1Var;
            case 2:
                iu30 iu30Var3 = (iu30) obj3;
                x340 x340Var5 = (b0k) obj4;
                int iIntValue3 = ((Number) obj5).intValue();
                if ((((iIntValue3 & 896) ^ 384) <= 256 || !x340Var5.g(iu30Var3)) && (iIntValue3 & 384) != 256) {
                    z = false;
                }
                x340 x340Var6 = x340Var5;
                Object objT6 = x340Var6.T();
                if (z || objT6 == fkj0.X) {
                    objT6 = new rri(iu30Var3, (byte) 16);
                    x340Var6.s0(objT6);
                }
                xto.c(0, (Function0) objT6, x340Var6, null);
                return rih1Var;
            case 3:
                yr90 yr90Var = (yr90) obj2;
                iu30 iu30Var4 = (iu30) obj3;
                x340 x340Var7 = (b0k) obj4;
                ((Number) obj5).intValue();
                if (yr90Var instanceof wr90) {
                    x340 x340Var8 = x340Var7;
                    x340Var8.i0(1109644986);
                    nyx.a(2, (wux) null, apo.r(-154571848, new l2i(yr90Var, iu30Var4, (byte) 11), x340Var8), x340Var8, 3078, 6);
                    x340Var8.r(false);
                } else {
                    x340 x340Var9 = x340Var7;
                    x340Var9.i0(1109739164);
                    x340Var9.r(false);
                }
                return rih1Var;
            case 4:
                nu90 nu90Var = (nu90) obj2;
                iu30 iu30Var5 = (iu30) obj3;
                x340 x340Var10 = (b0k) obj4;
                int iIntValue4 = ((Number) obj5).intValue();
                int i7 = nu90Var.b;
                boolean z7 = nu90Var.c;
                if ((((iIntValue4 & 896) ^ 384) <= 256 || !x340Var10.g(iu30Var5)) && (iIntValue4 & 384) != 256) {
                    z = false;
                }
                x340 x340Var11 = x340Var10;
                Object objT7 = x340Var11.T();
                if (z || objT7 == fkj0.X) {
                    objT7 = new rri(iu30Var5, (byte) 17);
                    x340Var11.s0(objT7);
                }
                u7n0.g(i7, 0, (Function0) objT7, x340Var11, z7);
                return rih1Var;
            case 5:
                rv90 rv90Var = (sv90) obj2;
                iu30 iu30Var6 = (iu30) obj3;
                int iIntValue5 = ((Number) obj5).intValue();
                x340 x340Var12 = (b0k) obj4;
                View view = (View) x340Var12.k(AndroidCompositionLocals_androidKt.f);
                if (rv90Var instanceof rv90) {
                    x340Var12.i0(400736222);
                    c9 c9Var = kv90.a;
                    x880 x880Var = rv90Var.a.e;
                    boolean z8 = (((iIntValue5 & 896) ^ 384) > 256 && x340Var12.g(iu30Var6)) || (iIntValue5 & 384) == 256;
                    if ((((iIntValue5 & 112) ^ 48) <= 32 || !x340Var12.i(rv90Var)) && (iIntValue5 & 48) != 32) {
                        z = false;
                    }
                    boolean zI = z8 | z | x340Var12.i(view);
                    Object objT8 = x340Var12.T();
                    if (zI || objT8 == fkj0.X) {
                        objT8 = new o0d(iu30Var6, rv90Var, view, (byte) 15);
                        x340Var12.s0(objT8);
                    }
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var12).b;
                    iu90.c(c9Var, x880Var, (iu30) objT8, uyn1.x(nim0Var, 8.0f), x340Var12, 6);
                    x340Var12.r(false);
                } else {
                    x340Var12.i0(401198463);
                    x340Var12.r(false);
                }
                return rih1Var;
            case 6:
                cz90 cz90Var = (cz90) obj2;
                iu30 iu30Var7 = (iu30) obj3;
                x340 x340Var13 = (b0k) obj4;
                ((Number) obj5).intValue();
                if (cz90Var instanceof az90) {
                    x340 x340Var14 = x340Var13;
                    x340Var14.i0(-1448723857);
                    nyx.a(2, (wux) null, apo.r(969875164, new l2i(cz90Var, iu30Var7, (byte) 12), x340Var14), x340Var14, 3078, 6);
                    x340Var14.r(false);
                } else {
                    x340 x340Var15 = x340Var13;
                    x340Var15.i0(-1448622952);
                    x340Var15.r(false);
                }
                return rih1Var;
            case 7:
                p0a0 p0a0Var = (q0a0) obj2;
                iu30 iu30Var8 = (iu30) obj3;
                x340 x340Var16 = (b0k) obj4;
                int iIntValue6 = ((Number) obj5).intValue();
                m4c m4cVar2 = fkj0.X;
                if (p0a0Var instanceof p0a0) {
                    x340 x340Var17 = x340Var16;
                    x340Var17.i0(605510340);
                    int i8 = (iIntValue6 & 896) ^ 384;
                    int i9 = (iIntValue6 & 112) ^ 48;
                    boolean z9 = ((i8 > 256 && x340Var17.g(iu30Var8)) || (iIntValue6 & 384) == 256) | ((i9 > 32 && x340Var17.i(p0a0Var)) || (iIntValue6 & 48) == 32);
                    Object objT9 = x340Var17.T();
                    if (z9 || objT9 == m4cVar2) {
                        objT9 = new zti(iu30Var8, p0a0Var, (lnm) null, (byte) 0);
                        x340Var17.s0(objT9);
                    }
                    qxd0.t(rih1Var, x340Var17, (vu30) objT9);
                    p0a0 p0a0Var2 = p0a0Var;
                    boolean z10 = (i8 > 256 && x340Var17.g(iu30Var8)) || (iIntValue6 & 384) == 256;
                    if ((i9 <= 32 || !x340Var17.i(p0a0Var)) && (iIntValue6 & 48) != 32) {
                        z = false;
                    }
                    boolean z11 = z10 | z;
                    Object objT10 = x340Var17.T();
                    if (z11 || objT10 == m4cVar2) {
                        objT10 = new dfi(iu30Var8, p0a0Var, (byte) 11);
                        x340Var17.s0(objT10);
                    }
                    d9y0.c(p0a0Var2, (Function0) objT10, (qim0) null, x340Var17, (iIntValue6 >> 3) & 14);
                    x340Var17.r(false);
                } else {
                    if (!(p0a0Var instanceof o0a0)) {
                        throw p3d1.k(x340Var16, -1643036961, false);
                    }
                    x340 x340Var18 = x340Var16;
                    x340Var18.i0(605771019);
                    x340Var18.r(false);
                }
                return rih1Var;
            case 8:
                iu30 iu30Var9 = (iu30) obj3;
                x340 x340Var19 = (b0k) obj4;
                int iIntValue7 = ((Number) obj5).intValue();
                if ((((iIntValue7 & 896) ^ 384) <= 256 || !x340Var19.g(iu30Var9)) && (iIntValue7 & 384) != 256) {
                    z = false;
                }
                x340 x340Var20 = x340Var19;
                Object objT11 = x340Var20.T();
                if (z || objT11 == fkj0.X) {
                    objT11 = new rri(iu30Var9, (byte) 18);
                    x340Var20.s0(objT11);
                }
                vby0.j((Function0) objT11, x340Var20, 0);
                return rih1Var;
            case 9:
                c921.e((((Number) obj5).intValue() >> 3) & 126, (b0k) obj4, (iu30) obj3, (k5a0) obj2, (qim0) null);
                return rih1Var;
            case 10:
                d6a0 d6a0Var = (d6a0) obj2;
                iu30 iu30Var10 = (iu30) obj3;
                x340 x340Var21 = (b0k) obj4;
                int iIntValue8 = ((Number) obj5).intValue();
                m4c m4cVar3 = fkj0.X;
                boolean z12 = d6a0Var.a;
                int i10 = (iIntValue8 & 896) ^ 384;
                boolean z13 = ((i10 > 256 && x340Var21.g(iu30Var10)) || (iIntValue8 & 384) == 256) | ((((iIntValue8 & 112) ^ 48) > 32 && x340Var21.g(d6a0Var)) || (iIntValue8 & 48) == 32);
                x340 x340Var22 = x340Var21;
                Object objT12 = x340Var22.T();
                if (z13 || objT12 == m4cVar3) {
                    objT12 = new dfi(iu30Var10, d6a0Var, (byte) 12);
                    x340Var22.s0(objT12);
                }
                qim0 qim0VarI = zr7.i(nim0Var, new xy30(z12, (Function0) objT12, (byte) 1));
                jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var22, 0);
                int iHashCode = Long.hashCode(x340Var22.T);
                xos0 xos0VarM = x340Var22.m();
                qim0 qim0VarE = zr7.E(x340Var22, qim0VarI);
                hzj.A.getClass();
                if (x340Var22.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var22.m0();
                if (x340Var22.S) {
                    x340Var22.l(hmb0.t1);
                } else {
                    x340Var22.v0();
                }
                nko1.H(jw31VarA, x340Var22, y580.O0);
                nko1.H(xos0VarM, x340Var22, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var22, y580.R0);
                nko1.F(x340Var22);
                nko1.H(qim0VarE, x340Var22, y580.Y);
                tnx tnxVar = tnx.c;
                uwr uwrVar2 = cbx.a;
                zov0 zov0Var = cbx.b(x340Var22).g;
                w0h1.a(tnxVar, isl.a, anm1.N("jam-toggle-element-leading-icon", u291.r(nim0Var, 24.0f)), cbx.a(x340Var22).b.b, 0L, false, x340Var22, tnx.d | 48, 48);
                cvx cvxVar2 = cbx.b(x340Var22).b;
                op71.g(x340Var22, u291.v(nim0Var, 8.0f));
                String strO0 = cwl1.o0(x340Var22, 2131956952);
                lee1 lee1Var = cbx.d(x340Var22).j;
                long j = cbx.a(x340Var22).b.a;
                wnb0 wnb0Var = new wnb0(1.0f, true);
                cvx cvxVar3 = cbx.b(x340Var22).b;
                uwo1.e(strO0, anm1.N("jam-toggle-element-join-jam-auto-invite-label", uyn1.B(wnb0Var, 0.0f, 0.0f, 16.0f, 0.0f, 11)), lee1Var, j, null, null, 0, false, null, 0, null, x340Var22, 0, 0, 2032);
                qim0 qim0VarN = anm1.N("jam-toggle-element-toggle-switch", nim0Var);
                Object objT13 = x340Var22.T();
                if (objT13 == m4cVar3) {
                    objT13 = oqi.d;
                    x340Var22.s0(objT13);
                }
                qim0 qim0VarB = s161.b(qim0VarN, false, (iu30) objT13);
                boolean z14 = d6a0Var.a;
                boolean z15 = (i10 > 256 && x340Var22.g(iu30Var10)) || (iIntValue8 & 384) == 256;
                Object objT14 = x340Var22.T();
                if (z15 || objT14 == m4cVar3) {
                    objT14 = new cci(iu30Var10, (byte) 22);
                    x340Var22.s0(objT14);
                }
                anm1.c(z14, (iu30) objT14, qim0VarB, (max) null, (idn0) null, x340Var22, 0, 24);
                x340Var22.r(true);
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                p9a0 p9a0Var = (p9a0) obj2;
                x340 x340Var23 = (b0k) obj4;
                int iIntValue9 = ((Number) obj5).intValue();
                if ((iIntValue9 & 48) == 0) {
                    iIntValue9 |= x340Var23.g(p9a0Var) ? 32 : 16;
                }
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue9 & 1, (iIntValue9 & 1041) != 1040)) {
                    mod.b(y9a0.a.a(p9a0Var.b), apo.r(1207680949, new l8i(p9a0Var, (byte) 16), x340Var24), x340Var24, 56);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case grn1.d /* 12 */:
                iu30 iu30Var11 = (iu30) obj3;
                x340 x340Var25 = (b0k) obj4;
                int iIntValue10 = ((Number) obj5).intValue();
                uwr uwrVar3 = cbx.a;
                cvx cvxVar4 = cbx.b(x340Var25).b;
                uvx uvxVar = new uvx(0, (pgx) null, 0, (vzq0) null, uyn1.h(2, 4.0f, 0.0f), (tvx) null, (hw61) null, 0, (p3v) null, 495);
                if ((((iIntValue10 & 896) ^ 384) <= 256 || !x340Var25.g(iu30Var11)) && (iIntValue10 & 384) != 256) {
                    z = false;
                }
                x340 x340Var26 = x340Var25;
                Object objT15 = x340Var26.T();
                if (z || objT15 == fkj0.X) {
                    objT15 = new rri(iu30Var11, (byte) 19);
                    x340Var26.s0(objT15);
                }
                jto1.b(null, uvxVar, null, false, null, null, new gbx(z50.c, (Function0) objT15), null, null, gui.a, null, null, null, null, null, gui.b, x340Var26, 805306432, 196608, 32189);
                return rih1Var;
            case 13:
                b0k b0kVar = (b0k) obj4;
                ((Number) obj5).intValue();
                cwl1.o0(b0kVar, 2131960630);
                String strJ = mqn1.j((String) null, "");
                if (strJ != null) {
                    uwr uwrVar4 = cbx.a;
                    uwo1.e(strJ, null, cbx.d(b0kVar).j, cbx.a(b0kVar).b.b, null, null, 2, false, new cjc0(1), 0, null, b0kVar, 0, 0, 1714);
                }
                return rih1Var;
            case 14:
                iu30 iu30Var12 = (iu30) obj3;
                x340 x340Var27 = (b0k) obj4;
                int iIntValue11 = ((Number) obj5).intValue();
                iys0 iys0Var = ((vta0) obj2).a;
                String str9 = iys0Var.e;
                hux huxVar = iys0Var.a;
                if ((((iIntValue11 & 896) ^ 384) <= 256 || !x340Var27.g(iu30Var12)) && (iIntValue11 & 384) != 256) {
                    z = false;
                }
                x340 x340Var28 = x340Var27;
                Object objT16 = x340Var28.T();
                if (z || objT16 == fkj0.X) {
                    objT16 = new rri(iu30Var12, (byte) 20);
                    x340Var28.s0(objT16);
                }
                ltn1.b(str9, (Function0) objT16, null, huxVar, 0.0f, x340Var28, 4096);
                return rih1Var;
            case 15:
                b0k b0kVar2 = (b0k) obj4;
                ((Number) obj5).intValue();
                gfx.a(z4p1.e(((u0b0) obj2).a), 0L, apo.r(-1619551098, new sm((iu30) obj3, (byte) 29), b0kVar2), b0kVar2, 384);
                return rih1Var;
            case 16:
                iu30 iu30Var13 = (iu30) obj3;
                x340 x340Var29 = (b0k) obj4;
                int iIntValue12 = ((Number) obj5).intValue();
                idx idxVar = new idx(4);
                if ((((iIntValue12 & 896) ^ 384) <= 256 || !x340Var29.g(iu30Var13)) && (iIntValue12 & 384) != 256) {
                    z = false;
                }
                x340 x340Var30 = x340Var29;
                Object objT17 = x340Var30.T();
                if (z || objT17 == fkj0.X) {
                    objT17 = new rri(iu30Var13, (byte) 22);
                    x340Var30.s0(objT17);
                }
                foo1.c(new gbx(z50.c, (Function0) objT17), idxVar, anm1.N("landing_page_button_test_tag", nim0Var), null, null, null, null, null, null, null, rui.a, x340Var30, 0, 48, 2040);
                return rih1Var;
            case 17:
                rzn1.h((bcb0) obj2, (iu30) obj3, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 126);
                return rih1Var;
            case 18:
                kka kkaVar = (kka) obj2;
                iu30 iu30Var14 = (iu30) obj3;
                x340 x340Var31 = (b0k) obj4;
                int iIntValue13 = ((Number) obj5).intValue();
                boolean z16 = (((iIntValue13 & 896) ^ 384) > 256 && x340Var31.g(iu30Var14)) || (iIntValue13 & 384) == 256;
                if ((((iIntValue13 & 112) ^ 48) <= 32 || !x340Var31.i(kkaVar)) && (iIntValue13 & 48) != 32) {
                    z = false;
                }
                boolean z17 = z16 | z;
                x340 x340Var32 = x340Var31;
                Object objT18 = x340Var32.T();
                if (z17 || objT18 == fkj0.X) {
                    objT18 = new xui(iu30Var14, kkaVar, (byte) 0);
                    x340Var32.s0(objT18);
                }
                ggo1.f(kkaVar, null, (Function0) objT18, x340Var32, (iIntValue13 >> 3) & 14);
                return rih1Var;
            case 19:
                kka kkaVar2 = (kka) obj2;
                iu30 iu30Var15 = (iu30) obj3;
                x340 x340Var33 = (b0k) obj4;
                int iIntValue14 = ((Number) obj5).intValue();
                boolean z18 = ((((iIntValue14 & 896) ^ 384) > 256 && x340Var33.g(iu30Var15)) || (iIntValue14 & 384) == 256) | ((((iIntValue14 & 112) ^ 48) > 32 && x340Var33.g(kkaVar2)) || (iIntValue14 & 48) == 32);
                x340 x340Var34 = x340Var33;
                Object objT19 = x340Var34.T();
                if (z18 || objT19 == fkj0.X) {
                    objT19 = new xui(iu30Var15, kkaVar2, (byte) 1);
                    x340Var34.s0(objT19);
                }
                ggo1.f(kkaVar2, null, (Function0) objT19, x340Var34, (iIntValue14 >> 3) & 14);
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                dhy dhyVar = (dhy) obj2;
                iu30 iu30Var16 = (iu30) obj3;
                x340 x340Var35 = (b0k) obj4;
                int iIntValue15 = ((Number) obj5).intValue();
                m4c m4cVar4 = fkj0.X;
                if ((iIntValue15 & 48) == 0) {
                    i3 = iIntValue15 | (x340Var35.g(dhyVar) ? 32 : 16);
                } else {
                    i3 = iIntValue15;
                }
                if ((iIntValue15 & 384) == 0) {
                    i3 |= x340Var35.i(iu30Var16) ? 256 : 128;
                }
                x340 x340Var36 = x340Var35;
                if (x340Var36.Y(i3 & 1, (i3 & 1169) != 1168)) {
                    n6c0 n6c0Var = dhyVar.b;
                    int i11 = i3 & 896;
                    int i12 = i3 & 112;
                    boolean z19 = (i11 == 256) | (i12 == 32);
                    Object objT20 = x340Var36.T();
                    if (z19 || objT20 == m4cVar4) {
                        objT20 = new hvi(iu30Var16, dhyVar, (byte) 0);
                        x340Var36.s0(objT20);
                    }
                    Function0 function2 = (Function0) objT20;
                    boolean z20 = (i11 == 256) | (i12 == 32);
                    Object objT21 = x340Var36.T();
                    if (z20 || objT21 == m4cVar4) {
                        objT21 = new hvi(iu30Var16, dhyVar, (byte) 1);
                        x340Var36.s0(objT21);
                    }
                    Function0 function3 = (Function0) objT21;
                    boolean z21 = (i11 == 256) | (i12 == 32);
                    Object objT22 = x340Var36.T();
                    if (z21 || objT22 == m4cVar4) {
                        objT22 = new hvi(iu30Var16, dhyVar, (byte) 2);
                        x340Var36.s0(objT22);
                    }
                    Function0 function4 = (Function0) objT22;
                    boolean z22 = (i11 == 256) | (i12 == 32);
                    Object objT23 = x340Var36.T();
                    if (z22 || objT23 == m4cVar4) {
                        objT23 = new hvi(iu30Var16, dhyVar, (byte) 3);
                        x340Var36.s0(objT23);
                    }
                    lro1.h(n6c0Var, function2, function3, function4, (Function0) objT23, x340Var36, 0);
                } else {
                    x340Var36.b0();
                }
                return rih1Var;
            case 21:
                qec0 qec0Var = (qec0) obj2;
                iu30 iu30Var17 = (iu30) obj3;
                x340 x340Var37 = (b0k) obj4;
                int iIntValue16 = ((Number) obj5).intValue();
                crb crbVar = qec0Var.b;
                if ((((iIntValue16 & 896) ^ 384) <= 256 || !x340Var37.g(iu30Var17)) && (iIntValue16 & 384) != 256) {
                    z = false;
                }
                x340 x340Var38 = x340Var37;
                boolean zI2 = x340Var38.i(qec0Var) | z;
                Object objT24 = x340Var38.T();
                if (zI2 || objT24 == fkj0.X) {
                    objT24 = new dfi(iu30Var17, qec0Var, (byte) 13);
                    x340Var38.s0(objT24);
                }
                vqb.a(crbVar, null, false, null, (Function0) objT24, x340Var38, 0, 7);
                return rih1Var;
            case 22:
                return a(obj, obj2, obj3, obj4, obj5);
            case 23:
                return d(obj, obj2, obj3, obj4, obj5);
            case 24:
                return e(obj, obj2, obj3, obj4, obj5);
            case 25:
                return f(obj, obj2, obj3, obj4, obj5);
            case 26:
                return g(obj, obj2, obj3, obj4, obj5);
            case 27:
                return h(obj, obj2, obj3, obj4, obj5);
            case 28:
                return i(obj, obj2, obj3, obj4, obj5);
            default:
                khd0 khd0Var = (khd0) obj2;
                iu30 iu30Var18 = (iu30) obj3;
                x340 x340Var39 = (b0k) obj4;
                int iIntValue17 = ((Number) obj5).intValue();
                if ((iIntValue17 & 48) == 0) {
                    i4 = iIntValue17 | (x340Var39.g(khd0Var) ? 32 : 16);
                } else {
                    i4 = iIntValue17;
                }
                if ((iIntValue17 & 384) == 0) {
                    i4 |= x340Var39.i(iu30Var18) ? 256 : 128;
                }
                x340 x340Var40 = x340Var39;
                if (x340Var40.Y(i4 & 1, (i4 & 1169) != 1168)) {
                    String strO1 = cwl1.o0(x340Var40, 2131958111);
                    String strO2 = cwl1.o0(x340Var40, 2131958110);
                    boolean z23 = khd0Var.a;
                    z = (i4 & 896) == 256;
                    Object objT25 = x340Var40.T();
                    if (z || objT25 == fkj0.X) {
                        objT25 = new cci(iu30Var18, (byte) 25);
                        x340Var40.s0(objT25);
                    }
                    zxo1.a(strO1, strO2, null, z23, false, (iu30) objT25, x340Var40, 0, 20);
                } else {
                    x340Var40.b0();
                }
                return rih1Var;
        }
    }
}
