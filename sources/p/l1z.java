package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class l1z implements ez00 {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final int d;
    public final boolean e;

    public l1z(String str, int i, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = i;
        this.e = z && !z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1z)) {
            return false;
        }
        l1z l1zVar = (l1z) obj;
        return this.a == l1zVar.a && this.b == l1zVar.b && u890.j(this.c, l1zVar.c) && this.d == l1zVar.d;
    }

    public final int hashCode() {
        int iG = xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return l1d.C(this.d) + ((iG + (str == null ? 0 : str.hashCode())) * 31);
    }
}
