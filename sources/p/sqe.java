package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.spotify.mobius.Next;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class sqe {
    public static final cw8 a = new cw8();
    public static b180 b;
    public static b180 c;

    public static Next A(kak0 kak0Var, k2k0 k2k0Var) {
        lhg1 lhg1Var = kak0Var.S0;
        return x1p1.t(x1p1.B(x1p1.x(x1p1.F(Next.h(kak0.a(kak0Var, (pdm0) null, (Boolean) null, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, lhg1.a(lhg1Var, q6w0.a(lhg1Var.a, (buk1) null, (hez) null, (fa20) null, (px30) null, (taa0) null, new k7f0(k2k0Var.a), (s69) null, (s69) null, (gez) null, (gez) null, (r920) null, (r920) null, (ox30) null, (ox30) null, (x6b) null, 32703), (ruq0) null, false, false, 14), (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -262145, 1048575)), kak0Var))), 3);
    }

    public static ne B(cxc cxcVar) {
        ne neVar = new ne((byte) 10);
        neVar.g("https://spclient.wg.spotify.com/");
        neVar.a = cxcVar;
        return neVar;
    }

    public static final void a(p5k p5kVar, int i, boolean z, iu30 iu30Var, b0k b0kVar, int i2) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1604492218);
        int i3 = i2 | (b0kVar3.i(p5kVar) ? 4 : 2) | (b0kVar3.e(i) ? 32 : 16) | (b0kVar3.h(z) ? 256 : 128) | (b0kVar3.i(iu30Var) ? 2048 : 1024);
        if (b0kVar3.Y(i3 & 1, (i3 & 1171) != 1170)) {
            boolean zI = ((i3 & 7168) == 2048) | b0kVar3.i(p5kVar) | ((i3 & 112) == 32);
            Object objT = b0kVar3.T();
            if (zI || objT == fkj0.X) {
                objT = new gu2(iu30Var, p5kVar, i, (byte) 12);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            poo1.g(z, (iu30) objT, new nex(4), yoo1.z(b0kVar3), (qim0) null, 0, (qex) null, (String) null, (max) null, (vu30) null, (vu30) null, (idn0) null, (ga80) null, false, (vzq0) null, apo.r(63660797, new v5k(p5kVar, (byte) 1), b0kVar3), b0kVar2, (i3 >> 6) & 14, 196608, 32752);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new e30(p5kVar, i, z, iu30Var, i2);
        }
    }

    public static final void b(x5k x5kVar, int i, c380 c380Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i2) {
        int i3;
        int i4;
        c380 c380Var2;
        iu30 iu30Var2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(233644391);
        if ((i2 & 6) == 0) {
            i3 = (b0kVar2.i(x5kVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 = i;
            i3 |= b0kVar2.e(i4) ? 32 : 16;
        } else {
            i4 = i;
        }
        if ((i2 & 384) == 0) {
            c380Var2 = c380Var;
            i3 |= b0kVar2.i(c380Var2) ? 256 : 128;
        } else {
            c380Var2 = c380Var;
        }
        if ((i2 & 3072) == 0) {
            iu30Var2 = iu30Var;
            i3 |= b0kVar2.i(iu30Var2) ? 2048 : 1024;
        } else {
            iu30Var2 = iu30Var;
        }
        if ((i2 & 24576) == 0) {
            i3 |= b0kVar2.i(qim0Var) ? 16384 : 8192;
        }
        if (b0kVar2.Y(i3 & 1, (i3 & 9363) != 9362)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0Var);
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
            nko1.H(mbhVarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            String str = x5kVar.a;
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(b0kVar2).e;
            cvx cvxVar = cbx.b(b0kVar2).b;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarB = uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, 12.0f, 7);
            Object objT = b0kVar2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = c6k.b;
                b0kVar2.s0(objT);
            }
            uwo1.e(str, s161.b(qim0VarB, false, (iu30) objT), lee1Var, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2040);
            b0kVar2 = b0kVar2;
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            d36 d36Var = new d36(16.0f, true, new um5(false));
            cvx cvxVar3 = cbx.b(b0kVar2).b;
            d36 d36Var2 = new d36(8.0f, true, new um5(false));
            boolean zI = b0kVar2.i(x5kVar);
            Object objT2 = b0kVar2.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new mwh(x5kVar, (byte) 12);
                b0kVar2.s0(objT2);
            }
            k5p1.d(s161.b(nim0Var, false, (iu30) objT2), d36Var2, d36Var, (pl3) null, 0, 0, apo.r(1114627202, new xo7(x5kVar, i4, c380Var2, iu30Var2, (byte) 4), b0kVar2), b0kVar2, 1572864, 56);
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new lk0(x5kVar, i, c380Var, iu30Var, qim0Var, i2, (byte) 8);
        }
    }

    public static final void c(b6k b6kVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1609061261);
        iu30 iu30Var2 = iu30Var;
        int i2 = i | (x340Var.i(b6kVar) ? 4 : 2) | (x340Var.i(iu30Var2) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0Var3);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
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
            x340Var.i0(-791731928);
            int size = 0;
            for (x5k x5kVar : b6kVar.a) {
                c380 c380VarA = mqo1.A(b6kVar.b);
                uwr uwrVar2 = cbx.a;
                b(x5kVar, size, c380VarA, iu30Var2, uyn1.B(qim0Var3, 0.0f, 0.0f, 0.0f, cbx.b(x340Var).b.b, 7), x340Var, (i2 << 6) & 7168);
                size += x5kVar.b.size();
                iu30Var2 = iu30Var;
            }
            x340Var.r(false);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mzj(b6kVar, iu30Var, qim0Var2, i, (byte) 2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void d(f0u f0uVar, qim0 qim0Var, long j, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        qim0 qim0Var2;
        qim0 qim0Var3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(445030633);
        int i2 = i | (x340Var.e(f0uVar.ordinal()) ? 4 : 2) | 3072 | (x340Var.f(j) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                qim0Var3 = nim0.a;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var;
            }
            x340Var.s();
            x340Var.i0(-656038407);
            int iOrdinal = f0uVar.ordinal();
            isl islVar = isl.a;
            switch (iOrdinal) {
                case 0:
                    x340Var.i0(-1822277660);
                    w0h1.a(jmx.c, islVar, qim0Var3, j, 0L, false, x340Var, jmx.d | 432 | ((i2 >> 3) & 7168), 48);
                    x340Var.r(false);
                    break;
                case 1:
                case 14:
                    x340Var.i0(-1822270681);
                    w0h1.a(gmx.c, islVar, qim0Var3, j, 0L, false, x340Var, gmx.d | 432 | ((i2 >> 3) & 7168), 48);
                    x340Var.r(false);
                    break;
                case 2:
                    x340Var.i0(-1822267771);
                    w0h1.a(nmx.c, islVar, qim0Var3, j, 0L, false, x340Var, nmx.d | 432 | ((i2 >> 3) & 7168), 48);
                    x340Var.r(false);
                    break;
                case 3:
                    x340Var.i0(-1822264827);
                    w0h1.a(hmx.c, islVar, qim0Var3, j, 0L, false, x340Var, hmx.d | 432 | ((i2 >> 3) & 7168), 48);
                    x340Var.r(false);
                    break;
                case 4:
                case 8:
                case 11:
                case 16:
                    x340Var.i0(-1822236654);
                    w0h1.a(lmx.c, islVar, qim0Var3, j, 0L, false, x340Var, lmx.d | 432 | ((i2 >> 3) & 7168), 48);
                    x340Var.r(false);
                    break;
                case 5:
                    x340Var.i0(-1822262143);
                    w0h1.a(omx.c, islVar, qim0Var3, j, 0L, false, x340Var, omx.d | 432 | ((i2 >> 3) & 7168), 48);
                    x340Var.r(false);
                    break;
                case 6:
                    x340Var.i0(-1822259550);
                    w0h1.a(emx.c, islVar, qim0Var3, j, 0L, false, x340Var, emx.d | 432 | ((i2 >> 3) & 7168), 48);
                    x340Var.r(false);
                    break;
                case 7:
                    x340Var.i0(-1822256927);
                    w0h1.a(omx.c, islVar, qim0Var3, j, 0L, false, x340Var, omx.d | 432 | ((i2 >> 3) & 7168), 48);
                    x340Var.r(false);
                    break;
                case 9:
                    x340Var.i0(-1822254043);
                    w0h1.a(jnx.c, islVar, qim0Var3, j, 0L, false, x340Var, jnx.d | 432 | ((i2 >> 3) & 7168), 48);
                    x340Var.r(false);
                    break;
                case 10:
                    x340Var.i0(-1822251103);
                    w0h1.a(omx.c, islVar, qim0Var3, j, 0L, false, x340Var, omx.d | 432 | ((i2 >> 3) & 7168), 48);
                    x340Var.r(false);
                    break;
                case 12:
                    x340Var.i0(-1822242526);
                    w0h1.a(fmx.c, islVar, qim0Var3, j, 0L, false, x340Var, fmx.d | 432 | ((i2 >> 3) & 7168), 48);
                    x340Var.r(false);
                    break;
                case 13:
                    x340Var.i0(-1822248290);
                    w0h1.a(cux.c, islVar, qim0Var3, j, 0L, false, x340Var, cux.d | 432 | ((i2 >> 3) & 7168), 48);
                    x340Var.r(false);
                    break;
                case 15:
                    x340Var.i0(-1822274492);
                    w0h1.a(jmx.c, islVar, qim0Var3, j, 0L, false, x340Var, jmx.d | 432 | ((i2 >> 3) & 7168), 48);
                    x340Var.r(false);
                    break;
                case 17:
                    x340Var.i0(-1822245653);
                    w0h1.a(kmx.c, islVar, qim0Var3, j, 0L, false, x340Var, kmx.d | 432 | ((i2 >> 3) & 7168), 48);
                    x340Var.r(false);
                    break;
                default:
                    throw p3d1.k(x340Var, -1822277847, false);
            }
            x340Var.r(false);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qi6(f0uVar, qim0Var2, j, i);
        }
    }

    public static final void e(qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(509305374);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String strO0 = cwl1.o0(x340Var, 2131957697);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).d;
            long j = cbx.a(x340Var).b.a;
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = gje0.c1;
                x340Var.s0(objT);
            }
            qim0 qim0Var3 = nim0.a;
            uwo1.e(strO0, u291.f(s161.b(qim0Var3, false, (iu30) objT), 1.0f), lee1Var, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new one0(qim0Var2, i, (byte) 2);
        }
    }

    public static final void f(es41 es41Var, vzq0 vzq0Var, jqp jqpVar, kqp kqpVar, w6e0 w6e0Var, r0f0 r0f0Var, b0k b0kVar, int i) {
        int i2;
        vzq0 vzq0Var2;
        kqp kqpVar2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1662160754);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(es41Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            vzq0Var2 = vzq0Var;
            i2 |= b0kVar3.i(vzq0Var2) ? 32 : 16;
        } else {
            vzq0Var2 = vzq0Var;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(jqpVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            kqpVar2 = kqpVar;
            i2 |= b0kVar3.i(kqpVar2) ? 2048 : 1024;
        } else {
            kqpVar2 = kqpVar;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? b0kVar3.g(w6e0Var) : b0kVar3.i(w6e0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar3.i(r0f0Var) ? 131072 : 65536;
        }
        int i3 = i2;
        if (b0kVar3.Y(i3 & 1, (74899 & i3) != 74898)) {
            b0kVar2 = b0kVar3;
            ujo1.a(uyn1.B(nim0.a, 0.0f, vzq0Var2.d(), 0.0f, 0.0f, 13), es41Var, apo.r(1315950787, new uk20(vzq0Var2, r0f0Var, kqpVar2, w6e0Var, jqpVar, (byte) 25), b0kVar3), b0kVar2, ((i3 << 3) & 112) | 384, 0);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new wc0(es41Var, vzq0Var, jqpVar, kqpVar, w6e0Var, r0f0Var, i, (byte) 28);
        }
    }

    public static final void g(qim0 qim0Var, b0k b0kVar, int i) {
        byte b2;
        qim0 qim0Var2;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-102914227);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String strO0 = cwl1.o0(x340Var, 2131957685);
            boolean zG = x340Var.g(strO0);
            Object objT = x340Var.T();
            if (zG || objT == obj) {
                objT = strO0.toUpperCase(Locale.ROOT);
                x340Var.s0(objT);
            }
            String str = (String) objT;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            lee1 lee1Var = cbx.d(x340Var).g;
            long j = cbx.a(x340Var).b.b;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarX = uyn1.x(qim0Var3, 16.0f);
            boolean zG2 = x340Var.g(strO0);
            Object objT2 = x340Var.T();
            if (zG2 || objT2 == obj) {
                objT2 = new z9b0(strO0, (byte) 12);
                x340Var.s0(objT2);
            }
            b2 = 3;
            uwo1.e(str, s161.b(qim0VarX, false, (iu30) objT2), lee1Var, j, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2016);
            qim0Var2 = qim0Var3;
        } else {
            b2 = 3;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new one0(qim0Var2, i, b2);
        }
    }

    public static final void h(r0f0 r0f0Var, iu30 iu30Var, jqp jqpVar, kqp kqpVar, w6e0 w6e0Var, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        long jX;
        Integer num = r0f0Var.e;
        zzy zzyVar = r0f0Var.d;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1067031585);
        int i2 = i | (b0kVar3.i(r0f0Var) ? 4 : 2) | (b0kVar3.i(iu30Var) ? 32 : 16) | (b0kVar3.i(jqpVar) ? 256 : 128) | (b0kVar3.i(kqpVar) ? 2048 : 1024) | (b0kVar3.g(w6e0Var) ? 16384 : 8192) | 196608;
        if (b0kVar3.Y(i2 & 1, (74899 & i2) != 74898)) {
            es41 es41VarC = l6o1.C(0, 0, 1, b0kVar3);
            if (!(zzyVar instanceof xzy) || num == null) {
                b0kVar3.i0(885528271);
                jX = j1e1.x(zzyVar);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(885462148);
                b0kVar3.r(false);
                jX = z4p1.e(num.intValue() | (-16777216));
            }
            long j = jX;
            j2i j2iVarR = apo.r(1361788622, new u0f0(iu30Var, es41VarC, w6e0Var, j), b0kVar3);
            j2i j2iVarR2 = apo.r(-2116270392, new jna(j, es41VarC, jqpVar, kqpVar, w6e0Var, r0f0Var, (byte) 2), b0kVar3);
            b0kVar2 = b0kVar3;
            qim0 qim0Var3 = nim0.a;
            irn1.u(qim0Var3, j2iVarR, (vu30) null, (erl1) null, j2iVarR2, b0kVar2, 24630, 12);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new uuy(r0f0Var, iu30Var, jqpVar, kqpVar, w6e0Var, qim0Var2, i, (byte) 14);
        }
    }

    public static final void i(r0f0 r0f0Var, jqp jqpVar, w6e0 w6e0Var, qim0 qim0Var, b0k b0kVar, int i) {
        w6e0 w6e0Var2;
        qim0 qim0Var2;
        Object objA;
        jqp jqpVar2 = jqpVar;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1203507765);
        int i2 = i | (x340Var.i(r0f0Var) ? 4 : 2) | (x340Var.i(jqpVar2) ? 32 : 16) | (x340Var.g(w6e0Var) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            String strO0 = cwl1.o0(x340Var, 2131957696);
            String strO1 = cwl1.o0(x340Var, 2131957689);
            String str = r0f0Var.b;
            pe11 pe11Var = r0f0Var.f;
            String str2 = r0f0Var.c;
            String str3 = r0f0Var.a;
            String strN0 = cwl1.n0(2131957688, new Object[]{str}, x340Var);
            String strO2 = cwl1.o0(x340Var, 2131957693);
            String strO3 = cwl1.o0(x340Var, 2131957692);
            String strO4 = cwl1.o0(x340Var, 2131957695);
            String strO5 = cwl1.o0(x340Var, 2131957694);
            String strO6 = cwl1.o0(x340Var, 2131957691);
            String strO7 = cwl1.o0(x340Var, 2131957690);
            String strO8 = cwl1.o0(x340Var, 2131957687);
            String strO9 = cwl1.o0(x340Var, 2131957686);
            boolean zG = x340Var.g(strO1) | x340Var.g(strN0) | x340Var.g(strO2) | x340Var.g(strO3) | x340Var.g(strO4) | x340Var.g(strO5) | x340Var.g(strO6) | x340Var.g(strO7) | x340Var.g(strO8) | x340Var.g(strO9);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                objT = mqo1.s(new y980[]{new y980(strO1, strN0), new y980(strO2, strO3), new y980(strO4, strO5), new y980(strO6, strO7), new y980(strO8, strO9)});
                x340Var.s0(objT);
            }
            c9 c9Var = (c9) objT;
            boolean zG2 = x340Var.g(str3) | x340Var.g(str2) | x340Var.e(pe11Var.ordinal()) | x340Var.g(strO0) | x340Var.g(c9Var);
            Object objT2 = x340Var.T();
            if (zG2 || objT2 == m4cVar) {
                w6e0Var2 = w6e0Var;
                jqpVar2 = jqpVar;
                objA = jqpVar2.a(new xnb1(str3, strO0, c9Var, new vzg1(str2, pe11Var, new v0f0(w6e0Var2, (byte) 0))));
                x340Var.s0(objA);
            } else {
                w6e0Var2 = w6e0Var;
                objA = objT2;
                jqpVar2 = jqpVar;
            }
            rih1 rih1Var = rih1.a;
            qim0 qim0Var3 = nim0.a;
            otw.c((y1f0) objA, rih1Var, qim0Var3, (ipb1) null, x340Var, 440, 8);
            qim0Var2 = qim0Var3;
        } else {
            w6e0Var2 = w6e0Var;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cb60(i, r0f0Var, jqpVar2, w6e0Var2, qim0Var2, (byte) 29);
        }
    }

    public static final void j(r0f0 r0f0Var, kqp kqpVar, w6e0 w6e0Var, qim0 qim0Var, b0k b0kVar, int i) {
        kqp kqpVar2;
        w6e0 w6e0Var2;
        qim0 qim0Var2;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1483840623);
        int i2 = i | (x340Var.i(r0f0Var) ? 4 : 2) | (x340Var.i(kqpVar) ? 32 : 16) | (x340Var.g(w6e0Var) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            String strO0 = cwl1.o0(x340Var, 2131960743);
            String strO1 = cwl1.o0(x340Var, 2131957689);
            String str = r0f0Var.b;
            pe11 pe11Var = r0f0Var.f;
            String str2 = r0f0Var.c;
            String str3 = r0f0Var.a;
            String strN0 = cwl1.n0(2131960741, new Object[]{str}, x340Var);
            String strO2 = cwl1.o0(x340Var, 2131957693);
            String strO3 = cwl1.o0(x340Var, 2131957692);
            String strO4 = cwl1.o0(x340Var, 2131957695);
            String strO5 = cwl1.o0(x340Var, 2131957694);
            String strO6 = cwl1.o0(x340Var, 2131957691);
            String strO7 = cwl1.o0(x340Var, 2131960742);
            String strO8 = cwl1.o0(x340Var, 2131957687);
            String strO9 = cwl1.o0(x340Var, 2131960740);
            boolean zG = x340Var.g(strO1) | x340Var.g(strN0) | x340Var.g(strO2) | x340Var.g(strO3) | x340Var.g(strO4) | x340Var.g(strO5) | x340Var.g(strO6) | x340Var.g(strO7) | x340Var.g(strO8) | x340Var.g(strO9);
            Object objT = x340Var.T();
            if (zG || objT == obj) {
                objT = mqo1.s(new y980[]{new y980(strO1, strN0), new y980(strO2, strO3), new y980(strO4, strO5), new y980(strO6, strO7), new y980(strO8, strO9)});
                x340Var.s0(objT);
            }
            c9 c9Var = (c9) objT;
            boolean zG2 = x340Var.g(str3) | x340Var.g(str2) | x340Var.e(pe11Var.ordinal()) | x340Var.g(strO0) | x340Var.g(c9Var);
            Object objT2 = x340Var.T();
            if (zG2 || objT2 == obj) {
                w6e0Var2 = w6e0Var;
                xnb1 xnb1Var = new xnb1(str3, strO0, c9Var, new vzg1(str2, pe11Var, new v0f0(w6e0Var2, (byte) 1)));
                kqpVar2 = kqpVar;
                bza0 bza0Var = (bza0) ((x0f0) ((g1i) kqpVar2.a.c).b).d.get();
                c8o.l(bza0Var);
                objT2 = new a2f0(xnb1Var, bza0Var);
                x340Var.s0(objT2);
            } else {
                kqpVar2 = kqpVar;
                w6e0Var2 = w6e0Var;
            }
            rih1 rih1Var = rih1.a;
            qim0 qim0Var3 = nim0.a;
            otw.c((a2f0) objT2, rih1Var, qim0Var3, (ipb1) null, x340Var, 440, 8);
            qim0Var2 = qim0Var3;
        } else {
            kqpVar2 = kqpVar;
            w6e0Var2 = w6e0Var;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new w0f0(i, r0f0Var, kqpVar2, w6e0Var2, qim0Var2, (byte) 0);
        }
    }

    public static final void k(iu30 iu30Var, es41 es41Var, w6e0 w6e0Var, long j, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1175034594);
        int i2 = i | (x340Var.i(iu30Var) ? 4 : 2) | (x340Var.i(es41Var) ? 32 : 16) | (x340Var.g(w6e0Var) ? 256 : 128) | (x340Var.f(j) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = (i2 & 7168) == 2048;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new qgr0(j);
                x340Var.s0(objT);
            }
            qgr0 qgr0Var = (qgr0) objT;
            String strO0 = cwl1.o0(x340Var, 2131953950);
            boolean zG = x340Var.g(strO0);
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new jsl(strO0);
                x340Var.s0(objT2);
            }
            jsl jslVar = (jsl) objT2;
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = new gbx(z50.c, new bsc0(w6e0Var, iu30Var, (byte) 13));
                x340Var.s0(objT3);
            }
            gbx gbxVar = (gbx) objT3;
            Object objT4 = x340Var.T();
            if (objT4 == m4cVar) {
                objT4 = new tr80(0, 1, 1);
                x340Var.s0(objT4);
            }
            bzn1.e((qim0) null, (vu30) null, false, apo.r(467523520, new zze0(gbxVar, jslVar, (byte) 1), x340Var), qgr0Var, (ngr0) null, ezn1.n(es41Var, (tr80) objT4, x340Var, ((i2 >> 3) & 14) | 24576), (Function0) null, x340Var, 2100224, 167);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new u0f0(iu30Var, es41Var, w6e0Var, j, i);
        }
    }

    public static final void l(jqp jqpVar, r0f0 r0f0Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-34409406);
        int i2 = (x340Var.i(jqpVar) ? 4 : 2) | i | (x340Var.i(r0f0Var) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            String strO0 = cwl1.o0(x340Var, 2131957699);
            String str = r0f0Var.b;
            String str2 = r0f0Var.a;
            String strN0 = cwl1.n0(2131957698, new Object[]{str, str}, x340Var);
            boolean zG = x340Var.g(strN0);
            Object objT = x340Var.T();
            if (zG || objT == obj) {
                objT = mqo1.s(new y980[]{new y980("", strN0)});
                x340Var.s0(objT);
            }
            c9 c9Var = (c9) objT;
            boolean zG2 = x340Var.g(str2) | x340Var.g(strO0) | x340Var.g(c9Var);
            Object objT2 = x340Var.T();
            if (zG2 || objT2 == obj) {
                objT2 = jqpVar.a(new xnb1(str2, strO0, c9Var, wzg1.c));
                x340Var.s0(objT2);
            }
            rih1 rih1Var = rih1.a;
            qim0 qim0Var3 = nim0.a;
            otw.c((y1f0) objT2, rih1Var, qim0Var3, (ipb1) null, x340Var, 440, 8);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qae0(jqpVar, r0f0Var, qim0Var2, i, (byte) 11);
        }
    }

    public static final void m(int i, String str, String str2, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1168101339);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(qim0Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            afx afxVarA = cbx.a(x340Var);
            yxx yxxVar = cbx.a(x340Var).b;
            gfx.d(afx.a(afxVarA, (icx) null, new yxx(yxxVar.a, ((vex) zex.a.e).l, yxxVar.c, yxxVar.d, yxxVar.e, yxxVar.f, yxxVar.g), 13), apo.r(-718535775, new hq6(str, str2, function0, qim0Var), x340Var), x340Var, 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hq6(str, str2, function0, qim0Var, i, (byte) 5);
        }
    }

    public static final void n(Function0 function0, b0k b0kVar, int i) {
        Function0 function1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(887346804);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            s1q0 s1q0VarA = vfe0.a(x340Var);
            if (s1q0VarA == null) {
                x340Var.i0(-574944016);
                x340Var.r(false);
                function1 = null;
            } else {
                x340Var.i0(-574944015);
                boolean zI = x340Var.i(s1q0VarA) | ((i2 & 14) == 4);
                Object objT = x340Var.T();
                if (zI || objT == fkj0.X) {
                    objT = new x0e1(function0, s1q0VarA, (byte) 11);
                    x340Var.s0(objT);
                }
                function1 = (Function0) objT;
                x340Var.r(false);
            }
            if (function1 != null) {
                x340Var.i0(-574808731);
                wro1.h(new gbx(z50.c, function1), ldx.c, (qim0) null, (max) null, yla.p(x340Var), (vzq0) null, false, (idn0) null, (ga80) null, mnj.b, x340Var, 0, 6, 988);
                x340Var.r(false);
            } else {
                x340Var.i0(-574554066);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new h621(function0, i, (byte) 18);
        }
    }

    public static final void o(j2i j2iVar, j2i j2iVar2, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(745167015);
        int i2 = (x340Var.i(qim0Var) ? 256 : 128) | i;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = new pmg0(j2iVar, j2iVar2, (byte) 2);
                x340Var.s0(objT);
            }
            ejo1.l((i2 >> 6) & 14, 0, x340Var, (vu30) objT, qim0Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new huh(j2iVar, j2iVar2, qim0Var, i, (byte) 3);
        }
    }

    public static final boolean p(lsm0 lsm0Var) {
        return lsm0Var.b.a instanceof gec1;
    }

    public static kqk0 q(py9 py9Var) {
        return new kqk0(py9Var.b());
    }

    public static final String r(md80 md80Var) {
        int iOrdinal = md80Var.ordinal();
        if (iOrdinal == 0) {
            return "email";
        }
        if (iOrdinal == 1) {
            return "phone_number";
        }
        eg.o();
        return null;
    }

    public static final String s(at80 at80Var) {
        int iOrdinal = at80Var.ordinal();
        if (iOrdinal == 0) {
            return "control";
        }
        if (iOrdinal == 1) {
            return "email";
        }
        if (iOrdinal == 2) {
            return "phone_number";
        }
        eg.o();
        return null;
    }

    public static final hux t(f0u f0uVar, boolean z, int i) {
        if (z) {
            return imx.c;
        }
        if (i == 3) {
            return unx.c;
        }
        switch (f0uVar.ordinal()) {
            case 0:
                return jmx.c;
            case 1:
                return gmx.c;
            case 2:
                return nmx.c;
            case 3:
                return hmx.c;
            case 4:
            case 8:
            case 11:
            case 16:
                return lmx.c;
            case 5:
                return omx.c;
            case 6:
                return emx.c;
            case 7:
                return omx.c;
            case 9:
                return jnx.c;
            case 10:
                return omx.c;
            case 12:
                return fmx.c;
            case 13:
                return cux.c;
            case 14:
                return gmx.c;
            case 15:
                return jmx.c;
            case 17:
                return kmx.c;
            default:
                eg.o();
                return null;
        }
    }

    public static final int u(f0u f0uVar, boolean z) {
        if (z) {
            return 2131231717;
        }
        switch (f0uVar.ordinal()) {
            case 0:
                return 2131231720;
            case 1:
                return 2131231711;
            case 2:
                return 2131231732;
            case 3:
                return 2131231714;
            case 4:
            case 8:
            case 11:
            case 16:
                return 2131231729;
            case 5:
                return 2131231735;
            case 6:
                return 2131231702;
            case 7:
                return 2131231735;
            case 9:
                return 2131231873;
            case 10:
                return 2131231735;
            case 12:
                return 2131231705;
            case 13:
                return 2131232919;
            case 14:
                return 2131231711;
            case 15:
                return 2131231720;
            case 17:
                return 2131231726;
            default:
                eg.o();
                return 0;
        }
    }

    public static final boolean v(w4i1 w4i1Var) {
        return nhc1.Y(w4i1Var.a, "spotify:agent:", false);
    }

    public static final boolean w(goe goeVar) {
        List list = goeVar.e;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (v(((jwm) it.next()).a)) {
                return true;
            }
        }
        return false;
    }

    public static final void x(pe11 pe11Var, w6e0 w6e0Var) {
        idd1 idd1Var = (idd1) w6e0Var.c;
        idd1 idd1Var2 = (idd1) w6e0Var.e;
        int iOrdinal = pe11Var.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return;
        }
        if (iOrdinal == 2) {
            i8h1 i8h1Var = (i8h1) idd1Var2.getValue();
            l7l0 l7l0Var = (l7l0) idd1Var.getValue();
            l7l0Var.getClass();
            x6h1 x6h1VarC = l7l0Var.b.c();
            x6h1VarC.i.add(new a7h1("refresh_success_message", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = true;
            y6h1 y6h1VarA = x6h1VarC.a();
            k7h1 k7h1Var = new k7h1();
            ((xjn) k7h1Var).a = y6h1VarA;
            ((xjn) k7h1Var).b = l7l0Var.a;
            ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
            i8h1Var.f(k7h1Var.a(), (Set) null);
            return;
        }
        if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                eg.o();
                return;
            }
            i8h1 i8h1Var2 = (i8h1) idd1Var2.getValue();
            l7l0 l7l0Var2 = (l7l0) idd1Var.getValue();
            l7l0Var2.getClass();
            x6h1 x6h1VarC2 = l7l0Var2.b.c();
            x6h1VarC2.i.add(new a7h1("refresh_error_message", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC2.j = true;
            y6h1 y6h1VarA2 = x6h1VarC2.a();
            k7h1 k7h1Var2 = new k7h1();
            ((xjn) k7h1Var2).a = y6h1VarA2;
            ((xjn) k7h1Var2).b = l7l0Var2.a;
            ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
            i8h1Var2.f(k7h1Var2.a(), (Set) null);
        }
    }

    public static final BitmapDrawable y(Context context, int i, float f) {
        Drawable drawableJ = f0o1.j(context, i);
        if (drawableJ == null) {
            drawableJ = f0o1.j(context, 2131231720);
            drawableJ.getClass();
        }
        Drawable drawableMutate = drawableJ.mutate();
        drawableMutate.setTint(context.getColor(2131104462));
        int i2 = (int) f;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawableMutate.setBounds(0, 0, i2, i2);
        drawableMutate.draw(canvas);
        return new BitmapDrawable(context.getResources(), bitmapCreateBitmap);
    }

    public static boolean z(vy4 vy4Var) {
        return vy4Var.a();
    }
}
