package p;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import io.reactivex.rxjava3.core.FlowableEmitter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class abk1 implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ Rect b;
    public final /* synthetic */ FlowableEmitter c;

    public abk1(View view, Rect rect, FlowableEmitter flowableEmitter) {
        this.a = view;
        this.b = rect;
        this.c = flowableEmitter;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        View view = this.a;
        Rect rect = this.b;
        this.c.onNext(new mmr0(Integer.valueOf(view.getGlobalVisibleRect(rect) ? rect.height() : 0), Integer.valueOf(view.getMeasuredHeight())));
    }
}
