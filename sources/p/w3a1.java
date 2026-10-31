package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class w3a1 implements h4a1 {
    public final String a;
    public final sy21 b;

    public w3a1(String str, sy21 sy21Var) {
        this.a = str;
        this.b = sy21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3a1)) {
            return false;
        }
        w3a1 w3a1Var = (w3a1) obj;
        return u890.j(this.a, w3a1Var.a) && u890.j(this.b, w3a1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        sy21 sy21Var = this.b;
        return iHashCode + (sy21Var == null ? 0 : sy21Var.hashCode());
    }
}
