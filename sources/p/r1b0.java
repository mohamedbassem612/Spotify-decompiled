package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class r1b0 extends s1b0 {
    public final int a;
    public final String b;

    public r1b0(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1b0)) {
            return false;
        }
        r1b0 r1b0Var = (r1b0) obj;
        return this.a == r1b0Var.a && u890.j(this.b, r1b0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
