package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class u9q0 {
    public final ArrayList a;
    public final String b;
    public final tv80 c;

    public u9q0(ArrayList arrayList, String str, tv80 tv80Var) {
        this.a = arrayList;
        this.b = str;
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u9q0)) {
            return false;
        }
        u9q0 u9q0Var = (u9q0) obj;
        return this.a.equals(u9q0Var.a) && this.b.equals(u9q0Var.b) && u890.j(this.c, u9q0Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        tv80 tv80Var = this.c;
        return iD + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
