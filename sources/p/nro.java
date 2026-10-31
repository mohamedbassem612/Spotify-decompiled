package p;

import android.animation.AnimatorSet;
import android.view.animation.PathInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.campaigns.paragraph.view.ParagraphView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nro extends dy81 {
    public final /* synthetic */ byte h;
    public final gpr0 i;
    public final long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nro(gpr0 gpr0Var, long j, byte b) {
        super(new nj41(1334 + j), new f3a(2131624506, 2131428352));
        this.h = b;
        switch (b) {
            case 1:
                super(new nj41(1334 + j), new f3a(2131626257, 2131431370));
                this.i = gpr0Var;
                this.j = j;
                break;
            default:
                this.i = gpr0Var;
                this.j = j;
                break;
        }
    }

    @Override // p.dy81
    public final n381 h(ConstraintLayout constraintLayout) {
        byte b = this.h;
        long j = this.j;
        switch (b) {
            case 0:
                ParagraphView paragraphViewN = b8k1.n(constraintLayout, 2131428352);
                AnimatorSet animatorSet = new AnimatorSet();
                AnimatorSet animatorSet2 = new AnimatorSet();
                long j2 = j / 2;
                animatorSet2.setStartDelay(j2);
                animatorSet2.playTogether(jon1.E(paragraphViewN, new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f)), jon1.m(paragraphViewN, 1.0f, 667L, 0L, new PathInterpolator(0.0f, 0.0f, 0.7f, 1.0f), 8));
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.setStartDelay(j2);
                animatorSet3.playTogether(jon1.n(paragraphViewN, 0.0f, 333L, 333L, new PathInterpolator(0.3f, 0.0f, 1.0f, 1.0f), 3));
                animatorSet.playSequentially(animatorSet2, animatorSet3);
                animatorSet.addListener(new mro(paragraphViewN, (byte) 0));
                return new n381(animatorSet, new gal(paragraphViewN, this, (byte) 19), (byte) 10);
            default:
                ParagraphView paragraphViewN2 = b8k1.n(constraintLayout, 2131431370);
                AnimatorSet animatorSet4 = new AnimatorSet();
                AnimatorSet animatorSet5 = new AnimatorSet();
                animatorSet5.playTogether(hon1.D(paragraphViewN2, hon1.m(30, paragraphViewN2), 0.0f, 0L, new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f)), hon1.o(paragraphViewN2, 667L, 0L, new PathInterpolator(0.0f, 0.0f, 0.7f, 1.0f), 11));
                AnimatorSet animatorSet6 = new AnimatorSet();
                animatorSet6.setStartDelay(j);
                animatorSet6.playTogether(hon1.p(paragraphViewN2, new PathInterpolator(0.3f, 0.0f, 1.0f, 1.0f)), hon1.D(paragraphViewN2, 0.0f, hon1.m(-30, paragraphViewN2), 0L, new PathInterpolator(1.0f, 0.0f, 1.0f, 1.0f)));
                animatorSet4.playSequentially(animatorSet5, animatorSet6);
                animatorSet4.addListener(new mro(paragraphViewN2, (byte) 1));
                return new n381(animatorSet4, new ffe1(paragraphViewN2, this, (byte) 2), (byte) 10);
        }
    }
}
