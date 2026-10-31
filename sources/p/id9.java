package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class id9 implements md9 {
    public final boolean a;
    public final boolean b;

    public id9(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof id9)) {
            return false;
        }
        id9 id9Var = (id9) obj;
        return this.a == id9Var.a && this.b == id9Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
