package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class d51 {
    public final String a;
    public final String b;
    public final String c;
    public final p6r0 d;
    public final w7h1 e;

    public d51(String str, String str2, String str3, p6r0 p6r0Var, w7h1 w7h1Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = p6r0Var;
        this.e = w7h1Var;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final n6r0 d() {
        return this.d;
    }

    public final w7h1 e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d51) {
            d51 d51Var = (d51) obj;
            if (this.a.equals(d51Var.a) && this.b.equals(d51Var.b) && this.c.equals(d51Var.c) && this.d == d51Var.d && this.e.equals(d51Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e.d.hashCode() + ((this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }
}
