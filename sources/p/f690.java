package p;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class f690 extends qtg {
    public final nh31 d;
    public final WeakReference e;
    public final w4f1 f;
    public final wnw0 g;

    public f690(nh31 nh31Var, WeakReference weakReference, w4f1 w4f1Var, wnw0 wnw0Var) {
        this.d = nh31Var;
        this.e = weakReference;
        this.f = w4f1Var;
        this.g = wnw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f690)) {
            return false;
        }
        f690 f690Var = (f690) obj;
        return this.d.equals(f690Var.d) && this.e.equals(f690Var.e) && this.f.equals(f690Var.f) && this.g == f690Var.g;
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31)) * 31);
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
