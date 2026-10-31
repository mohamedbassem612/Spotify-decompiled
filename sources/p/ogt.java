package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public class ogt extends mgt {
    public final znb0 Q0;

    public ogt(mla0 mla0Var, tdy0 tdy0Var, rka0 rka0Var) {
        super(mla0Var, tdy0Var, rka0Var);
        this.Q0 = dm5.S(2, new ka(this, (byte) 24));
    }

    public final bgt A() {
        return (ngt) this.Q0.getValue();
    }

    @Override // 
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public ogt x(rka0 rka0Var) {
        return new ogt(((mgt) this).h, z(), rka0Var);
    }

    public final gma0 b() {
        return (ngt) this.Q0.getValue();
    }
}
