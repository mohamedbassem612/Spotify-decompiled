package p;

import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pce extends cjg1 {
    public boolean a = false;
    public final ViewGroup b;

    public pce(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    public final void a() {
        mno1.x(this.b, false);
    }

    public final void b(jhg1 jhg1Var) {
        mno1.x(this.b, false);
        this.a = true;
    }

    public final void c() {
        mno1.x(this.b, true);
    }

    public final void f(jhg1 jhg1Var) {
        if (!this.a) {
            mno1.x(this.b, false);
        }
        jhg1Var.G(this);
    }
}
