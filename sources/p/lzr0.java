package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lzr0 {
    public final String a;
    public final oiz b;

    public lzr0(String str, oiz oizVar) {
        this.a = str;
        this.b = oizVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lzr0)) {
            return false;
        }
        lzr0 lzr0Var = (lzr0) obj;
        return u890.j(this.a, lzr0Var.a) && this.b == lzr0Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
