package p;

import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bfk1 extends cfk1 {
    public boolean f;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.cfk1
    public final void c(View view, float f) {
        Method method;
        if (view instanceof MotionLayout) {
            ((MotionLayout) view).setProgress(a(f));
            return;
        }
        if (this.f) {
            return;
        }
        try {
            method = view.getClass().getMethod("setProgress", Float.TYPE);
        } catch (NoSuchMethodException unused) {
            this.f = true;
            method = null;
        }
        if (method != null) {
            try {
                method.invoke(view, Float.valueOf(a(f)));
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
    }
}
