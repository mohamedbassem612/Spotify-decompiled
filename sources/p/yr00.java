package p;

import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yr00 implements Connection {
    public final /* synthetic */ byte a = 3;
    public final llm b;

    public yr00(qn qnVar, Consumer consumer, byte b) {
        llm llmVarE = smo1.e(flo1.l(guo1.B(), (q8n) qnVar.c));
        this.b = llmVarE;
        fn31.T(llmVarE, (o8n) null, 0, new d7i0(qnVar, consumer, (lnm) null, (byte) 8), 3);
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                break;
        }
    }

    public final void dispose() {
        byte b = this.a;
        llm llmVar = this.b;
        switch (b) {
            case 0:
                faa0 faa0VarA = llmVar.a.A(fkj0.W0);
                if (faa0VarA != null) {
                    faa0VarA.d((CancellationException) null);
                }
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
            default:
                smo1.p(llmVar, (CancellationException) null);
                break;
        }
    }

    public yr00(qn qnVar, Consumer consumer) {
        llm llmVarE = smo1.e(flo1.l(guo1.B(), (q8n) qnVar.c));
        this.b = llmVarE;
        fn31.T(llmVarE, (o8n) null, 0, new q4d0(qnVar, consumer, (lnm) null, (byte) 3), 3);
    }

    public yr00(iff1 iff1Var, Consumer consumer) {
        llm llmVarE = smo1.e(iff1Var.c);
        this.b = llmVarE;
        fn31.T(llmVarE, (o8n) null, 0, new pec1(iff1Var, consumer, (lnm) null, (byte) 18), 3);
    }

    public yr00(iff1 iff1Var, Consumer consumer, byte b) {
        llm llmVarE = smo1.e(iff1Var.c);
        this.b = llmVarE;
        fn31.T(llmVarE, (o8n) null, 0, new pec1(iff1Var, consumer, (lnm) null, (byte) 21), 3);
    }

    public yr00(llm llmVar) {
        this.b = llmVar;
    }
}
