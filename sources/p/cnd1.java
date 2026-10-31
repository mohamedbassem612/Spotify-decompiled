package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class cnd1 extends dnd1 {
    public final String a;
    public final int b;

    public cnd1(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cnd1)) {
            return false;
        }
        cnd1 cnd1Var = (cnd1) obj;
        return u890.j(this.a, cnd1Var.a) && this.b == cnd1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
