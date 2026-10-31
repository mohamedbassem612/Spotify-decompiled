package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qi4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new sh4(this, (byte) 14));

    public qi4(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
    }

    public final boolean a() {
        qi4 qi4Var = (qi4) this.d.getValue();
        return qi4Var != null ? qi4Var.a() : this.a;
    }

    public final boolean b() {
        qi4 qi4Var = (qi4) this.d.getValue();
        return qi4Var != null ? qi4Var.b() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("enable_media_session", "android-feature-transcript-companion-content", a()), new fpb("enable_player_transformer", "android-feature-transcript-companion-content", b())});
    }
}
