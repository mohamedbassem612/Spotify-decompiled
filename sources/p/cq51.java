package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cq51 implements Comparable {
    public final long a;
    public final n3r b;

    public cq51(long j, n3r n3rVar) {
        this.a = j;
        this.b = n3rVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.a, ((cq51) obj).a);
    }
}
