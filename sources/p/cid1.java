package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cid1 {
    public final String a;
    public final String b;

    public cid1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cid1)) {
            return false;
        }
        cid1 cid1Var = (cid1) obj;
        return u890.j(this.a, cid1Var.a) && this.b.equals(cid1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
