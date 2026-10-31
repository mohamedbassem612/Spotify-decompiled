package p;

import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.esperanto.esperantocosmos.CosmosTransport;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class hl20 implements jly0 {
    public static jo20 A(a8p a8pVar) {
        return new jo20(a8pVar, (byte) 21);
    }

    public static jo20 B(a8p a8pVar) {
        return new jo20(a8pVar, (byte) 23);
    }

    public static jo20 C(a8p a8pVar) {
        return new jo20(a8pVar, (byte) 24);
    }

    public static gn20 D(gma1 gma1Var) {
        return new gn20(gma1Var.a());
    }

    public static nhp a(l8a l8aVar) {
        return new nhp(l8aVar);
    }

    public static gip b(uy2 uy2Var) {
        return new gip(uy2Var);
    }

    public static mc3 c(ynb0 ynb0Var) {
        mc3 mc3Var = new mc3((byte) 5);
        mc3Var.b = ynb0Var;
        return mc3Var;
    }

    public static x0w d(ynb0 ynb0Var) {
        x0w x0wVar = new x0w((byte) 14);
        x0wVar.b = ynb0Var;
        return x0wVar;
    }

    public static w7w e(ynb0 ynb0Var, ynb0 ynb0Var2) {
        w7w w7wVar = new w7w((byte) 6);
        w7wVar.b = ynb0Var;
        w7wVar.c = ynb0Var2;
        return w7wVar;
    }

    public static gl20 f(caq caqVar, kly0 kly0Var, jo80 jo80Var, caq caqVar2, jly0 jly0Var, jly0 jly0Var2, caq caqVar3, caq caqVar4, jly0 jly0Var3, caq caqVar5, caq caqVar6, g5t g5tVar, jly0 jly0Var4, caq caqVar7, g5t g5tVar2, caq caqVar8, caq caqVar9, caq caqVar10, caq caqVar11, kly0 kly0Var2, jly0 jly0Var5, caq caqVar12) {
        gl20 gl20Var = new gl20();
        gl20Var.a = caqVar;
        gl20Var.b = kly0Var;
        gl20Var.c = jo80Var;
        gl20Var.d = caqVar2;
        gl20Var.e = jly0Var;
        gl20Var.f = jly0Var2;
        gl20Var.g = caqVar3;
        gl20Var.h = caqVar4;
        gl20Var.i = jly0Var3;
        gl20Var.j = caqVar5;
        gl20Var.k = caqVar6;
        gl20Var.l = g5tVar;
        gl20Var.m = jly0Var4;
        gl20Var.n = caqVar7;
        gl20Var.o = g5tVar2;
        gl20Var.p = caqVar8;
        gl20Var.q = caqVar9;
        gl20Var.r = caqVar10;
        gl20Var.s = caqVar11;
        gl20Var.t = kly0Var2;
        gl20Var.u = jly0Var5;
        gl20Var.v = caqVar12;
        return gl20Var;
    }

    public static cx20 g(caq caqVar, jo80 jo80Var, jly0 jly0Var, jly0 jly0Var2, jly0 jly0Var3) {
        cx20 cx20Var = new cx20();
        cx20Var.a = jly0Var;
        cx20Var.b = jly0Var2;
        cx20Var.c = caqVar;
        cx20Var.d = jly0Var3;
        cx20Var.e = jo80Var;
        return cx20Var;
    }

    public static q130 h(caq caqVar, kly0 kly0Var, r7q r7qVar, caq caqVar2, r7q r7qVar2, r7q r7qVar3, jo80 jo80Var, kly0 kly0Var2, r7q r7qVar4, r7q r7qVar5, caq caqVar3, caq caqVar4, caq caqVar5, caq caqVar6, caq caqVar7, caq caqVar8, caq caqVar9, r7q r7qVar6, r7q r7qVar7, kly0 kly0Var3, caq caqVar10, caq caqVar11, kly0 kly0Var4, caq caqVar12, caq caqVar13, kly0 kly0Var5, r7q r7qVar8, r7q r7qVar9, kly0 kly0Var6, caq caqVar14, caq caqVar15, kly0 kly0Var7, caq caqVar16, r7q r7qVar10, kly0 kly0Var8, caq caqVar17, caq caqVar18, caq caqVar19, kly0 kly0Var9, jo80 jo80Var2, jo80 jo80Var3, r7q r7qVar11, caq caqVar20, kly0 kly0Var10, caq caqVar21, r7q r7qVar12, caq caqVar22, kly0 kly0Var11, r7q r7qVar13, caq caqVar23, caq caqVar24, r7q r7qVar14, kly0 kly0Var12, kly0 kly0Var13, kly0 kly0Var14, g5t g5tVar, caq caqVar25, r7q r7qVar15, r7q r7qVar16, r7q r7qVar17, caq caqVar26, caq caqVar27, r7q r7qVar18, caq caqVar28, caq caqVar29, r7q r7qVar19, r7q r7qVar20, r7q r7qVar21, jly0 jly0Var, r7q r7qVar22, caq caqVar30, r7q r7qVar23, r7q r7qVar24, caq caqVar31, r7q r7qVar25, r7q r7qVar26, r7q r7qVar27, caq caqVar32, r7q r7qVar28, caq caqVar33, r7q r7qVar29, kly0 kly0Var15, r7q r7qVar30, r7q r7qVar31, caq caqVar34, kly0 kly0Var16, r7q r7qVar32, r7q r7qVar33, caq caqVar35, kly0 kly0Var17, kly0 kly0Var18, caq caqVar36) {
        q130 q130Var = new q130();
        q130Var.a = caqVar;
        q130Var.b = kly0Var;
        q130Var.c = r7qVar;
        q130Var.d = caqVar2;
        q130Var.e = r7qVar2;
        q130Var.f = r7qVar3;
        q130Var.g = jo80Var;
        q130Var.h = kly0Var2;
        q130Var.i = r7qVar4;
        q130Var.j = r7qVar5;
        q130Var.k = caqVar3;
        q130Var.l = caqVar4;
        q130Var.m = caqVar5;
        q130Var.n = caqVar6;
        q130Var.o = caqVar7;
        q130Var.f38p = caqVar8;
        q130Var.q = caqVar9;
        q130Var.r = r7qVar6;
        q130Var.s = r7qVar7;
        q130Var.t = kly0Var3;
        q130Var.u = caqVar10;
        q130Var.v = caqVar11;
        q130Var.w = kly0Var4;
        q130Var.x = caqVar12;
        q130Var.y = caqVar13;
        q130Var.z = kly0Var5;
        q130Var.A = r7qVar8;
        q130Var.B = r7qVar9;
        q130Var.C = kly0Var6;
        q130Var.D = caqVar14;
        q130Var.E = caqVar15;
        q130Var.F = kly0Var7;
        q130Var.G = caqVar16;
        q130Var.H = r7qVar10;
        q130Var.I = kly0Var8;
        q130Var.J = caqVar17;
        q130Var.K = caqVar18;
        q130Var.L = caqVar19;
        q130Var.M = kly0Var9;
        q130Var.N = jo80Var2;
        q130Var.O = jo80Var3;
        q130Var.P = r7qVar11;
        q130Var.Q = caqVar20;
        q130Var.R = kly0Var10;
        q130Var.S = caqVar21;
        q130Var.T = r7qVar12;
        q130Var.U = caqVar22;
        q130Var.V = kly0Var11;
        q130Var.W = r7qVar13;
        q130Var.X = caqVar23;
        q130Var.Y = caqVar24;
        q130Var.Z = r7qVar14;
        q130Var.a0 = kly0Var12;
        q130Var.b0 = kly0Var13;
        q130Var.c0 = kly0Var14;
        q130Var.d0 = g5tVar;
        q130Var.e0 = caqVar25;
        q130Var.f0 = r7qVar15;
        q130Var.g0 = r7qVar16;
        q130Var.h0 = r7qVar17;
        q130Var.i0 = caqVar26;
        q130Var.j0 = caqVar27;
        q130Var.k0 = r7qVar18;
        q130Var.l0 = caqVar28;
        q130Var.m0 = caqVar29;
        q130Var.n0 = r7qVar19;
        q130Var.o0 = r7qVar20;
        q130Var.p0 = r7qVar21;
        q130Var.q0 = jly0Var;
        q130Var.r0 = r7qVar22;
        q130Var.s0 = caqVar30;
        q130Var.t0 = r7qVar23;
        q130Var.u0 = r7qVar24;
        q130Var.v0 = caqVar31;
        q130Var.w0 = r7qVar25;
        q130Var.x0 = r7qVar26;
        q130Var.y0 = r7qVar27;
        q130Var.z0 = caqVar32;
        q130Var.A0 = r7qVar28;
        q130Var.B0 = caqVar33;
        q130Var.C0 = r7qVar29;
        q130Var.D0 = kly0Var15;
        q130Var.E0 = r7qVar30;
        q130Var.F0 = r7qVar31;
        q130Var.G0 = caqVar34;
        q130Var.H0 = kly0Var16;
        q130Var.I0 = r7qVar32;
        q130Var.J0 = r7qVar33;
        q130Var.K0 = caqVar35;
        q130Var.L0 = kly0Var17;
        q130Var.M0 = kly0Var18;
        q130Var.N0 = caqVar36;
        return q130Var;
    }

    public static w530 i(r7q r7qVar, r7q r7qVar2, r7q r7qVar3, kly0 kly0Var, r7q r7qVar4, r7q r7qVar5, caq caqVar, kly0 kly0Var2, r7q r7qVar6, caq caqVar2, r7q r7qVar7, g5t g5tVar, r7q r7qVar8, r7q r7qVar9, g5t g5tVar2, caq caqVar3, caq caqVar4, r7q r7qVar10, r7q r7qVar11, r7q r7qVar12, r7q r7qVar13, caq caqVar5, r7q r7qVar14, jo80 jo80Var, kly0 kly0Var3, caq caqVar6, caq caqVar7, r7q r7qVar15, r7q r7qVar16, r7q r7qVar17, gbp gbpVar, kly0 kly0Var4, kly0 kly0Var5, jly0 jly0Var, g5t g5tVar3, r7q r7qVar18, caq caqVar8, caq caqVar9, caq caqVar10, caq caqVar11, caq caqVar12, caq caqVar13, caq caqVar14, caq caqVar15, caq caqVar16, r7q r7qVar19, kly0 kly0Var6, kly0 kly0Var7, caq caqVar17, caq caqVar18, r7q r7qVar20, kly0 kly0Var8, caq caqVar19, r7q r7qVar21, kly0 kly0Var9, r7q r7qVar22) {
        w530 w530Var = new w530();
        w530Var.a = r7qVar;
        w530Var.b = r7qVar2;
        w530Var.c = r7qVar3;
        w530Var.d = kly0Var;
        w530Var.e = r7qVar4;
        w530Var.f = r7qVar5;
        w530Var.g = caqVar;
        w530Var.h = kly0Var2;
        w530Var.i = r7qVar6;
        w530Var.j = caqVar2;
        w530Var.k = r7qVar7;
        w530Var.l = g5tVar;
        w530Var.m = r7qVar8;
        w530Var.n = r7qVar9;
        w530Var.o = g5tVar2;
        w530Var.f48p = caqVar3;
        w530Var.q = caqVar4;
        w530Var.r = r7qVar10;
        w530Var.s = r7qVar11;
        w530Var.t = r7qVar12;
        w530Var.u = r7qVar13;
        w530Var.v = caqVar5;
        w530Var.w = r7qVar14;
        w530Var.x = jo80Var;
        w530Var.y = kly0Var3;
        w530Var.z = caqVar6;
        w530Var.A = caqVar7;
        w530Var.B = r7qVar15;
        w530Var.C = r7qVar16;
        w530Var.D = r7qVar17;
        w530Var.E = gbpVar;
        w530Var.F = kly0Var4;
        w530Var.G = kly0Var5;
        w530Var.H = jly0Var;
        w530Var.I = g5tVar3;
        w530Var.J = r7qVar18;
        w530Var.K = caqVar8;
        w530Var.L = caqVar9;
        w530Var.M = caqVar10;
        w530Var.N = caqVar11;
        w530Var.O = caqVar12;
        w530Var.P = caqVar13;
        w530Var.Q = caqVar14;
        w530Var.R = caqVar15;
        w530Var.S = caqVar16;
        w530Var.T = r7qVar19;
        w530Var.U = kly0Var6;
        w530Var.V = kly0Var7;
        w530Var.W = caqVar17;
        w530Var.X = caqVar18;
        w530Var.Y = r7qVar20;
        w530Var.Z = kly0Var8;
        w530Var.a0 = caqVar19;
        w530Var.b0 = r7qVar21;
        w530Var.c0 = kly0Var9;
        w530Var.d0 = r7qVar22;
        return w530Var;
    }

    public static jo20 j(a8p a8pVar) {
        return new jo20(a8pVar, (byte) 0);
    }

    public static jo20 k(kly0 kly0Var) {
        return new jo20(kly0Var, (byte) 1);
    }

    public static jo20 l(a8p a8pVar) {
        return new jo20(a8pVar, (byte) 3);
    }

    public static jo20 m(a8p a8pVar) {
        return new jo20(a8pVar, (byte) 5);
    }

    public static jo20 n(a8p a8pVar) {
        return new jo20(a8pVar, (byte) 8);
    }

    public static jj4 o(nhp nhpVar) {
        jj4 jj4Var = (jj4) nhpVar.b.get();
        c8o.m(jj4Var);
        return jj4Var;
    }

    public static w430 p(gip gipVar) {
        return new w430(new be(new CosmosTransport(new x430((RxRouter) gipVar.a.d.get(), (byte) 0))));
    }

    public static r630 q(gip gipVar) {
        r630 r630Var = (r630) gipVar.b.get();
        c8o.m(r630Var);
        return r630Var;
    }

    public static w730 r(RetrofitMaker retrofitMaker) {
        w730 w730Var = (w730) retrofitMaker.createWebgateService(w730.class, "android-follow-follow-impl");
        c8o.m(w730Var);
        return w730Var;
    }

    public static dc30 s(caq caqVar) {
        return new dc30(new ac30(new idd1(new pd3(caqVar, (byte) 6)), (byte) 0), 27);
    }

    public static jo20 t(a8p a8pVar) {
        return new jo20(a8pVar, (byte) 12);
    }

    public static bn u(a8p a8pVar) {
        return new bn(a8pVar, (byte) 2);
    }

    public static n3l v(a8p a8pVar) {
        return ((p3l) a8pVar.get()).H();
    }

    public static gmy0 w(fmy0 fmy0Var) {
        return fmy0Var.b();
    }

    public static f89 x(a8p a8pVar) {
        return new f89(a8pVar, (byte) 3);
    }

    public static m141 y(gip gipVar) {
        uy2 uy2Var = gipVar.a;
        return new m141((g7h) uy2Var.c.get(), new ij01(r((RetrofitMaker) uy2Var.a.get()), (byte) 13));
    }

    public static jo20 z(a8p a8pVar) {
        return new jo20(a8pVar, (byte) 17);
    }
}
