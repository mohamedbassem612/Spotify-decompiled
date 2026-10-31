package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gei0 {
    public final har0 a;
    public final boolean b;
    public final boolean c;

    public gei0(har0 har0Var, boolean z, boolean z2) {
        this.a = har0Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gei0)) {
            return false;
        }
        gei0 gei0Var = (gei0) obj;
        return this.a.equals(gei0Var.a) && this.b == gei0Var.b && this.c == gei0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(xcg1.g(xcg1.g(xcg1.g(Integer.hashCode(this.a.a) * 31, 31, false), 31, false), 31, true), 31, this.b);
    }
}
