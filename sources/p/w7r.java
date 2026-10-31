package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class w7r implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final luk h;
    public final idd1 i;

    public w7r(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = lukVar;
        this.i = new idd1(new z5o(this, (byte) 14));
    }

    public final w7r a() {
        return (w7r) this.i.getValue();
    }

    public final boolean b() {
        w7r w7rVarA = a();
        return w7rVarA != null ? w7rVarA.b() : this.a;
    }

    public final boolean c() {
        w7r w7rVarA = a();
        return w7rVarA != null ? w7rVarA.c() : this.g;
    }

    public final boolean d() {
        w7r w7rVarA = a();
        return w7rVarA != null ? w7rVarA.d() : this.b;
    }

    public final boolean e() {
        w7r w7rVarA = a();
        return w7rVarA != null ? w7rVarA.e() : this.c;
    }

    public final boolean f() {
        w7r w7rVarA = a();
        return w7rVarA != null ? w7rVarA.f() : this.d;
    }

    public final boolean g() {
        w7r w7rVarA = a();
        return w7rVarA != null ? w7rVarA.g() : this.e;
    }

    public final boolean h() {
        w7r w7rVarA = a();
        return w7rVarA != null ? w7rVarA.h() : this.f;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("daylist_snapshot_enabled", "daylist-playlist", b()), new fpb("is_description_plugin_enabled", "daylist-playlist", d()), new fpb("is_discover_section_plugin_enabled", "daylist-playlist", e()), new fpb("is_metadata_plugin_enabled", "daylist-playlist", f()), new fpb("is_pretitle_plugin_enabled", "daylist-playlist", g()), new fpb("is_share_header_action_plugin_enabled", "daylist-playlist", h()), new fpb("share_on_screenshot_enabled", "daylist-playlist", c())});
    }

    public w7r(luk lukVar) {
        this(true, true, true, true, true, true, true, lukVar);
    }
}
