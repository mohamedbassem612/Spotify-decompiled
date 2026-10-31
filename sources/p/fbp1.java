package p;

import android.app.Activity;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.music.SpotifyMainActivity;
import io.reactivex.rxjava3.core.Observable;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.OffsetDateTime;
import j$.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class fbp1 {
    public static b180 a;
    public static b180 b;

    public static final void a(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        String str2;
        int i2;
        x340 x340Var;
        int i3;
        lw4 lw4Var;
        float f;
        drr0 drr0Var;
        qim0 qim0VarS;
        boolean z;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-337647410);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (x340Var2.g(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.i(qim0Var) ? 256 : 128;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
            String strN0 = cwl1.n0(2131962869, new Object[]{str2}, x340Var2);
            long j = ((u7h) x340Var2.k(qgx.a)).a;
            int i4 = i2;
            yae1 yae1VarQ = d5p1.q(0, x340Var2, 1);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var2).k;
            Object objT = x340Var2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = us71.i(0.0f, x340Var2);
            }
            drr0 drr0Var2 = (drr0) objT;
            Object objT2 = x340Var2.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q(Boolean.FALSE);
                x340Var2.s0(objT2);
            }
            ven0 ven0Var = (ven0) objT2;
            Object objT3 = x340Var2.T();
            if (objT3 == m4cVar) {
                objT3 = fdg1.l();
                x340Var2.s0(objT3);
            }
            lw4 lw4Var2 = (lw4) objT3;
            int i5 = i4 & 14;
            boolean zG = (i5 == 4) | x340Var2.g(lee1Var);
            Object objT4 = x340Var2.T();
            if (zG || objT4 == m4cVar) {
                i3 = i4;
                lw4Var = lw4Var2;
                f = 0.0f;
                drr0Var = drr0Var2;
                objT4 = yae1.a(yae1VarQ, str, lee1Var, 0, false, 0, jjl.b(0, Integer.MAX_VALUE, 0, 0, 13), (flb0) null, (xat) null, 988);
                x340Var2.s0(objT4);
            } else {
                drr0Var = drr0Var2;
                lw4Var = lw4Var2;
                i3 = i4;
                f = 0.0f;
            }
            y9e1 y9e1Var = (y9e1) objT4;
            fra fraVar = een.N0;
            qim0 qim0VarJ = u291.j(24.0f, f, 2, qim0Var);
            boolean z2 = (i3 & 112) == 32;
            Object objT5 = x340Var2.T();
            if (z2 || objT5 == m4cVar) {
                objT5 = new y1(function0, (byte) 20);
                x340Var2.s0(objT5);
            }
            qim0 qim0VarX = bin.x(qim0VarJ, false, null, null, null, (Function0) objT5, 15);
            boolean zG2 = x340Var2.g(strN0);
            Object objT6 = x340Var2.T();
            if (zG2 || objT6 == m4cVar) {
                objT6 = new v1(strN0, (byte) 19);
                x340Var2.s0(objT6);
            }
            qim0 qim0VarB = s161.b(qim0VarX, false, (iu30) objT6);
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            String strO0 = cwl1.o0(x340Var2, 2131952030);
            lee1 lee1Var2 = cbx.d(x340Var2).j;
            cjc0 cjc0Var = new cjc0(1);
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0Var2 = nim0.a;
            uwo1.e(strO0, uyn1.B(qim0Var2, 0.0f, 0.0f, 4.0f, 0.0f, 11), lee1Var2, 0L, null, null, 2, false, cjc0Var, 0, null, x340Var2, 0, 0, 1720);
            lee1 lee1Var3 = cbx.d(x340Var2).k;
            cjc0 cjc0Var2 = new cjc0(1);
            wnb0 wnb0Var = new wnb0(1.0f, true);
            boolean zI = x340Var2.i(drr0Var) | x340Var2.i(ven0Var) | x340Var2.i(y9e1Var);
            Object objT7 = x340Var2.T();
            if (zI || objT7 == m4cVar) {
                objT7 = new t6(y9e1Var, drr0Var, ven0Var, (byte) 7);
                x340Var2.s0(objT7);
            }
            qim0 qim0VarU = lrn1.u(wnb0Var, (iu30) objT7);
            if (((Boolean) ven0Var.getValue()).booleanValue()) {
                x340Var2.i0(-303878883);
                lw4 lw4Var3 = lw4Var;
                boolean zI2 = x340Var2.i(lw4Var3) | x340Var2.f(j);
                Object objT8 = x340Var2.T();
                if (zI2 || objT8 == m4cVar) {
                    z = false;
                    objT8 = new n82(lw4Var3, j, (byte) 0);
                    x340Var2.s0(objT8);
                } else {
                    z = false;
                }
                qim0VarS = exd0.s(qim0Var2, (iu30) objT8);
                x340Var2.r(z);
            } else {
                x340Var2.i0(-303446030);
                x340Var2.r(false);
                qim0VarS = qim0Var2;
            }
            uwo1.e(str, e9k.n(62, qim0VarU.then(qim0VarS)), lee1Var3, 0L, null, null, 0, false, cjc0Var2, 0, null, x340Var2, i5, 0, 1784);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new o82(str, function0, qim0Var, i, (byte) 0);
        }
    }

    public static final void b(Function0 function0, Function0 function1, b0k b0kVar, int i) {
        Function0 function2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1083851052);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | (x340Var.i(function1) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131960218);
            String strO1 = cwl1.o0(x340Var, 2131960217);
            String strO2 = cwl1.o0(x340Var, 2131960216);
            z50 z50Var = z50.c;
            function2 = function0;
            mqo1.d(function2, null, null, strO0, strO1, new zgx(strO2, new gbx(z50Var, function0)), new zgx(cwl1.o0(x340Var, 2131960215), new gbx(z50Var, function1)), x340Var, (i2 & 14) | 2359296, 6);
        } else {
            function2 = function0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n4d(function2, function1, i, (byte) 14);
        }
    }

    public static final void c(Function0 function0, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(2001085141);
        j06 j06Var = ((x340) b0kVar3).a;
        int i2 = (b0kVar3.i(function0) ? 4 : 2) | i;
        if (b0kVar3.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            boolean z = ((x340) b0kVar3).S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, b0kVar3, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar3, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar3, lljVar3);
            nko1.F(b0kVar3);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar3, lljVar4);
            rqo1.g(0, 0, b0kVar3, uyn1.z(16.0f, 0.0f, 2, nim0Var));
            qim0 qim0VarY = uyn1.y(bin.x(u291.f(nim0Var, 1.0f), false, null, null, null, function0, 15), 16.0f, 8.0f);
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, b0kVar3, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM2 = b0kVar3.m();
            qim0 qim0VarE2 = zr7.E(b0kVar3, qim0VarY);
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            nko1.H(mbhVarA2, b0kVar3, lljVar);
            nko1.H(xos0VarM2, b0kVar3, lljVar2);
            x0d.q(iHashCode2, b0kVar3, lljVar3, b0kVar3);
            nko1.H(qim0VarE2, b0kVar3, lljVar4);
            uwo1.e(cwl1.o0(b0kVar3, 2131960220), null, cbx.d(b0kVar3).g, cbx.a(b0kVar3).b.d, null, null, 0, false, null, 0, null, b0kVar3, 0, 0, 2034);
            b0kVar2 = b0kVar3;
            uwo1.e(cwl1.o0(b0kVar2, 2131960219), uyn1.B(nim0Var, 0.0f, 2.0f, 0.0f, 0.0f, 13), cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.b, null, null, 0, false, null, 0, null, b0kVar3, 0, 0, 2032);
            b0kVar2.r(true);
            b0kVar2.r(true);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new bvk(function0, i, (byte) 14);
        }
    }

    public static final void d(int i, j2i j2iVar, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-802621284);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = pl21.W0;
                x340Var.s0(objT);
            }
            qim0 qim0VarA = s161.a(qim0VarF, (iu30) objT);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarA);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            dv20.l(6, j2iVar, x340Var, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new klb((byte) 8, i, j2iVar, qim0Var);
        }
    }

    public static final void e(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-699000833);
        nim0 nim0Var = nim0.a;
        int i2 = (x340Var.g(nim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            t1c.a(dug.f(u291.d(nim0Var, 1.0f), u7h.b, d4o1.a), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ry90(i, (byte) 10);
        }
    }

    public static final void f(yg8 yg8Var, vxf0 vxf0Var, boolean z, xm41 xm41Var, jxa jxaVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(848251630);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.e(yg8Var == null ? -1 : yg8Var.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(vxf0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(xm41Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? b0kVar3.g(jxaVar) : b0kVar3.i(jxaVar) ? 16384 : 8192;
        }
        int i3 = i2 | 196608;
        if (b0kVar3.Y(i3 & 1, (74899 & i3) != 74898)) {
            boolean z2 = (i3 & 14) == 4;
            Object objT = b0kVar3.T();
            if (z2 || objT == fkj0.X) {
                objT = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            iho1.j(nho1.E(xm41Var, b0kVar3), apo.r(-1128835912, new tf(yg8Var, (ven0) objT, vxf0Var, z, jxaVar), b0kVar3), apo.r(-363374554, new ry90((byte) 11, 2, false), b0kVar3), null, null, b0kVar2, 440, 24);
            qim0Var2 = nim0.a;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new si2((byte) 18, i, yg8Var, vxf0Var, xm41Var, jxaVar, qim0Var2, z);
        }
    }

    public static final void g(iu30 iu30Var, vho vhoVar, yf yfVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        yf yfVar2;
        b0k b0kVar2;
        jax haxVar;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-296696182);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.g(vhoVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            yfVar2 = yfVar;
            i2 |= b0kVar3.g(yfVar2) ? 256 : 128;
        } else {
            yfVar2 = yfVar;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.g(qim0Var) ? 2048 : 1024;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            if (vhoVar.a) {
                b0kVar3.i0(-1657175604);
                haxVar = new hax(cwl1.o0(b0kVar3, 2131954741));
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-1657177090);
                b0kVar3.r(false);
                haxVar = jax.a;
            }
            gdx gdxVarS = yla.s(b0kVar3);
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0Var);
            boolean z = (i2 & 14) == 4;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new azr0(iu30Var, (byte) 28);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            foo1.d(false, (iu30) objT, yfVar2, qim0VarZ, null, haxVar, gdxVarS, null, null, null, null, h9j.a, h9j.b, b0kVar2, (i2 & 896) | 6, 432, 1936);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new tjv0(iu30Var, vhoVar, yfVar, qim0Var, i, (byte) 0);
        }
    }

    public static final void h(vho vhoVar, jho jhoVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1022808950);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(vhoVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(jhoVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(qim0Var) ? 2048 : 1024;
        }
        if (!x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            x340Var.b0();
        } else if (vhoVar.c) {
            x340Var.i0(-2003201015);
            j(iu30Var, vhoVar, jhoVar.a, qim0Var, x340Var, ((i2 >> 6) & 14) | ((i2 << 3) & 112) | (i2 & 7168));
            x340Var.r(false);
        } else {
            x340Var.i0(-2003116540);
            g(iu30Var, vhoVar, jhoVar.b, qim0Var, x340Var, ((i2 >> 6) & 14) | ((i2 << 3) & 112) | (i2 & 7168));
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lzs0(vhoVar, jhoVar, iu30Var, qim0Var, i, (byte) 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:104:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:107:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:121:0x0226  */
    /* JADX WARN: Code duplicated, block: B:149:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:173:0x0343  */
    /* JADX WARN: Code duplicated, block: B:301:0x01c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:311:0x0229 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:89:0x01bc A[PHI: r7
      0x01bc: PHI (r7v66 j$.time.Instant) = (r7v52 j$.time.Instant), (r7v56 j$.time.Instant), (r7v60 j$.time.Instant) binds: [B:69:0x017a, B:78:0x0197, B:87:0x01b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:98:0x01dc  */
    public static final void i(rr21 rr21Var, d0r d0rVar, yqg yqgVar, jxp jxpVar, jxp jxpVar2, nr21 nr21Var, iu30 iu30Var, b0k b0kVar, int i) {
        List list;
        afx afxVar;
        u7h u7hVar;
        long j;
        long j2;
        String strY0;
        boolean z;
        String str;
        boolean z2;
        Object obj;
        Object obj2;
        Boolean bool;
        String str2;
        Object next;
        String string;
        ven0 ven0Var;
        xkk1 xkk1Var;
        mq70 mq70Var;
        up70 up70VarA;
        Object obj3;
        jo70 jo70Var;
        m6k m6kVar;
        xkk1 xkk1Var2;
        mmr0 mmr0Var;
        dr21 dr21Var;
        m231 m231Var;
        m231 m231Var2;
        m231 m231Var3;
        fr21 fr21Var;
        ZoneOffset m231Var4;
        ZoneOffset zoneOffset;
        rnt rntVar;
        rnt rntVar2;
        String string2;
        m4c m4cVar = fkj0.X;
        String str3 = rr21Var.a;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(946583328);
        int i2 = (b0kVar2.i(iu30Var) ? 1048576 : 524288) | i | (b0kVar2.g(rr21Var) ? 4 : 2) | (b0kVar2.i(d0rVar) ? 32 : 16) | (b0kVar2.g(yqgVar) ? 256 : 128) | (b0kVar2.i(jxpVar) ? 2048 : 1024) | (b0kVar2.i(jxpVar2) ? 16384 : 8192) | (b0kVar2.i(nr21Var) ? 131072 : 65536);
        if (b0kVar2.Y(i2 & 1, (599187 & i2) != 599186)) {
            List list2 = rr21Var.e;
            List list3 = rr21Var.f;
            List listJ0 = o7h.j0(o7h.N0(list3, list2));
            boolean zG = b0kVar2.g(d0rVar) | b0kVar2.g(listJ0);
            Object objT = b0kVar2.T();
            z6x z6xVar = z6x.a;
            if (zG || objT == m4cVar) {
                list = listJ0;
                if (listJ0.isEmpty()) {
                    objT = new huz(z6xVar, (byte) 10);
                } else {
                    List list4 = list;
                    ArrayList arrayList = new ArrayList(q7h.U(list4, 10));
                    for (Iterator it = list4.iterator(); it.hasNext(); it = it) {
                        arrayList.add(d3p1.F(d0rVar, hr21.b, (String) it.next()));
                    }
                    objT = new z4t0((mr20[]) o7h.l1(arrayList).toArray(new mr20[0]), (byte) 6);
                }
                b0kVar2.s0(objT);
            } else {
                list = listJ0;
            }
            ven0 ven0VarJ = f4p1.j((mr20) objT, z6xVar, (iac0) null, b0kVar2, 48, 14);
            o3r o3rVar = hr21.a;
            ArrayList<mmr0> arrayListV1 = o7h.v1(list, (List) ven0VarJ.getValue());
            ArrayList arrayList2 = new ArrayList();
            for (mmr0 mmr0Var2 : arrayListV1) {
                String str4 = (String) mmr0Var2.a;
                i1r i1rVar = (k1r) mmr0Var2.b;
                i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
                if (i1rVar2 == null || (dr21Var = (dr21) i1rVar2.a) == null) {
                    i2 = i2;
                } else {
                    o3r o3rVar2 = hr21.a;
                    long jB = yqgVar.b();
                    lhe0 lhe0Var = dr21Var.b;
                    yqk yqkVar = dr21Var.a.c;
                    try {
                        m231Var = Instant.parse(yqkVar.a.a);
                    } catch (Throwable th) {
                        m231Var = new m231(th);
                    }
                    if (m231Var instanceof m231) {
                        m231Var = null;
                    }
                    Instant instant = (Instant) m231Var;
                    if (instant == null) {
                        try {
                            m231Var2 = OffsetDateTime.parse(yqkVar.a.a).toInstant();
                        } catch (Throwable th2) {
                            m231Var2 = new m231(th2);
                        }
                        if (m231Var2 instanceof m231) {
                            m231Var2 = null;
                        }
                        instant = (Instant) m231Var2;
                        if (instant == null) {
                            try {
                                m231Var3 = LocalDateTime.parse(yqkVar.a.a).toInstant(ZoneOffset.UTC);
                            } catch (Throwable th3) {
                                m231Var3 = new m231(th3);
                            }
                            if (m231Var3 instanceof m231) {
                                m231Var3 = null;
                            }
                            instant = (Instant) m231Var3;
                            if (instant == null) {
                                fr21Var = null;
                            } else if (instant.toEpochMilli() < jB) {
                                fr21Var = null;
                            } else {
                                try {
                                    m231Var4 = ZoneOffset.ofTotalSeconds(yqkVar.a.b * 60);
                                } catch (Throwable th4) {
                                    m231Var4 = new m231(th4);
                                }
                                if (m231Var4 instanceof m231) {
                                    m231Var4 = null;
                                }
                                zoneOffset = m231Var4;
                                if (zoneOffset == null) {
                                    fr21Var = null;
                                } else {
                                    rntVar = lhe0Var.b;
                                    if (rntVar instanceof rnt) {
                                        rntVar2 = rntVar;
                                    } else {
                                        rntVar2 = null;
                                    }
                                    if (rntVar2 != null || (string2 = ihc1.e1(rntVar2.a).toString()) == null) {
                                        fr21Var = null;
                                    } else {
                                        String str5 = string2.length() > 0 ? string2 : null;
                                        if (str5 == null) {
                                            fr21Var = null;
                                        } else {
                                            fr21Var = new fr21(str4, instant, zoneOffset, str5, lhe0Var.a);
                                        }
                                    }
                                }
                            }
                        } else if (instant.toEpochMilli() < jB) {
                            fr21Var = null;
                        } else {
                            m231Var4 = ZoneOffset.ofTotalSeconds(yqkVar.a.b * 60);
                            if (m231Var4 instanceof m231) {
                                m231Var4 = null;
                            }
                            zoneOffset = m231Var4;
                            if (zoneOffset == null) {
                                fr21Var = null;
                            } else {
                                rntVar = lhe0Var.b;
                                if (rntVar instanceof rnt) {
                                    rntVar2 = rntVar;
                                } else {
                                    rntVar2 = null;
                                }
                                if (rntVar2 != null) {
                                    fr21Var = null;
                                } else {
                                    fr21Var = null;
                                }
                            }
                        }
                    } else if (instant.toEpochMilli() < jB) {
                        fr21Var = null;
                    } else {
                        m231Var4 = ZoneOffset.ofTotalSeconds(yqkVar.a.b * 60);
                        if (m231Var4 instanceof m231) {
                            m231Var4 = null;
                        }
                        zoneOffset = m231Var4;
                        if (zoneOffset == null) {
                            fr21Var = null;
                        } else {
                            rntVar = lhe0Var.b;
                            if (rntVar instanceof rnt) {
                                rntVar2 = rntVar;
                            } else {
                                rntVar2 = null;
                            }
                            if (rntVar2 != null) {
                                fr21Var = null;
                            } else {
                                fr21Var = null;
                            }
                        }
                    }
                    mmr0Var = fr21Var != null ? new mmr0(str4, fr21Var) : null;
                    if (mmr0Var != null) {
                        arrayList2.add(mmr0Var);
                    }
                    i2 = i2;
                }
                if (mmr0Var != null) {
                    arrayList2.add(mmr0Var);
                }
                i2 = i2;
            }
            int i3 = i2;
            Map mapT = sqg0.T(arrayList2);
            List listJ1 = o7h.j0(o7h.N0(list3, list2));
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = listJ1.iterator();
            while (it2.hasNext()) {
                fr21 fr21Var2 = (fr21) mapT.get((String) it2.next());
                if (fr21Var2 != null) {
                    arrayList3.add(fr21Var2);
                }
            }
            List listD1 = o7h.d1(arrayList3, 3);
            boolean zG2 = b0kVar2.g(d0rVar) | b0kVar2.g(str3);
            Object objT2 = b0kVar2.T();
            Object obj4 = objT2;
            if (zG2 || objT2 == m4cVar) {
                ay8 ay8VarF = d3p1.F(d0rVar, hr21.a, str3);
                b0kVar2.s0(ay8VarF);
                obj4 = ay8VarF;
            }
            i1r i1rVar3 = (k1r) f4p1.k((zob1) obj4, (iac0) null, b0kVar2, 7).getValue();
            i1r i1rVar4 = i1rVar3 instanceof i1r ? i1rVar3 : null;
            cr21 cr21Var = i1rVar4 != null ? (cr21) i1rVar4.a : null;
            if (cr21Var == null || (xkk1Var2 = cr21Var.a) == null) {
                afxVar = null;
            } else {
                pp70 pp70Var = xkk1Var2.d;
                if (pp70Var != null) {
                    afxVar = pp70Var.c;
                } else {
                    pp70 pp70Var2 = xkk1Var2.a.b;
                    if (pp70Var2 != null) {
                        afxVar = pp70Var2.c;
                    } else {
                        afxVar = null;
                    }
                }
            }
            if (afxVar != null) {
                u7hVar = new u7h(afxVar.b.b);
            } else {
                Integer num = rr21Var.d;
                u7hVar = num != null ? new u7h(z4p1.e(num.intValue())) : null;
            }
            if (u7hVar == null) {
                b0kVar2.i0(-866433756);
                uwr uwrVar = cbx.a;
                j = cbx.a(b0kVar2).b.a;
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(-866436422);
                b0kVar2.r(false);
                j = u7hVar.a;
            }
            long j3 = j;
            u7h u7hVar2 = afxVar != null ? new u7h(afxVar.a.c) : null;
            if (u7hVar2 == null) {
                b0kVar2.i0(-866431228);
                uwr uwrVar2 = cbx.a;
                j2 = cbx.a(b0kVar2).a.c;
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(-866432933);
                b0kVar2.r(false);
                j2 = u7hVar2.a;
            }
            long j4 = j2;
            if (cr21Var == null || (m6kVar = cr21Var.c) == null) {
                strY0 = null;
            } else {
                strY0 = m6kVar.g;
                if (ihc1.y0(strY0)) {
                    strY0 = null;
                }
            }
            if (strY0 == null) {
                b0kVar2.i0(-1089396952);
                List list5 = (cr21Var == null || (jo70Var = cr21Var.d) == null) ? null : jo70Var.d;
                if (list5 == null) {
                    b0kVar2.i0(-1089428573);
                    z = false;
                    b0kVar2.r(false);
                    strY0 = null;
                } else {
                    b0kVar2.i0(-866426850);
                    List list6 = list5;
                    Object objT3 = b0kVar2.T();
                    if (objT3 == m4cVar) {
                        obj3 = objT3;
                        pl21 pl21Var = pl21.Y0;
                        b0kVar2.s0(pl21Var);
                        obj3 = pl21Var;
                    }
                    obj3 = objT3;
                    strY0 = o7h.y0(list6, ", ", (String) null, (String) null, (iu30) obj3, 30);
                    z = false;
                    b0kVar2.r(false);
                }
                if (strY0 == null || ihc1.y0(strY0)) {
                    strY0 = null;
                }
            } else {
                z = false;
                b0kVar2.i0(-866430170);
            }
            b0kVar2.r(z);
            if (strY0 == null) {
                strY0 = rr21Var.c;
            }
            String str6 = strY0;
            if (cr21Var == null || (xkk1Var = cr21Var.a) == null || (mq70Var = xkk1Var.a) == null || (up70VarA = mq70Var.a(vp70.e)) == null || (str = up70VarA.a.a) == null) {
                str = rr21Var.b;
            }
            String str7 = str;
            Object objT4 = b0kVar2.T();
            Object obj5 = objT4;
            if (objT4 == m4cVar) {
                n521 n521Var = n521.t;
                b0kVar2.s0(n521Var);
                obj5 = n521Var;
            }
            kes kesVarB = lkr0.b(0, (Function0) obj5, b0kVar2, 384, 3);
            Object[] objArr = new Object[0];
            Object objT5 = b0kVar2.T();
            Object obj6 = objT5;
            if (objT5 == m4cVar) {
                n521 n521Var2 = n521.X;
                b0kVar2.s0(n521Var2);
                obj6 = n521Var2;
            }
            ven0 ven0Var2 = (ven0) k5p1.s(objArr, (Function0) obj6, b0kVar2, 48);
            boolean zI = ((i3 & 3670016) == 1048576) | b0kVar2.i(nr21Var) | b0kVar2.i(kesVarB);
            Object objT6 = b0kVar2.T();
            if (zI || objT6 == m4cVar) {
                z2 = false;
                ir21 ir21Var = new ir21(iu30Var, nr21Var, kesVarB, (byte) 0);
                b0kVar2.s0(ir21Var);
                obj = ir21Var;
            } else {
                z2 = false;
                obj = objT6;
            }
            q3p1.b(z2 ? 1 : 0, 1, (Function0) obj, b0kVar2, z2);
            Object objK = b0kVar2.k(t4k.n);
            flb0 flb0Var = flb0.b;
            boolean z3 = z2 ? 1 : 0;
            if (objK == flb0Var) {
                z2 = true;
            }
            Object objT7 = b0kVar2.T();
            Object obj7 = objT7;
            if (objT7 == m4cVar) {
                hrr0 hrr0VarQ = v8r.q(Boolean.FALSE);
                b0kVar2.s0(hrr0VarQ);
                obj7 = hrr0VarQ;
            }
            ven0 ven0Var3 = (ven0) obj7;
            boolean zI2 = b0kVar2.i(kesVarB) | b0kVar2.i(ven0Var3);
            Object objT8 = b0kVar2.T();
            if (zI2 || objT8 == m4cVar) {
                pc01 pc01Var = new pc01(kesVarB, ven0Var3, (lnm) null, (byte) 1);
                b0kVar2.s0(pc01Var);
                obj2 = pc01Var;
            } else {
                obj2 = objT8;
            }
            qxd0.t(kesVarB, b0kVar2, (vu30) obj2);
            Boolean boolValueOf = Boolean.valueOf(z2);
            boolean zI3 = b0kVar2.i(kesVarB) | b0kVar2.i(ven0Var3) | b0kVar2.i(nr21Var) | b0kVar2.h(z2);
            Object objT9 = b0kVar2.T();
            if (zI3 || objT9 == m4cVar) {
                bool = boolValueOf;
                str2 = null;
                du2 du2Var = new du2(kesVarB, ven0Var3, nr21Var, z2, (lnm) null, (byte) 16);
                b0kVar2.s0(du2Var);
                objT9 = du2Var;
            } else {
                bool = boolValueOf;
                str2 = null;
            }
            qxd0.r(kesVarB, nr21Var, bool, (vu30) objT9, b0kVar2);
            Object objT10 = b0kVar2.T();
            Object obj8 = objT10;
            if (objT10 == m4cVar) {
                c9n c9nVarM = qxd0.M(o6x.a, b0kVar2);
                b0kVar2.s0(c9nVarM);
                obj8 = c9nVarM;
            }
            c9n c9nVar = (c9n) obj8;
            Iterator it3 = listD1.iterator();
            do {
                if (!it3.hasNext()) {
                    next = str2;
                    break;
                }
                next = it3.next();
            } while (!((fr21) next).a.equals((String) ven0Var2.getValue()));
            fr21 fr21Var3 = (fr21) next;
            if (fr21Var3 == null) {
                fr21Var3 = (fr21) o7h.s0(listD1);
            }
            long j5 = rr21Var.i;
            boolean zG3 = b0kVar2.g(jxpVar);
            Object objT11 = b0kVar2.T();
            if (zG3 || objT11 == m4cVar) {
                tr21 tr21Var = new tr21(((sjs) jxpVar.get()).a, (byte) 0);
                b0kVar2.s0(tr21Var);
                objT11 = tr21Var;
            }
            xpw xpwVar = (xpw) objT11;
            boolean zG4 = b0kVar2.g(jxpVar2);
            Object objT12 = b0kVar2.T();
            Object obj9 = objT12;
            if (zG4 || objT12 == m4cVar) {
                hpd0 hpd0Var = (hpd0) jxpVar2.get();
                b0kVar2.s0(hpd0Var);
                obj9 = hpd0Var;
            }
            hpd0 hpd0Var2 = (hpd0) obj9;
            String strO0 = cwl1.o0(b0kVar2, 2131961295);
            o3r o3rVar3 = hr21.a;
            Iterator it4 = f46.I(new String[]{rr21Var.g, rr21Var.h}).iterator();
            do {
                if (!it4.hasNext()) {
                    string = str2;
                    break;
                }
                String str8 = (String) it4.next();
                if (str8 == null || (string = ihc1.e1(str8).toString()) == null || string.length() <= 0) {
                    string = str2;
                }
            } while (string == null);
            if (string != null) {
                strO0 = string;
            }
            String gs21Var = fr21Var3 != null ? new gs21(str6, cwl1.o0(b0kVar2, 2131961294), str7, fr21Var3.b.toEpochMilli(), fr21Var3.c.getTotalSeconds() / 60, fr21Var3.d, z4p1.G(j4), z4p1.G(j3)) : str2;
            boolean zG5 = b0kVar2.g(gs21Var);
            Object objT13 = b0kVar2.T();
            Object obj10 = objT13;
            if (zG5 || objT13 == m4cVar) {
                hrr0 hrr0VarQ2 = v8r.q(str2);
                b0kVar2.s0(hrr0VarQ2);
                obj10 = hrr0VarQ2;
            }
            ven0 ven0Var4 = (ven0) obj10;
            boolean zI4 = b0kVar2.i(gs21Var) | b0kVar2.i(ven0Var4) | b0kVar2.i(hpd0Var2);
            String str9 = gs21Var;
            Object objT14 = b0kVar2.T();
            if (zI4 || objT14 == m4cVar) {
                ven0Var = ven0Var4;
                objT14 = new elu0(str9, hpd0Var2, ven0Var, str2, (byte) 23);
                b0kVar2.s0(objT14);
            } else {
                ven0Var = ven0Var4;
            }
            qxd0.s(str9, hpd0Var2, (vu30) objT14, b0kVar2);
            qim0 qim0VarD = u291.d(nim0.a, 1.0f);
            gra graVar = een.h;
            mr21 mr21Var = new mr21(rr21Var, kesVarB, ven0Var3, nr21Var, iu30Var, c9nVar, j3, listD1, strO0, ven0Var2, xpwVar, str6, str7, cr21Var, j5, yqgVar, j4, fr21Var3, ven0Var);
            b0kVar2 = b0kVar2;
            w2g0.c(qim0VarD, graVar, apo.r(34624886, mr21Var, b0kVar2), b0kVar2, 3072, 4);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ydi0((Object) rr21Var, (Object) d0rVar, (Object) yqgVar, (Object) jxpVar, (Object) jxpVar2, (Object) nr21Var, (Object) iu30Var, i, (byte) 12);
        }
    }

    public static final void j(iu30 iu30Var, vho vhoVar, yf yfVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        yf yfVar2;
        b0k b0kVar2;
        jax haxVar;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-2129130503);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.g(vhoVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            yfVar2 = yfVar;
            i2 |= b0kVar3.g(yfVar2) ? 256 : 128;
        } else {
            yfVar2 = yfVar;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.g(qim0Var) ? 2048 : 1024;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            if (vhoVar.a) {
                b0kVar3.i0(-1689966853);
                haxVar = new hax(cwl1.o0(b0kVar3, 2131954741));
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-1689968339);
                b0kVar3.r(false);
                haxVar = jax.a;
            }
            gdx gdxVarS = yla.s(b0kVar3);
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0Var);
            boolean z = (i2 & 14) == 4;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new azr0(iu30Var, (byte) 29);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            foo1.d(true, (iu30) objT, yfVar2, qim0VarZ, null, haxVar, gdxVarS, null, null, null, null, h9j.c, h9j.d, b0kVar2, (i2 & 896) | 6, 432, 1936);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new tjv0(iu30Var, vhoVar, yfVar, qim0Var, i, (byte) 1);
        }
    }

    public static final void k(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(658754742);
        if (x340Var.Y(i & 1, i != 0)) {
            jch0.f(dm5.I(et40.a), 1, apo.r(-1236377574, new ye6(s3v.b(((s3v) x340Var.k(p4k.a)).a), x340Var.k(p4k.b), (byte) 10), x340Var), x340Var, 3072, 2);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new fk01(i, (byte) 24);
        }
    }

    public static final void l(int i, j2i j2iVar, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-46931992);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarB = uyn1.B(qim0Var2, 0.0f, 16.0f, 0.0f, 24.0f, 5);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarF = u291.f(too1.y(qim0VarB, new bgc0(lhc.g(x340Var).g, 32)), 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            ywx0.l(54, j2iVar, h2c.a, x340Var, true);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new klb((byte) 3, i, j2iVar, qim0Var);
        }
    }

    public static final vh0 m(Activity activity) {
        return activity instanceof SpotifyMainActivity ? ((SpotifyMainActivity) activity).p0() : (vh0) activity;
    }

    public static final Observable n(uu00 uu00Var, String str, List list, iu30 iu30Var) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (f7p1.m((String) obj)) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        int iS = zno1.s(q7h.U(arrayList, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (Object obj2 : arrayList) {
            mq70 mq70Var = (mq70) iu30Var.invoke(d7p1.k((String) obj2));
            linkedHashMap.put(obj2, (mq70Var == null || mq70Var.a.isEmpty()) ? tu21.a : new vu21(mq70Var));
        }
        if (arrayList2.isEmpty()) {
            return Observable.just(linkedHashMap);
        }
        Observable map = ((zu00) uu00Var).b(new oi(str, false, new bic1(arrayList2, (byte) 9))).map(new zrj1(arrayList2, linkedHashMap, iu30Var, (byte) 8));
        int iS2 = zno1.s(q7h.U(arrayList2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS2 >= 16 ? iS2 : 16);
        for (Object obj3 : arrayList2) {
            linkedHashMap2.put(obj3, uu21.a);
        }
        return map.startWithItem(sqg0.O(linkedHashMap2, linkedHashMap)).distinctUntilChanged();
    }

    public static void o(lsl lslVar, boolean z, long j) {
        float fX0 = lslVar.X0(16.0f);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(z ? 0.0f : Float.intBitsToFloat((int) (lslVar.j() >> 32)) - fX0)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lslVar.j() & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(fX0)) << 32);
        List listM = p7h.M(new u7h[]{new u7h(u7h.j), new u7h(j)});
        float fIntBitsToFloat = z ? 0.0f : Float.intBitsToFloat((int) (lslVar.j() >> 32));
        if (!z) {
            fX0 = Float.intBitsToFloat((int) (lslVar.j() >> 32)) - fX0;
        }
        DrawScope.S0(lslVar, v9c.h(listM, fIntBitsToFloat, fX0, 8), jFloatToRawIntBits, jFloatToRawIntBits2, 0.0f, (DrawStyle) null, (ColorFilter) null, 6, 56);
    }

    public static final String p(int i) {
        if (i == -100) {
            return "INTERNAL_ERROR";
        }
        if (i == -12) {
            return "GOOGLE_SERVER_UNAVAILABLE";
        }
        if (i == -3) {
            return "NETWORK_ERROR";
        }
        if (i == -2) {
            return "PLAY_STORE_NOT_FOUND";
        }
        if (i == -1) {
            return "API_NOT_AVAILABLE";
        }
        if (i == 0) {
            return "NO_ERROR";
        }
        switch (i) {
            case -19:
                return "INTEGRITY_TOKEN_PROVIDER_INVALID";
            case -18:
                return "CLIENT_TRANSIENT_ERROR";
            case -17:
                return "REQUEST_HASH_TOO_LONG";
            case -16:
                return "CLOUD_PROJECT_NUMBER_IS_INVALID";
            case SplitInstallErrorCode.APP_NOT_OWNED /* -15 */:
                return "PLAY_SERVICES_VERSION_OUTDATED";
            case SplitInstallErrorCode.PLAY_STORE_NOT_FOUND /* -14 */:
                return "PLAY_STORE_VERSION_OUTDATED";
            default:
                switch (i) {
                    case SplitInstallErrorCode.SERVICE_DIED /* -9 */:
                        return "CANNOT_BIND_TO_SERVICE";
                    case SplitInstallErrorCode.INCOMPATIBLE_WITH_EXISTING_SESSION /* -8 */:
                        return "TOO_MANY_REQUESTS";
                    case SplitInstallErrorCode.ACCESS_DENIED /* -7 */:
                        return "APP_UID_MISMATCH";
                    case SplitInstallErrorCode.NETWORK_ERROR /* -6 */:
                        return "PLAY_SERVICES_NOT_FOUND";
                    case SplitInstallErrorCode.API_NOT_AVAILABLE /* -5 */:
                        return "APP_NOT_INSTALLED";
                    default:
                        return "UNKNOWN_ERROR";
                }
        }
    }

    public static yxk0 q() {
        return new yxk0((byte) 1);
    }

    public static final bge r(mr20 mr20Var, long j) {
        return h4p1.g(new d6(mr20Var, j, (lnm) null, (byte) 12));
    }
}
