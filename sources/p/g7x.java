package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.nowplaying.uiusecases.nextbutton.NextButtonNowPlaying;
import com.spotify.nowplaying.uiusecases.previousbutton.PreviousButtonNowPlaying;
import com.spotify.nowplayingmini.uicomponents.seekbar.FadingSeekBarView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class g7x implements m4p0 {
    public final dfm a;

    public g7x(dfm dfmVar) {
        this.a = dfmVar;
    }

    public static g4b1 b(int i, Context context, j4b1 j4b1Var) {
        int color = context.getColor(2131101506);
        float dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        g4b1 g4b1Var = new g4b1(context, j4b1Var, dimensionPixelSize);
        g4b1Var.b(color);
        g4b1Var.d(dimensionPixelSize);
        return g4b1Var;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(2131625328, viewGroup, false);
        ((ImageView) viewInflate.findViewById(2131428271)).setImageDrawable(b(2131167165, viewInflate.getContext(), j4b1.b7));
        PreviousButtonNowPlaying previousButtonNowPlaying = viewInflate.findViewById(2131430492) != null ? (PreviousButtonNowPlaying) sto1.i(viewInflate.findViewById(2131430492)) : null;
        View viewFindViewById = viewInflate.findViewById(2131430407);
        viewFindViewById.getClass();
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById.getParent();
        jpt0 jpt0Var = new jpt0((ipt0) null, 3);
        tka0 tka0Var = dtw.C;
        k8p1.o(viewFindViewById, mhc.b(viewGroup2.getContext(), viewGroup2, this.a, jpt0Var, (ipb1) null, 112).w);
        NextButtonNowPlaying nextButtonNowPlaying = (NextButtonNowPlaying) sto1.i(viewInflate.findViewById(2131430141));
        nextButtonNowPlaying.getView().setPadding(0, 0, 0, 0);
        nextButtonNowPlaying.f(new l691("", false, new fvf1(0L, 0L)));
        FadingSeekBarView fadingSeekBarView = (FadingSeekBarView) viewInflate.findViewById(2131430902);
        if (fadingSeekBarView != null) {
            fadingSeekBarView.setSeekingEnabled(false);
        }
        if (previousButtonNowPlaying == null) {
            ((ImageView) viewInflate.findViewById(2131428182)).setImageDrawable(b(2131166510, viewInflate.getContext(), j4b1.q2));
            return viewInflate;
        }
        previousButtonNowPlaying.getView().setPadding(0, 0, 0, 0);
        previousButtonNowPlaying.getView().setEnabled(false);
        ((TextView) viewInflate.findViewById(2131428182)).setCompoundDrawablesWithIntrinsicBounds((Drawable) b(2131165540, viewInflate.getContext(), j4b1.q2), (Drawable) null, (Drawable) null, (Drawable) null);
        return viewInflate;
    }

    public final void start() {
    }

    public final void stop() {
    }
}
