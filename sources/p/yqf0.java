package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yqf0 {
    public final String a;
    public final String b;
    public final fef0 c;
    public final dhf0 d;
    public final boolean e;

    public yqf0(String str, String str2, fef0 fef0Var, dhf0 dhf0Var, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = fef0Var;
        this.d = dhf0Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yqf0)) {
            return false;
        }
        yqf0 yqf0Var = (yqf0) obj;
        return u890.j(this.a, yqf0Var.a) && u890.j(this.b, yqf0Var.b) && u890.j(this.c, yqf0Var.c) && this.d == yqf0Var.d && this.e == yqf0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31);
    }
}
