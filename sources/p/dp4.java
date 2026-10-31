package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dp4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new zn4(this, (byte) 22));

    public dp4(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
    }

    public final boolean a() {
        dp4 dp4Var = (dp4) this.d.getValue();
        return dp4Var != null ? dp4Var.a() : this.a;
    }

    public final boolean b() {
        dp4 dp4Var = (dp4) this.d.getValue();
        return dp4Var != null ? dp4Var.b() : this.b;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("listening_party_card_enabled", "android-list-ux-platform-consumers-album-shared", a()), new fpb("show_locked_album_ui", "android-list-ux-platform-consumers-album-shared", b()));
    }
}
