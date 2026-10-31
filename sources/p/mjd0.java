package p;

import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.campaigns.paragraph.view.ParagraphView;
import com.spotify.culturalmoments.uiusecases.common.PremiumLabelView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mjd0 extends dy81 {
    public final gpr0 h;
    public final gpr0 i;
    public final gpr0 j;
    public final gpr0 k;
    public final gpr0 l;
    public final gpr0 m;
    public final Bitmap n;
    public final Bitmap o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Bitmap f18p;
    public final Bitmap q;
    public final String r;
    public final String s;
    public final gpr0 t;
    public final boolean u;

    public mjd0(gpr0 gpr0Var, gpr0 gpr0Var2, gpr0 gpr0Var3, gpr0 gpr0Var4, gpr0 gpr0Var5, gpr0 gpr0Var6, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, Bitmap bitmap4, String str, String str2, gpr0 gpr0Var7, boolean z) {
        super(new nj41(5667L), new f3a(2131625144, 2131429871));
        this.h = gpr0Var;
        this.i = gpr0Var2;
        this.j = gpr0Var3;
        this.k = gpr0Var4;
        this.l = gpr0Var5;
        this.m = gpr0Var6;
        this.n = bitmap;
        this.o = bitmap2;
        this.f18p = bitmap3;
        this.q = bitmap4;
        this.r = str;
        this.s = str2;
        this.t = gpr0Var7;
        this.u = z;
    }

    public static void i(ParagraphView paragraphView, gpr0 gpr0Var, int i) {
        ipr0 ipr0Var = gpr0Var.a;
        paragraphView.x(who1.x(i, Integer.valueOf(ipr0Var.c), ipr0Var.a));
    }

    @Override // p.dy81
    public final void d(ConstraintLayout constraintLayout) {
        super.d(constraintLayout);
        ParagraphView paragraphViewN = b8k1.n(constraintLayout, 2131429865);
        ParagraphView paragraphViewN2 = b8k1.n(constraintLayout, 2131429870);
        b8k1.n(constraintLayout, 2131429868).setContentDescription(this.s);
        b8k1.n(constraintLayout, 2131429877).x(this.h);
        paragraphViewN.x(this.i);
        paragraphViewN2.x(this.j);
        b8k1.n(constraintLayout, 2131429874).x(this.k);
        b8k1.n(constraintLayout, 2131429872).x(this.l);
        b8k1.n(constraintLayout, 2131429873).x(this.m);
        ImageView imageView = (ImageView) b8k1.n(constraintLayout, 2131429869);
        imageView.setClipToOutline(true);
        imageView.setImageBitmap(this.n);
        ImageView imageView2 = (ImageView) b8k1.n(constraintLayout, 2131429878);
        imageView2.setClipToOutline(true);
        imageView2.setImageBitmap(this.q);
        ImageView imageView3 = (ImageView) b8k1.n(constraintLayout, 2131429876);
        imageView3.setClipToOutline(true);
        imageView3.setImageBitmap(this.o);
        ImageView imageView4 = (ImageView) b8k1.n(constraintLayout, 2131429867);
        imageView4.setClipToOutline(true);
        imageView4.setImageBitmap(this.f18p);
        b8k1.n(constraintLayout, 2131431100).x(this.t);
        ((PremiumLabelView) b8k1.n(constraintLayout, 2131429875)).setText(this.r);
        paragraphViewN.getViewTreeObserver().addOnGlobalLayoutListener(new pq00(paragraphViewN, this, paragraphViewN2, (byte) 2));
    }

    @Override // p.dy81
    public final n381 h(ConstraintLayout constraintLayout) {
        AnimatorSet animatorSet;
        ConstraintLayout constraintLayoutN = b8k1.n(constraintLayout, 2131429871);
        boolean z = this.u;
        if (z) {
            animatorSet = new AnimatorSet();
            AnimatorSet animatorSetM = jon1.M(constraintLayoutN);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.setStartDelay(4333L);
            jon1.N(constraintLayoutN);
            animatorSet.playSequentially(animatorSetM, animatorSet2, new AnimatorSet());
        } else {
            animatorSet = new AnimatorSet();
        }
        return new n381(animatorSet, new mk41(constraintLayoutN, z, (byte) 0), (byte) 10);
    }
}
