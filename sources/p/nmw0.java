package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nmw0 {
    public final String a;
    public final String b;
    public final Float c;

    public nmw0(String str, String str2, Float f) {
        this.a = str;
        this.b = str2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nmw0)) {
            return false;
        }
        nmw0 nmw0Var = (nmw0) obj;
        return u890.j(this.a, nmw0Var.a) && u890.j(this.b, nmw0Var.b) && u890.j(this.c, nmw0Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        Float f = this.c;
        return iD + (f == null ? 0 : f.hashCode());
    }
}
