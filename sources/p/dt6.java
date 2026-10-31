package p;

import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dt6 implements bt6 {
    public final zle1 a;
    public final t45 b;
    public final AtomicBoolean c;
    public final tif1 d;
    public final LinkedHashSet e;
    public boolean f;

    public dt6(zle1 zle1Var, iac0 iac0Var) {
        this.a = zle1Var;
        t45 t45VarA = ((s45) zle1Var).a("cwp_page_load");
        this.b = t45VarA;
        this.c = new AtomicBoolean(false);
        this.d = !ihc1.h0("profile", "release", false) ? xco0.a : e95.a;
        this.e = new LinkedHashSet();
        t45VarA.b("cwp_measurement_id", t45VarA.e.toString());
        iac0Var.getLifecycle().a(new ct6(this, (byte) 0));
    }

    public final void a() {
        o("cwp_page_load");
        o("initial_load");
    }

    public final void b() {
        if (this.f) {
            return;
        }
        this.f = true;
        m("make_groups");
        o("row_hydration");
    }

    public final void c() {
        m("loaded_factory");
    }

    public final void d(boolean z) {
        m("initial_load");
        if (z) {
            return;
        }
        n("failure");
    }

    public final void e() {
        n("cancelled");
    }

    public final void f() {
        if (this.f) {
            return;
        }
        o("make_groups");
    }

    public final void g() {
        o("loaded_factory");
    }

    public final void h() {
        o("list_endpoint_load");
    }

    public final void i() {
        m("metadata_load");
    }

    public final void j() {
        o("metadata_load");
    }

    public final void k() {
        m("list_endpoint_load");
    }

    public final void l(boolean z) {
        m("row_hydration");
        n(z ? "success" : "failure");
    }

    public final void m(String str) {
        if (this.c.get()) {
            return;
        }
        synchronized (this.e) {
            this.e.remove(str);
        }
        this.b.g(str);
        this.d.f(str, "creator_page");
    }

    public final void n(String str) {
        if (this.c.compareAndSet(false, true)) {
            synchronized (this.e) {
                try {
                    for (String str2 : this.e) {
                        this.b.g(str2);
                        this.d.f(str2, "creator_page");
                    }
                    this.e.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.b.a("outcome", str);
            this.b.a("page", "artist");
            this.a.b(this.b.e());
        }
    }

    public final void o(String str) {
        if (this.c.get()) {
            return;
        }
        synchronized (this.e) {
            this.e.add(str);
        }
        t45 t45Var = this.b;
        t45Var.getClass();
        t45.m(t45Var, str, 4);
        tif1.a(this.d, str, "creator_page", 4);
    }
}
