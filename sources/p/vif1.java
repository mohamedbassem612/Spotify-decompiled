package p;

import android.os.Build;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class vif1 {
    public static final AtomicBoolean a = new AtomicBoolean(false);

    public static void a() {
        if (Build.VERSION.SDK_INT < 29 || !a.get()) {
            return;
        }
        wif1.a.a("GlanceAppWidget::update", 0);
    }

    public static void b() {
        if (Build.VERSION.SDK_INT < 29 || !a.get()) {
            return;
        }
        wif1.a.b("GlanceAppWidget::update", 0);
    }
}
