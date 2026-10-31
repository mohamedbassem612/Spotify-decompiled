package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hjo0 extends jjo0 {
    public final nh31 d;
    public final View e;
    public final w4f1 f;
    public final wnw0 g;

    public hjo0(nh31 nh31Var, View view, w4f1 w4f1Var) {
        super(view);
        this.d = nh31Var;
        this.e = view;
        this.f = w4f1Var;
        this.g = wnw0.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hjo0)) {
            return false;
        }
        hjo0 hjo0Var = (hjo0) obj;
        return this.d.equals(hjo0Var.d) && this.e.equals(hjo0Var.e) && this.f.equals(hjo0Var.f) && this.g == hjo0Var.g;
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31)) * 31);
    }

    public final wnw0 w() {
        return this.g;
    }
}
