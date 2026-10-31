package p;

import android.app.Application;
import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rj20 {
    public final wi20 a;
    public final lj61 b;

    public rj20(wi20 wi20Var, lj61 lj61Var, o8n o8nVar, tf61 tf61Var) {
        this.a = wi20Var;
        this.b = lj61Var;
        wi20Var.a();
        Context applicationContext = wi20Var.a.getApplicationContext();
        if (!(applicationContext instanceof Application)) {
            applicationContext.getClass().toString();
        } else {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(ij61.b);
            c921.y(smo1.e(o8nVar), (o8n) null, 0, new xtz(this, o8nVar, tf61Var, (lnm) null, (byte) 3), 3);
        }
    }
}
