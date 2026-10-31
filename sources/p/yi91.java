package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yi91 extends zi91 {
    public final boolean a;
    public final mi91 b;

    public yi91(boolean z, mi91 mi91Var) {
        this.a = z;
        this.b = mi91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yi91)) {
            return false;
        }
        yi91 yi91Var = (yi91) obj;
        return this.a == yi91Var.a && this.b.equals(yi91Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
