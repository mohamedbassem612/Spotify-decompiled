package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gpa {
    public final String a;
    public final guq0 b;
    public final String c;
    public final long d;
    public long e = 0;
    public final fsi0 f;

    public gpa(String str, guq0 guq0Var, String str2, long j, fsi0 fsi0Var) {
        this.a = str;
        this.b = guq0Var;
        this.c = str2;
        this.d = j;
        this.f = fsi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpa)) {
            return false;
        }
        gpa gpaVar = (gpa) obj;
        return this.a.equals(gpaVar.a) && this.b.equals(gpaVar.b) && this.c.equals(gpaVar.c) && this.d == gpaVar.d && this.e == gpaVar.e && u890.j(this.f, gpaVar.f);
    }

    public final int hashCode() {
        int iF = cy30.f(cy30.f(cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), this.d, 31), this.e, 31);
        fsi0 fsi0Var = this.f;
        return iF + (fsi0Var == null ? 0 : fsi0Var.hashCode());
    }
}
