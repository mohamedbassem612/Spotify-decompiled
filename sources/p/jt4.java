package p;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jt4 implements d7a0 {
    public final Set a = Collections.newSetFromMap(new ConcurrentHashMap());

    public final void b(uj30 uj30Var) {
        for (b7a0 b7a0Var : this.a) {
            b7a0Var.b++;
            if (uj30Var.d) {
                b7a0Var.c++;
            }
        }
    }
}
