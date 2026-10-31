package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wze1 {
    public final String a;
    public final String b;
    public final long c;

    public wze1(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wze1)) {
            return false;
        }
        wze1 wze1Var = (wze1) obj;
        return this.a.equals(wze1Var.a) && this.b.equals(wze1Var.b) && this.c == wze1Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
