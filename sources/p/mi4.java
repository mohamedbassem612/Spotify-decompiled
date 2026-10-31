package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mi4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final luk d;
    public final idd1 e = new idd1(new sh4(this, (byte) 11));

    public mi4(boolean z, boolean z2, boolean z3, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = lukVar;
    }

    public final boolean a() {
        mi4 mi4Var = (mi4) this.e.getValue();
        return mi4Var != null ? mi4Var.a() : this.a;
    }

    public final boolean b() {
        mi4 mi4Var = (mi4) this.e.getValue();
        return mi4Var != null ? mi4Var.b() : this.b;
    }

    public final boolean c() {
        mi4 mi4Var = (mi4) this.e.getValue();
        return mi4Var != null ? mi4Var.c() : this.c;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("enable_enhanced_share_card", "android-feature-stickers", a()), new fpb("enable_lyrics_sticker_creation", "android-feature-stickers", b()), new fpb("local_search_enabled", "android-feature-stickers", c()));
    }
}
