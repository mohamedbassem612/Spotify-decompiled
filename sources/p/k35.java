package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k35 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d;

    public k35(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
        this.d = new idd1(new k25(this, (byte) 14));
    }

    public static k35 c(aey0 aey0Var) {
        return new k35(aey0Var.c("android-system-playlist-editing-history:playlist_history_enabled", false), aey0Var.c("android-system-playlist-editing-history:restore_playlist_history_labels_enabled", false), null);
    }

    public final boolean a() {
        k35 k35Var = (k35) this.d.getValue();
        return k35Var != null ? k35Var.a() : this.a;
    }

    public final boolean b() {
        k35 k35Var = (k35) this.d.getValue();
        return k35Var != null ? k35Var.b() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("playlist_history_enabled", "android-system-playlist-editing-history", a()), new fpb("restore_playlist_history_labels_enabled", "android-system-playlist-editing-history", b())});
    }

    public k35(luk lukVar) {
        this(false, false, lukVar);
    }

    public k35() {
        this(false, false, null);
    }
}
