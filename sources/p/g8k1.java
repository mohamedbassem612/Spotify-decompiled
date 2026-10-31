package p;

import android.view.Choreographer;
import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class g8k1 extends bgp0 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener, Choreographer.FrameCallback {
    public boolean X;
    public final View c;
    public final int[] d = new int[2];
    public m511 e;
    public m511 f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean t;

    public g8k1(View view) {
        this.c = view;
        m511 m511Var = m511.e;
        m511 m511Var2 = m511.e;
        this.e = m511Var2;
        this.f = m511Var2;
        view.addOnAttachStateChangeListener(this);
    }

    public final m511 a() {
        boolean z = this.t;
        View view = this.c;
        if (!z) {
            this.t = true;
            h(view.isAttachedToWindow());
        }
        if (!this.g) {
            g();
            if (view.isInLayout()) {
                this.g = true;
                if (!this.h) {
                    this.h = true;
                    Choreographer.getInstance().postFrameCallback(this);
                }
            }
        }
        return this.e;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.h = false;
        this.g = false;
    }

    public final void e() {
        this.i = true;
        g();
        this.f = this.e;
        h(this.c.isAttachedToWindow());
    }

    public final void f() {
        this.i = false;
        h(this.c.isAttachedToWindow());
    }

    public final void g() {
        View view = this.c;
        int[] iArr = this.d;
        view.getLocationInWindow(iArr);
        float f = iArr[0];
        float f2 = iArr[1];
        float width = view.getWidth() + f;
        float height = view.getHeight() + f2;
        m511 m511Var = this.e;
        if (m511Var.a == f && m511Var.b == f2 && m511Var.c == width && m511Var.d == height) {
            return;
        }
        this.e = new m511(f, f2, width, height);
    }

    public final void h(boolean z) {
        boolean z2 = z && (this.i || this.t);
        if (z2 == this.X) {
            return;
        }
        View view = this.c;
        if (z2) {
            view.getViewTreeObserver().addOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.X = z2;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        g();
        this.g = true;
        if (!this.h) {
            this.h = true;
            Choreographer.getInstance().postFrameCallback(this);
        }
        m511 m511Var = this.e;
        if (m511Var != this.f) {
            this.f = m511Var;
            d(m511Var);
        }
        this.t = false;
        h(this.c.isAttachedToWindow());
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        h(this.c.isAttachedToWindow());
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.g = false;
        h(false);
    }
}
