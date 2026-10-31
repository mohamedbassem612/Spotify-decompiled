package p;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.nowplaying.uiusecases.closebutton.CloseButtonNowPlaying;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class emr implements CloseButtonNowPlaying {
    public final AppCompatImageButton a;

    public emr(Context context) {
        AppCompatImageButton appCompatImageButton = new AppCompatImageButton(context);
        appCompatImageButton.setBackground(null);
        appCompatImageButton.setScaleType(ImageView.ScaleType.CENTER_CROP);
        appCompatImageButton.setContentDescription(appCompatImageButton.getResources().getString(2131959238));
        int iM = too1.m(context, 2131167033);
        appCompatImageButton.setPadding(iM, iM, iM, iM);
        g4b1 g4b1Var = new g4b1(context, j4b1.J1, too1.m(context, 2131166774));
        g4b1Var.c(x74.E(context, 2131102446));
        appCompatImageButton.setImageDrawable(g4b1Var);
        this.a = appCompatImageButton;
    }

    public final /* bridge */ /* synthetic */ void f(Object obj) {
    }

    public final View getView() {
        return this.a;
    }

    public final void n(iu30 iu30Var) {
        this.a.setOnClickListener(new yer(iu30Var, (byte) 25));
    }
}
