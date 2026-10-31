package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class go9 {
    public final kq9 a;
    public final boolean b;

    public go9(kq9 kq9Var, boolean z) {
        this.a = kq9Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof go9)) {
            return false;
        }
        go9 go9Var = (go9) obj;
        return this.a == go9Var.a && this.b == go9Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
