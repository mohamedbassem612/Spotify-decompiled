package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z2a0 {
    public final String a;
    public final int b;

    public z2a0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2a0)) {
            return false;
        }
        z2a0 z2a0Var = (z2a0) obj;
        return u890.j(this.a, z2a0Var.a) && this.b == z2a0Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
