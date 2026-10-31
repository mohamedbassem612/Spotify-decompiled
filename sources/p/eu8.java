package p;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import spotify.autodownload.esperanto.proto.ShowStateRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class eu8 {
    public final mt8 a;
    public final Scheduler b;

    public eu8(mt8 mt8Var, Scheduler scheduler) {
        this.a = mt8Var;
        this.b = scheduler;
    }

    public final Single a(String str) {
        ma81 ma81VarN = ShowStateRequest.n();
        ma81VarN.q(str);
        return this.a.callStream("spotify.autodownload_esperanto.proto.AutoDownloadService", "StreamShowState", (ShowStateRequest) ma81VarN.build()).map(qz70.t).map(uml1.t).first(Boolean.FALSE).observeOn(this.b);
    }
}
