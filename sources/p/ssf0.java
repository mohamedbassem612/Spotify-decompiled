package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ssf0 implements usf0 {
    public final int a;
    public final boolean b;
    public final boolean c;

    public ssf0(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ssf0)) {
            return false;
        }
        ssf0 ssf0Var = (ssf0) obj;
        return this.a == ssf0Var.a && this.b == ssf0Var.b && this.c == ssf0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(Integer.hashCode(this.a) * 31, 31, this.b);
    }
}
