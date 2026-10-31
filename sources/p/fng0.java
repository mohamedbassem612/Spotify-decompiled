package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fng0 extends wiy0 {
    public final long X;

    public fng0(ghy0 ghy0Var, yiy0 yiy0Var, long j, h661 h661Var) {
        super(ghy0Var, yiy0Var, h661Var);
        this.X = j;
    }

    public final long e1(h661 h661Var, int i) {
        long j;
        long j2;
        int i2 = i % 2;
        long j3 = this.X;
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
