package p;

import android.bluetooth.BluetoothManager;
import android.content.Context;
import androidx.car.app.k;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.Optional;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class bhb implements jly0 {
    public static zgb A(caq caqVar) {
        return new zgb(((dhb) caqVar.get()).G());
    }

    public static kma B(h4p h4pVar) {
        kma kmaVar = (kma) h4pVar.d.get();
        c8o.m(kmaVar);
        return kmaVar;
    }

    public static tcm1 C(f4p f4pVar) {
        i7d i7dVar = f4pVar.a;
        kly0 kly0Var = (kly0) i7dVar.Z;
        kly0 kly0Var2 = (kly0) i7dVar.a;
        Object objZ = eth.z((xm41) ((kly0) i7dVar.N0).get(), jpc.Y0);
        if (objZ != null) {
            return new tcm1(new scm1(new l9m0(new cce((bfd) objZ, new vnr((Context) kly0Var2.get()), (q8n) ((kly0) i7dVar.Y).get(), (byte) 5), new jxp0(f4pVar.c.get(), (byte) 17), new tzr0((e831) ((kly0) i7dVar.O0).get(), (fcm1) ((kly0) i7dVar.P0).get(), (i8h1) ((kly0) i7dVar.Q0).get()), new x45((nfa0) kly0Var.get()), new ch((Context) kly0Var2.get()), (q8n) ((kly0) i7dVar.X).get()), new yfc0((nfa0) kly0Var.get(), (byte) 19)));
        }
        hhg1.n("CampfireApi requires an active session — callers must only resolve this while logged in");
        return null;
    }

    public static ucd D(gma1 gma1Var) {
        return new ucd(gma1Var.a(), (byte) 0);
    }

    public static f4p a(i7d i7dVar) {
        return new f4p(i7dVar);
    }

    public static h4p b(p2o0 p2o0Var) {
        return new h4p(p2o0Var);
    }

    public static pt0 c(ynb0 ynb0Var) {
        pt0 pt0Var = new pt0((byte) 28);
        pt0Var.b = ynb0Var;
        return pt0Var;
    }

    public static pzb d(caq caqVar, jly0 jly0Var, kly0 kly0Var, jly0 jly0Var2, caq caqVar2, caq caqVar3, caq caqVar4, caq caqVar5, kly0 kly0Var2, jly0 jly0Var3, caq caqVar6, caq caqVar7) {
        pzb pzbVar = new pzb();
        pzbVar.a = caqVar;
        pzbVar.b = jly0Var;
        pzbVar.c = kly0Var;
        pzbVar.d = jly0Var2;
        pzbVar.e = caqVar2;
        pzbVar.f = caqVar3;
        pzbVar.g = caqVar4;
        pzbVar.h = caqVar5;
        pzbVar.i = kly0Var2;
        pzbVar.j = jly0Var3;
        pzbVar.k = caqVar6;
        pzbVar.l = caqVar7;
        return pzbVar;
    }

    public static i7c e(r7q r7qVar, r7q r7qVar2, kly0 kly0Var, thq thqVar, r7q r7qVar3, kly0 kly0Var2, kly0 kly0Var3, jo80 jo80Var, caq caqVar, r7q r7qVar4, kly0 kly0Var4, gbp gbpVar, g5t g5tVar, jly0 jly0Var, kly0 kly0Var5, kly0 kly0Var6, kly0 kly0Var7, r7q r7qVar5, kly0 kly0Var8, caq caqVar2, caq caqVar3, caq caqVar4, caq caqVar5, r7q r7qVar6, r7q r7qVar7, caq caqVar6, kly0 kly0Var9, kly0 kly0Var10, r7q r7qVar8, caq caqVar7, caq caqVar8, caq caqVar9, g5t g5tVar2, caq caqVar10, r7q r7qVar9, caq caqVar11, r7q r7qVar10, g5t g5tVar3, caq caqVar12, g5t g5tVar4, gbp gbpVar2, kly0 kly0Var11, caq caqVar13, kly0 kly0Var12, gbp gbpVar3, caq caqVar14, r7q r7qVar11, r7q r7qVar12, caq caqVar15, r7q r7qVar13, caq caqVar16, thq thqVar2, thq thqVar3, thq thqVar4, r7q r7qVar14, caq caqVar17, kly0 kly0Var13, r7q r7qVar15, caq caqVar18) {
        i7c i7cVar = new i7c();
        i7cVar.a = r7qVar;
        i7cVar.b = r7qVar2;
        i7cVar.c = kly0Var;
        i7cVar.d = thqVar;
        i7cVar.e = r7qVar3;
        i7cVar.f = kly0Var2;
        i7cVar.g = kly0Var3;
        i7cVar.h = jo80Var;
        i7cVar.i = caqVar;
        i7cVar.j = r7qVar4;
        i7cVar.k = kly0Var4;
        i7cVar.l = gbpVar;
        i7cVar.m = g5tVar;
        i7cVar.n = jly0Var;
        i7cVar.o = kly0Var5;
        i7cVar.f25p = kly0Var6;
        i7cVar.q = kly0Var7;
        i7cVar.r = r7qVar5;
        i7cVar.s = kly0Var8;
        i7cVar.t = caqVar2;
        i7cVar.u = caqVar3;
        i7cVar.v = caqVar4;
        i7cVar.w = caqVar5;
        i7cVar.x = r7qVar6;
        i7cVar.y = r7qVar7;
        i7cVar.z = caqVar6;
        i7cVar.A = kly0Var9;
        i7cVar.B = kly0Var10;
        i7cVar.C = r7qVar8;
        i7cVar.D = caqVar7;
        i7cVar.E = caqVar8;
        i7cVar.F = caqVar9;
        i7cVar.G = g5tVar2;
        i7cVar.H = caqVar10;
        i7cVar.I = r7qVar9;
        i7cVar.J = caqVar11;
        i7cVar.K = r7qVar10;
        i7cVar.L = g5tVar3;
        i7cVar.M = caqVar12;
        i7cVar.N = g5tVar4;
        i7cVar.O = gbpVar2;
        i7cVar.P = kly0Var11;
        i7cVar.Q = caqVar13;
        i7cVar.R = kly0Var12;
        i7cVar.S = gbpVar3;
        i7cVar.T = caqVar14;
        i7cVar.U = r7qVar11;
        i7cVar.V = r7qVar12;
        i7cVar.W = caqVar15;
        i7cVar.X = r7qVar13;
        i7cVar.Y = caqVar16;
        i7cVar.Z = thqVar2;
        i7cVar.a0 = thqVar3;
        i7cVar.b0 = thqVar4;
        i7cVar.c0 = r7qVar14;
        i7cVar.d0 = caqVar17;
        i7cVar.e0 = kly0Var13;
        i7cVar.f0 = r7qVar15;
        i7cVar.g0 = caqVar18;
        return i7cVar;
    }

    public static m8c f(kly0 kly0Var, r7q r7qVar, r7q r7qVar2, caq caqVar, caq caqVar2, caq caqVar3, caq caqVar4, kly0 kly0Var2, r7q r7qVar3, caq caqVar5, r7q r7qVar4, caq caqVar6, r7q r7qVar5, r7q r7qVar6, caq caqVar7, caq caqVar8, g5t g5tVar, r7q r7qVar7, caq caqVar9, caq caqVar10, kly0 kly0Var3, kly0 kly0Var4, jly0 jly0Var, kly0 kly0Var5, caq caqVar11, caq caqVar12, g5t g5tVar2, thq thqVar, thq thqVar2, thq thqVar3, caq caqVar13, kly0 kly0Var6, caq caqVar14, caq caqVar15, caq caqVar16, caq caqVar17, g5t g5tVar3, kly0 kly0Var7, kly0 kly0Var8, gbp gbpVar, caq caqVar18, gbp gbpVar2, kly0 kly0Var9, kly0 kly0Var10, kly0 kly0Var11, r7q r7qVar8, caq caqVar19, thq thqVar4, thq thqVar5, gbp gbpVar3, caq caqVar20, r7q r7qVar9, thq thqVar6, kly0 kly0Var12, kly0 kly0Var13, caq caqVar21, thq thqVar7, caq caqVar22, kly0 kly0Var14, caq caqVar23, jo80 jo80Var, r7q r7qVar10, kly0 kly0Var15, caq caqVar24, kly0 kly0Var16, r7q r7qVar11, r7q r7qVar12, r7q r7qVar13, caq caqVar25, caq caqVar26, r7q r7qVar14, caq caqVar27, gbp gbpVar4, kly0 kly0Var17, kly0 kly0Var18, kly0 kly0Var19, r7q r7qVar15, thq thqVar8, r7q r7qVar16, kly0 kly0Var20, r7q r7qVar17, caq caqVar28, caq caqVar29, caq caqVar30, kly0 kly0Var21, r7q r7qVar18, caq caqVar31) {
        m8c m8cVar = new m8c();
        m8cVar.a = kly0Var;
        m8cVar.b = r7qVar;
        m8cVar.c = r7qVar2;
        m8cVar.d = caqVar;
        m8cVar.e = caqVar2;
        m8cVar.f = caqVar3;
        m8cVar.g = caqVar4;
        m8cVar.h = kly0Var2;
        m8cVar.i = r7qVar3;
        m8cVar.j = caqVar5;
        m8cVar.k = r7qVar4;
        m8cVar.l = caqVar6;
        m8cVar.m = r7qVar5;
        m8cVar.n = r7qVar6;
        m8cVar.o = caqVar7;
        m8cVar.f39p = caqVar8;
        m8cVar.q = g5tVar;
        m8cVar.r = r7qVar7;
        m8cVar.s = caqVar9;
        m8cVar.t = caqVar10;
        m8cVar.u = kly0Var3;
        m8cVar.v = kly0Var4;
        m8cVar.w = jly0Var;
        m8cVar.x = kly0Var5;
        m8cVar.y = caqVar11;
        m8cVar.z = caqVar12;
        m8cVar.A = g5tVar2;
        m8cVar.B = thqVar;
        m8cVar.C = thqVar2;
        m8cVar.D = thqVar3;
        m8cVar.E = caqVar13;
        m8cVar.F = kly0Var6;
        m8cVar.G = caqVar14;
        m8cVar.H = caqVar15;
        m8cVar.I = caqVar16;
        m8cVar.J = caqVar17;
        m8cVar.K = g5tVar3;
        m8cVar.L = kly0Var7;
        m8cVar.M = kly0Var8;
        m8cVar.N = gbpVar;
        m8cVar.O = caqVar18;
        m8cVar.P = gbpVar2;
        m8cVar.Q = kly0Var9;
        m8cVar.R = kly0Var10;
        m8cVar.S = kly0Var11;
        m8cVar.T = r7qVar8;
        m8cVar.U = caqVar19;
        m8cVar.V = thqVar4;
        m8cVar.W = thqVar5;
        m8cVar.X = gbpVar3;
        m8cVar.Y = caqVar20;
        m8cVar.Z = r7qVar9;
        m8cVar.a0 = thqVar6;
        m8cVar.b0 = kly0Var12;
        m8cVar.c0 = kly0Var13;
        m8cVar.d0 = caqVar21;
        m8cVar.e0 = thqVar7;
        m8cVar.f0 = caqVar22;
        m8cVar.g0 = kly0Var14;
        m8cVar.h0 = caqVar23;
        m8cVar.i0 = jo80Var;
        m8cVar.j0 = r7qVar10;
        m8cVar.k0 = kly0Var15;
        m8cVar.l0 = caqVar24;
        m8cVar.m0 = kly0Var16;
        m8cVar.n0 = r7qVar11;
        m8cVar.o0 = r7qVar12;
        m8cVar.p0 = r7qVar13;
        m8cVar.q0 = caqVar25;
        m8cVar.r0 = caqVar26;
        m8cVar.s0 = r7qVar14;
        m8cVar.t0 = caqVar27;
        m8cVar.u0 = gbpVar4;
        m8cVar.v0 = kly0Var17;
        m8cVar.w0 = kly0Var18;
        m8cVar.x0 = kly0Var19;
        m8cVar.y0 = r7qVar15;
        m8cVar.z0 = thqVar8;
        m8cVar.A0 = r7qVar16;
        m8cVar.B0 = kly0Var20;
        m8cVar.C0 = r7qVar17;
        m8cVar.D0 = caqVar28;
        m8cVar.E0 = caqVar29;
        m8cVar.F0 = caqVar30;
        m8cVar.G0 = kly0Var21;
        m8cVar.H0 = r7qVar18;
        m8cVar.I0 = caqVar31;
        return m8cVar;
    }

    public static t8c g(ynb0 ynb0Var) {
        t8c t8cVar = new t8c((byte) 1);
        t8cVar.b = ynb0Var;
        return t8cVar;
    }

    public static ndc h(jo80 jo80Var, r7q r7qVar) {
        ndc ndcVar = new ndc();
        ndcVar.a = jo80Var;
        ndcVar.b = r7qVar;
        return ndcVar;
    }

    public static odc i(ynb0 ynb0Var, ynb0 ynb0Var2) {
        odc odcVar = new odc((byte) 0);
        odcVar.b = ynb0Var;
        odcVar.c = ynb0Var2;
        return odcVar;
    }

    public static ogd j(r7q r7qVar, r7q r7qVar2, r7q r7qVar3, caq caqVar, kly0 kly0Var) {
        ogd ogdVar = new ogd();
        ogdVar.a = r7qVar;
        ogdVar.b = r7qVar2;
        ogdVar.c = r7qVar3;
        ogdVar.d = caqVar;
        ogdVar.e = kly0Var;
        return ogdVar;
    }

    public static aib k(Context context, q8n q8nVar, fp8 fp8Var, tgb tgbVar, tgb tgbVar2) {
        Object systemService = context.getSystemService("bluetooth");
        BluetoothManager bluetoothManager = systemService instanceof BluetoothManager ? (BluetoothManager) systemService : null;
        return bluetoothManager == null ? new vib() : new uib(new ajq0(bluetoothManager, context, fp8Var, tgbVar2, new idd1(new rqa(tgbVar, q8nVar, (byte) 4))), bluetoothManager, context);
    }

    public static gjb l(rjb rjbVar, int i, tgb tgbVar, tk0 tk0Var, tgb tgbVar2) {
        return new gjb(rjbVar, Schedulers.a, i, tgbVar.isEnabled(), ((Number) tk0Var.b()).intValue(), tgbVar2.isEnabled());
    }

    public static rjb m(Context context, ii9 ii9Var, tgb tgbVar, tgb tgbVar2) {
        Object systemService = context.getSystemService("bluetooth");
        BluetoothManager bluetoothManager = systemService instanceof BluetoothManager ? (BluetoothManager) systemService : null;
        return new rjb(bluetoothManager != null ? bluetoothManager.getAdapter() : null, context, ii9Var, tgbVar, tgbVar2);
    }

    public static a84 n(Context context, o4o0 o4o0Var, q8n q8nVar) {
        return new a84(context, ((BluetoothManager) context.getSystemService("bluetooth")).getAdapter(), o4o0Var, q8nVar);
    }

    public static dnc o(ynb0 ynb0Var, kly0 kly0Var, ynb0 ynb0Var2, h5q h5qVar, b7r0 b7r0Var, ynb0 ynb0Var3, ynb0 ynb0Var4, ov20 ov20Var, yqg yqgVar, iac0 iac0Var, n3d0 n3d0Var, String str, bn70 bn70Var, g3q0 g3q0Var, upp0 upp0Var, Optional optional, Optional optional2) {
        return new dnc(ynb0Var, kly0Var, ynb0Var2, ynb0Var3, ynb0Var4, h5qVar.a((muz) ynb0Var.get()), g3q0Var, (ra81) optional.orElse(null), (uvy) optional2.orElse(null), upp0Var, n3d0Var, str, bn70Var, b7r0Var, ov20Var, iac0Var, yqgVar);
    }

    public static k7d p(h4p h4pVar) {
        p2o0 p2o0Var = h4pVar.a;
        return new k7d((ov20) ((kly0) p2o0Var.c).get(), new xe4(16, (luk) ((kly0) p2o0Var.d).get(), false));
    }

    public static fta q(g4p g4pVar, vb2 vb2Var) {
        h4p h4pVar = (h4p) g4pVar.a.c;
        p2o0 p2o0Var = h4pVar.a;
        k7d k7dVar = new k7d((ov20) ((kly0) p2o0Var.c).get(), new xe4(16, (luk) ((kly0) p2o0Var.d).get(), false));
        p2o0 p2o0Var2 = h4pVar.a;
        return new fta(k7dVar, vb2Var, (q8n) ((kly0) p2o0Var2.e).get(), (q8n) ((kly0) p2o0Var2.f).get(), (byte) 17);
    }

    public static g4p r(h4p h4pVar) {
        g4p g4pVar = (g4p) h4pVar.b.get();
        c8o.m(g4pVar);
        return g4pVar;
    }

    public static add s(h4p h4pVar) {
        p2o0 p2o0Var = h4pVar.a;
        ov20 ov20Var = (ov20) ((kly0) p2o0Var.c).get();
        kly0 kly0Var = (kly0) p2o0Var.d;
        return new add(ov20Var, new qf4(false, false, false, false, false, 0, false, false, false, false, false, false, 150, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, false, false, 0, false, 15, false, false, false, false, false, false, 300, 10, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, 4, false, false, false, false, false, 0, false, (luk) kly0Var.get()), new p15((luk) kly0Var.get()));
    }

    public static k t() {
        k kVar = sjo0.c;
        if (kVar != null) {
            return kVar;
        }
        u890.C("_carContext");
        throw null;
    }

    public static vq6 u(q0q q0qVar) {
        return new vq6(q0qVar, (byte) 26);
    }

    public static em31 v(f4p f4pVar) {
        i7d i7dVar = f4pVar.a;
        return new em31((by61) ((RetrofitMaker) ((kly0) i7dVar.h).get()).createWebgateService(by61.class, "android-campaigns-rivevideo-previewendpoint"), (cxc) ((kly0) i7dVar.d).get(), new ico0((byte) 2));
    }

    public static hp41 w(k kVar) {
        hp41 hp41VarE = kVar.e(hp41.class);
        c8o.m(hp41VarE);
        return hp41VarE;
    }

    public static m971 x() {
        return new m971();
    }

    public static ezc y(b25 b25Var) {
        Observable observableH;
        if (b25Var.b != null) {
            observableH = ((Observable) b25Var.d.getValue()).map(olj0.h).distinctUntilChanged();
            observableH.getClass();
        } else {
            observableH = l1d.h(b25Var.a);
        }
        return yoi1.g(observableH);
    }

    public static tgb z(caq caqVar) {
        return new tgb(caqVar, (byte) 18);
    }
}
