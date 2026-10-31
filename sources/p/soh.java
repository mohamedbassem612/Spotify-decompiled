package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class soh implements iph {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final boolean e;

    public soh(long j, String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof soh)) {
            return false;
        }
        soh sohVar = (soh) obj;
        return this.a.equals(sohVar.a) && this.b.equals(sohVar.b) && u890.j(this.c, sohVar.c) && this.d == sohVar.d && this.e == sohVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + cy30.f(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), this.d, 31);
    }
}
