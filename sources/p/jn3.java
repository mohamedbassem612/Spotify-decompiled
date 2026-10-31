package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jn3 extends qxd0 {
    public final Map d;

    public jn3(Map map) {
        this.d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jn3) && u890.j(this.d, ((jn3) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
