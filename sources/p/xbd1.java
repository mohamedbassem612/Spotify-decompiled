package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xbd1 implements vfa {
    public volatile xab1 a;

    public final void a() {
        xab1 xab1Var = this.a;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.a = null;
    }

    public final void c(voa0 voa0Var, zsc zscVar, llm llmVar, kd8 kd8Var, hj8 hj8Var) {
        xab1 xab1Var = this.a;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        if (voa0Var.d.isEmpty()) {
            return;
        }
        this.a = fn31.T(llmVar, (o8n) null, 0, new g1y(zscVar, voa0Var, hj8Var, kd8Var, (lnm) null, (byte) 4), 3);
    }
}
