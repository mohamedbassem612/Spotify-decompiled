package p;

import com.spotify.playbacknative.AudioRenderer;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class i48 implements f961 {
    public final g48 a;
    public final BehaviorSubject b = BehaviorSubject.f();
    public final vku c;
    public boolean d;
    public boolean e;

    public i48(g48 g48Var, Observable observable, Scheduler scheduler) {
        this.a = g48Var;
        vku vkuVar = new vku();
        this.c = vkuVar;
        AudioRenderer.addListener(g48Var.a);
        AudioRenderer.addListener(g48Var.d);
        g48Var.c.add(new h48(this));
        vkuVar.a(observable.observeOn(scheduler).subscribe(new tg(this, (byte) 21)));
    }

    public final void shutdown() {
        g48 g48Var = this.a;
        AudioRenderer.removeListener(g48Var.d);
        g48Var.c.clear();
        this.c.c();
    }

    public final Object getApi() {
        return this;
    }
}
