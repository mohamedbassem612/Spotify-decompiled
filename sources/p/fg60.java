package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fg60 {
    public final xe01 a;
    public final xe01 b;
    public final xe01 c;
    public final xe01 d;
    public final xe01 e;

    public fg60(ov20 ov20Var, jed0 jed0Var, haa0 haa0Var, q8n q8nVar) {
        llm llmVarH = us71.h(q8nVar);
        lmf lmfVar = new lmf(jed0Var.b(), (byte) 1);
        Boolean bool = Boolean.FALSE;
        sua suaVar = ey71.a;
        this.a = d5p1.t(lmfVar, llmVarH, suaVar, bool);
        this.b = d5p1.t(new cg60(jed0Var.d(), (byte) 0), llmVarH, suaVar, bool);
        this.c = d5p1.t((mr20) ((idd1) haa0Var.d).getValue(), llmVarH, suaVar, Boolean.TRUE);
        this.d = d5p1.t(new jff(jed0Var.c(), (byte) 2), llmVarH, suaVar, bool);
        this.e = d5p1.t(new ry50(((bw20) ov20Var).c("campfire", "DISABLED_CANNOT_ENABLE"), (byte) 3), llmVarH, suaVar, bool);
    }

    public final boolean a() {
        return ((Boolean) this.b.a.getValue()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) this.a.a.getValue()).booleanValue();
    }
}
