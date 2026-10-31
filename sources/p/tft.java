package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tft extends lgt implements yla0 {
    public final znb0 R0;

    public tft(mla0 mla0Var, String str, String str2) {
        super(mla0Var, str, str2);
        this.R0 = dm5.S(2, new ka(this, (byte) 21));
    }

    public final lgt B(rka0 rka0Var) {
        return new tft(((mgt) this).h, z(), rka0Var);
    }

    @Override // p.yla0
    /* JADX INFO: renamed from: c */
    public final sft m874c() {
        return (sft) this.R0.getValue();
    }

    public final lft x(rka0 rka0Var) {
        return new tft(((mgt) this).h, z(), rka0Var);
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public final tla0 m1360c() {
        return (sft) this.R0.getValue();
    }

    public tft(mla0 mla0Var, tdy0 tdy0Var, rka0 rka0Var) {
        super(mla0Var, tdy0Var, rka0Var);
        this.R0 = dm5.S(2, new ka(this, (byte) 21));
    }
}
