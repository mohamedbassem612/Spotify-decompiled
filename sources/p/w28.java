package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class w28 {
    public final t28 a;
    public final int b;

    public w28(t28 t28Var, int i) {
        this.a = t28Var;
        this.b = i;
    }

    public final t28 a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w28)) {
            return false;
        }
        w28 w28Var = (w28) obj;
        return this.a.equals(w28Var.a) && this.b == w28Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
