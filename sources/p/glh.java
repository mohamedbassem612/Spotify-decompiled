package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class glh implements hlh {
    public final int a;
    public final boolean b;
    public final pkh c;
    public final int d;

    public glh(int i, boolean z, pkh pkhVar, int i2) {
        this.a = i;
        this.b = z;
        this.c = pkhVar;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof glh)) {
            return false;
        }
        glh glhVar = (glh) obj;
        return this.a == glhVar.a && this.b == glhVar.b && this.c.equals(glhVar.c) && this.d == glhVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ((this.c.hashCode() + xcg1.g(Integer.hashCode(this.a) * 31, 31, this.b)) * 31);
    }
}
