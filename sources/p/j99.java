package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class j99 {
    public final boolean a;
    public final boolean b;

    /* JADX WARN: Multi-variable type inference failed */
    public j99(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j99)) {
            return false;
        }
        j99 j99Var = (j99) obj;
        return this.a == j99Var.a && this.b == j99Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a ? 1 : 0) * 31);
    }
}
