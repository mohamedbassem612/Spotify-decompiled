package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tq3 extends hr3 {
    public final bx51 a;
    public final Map b;

    public tq3(bx51 bx51Var, Map map) {
        this.a = bx51Var;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tq3)) {
            return false;
        }
        tq3 tq3Var = (tq3) obj;
        return this.a == tq3Var.a && u890.j(this.b, tq3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
