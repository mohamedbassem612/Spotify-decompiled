package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class hfp0 extends xiy0 {
    public final long g;
    public final vyq0 h;
    public final jgc i;

    public hfp0(long j, vyq0 vyq0Var, ghy0 ghy0Var, h661 h661Var) {
        jgc jgcVar = new jgc();
        super(ghy0Var, new vyq0(jgcVar, (byte) 19), h661Var);
        this.g = j;
        this.h = vyq0Var;
        this.i = jgcVar;
    }

    @Override // p.xiy0
    public final void X0(h661 h661Var) {
        long j = this.g;
        jgc jgcVar = this.i;
        vyq0 vyq0Var = this.h;
        if (j != 19500) {
            vyq0Var.y(jgcVar, (int) (j & 2147483647L));
        } else {
            vyq0Var.x(jgcVar);
        }
    }
}
