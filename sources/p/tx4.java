package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class tx4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final luk g;
    public final idd1 h;

    public tx4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = lukVar;
        this.h = new idd1(new sx4(this, (byte) 0));
    }

    public final boolean a() {
        tx4 tx4VarC = c();
        return tx4VarC != null ? tx4VarC.a() : this.a;
    }

    public final boolean b() {
        tx4 tx4VarC = c();
        return tx4VarC != null ? tx4VarC.b() : this.b;
    }

    public final tx4 c() {
        return (tx4) this.h.getValue();
    }

    public final boolean d() {
        tx4 tx4VarC = c();
        return tx4VarC != null ? tx4VarC.d() : this.c;
    }

    public final boolean e() {
        tx4 tx4VarC = c();
        return tx4VarC != null ? tx4VarC.e() : this.d;
    }

    public final boolean f() {
        tx4 tx4VarC = c();
        return tx4VarC != null ? tx4VarC.f() : this.e;
    }

    public final boolean g() {
        tx4 tx4VarC = c();
        return tx4VarC != null ? tx4VarC.g() : this.f;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("allow_curating_audiobooks_and_non_audiobooks_in_the_same_list", "android-playlist-curation-add-to-playlist-page", a()), new fpb("contextual_page_enabled", "android-playlist-curation-add-to-playlist-page", b()), new fpb("embedded_sort_bottom_sheet_enabled", "android-playlist-curation-add-to-playlist-page", d()), new fpb("manage_default_section_enabled", "android-playlist-curation-add-to-playlist-page", e()), new fpb("transition_save_to_non_mixed_enabled", "android-playlist-curation-add-to-playlist-page", f()), new fpb("update_item_permissions_prompt_enabled", "android-playlist-curation-add-to-playlist-page", g())});
    }

    public tx4(luk lukVar) {
        this(false, false, false, false, false, false, lukVar);
    }
}
