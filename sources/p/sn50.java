package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class sn50 {
    public final pr31 a;
    public final String b;
    public final ArrayList c;
    public final iwh0 d;

    public sn50(pr31 pr31Var, String str, ArrayList arrayList, iwh0 iwh0Var) {
        this.a = pr31Var;
        this.b = str;
        this.c = arrayList;
        this.d = iwh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sn50)) {
            return false;
        }
        sn50 sn50Var = (sn50) obj;
        return this.a.equals(sn50Var.a) && u890.j(this.b, sn50Var.b) && this.c.equals(sn50Var.c) && u890.j(this.d, sn50Var.d);
    }

    public final int hashCode() {
        int iF = p3d1.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
        iwh0 iwh0Var = this.d;
        return iF + (iwh0Var == null ? 0 : iwh0Var.hashCode());
    }
}
