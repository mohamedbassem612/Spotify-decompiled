package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class eyf1 extends rqt0 {
    public final long i;
    public final long j;

    public eyf1(long j, long j2) {
        this.i = j;
        this.j = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eyf1)) {
            return false;
        }
        eyf1 eyf1Var = (eyf1) obj;
        return this.i == eyf1Var.i && this.j == eyf1Var.j;
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + (Long.hashCode(this.i) * 31);
    }
}
