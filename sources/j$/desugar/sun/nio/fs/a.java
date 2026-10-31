package j$.desugar.sun.nio.fs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class a {
    public Set a;
    public Map b;
    public boolean c;

    public final void a(String str, Object obj) {
        ((HashMap) this.b).put(str, obj);
    }

    public final boolean b(String str) {
        return this.c || ((HashSet) this.a).contains(str);
    }
}
