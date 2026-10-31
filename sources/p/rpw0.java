package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class rpw0 {
    public final p950 a;
    public final int b;

    public rpw0(p950 p950Var, int i) {
        this.a = p950Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rpw0)) {
            return false;
        }
        rpw0 rpw0Var = (rpw0) obj;
        return this.a.equals(rpw0Var.a) && this.b == rpw0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
