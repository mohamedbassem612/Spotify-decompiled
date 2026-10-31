package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rcc implements ipb1 {
    public final /* synthetic */ ipb1 a;
    public final String b;
    public final oe41 c;

    public rcc(String str, qe41 qe41Var, mc41 mc41Var, boolean z, ipb1 ipb1Var, Object obj) {
        this.a = ipb1Var;
        this.b = str;
        this.c = qe41Var.p();
        if (!(mc41Var instanceof o7x) || z) {
            qe41Var.getLifecycle().a(new qcc(this, ipb1Var, mc41Var, obj));
        }
    }

    @Override // p.ipb1
    public final void a(jpb1 jpb1Var) {
        this.a.a(jpb1Var);
    }

    @Override // p.ipb1
    public final boolean b() {
        return this.a.b();
    }

    @Override // p.ipb1
    public final Bundle c() {
        return this.a.c();
    }

    @Override // p.ipb1
    public final void d(jpb1 jpb1Var) {
        this.a.d(jpb1Var);
    }

    @Override // p.ipb1
    public final void e(Object obj) {
        this.a.e(obj);
    }

    @Override // p.ipb1
    public final dts f() {
        return this.a.f();
    }

    @Override // p.ipb1
    public final dts g() {
        return this.a.g();
    }

    @Override // p.ipb1
    public final Object getState() {
        return this.a.getState();
    }

    @Override // p.ipb1
    public final String h() {
        return this.a.h();
    }

    @Override // p.ipb1
    public final String i() {
        return this.a.i();
    }

    @Override // p.ipb1
    public final void j(Bundle bundle) {
        this.a.j(bundle);
    }

    @Override // p.ipb1
    public final dts k() {
        return this.a.k();
    }

    @Override // p.ipb1
    public final Bundle serialize() {
        return this.a.serialize();
    }
}
