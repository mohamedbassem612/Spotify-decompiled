package p;

import android.os.Parcelable;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class rzn1 {
    public static final StackTraceElement[] a = new StackTraceElement[0];
    public static b180 b;
    public static yk4 c;
    public static u84 d;
    public static vid e;

    public static final gmh1 A(a8b0 a8b0Var) {
        gmh1 gmh1VarZ;
        dq20 dq20VarW0 = a8b0Var.w0();
        if (dq20VarW0 instanceof dq20) {
            dq20 dq20Var = dq20VarW0;
            qx81 qx81VarZ = dq20Var.b;
            if (!qx81VarZ.t0().getParameters().isEmpty() && qx81VarZ.t0().s() != null) {
                List parameters = qx81VarZ.t0().getParameters();
                ArrayList arrayList = new ArrayList(q7h.U(parameters, 10));
                Iterator it = parameters.iterator();
                while (it.hasNext()) {
                    arrayList.add(new phb1((y0h1) it.next()));
                }
                qx81VarZ = jzn1.z(qx81VarZ, arrayList, null, 2);
            }
            qx81 qx81VarZ2 = dq20Var.c;
            if (!qx81VarZ2.t0().getParameters().isEmpty() && qx81VarZ2.t0().s() != null) {
                List parameters2 = qx81VarZ2.t0().getParameters();
                ArrayList arrayList2 = new ArrayList(q7h.U(parameters2, 10));
                Iterator it2 = parameters2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new phb1((y0h1) it2.next()));
                }
                qx81VarZ2 = jzn1.z(qx81VarZ2, arrayList2, null, 2);
            }
            gmh1VarZ = y3o1.Z(qx81VarZ, qx81VarZ2);
        } else {
            if (!(dq20VarW0 instanceof qx81)) {
                eg.o();
                return null;
            }
            gmh1VarZ = (qx81) dq20VarW0;
            if (!gmh1VarZ.t0().getParameters().isEmpty() && gmh1VarZ.t0().s() != null) {
                List parameters3 = gmh1VarZ.t0().getParameters();
                ArrayList arrayList3 = new ArrayList(q7h.U(parameters3, 10));
                Iterator it3 = parameters3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new phb1((y0h1) it3.next()));
                }
                gmh1VarZ = jzn1.z(gmh1VarZ, arrayList3, null, 2);
            }
        }
        return vzn1.q(gmh1VarZ, vzn1.l(dq20VarW0));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void a(llw0 llw0Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-670922618);
        int i2 = (x340Var.g(llw0Var) ? 4 : 2) | i | 48;
        if (!x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            x340Var.b0();
        } else {
            if (!(llw0Var instanceof ilw0)) {
                if (!(llw0Var instanceof jlw0) && !(llw0Var instanceof klw0)) {
                    throw p3d1.k(x340Var, -511538311, false);
                }
                x340Var.i0(-511526287);
                x340Var.r(false);
                bhn0.B(rc11.a.b(llw0Var.getClass()).r(), "Unsupported share card background: ");
                return;
            }
            x340Var.i0(-511536510);
            qim0 qim0Var2 = nim0.a;
            ilw0 ilw0Var = (ilw0) llw0Var;
            t1c.a(dug.e(u291.d(qim0Var2, 1.0f), v9c.s(p7h.M(new u7h[]{new u7h(z4p1.e(ilw0Var.a)), new u7h(z4p1.e(ilw0Var.b))}), 0.0f, 0.0f, 14), null, 0.0f, 6), x340Var, 0);
            x340Var.r(false);
            qim0Var = qim0Var2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kpw0(llw0Var, qim0Var, i, (byte) 7);
        }
    }

    public static final void b(Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1156159639);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String strO0 = cwl1.o0(x340Var, 2131955150);
            fux fuxVar = fux.c;
            jsl jslVar = new jsl(strO0);
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(fuxVar, jslVar, bin.x(u291.r(nim0.a, 16.0f), false, strO0, null, null, function0, 13), 0L, 0L, false, x340Var, fux.d, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new h621(function0, i, (byte) 3);
        }
    }

    public static final void c(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1769279666);
        if (x340Var.Y(i & 1, i != 0)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarB = uyn1.B(uyn1.z(dsa0.m(x340Var, 2131167026), 0.0f, 2, u291.d(nim0Var, 1.0f)), 0.0f, dsa0.m(x340Var, 2131167030), 0.0f, 0.0f, 13);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
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
            qim0 qim0VarB2 = u291.B(nim0Var, een.h, 2);
            String strO0 = cwl1.o0(x340Var, 2131955758);
            uwr uwrVar = cbx.a;
            uwo1.e(strO0, qim0VarB2, cbx.d(x340Var).d, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
            uwo1.e(cwl1.o0(x340Var, 2131955681), uyn1.B(qim0VarB2, 0.0f, dsa0.m(x340Var, 2131167024), 0.0f, 0.0f, 13), cbx.d(x340Var).j, f5p1.k(x340Var, 2131101506), null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new htu(i, (byte) 15);
        }
    }

    public static final void d(y7e1 y7e1Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1462074281);
        int i2 = i | (x340Var2.i(y7e1Var) ? 4 : 2) | (x340Var2.i(qim0Var) ? 32 : 16);
        if (x340Var2.Y(i2 & 1, (i2 & 19) != 18)) {
            Object objT = x340Var2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = pzm.i(x340Var2);
            }
            lz20 lz20Var = (lz20) objT;
            zxx zxxVarP = p(x340Var2);
            rwo1.b(y7e1Var, vby0.p(u291.f(qim0Var, 1.0f), lz20Var), null, null, xej.a, apo.r(2077689908, new ex1(y7e1Var, (byte) 4), x340Var2), false, false, null, cbx.d(x340Var2).k, null, null, d6e1.b, null, null, null, null, q(x340Var2), 0.0f, false, zxxVarP, x340Var2, (i2 & 14) | 221184, 0, 912844);
            x340Var = x340Var2;
            boolean zI = x340Var.i(lz20Var);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new fx1(lz20Var, null, (byte) 10);
                x340Var.s0(objT2);
            }
            qxd0.t(rih1.a, x340Var, (vu30) objT2);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gx1(y7e1Var, qim0Var, i, (byte) 1);
        }
    }

    public static final void e(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1372732918);
        int i2 = i | (x340Var.i(qim0Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            String strO0 = cwl1.o0(x340Var, 2131955151);
            y7e1 y7e1VarD = c4p1.D(0, 3, null, x340Var);
            zxx zxxVarP = p(x340Var);
            lee1 lee1Var = cbx.d(x340Var).k;
            zzq0 zzq0VarQ = q(x340Var);
            nim0 nim0Var = nim0.a;
            rwo1.b(y7e1VarD, u291.f(nim0Var, 1.0f), null, strO0, xej.b, null, false, false, null, lee1Var, null, null, d6e1.b, null, null, null, null, zzq0VarQ, 0.0f, false, zxxVarP, x340Var, 24576, 0, 912868);
            x340Var = x340Var;
            qim0 qim0VarN = anm1.N("dsl_find_playlist_placeholder", h2c.a.b(nim0Var));
            boolean zG = x340Var.g(strO0);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                objT = new sc21(strO0, (byte) 22);
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarN, false, (iu30) objT);
            boolean z = (i2 & 112) == 32;
            Object objT2 = x340Var.T();
            if (z || objT2 == m4cVar) {
                objT2 = new us21(function0, (byte) 21);
                x340Var.s0(objT2);
            }
            t1c.a(bin.x(qim0VarB, false, strO0, null, null, (Function0) objT2, 13), x340Var, 0);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new t531(qim0Var, function0, i, (byte) 2);
        }
    }

    public static final void f(String str, gbx gbxVar, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var;
        qim0 qim0Var2;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-620764968);
        int i2 = i | (x340Var2.g(str) ? 4 : 2) | (x340Var2.i(gbxVar) ? 32 : 16) | 384;
        if (x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var2).a.a.a();
            u5j1 u5j1Var = d4o1.a;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = dug.f(qim0Var3, jA, u5j1Var);
            cvx cvxVar = cbx.b(x340Var2).b;
            cvx cvxVar2 = cbx.b(x340Var2).b;
            mta mtaVar = cbx.b(x340Var2).d;
            qim0 qim0VarB = uyn1.B(qim0VarF, 0.0f, 4.0f, 48.0f, 4.0f, 1);
            fra fraVar = een.N0;
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
            ldx ldxVar = ldx.c;
            mta mtaVar2 = cbx.b(x340Var2).d;
            wro1.h(gbxVar, ldxVar, anm1.N("back_button", u291.r(qim0Var3, 48.0f)), null, null, null, false, null, null, n5j.b, x340Var2, (i2 >> 3) & 14, 6, 1016);
            uwo1.e(str, u291.z(new wnb0(1.0f, true), fraVar, 2), cbx.d(x340Var2).h, 0L, new a0e1(3), null, 2, false, new zic0(2), 0, null, x340Var2, i2 & 14, 0, 1704);
            x340Var = x340Var2;
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l720(str, gbxVar, qim0Var2, i, (byte) 3);
        }
    }

    public static final void g(String str, gbx gbxVar, qim0 qim0Var, boolean z, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1706725339);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.i(gbxVar) ? 32 : 16) | (b0kVar3.i(qim0Var) ? 256 : 128) | (b0kVar3.h(z) ? 2048 : 1024);
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z2 = (i2 & 7168) == 2048;
            Object objT = b0kVar3.T();
            if (z2 || objT == fkj0.X) {
                objT = new mj10((byte) 17, z);
                b0kVar3.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0Var, false, (iu30) objT);
            uwr uwrVar = cbx.a;
            b0kVar2 = b0kVar3;
            jto1.b(anm1.N("row", dug.f(qim0VarB, cbx.a(b0kVar3).a.a.a(), d4o1.a)), null, null, false, null, null, gbxVar, null, null, null, null, null, apo.r(1064135124, new epe0((byte) 10, z), b0kVar3), null, null, apo.r(-1590072297, new qdg0(str, (byte) 20), b0kVar3), b0kVar2, (i2 << 15) & 3670016, 196992, 28606);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new mec0(str, gbxVar, qim0Var, z, i, (byte) 3);
        }
    }

    public static final void h(bcb0 bcb0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1986479757);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(bcb0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Locale localeForLanguageTag = Locale.forLanguageTag(upn1.p());
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarO = td6.o(lhc.g(x340Var).g, 32, nim0.a);
            uwr uwrVar = cbx.a;
            qim0 qim0VarB = uyn1.B(qim0VarO, 0.0f, 0.0f, 0.0f, cbx.b(x340Var).b.b, 7);
            zzq0 zzq0VarH = uyn1.h(3, 0.0f, 0.0f);
            boolean zI = x340Var.i(bcb0Var) | ((i2 & 112) == 32) | x340Var.g(localeForLanguageTag);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new mvn0(bcb0Var, iu30Var, localeForLanguageTag, (byte) 17);
                x340Var.s0(objT);
            }
            s3o1.d(qim0VarB, null, zzq0VarH, null, null, null, false, null, (iu30) objT, x340Var, 0, 506);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nbf0(bcb0Var, iu30Var, i, (byte) 26);
        }
    }

    public static final void i(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1492824454);
        if (x340Var.Y(i & 1, i != 0)) {
            esx esxVar = esx.c;
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(esxVar, isl.a, u291.r(nim0.a, 16.0f), 0L, 0L, false, x340Var, esx.d | 48, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new fk01(i, (byte) 13);
        }
    }

    public static final void j(int i, String str, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1985174950);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
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
            uwr uwrVar = cbx.a;
            uwo1.e(str, null, null, cbx.a(x340Var).b.d, null, null, 0, false, null, 0, null, x340Var, i2 & 14, 0, 2038);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uo50(str, qim0Var, i, (byte) 23);
        }
    }

    public static final yhd k(List list, dqz0 dqz0Var) {
        if (list.isEmpty()) {
            z6x z6xVar = z6x.a;
            return new yhd(z6xVar, z6xVar);
        }
        List listK0 = o7h.k0(list, 1);
        return new yhd(o7h.N0(o7h.d1(p7h.R(o7h.k0(listK0, 1), dqz0Var), 4), Collections.singletonList(o7h.q0(list))), listK0);
    }

    public static final List l(List list, String str, dqz0 dqz0Var) {
        ArrayList arrayList = new ArrayList(p7h.R(list, dqz0Var));
        if (arrayList.size() > 1 && u890.j(o7h.q0(arrayList), str)) {
            Collections.swap(arrayList, 0, yoi1.H(yoi1.Q(1, arrayList.size()), dqz0Var));
        }
        return o7h.d1(arrayList, 10);
    }

    public static final boolean m(a8b0 a8b0Var, h0h1 h0h1Var, Set set) {
        e1h1 e1h1Var;
        y0h1 y0h1Var;
        if (u890.j(a8b0Var.t0(), h0h1Var)) {
            return true;
        }
        kfg kfgVarS = a8b0Var.t0().s();
        kfg kfgVar = kfgVarS instanceof kfg ? kfgVarS : null;
        List listN = kfgVar != null ? kfgVar.n() : null;
        Collection collectionU1 = o7h.u1(a8b0Var.r0());
        if (!(collectionU1 instanceof Collection) || !collectionU1.isEmpty()) {
            ca80 it = collectionU1.iterator();
            do {
                ca80 ca80Var = it;
                if (((Iterator) ca80Var.c).hasNext()) {
                    aa80 aa80Var = (aa80) ca80Var.next();
                    int i = aa80Var.a;
                    e1h1Var = (e1h1) aa80Var.b;
                    y0h1Var = listN != null ? (y0h1) o7h.t0(i, listN) : null;
                }
            } while (!(((y0h1Var == null || set == null || !set.contains(y0h1Var)) && !e1h1Var.c()) ? m(e1h1Var.b(), h0h1Var, set) : false));
            return true;
        }
        return false;
    }

    public static final f1h1 n(a8b0 a8b0Var, int i, y0h1 y0h1Var) {
        if ((y0h1Var != null ? y0h1Var.x() : 0) == i) {
            i = 1;
        }
        return new f1h1(i, a8b0Var);
    }

    public static final void o(a8b0 a8b0Var, qx81 qx81Var, LinkedHashSet linkedHashSet, Set set) {
        y0h1 y0h1VarS = a8b0Var.t0().s();
        if (y0h1VarS instanceof y0h1) {
            if (!u890.j(a8b0Var.t0(), qx81Var.t0())) {
                linkedHashSet.add(y0h1VarS);
                return;
            }
            for (a8b0 a8b0Var2 : y0h1VarS.getUpperBounds()) {
                a8b0Var2.getClass();
                o(a8b0Var2, qx81Var, linkedHashSet, set);
            }
            return;
        }
        kfg kfgVarS = a8b0Var.t0().s();
        kfg kfgVar = kfgVarS instanceof kfg ? kfgVarS : null;
        List listN = kfgVar != null ? kfgVar.n() : null;
        int i = 0;
        for (e1h1 e1h1Var : a8b0Var.r0()) {
            int i2 = i + 1;
            y0h1 y0h1Var = listN != null ? (y0h1) o7h.t0(i, listN) : null;
            if ((y0h1Var == null || set == null || !set.contains(y0h1Var)) && !e1h1Var.c() && !o7h.i0(linkedHashSet, e1h1Var.b().t0().s()) && !u890.j(e1h1Var.b().t0(), qx81Var.t0())) {
                o(e1h1Var.b(), qx81Var, linkedHashSet, set);
            }
            i = i2;
        }
    }

    public static final zxx p(b0k b0kVar) {
        uwr uwrVar = cbx.a;
        return new zxx(cbx.a(b0kVar).b.a, cbx.a(b0kVar).b.a, cbx.a(b0kVar).b.a, cbx.a(b0kVar).b.d, cbx.a(b0kVar).d.b, cbx.a(b0kVar).d.b, cbx.a(b0kVar).b.c, 0L, 896);
    }

    public static final zzq0 q(b0k b0kVar) {
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(b0kVar).b;
        cvx cvxVar2 = cbx.b(b0kVar).b;
        return new zzq0(12.0f, 8.0f, 12.0f, 8.0f);
    }

    public static ApiException r(Status status) {
        return status.c != null ? new ResolvableApiException(status) : new ApiException(status);
    }

    public static final g6b0 s(a8b0 a8b0Var) {
        return a8b0Var.t0().e();
    }

    public static void t() {
        Parcelable.Creator creator = twa0.CREATOR;
    }

    public static String u(Class cls) {
        LinkedHashMap linkedHashMap = rzn0.b;
        String strValue = (String) linkedHashMap.get(cls);
        if (strValue == null) {
            kzn0 kzn0Var = (kzn0) cls.getAnnotation(kzn0.class);
            strValue = kzn0Var != null ? kzn0Var.value() : null;
            if (strValue == null || strValue.length() <= 0) {
                hhg1.f("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()));
                return null;
            }
            linkedHashMap.put(cls, strValue);
        }
        strValue.getClass();
        return strValue;
    }

    public static final a8b0 v(y0h1 y0h1Var) {
        Object obj;
        y0h1Var.getUpperBounds().isEmpty();
        Iterator it = y0h1Var.getUpperBounds().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            beg begVarS = ((a8b0) next).t0().s();
            beg begVar = begVarS instanceof beg ? begVarS : null;
            if (begVar != null && begVar.e0() != 2 && begVar.e0() != 5) {
                obj = next;
                break;
            }
        }
        a8b0 a8b0Var = (a8b0) obj;
        return a8b0Var == null ? (a8b0) o7h.q0(y0h1Var.getUpperBounds()) : a8b0Var;
    }

    public static final boolean w(y0h1 y0h1Var, h0h1 h0h1Var, Set set) {
        List<a8b0> upperBounds = y0h1Var.getUpperBounds();
        if ((upperBounds instanceof Collection) && upperBounds.isEmpty()) {
            return false;
        }
        for (a8b0 a8b0Var : upperBounds) {
            a8b0Var.getClass();
            if (m(a8b0Var, y0h1Var.m().t0(), set) && (h0h1Var == null || u890.j(a8b0Var.t0(), h0h1Var))) {
                return true;
            }
        }
        return false;
    }

    public static final boolean x(a8b0 a8b0Var, a8b0 a8b0Var2) {
        return c8b0.a.b(a8b0Var, a8b0Var2);
    }

    public static String y(String str, String str2) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(str2.getBytes(nne.a));
        byte[] bArrDigest = messageDigest.digest();
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b2 : bArrDigest) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() == 1) {
                stringBuffer.append('0');
            }
            stringBuffer.append(hexString);
        }
        return gvg.h("rvnand-", str, "-", stringBuffer.toString().toUpperCase(Locale.ROOT));
    }

    public static final a8b0 z(a8b0 a8b0Var, fg5 fg5Var) {
        return (a8b0Var.getAnnotations().isEmpty() && fg5Var.isEmpty()) ? a8b0Var : a8b0Var.w0().z0(prn1.t(a8b0Var.s0(), fg5Var));
    }
}
