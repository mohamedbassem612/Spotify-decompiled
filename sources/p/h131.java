package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class h131 {
    public final boolean a;
    public final boolean b;

    public h131(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean a(int i) {
        return (i == 1 && this.a) || (i == 2 && this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h131)) {
            return false;
        }
        h131 h131Var = (h131) obj;
        return this.a == h131Var.a && this.b == h131Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
