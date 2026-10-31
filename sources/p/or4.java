package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class or4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d;

    public or4(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
        this.d = new idd1(new q30(this, (byte) 17));
    }

    public final boolean b() {
        or4 or4Var = (or4) this.d.getValue();
        return or4Var != null ? or4Var.b() : this.a;
    }

    public final boolean c() {
        or4 or4Var = (or4) this.d.getValue();
        return or4Var != null ? or4Var.c() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("dj_conversation_starter_enabled", "android-martini-page", b()), new fpb("report_bug_badge_enabled", "android-martini-page", c())});
    }

    public or4(luk lukVar) {
        this(true, false, lukVar);
    }
}
