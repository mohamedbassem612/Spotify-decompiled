package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gxh implements Function, Predicate {
    public final /* synthetic */ String a;
    public final /* synthetic */ ContextTrack b;

    public /* synthetic */ gxh(ContextTrack contextTrack, String str) {
        this.a = str;
        this.b = contextTrack;
    }

    public Object apply(Object obj) {
        List list = (List) obj;
        ContextTrack contextTrack = this.b;
        String strUri = contextTrack.uri();
        if (strUri == null) {
            strUri = "";
        }
        boolean zG = l4o1.G(contextTrack);
        list.getClass();
        return new qwh(this.a, strUri, list, zG);
    }

    public boolean test(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        String str = this.a;
        if (str != null) {
            return u890.j(playerState.playbackId().h(), str);
        }
        ContextTrack contextTrack = (ContextTrack) playerState.track().h();
        return u890.j(contextTrack != null ? contextTrack.uri() : null, this.b.uri());
    }
}
