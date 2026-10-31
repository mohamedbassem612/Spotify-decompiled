package p;

import android.app.Activity;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class y991 {
    public final Activity a;
    public final lzn0 b;
    public final a1r0 c;

    public y991(Activity activity, lzn0 lzn0Var, a1r0 a1r0Var) {
        this.a = activity;
        this.b = lzn0Var;
        this.c = a1r0Var;
    }

    public final void a(String str, d991 d991Var, tv80 tv80Var) {
        Bundle bundleH = mno1.h(new mmr0[]{new mmr0("sleep_timer_menu_item_uri", str), new mmr0("sleep_timer_menu_content_type", Integer.valueOf(d991Var.ordinal()))});
        lzn0 lzn0Var = this.b;
        Activity activity = this.a;
        if (!lzn0Var.j(activity)) {
            String str2 = aa91.i.a;
            a1r0 a1r0Var = this.c;
            a1r0Var.k(str2, tv80Var, bundleH, a1r0Var.h(activity));
        } else if (tv80Var != null) {
            lzn0Var.a(aa91.i.a, tv80Var, bundleH);
        } else {
            lzn0Var.g(bundleH, aa91.i.a);
        }
    }
}
