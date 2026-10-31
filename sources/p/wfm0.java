package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wfm0 implements mhm0 {
    public final String a;
    public final mhm0 b;

    public wfm0(String str, mhm0 mhm0Var) {
        this.a = str;
        this.b = mhm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wfm0)) {
            return false;
        }
        wfm0 wfm0Var = (wfm0) obj;
        return this.a.equals(wfm0Var.a) && this.b.equals(wfm0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
