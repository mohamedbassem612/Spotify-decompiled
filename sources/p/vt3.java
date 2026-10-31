package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vt3 {
    public final String a;
    public final String b;

    public vt3(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vt3)) {
            return false;
        }
        vt3 vt3Var = (vt3) obj;
        return u890.j(this.a, vt3Var.a) && u890.j(this.b, vt3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
