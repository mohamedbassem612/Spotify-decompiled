package p;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bej0 {
    public final Map a;
    public final boolean b;
    public final boolean c;

    public bej0(Map map, boolean z, boolean z2) {
        this.a = map;
        this.b = z;
        this.c = z2;
    }

    public static bej0 a(bej0 bej0Var, LinkedHashMap linkedHashMap, boolean z, boolean z2, int i) {
        Map map = linkedHashMap;
        if ((i & 1) != 0) {
            map = bej0Var.a;
        }
        if ((i & 2) != 0) {
            z = bej0Var.b;
        }
        if ((i & 4) != 0) {
            z2 = bej0Var.c;
        }
        return new bej0(map, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bej0)) {
            return false;
        }
        bej0 bej0Var = (bej0) obj;
        return u890.j(this.a, bej0Var.a) && this.b == bej0Var.b && this.c == bej0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
