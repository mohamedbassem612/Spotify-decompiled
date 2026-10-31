package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ots0 implements tts0 {
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public ots0(long j, long j2, String str, String str2, String str3, String str4) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ots0)) {
            return false;
        }
        ots0 ots0Var = (ots0) obj;
        return this.a == ots0Var.a && this.b == ots0Var.b && this.c.equals(ots0Var.c) && u890.j(this.d, ots0Var.d) && u890.j(this.e, ots0Var.e) && u890.j(this.f, ots0Var.f);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.f(Long.hashCode(this.a) * 31, this.b, 31), 31, this.c);
        String str = this.d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
