package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uqt {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;

    public uqt(String str, String str2, String str3, String str4, long j) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uqt)) {
            return false;
        }
        uqt uqtVar = (uqt) obj;
        return this.a.equals(uqtVar.a) && this.b.equals(uqtVar.b) && this.c.equals(uqtVar.c) && u890.j(this.d, uqtVar.d) && this.e == uqtVar.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
