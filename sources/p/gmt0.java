package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gmt0 implements imt0 {
    public final String a;
    public final boolean b;

    public gmt0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gmt0)) {
            return false;
        }
        gmt0 gmt0Var = (gmt0) obj;
        return u890.j(this.a, gmt0Var.a) && this.b == gmt0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 961);
    }
}
