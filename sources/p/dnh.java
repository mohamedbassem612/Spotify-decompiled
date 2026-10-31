package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class dnh implements lnh {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final int e;

    public dnh(int i, String str, String str2, boolean z, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnh)) {
            return false;
        }
        dnh dnhVar = (dnh) obj;
        return this.a.equals(dnhVar.a) && u890.j(this.b, dnhVar.b) && u890.j(this.c, dnhVar.c) && this.d == dnhVar.d && this.e == dnhVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + xcg1.g(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
