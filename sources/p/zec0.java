package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zec0 {
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;

    public zec0(int i, String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zec0)) {
            return false;
        }
        zec0 zec0Var = (zec0) obj;
        return u890.j(this.a, zec0Var.a) && u890.j(this.b, zec0Var.b) && this.c == zec0Var.c && this.d == zec0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
    }
}
