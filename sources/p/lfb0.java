package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lfb0 implements uv80 {
    public final Object a = new Object();
    public final LinkedHashMap b = new LinkedHashMap();
    public volatile tv80 c;

    @Override // p.uv80
    public final void b(rj41 rj41Var, w7h1 w7h1Var, tv80 tv80Var) {
        synchronized (this.a) {
            this.b.put(rj41Var, tv80Var);
            this.c = tv80Var;
        }
    }
}
