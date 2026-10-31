package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zx20 {
    public final String a;
    public final int b;

    public zx20(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zx20)) {
            return false;
        }
        zx20 zx20Var = (zx20) obj;
        return u890.j(this.a, zx20Var.a) && this.b == zx20Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
