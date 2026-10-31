package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class mhk0 {
    public final dma1 a;
    public final nfa0 b;

    public mhk0(dma1 dma1Var, nfa0 nfa0Var) {
        this.a = dma1Var;
        this.b = nfa0Var;
    }

    public final lhk0 a() {
        String strE = this.a.e(nhk0.a, (String) null);
        if (strE != null) {
            lhk0 lhk0Var = (lhk0) this.b.a(strE, lhk0.Companion.serializer());
            if (lhk0Var != null) {
                return lhk0Var;
            }
        }
        return new lhk0(0, w7x.a);
    }
}
