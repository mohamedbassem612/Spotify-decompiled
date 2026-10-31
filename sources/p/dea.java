package p;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Color;
import android.net.Uri;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dea implements a6c1 {
    public final Activity a;
    public final cea b;
    public final lzn0 c;
    public final gw70 d;
    public final ufg1 e;
    public final i8h1 f;
    public final xok0 g;
    public final int h;
    public final wnh1 i;
    public final String j;
    public final oho1 k;
    public final String l;
    public final iy61 m;
    public View n;
    public TextView o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f7p;
    public TextView q;
    public Button r;
    public ImageView s;
    public AnimatorSet t;
    public rmr u;

    public dea(Activity activity, cea ceaVar, lzn0 lzn0Var, gw70 gw70Var, ufg1 ufg1Var, i8h1 i8h1Var, xok0 xok0Var, int i, wnh1 wnh1Var) {
        w6c1 w6c1Var = new w6c1(5L, TimeUnit.SECONDS);
        String string = activity.getString(2131951717);
        iy61 iy61Var = ceaVar.i == null ? gy61.a : hy61.a;
        this.a = activity;
        this.b = ceaVar;
        this.c = lzn0Var;
        this.d = gw70Var;
        this.e = ufg1Var;
        this.f = i8h1Var;
        this.g = xok0Var;
        this.h = i;
        this.i = wnh1Var;
        this.j = "blend-basic-story";
        this.k = w6c1Var;
        this.l = string;
        this.m = iy61Var;
    }

    public final void a() {
        AnimatorSet animatorSet = this.t;
        if (animatorSet != null) {
            animatorSet.pause();
        }
    }

    public final String b() {
        return this.j;
    }

    public final fy61 c() {
        return dy61.a;
    }

    public final void d() {
        AnimatorSet animatorSet = this.t;
        if (animatorSet != null) {
            animatorSet.resume();
        }
    }

    public final void dispose() {
        AnimatorSet animatorSet = this.t;
        if (animatorSet != null) {
            ryn1.s(animatorSet);
        }
    }

    public final View e(rmr rmrVar, q881 q881Var) {
        int color;
        String str;
        this.u = rmrVar;
        Activity activity = this.a;
        View viewInflate = LayoutInflater.from(activity).inflate(2131626202, (ViewGroup) new FrameLayout(activity), false);
        cea ceaVar = this.b;
        String str2 = ceaVar.h;
        ydc ydcVar = ceaVar.f;
        try {
            color = Color.parseColor(str2);
        } catch (IllegalArgumentException unused) {
            color = -16777216;
        }
        viewInflate.setBackgroundColor(color);
        this.n = viewInflate;
        this.o = gio1.l(viewInflate, 2131431356, ceaVar.b);
        this.f7p = gio1.l(viewInflate, 2131431115, ceaVar.c);
        this.q = gio1.l(viewInflate, 2131427729, ceaVar.d);
        Button button = (Button) gio1.l(viewInflate, 2131427839, ydcVar != null ? ydcVar.a : null);
        if (ydcVar != null && (str = ydcVar.b) != null) {
            button.setOnClickListener(new cg1(this, str, (byte) 13));
        }
        this.r = button;
        View viewFindViewById = viewInflate.findViewById(2131429612);
        ImageView imageView = (ImageView) viewFindViewById;
        String str3 = ceaVar.e;
        if (str3 == null || ihc1.y0(str3)) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            ixg ixgVarF = this.d.f(str3);
            ixgVarF.s(this.e);
            ixgVarF.k(imageView, (ird1) null);
        }
        imageView.setScaleX(0.0f);
        imageView.setScaleY(0.0f);
        this.s = (ImageView) viewFindViewById;
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet animatorSet2 = new AnimatorSet();
        ImageView imageView2 = this.s;
        if (imageView2 == null) {
            u890.C("image");
            throw null;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) View.SCALE_X, 5.0f, 1.0f);
        ImageView imageView3 = this.s;
        if (imageView3 == null) {
            u890.C("image");
            throw null;
        }
        animatorSet2.playTogether(objectAnimatorOfFloat, ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) View.SCALE_Y, 5.0f, 1.0f));
        animatorSet2.setDuration(350L);
        animatorSet2.setStartDelay(750L);
        animatorSet2.setInterpolator(new LinearInterpolator());
        AnimatorSet animatorSet3 = new AnimatorSet();
        TextView textView = this.o;
        if (textView == null) {
            u890.C("title");
            throw null;
        }
        ObjectAnimator objectAnimatorU = ryn1.u(textView);
        TextView textView2 = this.f7p;
        if (textView2 == null) {
            u890.C("subtitle");
            throw null;
        }
        ObjectAnimator objectAnimatorU2 = ryn1.u(textView2);
        TextView textView3 = this.q;
        if (textView3 == null) {
            u890.C("body");
            throw null;
        }
        animatorSet3.playTogether(objectAnimatorU, objectAnimatorU2, ryn1.u(textView3));
        Button button2 = this.r;
        if (button2 == null) {
            u890.C("button");
            throw null;
        }
        animatorSet.playSequentially(animatorSet2, animatorSet3, ryn1.j(button2, 0L));
        this.t = animatorSet;
        return viewInflate;
    }

    public final String f() {
        return this.l;
    }

    public final oho1 getDuration() {
        return this.k;
    }

    public final iy61 h() {
        return this.m;
    }

    public final void start() {
        rmr rmrVar;
        cea ceaVar = this.b;
        String str = ceaVar.a;
        Integer numValueOf = Integer.valueOf(this.h);
        x6h1 x6h1VarC = this.g.b.c();
        x6h1VarC.i.add(new a7h1("story", str, numValueOf, (String) null, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        this.i.h(k7h1Var.a());
        AnimatorSet animatorSet = this.t;
        if (animatorSet != null) {
            animatorSet.start();
        }
        String str2 = ceaVar.g;
        if (str2 == null || (rmrVar = this.u) == null) {
            return;
        }
        rmrVar.d(Uri.parse(str2), false);
    }
}
