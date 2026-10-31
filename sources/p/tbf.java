package p;

import android.os.Bundle;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tbf extends rxd1 {
    public final ujo0 a;
    public final vxi0 b;
    public final String c;
    public final khh0 d;
    public final pbf e;
    public final pbf f;
    public final Bundle g;
    public final cvy0 h;
    public final List i;

    public tbf(ujo0 ujo0Var, vxi0 vxi0Var, String str, khh0 khh0Var, pbf pbfVar, pbf pbfVar2, Bundle bundle, cvy0 cvy0Var, List list) {
        this.a = ujo0Var;
        this.b = vxi0Var;
        this.c = str;
        this.d = khh0Var;
        this.e = pbfVar;
        this.f = pbfVar2;
        this.g = bundle;
        this.h = cvy0Var;
        this.i = list;
    }

    public final cvy0 a() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tbf) {
            tbf tbfVar = (tbf) obj;
            if (u890.j(this.a, tbfVar.a) && u890.j(this.b, tbfVar.b) && u890.j(this.c, tbfVar.c) && u890.j(this.d, tbfVar.d) && this.e == tbfVar.e && this.f == tbfVar.f && this.g.equals(tbfVar.g) && this.h.equals(tbfVar.h) && this.i.equals(tbfVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iD = cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        khh0 khh0Var = this.d;
        return f4i1.b((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((iD + (khh0Var == null ? 0 : khh0Var.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.i);
    }
}
