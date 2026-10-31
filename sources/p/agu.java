package p;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class agu implements Executor {
    public final q8n a;

    public agu(q8n q8nVar) {
        this.a = q8nVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        q8n q8nVar = this.a;
        o6x o6xVar = o6x.a;
        if (hr80.y(q8nVar, o6xVar)) {
            hr80.x(q8nVar, o6xVar, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
