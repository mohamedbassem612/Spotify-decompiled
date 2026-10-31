package p;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import java.io.PrintWriter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xh30 extends tg30 implements sck1, s1q0, vh0, li30 {
    public final /* synthetic */ zh30 h;

    /* JADX WARN: Illegal instructions before constructor call */
    public xh30(zh30 zh30Var) {
        this.h = zh30Var;
        dg30 dg30Var = zh30Var.a;
        super(dg30Var, dg30Var, new Handler(Looper.getMainLooper()));
    }

    @Override // p.s1q0
    public final r1q0 J() {
        return this.h.a.J();
    }

    public final View N(int i) {
        Activity activity = this.d;
        if (activity != null) {
            return activity.findViewById(i);
        }
        return null;
    }

    public final boolean O() {
        Window window;
        Activity activity = this.d;
        return ((activity == null || (window = activity.getWindow()) == null) ? null : window.peekDecorView()) != null;
    }

    @Override // p.iac0
    public final x8c0 getLifecycle() {
        return this.h.e.d;
    }

    @Override // p.tg30
    public final void l0(PrintWriter printWriter, String[] strArr) {
        printWriter.print("  ");
        printWriter.print("Local FragmentManagerController ");
        zh30 zh30Var = this.h;
        printWriter.print(Integer.toHexString(System.identityHashCode(zh30Var)));
        printWriter.println(" State:");
        printWriter.print("    ");
        printWriter.print("mCreated=");
        printWriter.print(zh30Var.N0);
        printWriter.print(" mResumed=");
        printWriter.print(zh30Var.O0);
        printWriter.print(" mStopped=");
        printWriter.print(zh30Var.P0);
        zh30Var.i.t().w("  ", null, printWriter, strArr);
    }

    @Override // p.vh0
    public final sh0 m() {
        return this.h.Y.N();
    }

    @Override // p.tg30
    public final dg30 m0() {
        return this.h.a;
    }

    @Override // p.tg30
    public final LayoutInflater n0() {
        return this.h.a.getLayoutInflater().cloneInContext(this.d);
    }

    @Override // p.sck1
    public final rck1 o() {
        return this.h.c.o();
    }

    @Override // p.tg30
    public final void o0() {
        this.h.a.invalidateOptionsMenu();
    }

    @Override // p.li30
    public final void a(zf30 zf30Var) {
    }
}
