package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fxe implements nye {
    public final String a;
    public final List b;
    public final ou80 c;

    public fxe(String str, List list, ou80 ou80Var) {
        this.a = str;
        this.b = list;
        this.c = ou80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxe)) {
            return false;
        }
        fxe fxeVar = (fxe) obj;
        return u890.j(this.a, fxeVar.a) && this.b.equals(fxeVar.b) && u890.j(this.c, fxeVar.c);
    }

    public final int hashCode() {
        int iB = f4i1.b(this.a.hashCode() * 31, 31, this.b);
        ou80 ou80Var = this.c;
        return iB + (ou80Var == null ? 0 : ou80Var.a.hashCode());
    }
}
