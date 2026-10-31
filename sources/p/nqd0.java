package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nqd0 {
    public final String a;
    public final String b;

    public nqd0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nqd0)) {
            return false;
        }
        nqd0 nqd0Var = (nqd0) obj;
        return this.a.equals(nqd0Var.a) && this.b.equals(nqd0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
