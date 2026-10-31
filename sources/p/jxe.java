package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jxe {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;

    public jxe(int i, int i2, long j, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxe)) {
            return false;
        }
        jxe jxeVar = (jxe) obj;
        return this.a.equals(jxeVar.a) && this.b.equals(jxeVar.b) && this.c == jxeVar.c && this.d == jxeVar.d && this.e == jxeVar.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + ab80.k(this.d, ab80.k(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31);
    }
}
