package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rlg {
    public final String a;
    public final long b;
    public final long c;

    public rlg(long j, long j2, String str) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rlg)) {
            return false;
        }
        rlg rlgVar = (rlg) obj;
        return this.a.equals(rlgVar.a) && this.b == rlgVar.b && this.c == rlgVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + cy30.f(this.a.hashCode() * 31, this.b, 31);
    }
}
