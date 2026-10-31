package p;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class x3f1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final View a;
    public final ots b;
    public final Rect c = new Rect();

    public x3f1(View view, ots otsVar) {
        this.a = view;
        this.b = otsVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view = this.a;
        if (view.isShown() && view.getGlobalVisibleRect(this.c)) {
            return;
        }
        this.b.invoke();
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
