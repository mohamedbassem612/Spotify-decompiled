package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bf4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final luk d;
    public final idd1 e;

    public bf4(boolean z, boolean z2, boolean z3, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = lukVar;
        this.e = new idd1(new pe4(this, (byte) 9));
    }

    public final boolean a() {
        bf4 bf4Var = (bf4) this.e.getValue();
        return bf4Var != null ? bf4Var.a() : this.a;
    }

    public final boolean b() {
        bf4 bf4Var = (bf4) this.e.getValue();
        return bf4Var != null ? bf4Var.b() : this.b;
    }

    public final boolean c() {
        bf4 bf4Var = (bf4) this.e.getValue();
        return bf4Var != null ? bf4Var.c() : this.c;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("create_menu_entry_point_enabled", "android-feature-ai-playlist-configuration", a()), new fpb("instant_playlist_copy_enabled", "android-feature-ai-playlist-configuration", b()), new fpb("show_beta_tag", "android-feature-ai-playlist-configuration", c())});
    }

    public bf4(luk lukVar) {
        this(true, false, true, lukVar);
    }
}
