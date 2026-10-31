package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ktg {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public ktg(String str, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ktg)) {
            return false;
        }
        ktg ktgVar = (ktg) obj;
        return u890.j(this.a, ktgVar.a) && this.b == ktgVar.b && this.c == ktgVar.c && this.d == ktgVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
