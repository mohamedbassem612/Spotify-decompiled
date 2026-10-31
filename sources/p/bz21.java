package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class bz21 {
    public final long a;
    public final String b;

    public bz21(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bz21)) {
            return false;
        }
        bz21 bz21Var = (bz21) obj;
        return this.a == bz21Var.a && this.b.equals(bz21Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }
}
