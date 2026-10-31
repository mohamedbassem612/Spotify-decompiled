package p;

import android.graphics.Path;
import android.os.Build;
import android.view.View;
import app.p000rive.runtime.kotlin.R;
import app.p000rive.semantics.SemanticState;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class osl1 {
    public static final WeakHashMap x = new WeakHashMap();
    public final u85 a;
    public final u85 b;
    public final u85 c;
    public final u85 d;
    public final u85 e;
    public final u85 f;
    public final u85 g;
    public final u85 h;
    public final u85 i;
    public final psi1 j;
    public final hrr0 k;
    public final mih1 l;
    public final mih1 m;
    public final psi1 n;
    public final psi1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final psi1 f110p;
    public final psi1 q;
    public final psi1 r;
    public final psi1 s;
    public final psi1 t;
    public final boolean u;
    public int v;
    public final rk80 w;

    public osl1(View view) {
        u85 u85Var = new u85(4, "captionBar");
        this.a = u85Var;
        u85 u85Var2 = new u85(SemanticState.Focused, "displayCutout");
        this.b = u85Var2;
        u85 u85Var3 = new u85(8, "ime");
        this.c = u85Var3;
        u85 u85Var4 = new u85(32, "mandatorySystemGestures");
        this.d = u85Var4;
        u85 u85Var5 = new u85(2, "navigationBars");
        this.e = u85Var5;
        u85 u85Var6 = new u85(1, "statusBars");
        this.f = u85Var6;
        u85 u85Var7 = new u85(519, "systemBars");
        this.g = u85Var7;
        u85 u85Var8 = new u85(16, "systemGestures");
        this.h = u85Var8;
        u85 u85Var9 = new u85(64, "tappableElement");
        this.i = u85Var9;
        psi1 psi1Var = new psi1(new wk80(0, 0, 0, 0), "waterfall");
        this.j = psi1Var;
        this.k = v8r.q((Object) null);
        mih1 mih1Var = new mih1(new mih1(u85Var7, u85Var3), u85Var2);
        this.l = mih1Var;
        this.m = new mih1(mih1Var, new mih1(new mih1(new mih1(u85Var9, u85Var4), u85Var8), psi1Var));
        this.n = lhc.o(4, "captionBarIgnoringVisibility");
        this.o = lhc.o(2, "navigationBarsIgnoringVisibility");
        this.f110p = lhc.o(1, "statusBarsIgnoringVisibility");
        this.q = lhc.o(519, "systemBarsIgnoringVisibility");
        this.r = lhc.o(64, "tappableElementIgnoringVisibility");
        this.s = new psi1(new wk80(0, 0, 0, 0), "imeAnimationTarget");
        this.t = new psi1(new wk80(0, 0, 0, 0), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.u = bool != null ? bool.booleanValue() : false;
        this.w = new rk80(this);
        WeakHashMap weakHashMap = b8k1.a;
        hsl1 hsl1VarA = s7k1.a(view);
        if (hsl1VarA != null) {
            esl1 esl1Var = hsl1VarA.a;
            u85Var.g(esl1Var.u(4));
            u85Var2.g(esl1Var.u(SemanticState.Focused));
            u85Var3.g(esl1Var.u(8));
            u85Var4.g(esl1Var.u(32));
            u85Var5.g(esl1Var.u(2));
            u85Var6.g(esl1Var.u(1));
            u85Var7.g(esl1Var.u(519));
            u85Var8.g(esl1Var.u(16));
            u85Var9.g(esl1Var.u(64));
        }
    }

    public static void b(osl1 osl1Var, hsl1 hsl1Var) {
        boolean z = false;
        osl1Var.a.h(hsl1Var, 0);
        osl1Var.c.h(hsl1Var, 0);
        osl1Var.b.h(hsl1Var, 0);
        osl1Var.e.h(hsl1Var, 0);
        osl1Var.f.h(hsl1Var, 0);
        osl1Var.g.h(hsl1Var, 0);
        osl1Var.h.h(hsl1Var, 0);
        osl1Var.i.h(hsl1Var, 0);
        osl1Var.d.h(hsl1Var, 0);
        osl1Var.n.f(cev0.L(hsl1Var.a.j(4)));
        osl1Var.o.f(cev0.L(hsl1Var.a.j(2)));
        osl1Var.f110p.f(cev0.L(hsl1Var.a.j(1)));
        osl1Var.q.f(cev0.L(hsl1Var.a.j(519)));
        osl1Var.r.f(cev0.L(hsl1Var.a.j(64)));
        hju hjuVarH = hsl1Var.a.h();
        osl1Var.j.f(cev0.L(hjuVarH != null ? hjuVarH.a() : nk80.e));
        tw4 tw4Var = null;
        if (hjuVarH != null) {
            Path pathO = Build.VERSION.SDK_INT >= 31 ? mb4.o(hjuVarH.a) : null;
            if (pathO != null) {
                tw4Var = new tw4(pathO);
            }
        }
        osl1Var.k.setValue(tw4Var);
        synchronized (pv91.c) {
            oen0 oen0Var = ((ten0) pv91.j).h;
            if (oen0Var != null && oen0Var.h()) {
                z = true;
            }
        }
        if (z) {
            pv91.c();
        }
    }

    public final void a(View view) {
        if (this.v == 0) {
            rk80 rk80Var = this.w;
            rk80Var.d = false;
            rk80Var.e = false;
            rk80Var.f = null;
            WeakHashMap weakHashMap = b8k1.a;
            r7k1.c(view, rk80Var);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(rk80Var);
            mrl1.e(view, rk80Var);
        }
        this.v++;
    }
}
