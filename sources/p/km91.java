package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class km91 {
    public final boolean a;
    public final jm91 b;

    public km91(boolean z, jm91 jm91Var) {
        this.a = z;
        this.b = jm91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km91)) {
            return false;
        }
        km91 km91Var = (km91) obj;
        return this.a == km91Var.a && this.b.equals(km91Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
