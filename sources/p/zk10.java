package p;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.campaigns.paragraph.view.ParagraphView;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zk10 extends dy81 {
    public final Bitmap h;
    public final Bitmap i;
    public final String j;
    public final Bitmap k;
    public final gpr0 l;
    public final gpr0 m;
    public final gpr0 n;
    public final gpr0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final gpr0 f53p;
    public final gpr0 q;
    public final String r;
    public final long s;
    public final boolean t;
    public final boolean u;
    public ConstraintLayout v;
    public ConstraintLayout w;
    public ConstraintLayout x;
    public ConstraintLayout y;
    public ParagraphView z;

    public zk10(Bitmap bitmap, Bitmap bitmap2, String str, Bitmap bitmap3, gpr0 gpr0Var, gpr0 gpr0Var2, gpr0 gpr0Var3, gpr0 gpr0Var4, gpr0 gpr0Var5, gpr0 gpr0Var6, String str2, long j, boolean z, boolean z2) {
        super(new nj41((z2 ? 2334L : 1667L) + j), new f3a(2131624636, 2131428835));
        this.h = bitmap;
        this.i = bitmap2;
        this.j = str;
        this.k = bitmap3;
        this.l = gpr0Var;
        this.m = gpr0Var2;
        this.n = gpr0Var3;
        this.o = gpr0Var4;
        this.f53p = gpr0Var5;
        this.q = gpr0Var6;
        this.r = str2;
        this.s = j;
        this.t = z;
        this.u = z2;
    }

    @Override // p.dy81
    public final void d(ConstraintLayout constraintLayout) {
        this.v = b8k1.n(constraintLayout, 2131428848);
        this.w = b8k1.n(constraintLayout, 2131428847);
        ImageView imageView = (ImageView) b8k1.n(constraintLayout, 2131428846);
        ImageView imageView2 = (ImageView) b8k1.n(constraintLayout, 2131428849);
        imageView.setImageBitmap(this.h);
        imageView.setClipToOutline(true);
        i(imageView2);
        this.x = b8k1.n(constraintLayout, 2131428836);
        this.y = b8k1.n(constraintLayout, 2131428835);
        ImageView imageView3 = (ImageView) b8k1.n(constraintLayout, 2131428834);
        ImageView imageView4 = (ImageView) b8k1.n(constraintLayout, 2131428837);
        ParagraphView paragraphViewN = b8k1.n(constraintLayout, 2131428839);
        ParagraphView paragraphViewN2 = b8k1.n(constraintLayout, 2131428838);
        ParagraphView paragraphViewN3 = b8k1.n(constraintLayout, 2131428841);
        ImageView imageView5 = (ImageView) b8k1.n(constraintLayout, 2131428843);
        ParagraphView paragraphViewN4 = b8k1.n(constraintLayout, 2131428845);
        ParagraphView paragraphViewN5 = b8k1.n(constraintLayout, 2131428844);
        this.z = b8k1.n(constraintLayout, 2131428850);
        imageView3.setImageBitmap(this.i);
        imageView3.setClipToOutline(true);
        i(imageView4);
        ipr0 ipr0Var = this.l.a;
        paragraphViewN.setText(ipr0Var.a);
        paragraphViewN.setTextAppearance(ipr0Var.b);
        paragraphViewN.setTextColor(ipr0Var.c);
        paragraphViewN2.x(this.m);
        paragraphViewN3.x(this.n);
        Bitmap bitmap = this.k;
        if (bitmap != null) {
            imageView5.setImageBitmap(bitmap);
            imageView5.setClipToOutline(true);
        } else {
            imageView5.setVisibility(8);
        }
        paragraphViewN4.x(this.o);
        gpr0 gpr0Var = this.f53p;
        if (ihc1.y0(gpr0Var.a.a)) {
            paragraphViewN5.setVisibility(8);
        } else {
            paragraphViewN5.x(gpr0Var);
        }
        ParagraphView paragraphView = this.z;
        if (paragraphView == null) {
            u890.C("storyTitleView");
            throw null;
        }
        paragraphView.x(this.q);
        ConstraintLayout constraintLayout2 = this.y;
        if (constraintLayout2 == null) {
            u890.C("backContainer");
            throw null;
        }
        constraintLayout2.setContentDescription(this.r);
        ConstraintLayout constraintLayoutN = b8k1.n(constraintLayout, 2131428840);
        aiq0.a(constraintLayoutN, new uu1(constraintLayoutN, this, constraintLayoutN, paragraphViewN, paragraphViewN3));
        super.d(constraintLayout);
    }

    @Override // p.dy81
    public final n381 h(ConstraintLayout constraintLayout) {
        ConstraintLayout constraintLayout2 = this.w;
        if (constraintLayout2 == null) {
            u890.C("frontContainer");
            throw null;
        }
        ConstraintLayout constraintLayout3 = this.y;
        if (constraintLayout3 == null) {
            u890.C("backContainer");
            throw null;
        }
        rl1 rl1Var = new rl1(constraintLayout2, constraintLayout3, new ntd(), this.t, (byte) 7);
        long j = this.s / 2;
        AnimatorSet animatorSetV = rl1Var.v(j);
        AnimatorSet animatorSetG = rl1Var.G();
        animatorSetG.addListener(new otd(this, (byte) 3));
        ParagraphView paragraphView = this.z;
        if (paragraphView == null) {
            u890.C("storyTitleView");
            throw null;
        }
        AnimatorSet animatorSetE = jon1.e(Collections.singletonList(jon1.M(paragraphView)), 0L, (TimeInterpolator) null, (Long) null, this.t, 14);
        ConstraintLayout constraintLayout4 = this.x;
        if (constraintLayout4 == null) {
            u890.C("backSceneContainer");
            throw null;
        }
        AnimatorSet animatorSetE2 = this.u ? jon1.e(Collections.singletonList(jon1.N(constraintLayout4)), j, (TimeInterpolator) null, (Long) null, this.t, 12) : null;
        if (animatorSetE2 == null) {
            animatorSetE2 = new AnimatorSet();
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(animatorSetV, animatorSetG, animatorSetE, animatorSetE2);
        return new n381(animatorSet, new fey(this, (byte) 7), (byte) 10);
    }

    public final void i(ImageView imageView) {
        Integer m231Var;
        imageView.setImageResource(2131232672);
        try {
            m231Var = Integer.valueOf(Color.parseColor(this.j));
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (m231Var instanceof m231) {
            m231Var = -1;
        }
        imageView.setColorFilter(new PorterDuffColorFilter(m231Var.intValue(), PorterDuff.Mode.SRC_IN));
    }
}
