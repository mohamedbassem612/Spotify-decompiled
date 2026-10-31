package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nwn0 implements qfb0 {
    public final LinkedHashMap a = new LinkedHashMap();
    public a8r0 b;

    @Override // p.qfb0
    public final a8r0 a(rj41 rj41Var) {
        a8r0 a8r0Var;
        synchronized (this) {
            try {
                a8r0Var = rj41Var == null ? this.b : (a8r0) this.a.get(rj41Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        return a8r0Var;
    }

    public final void b(rj41 rj41Var, a8r0 a8r0Var) {
        synchronized (this) {
            this.a.put(rj41Var, a8r0Var);
            this.b = a8r0Var;
        }
    }
}
