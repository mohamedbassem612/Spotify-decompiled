package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dae extends bqc1 implements Comparable {
    public long t;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        dae daeVar = (dae) obj;
        if (f(4) != daeVar.f(4)) {
            return f(4) ? 1 : -1;
        }
        long j = this.f - daeVar.f;
        if (j == 0) {
            j = this.t - daeVar.t;
            if (j == 0) {
                return 0;
            }
        }
        return j > 0 ? 1 : -1;
    }
}
