package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class y980 {
    public final String a;
    public final String b;

    public y980(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y980)) {
            return false;
        }
        y980 y980Var = (y980) obj;
        return u890.j(this.a, y980Var.a) && u890.j(this.b, y980Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
