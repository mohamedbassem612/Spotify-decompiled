package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rft extends jgt implements xla0 {
    public final znb0 R0;

    public rft(mla0 mla0Var, String str, String str2, Object obj) {
        super(mla0Var, str, str2, obj);
        this.R0 = dm5.S(2, new ka(this, (byte) 20));
    }

    @Override // p.jgt
    /* JADX INFO: renamed from: B */
    public final jgt x(rka0 rka0Var) {
        return new rft(((mgt) this).h, z(), rka0Var);
    }

    public final void X(Object obj, Object obj2) {
        ((qft) this.R0.getValue()).call(new Object[]{obj, obj2});
    }

    public final tla0 c() {
        return (qft) this.R0.getValue();
    }

    @Override // p.jgt
    public final lft x(rka0 rka0Var) {
        return new rft(((mgt) this).h, z(), rka0Var);
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public final wla0 m1308c() {
        return (qft) this.R0.getValue();
    }

    public rft(mla0 mla0Var, tdy0 tdy0Var, rka0 rka0Var) {
        super(mla0Var, tdy0Var, rka0Var);
        this.R0 = dm5.S(2, new ka(this, (byte) 20));
    }
}
