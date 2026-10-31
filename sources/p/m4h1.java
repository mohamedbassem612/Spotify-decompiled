package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class m4h1 implements l5r0, ihr0, lqb1 {
    public final g4h1 a;
    public f4h1 b;

    public m4h1(g4h1 g4h1Var) {
        this.a = g4h1Var;
    }

    @Override // p.ihr0
    public final boolean b(ehr0 ehr0Var) {
        f4h1 f4h1Var = this.b;
        ihr0 ihr0Var = f4h1Var instanceof ihr0 ? (ihr0) f4h1Var : null;
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
        f4h1 f4h1Var = this.b;
        return (f4h1Var == null || (bundleSerialize = f4h1Var.serialize()) == null) ? new Bundle() : bundleSerialize;
    }

    @Override // p.l5r0
    public final View getView() {
        f4h1 f4h1Var = this.b;
        if (f4h1Var != null) {
            return (View) f4h1Var.getView();
        }
        return null;
    }

    @Override // p.l5r0
    public final void start() {
        f4h1 f4h1Var = this.b;
        if (f4h1Var != null) {
            f4h1Var.start();
        }
    }

    @Override // p.l5r0
    public final void stop() {
        f4h1 f4h1Var = this.b;
        if (f4h1Var != null) {
            f4h1Var.stop();
        }
    }

    @Override // p.lqb1
    public final void d(Bundle bundle) {
    }
}
