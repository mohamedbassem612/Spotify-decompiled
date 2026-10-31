package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jog {
    public final int a;
    public final String b;
    public final String c;
    public final long d;
    public final String e;
    public final String f;
    public final long g;

    public jog(int i, long j, long j2, String str, String str2, String str3, String str4) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = str3;
        this.f = str4;
        this.g = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jog)) {
            return false;
        }
        jog jogVar = (jog) obj;
        return this.a == jogVar.a && u890.j(this.b, jogVar.b) && this.c.equals(jogVar.c) && this.d == jogVar.d && u890.j(this.e, jogVar.e) && u890.j(this.f, jogVar.f) && this.g == jogVar.g;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.f(cy30.d(cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), this.d, 31), 31, this.e);
        String str = this.f;
        return Long.hashCode(this.g) + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}
