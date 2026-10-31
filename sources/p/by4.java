package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class by4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new sx4(this, (byte) 6));

    public by4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        by4 by4Var = (by4) this.c.getValue();
        return by4Var != null ? by4Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("reaction_selection_in_reaction_bottomsheet", "android-podcast-interactivity-podcastreactions", a()));
    }
}
