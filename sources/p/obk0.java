package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class obk0 {
    public final String a;
    public final String b;
    public final mbk0 c;
    public final boolean d;

    public obk0(String str, String str2, mbk0 mbk0Var, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = mbk0Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof obk0)) {
            return false;
        }
        obk0 obk0Var = (obk0) obj;
        return u890.j(this.a, obk0Var.a) && u890.j(this.b, obk0Var.b) && this.c == obk0Var.c && this.d == obk0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31);
    }
}
