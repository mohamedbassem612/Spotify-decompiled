package p;

import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.view.animation.PathInterpolator;
import com.spotify.campaigns.paragraph.view.ParagraphView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class f2c extends dy81 {
    public final gpr0 h;
    public final gpr0 i;
    public final Bitmap j;

    public f2c(gpr0 gpr0Var, gpr0 gpr0Var2, Bitmap bitmap, long j) {
        super(new nj41(j + 4067), new f3a(2131624261, 2131427773));
        this.h = gpr0Var;
        this.i = gpr0Var2;
        this.j = bitmap;
    }

    public static AnimatorSet i(ParagraphView paragraphView, long j) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(jon1.m(paragraphView, 0.0f, 333L, j, new PathInterpolator(0.3f, 0.0f, 0.4f, 1.0f), 3), jon1.L(paragraphView, jon1.j(100, paragraphView), 0.0f, 667L, j, new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f)));
        return animatorSet;
    }
}
