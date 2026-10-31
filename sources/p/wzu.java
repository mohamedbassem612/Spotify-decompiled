package p;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class wzu {
    public static final String a = pro1.t("downloadOver3g");

    public static final String a(Context context, int i) {
        int i2;
        if (i == 6) {
            i = 5;
        }
        if (i == 1) {
            i2 = 2131961962;
        } else if (i == 2) {
            i2 = 2131961964;
        } else if (i == 3) {
            i2 = 2131961957;
        } else if (i != 4) {
            i2 = i != 5 ? 2131961955 : 2131961959;
        } else {
            i2 = 2131961970;
        }
        String string = context.getString(i2);
        string.getClass();
        return string;
    }

    public static final void b(lzn0 lzn0Var) {
        lzn0Var.h(a);
    }

    public static final void c(kt91 kt91Var) {
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131953023});
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
        kt91Var.k(new er91((fs91) null, "", 2131953023, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
    }

    public static final void d(kt91 kt91Var, String str) {
        kt91Var.k(new er91((fs91) null, str, (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
    }
}
