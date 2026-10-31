package p;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.imageview.ShapeableImageView;
import com.spotify.encoremobile.component.buttons.EncoreButton;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ai0 implements bob0 {
    public final Object N0;
    public final Object O0;
    public final Object P0;
    public final Object Q0;
    public final Object R0;
    public final Object S0;
    public final Object T0;
    public final Object U0;
    public final Object V0;
    public final Object W0;
    public final Object X;
    public final Object X0;
    public final Object Y;
    public final Object Y0;
    public final Object Z;
    public final Object Z0;
    public final Object a;
    public final Object a1;
    public final Object b;
    public final Object b1;
    public final Object c;
    public final Object c1;
    public final Object d;
    public final Object d1;
    public final Object e;
    public final Object e1;
    public final Object f;
    public final Object f1;
    public final Object g;
    public final Object g1;
    public final Object h;
    public final Object h1;
    public final Object i;
    public final Object i1;
    public final Object j1;
    public final Object k1;
    public final Object l1;
    public final Object t;

    public ai0(daq daqVar, Activity activity) {
        this.b = daqVar;
        this.a = activity;
        g5t g5tVar = new g5t();
        this.c = g5tVar;
        this.d = new obq(daqVar, this, 3, (byte) 3);
        g5t.a(g5tVar, new obq(daqVar, this, 2, (byte) 3));
        this.e = new obq(daqVar, this, 1, (byte) 3);
        this.f = xqu.b(new obq(daqVar, this, 5, (byte) 3));
        this.g = new obq(daqVar, this, 4, (byte) 3);
        this.h = xqu.b(new obq(daqVar, this, 0, (byte) 3));
        this.i = xqu.b(new obq(daqVar, this, 9, (byte) 3));
        this.t = xqu.b(new obq(daqVar, this, 8, (byte) 3));
        this.X = new obq(daqVar, this, 7, (byte) 3);
        this.Y = xqu.b(new obq(daqVar, this, 11, (byte) 3));
        this.Z = xqu.b(new obq(daqVar, this, 10, (byte) 3));
        this.N0 = new obq(daqVar, this, 6, (byte) 3);
        this.O0 = new obq(daqVar, this, 12, (byte) 3);
        this.P0 = iy81.a(new obq(daqVar, this, 18, (byte) 3));
        this.Q0 = iy81.a(new obq(daqVar, this, 19, (byte) 3));
        this.R0 = iy81.a(new obq(daqVar, this, 17, (byte) 3));
        this.S0 = xqu.b(new obq(daqVar, this, 20, (byte) 3));
        this.T0 = new obq(daqVar, this, 16, (byte) 3);
        this.U0 = xqu.b(new obq(daqVar, this, 24, (byte) 3));
        this.V0 = xqu.b(new obq(daqVar, this, 23, (byte) 3));
        this.W0 = new obq(daqVar, this, 22, (byte) 3);
        this.X0 = new obq(daqVar, this, 21, (byte) 3);
        this.Y0 = new obq(daqVar, this, 25, (byte) 3);
        this.Z0 = new obq(daqVar, this, 26, (byte) 3);
        this.a1 = iy81.a(new obq(daqVar, this, 28, (byte) 3));
        this.b1 = xqu.b(new obq(daqVar, this, 29, (byte) 3));
        this.c1 = new obq(daqVar, this, 27, (byte) 3);
        this.d1 = iy81.a(new obq(daqVar, this, 31, (byte) 3));
        this.e1 = new obq(daqVar, this, 30, (byte) 3);
        this.f1 = new obq(daqVar, this, 32, (byte) 3);
        this.g1 = iy81.a(new obq(daqVar, this, 34, (byte) 3));
        this.h1 = new obq(daqVar, this, 33, (byte) 3);
        this.i1 = xqu.b(new obq(daqVar, this, 15, (byte) 3));
        this.j1 = xqu.b(new obq(daqVar, this, 14, (byte) 3));
        this.k1 = xqu.b(new obq(daqVar, this, 13, (byte) 3));
        this.l1 = new obq(daqVar, this, 35, (byte) 3);
    }

    public eyh0 a() {
        xu1 xu1Var = (xu1) this.b;
        Context context = (Context) xu1Var.e.get();
        c8o.l(context);
        Activity activity = (Activity) xu1Var.f.get();
        c8o.l(activity);
        wt1 wt1VarB = b();
        kt91 kt91Var = (kt91) xu1Var.m.get();
        c8o.l(kt91Var);
        a1r0 a1r0Var = (a1r0) xu1Var.t.get();
        c8o.l(a1r0Var);
        return new eyh0(context, activity, wt1VarB, kt91Var, a1r0Var);
    }

    public wt1 b() {
        q7r0 q7r0Var = (q7r0) this.a;
        n6r0 n6r0Var = cwl1.D(q7r0Var.d.b()).a;
        c8o.m(n6r0Var);
        i8h1 i8h1VarZ = u1n0.z(q7r0Var);
        c8o.l(((xu1) this.b).d());
        return new wt1(n6r0Var, i8h1VarZ, (av1) this.c);
    }

    public tx4 c() {
        luk lukVar = (luk) ((xu1) this.b).x.get();
        c8o.l(lukVar);
        return new tx4(lukVar);
    }

    public yjq d() {
        xu1 xu1Var = (xu1) this.b;
        xrc0 xrc0Var = (xrc0) xu1Var.h.get();
        c8o.l(xrc0Var);
        av1 av1Var = (av1) this.c;
        q8n q8nVar = (q8n) xu1Var.b.get();
        c8o.l(q8nVar);
        uu00 uu00Var = (uu00) xu1Var.F.get();
        c8o.l(uu00Var);
        luk lukVar = (luk) xu1Var.x.get();
        c8o.l(lukVar);
        return new yjq(xrc0Var, av1Var, q8nVar, uu00Var, new vo4(false, lukVar));
    }

    public pbq e() {
        xu1 xu1Var = (xu1) this.b;
        xrc0 xrc0Var = (xrc0) xu1Var.h.get();
        c8o.l(xrc0Var);
        iyc0 iyc0Var = (iyc0) xu1Var.j.get();
        c8o.l(iyc0Var);
        rpm1 rpm1Var = (rpm1) xu1Var.r.get();
        c8o.l(rpm1Var);
        av1 av1Var = (av1) this.c;
        agc0 agc0VarD = xu1Var.d();
        c8o.l(agc0VarD);
        cfr cfrVar = (cfr) xu1Var.K.get();
        c8o.l(cfrVar);
        r5h r5hVar = (r5h) xu1Var.H.get();
        c8o.l(r5hVar);
        yjq yjqVarD = d();
        dv00 dv00Var = (dv00) xu1Var.G.get();
        c8o.l(dv00Var);
        w0r w0rVar = new w0r(dv00Var);
        vlo vloVarC = xu1Var.c();
        c8o.l(vloVarC);
        xrm1 xrm1Var = (xrm1) xu1Var.z.get();
        c8o.l(xrm1Var);
        return new pbq(xrc0Var, iyc0Var, rpm1Var, av1Var, agc0VarD, cfrVar, r5hVar, yjqVarD, w0rVar, vloVarC, xrm1Var, (cqa1) ((jly0) this.O0).get());
    }

    public ai0(CoordinatorLayout coordinatorLayout, FrameLayout frameLayout, Group group, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, NestedScrollView nestedScrollView, View view, TextView textView6, LinearLayout linearLayout, ShapeableImageView shapeableImageView, ComposeView composeView, TextView textView7, TextView textView8, TextView textView9, ConstraintLayout constraintLayout, TextView textView10, FrameLayout frameLayout2, FrameLayout frameLayout3, FrameLayout frameLayout4, EncoreButton encoreButton, FrameLayout frameLayout5, View view2, View view3, LinearLayout linearLayout2, TextView textView11, EncoreButton encoreButton2, View view4, View view5, View view6, LinearLayout linearLayout3, TextView textView12, TextView textView13, Toolbar toolbar, EncoreButton encoreButton3, EncoreButton encoreButton4) {
        this.a = coordinatorLayout;
        this.b = frameLayout;
        this.g = group;
        this.h = textView;
        this.i = textView2;
        this.t = textView3;
        this.X = textView4;
        this.Y = textView5;
        this.U0 = nestedScrollView;
        this.V0 = view;
        this.Z = textView6;
        this.b1 = linearLayout;
        this.e1 = shapeableImageView;
        this.f1 = composeView;
        this.N0 = textView7;
        this.O0 = textView8;
        this.P0 = textView9;
        this.g1 = constraintLayout;
        this.Q0 = textView10;
        this.c = frameLayout2;
        this.d = frameLayout3;
        this.e = frameLayout4;
        this.h1 = encoreButton;
        this.f = frameLayout5;
        this.W0 = view2;
        this.X0 = view3;
        this.c1 = linearLayout2;
        this.R0 = textView11;
        this.i1 = encoreButton2;
        this.Y0 = view4;
        this.Z0 = view5;
        this.a1 = view6;
        this.d1 = linearLayout3;
        this.S0 = textView12;
        this.T0 = textView13;
        this.l1 = toolbar;
        this.j1 = encoreButton3;
        this.k1 = encoreButton4;
    }

    public ai0(xu1 xu1Var, av1 av1Var, q7r0 q7r0Var) {
        this.a = q7r0Var;
        this.b = xu1Var;
        this.c = av1Var;
        byte b = 6;
        this.d = xqu.b(new fwo(this, b, b));
        this.e = xqu.b(new fwo(this, 5, b));
        this.f = xqu.b(new fwo(this, 4, b));
        this.g = xqu.b(new fwo(this, 3, b));
        this.h = iy81.a(new fwo(this, 7, b));
        this.i = xqu.b(new fwo(this, 8, b));
        this.t = new fwo(this, 10, b);
        this.X = iy81.a(new fwo(this, 9, b));
        this.Y = xqu.b(new fwo(this, 11, b));
        this.Z = iy81.a(new fwo(this, 12, b));
        this.N0 = new fwo(this, 13, b);
        this.O0 = xqu.b(new fwo(this, 14, b));
        this.P0 = new fwo(this, 17, b);
        this.Q0 = new fwo(this, 18, b);
        this.R0 = new fwo(this, 19, b);
        this.S0 = new fwo(this, 20, b);
        this.T0 = new fwo(this, 21, b);
        this.U0 = new fwo(this, 22, b);
        this.V0 = new fwo(this, 23, b);
        this.W0 = new fwo(this, 24, b);
        this.X0 = new fwo(this, 16, b);
        this.Y0 = xqu.b(new fwo(this, 26, b));
        this.Z0 = new fwo(this, 25, b);
        this.a1 = new fwo(this, 27, b);
        this.b1 = iy81.a(new fwo(this, 28, b));
        this.c1 = xqu.b(new fwo(this, 29, b));
        this.d1 = xqu.b(new fwo(this, 30, b));
        this.e1 = xqu.b(new fwo(this, 15, b));
        this.f1 = xqu.b(new fwo(this, 31, b));
        this.g1 = xqu.b(new fwo(this, 32, b));
        this.h1 = xqu.b(new fwo(this, 33, b));
        this.i1 = xqu.b(new fwo(this, 34, b));
        this.j1 = iy81.a(new fwo(this, 2, b));
        this.k1 = new fwo(this, 1, b);
        this.l1 = new fwo(this, 0, b);
    }
}
