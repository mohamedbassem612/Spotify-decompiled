package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vft extends ogt implements zla0 {
    public final znb0 R0;

    public vft(mla0 mla0Var, tdy0 tdy0Var, rka0 rka0Var) {
        super(mla0Var, tdy0Var, rka0Var);
        this.R0 = dm5.S(2, new ka(this, (byte) 22));
    }

    @Override // p.ogt
    /* JADX INFO: renamed from: B */
    public final ogt x(rka0 rka0Var) {
        return new vft(((mgt) this).h, z(), rka0Var);
    }

    public final tla0 c() {
        return (uft) this.R0.getValue();
    }

    @Override // p.ogt
    public final lft x(rka0 rka0Var) {
        return new vft(((mgt) this).h, z(), rka0Var);
    }
}
