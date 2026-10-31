package p;

import android.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zg30 {
    public final LinearLayout a;

    public /* synthetic */ zg30(LinearLayout linearLayout) {
        this.a = linearLayout;
    }

    public static zg30 b(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(2131624670, (ViewGroup) null, false);
        int i = R.id.button1;
        if (((Button) m5n1.t(viewInflate, R.id.button1)) != null) {
            i = R.id.button2;
            if (((Button) m5n1.t(viewInflate, R.id.button2)) != null) {
                i = R.id.button3;
                if (((Button) m5n1.t(viewInflate, R.id.button3)) != null) {
                    i = 2131427843;
                    if (((LinearLayout) m5n1.t(viewInflate, 2131427843)) != null) {
                        i = R.id.message;
                        if (((TextView) m5n1.t(viewInflate, R.id.message)) != null) {
                            return new zg30((LinearLayout) viewInflate);
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    public LinearLayout a() {
        return this.a;
    }
}
