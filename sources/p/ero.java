package p;

import android.R;
import android.app.Activity;
import android.app.ActivityOptions;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ero {
    public final Activity a;

    public oql a() {
        oxg1 oxg1Var = new oxg1((wzn) null);
        Bundle bundle = new Bundle();
        bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", -16777216);
        bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", -16777216);
        oxg1Var.g = bundle;
        oxg1Var.g();
        oxg1Var.e = ActivityOptions.makeCustomAnimation(this.a, R.anim.fade_in, R.anim.fade_out);
        return oxg1Var.a();
    }
}
