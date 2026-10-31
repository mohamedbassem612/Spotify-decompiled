package p;

import java.util.Collections;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class y2a0 implements t2a0 {
    public final qd9 a;
    public final gq90 b;
    public final hq90 c;
    public final zwz0 d;
    public final b0a0 e;
    public final llm f;
    public xab1 g;
    public be9 h;

    public y2a0(qd9 qd9Var, gq90 gq90Var, hq90 hq90Var, zwz0 zwz0Var, b0a0 b0a0Var, q8n q8nVar) {
        this.a = qd9Var;
        this.b = gq90Var;
        this.c = hq90Var;
        this.d = zwz0Var;
        this.e = b0a0Var;
        this.f = us71.h(q8nVar);
    }

    public final void a(String str) {
        be9 be9Var = str != null ? new be9(r2a0.d.a.getUuid(), str.getBytes(nne.a)) : null;
        if (u890.j(be9Var, this.h)) {
            return;
        }
        qd9 qd9Var = this.a;
        p900 p900Var = qd9Var.a;
        be9 be9Var2 = this.h;
        if (!u890.j(be9Var2, be9Var)) {
            if (be9Var2 == null || be9Var == null || !u890.j(be9Var2.a, be9Var.a)) {
                if (be9Var != null) {
                    qd9Var.a(Collections.singleton(be9Var));
                }
                if (be9Var2 != null) {
                    p900Var.accept(new ld9(Collections.singleton(be9Var2)));
                }
            } else {
                p900Var.accept(new ld9(Collections.singleton(be9Var2)));
                qd9Var.a(Collections.singleton(be9Var));
            }
        }
        this.h = be9Var;
    }

    public final void start() {
        stop();
        this.g = fn31.T(this.f, (o8n) null, 0, new bu(this, (lnm) null, (byte) 23), 3);
    }

    public final void stop() {
        xab1 xab1Var = this.g;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.g = null;
        fn31.T(this.f, (o8n) null, 0, new n3s(this, (lnm) null, (byte) 27), 3);
    }
}
