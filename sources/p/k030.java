package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k030 {
    public final String a;
    public final int b;

    public k030(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public static k030 a(k030 k030Var, int i) {
        return new k030(k030Var.a, i);
    }

    public final String b() {
        return this.a;
    }

    public final int c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k030)) {
            return false;
        }
        k030 k030Var = (k030) obj;
        return u890.j(this.a, k030Var.a) && this.b == k030Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
