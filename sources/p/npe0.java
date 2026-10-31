package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class npe0 extends spe0 {
    public final String a;
    public final boolean b;

    public npe0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof npe0)) {
            return false;
        }
        npe0 npe0Var = (npe0) obj;
        return this.a.equals(npe0Var.a) && this.b == npe0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
