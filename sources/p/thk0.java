package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class thk0 {
    public final dma1 a;
    public final yqg b;
    public final nfa0 c;
    public shk0 d;

    public thk0(dma1 dma1Var, yqg yqgVar, nfa0 nfa0Var) {
        this.a = dma1Var;
        this.b = yqgVar;
        this.c = nfa0Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    public final shk0 a() {
        shk0 shk0Var = this.d;
        if (shk0Var == null) {
            String strE = this.a.e(uhk0.a, (String) null);
            if (strE != null) {
                shk0Var = (shk0) this.c.a(strE, shk0.Companion.serializer());
                if (shk0Var == null) {
                    shk0Var = new shk0();
                }
            } else {
                shk0Var = new shk0();
            }
            this.d = shk0Var;
        }
        return shk0Var;
    }

    public final void b(String str) {
        shk0 shk0VarA = a();
        shk0VarA.a.put(str, Long.valueOf(this.b.b()));
        hma1 hma1VarEdit = this.a.edit();
        hma1VarEdit.d(uhk0.a, this.c.b(shk0.Companion.serializer(), shk0VarA));
        hma1VarEdit.g();
    }
}
