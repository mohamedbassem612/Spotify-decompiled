package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nki0 extends hso1 {
    public final String b;
    public final boolean c;

    public nki0(String str, boolean z) {
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nki0)) {
            return false;
        }
        nki0 nki0Var = (nki0) obj;
        return u890.j(this.b, nki0Var.b) && this.c == nki0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }
}
