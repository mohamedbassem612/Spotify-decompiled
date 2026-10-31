package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class a011 implements j011 {
    public final Map a;

    public a011(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a011) && this.a.equals(((a011) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
