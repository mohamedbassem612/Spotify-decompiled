package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@o661
public final class ju71 {
    public static final iu71 Companion = new iu71();
    public static final znb0[] b = {dm5.S(2, da71.V0)};
    public final Map a;

    public /* synthetic */ ju71(int i, Map map) {
        if (1 == (i & 1)) {
            this.a = map;
        } else {
            o6p1.t(i, 1, hu71.a.getDescriptor());
            throw null;
        }
    }

    public final Map a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ju71) && u890.j(this.a, ((ju71) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public ju71(Map map) {
        this.a = map;
    }
}
