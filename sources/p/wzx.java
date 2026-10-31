package p;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wzx implements a6c1 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;
    public Object m;

    public wzx(Activity activity, qa90 qa90Var) {
        w6c1 w6c1Var = new w6c1(8300L, TimeUnit.MILLISECONDS);
        String string = activity.getString(2131951717);
        iy61 iy61VarH = kkn.h(qa90Var);
        this.a = activity;
        this.b = qa90Var;
        this.c = "blend-intro-story";
        this.d = w6c1Var;
        this.e = string;
        this.f = iy61VarH;
    }

    @Override // p.a6c1
    public void a() {
        AnimatorSet animatorSet = (AnimatorSet) this.l;
        if (animatorSet != null) {
            animatorSet.pause();
        }
    }

    @Override // p.a6c1
    public String b() {
        return (String) this.c;
    }

    @Override // p.a6c1
    public fy61 c() {
        return dy61.a;
    }

    @Override // p.a6c1
    public void d() {
        AnimatorSet animatorSet = (AnimatorSet) this.l;
        if (animatorSet != null) {
            animatorSet.resume();
        }
    }

    @Override // p.a6c1
    public void dispose() {
        AnimatorSet animatorSet = (AnimatorSet) this.l;
        if (animatorSet != null) {
            ryn1.s(animatorSet);
        }
    }

    @Override // p.a6c1
    public View e(rmr rmrVar, q881 q881Var) {
        this.m = rmrVar;
        Activity activity = (Activity) this.a;
        View viewInflate = LayoutInflater.from(activity).inflate(2131626205, (ViewGroup) new FrameLayout(activity), false);
        qa90 qa90Var = (qa90) this.b;
        viewInflate.setBackgroundColor(gio1.z(qa90Var.b()));
        this.g = viewInflate;
        this.h = gio1.l(viewInflate, 2131431357, qa90Var.e());
        this.i = gio1.l(viewInflate, 2131431116, qa90Var.c());
        this.j = gio1.l(viewInflate, 2131431358, qa90Var.f());
        this.k = gio1.l(viewInflate, 2131431117, qa90Var.d());
        AnimatorSet animatorSet = new AnimatorSet();
        TextView textView = (TextView) this.h;
        if (textView == null) {
            u890.C("title1");
            throw null;
        }
        AnimatorSet animatorSetJ = ryn1.j(textView, 250L);
        TextView textView2 = (TextView) this.i;
        if (textView2 == null) {
            u890.C("subtitle1");
            throw null;
        }
        AnimatorSet animatorSetJ2 = ryn1.j(textView2, 500L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        TextView textView3 = (TextView) this.h;
        if (textView3 == null) {
            u890.C("title1");
            throw null;
        }
        AnimatorSet animatorSetL = ryn1.l(textView3);
        TextView textView4 = (TextView) this.i;
        if (textView4 == null) {
            u890.C("subtitle1");
            throw null;
        }
        animatorSet2.playTogether(animatorSetL, ryn1.l(textView4));
        animatorSet2.setStartDelay(2050L);
        AnimatorSet animatorSet3 = new AnimatorSet();
        TextView textView5 = (TextView) this.j;
        if (textView5 == null) {
            u890.C("title2");
            throw null;
        }
        AnimatorSet.Builder builderPlay = animatorSet3.play(ryn1.k(textView5));
        TextView textView6 = (TextView) this.k;
        if (textView6 == null) {
            u890.C("subtitle2");
            throw null;
        }
        builderPlay.with(ryn1.k(textView6));
        animatorSet3.setStartDelay(200L);
        AnimatorSet animatorSet4 = new AnimatorSet();
        TextView textView7 = (TextView) this.j;
        if (textView7 == null) {
            u890.C("title2");
            throw null;
        }
        AnimatorSet animatorSetL2 = ryn1.l(textView7);
        TextView textView8 = (TextView) this.k;
        if (textView8 == null) {
            u890.C("subtitle2");
            throw null;
        }
        animatorSet4.playTogether(animatorSetL2, ryn1.l(textView8));
        animatorSet4.setStartDelay(2900L);
        animatorSet.playSequentially(animatorSetJ, animatorSetJ2, animatorSet2, animatorSet3, animatorSet4);
        this.l = animatorSet;
        return viewInflate;
    }

    @Override // p.a6c1
    public String f() {
        return (String) this.e;
    }

    @Override // p.a6c1
    public oho1 getDuration() {
        return (oho1) this.d;
    }

    @Override // p.a6c1
    public iy61 h() {
        return (iy61) this.f;
    }

    @Override // p.a6c1
    public void start() {
        rmr rmrVar;
        AnimatorSet animatorSet = (AnimatorSet) this.l;
        if (animatorSet != null) {
            animatorSet.start();
        }
        String strA = ((qa90) this.b).a();
        if (strA == null || (rmrVar = (rmr) this.m) == null) {
            return;
        }
        rmr.e(rmrVar, Uri.parse(strA));
    }

    public wzx(caq caqVar, caq caqVar2, kly0 kly0Var, kly0 kly0Var2, caq caqVar3, caq caqVar4, caq caqVar5, caq caqVar6, caq caqVar7, caq caqVar8, caq caqVar9, g5t g5tVar, caq caqVar10) {
        this.a = caqVar;
        this.b = caqVar2;
        this.c = kly0Var;
        this.d = kly0Var2;
        this.e = caqVar3;
        this.f = caqVar4;
        this.g = caqVar5;
        this.h = caqVar6;
        this.i = caqVar7;
        this.j = caqVar8;
        this.k = caqVar9;
        this.l = g5tVar;
        this.m = caqVar10;
    }
}
