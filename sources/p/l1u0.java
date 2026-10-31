package p;

import android.app.PendingIntent;
import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class l1u0 implements BiFunction {
    public final /* synthetic */ k1u0 a;
    public final /* synthetic */ m1u0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Bundle d;

    public l1u0(k1u0 k1u0Var, m1u0 m1u0Var, String str, Bundle bundle) {
        this.a = k1u0Var;
        this.b = m1u0Var;
        this.c = str;
        this.d = bundle;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        PendingIntent pendingIntent;
        PendingIntent pendingIntentA;
        j1u0 j1u0Var = (j1u0) obj2;
        k1u0 k1u0Var = j1u0Var != null ? j1u0Var.a : null;
        k1u0 k1u0Var2 = this.a;
        if (u890.j(k1u0Var, k1u0Var2)) {
            return j1u0Var;
        }
        m1u0 m1u0Var = this.b;
        String str = this.c;
        try {
            pendingIntentA = m1u0Var.a(str, str.hashCode(), this.d);
            m1u0Var.c();
        } catch (SecurityException e) {
            Logger.b("PendingIntent creation failed for %s (%s), degrading", new Object[]{str, e.getMessage()});
            ConcurrentHashMap concurrentHashMap = m1u0Var.d;
            if (m1u0.e.contains(str)) {
                pendingIntent = (PendingIntent) concurrentHashMap.get(str);
                if (pendingIntent == null) {
                    throw e;
                }
            } else if (j1u0Var != null) {
                pendingIntentA = j1u0Var.b;
            } else {
                pendingIntent = (PendingIntent) concurrentHashMap.get(str);
                if (pendingIntent == null) {
                    throw e;
                }
            }
            pendingIntentA = pendingIntent;
        }
        return new j1u0(k1u0Var2, pendingIntentA);
    }
}
