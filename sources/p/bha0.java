package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bha0 extends z6 {
    public final ega0 f;

    public bha0(nfa0 nfa0Var, ega0 ega0Var, String str) {
        super(str, nfa0Var);
        this.f = ega0Var;
        this.a.add("primitive");
    }

    @Override // p.z6
    public final ega0 G() {
        return this.f;
    }

    @Override // p.z6
    public final ega0 e(String str) {
        if (str == "primitive") {
            return this.f;
        }
        hhg1.n("This input can only handle primitives with 'primitive' tag");
        return null;
    }

    public final int p(h661 h661Var) {
        return 0;
    }
}
