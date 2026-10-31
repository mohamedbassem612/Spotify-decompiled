package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class x1e {
    public final iyl1 a;
    public final int b;

    public x1e(iyl1 iyl1Var, int i) {
        this.a = iyl1Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1e)) {
            return false;
        }
        x1e x1eVar = (x1e) obj;
        return u890.j(this.a, x1eVar.a) && this.b == x1eVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
