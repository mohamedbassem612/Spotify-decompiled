package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hf4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new pe4(this, (byte) 15));

    public hf4(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
    }

    public final boolean a() {
        hf4 hf4Var = (hf4) this.d.getValue();
        return hf4Var != null ? hf4Var.a() : this.a;
    }

    public final boolean b() {
        hf4 hf4Var = (hf4) this.d.getValue();
        return hf4Var != null ? hf4Var.b() : this.b;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("data_stories_enabled", "android-feature-blend-taste-match", a()), new fpb("group_blends_enabled", "android-feature-blend-taste-match", b()));
    }
}
