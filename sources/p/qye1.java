package p;

import android.animation.AnimatorSet;
import android.view.animation.PathInterpolator;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.spotify.campaigns.paragraph.view.ParagraphView;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qye1 extends dy81 {
    public final gpr0 h;
    public final gpr0 i;
    public final long j;
    public final long k;

    public qye1(gpr0 gpr0Var, gpr0 gpr0Var2, long j, long j2) {
        super(new nj41(j + j2 + 2001), new f3a(2131626259, 2131431383));
        this.h = gpr0Var;
        this.i = gpr0Var2;
        this.j = j;
        this.k = j2;
    }

    public static float i(TextView textView, Guideline guideline) {
        return (guideline.getTop() - (textView.getHeight() / 2)) - textView.getTop();
    }

    @Override // p.dy81
    public final n381 h(ConstraintLayout constraintLayout) {
        Guideline guidelineN = b8k1.n(constraintLayout, 2131431381);
        ParagraphView paragraphViewN = b8k1.n(constraintLayout, 2131431383);
        ParagraphView paragraphViewN2 = b8k1.n(constraintLayout, 2131431382);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(hon1.k(0L, new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f), Collections.singletonList(new j5k(new oye1(this, paragraphViewN, guidelineN, (byte) 1), new oye1(this, paragraphViewN, guidelineN, (byte) 2), new pye1(paragraphViewN, (byte) 1)))), hon1.o(paragraphViewN, 333L, 0L, new PathInterpolator(0.0f, 0.0f, 0.7f, 1.0f), 11));
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(hon1.k(this.j - 333, new PathInterpolator(0.6f, 0.0f, 0.0f, 1.0f), Collections.singletonList(new j5k(new oye1(this, paragraphViewN, guidelineN, (byte) 0), orc1.Z0, new pye1(paragraphViewN, (byte) 0)))), hon1.D(paragraphViewN2, hon1.m(30, paragraphViewN2), 0.0f, this.j, new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f)), hon1.o(paragraphViewN2, 333L, this.j, new PathInterpolator(0.0f, 0.0f, 0.7f, 1.0f), 3));
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.setStartDelay(this.k);
        animatorSet4.playTogether(hon1.p(paragraphViewN, new PathInterpolator(0.3f, 0.0f, 1.0f, 1.0f)), hon1.D(paragraphViewN, 0.0f, hon1.m(-30, paragraphViewN), 0L, new PathInterpolator(1.0f, 0.0f, 1.0f, 1.0f)), hon1.p(paragraphViewN2, new PathInterpolator(0.3f, 0.0f, 1.0f, 1.0f)), hon1.D(paragraphViewN2, 0.0f, hon1.m(-30, paragraphViewN2), 0L, new PathInterpolator(1.0f, 0.0f, 1.0f, 1.0f)));
        animatorSet.playSequentially(animatorSet2, animatorSet3, animatorSet4);
        animatorSet.addListener(new kws(paragraphViewN, paragraphViewN2, (byte) 3));
        return new n381(animatorSet, new lvc1(paragraphViewN, this, paragraphViewN2, (byte) 14), (byte) 10);
    }
}
