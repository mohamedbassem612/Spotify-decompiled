package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class r0g1 {
    public final String a;
    public final boolean b;

    public r0g1(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0g1)) {
            return false;
        }
        r0g1 r0g1Var = (r0g1) obj;
        return u890.j(this.a, r0g1Var.a) && this.b == r0g1Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
