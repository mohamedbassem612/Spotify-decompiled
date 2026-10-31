package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qy91 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public qy91(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qy91)) {
            return false;
        }
        qy91 qy91Var = (qy91) obj;
        return this.a == qy91Var.a && this.b == qy91Var.b && this.c == qy91Var.c && u890.j(this.d, qy91Var.d) && u890.j(this.e, qy91Var.e) && u890.j(this.f, qy91Var.f) && u890.j(this.g, qy91Var.g) && u890.j(this.h, qy91Var.h);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        String str = this.g;
        return this.h.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}
