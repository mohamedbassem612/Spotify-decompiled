package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class u25 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final luk f;
    public final idd1 g;

    public u25(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = lukVar;
        this.g = new idd1(new k25(this, (byte) 3));
    }

    public final boolean a() {
        u25 u25Var = (u25) this.g.getValue();
        return u25Var != null ? u25Var.a() : this.a;
    }

    public final boolean b() {
        u25 u25Var = (u25) this.g.getValue();
        return u25Var != null ? u25Var.b() : this.b;
    }

    public final boolean c() {
        u25 u25Var = (u25) this.g.getValue();
        return u25Var != null ? u25Var.c() : this.c;
    }

    public final boolean d() {
        u25 u25Var = (u25) this.g.getValue();
        return u25Var != null ? u25Var.d() : this.d;
    }

    public final boolean e() {
        u25 u25Var = (u25) this.g.getValue();
        return u25Var != null ? u25Var.e() : this.e;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("enable_highlight_sharing", "android-system-highlightsstats", a()), new fpb("enable_messaging_entry_point", "android-system-highlightsstats", b()), new fpb("enable_new_summary_page", "android-system-highlightsstats", c()), new fpb("enable_user_timeline_page", "android-system-highlightsstats", d()), new fpb("enable_v2_endpoint", "android-system-highlightsstats", e()));
    }

    public u25(luk lukVar) {
        this(false, false, false, false, false, lukVar);
    }
}
