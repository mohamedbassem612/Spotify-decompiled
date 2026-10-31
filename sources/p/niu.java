package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class niu implements jn60, rfu {
    public final String a;
    public final String b;
    public final yz21 c;
    public final viu d;

    public niu(String str, String str2, yz21 yz21Var, viu viuVar) {
        this.a = str;
        this.b = str2;
        this.c = yz21Var;
        this.d = viuVar;
    }

    @Override // p.rfu
    public final String c() {
        return this.d.c.getId();
    }

    public final List d(op80 op80Var) {
        viu viuVar = this.d;
        ji0 ji0Var = viuVar.b;
        return Collections.singletonList(new lgu(this.a, op80Var, new zgu(this.b, zgo1.u(viuVar.c), ji0Var, ji0Var.i, ji0Var.Z.getValue(), ji0Var.W0, ji0Var.Y0.a)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof niu)) {
            return false;
        }
        niu niuVar = (niu) obj;
        return this.a.equals(niuVar.a) && u890.j(this.b, niuVar.b) && u890.j(this.c, niuVar.c) && this.d.equals(niuVar.d);
    }

    public final yz21 f() {
        return this.c;
    }

    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.d.hashCode() + bb00.g(this.c, cy30.d(this.a.hashCode() * 31, 961, this.b), 31);
    }
}
