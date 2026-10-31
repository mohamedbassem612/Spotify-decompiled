package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zy10 implements dwo {
    public final trd1 a;
    public final Context b;
    public final llm c;

    public zy10(Context context, ov20 ov20Var, trd1 trd1Var, q8n q8nVar) {
        this.a = trd1Var;
        this.b = context.getApplicationContext();
        llm llmVarE = smo1.e(ilo1.B(q8nVar, new v62((byte) 8)));
        this.c = llmVarE;
        l4p1.u(llmVarE, f5p1.q(f5p1.n(((bw20) ov20Var).b("allow-advertising-id-transmission")), new c4z(this)));
    }

    public final void shutdown() {
        smo1.q(this.c);
    }
}
