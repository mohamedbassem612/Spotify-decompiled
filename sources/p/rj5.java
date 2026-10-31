package p;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class rj5 {
    public static final qj5 a = new qj5(new n5u((byte) 4));
    public static final int b = -100;
    public static fhe0 c = null;
    public static fhe0 d = null;
    public static Boolean e = null;
    public static boolean f = false;
    public static final d46 g = new d46(0);
    public static final Object h = new Object();
    public static final Object i = new Object();

    public static boolean b(Context context) {
        if (e == null) {
            try {
                Bundle bundle = ep5.a(context).metaData;
                if (bundle != null) {
                    e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                e = Boolean.FALSE;
            }
        }
        return e.booleanValue();
    }

    public static void f(yj5 yj5Var) {
        synchronized (h) {
            try {
                d46 d46Var = g;
                d46Var.getClass();
                w36 w36Var = new w36(d46Var);
                while (w36Var.hasNext()) {
                    rj5 rj5Var = (rj5) ((WeakReference) w36Var.next()).get();
                    if (rj5Var == yj5Var || rj5Var == null) {
                        w36Var.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void a();

    public abstract void c();

    public abstract void e();

    public abstract boolean g(int i2);

    public abstract void i(int i2);

    public abstract void j(View view);

    public abstract void k(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void l(CharSequence charSequence);
}
