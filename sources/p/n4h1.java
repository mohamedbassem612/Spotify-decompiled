package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class n4h1 implements j6t0, ihr0, lqb1 {
    public final s6t0 a;
    public r6t0 b;

    public n4h1(s6t0 s6t0Var) {
        this.a = s6t0Var;
    }

    @Override // p.j6t0
    public final void a(boolean z) {
        r6t0 r6t0Var = this.b;
        if (r6t0Var != null) {
            r6t0Var.a(z);
        }
    }

    @Override // p.ihr0
    public final boolean b(ehr0 ehr0Var) {
        r6t0 r6t0Var = this.b;
        ihr0 ihr0Var = r6t0Var instanceof ihr0 ? (ihr0) r6t0Var : null;
        if (ihr0Var != null) {
            return ihr0Var.b(ehr0Var);
        }
        return false;
    }

    @Override // p.l5r0
    public final void c(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.b = this.a.a(context, null, layoutInflater, viewGroup);
    }

    @Override // p.l5r0
    public final void e(Context context, Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.b = this.a.a(context, bundle, layoutInflater, viewGroup);
    }

    @Override // p.lqb1
    public final Bundle f() {
        Bundle bundleSerialize;
        r6t0 r6t0Var = this.b;
        return (r6t0Var == null || (bundleSerialize = r6t0Var.serialize()) == null) ? new Bundle() : bundleSerialize;
    }

    @Override // p.l5r0
    public final View getView() {
        r6t0 r6t0Var = this.b;
        if (r6t0Var != null) {
            return (View) r6t0Var.getView();
        }
        return null;
    }

    @Override // p.l5r0
    public final void start() {
        r6t0 r6t0Var = this.b;
        if (r6t0Var != null) {
            r6t0Var.start();
        }
    }

    @Override // p.l5r0
    public final void stop() {
        r6t0 r6t0Var = this.b;
        if (r6t0Var != null) {
            r6t0Var.stop();
        }
    }

    @Override // p.lqb1
    public final void d(Bundle bundle) {
    }
}
