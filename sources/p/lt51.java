package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lt51 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public lt51(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lt51)) {
            return false;
        }
        lt51 lt51Var = (lt51) obj;
        return this.a == lt51Var.a && this.b == lt51Var.b && this.c == lt51Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
