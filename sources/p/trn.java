package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class trn {
    public final String a;
    public final long b;
    public final long c;

    public trn(long j, long j2, String str) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof trn)) {
            return false;
        }
        trn trnVar = (trn) obj;
        return u890.j(this.a, trnVar.a) && this.b == trnVar.b && this.c == trnVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + cy30.f(this.a.hashCode() * 31, this.b, 31);
    }
}
