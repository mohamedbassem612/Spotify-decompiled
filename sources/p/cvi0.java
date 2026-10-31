package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class cvi0 implements dvi0 {
    public final String a;
    public final int b;

    public cvi0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvi0)) {
            return false;
        }
        cvi0 cvi0Var = (cvi0) obj;
        return u890.j(this.a, cvi0Var.a) && this.b == cvi0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
