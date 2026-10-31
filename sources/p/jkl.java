package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jkl {
    public final int a;
    public final int b;
    public final xrd c;

    public jkl(int i, int i2, xrd xrdVar) {
        this.a = i;
        this.b = i2;
        this.c = xrdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jkl)) {
            return false;
        }
        jkl jklVar = (jkl) obj;
        return this.a == jklVar.a && this.b == jklVar.b && u890.j(this.c, jklVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
    }
}
