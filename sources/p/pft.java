package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pft extends ggt implements vla0 {
    public final znb0 R0;

    public pft(mla0 mla0Var, tdy0 tdy0Var, rka0 rka0Var) {
        super(mla0Var, tdy0Var, rka0Var);
        this.R0 = dm5.S(2, new ka(this, (byte) 19));
    }

    @Override // p.ggt
    /* JADX INFO: renamed from: B */
    public final ggt x(rka0 rka0Var) {
        return new pft(((mgt) this).h, z(), rka0Var);
    }

    public final tla0 c() {
        return (oft) this.R0.getValue();
    }

    @Override // p.ggt
    public final lft x(rka0 rka0Var) {
        return new pft(((mgt) this).h, z(), rka0Var);
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public final ula0 m1251c() {
        return (oft) this.R0.getValue();
    }

    public pft(mla0 mla0Var, String str, String str2, Object obj) {
        super(mla0Var, str, str2, obj);
        this.R0 = dm5.S(2, new ka(this, (byte) 19));
    }
}
