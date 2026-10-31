package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class s5k implements ez00 {
    public final String a;
    public final Map b;

    public s5k(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s5k)) {
            return false;
        }
        s5k s5kVar = (s5k) obj;
        return this.a.equals(s5kVar.a) && this.b.equals(s5kVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
