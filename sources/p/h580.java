package p;

import com.spotify.nowplaying.musicinstallation.NowPlayingActivity;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSingleSingle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class h580 implements o5s {
    public final NowPlayingActivity a;
    public final kjg b;
    public final ljg c;
    public final Flowable d;
    public final vku e = new vku();

    public h580(NowPlayingActivity nowPlayingActivity, kjg kjgVar, ljg ljgVar, Flowable flowable) {
        this.a = nowPlayingActivity;
        this.b = kjgVar;
        this.c = ljgVar;
        this.d = flowable;
    }

    public final void onDestroy(iac0 iac0Var) {
        this.e.c();
        ((f0i) this.a).a.d(this);
    }

    public final void onStart(iac0 iac0Var) {
        Flowable flowable = this.d;
        this.e.a(new FlowableSingleSingle(ydh.f(flowable, flowable)).onErrorReturn(bk20.e).flatMapCompletable(new fey(this, (byte) 23)).subscribe());
    }
}
