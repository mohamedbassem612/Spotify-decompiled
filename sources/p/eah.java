package p;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class eah {
    public static final kiv a = mod.t(new ya4((byte) 8));
    public static final kiv b = mod.t(new ya4((byte) 9));

    public static final long a(dah dahVar, long j) {
        long j2 = dahVar.a;
        long j3 = dahVar.U;
        long j4 = dahVar.Q;
        long j5 = dahVar.M;
        long j6 = dahVar.q;
        int i = u7h.l;
        if (z4h1.b(j, j2)) {
            return dahVar.b;
        }
        if (z4h1.b(j, dahVar.f)) {
            return dahVar.g;
        }
        if (z4h1.b(j, dahVar.j)) {
            return dahVar.k;
        }
        if (z4h1.b(j, dahVar.n)) {
            return dahVar.o;
        }
        if (z4h1.b(j, dahVar.w)) {
            return dahVar.x;
        }
        if (z4h1.b(j, dahVar.c)) {
            return dahVar.d;
        }
        if (z4h1.b(j, dahVar.h)) {
            return dahVar.i;
        }
        if (z4h1.b(j, dahVar.l)) {
            return dahVar.m;
        }
        if (z4h1.b(j, dahVar.y)) {
            return dahVar.z;
        }
        if (z4h1.b(j, dahVar.u)) {
            return dahVar.v;
        }
        if (!z4h1.b(j, dahVar.f25p)) {
            if (z4h1.b(j, dahVar.r)) {
                return dahVar.s;
            }
            if (!z4h1.b(j, dahVar.D) && !z4h1.b(j, dahVar.F) && !z4h1.b(j, dahVar.G) && !z4h1.b(j, dahVar.H) && !z4h1.b(j, dahVar.I) && !z4h1.b(j, dahVar.J) && !z4h1.b(j, dahVar.E)) {
                if (z4h1.b(j, dahVar.K) || z4h1.b(j, dahVar.L)) {
                    return j5;
                }
                if (z4h1.b(j, dahVar.O) || z4h1.b(j, dahVar.P)) {
                    return j4;
                }
                if (z4h1.b(j, dahVar.S) || z4h1.b(j, dahVar.T)) {
                    return j3;
                }
                int i2 = u7h.l;
                return nfb.p();
            }
        }
        return j6;
    }

    public static final long b(long j, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(89374938);
        long jA = a(lgo1.n(x340Var), j);
        if (jA == 16) {
            jA = ((u7h) x340Var.k(wrl.a)).a;
        }
        x340Var.r(false);
        return jA;
    }

    public static dah c(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, int i, int i2) {
        long j36 = (i & 1) != 0 ? l8h.z : j;
        return new dah(j36, (i & 2) != 0 ? l8h.j : j2, (i & 4) != 0 ? l8h.A : j3, (i & 8) != 0 ? l8h.k : j4, (i & 16) != 0 ? l8h.e : j5, (i & 32) != 0 ? l8h.E : j6, (i & 64) != 0 ? l8h.n : j7, (i & 128) != 0 ? l8h.F : j8, (i & 256) != 0 ? l8h.o : j9, (i & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0 ? l8h.R : j10, (i & 1024) != 0 ? l8h.t : j11, (i & 2048) != 0 ? l8h.S : j12, (i & 4096) != 0 ? l8h.u : j13, (i & 8192) != 0 ? l8h.a : j14, (i & 16384) != 0 ? l8h.g : j15, (32768 & i) != 0 ? l8h.I : j16, (65536 & i) != 0 ? l8h.r : j17, (131072 & i) != 0 ? l8h.Q : j18, (262144 & i) != 0 ? l8h.s : j19, (524288 & i) != 0 ? j36 : j20, (1048576 & i) != 0 ? l8h.f : j21, (2097152 & i) != 0 ? l8h.d : j22, (4194304 & i) != 0 ? l8h.b : j23, (8388608 & i) != 0 ? l8h.h : j24, (16777216 & i) != 0 ? l8h.c : j25, (33554432 & i) != 0 ? l8h.i : j26, (67108864 & i) != 0 ? l8h.x : j27, (134217728 & i) != 0 ? l8h.y : j28, (268435456 & i) != 0 ? l8h.D : j29, (536870912 & i) != 0 ? l8h.J : j30, l8h.P, (1073741824 & i) != 0 ? l8h.K : j31, (i & Integer.MIN_VALUE) != 0 ? l8h.L : j32, (i2 & 1) != 0 ? l8h.M : j33, (i2 & 2) != 0 ? l8h.N : j34, (i2 & 4) != 0 ? l8h.O : j35, l8h.B, l8h.C, l8h.l, l8h.m, l8h.G, l8h.H, l8h.f66p, l8h.q, l8h.T, l8h.U, l8h.v, l8h.w);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final long d(dah dahVar, int i) throws NoWhenBranchMatchedException {
        switch (l1d.C(i)) {
            case 0:
                return dahVar.n;
            case 1:
                return dahVar.w;
            case 2:
                return dahVar.y;
            case 3:
                return dahVar.v;
            case 4:
                return dahVar.e;
            case 5:
                return dahVar.u;
            case 6:
                return dahVar.o;
            case 7:
                return dahVar.x;
            case 8:
                return dahVar.z;
            case 9:
                return dahVar.b;
            case 10:
                return dahVar.d;
            case 11:
                return dahVar.M;
            case 12:
                return dahVar.N;
            case 13:
                return dahVar.g;
            case 14:
                return dahVar.i;
            case 15:
                return dahVar.Q;
            case 16:
                return dahVar.R;
            case 17:
                return dahVar.q;
            case 18:
                return dahVar.s;
            case 19:
                return dahVar.k;
            case 20:
                return dahVar.m;
            case 21:
                return dahVar.U;
            case 22:
                return dahVar.V;
            case 23:
                return dahVar.A;
            case 24:
                return dahVar.B;
            case 25:
                return dahVar.a;
            case 26:
                return dahVar.c;
            case 27:
                return dahVar.K;
            case 28:
                return dahVar.L;
            case 29:
                return dahVar.C;
            case 30:
                return dahVar.f;
            case 31:
                return dahVar.h;
            case 32:
                return dahVar.O;
            case 33:
                return dahVar.P;
            case 34:
                return dahVar.f25p;
            case 35:
                return dahVar.D;
            case 36:
                return dahVar.F;
            case 37:
                return dahVar.G;
            case 38:
                return dahVar.H;
            case 39:
                return dahVar.I;
            case 40:
                return dahVar.J;
            case 41:
                return dahVar.E;
            case 42:
                return dahVar.t;
            case 43:
                return dahVar.r;
            case 44:
                return dahVar.j;
            case 45:
                return dahVar.l;
            case ConnectMessages$StateResponse.Device.IS_AUTHENTICATED_WITH_CURRENT_USER_FIELD_NUMBER /* 46 */:
                return dahVar.S;
            case ConnectMessages$StateResponse.Device.SUPPORTS_ZEPHYR_FIELD_NUMBER /* 47 */:
                return dahVar.T;
            default:
                eg.o();
                return 0L;
        }
    }

    public static final long e(b0k b0kVar, int i) {
        return d(lgo1.n(b0kVar), i);
    }

    public static dah f(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, int i, int i2) {
        long jZ = (i & 1) != 0 ? z8h.z() : j;
        return new dah(jZ, (i & 2) != 0 ? z8h.j() : j2, (i & 4) != 0 ? z8h.A() : j3, (i & 8) != 0 ? z8h.k() : j4, (i & 16) != 0 ? z8h.e() : j5, (i & 32) != 0 ? z8h.E() : j6, (i & 64) != 0 ? z8h.n() : j7, (i & 128) != 0 ? z8h.F() : j8, (i & 256) != 0 ? z8h.o() : j9, (i & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0 ? z8h.R() : j10, (i & 1024) != 0 ? z8h.t() : j11, (i & 2048) != 0 ? z8h.S() : j12, (i & 4096) != 0 ? z8h.u() : j13, (i & 8192) != 0 ? z8h.a() : j14, (i & 16384) != 0 ? z8h.g() : j15, (32768 & i) != 0 ? z8h.I() : j16, (65536 & i) != 0 ? z8h.r() : j17, (131072 & i) != 0 ? z8h.Q() : j18, (262144 & i) != 0 ? z8h.s() : j19, (524288 & i) != 0 ? jZ : j20, (1048576 & i) != 0 ? z8h.f() : j21, (2097152 & i) != 0 ? z8h.d() : j22, (4194304 & i) != 0 ? z8h.b() : j23, (8388608 & i) != 0 ? z8h.h() : j24, (16777216 & i) != 0 ? z8h.c() : j25, (33554432 & i) != 0 ? z8h.i() : j26, (67108864 & i) != 0 ? z8h.x() : j27, (134217728 & i) != 0 ? z8h.y() : j28, (268435456 & i) != 0 ? z8h.D() : j29, z8h.J(), z8h.P(), (1073741824 & i) != 0 ? z8h.K() : j30, (i & Integer.MIN_VALUE) != 0 ? z8h.L() : j31, (i2 & 1) != 0 ? z8h.M() : j32, (i2 & 2) != 0 ? z8h.N() : j33, (i2 & 4) != 0 ? z8h.O() : j34, z8h.B(), z8h.C(), z8h.l(), z8h.m(), z8h.G(), z8h.H(), z8h.p(), z8h.q(), z8h.T(), z8h.U(), z8h.v(), z8h.w());
    }
}
