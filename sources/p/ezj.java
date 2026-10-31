package p;

import android.view.View;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ezj implements ueg1 {
    public final lee1 a;
    public final wat b;
    public final f930 c;
    public final BehaviorSubject d = BehaviorSubject.f();

    public ezj(lee1 lee1Var, wat watVar, f930 f930Var) {
        this.a = lee1Var;
        this.b = watVar;
        this.c = f930Var;
    }

    @Override // p.ueg1
    public final Observable t1() {
        return this.d.distinctUntilChanged();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
