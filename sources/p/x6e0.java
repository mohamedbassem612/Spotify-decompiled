package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class x6e0 implements r6t0 {
    public final /* synthetic */ j6t0 a;

    public x6e0(j6t0 j6t0Var) {
        this.a = j6t0Var;
    }

    @Override // p.r6t0
    public final void a(boolean z) {
        this.a.a(z);
    }

    @Override // p.f4h1
    public final Object getView() {
        return this.a.getView();
    }

    @Override // p.f4h1
    public final Bundle serialize() {
        j6t0 j6t0Var = this.a;
        lqb1 lqb1Var = j6t0Var instanceof lqb1 ? (lqb1) j6t0Var : null;
        if (lqb1Var != null) {
            return lqb1Var.f();
        }
        return null;
    }

    @Override // p.f4h1
    public final void start() {
        this.a.start();
    }

    @Override // p.f4h1
    public final void stop() {
        this.a.stop();
    }
}
