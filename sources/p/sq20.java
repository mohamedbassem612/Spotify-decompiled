package p;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.graphics.Bitmap;
import android.view.View;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.campaigns.paragraph.view.ParagraphView;
import com.spotify.culturalmoments.uiusecases.common.PremiumLabelView;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sq20 extends dy81 {
    public final long A;
    public final boolean B;
    public final boolean C;
    public uoa D;
    public ConstraintLayout E;
    public ConstraintLayout F;
    public ConstraintLayout G;
    public ConstraintLayout H;
    public ConstraintLayout I;
    public ParagraphView J;
    public final woa h;
    public final kma i;
    public final gpr0 j;
    public final gpr0 k;
    public final Bitmap l;
    public final Bitmap m;
    public final String n;
    public final Bitmap o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Bitmap f39p;
    public final Bitmap q;
    public final gpr0 r;
    public final gpr0 s;
    public final gpr0 t;
    public final gpr0 u;
    public final gpr0 v;
    public final gpr0 w;
    public final gpr0 x;
    public final String y;
    public final String z;

    public sq20(woa woaVar, kma kmaVar, gpr0 gpr0Var, gpr0 gpr0Var2, Bitmap bitmap, Bitmap bitmap2, String str, Bitmap bitmap3, Bitmap bitmap4, Bitmap bitmap5, gpr0 gpr0Var3, gpr0 gpr0Var4, gpr0 gpr0Var5, gpr0 gpr0Var6, gpr0 gpr0Var7, gpr0 gpr0Var8, gpr0 gpr0Var9, String str2, String str3, long j, boolean z, boolean z2) {
        super(new nj41((z2 ? 3668L : 3001L) + j), new f3a(2131624651, 2131427425));
        this.h = woaVar;
        this.i = kmaVar;
        this.j = gpr0Var;
        this.k = gpr0Var2;
        this.l = bitmap;
        this.m = bitmap2;
        this.n = str;
        this.o = bitmap3;
        this.f39p = bitmap4;
        this.q = bitmap5;
        this.r = gpr0Var3;
        this.s = gpr0Var4;
        this.t = gpr0Var5;
        this.u = gpr0Var6;
        this.v = gpr0Var7;
        this.w = gpr0Var8;
        this.x = gpr0Var9;
        this.y = str2;
        this.z = str3;
        this.A = j;
        this.B = z;
        this.C = z2;
    }

    public static AnimatorSet i(View view, long j) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(jon1.n(view, 0.0f, 333L, 333L, new PathInterpolator(0.3f, 0.0f, 1.0f, 1.0f), 3), jon1.L(view, 0.0f, jon1.j(Long.valueOf(-j), view), 667L, 0L, new PathInterpolator(1.0f, 0.0f, 1.0f, 1.0f)));
        animatorSet.addListener(new nly(view, (byte) 1));
        return animatorSet;
    }

    @Override // p.dy81
    public final void a() {
        super.a();
        uoa uoaVar = this.D;
        if (uoaVar != null) {
            uoaVar.i();
            this.h.c(uoaVar);
        }
    }

    @Override // p.dy81
    public final void d(ConstraintLayout constraintLayout) {
        this.E = b8k1.n(constraintLayout, 2131429943);
        this.F = b8k1.n(constraintLayout, 2131429936);
        ImageView imageView = (ImageView) b8k1.n(constraintLayout, 2131429934);
        ImageView imageView2 = (ImageView) b8k1.n(constraintLayout, 2131429937);
        VideoSurfaceView videoSurfaceViewN = b8k1.n(constraintLayout, 2131429951);
        ParagraphView paragraphViewN = b8k1.n(constraintLayout, 2131429946);
        ParagraphView paragraphViewN2 = b8k1.n(constraintLayout, 2131429945);
        this.G = b8k1.n(constraintLayout, 2131429944);
        imageView.setImageBitmap(this.l);
        imageView.setClipToOutline(true);
        imageView2.setClipToOutline(true);
        paragraphViewN.x(this.j);
        paragraphViewN2.x(this.k);
        imageView2.setImageBitmap(this.m);
        String str = this.n;
        if (str != null && str.length() != 0) {
            videoSurfaceViewN.setScaleType(b3k1.c);
            videoSurfaceViewN.setClipToOutline(true);
            uoa uoaVarA = woa.a(this.h, "fandomcollectibles-stories-video-content", (o2u0) null, (w2k1) null, this.i, Collections.singletonList(new cv7(imageView2, (byte) 5)), false, (bas) null, (sn10) null, 998);
            uoaVarA.p(2);
            uoaVarA.q(true);
            this.D = uoaVarA;
            uoaVarA.d(videoSurfaceViewN);
        }
        this.H = b8k1.n(constraintLayout, 2131427435);
        this.I = b8k1.n(constraintLayout, 2131427425);
        ImageView imageView3 = (ImageView) b8k1.n(constraintLayout, 2131427424);
        ImageView imageView4 = (ImageView) b8k1.n(constraintLayout, 2131427426);
        this.J = b8k1.n(constraintLayout, 2131427431);
        ImageView imageView5 = (ImageView) b8k1.n(constraintLayout, 2131427432);
        ParagraphView paragraphViewN3 = b8k1.n(constraintLayout, 2131427430);
        ParagraphView paragraphViewN4 = b8k1.n(constraintLayout, 2131427438);
        ParagraphView paragraphViewN5 = b8k1.n(constraintLayout, 2131427436);
        ParagraphView paragraphViewN6 = b8k1.n(constraintLayout, 2131427434);
        ParagraphView paragraphViewN7 = b8k1.n(constraintLayout, 2131427429);
        ParagraphView paragraphViewN8 = b8k1.n(constraintLayout, 2131427428);
        PremiumLabelView premiumLabelView = (PremiumLabelView) b8k1.n(constraintLayout, 2131427433);
        imageView3.setImageBitmap(this.f39p);
        imageView3.setClipToOutline(true);
        imageView4.setImageBitmap(this.o);
        imageView4.setClipToOutline(true);
        ParagraphView paragraphView = this.J;
        if (paragraphView == null) {
            u890.C("achievementLabelView");
            throw null;
        }
        paragraphView.x(this.r);
        imageView5.setImageBitmap(this.q);
        imageView5.setClipToOutline(true);
        paragraphViewN3.x(this.s);
        paragraphViewN4.x(this.t);
        paragraphViewN5.x(this.u);
        paragraphViewN6.x(this.v);
        paragraphViewN7.x(this.w);
        paragraphViewN8.x(this.x);
        premiumLabelView.setText(this.y);
        ConstraintLayout constraintLayout2 = this.I;
        if (constraintLayout2 == null) {
            u890.C("achievementCardContainer");
            throw null;
        }
        constraintLayout2.setContentDescription(this.z);
        super.d(constraintLayout);
    }

    @Override // p.dy81
    public final void e() {
        super.e();
        uoa uoaVar = this.D;
        if (uoaVar != null) {
            uoaVar.f();
        }
    }

    @Override // p.dy81
    public final void f(uk41 uk41Var) {
        uoa uoaVar;
        super.f(uk41Var);
        String str = this.n;
        if (str == null || (uoaVar = this.D) == null) {
            return;
        }
        uoaVar.h(new o2u0(str, 14, (Map) null), new oot0(0L, 0L, true, false, (hu7) null, (tne1) null, false, 251));
    }

    @Override // p.dy81
    public final void g() {
        super.g();
        uoa uoaVar = this.D;
        if (uoaVar != null) {
            uoaVar.l();
        }
    }

    @Override // p.dy81
    public final n381 h(ConstraintLayout constraintLayout) {
        ConstraintLayout constraintLayout2 = this.F;
        if (constraintLayout2 == null) {
            u890.C("mediaContainer");
            throw null;
        }
        ConstraintLayout constraintLayout3 = this.I;
        if (constraintLayout3 == null) {
            u890.C("achievementCardContainer");
            throw null;
        }
        rl1 rl1Var = new rl1(constraintLayout2, constraintLayout3, new ntd(), this.B, (byte) 7);
        ConstraintLayout constraintLayout4 = this.E;
        if (constraintLayout4 == null) {
            u890.C("mediaSceneContainer");
            throw null;
        }
        AnimatorSet animatorSetE = jon1.e(Collections.singletonList(jon1.M(constraintLayout4)), 0L, (TimeInterpolator) null, (Long) null, this.B, 14);
        ConstraintLayout constraintLayout5 = this.G;
        if (constraintLayout5 == null) {
            u890.C("mediaLabelsContainer");
            throw null;
        }
        List listSingletonList = Collections.singletonList(i(constraintLayout5, 15L));
        long j = this.A / 2;
        AnimatorSet animatorSetE2 = jon1.e(listSingletonList, j, (TimeInterpolator) null, (Long) null, this.B, 12);
        AnimatorSet animatorSetV = rl1Var.v(0L);
        AnimatorSet animatorSetG = rl1Var.G();
        animatorSetG.addListener(new otd(this, (byte) 4));
        ParagraphView paragraphView = this.J;
        if (paragraphView == null) {
            u890.C("achievementLabelView");
            throw null;
        }
        AnimatorSet animatorSetE3 = jon1.e(Collections.singletonList(jon1.M(paragraphView)), 0L, (TimeInterpolator) null, (Long) null, this.B, 14);
        ConstraintLayout constraintLayout6 = this.H;
        if (constraintLayout6 == null) {
            u890.C("achievementSceneContainer");
            throw null;
        }
        AnimatorSet animatorSetE4 = this.C ? jon1.e(Collections.singletonList(i(constraintLayout6, 30L)), j, (TimeInterpolator) null, (Long) null, this.B, 12) : null;
        if (animatorSetE4 == null) {
            animatorSetE4 = new AnimatorSet();
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(animatorSetE, animatorSetE2, animatorSetV, animatorSetG, animatorSetE3, animatorSetE4);
        return new n381(animatorSet, new mev((Object) this, (byte) 17), (byte) 10);
    }
}
