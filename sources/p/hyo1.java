package p;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import com.spotify.martini.martinidata.model.Mode;
import j$.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class hyo1 {
    public static b180 a;
    public static b180 b;

    public static final void a(cl8 cl8Var, Function0 function0, j2i j2iVar, j2i j2iVar2, xu30 xu30Var, b0k b0kVar, int i) {
        int i2;
        xu30 xu30Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1813726486);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(cl8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(j2iVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(j2iVar2) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            xu30 xu30Var3 = e8i.a;
            Object[] objArr = new Object[0];
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = vc7.V0;
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) k5p1.s(objArr, (Function0) objT, x340Var, 48);
            hrr0 hrr0Var = cl8Var.g;
            jl8 jl8Var = (jl8) hrr0Var.getValue();
            boolean zG = ((i3 & 112) == 32) | x340Var.g(hrr0Var) | x340Var.g(ven0Var);
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new hb1(function0, hrr0Var, ven0Var, (lnm) null, (byte) 23);
                x340Var.s0(objT2);
            }
            qxd0.t(jl8Var, x340Var, (vu30) objT2);
            jl8 jl8Var2 = (jl8) hrr0Var.getValue();
            if (jl8Var2 instanceof gl8) {
                x340Var.i0(-765542319);
                j2iVar.invoke(jl8Var2, x340Var, Integer.valueOf((i3 >> 3) & 112));
                x340Var.r(false);
            } else if (jl8Var2 instanceof hl8) {
                x340Var.i0(-765539936);
                Boolean bool = (Boolean) ven0Var.getValue();
                bool.getClass();
                j2iVar2.J(jl8Var2, bool, x340Var, Integer.valueOf((i3 >> 3) & 896));
                x340Var.r(false);
            } else {
                if (!(jl8Var2 instanceof il8)) {
                    throw p3d1.k(x340Var, -765544491, false);
                }
                x340Var.i0(-765537365);
                xu30Var3.invoke(jl8Var2, x340Var, Integer.valueOf((i3 >> 9) & 112));
                x340Var.r(false);
            }
            xu30Var2 = xu30Var3;
        } else {
            x340Var.b0();
            xu30Var2 = xu30Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hy0((byte) 11, i, cl8Var, function0, j2iVar, j2iVar2, xu30Var2);
        }
    }

    public static final void b(String str, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1576040635);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 3) != 2)) {
            boolean z = (i2 & 14) == 4;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = Uri.parse(str);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            eso1.h(oi7.a((Uri) objT, (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, true, (j6m) null, (iu30) null, (iu30) null, (iu30) null, 0L, b0kVar2, 805306368, 0, 130558), isl.a, u291.h(nim0.a, 16.0f), (p3v) null, (zvx) null, (ecx) null, mif1.Q0, (tl3) null, (ColorFilter) null, b0kVar2, 224304, 384);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ue0((byte) 22, i, str, false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x0137  */
    /* JADX WARN: Code duplicated, block: B:66:0x0143  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    public static final void c(String str, String str2, hux huxVar, zzq0 zzq0Var, gbx gbxVar, qim0 qim0Var, b0k b0kVar, int i, int i2) {
        int i3;
        gbx gbxVar2;
        qim0 qim0Var2;
        boolean z;
        b0k b0kVar2;
        qim0 qim0Var3;
        h311 h311VarV;
        qim0 qim0Var4;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1570993194);
        byte b2 = 2;
        if ((i & 6) == 0) {
            i3 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= b0kVar3.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? b0kVar3.g(huxVar) : b0kVar3.i(huxVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= b0kVar3.i(zzq0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            gbxVar2 = gbxVar;
            i3 |= b0kVar3.i(gbxVar2) ? 16384 : 8192;
        } else {
            gbxVar2 = gbxVar;
        }
        int i4 = i2 & 32;
        if (i4 == 0) {
            if ((196608 & i) == 0) {
                qim0Var2 = qim0Var;
                i3 |= b0kVar3.i(qim0Var2) ? 131072 : 65536;
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i3 & 1, z)) {
                if (i4 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                uwr uwrVar = cbx.a;
                cua cuaVar = cbx.b(b0kVar3).f;
                b0kVar2 = b0kVar3;
                jto1.b(dug.f(i1p1.q(qim0Var4, er31.b(4.0f)), cbx.a(b0kVar3).a.b.a(), d4o1.a), new uvx(0, (pgx) null, 0, zzq0Var, (zzq0) null, (tvx) null, (hw61) null, 0, (p3v) null, 503), null, false, null, null, gbxVar2, null, apo.r(-2035898228, new g70(huxVar, b2), b0kVar3), null, null, apo.r(552956686, new kaf(str2, (byte) 5), b0kVar3), lci.b, null, null, apo.r(536958738, new kaf(str, (byte) 6), b0kVar3), b0kVar2, 100663360 | ((i3 << 6) & 3670016), 197040, 26300);
                qim0Var3 = qim0Var4;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var3 = qim0Var2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new bd5(str, str2, huxVar, zzq0Var, gbxVar, qim0Var3, i, i2);
            }
        }
        i3 |= 196608;
        qim0Var2 = qim0Var;
        if ((74899 & i3) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (b0kVar3.Y(i3 & 1, z)) {
            if (i4 != 0) {
                qim0Var4 = nim0.a;
            } else {
                qim0Var4 = qim0Var2;
            }
            uwr uwrVar2 = cbx.a;
            cua cuaVar2 = cbx.b(b0kVar3).f;
            b0kVar2 = b0kVar3;
            jto1.b(dug.f(i1p1.q(qim0Var4, er31.b(4.0f)), cbx.a(b0kVar3).a.b.a(), d4o1.a), new uvx(0, (pgx) null, 0, zzq0Var, (zzq0) null, (tvx) null, (hw61) null, 0, (p3v) null, 503), null, false, null, null, gbxVar2, null, apo.r(-2035898228, new g70(huxVar, b2), b0kVar3), null, null, apo.r(552956686, new kaf(str2, (byte) 5), b0kVar3), lci.b, null, null, apo.r(536958738, new kaf(str, (byte) 6), b0kVar3), b0kVar2, 100663360 | ((i3 << 6) & 3670016), 197040, 26300);
            qim0Var3 = qim0Var4;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var3 = qim0Var2;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new bd5(str, str2, huxVar, zzq0Var, gbxVar, qim0Var3, i, i2);
        }
    }

    public static final void d(v1g v1gVar, iu30 iu30Var, boolean z, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        v1g v1gVar2;
        b0k b0kVar2;
        iu30 iu30Var2;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1356854547);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(v1gVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.h(z) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (b0kVar3.Y(i3 & 1, (i3 & 1171) != 1170)) {
            es41 es41VarC = l6o1.C(0, 0, 1, b0kVar3);
            boolean zG = b0kVar3.g(es41VarC);
            Object objT = b0kVar3.T();
            if (zG || objT == m4cVar) {
                objT = yv91.a(new g61(es41VarC, (byte) 3));
                b0kVar3.s0(objT);
            }
            tob1 tob1Var = (tob1) objT;
            uwr uwrVar = cbx.a;
            long j = ((xex) ((gmt) zex.a.c).b).r;
            int i4 = i3 & 112;
            boolean z2 = i4 == 32;
            Object objT2 = b0kVar3.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new frf(iu30Var, (byte) 11);
                b0kVar3.s0(objT2);
            }
            q3p1.b(0, 1, (Function0) objT2, b0kVar3, false);
            j2i j2iVarR = apo.r(1489917062, new qi6(j, (Object) tob1Var, (Object) iu30Var, (byte) 3), b0kVar3);
            y1g y1gVar = new y1g(j, es41VarC, v1gVar, iu30Var, z);
            v1gVar2 = v1gVar;
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            iu30Var2 = iu30Var;
            irn1.u(qim0Var3, j2iVarR, null, null, apo.r(-1546144564, y1gVar, b0kVar3), b0kVar2, ((i3 >> 9) & 14) | 24624, 12);
            if (z && v1gVar2.h) {
                b0kVar2.i0(2120933936);
                boolean z3 = i4 == 32;
                Object objT3 = b0kVar2.T();
                if (z3 || objT3 == m4cVar) {
                    objT3 = new frf(iu30Var2, (byte) 15);
                    b0kVar2.s0(objT3);
                }
                gyo1.b((Function0) objT3, null, null, b0kVar2, 0);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(2121055983);
                b0kVar2.r(false);
            }
            qim0Var2 = qim0Var3;
        } else {
            v1gVar2 = v1gVar;
            b0kVar2 = b0kVar3;
            iu30Var2 = iu30Var;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new d30(v1gVar2, iu30Var2, z, qim0Var2, i, (byte) 9);
        }
    }

    public static final void e(v1g v1gVar, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var;
        long j;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-337611264);
        int i2 = i | (x340Var2.i(v1gVar) ? 4 : 2) | (x340Var2.i(iu30Var) ? 32 : 16);
        if (x340Var2.Y(i2 & 1, (i2 & 19) != 18)) {
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var2, nim0Var);
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
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            String str = v1gVar.c;
            pe11 pe11Var = v1gVar.f;
            x340Var = x340Var2;
            zgo1.i(str, anm1.N("child_login_qr_code", u291.r(nim0Var, 196.0f)), 0L, 0L, izy0.c, cwl1.o0(x340Var2, 2131957708), dzy0.b, null, null, x340Var, 1597440, 396);
            boolean z = pe11Var == pe11.d;
            String strO0 = cwl1.o0(x340Var, z ? 2131957710 : 2131957709);
            boolean z2 = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z2 || objT == m4cVar) {
                objT = new frf(iu30Var, (byte) 16);
                x340Var.s0(objT);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            hax haxVar = z ? new hax(strO0) : jax.a;
            gdx gdxVarS = yla.s(x340Var);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            foo1.g(gbxVar, uyn1.B(nim0Var, 0.0f, 16.0f, 0.0f, 0.0f, 13), haxVar, gdxVarS, null, apo.r(-261026684, new dr0((byte) 7, z), x340Var), null, apo.r(-1115566142, new j3b(strO0, (byte) 21), x340Var), x340Var, 12779520, 80);
            pe11 pe11Var2 = pe11.c;
            pe11 pe11Var3 = pe11.e;
            if (pe11Var == pe11Var2 || pe11Var == pe11Var3) {
                x340Var.i0(1677675605);
                boolean z3 = pe11Var == pe11Var3;
                String strO1 = cwl1.o0(x340Var, z3 ? 2131957711 : 2131957712);
                lee1 lee1Var = cbx.d(x340Var).m;
                if (z3) {
                    x340Var.i0(1301057246);
                    j = cbx.a(x340Var).b.d;
                } else {
                    x340Var.i0(1301058366);
                    j = cbx.a(x340Var).b.f;
                }
                x340Var.r(false);
                cvx cvxVar2 = cbx.b(x340Var).b;
                qim0 qim0VarB = uyn1.B(nim0Var, 0.0f, 16.0f, 0.0f, 0.0f, 13);
                Object objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = tzf.h;
                    x340Var.s0(objT2);
                }
                uwo1.e(strO1, s161.b(qim0VarB, false, (iu30) objT2), lee1Var, j, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2016);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                x340Var.i0(1678281996);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new a7e(v1gVar, iu30Var, i, (byte) 19);
        }
    }

    public static final void f(lbt0 lbt0Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        qim0 qim0Var2;
        Object next;
        int i3;
        boolean z;
        x340 x340Var2;
        String strK;
        d7t0 d7t0Var = lbt0Var.a;
        nk nkVar = lbt0Var.b;
        im imVar = nkVar.h;
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.k0(774349695);
        j06 j06Var = x340Var3.a;
        if ((i & 6) == 0) {
            i2 = i | (x340Var3.g(lbt0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if (x340Var3.Y(i4 & 1, (i4 & 19) != 18)) {
            Iterator it = nkVar.f.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((gji0) next).a);
            gji0 gji0Var = (gji0) next;
            if (gji0Var == null || (i3 = gji0Var.e) == 0) {
                i3 = 2;
            }
            d36 d36Var = new d36(16.0f, true, new um5(false));
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var3).a.a.a();
            cr31 cr31VarB = er31.b(8.0f);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(uyn1.z(0.0f, 16.0f, 1, dug.f(qim0Var3, jA, cr31VarB)), 1.0f);
            era eraVar = een.P0;
            mbh mbhVarA = jbh.a(d36Var, eraVar, x340Var3, 0);
            int iHashCode = Long.hashCode(x340Var3.T);
            xos0 xos0VarM = x340Var3.m();
            qim0 qim0VarE = zr7.E(x340Var3, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var3.m0();
            boolean z2 = x340Var3.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var3.l(n4kVar);
            } else {
                x340Var3.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var3, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var3, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var3, lljVar3);
            nko1.F(x340Var3);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var3, lljVar4);
            qim0 qim0VarB = uyn1.B(qim0Var3, 16.0f, 16.0f, 16.0f, 0.0f, 8);
            int i5 = i3;
            mbh mbhVarA2 = jbh.a(h36.c, eraVar, x340Var3, 0);
            int iHashCode2 = Long.hashCode(x340Var3.T);
            xos0 xos0VarM2 = x340Var3.m();
            qim0 qim0VarE2 = zr7.E(x340Var3, qim0VarB);
            x340Var3.m0();
            if (x340Var3.S) {
                x340Var3.l(n4kVar);
            } else {
                x340Var3.v0();
            }
            nko1.H(mbhVarA2, x340Var3, lljVar);
            nko1.H(xos0VarM2, x340Var3, lljVar2);
            x0d.q(iHashCode2, x340Var3, lljVar3, x340Var3);
            nko1.H(qim0VarE2, x340Var3, lljVar4);
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var3, 0);
            int iHashCode3 = Long.hashCode(x340Var3.T);
            xos0 xos0VarM3 = x340Var3.m();
            qim0 qim0VarE3 = zr7.E(x340Var3, qim0Var3);
            x340Var3.m0();
            if (x340Var3.S) {
                x340Var3.l(n4kVar);
            } else {
                x340Var3.v0();
            }
            nko1.H(jw31VarA, x340Var3, lljVar);
            nko1.H(xos0VarM3, x340Var3, lljVar2);
            x0d.q(iHashCode3, x340Var3, lljVar3, x340Var3);
            nko1.H(qim0VarE3, x340Var3, lljVar4);
            if (d7t0Var.g == 4 || imVar.e) {
                x340Var3.i0(1192246101);
                qim0Var2 = qim0Var3;
                z = false;
                w0h1.a(wsx.c, isl.a, uyn1.B(u291.r(qim0Var3, 16.0f), 0.0f, 0.0f, 4.0f, 0.0f, 11), 0L, 0L, false, x340Var3, wsx.d | 48, 56);
                uwo1.e(cwl1.o0(x340Var3, 2131959790), null, cbx.d(x340Var3).k, 0L, null, null, 0, false, null, 0, null, x340Var3, 0, 0, 2042);
                x340Var2 = x340Var3;
                x340Var2.r(false);
            } else {
                x340Var3.i0(1192613203);
                x340Var3.r(false);
                z = false;
                x340Var2 = x340Var3;
                qim0Var2 = qim0Var3;
            }
            x340Var2.r(true);
            if (imVar.e) {
                strK = x0d.k(x340Var2, -1043201375, 2131959778, x340Var2, z);
            } else {
                x340Var2.i0(-1043118822);
                x340Var2.r(z);
                strK = d7t0Var.h;
            }
            x340 x340Var4 = x340Var2;
            uwo1.e(strK, null, cbx.d(x340Var2).d, xxq0.c(d7t0Var.d), null, null, 0, false, null, 0, null, x340Var4, 0, 0, 2034);
            x340Var4.r(true);
            int i6 = d7t0Var.i;
            if ((i6 == 2 || i6 == 15 || i6 == 6) && !imVar.e) {
                x340Var4.i0(2026290729);
                uwo1.e(cwl1.o0(x340Var4, 2131959791), uyn1.z(16.0f, 0.0f, 2, qim0Var2), cbx.d(x340Var4).j, cbx.a(x340Var4).b.b, null, null, 0, false, null, 0, null, x340Var4, 0, 0, 2032);
                x340Var = x340Var4;
                x340Var.r(z);
            } else {
                x340Var4.i0(2025074878);
                if (imVar.e) {
                    x340Var4.i0(2025093323);
                    hr80.d((qim0) null, 1.0f, cbx.a(x340Var4).a.b.c(), x340Var4, 0, 1);
                    uwo1.e(cwl1.o0(x340Var4, 2131959777), uyn1.z(16.0f, 0.0f, 2, qim0Var2), cbx.d(x340Var4).j, cbx.a(x340Var4).b.b, null, null, 0, false, null, 0, null, x340Var4, 0, 0, 2032);
                    x340Var = x340Var4;
                    x340Var.r(z);
                } else if (i5 == 1) {
                    x340Var4.i0(2025499237);
                    hr80.d((qim0) null, 1.0f, cbx.a(x340Var4).a.b.c(), x340Var4, 0, 1);
                    uwo1.e(cwl1.o0(x340Var4, 2131959792), uyn1.z(16.0f, 0.0f, 2, qim0Var2), cbx.d(x340Var4).j, cbx.a(x340Var4).b.b, null, null, 0, false, null, 0, null, x340Var4, 0, 0, 2032);
                    x340Var = x340Var4;
                    x340Var.r(z);
                } else {
                    x340Var4.i0(2025884567);
                    int i7 = nkVar.l;
                    uwo1.e(cwl1.U(2131820794, i7, new Object[]{Integer.valueOf(i7)}, x340Var4), uyn1.z(16.0f, 0.0f, 2, qim0Var2), cbx.d(x340Var4).j, cbx.a(x340Var4).b.b, null, null, 0, false, null, 0, null, x340Var4, 0, 0, 2032);
                    x340Var = x340Var4;
                    x340Var.r(z);
                }
                x340Var.r(z);
            }
            x340Var.r(true);
        } else {
            x340Var = x340Var3;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yvs0((Object) lbt0Var, (Object) qim0Var2, i, (byte) 4);
        }
    }

    public static final void g(int i, String str, String str2, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(440985840);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), een.N0, x340Var, 0);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            b(str, x340Var, i2 & 14);
            uwo1.e(str2, null, cbx.d(x340Var).k, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, (i2 >> 3) & 14, 0, 2034);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b071(str, str2, qim0Var2, i, (byte) 4);
        }
    }

    public static final void h(int i, String str, String str2, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1696706183);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(qim0Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            d36 d36Var = new d36(8.0f, true, new um5(false));
            fra fraVar = een.N0;
            qim0 qim0VarX = bin.x(qim0Var, false, null, null, null, function0, 15);
            jw31 jw31VarA = ew31.a(d36Var, fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
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
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            b(str, x340Var, i2 & 14);
            gra graVar = een.h;
            qim0 qim0VarY = uyn1.y(dug.f(nim0.a, cbx.a(x340Var).a.b.a(), er31.a(50)), 12.0f, 6.0f);
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarY);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            uwo1.e(str2, null, cbx.d(x340Var).k, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, (i2 >> 3) & 14, 0, 2034);
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hq6(str, str2, function0, qim0Var, i, (byte) 6);
        }
    }

    public static final Integer i(Uri uri) {
        Object next;
        String str;
        String query = uri.getQuery();
        if (query != null) {
            Iterator it = ihc1.P0(query, new char[]{'&'}, 6).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!ihc1.Y0((String) next, '=').equals("expandGroups"));
            String str2 = (String) next;
            if (str2 != null && (str = (String) o7h.C0(ihc1.P0(str2, new char[]{'='}, 6))) != null) {
                return nhc1.c0(str);
            }
        }
        return null;
    }

    public static final String j(Uri uri) {
        Object next;
        String str;
        String query = uri.getQuery();
        if (query != null) {
            Iterator it = ihc1.P0(query, new char[]{'&'}, 6).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!ihc1.Y0((String) next, '=').equals("facet"));
            String str2 = (String) next;
            if (str2 != null && (str = (String) o7h.C0(ihc1.P0(str2, new char[]{'='}, 6))) != null) {
                return (String) o7h.s0(ihc1.P0(str, new char[]{','}, 6));
            }
        }
        return null;
    }

    public static gg11 k(HubsImmutableComponentBundle hubsImmutableComponentBundle) {
        if (hubsImmutableComponentBundle == null) {
            return gg11.g;
        }
        h380 h380VarA = j380.a();
        for (String str : hubsImmutableComponentBundle.s()) {
            String strB = hubsImmutableComponentBundle.B(str);
            if (strB != null) {
                h380VarA.e(str, strB);
            }
        }
        return h380VarA.b(true);
    }

    public static final String l(String str, String str2, Mode mode) {
        String strEncode = URLEncoder.encode(str, "UTF-8");
        String strName = mode.name();
        StringBuilder sbN = gvg.n("spotify:internal:martini:report-a-problem:", strEncode, "?viewUri=", str2, "&mode=");
        sbN.append(strName);
        return sbN.toString();
    }

    public static final c380 m(String str, c380 c380Var) {
        if (ihc1.y0(str)) {
            return c380Var;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : c380Var) {
            vcj0 vcj0Var = (vcj0) obj;
            if (ihc1.h0(vcj0Var.a.b, str, true) || ihc1.h0(vcj0Var.a.a, str, true)) {
                arrayList.add(obj);
            }
        }
        return mqo1.A(arrayList);
    }

    public static final int n(Object obj) {
        return System.identityHashCode(obj);
    }

    public static void o(Uri uri) {
        asn asnVar;
        ReentrantLock reentrantLock = cro.d;
        reentrantLock.lock();
        if (cro.c == null && (asnVar = cro.b) != null) {
            cro.c = asnVar.l((hwb) null, (PendingIntent) null);
        }
        reentrantLock.unlock();
        reentrantLock.lock();
        wzn wznVar = cro.c;
        if (wznVar != null) {
            Bundle bundle = new Bundle();
            PendingIntent pendingIntent = (PendingIntent) wznVar.d;
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            try {
                ((qg70) wznVar.a).s((hro) wznVar.b, uri, bundle);
            } catch (RemoteException unused) {
            }
        }
        cro.d.unlock();
    }

    public static final void p(Function0 function0, iu30 iu30Var, z511 z511Var) {
        if (((Boolean) iu30Var.invoke(Integer.valueOf(z511Var.e()))).booleanValue()) {
            function0.invoke();
        } else {
            z511Var.w(new zk00(iu30Var, z511Var, function0, (byte) 1));
        }
    }
}
