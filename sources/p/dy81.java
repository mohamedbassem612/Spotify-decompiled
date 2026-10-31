package p;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.campaigns.paragraph.view.ParagraphView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class dy81 extends zda {
    public final nj41 e;
    public ConstraintLayout f;
    public n381 g;

    public dy81(nj41 nj41Var, f3a f3aVar) {
        super(f3aVar);
        this.e = nj41Var;
    }

    public void a() {
        super.a();
        n381 n381Var = this.g;
        if (n381Var != null) {
            oon1.u((Animator) n381Var.b);
        }
        this.g = null;
        this.f = null;
    }

    public final pj41 b() {
        return this.e;
    }

    public void d(ConstraintLayout constraintLayout) {
        n381 n381VarH = h(constraintLayout);
        ((Animator) n381VarH.b).addListener(new otd(this, (byte) 8));
        this.g = n381VarH;
        this.f = constraintLayout;
    }

    public void e() {
        n381 n381Var = this.g;
        if (n381Var != null) {
            ((Animator) n381Var.b).pause();
        }
    }

    public void f(uk41 uk41Var) {
        ((zda) this).d = uk41Var;
        n381 n381Var = this.g;
        if (n381Var != null) {
            ((cy81) n381Var.c).z();
            ConstraintLayout constraintLayout = this.f;
            if (constraintLayout != null) {
                aiq0.a(constraintLayout, new jyh0(constraintLayout, n381Var, (byte) 22));
            }
        }
    }

    public void g() {
        n381 n381Var = this.g;
        if (n381Var != null) {
            ((Animator) n381Var.b).resume();
        }
    }

    public n381 h(ConstraintLayout constraintLayout) {
        ImageView imageView = (ImageView) b8k1.n(constraintLayout, 2131427771);
        ParagraphView paragraphViewN = b8k1.n(constraintLayout, 2131427773);
        ParagraphView paragraphViewN2 = b8k1.n(constraintLayout, 2131427772);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet animatorSetE = jon1.E(imageView, new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f));
        ObjectAnimator objectAnimatorL = jon1.L(imageView, jon1.j(178, imageView), 0.0f, 1000L, 667L, new PathInterpolator(0.6f, 0.0f, 0.0f, 1.0f));
        AnimatorSet animatorSetI = f2c.i(paragraphViewN, 1000L);
        AnimatorSet animatorSetI2 = f2c.i(paragraphViewN2, 1067L);
        Float fValueOf = Float.valueOf(17.0f);
        ObjectAnimator objectAnimatorL2 = jon1.L(imageView, 0.0f, jon1.j(fValueOf, imageView), 667L, 1734L, new PathInterpolator(0.99f, 1.0f, 0.221f, 0.0f));
        ObjectAnimator objectAnimatorL3 = jon1.L(imageView, jon1.j(fValueOf, imageView), 0.0f, 633L, 0L, new PathInterpolator(1.0f, 1.0f, 0.315f, 0.0f));
        ObjectAnimator objectAnimatorL4 = jon1.L(imageView, 0.0f, jon1.j(Float.valueOf(15.0f), imageView), 1033L, 0L, new PathInterpolator(0.563f, 1.0f, 0.614f, 0.0f));
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playSequentially(objectAnimatorL2, objectAnimatorL3, objectAnimatorL4);
        animatorSet.playTogether(animatorSetE, objectAnimatorL, animatorSetI, animatorSetI2, animatorSet2);
        return new n381(animatorSet, new fta(imageView, this, paragraphViewN, paragraphViewN2, (byte) 9), (byte) 10);
    }
}
