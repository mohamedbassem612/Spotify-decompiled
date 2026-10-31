package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class e6b extends cdo0 {
    @Override // p.cdo0
    public final void d(cdo0 cdo0Var) {
        if (cdo0Var instanceof e6b) {
            this.a = cdo0Var;
        } else {
            hhg1.n("Parent of block must also be block (can not be inline)");
        }
    }
}
