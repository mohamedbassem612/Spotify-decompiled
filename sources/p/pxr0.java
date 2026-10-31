package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pxr0 {
    public final String a;
    public final iyr0 b;

    public pxr0(String str, iyr0 iyr0Var) {
        this.a = str;
        this.b = iyr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxr0)) {
            return false;
        }
        pxr0 pxr0Var = (pxr0) obj;
        return u890.j(this.a, pxr0Var.a) && this.b == pxr0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
