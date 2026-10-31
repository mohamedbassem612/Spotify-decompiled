package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tek {
    public final String a;
    public final int b;
    public final boolean c;
    public final String d;
    public final Integer e;
    public final Integer f;

    public /* synthetic */ tek(String str, int i, int i2, boolean z) {
        this((i2 & 2) != 0 ? 1 : i, null, null, str, null, (i2 & 4) != 0 ? false : z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tek)) {
            return false;
        }
        tek tekVar = (tek) obj;
        return u890.j(this.a, tekVar.a) && this.b == tekVar.b && this.c == tekVar.c && u890.j(this.d, tekVar.d) && u890.j(this.e, tekVar.e) && u890.j(this.f, tekVar.f);
    }

    public final int hashCode() {
        int iG = xcg1.g(ab80.k(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        String str = this.d;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.e;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public tek(int i, Integer num, Integer num2, String str, String str2, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = str2;
        this.e = num;
        this.f = num2;
    }
}
