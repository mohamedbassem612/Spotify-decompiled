package p;

import android.view.View;
import io.reactivex.rxjava3.android.MainThreadDisposable;
import io.reactivex.rxjava3.core.Observer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class k7k1 extends MainThreadDisposable implements View.OnClickListener {
    public final View b;
    public final Observer c;

    public k7k1(View view, Observer observer) {
        this.b = view;
        this.c = observer;
    }

    public final void a() {
        this.b.setOnClickListener(null);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (isDisposed()) {
            return;
        }
        this.c.onNext(rih1.a);
    }
}
