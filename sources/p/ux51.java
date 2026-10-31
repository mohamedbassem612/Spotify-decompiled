package p;

import io.reactivex.rxjava3.core.Observable;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class ux51 implements jly0 {
    public static lc71 A(xm41 xm41Var) {
        Object objZ = eth.z(xm41Var, s861.a1);
        objZ.getClass();
        return (lc71) objZ;
    }

    public static pch1 B(xm41 xm41Var) {
        Object objZ = eth.z(xm41Var, s861.b1);
        objZ.getClass();
        return (pch1) objZ;
    }

    public static ppw0 a(ynb0 ynb0Var) {
        ppw0 ppw0Var = new ppw0((byte) 29);
        ppw0Var.b = ynb0Var;
        return ppw0Var;
    }

    public static oz51 b(caq caqVar, caq caqVar2, jly0 jly0Var, jly0 jly0Var2, kly0 kly0Var, jly0 jly0Var3, jly0 jly0Var4, caq caqVar3, caq caqVar4, g5t g5tVar, jly0 jly0Var5, jly0 jly0Var6) {
        oz51 oz51Var = new oz51();
        oz51Var.a = caqVar;
        oz51Var.b = caqVar2;
        oz51Var.c = jly0Var;
        oz51Var.d = jly0Var2;
        oz51Var.e = kly0Var;
        oz51Var.f = jly0Var3;
        oz51Var.g = jly0Var4;
        oz51Var.h = caqVar3;
        oz51Var.i = caqVar4;
        oz51Var.j = g5tVar;
        oz51Var.k = jly0Var5;
        oz51Var.l = jly0Var6;
        return oz51Var;
    }

    public static mu2 c(xm41 xm41Var) {
        Object objZ = eth.z(xm41Var, s861.c);
        objZ.getClass();
        return (mu2) objZ;
    }

    public static bfd d(xm41 xm41Var) {
        Object objZ = eth.z(xm41Var, s861.d);
        objZ.getClass();
        return (bfd) objZ;
    }

    public static kbd e(xm41 xm41Var) {
        Object objZ = eth.z(xm41Var, s861.e);
        objZ.getClass();
        return (kbd) objZ;
    }

    public static lwq f(xm41 xm41Var) {
        Object objZ = eth.z(xm41Var, s861.f);
        objZ.getClass();
        return (lwq) objZ;
    }

    public static x0r g(xm41 xm41Var) {
        Object objZ = eth.z(xm41Var, s861.g);
        objZ.getClass();
        return (x0r) objZ;
    }

    public static twu h(xm41 xm41Var) {
        Object objZ = eth.z(xm41Var, s861.h);
        objZ.getClass();
        return (twu) objZ;
    }

    public static r2v i(xm41 xm41Var) {
        Object objZ = eth.z(xm41Var, s861.i);
        objZ.getClass();
        return (r2v) objZ;
    }

    public static g310 j(xm41 xm41Var) {
        Object objZ = eth.z(xm41Var, s861.t);
        objZ.getClass();
        return (g310) objZ;
    }

    public static q9i0 k(xm41 xm41Var) {
        Object objZ = eth.z(xm41Var, s861.N0);
        objZ.getClass();
        return (q9i0) objZ;
    }

    public static Observable l(t8r0 t8r0Var) {
        xm41 xm41Var = (xm41) ((kly0) t8r0Var.a).get();
        Observable observableJust = Observable.just(d961.a);
        return eth.X(xm41Var).switchMap(new dc31(new mn41(t8r0Var, (byte) 29), observableJust, (byte) 10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static cbr0 m(p6r0 p6r0Var, c061 c061Var, e5b0 e5b0Var) {
        lik1 lik1Var;
        Set set = s4b1.f;
        String strJ = uic.x(c061Var.a).j();
        if (strJ == null) {
            strJ = "";
        }
        try {
            lik1Var = nik1.q4.b("spotify:readalong:selection:".concat(strJ));
        } catch (AssertionError unused) {
            lik1Var = new lik1("spotify:readalong:selection:empty");
        }
        return new cbr0(new dbr0[]{new bn70(p6r0Var, lik1Var, (nar0) null), new hgr0(egr0.a, 0, 2), e5b0Var}, false);
    }

    public static tau0 n(xm41 xm41Var) {
        Object objZ = eth.z(xm41Var, s861.P0);
        objZ.getClass();
        return (tau0) objZ;
    }

    public static jf11 o(izp izpVar) {
        return new jf11(izpVar, (byte) 14);
    }

    public static jf11 p(k3q k3qVar) {
        return new jf11(k3qVar, (byte) 16);
    }

    public static jf11 q(l3q l3qVar) {
        return new jf11(l3qVar, (byte) 13);
    }

    public static jf11 r(jbq jbqVar) {
        return new jf11(jbqVar, (byte) 15);
    }

    public static jf11 s(jbq jbqVar) {
        return new jf11(jbqVar, (byte) 17);
    }

    public static a18 t(xm41 xm41Var) {
        Object objZ = eth.z(xm41Var, s861.Q0);
        objZ.getClass();
        return (a18) objZ;
    }

    public static cvw0 u(xm41 xm41Var) {
        Object objZ = eth.z(xm41Var, s861.S0);
        objZ.getClass();
        return (cvw0) objZ;
    }

    public static cex0 v(xm41 xm41Var) {
        Object objZ = eth.z(xm41Var, s861.T0);
        objZ.getClass();
        return (cex0) objZ;
    }

    public static u6y0 w(xm41 xm41Var) {
        Object objZ = eth.z(xm41Var, s861.U0);
        objZ.getClass();
        return (u6y0) objZ;
    }

    public static cm01 x(xm41 xm41Var) {
        Object objZ = eth.z(xm41Var, s861.W0);
        objZ.getClass();
        return (cm01) objZ;
    }

    public static Set y(zns znsVar, q8n q8nVar) {
        return f46.S0(new qua0[]{d7p1.f(pwc0.D, q8nVar, new vns(znsVar, (lnm) null, (byte) 1), (zfa) null, new tns(znsVar, (byte) 4), new tns(znsVar, (byte) 5), 4), d7p1.f(v061.a, q8nVar, new vns(znsVar, (lnm) null, (byte) 0), (zfa) null, new tns(znsVar, (byte) 2), new tns(znsVar, (byte) 3), 4), d7p1.f(pwc0.C, q8nVar, (vu30) null, (zfa) null, new tns(znsVar, (byte) 0), new tns(znsVar, (byte) 1), 6)});
    }

    public static h971 z(xm41 xm41Var) {
        Object objZ = eth.z(xm41Var, s861.Z0);
        objZ.getClass();
        return (h971) objZ;
    }
}
