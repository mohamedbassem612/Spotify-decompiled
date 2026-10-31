package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class tjh0 extends yag {
    public final long j;

    public tjh0(o2r o2rVar, n3r n3rVar, ie30 ie30Var, int i, Object obj, long j, long j2, long j3, String str) {
        super(o2rVar, n3rVar, 1, ie30Var, i, obj, j, j2, str);
        ie30Var.getClass();
        this.j = j3;
    }

    public long c() {
        long j = this.j;
        if (j != -1) {
            return j + 1;
        }
        return -1L;
    }

    public boolean d() {
        throw null;
    }
}
