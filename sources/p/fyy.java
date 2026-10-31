package p;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.spotify.campaigns.paragraph.view.ParagraphView;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fyy extends dy81 {
    public final gpr0 h;
    public final gpr0 i;
    public final Bitmap j;
    public final long k;

    public fyy(gpr0 gpr0Var, gpr0 gpr0Var2, Bitmap bitmap, long j) {
        super(new nj41(2368 + j), new f3a(2131624597, 2131428709));
        this.h = gpr0Var;
        this.i = gpr0Var2;
        this.j = bitmap;
        this.k = j;
    }

    public static float i(ImageView imageView, Guideline guideline) {
        return (guideline.getTop() - (imageView.getHeight() / 2)) - imageView.getTop();
    }

    @Override // p.dy81
    public final n381 h(ConstraintLayout constraintLayout) {
        Guideline guidelineN = b8k1.n(constraintLayout, 2131428706);
        ParagraphView paragraphViewN = b8k1.n(constraintLayout, 2131428709);
        ParagraphView paragraphViewN2 = b8k1.n(constraintLayout, 2131428708);
        ImageView imageView = (ImageView) b8k1.n(constraintLayout, 2131428707);
        AnimatorSet animatorSet = new AnimatorSet();
        PathInterpolator pathInterpolator = new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);
        AnimatorSet animatorSet2 = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, "scaleX", 0.0f, 1.0f);
        objectAnimatorOfFloat.setStartDelay(0L);
        objectAnimatorOfFloat.setDuration(667L);
        objectAnimatorOfFloat.setInterpolator(pathInterpolator);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(imageView, "scaleY", 0.0f, 1.0f);
        objectAnimatorOfFloat2.setStartDelay(0L);
        objectAnimatorOfFloat2.setDuration(667L);
        objectAnimatorOfFloat2.setInterpolator(pathInterpolator);
        animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet2.addListener(new kws(imageView, guidelineN, this));
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(hon1.k(0L, new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f), Collections.singletonList(new j5k(new t3x(imageView, guidelineN, this), oxx.Q0, new nty(imageView, (byte) 5)))), hon1.D(paragraphViewN, hon1.m(30, paragraphViewN), 0.0f, 333L, new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f)), hon1.o(paragraphViewN, 333L, 333L, new PathInterpolator(0.0f, 0.0f, 0.7f, 1.0f), 3), hon1.D(paragraphViewN2, hon1.m(30, paragraphViewN), 0.0f, 367L, new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f)), hon1.o(paragraphViewN2, 333L, 367L, new PathInterpolator(0.0f, 0.0f, 0.7f, 1.0f), 3));
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.setStartDelay(this.k);
        animatorSet4.playTogether(hon1.p(imageView, new PathInterpolator(0.3f, 0.0f, 1.0f, 1.0f)), hon1.D(imageView, 0.0f, hon1.m(-30, imageView), 0L, new PathInterpolator(1.0f, 0.0f, 1.0f, 1.0f)), hon1.p(paragraphViewN, new PathInterpolator(0.3f, 0.0f, 1.0f, 1.0f)), hon1.D(paragraphViewN, 0.0f, hon1.m(-30, paragraphViewN), 0L, new PathInterpolator(1.0f, 0.0f, 1.0f, 1.0f)), hon1.p(paragraphViewN2, new PathInterpolator(0.3f, 0.0f, 1.0f, 1.0f)), hon1.D(paragraphViewN2, 0.0f, hon1.m(-30, paragraphViewN2), 0L, new PathInterpolator(1.0f, 0.0f, 1.0f, 1.0f)));
        animatorSet.playSequentially(animatorSet2, animatorSet3, animatorSet4);
        animatorSet.addListener(new eyy(paragraphViewN, paragraphViewN2, imageView, (byte) 0));
        return new n381(animatorSet, new tjq(paragraphViewN, this, paragraphViewN2, imageView, guidelineN), (byte) 10);
    }
}
