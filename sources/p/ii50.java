package p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import com.spotify.encoremobile.facepile.FacePileView;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ii50 implements gi50 {
    public final gw70 a;
    public final wmy b;
    public final ScrollView c;

    public ii50(LayoutInflater layoutInflater, ViewGroup viewGroup, gw70 gw70Var) {
        this.a = gw70Var;
        View viewInflate = layoutInflater.inflate(2131625068, viewGroup, false);
        int i = 2131427863;
        Button button = (Button) m5n1.t(viewInflate, 2131427863);
        if (button != null) {
            i = 2131428817;
            FacePileView facePileViewT = m5n1.t(viewInflate, 2131428817);
            if (facePileViewT != null) {
                i = 2131429661;
                if (((TextView) m5n1.t(viewInflate, 2131429661)) != null) {
                    i = 2131429662;
                    TextView textView = (TextView) m5n1.t(viewInflate, 2131429662);
                    if (textView != null) {
                        i = 2131429818;
                        ProgressBar progressBar = (ProgressBar) m5n1.t(viewInflate, 2131429818);
                        if (progressBar != null) {
                            i = 2131431115;
                            TextView textView2 = (TextView) m5n1.t(viewInflate, 2131431115);
                            if (textView2 != null) {
                                i = 2131431356;
                                TextView textView3 = (TextView) m5n1.t(viewInflate, 2131431356);
                                if (textView3 != null) {
                                    ScrollView scrollView = (ScrollView) viewInflate;
                                    this.b = new wmy(scrollView, button, facePileViewT, textView, progressBar, textView2, textView3);
                                    this.c = scrollView;
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final Connection L(Consumer consumer) {
        return new cn(this, consumer, (byte) 25);
    }

    @Override // p.gi50
    public final View getRoot() {
        return this.c;
    }
}
