package p;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class i5m implements yte0 {
    public final v1k a;
    public final mr20 b;
    public final kt91 c;
    public final ruz d;
    public final q8n e;
    public final Function0 f;
    public final Long g;
    public final Function0 h;
    public llm i;
    public ve01 j;
    public String k;
    public String l;

    public i5m(v1k v1kVar, mr20 mr20Var, kt91 kt91Var, ruz ruzVar, Long l) {
        fns fnsVar = igu.a;
        bs50 bs50Var = pyf0.a.f;
        g5m g5mVar = g5m.a;
        h5m h5mVar = h5m.a;
        this.a = v1kVar;
        this.b = mr20Var;
        this.c = kt91Var;
        this.d = ruzVar;
        this.e = bs50Var;
        this.f = g5mVar;
        this.g = l;
        this.h = h5mVar;
    }

    public final void a() {
        llm llmVar = this.i;
        if (llmVar != null) {
            smo1.p(llmVar, (CancellationException) null);
        }
        this.i = null;
        this.j = null;
    }

    public final void b() {
        llm llmVar = this.i;
        if (llmVar != null) {
            smo1.p(llmVar, (CancellationException) null);
        }
        llm llmVarE = smo1.e(flo1.l(guo1.B(), this.e));
        this.i = llmVarE;
        ve01 ve01VarR = d5p1.r(new fu20(this.b, new zti(this, (lnm) null, (byte) 26), (byte) 1), llmVarE, ey71.a, 1);
        this.j = ve01VarR;
        fn31.T(llmVarE, (o8n) null, 0, new cuk(this, ve01VarR, (lnm) null, (byte) 15), 3);
    }
}
