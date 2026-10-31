package p;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.DisplayCutout;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ctl1 implements btl1 {
    public static final ctl1 b = new ctl1();

    static {
        p7h.H(new Integer[]{1, 2, 4, 8, 16, 32, 64, 128});
    }

    public static Rect b(Activity activity) {
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        DisplayCutout displayCutout = null;
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (k1p1.p(activity)) {
                rect.set((Rect) obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null));
            } else {
                rect.set((Rect) obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null));
            }
        } catch (IllegalAccessException unused) {
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (NoSuchFieldException unused2) {
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (NoSuchMethodException unused3) {
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (InvocationTargetException unused4) {
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        gm50.v(defaultDisplay, point);
        if (!k1p1.p(activity)) {
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i = rect.bottom + dimensionPixelSize;
            if (i == point.y) {
                rect.bottom = i;
            } else {
                int i2 = rect.right + dimensionPixelSize;
                if (i2 == point.x) {
                    rect.right = i2;
                } else if (rect.left == dimensionPixelSize) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !k1p1.p(activity)) {
            try {
                Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                constructor.setAccessible(true);
                Object objNewInstance = constructor.newInstance(null);
                Method declaredMethod = defaultDisplay.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(defaultDisplay, objNewInstance);
                Field declaredField2 = objNewInstance.getClass().getDeclaredField("displayCutout");
                declaredField2.setAccessible(true);
                Object obj2 = declaredField2.get(objNewInstance);
                if (obj2 instanceof DisplayCutout) {
                    displayCutout = (DisplayCutout) obj2;
                }
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException unused5) {
            }
            if (displayCutout != null) {
                if (rect.left == ph5.O(displayCutout)) {
                    rect.left = 0;
                }
                if (point.x - rect.right == ph5.P(displayCutout)) {
                    rect.right = ph5.P(displayCutout) + rect.right;
                }
                if (rect.top == ph5.Q(displayCutout)) {
                    rect.top = 0;
                }
                if (point.y - rect.bottom == ph5.N(displayCutout)) {
                    rect.bottom = ph5.N(displayCutout) + rect.bottom;
                }
            }
        }
        return rect;
    }

    public final atl1 a(Activity activity) throws Exception {
        Rect rect;
        hsl1 hsl1VarB;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            rect = hbm.a(activity);
        } else if (i >= 29) {
            Configuration configuration = activity.getResources().getConfiguration();
            try {
                Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(configuration);
                rect = new Rect((Rect) obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null));
            } catch (IllegalAccessException unused) {
                rect = b(activity);
            } catch (NoSuchFieldException unused2) {
                rect = b(activity);
            } catch (NoSuchMethodException unused3) {
                rect = b(activity);
            } catch (InvocationTargetException unused4) {
                rect = b(activity);
            }
        } else if (i >= 28) {
            rect = b(activity);
        } else {
            rect = new Rect();
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            defaultDisplay.getRectSize(rect);
            if (!k1p1.p(activity)) {
                Point point = new Point();
                gm50.v(defaultDisplay, point);
                Resources resources = activity.getResources();
                int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
                int i2 = rect.bottom + dimensionPixelSize;
                if (i2 == point.y) {
                    rect.bottom = i2;
                } else {
                    int i3 = rect.right + dimensionPixelSize;
                    if (i3 == point.x) {
                        rect.right = i3;
                    }
                }
            }
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 30) {
            hsl1VarB = new dmj1((byte) 8).b();
        } else {
            if (i4 < 30) {
                throw new Exception("Incompatible SDK version");
            }
            hsl1VarB = hbm.a.b(activity);
        }
        return new atl1(new k1c(rect), hsl1VarB);
    }
}
