package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wqx0 extends frx0 {
    public final String a;
    public final String b;

    public wqx0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wqx0)) {
            return false;
        }
        wqx0 wqx0Var = (wqx0) obj;
        return u890.j(this.a, wqx0Var.a) && this.b.equals(wqx0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
