package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class s731 {
    public final String a;
    public final long b;
    public final long c;
    public final xuh1 d;

    public s731(String str, long j, long j2, xuh1 xuh1Var) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = xuh1Var;
    }

    public static s731 a(s731 s731Var, xuh1 xuh1Var) {
        String str = s731Var.a;
        long j = s731Var.b;
        long j2 = s731Var.c;
        s731Var.getClass();
        return new s731(str, j, j2, xuh1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s731)) {
            return false;
        }
        s731 s731Var = (s731) obj;
        return u890.j(this.a, s731Var.a) && this.b == s731Var.b && this.c == s731Var.c && u890.j(this.d, s731Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.f(cy30.f(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }

    public /* synthetic */ s731(long j, long j2, String str) {
        this(str, j, j2, vuh1.i);
    }
}
