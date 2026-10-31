package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class az60 implements ki0, fq0 {
    public final fq0 a;
    public final String b;
    public final String c;

    public az60(fq0 fq0Var, String str, String str2) {
        this.a = fq0Var;
        this.b = str;
        this.c = str2;
    }

    public final String a() {
        return this.a.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az60)) {
            return false;
        }
        az60 az60Var = (az60) obj;
        return this.a.equals(az60Var.a) && u890.j(this.b, az60Var.b) && this.c.equals(az60Var.c);
    }

    public final String g() {
        return this.c;
    }

    public final String h() {
        return this.a.h();
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String j() {
        return this.b;
    }

    public final String k() {
        return this.a.k();
    }
}
