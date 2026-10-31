package p;

import android.app.Activity;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t2l {
    public final Activity a;
    public final PackageManager b;

    public t2l(Activity activity, byte b) {
        switch (b) {
            case 1:
                this.a = activity;
                this.b = activity.getPackageManager();
                break;
            default:
                this.a = activity;
                this.b = activity.getPackageManager();
                break;
        }
    }
}
