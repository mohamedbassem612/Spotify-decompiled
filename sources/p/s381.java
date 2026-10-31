package p;

import com.spotify.player.model.ContextTrack$Metadata;
import io.reactivex.rxjava3.core.Observable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s381 implements r781 {
    public static final e481 b;
    public final h481 a;

    static {
        Boolean bool = Boolean.TRUE;
        b = new e481(new t881(new y381((e3z) null, new x381(f46.i0(new Integer[]{31, 90, 52}), sqg0.J(new mmr0[]{new mmr0("link", bool), new mmr0("name", bool), new mmr0("description", bool), new mmr0(ContextTrack$Metadata.KEY_POPULARITY, bool), new mmr0("publisher", bool), new mmr0("language", bool), new mmr0("isExplicit", bool), new mmr0("covers", bool), new mmr0("playedTime", bool), new mmr0("numEpisodes", bool), new mmr0("consumptionOrder", bool), new mmr0("mediaTypeEnum", bool), new mmr0("inCollection", bool), new mmr0("latestPlayedEpisodeLink", bool), new mmr0("resumeEpisodeLink", bool), new mmr0("copyrights", bool), new mmr0("trailerUri", bool), new mmr0("isMusicAndTalk", bool), new mmr0("isBook", bool), new mmr0("playabilityRestriction", bool), new mmr0("isPlayable", bool), new mmr0("showOfflineState", sqg0.J(new mmr0[]{new mmr0("offline", bool), new mmr0("syncProgress", bool)}))})), 5)), (nia1) null, (nqz0) null, 131069);
    }

    public s381(h481 h481Var) {
        this.a = h481Var;
    }

    @Override // p.r781
    public final Observable f(String str) {
        String str2 = new y6b1(str, false).e;
        if (str2 == null) {
            str2 = "";
        }
        return this.a.a(str2, b).timeout(10L, TimeUnit.SECONDS).map(l9x0.Y).onErrorResumeNext(m9x0.Y).toObservable();
    }
}
