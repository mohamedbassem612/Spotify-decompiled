package p;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class g690 extends qtg {
    public final mx81 d;
    public final WeakReference e;
    public final w4f1 f;
    public final wnw0 g;

    public g690(mx81 mx81Var, WeakReference weakReference, w4f1 w4f1Var, wnw0 wnw0Var) {
        this.d = mx81Var;
        this.e = weakReference;
        this.f = w4f1Var;
        this.g = wnw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g690)) {
            return false;
        }
        g690 g690Var = (g690) obj;
        return this.d.equals(g690Var.d) && this.e.equals(g690Var.e) && u890.j(this.f, g690Var.f) && this.g == g690Var.g;
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + (this.d.hashCode() * 31)) * 31;
        w4f1 w4f1Var = this.f;
        return this.g.hashCode() + ((iHashCode + (w4f1Var == null ? 0 : w4f1Var.hashCode())) * 31);
    }

    public final WeakReference k() {
        return this.e;
    }

    public final w4f1 l() {
        return this.f;
    }

    public final wnw0 m() {
        return this.g;
    }
}
