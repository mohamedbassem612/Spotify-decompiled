package p;

import android.app.Activity;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zrg {
    public final Activity a;
    public final lzn0 b;
    public final a1r0 c;

    public /* synthetic */ zrg(Activity activity, lzn0 lzn0Var, a1r0 a1r0Var) {
        this.a = activity;
        this.b = lzn0Var;
        this.c = a1r0Var;
    }

    public void a() {
        Activity activity = this.a;
        a1r0 a1r0Var = this.c;
        if (a1r0Var.h(activity)) {
            a1r0Var.g();
        } else {
            this.b.e();
        }
    }

    public void b(String str, String str2) {
        Bundle bundleH = mno1.h(new mmr0[]{new mmr0("entity-uri", str), new mmr0("media-url", str2)});
        dwn0 dwn0Var = new dwn0("spotify:imagegallery", "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null);
        Activity activity = this.a;
        lzn0 lzn0Var = this.b;
        if (lzn0Var.j(activity)) {
            lzn0Var.i(dwn0Var, bundleH);
        } else {
            a1r0.m(this.c, "spotify:imagegallery", (tv80) null, bundleH, 8);
        }
    }
}
