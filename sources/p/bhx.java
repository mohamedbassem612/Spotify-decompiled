package p;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bhx implements aac0, View.OnAttachStateChangeListener {
    public final ComposeView a;
    public final z3u b;
    public final fhx c;
    public x8c0 d;
    public boolean e = true;

    public bhx(ComposeView composeView, z3u z3uVar, fhx fhxVar) {
        this.a = composeView;
        this.b = z3uVar;
        this.c = fhxVar;
    }

    public final void a() {
        oqo1.i();
        if (this.e) {
            this.e = false;
            x8c0 x8c0Var = this.d;
            if (x8c0Var != null) {
                x8c0Var.d(this);
            }
            View view = this.a;
            view.removeOnAttachStateChangeListener(this);
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
            z3u z3uVar = this.b;
            z3uVar.b.i(w8c0.a);
            z3uVar.d.a();
        }
    }

    public final void b() {
        if (this.e) {
            this.e = false;
            x8c0 x8c0Var = this.d;
            if (x8c0Var != null) {
                x8c0Var.d(this);
            }
            this.a.removeOnAttachStateChangeListener(this);
            z3u z3uVar = this.b;
            z3uVar.b.i(w8c0.a);
            z3uVar.d.a();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        b();
    }

    public final void q(iac0 iac0Var, k8c0 k8c0Var) {
        if (k8c0Var == k8c0.ON_DESTROY) {
            b();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
