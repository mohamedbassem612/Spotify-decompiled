package p;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class o1q0 implements OnBackAnimationCallback {
    public final /* synthetic */ xy50 a;
    public final /* synthetic */ cnp0 b;
    public final /* synthetic */ u6j0 c;
    public final /* synthetic */ ckj d;

    public o1q0(xy50 xy50Var, cnp0 cnp0Var, u6j0 u6j0Var, ckj ckjVar) {
        this.a = xy50Var;
        this.b = cnp0Var;
        this.c = u6j0Var;
        this.d = ckjVar;
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackCancelled() {
        this.d.invoke();
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        this.c.invoke();
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackProgressed(BackEvent backEvent) {
        this.b.invoke(new vt9(backEvent));
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackStarted(BackEvent backEvent) {
        this.a.invoke(new vt9(backEvent));
    }
}
