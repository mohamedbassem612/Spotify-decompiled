package p;

import android.content.Context;
import android.os.Build;
import android.os.Parcelable;
import com.spotify.connect.devicessortingimpl.data.DevicePickerSortingDatabase;
import io.reactivex.rxjava3.core.Flowable;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class brt implements jly0 {
    public static Set A(p2o0 p2o0Var) {
        return (Set) p2o0Var.b;
    }

    public static Set B(p2o0 p2o0Var) {
        return (Set) p2o0Var.e;
    }

    public static Set C(p2o0 p2o0Var) {
        return (Set) p2o0Var.c;
    }

    public static lik1 D(abu abuVar) {
        Parcelable.Creator creator = lik1.CREATOR;
        return new lik1(abuVar.getContextUri());
    }

    public static yap a(toj0 toj0Var) {
        return new yap(toj0Var);
    }

    public static h21 b(ynb0 ynb0Var) {
        return new h21(ynb0Var, (byte) 22);
    }

    public static odc c(ynb0 ynb0Var, ynb0 ynb0Var2) {
        odc odcVar = new odc((byte) 26);
        odcVar.b = ynb0Var;
        odcVar.c = ynb0Var2;
        return odcVar;
    }

    public static tdl d(ynb0 ynb0Var) {
        tdl tdlVar = new tdl((byte) 18);
        tdlVar.b = ynb0Var;
        return tdlVar;
    }

    public static yrt e(jo80 jo80Var, jly0 jly0Var, jly0 jly0Var2, caq caqVar) {
        yrt yrtVar = new yrt();
        yrtVar.a = jo80Var;
        yrtVar.b = jly0Var;
        yrtVar.c = jly0Var2;
        yrtVar.d = caqVar;
        return yrtVar;
    }

    public static wtt f(r7q r7qVar, r7q r7qVar2, r7q r7qVar3, caq caqVar, r7q r7qVar4, r7q r7qVar5, caq caqVar2, jo80 jo80Var, r7q r7qVar6, r7q r7qVar7, caq caqVar3, caq caqVar4, r7q r7qVar8, caq caqVar5, r7q r7qVar9, r7q r7qVar10, caq caqVar6, caq caqVar7, caq caqVar8, kly0 kly0Var, caq caqVar9, caq caqVar10, r7q r7qVar11, caq caqVar11, r7q r7qVar12, caq caqVar12, caq caqVar13, caq caqVar14, caq caqVar15, caq caqVar16, caq caqVar17) {
        wtt wttVar = new wtt();
        wttVar.a = r7qVar;
        wttVar.b = r7qVar2;
        wttVar.c = r7qVar3;
        wttVar.d = caqVar;
        wttVar.e = r7qVar4;
        wttVar.f = r7qVar5;
        wttVar.g = caqVar2;
        wttVar.h = jo80Var;
        wttVar.i = r7qVar6;
        wttVar.j = r7qVar7;
        wttVar.k = caqVar3;
        wttVar.l = caqVar4;
        wttVar.m = r7qVar8;
        wttVar.n = caqVar5;
        wttVar.o = r7qVar9;
        wttVar.p = r7qVar10;
        wttVar.q = caqVar6;
        wttVar.r = caqVar7;
        wttVar.s = caqVar8;
        wttVar.t = kly0Var;
        wttVar.u = caqVar9;
        wttVar.v = caqVar10;
        wttVar.w = r7qVar11;
        wttVar.x = caqVar11;
        wttVar.y = r7qVar12;
        wttVar.z = caqVar12;
        wttVar.A = caqVar13;
        wttVar.B = caqVar14;
        wttVar.C = caqVar15;
        wttVar.D = caqVar16;
        wttVar.E = caqVar17;
        return wttVar;
    }

    public static d8u g(caq caqVar, caq caqVar2, caq caqVar3, caq caqVar4, caq caqVar5, caq caqVar6, caq caqVar7, jo80 jo80Var, kly0 kly0Var, jo80 jo80Var2, r7q r7qVar, kly0 kly0Var2, kly0 kly0Var3, r7q r7qVar2, kly0 kly0Var4, kly0 kly0Var5, caq caqVar8, r7q r7qVar3, r7q r7qVar4, caq caqVar9, r7q r7qVar5, r7q r7qVar6, g5t g5tVar, r7q r7qVar7, caq caqVar10, caq caqVar11, caq caqVar12, gbp gbpVar, g5t g5tVar2, kly0 kly0Var6, r7q r7qVar8, r7q r7qVar9, g5t g5tVar3, kly0 kly0Var7, caq caqVar13, gbp gbpVar2, caq caqVar14, jly0 jly0Var, kly0 kly0Var8, jo80 jo80Var3, r7q r7qVar10, kly0 kly0Var9, kly0 kly0Var10, caq caqVar15, kly0 kly0Var11, r7q r7qVar11, r7q r7qVar12, kly0 kly0Var12, r7q r7qVar13, caq caqVar16, kly0 kly0Var13, r7q r7qVar14, r7q r7qVar15, kly0 kly0Var14, gbp gbpVar3, r7q r7qVar16, caq caqVar17, kly0 kly0Var15, kly0 kly0Var16, kly0 kly0Var17, caq caqVar18, r7q r7qVar17, caq caqVar19, kly0 kly0Var18, caq caqVar20, r7q r7qVar18, r7q r7qVar19, caq caqVar21, g5t g5tVar4, kly0 kly0Var19) {
        d8u d8uVar = new d8u((byte) 0);
        d8uVar.b = caqVar;
        d8uVar.c = caqVar2;
        d8uVar.d = caqVar3;
        d8uVar.e = caqVar4;
        d8uVar.f = caqVar5;
        d8uVar.g = caqVar6;
        d8uVar.h = caqVar7;
        d8uVar.i = jo80Var;
        d8uVar.j = kly0Var;
        d8uVar.k = jo80Var2;
        d8uVar.l = r7qVar;
        d8uVar.m = kly0Var2;
        d8uVar.n = kly0Var3;
        d8uVar.o = r7qVar2;
        d8uVar.f9p = kly0Var4;
        d8uVar.q = kly0Var5;
        d8uVar.r = caqVar8;
        d8uVar.s = r7qVar3;
        d8uVar.t = r7qVar4;
        d8uVar.u = caqVar9;
        d8uVar.v = r7qVar5;
        d8uVar.w = r7qVar6;
        d8uVar.x = g5tVar;
        d8uVar.y = r7qVar7;
        d8uVar.z = caqVar10;
        d8uVar.A = caqVar11;
        d8uVar.B = caqVar12;
        d8uVar.C = gbpVar;
        d8uVar.D = g5tVar2;
        d8uVar.E = kly0Var6;
        d8uVar.F = r7qVar8;
        d8uVar.G = r7qVar9;
        d8uVar.H = g5tVar3;
        d8uVar.I = kly0Var7;
        d8uVar.J = caqVar13;
        d8uVar.K = gbpVar2;
        d8uVar.L = caqVar14;
        d8uVar.M = jly0Var;
        d8uVar.N = kly0Var8;
        d8uVar.O = jo80Var3;
        d8uVar.P = r7qVar10;
        d8uVar.Q = kly0Var9;
        d8uVar.R = kly0Var10;
        d8uVar.S = caqVar15;
        d8uVar.T = kly0Var11;
        d8uVar.U = r7qVar11;
        d8uVar.V = r7qVar12;
        d8uVar.W = kly0Var12;
        d8uVar.X = r7qVar13;
        d8uVar.Y = caqVar16;
        d8uVar.Z = kly0Var13;
        d8uVar.a0 = r7qVar14;
        d8uVar.b0 = r7qVar15;
        d8uVar.c0 = kly0Var14;
        d8uVar.d0 = gbpVar3;
        d8uVar.e0 = r7qVar16;
        d8uVar.f0 = caqVar17;
        d8uVar.g0 = kly0Var15;
        d8uVar.h0 = kly0Var16;
        d8uVar.i0 = kly0Var17;
        d8uVar.j0 = caqVar18;
        d8uVar.k0 = r7qVar17;
        d8uVar.l0 = caqVar19;
        d8uVar.m0 = kly0Var18;
        d8uVar.n0 = caqVar20;
        d8uVar.o0 = r7qVar18;
        d8uVar.p0 = r7qVar19;
        d8uVar.q0 = caqVar21;
        d8uVar.r0 = g5tVar4;
        d8uVar.s0 = kly0Var19;
        return d8uVar;
    }

    public static pdu h(kly0 kly0Var, caq caqVar) {
        pdu pduVar = new pdu();
        pduVar.a = kly0Var;
        pduVar.b = caqVar;
        return pduVar;
    }

    public static jgu i(gg11 gg11Var) {
        return new jgu(gg11Var);
    }

    public static gnu j(caq caqVar, caq caqVar2, caq caqVar3, caq caqVar4, kly0 kly0Var, jo80 jo80Var, caq caqVar5, caq caqVar6, caq caqVar7, kly0 kly0Var2, caq caqVar8, caq caqVar9, caq caqVar10, caq caqVar11, kly0 kly0Var3, kly0 kly0Var4, caq caqVar12, jo80 jo80Var2, jly0 jly0Var, kly0 kly0Var5, caq caqVar13, g5t g5tVar, caq caqVar14, caq caqVar15) {
        gnu gnuVar = new gnu();
        gnuVar.a = caqVar;
        gnuVar.b = caqVar2;
        gnuVar.c = caqVar3;
        gnuVar.d = caqVar4;
        gnuVar.e = kly0Var;
        gnuVar.f = jo80Var;
        gnuVar.g = caqVar5;
        gnuVar.h = caqVar6;
        gnuVar.i = caqVar7;
        gnuVar.j = kly0Var2;
        gnuVar.k = caqVar8;
        gnuVar.l = caqVar9;
        gnuVar.m = caqVar10;
        gnuVar.n = caqVar11;
        gnuVar.o = kly0Var3;
        gnuVar.f17p = kly0Var4;
        gnuVar.q = caqVar12;
        gnuVar.r = jo80Var2;
        gnuVar.s = jly0Var;
        gnuVar.t = kly0Var5;
        gnuVar.u = caqVar13;
        gnuVar.v = g5tVar;
        gnuVar.w = caqVar14;
        gnuVar.x = caqVar15;
        return gnuVar;
    }

    public static tdl k(ynb0 ynb0Var) {
        tdl tdlVar = new tdl((byte) 19);
        tdlVar.b = ynb0Var;
        return tdlVar;
    }

    public static d8u l(caq caqVar, caq caqVar2, caq caqVar3, caq caqVar4, caq caqVar5, caq caqVar6, caq caqVar7, jo80 jo80Var, kly0 kly0Var, jo80 jo80Var2, r7q r7qVar, kly0 kly0Var2, kly0 kly0Var3, r7q r7qVar2, kly0 kly0Var4, kly0 kly0Var5, caq caqVar8, r7q r7qVar3, r7q r7qVar4, caq caqVar9, r7q r7qVar5, r7q r7qVar6, g5t g5tVar, r7q r7qVar7, caq caqVar10, caq caqVar11, caq caqVar12, gbp gbpVar, g5t g5tVar2, kly0 kly0Var6, r7q r7qVar8, r7q r7qVar9, g5t g5tVar3, kly0 kly0Var7, caq caqVar13, gbp gbpVar2, caq caqVar14, jly0 jly0Var, kly0 kly0Var8, jo80 jo80Var3, r7q r7qVar10, kly0 kly0Var9, kly0 kly0Var10, caq caqVar15, kly0 kly0Var11, r7q r7qVar11, r7q r7qVar12, kly0 kly0Var12, r7q r7qVar13, caq caqVar16, kly0 kly0Var13, r7q r7qVar14, r7q r7qVar15, kly0 kly0Var14, gbp gbpVar3, r7q r7qVar16, caq caqVar17, kly0 kly0Var15, kly0 kly0Var16, kly0 kly0Var17, caq caqVar18, r7q r7qVar17, caq caqVar19, kly0 kly0Var18, caq caqVar20, r7q r7qVar18, r7q r7qVar19, caq caqVar21, g5t g5tVar4, kly0 kly0Var19) {
        d8u d8uVar = new d8u((byte) 1);
        d8uVar.b = caqVar;
        d8uVar.c = caqVar2;
        d8uVar.d = caqVar3;
        d8uVar.e = caqVar4;
        d8uVar.f = caqVar5;
        d8uVar.g = caqVar6;
        d8uVar.h = caqVar7;
        d8uVar.i = jo80Var;
        d8uVar.j = kly0Var;
        d8uVar.k = jo80Var2;
        d8uVar.l = r7qVar;
        d8uVar.m = kly0Var2;
        d8uVar.n = kly0Var3;
        d8uVar.o = r7qVar2;
        d8uVar.f9p = kly0Var4;
        d8uVar.q = kly0Var5;
        d8uVar.r = caqVar8;
        d8uVar.s = r7qVar3;
        d8uVar.t = r7qVar4;
        d8uVar.u = caqVar9;
        d8uVar.v = r7qVar5;
        d8uVar.w = r7qVar6;
        d8uVar.x = g5tVar;
        d8uVar.y = r7qVar7;
        d8uVar.z = caqVar10;
        d8uVar.A = caqVar11;
        d8uVar.B = caqVar12;
        d8uVar.C = gbpVar;
        d8uVar.D = g5tVar2;
        d8uVar.E = kly0Var6;
        d8uVar.F = r7qVar8;
        d8uVar.G = r7qVar9;
        d8uVar.H = g5tVar3;
        d8uVar.I = kly0Var7;
        d8uVar.J = caqVar13;
        d8uVar.K = gbpVar2;
        d8uVar.L = caqVar14;
        d8uVar.M = jly0Var;
        d8uVar.N = kly0Var8;
        d8uVar.O = jo80Var3;
        d8uVar.P = r7qVar10;
        d8uVar.Q = kly0Var9;
        d8uVar.R = kly0Var10;
        d8uVar.S = caqVar15;
        d8uVar.T = kly0Var11;
        d8uVar.U = r7qVar11;
        d8uVar.V = r7qVar12;
        d8uVar.W = kly0Var12;
        d8uVar.X = r7qVar13;
        d8uVar.Y = caqVar16;
        d8uVar.Z = kly0Var13;
        d8uVar.a0 = r7qVar14;
        d8uVar.b0 = r7qVar15;
        d8uVar.c0 = kly0Var14;
        d8uVar.d0 = gbpVar3;
        d8uVar.e0 = r7qVar16;
        d8uVar.f0 = caqVar17;
        d8uVar.g0 = kly0Var15;
        d8uVar.h0 = kly0Var16;
        d8uVar.i0 = kly0Var17;
        d8uVar.j0 = caqVar18;
        d8uVar.k0 = r7qVar17;
        d8uVar.l0 = caqVar19;
        d8uVar.m0 = kly0Var18;
        d8uVar.n0 = caqVar20;
        d8uVar.o0 = r7qVar18;
        d8uVar.p0 = r7qVar19;
        d8uVar.q0 = caqVar21;
        d8uVar.r0 = g5tVar4;
        d8uVar.s0 = kly0Var19;
        return d8uVar;
    }

    public static Set m(p2o0 p2o0Var) {
        return (Set) p2o0Var.g;
    }

    public static tzt n() {
        return new tzt();
    }

    public static fns o() {
        fns fnsVar = igu.a;
        c8o.m(fnsVar);
        return fnsVar;
    }

    public static art p(DevicePickerSortingDatabase devicePickerSortingDatabase) {
        art artVarU = devicePickerSortingDatabase.u();
        c8o.m(artVarU);
        return artVarU;
    }

    public static gtt q(yap yapVar) {
        gtt gttVar = (gtt) yapVar.f.get();
        c8o.m(gttVar);
        return gttVar;
    }

    public static DevicePickerSortingDatabase r(Context context) {
        return u890.t(context, DevicePickerSortingDatabase.class, "DevicePickerSortingDatabase").c();
    }

    public static gzt s(g0l g0lVar, Flowable flowable) {
        return new gzt(g0lVar, flowable);
    }

    public static Set t(p2o0 p2o0Var) {
        return (Set) p2o0Var.d;
    }

    public static Set u(p2o0 p2o0Var) {
        return (Set) p2o0Var.f;
    }

    public static void v() {
        fns fnsVar = igu.a;
        b3s b3sVar = b3s.c;
    }

    public static iac0 w(q7r0 q7r0Var) {
        iac0 iac0Var = q7r0Var.d.c;
        c8o.m(iac0Var);
        return iac0Var;
    }

    public static q8n x() {
        fns fnsVar = igu.a;
        bs50 bs50Var = pyf0.a;
        c8o.m(bs50Var);
        return bs50Var;
    }

    public static q8n y() {
        fns fnsVar = igu.a;
        bs50 bs50Var = pyf0.a.f;
        c8o.m(bs50Var);
        return bs50Var;
    }

    public static void z() {
        c8o.m(Build.VERSION.RELEASE);
    }
}
