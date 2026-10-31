package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ko7 {
    public final jo7 a;
    public final l8g1 b;

    public ko7(jo7 jo7Var, l8g1 l8g1Var) {
        this.a = jo7Var;
        this.b = l8g1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ko7)) {
            return false;
        }
        ko7 ko7Var = (ko7) obj;
        return this.a.equals(ko7Var.a) && u890.j(this.b, ko7Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        l8g1 l8g1Var = this.b;
        return iHashCode + (l8g1Var == null ? 0 : l8g1Var.hashCode());
    }
}
