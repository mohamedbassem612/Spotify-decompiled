package p;

import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class y9t extends nba {
    public boolean q;

    static {
        ucp1.o("1.8.0");
    }

    public y9t(ruk rukVar, x610 x610Var, lxh0 lxh0Var, q881 q881Var, g510 g510Var, xap xapVar, oyr oyrVar, k811 k811Var, r8l r8lVar, yqg yqgVar, xgb0 xgb0Var, u210 u210Var, oih0 oih0Var, uic uicVar) {
        super(rukVar, x610Var, lxh0Var, q881Var, g510Var, oyrVar, k811Var, r8lVar, yqgVar, xgb0Var, u210Var, oih0Var, uicVar);
        String str = rukVar.b.c;
        if (str != null) {
            ucp1.o(str);
        }
        ((nba) this).l.b(xapVar.d(rukVar.a).subscribe(new cfs(this, (byte) 10)));
    }

    public final Set a() {
        return this.q ? w7x.a : ((nba) this).a.e();
    }

    public final void c(vsr0 vsr0Var, Bundle bundle, iu30 iu30Var) {
        if (!this.q) {
            super.c(vsr0Var, bundle, iu30Var);
            return;
        }
        ((nba) this).n = ((nba) this).h.b();
        iu30Var.invoke((Object) null);
        Logger.d("Failed to load children, package name is denied.", new Object[0]);
    }

    public final void d(String str, Bundle bundle, String str2, q1m q1mVar, iu30 iu30Var, vu30 vu30Var, Function0 function0) {
        if (!this.q) {
            super.d(str, bundle, str2, q1mVar, iu30Var, vu30Var, function0);
            return;
        }
        try {
            vu30Var.invoke(pih0.a, "App not allowed.");
        } catch (Throwable th) {
            Logger.d("Could not return value through callback, %s", new Object[]{th.getMessage()});
        }
    }

    public final boolean k() {
        return !this.q && ((nba) this).p;
    }
}
