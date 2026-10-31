package p;

import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.campaigns.paragraph.view.ParagraphView;
import com.spotify.culturalmoments.uiusecases.common.PremiumLabelView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yn10 extends dy81 {
    public final vn10 h;
    public final Bitmap i;
    public final String j;
    public final Bitmap k;
    public final gpr0 l;
    public final gpr0 m;
    public final boolean n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f51p;

    public yn10(vn10 vn10Var, Bitmap bitmap, String str, Bitmap bitmap2, gpr0 gpr0Var, gpr0 gpr0Var2, boolean z, boolean z2, long j) {
        super(new nj41((z2 ? 1334L : 667L) + j), new f3a(2131624638, 2131427903));
        this.h = vn10Var;
        this.i = bitmap;
        this.j = str;
        this.k = bitmap2;
        this.l = gpr0Var;
        this.m = gpr0Var2;
        this.n = z;
        this.o = z2;
        this.f51p = j;
    }

    @Override // p.dy81
    public final void a() {
        super.a();
        this.h.a().dispose();
    }

    @Override // p.dy81
    public final void d(ConstraintLayout constraintLayout) {
        super.d(constraintLayout);
        ImageView imageView = (ImageView) b8k1.n(constraintLayout, 2131427894);
        ImageView imageView2 = (ImageView) b8k1.n(constraintLayout, 2131427903);
        ImageView imageView3 = (ImageView) b8k1.n(constraintLayout, 2131430402);
        ParagraphView paragraphViewN = b8k1.n(constraintLayout, 2131427911);
        ParagraphView paragraphViewN2 = b8k1.n(constraintLayout, 2131427909);
        PremiumLabelView premiumLabelView = (PremiumLabelView) b8k1.n(constraintLayout, 2131430472);
        vn10 vn10Var = this.h;
        View viewK = vn10Var.a().k(constraintLayout);
        qhl qhlVar = new qhl(0, 0);
        qhlVar.t = 0;
        qhlVar.v = 0;
        qhlVar.i = 0;
        qhlVar.l = 0;
        viewK.setLayoutParams(qhlVar);
        if (viewK.getParent() != null) {
            ((ViewGroup) viewK.getParent()).removeView(viewK);
        }
        constraintLayout.addView(viewK, 0);
        imageView.setImageBitmap(this.k);
        boolean z = true;
        imageView.setClipToOutline(true);
        imageView2.setImageBitmap(this.i);
        imageView2.setClipToOutline(true);
        switch (vn10Var.a) {
            case 0:
                z = false;
                break;
        }
        imageView3.setVisibility(z ? 0 : 8);
        paragraphViewN.x(this.l);
        paragraphViewN2.x(this.m);
        premiumLabelView.setText(this.j);
    }

    @Override // p.dy81
    public final void e() {
        super.e();
        this.h.a().a();
    }

    @Override // p.dy81
    public final void f(uk41 uk41Var) {
        super.f(uk41Var);
        this.h.a().j();
    }

    @Override // p.dy81
    public final void g() {
        super.g();
        this.h.a().d();
    }

    @Override // p.dy81
    public final n381 h(ConstraintLayout constraintLayout) {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2;
        ConstraintLayout constraintLayoutN = b8k1.n(constraintLayout, 2131428852);
        boolean z = this.n;
        if (z) {
            animatorSet = new AnimatorSet();
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(zno1.l(constraintLayoutN, 667L, new PathInterpolator(0.0f, 0.0f, 0.7f, 1.0f), 11), zno1.D(constraintLayoutN, zno1.i(30, constraintLayoutN), 0.0f, 667L, new PathInterpolator(0.6f, 0.0f, 0.0f, 1.0f)));
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.setStartDelay(this.f51p);
            AnimatorSet animatorSet5 = new AnimatorSet();
            animatorSet5.playTogether(zno1.m(constraintLayoutN, 333L, 333L, new PathInterpolator(0.3f, 0.0f, 1.0f, 1.0f)), zno1.D(constraintLayoutN, 0.0f, zno1.i(-30, constraintLayoutN), 667L, new PathInterpolator(1.0f, 0.0f, 1.0f, 1.0f)));
            animatorSet5.addListener(new otd(constraintLayoutN, (byte) 7));
            if (!this.o) {
                animatorSet2 = null;
            }
            if (animatorSet2 == null) {
                animatorSet2 = animatorSet5;
                animatorSet2 = new AnimatorSet();
            }
            animatorSet2 = animatorSet5;
            animatorSet.playSequentially(animatorSet3, animatorSet4, animatorSet2);
        } else {
            animatorSet = new AnimatorSet();
        }
        return new n381(animatorSet, new mk41(constraintLayoutN, z, (byte) 1), (byte) 10);
    }
}
