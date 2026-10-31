package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class d0m1 implements g0m1 {
    public final Map a;

    public d0m1(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0m1) && this.a.equals(((d0m1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
