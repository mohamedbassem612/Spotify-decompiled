package p;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class dhn {
    public static final Set a = Collections.newSetFromMap(new WeakHashMap());
    public static boolean b;

    public static final void a(Object obj, Throwable th) {
        if (b) {
            a.add(obj);
            wf10 wf10Var = wf10.a;
            if (wgi1.c()) {
                dgo1.h(th);
                v9p1.y(th, cp80.e).b();
            }
        }
    }
}
