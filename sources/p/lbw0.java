package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lbw0 {
    public final String a;
    public final String b;

    public lbw0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lbw0)) {
            return false;
        }
        lbw0 lbw0Var = (lbw0) obj;
        return this.a.equals(lbw0Var.a) && this.b.equals(lbw0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
