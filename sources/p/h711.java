package p;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class h711 implements ViewTreeObserver.OnDrawListener, View.OnAttachStateChangeListener {
    public ViewTreeObserver a;
    public final /* synthetic */ View b;
    public final /* synthetic */ Handler c;
    public final /* synthetic */ l811 d;
    public final /* synthetic */ ggx0 e;
    public final /* synthetic */ ggx0 f;

    public h711(View view, Handler handler, l811 l811Var, ggx0 ggx0Var, ggx0 ggx0Var2) {
        this.b = view;
        this.c = handler;
        this.d = l811Var;
        this.e = ggx0Var;
        this.f = ggx0Var2;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        l811 l811Var = this.d;
        if (l811Var.a || this.a == null) {
            return;
        }
        l811Var.a = true;
        this.e.invoke();
        Runnable xfz0Var = new xfz0(this.f, (byte) 3);
        Handler handler = this.c;
        handler.postAtFrontOfQueue(xfz0Var);
        this.b.removeOnAttachStateChangeListener(this);
        ViewTreeObserver viewTreeObserver = this.a;
        if (viewTreeObserver == null) {
            return;
        }
        this.a = null;
        handler.post(new aih0(viewTreeObserver, this, false, (byte) 17));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        ViewTreeObserver viewTreeObserver = this.b.getViewTreeObserver();
        if (!viewTreeObserver.isAlive() || this.a == viewTreeObserver) {
            return;
        }
        this.a = viewTreeObserver;
        viewTreeObserver.addOnDrawListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.b.removeOnAttachStateChangeListener(this);
        ViewTreeObserver viewTreeObserver = this.a;
        if (viewTreeObserver == null) {
            return;
        }
        this.a = null;
        this.c.post(new aih0(viewTreeObserver, this, false, (byte) 17));
    }
}
