package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class k430 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public k430(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k430)) {
            return false;
        }
        k430 k430Var = (k430) obj;
        return u890.j(this.a, k430Var.a) && this.b == k430Var.b && this.c == k430Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
