package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yw4 {
    public final int a;
    public final boolean b;
    public final boolean c;

    public yw4(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yw4)) {
            return false;
        }
        yw4 yw4Var = (yw4) obj;
        return this.a == yw4Var.a && this.b == yw4Var.b && this.c == yw4Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(Integer.hashCode(this.a) * 31, 31, this.b);
    }
}
