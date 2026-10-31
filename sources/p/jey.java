package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jey {
    public final rj01 a;
    public final int b;
    public final boolean c;
    public final int d;

    public jey(rj01 rj01Var, int i, boolean z, int i2) {
        this.a = rj01Var;
        this.b = i;
        this.c = z;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jey)) {
            return false;
        }
        jey jeyVar = (jey) obj;
        return this.a.equals(jeyVar.a) && this.b == jeyVar.b && this.c == jeyVar.c && this.d == jeyVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + xcg1.g(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }
}
