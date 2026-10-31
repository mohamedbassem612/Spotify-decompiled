package p;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.os.Build;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.spotify.campaigns.paragraph.view.ParagraphView;
import com.spotify.culturalmoments.uiusecases.common.PremiumLabelView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.card.EncoreCard;
import java.util.Collections;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nn30 extends dy81 {
    public ConstraintLayout A;
    public ConstraintLayout B;
    public EncoreButton C;
    public ParagraphView D;
    public final Activity h;
    public final Bitmap i;
    public final Bitmap j;
    public final Bitmap k;
    public final gpr0 l;
    public final gpr0 m;
    public final gpr0 n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Bitmap f21p;
    public final Bitmap q;
    public final hec r;
    public final boolean s;
    public final String t;
    public final gpr0 u;
    public final gpr0 v;
    public final gpr0 w;
    public final long x;
    public final llm y;
    public float z;

    public nn30(Activity activity, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, gpr0 gpr0Var, gpr0 gpr0Var2, gpr0 gpr0Var3, String str, Bitmap bitmap4, Bitmap bitmap5, hec hecVar, boolean z, String str2, gpr0 gpr0Var4, gpr0 gpr0Var5, gpr0 gpr0Var6, long j) {
        super(new nj41(2668 + j), new f3a(2131624704, 2131428972));
        this.h = activity;
        this.i = bitmap;
        this.j = bitmap2;
        this.k = bitmap3;
        this.l = gpr0Var;
        this.m = gpr0Var2;
        this.n = gpr0Var3;
        this.o = str;
        this.f21p = bitmap4;
        this.q = bitmap5;
        this.r = hecVar;
        this.s = z;
        this.t = str2;
        this.u = gpr0Var4;
        this.v = gpr0Var5;
        this.w = gpr0Var6;
        this.x = j;
        fns fnsVar = igu.a;
        bs50 bs50Var = pyf0.a;
        z8n z8nVar = new z8n("FreemiumScene");
        bs50Var.getClass();
        this.y = smo1.e(flo1.l(bs50Var, z8nVar));
        this.z = 0.3f;
    }

    @Override // p.dy81
    public final void a() {
        super.a();
        op71.q(this.y.a, (CancellationException) null);
        this.z = 0.0f;
    }

    @Override // p.dy81
    public final void d(ConstraintLayout constraintLayout) {
        ImageView imageView = (ImageView) b8k1.n(constraintLayout, 2131427895);
        ImageView imageView2 = (ImageView) b8k1.n(constraintLayout, 2131427898);
        ImageView imageView3 = (ImageView) b8k1.n(constraintLayout, 2131427904);
        ImageView imageView4 = (ImageView) b8k1.n(constraintLayout, 2131430268);
        PremiumLabelView premiumLabelView = (PremiumLabelView) b8k1.n(constraintLayout, 2131427906);
        ParagraphView paragraphViewN = b8k1.n(constraintLayout, 2131430758);
        ParagraphView paragraphViewN2 = b8k1.n(constraintLayout, 2131430757);
        this.D = b8k1.n(constraintLayout, 2131428178);
        this.C = b8k1.n(constraintLayout, 2131428972);
        MaterialCardView materialCardViewFindViewById = constraintLayout.findViewById(2131427905);
        EncoreCard encoreCard = materialCardViewFindViewById instanceof EncoreCard ? (EncoreCard) materialCardViewFindViewById : null;
        if (encoreCard == null) {
            eg.m("View with ID card_main_image_overlay not found");
            return;
        }
        this.A = b8k1.n(constraintLayout, 2131427897);
        this.B = b8k1.n(constraintLayout, 2131429944);
        if (jon1.w(this.h)) {
            ParagraphView paragraphViewN3 = b8k1.n(constraintLayout, 2131427902);
            ParagraphView paragraphViewN4 = b8k1.n(constraintLayout, 2131427910);
            ParagraphView paragraphViewN5 = b8k1.n(constraintLayout, 2131427900);
            paragraphViewN3.x(this.l);
            paragraphViewN5.x(this.n);
            paragraphViewN4.x(this.m);
        }
        premiumLabelView.setText(this.t);
        imageView.setImageBitmap(this.i);
        imageView.setClipToOutline(true);
        imageView2.setImageBitmap(this.j);
        imageView2.setClipToOutline(true);
        String str = this.o;
        if (str.length() > 0 && Build.VERSION.SDK_INT >= 31) {
            imageView3.setImageBitmap(this.k);
            imageView3.setRenderEffect(RenderEffect.createBlurEffect(25.0f, 25.0f, Shader.TileMode.MIRROR));
            encoreCard.setCardForegroundColor(ColorStateList.valueOf(Color.parseColor(str)));
        } else if (str.length() > 0) {
            imageView3.setImageBitmap(this.f21p);
        }
        imageView4.setImageBitmap(this.q);
        imageView3.setClipToOutline(true);
        paragraphViewN.x(this.u);
        paragraphViewN2.x(this.v);
        ParagraphView paragraphView = this.D;
        if (paragraphView == null) {
            u890.C("termsAndConditionsView");
            throw null;
        }
        paragraphView.x(this.w);
        super.d(constraintLayout);
    }

    @Override // p.dy81
    public final n381 h(ConstraintLayout constraintLayout) {
        bpb1 bpb1VarB = gio1.b(Boolean.TRUE);
        fn31.T(this.y, (o8n) null, 0, new mn30(this, null, (byte) 1), 3);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.setStartDelay(667L);
        AnimatorSet animatorSet3 = new AnimatorSet();
        ConstraintLayout constraintLayout2 = this.A;
        if (constraintLayout2 == null) {
            u890.C("cardContainer");
            throw null;
        }
        AnimatorSet animatorSetM = jon1.M(constraintLayout2);
        ConstraintLayout constraintLayout3 = this.B;
        if (constraintLayout3 == null) {
            u890.C("labelsContainer");
            throw null;
        }
        animatorSet3.playTogether(animatorSetM, jon1.M(constraintLayout3));
        AnimatorSet animatorSet4 = new AnimatorSet();
        EncoreButton encoreButton = this.C;
        if (encoreButton == null) {
            u890.C("sceneButton");
            throw null;
        }
        AnimatorSet animatorSetM2 = jon1.M(encoreButton);
        ParagraphView paragraphView = this.D;
        if (paragraphView == null) {
            u890.C("termsAndConditionsView");
            throw null;
        }
        AnimatorSet animatorSetM3 = jon1.M(paragraphView);
        ValueAnimator valueAnimatorH = jon1.h(0L, 667L, new PathInterpolator(0.0f, 0.0f, 0.7f, 1.0f), Collections.singletonList(new i5k(bc30.f, new f710(this, (byte) 20), new u830(this, (byte) 6))));
        valueAnimatorH.addListener(new otd(this, (byte) 5));
        animatorSet4.playTogether(animatorSetM2, animatorSetM3, valueAnimatorH);
        animatorSet4.addListener(new kic(bpb1VarB, (byte) 4));
        AnimatorSet animatorSet5 = new AnimatorSet();
        animatorSet5.setStartDelay(this.x);
        ConstraintLayout constraintLayout4 = this.A;
        if (constraintLayout4 == null) {
            u890.C("cardContainer");
            throw null;
        }
        AnimatorSet animatorSetN = jon1.N(constraintLayout4);
        ConstraintLayout constraintLayout5 = this.B;
        if (constraintLayout5 == null) {
            u890.C("labelsContainer");
            throw null;
        }
        AnimatorSet animatorSetN2 = jon1.N(constraintLayout5);
        EncoreButton encoreButton2 = this.C;
        if (encoreButton2 == null) {
            u890.C("sceneButton");
            throw null;
        }
        AnimatorSet animatorSetN3 = jon1.N(encoreButton2);
        ParagraphView paragraphView2 = this.D;
        if (paragraphView2 == null) {
            u890.C("termsAndConditionsView");
            throw null;
        }
        jon1.e(p7h.M(new AnimatorSet[]{animatorSetN, animatorSetN2, animatorSetN3, jon1.N(paragraphView2)}), 0L, (TimeInterpolator) null, 667L, this.s, 6);
        animatorSet.playSequentially(animatorSet2, animatorSet3, animatorSet4, animatorSet5, new AnimatorSet());
        AnimatorSet animatorSet6 = this.s ? animatorSet : null;
        if (animatorSet6 == null) {
            animatorSet6 = new AnimatorSet();
        }
        return new n381(animatorSet6, new w2z(bpb1VarB, this, (byte) 29), (byte) 10);
    }
}
