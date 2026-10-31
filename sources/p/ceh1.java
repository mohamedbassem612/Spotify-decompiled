package p;

import android.os.Build;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ceh1 implements a4l {
    public final kly0 a;
    public final kly0 b;
    public final kly0 c;
    public final jo20 d;
    public final q8n e;
    public llm f;

    public ceh1(g5t g5tVar, kly0 kly0Var, kly0 kly0Var2, jo20 jo20Var, q8n q8nVar) {
        this.a = g5tVar;
        this.b = kly0Var;
        this.c = kly0Var2;
        this.d = jo20Var;
        this.e = q8nVar;
    }

    @Override // p.a4l
    public final void a() {
        llm llmVar = this.f;
        if (llmVar != null) {
            smo1.q(llmVar);
        }
        this.f = null;
    }

    @Override // p.a4l
    public final void b() {
        if (this.d.isEnabled() && Build.VERSION.SDK_INT >= 36 && ibc.a() >= 3600001) {
            j0d1 j0d1VarB = guo1.B();
            q8n q8nVar = this.e;
            q8nVar.getClass();
            llm llmVarE = smo1.e(ilo1.B(q8nVar, j0d1VarB));
            this.f = llmVarE;
            c921.y(llmVarE, (o8n) null, 0, new b0f1(this, (lnm) null, (byte) 17), 3);
        }
    }
}
