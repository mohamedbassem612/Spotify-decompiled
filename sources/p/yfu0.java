package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.playlist4.proto.Playlist4ApiProto;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yfu0 implements Function {
    public final /* synthetic */ agu0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Playlist4ApiProto.ListUpdateRequest c;

    public yfu0(agu0 agu0Var, String str, Playlist4ApiProto.ListUpdateRequest listUpdateRequest) {
        this.a = agu0Var;
        this.b = str;
        this.c = listUpdateRequest;
    }

    public final Object apply(Object obj) {
        Logger.e((Throwable) obj, "Fallback to update list items with default updateListEndpoint", new Object[0]);
        return hrh1.b(this.a.a, this.b, this.c, (wf90) null, 4, (Object) null).doOnError(zfu0.a).ignoreElement();
    }
}
