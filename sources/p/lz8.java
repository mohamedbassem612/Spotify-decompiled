package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lz8 {
    public long a;
    public String b;
    public lin c;
    public min d;
    public nin e;
    public qin f;
    public byte g;

    public lz8(mz8 mz8Var) {
        this.a = mz8Var.a;
        this.b = mz8Var.b;
        this.c = mz8Var.c;
        this.d = mz8Var.d;
        this.e = mz8Var.e;
        this.f = mz8Var.f;
        this.g = (byte) 1;
    }

    public final mz8 a() {
        String str;
        lin linVar;
        min minVar;
        if (this.g == 1 && (str = this.b) != null && (linVar = this.c) != null && (minVar = this.d) != null) {
            return new mz8(this.a, str, linVar, minVar, this.e, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if ((1 & this.g) == 0) {
            sb.append(" timestamp");
        }
        if (this.b == null) {
            sb.append(" type");
        }
        if (this.c == null) {
            sb.append(" app");
        }
        if (this.d == null) {
            sb.append(" device");
        }
        eg.m(l1d.p(sb, "Missing required properties:"));
        return null;
    }

    public final void b(oz8 oz8Var) {
        this.c = oz8Var;
    }

    public final void c(d09 d09Var) {
        this.d = d09Var;
    }

    public final void d(e09 e09Var) {
        this.e = e09Var;
    }

    public final void e(j09 j09Var) {
        this.f = j09Var;
    }

    public final void f(long j) {
        this.a = j;
        this.g = (byte) (this.g | 1);
    }

    public final void g(String str) {
        if (str != null) {
            this.b = str;
        } else {
            bhn0.i("Null type");
        }
    }

    public lz8() {
    }
}
