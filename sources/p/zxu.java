package p;

import com.spotify.mobius.MobiusLoop;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zxu implements wxu {
    public final j2v a;
    public final mr20 b;
    public final q8n c;
    public final q8n d;
    public n8m0 e;
    public llm f;

    public zxu(j2v j2vVar, mr20 mr20Var, q8n q8nVar, q8n q8nVar2) {
        this.a = j2vVar;
        this.b = mr20Var;
        this.c = q8nVar;
        this.d = q8nVar2;
    }

    public final void a(String str, String str2) {
        n8m0 n8m0Var = this.e;
        if (n8m0Var == null) {
            u890.C("loopApi");
            throw null;
        }
        ((MobiusLoop) n8m0Var.c.a.getValue()).a(new fwu(str, str2));
    }

    public final void b(String str, String str2) {
        n8m0 n8m0Var = this.e;
        if (n8m0Var == null) {
            u890.C("loopApi");
            throw null;
        }
        ((MobiusLoop) n8m0Var.c.a.getValue()).a(new dwu(str, str2));
    }

    public final void c() {
        q8n q8nVar = this.c;
        llm llmVarE = smo1.e(q8nVar);
        this.f = llmVarE;
        this.e = new n8m0(rve0.e, this.a, ayu.a, null, this.b, wvu.Y, q8nVar, this.d, llmVarE);
    }

    public final void d() {
        llm llmVar = this.f;
        if (llmVar != null) {
            smo1.p(llmVar, (CancellationException) null);
        } else {
            u890.C("coroutineScope");
            throw null;
        }
    }

    public final zob1 getStatus() {
        n8m0 n8m0Var = this.e;
        if (n8m0Var != null) {
            return n8m0Var.d;
        }
        u890.C("loopApi");
        throw null;
    }
}
