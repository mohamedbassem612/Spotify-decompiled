package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class d6g0 extends n6g0 {
    public final String a;
    public final boolean b;

    public d6g0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d6g0)) {
            return false;
        }
        d6g0 d6g0Var = (d6g0) obj;
        return u890.j(this.a, d6g0Var.a) && this.b == d6g0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
