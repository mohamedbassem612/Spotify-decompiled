package p;

import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zfo0 {
    public final LinkedHashMap a;
    public final List b;

    public zfo0(LinkedHashMap linkedHashMap, List list) {
        this.a = linkedHashMap;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zfo0)) {
            return false;
        }
        zfo0 zfo0Var = (zfo0) obj;
        return this.a.equals(zfo0Var.a) && this.b.equals(zfo0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
