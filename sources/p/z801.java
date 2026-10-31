package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class z801 {
    public final String a;
    public final String b;

    public z801(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z801)) {
            return false;
        }
        z801 z801Var = (z801) obj;
        return u890.j(this.a, z801Var.a) && u890.j(this.b, z801Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
