package p;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dif1 {
    public final Function0 a;
    public final c4z b;
    public final float c;
    public llm d;
    public long e;
    public int f = -1;
    public float g;
    public float h;
    public boolean i;
    public long j;
    public ps41 k;
    public long l;
    public xab1 m;

    public dif1(int i, Function0 function0, c4z c4zVar) {
        this.a = function0;
        this.b = c4zVar;
        float f = i;
        this.c = f * f;
    }

    public final void a() {
        this.d = null;
        d(this.e);
    }

    public final void b(llm llmVar, long j) {
        d(j);
        this.d = llmVar;
    }

    public final void c() {
        llm llmVar = this.d;
        if (llmVar == null) {
            return;
        }
        long jLongValue = ((Number) this.a.invoke()).longValue();
        long j = this.j;
        if (jLongValue >= j) {
            this.j = 0L;
            j = 0;
        }
        if (!this.i && this.k == null && j == 0) {
            return;
        }
        this.l = jLongValue;
        if (this.k != null) {
            return;
        }
        this.j = 0L;
        ps41 ps41Var = new ps41(this.e);
        this.k = ps41Var;
        this.m = fn31.T(llmVar, (o8n) null, 0, new pec1(this, ps41Var, null, (byte) 19), 3);
        this.b.invoke(ps41Var, Boolean.TRUE);
    }

    public final void d(long j) {
        xab1 xab1Var = this.m;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.m = null;
        this.f = -1;
        this.i = false;
        this.j = 0L;
        ps41 ps41Var = this.k;
        this.k = null;
        this.e = j;
        if (ps41Var != null) {
            this.b.invoke(ps41Var, Boolean.FALSE);
        }
    }
}
