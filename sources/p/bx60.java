package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bx60 implements yt90 {
    public final /* synthetic */ byte a = 1;
    public final Object b;
    public final Object c;

    public bx60(hur hurVar, q8n q8nVar) {
        this.b = hurVar;
        this.c = i3a.k(q8nVar);
    }

    public final void start() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                fn31.T((llm) obj, (o8n) null, 0, new j020(this, (lnm) null, (byte) 25), 3);
                break;
            default:
                ((bos) this.b).a.add((t5a0) obj);
                break;
        }
    }

    public final void stop() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                op71.q(((llm) obj).a, (CancellationException) null);
                break;
            default:
                ((bos) this.b).a.remove((t5a0) obj);
                break;
        }
    }

    public bx60(bos bosVar, t5a0 t5a0Var) {
        this.b = bosVar;
        this.c = t5a0Var;
    }
}
