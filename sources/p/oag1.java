package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class oag1 {
    public final String a;
    public final String b;
    public final long c;

    public oag1(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oag1)) {
            return false;
        }
        oag1 oag1Var = (oag1) obj;
        return this.a.equals(oag1Var.a) && this.b.equals(oag1Var.b) && this.c == oag1Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
