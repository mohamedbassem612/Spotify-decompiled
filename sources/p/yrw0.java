package p;

import android.content.Context;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yrw0 implements wwn0 {
    public final Context a;

    public yrw0(Context context) {
        this.a = context;
    }

    public final void a(rj41 rj41Var, hwn0 hwn0Var, hwn0 hwn0Var2, nsn0 nsn0Var, List list, List list2, Long l, Set set, String str) {
        String str2;
        y6r0 y6r0Var = hwn0Var.a;
        if (y6r0Var == null || (str2 = y6r0Var.a) == null) {
            return;
        }
        zrw0 zrw0Var = bsw0.a;
        ou80 ou80Var = (ou80) o7h.C0(list2);
        bsw0.a = new zrw0(str2, ou80Var != null ? ou80Var.a : null);
        bsw0.a(this.a, c2u.a);
    }
}
