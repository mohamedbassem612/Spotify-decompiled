package p;

import android.app.ActivityManager;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class f2u implements xgn {
    public final /* synthetic */ byte a;
    public final Serializable b;

    public f2u(ActivityManager activityManager) {
        this.a = (byte) 1;
        this.b = new z8i0(activityManager, (byte) 12);
    }

    public final List a() {
        gsi0 m231Var;
        byte b = this.a;
        z8i0 z8i0Var = this.b;
        switch (b) {
            case 0:
                return Collections.singletonList(new wen((String) z8i0Var));
            default:
                try {
                    m231Var = (gsi0) z8i0Var.invoke();
                    break;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                if (m231Var instanceof m231) {
                    m231Var = null;
                }
                gsi0 gsi0Var = m231Var;
                return gsi0Var == null ? z6x.a : p7h.M(new ugn[]{new dfn(gsi0Var.a), new tfn(gsi0Var.b), new ngn(gsi0Var.c)});
        }
    }

    public f2u() {
        this.a = (byte) 0;
        this.b = c2u.a.toString();
    }
}
