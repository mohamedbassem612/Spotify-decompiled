package p;

import android.content.Context;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class x4q0 {
    public static final x4q0 a = new x4q0();
    public static final Set b = f46.S0(new String[]{"fb_mobile_purchase", "StartTrial", "Subscribe"});

    public static final boolean a() {
        boolean zBooleanValue;
        Set set = dhn.a;
        if (set.contains(x4q0.class)) {
            return false;
        }
        try {
            Context contextA = wf10.a();
            w0h1.H();
            if (contextA.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false) || fpi1.v()) {
                return false;
            }
            u321 u321Var = u321.b;
            if (set.contains(u321.class)) {
                zBooleanValue = false;
            } else {
                try {
                    Boolean boolValueOf = u321.c;
                    if (boolValueOf == null) {
                        boolValueOf = Boolean.valueOf(u321.b.a(wf10.a()) != null);
                        u321.c = boolValueOf;
                    }
                    zBooleanValue = boolValueOf.booleanValue();
                } catch (Throwable th) {
                    dhn.a(u321.class, th);
                    zBooleanValue = false;
                }
            }
            return zBooleanValue;
        } catch (Throwable th2) {
            dhn.a(x4q0.class, th2);
            return false;
        }
    }
}
