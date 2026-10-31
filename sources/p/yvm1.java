package p;

import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class yvm1 implements jly0 {
    public static xvm1 a(caq caqVar, caq caqVar2, caq caqVar3, r7q r7qVar, caq caqVar4, caq caqVar5, caq caqVar6, kly0 kly0Var, caq caqVar7, r7q r7qVar2, kly0 kly0Var2, caq caqVar8, caq caqVar9, caq caqVar10, kly0 kly0Var3, jo80 jo80Var, jo80 jo80Var2, r7q r7qVar3, caq caqVar11, caq caqVar12, r7q r7qVar4, caq caqVar13, kly0 kly0Var4, r7q r7qVar5, caq caqVar14, caq caqVar15, r7q r7qVar6, kly0 kly0Var5, kly0 kly0Var6, g5t g5tVar, caq caqVar16, r7q r7qVar7, caq caqVar17, caq caqVar18, r7q r7qVar8, caq caqVar19, r7q r7qVar9, r7q r7qVar10, jly0 jly0Var, r7q r7qVar11, caq caqVar20, r7q r7qVar12, r7q r7qVar13, caq caqVar21, r7q r7qVar14, r7q r7qVar15, r7q r7qVar16, caq caqVar22, r7q r7qVar17, caq caqVar23, r7q r7qVar18, kly0 kly0Var7, r7q r7qVar19, r7q r7qVar20, caq caqVar24, kly0 kly0Var8, r7q r7qVar21, r7q r7qVar22, caq caqVar25, kly0 kly0Var9, kly0 kly0Var10, caq caqVar26) {
        xvm1 xvm1Var = new xvm1();
        xvm1Var.a = caqVar;
        xvm1Var.b = caqVar2;
        xvm1Var.c = caqVar3;
        xvm1Var.d = r7qVar;
        xvm1Var.e = caqVar4;
        xvm1Var.f = caqVar5;
        xvm1Var.g = caqVar6;
        xvm1Var.h = kly0Var;
        xvm1Var.i = caqVar7;
        xvm1Var.j = r7qVar2;
        xvm1Var.k = kly0Var2;
        xvm1Var.l = caqVar8;
        xvm1Var.m = caqVar9;
        xvm1Var.n = caqVar10;
        xvm1Var.o = kly0Var3;
        xvm1Var.f51p = jo80Var;
        xvm1Var.q = jo80Var2;
        xvm1Var.r = r7qVar3;
        xvm1Var.s = caqVar11;
        xvm1Var.t = caqVar12;
        xvm1Var.u = r7qVar4;
        xvm1Var.v = caqVar13;
        xvm1Var.w = kly0Var4;
        xvm1Var.x = r7qVar5;
        xvm1Var.y = caqVar14;
        xvm1Var.z = caqVar15;
        xvm1Var.A = r7qVar6;
        xvm1Var.B = kly0Var5;
        xvm1Var.C = kly0Var6;
        xvm1Var.D = g5tVar;
        xvm1Var.E = caqVar16;
        xvm1Var.F = r7qVar7;
        xvm1Var.G = caqVar17;
        xvm1Var.H = caqVar18;
        xvm1Var.I = r7qVar8;
        xvm1Var.J = caqVar19;
        xvm1Var.K = r7qVar9;
        xvm1Var.L = r7qVar10;
        xvm1Var.M = jly0Var;
        xvm1Var.N = r7qVar11;
        xvm1Var.O = caqVar20;
        xvm1Var.P = r7qVar12;
        xvm1Var.Q = r7qVar13;
        xvm1Var.R = caqVar21;
        xvm1Var.S = r7qVar14;
        xvm1Var.T = r7qVar15;
        xvm1Var.U = r7qVar16;
        xvm1Var.V = caqVar22;
        xvm1Var.W = r7qVar17;
        xvm1Var.X = caqVar23;
        xvm1Var.Y = r7qVar18;
        xvm1Var.Z = kly0Var7;
        xvm1Var.a0 = r7qVar19;
        xvm1Var.b0 = r7qVar20;
        xvm1Var.c0 = caqVar24;
        xvm1Var.d0 = kly0Var8;
        xvm1Var.e0 = r7qVar21;
        xvm1Var.f0 = r7qVar22;
        xvm1Var.g0 = caqVar25;
        xvm1Var.h0 = kly0Var9;
        xvm1Var.i0 = kly0Var10;
        xvm1Var.j0 = caqVar26;
        return xvm1Var;
    }

    public static rrk0 b() {
        w6b1 w6b1VarA = f7b1.a(blc0.Qb);
        return new rrk0("NOTIFICATION_CENTER", w6b1VarA != null ? (String) w6b1VarA.c.get(0) : null, r6h1.c);
    }

    public static y2n1 c(RetrofitMaker retrofitMaker) {
        return (y2n1) retrofitMaker.createWebgateService(y2n1.class, "android-yourupdates-dataimpl");
    }

    public static sam0 d(jqq0 jqq0Var, dn41 dn41Var) {
        BehaviorSubject behaviorSubject = jqq0Var.d;
        ym41 ym41Var = new ym41("ZeroNative");
        ym41Var.a = dn41Var;
        return hwb.u("ZeroNative", (mr20) new c4m1(behaviorSubject, (byte) 19).invoke(dn41Var), w7x.a, ym41Var.b, ym41Var.a);
    }

    public static sam0 e(caq caqVar, dn41 dn41Var) {
        ym41 ym41Var = new ym41("Zero");
        ym41Var.a = dn41Var;
        return hwb.u("Zero", (mr20) new hbz0(Observable.create(new nt21(new o901(caqVar, (byte) 1), ym41Var, (byte) 11)), (byte) 13).invoke(ym41Var.a), w7x.a, ym41Var.b, ym41Var.a);
    }
}
