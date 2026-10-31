package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lpg0 extends hfp0 {
    @Override // p.xiy0
    public final long Y0(h661 h661Var, int i) {
        long j;
        long j2;
        int i2 = i % 2;
        long j3 = this.g;
        if (i2 == 0) {
            j = sio1.v(j3).a;
            j2 = 1;
        } else {
            j = sio1.v(j3).a;
            j2 = 2;
        }
        return j | j2;
    }
}
