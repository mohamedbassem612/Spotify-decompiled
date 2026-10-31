package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sts0 implements tts0 {
    public final String a;
    public final String b;
    public final long c;
    public final long d;

    public sts0(long j, long j2, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sts0)) {
            return false;
        }
        sts0 sts0Var = (sts0) obj;
        return this.a.equals(sts0Var.a) && u890.j(this.b, sts0Var.b) && this.c == sts0Var.c && this.d == sts0Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Long.hashCode(this.d) + cy30.f((iHashCode + (str == null ? 0 : str.hashCode())) * 31, this.c, 31);
    }
}
