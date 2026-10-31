package p;

import android.app.Activity;
import android.content.Context;
import com.google.android.play.core.splitinstall.SplitInstallManager;
import com.google.android.play.core.splitinstall.SplitInstallManagerFactory;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class hva1 implements jly0 {
    public static prq A(bz11 bz11Var) {
        return new prq(bz11Var);
    }

    public static s0o1 B(Context context) {
        return new s0o1(context, jz40.c);
    }

    public static ygl1 C(xjn1 xjn1Var, xjn1 xjn1Var2, s0o1 s0o1Var, phl1 phl1Var) {
        return new ygl1(xjn1Var, xjn1Var2, s0o1Var, phl1Var);
    }

    public static uww0 a(ynb0 ynb0Var) {
        return new uww0(ynb0Var, (byte) 20);
    }

    public static k4z0 b(ynb0 ynb0Var, ynb0 ynb0Var2) {
        k4z0 k4z0Var = new k4z0((byte) 14);
        k4z0Var.b = ynb0Var;
        k4z0Var.c = ynb0Var2;
        return k4z0Var;
    }

    public static gva1 c(jly0 jly0Var, caq caqVar, caq caqVar2, caq caqVar3, caq caqVar4, caq caqVar5, caq caqVar6, g5t g5tVar) {
        gva1 gva1Var = new gva1();
        gva1Var.a = jly0Var;
        gva1Var.b = caqVar;
        gva1Var.c = caqVar2;
        gva1Var.d = caqVar3;
        gva1Var.e = caqVar4;
        gva1Var.f = caqVar5;
        gva1Var.g = caqVar6;
        gva1Var.h = g5tVar;
        return gva1Var;
    }

    public static zxa1 d(jo80 jo80Var, gbp gbpVar, kly0 kly0Var, caq caqVar, r7q r7qVar, kly0 kly0Var2, caq caqVar2, kly0 kly0Var3, caq caqVar3, caq caqVar4, kly0 kly0Var4, caq caqVar5, caq caqVar6, gbp gbpVar2) {
        zxa1 zxa1Var = new zxa1();
        zxa1Var.a = jo80Var;
        zxa1Var.b = gbpVar;
        zxa1Var.c = kly0Var;
        zxa1Var.d = caqVar;
        zxa1Var.e = r7qVar;
        zxa1Var.f = kly0Var2;
        zxa1Var.g = caqVar2;
        zxa1Var.h = kly0Var3;
        zxa1Var.i = caqVar3;
        zxa1Var.j = caqVar4;
        zxa1Var.k = kly0Var4;
        zxa1Var.l = caqVar5;
        zxa1Var.m = caqVar6;
        zxa1Var.n = gbpVar2;
        return zxa1Var;
    }

    public static dxy e(Context context, s8q s8qVar, lvc0 lvc0Var, kxc0 kxc0Var, uxc0 uxc0Var, t380 t380Var) {
        return new dxy(context, s8qVar, lvc0Var, kxc0Var, uxc0Var, (Set) t380Var);
    }

    public static g38 f(n8q n8qVar, jc9 jc9Var) {
        return n8qVar.a(jc9Var);
    }

    public static n2b1 g(prq prqVar) {
        n2b1 n2b1Var = (n2b1) prqVar.b.get();
        c8o.m(n2b1Var);
        return n2b1Var;
    }

    public static u3c h(prq prqVar) {
        return (u3c) prqVar.c.get();
    }

    public static s2b1 i(prq prqVar) {
        ipq ipqVar = prqVar.c;
        jly0 jly0Var = prqVar.f;
        ipq ipqVar2 = prqVar.d;
        q8n q8nVar = (q8n) prqVar.a.b;
        c8o.l(q8nVar);
        return new s2b1(ipqVar, jly0Var, ipqVar2, q8nVar);
    }

    public static z3c j(qrq qrqVar) {
        bz11 bz11Var = qrqVar.a;
        Activity activity = (Activity) bz11Var.h;
        c8o.l(activity);
        w62 w62VarA = qrqVar.a();
        lzn0 lzn0Var = (lzn0) bz11Var.c;
        c8o.l(lzn0Var);
        return new z3c(activity, w62VarA, lzn0Var);
    }

    public static xjn1 k(Context context) {
        return new xjn1(context, jz40.c, (byte) 0);
    }

    public static void l() {
        Object obj = lz40.d;
    }

    public static xjn1 m(Context context) {
        return new xjn1(context, jz40.c, (byte) 1);
    }

    public static uh61 n(hwb hwbVar) {
        return new uh61(hwbVar, (byte) 16);
    }

    public static hq81 o(a0q a0qVar) {
        return new hq81(a0qVar, (byte) 18);
    }

    public static hq81 p(b0q b0qVar) {
        return new hq81(b0qVar, (byte) 20);
    }

    public static hq81 q(k3q k3qVar) {
        return new hq81(k3qVar, (byte) 13);
    }

    public static hq81 r(l3q l3qVar) {
        return new hq81(l3qVar, (byte) 14);
    }

    public static hq81 s(jbq jbqVar) {
        return new hq81(jbqVar, (byte) 12);
    }

    public static hq81 t(k3q k3qVar) {
        return new hq81(k3qVar, (byte) 15);
    }

    public static hq81 u(l3q l3qVar) {
        return new hq81(l3qVar, (byte) 17);
    }

    public static hq81 v(k3q k3qVar) {
        return new hq81(k3qVar, (byte) 16);
    }

    public static hq81 w(l3q l3qVar) {
        return new hq81(l3qVar, (byte) 21);
    }

    public static hq81 x(k3q k3qVar) {
        return new hq81(k3qVar, (byte) 19);
    }

    public static SplitInstallManager y(Context context) {
        return SplitInstallManagerFactory.create(context);
    }

    public static r2b1 z(prq prqVar) {
        r2b1 r2b1Var = (r2b1) prqVar.f.get();
        c8o.m(r2b1Var);
        return r2b1Var;
    }
}
