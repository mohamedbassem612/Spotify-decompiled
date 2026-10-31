package p;

import com.spotify.recently_played_esperanto.proto.GetRecentlyPlayedRequest;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zuz {
    public final np01 a;
    public final GetRecentlyPlayedRequest b;

    public zuz(jp01 jp01Var, np01 np01Var) {
        this.a = np01Var;
        this.b = xuz.b(jp01Var);
    }

    public final Observable a() {
        return this.a.callStream("spotify.recently_played_esperanto.proto.RecentlyPlayedService", "Stream", this.b).map(o9x0.e).map(vgp1.c1);
    }
}
