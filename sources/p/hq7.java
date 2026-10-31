package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hq7 {
    public final jo70 a;
    public final xkk1 b;

    public hq7(jo70 jo70Var, xkk1 xkk1Var) {
        this.a = jo70Var;
        this.b = xkk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hq7)) {
            return false;
        }
        hq7 hq7Var = (hq7) obj;
        return this.a.equals(hq7Var.a) && this.b.equals(hq7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
