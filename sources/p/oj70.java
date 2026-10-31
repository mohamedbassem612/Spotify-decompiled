package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class oj70 implements yt90 {
    public final /* synthetic */ byte a = 0;
    public final c9c0 b;
    public final llm c;
    public final Object d;
    public Object e;

    public oj70(zwz0 zwz0Var, g5s g5sVar, c9c0 c9c0Var, q8n q8nVar) {
        this.d = zwz0Var;
        this.e = g5sVar;
        this.b = c9c0Var;
        this.c = i3a.k(q8nVar);
    }

    public final void start() {
        byte b = this.a;
        llm llmVar = this.c;
        switch (b) {
            case 0:
                this.e = fn31.T(llmVar, (o8n) null, 0, new j020(this, null, (byte) 28), 3);
                break;
            default:
                fn31.T(llmVar, (o8n) null, 0, new i7u0(this, null, (byte) 4), 3);
                break;
        }
    }

    public final void stop() {
        switch (this.a) {
            case 0:
                xab1 xab1Var = (xab1) this.e;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                ((z1s) this.d).j.a();
                break;
            default:
                op71.q(this.c.a, (CancellationException) null);
                break;
        }
    }

    public oj70(z1s z1sVar, c9c0 c9c0Var, q8n q8nVar) {
        this.d = z1sVar;
        this.b = c9c0Var;
        this.c = us71.h(q8nVar);
    }
}
