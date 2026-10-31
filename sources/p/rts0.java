package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rts0 implements tts0 {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public rts0(String str, String str2, String str3, String str4, long j) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rts0)) {
            return false;
        }
        rts0 rts0Var = (rts0) obj;
        return this.a == rts0Var.a && this.b.equals(rts0Var.b) && u890.j(this.c, rts0Var.c) && u890.j(this.d, rts0Var.d) && u890.j(this.e, rts0Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(Long.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
