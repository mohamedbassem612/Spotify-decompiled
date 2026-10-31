package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public class jgt extends mgt implements kma0 {
    public final znb0 Q0;

    public jgt(mla0 mla0Var, String str, String str2, Object obj) {
        super(mla0Var, str, str2, obj);
        this.Q0 = dm5.S(2, new hgt(this, (byte) 0));
        dm5.S(2, new hgt(this, (byte) 1));
    }

    public final bgt A() {
        return (igt) this.Q0.getValue();
    }

    @Override // 
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public jgt x(rka0 rka0Var) {
        return new jgt(((mgt) this).h, z(), rka0Var);
    }

    public final gma0 b() {
        return (igt) this.Q0.getValue();
    }

    public final Object get(Object obj) {
        return ((igt) this.Q0.getValue()).call(new Object[]{obj});
    }

    public final Object invoke(Object obj) {
        return get(obj);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public final jma0 m1014b() {
        return (igt) this.Q0.getValue();
    }

    public jgt(mla0 mla0Var, tdy0 tdy0Var, rka0 rka0Var) {
        super(mla0Var, tdy0Var, rka0Var);
        this.Q0 = dm5.S(2, new hgt(this, (byte) 0));
        dm5.S(2, new hgt(this, (byte) 1));
    }
}
