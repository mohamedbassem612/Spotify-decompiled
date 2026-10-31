package p;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.nowplaying.uiusecases.nextbutton.NextButtonNowPlaying;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gcs implements NextButtonNowPlaying {
    public final AppCompatImageButton a;

    public gcs(Context context) {
        AppCompatImageButton appCompatImageButton = new AppCompatImageButton(context);
        appCompatImageButton.setBackground(null);
        appCompatImageButton.setScaleType(ImageView.ScaleType.CENTER_CROP);
        appCompatImageButton.setContentDescription(appCompatImageButton.getResources().getString(2131959246));
        g4b1 g4b1Var = new g4b1(context, j4b1.h6, context.getResources().getDimension(2131166770));
        g4b1Var.c(x74.E(context, 2131102446));
        appCompatImageButton.setImageDrawable(g4b1Var);
        int iM = too1.m(context, 2131167033);
        appCompatImageButton.setPadding(iM, iM, iM, iM);
        this.a = appCompatImageButton;
    }

    public final void f(Object obj) {
        this.a.setEnabled(((l691) obj).b);
    }

    public final View getView() {
        return this.a;
    }

    public final void n(iu30 iu30Var) {
        this.a.setOnClickListener(new o0s(iu30Var, (byte) 20));
    }
}
