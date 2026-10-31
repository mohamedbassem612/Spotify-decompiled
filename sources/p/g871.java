package p;

import com.spotify.share.logging.impl.events.proto.ShareDebugError;
import com.spotify.share.logging.impl.events.proto.ShareError;
import com.spotify.share.logging.impl.events.proto.ShareFormatError;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class g871 {
    public final ii9 a;
    public final b6y b;
    public final zwz0 c;
    public final t2j0 d;

    public g871(ii9 ii9Var, b6y b6yVar, zwz0 zwz0Var, t2j0 t2j0Var) {
        this.a = ii9Var;
        this.b = b6yVar;
        this.c = zwz0Var;
        this.d = t2j0Var;
    }

    public final void a(i771 i771Var) {
        boolean zBooleanValue = ((Boolean) c921.D(new f871(this, (lnm) null, (byte) 1))).booleanValue();
        h771 h771VarN = ShareError.n();
        h771VarN.s(i771Var.g().a());
        h771VarN.t(i771Var.g().g());
        h771VarN.v(i771Var.e());
        h771VarN.y(i771Var.g().b().a());
        h771VarN.x(zBooleanValue);
        String strD = i771Var.d();
        if (strD != null) {
            h771VarN.u(strD);
        }
        String strC = i771Var.c();
        if (strC != null) {
            h771VarN.r(strC);
        }
        String strF = i771Var.f();
        if (strF != null) {
            h771VarN.w(strF);
        }
        String strI = i771Var.i();
        if (strI != null) {
            h771VarN.A(strI);
        }
        String strH = i771Var.h();
        if (strH != null) {
            h771VarN.z(strH);
        }
        String strB = i771Var.b();
        if (strB != null) {
            h771VarN.q(strB);
        }
        String strA = i771Var.a();
        if (strA != null) {
            h771VarN.n(strA);
        }
        this.b.a.a(h771VarN.build());
    }

    public final void b(w771 w771Var) {
        boolean zBooleanValue = ((Boolean) c921.D(new f871(this, (lnm) null, (byte) 2))).booleanValue();
        v771 v771VarN = ShareFormatError.n();
        v771VarN.u(w771Var.e());
        v771VarN.n(w771Var.a());
        v771VarN.q(w771Var.b());
        v771VarN.r(w771Var.c());
        v771VarN.t(zBooleanValue);
        String strD = w771Var.d();
        if (strD != null) {
            v771VarN.s(strD);
        }
        this.b.a.a(v771VarN.build());
    }

    public final void c(d5p1 d5p1Var) {
        t2j0 t2j0Var = this.b.a;
        d5p1Var.toString();
        if (d5p1Var instanceof i8r) {
            t2j0Var.a(khc.d(d5p1Var));
            return;
        }
        if (d5p1Var instanceof h8r) {
            a471 a471VarN = ShareDebugError.n();
            a471VarN.r("share.restrictions");
            a471VarN.n(lf51.a(1));
            a471VarN.q(((h8r) d5p1Var).v());
            t2j0Var.a(a471VarN.build());
            return;
        }
        if (!(d5p1Var instanceof j8r)) {
            eg.o();
            return;
        }
        a471 a471VarN2 = ShareDebugError.n();
        j8r j8rVar = (j8r) d5p1Var;
        a471VarN2.r(j8rVar.x());
        a471VarN2.n(j8rVar.v());
        a471VarN2.q(j8rVar.w());
        t2j0Var.a(a471VarN2.build());
    }
}
