package p;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.campaigns.paragraph.view.ParagraphView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ty81 extends dy81 {
    public final gpr0 h;
    public final gpr0 i;
    public final gpr0 j;
    public final Bitmap k;
    public final long l;
    public final boolean m;
    public final boolean n;
    public ParagraphView o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ParagraphView f44p;
    public ParagraphView q;
    public ImageView r;

    public ty81(gpr0 gpr0Var, gpr0 gpr0Var2, gpr0 gpr0Var3, Bitmap bitmap, long j, boolean z, boolean z2) {
        super(new nj41(2001 + j), new f3a(2131626139, 2131430984));
        this.h = gpr0Var;
        this.i = gpr0Var2;
        this.j = gpr0Var3;
        this.k = bitmap;
        this.l = j;
        this.m = z;
        this.n = z2;
    }

    @Override // p.dy81
    public final void d(ConstraintLayout constraintLayout) {
        this.o = b8k1.n(constraintLayout, 2131430984);
        this.f44p = b8k1.n(constraintLayout, 2131430983);
        this.q = b8k1.n(constraintLayout, 2131430985);
        this.r = (ImageView) b8k1.n(constraintLayout, 2131430982);
        ParagraphView paragraphView = this.o;
        if (paragraphView == null) {
            u890.C("titleView");
            throw null;
        }
        paragraphView.x(this.h);
        ParagraphView paragraphView2 = this.f44p;
        if (paragraphView2 == null) {
            u890.C("subtitleView");
            throw null;
        }
        paragraphView2.x(this.i);
        ParagraphView paragraphView3 = this.q;
        if (paragraphView3 == null) {
            u890.C("trackTitleView");
            throw null;
        }
        paragraphView3.x(this.j);
        ImageView imageView = this.r;
        if (imageView == null) {
            u890.C("imageView");
            throw null;
        }
        imageView.setImageBitmap(this.k);
        super.d(constraintLayout);
    }

    @Override // p.dy81
    public final n381 h(ConstraintLayout constraintLayout) {
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.setStartDelay(667L);
        ParagraphView paragraphView = this.o;
        if (paragraphView == null) {
            u890.C("titleView");
            throw null;
        }
        AnimatorSet animatorSetM = jon1.M(paragraphView);
        ParagraphView paragraphView2 = this.f44p;
        if (paragraphView2 == null) {
            u890.C("subtitleView");
            throw null;
        }
        AnimatorSet animatorSetM2 = jon1.M(paragraphView2);
        ParagraphView paragraphView3 = this.q;
        if (paragraphView3 == null) {
            u890.C("trackTitleView");
            throw null;
        }
        AnimatorSet animatorSetM3 = jon1.M(paragraphView3);
        ImageView imageView = this.r;
        if (imageView == null) {
            u890.C("imageView");
            throw null;
        }
        AnimatorSet animatorSetE = jon1.e(p7h.M(new AnimatorSet[]{animatorSetM, animatorSetM2, animatorSetM3, jon1.M(imageView)}), 0L, (TimeInterpolator) null, (Long) null, false, 30);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.setStartDelay(this.l);
        ParagraphView paragraphView4 = this.o;
        if (paragraphView4 == null) {
            u890.C("titleView");
            throw null;
        }
        AnimatorSet animatorSetN = jon1.N(paragraphView4);
        ParagraphView paragraphView5 = this.f44p;
        if (paragraphView5 == null) {
            u890.C("subtitleView");
            throw null;
        }
        AnimatorSet animatorSetN2 = jon1.N(paragraphView5);
        ParagraphView paragraphView6 = this.q;
        if (paragraphView6 == null) {
            u890.C("trackTitleView");
            throw null;
        }
        AnimatorSet animatorSetN3 = jon1.N(paragraphView6);
        ImageView imageView2 = this.r;
        if (imageView2 == null) {
            u890.C("imageView");
            throw null;
        }
        AnimatorSet animatorSetE2 = jon1.e(p7h.M(new AnimatorSet[]{animatorSetN, animatorSetN2, animatorSetN3, jon1.N(imageView2)}), 0L, (TimeInterpolator) null, (Long) null, false, 30);
        if (!this.n) {
            animatorSetE2 = null;
        }
        if (animatorSetE2 == null) {
            animatorSetE2 = new AnimatorSet();
        }
        animatorSet.playSequentially(animatorSet2, animatorSetE, animatorSet3, animatorSetE2);
        if (!this.m) {
            animatorSet = null;
        }
        if (animatorSet == null) {
            animatorSet = new AnimatorSet();
        }
        return new n381(animatorSet, new vr51(this, (byte) 12), (byte) 10);
    }
}
