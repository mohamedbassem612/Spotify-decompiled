package p;

import android.os.Bundle;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bbv implements anc0, mqb1 {
    public final f1n0 a;
    public final xvo b;
    public final q8n c;
    public final bpb1 d;
    public llm e;
    public Boolean f;

    public bbv(f1n0 f1n0Var, xvo xvoVar, q8n q8nVar, bpb1 bpb1Var) {
        this.a = f1n0Var;
        this.b = xvoVar;
        this.c = q8nVar;
        this.d = bpb1Var;
    }

    @Override // p.anc0
    public final void a() {
        llm llmVar = this.e;
        if (llmVar != null) {
            smo1.p(llmVar, (CancellationException) null);
        }
        this.e = null;
    }

    @Override // p.anc0
    public final void b() {
        llm llmVar = this.e;
        if (llmVar != null) {
            smo1.p(llmVar, (CancellationException) null);
        }
        llm llmVarK = i3a.k(this.c);
        this.e = llmVarK;
        fn31.T(llmVarK, (o8n) null, 0, new ett(this, (lnm) null, (byte) 5), 3);
    }

    @Override // p.mqb1
    public final void e(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("dsa_personalized_recommendations_disabled")) {
            return;
        }
        this.f = Boolean.valueOf(bundle.getBoolean("dsa_personalized_recommendations_disabled"));
    }

    @Override // p.mqb1
    public final void f(Bundle bundle) {
        Boolean bool = this.f;
        if (bool != null) {
            bundle.putBoolean("dsa_personalized_recommendations_disabled", bool.booleanValue());
        }
    }
}
