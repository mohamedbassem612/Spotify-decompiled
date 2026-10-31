package p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.spotify.encoremobile.facepile.FacePileView;
import com.spotify.legacyglue.icons.SpotifyIconView;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class uh50 implements gi50 {
    public final gw70 a;
    public final ur00 b;
    public final ScrollView c;
    public final td10 d;

    public uh50(LayoutInflater layoutInflater, ViewGroup viewGroup, gw70 gw70Var) {
        this.a = gw70Var;
        View viewInflate = layoutInflater.inflate(2131625067, viewGroup, false);
        int i = 2131427863;
        Button button = (Button) m5n1.t(viewInflate, 2131427863);
        if (button != null) {
            i = 2131428817;
            FacePileView facePileViewT = m5n1.t(viewInflate, 2131428817);
            if (facePileViewT != null) {
                i = 2131429223;
                SpotifyIconView spotifyIconViewT = m5n1.t(viewInflate, 2131429223);
                if (spotifyIconViewT != null) {
                    i = 2131429616;
                    if (((FrameLayout) m5n1.t(viewInflate, 2131429616)) != null) {
                        i = 2131429661;
                        if (((TextView) m5n1.t(viewInflate, 2131429661)) != null) {
                            i = 2131431115;
                            TextView textView = (TextView) m5n1.t(viewInflate, 2131431115);
                            if (textView != null) {
                                i = 2131431356;
                                TextView textView2 = (TextView) m5n1.t(viewInflate, 2131431356);
                                if (textView2 != null) {
                                    ScrollView scrollView = (ScrollView) viewInflate;
                                    this.b = new ur00(scrollView, button, facePileViewT, spotifyIconViewT, textView, textView2);
                                    this.c = scrollView;
                                    td10 td10Var = new td10((String) null, "＋", (String) null, (sd10) null);
                                    td10Var.e = true;
                                    this.d = td10Var;
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
        return new cn(this, consumer, (byte) 23);
    }

    @Override // p.gi50
    public final View getRoot() {
        return this.c;
    }
}
