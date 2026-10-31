package p;

import android.app.Activity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lqs {
    public final Activity a;
    public final h991 b;

    public lqs(Activity activity, h991 h991Var) {
        this.a = activity;
        this.b = h991Var;
    }

    public final String a(d991 d991Var) {
        String string;
        h991 h991Var = this.b;
        boolean zB = h991Var.b();
        ks50 ks50Var = h991Var.a;
        Activity activity = this.a;
        if (!zB) {
            String string2 = activity.getString(2131954437);
            string2.getClass();
            return string2;
        }
        if ((ks50Var.d() ? ks50Var.f() : -1L) < 0) {
            if (d991Var == d991.b) {
                string = activity.getString(2131954441);
            } else if (d991Var == d991.c) {
                string = activity.getString(2131954439);
            } else if (d991Var == d991.d) {
                string = activity.getString(2131954442);
            } else {
                string = d991Var == d991.e ? activity.getString(2131954440) : activity.getString(2131954443);
            }
            string.getClass();
        } else {
            int iCeil = (int) Math.ceil((ks50Var.d() ? ks50Var.f() : -1L) / 60000.0d);
            if (iCeil < 60) {
                string = activity.getString(2131954445, Integer.valueOf(iCeil));
                string.getClass();
            } else {
                string = activity.getString(2131954444, Integer.valueOf(iCeil / 60));
                string.getClass();
            }
        }
        String string3 = activity.getString(2131954438, string);
        string3.getClass();
        return string3;
    }
}
