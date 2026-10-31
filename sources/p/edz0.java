package p;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class edz0 {
    public final ai9 a;
    public final Map b = Collections.synchronizedMap(new IdentityHashMap());
    public final AtomicReference c = new AtomicReference();
    public final AtomicBoolean d = new AtomicBoolean(false);

    public edz0(ai9 ai9Var) {
        this.a = ai9Var;
    }
}
