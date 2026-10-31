package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ja30 {
    public final List a;

    public ja30(ga30... ga30VarArr) {
        for (ga30 ga30Var : ga30VarArr) {
            String strB = ga30Var.b();
            int i = 0;
            for (ga30 ga30Var2 : ga30VarArr) {
                if (u890.j(ga30Var2.b(), strB)) {
                    i++;
                }
            }
            if (i != 1) {
                ArrayList arrayList = new ArrayList();
                for (ga30 ga30Var3 : ga30VarArr) {
                    if (u890.j(ga30Var3.b(), strB)) {
                        arrayList.add(ga30Var3);
                    }
                }
                rf80.a("'" + strB + "' must be unique. Actual [" + arrayList + "]");
            }
        }
        this.a = f46.Q0(ga30VarArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ja30) {
            return this.a.equals(((ja30) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Settings(settings=" + this.a + ")";
    }
}
