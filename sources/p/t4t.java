package p;

import android.os.Bundle;
import com.spotify.music.SpotifyMainActivity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class t4t implements nte0, vh0 {
    public Bundle a;
    public final zh30 b;

    public t4t(SpotifyMainActivity spotifyMainActivity, dn81 dn81Var) {
        this.b = new zh30(spotifyMainActivity, spotifyMainActivity, spotifyMainActivity, spotifyMainActivity, spotifyMainActivity, spotifyMainActivity, dn81Var, new ots(this, (byte) 16));
    }

    public final f8l F() {
        return this.b.e;
    }

    public final void a() {
        zh30 zh30Var = this.b;
        if (zh30Var.i.t().L) {
            eg.m("A torn-down DelayedFragmentManager cannot be reconnected");
            return;
        }
        if (zh30Var.Z) {
            return;
        }
        zh30Var.Z = true;
        zh30Var.i.e();
        f8l f8lVar = zh30Var.e;
        x8c0 lifecycle = zh30Var.b.getLifecycle();
        if (f8lVar.a) {
            return;
        }
        f8lVar.b = lifecycle;
        lifecycle.a(f8lVar.e);
        f8lVar.a = true;
    }

    @Override // p.vh0
    public final sh0 m() {
        return this.b.Y.N();
    }
}
