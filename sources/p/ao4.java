package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ao4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new zn4(this, (byte) 0));

    public ao4(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
    }

    public final boolean a() {
        ao4 ao4Var = (ao4) this.d.getValue();
        return ao4Var != null ? ao4Var.a() : this.a;
    }

    public final boolean b() {
        ao4 ao4Var = (ao4) this.d.getValue();
        return ao4Var != null ? ao4Var.b() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("do_not_exclude_banned_artists_for_managed_account", "android-libs-playlist-entity-configuration", a()), new fpb("respect_shows_collection_flag_in_playlist_for_including_episodes", "android-libs-playlist-entity-configuration", b())});
    }
}
