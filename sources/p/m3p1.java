package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class m3p1 extends q1p1 {
    public final r3p1 d;

    public m3p1(r3p1 r3p1Var, int i) {
        super(r3p1Var.size(), i);
        this.d = r3p1Var;
    }

    @Override // p.q1p1
    public final Object a(int i) {
        return this.d.get(i);
    }
}
