package p;

import android.content.res.Configuration;
import android.net.Uri;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.cast.framework.media.internal.ResourceProvider;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class iko1 {
    public static b180 a;

    public static final int A(lpb0 lpb0Var) {
        qqq0 qqq0Var = lpb0Var.r;
        List list = lpb0Var.n;
        boolean z = qqq0Var == qqq0.a;
        if (list.isEmpty()) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < list.size()) {
            mpb0 mpb0Var = (mpb0) list.get(i);
            int i4 = z ? mpb0Var.x : mpb0Var.y;
            if (i4 == -1) {
                i++;
            } else {
                int iMax = 0;
                while (i < list.size()) {
                    mpb0 mpb0Var2 = (mpb0) list.get(i);
                    if ((z ? mpb0Var2.x : mpb0Var2.y) != i4) {
                        break;
                    }
                    iMax = Math.max(iMax, (int) (z ? ((mpb0) list.get(i)).v & 4294967295L : ((mpb0) list.get(i)).v >> 32));
                    i++;
                }
                i2 += iMax;
                i3++;
            }
        }
        return (i2 / i3) + lpb0Var.t;
    }

    public static int B(String str) {
        try {
            Map map = ResourceProvider.a;
            Integer num = (Integer) ResourceProvider.class.getMethod("findResourceByName", String.class).invoke(null, str);
            if (num == null) {
                return 0;
            }
            return num.intValue();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return 0;
        }
    }

    public static boolean C(byte b) {
        return b > -65;
    }

    public static final void a(wo6 wo6Var, Function0 function0, Function0 function1, qim0 qim0Var, idn0 idn0Var, b0k b0kVar, int i) {
        int i2;
        Function0 function2;
        qim0 qim0Var2;
        idn0 idn0Var2;
        int i3;
        idn0 idn0Var3;
        qim0 qim0Var3;
        String str = wo6Var.b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1290433671);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(wo6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            function2 = function0;
            i2 |= x340Var.i(function2) ? 32 : 16;
        } else {
            function2 = function0;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function1) ? 256 : 128;
        }
        int i4 = i2 | 3072;
        if ((i & 24576) == 0) {
            i4 = i2 | 11264;
        }
        if (x340Var.Y(i4 & 1, (i4 & 9363) != 9362)) {
            x340Var.d0();
            int i5 = i & 1;
            qim0 qim0Var4 = nim0.a;
            if (i5 == 0 || x340Var.E()) {
                Object objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = ktd.n(x340Var);
                }
                i3 = i4 & (-57345);
                idn0Var3 = (idn0) objT;
                qim0Var3 = qim0Var4;
            } else {
                x340Var.b0();
                int i6 = i4 & (-57345);
                idn0Var3 = idn0Var;
                i3 = i6;
                qim0Var3 = qim0Var;
            }
            x340Var.s();
            ven0 ven0VarM = k1u.m(idn0Var3, x340Var, 0);
            int i7 = i3;
            tob1 tob1VarB = z95.b(((Boolean) ven0VarM.getValue()).booleanValue() ? 0.97f : 1.0f, (fe5) null, "scale", (iu30) null, x340Var, 3072, 22);
            tob1 tob1VarB2 = z95.b(((Boolean) ven0VarM.getValue()).booleanValue() ? 0.8f : 1.0f, (fe5) null, "alpha", (iu30) null, x340Var, 3072, 22);
            qim0 qim0VarV = u291.v(anm1.N("cardContainer", qim0Var3), zjy.j(200.0f, new p3v(((Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a)).screenWidthDp * 0.4f)).a);
            float fFloatValue = ((Number) tob1VarB.getValue()).floatValue();
            idn0 idn0Var4 = idn0Var3;
            qim0 qim0VarV2 = bin.v(d9y0.k(fj30.F(qim0VarV, fFloatValue, fFloatValue), ((Number) tob1VarB2.getValue()).floatValue()), idn0Var4, null, false, cwl1.n0(2131953451, new Object[]{str}, x340Var), null, function2, 20);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarV2);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            b(wo6Var.a, str, x340Var, 0);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(qim0Var4, 12.0f));
            c(str, x340Var, 0);
            cvx cvxVar2 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(qim0Var4, 4.0f));
            e(i7 & 896, wo6Var.c, str, function1, x340Var);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
            idn0Var2 = idn0Var4;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            idn0Var2 = idn0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hy0(wo6Var, function0, function1, qim0Var2, idn0Var2, i, (byte) 9);
        }
    }

    public static final void b(String str, String str2, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-388457006);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.g(str2) ? 32 : 16);
        byte b = 0;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            cwl1.b(xcg1.k(cbx.a, u291.f(nim0.a, 1.0f)), (tl3) null, er31.a, (pgx) null, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(-886159863, new xo6(str2, str, b), x340Var), x340Var, 0, 48, 2026);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b4((byte) 3, i, str, str2);
        }
    }

    public static final void c(String str, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-139235071);
        int i2 = i | (x340Var.g(str) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarN = anm1.N("artistName", nim0.a);
            cjc0 cjc0Var = new cjc0(1);
            uwr uwrVar = cbx.a;
            uwo1.e(str, qim0VarN, cbx.d(x340Var).k, cbx.a(x340Var).b.a, null, null, 2, false, cjc0Var, 0, null, x340Var, i2 & 14, 0, 1712);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nl(str, i, (byte) 20);
        }
    }

    public static final void d(String str, String str2, b0k b0kVar, int i) {
        String str3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(372283037);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.e, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            era eraVar = een.Q0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, nim0Var);
            mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarZ);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            uwo1.e(str, null, kk0.p(nim0Var, 200.0f, x340Var, x340Var).f, cbx.a(x340Var).b.a, new a0e1(3), null, 0, false, null, 0, null, x340Var, i2 & 14, 0, 2018);
            str3 = str2;
            uwo1.e(str3, null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var, (i2 >> 3) & 14, 0, 2018);
            x340Var.r(true);
            x340Var.r(true);
        } else {
            str3 = str2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b4((byte) 7, i, str, str3);
        }
    }

    public static final void e(int i, String str, String str2, Function0 function0, b0k b0kVar) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1518927785);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function0) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarN = anm1.N("artistFollowButton", nim0.a);
            String strN0 = cwl1.n0(2131956073, new Object[]{str2}, x340Var);
            if (ihc1.y0(strN0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            foo1.g(new gbx(new y50(strN0), function0), qim0VarN, null, yla.s(x340Var), null, null, null, apo.r(1042355165, new nl(str, (byte) 21), x340Var), x340Var, 12582912, 116);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yo6(str, str2, function0, i);
        }
    }

    public static final void f(Uri uri, int i, qim0 qim0Var, String str, b0k b0kVar, int i2) {
        String str2;
        qim0 qim0Var2;
        h6m h6mVar = mif1.Q0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2105629599);
        int i3 = (x340Var.g(uri) ? 4 : 2) | i2 | (x340Var.e(i) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128) | (x340Var.g(str) ? 2048 : 1024) | (x340Var.i(h6mVar) ? 16384 : 8192) | 196608;
        if (x340Var.Y(i3 & 1, (74899 & i3) != 74898)) {
            x340Var.d0();
            if ((i2 & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            gw70 gw70Var = (gw70) x340Var.k(oi7.a);
            boolean zG = ((i3 & 14) == 4) | x340Var.g(gw70Var) | ((i3 & 112) == 32);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                ixg ixgVarB = gw70Var.b(uri);
                ixgVarB.p(i, i, 1);
                objT = new mmr0(ixgVarB.a(), ixgVarB.a);
                x340Var.s0(objT);
            }
            mmr0 mmr0Var = (mmr0) objT;
            dm5.d((zy70) mmr0Var.a, str, (rf01) mmr0Var.b, qim0Var, h6mVar, x340Var, ((i3 >> 6) & 112) | ((i3 << 3) & 7168) | ((i3 << 9) & 29360128), 0, 3952);
            str2 = str;
            qim0Var2 = qim0Var;
        } else {
            str2 = str;
            qim0Var2 = qim0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ze10(uri, i, qim0Var2, str2, i2);
        }
    }

    public static final void g(b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(947872626);
        if (b0kVar3.Y(i & 1, i != 0)) {
            b0kVar2 = b0kVar3;
            jto1.b(anm1.N("mixing_row_loading", u291.f(nim0.a, 1.0f)), new uvx((pgx) null, 3, (tvx) null, (p3v) null, 26), null, false, null, null, null, null, null, qni.a, null, qni.b, null, null, null, qni.c, b0kVar2, 805306438, 196656, 30204);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new htu(i, (byte) 19);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:104:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:106:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:109:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0091  */
    /* JADX WARN: Code duplicated, block: B:51:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:71:0x0146  */
    /* JADX WARN: Code duplicated, block: B:72:0x0148  */
    /* JADX WARN: Code duplicated, block: B:75:0x0151  */
    /* JADX WARN: Code duplicated, block: B:76:0x0153  */
    /* JADX WARN: Code duplicated, block: B:80:0x015d  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:84:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:87:0x020e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0212  */
    public static final void h(String str, String str2, qim0 qim0Var, boolean z, Function0 function0, Function0 function1, String str3, b0k b0kVar, int i, int i2) {
        int i3;
        Function0 function2;
        int i4;
        String str4;
        int i5;
        boolean z2;
        x340 x340Var;
        qim0 qim0Var2;
        String str5;
        Function0 function3;
        h311 h311VarV;
        cvx cvxVar;
        mbh mbhVarA;
        int i6;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0Var3;
        qim0 qim0VarE;
        boolean z3;
        n4k n4kVar;
        Function0 function4;
        boolean z4;
        boolean z5;
        boolean z6;
        Object objT;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1245917525);
        j06 j06Var = x340Var2.a;
        if ((i & 6) == 0) {
            i3 = (x340Var2.g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var2.g(str2) ? 32 : 16;
        }
        int i7 = i3 | 384;
        if ((i & 3072) == 0) {
            i7 |= x340Var2.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i7 |= x340Var2.i(function0) ? 16384 : 8192;
        }
        int i8 = i2 & 32;
        if (i8 == 0) {
            if ((196608 & i) == 0) {
                function2 = function1;
                i7 |= x340Var2.i(function2) ? 131072 : 65536;
            }
            i4 = i2 & 64;
            if (i4 != 0) {
                i7 |= 1572864;
                str4 = str3;
            } else {
                str4 = str3;
                if ((i & 1572864) == 0) {
                    if (x340Var2.g(str4)) {
                        i5 = 1048576;
                    } else {
                        i5 = 524288;
                    }
                    i7 |= i5;
                }
            }
            if ((i7 & 599187) != 599186) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var2.Y(i7 & 1, z2)) {
                if (i8 != 0) {
                    function2 = null;
                }
                if (i4 != 0) {
                    str4 = null;
                }
                uwr uwrVar = cbx.a;
                cvxVar = cbx.b(x340Var2).b;
                mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
                i6 = i7;
                iHashCode = Long.hashCode(x340Var2.T);
                xos0VarM = x340Var2.m();
                qim0Var3 = nim0.a;
                qim0VarE = zr7.E(x340Var2, qim0Var3);
                hzj.A.getClass();
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                z3 = x340Var2.S;
                n4kVar = hmb0.t1;
                if (z3) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(mbhVarA, x340Var2, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var2, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var2, lljVar3);
                nko1.F(x340Var2);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var2, lljVar4);
                pf50 pf50Var = new pf50(4);
                qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
                function4 = function2;
                d36 d36Var = new d36(2.0f, true, new um5(false));
                String str6 = str4;
                d36 d36Var2 = new d36(2.0f, true, new um5(false));
                if ((i6 & 7168) == 2048) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if ((57344 & i6) == 16384) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = z4 | z5;
                objT = x340Var2.T();
                if (z6 || objT == m4cVar) {
                    objT = new zt2(z, function0, (byte) 6);
                    x340Var2.s0(objT);
                }
                dko1.g(pf50Var, qim0VarF, null, null, d36Var2, d36Var, null, false, null, (iu30) objT, x340Var2, 100663344, 668);
                qim0 qim0VarZ = uyn1.z(0.0f, cvxVar.a, 1, u291.f(qim0Var3, 1.0f));
                era eraVar = een.Q0;
                mbh mbhVarA2 = jbh.a(new d36(16.0f, true, new um5(false)), eraVar, x340Var2, 48);
                int iHashCode2 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM2 = x340Var2.m();
                qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarZ);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(mbhVarA2, x340Var2, lljVar);
                nko1.H(xos0VarM2, x340Var2, lljVar2);
                x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                nko1.H(qim0VarE2, x340Var2, lljVar4);
                mbh mbhVarA3 = jbh.a(new d36(8.0f, true, new um5(false)), eraVar, x340Var2, 48);
                int iHashCode3 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM3 = x340Var2.m();
                qim0 qim0VarE3 = zr7.E(x340Var2, qim0Var3);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(mbhVarA3, x340Var2, lljVar);
                nko1.H(xos0VarM3, x340Var2, lljVar2);
                x0d.q(iHashCode3, x340Var2, lljVar3, x340Var2);
                nko1.H(qim0VarE3, x340Var2, lljVar4);
                uwo1.e(str, null, cbx.d(x340Var2).e, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var2, i6 & 14, 0, 2026);
                uwo1.e(str2, null, cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var2, (i6 >> 3) & 14, 0, 2018);
                x340Var = x340Var2;
                x340Var.r(true);
                if (function4 != null || str6 == null) {
                    x340Var.i0(1507976035);
                    x340Var.r(false);
                } else {
                    x340Var.i0(1507709838);
                    boolean z7 = (i6 & 458752) == 131072;
                    Object objT2 = x340Var.T();
                    if (z7 || objT2 == m4cVar) {
                        objT2 = new tze0(function4, (byte) 21);
                        x340Var.s0(objT2);
                    }
                    foo1.c(new gbx(z50.c, (Function0) objT2), new idx(), null, null, yla.s(x340Var), null, null, null, null, null, apo.r(-1143485531, new y5d0(str6, (byte) 22), x340Var), x340Var, 0, 48, 2012);
                    x340Var = x340Var;
                    x340Var.r(false);
                }
                x340Var.r(true);
                x340Var.r(true);
                function3 = function4;
                str5 = str6;
                qim0Var2 = qim0Var3;
            } else {
                x340Var = x340Var2;
                x340Var.b0();
                qim0Var2 = qim0Var;
                str5 = str4;
                function3 = function2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new zc5(str, str2, qim0Var2, z, function0, function3, str5, i, i2);
            }
        }
        i7 |= 196608;
        function2 = function1;
        i4 = i2 & 64;
        if (i4 != 0) {
            i7 |= 1572864;
            str4 = str3;
        } else {
            str4 = str3;
            if ((i & 1572864) == 0) {
                if (x340Var2.g(str4)) {
                    i5 = 1048576;
                } else {
                    i5 = 524288;
                }
                i7 |= i5;
            }
        }
        if ((i7 & 599187) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (x340Var2.Y(i7 & 1, z2)) {
            if (i8 != 0) {
                function2 = null;
            }
            if (i4 != 0) {
                str4 = null;
            }
            uwr uwrVar2 = cbx.a;
            cvxVar = cbx.b(x340Var2).b;
            mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            i6 = i7;
            iHashCode = Long.hashCode(x340Var2.T);
            xos0VarM = x340Var2.m();
            qim0Var3 = nim0.a;
            qim0VarE = zr7.E(x340Var2, qim0Var3);
            hzj.A.getClass();
            if (j06Var != null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            z3 = x340Var2.S;
            n4kVar = hmb0.t1;
            if (z3) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar5 = y580.O0;
            nko1.H(mbhVarA, x340Var2, lljVar5);
            llj lljVar6 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar6);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            llj lljVar7 = y580.R0;
            nko1.H(numValueOf2, x340Var2, lljVar7);
            nko1.F(x340Var2);
            llj lljVar8 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar8);
            pf50 pf50Var2 = new pf50(4);
            qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
            function4 = function2;
            d36 d36Var3 = new d36(2.0f, true, new um5(false));
            String str7 = str4;
            d36 d36Var4 = new d36(2.0f, true, new um5(false));
            if ((i6 & 7168) == 2048) {
                z4 = true;
            } else {
                z4 = false;
            }
            if ((57344 & i6) == 16384) {
                z5 = true;
            } else {
                z5 = false;
            }
            z6 = z4 | z5;
            objT = x340Var2.T();
            if (z6) {
                objT = new zt2(z, function0, (byte) 6);
                x340Var2.s0(objT);
            } else {
                objT = new zt2(z, function0, (byte) 6);
                x340Var2.s0(objT);
            }
            dko1.g(pf50Var2, qim0VarF2, null, null, d36Var4, d36Var3, null, false, null, (iu30) objT, x340Var2, 100663344, 668);
            qim0 qim0VarZ2 = uyn1.z(0.0f, cvxVar.a, 1, u291.f(qim0Var3, 1.0f));
            era eraVar2 = een.Q0;
            mbh mbhVarA4 = jbh.a(new d36(16.0f, true, new um5(false)), eraVar2, x340Var2, 48);
            int iHashCode4 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM4 = x340Var2.m();
            qim0 qim0VarE4 = zr7.E(x340Var2, qim0VarZ2);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA4, x340Var2, lljVar5);
            nko1.H(xos0VarM4, x340Var2, lljVar6);
            x0d.q(iHashCode4, x340Var2, lljVar7, x340Var2);
            nko1.H(qim0VarE4, x340Var2, lljVar8);
            mbh mbhVarA5 = jbh.a(new d36(8.0f, true, new um5(false)), eraVar2, x340Var2, 48);
            int iHashCode5 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM5 = x340Var2.m();
            qim0 qim0VarE5 = zr7.E(x340Var2, qim0Var3);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA5, x340Var2, lljVar5);
            nko1.H(xos0VarM5, x340Var2, lljVar6);
            x0d.q(iHashCode5, x340Var2, lljVar7, x340Var2);
            nko1.H(qim0VarE5, x340Var2, lljVar8);
            uwo1.e(str, null, cbx.d(x340Var2).e, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var2, i6 & 14, 0, 2026);
            uwo1.e(str2, null, cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var2, (i6 >> 3) & 14, 0, 2018);
            x340Var = x340Var2;
            x340Var.r(true);
            if (function4 != null) {
                x340Var.i0(1507976035);
                x340Var.r(false);
            } else {
                x340Var.i0(1507976035);
                x340Var.r(false);
            }
            x340Var.r(true);
            x340Var.r(true);
            function3 = function4;
            str5 = str7;
            qim0Var2 = qim0Var3;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
            str5 = str4;
            function3 = function2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zc5(str, str2, qim0Var2, z, function0, function3, str5, i, i2);
        }
    }

    public static final void i(mya0 mya0Var, int i, int i2, String str, shg1 shg1Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i3) {
        int i4;
        int i5;
        int i6;
        iu30 iu30Var2;
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(2106224423);
        if ((i3 & 6) == 0) {
            i4 = (b0kVar3.i(mya0Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 = i;
            i4 |= b0kVar3.e(i5) ? 32 : 16;
        } else {
            i5 = i;
        }
        if ((i3 & 384) == 0) {
            i6 = i2;
            i4 |= b0kVar3.e(i6) ? 256 : 128;
        } else {
            i6 = i2;
        }
        if ((i3 & 3072) == 0) {
            i4 |= b0kVar3.g(str) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= (32768 & i3) == 0 ? b0kVar3.g(shg1Var) : b0kVar3.i(shg1Var) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            iu30Var2 = iu30Var;
            i4 |= b0kVar3.i(iu30Var2) ? 131072 : 65536;
        } else {
            iu30Var2 = iu30Var;
        }
        int i7 = i4 | 1572864;
        if (b0kVar3.Y(i7 & 1, (599187 & i7) != 599186)) {
            k2t0 k2t0VarV = kkn.v(ti5.g(b0kVar3), b0kVar3);
            es41 es41VarC = l6o1.C(0, 0, 1, b0kVar3);
            j2t0 j2t0Var = k2t0VarV.c;
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            cgj1.n(bmq0.L(qim0Var3, j2t0Var, (g6o0) null), apo.r(79003627, new hk2(i5, i6, (Object) shg1Var, (cv30) iu30Var2, (byte) 13), b0kVar3), (vu30) null, (vu30) null, (vu30) null, 0, 0L, 0L, (erl1) null, apo.r(-1325485130, new tya0(es41VarC, mya0Var, shg1Var, iu30Var, str), b0kVar3), b0kVar2, 805306416, 508);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new n3m(mya0Var, i, i2, str, shg1Var, iu30Var, qim0Var2, i3);
        }
    }

    public static final void j(int i, b0k b0kVar, qim0 qim0Var, boolean z) {
        qim0 qim0VarF;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(737455990);
        int i2 = i | 6 | (x340Var.h(z) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0Var = nim0.a;
            if (z) {
                x340Var.i0(793799456);
                uwr uwrVar = cbx.a;
                qim0VarF = dug.e(qim0Var, v9c.s(p7h.M(new u7h[]{new u7h(cbx.a(x340Var).a.b.a()), new u7h(cbx.a(x340Var).a.a.a())}), 0.0f, 0.0f, 14), null, 0.0f, 6);
                x340Var.r(false);
            } else {
                x340Var.i0(794003963);
                uwr uwrVar2 = cbx.a;
                qim0VarF = dug.f(qim0Var, cbx.a(x340Var).a.b.a(), d4o1.a);
                x340Var.r(false);
            }
            qim0 qim0VarR = d7e.r(1.0f, u291.f(qim0Var, 1.0f), false);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = zdh0.X0;
                x340Var.s0(objT);
            }
            t1c.a(s161.a(qim0VarR, (iu30) objT).then(qim0VarF), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uc0(qim0Var, z, i, (byte) 23);
        }
    }

    public static final void k(egc1 egc1Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(229853546);
        int i2 = i | (x340Var.g(egc1Var) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = axb1.b1;
                x340Var.s0(objT);
            }
            nim0 nim0Var = nim0.a;
            qim0 qim0VarN = anm1.N("streaming-quality-test-tag", s161.b(nim0Var, true, (iu30) objT));
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            String strO0 = cwl1.o0(x340Var, 2131957764);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).j;
            long j = cbx.a(x340Var).b.b;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            cvx cvxVar3 = cbx.b(x340Var).b;
            uwo1.e(strO0, uyn1.B(nim0Var, 16.0f, 16.0f, 16.0f, 0.0f, 8), lee1Var, j, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
            int i3 = egc1Var.b;
            swa swaVar = egc1Var.c;
            String strO1 = cwl1.o0(x340Var, i3);
            lee1 lee1Var2 = cbx.d(x340Var).c;
            long j2 = cbx.a(x340Var).b.c;
            cvx cvxVar4 = cbx.b(x340Var).b;
            cvx cvxVar5 = cbx.b(x340Var).b;
            cvx cvxVar6 = cbx.b(x340Var).b;
            uwo1.e(strO1, uyn1.B(nim0Var, 16.0f, 2.0f, 16.0f, 0.0f, 8), lee1Var2, j2, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
            x340Var.r(true);
            if (swaVar instanceof swa) {
                x340Var.i0(1390162121);
                String strO2 = cwl1.o0(x340Var, swaVar.i);
                lee1 lee1Var3 = cbx.d(x340Var).j;
                long j3 = cbx.a(x340Var).b.c;
                cvx cvxVar7 = cbx.b(x340Var).b;
                cvx cvxVar8 = cbx.b(x340Var).b;
                cvx cvxVar9 = cbx.b(x340Var).b;
                uwo1.e(strO2, anm1.N("bitrate-test-tag", uyn1.B(nim0Var, 16.0f, 2.0f, 16.0f, 0.0f, 8)), lee1Var3, j3, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
                x340Var.r(false);
            } else {
                x340Var.i0(1390580280);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wh91(egc1Var, i, (byte) 29);
        }
    }

    public static final void l(j2i j2iVar, String str, qim0 qim0Var, boolean z, String str2, lax laxVar, gbx gbxVar, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        qim0 qim0VarQ;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1048113910);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(j2iVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.g(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.g(str2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= (262144 & i) == 0 ? b0kVar3.g(laxVar) : b0kVar3.i(laxVar) ? 131072 : 65536;
        }
        int i3 = i2 | 1572864;
        if ((12582912 & i) == 0) {
            i3 |= b0kVar3.g(gbxVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= b0kVar3.i(iu30Var) ? 67108864 : 33554432;
        }
        if (b0kVar3.Y(i3 & 1, (38347923 & i3) != 38347922)) {
            b0kVar3.d0();
            if ((i & 1) != 0 && !b0kVar3.E()) {
                b0kVar3.b0();
            }
            b0kVar3.s();
            qim0 qim0VarB = u291.b(0.0f, 70.0f, 1, u291.d(qim0Var, 1.0f));
            qim0 qim0Var2 = nim0.a;
            if (iu30Var == null) {
                b0kVar3.i0(-50243065);
                b0kVar3.r(false);
                qim0VarQ = null;
            } else {
                b0kVar3.i0(-50243064);
                boolean zG = b0kVar3.g(iu30Var);
                Object objT = b0kVar3.T();
                if (zG || objT == m4cVar) {
                    objT = new ppv0(iu30Var, (byte) 20);
                    b0kVar3.s0(objT);
                }
                qim0VarQ = m0p1.q(qim0Var2, laxVar, (iu30) objT);
                b0kVar3.r(false);
            }
            if (qim0VarQ != null) {
                qim0Var2 = qim0VarQ;
            }
            qim0 qim0VarThen = qim0VarB.then(qim0Var2);
            int i4 = i3;
            gra graVar = een.h;
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(b0kVar3).f;
            cr31 cr31VarB = er31.b(8.0f);
            boolean z2 = (3670016 & i4) == 1048576;
            Object objT2 = b0kVar3.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new xgr0((byte) 24, 2, false);
                b0kVar3.s0(objT2);
            }
            b0kVar2 = b0kVar3;
            cwl1.b(qim0VarThen, graVar, cr31VarB, new kgx(2, (vu30) objT2, (vu30) null, (vu30) null, 12), (vzq0) null, mmo1.z(laxVar, b0kVar3), false, (idn0) null, jtr.f, gbxVar, (gbx) null, apo.r(-1117433875, new tf(j2iVar, str, z, str2), b0kVar3), b0kVar2, (1879048192 & (i4 << 6)) | 100663344, 48, 1232);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new brf(j2iVar, str, qim0Var, z, str2, laxVar, gbxVar, iu30Var, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x008d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0093  */
    /* JADX WARN: Code duplicated, block: B:49:0x009b  */
    /* JADX WARN: Code duplicated, block: B:50:0x009e  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:63:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:79:0x0102  */
    /* JADX WARN: Code duplicated, block: B:81:0x0105  */
    /* JADX WARN: Code duplicated, block: B:84:0x010a  */
    /* JADX WARN: Code duplicated, block: B:87:0x010f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0114  */
    /* JADX WARN: Code duplicated, block: B:90:0x0119  */
    /* JADX WARN: Code duplicated, block: B:92:0x011c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0127  */
    /* JADX WARN: Code duplicated, block: B:95:0x016f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0180  */
    public static final void m(hux huxVar, String str, qim0 qim0Var, boolean z, String str2, lax laxVar, gbx gbxVar, iu30 iu30Var, b0k b0kVar, int i, int i2) {
        qim0 qim0Var2;
        int i3;
        boolean z2;
        int i4;
        String str3;
        int i5;
        lax laxVar2;
        int i6;
        int i7;
        gbx gbxVar2;
        int i8;
        int i9;
        int i10;
        iu30 iu30Var2;
        int i11;
        int i12;
        int i13;
        boolean z3;
        b0k b0kVar2;
        qim0 qim0Var3;
        boolean z4;
        String str4;
        lax laxVar3;
        gbx gbxVar3;
        iu30 iu30Var3;
        h311 h311VarV;
        qim0 qim0Var4;
        int i14;
        lax laxVar4;
        lax laxVar5;
        boolean z5;
        gbx gbxVar4;
        qim0 qim0Var5;
        int i15;
        String str5;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(865224769);
        int i16 = i | ((i & 8) == 0 ? b0kVar3.g(huxVar) : b0kVar3.i(huxVar) ? 4 : 2) | (b0kVar3.g(str) ? 32 : 16);
        int i17 = i2 & 4;
        if (i17 != 0) {
            i3 = i16 | 384;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i3 = i16 | (b0kVar3.g(qim0Var2) ? 256 : 128);
        }
        int i18 = i2 & 8;
        if (i18 != 0) {
            i4 = i3 | 3072;
            z2 = z;
        } else {
            z2 = z;
            i4 = i3 | (b0kVar3.h(z2) ? 2048 : 1024);
        }
        int i19 = i2 & 16;
        if (i19 != 0) {
            i5 = i4 | 24576;
            str3 = str2;
        } else {
            str3 = str2;
            i5 = i4 | (b0kVar3.g(str3) ? 16384 : 8192);
        }
        if ((i2 & 32) == 0) {
            laxVar2 = laxVar;
            int i20 = b0kVar3.g(laxVar2) ? 131072 : 65536;
            i6 = i5 | i20;
            i7 = i2 & 64;
            if (i7 != 0) {
                i9 = i6 | 1572864;
                gbxVar2 = gbxVar;
            } else {
                gbxVar2 = gbxVar;
                if (b0kVar3.g(gbxVar2)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i9 = i6 | i8;
            }
            i10 = i2 & 128;
            if (i10 != 0) {
                i12 = i9 | 12582912;
                iu30Var2 = iu30Var;
            } else {
                iu30Var2 = iu30Var;
                if (b0kVar3.i(iu30Var2)) {
                    i11 = 8388608;
                } else {
                    i11 = 4194304;
                }
                i12 = i9 | i11;
            }
            i13 = i12;
            if ((i13 & 4793491) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (b0kVar3.Y(i13 & 1, z3)) {
                b0kVar3.d0();
                if ((i & 1) != 0 || b0kVar3.E()) {
                    if (i17 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i18 != 0) {
                        z2 = false;
                    }
                    if (i19 != 0) {
                        str3 = null;
                    }
                    if ((i2 & 32) != 0) {
                        i14 = i13 & (-458753);
                        laxVar4 = iax.a;
                    } else {
                        i14 = i13;
                        laxVar4 = laxVar2;
                    }
                    if (i7 != 0) {
                        gbxVar2 = null;
                    }
                    if (i10 != 0) {
                        iu30Var2 = null;
                        laxVar5 = laxVar4;
                        z5 = z2;
                        str5 = str3;
                        gbxVar4 = gbxVar2;
                        qim0Var5 = qim0Var4;
                        i15 = i14;
                    } else {
                        laxVar5 = laxVar4;
                        z5 = z2;
                        gbxVar4 = gbxVar2;
                        qim0Var5 = qim0Var4;
                        i15 = i14;
                    }
                    b0kVar3.s();
                    int i21 = (i15 & 112) | 6 | (i15 & 896) | (i15 & 7168) | (57344 & i15) | (458752 & i15);
                    int i22 = i15 << 3;
                    b0kVar2 = b0kVar3;
                    l(apo.r(-576191427, new kf2((Object) huxVar, z5, (byte) 18), b0kVar3), str, qim0Var5, z5, str5, laxVar5, gbxVar4, iu30Var2, b0kVar2, i21 | (29360128 & i22) | (i22 & 234881024));
                    qim0Var3 = qim0Var5;
                    z4 = z5;
                    str4 = str5;
                    laxVar3 = laxVar5;
                    gbxVar3 = gbxVar4;
                    iu30Var3 = iu30Var2;
                } else {
                    b0kVar3.b0();
                    i15 = (i2 & 32) != 0 ? i13 & (-458753) : i13;
                    z5 = z2;
                    laxVar5 = laxVar2;
                    gbxVar4 = gbxVar2;
                    qim0Var5 = qim0Var2;
                }
                str5 = str3;
                b0kVar3.s();
                int i23 = (i15 & 112) | 6 | (i15 & 896) | (i15 & 7168) | (57344 & i15) | (458752 & i15);
                int i24 = i15 << 3;
                b0kVar2 = b0kVar3;
                l(apo.r(-576191427, new kf2((Object) huxVar, z5, (byte) 18), b0kVar3), str, qim0Var5, z5, str5, laxVar5, gbxVar4, iu30Var2, b0kVar2, i23 | (29360128 & i24) | (i24 & 234881024));
                qim0Var3 = qim0Var5;
                z4 = z5;
                str4 = str5;
                laxVar3 = laxVar5;
                gbxVar3 = gbxVar4;
                iu30Var3 = iu30Var2;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var3 = qim0Var2;
                z4 = z2;
                str4 = str3;
                laxVar3 = laxVar2;
                gbxVar3 = gbxVar2;
                iu30Var3 = iu30Var2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new fez0(huxVar, str, qim0Var3, z4, str4, laxVar3, gbxVar3, iu30Var3, i, i2);
            }
        }
        laxVar2 = laxVar;
        i6 = i5 | i20;
        i7 = i2 & 64;
        if (i7 != 0) {
            i9 = i6 | 1572864;
            gbxVar2 = gbxVar;
        } else {
            gbxVar2 = gbxVar;
            if (b0kVar3.g(gbxVar2)) {
                i8 = 1048576;
            } else {
                i8 = 524288;
            }
            i9 = i6 | i8;
        }
        i10 = i2 & 128;
        if (i10 != 0) {
            i12 = i9 | 12582912;
            iu30Var2 = iu30Var;
        } else {
            iu30Var2 = iu30Var;
            if (b0kVar3.i(iu30Var2)) {
                i11 = 8388608;
            } else {
                i11 = 4194304;
            }
            i12 = i9 | i11;
        }
        i13 = i12;
        if ((i13 & 4793491) != 4793490) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (b0kVar3.Y(i13 & 1, z3)) {
            b0kVar3.d0();
            if ((i & 1) != 0) {
                if (i17 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (i18 != 0) {
                    z2 = false;
                }
                if (i19 != 0) {
                    str3 = null;
                }
                if ((i2 & 32) != 0) {
                    i14 = i13 & (-458753);
                    laxVar4 = iax.a;
                } else {
                    i14 = i13;
                    laxVar4 = laxVar2;
                }
                if (i7 != 0) {
                    gbxVar2 = null;
                }
                if (i10 != 0) {
                    iu30Var2 = null;
                    laxVar5 = laxVar4;
                    z5 = z2;
                    str5 = str3;
                    gbxVar4 = gbxVar2;
                    qim0Var5 = qim0Var4;
                    i15 = i14;
                } else {
                    laxVar5 = laxVar4;
                    z5 = z2;
                    gbxVar4 = gbxVar2;
                    qim0Var5 = qim0Var4;
                    i15 = i14;
                    str5 = str3;
                }
            } else {
                if (i17 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (i18 != 0) {
                    z2 = false;
                }
                if (i19 != 0) {
                    str3 = null;
                }
                if ((i2 & 32) != 0) {
                    i14 = i13 & (-458753);
                    laxVar4 = iax.a;
                } else {
                    i14 = i13;
                    laxVar4 = laxVar2;
                }
                if (i7 != 0) {
                    gbxVar2 = null;
                }
                if (i10 != 0) {
                    iu30Var2 = null;
                    laxVar5 = laxVar4;
                    z5 = z2;
                    str5 = str3;
                    gbxVar4 = gbxVar2;
                    qim0Var5 = qim0Var4;
                    i15 = i14;
                } else {
                    laxVar5 = laxVar4;
                    z5 = z2;
                    gbxVar4 = gbxVar2;
                    qim0Var5 = qim0Var4;
                    i15 = i14;
                    str5 = str3;
                }
            }
            b0kVar3.s();
            int i25 = (i15 & 112) | 6 | (i15 & 896) | (i15 & 7168) | (57344 & i15) | (458752 & i15);
            int i26 = i15 << 3;
            b0kVar2 = b0kVar3;
            l(apo.r(-576191427, new kf2((Object) huxVar, z5, (byte) 18), b0kVar3), str, qim0Var5, z5, str5, laxVar5, gbxVar4, iu30Var2, b0kVar2, i25 | (29360128 & i26) | (i26 & 234881024));
            qim0Var3 = qim0Var5;
            z4 = z5;
            str4 = str5;
            laxVar3 = laxVar5;
            gbxVar3 = gbxVar4;
            iu30Var3 = iu30Var2;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var3 = qim0Var2;
            z4 = z2;
            str4 = str3;
            laxVar3 = laxVar2;
            gbxVar3 = gbxVar2;
            iu30Var3 = iu30Var2;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new fez0(huxVar, str, qim0Var3, z4, str4, laxVar3, gbxVar3, iu30Var3, i, i2);
        }
    }

    public static final void n(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-709587036);
        int i2 = (b0kVar3.i(function0) ? 4 : 2) | i | (b0kVar3.i(qim0Var) ? 32 : 16);
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarX = bin.x(u291.f(qim0Var, 1.0f), false, null, null, null, function0, 15);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarX);
            hzj.A.getClass();
            if (((x340) b0kVar3).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(hmb0.t1);
            } else {
                b0kVar3.v0();
            }
            nko1.H(jw31VarA, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            knx knxVar = knx.c;
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(b0kVar3).g;
            nim0 nim0Var = nim0.a;
            w0h1.a(knxVar, isl.a, u291.r(nim0Var, 16.0f), 0L, 0L, false, b0kVar3, knx.d | 48, 56);
            b0kVar2 = b0kVar3;
            String strO0 = cwl1.o0(b0kVar2, 2131957765);
            cvx cvxVar = cbx.b(b0kVar2).b;
            uwo1.e(strO0, uyn1.B(nim0Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), cbx.d(b0kVar2).j, 0L, null, null, 0, false, null, 0, null, b0kVar2, 0, 0, 2040);
            b0kVar2.r(true);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new t531(function0, qim0Var, i, (byte) 9);
        }
    }

    public static final void o(p3v p3vVar, float f, float f2, b0k b0kVar, int i, int i2) {
        float f3;
        int i3;
        float f4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(391187282);
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 = i | 384;
            f3 = f2;
        } else if ((i & 384) == 0) {
            f3 = f2;
            i3 = (x340Var.d(f3) ? 256 : 128) | i;
        } else {
            f3 = f2;
            i3 = i;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            f4 = i4 != 0 ? 0.0f : f3;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarN = anm1.N("mixing_row_shimmer_box", uyn1.B(u291.h(p3vVar != null ? u291.v(nim0Var, p3vVar.a) : u291.f(nim0Var, 1.0f), f), 0.0f, f4, 0.0f, 0.0f, 13));
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.b.a();
            cua cuaVar = cbx.b(x340Var).f;
            t1c.a(cwl1.l0(dug.f(qim0VarN, jA, er31.b(4.0f)), 0L, (hw61) null, 15), x340Var, 0);
        } else {
            x340Var.b0();
            f4 = f3;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xt00(p3vVar, f, f4, i, i2, (byte) 0);
        }
    }

    public static final void p(egc1 egc1Var, Function0 function0, j2i j2iVar, qim0 qim0Var, j2i j2iVar2, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1870231668);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(egc1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(j2iVar) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= x340Var.i(j2iVar2) ? 16384 : 8192;
        }
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            nyx.a(2, (wux) null, apo.r(906533279, new gh61(egc1Var, j2iVar, j2iVar2, function0), x340Var), x340Var, 3078, 6);
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ay71(egc1Var, function0, j2iVar, false, qim0Var2, j2iVar2, i, (byte) 7);
        }
    }

    public static final qim0 q(qim0 qim0Var, vu30 vu30Var) {
        return qim0Var.then(new gk1(vu30Var));
    }

    public static zpi0 r(String str, Iterable iterable) {
        zbe zbeVar;
        zh91 zh91Var = new zh91();
        Iterator it = iterable.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            zbeVar = ypi0.b;
            if (!zHasNext) {
                break;
            }
            zbe zbeVar2 = (zpi0) it.next();
            if (zbeVar2 != zbeVar) {
                if (zbeVar2 instanceof zbe) {
                    zh91Var.addAll(f46.H(zbeVar2.c));
                } else {
                    zh91Var.add(zbeVar2);
                }
            }
        }
        int i = zh91Var.a;
        if (i != 0) {
            return i != 1 ? new zbe(str, (zpi0[]) zh91Var.toArray(new zpi0[0])) : (zpi0) zh91Var.get(0);
        }
        return zbeVar;
    }

    public static final boolean s(long j, long j2) {
        return j == j2;
    }

    public static final mvh1 t(jrr0 jrr0Var) {
        int iC = l1d.C(jrr0Var.a);
        if (iC == 0) {
            return hvh1.a;
        }
        if (iC == 1) {
            return new kvh1(jrr0Var.b);
        }
        if (iC == 2) {
            return jvh1.a;
        }
        if (iC == 3) {
            return ivh1.a;
        }
        eg.o();
        return null;
    }

    public static int u(long j) {
        return Long.hashCode(j);
    }

    public static final boolean v(b0k b0kVar) {
        long jA = ((crl1) ((x340) b0kVar).k(t4k.u)).a();
        return ((int) (jA >> 32)) < ((int) (jA & 4294967295L));
    }

    public static final long w(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final gt40 x(gt40 gt40Var, iu30 iu30Var) {
        n161 n161Var = new n161();
        iu30Var.invoke(n161Var);
        return gt40Var.c(new q161(n161Var));
    }

    public static final jrr0 y(mvh1 mvh1Var, bm41 bm41Var) {
        if (mvh1Var instanceof hvh1) {
            return new jrr0(1, 0, bm41Var);
        }
        if (mvh1Var instanceof kvh1) {
            return new jrr0(2, ((kvh1) mvh1Var).a, bm41Var);
        }
        if (mvh1Var instanceof jvh1) {
            return new jrr0(3, 0, bm41Var);
        }
        if (mvh1Var instanceof ivh1) {
            return new jrr0(4, 0, bm41Var);
        }
        eg.o();
        return null;
    }

    public static String z(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return Float.intBitsToFloat(i) == Float.intBitsToFloat(i2) ? f4i1.f("CornerRadius.circular(", yah0.z(Float.intBitsToFloat(i)), ")") : cy30.p("CornerRadius.elliptical(", yah0.z(Float.intBitsToFloat(i)), ", ", yah0.z(Float.intBitsToFloat(i2)), ")");
    }
}
