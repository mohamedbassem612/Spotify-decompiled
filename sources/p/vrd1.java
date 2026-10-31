package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vrd1 {
    public final Map a;

    public vrd1(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vrd1) && this.a.equals(((vrd1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
