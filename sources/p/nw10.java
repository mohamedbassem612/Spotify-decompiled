package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nw10 {
    public final String a;
    public final boolean b;

    public nw10(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nw10)) {
            return false;
        }
        nw10 nw10Var = (nw10) obj;
        return this.a.equals(nw10Var.a) && this.b == nw10Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
