package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class t071 implements w071 {
    public final String a;
    public final sl01 b;

    public t071(String str, sl01 sl01Var) {
        this.a = str;
        this.b = sl01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t071)) {
            return false;
        }
        t071 t071Var = (t071) obj;
        return u890.j(this.a, t071Var.a) && this.b == t071Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
