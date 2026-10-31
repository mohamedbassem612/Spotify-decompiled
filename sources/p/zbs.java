package p;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.component.icons.IconVideo;
import com.spotify.encoremobile.component.textview.EncoreTextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zbs implements qzh {
    public final Resources a;
    public final poj0 b;
    public ProgressBar c;

    public zbs(Context context) {
        this.a = context.getResources();
        this.b = poj0.u(LayoutInflater.from(context));
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void f(tan0 tan0Var) {
        poj0 poj0Var = this.b;
        IconVideo iconVideo = (IconVideo) poj0Var.b;
        StringBuilder sb = new StringBuilder();
        Resources resources = this.a;
        sb.append(resources.getString(2131959068));
        if (tan0Var.b()) {
            sb.append(resources.getString(2131959067));
        }
        ((EncoreTextView) poj0Var.e).setText(sb.toString());
        iconVideo.setVisibility(0);
        iconVideo.setActivated(false);
        iconVideo.setContentDescription(null);
        ProgressBar progressBar = this.c;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        ProgressBar progressBar2 = this.c;
        if (progressBar2 != null) {
            progressBar2.setContentDescription(null);
        }
        int iC = l1d.C(tan0Var.a());
        if (iC != 0) {
            if (iC != 1) {
                if (iC != 2) {
                    eg.o();
                    return;
                } else {
                    iconVideo.setActivated(true);
                    iconVideo.setContentDescription(resources.getString(2131959065));
                    return;
                }
            }
            iconVideo.setVisibility(4);
            ProgressBar progressBar3 = this.c;
            if (progressBar3 == null) {
                progressBar3 = (ProgressBar) ((ViewStub) poj0Var.d).inflate();
                this.c = progressBar3;
            }
            progressBar3.setVisibility(0);
            progressBar3.setContentDescription(resources.getString(2131959066));
        }
    }

    public final View getView() {
        return (ConstraintLayout) this.b.c;
    }
}
