package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class oa1 extends wa1 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public oa1(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oa1)) {
            return false;
        }
        oa1 oa1Var = (oa1) obj;
        return u890.j(this.a, oa1Var.a) && this.b == oa1Var.b && this.c == oa1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
