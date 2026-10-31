package p;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class tik1 extends u890 {
    public static boolean j = true;
    public static boolean k = true;
    public static boolean l = true;
    public static boolean m = true;

    public void L(View view, int i, int i2, int i3, int i4) {
        if (l) {
            try {
                g961.e(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                l = false;
            }
        }
    }

    public void M(View view, int i) {
        if (Build.VERSION.SDK_INT != 28) {
            if (m) {
                try {
                    g961.g(view, i);
                    return;
                } catch (NoSuchMethodError unused) {
                    m = false;
                    return;
                }
            }
            return;
        }
        if (!u890.i) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                u890.h = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
            }
            u890.i = true;
        }
        Field field = u890.h;
        if (field != null) {
            try {
                u890.h.setInt(view, (field.getInt(view) & (-13)) | i);
            } catch (IllegalAccessException unused3) {
            }
        }
    }

    public void N(View view, Matrix matrix) {
        if (j) {
            try {
                g961.n(view, matrix);
            } catch (NoSuchMethodError unused) {
                j = false;
            }
        }
    }

    public void O(ViewGroup viewGroup, Matrix matrix) {
        if (k) {
            try {
                g961.o(viewGroup, matrix);
            } catch (NoSuchMethodError unused) {
                k = false;
            }
        }
    }
}
