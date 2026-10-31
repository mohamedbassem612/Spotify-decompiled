package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class il6 {
    public final String a;
    public final String b;
    public final String c;
    public final iek d;
    public final String e;
    public final String f;

    public il6(String str, String str2, String str3, String str4, String str5, iek iekVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = iekVar;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof il6)) {
            return false;
        }
        il6 il6Var = (il6) obj;
        return u890.j(this.a, il6Var.a) && u890.j(this.b, il6Var.b) && u890.j(this.c, il6Var.c) && u890.j(this.d, il6Var.d) && u890.j(this.e, il6Var.e) && u890.j(this.f, il6Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + cy30.d((this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e);
    }
}
