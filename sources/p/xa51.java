package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xa51 extends ya51 {
    public final String a;
    public final int b;

    public xa51(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xa51)) {
            return false;
        }
        xa51 xa51Var = (xa51) obj;
        return this.a.equals(xa51Var.a) && this.b == xa51Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
