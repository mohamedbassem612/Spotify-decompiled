package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wom0 implements xom0 {
    public final String a;
    public final String b;

    public wom0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wom0)) {
            return false;
        }
        wom0 wom0Var = (wom0) obj;
        return this.a.equals(wom0Var.a) && this.b.equals(wom0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
