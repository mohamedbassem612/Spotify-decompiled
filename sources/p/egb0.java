package p;

import android.app.Activity;
import androidx.core.graphics.drawable.IconCompat;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class egb0 {
    public final Scheduler a;
    public final Scheduler b;
    public final gw70 c;
    public final Activity d;
    public final IconCompat e;
    public final idd1 f = new idd1(new pr90(this, (byte) 22));

    public egb0(Activity activity, Scheduler scheduler, Scheduler scheduler2, gw70 gw70Var) {
        this.a = scheduler;
        this.b = scheduler2;
        this.c = gw70Var;
        this.d = activity;
        this.e = IconCompat.f(activity, 2131689476);
    }
}
