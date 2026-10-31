package p;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@o661
public final class tfj0 {
    public static final sfj0 Companion = new sfj0();
    public static final znb0[] b = {dm5.S(2, z7i0.Q0)};
    public final Map a;

    public /* synthetic */ tfj0(int i, Map map) {
        if ((i & 1) == 0) {
            this.a = new LinkedHashMap();
        } else {
            this.a = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tfj0) && u890.j(this.a, ((tfj0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public tfj0() {
        this.a = new LinkedHashMap();
    }
}
