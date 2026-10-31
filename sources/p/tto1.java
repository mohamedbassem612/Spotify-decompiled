package p;

import android.graphics.Path;
import android.graphics.RectF;
import com.spotify.common.uri.SpotifyUriParserException;
import com.spotify.encoremobile.facepile.FaceView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class tto1 {
    public static b180 a;

    public static final void a(skf skfVar, int i, boolean z, m5b0 m5b0Var, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i2) {
        int i3;
        qim0 qim0Var2;
        byte b;
        gbx gbxVar;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1150801700);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.g(skfVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.e(l1d.C(i)) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.h(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.i(m5b0Var) ? 2048 : 1024;
        }
        int i4 = i3 | 24576;
        if ((196608 & i2) == 0) {
            i4 |= x340Var.i(iu30Var) ? 131072 : 65536;
        }
        if (x340Var.Y(i4 & 1, (74899 & i4) != 74898)) {
            boolean z2 = skfVar.g > 0;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            uvx uvxVarB = uvx.b((uvx) x340Var.k(vvx.a), 0, (tvx) null, (p3v) null, 30);
            qim0 qim0VarN = anm1.N("chat-row-title-test-tag", u291.f(qim0Var3, 1.0f));
            int i5 = i4 & 458752;
            boolean z3 = i5 == 131072;
            Object objT = x340Var.T();
            if (z3 || objT == m4cVar) {
                objT = new c5a(iu30Var, (byte) 26);
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarN, true, (iu30) objT);
            boolean z4 = i5 == 131072;
            Object objT2 = x340Var.T();
            if (z4 || objT2 == m4cVar) {
                objT2 = new ggf(iu30Var, (byte) 16);
                x340Var.s0(objT2);
            }
            z50 z50Var = z50.c;
            gbx gbxVar2 = new gbx(z50Var, (Function0) objT2);
            if (i == 2) {
                x340Var.i0(1001804213);
                boolean z5 = i5 == 131072;
                Object objT3 = x340Var.T();
                if (z5 || objT3 == m4cVar) {
                    objT3 = new ggf(iu30Var, (byte) 17);
                    x340Var.s0(objT3);
                }
                gbx gbxVar3 = new gbx(z50Var, (Function0) objT3);
                b = 0;
                x340Var.r(false);
                gbxVar = gbxVar3;
            } else {
                b = 0;
                x340Var.i0(1001902266);
                x340Var.r(false);
                gbxVar = null;
            }
            jto1.b(qim0VarB, uvxVarB, null, false, null, null, gbxVar2, gbxVar, apo.r(741959076, new ef8(skfVar, iu30Var, (byte) 18), x340Var), null, apo.r(1771280293, new kkf(skfVar, z2, b), x340Var), apo.r(770224422, new o3(z, (Object) skfVar, (Object) m5b0Var, (byte) 6), x340Var), apo.r(-230831449, new kkf(skfVar, z2, (byte) 1), x340Var), null, null, apo.r(1060968234, new kkf(skfVar, z2, (byte) 2), x340Var), x340Var, 100663360, 197046, 25148);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lkf(skfVar, i, z, m5b0Var, qim0Var2, iu30Var, i2);
        }
    }

    public static final void b(int i, int i2, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1299780401);
        int i3 = (x340Var.e(i) ? 4 : 2) | i2 | 48;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarB = u291.b(18.0f, 0.0f, 2, qim0Var2);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0VarB, cbx.a(x340Var).c.g, er31.a);
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
            gfx.f(6, apo.r(-432248225, new vx1(i, (byte) 6), x340Var), x340Var);
            x340Var.r(true);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mq2((byte) 3, i, i2, qim0Var);
        }
    }

    public static final void c(int i, int i2, long j, long j2, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-787372943);
        int i4 = (x340Var.i(qim0Var) ? 4 : 2) | i | 16 | (((i2 & 4) == 0 && x340Var.f(j2)) ? 256 : 128);
        if (x340Var.Y(i4 & 1, (i4 & 147) != 146)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                uwr uwrVar = cbx.a;
                j = cbx.a(x340Var).b.c;
                i3 = i4 & (-113);
                if ((i2 & 4) != 0) {
                    j2 = cbx.a(x340Var).a.b.a();
                    i3 = i4 & (-1009);
                }
            } else {
                x340Var.b0();
                i3 = i4 & (-113);
                if ((i2 & 4) != 0) {
                    i3 = i4 & (-1009);
                }
            }
            long j3 = j;
            long j4 = j2;
            x340Var.s();
            qim0Var2 = qim0Var;
            shx0.c(1, i3 & 1008, j3, j4, x340Var, qim0Var2);
            j = j3;
            j2 = j4;
        } else {
            qim0Var2 = qim0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hwx(qim0Var2, j, j2, i, i2);
        }
    }

    public static final void d(float f, int i, int i2, long j, long j2, b0k b0kVar, qim0 qim0Var) {
        int i3;
        long j3;
        long jA;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-504535295);
        if ((i & 6) == 0) {
            i3 = (x340Var.d(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            j3 = j;
            i3 |= ((i2 & 4) == 0 && x340Var.f(j3)) ? 256 : 128;
        } else {
            j3 = j;
        }
        if ((i & 3072) == 0) {
            jA = j2;
            i3 |= ((i2 & 8) == 0 && x340Var.f(jA)) ? 2048 : 1024;
        } else {
            jA = j2;
        }
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                if ((i2 & 4) != 0) {
                    uwr uwrVar = cbx.a;
                    j3 = cbx.a(x340Var).b.c;
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    uwr uwrVar2 = cbx.a;
                    jA = cbx.a(x340Var).a.b.a();
                    i3 &= -7169;
                }
            } else {
                x340Var.b0();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
            }
            long j4 = j3;
            long j5 = jA;
            x340Var.s();
            shx0.d(f, 1, i3 & 8078, j4, j5, x340Var, qim0Var);
            j3 = j4;
            jA = j5;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new iwx(f, qim0Var, j3, jA, i, i2);
        }
    }

    public static final void e(String str, String str2, String str3, String str4, int i, Function0 function0, Function0 function1, r281 r281Var, Function0 function2, Function0 function3, Function0 function4, b0k b0kVar, int i2) {
        float f;
        boolean z;
        String strK;
        r281 r281Var2 = r281Var;
        Function0 function5 = function2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2137346163);
        j06 j06Var = x340Var.a;
        int i3 = i2 | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.g(str3) ? 256 : 128) | (x340Var.g(str4) ? 2048 : 1024) | (x340Var.e(i) ? 16384 : 8192) | (x340Var.i(function0) ? 131072 : 65536) | (x340Var.i(function1) ? 1048576 : 524288) | (x340Var.i(r281Var2) ? 8388608 : 4194304) | (x340Var.i(function5) ? 67108864 : 33554432) | (x340Var.i(function3) ? 536870912 : 268435456);
        if (x340Var.Y(i3 & 1, ((i3 & 306783379) == 306783378 && ((x340Var.i(function4) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            boolean z2 = r281Var2 != null;
            nim0 nim0Var = nim0.a;
            boolean z3 = z2;
            qim0 qim0VarF = dug.f(u291.d(nim0Var, 1.0f), u7h.b(u7h.b, 0.85f, 0.0f, 0.0f, 0.0f, 14), d4o1.a);
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                objT = ktd.n(x340Var);
            }
            qim0 qim0VarV = bin.v(qim0VarF, (idn0) objT, null, false, null, null, function4, 28);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarV);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z4 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z4) {
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
            qim0 qim0VarY = voo1.y(u291.d(nim0Var, 1.0f), voo1.g);
            uwr uwrVar = cbx.a;
            qim0 qim0VarZ = uyn1.z(cbx.b(x340Var).b.a, 0.0f, 2, qim0VarY);
            era eraVar = een.Q0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, 0);
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
            wsx wsxVar = wsx.c;
            long j = u7h.f;
            qim0 qim0VarB = uyn1.B(nim0Var, 0.0f, cbx.b(x340Var).b.d, 0.0f, 0.0f, 13);
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(wsxVar, isl.a, u291.r(qim0VarB, 16.0f), j, 0L, true, x340Var, wsx.d | 196656, 16);
            qim0 qim0VarF2 = u291.f(new wnb0(1.0f, true), 1.0f);
            gfh0 gfh0VarC2 = t1c.c(een.h, false);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarF2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC2, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            qim0 qim0VarF3 = dug.f(u291.f(nim0Var, 1.0f), cbx.a(x340Var).a.c, er31.b(cbx.b(x340Var).b.b));
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = ktd.n(x340Var);
            }
            idn0 idn0Var = (idn0) objT2;
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = z7i0.i;
                x340Var.s0(objT3);
            }
            qim0 qim0VarY2 = uyn1.y(bin.v(qim0VarF3, idn0Var, null, false, null, null, (Function0) objT3, 28), cbx.b(x340Var).b.a, cbx.b(x340Var).b.c);
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode4 = Long.hashCode(x340Var.T);
            xos0 xos0VarM4 = x340Var.m();
            qim0 qim0VarE4 = zr7.E(x340Var, qim0VarY2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM4, x340Var, lljVar2);
            x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE4, x340Var, lljVar4);
            int i4 = i3 >> 6;
            xto1.m(str3, str4, i, str2, null, z3, x340Var, (i4 & 1022) | ((i3 << 6) & 7168), 16);
            x340Var = x340Var;
            if (z3) {
                x340Var.i0(1536146148);
                cvx cvxVar = cbx.b(x340Var).b;
                x340Var.r(false);
                f = 6.0f;
            } else {
                x340Var.i0(1536224454);
                f = cbx.b(x340Var).b.a;
                x340Var.r(false);
            }
            op71.g(x340Var, u291.h(nim0Var, f));
            if (z3) {
                x340Var.i0(1536367643);
                r281Var2 = r281Var;
                function5 = function2;
                tro1.f(r281Var2, function5, function3, x340Var, (i3 >> 21) & 1022);
                x340Var.r(false);
            } else {
                r281Var2 = r281Var;
                function5 = function2;
                x340Var.i0(1536580396);
                uwo1.e(cwl1.o0(x340Var, 2131958520), null, cbx.d(x340Var).d, cbx.a(x340Var).b.a, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2018);
                cvx cvxVar2 = cbx.b(x340Var).b;
                op71.g(x340Var, u291.h(nim0Var, 12.0f));
                if (str.length() > 0) {
                    x340Var.i0(1536981815);
                    strK = cwl1.n0(2131958516, new Object[]{str}, x340Var);
                    z = false;
                    x340Var.r(false);
                } else {
                    z = false;
                    strK = x0d.k(x340Var, 1537104575, 2131958517, x340Var, false);
                }
                uwo1.e(strK, null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2018);
                xto1.n(i4 & 7168, 4, ydh.g(cbx.b(x340Var).b.b, 2131958518, x340Var, x340Var, nim0Var), function0, x340Var, u291.D(nim0Var, (era) null, 3), false);
                x340Var.r(z);
            }
            x340Var.r((boolean) r28);
            x340Var.r((boolean) r28);
            String strO0 = cwl1.o0(x340Var, 2131958519);
            lee1 lee1Var = cbx.d(x340Var).h;
            cvx cvxVar3 = cbx.b(x340Var).b;
            qim0 qim0VarB2 = uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, 16.0f, 7);
            Object objT4 = x340Var.T();
            if (objT4 == m4cVar) {
                objT4 = ktd.n(x340Var);
            }
            uwo1.e(strO0, bin.v(qim0VarB2, (idn0) objT4, null, false, null, null, function1, 28), lee1Var, j, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new is9(str, str2, str3, str4, i, function0, function1, r281Var2, function5, function3, function4, i2);
        }
    }

    public static mvs0 f(jh0 jh0Var) {
        int iN = gg.n();
        pbo1 pbo1Var = pbo1.b;
        gg.n();
        mvs0 mvs0Var = new mvs0();
        mvs0Var.a = gh0.a;
        gg.n();
        mvs0Var.a = jh0Var;
        mvs0Var.b = iN;
        mvs0Var.c = pbo1Var;
        return mvs0Var;
    }

    public static final void g(jxc1 jxc1Var, int i, String str, String str2, dzo1 dzo1Var, qim0 qim0Var, Function0 function0, b0k b0kVar, int i2) {
        qim0 qim0Var2;
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1139351670);
        int i4 = i2 | (x340Var.d(61.5f) ? 4 : 2) | (x340Var.d(0.58f) ? 32 : 16) | (x340Var.d(16.0f) ? 256 : 128) | (x340Var.g(jxc1Var) ? 2048 : 1024) | (x340Var.e(i) ? 16384 : 8192) | (x340Var.g(str) ? 131072 : 65536) | (x340Var.g(str2) ? 1048576 : 524288) | (x340Var.g(dzo1Var) ? 8388608 : 4194304) | 100663296 | (x340Var.i(function0) ? 536870912 : 268435456);
        if (x340Var.Y(i4 & 1, (i4 & 306783379) != 306783378)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ktd.n(x340Var);
            }
            idn0 idn0Var = (idn0) objT;
            int iA = (int) (((crl1) x340Var.k(t4k.u)).a() & 4294967295L);
            boolean zE = ((i4 & 14) == 4) | x340Var.e(iA) | ((i4 & 112) == 32) | ((3670016 & i4) == 1048576) | ((29360128 & i4) == 8388608) | ((1879048192 & i4) == 536870912) | x340Var.i(idn0Var) | ((57344 & i4) == 16384) | ((i4 & 7168) == 2048) | ((458752 & i4) == 131072) | ((i4 & 896) == 256);
            Object objT2 = x340Var.T();
            if (zE || objT2 == m4cVar) {
                i3 = 0;
                y3t0 y3t0Var = new y3t0(iA, str, str2, dzo1Var, function0, idn0Var, i, jxc1Var);
                x340Var.s0(y3t0Var);
                objT2 = y3t0Var;
            } else {
                i3 = 0;
            }
            qim0 qim0Var3 = nim0.a;
            ejo1.l(6, i3, x340Var, (vu30) objT2, qim0Var3);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ryb1(jxc1Var, i, str, str2, dzo1Var, qim0Var2, function0, i2);
        }
    }

    public static final void h(skf skfVar, boolean z, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        lee1 lee1Var;
        long j;
        dqs0 dqs0VarT;
        boolean z2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1511509265);
        byte b = 2;
        int i2 = i | (x340Var.g(skfVar) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarH = sgc1.H(2, qim0Var3);
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarH);
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
            qkf qkfVar = skfVar.f;
            wnb0 wnb0Var = new wnb0(1.0f, true);
            boolean zI = x340Var.i(qkfVar);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new mkf(qkfVar, (byte) 0);
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(wnb0Var, false, (iu30) objT);
            af5 af5VarL = l(qkfVar);
            String str = qkfVar.b.a;
            if (z) {
                x340Var.i0(562187064);
                uwr uwrVar = cbx.a;
                lee1Var = cbx.d(x340Var).k;
            } else {
                x340Var.i0(562188244);
                uwr uwrVar2 = cbx.a;
                lee1Var = cbx.d(x340Var).j;
            }
            x340Var.r(false);
            if (z) {
                x340Var.i0(562190095);
                j = cbx.a(x340Var).b.a;
            } else {
                x340Var.i0(562191090);
                j = cbx.a(x340Var).b.b;
            }
            x340Var.r(false);
            zic0 zic0Var = new zic0(1);
            if (qkfVar.c == null) {
                x340Var.i0(647870700);
                x340Var.r(false);
                dqs0VarT = dqs0.e;
                z2 = false;
            } else {
                x340Var.i0(647921664);
                long j2 = cbx.d(x340Var).j.a.b;
                dqs0VarT = mqo1.t(new mmr0("PREVIEW_ICON", new gh80(new d6t0(4, j2, j2), apo.r(-106472410, new gv6(qkfVar, j2, b), x340Var))));
                z2 = false;
                x340Var.r(false);
            }
            boolean z3 = z2;
            uwo1.d(af5VarL, j, qim0VarB, lee1Var, null, null, 2, false, zic0Var, 0, null, dqs0VarT, x340Var, 1572864, 0, 1712);
            x340Var = x340Var;
            if (l(qkfVar).b.length() <= 0 || str.length() <= 0) {
                x340Var.i0(248594039);
                x340Var.r(z3);
            } else {
                x340Var.i0(248301709);
                lee1 lee1Var2 = cbx.d(x340Var).j;
                long j3 = cbx.a(x340Var).b.b;
                Object objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = nve.Y0;
                    x340Var.s0(objT2);
                }
                uwo1.e(" • ", s161.b(qim0Var3, z3, (iu30) objT2), lee1Var2, j3, null, null, 0, false, null, 0, null, x340Var, 6, 0, 2032);
                x340Var.r(z3);
            }
            lee1 lee1Var3 = cbx.d(x340Var).j;
            long j4 = cbx.a(x340Var).b.b;
            zic0 zic0Var2 = new zic0(1);
            boolean zI2 = x340Var.i(qkfVar);
            Object objT3 = x340Var.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new mkf(qkfVar, (byte) 1);
                x340Var.s0(objT3);
            }
            uwo1.e(str, s161.b(qim0Var3, z3, (iu30) objT3), lee1Var3, j4, null, null, 2, false, zic0Var2, 0, null, x340Var, 1572864, 0, 1712);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zs((Object) skfVar, z, (Object) qim0Var2, i, (byte) 10);
        }
    }

    public static final boolean i(Set set, y6b1 y6b1Var) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((y6b1) it.next()).j(y6b1Var)) {
                return true;
            }
        }
        return false;
    }

    public static final int j(int i) {
        if (i == 0) {
            return 0;
        }
        if (i != 1) {
            return (i == 2 || i != 3) ? 3 : 4;
        }
        return 2;
    }

    public static final long k(float f, float f2) {
        float f3 = zjy.j((f * 16.0f) / 9.0f, new p3v(f2)).a;
        return jhc1.c((9.0f * f3) / 16.0f, f3);
    }

    public static final af5 l(qkf qkfVar) {
        hux huxVar = qkfVar.c;
        String str = qkfVar.a;
        if (huxVar == null) {
            return new af5(str);
        }
        ye5 ye5Var = new ye5();
        z6p1.r(ye5Var, "PREVIEW_ICON", "�");
        ye5Var.g(str);
        return ye5Var.p();
    }

    public static boolean n(z1a1 z1a1Var, float f, float f2) {
        if (z1a1Var instanceof itq0) {
            n511 n511Var = ((itq0) z1a1Var).c;
            if (n511Var.a <= f && f < n511Var.c && n511Var.b <= f2 && f2 < n511Var.d) {
                return true;
            }
        } else {
            if (!(z1a1Var instanceof jtq0)) {
                if (z1a1Var instanceof htq0) {
                    return o(f, f2, ((htq0) z1a1Var).c);
                }
                eg.o();
                return false;
            }
            vq31 vq31Var = ((jtq0) z1a1Var).c;
            float f3 = vq31Var.a;
            long j = vq31Var.f;
            long j2 = vq31Var.h;
            long j3 = vq31Var.g;
            float f4 = vq31Var.d;
            float f5 = vq31Var.b;
            float f6 = vq31Var.c;
            long j4 = vq31Var.e;
            if (f >= f3 && f < f6 && f2 >= f5 && f2 < f4) {
                int i = (int) (j4 >> 32);
                int i2 = (int) (j >> 32);
                if (Float.intBitsToFloat(i2) + Float.intBitsToFloat(i) <= vq31Var.b()) {
                    int i3 = (int) (j2 >> 32);
                    int i4 = (int) (j3 >> 32);
                    if (Float.intBitsToFloat(i4) + Float.intBitsToFloat(i3) <= vq31Var.b()) {
                        int i5 = (int) (j4 & 4294967295L);
                        int i6 = (int) (j2 & 4294967295L);
                        if (Float.intBitsToFloat(i6) + Float.intBitsToFloat(i5) <= vq31Var.a()) {
                            int i7 = (int) (j & 4294967295L);
                            int i8 = (int) (4294967295L & j3);
                            if (Float.intBitsToFloat(i8) + Float.intBitsToFloat(i7) <= vq31Var.a()) {
                                float fIntBitsToFloat = Float.intBitsToFloat(i) + f3;
                                float fIntBitsToFloat2 = Float.intBitsToFloat(i5) + f5;
                                float fIntBitsToFloat3 = f6 - Float.intBitsToFloat(i2);
                                float fIntBitsToFloat4 = Float.intBitsToFloat(i7) + f5;
                                float fIntBitsToFloat5 = f6 - Float.intBitsToFloat(i4);
                                float fIntBitsToFloat6 = f4 - Float.intBitsToFloat(i8);
                                float fIntBitsToFloat7 = f4 - Float.intBitsToFloat(i6);
                                float fIntBitsToFloat8 = Float.intBitsToFloat(i3) + f3;
                                if (f < fIntBitsToFloat && f2 < fIntBitsToFloat2) {
                                    return p(f, f2, fIntBitsToFloat, fIntBitsToFloat2, vq31Var.e);
                                }
                                if (f < fIntBitsToFloat8 && f2 > fIntBitsToFloat7) {
                                    return p(f, f2, fIntBitsToFloat8, fIntBitsToFloat7, vq31Var.h);
                                }
                                if (f > fIntBitsToFloat3 && f2 < fIntBitsToFloat4) {
                                    return p(f, f2, fIntBitsToFloat3, fIntBitsToFloat4, vq31Var.f);
                                }
                                if (f <= fIntBitsToFloat5 || f2 <= fIntBitsToFloat6) {
                                    return true;
                                }
                                return p(f, f2, fIntBitsToFloat5, fIntBitsToFloat6, vq31Var.g);
                            }
                        }
                    }
                }
                tw4 tw4VarA = ww4.a();
                tw4VarA.e(vq31Var, 1);
                return o(f, f2, tw4VarA);
            }
        }
        return false;
    }

    public static final boolean o(float f, float f2, u8s0 u8s0Var) {
        float f3 = f - 0.005f;
        float f4 = f2 - 0.005f;
        float f5 = f + 0.005f;
        float f6 = f2 + 0.005f;
        tw4 tw4VarA = ww4.a();
        if (Float.isNaN(f3) || Float.isNaN(f4) || Float.isNaN(f5) || Float.isNaN(f6)) {
            ww4.b("Invalid rectangle, make sure no value is NaN");
        }
        RectF rectF = tw4VarA.b;
        if (rectF == null) {
            rectF = new RectF();
            tw4VarA.b = rectF;
        }
        rectF.set(f3, f4, f5, f6);
        Path path = tw4VarA.a;
        RectF rectF2 = tw4VarA.b;
        rectF2.getClass();
        path.addRect(rectF2, ww4.c(1));
        tw4 tw4VarA2 = ww4.a();
        tw4VarA2.l(u8s0Var, tw4VarA, 1);
        boolean zIsEmpty = tw4VarA2.a.isEmpty();
        tw4VarA2.n();
        tw4VarA.n();
        return !zIsEmpty;
    }

    public static final boolean p(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f6 * f6) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f5 * f5) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
    }

    public static final boolean q(String str) {
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static void s(gw70 gw70Var, af10 af10Var, List list, List list2, boolean z, List list3) {
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        Iterator it2 = list2.iterator();
        int i = 0;
        if (list2.size() <= list.size() || !z) {
            while (it.hasNext() && it2.hasNext()) {
                td10 td10Var = (td10) it2.next();
                sd10 sd10Var = td10Var.d;
                if (sd10Var == null) {
                    sd10Var = list3 != null ? (sd10) o7h.t0(i, list3) : null;
                }
                td10Var.d = sd10Var;
                FaceView faceView = (FaceView) it.next();
                if (af10Var != null) {
                    faceView.e(af10Var, td10Var);
                } else {
                    int i2 = FaceView.f;
                    faceView.g(gw70Var, td10Var, (nww0) null);
                }
                i++;
            }
            while (it.hasNext()) {
                FaceView faceView2 = (FaceView) it.next();
                if (af10Var != null) {
                    faceView2.e(af10Var, (td10) null);
                } else {
                    int i3 = FaceView.f;
                    faceView2.g(gw70Var, (td10) null, (nww0) null);
                }
            }
            return;
        }
        int size = list.size() - 1;
        while (i < size) {
            td10 td10Var2 = (td10) it2.next();
            sd10 sd10Var2 = td10Var2.d;
            if (sd10Var2 == null) {
                sd10Var2 = list3 != null ? (sd10) o7h.t0(i, list3) : null;
            }
            td10Var2.d = sd10Var2;
            FaceView faceView3 = (FaceView) it.next();
            if (af10Var != null) {
                faceView3.e(af10Var, td10Var2);
            } else {
                int i4 = FaceView.f;
                faceView3.g(gw70Var, td10Var2, (nww0) null);
            }
            i++;
        }
        FaceView faceView4 = (FaceView) it.next();
        td10 td10Var3 = new td10((String) null, faceView4.getContext().getString(2131955491, Integer.valueOf(list2.size() - size)), (String) null, (sd10) null);
        td10Var3.e = true;
        td10Var3.d = list3 != null ? (sd10) o7h.A0(list3) : null;
        if (af10Var != null) {
            faceView4.e(af10Var, td10Var3);
        } else {
            int i5 = FaceView.f;
            faceView4.g(gw70Var, td10Var3, (nww0) null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0086  */
    /* JADX WARN: Code duplicated, block: B:37:0x0090  */
    /* JADX WARN: Code duplicated, block: B:48:0x009d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:? A[LOOP:1: B:35:0x008a->B:49:?, LOOP_END, SYNTHETIC] */
    public static aw60 t(ls60 ls60Var) {
        String str;
        boolean z;
        int i;
        int i2;
        Iterator it;
        ps60 ps60Var = ls60Var.a;
        ArrayList arrayList = ls60Var.b.a;
        js60 js60Var = (js60) o7h.q0(arrayList);
        String str2 = js60Var.b;
        ps60 ps60Var2 = js60Var.a;
        if (ps60Var2 == null || (str = ps60Var2.b) == null) {
            str = str2;
        }
        ew60 ew60Var = new ew60(str2, str, ps60Var2 != null ? ps60Var2.c : null);
        String str3 = ps60Var.a;
        String str4 = ps60Var.b;
        if (str4 == null) {
            str4 = str3;
        }
        ew60 ew60Var2 = new ew60(str3, str4, ps60Var.c);
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (true) {
            String str5 = "listening_activity";
            z = true;
            if (!it2.hasNext()) {
                break;
            }
            js60 js60Var2 = (js60) it2.next();
            if (zv60.a[js60Var2.e.ordinal()] != 1 && (str5 = js60Var2.d) == null) {
                str5 = "nearby_dialog";
            }
            arrayList2.add(str5);
        }
        Set setP1 = o7h.p1(arrayList2);
        if (setP1.size() <= 1) {
            if (setP1.contains("listening_activity")) {
                i2 = 2;
            } else {
                i = 1;
            }
            if (!arrayList.isEmpty()) {
                it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((js60) it.next()).e == j16.b) {
                        z = false;
                        break;
                    }
                }
            }
            return new aw60(ew60Var2, ew60Var, size, i, z);
        }
        i2 = 3;
        i = i2;
        if (!arrayList.isEmpty()) {
            it = arrayList.iterator();
            while (it.hasNext()) {
                if (((js60) it.next()).e == j16.b) {
                    z = false;
                    break;
                }
            }
        }
        return new aw60(ew60Var2, ew60Var, size, i, z);
    }

    public static final y6b1 u(String str) {
        try {
            return new y6b1(str, false);
        } catch (SpotifyUriParserException unused) {
            return null;
        }
    }

    public abstract long m();

    public e8b0 r(e8b0 e8b0Var) {
        return e8b0Var;
    }
}
