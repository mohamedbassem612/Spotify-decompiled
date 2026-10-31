package p;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zdp1 {
    public final /* synthetic */ b4e a;

    public zdp1(b4e b4eVar) {
        this.a = b4eVar;
    }

    public final void a() {
        Iterator it = new HashSet(this.a.d).iterator();
        while (it.hasNext()) {
            ((zdp1) it.next()).a();
        }
    }

    public final void b(int i) {
        b4e b4eVar = this.a;
        b4eVar.h.b(i);
        arn1 arn1Var = b4eVar.i;
        if (arn1Var != null) {
            arn1Var.o();
            b4eVar.i = null;
        }
        b4eVar.k = null;
        e321 e321Var = b4eVar.j;
        if (e321Var != null) {
            e321Var.n(null);
            b4eVar.j = null;
        }
        b4eVar.b(i);
        Iterator it = new HashSet(b4eVar.d).iterator();
        while (it.hasNext()) {
            ((zdp1) it.next()).b(i);
        }
    }

    public final void c() {
        Iterator it = new HashSet(this.a.d).iterator();
        while (it.hasNext()) {
            ((zdp1) it.next()).c();
        }
    }

    public final void d() {
        Iterator it = new HashSet(this.a.d).iterator();
        while (it.hasNext()) {
            ((zdp1) it.next()).d();
        }
    }

    public final void e() {
        Iterator it = new HashSet(this.a.d).iterator();
        while (it.hasNext()) {
            ((zdp1) it.next()).e();
        }
    }

    public final void f() {
        Iterator it = new HashSet(this.a.d).iterator();
        while (it.hasNext()) {
            ((zdp1) it.next()).f();
        }
    }
}
