package p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.spotify.encoremobile.component.textview.EncoreTextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qg30 {
    public final /* synthetic */ byte a;
    public final LinearLayout b;
    public final EncoreTextView c;
    public final EncoreTextView d;

    public /* synthetic */ qg30(LinearLayout linearLayout, EncoreTextView encoreTextView, EncoreTextView encoreTextView2, byte b) {
        this.a = b;
        this.b = linearLayout;
        this.c = encoreTextView;
        this.d = encoreTextView2;
    }

    public static qg30 b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        byte b = 0;
        View viewInflate = layoutInflater.inflate(2131624664, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        int i = 2131430649;
        EncoreTextView encoreTextViewT = m5n1.t(viewInflate, 2131430649);
        if (encoreTextViewT != null) {
            i = 2131430734;
            EncoreTextView encoreTextViewT2 = m5n1.t(viewInflate, 2131430734);
            if (encoreTextViewT2 != null) {
                return new qg30(linearLayout, encoreTextViewT, encoreTextViewT2, b);
            }
        }
        bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    public static qg30 c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(2131624679, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        int i = 2131428091;
        EncoreTextView encoreTextViewT = m5n1.t(viewInflate, 2131428091);
        if (encoreTextViewT != null) {
            i = 2131430657;
            EncoreTextView encoreTextViewT2 = m5n1.t(viewInflate, 2131430657);
            if (encoreTextViewT2 != null) {
                return new qg30(linearLayout, encoreTextViewT, encoreTextViewT2, (byte) 1);
            }
        }
        bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    public final LinearLayout a() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b;
    }
}
