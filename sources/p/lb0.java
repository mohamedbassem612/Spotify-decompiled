package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lb0 implements nb0 {
    public final int a;
    public final int b;
    public final String c;

    public lb0(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lb0)) {
            return false;
        }
        lb0 lb0Var = (lb0) obj;
        return this.a == lb0Var.a && this.b == lb0Var.b && u890.j(this.c, lb0Var.c);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.b, kaa0.f(this.a, Integer.hashCode(0) * 31, 31), 31);
        String str = this.c;
        return iF + (str != null ? str.hashCode() : 0);
    }
}
