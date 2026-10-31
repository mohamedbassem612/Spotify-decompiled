package p;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class p0i extends Dialog implements iac0, s1q0, qe41 {
    public tac0 a;
    public final nt21 b;
    public final r1q0 c;

    public p0i(Context context, int i) {
        super(context, i);
        this.b = obg1.o(this);
        this.c = new r1q0(new fe(this, (byte) 25));
    }

    public static final void c(p0i p0iVar) {
        super.onBackPressed();
    }

    @Override // p.s1q0
    public final r1q0 J() {
        return this.c;
    }

    public final tac0 a() {
        tac0 tac0Var = this.a;
        if (tac0Var != null) {
            return tac0Var;
        }
        tac0 tac0Var2 = new tac0(this, true);
        this.a = tac0Var2;
        return tac0Var2;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addContentView(view, layoutParams);
    }

    public final void b() {
        Window window = getWindow();
        window.getClass();
        x9p1.p(window.getDecorView(), this);
        Window window2 = getWindow();
        window2.getClass();
        fap1.p(window2.getDecorView(), this);
        Window window3 = getWindow();
        window3.getClass();
        hm5.J(window3.getDecorView(), this);
    }

    @Override // p.iac0
    public final x8c0 getLifecycle() {
        return a();
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.c.d();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            r1q0 r1q0Var = this.c;
            r1q0Var.e = onBackInvokedDispatcher;
            r1q0Var.e(r1q0Var.g);
        }
        this.b.n(bundle);
        a().g(k8c0.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        this.b.o(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        a().g(k8c0.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        a().g(k8c0.ON_DESTROY);
        this.a = null;
        super.onStop();
    }

    @Override // p.qe41
    public final oe41 p() {
        return this.b.j();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        b();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        b();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        super.setContentView(view, layoutParams);
    }
}
