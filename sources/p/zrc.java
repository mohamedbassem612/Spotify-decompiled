package p;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@o661
public final class zrc {
    public static final yrc Companion = new yrc();
    public static final znb0[] b = {dm5.S(2, xrc.b)};
    public final Map a;

    public /* synthetic */ zrc(int i, Map map) {
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
        return (obj instanceof zrc) && u890.j(this.a, ((zrc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public zrc() {
        this.a = new LinkedHashMap();
    }
}
