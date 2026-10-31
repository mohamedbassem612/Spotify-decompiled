package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cln0 {
    public final String a;
    public final String b;

    public cln0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cln0)) {
            return false;
        }
        cln0 cln0Var = (cln0) obj;
        return this.a.equals(cln0Var.a) && this.b.equals(cln0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
