package p;

import android.app.Activity;
import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t750 implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Activity b;

    public /* synthetic */ t750(Activity activity, byte b) {
        this.a = b;
        this.b = activity;
    }

    public final void run() {
        byte b = this.a;
        Activity activity = this.b;
        switch (b) {
            case 0:
                activity.finishAffinity();
                break;
            case 1:
                activity.finishAffinity();
                break;
            case 2:
                activity.finishAffinity();
                break;
            case 3:
                activity.finishAffinity();
                break;
            default:
                activity.finishAffinity();
                break;
        }
    }
}
