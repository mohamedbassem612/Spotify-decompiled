package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vnl1 extends xnl1 {
    public final long a;

    public vnl1(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vnl1) && this.a == ((vnl1) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public /* synthetic */ vnl1() {
        this(0L);
    }
}
