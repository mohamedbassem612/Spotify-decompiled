package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xu00 {
    public final Map a;

    public xu00(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xu00) && u890.j(this.a, ((xu00) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
