package p;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.TextUnit;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.home.evopage.events.proto.HomeFeedLoadingErrorEvent;
import com.spotify.home.evopage.events.proto.HomeFeedLoadingEvent;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class ago1 {
    public static final l7c a = new l7c((byte) 23);
    public static b180 b;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:69:0x0118  */
    /* JADX WARN: Code duplicated, block: B:80:0x0173  */
    public static final void a(gwd gwdVar, iu30 iu30Var, qim0 qim0Var, zau0 zau0Var, boolean z, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        long j;
        boolean z2;
        b0k b0kVar2;
        vu30 vu30Var;
        float f;
        long j2;
        boolean z3;
        boolean zB;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(396374191);
        j06 j06Var = ((x340) b0kVar3).a;
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(gwdVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= b0kVar3.i(zau0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= b0kVar3.h(z) ? 16384 : 8192;
        }
        int i4 = i3;
        if (b0kVar3.Y(i4 & 1, (i4 & 9363) != 9362)) {
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = pzm.i(b0kVar3);
            }
            lz20 lz20Var = (lz20) objT;
            String str = gwdVar.d;
            if (str.length() > 0) {
                b0kVar3.i0(-2147093211);
                b0kVar3.r(false);
                switch (str) {
                    case "solidWhite200":
                        uwr uwrVar = cbx.a;
                        j = ((vex) zex.a.b).b;
                        break;
                    case "solidBlack0":
                        uwr uwrVar2 = cbx.a;
                        j = ((vex) zex.a.b).a;
                        break;
                    case "yellow184":
                        uwr uwrVar3 = cbx.a;
                        j = ((xex) ((gmt) zex.a.c).b).g;
                        break;
                    case "blueDesat180":
                        uwr uwrVar4 = cbx.a;
                        j = ((wex) ((gmt) zex.a.c).c).f;
                        break;
                    case "blueViolet25":
                        uwr uwrVar5 = cbx.a;
                        j = ((xex) ((gmt) zex.a.c).b).w;
                        break;
                    case "blueViolet61":
                        uwr uwrVar6 = cbx.a;
                        j = ((xex) ((gmt) zex.a.c).b).x;
                        break;
                    default:
                        j = u7h.b;
                        break;
                }
            } else {
                b0kVar3.i0(-2146630536);
                uwr uwrVar7 = cbx.a;
                j = cbx.a(b0kVar3).b.a;
                b0kVar3.r(false);
            }
            long j3 = j;
            if (gwdVar.c.length() <= 0) {
                z2 = false;
            } else {
                if (((Configuration) b0kVar3.k(AndroidCompositionLocals_androidKt.a)).orientation == 2) {
                    b0kVar3.i0(-1336478123);
                    zB = xoi1.b((Context) b0kVar3.k(AndroidCompositionLocals_androidKt.b));
                    b0kVar3.r(false);
                } else {
                    b0kVar3.i0(1518803832);
                    b0kVar3.r(false);
                    zB = true;
                }
                if (zB) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zI = ((57344 & i4) == 16384) | b0kVar3.i(lz20Var);
            Object objT2 = b0kVar3.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new iwd(z, lz20Var, (lnm) null, (byte) 0);
                b0kVar3.s0(objT2);
            }
            qxd0.t(boolValueOf, b0kVar3, (vu30) objT2);
            int i5 = i4 >> 6;
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(b0kVar3, qim0Var3);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            boolean z4 = ((x340) b0kVar3).S;
            n4k n4kVar = hmb0.t1;
            if (z4) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            vu30 vu30Var2 = y580.O0;
            nko1.H(gfh0VarC, b0kVar3, vu30Var2);
            llj lljVar = y580.N0;
            nko1.H(xos0VarM, b0kVar3, lljVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar2 = y580.R0;
            nko1.H(numValueOf, b0kVar3, lljVar2);
            nko1.F(b0kVar3);
            llj lljVar3 = y580.Y;
            nko1.H(qim0VarE, b0kVar3, lljVar3);
            qim0 qim0VarX = uyn1.x(u291.d(qim0Var3, 1.0f), 24.0f);
            era eraVar = een.Q0;
            boolean z5 = z2;
            mbh mbhVarA = jbh.a(h36.e, eraVar, b0kVar3, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM2 = b0kVar3.m();
            qim0 qim0VarE2 = zr7.E(b0kVar3, qim0VarX);
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            nko1.H(mbhVarA, b0kVar3, vu30Var2);
            nko1.H(xos0VarM2, b0kVar3, lljVar);
            x0d.q(iHashCode2, b0kVar3, lljVar2, b0kVar3);
            nko1.H(qim0VarE2, b0kVar3, lljVar3);
            if (z5) {
                b0kVar3.i0(-974860494);
                String str2 = gwdVar.c;
                qim0 qim0VarR = u291.r(qim0Var3, 200.0f);
                uwr uwrVar8 = cbx.a;
                cua cuaVar = cbx.b(b0kVar3).f;
                b0kVar2 = b0kVar3;
                vu30Var = vu30Var2;
                e(str2, zau0Var, z, i1p1.q(qim0VarR, er31.b(4.0f)), b0kVar2, i5 & 1008);
                x0d.s(qim0Var3, 32.0f, b0kVar2, false);
            } else {
                b0kVar2 = b0kVar3;
                vu30Var = vu30Var2;
                b0kVar2.i0(-974548169);
                b0kVar2.r(false);
            }
            qim0 qim0VarP = vby0.p(u291.f(qim0Var3, 1.0f), lz20Var);
            Object objT3 = b0kVar2.T();
            if (objT3 == m4cVar) {
                objT3 = fjd.N0;
                b0kVar2.s0(objT3);
            }
            qim0 qim0VarU = qxy0.u(s161.b(qim0VarP, true, (iu30) objT3), (idn0) null, 3);
            mbh mbhVarA2 = jbh.a(h36.c, eraVar, b0kVar2, 0);
            int iHashCode3 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM3 = b0kVar2.m();
            qim0 qim0VarE3 = zr7.E(b0kVar2, qim0VarU);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA2, b0kVar2, vu30Var);
            nko1.H(xos0VarM3, b0kVar2, lljVar);
            x0d.q(iHashCode3, b0kVar2, lljVar2, b0kVar2);
            nko1.H(qim0VarE3, b0kVar2, lljVar3);
            String str3 = gwdVar.a;
            uwr uwrVar9 = cbx.a;
            b0kVar3 = b0kVar2;
            uwo1.e(str3, u291.f(qim0Var3, 1.0f), cbx.d(b0kVar2).c, j3, new a0e1(3), null, 0, false, null, 0, null, b0kVar3, 0, 0, 2016);
            if (gwdVar.b.length() > 0) {
                v8i0.i(16.0f, -1221569666, b0kVar3, b0kVar3, qim0Var3);
                j2 = j3;
                f = 16.0f;
                uwo1.e(gwdVar.b, u291.f(qim0Var3, 1.0f), cbx.d(b0kVar3).g, u7h.b(j3, 0.7f, 0.0f, 0.0f, 0.0f, 14), new a0e1(3), null, 0, false, null, 0, null, b0kVar3, 0, 0, 2016);
                z3 = false;
                b0kVar3.r(false);
            } else {
                f = 16.0f;
                j2 = j3;
                z3 = false;
                b0kVar3.i0(-1221259263);
                b0kVar3.r(false);
            }
            b0kVar3.r(true);
            if (gwdVar.e.length() <= 0 || gwdVar.f.length() <= 0) {
                b0kVar3.i0(-973228809);
                b0kVar3.r(z3);
            } else {
                v8i0.i(f, -973615131, b0kVar3, b0kVar3, qim0Var3);
                boolean z6 = z3;
                String str4 = gwdVar.f;
                lee1 lee1Var = cbx.d(b0kVar3).h;
                boolean z7 = ((i4 & 14) == 4 ? true : z6) | ((i4 & 112) == 32 ? true : z6);
                Object objT4 = b0kVar3.T();
                if (z7 || objT4 == m4cVar) {
                    objT4 = new rqa(iu30Var, gwdVar, (byte) 18);
                    b0kVar3.s0(objT4);
                }
                uwo1.e(str4, uyn1.z(0.0f, 8.0f, 1, bin.x(qim0Var3, false, null, null, null, (Function0) objT4, 15)), lee1Var, j2, new a0e1(3), null, 0, false, null, 0, null, b0kVar3, 0, 0, 2016);
                b0kVar3.r(z6);
            }
            b0kVar3.r(true);
            b0kVar3.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar3.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar3.v();
        if (h311VarV != null) {
            h311VarV.d = new sx1((Object) gwdVar, (Object) iu30Var, (Object) qim0Var2, (Object) zau0Var, z, i, (byte) 5);
        }
    }

    public static final void b(op80 op80Var, j2i j2iVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(969728541);
        int i2 = (x340Var.i(op80Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            ien0 ien0Var = qsw.a;
            u601 u601VarC = gfe0.c(x340Var);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = new rp80(new fom(op80Var, (byte) 0));
                x340Var.s0(objT);
            }
            rp80 rp80Var = (rp80) objT;
            boolean zG = x340Var.g(u601VarC) | x340Var.g(op80Var);
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                rp80Var.d(new fom(op80Var, (byte) 0));
                fns fnsVar = igu.a;
                rp80Var.b(u601VarC, pyf0.a);
                x340Var.s0(rih1.a);
            }
            qsw.b(rp80Var.j, apo.r(842387056, new pu2(j2iVar, (byte) 17), x340Var), x340Var, 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jjk(op80Var, j2iVar, i, (byte) 24);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void c(String str, int i, String str2, boolean z, iu30 iu30Var, Function0 function0, boolean z2, boolean z3, boolean z4, String str3, Function0 function1, b0k b0kVar, int i2) throws NoWhenBranchMatchedException {
        b0k b0kVar2;
        boolean z5;
        boolean z6;
        int i3;
        ven0 ven0Var;
        boolean z7;
        boolean z8;
        m4c m4cVar;
        iu30 iu30Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(193777597);
        int i4 = i2 | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.e(i) ? 32 : 16) | (b0kVar3.g(str2) ? 256 : 128) | (b0kVar3.h(z) ? 2048 : 1024) | (b0kVar3.i(iu30Var) ? 16384 : 8192) | (b0kVar3.i(function0) ? 131072 : 65536) | (b0kVar3.h(z2) ? 1048576 : 524288) | (b0kVar3.h(z3) ? 8388608 : 4194304) | (b0kVar3.h(z4) ? 67108864 : 33554432) | (b0kVar3.g(str3) ? 536870912 : 268435456);
        int i5 = b0kVar3.i(function1) ? 4 : 2;
        if (b0kVar3.Y(i4 & 1, ((i4 & 306783379) == 306783378 && (i5 & 3) == 2) ? false : true)) {
            ot50 ot50VarA = ahe0.a(b0kVar3);
            eck1 eck1Var = (eck1) ((Map) b0kVar3.k(zge0.a)).get(wvw.class);
            if (eck1Var == null) {
                k220.f("No factory found for ".concat(wvw.class.getSimpleName()));
                return;
            }
            wcn0 wcn0VarO = ot50VarA instanceof ot50 ? ot50VarA.O() : csn.b;
            sck1 sck1VarA = ahe0.a(b0kVar3);
            if (sck1VarA == null) {
                eg.m("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            wvw wvwVarS = d9p1.s(rc11.a.b(wvw.class), sck1VarA, eck1Var, wcn0VarO, b0kVar3);
            ven0 ven0VarK = f4p1.k(wvwVarS.h, (iac0) null, b0kVar3, 7);
            Object objT = b0kVar3.T();
            m4c m4cVar2 = fkj0.X;
            if (objT == m4cVar2) {
                objT = v8r.q("");
                b0kVar3.s0(objT);
            }
            ven0 ven0Var2 = (ven0) objT;
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zI = ((i4 & 7168) == 2048) | b0kVar3.i(wvwVarS);
            Object objT2 = b0kVar3.T();
            if (zI || objT2 == m4cVar2) {
                z5 = false;
                objT2 = new fvw(z, wvwVarS, (lnm) null, (byte) 0);
                b0kVar3.s0(objT2);
            } else {
                z5 = false;
            }
            int i6 = i4 >> 9;
            qxd0.t(boolValueOf, b0kVar3, (vu30) objT2);
            boolean zI2 = ((i4 & 896) == 256 ? true : z5) | b0kVar3.i(wvwVarS);
            Object objT3 = b0kVar3.T();
            if (zI2 || objT3 == m4cVar2) {
                objT3 = new nnu(str2, wvwVarS, (lnm) null, (byte) 15);
                b0kVar3.s0(objT3);
            }
            qxd0.t(str2, b0kVar3, (vu30) objT3);
            Boolean boolValueOf2 = Boolean.valueOf(z2);
            boolean zI3 = ((3670016 & i4) == 1048576) | b0kVar3.i(wvwVarS);
            Object objT4 = b0kVar3.T();
            if (zI3 || objT4 == m4cVar2) {
                z6 = true;
                objT4 = new fvw(z2, wvwVarS, (lnm) null, (byte) 1);
                b0kVar3.s0(objT4);
            } else {
                z6 = true;
            }
            qxd0.t(boolValueOf2, b0kVar3, (vu30) objT4);
            Boolean boolValueOf3 = Boolean.valueOf(z3);
            boolean zI4 = ((29360128 & i4) == 8388608 ? z6 : false) | b0kVar3.i(wvwVarS);
            Object objT5 = b0kVar3.T();
            if (zI4 || objT5 == m4cVar2) {
                objT5 = new fvw(z3, wvwVarS, (lnm) null, (byte) 2);
                b0kVar3.s0(objT5);
            }
            qxd0.t(boolValueOf3, b0kVar3, (vu30) objT5);
            int i7 = i4 & 112;
            int i8 = i4 & 57344;
            boolean zI5 = b0kVar3.i(ven0Var2) | (i7 == 32) | b0kVar3.i(wvwVarS) | (i8 == 16384);
            Object objT6 = b0kVar3.T();
            if (zI5 || objT6 == m4cVar2) {
                i3 = i6;
                ven0Var = ven0Var2;
                z7 = false;
                z8 = true;
                m4cVar = m4cVar2;
                ka0 ka0Var = new ka0(i, wvwVarS, iu30Var, ven0Var, (byte) 5);
                iu30Var2 = iu30Var;
                b0kVar3.s0(ka0Var);
                objT6 = ka0Var;
            } else {
                i3 = i6;
                ven0Var = ven0Var2;
                z7 = false;
                z8 = true;
                iu30Var2 = iu30Var;
                m4cVar = m4cVar2;
            }
            Function0 function2 = (Function0) objT6;
            vvw vvwVar = (vvw) ven0VarK.getValue();
            boolean zI6 = b0kVar3.i(ven0Var) | b0kVar3.i(wvwVarS);
            Object objT7 = b0kVar3.T();
            if (zI6 || objT7 == m4cVar) {
                objT7 = new w3w(wvwVarS, ven0Var, (byte) 9);
                b0kVar3.s0(objT7);
            }
            iu30 iu30Var3 = (iu30) objT7;
            boolean zI7 = b0kVar3.i(wvwVarS);
            Object objT8 = b0kVar3.T();
            if (zI7 || objT8 == m4cVar) {
                objT8 = new r1t(1, wvwVarS, wvw.class, "onCodeCompleteChanged", "onCodeCompleteChanged(Z)V", 0, (byte) 24);
                b0kVar3.s0(objT8);
            }
            iu30 iu30Var4 = (iu30) objT8;
            boolean zI8 = b0kVar3.i(wvwVarS);
            Object objT9 = b0kVar3.T();
            if (zI8 || objT9 == m4cVar) {
                objT9 = new y0u(0, wvwVarS, (Class) r8, "onOtpFocused", "onOtpFocused()V", 0, (byte) 6);
                b0kVar3.s0(objT9);
            }
            Function0 function3 = (Function0) objT9;
            boolean zI9 = b0kVar3.i(wvwVarS);
            Object objT10 = b0kVar3.T();
            if (zI9 || objT10 == m4cVar) {
                objT10 = new y0u(0, wvwVarS, (Class) r8, "trackOTPInteraction", "trackOTPInteraction()V", 0, (byte) 7);
                b0kVar3.s0(objT10);
            }
            Function0 function4 = (Function0) objT10;
            boolean zI10 = b0kVar3.i(wvwVarS);
            if (i8 != 16384) {
                z8 = z7;
            }
            boolean z9 = zI10 | z8;
            Object objT11 = b0kVar3.T();
            if (z9 || objT11 == m4cVar) {
                objT11 = new f2t(wvwVarS, iu30Var2, (byte) 28);
                b0kVar3.s0(objT11);
            }
            b0kVar2 = b0kVar3;
            dgo1.d(vvwVar, i, str, iu30Var3, iu30Var4, function3, function4, function2, function2, (Function0) objT11, z4, str3, function0, function1, null, b0kVar2, ((i4 << 6) & 896) | i7, (i3 & 896) | ((i4 >> 24) & 126) | ((i5 << 9) & 7168));
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new gvw(str, i, str2, z, iu30Var, function0, z2, z3, z4, str3, function1, i2);
        }
    }

    public static final void d(int i, Integer num, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(465427871);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | (x340Var.g(num) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                u7h u7hVar = new u7h(z4p1.e(num != null ? num.intValue() : 2131101503));
                x340Var.s0(u7hVar);
                objT = u7hVar;
            }
            long j = ((u7h) objT).a;
            qim0 qim0VarN = anm1.N("overlay_color_test_tag", qim0Var);
            boolean z2 = (i2 & 14) == 4;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new xet(function0, (byte) 15);
                x340Var.s0(objT2);
            }
            t1c.a(dug.f(i541.C(qim0VarN, (iu30) objT2), j, d4o1.a), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bp50((Object) function0, (Object) num, (Object) qim0Var, i, (byte) 2);
        }
    }

    public static final void e(String str, zau0 zau0Var, boolean z, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        tob1 tob1Var;
        tob1 tob1Var2;
        lnm lnmVar;
        Object us3Var;
        int i3;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-62732895);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(zau0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(qim0Var) ? 2048 : 1024;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q((Object) null);
                b0kVar3.s0(objT);
            }
            tob1 tob1Var3 = (ven0) objT;
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q((Object) null);
                b0kVar3.s0(objT2);
            }
            tob1 tob1Var4 = (ven0) objT2;
            boolean z2 = (i2 & 14) == 4;
            Object objT3 = b0kVar3.T();
            if (z2 || objT3 == m4cVar) {
                tob1Var = tob1Var4;
                tob1Var2 = tob1Var3;
                lnmVar = null;
                lsm0 lsm0Var = new lsm0(str, new ksm0(fec1.c, (String) null, (String) null, "allboarding-carousel", (String) null, (String) null, 502), true, false, (jsm0) null, 0L, (ism0) null, (String) null, false, 0, 2032);
                b0kVar3.s0(lsm0Var);
                objT3 = lsm0Var;
            } else {
                tob1Var2 = tob1Var3;
                lnmVar = null;
                tob1Var = tob1Var4;
            }
            lsm0 lsm0Var2 = (lsm0) objT3;
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zI = ((i2 & 896) == 256) | b0kVar3.i(zau0Var) | b0kVar3.i(tob1Var2) | b0kVar3.i(lsm0Var2);
            Object objT4 = b0kVar3.T();
            if (zI || objT4 == m4cVar) {
                i3 = i2;
                us3Var = new us3(z, zau0Var, tob1Var2, lsm0Var2, (lnm) null, (byte) 1);
                b0kVar3.s0(us3Var);
            } else {
                i3 = i2;
                us3Var = objT4;
            }
            int i4 = i3 >> 6;
            qxd0.s(boolValueOf, zau0Var, (vu30) us3Var, b0kVar3);
            r091 r091Var = (r091) tob1Var2.getValue();
            VideoSurfaceView videoSurfaceView = (VideoSurfaceView) tob1Var.getValue();
            tob1 tob1Var5 = tob1Var;
            boolean zI2 = b0kVar3.i(tob1Var5) | b0kVar3.i(tob1Var2);
            Object objT5 = b0kVar3.T();
            if (zI2 || objT5 == m4cVar) {
                objT5 = new vs3(tob1Var5, tob1Var2, lnmVar, (byte) 3);
                b0kVar3.s0(objT5);
            }
            qxd0.s(r091Var, videoSurfaceView, (vu30) objT5, b0kVar3);
            boolean zI3 = b0kVar3.i(tob1Var2) | b0kVar3.i(tob1Var5);
            Object objT6 = b0kVar3.T();
            if (zI3 || objT6 == m4cVar) {
                objT6 = new xs3(tob1Var2, tob1Var5, (byte) 2);
                b0kVar3.s0(objT6);
            }
            qxd0.i(rih1.a, (iu30) objT6, b0kVar3);
            boolean zI4 = b0kVar3.i(tob1Var5);
            Object objT7 = b0kVar3.T();
            if (zI4 || objT7 == m4cVar) {
                objT7 = new cy7(tob1Var5, (byte) 16);
                b0kVar3.s0(objT7);
            }
            iu30 iu30Var = (iu30) objT7;
            boolean zI5 = b0kVar3.i(tob1Var5);
            Object objT8 = b0kVar3.T();
            if (zI5 || objT8 == m4cVar) {
                objT8 = new cy7(tob1Var5, (byte) 17);
                b0kVar3.s0(objT8);
            }
            b0kVar2 = b0kVar3;
            dm5.a(iu30Var, qim0Var, (iu30) objT8, b0kVar2, i4 & 112, 0);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ys3(str, zau0Var, z, qim0Var, i, (byte) 1);
        }
    }

    public static final void f(xfx xfxVar, q191 q191Var, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1089611880);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(xfxVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(q191Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(iu30Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean zI = x340Var.i(xfxVar) | ((i2 & 7168) == 2048);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new umr0(xfxVar, iu30Var, (byte) 5);
                x340Var.s0(objT);
            }
            iu30 iu30Var2 = (iu30) objT;
            boolean zI2 = x340Var.i(q191Var);
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new wvq0(q191Var, (byte) 19);
                x340Var.s0(objT2);
            }
            dm5.a(iu30Var2, qim0Var, (iu30) objT2, x340Var, (i2 >> 3) & 112, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new etg0(xfxVar, q191Var, qim0Var, iu30Var, i, (byte) 24);
        }
    }

    public static final void g(iu30 iu30Var, jtl1 jtl1Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1369858357);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.i(iu30Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(jtl1Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            s260 s260Var = new s260();
            String strO0 = cwl1.o0(x340Var, 2131960709);
            String strO1 = cwl1.o0(x340Var, 2131960708);
            wd50 wd50Var = new wd50(new sd50(2131886208), ud50.f);
            cm10 cm10Var = new cm10(cwl1.o0(x340Var, 2131960706), vnx.c);
            String strO2 = cwl1.o0(x340Var, 2131960707);
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new ccy0(iu30Var, (byte) 14);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            boolean z2 = i4 == 4;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new ccy0(iu30Var, (byte) 15);
                x340Var.s0(objT2);
            }
            Function0 function1 = (Function0) objT2;
            boolean z3 = i4 == 4;
            Object objT3 = x340Var.T();
            if (z3 || objT3 == m4cVar) {
                objT3 = new ccy0(iu30Var, (byte) 16);
                x340Var.s0(objT3);
            }
            l6o1.n(wd50Var, strO0, strO2, cm10Var, function0, function1, (Function0) objT3, jtl1Var, s260Var, false, strO1, null, x340Var, ((i3 << 18) & 29360128) | 4096 | ((i3 << 21) & 1879048192), 0, 5120);
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cry0(iu30Var, jtl1Var, qim0Var2, i, (byte) 2);
        }
    }

    public static final void h(g7g0 g7g0Var, pbq pbqVar, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        sqp sqpVar = (sqp) pbqVar.e;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(63195883);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(g7g0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(pbqVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            yup0 yup0Var = (yup0) pbqVar.g;
            boolean zG = x340Var.g(sqpVar);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                et61 et61Var = new et61(iu30Var, (byte) 29);
                sqpVar.getClass();
                h8l0 h8l0Var = new h8l0();
                wj3 wj3Var = (wj3) sqpVar.a.c;
                n8l0 n8l0VarL = wj3Var.l();
                sb40 sb40Var = (sb40) ((d7g0) wj3Var.b).l.get();
                c8o.l(sb40Var);
                objT = new y7b(h8l0Var, n8l0VarL, sb40Var, et61Var);
                x340Var.s0(objT);
            }
            otw.c(yup0Var, new uv41(g7g0Var.a), (qim0) null, (ipb1) null, x340Var, 0, 12);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0.a, 8.0f));
            otw.c((y7b) objT, new w7b(i7g0.e, g7g0Var.c), (qim0) null, (ipb1) null, x340Var, 0, 12);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new um81(g7g0Var, pbqVar, iu30Var, i, (byte) 10);
        }
    }

    public static final void i(whb1 whb1Var, leh1 leh1Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(149469079);
        int i2 = (x340Var.i(whb1Var) ? 4 : 2) | i | (x340Var.i(leh1Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            long j = ((s3v) x340Var.k(p4k.a)).a;
            et40 et40Var = et40.a;
            gt40 gt40VarK = leh1Var != null ? ila0.k(dm5.I(et40Var), leh1Var.a) : ila0.m(dm5.I(et40Var), new p05(2131231026));
            u8h u8hVar = new u8h(new oxe1(leh1Var != null ? leh1Var.b : new hn20(abh.h)));
            kee1 kee1VarA = leh1Var != null ? kee1.a(nee1.a, leh1Var.c, (TextUnit) null, (ka30) null, (zzd1) null, 126) : nee1.a;
            gt40 gt40VarF = eqr0.F(d9y0.l(gt40VarK, whb1Var), 12.0f, 0.0f);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = hzg1.Y;
                x340Var.s0(objT);
            }
            jch0.f(iko1.x(gt40VarF, (iu30) objT), 1, apo.r(1727293691, new no9(u8hVar, j, kee1VarA), x340Var), x340Var, 3072, 2);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new meh1(whb1Var, leh1Var, i, (byte) 0);
        }
    }

    public static final void j(t2j0 t2j0Var, String str, Integer num, String str2, boolean z) {
        ln60 ln60VarN = HomeFeedLoadingErrorEvent.n();
        ln60VarN.q(str);
        ln60VarN.s(z);
        if (num != null) {
            ln60VarN.r(num.intValue());
        }
        ln60VarN.n(str2);
        t2j0Var.a(ln60VarN.build());
    }

    public static final void k(t2j0 t2j0Var, String str, boolean z, boolean z2, String str2) {
        mn60 mn60VarN = HomeFeedLoadingEvent.n();
        mn60VarN.n(z);
        mn60VarN.s(str);
        mn60VarN.r(z2);
        mn60VarN.q(str2);
        t2j0Var.a(mn60VarN.build());
    }

    public static final uvx l(x340 x340Var) {
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(x340Var).b;
        cvx cvxVar2 = cbx.b(x340Var).b;
        return new uvx(0, (pgx) null, 0, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), (zzq0) null, new tvx(0.0f, 12.0f, 8.0f), (hw61) null, 0, (p3v) null, 471);
    }

    public static int m(int i, int i2) {
        return uah.l(i, (Color.alpha(i) * i2) / 255);
    }

    public static it41 n(CoordinatorLayout coordinatorLayout) {
        int childCount = coordinatorLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            NestedScrollView childAt = coordinatorLayout.getChildAt(i);
            if (childAt instanceof RecyclerView) {
                return new ks21((RecyclerView) childAt, (byte) 6);
            }
            if (childAt instanceof NestedScrollView) {
                return new bb01(childAt, (byte) 15);
            }
        }
        return a;
    }

    public static int o(Context context, int i, int i2) {
        TypedValue typedValueO = xfo1.o(context, i);
        return typedValueO != null ? typedValueO.data : i2;
    }

    public static int p(View view, int i) {
        return xfo1.r(view, i);
    }

    public static final String q(String str) {
        String m231Var;
        try {
            m231Var = Locale.forLanguageTag(str).getDisplayLanguage(Locale.getDefault());
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (m231Var instanceof m231) {
            m231Var = "";
        }
        return m231Var;
    }

    public static int r(int i, int i2) {
        return uah.i(i2, i);
    }

    public static int s(int i, int i2, float f) {
        return uah.i(uah.l(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object t(String str, onm onmVar, gw70 gw70Var) {
        vdo0 vdo0Var;
        if (onmVar instanceof vdo0) {
            vdo0Var = (vdo0) onmVar;
            int i = vdo0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                vdo0Var.b = i - Integer.MIN_VALUE;
            } else {
                vdo0Var = new vdo0(onmVar);
            }
        } else {
            vdo0Var = new vdo0(onmVar);
        }
        Object objJ = vdo0Var.a;
        int i2 = vdo0Var.b;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                ixg ixgVarF = gw70Var.f(str);
                ixgVarF.g = false;
                Single singleI = ixgVarF.i();
                vdo0Var.b = 1;
                objJ = fc11.j(singleI, vdo0Var);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objJ);
            }
            return (Bitmap) objJ;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final ArrayList u(int i, int i2, String str, String str2, List list, boolean z) {
        vv31 dv31Var;
        vv31 uu31Var;
        vv31 av31Var;
        z0e1 z0e1Var = new z0e1(i, i2);
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        int i3 = 0;
        for (Object obj : list2) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                p7h.T();
                throw null;
            }
            kye1 kye1Var = (of51) obj;
            if (kye1Var instanceof kye1) {
                kye1 kye1Var2 = kye1Var;
                int i5 = kye1Var2.a;
                dv31Var = new vv31(i5, bbp1.i(i5), kye1Var2.b, dgo1.o(str));
            } else if (!(kye1Var instanceof yde1)) {
                z0e1 z0e1Var2 = z0e1Var;
                if (kye1Var instanceof kz70) {
                    kz70 kz70Var = (kz70) kye1Var;
                    av31Var = new ev31(kz70Var.a, i3, str2, kz70Var.b, kz70Var.c, kz70Var.d, kz70Var.e, kz70Var.f, kz70Var.g);
                } else {
                    if (kye1Var instanceof j2n0) {
                        j2n0 j2n0Var = (j2n0) kye1Var;
                        dv31Var = new hv31(j2n0Var.a, dgo1.o(str), str2, j2n0Var.b, j2n0Var.c);
                    } else if (kye1Var instanceof r7f0) {
                        r7f0 r7f0Var = (r7f0) kye1Var;
                        av31Var = new gv31(r7f0Var.a, i3, str2, r7f0Var.b, r7f0Var.c, r7f0Var.d, r7f0Var.e);
                    } else if (kye1Var instanceof v710) {
                        v710 v710Var = (v710) kye1Var;
                        dv31Var = new cv31(str2, v710Var.b, v710Var.a, v710Var.c);
                    } else if (kye1Var instanceof spy) {
                        spy spyVar = (spy) kye1Var;
                        rpy rpyVar = spyVar.e;
                        int i6 = spyVar.a;
                        String str3 = spyVar.c;
                        String str4 = rpyVar.a;
                        String strY0 = (str4 == null || str4.length() == 0) ? o7h.y0(rpyVar.b, (CharSequence) null, (String) null, (String) null, th51.d, 31) : rpyVar.a;
                        cq70 cq70Var = (cq70) o7h.s0(spyVar.f);
                        String str5 = cq70Var != null ? cq70Var.b : null;
                        String str6 = str5 == null ? "" : str5;
                        String str7 = spyVar.g;
                        String str8 = str7 == null ? "" : str7;
                        String str9 = spyVar.d;
                        String str10 = spyVar.h;
                        av31Var = new av31(i6, str2, str10 == null ? "" : str10, str3, str9, strY0, str6, str8, str10 == null ? "" : str10);
                    } else if (kye1Var instanceof gw0) {
                        gw0 gw0Var = (gw0) kye1Var;
                        z0e1Var = z0e1Var2;
                        uu31Var = new uu31(gw0Var.a, gw0Var.b, str2, z0e1Var, dgo1.o(str));
                        dv31Var = uu31Var;
                    } else {
                        z0e1Var = z0e1Var2;
                        dv31Var = new dv31(kye1Var.p());
                    }
                    z0e1Var = z0e1Var2;
                }
                z0e1Var = z0e1Var2;
                dv31Var = av31Var;
            } else if (z) {
                yde1 yde1Var = (yde1) kye1Var;
                uu31Var = new sv31(yde1Var.a, i3, yde1Var.b, z0e1Var, dgo1.o(str));
                dv31Var = uu31Var;
            } else {
                yde1 yde1Var2 = (yde1) kye1Var;
                List list3 = yde1Var2.c;
                int i7 = yde1Var2.a;
                mbe1 mbe1Var = (mbe1) o7h.C0(list3);
                int i8 = mbe1Var != null ? mbe1Var.a : yde1Var2.a;
                String str11 = yde1Var2.b;
                boolean zO = dgo1.o(str);
                List<mbe1> list4 = list3;
                ArrayList arrayList2 = new ArrayList(q7h.U(list4, 10));
                for (mbe1 mbe1Var2 : list4) {
                    arrayList2.add(new tv31(mbe1Var2.a, mbe1Var2.b));
                }
                z0e1 z0e1Var3 = z0e1Var;
                dv31Var = new uv31(i7, str2, i3, i8, str11, z0e1Var3, zO, arrayList2);
                z0e1Var = z0e1Var3;
            }
            arrayList.add(dv31Var);
            i3 = i4;
        }
        return arrayList;
    }

    public static void v(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                bhn0.i(f4i1.c(i2, "at index "));
                return;
            }
        }
    }
}
