package p;

import android.os.Bundle;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xh71 {
    public final dg30 a;
    public final qfb0 b;
    public final a1r0 c;
    public final q8n d;

    public xh71(dg30 dg30Var, qfb0 qfb0Var, a1r0 a1r0Var, q8n q8nVar) {
        this.a = dg30Var;
        this.b = qfb0Var;
        this.c = a1r0Var;
        this.d = q8nVar;
    }

    public static /* synthetic */ void b(xh71 xh71Var, wa71 wa71Var, Bundle bundle, xm71 xm71Var, tv80 tv80Var, List list, int i) {
        if ((i & 2) != 0) {
            bundle = Bundle.EMPTY;
        }
        Bundle bundle2 = bundle;
        if ((i & 16) != 0) {
            list = z6x.a;
        }
        xh71Var.a(wa71Var, bundle2, xm71Var, tv80Var, list);
    }

    public final void a(wa71 wa71Var, Bundle bundle, xm71 xm71Var, tv80 tv80Var, List list) {
        String str;
        String str2;
        n57.j(tv80Var != null, "Share sheet opened with a null interaction logging result. Please make sure to provide one.");
        k371 k371Var = new k371(wa71Var, bundle, xm71Var, list);
        String value = xm71Var.getValue();
        a8r0 a8r0VarA = this.b.a(rj41.MAIN);
        c921.y(cto1.q(this.a), this.d, 0, new i3y0(this, tv80Var, new ua71((a8r0VarA == null || (str2 = a8r0VarA.c) == null) ? "" : str2, (a8r0VarA == null || (str = a8r0VarA.b) == null) ? "" : str, value, k371Var, 0).a(), (lnm) null, (byte) 25), 2);
    }
}
