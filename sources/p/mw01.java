package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mw01 {
    public final String a;
    public final long b;

    public mw01(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mw01)) {
            return false;
        }
        mw01 mw01Var = (mw01) obj;
        return u890.j(this.a, mw01Var.a) && this.b == mw01Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
