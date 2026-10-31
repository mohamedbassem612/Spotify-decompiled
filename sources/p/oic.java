package p;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.campaigns.paragraph.view.ParagraphView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import java.util.Collections;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class oic extends dy81 {
    public final gpr0 h;
    public final Bitmap i;
    public final Bitmap j;
    public final hec k;
    public final boolean l;
    public final boolean m;
    public final llm n;
    public float o;

    public oic(gpr0 gpr0Var, Bitmap bitmap, Bitmap bitmap2, hec hecVar, boolean z, boolean z2) {
        super(new nj41(7000L), new f3a(2131624336, 2131428109));
        this.h = gpr0Var;
        this.i = bitmap;
        this.j = bitmap2;
        this.k = hecVar;
        this.l = z;
        this.m = z2;
        fns fnsVar = igu.a;
        bs50 bs50Var = pyf0.a;
        z8n z8nVar = new z8n("EntityTextButtonScene");
        bs50Var.getClass();
        this.n = smo1.e(flo1.l(bs50Var, z8nVar));
        this.o = 0.3f;
    }

    @Override // p.dy81
    public final void a() {
        super.a();
        op71.q(this.n.a, (CancellationException) null);
        this.o = 0.3f;
    }

    @Override // p.dy81
    public final n381 h(ConstraintLayout constraintLayout) {
        ParagraphView paragraphViewN = b8k1.n(constraintLayout, 2131428109);
        ImageView imageView = (ImageView) b8k1.n(constraintLayout, 2131428108);
        EncoreButton encoreButtonN = b8k1.n(constraintLayout, 2131428107);
        ImageView imageView2 = (ImageView) b8k1.n(constraintLayout, 2131428106);
        bpb1 bpb1VarB = gio1.b(Boolean.TRUE);
        fn31.T(this.n, (o8n) null, 0, new lic(this, null, (byte) 1), 3);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet animatorSetV = zno1.v(imageView, 0.0f, 1.0f, 667L, 0L, new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f));
        animatorSetV.addListener(new mic(imageView, (byte) 0));
        AnimatorSet animatorSet2 = new AnimatorSet();
        ObjectAnimator objectAnimatorD = zno1.D(imageView, zno1.i(30, imageView), 0.0f, 1000L, new PathInterpolator(0.6f, 0.0f, 0.0f, 1.0f));
        float fI = zno1.i(30, paragraphViewN);
        PathInterpolator pathInterpolator = new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(paragraphViewN, "translationY", fI, 0.0f);
        objectAnimatorOfFloat.setStartDelay(333L);
        objectAnimatorOfFloat.setDuration(667L);
        objectAnimatorOfFloat.setInterpolator(pathInterpolator);
        ObjectAnimator objectAnimatorL = zno1.l(paragraphViewN, 333L, new PathInterpolator(0.0f, 0.0f, 0.7f, 1.0f), 3);
        AnimatorSet animatorSetV2 = zno1.v(encoreButtonN, 0.5f, 1.05f, 333L, 466L, new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f));
        AnimatorSet animatorSetV3 = zno1.v(encoreButtonN, 1.05f, 1.0f, 333L, 800L, new PathInterpolator(0.3f, 0.0f, 0.0f, 1.0f));
        ValueAnimator valueAnimatorD = zno1.d(466L, new PathInterpolator(0.0f, 0.0f, 0.7f, 1.0f), Collections.singletonList(new h5k(cu9.d1, new ptb(this, (byte) 8), new iic(encoreButtonN, (byte) 1))));
        valueAnimatorD.addListener(new nic(encoreButtonN, (byte) 0));
        animatorSet2.playTogether(objectAnimatorD, objectAnimatorOfFloat, objectAnimatorL, animatorSetV2, animatorSetV3, valueAnimatorD);
        animatorSet2.addListener(new kic(bpb1VarB, (byte) 1));
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.setStartDelay(4200L);
        AnimatorSet animatorSet4 = new AnimatorSet();
        ObjectAnimator objectAnimatorM = zno1.m(imageView, 333L, 333L, new PathInterpolator(0.3f, 0.0f, 1.0f, 1.0f));
        ObjectAnimator objectAnimatorD2 = zno1.D(imageView, 0.0f, zno1.i(-30, imageView), 667L, new PathInterpolator(1.0f, 0.0f, 1.0f, 1.0f));
        ObjectAnimator objectAnimatorM2 = zno1.m(paragraphViewN, 333L, 333L, new PathInterpolator(0.3f, 0.0f, 1.0f, 1.0f));
        ObjectAnimator objectAnimatorD3 = zno1.D(paragraphViewN, 0.0f, zno1.i(-30, paragraphViewN), 667L, new PathInterpolator(1.0f, 0.0f, 1.0f, 1.0f));
        ValueAnimator valueAnimatorD2 = zno1.d(333L, new PathInterpolator(0.3f, 0.0f, 1.0f, 1.0f), Collections.singletonList(new h5k(new hic(encoreButtonN, (byte) 0), cu9.c1, new iic(encoreButtonN, (byte) 0))));
        valueAnimatorD2.addListener(new kic(bpb1VarB, (byte) 0));
        Animator[] animatorArr = {objectAnimatorM, objectAnimatorD2, objectAnimatorM2, objectAnimatorD3, valueAnimatorD2};
        AnimatorSet animatorSet5 = animatorSet4;
        animatorSet5.playTogether(animatorArr);
        animatorSet5.addListener(new jic(paragraphViewN, encoreButtonN, imageView, imageView2));
        if (!this.m) {
            animatorSet5 = null;
        }
        if (animatorSet5 == null) {
            animatorSet5 = new AnimatorSet();
        }
        animatorSet.playSequentially(animatorSetV, animatorSet2, animatorSet3, animatorSet5);
        if (!this.l) {
            animatorSet = new AnimatorSet();
        }
        return new n381(animatorSet, new a680(paragraphViewN, this, bpb1VarB, encoreButtonN, imageView, imageView2), (byte) 10);
    }
}
