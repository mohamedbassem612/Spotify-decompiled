package p;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.nowplaying.uiusecases.contextmenubutton.ContextMenuButtonNowPlaying;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cqr implements ContextMenuButtonNowPlaying {
    public final Context a;
    public final AppCompatImageButton b;

    public cqr(Context context) {
        this.a = context;
        AppCompatImageButton appCompatImageButton = new AppCompatImageButton(context);
        appCompatImageButton.setBackground(null);
        appCompatImageButton.setScaleType(ImageView.ScaleType.CENTER_CROP);
        int iM = too1.m(appCompatImageButton.getContext(), 2131167033);
        appCompatImageButton.setPadding(iM, iM, iM, iM);
        g4b1 g4b1Var = new g4b1(appCompatImageButton.getContext(), j4b1.q4, too1.m(appCompatImageButton.getContext(), 2131166774));
        g4b1Var.c(x74.E(appCompatImageButton.getContext(), 2131102446));
        appCompatImageButton.setImageDrawable(g4b1Var);
        this.b = appCompatImageButton;
    }

    public final void f(Object obj) {
        String string;
        iem iemVar = (iem) obj;
        String str = iemVar.b;
        boolean z = iemVar.a;
        AppCompatImageButton appCompatImageButton = this.b;
        appCompatImageButton.setEnabled(z);
        int i = iemVar.c;
        int i2 = i == 0 ? -1 : bqr.a[l1d.C(i)];
        if (i2 != -1) {
            Context context = this.a;
            if (i2 == 1) {
                string = context.getResources().getString(2131962418, str);
            } else if (i2 == 2) {
                string = context.getResources().getString(2131962414, str);
            } else if (i2 == 3) {
                string = context.getResources().getString(2131962415, str);
            } else {
                if (i2 != 4) {
                    eg.o();
                    return;
                }
                string = context.getResources().getString(2131962413);
            }
        } else {
            string = "";
        }
        appCompatImageButton.setContentDescription(string);
    }

    public final View getView() {
        return this.b;
    }

    public final void n(iu30 iu30Var) {
        this.b.setOnClickListener(new yer(iu30Var, (byte) 28));
    }
}
