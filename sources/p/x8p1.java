package p;

import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Restrictions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class x8p1 {
    public static b180 a;
    public static b180 b;

    public static final void a(zl80 zl80Var, ul80 ul80Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        tgc1 tgc1Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(493747894);
        if ((i & 6) == 0) {
            i2 = (x340Var.e(zl80Var.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(ul80Var) : x340Var.i(ul80Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            x340Var.i0(2045329128);
            int iOrdinal = zl80Var.ordinal();
            if (iOrdinal == 0) {
                tgc1Var = new tgc1(2131963605, new Object[]{ul80Var.c, ul80Var.e});
            } else {
                if (iOrdinal != 1) {
                    eg.o();
                    return;
                }
                tgc1Var = new tgc1(2131963615, new Object[0]);
            }
            Object[] objArr = tgc1Var.b;
            String strN0 = cwl1.n0(tgc1Var.a, Arrays.copyOf(objArr, objArr.length), x340Var);
            x340Var.r(false);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(u291.h(qim0Var3, 100.0f), 1.0f);
            boolean zI = x340Var.i(ul80Var) | x340Var.g(strN0);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new fz40(ul80Var, strN0, (byte) 29);
                x340Var.s0(objT);
            }
            dm5.a((iu30) objT, qim0VarF, (iu30) null, x340Var, 0, 4);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bm80(zl80Var, ul80Var, qim0Var2, i, (byte) 0);
        }
    }

    public static final void b(dka dkaVar, qim0 qim0Var, Function0 function0, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        boolean z;
        vu30 vu30Var = y580.Y;
        llj lljVar = y580.R0;
        llj lljVar2 = y580.N0;
        llj lljVar3 = y580.O0;
        p60 p60Var = dkaVar.b;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1237327477);
        j06 j06Var = ((x340) b0kVar3).a;
        int i2 = ((i & 6) == 0 ? ((i & 8) == 0 ? b0kVar3.g(dkaVar) : b0kVar3.i(dkaVar) ? 4 : 2) | i : i) | 48;
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(function0) ? 256 : 128;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            long jA = cbx.a(b0kVar3).a.a.a();
            cr31 cr31VarB = er31.b(8.0f);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(dug.f(qim0Var3, jA, cr31VarB), 1.0f);
            era eraVar = een.P0;
            mbh mbhVarA = jbh.a(h36.c, eraVar, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            boolean z2 = ((x340) b0kVar3).S;
            Function0 function1 = hmb0.t1;
            if (z2) {
                b0kVar3.l(function1);
            } else {
                b0kVar3.v0();
            }
            nko1.H(mbhVarA, b0kVar3, lljVar3);
            nko1.H(xos0VarM, b0kVar3, lljVar2);
            x0d.q(iHashCode, b0kVar3, lljVar, b0kVar3);
            nko1.H(qim0VarE, b0kVar3, vu30Var);
            d36 d36Var = new d36(16.0f, true, new um5(false));
            qim0 qim0Var4 = qim0Var3;
            qim0 qim0VarY = uyn1.y(qim0Var4, 16.0f, 24.0f);
            mbh mbhVarA2 = jbh.a(d36Var, eraVar, b0kVar3, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM2 = b0kVar3.m();
            qim0 qim0VarE2 = zr7.E(b0kVar3, qim0VarY);
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(function1);
            } else {
                b0kVar3.v0();
            }
            nko1.H(mbhVarA2, b0kVar3, lljVar3);
            nko1.H(xos0VarM2, b0kVar3, lljVar2);
            x0d.q(iHashCode2, b0kVar3, lljVar, b0kVar3);
            nko1.H(qim0VarE2, b0kVar3, vu30Var);
            b0kVar3.i0(-981246297);
            for (p60 p60Var2 : dkaVar.a) {
                jw31 jw31VarA = ew31.a(new d36(12.0f, true, new um5(false)), een.N0, b0kVar3, 0);
                int iHashCode3 = Long.hashCode(((x340) b0kVar3).T);
                xos0 xos0VarM3 = b0kVar3.m();
                qim0 qim0VarE3 = zr7.E(b0kVar3, qim0Var4);
                hzj.A.getClass();
                b0kVar3.m0();
                if (((x340) b0kVar3).S) {
                    b0kVar3.l(function1);
                } else {
                    b0kVar3.v0();
                }
                nko1.H(jw31VarA, b0kVar3, lljVar3);
                nko1.H(xos0VarM3, b0kVar3, lljVar2);
                x0d.q(iHashCode3, b0kVar3, lljVar, b0kVar3);
                nko1.H(qim0VarE3, b0kVar3, vu30Var);
                hux huxVarD = xxq0.d(p60Var2.a);
                uwr uwrVar2 = cbx.a;
                vu30 vu30Var2 = vu30Var;
                qim0 qim0Var5 = qim0Var4;
                b0k b0kVar4 = b0kVar3;
                w0h1.a(huxVarD, isl.a, u291.r(qim0Var4, 16.0f), cbx.a(b0kVar3).b.f, 0L, huj.d(p60Var2.a), b0kVar4, 56, 16);
                uwo1.e(p60Var2.c, u291.f(qim0Var5, 1.0f), cbx.d(b0kVar4).j, 0L, new a0e1(5), null, 0, false, null, 0, null, b0kVar4, 0, 0, 2024);
                b0kVar4.r(true);
                qim0Var4 = qim0Var5;
                b0kVar3 = b0kVar4;
                vu30Var = vu30Var2;
                function1 = function1;
            }
            b0k b0kVar5 = b0kVar3;
            qim0 qim0Var6 = qim0Var4;
            b0kVar5.r(false);
            if (p60Var.c.length() > 0) {
                b0kVar5.i0(-353141151);
                qim0 qim0VarN = anm1.N("explore-benefits-button", qim0Var6);
                String str = p60Var.c;
                if (ihc1.y0(str)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                z = true;
                foo1.c(new gbx(new y50(str), function0), jdx.c, qim0VarN, null, yla.s(b0kVar5), null, null, null, null, null, apo.r(1379179067, new cka(dkaVar, (byte) 0), b0kVar5), b0kVar5, 0, 48, 2008);
                b0kVar2 = b0kVar5;
                b0kVar2.r(false);
            } else {
                b0kVar2 = b0kVar5;
                z = true;
                b0kVar2.i0(-352794943);
                b0kVar2.r(false);
            }
            b0kVar2.r(z);
            b0kVar2.r(z);
            qim0Var2 = qim0Var6;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new xx(dkaVar, qim0Var2, function0, i, (byte) 27);
        }
    }

    public static final void c(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1206599005);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarX = uyn1.x(dug.f(i1p1.q(u291.b(0.0f, 220.0f, 1, u291.v(qim0Var2, 192.0f)), er31.b(16.0f)), u7h.c, d4o1.a), 8.0f);
            mbh mbhVarA = jbh.a(h36.e, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
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
            gfx.b(18, apo.r(-359463150, new sqk(cuaVar, cvxVar), x340Var), x340Var, 54);
            x340Var.r(true);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wdk(qim0Var, i, (byte) 8);
        }
    }

    public static final void d(zl80 zl80Var, ul80 ul80Var, vu30 vu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1624623771);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.e(zl80Var.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(ul80Var) : x340Var.i(ul80Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(vu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(qim0Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            a(zl80Var, ul80Var, null, x340Var, i2 & 126);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarF);
            jw31 jw31VarA = ew31.a(aq8.c, een.Z, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarZ);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            String str = ul80Var.c;
            cjc0 cjc0Var = new cjc0(1);
            lee1 lee1Var = cbx.d(x340Var).m;
            long j = cbx.a(x340Var).b.b;
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = td80.N0;
                x340Var.s0(objT);
            }
            uwo1.e(str, s161.a(nim0Var, (iu30) objT), lee1Var, j, null, null, 2, false, cjc0Var, 0, null, x340Var, 0, 0, 1712);
            f(zl80Var, ul80Var, vu30Var, null, x340Var, i2 & 1022);
            String str2 = ul80Var.e;
            cjc0 cjc0Var2 = new cjc0(1);
            lee1 lee1Var2 = cbx.d(x340Var).m;
            long j2 = cbx.a(x340Var).b.b;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = td80.O0;
                x340Var.s0(objT2);
            }
            uwo1.e(str2, s161.a(nim0Var, (iu30) objT2), lee1Var2, j2, null, null, 2, false, cjc0Var2, 0, null, x340Var, 0, 0, 1712);
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cm80(zl80Var, ul80Var, vu30Var, qim0Var, i, (byte) 0);
        }
    }

    public static final void e(zl80 zl80Var, ul80 ul80Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        tgc1 tgc1Var;
        String strN0;
        String str;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1262491620);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.e(zl80Var.ordinal()) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(ul80Var) : x340Var.i(ul80Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            Integer num = ul80Var.h;
            String str2 = ul80Var.b;
            d761 d761Var = ul80Var.a;
            if (num != null) {
                int iIntValue = num.intValue();
                tgc1Var = new tgc1(iIntValue > 0 ? 2131963618 : 2131963617, new Object[]{Integer.valueOf(Math.abs(iIntValue))});
            } else {
                tgc1Var = null;
            }
            if (tgc1Var == null) {
                x340Var.i0(140968841);
                x340Var.r(false);
                strN0 = null;
            } else {
                x340Var.i0(140968842);
                int i4 = tgc1Var.a;
                Object[] objArr = tgc1Var.b;
                strN0 = cwl1.n0(i4, Arrays.copyOf(objArr, objArr.length), x340Var);
                x340Var.r(false);
            }
            int iOrdinal = zl80Var.ordinal();
            if (iOrdinal == 0) {
                x340Var.i0(-1127546329);
                str = kh.a(d761Var.g((djc0) null, x340Var, 1)) + str2 + strN0;
                x340Var.r(false);
            } else {
                if (iOrdinal != 1) {
                    throw p3d1.k(x340Var, 1349099492, false);
                }
                x340Var.i0(-1127386059);
                str = kh.a(d761Var.g((djc0) null, x340Var, 1)) + str2;
                x340Var.r(false);
            }
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            d36 d36Var = new d36(8.0f, true, new um5(false));
            boolean zG = x340Var.g(str);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                objT = new ry40(str, (byte) 17);
                x340Var.s0(objT);
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarB = s161.b(qim0Var3, false, (iu30) objT);
            mbh mbhVarA = jbh.a(d36Var, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
            vnr0 vnr0VarG = d761Var.g((djc0) null, x340Var, 1);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = td80.P0;
                x340Var.s0(objT2);
            }
            qgo1.f(vnr0VarG, s161.a(qim0Var3, (iu30) objT2), null, 0, false, null, x340Var, 8, 60);
            Integer num2 = ul80Var.h;
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = td80.Q0;
                x340Var.s0(objT3);
            }
            j(str2, num2, s161.a(qim0Var3, (iu30) objT3), x340Var, 0);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bm80(zl80Var, ul80Var, qim0Var2, i, (byte) 1);
        }
    }

    public static final void f(zl80 zl80Var, ul80 ul80Var, vu30 vu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-259434384);
        if ((i & 6) == 0) {
            i2 = (b0kVar2.e(zl80Var.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? b0kVar2.g(ul80Var) : b0kVar2.i(ul80Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar2.i(vu30Var) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (b0kVar2.Y(i3 & 1, (i3 & 1171) != 1170)) {
            cl70 cl70Var = new cl70((Context) b0kVar2.k(AndroidCompositionLocals_androidKt.b));
            cl70Var.setImageTintList(ColorStateList.valueOf(cl70Var.getContext().getColor(2131104258)));
            Object objT = b0kVar2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                h660 h660Var = new h660();
                h660Var.a = cl70Var;
                objT = v8r.q(h660Var);
                b0kVar2.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            Object objT2 = b0kVar2.T();
            if (objT2 == m4cVar) {
                objT2 = td80.R0;
                b0kVar2.s0(objT2);
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarB = s161.b(qim0Var3, false, (iu30) objT2);
            String strO0 = cwl1.o0(b0kVar2, 2131963612);
            boolean zI = ((i3 & 14) == 4) | ((i3 & 896) == 256) | b0kVar2.i(ven0Var);
            Object objT3 = b0kVar2.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new xvy(vu30Var, zl80Var, ven0Var, (byte) 23);
                b0kVar2.s0(objT3);
            }
            qim0 qim0VarX = bin.x(qim0VarB, false, strO0, null, null, (Function0) objT3, 13);
            jw31 jw31VarA = ew31.a(h36.a, een.Z, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarX);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(jw31VarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            String strO1 = cwl1.o0(b0kVar2, ul80Var.d);
            cjc0 cjc0Var = new cjc0(1);
            uwr uwrVar = cbx.a;
            uwo1.e(strO1, null, cbx.d(b0kVar2).n, 0L, null, null, 2, false, cjc0Var, 0, null, b0kVar2, 0, 0, 1722);
            b0kVar2 = b0kVar2;
            cvx cvxVar = cbx.b(b0kVar2).b;
            op71.g(b0kVar2, u291.v(qim0Var3, 8.0f));
            boolean zI2 = b0kVar2.i(cl70Var);
            Object objT4 = b0kVar2.T();
            if (zI2 || objT4 == m4cVar) {
                objT4 = new t5r(cl70Var, (byte) 1);
                b0kVar2.s0(objT4);
            }
            iu30 iu30Var = (iu30) objT4;
            zov0 zov0Var = cbx.b(b0kVar2).g;
            qim0 qim0VarR = u291.r(qim0Var3, 16.0f);
            boolean zI3 = b0kVar2.i(ven0Var);
            Object objT5 = b0kVar2.T();
            if (zI3 || objT5 == m4cVar) {
                objT5 = new i030(ven0Var, (byte) 23);
                b0kVar2.s0(objT5);
            }
            dm5.a(iu30Var, qim0VarR, (iu30) objT5, b0kVar2, 0, 0);
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new cm80(zl80Var, ul80Var, vu30Var, qim0Var2, i, (byte) 1);
        }
    }

    public static final void g(zl80 zl80Var, ul80 ul80Var, vu30 vu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1063233911);
        int i2 = i | (x340Var.e(zl80Var.ordinal()) ? 4 : 2) | (x340Var.g(ul80Var) ? 32 : 16) | (x340Var.i(vu30Var) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(8.0f, true, new um5(false)), een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var3);
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
            e(zl80Var, ul80Var, null, x340Var, i2 & 126);
            d(zl80Var, ul80Var, vu30Var, u291.f(qim0Var3, 1.0f), x340Var, i2 & 1022);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cb60(i, (Object) zl80Var, (Object) ul80Var, (Object) vu30Var, (Object) qim0Var2, (byte) 9);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(oie0 oie0Var, iu30 iu30Var, j2i j2iVar, b0k b0kVar, int i) {
        b0k b0kVar2;
        twc1 twc1Var;
        rwc1 rwc1Var;
        List list;
        rwc1 rwc1Var2;
        twc1 twc1Var2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1517703061);
        int i2 = i | (b0kVar3.i(oie0Var) ? 4 : 2) | (b0kVar3.i(iu30Var) ? 32 : 16);
        boolean z = true;
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            ven0 ven0VarH = rwq.h(oie0Var.t, b0kVar3, 0);
            String strO0 = cwl1.o0(b0kVar3, 2131952880);
            boolean zI = b0kVar3.i(oie0Var) | b0kVar3.g(strO0);
            Object objT = b0kVar3.T();
            if (zI || objT == m4cVar) {
                objT = new bsc0(oie0Var, strO0, (byte) 8);
                b0kVar3.s0(objT);
            }
            qxd0.S((Function0) objT, b0kVar3);
            boolean zI2 = b0kVar3.i(oie0Var) | b0kVar3.i(iu30Var);
            Object objT2 = b0kVar3.T();
            String str = null;
            if (zI2 || objT2 == m4cVar) {
                objT2 = new e9c0(oie0Var, iu30Var, (lnm) null, (byte) 16);
                b0kVar3.s0(objT2);
            }
            qxd0.t(oie0Var, b0kVar3, (vu30) objT2);
            rne0 rne0Var = ((sie0) ven0VarH.getValue()).a;
            String str2 = rne0Var != null ? rne0Var.a : null;
            rne0 rne0Var2 = ((sie0) ven0VarH.getValue()).a;
            if (rne0Var2 == null || !rne0Var2.b) {
                z = false;
            }
            boolean z2 = ((sie0) ven0VarH.getValue()).c == 2;
            sie0 sie0Var = (sie0) ven0VarH.getValue();
            boolean z3 = (sie0Var.a == null && sie0Var.c == 4) ? z : false;
            String str3 = ((sie0) ven0VarH.getValue()).b;
            uwc1 uwc1Var = ((sie0) ven0VarH.getValue()).d;
            if (uwc1Var instanceof twc1) {
                twc1Var2 = (twc1) uwc1Var;
            } else {
                twc1Var = str;
            }
            z6x z6xVar = twc1Var != 0 ? twc1Var.a : str;
            if (z6xVar == null) {
                twc1Var = twc1Var2;
                twc1Var = twc1Var2;
                z6xVar = z6x.a;
            }
            twc1Var = twc1Var2;
            twc1Var = twc1Var2;
            z6x z6xVar2 = z6xVar;
            uwc1 uwc1Var2 = ((sie0) ven0VarH.getValue()).d;
            if (uwc1Var2 instanceof rwc1) {
                rwc1Var2 = (rwc1) uwc1Var2;
            } else {
                rwc1Var = str;
            }
            if (rwc1Var != 0) {
                rwc1Var = rwc1Var2;
                str = rwc1Var.a;
            }
            rwc1Var = rwc1Var2;
            String str4 = str;
            List list2 = ((sie0) ven0VarH.getValue()).e;
            boolean zI3 = b0kVar3.i(oie0Var);
            Object objT3 = b0kVar3.T();
            if (zI3 || objT3 == m4cVar) {
                list = list2;
                lbc0 lbc0Var = new lbc0(1, oie0Var, oie0.class, "updateSearchQuery", "updateSearchQuery(Ljava/lang/String;)V", 0, (byte) 10);
                b0kVar3.s0(lbc0Var);
                objT3 = lbc0Var;
            } else {
                list = list2;
            }
            iu30 iu30Var2 = (iu30) objT3;
            boolean zI4 = b0kVar3.i(oie0Var);
            Object objT4 = b0kVar3.T();
            if (zI4 || objT4 == m4cVar) {
                c4z c4zVar = new c4z(2, oie0Var, oie0.class, "selectSuggestion", "selectSuggestion(Lcom/spotify/bluejay/data/api/LocationSuggestion;I)V", 0, (byte) 26);
                b0kVar3.s0(c4zVar);
                objT4 = c4zVar;
            }
            vu30 vu30Var = (vu30) objT4;
            boolean zI5 = b0kVar3.i(oie0Var) | b0kVar3.i(iu30Var);
            Object objT5 = b0kVar3.T();
            if (zI5 || objT5 == m4cVar) {
                objT5 = new bsc0(oie0Var, iu30Var, (byte) 9);
                b0kVar3.s0(objT5);
            }
            Function0 function0 = (Function0) objT5;
            boolean zI6 = b0kVar3.i(oie0Var);
            Object objT6 = b0kVar3.T();
            if (zI6 || objT6 == m4cVar) {
                p350 p350Var = new p350(0, oie0Var, oie0.class, "clearLocation", "clearLocation()V", 0, (byte) 16);
                b0kVar3.s0(p350Var);
                objT6 = p350Var;
            }
            b0kVar2 = b0kVar3;
            b9p1.i(str2, z, z2, z3, str3, z6xVar2, str4, list, iu30Var2, vu30Var, function0, (Function0) objT6, null, j2iVar, b0kVar2, 0, 3072);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new qae0(oie0Var, iu30Var, j2iVar, i, (byte) 1);
        }
    }

    public static final int i(boolean z, boolean z2, boolean z3) {
        return (z ? 1 : 0) | ((z2 ? 1 : 0) << 1) | ((z3 ? 1 : 0) << 2);
    }

    public static final void j(String str, Integer num, qim0 qim0Var, b0k b0kVar, int i) {
        h311 h311VarV;
        dm80 dm80Var;
        long j;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2120376972);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(num) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            if (str.length() == 0) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    dm80Var = new dm80(str, num, qim0Var, i, (byte) 0);
                }
            } else {
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                jw31 jw31VarA = ew31.a(new d36(4.0f, true, new um5(false)), een.Z, x340Var, 0);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
                nko1.H(jw31VarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                uwo1.e(str, null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, i2 & 14, 0, 2034);
                if (num == null) {
                    x340Var.i0(1923242065);
                    x340Var.r(false);
                } else {
                    x340Var.i0(1923242066);
                    int iIntValue = num.intValue();
                    jmr0 jmr0VarN = i3o1.n(iIntValue > 0 ? 2131233993 : 2131233992, x340Var, 0);
                    zov0 zov0Var = cbx.b(x340Var).g;
                    eso1.h(jmr0VarN, isl.a, u291.r(nim0.a, 16.0f), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, x340Var, 56, 504);
                    String strN0 = cwl1.n0(2131963616, new Object[]{Integer.valueOf(Math.abs(iIntValue))}, x340Var);
                    lee1 lee1Var = cbx.d(x340Var).j;
                    if (iIntValue > 0) {
                        x340Var.i0(-1585086163);
                        j = cbx.a(x340Var).b.f;
                        x340Var.r(false);
                    } else {
                        x340Var.i0(-1585025651);
                        j = cbx.a(x340Var).b.d;
                        x340Var.r(false);
                    }
                    uwo1.e(strN0, null, lee1Var, j, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
                    x340Var.r(false);
                }
                x340Var.r(true);
            }
            h311VarV.d = dm80Var;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            dm80Var = new dm80(str, num, qim0Var, i, (byte) 1);
            h311VarV.d = dm80Var;
        }
    }

    public static int k(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 90) {
            return 1;
        }
        if (i == 180) {
            return 2;
        }
        if (i == 270) {
            return 3;
        }
        hhg1.n(f4i1.c(i, "Invalid rotation: "));
        return 0;
    }

    public static final rt1 l(b0k b0kVar) {
        float fM = dsa0.m(b0kVar, 2131165792);
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(-764076771);
        wat watVar = (wat) x340Var.k(t4k.h);
        int iI0 = watVar.i0(64.0f);
        int iI1 = watVar.i0(fM);
        WeakHashMap weakHashMap = osl1.x;
        int iD = lhc.g(x340Var).m.d(watVar);
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(x340Var).b;
        rt1 rt1Var = new rt1(iI0, iI1, watVar.i0(16.0f) + iD);
        x340Var.r(false);
        return rt1Var;
    }

    public static final int m(PlayerState playerState) {
        if (playerState.options().repeatingTrack()) {
            return 3;
        }
        return playerState.options().repeatingContext() ? 2 : 1;
    }

    public static final boolean n(Restrictions restrictions) {
        return restrictions.disallowTogglingRepeatTrackReasons().isEmpty() || restrictions.disallowTogglingRepeatContextReasons().isEmpty();
    }

    public static ksk0 o() {
        return new ksk0((byte) 8);
    }

    public static final int p(int i, Restrictions restrictions) {
        int iC = l1d.C(i);
        if (iC == 0) {
            if (restrictions.disallowTogglingRepeatContextReasons().isEmpty()) {
                return 2;
            }
            return p(2, restrictions);
        }
        if (iC != 1) {
            return 1;
        }
        if (restrictions.disallowTogglingRepeatTrackReasons().isEmpty()) {
            return 3;
        }
        return p(3, restrictions);
    }

    public static Typeface q(Context context, List list, int i, boolean z, int i2, Handler handler, dn81 dn81Var) {
        vi7 vi7Var = new vi7(handler, (byte) 4);
        q59 q59Var = new q59(dn81Var, vi7Var, (byte) 24);
        if (!z) {
            String strA = u930.a(i, list);
            Typeface typeface = (Typeface) u930.a.c(strA);
            if (typeface != null) {
                vi7Var.execute(new nx30(dn81Var, typeface, (byte) 7));
                return typeface;
            }
            ae0 ae0Var = new ae0(q59Var, (byte) 4);
            synchronized (u930.c) {
                try {
                    jv81 jv81Var = u930.d;
                    ArrayList arrayList = (ArrayList) jv81Var.get(strA);
                    if (arrayList != null) {
                        arrayList.add(ae0Var);
                        return null;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(ae0Var);
                    jv81Var.put(strA, arrayList2);
                    s930 s930Var = new s930(strA, context, list, i, (byte) 1);
                    ThreadPoolExecutor threadPoolExecutor = u930.b;
                    ae0 ae0Var2 = new ae0(strA, (byte) 5);
                    Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                    sl21 sl21Var = new sl21();
                    sl21Var.b = s930Var;
                    sl21Var.c = ae0Var2;
                    sl21Var.d = handler2;
                    threadPoolExecutor.execute(sl21Var);
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (list.size() > 1) {
            hhg1.n("Fallbacks with blocking fetches are not supported for performance reasons");
            return null;
        }
        o930 o930Var = (o930) list.get(0);
        ydf0 ydf0Var = u930.a;
        ArrayList arrayList3 = new ArrayList(1);
        Object obj = new Object[]{o930Var}[0];
        Objects.requireNonNull(obj);
        arrayList3.add(obj);
        String strA2 = u930.a(i, Collections.unmodifiableList(arrayList3));
        Typeface typeface2 = (Typeface) u930.a.c(strA2);
        if (typeface2 != null) {
            vi7Var.execute(new nx30(dn81Var, typeface2, (byte) 7));
            return typeface2;
        }
        if (i2 == -1) {
            ArrayList arrayList4 = new ArrayList(1);
            Object obj2 = new Object[]{o930Var}[0];
            Objects.requireNonNull(obj2);
            arrayList4.add(obj2);
            t930 t930VarB = u930.b(strA2, context, Collections.unmodifiableList(arrayList4), i);
            q59Var.r(t930VarB);
            return t930VarB.a;
        }
        try {
            try {
                try {
                    t930 t930Var = (t930) u930.b.submit(new s930(strA2, context, o930Var, i, (byte) 0)).get(i2, TimeUnit.MILLISECONDS);
                    q59Var.r(t930Var);
                    return t930Var.a;
                } catch (InterruptedException e) {
                    throw e;
                }
            } catch (ExecutionException e2) {
                throw new RuntimeException(e2);
            } catch (TimeoutException unused) {
                throw new InterruptedException("timeout");
            }
        } catch (InterruptedException unused2) {
            ((vi7) q59Var.c).execute(new qzc((dn81) q59Var.b, -3));
            return null;
        }
    }

    public static final void r(View view, int i) {
        view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(view.getContext(), i));
    }

    public static wma1 s(String str) {
        return hhp0.a.w(str, oif1.b, (Long) null);
    }

    public static mw81 t(int i, String str, Function0 function0) {
        boolean z = (i & 1) != 0;
        boolean z2 = (i & 2) == 0;
        if ((i & 8) != 0) {
            str = null;
        }
        mw81 mw81Var = new mw81(function0);
        if (z2) {
            mw81Var.setDaemon(true);
        }
        if (str != null) {
            mw81Var.setName(str);
        }
        if (z) {
            mw81Var.start();
        }
        return mw81Var;
    }

    public static final Object u(w6y w6yVar, boolean z, lnm lnmVar) {
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (z) {
            Object objC = ((f7y) w6yVar).c(lnmVar);
            return objC == d9nVar ? objC : rih1Var;
        }
        Object objH = ((f7y) w6yVar).h(lnmVar);
        return objH == d9nVar ? objH : rih1Var;
    }
}
