package p;

import android.app.NotificationManager;
import android.content.Context;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rd30 {
    public final Context a;
    public final NotificationManager b;
    public final kqi0 c;
    public final wd30 d;
    public final ow3 e;
    public final Scheduler f;
    public final q8n g;
    public final LinkedHashMap h = new LinkedHashMap();

    public rd30(Context context, NotificationManager notificationManager, kqi0 kqi0Var, wd30 wd30Var, ow3 ow3Var, Scheduler scheduler, q8n q8nVar) {
        this.a = context;
        this.b = notificationManager;
        this.c = kqi0Var;
        this.d = wd30Var;
        this.e = ow3Var;
        this.f = scheduler;
        this.g = q8nVar;
    }

    public final pd30 a(qd30 qd30Var) {
        LinkedHashMap linkedHashMap = this.h;
        Object pd30Var = linkedHashMap.get(qd30Var);
        if (pd30Var == null) {
            pd30Var = new pd30(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
        }
        pd30 pd30Var2 = (pd30) pd30Var;
        if (!linkedHashMap.containsKey(qd30Var)) {
            linkedHashMap.put(qd30Var, pd30Var2);
        }
        return pd30Var2;
    }
}
