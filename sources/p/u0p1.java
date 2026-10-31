package p;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Status;
import j$.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class u0p1 {
    public static b180 a;
    public static b180 b;

    public static final void a(boolean z, aa9 aa9Var, iu30 iu30Var, qim0 qim0Var, boolean z2, boolean z3, int i, b0k b0kVar, int i2) {
        int i3;
        int i4;
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-587857606);
        if ((i2 & 6) == 0) {
            i3 = (b0kVar3.h(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? b0kVar3.g(aa9Var) : b0kVar3.i(aa9Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= b0kVar3.i(iu30Var) ? 256 : 128;
        }
        int i5 = i3 | 3072;
        if ((i2 & 24576) == 0) {
            i5 |= b0kVar3.h(z2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i5 |= b0kVar3.h(z3) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 = i;
            i5 |= b0kVar3.e(i4) ? 1048576 : 524288;
        } else {
            i4 = i;
        }
        if (b0kVar3.Y(i5 & 1, (599187 & i5) != 599186)) {
            b0kVar2 = b0kVar3;
            irn1.u(null, null, null, null, apo.r(1800625249, new da9(z, aa9Var, iu30Var, i4, z2, z3), b0kVar3), b0kVar2, 24576, 15);
            qim0Var2 = nim0.a;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new mf6(z, aa9Var, iu30Var, qim0Var2, z2, z3, i, i2);
        }
    }

    public static final void b(boolean z, aa9 aa9Var, iu30 iu30Var, int i, boolean z2, boolean z3, vzq0 vzq0Var, b0k b0kVar, int i2) {
        int i3;
        x340 x340Var;
        int i4;
        q2c1 q2c1Var;
        h7t0 h7t0Var;
        qim0 qim0VarB;
        q2c1 q2c1Var2;
        int i5;
        x340 x340Var2;
        m4c m4cVar;
        boolean z4;
        boolean z5;
        boolean z6 = z;
        aa9 aa9Var2 = aa9Var;
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.k0(-929052073);
        if ((i2 & 6) == 0) {
            i3 = (x340Var3.h(z6) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? x340Var3.g(aa9Var2) : x340Var3.i(aa9Var2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var3.i(iu30Var) ? 256 : 128;
        }
        int i6 = i2 & 3072;
        qim0 qim0Var = nim0.a;
        if (i6 == 0) {
            i3 |= x340Var3.i(qim0Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= x340Var3.e(i) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i3 |= x340Var3.h(z2) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= x340Var3.h(z3) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= x340Var3.i(vzq0Var) ? 8388608 : 4194304;
        }
        if (x340Var3.Y(i3 & 1, (i3 & 4793491) != 4793490)) {
            x340Var3.d0();
            if ((i2 & 1) != 0 && !x340Var3.E()) {
                x340Var3.b0();
            }
            x340Var3.s();
            Object objT = x340Var3.T();
            m4c m4cVar2 = fkj0.X;
            if (objT == m4cVar2) {
                objT = new q2c1(1, iu30Var);
                x340Var3.s0(objT);
            }
            q2c1 q2c1Var3 = (q2c1) objT;
            Object objT2 = x340Var3.T();
            if (objT2 == m4cVar2) {
                objT2 = new h7t0(iu30Var);
                x340Var3.s0(objT2);
            }
            h7t0 h7t0Var2 = (h7t0) objT2;
            Object objT3 = x340Var3.T();
            if (objT3 == m4cVar2) {
                objT3 = new q2c1(2, iu30Var);
                x340Var3.s0(objT3);
            }
            q2c1 q2c1Var4 = (q2c1) objT3;
            Object[] objArr = new Object[0];
            int i7 = i3;
            boolean z7 = (i3 & 57344) == 16384;
            Object objT4 = x340Var3.T();
            if (z7 || objT4 == m4cVar2) {
                i4 = 0;
                objT4 = new ia9(i, (byte) 0);
                x340Var3.s0(objT4);
            } else {
                i4 = 0;
            }
            err0 err0Var = (hdn0) k5p1.s(objArr, (Function0) objT4, x340Var3, i4);
            if (aa9Var2.f) {
                q2c1Var = q2c1Var4;
                h7t0Var = h7t0Var2;
                qim0VarB = d1u.E(1.0f, u7h.g, uyn1.B(qim0Var, 0.0f, vzq0Var.d(), 0.0f, 0.0f, 13), d4o1.a);
            } else {
                q2c1Var = q2c1Var4;
                h7t0Var = h7t0Var2;
                qim0VarB = uyn1.B(qim0Var, 0.0f, vzq0Var.d(), 0.0f, 0.0f, 13);
            }
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var3, 0);
            int iHashCode = Long.hashCode(x340Var3.T);
            xos0 xos0VarM = x340Var3.m();
            qim0 qim0VarE = zr7.E(x340Var3, qim0VarB);
            hzj.A.getClass();
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
            nko1.H(mbhVarA, x340Var3, y580.O0);
            nko1.H(xos0VarM, x340Var3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var3, y580.R0);
            nko1.F(x340Var3);
            nko1.H(qim0VarE, x340Var3, y580.Y);
            x340Var3.i0(586758867);
            if (aa9Var2.b.isEmpty() || aa9Var2.e.size() != 2) {
                q2c1Var2 = q2c1Var3;
                i5 = 32;
                x340Var2 = x340Var3;
                m4cVar = m4cVar2;
                x340Var2.i0(-653198364);
                x340Var2.r(false);
            } else {
                x340Var3.i0(-654701368);
                m4cVar = m4cVar2;
                i5 = 32;
                q2c1Var2 = q2c1Var3;
                jhc1.d(err0Var.s(), qim0Var, 0L, 0, (xu30) null, apo.r(-374871420, new bk0(aa9Var2, err0Var, iu30Var, z6), x340Var3), x340Var3, ((i7 >> 6) & 112) | 196608, 28);
                qim0Var = qim0Var;
                x340Var2 = x340Var3;
                x340Var2.r(false);
            }
            if (err0Var.s() == 0) {
                x340Var2.i0(-653112680);
                if (aa9Var2.g) {
                    x340Var2.i0(-653062274);
                    d36 d36Var = new d36(16.0f, true, new um5(false));
                    zzq0 zzq0VarJ = uyn1.j(0.0f, 0.0f, 0.0f, vzq0Var.a(), 7);
                    qim0 qim0VarN = anm1.N("planCards", uyn1.B(qim0Var, 0.0f, 16.0f, 0.0f, 0.0f, 13));
                    boolean z8 = (i7 & 112) == i5 || ((i7 & 64) != 0 && x340Var2.i(aa9Var2));
                    h7t0 h7t0Var3 = h7t0Var;
                    boolean zI = x340Var2.i(h7t0Var3) | z8 | ((i7 & 14) == 4);
                    Object objT5 = x340Var2.T();
                    if (zI || objT5 == m4cVar) {
                        objT5 = new c30(aa9Var2, h7t0Var3, z6, (byte) 6);
                        x340Var2.s0(objT5);
                    }
                    x340 x340Var4 = x340Var2;
                    s3o1.d(qim0VarN, null, zzq0VarJ, d36Var, null, null, false, null, (iu30) objT5, x340Var4, 0, 490);
                    x340Var = x340Var4;
                    x340Var.r(false);
                    z4 = false;
                } else {
                    x340Var2.i0(-652386722);
                    d36 d36Var2 = new d36(16.0f, true, new um5(false));
                    zzq0 zzq0VarJ2 = uyn1.j(0.0f, 0.0f, 0.0f, vzq0Var.a(), 7);
                    qim0 qim0VarN2 = anm1.N("plans", uyn1.B(qim0Var, 0.0f, 16.0f, 0.0f, 0.0f, 13));
                    boolean zI2 = x340Var2.i(q2c1Var2) | ((i7 & 112) == 32 || ((i7 & 64) != 0 && x340Var2.i(aa9Var2))) | ((i7 & 14) == 4) | ((i7 & 458752) == 131072) | ((i7 & 3670016) == 1048576);
                    Object objT6 = x340Var2.T();
                    if (zI2 || objT6 == m4cVar) {
                        z5 = false;
                        ha9 ha9Var = new ha9(aa9Var2, q2c1Var2, z6, z2, z3);
                        aa9Var2 = aa9Var2;
                        z6 = z6;
                        x340Var2.s0(ha9Var);
                        objT6 = ha9Var;
                    } else {
                        z5 = false;
                    }
                    x340 x340Var5 = x340Var2;
                    z4 = z5;
                    s3o1.d(qim0VarN2, null, zzq0VarJ2, d36Var2, null, null, false, null, (iu30) objT6, x340Var5, 0, 490);
                    x340Var = x340Var5;
                    x340Var.r(z4);
                }
                x340Var.r(z4);
            } else {
                z4 = false;
                x340Var2.i0(-651469184);
                d36 d36Var3 = new d36(16.0f, true, new um5(false));
                zzq0 zzq0VarJ3 = uyn1.j(0.0f, 0.0f, 0.0f, vzq0Var.a(), 7);
                qim0 qim0VarN3 = anm1.N("addons", uyn1.B(qim0Var, 0.0f, 16.0f, 0.0f, 0.0f, 13));
                q2c1 q2c1Var5 = q2c1Var;
                boolean zI3 = x340Var2.i(q2c1Var5) | ((i7 & 112) == 32 || ((i7 & 64) != 0 && x340Var2.i(aa9Var2))) | ((i7 & 14) == 4);
                Object objT7 = x340Var2.T();
                if (zI3 || objT7 == m4cVar) {
                    objT7 = new c30(aa9Var2, q2c1Var5, z6, (byte) 7);
                    x340Var2.s0(objT7);
                }
                x340 x340Var6 = x340Var2;
                s3o1.d(qim0VarN3, null, zzq0VarJ3, d36Var3, null, null, false, null, (iu30) objT7, x340Var6, 0, 490);
                x340Var = x340Var6;
                x340Var.r(false);
            }
            x340Var.r(z4);
            x340Var.r(true);
        } else {
            x340Var = x340Var3;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mf6(z6, aa9Var2, iu30Var, i, z2, z3, vzq0Var, i2);
        }
    }

    public static final void c(LocalDate localDate, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(385261703);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(localDate) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            gfx.b(18, apo.r(2100966908, new vx90(qim0Var, localDate), x340Var), x340Var, 54);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lg60(localDate, qim0Var, i, (byte) 17);
        }
    }

    public static final void d(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1257244356);
        if (i == 0 && x340Var.H()) {
            x340Var.b0();
        } else {
            int i2 = fp70.a;
            x340Var.j0(-1115894518);
            x340Var.j0(1886828752);
            if (!(x340Var.a instanceof i06)) {
                tgp1.p();
                throw null;
            }
            x340Var.g0();
            if (x340Var.S) {
                x340Var.l(new opg(0, (byte) 12));
            } else {
                x340Var.v0();
            }
            us71.m(x340Var, true, false, false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yg20(i, (byte) 20);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void e(a1g a1gVar, dwr0 dwr0Var, vur0 vur0Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1418630019);
        int i3 = (x340Var.i(a1gVar) ? 4 : 2) | i | (x340Var.i(dwr0Var) ? 32 : 16) | (x340Var.e(vur0Var.ordinal()) ? 256 : 128) | (x340Var.i(function0) ? 2048 : 1024) | 24576;
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            z0g z0gVarB = a1gVar.b();
            String str = z0gVarB != null ? z0gVarB.b : null;
            int i4 = z0gVarB != null ? z0gVarB.a : 0;
            boolean zE = x340Var.e(i4 == 0 ? -1 : l1d.C(i4)) | x340Var.g(str) | x340Var.g(dwr0Var) | ((i3 & 896) == 256);
            Object objT = x340Var.T();
            if (zE || objT == fkj0.X) {
                z0g z0gVarB2 = a1gVar.b();
                if (z0gVarB2 == null) {
                    eg.m("A sessionId is required to generate a QR code.");
                    return;
                }
                int iOrdinal = vur0Var.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    i2 = 2;
                } else {
                    if (iOrdinal != 2) {
                        hhg1.g(vur0Var, "Unsupported parental consent source: ");
                        return;
                    }
                    i2 = 1;
                }
                int i5 = z0gVarB2.a;
                if (i5 != i2) {
                    throw new IllegalStateException(("Active session flow " + ktd.v(i5) + " does not match expected flow " + ktd.v(i2) + " for parental consent source " + vur0Var + ".").toString());
                }
                String strA = dwr0.a("https://www.spotify.com/account/parental-consent", z0gVarB2.b, vur0Var);
                y6r0 y6r0VarB = dwr0Var.b.b();
                objT = dwr0Var.a.b(Uri.parse(strA), y6r0VarB != null ? new xvn0(y6r0VarB) : null).toString();
                x340Var.s0(objT);
            }
            String str2 = (String) objT;
            int iOrdinal2 = vur0Var.ordinal();
            if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                x340Var.i0(-1798794200);
                g((i3 >> 6) & 1008, str2, function0, x340Var);
                x340Var.r(false);
            } else {
                if (iOrdinal2 != 2 && iOrdinal2 != 3) {
                    throw p3d1.k(x340Var, -1798798578, false);
                }
                x340Var.i0(-1798785500);
                f((i3 >> 6) & 1008, str2, function0, x340Var);
                x340Var.r(false);
            }
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wnx0(a1gVar, dwr0Var, vur0Var, function0, qim0Var2, i, (byte) 13);
        }
    }

    public static final void f(int i, String str, Function0 function0, b0k b0kVar) {
        int i2;
        Function0 function1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(367975870);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        int i3 = i & 384;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= x340Var.i(nim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarL = bmq0.L(u291.f(nim0Var, 1.0f), k1o1.q(x340Var), (g6o0) null);
            era eraVar = een.Q0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarL);
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
            String strO0 = cwl1.o0(x340Var, 2131962330);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).e;
            cvx cvxVar = cbx.b(x340Var).b;
            uwo1.e(strO0, uyn1.z(16.0f, 0.0f, 2, nim0Var), lee1Var, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2024);
            cvx cvxVar2 = cbx.b(x340Var).b;
            uwo1.e(ydh.g(8.0f, 2131962329, x340Var, x340Var, nim0Var), null, cbx.d(x340Var).g, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            cvx cvxVar3 = cbx.b(x340Var).b;
            rqo1.g(0, 0, x340Var, uyn1.z(0.0f, 12.0f, 1, nim0Var));
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            cvx cvxVar4 = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarF);
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarZ);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            uwo1.e(cwl1.o0(x340Var, 2131962326), null, cbx.d(x340Var).g, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2026);
            cvx cvxVar5 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 16.0f));
            int i4 = i2;
            zgo1.i(str, anm1.N("parental_consent_qr_code", u291.r(nim0Var, dsa0.m(x340Var, 2131167000))), u7h.f, u7h.j, izy0.b, cwl1.o0(x340Var, 2131962328), dzy0.b, null, null, x340Var, 1597440 | (i4 & 14), 384);
            uwo1.e(ydh.g(cbx.b(x340Var).b.b, 2131962327, x340Var, x340Var, nim0Var), null, cbx.d(x340Var).g, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2026);
            cvx cvxVar6 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 16.0f));
            boolean z2 = (i4 & 112) == 32;
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                function1 = function0;
                objT = new pt61(function1, (byte) 8);
                x340Var.s0(objT);
            } else {
                function1 = function0;
            }
            foo1.c(new gbx(z50.c, (Function0) objT), jdx.c, anm1.N("share_parental_consent_continue_on_current_device_button", nim0Var), null, null, null, null, null, null, null, dhj.a, x340Var, 0, 48, 2040);
            String strO1 = cwl1.o0(x340Var, 2131962325);
            lee1 lee1Var2 = cbx.d(x340Var).m;
            long j = cbx.a(x340Var).b.b;
            cvx cvxVar7 = cbx.b(x340Var).b;
            uwo1.e(strO1, uyn1.z(0.0f, 16.0f, 1, nim0Var), lee1Var2, j, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2016);
            x340Var.r(true);
            x340Var.r(true);
        } else {
            function1 = function0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vsh(str, function1, i, (byte) 2);
        }
    }

    public static final void g(int i, String str, Function0 function0, b0k b0kVar) {
        int i2;
        Function0 function1;
        byte b2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1178751425);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        int i3 = i & 384;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= x340Var.i(nim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarL = bmq0.L(u291.f(nim0Var, 1.0f), k1o1.q(x340Var), (g6o0) null);
            era eraVar = een.Q0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarL);
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
            String strO0 = cwl1.o0(x340Var, 2131951623);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).e;
            cvx cvxVar = cbx.b(x340Var).b;
            uwo1.e(strO0, uyn1.z(16.0f, 0.0f, 2, nim0Var), lee1Var, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2024);
            cvx cvxVar2 = cbx.b(x340Var).b;
            rqo1.g(0, 0, x340Var, uyn1.z(0.0f, 12.0f, 1, nim0Var));
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            cvx cvxVar3 = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarF);
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarZ);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            uwo1.e(cwl1.o0(x340Var, 2131951620), null, cbx.d(x340Var).g, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2026);
            cvx cvxVar4 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 16.0f));
            int i4 = i2;
            b2 = 3;
            zgo1.i(str, anm1.N("parental_consent_qr_code", u291.r(nim0Var, dsa0.m(x340Var, 2131167000))), u7h.f, u7h.j, izy0.b, cwl1.o0(x340Var, 2131951622), dzy0.b, null, null, x340Var, (i4 & 14) | 1597440, 384);
            uwo1.e(ydh.g(cbx.b(x340Var).b.b, 2131951621, x340Var, x340Var, nim0Var), null, cbx.d(x340Var).g, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2026);
            cvx cvxVar5 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 16.0f));
            boolean z2 = (i4 & 112) == 32;
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                function1 = function0;
                objT = new pt61(function1, (byte) 9);
                x340Var.s0(objT);
            } else {
                function1 = function0;
            }
            foo1.c(new gbx(z50.c, (Function0) objT), jdx.c, anm1.N("share_parental_consent_continue_on_current_device_button", nim0Var), null, null, null, null, null, null, null, dhj.b, x340Var, 0, 48, 2040);
            String strO1 = cwl1.o0(x340Var, 2131951619);
            lee1 lee1Var2 = cbx.d(x340Var).m;
            long j = cbx.a(x340Var).b.b;
            cvx cvxVar6 = cbx.b(x340Var).b;
            uwo1.e(strO1, uyn1.z(0.0f, 16.0f, 1, nim0Var), lee1Var2, j, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2016);
            x340Var.r(true);
            x340Var.r(true);
        } else {
            function1 = function0;
            b2 = 3;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vsh(str, function1, i, b2);
        }
    }

    public static final void h(boolean z, Function0 function0, Function0 function1, Function0 function2, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        boolean z2;
        int i2;
        int i3;
        boolean z3;
        int i4;
        int i5;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1349407626);
        int i6 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128) | (x340Var.i(function2) ? 16384 : 8192) | 196608;
        if (x340Var.Y(i6 & 1, (74899 & i6) != 74898)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(x340Var).g, 32, qim0VarF);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0VarP, 16.0f, 12.0f);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
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
            wsx wsxVar = wsx.c;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(wsxVar, isl.a, u291.r(qim0Var3, 32.0f), 0L, 0L, false, x340Var, wsx.d | 48, 56);
            cvx cvxVar3 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(qim0Var3, 8.0f));
            if (z) {
                i2 = 973664512;
                i3 = 2131963737;
                z2 = false;
            } else {
                z2 = false;
                i2 = 973667169;
                i3 = 2131963738;
            }
            uwo1.e(x0d.k(x340Var, i2, i3, x340Var, z2), null, cbx.d(x340Var).e, cbx.a(x340Var).b.a, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2018);
            cvx cvxVar4 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(qim0Var3, 8.0f));
            if (z) {
                i4 = 973678015;
                i5 = 2131963732;
                z3 = false;
            } else {
                z3 = false;
                i4 = 973680640;
                i5 = 2131963733;
            }
            uwo1.e(x0d.k(x340Var, i4, i5, x340Var, z3), null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2018);
            op71.g(x340Var, u291.h(qim0Var3, cbx.b(x340Var).b.a));
            boolean z4 = (i6 & 112) == 32;
            Object objT = x340Var.T();
            if (z4 || objT == m4cVar) {
                objT = new sah1(function0, (byte) 19);
                x340Var.s0(objT);
            }
            z50 z50Var = z50.c;
            foo1.c(new gbx(z50Var, (Function0) objT), new idx(4), null, null, null, null, null, null, null, null, kqj.a, x340Var, 0, 48, 2044);
            x340Var = x340Var;
            if (z) {
                x340Var.i0(119900317);
                cvx cvxVar5 = cbx.b(x340Var).b;
                op71.g(x340Var, u291.h(qim0Var3, 8.0f));
                boolean z5 = (i6 & 896) == 256;
                Object objT2 = x340Var.T();
                if (z5 || objT2 == m4cVar) {
                    objT2 = new sah1(function1, (byte) 20);
                    x340Var.s0(objT2);
                }
                foo1.c(new gbx(z50Var, (Function0) objT2), ldx.c, null, null, null, null, null, null, null, null, kqj.b, x340Var, 0, 48, 2044);
                cvx cvxVar6 = cbx.b(x340Var).b;
                op71.g(x340Var, u291.h(qim0Var3, 8.0f));
                boolean z6 = (i6 & 57344) == 16384;
                Object objT3 = x340Var.T();
                if (z6 || objT3 == m4cVar) {
                    objT3 = new izg1(function2, (byte) 6);
                    x340Var.s0(objT3);
                }
                String strO0 = cwl1.o0(x340Var, 2131963739);
                String strN0 = cwl1.n0(2131963736, new Object[]{strO0}, x340Var);
                int iW0 = ihc1.w0(strN0, strO0, 0, false, 6);
                int length = strO0.length() + iW0;
                ye5 ye5Var = new ye5();
                ye5Var.f(strN0.subSequence(0, iW0));
                vhg.c(ye5Var, strO0, "https://open.spotify.com", vhg.a, (iu30) objT3);
                ye5Var.f(strN0.subSequence(length, strN0.length()));
                uwo1.d(ye5Var.p(), cbx.a(x340Var).b.b, null, cbx.d(x340Var).j, new a0e1(3), null, 0, false, null, 0, null, null, x340Var, 0, 0, 4068);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                x340Var.i0(120581666);
                x340Var.r(false);
            }
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ofi0(z, function0, function1, function2, qim0Var2, i);
        }
    }

    public static final void j(View view, ggx0 ggx0Var, ggx0 ggx0Var2) {
        h711 h711Var = new h711(view, new Handler(Looper.getMainLooper()), new l811(), ggx0Var, ggx0Var2);
        view.addOnAttachStateChangeListener(h711Var);
        if (view.isAttachedToWindow()) {
            h711Var.onViewAttachedToWindow(view);
        }
    }

    public static nb3 k(w530 w530Var, b630 b630Var, q7r0 q7r0Var, rih1 rih1Var) {
        w530Var.getClass();
        rih1Var.getClass();
        return new nb3(w530Var, b630Var, q7r0Var);
    }

    public static final RecyclerView l(View view) {
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        d7 d7Var = new d7((ViewGroup) view, (byte) 8);
        while (d7Var.hasNext()) {
            RecyclerView recyclerViewL = l((View) d7Var.next());
            if (recyclerViewL != null) {
                return recyclerViewL;
            }
        }
        return null;
    }

    public static e130 m(float f, Context context) {
        boolean z = context.getResources().getConfiguration().fontScale > 1.4f;
        if (p3v.b(f, 138.0f) < 0) {
            return kvb.e;
        }
        return (p3v.b(f, 300.0f) < 0 || (p3v.b(f, 300.0f) >= 0 && z)) ? new jvb(0.35f) : new jvb(0.6f);
    }

    public static String n(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        boolean z = false;
        String str = null;
        while (it.hasNext()) {
            String str2 = ((uzf1) it.next()).a.g.p;
            if (asj0.o(str2)) {
                return "video/mp4";
            }
            if (asj0.k(str2)) {
                z = true;
            } else if (asj0.m(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        if (z) {
            return "audio/mp4";
        }
        return str != null ? str : "application/mp4";
    }

    public static void o(ejg ejgVar, ajg ajgVar) {
        ejgVar.b = ajgVar;
    }

    public static void p(ejg ejgVar, t2j0 t2j0Var) {
        ejgVar.a = t2j0Var;
    }

    public static final go80 q(klm klmVar, xbp0 xbp0Var, xbp0 xbp0Var2, sap0 sap0Var, xbp0 xbp0Var3) {
        return klmVar.a("NotificationChannelDaemon", new k7h0(xbp0Var, xbp0Var2, sap0Var, xbp0Var3, (byte) 20));
    }

    /* JADX WARN: Code duplicated, block: B:68:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:99:0x0159  */
    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    public static nnt0 r(lnt0 lnt0Var, ant0 ant0Var) {
        String str;
        jmt0 jmt0Var;
        ydo ydoVar;
        String str2;
        String str3;
        boolean z;
        String str4;
        boolean z2;
        m650 m650Var;
        ydo vdoVar;
        ont0 ont0Var = ant0Var.a;
        zkm zkmVar = ant0Var.b;
        hwt hwtVar = ant0Var.c;
        String str5 = lnt0Var.a;
        if (ont0Var != null) {
            str = ont0Var.a;
            if (str.length() <= 0) {
                str = null;
            }
            if (str == null) {
                str = str5;
            }
        } else {
            str = str5;
        }
        String str6 = ont0Var != null ? ont0Var.e : null;
        String str7 = ont0Var != null ? ont0Var.c : null;
        String str8 = ont0Var != null ? ont0Var.g : null;
        if (ont0Var != null) {
            dw9 dw9Var = ont0Var.j;
            if (dw9Var instanceof wv9) {
                jmt0Var = new jmt0(1, ((wv9) dw9Var).a, (String) null, 4);
            } else if (dw9Var instanceof tv9) {
                jmt0Var = new jmt0(2, (String) null, ((tv9) dw9Var).a, 2);
            } else {
                if (!(dw9Var instanceof xv9)) {
                    eg.o();
                    return null;
                }
                jmt0Var = null;
            }
        } else {
            jmt0Var = null;
        }
        if (ont0Var != null) {
            aeo aeoVar = ont0Var.i;
            if (aeoVar instanceof zdo) {
                vdoVar = new ydo(((zdo) aeoVar).a);
            } else if (aeoVar instanceof wdo) {
                wdo wdoVar = (wdo) aeoVar;
                String str9 = wdoVar.a;
                vdoVar = new vdo(str9.length() == 0 ? zkc0.b : new alc0(str9), t(wdoVar.c), t(wdoVar.b));
            } else {
                if (!(aeoVar instanceof xdo)) {
                    eg.o();
                    return null;
                }
                vdoVar = null;
            }
            ydoVar = vdoVar;
        } else {
            ydoVar = null;
        }
        u7h u7hVarT = ont0Var != null ? t(ont0Var.b) : null;
        u7h u7hVarT2 = ont0Var != null ? t(ont0Var.d) : null;
        u7h u7hVarT3 = ont0Var != null ? t(ont0Var.f) : null;
        jmt0 jmt0Var2 = jmt0Var;
        boolean zV = p2o1.v(zkmVar, str5);
        boolean zS = p2o1.s(zkmVar, str5);
        if (ont0Var != null) {
            str2 = ont0Var.h;
            if (ihc1.y0(str2)) {
                str2 = null;
            }
            if (str2 == null) {
                str2 = str5;
            }
        } else {
            str2 = str5;
        }
        if (ont0Var == null || (str3 = ont0Var.k) == null || ihc1.y0(str3)) {
            str3 = null;
        }
        if (ont0Var != null && (m650Var = ont0Var.l) != null) {
            ArrayList arrayList = m650Var.a;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                d750 d750Var = (d750) it.next();
                Iterator it2 = it;
                u7h u7hVarT4 = t(d750Var.a);
                boolean z3 = zS;
                r650 r650Var = u7hVarT4 != null ? new r650(u7hVarT4.a, d750Var.b) : null;
                if (r650Var != null) {
                    arrayList2.add(r650Var);
                }
                it = it2;
                zS = z3;
                str = str;
            }
            z = zS;
            str4 = str;
            t650 t650Var = arrayList2.isEmpty() ? null : new t650(arrayList2);
            if (hwtVar == null && hwtVar.d) {
                z2 = true;
            } else {
                z2 = false;
            }
            return new nnt0(str4, str6, str8, jmt0Var2, ydoVar, zV, z, str2, str5, str3, str7, u7hVarT2, u7hVarT, u7hVarT3, str8, z2, t650Var);
        }
        z = zS;
        str4 = str;
        if (hwtVar == null) {
            z2 = false;
        } else {
            z2 = false;
        }
        return new nnt0(str4, str6, str8, jmt0Var2, ydoVar, zV, z, str2, str5, str3, str7, u7hVarT2, u7hVarT, u7hVarT3, str8, z2, t650Var);
    }

    public static final void s(RecyclerView recyclerView, Function0 function0, Function0 function1) {
        recyclerView.k(new g711(recyclerView, function0, function1));
    }

    public static u7h t(String str) {
        if (str.length() == 0) {
            return null;
        }
        try {
            if (iro1.s(str)) {
                str = "#".concat(iro1.y(ihc1.H0(str, "#")));
            }
            return new u7h(z4p1.e(Color.parseColor(str)));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static void u(Status status, Object obj, bsd1 bsd1Var) {
        if (status.j()) {
            bsd1Var.b(obj);
        } else {
            bsd1Var.a(rzn1.r(status));
        }
    }

    public static final boolean v(i3x i3xVar) {
        if (i3xVar instanceof m3x) {
            return true;
        }
        if (!(i3xVar instanceof s3x)) {
            return false;
        }
        ArrayList arrayList = ((s3x) i3xVar).b;
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (v((i3x) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static imt0 w(jmt0 jmt0Var, boolean z) {
        if (jmt0Var == null) {
            return new hmt0(u7h.c);
        }
        int iC = l1d.C(jmt0Var.a);
        if (iC == 0) {
            String str = jmt0Var.b;
            return str != null ? new fmt0(str) : new hmt0(u7h.c);
        }
        if (iC == 1) {
            String str2 = jmt0Var.c;
            return str2 != null ? new gmt0(str2, z) : new hmt0(u7h.c);
        }
        eg.o();
        return null;
    }
}
