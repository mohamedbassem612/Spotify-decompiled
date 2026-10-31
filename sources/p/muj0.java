package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class muj0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ llm b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ muj0(llm llmVar, iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.b = llmVar;
        this.c = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        iu30 iu30Var = this.c;
        llm llmVar = this.b;
        switch (b) {
            case 0:
                return fn31.q(llmVar, (o8n) null, 0, new w73(iu30Var, (lnm) null, (byte) 8), 3);
            default:
                return fn31.q(llmVar, (o8n) null, 0, new w73(iu30Var, (lnm) null, (byte) 9), 3);
        }
    }
}
