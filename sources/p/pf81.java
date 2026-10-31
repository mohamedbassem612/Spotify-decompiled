package p;

import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableAndThenCompletable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableElementAtSingle;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pf81 {
    public final inm a;
    public final io91 b;
    public final p4u0 c;
    public final FlowableElementAtSingle d;
    public final PublishSubject e = new PublishSubject();
    public final PublishSubject f = new PublishSubject();

    public pf81(inm inmVar, io91 io91Var, p4u0 p4u0Var, FlowableElementAtSingle flowableElementAtSingle) {
        this.a = inmVar;
        this.b = io91Var;
        this.c = p4u0Var;
        this.d = flowableElementAtSingle;
    }

    public final CompletableAndThenCompletable a(String str, boolean z, boolean z2, boolean z3) {
        Completable completableO;
        if (z3) {
            p4u0 p4u0Var = this.c;
            v3u0 v3u0Var = p4u0Var.b;
            k4u0 k4u0VarN = PlaybackSettingsEsperantoService.SetShuffleStateRequest.n();
            p4u0Var.a.getClass();
            k4u0VarN.q(sto1.m(str) ? "spotify:collection:tracks" : str);
            k4u0VarN.r(z);
            k4u0VarN.n(z2 ? b4u0.c : b4u0.b);
            completableO = v3u0Var.callSingle("spotify.playback_settings.esperanto.proto.PlaybackSettings", "SetShuffleState", k4u0VarN.build()).map(bk20.X0).ignoreElement().o(Functions.h);
        } else {
            completableO = CompletableEmpty.a;
        }
        return completableO.c(new CompletableFromAction(new of81(this, str, z, z2)));
    }
}
