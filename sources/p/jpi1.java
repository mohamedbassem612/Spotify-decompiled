package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jpi1 {
    public final Object a;
    public final long b;
    public final Exception c;

    public jpi1(Object obj, long j, Exception exc) {
        this.a = obj;
        this.b = j;
        this.c = exc;
    }

    public final Object a() {
        return this.a;
    }

    public final Exception b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpi1)) {
            return false;
        }
        jpi1 jpi1Var = (jpi1) obj;
        return u890.j(this.a, jpi1Var.a) && this.b == jpi1Var.b && u890.j(this.c, jpi1Var.c);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iF = cy30.f((obj == null ? 0 : obj.hashCode()) * 31, this.b, 31);
        Exception exc = this.c;
        return iF + (exc != null ? exc.hashCode() : 0);
    }
}
