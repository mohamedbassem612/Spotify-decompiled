package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public class ggt extends mgt implements ima0 {
    public final znb0 Q0;

    public ggt(mla0 mla0Var, tdy0 tdy0Var, rka0 rka0Var) {
        super(mla0Var, tdy0Var, rka0Var);
        this.Q0 = dm5.S(2, new egt(this, (byte) 0));
        dm5.S(2, new egt(this, (byte) 1));
    }

    public final bgt A() {
        return (fgt) this.Q0.getValue();
    }

    @Override // 
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public ggt x(rka0 rka0Var) {
        return new ggt(((mgt) this).h, z(), rka0Var);
    }

    public final gma0 b() {
        return (fgt) this.Q0.getValue();
    }

    public final Object get() {
        return ((fgt) this.Q0.getValue()).call(new Object[0]);
    }

    public final Object invoke() {
        return get();
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public final hma0 m901b() {
        return (fgt) this.Q0.getValue();
    }

    public ggt(mla0 mla0Var, String str, String str2, Object obj) {
        super(mla0Var, str, str2, obj);
        this.Q0 = dm5.S(2, new egt(this, (byte) 0));
        dm5.S(2, new egt(this, (byte) 1));
    }
}
