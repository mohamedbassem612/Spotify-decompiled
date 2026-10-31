package p;

import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wek1 implements iu30 {
    public final /* synthetic */ dg01 a;
    public final /* synthetic */ ViewTreeObserver b;
    public final /* synthetic */ xek1 c;

    public wek1(dg01 dg01Var, ViewTreeObserver viewTreeObserver, xek1 xek1Var) {
        this.a = dg01Var;
        this.b = viewTreeObserver;
        this.c = xek1Var;
    }

    public final Object invoke(Object obj) {
        ViewTreeObserver viewTreeObserver = this.b;
        boolean zIsAlive = viewTreeObserver.isAlive();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.c;
        if (zIsAlive) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
        } else {
            this.a.a.getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
        }
        return rih1.a;
    }
}
