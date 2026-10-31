package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fhr {
    public final String a;
    public final long b;

    public fhr(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fhr)) {
            return false;
        }
        fhr fhrVar = (fhr) obj;
        return this.a.equals(fhrVar.a) && this.b == fhrVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
