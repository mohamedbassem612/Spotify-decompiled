package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.badge.locked.LockedBadgeView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zer implements qzh {
    public final /* synthetic */ byte a;
    public final ks6 b;
    public final ImageView c;

    public zer(Context context, gw70 gw70Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                ks6 ks6VarG = ks6.g(LayoutInflater.from(context));
                w2g0.q(ks6VarG, gw70Var);
                this.b = ks6VarG;
                int dimensionPixelSize = ((ConstraintLayout) ks6VarG.a).getResources().getDimensionPixelSize(2131165336);
                Guideline guideline = (Guideline) ks6VarG.g;
                qhl layoutParams = guideline.getLayoutParams();
                layoutParams.b = dimensionPixelSize;
                guideline.setLayoutParams(layoutParams);
                ImageView imageView = (ImageView) w2g0.p(ks6VarG, 2131625089);
                imageView.setImageDrawable(azo1.r(imageView.getContext(), j4b1.O1, 2131101343, imageView.getContext().getResources().getDimensionPixelSize(2131165337)));
                this.c = imageView;
                break;
            default:
                ks6 ks6VarG2 = ks6.g(LayoutInflater.from(context));
                w2g0.q(ks6VarG2, gw70Var);
                this.b = ks6VarG2;
                int dimensionPixelSize2 = ((ConstraintLayout) ks6VarG2.a).getResources().getDimensionPixelSize(2131165336);
                Guideline guideline2 = (Guideline) ks6VarG2.g;
                qhl layoutParams2 = guideline2.getLayoutParams();
                layoutParams2.b = dimensionPixelSize2;
                guideline2.setLayoutParams(layoutParams2);
                ImageView imageView2 = (ImageView) w2g0.p(ks6VarG2, 2131625089);
                imageView2.setImageDrawable(azo1.r(imageView2.getContext(), j4b1.O1, 2131101343, imageView2.getContext().getResources().getDimensionPixelSize(2131165337)));
                this.c = imageView2;
                break;
        }
    }

    public final void f(Object obj) {
        byte b = this.a;
        ImageView imageView = this.c;
        ks6 ks6Var = this.b;
        switch (b) {
            case 0:
                lf3 lf3Var = (lf3) obj;
                ((TextView) ks6Var.R0).setText(lf3Var.a);
                ((TextView) ks6Var.Q0).setText(lf3Var.b);
                ((LockedBadgeView) ks6Var.i).c(lf3Var.d);
                ((ArtworkView) ks6Var.d).h(new k07(new g07(lf3Var.c), false));
                boolean z = lf3Var.e;
                w2g0.w(ks6Var, z);
                imageView.setEnabled(z);
                break;
            default:
                ww6 ww6Var = (ww6) obj;
                ((TextView) ks6Var.R0).setText(ww6Var.a);
                ((TextView) ks6Var.Q0).setText(ww6Var.b);
                ((ArtworkView) ks6Var.d).h(new l07(new g07(ww6Var.c), false));
                boolean z2 = ww6Var.d;
                w2g0.w(ks6Var, z2);
                imageView.setEnabled(z2);
                break;
        }
    }

    public final View getView() {
        byte b = this.a;
        ks6 ks6Var = this.b;
        switch (b) {
            case 0:
                break;
        }
        return (ConstraintLayout) ks6Var.a;
    }

    public final void n(iu30 iu30Var) {
        byte b = this.a;
        ks6 ks6Var = this.b;
        switch (b) {
            case 0:
                ((ConstraintLayout) ks6Var.a).setOnClickListener(new yer(iu30Var, (byte) 0));
                break;
            default:
                ((ConstraintLayout) ks6Var.a).setOnClickListener(new yer(iu30Var, (byte) 9));
                break;
        }
    }
}
