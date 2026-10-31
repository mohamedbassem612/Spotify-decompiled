package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class d960 {
    public final String a;
    public final b960 b;

    public d960(String str, b960 b960Var) {
        this.a = str;
        this.b = b960Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d960)) {
            return false;
        }
        d960 d960Var = (d960) obj;
        return u890.j(this.a, d960Var.a) && this.b == d960Var.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        b960 b960Var = this.b;
        return iHashCode + (b960Var == null ? 0 : b960Var.hashCode());
    }
}
