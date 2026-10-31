package p;

import android.os.Bundle;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p9t implements anc0, mqb1 {
    public final lzn0 a;
    public final koc0 b;
    public final q8n c;
    public final bpb1 d;
    public final q8n e;
    public llm f;
    public Boolean g;

    public p9t(lzn0 lzn0Var, koc0 koc0Var, q8n q8nVar, bpb1 bpb1Var, q8n q8nVar2) {
        this.a = lzn0Var;
        this.b = koc0Var;
        this.c = q8nVar;
        this.d = bpb1Var;
        this.e = q8nVar2;
    }

    public final void a() {
        llm llmVar = this.f;
        if (llmVar != null) {
            smo1.p(llmVar, (CancellationException) null);
        }
        this.f = null;
    }

    public final void b() {
        llm llmVar = this.f;
        lnm lnmVar = null;
        if (llmVar != null) {
            smo1.p(llmVar, (CancellationException) null);
        }
        llm llmVarK = i3a.k(this.c);
        this.f = llmVarK;
        fn31.T(llmVarK, (o8n) null, 0, new n1o(this, lnmVar, (byte) 26), 3);
    }

    public final void e(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("deleted_by_owner_was_followed")) {
            return;
        }
        this.g = Boolean.valueOf(bundle.getBoolean("deleted_by_owner_was_followed"));
    }

    public final void f(Bundle bundle) {
        Boolean bool = this.g;
        if (bool != null) {
            bundle.putBoolean("deleted_by_owner_was_followed", bool.booleanValue());
        }
    }
}
