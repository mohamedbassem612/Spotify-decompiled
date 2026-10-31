package p;

import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class f2k implements w2i0, c9v {
    public final Object a;
    public mgc b;
    public b9v c;
    public final /* synthetic */ h2k d;

    public f2k(h2k h2kVar, Object obj) {
        this.d = h2kVar;
        this.b = h2kVar.e(null);
        this.c = new b9v(h2kVar.d.c, 0, null);
        this.a = obj;
    }

    public final void D(int i, p2i0 p2i0Var, qqh0 qqh0Var) {
        if (a(i, p2i0Var)) {
            mgc mgcVar = this.b;
            qqh0 qqh0VarI = i(qqh0Var, p2i0Var);
            p2i0 p2i0Var2 = (p2i0) mgcVar.c;
            p2i0Var2.getClass();
            mgcVar.j(new k65(mgcVar, p2i0Var2, qqh0VarI, (byte) 15));
        }
    }

    public final void E(int i, p2i0 p2i0Var, d2e0 d2e0Var, qqh0 qqh0Var, int i2) {
        if (a(i, p2i0Var)) {
            mgc mgcVar = this.b;
            mgcVar.j(new oxh0(mgcVar, d2e0Var, i(qqh0Var, p2i0Var), i2, (byte) 2));
        }
    }

    public final void F(int i, p2i0 p2i0Var, qqh0 qqh0Var) {
        if (a(i, p2i0Var)) {
            mgc mgcVar = this.b;
            mgcVar.j(new x8a0((Object) mgcVar, (Object) i(qqh0Var, p2i0Var), (byte) 21));
        }
    }

    public final void N(int i, p2i0 p2i0Var, twa twaVar) {
        if (a(i, p2i0Var)) {
            this.c.a(twaVar);
        }
    }

    public final void U(int i, p2i0 p2i0Var) {
        if (a(i, p2i0Var)) {
            this.c.b();
        }
    }

    public final void V(int i, p2i0 p2i0Var, int i2) {
        if (a(i, p2i0Var)) {
            this.c.d(i2);
        }
    }

    public final boolean a(int i, p2i0 p2i0Var) {
        p2i0 p2i0VarA;
        Object obj = this.a;
        h2k h2kVar = this.d;
        if (p2i0Var != null) {
            p2i0VarA = h2kVar.A(obj, p2i0Var);
            if (p2i0VarA == null) {
                return false;
            }
        } else {
            p2i0VarA = null;
        }
        int iC = h2kVar.C(i, obj);
        mgc mgcVar = this.b;
        if (mgcVar.b != iC || !Objects.equals((p2i0) mgcVar.c, p2i0VarA)) {
            this.b = new mgc((CopyOnWriteArrayList) h2kVar.c.d, iC, p2i0VarA);
        }
        b9v b9vVar = this.c;
        if (b9vVar.a == iC && Objects.equals(b9vVar.b, p2i0VarA)) {
            return true;
        }
        this.c = new b9v(h2kVar.d.c, iC, p2i0VarA);
        return true;
    }

    public final void d(int i, p2i0 p2i0Var, d2e0 d2e0Var, qqh0 qqh0Var) {
        if (a(i, p2i0Var)) {
            mgc mgcVar = this.b;
            mgcVar.j(new t2i0(mgcVar, d2e0Var, i(qqh0Var, p2i0Var), (byte) 0));
        }
    }

    public final void h(int i, p2i0 p2i0Var, d2e0 d2e0Var, qqh0 qqh0Var) {
        if (a(i, p2i0Var)) {
            mgc mgcVar = this.b;
            mgcVar.j(new t2i0(mgcVar, d2e0Var, i(qqh0Var, p2i0Var), (byte) 1));
        }
    }

    public final qqh0 i(qqh0 qqh0Var, p2i0 p2i0Var) {
        long j = qqh0Var.f;
        h2k h2kVar = this.d;
        Object obj = this.a;
        long jB = h2kVar.B(j, obj);
        long j2 = qqh0Var.g;
        long jB2 = h2kVar.B(j2, obj);
        return (jB == j && jB2 == j2) ? qqh0Var : new qqh0(qqh0Var.a, qqh0Var.b, qqh0Var.c, qqh0Var.d, qqh0Var.e, jB, jB2);
    }

    public final void q(int i, p2i0 p2i0Var) {
        if (a(i, p2i0Var)) {
            this.c.c();
        }
    }

    public final void v(int i, p2i0 p2i0Var, d2e0 d2e0Var, qqh0 qqh0Var, IOException iOException, boolean z) {
        if (a(i, p2i0Var)) {
            mgc mgcVar = this.b;
            mgcVar.j(new u2i0(mgcVar, d2e0Var, i(qqh0Var, p2i0Var), iOException, z));
        }
    }

    public final void y(int i, p2i0 p2i0Var, Exception exc) {
        if (a(i, p2i0Var)) {
            this.c.e(exc);
        }
    }

    public final void z(int i, p2i0 p2i0Var) {
        if (a(i, p2i0Var)) {
            this.c.f();
        }
    }
}
