package p;

import app.p000rive.semantics.SemanticState;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yre0 implements bhn {
    public final zre0 a;

    public yre0(zre0 zre0Var) {
        this.a = zre0Var;
    }

    @Override // p.chn
    public final wk21 a() {
        this.a.a.getClass();
        StringBuilder sb = new StringBuilder(SemanticState.Modal);
        zre0 zre0Var = this.a;
        synchronized (zre0Var.b) {
            try {
                Iterator it = zre0Var.a.a.iterator();
                while (it.hasNext()) {
                    ((nse0) it.next()).a(sb);
                    sb.append('\n');
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return new wk21("LogDog output", "Logs from the last 10 seconds or the last 500 lines, whichever limit is reached first.", sb.toString());
    }
}
