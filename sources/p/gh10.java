package p;

import com.spotify.nowplayingmini.uicomponents.seekbar.FadingSeekBarView;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gh10 implements bm51 {
    public final w9u0 a;
    public final Flowable b;
    public final Flowable c;
    public final i8h1 d;
    public final w6h1 e;
    public final Scheduler f;
    public final vku g = new vku();
    public int h;
    public boolean i;
    public FadingSeekBarView j;

    public gh10(w9u0 w9u0Var, Flowable flowable, Flowable flowable2, i8h1 i8h1Var, w6h1 w6h1Var, Scheduler scheduler) {
        this.a = w9u0Var;
        this.b = flowable;
        this.c = flowable2;
        this.d = i8h1Var;
        this.e = w6h1Var;
        this.f = scheduler;
    }

    public final void a(int i, boolean z) {
        this.i = z;
        if (!z) {
            this.d.m(new pil0(this.e.b()).e(Integer.valueOf(i), Integer.valueOf(this.h)), (xj61) null);
            this.g.a(this.a.a(new i9u0(i)).subscribe(dxu.W0, dxu.X0));
        }
        FadingSeekBarView fadingSeekBarView = this.j;
        if (fadingSeekBarView != null) {
            fadingSeekBarView.setPositionText(i);
        } else {
            u890.C("viewBinder");
            throw null;
        }
    }

    public final void b(FadingSeekBarView fadingSeekBarView) {
        this.j = fadingSeekBarView;
        fadingSeekBarView.setListener(this);
        FadingSeekBarView fadingSeekBarView2 = this.j;
        if (fadingSeekBarView2 == null) {
            u890.C("viewBinder");
            throw null;
        }
        fadingSeekBarView2.setSeekingEnabled(false);
        FlowableDistinctUntilChanged flowableDistinctUntilChangedS = this.b.s(eh10.b);
        Scheduler scheduler = this.f;
        Disposable disposableSubscribe = flowableDistinctUntilChangedS.L(scheduler).subscribe(new fh10(this, (byte) 0));
        vku vkuVar = this.g;
        vkuVar.a(disposableSubscribe);
        vkuVar.a(this.c.L(scheduler).subscribe(new fh10(this, (byte) 1)));
    }

    public final void c() {
        FadingSeekBarView fadingSeekBarView = this.j;
        if (fadingSeekBarView == null) {
            u890.C("viewBinder");
            throw null;
        }
        fadingSeekBarView.setListener(null);
        this.g.c();
    }
}
