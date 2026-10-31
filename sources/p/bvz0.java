package p;

import com.ravelin.core.model.RavelinError;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bvz0 extends too1 {
    public final /* synthetic */ y1t0 b;

    public bvz0(y1t0 y1t0Var) {
        this.b = y1t0Var;
    }

    public final void n(RavelinError ravelinError) {
        ((ayh) this.b.b).y0(new IllegalStateException(l1d.m("Ravelin SDK initialization failed: ", ravelinError.getMessage())));
    }

    public final void u(Object obj) {
        pvz0 pvz0Var = (pvz0) obj;
        String strE = pvz0Var != null ? pvz0Var.a().e() : null;
        y1t0 y1t0Var = this.b;
        if (strE == null) {
            ((ayh) y1t0Var.b).y0(new IllegalStateException("Ravelin SDK instance or device id is null"));
            return;
        }
        avz0 avz0Var = new avz0(y1t0Var, strE);
        llm llmVar = pvz0Var.l;
        if (llmVar != null) {
            fn31.T(llmVar, (o8n) null, 0, new glu0(pvz0Var, avz0Var, (lnm) null, (byte) 22), 3);
        }
    }
}
