package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class a29 {
    public final s29 a;
    public final String b;
    public final r09 c;
    public final jgg1 d;
    public final bbx e;

    public a29(s29 s29Var, String str, r09 r09Var, jgg1 jgg1Var, bbx bbxVar) {
        this.a = s29Var;
        this.b = str;
        this.c = r09Var;
        this.d = jgg1Var;
        this.e = bbxVar;
    }

    public static zwg a() {
        return new zwg();
    }

    public final bbx b() {
        return this.e;
    }

    public final r09 c() {
        return this.c;
    }

    public final byte[] d() {
        return (byte[]) this.d.apply(this.c.b);
    }

    public final s29 e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a29) {
            a29 a29Var = (a29) obj;
            if (this.a.equals(a29Var.a) && this.b.equals(a29Var.b) && this.c.equals(a29Var.c) && this.d.equals(a29Var.d) && this.e.equals(a29Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final String f() {
        return this.b;
    }

    public final int hashCode() {
        return this.e.hashCode() ^ ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003);
    }

    public final String toString() {
        return "SendRequest{transportContext=" + this.a + ", transportName=" + this.b + ", event=" + this.c + ", transformer=" + this.d + ", encoding=" + this.e + "}";
    }
}
