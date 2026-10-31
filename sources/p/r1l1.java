package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class r1l1 extends j2l1 {
    public final String a;
    public final boolean b;

    public r1l1(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1l1)) {
            return false;
        }
        r1l1 r1l1Var = (r1l1) obj;
        return this.a.equals(r1l1Var.a) && this.b == r1l1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
