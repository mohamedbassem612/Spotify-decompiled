package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class r0l1 extends f1l1 {
    public final String a;
    public final boolean b;

    public r0l1(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0l1)) {
            return false;
        }
        r0l1 r0l1Var = (r0l1) obj;
        return u890.j(this.a, r0l1Var.a) && this.b == r0l1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
