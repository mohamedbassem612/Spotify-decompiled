package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ccf0 implements ecf0 {
    public final String a;
    public final String b;

    public ccf0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccf0)) {
            return false;
        }
        ccf0 ccf0Var = (ccf0) obj;
        return this.a.equals(ccf0Var.a) && this.b.equals(ccf0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
