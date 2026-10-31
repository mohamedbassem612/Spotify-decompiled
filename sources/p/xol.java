package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xol implements tpl {
    public final xu50 a;
    public final List b;
    public final String c;

    public xol(xu50 xu50Var, List list, String str) {
        this.a = xu50Var;
        this.b = list;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xol)) {
            return false;
        }
        xol xolVar = (xol) obj;
        return this.a.equals(xolVar.a) && u890.j(this.b, xolVar.b) && this.c.equals(xolVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }
}
