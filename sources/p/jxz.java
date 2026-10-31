package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jxz implements t600 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public jxz(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxz)) {
            return false;
        }
        jxz jxzVar = (jxz) obj;
        return this.a == jxzVar.a && this.b == jxzVar.b && this.c == jxzVar.c && this.d == jxzVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
