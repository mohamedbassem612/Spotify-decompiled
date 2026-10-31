package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class udk {
    public final String a;
    public final String b;
    public final int c;
    public final gnw d;
    public final boolean e;
    public final int f;
    public final int g;

    public udk(String str, String str2, int i, gnw gnwVar, int i2) {
        str2 = (i2 & 2) != 0 ? null : str2;
        i = (i2 & 4) != 0 ? 1 : i;
        gnwVar = (i2 & 8) != 0 ? dnw.a : gnwVar;
        boolean z = (i2 & 16) != 0;
        int i3 = (i2 & 32) != 0 ? 1 : 2;
        int i4 = (i2 & 64) == 0 ? 2 : 1;
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = gnwVar;
        this.e = z;
        this.f = i3;
        this.g = i4;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof udk)) {
            return false;
        }
        udk udkVar = (udk) obj;
        return this.a.equals(udkVar.a) && u890.j(this.b, udkVar.b) && this.c == udkVar.c && this.d.equals(udkVar.d) && this.e == udkVar.e && this.f == udkVar.f && this.g == udkVar.g;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return l1d.C(this.g) + ab80.k(this.f, xcg1.g((this.d.hashCode() + ab80.k(this.c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31, 31, this.e), 31);
    }
}
