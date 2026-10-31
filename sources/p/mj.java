package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mj {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final String f;

    public mj(int i, int i2, int i3, int i4, String str, String str2) {
        str = (i4 & 2) != 0 ? null : str;
        str2 = (i4 & 32) != 0 ? null : str2;
        this.a = null;
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mj)) {
            return false;
        }
        mj mjVar = (mj) obj;
        return u890.j(this.a, mjVar.a) && u890.j(this.b, mjVar.b) && this.c == mjVar.c && this.d == mjVar.d && this.e == mjVar.e && u890.j(this.f, mjVar.f);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iF = kaa0.f(this.e, kaa0.f(this.d, kaa0.f(this.c, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31);
        String str3 = this.f;
        return iF + (str3 != null ? str3.hashCode() : 0);
    }
}
