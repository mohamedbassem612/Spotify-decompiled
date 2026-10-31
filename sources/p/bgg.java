package p;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bgg implements ey31 {
    public final /* synthetic */ byte a;
    public final Activity b;

    public /* synthetic */ bgg(Activity activity, byte b) {
        this.a = b;
        this.b = activity;
    }

    public final fy31 a(ViewGroup viewGroup) {
        byte b = this.a;
        Activity activity = this.b;
        switch (b) {
            case 0:
                View viewInflate = LayoutInflater.from(activity).inflate(2131624303, viewGroup, false);
                viewInflate.getClass();
                return new cgg(viewInflate, (Button) viewInflate.findViewById(2131428094), (byte) 0);
            default:
                View viewInflate2 = LayoutInflater.from(activity).inflate(2131624304, viewGroup, false);
                viewInflate2.getClass();
                return new cgg(viewInflate2, (Button) viewInflate2.findViewById(2131430896), (byte) 1);
        }
    }

    public final Class b() {
        switch (this.a) {
            case 0:
                return zu31.class;
            default:
                return qv31.class;
        }
    }

    public final int c() {
        switch (this.a) {
            case 0:
                return 10;
            default:
                return 9;
        }
    }
}
