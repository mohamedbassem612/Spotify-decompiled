package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ndc1 {
    public final String a;
    public final String b;

    public ndc1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ndc1)) {
            return false;
        }
        ndc1 ndc1Var = (ndc1) obj;
        return u890.j(this.a, ndc1Var.a) && this.b.equals(ndc1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
