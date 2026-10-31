package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class ugp0 extends xjs {
    public final Scheduler a;
    public final vku b = new vku();
    public boolean c;

    public ugp0(Scheduler scheduler) {
        this.a = scheduler;
    }

    public final void a() {
        this.b.c();
    }

    public final void c() {
        this.b.a(e().subscribeOn(this.a).subscribe(new lrj0(this, (byte) 23)));
    }

    public final boolean d() {
        return this.c;
    }

    public abstract Observable e();
}
