package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class r720 extends t720 {
    public final String a;
    public final int b;

    public r720(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r720)) {
            return false;
        }
        r720 r720Var = (r720) obj;
        return u890.j(this.a, r720Var.a) && this.b == r720Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
