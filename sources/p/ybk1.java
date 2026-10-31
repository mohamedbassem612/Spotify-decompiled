package p;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ybk1 {
    public final rtw0 a = new rtw0((byte) 20);
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashSet c = new LinkedHashSet();
    public volatile boolean d;

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                f4i1.h(autoCloseable);
            } catch (Exception e) {
                eg.j(e);
            }
        }
    }
}
