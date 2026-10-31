package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@o661
public final class xa10 {
    public static final wa10 Companion = new wa10();
    public static final znb0[] b = {dm5.S(2, ny00.g)};
    public final Map a;

    public /* synthetic */ xa10(int i, Map map) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xa10) && u890.j(this.a, ((xa10) obj).a);
    }

    public final int hashCode() {
        Map map = this.a;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }
}
