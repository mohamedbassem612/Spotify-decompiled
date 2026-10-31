package p;

import com.spotify.cosmos.cosmonaut.Cosmonaut;
import com.spotify.signup.signup.v2.proto.GetSignupFlagsResponse;
import io.reactivex.rxjava3.core.Observable;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class rt71 implements jly0 {
    public static o6b1 A() {
        return new o6b1();
    }

    public static xe01 B(mr20 mr20Var, x8c0 x8c0Var) {
        return d5p1.t(hu20.e(mr20Var, new o681(3, (lnm) null, (byte) 1)), zso1.H(x8c0Var), new alb1(60000L, Long.MAX_VALUE), Boolean.FALSE);
    }

    public static dqq C(erd erdVar) {
        return new dqq(erdVar);
    }

    public static sva a(ynb0 ynb0Var) {
        return new sva(ynb0Var, (byte) 2);
    }

    public static uww0 b(ynb0 ynb0Var) {
        return new uww0(ynb0Var, (byte) 10);
    }

    public static k4z0 c(ynb0 ynb0Var, ynb0 ynb0Var2) {
        k4z0 k4z0Var = new k4z0((byte) 11);
        k4z0Var.b = ynb0Var;
        k4z0Var.c = ynb0Var2;
        return k4z0Var;
    }

    public static g561 d(ynb0 ynb0Var) {
        g561 g561Var = new g561((byte) 7);
        g561Var.b = ynb0Var;
        return g561Var;
    }

    public static l481 e(r7q r7qVar, r7q r7qVar2, gbp gbpVar, gbp gbpVar2, r7q r7qVar3, r7q r7qVar4, r7q r7qVar5, r7q r7qVar6, g5t g5tVar, gbp gbpVar3, gbp gbpVar4, caq caqVar, caq caqVar2, caq caqVar3, caq caqVar4, caq caqVar5, r7q r7qVar7, r7q r7qVar8, jo80 jo80Var, jo80 jo80Var2, kly0 kly0Var, caq caqVar6, r7q r7qVar9, kly0 kly0Var2, caq caqVar7, caq caqVar8, caq caqVar9, r7q r7qVar10, r7q r7qVar11, r7q r7qVar12, caq caqVar10, jo80 jo80Var3, kly0 kly0Var3, r7q r7qVar13, kly0 kly0Var4, kly0 kly0Var5, kly0 kly0Var6, kly0 kly0Var7, r7q r7qVar14, kly0 kly0Var8, r7q r7qVar15, jly0 jly0Var, caq caqVar11, r7q r7qVar16, r7q r7qVar17, g5t g5tVar2, r7q r7qVar18, r7q r7qVar19, gbp gbpVar5, caq caqVar12, kly0 kly0Var9, kly0 kly0Var10, jly0 jly0Var2, r7q r7qVar20, caq caqVar13, r7q r7qVar21, r7q r7qVar22, caq caqVar14, r7q r7qVar23, r7q r7qVar24, r7q r7qVar25, r7q r7qVar26, r7q r7qVar27, r7q r7qVar28, jly0 jly0Var3, jly0 jly0Var4, g5t g5tVar3, caq caqVar15, caq caqVar16, kly0 kly0Var11, gbp gbpVar6, kly0 kly0Var12, g5t g5tVar4, caq caqVar17, r7q r7qVar29, r7q r7qVar30, r7q r7qVar31, g5t g5tVar5, kly0 kly0Var13, caq caqVar18, kly0 kly0Var14, caq caqVar19, r7q r7qVar32, r7q r7qVar33, caq caqVar20, kly0 kly0Var15, r7q r7qVar34, caq caqVar21, r7q r7qVar35, kly0 kly0Var16, jly0 jly0Var5, kly0 kly0Var17, r7q r7qVar36, r7q r7qVar37, caq caqVar22, caq caqVar23, caq caqVar24, caq caqVar25, caq caqVar26, caq caqVar27, caq caqVar28, kly0 kly0Var18, caq caqVar29, caq caqVar30, r7q r7qVar38, r7q r7qVar39, r7q r7qVar40, gbp gbpVar7, caq caqVar31, caq caqVar32, kly0 kly0Var19, caq caqVar33, r7q r7qVar41, r7q r7qVar42, r7q r7qVar43, gbp gbpVar8, r7q r7qVar44, r7q r7qVar45, kly0 kly0Var20, kly0 kly0Var21, r7q r7qVar46, kly0 kly0Var22, gbp gbpVar9, kly0 kly0Var23, r7q r7qVar47, r7q r7qVar48, r7q r7qVar49, kly0 kly0Var24, r7q r7qVar50, r7q r7qVar51, jly0 jly0Var6) {
        l481 l481Var = new l481();
        l481Var.a = r7qVar;
        l481Var.b = r7qVar2;
        l481Var.c = gbpVar;
        l481Var.d = gbpVar2;
        l481Var.e = r7qVar3;
        l481Var.f = r7qVar4;
        l481Var.g = r7qVar5;
        l481Var.h = r7qVar6;
        l481Var.i = g5tVar;
        l481Var.j = gbpVar3;
        l481Var.k = gbpVar4;
        l481Var.l = caqVar;
        l481Var.m = caqVar2;
        l481Var.n = caqVar3;
        l481Var.o = caqVar4;
        l481Var.f37p = caqVar5;
        l481Var.q = r7qVar7;
        l481Var.r = r7qVar8;
        l481Var.s = jo80Var;
        l481Var.t = jo80Var2;
        l481Var.u = kly0Var;
        l481Var.v = caqVar6;
        l481Var.w = r7qVar9;
        l481Var.x = kly0Var2;
        l481Var.y = caqVar7;
        l481Var.z = caqVar8;
        l481Var.A = caqVar9;
        l481Var.B = r7qVar10;
        l481Var.C = r7qVar11;
        l481Var.D = r7qVar12;
        l481Var.E = caqVar10;
        l481Var.F = jo80Var3;
        l481Var.G = kly0Var3;
        l481Var.H = r7qVar13;
        l481Var.I = kly0Var4;
        l481Var.J = kly0Var5;
        l481Var.K = kly0Var6;
        l481Var.L = kly0Var7;
        l481Var.M = r7qVar14;
        l481Var.N = kly0Var8;
        l481Var.O = r7qVar15;
        l481Var.P = jly0Var;
        l481Var.Q = caqVar11;
        l481Var.R = r7qVar16;
        l481Var.S = r7qVar17;
        l481Var.T = g5tVar2;
        l481Var.U = r7qVar18;
        l481Var.V = r7qVar19;
        l481Var.W = gbpVar5;
        l481Var.X = caqVar12;
        l481Var.Y = kly0Var9;
        l481Var.Z = kly0Var10;
        l481Var.a0 = jly0Var2;
        l481Var.b0 = r7qVar20;
        l481Var.c0 = caqVar13;
        l481Var.d0 = r7qVar21;
        l481Var.e0 = r7qVar22;
        l481Var.f0 = caqVar14;
        l481Var.g0 = r7qVar23;
        l481Var.h0 = r7qVar24;
        l481Var.i0 = r7qVar25;
        l481Var.j0 = r7qVar26;
        l481Var.k0 = r7qVar27;
        l481Var.l0 = r7qVar28;
        l481Var.m0 = jly0Var3;
        l481Var.n0 = jly0Var4;
        l481Var.o0 = g5tVar3;
        l481Var.p0 = caqVar15;
        l481Var.q0 = caqVar16;
        l481Var.r0 = kly0Var11;
        l481Var.s0 = gbpVar6;
        l481Var.t0 = kly0Var12;
        l481Var.u0 = g5tVar4;
        l481Var.v0 = caqVar17;
        l481Var.w0 = r7qVar29;
        l481Var.x0 = r7qVar30;
        l481Var.y0 = r7qVar31;
        l481Var.z0 = g5tVar5;
        l481Var.A0 = kly0Var13;
        l481Var.B0 = caqVar18;
        l481Var.C0 = kly0Var14;
        l481Var.D0 = caqVar19;
        l481Var.E0 = r7qVar32;
        l481Var.F0 = r7qVar33;
        l481Var.G0 = caqVar20;
        l481Var.H0 = kly0Var15;
        l481Var.I0 = r7qVar34;
        l481Var.J0 = caqVar21;
        l481Var.K0 = r7qVar35;
        l481Var.L0 = kly0Var16;
        l481Var.M0 = jly0Var5;
        l481Var.N0 = kly0Var17;
        l481Var.O0 = r7qVar36;
        l481Var.P0 = r7qVar37;
        l481Var.Q0 = caqVar22;
        l481Var.R0 = caqVar23;
        l481Var.S0 = caqVar24;
        l481Var.T0 = caqVar25;
        l481Var.U0 = caqVar26;
        l481Var.V0 = caqVar27;
        l481Var.W0 = caqVar28;
        l481Var.X0 = kly0Var18;
        l481Var.Y0 = caqVar29;
        l481Var.Z0 = caqVar30;
        l481Var.a1 = r7qVar38;
        l481Var.b1 = r7qVar39;
        l481Var.c1 = r7qVar40;
        l481Var.d1 = gbpVar7;
        l481Var.e1 = caqVar31;
        l481Var.f1 = caqVar32;
        l481Var.g1 = kly0Var19;
        l481Var.h1 = caqVar33;
        l481Var.i1 = r7qVar41;
        l481Var.j1 = r7qVar42;
        l481Var.k1 = r7qVar43;
        l481Var.l1 = gbpVar8;
        l481Var.m1 = r7qVar44;
        l481Var.n1 = r7qVar45;
        l481Var.o1 = kly0Var20;
        l481Var.p1 = kly0Var21;
        l481Var.q1 = r7qVar46;
        l481Var.r1 = kly0Var22;
        l481Var.s1 = gbpVar9;
        l481Var.t1 = kly0Var23;
        l481Var.u1 = r7qVar47;
        l481Var.v1 = r7qVar48;
        l481Var.w1 = r7qVar49;
        l481Var.x1 = kly0Var24;
        l481Var.y1 = r7qVar50;
        l481Var.z1 = r7qVar51;
        l481Var.A1 = jly0Var6;
        return l481Var;
    }

    public static g681 f(r7q r7qVar, gbp gbpVar, r7q r7qVar2) {
        g681 g681Var = new g681();
        g681Var.a = r7qVar;
        g681Var.b = gbpVar;
        g681Var.c = r7qVar2;
        return g681Var;
    }

    public static v591 g(jly0 jly0Var, jly0 jly0Var2) {
        v591 v591Var = new v591();
        v591Var.a = jly0Var;
        v591Var.b = jly0Var2;
        return v591Var;
    }

    public static e691 h(jly0 jly0Var, jly0 jly0Var2, jly0 jly0Var3, caq caqVar, caq caqVar2, jo80 jo80Var, jly0 jly0Var4) {
        e691 e691Var = new e691();
        e691Var.a = jly0Var;
        e691Var.b = jly0Var2;
        e691Var.c = jly0Var3;
        e691Var.d = caqVar;
        e691Var.e = caqVar2;
        e691Var.f = jo80Var;
        e691Var.g = jly0Var4;
        return e691Var;
    }

    public static uww0 i(ynb0 ynb0Var) {
        return new uww0(ynb0Var, (byte) 11);
    }

    public static g561 j(ynb0 ynb0Var) {
        g561 g561Var = new g561((byte) 8);
        g561Var.b = ynb0Var;
        return g561Var;
    }

    public static uww0 k(ynb0 ynb0Var) {
        return new uww0(ynb0Var, (byte) 13);
    }

    public static wf81 l(dj81 dj81Var, thq thqVar, kly0 kly0Var, thq thqVar2) {
        int iC = l1d.C(dj81Var.a());
        if (iC == 0) {
            return (wf81) thqVar.get();
        }
        if (iC == 1) {
            return (wf81) kly0Var.get();
        }
        if (iC == 2) {
            return (wf81) thqVar2.get();
        }
        eg.o();
        return null;
    }

    public static String m(dma1 dma1Var) {
        String strE = dma1Var.e(i57.a, (String) null);
        if (strE == null) {
            return "wss://hovercraft-asr.spotify.com/hovercraft-asr/v1/transcribe_ws_protobuf";
        }
        String str = ihc1.y0(strE) ? null : strE;
        return str == null ? "wss://hovercraft-asr.spotify.com/hovercraft-asr/v1/transcribe_ws_protobuf" : str;
    }

    public static bpb1 n() {
        return gio1.b(a090.a);
    }

    public static List o(y3v0 y3v0Var) {
        return y3v0Var.b;
    }

    public static uzl0 p() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new uzl0(yon1.G1("SIDEDRAWER", "sidedrawer", 1881, "sidedrawer").c);
    }

    public static jf11 q(yzp yzpVar) {
        return new jf11(yzpVar, (byte) 29);
    }

    public static gu r(xgb xgbVar) {
        return (gu) xgbVar.a.get();
    }

    public static oe41 s(dg30 dg30Var) {
        return (oe41) ((g0i) dg30Var).d.c;
    }

    public static ut71 t(dqq dqqVar) {
        ut71 ut71Var = (ut71) dqqVar.b.get();
        c8o.m(ut71Var);
        return ut71Var;
    }

    public static kv71 u(ib4 ib4Var, kly0 kly0Var) {
        return new kv71(ib4Var, kly0Var);
    }

    public static f481 v(Cosmonaut cosmonaut) {
        f481 f481Var = (f481) cosmonaut.createCosmosService(f481.class);
        c8o.m(f481Var);
        return f481Var;
    }

    public static ezc w(t15 t15Var) {
        Observable observableH;
        if (t15Var.b != null) {
            observableH = ((Observable) t15Var.d.getValue()).map(stf0.X).distinctUntilChanged();
            observableH.getClass();
        } else {
            observableH = l1d.h(t15Var.a);
        }
        return yoi1.g(observableH);
    }

    public static xh81 x(fh81 fh81Var, ph81 ph81Var) {
        return new xh81(fh81Var, ph81Var);
    }

    public static Observable y(br81 br81Var) {
        return br81Var.c(kn81.a).toObservable().share().doOnError(w841.W0).onErrorResumeWith(Observable.just(GetSignupFlagsResponse.C().build()));
    }

    public static ep31 z(xa91 xa91Var) {
        return new ep31(xa91Var, (byte) 17);
    }
}
