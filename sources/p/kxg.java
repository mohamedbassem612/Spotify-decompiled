package p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kxg implements wwn0 {
    public final lxg a;

    public kxg(lxg lxgVar) {
        this.a = lxgVar;
    }

    @Override // p.wwn0
    public final void a(rj41 rj41Var, hwn0 hwn0Var, hwn0 hwn0Var2, nsn0 nsn0Var, List list, List list2, Long l, Set set, String str) {
        gwn0 gwn0Var;
        String str2 = (hwn0Var2 == null || (gwn0Var = hwn0Var2.b) == null) ? null : gwn0Var.a;
        String str3 = hwn0Var.b.a;
        i94 i94Var = (i94) this.a;
        if (i94Var.e == null || u890.j(str2, str3)) {
            return;
        }
        if (str2 == null && u890.j(str3, "home")) {
            return;
        }
        if (str2 == null && u890.j(str3, "home-funkis")) {
            return;
        }
        i94Var.b("non_home_destination");
    }
}
