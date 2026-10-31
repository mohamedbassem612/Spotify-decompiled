package p;

import android.content.Context;
import android.widget.RatingBar;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fjs implements RatingBar.OnRatingBarChangeListener {
    public final /* synthetic */ yir a;
    public final /* synthetic */ iu30 b;

    public fjs(yir yirVar, iu30 iu30Var) {
        this.a = yirVar;
        this.b = iu30Var;
    }

    @Override // android.widget.RatingBar.OnRatingBarChangeListener
    public final void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
        int i = (int) f;
        ratingBar.setContentDescription(((Context) this.a.b).getResources().getQuantityString(2131820546, i, Integer.valueOf(i)));
        this.b.invoke(new vrz0(i));
    }
}
