package p;

import android.hardware.SensorManager;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wwg {
    public static SensorManager c;
    public static lbk1 d;
    public static String e;
    public static volatile boolean h;
    public static final wwg a = new wwg();
    public static final mbk1 b = new mbk1();
    public static final AtomicBoolean f = new AtomicBoolean(true);
    public static final AtomicBoolean g = new AtomicBoolean(false);

    public static final String a() {
        if (dhn.a.contains(wwg.class)) {
            return null;
        }
        try {
            String str = e;
            if (str != null) {
                return str;
            }
            String string = UUID.randomUUID().toString();
            e = string;
            return string;
        } catch (Throwable th) {
            dhn.a(wwg.class, th);
            return null;
        }
    }
}
