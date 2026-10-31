package p;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hz81 {
    public final zob1 a;
    public final LinkedHashMap b;
    public final Map c;
    public ven0 d;

    public hz81(zob1 zob1Var, LinkedHashMap linkedHashMap, Map map) {
        this.a = zob1Var;
        this.b = linkedHashMap;
        this.c = map;
    }

    public final void a(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(13131765);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            this.d = f4p1.k(this.a, (iac0) null, x340Var, 7);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gz81(this, i, (byte) 0);
        }
    }
}
