package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class lgt extends mgt implements lma0 {
    public final znb0 Q0;

    public lgt(mla0 mla0Var, String str, String str2) {
        super(mla0Var, str, str2, lyc.NO_RECEIVER);
        this.Q0 = dm5.S(2, new b9o(this, (byte) 3));
        dm5.S(2, new ka(this, (byte) 23));
    }

    @Override // p.mgt
    public final bgt A() {
        return (kgt) this.Q0.getValue();
    }

    @Override // p.lft
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public lgt x(rka0 rka0Var) {
        return new lgt(this.h, t(), rka0Var);
    }

    @Override // p.lma0
    public final kgt b() {
        return (kgt) this.Q0.getValue();
    }

    @Override // p.vu30
    public final Object invoke(Object obj, Object obj2) {
        return ((kgt) this.Q0.getValue()).call(obj, obj2);
    }

    @Override // p.mma0
    public final gma0 b() {
        return (kgt) this.Q0.getValue();
    }

    public lgt(mla0 mla0Var, tdy0 tdy0Var, rka0 rka0Var) {
        super(mla0Var, tdy0Var, rka0Var);
        this.Q0 = dm5.S(2, new b9o(this, (byte) 3));
        dm5.S(2, new ka(this, (byte) 23));
    }
}
