package p;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@o661
public final class o9f0 {
    public static final n9f0 Companion = new n9f0();
    public static final znb0[] b = {dm5.S(2, i0f0.t)};
    public final Map a;

    public /* synthetic */ o9f0(int i, Map map) {
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
        return (obj instanceof o9f0) && u890.j(this.a, ((o9f0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public o9f0() {
        this.a = new LinkedHashMap();
    }
}
