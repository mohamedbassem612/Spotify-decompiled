package p;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class pik1 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ bkl a;
    public final /* synthetic */ View b;
    public final /* synthetic */ ViewTreeObserver c;

    public pik1(bkl bklVar, View view, ViewTreeObserver viewTreeObserver) {
        this.a = bklVar;
        this.b = view;
        this.c = viewTreeObserver;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        bkl bklVar = this.a;
        View view = this.b;
        bklVar.accept(view);
        ViewTreeObserver viewTreeObserver = this.c;
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this);
            return false;
        }
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        return false;
    }
}
