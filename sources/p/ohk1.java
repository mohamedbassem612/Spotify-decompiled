package p;

import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ohk1 extends phk1 {
    public boolean k;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.phk1
    public final boolean d(float f, long j, View view, p321 p321Var) {
        Method method;
        if (view instanceof MotionLayout) {
            ((MotionLayout) view).setProgress(b(f, j, view, p321Var));
        } else {
            if (this.k) {
                return false;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.k = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(b(f, j, view, p321Var)));
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            }
        }
        return this.h;
    }
}
