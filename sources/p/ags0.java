package p;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ags0 {
    public final yqg a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public ags0(yqg yqgVar) {
        this.a = yqgVar;
    }

    public final boolean a(String str) {
        ConcurrentHashMap concurrentHashMap = this.b;
        Long l = (Long) concurrentHashMap.get(str);
        if (l == null) {
            return false;
        }
        if (this.a.b() - l.longValue() <= 120000) {
            return true;
        }
        concurrentHashMap.remove(str);
        return false;
    }
}
