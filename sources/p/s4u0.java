package p;

import com.spotify.player.model.command.SetOptionsCommand;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class s4u0 implements pta1 {
    public final Flowable a;

    public s4u0(Flowable flowable) {
        this.a = flowable;
    }

    @Override // p.pta1
    public final Observable a() {
        Flowable flowable = this.a;
        return x0d.j(flowable, flowable).map(d710.Z0).map(e710.Z0);
    }

    @Override // p.pta1
    public final Observable b() {
        Flowable flowable = this.a;
        return x0d.j(flowable, flowable).map(o610.X0);
    }

    @Override // p.pta1
    public final Completable c(suz suzVar, int i) {
        return suzVar.b(SetOptionsCommand.builder().playbackSpeed(i / 100.0f).build()).flatMapCompletable(c710.X0);
    }
}
