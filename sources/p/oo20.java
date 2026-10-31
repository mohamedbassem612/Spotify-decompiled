package p;

import android.os.Build;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class oo20 {
    public static final ConcurrentHashMap a;
    public static final CopyOnWriteArraySet b;

    static {
        int i = Build.VERSION.SDK_INT;
        a = i >= 36 ? new ConcurrentHashMap() : null;
        b = i >= 36 ? new CopyOnWriteArraySet() : null;
    }

    public static final boolean a() {
        return hg.d();
    }
}
