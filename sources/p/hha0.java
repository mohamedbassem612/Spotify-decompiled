package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hha0 extends z6 {
    public final pfa0 f;
    public final int g;
    public int h;

    public hha0(nfa0 nfa0Var, pfa0 pfa0Var) {
        super(null, nfa0Var);
        this.f = pfa0Var;
        this.g = pfa0Var.a.size();
        this.h = -1;
    }

    @Override // p.z6
    public final ega0 G() {
        return this.f;
    }

    @Override // p.z6
    public final ega0 e(String str) {
        return (ega0) this.f.a.get(Integer.parseInt(str));
    }

    public final int p(h661 h661Var) {
        int i = this.h;
        if (i >= this.g - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.h = i2;
        return i2;
    }

    @Override // p.z6
    public final String z(h661 h661Var, int i) {
        return String.valueOf(i);
    }
}
