package p;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.legacyglue.icons.SpotifyIconView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ses implements qzh {
    public final mzr0 a;
    public u7t0 b;

    public ses(Context context) {
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131625384, (ViewGroup) null, false);
        int i = 2131428292;
        EncoreButton encoreButtonT = m5n1.t(constraintLayoutInflate, 2131428292);
        if (encoreButtonT != null) {
            i = 2131428463;
            TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131428463);
            if (textView != null) {
                ConstraintLayout constraintLayout = constraintLayoutInflate;
                i = 2131430924;
                View viewT = m5n1.t(constraintLayoutInflate, 2131430924);
                if (viewT != null) {
                    i = 2131431049;
                    SpotifyIconView spotifyIconViewT = m5n1.t(constraintLayoutInflate, 2131431049);
                    if (spotifyIconViewT != null) {
                        i = 2131431115;
                        TextView textView2 = (TextView) m5n1.t(constraintLayoutInflate, 2131431115);
                        if (textView2 != null) {
                            i = 2131431356;
                            TextView textView3 = (TextView) m5n1.t(constraintLayoutInflate, 2131431356);
                            if (textView3 != null) {
                                this.a = new mzr0(constraintLayout, encoreButtonT, textView, constraintLayout, viewT, spotifyIconViewT, textView2, textView3);
                                return;
                            }
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final void f(Object obj) {
        u7t0 u7t0Var = (u7t0) obj;
        this.b = u7t0Var;
        mzr0 mzr0Var = this.a;
        ((SpotifyIconView) mzr0Var.f).setColor(Color.parseColor(u7t0Var.c));
        ((TextView) mzr0Var.g).setText(u7t0Var.a);
        ((TextView) mzr0Var.e).setText(u7t0Var.b);
        ((TextView) mzr0Var.b).setText(u7t0Var.d);
        ((EncoreButton) mzr0Var.a).setText(u7t0Var.e);
    }

    public final View getView() {
        return (ConstraintLayout) this.a.c;
    }

    public final void n(iu30 iu30Var) {
        ((EncoreButton) this.a.a).setOnClickListener(new cvr(iu30Var, this, (byte) 7));
    }
}
