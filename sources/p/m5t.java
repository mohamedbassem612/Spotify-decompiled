package p;

import android.view.Choreographer;
import android.view.ViewTreeObserver;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class m5t implements ViewTreeObserver.OnPreDrawListener {
    public static final Field a;

    static {
        Field declaredField = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
        a = declaredField;
        declaredField.setAccessible(true);
    }
}
