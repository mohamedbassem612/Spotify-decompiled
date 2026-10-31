package p;

import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qt70 extends dy81 {
    public final Bitmap h;
    public final boolean i;
    public final long j;

    public qt70(Bitmap bitmap, boolean z, long j) {
        super(new nj41(1334 + j), new f3a(2131625086, 2131430756));
        this.h = bitmap;
        this.i = z;
        this.j = j;
    }

    @Override // p.dy81
    public final n381 h(ConstraintLayout constraintLayout) {
        ImageView imageView = (ImageView) b8k1.n(constraintLayout, 2131430756);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(zno1.l(imageView, 667L, new PathInterpolator(0.0f, 0.0f, 0.7f, 1.0f), 11), zno1.D(imageView, zno1.i(30, imageView), 0.0f, 667L, new PathInterpolator(0.6f, 0.0f, 0.0f, 1.0f)));
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.setStartDelay(this.j);
        animatorSet3.playTogether(zno1.m(imageView, 333L, 333L, new PathInterpolator(0.3f, 0.0f, 1.0f, 1.0f)), zno1.D(imageView, 0.0f, zno1.i(-30, imageView), 667L, new PathInterpolator(1.0f, 0.0f, 1.0f, 1.0f)));
        animatorSet.playSequentially(animatorSet2, animatorSet3);
        animatorSet.addListener(new mic(imageView, (byte) 2));
        if (!this.i) {
            animatorSet = new AnimatorSet();
        }
        return new n381(animatorSet, new vx40(imageView, this, (byte) 15), (byte) 10);
    }
}
