package p;

import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class oub1 {
    public final String a;
    public final j380 b;
    public final j380 c;
    public final j380 d;

    public oub1(String str, HashMap map, HashMap map2, HashMap map3) {
        this.a = str;
        this.b = j380.c(map);
        this.c = j380.c(map2);
        this.d = j380.c(map3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oub1)) {
            return false;
        }
        oub1 oub1Var = (oub1) obj;
        return Objects.equals(this.a, oub1Var.a) && this.b.equals(oub1Var.b) && this.c.equals(oub1Var.c) && this.d.equals(oub1Var.d);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d);
    }
}
