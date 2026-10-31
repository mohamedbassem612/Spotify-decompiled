package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mg5 implements dwo {
    public final /* synthetic */ byte a = 3;
    public final llm b;

    public mg5(bhs bhsVar, tg8 tg8Var, q8n q8nVar) {
        llm llmVarE = smo1.e(flo1.l(q8nVar, new z8n("PreferredLocaleReporterDaemon")));
        this.b = llmVarE;
        fn31.T(llmVarE, (o8n) null, 0, new cqu0(bhsVar, tg8Var, (lnm) null, (byte) 3), 3);
    }

    public final void shutdown() {
        byte b = this.a;
        llm llmVar = this.b;
        switch (b) {
            case 0:
                smo1.p(llmVar, (CancellationException) null);
                break;
            case 1:
                smo1.p(llmVar, (CancellationException) null);
                break;
            case 2:
                smo1.p(llmVar, (CancellationException) null);
                break;
            case 3:
                smo1.p(llmVar, (CancellationException) null);
                break;
            case 4:
                smo1.p(llmVar, (CancellationException) null);
                break;
            case 5:
                smo1.p(llmVar, (CancellationException) null);
                break;
            default:
                smo1.p(llmVar, (CancellationException) null);
                break;
        }
    }

    public mg5(ai8 ai8Var, kly0 kly0Var) {
        llm llmVarE = smo1.e(guo1.B());
        this.b = llmVarE;
        fn31.T(llmVarE, (o8n) null, 0, new cto0(ai8Var, kly0Var, (lnm) null, (byte) 11), 3);
    }

    public mg5(k4q0 k4q0Var, xn4 xn4Var, q8n q8nVar) {
        llm llmVarK = i3a.k(q8nVar);
        this.b = llmVarK;
        if (xn4Var.a()) {
            fn31.T(llmVarK, (o8n) null, 0, new vse0(k4q0Var, (lnm) null, (byte) 6), 3);
        }
    }

    public mg5(bql1 bql1Var, sn40 sn40Var, q8n q8nVar) {
        llm llmVarH = us71.h(q8nVar);
        this.b = llmVarH;
        fn31.T(llmVarH, (o8n) null, 0, new gqj1(sn40Var, bql1Var, (lnm) null, (byte) 18), 3);
    }

    public mg5(zwz0 zwz0Var, kly0 kly0Var, hb4 hb4Var, q8n q8nVar) {
        llm llmVarH = us71.h(q8nVar);
        this.b = llmVarH;
        if (hb4Var.g()) {
            fn31.T(llmVarH, (o8n) null, 0, new x060(zwz0Var, kly0Var, (lnm) null, (byte) 10), 3);
        }
    }

    public mg5(lw21 lw21Var, kly0 kly0Var, q8n q8nVar) {
        llm llmVarH = us71.h(q8nVar);
        this.b = llmVarH;
        fn31.T(llmVarH, (o8n) null, 0, new hb1(lw21Var, kly0Var, null, (byte) 16), 3);
    }

    public mg5(oab1 oab1Var, q8n q8nVar, dt0 dt0Var) {
        llm llmVarH = us71.h(q8nVar);
        this.b = llmVarH;
        fn31.T(llmVarH, (o8n) null, 0, new og5(dt0Var, this, oab1Var, (lnm) null), 3);
    }
}
