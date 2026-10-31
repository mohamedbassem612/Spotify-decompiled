package p;

import com.spotify.playlist4.proto.Playlist4ApiProto;
import io.reactivex.rxjava3.functions.Function;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wfu0 implements Function {
    public final /* synthetic */ agu0 a;
    public final /* synthetic */ ufu0 b;
    public final /* synthetic */ Playlist4ApiProto.ListChanges c;

    public wfu0(agu0 agu0Var, ufu0 ufu0Var, Playlist4ApiProto.ListChanges listChanges) {
        this.a = agu0Var;
        this.b = ufu0Var;
        this.c = listChanges;
    }

    public final Object apply(Object obj) {
        efe efeVar = (efe) this.a.c.a(efe.class, (mmr0) o7h.q0((List) obj));
        String str = this.b.b;
        Playlist4ApiProto.ListChanges listChanges = this.c;
        listChanges.getClass();
        return efeVar.a(str, listChanges, wf90.a).doOnError(xfs0.t).ignoreElement();
    }
}
