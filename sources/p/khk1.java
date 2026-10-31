package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class khk1 implements View.OnAttachStateChangeListener {
    public final View a;
    public ihk1 b;
    public faa0 c;
    public jhk1 d;
    public boolean e;

    public khk1(View view) {
        this.a = view;
    }

    public final synchronized void a() {
        try {
            faa0 faa0Var = this.c;
            if (faa0Var != null) {
                ha71.o(faa0Var);
            }
            ov40 ov40Var = ov40.a;
            fns fnsVar = igu.a;
            this.c = c921.y(ov40Var, pyf0.a.f, 0, new vbc1(this, (lnm) null, (byte) 21), 2);
            this.b = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        jhk1 jhk1Var = this.d;
        if (jhk1Var == null) {
            return;
        }
        this.e = true;
        jhk1Var.a.a(jhk1Var.b);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        jhk1 jhk1Var = this.d;
        if (jhk1Var != null) {
            jhk1Var.d();
        }
    }
}
