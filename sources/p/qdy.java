package p;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.campaigns.paragraph.view.ParagraphView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qdy extends dy81 {
    public final gpr0 h;
    public final gpr0 i;
    public final gpr0 j;
    public final Bitmap k;
    public final hec l;
    public final long m;
    public final boolean n;
    public final llm o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f31p;

    public qdy(gpr0 gpr0Var, gpr0 gpr0Var2, gpr0 gpr0Var3, Bitmap bitmap, hec hecVar, long j, boolean z) {
        super(new nj41(2800 + j), new f3a(2131624588, 2131428679));
        this.h = gpr0Var;
        this.i = gpr0Var2;
        this.j = gpr0Var3;
        this.k = bitmap;
        this.l = hecVar;
        this.m = j;
        this.n = z;
        fns fnsVar = igu.a;
        bs50 bs50Var = pyf0.a;
        z8n z8nVar = new z8n("EntityButtonScene");
        bs50Var.getClass();
        this.o = smo1.e(flo1.l(bs50Var, z8nVar));
        this.f31p = 0.3f;
    }

    @Override // p.dy81
    public final void a() {
        super.a();
        op71.q(this.o.a, (CancellationException) null);
        this.f31p = 0.3f;
    }

    @Override // p.dy81
    public final n381 h(ConstraintLayout constraintLayout) {
        EncoreButton encoreButton;
        AnimatorSet animatorSet;
        Float fValueOf = Float.valueOf(0.7f);
        Float fValueOf2 = Float.valueOf(1.0f);
        ParagraphView paragraphViewN = b8k1.n(constraintLayout, 2131428680);
        ParagraphView paragraphViewN2 = b8k1.n(constraintLayout, 2131428679);
        ParagraphView paragraphViewN3 = b8k1.n(constraintLayout, 2131428677);
        ImageView imageView = (ImageView) b8k1.n(constraintLayout, 2131428678);
        EncoreButton encoreButtonN = b8k1.n(constraintLayout, 2131428676);
        bpb1 bpb1VarB = gio1.b(Boolean.TRUE);
        fn31.T(this.o, (o8n) null, 0, new ndy(this, null, (byte) 1), 3);
        if (this.n) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            AnimatorSet animatorSetE = jon1.E(imageView, new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f));
            animatorSetE.addListener(new mic(imageView, (byte) 1));
            AnimatorSet animatorSet3 = new AnimatorSet();
            c8b1 c8b1Var = new c8b1(5);
            ImageView imageView2 = imageView;
            Integer num = 30;
            c8b1Var.a(jon1.L(imageView2, jon1.j(30, imageView), 0.0f, 1000L, 0L, new PathInterpolator(0.6f, 0.0f, 0.0f, 1.0f)));
            List<mmr0> listM = p7h.M(new mmr0[]{new mmr0(paragraphViewN, fValueOf2), new mmr0(paragraphViewN2, fValueOf2), new mmr0(paragraphViewN3, fValueOf)});
            ArrayList arrayList = new ArrayList();
            for (mmr0 mmr0Var : listM) {
                TextView textView = (TextView) mmr0Var.a;
                r7h.W(p7h.M(new Animator[]{jon1.L(textView, jon1.j(num, textView), 0.0f, 667L, 333L, new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f)), jon1.m(textView, ((Number) mmr0Var.b).floatValue(), 333L, 333L, new PathInterpolator(0.0f, 0.0f, 0.7f, 1.0f), 1)}), arrayList);
                num = num;
                imageView2 = imageView2;
            }
            ImageView imageView3 = imageView2;
            c8b1Var.b(arrayList.toArray(new Animator[0]));
            c8b1Var.a(jon1.D(encoreButtonN, 0.5f, 1.05f, 333L, 466L, new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f)));
            c8b1Var.a(jon1.D(encoreButtonN, 1.05f, 1.0f, 333L, 800L, new PathInterpolator(0.3f, 0.0f, 0.0f, 1.0f)));
            ValueAnimator valueAnimatorH = jon1.h(466L, 333L, new PathInterpolator(0.0f, 0.0f, 0.7f, 1.0f), Collections.singletonList(new i5k(oxx.g, new pdy(this, (byte) 0), new iic(encoreButtonN, (byte) 3))));
            valueAnimatorH.addListener(new nic(encoreButtonN, (byte) 1));
            c8b1Var.a(valueAnimatorH);
            ArrayList arrayList2 = c8b1Var.a;
            animatorSet3.playTogether((Animator[]) arrayList2.toArray(new Animator[arrayList2.size()]));
            animatorSet3.addListener(new kic(bpb1VarB, (byte) 3));
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.setStartDelay(this.m);
            c8b1 c8b1Var2 = new c8b1(4);
            c8b1Var2.a(jon1.n(imageView3, 0.0f, 333L, 333L, new PathInterpolator(0.3f, 0.0f, 1.0f, 1.0f), 3));
            c8b1Var2.a(jon1.L(imageView3, 0.0f, jon1.j(-30, imageView3), 667L, 0L, new PathInterpolator(1.0f, 0.0f, 1.0f, 1.0f)));
            List<mmr0> listM2 = p7h.M(new mmr0[]{new mmr0(paragraphViewN, fValueOf2), new mmr0(paragraphViewN2, fValueOf2), new mmr0(paragraphViewN3, fValueOf)});
            ArrayList arrayList3 = new ArrayList();
            for (mmr0 mmr0Var2 : listM2) {
                TextView textView2 = (TextView) mmr0Var2.a;
                r7h.W(p7h.M(new Animator[]{jon1.n(textView2, ((Number) mmr0Var2.b).floatValue(), 333L, 333L, new PathInterpolator(0.3f, 0.0f, 1.0f, 1.0f), 2), jon1.L(textView2, 0.0f, jon1.j(-30, textView2), 667L, 0L, new PathInterpolator(1.0f, 0.0f, 1.0f, 1.0f))}), arrayList3);
            }
            c8b1Var2.b(arrayList3.toArray(new Animator[0]));
            ValueAnimator valueAnimatorH2 = jon1.h(333L, 333L, new PathInterpolator(0.3f, 0.0f, 1.0f, 1.0f), Collections.singletonList(new i5k(new hic(encoreButtonN, (byte) 1), oxx.f, new iic(encoreButtonN, (byte) 2))));
            valueAnimatorH2.addListener(new kic(bpb1VarB, (byte) 2));
            c8b1Var2.a(valueAnimatorH2);
            ArrayList arrayList4 = c8b1Var2.a;
            animatorSet4.playTogether((Animator[]) arrayList4.toArray(new Animator[arrayList4.size()]));
            animatorSet2.playSequentially(animatorSetE, animatorSet3, animatorSet4);
            encoreButton = encoreButtonN;
            imageView = imageView3;
            animatorSet2.addListener(new ody(paragraphViewN, paragraphViewN2, paragraphViewN3, encoreButtonN, imageView3, (byte) 0));
            animatorSet = animatorSet2;
        } else {
            encoreButton = encoreButtonN;
            animatorSet = new AnimatorSet();
        }
        return new n381(animatorSet, new goq(paragraphViewN, paragraphViewN2, paragraphViewN3, this, bpb1VarB, encoreButton, imageView, (byte) 22), (byte) 10);
    }
}
