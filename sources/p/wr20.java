package p;

import com.spotify.mobius.Connection;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wr20 implements Connection {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bpb1 b;
    public final /* synthetic */ llm c;

    public wr20(bpb1 bpb1Var, y1u0 y1u0Var, llm llmVar) {
        this.a = (byte) 2;
        this.b = bpb1Var;
        this.c = llmVar;
    }

    public final void accept(Object obj) {
        boolean z;
        byte b = this.a;
        bpb1 bpb1Var = this.b;
        switch (b) {
            case 0:
                bpb1Var.l(obj);
                break;
            case 1:
                bpb1Var.l(((tx00) obj).getEntityUri());
                break;
            default:
                rx00 rx00Var = (tx00) obj;
                String entityUri = rx00Var.getEntityUri();
                if (rx00Var instanceof sx00) {
                    z = ((sx00) rx00Var).e;
                } else if (rx00Var instanceof rx00) {
                    z = rx00Var.f;
                } else if (!(rx00Var instanceof qx00)) {
                    eg.o();
                } else {
                    z = false;
                }
                bpb1Var.m((Object) null, new mmr0(entityUri, Boolean.valueOf(z)));
                break;
        }
    }

    public final void dispose() {
        byte b = this.a;
        llm llmVar = this.c;
        switch (b) {
            case 0:
                op71.z(llmVar.a).d((CancellationException) null);
                break;
            case 1:
                faa0 faa0VarA = llmVar.a.A(fkj0.W0);
                if (faa0VarA != null) {
                    faa0VarA.d((CancellationException) null);
                }
                break;
            default:
                faa0 faa0VarA2 = llmVar.a.A(fkj0.W0);
                if (faa0VarA2 != null) {
                    faa0VarA2.d((CancellationException) null);
                }
                break;
        }
    }

    public /* synthetic */ wr20(bpb1 bpb1Var, llm llmVar, byte b) {
        this.a = b;
        this.b = bpb1Var;
        this.c = llmVar;
    }
}
