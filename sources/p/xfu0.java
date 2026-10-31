package p;

import com.spotify.playlist4.proto.Playlist4ApiProto;
import io.reactivex.rxjava3.functions.Function;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xfu0 implements Function {
    public final /* synthetic */ agu0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Playlist4ApiProto.ListUpdateRequest c;

    public xfu0(agu0 agu0Var, String str, Playlist4ApiProto.ListUpdateRequest listUpdateRequest) {
        this.a = agu0Var;
        this.b = str;
        this.c = listUpdateRequest;
    }

    public final Object apply(Object obj) {
        return ((hrh1) this.a.c.a(hrh1.class, (mmr0) o7h.q0((List) obj))).a(this.b, this.c, wf90.a).doOnError(xfs0.Y).ignoreElement();
    }
}
