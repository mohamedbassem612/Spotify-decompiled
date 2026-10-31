package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class e360 {
    public final int a;
    public final l160 b;

    public e360(int i, l160 l160Var) {
        this.a = i;
        this.b = l160Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e360)) {
            return false;
        }
        e360 e360Var = (e360) obj;
        return this.a == e360Var.a && u890.j(this.b, e360Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
