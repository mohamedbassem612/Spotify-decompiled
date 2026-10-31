package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class czl1 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public czl1(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof czl1)) {
            return false;
        }
        czl1 czl1Var = (czl1) obj;
        return this.a == czl1Var.a && this.b == czl1Var.b && this.c == czl1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
