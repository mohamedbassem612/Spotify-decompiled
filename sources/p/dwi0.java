package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dwi0 extends ewi0 {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final svi0 e;

    public dwi0(String str, String str2, long j, long j2, svi0 svi0Var) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = svi0Var;
    }

    public final String a() {
        return this.a;
    }

    public final svi0 b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dwi0)) {
            return false;
        }
        dwi0 dwi0Var = (dwi0) obj;
        return u890.j(this.a, dwi0Var.a) && this.b.equals(dwi0Var.b) && this.c == dwi0Var.c && this.d == dwi0Var.d && u890.j(this.e, dwi0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.f(cy30.f(cy30.d(this.a.hashCode() * 31, 31, this.b), this.c, 31), this.d, 31);
    }
}
