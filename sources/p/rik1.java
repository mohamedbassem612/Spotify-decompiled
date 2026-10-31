package p;

import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class rik1 {
    public static final tik1 a;
    public static final qik1 b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            a = new uik1();
        } else {
            a = new tik1();
        }
        b = new qik1(Float.class, "translationAlpha");
        new nce((byte) 12);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        a.L(view, i, i2, i3, i4);
    }

    public static void b(View view, int i) {
        a.M(view, i);
    }
}
