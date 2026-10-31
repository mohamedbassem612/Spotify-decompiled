package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class y540 {
    public final String a;
    public final String b;

    public y540(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y540)) {
            return false;
        }
        y540 y540Var = (y540) obj;
        return u890.j(this.a, y540Var.a) && u890.j(this.b, y540Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
