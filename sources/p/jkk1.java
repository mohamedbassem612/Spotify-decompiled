package p;

import android.R;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jkk1 implements fkk1 {
    public static final /* synthetic */ mma0[] t = {new een0(jkk1.class, "currentKeyboardHeight", "getCurrentKeyboardHeight()I", 0), new een0(jkk1.class, "currentMainLayoutInsets", "getCurrentMainLayoutInsets()Landroidx/core/graphics/Insets;", 0), new een0(jkk1.class, "currentSystemInsets", "getCurrentSystemInsets()Landroidx/core/graphics/Insets;", 0), new een0(jkk1.class, "currentContainer", "getCurrentContainer()Lkotlin/jvm/functions/Function0;", 0), new een0(jkk1.class, "mainLayoutInsetsProvider", "getMainLayoutInsetsProvider()Lcom/spotify/tome/insets/MainLayoutInsetsProvider;", 0)};
    public final View a;
    public final fai0 b = new fai0();
    public final x8c0 c;
    public final int[] d;
    public final Rect e;
    public Rect f;
    public ViewTreeObserver g;
    public boolean h;
    public final x22 i;
    public final rkd j;
    public final y22 k;
    public final be0 l;
    public final ikk1 m;
    public final ikk1 n;
    public final View o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ikk1 f46p;
    public final View q;
    public final ikk1 r;
    public final fik1 s;

    public jkk1(View view, cmo cmoVar, dg30 dg30Var, eua0 eua0Var, ced1 ced1Var) {
        this.a = view;
        tac0 tac0Var = ((f0i) dg30Var).a;
        this.c = tac0Var;
        this.d = new int[2];
        this.e = new Rect();
        this.h = true;
        this.i = new x22(this, (byte) 10);
        this.j = new rkd(this, (byte) 2);
        this.k = new y22(this, (byte) 27);
        this.l = new be0(this);
        this.m = new ikk1(this, (byte) 0);
        this.n = new ikk1(this, (byte) 1);
        this.o = new View(view.getContext());
        this.f46p = new ikk1(new bkk1(this, (byte) 1), this);
        this.q = view.findViewById(R.id.content);
        this.r = new ikk1(this, (byte) 3);
        this.s = new fik1(this, (byte) 1);
        tac0Var.a(new d411(this, (byte) 2));
        eua0Var.a().f(dg30Var, new hkk1(this, (byte) 0));
        ced1Var.a().f(dg30Var, new x0g0(this, (byte) 1));
        cmoVar.a().f(dg30Var, new hkk1(this, (byte) 1));
    }

    @Override // p.fkk1
    public final ymd0 a() {
        return this.b;
    }

    public final wzf0 b() {
        mma0 mma0Var = t[4];
        return (wzf0) this.r.a;
    }

    public final void c() {
        d();
        if (b() == null) {
            this.h = true;
        }
        ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
        viewTreeObserver.addOnPreDrawListener(this.j);
        viewTreeObserver.addOnGlobalLayoutListener(this.i);
        this.g = viewTreeObserver;
    }

    public final void d() {
        ViewTreeObserver viewTreeObserver = this.g;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                viewTreeObserver = this.a.getViewTreeObserver();
            }
            viewTreeObserver.removeOnPreDrawListener(this.j);
            viewTreeObserver.removeOnGlobalLayoutListener(this.i);
        }
        this.g = null;
    }

    public final void e(View view) {
        erl1 erl1Var;
        wzf0 wzf0VarB = b();
        if (wzf0VarB == null || (erl1Var = wzf0VarB.b) == null) {
            return;
        }
        yat yatVarB = z1a1.b(view.getContext());
        flb0 flb0Var = view.getLayoutDirection() == 1 ? flb0.b : flb0.a;
        this.m.c(t[1], this, nk80.c(erl1Var.b(yatVarB, flb0Var), erl1Var.c(yatVarB), erl1Var.a(yatVarB, flb0Var), erl1Var.d(yatVarB)));
    }

    public final void f() {
        View view;
        boolean z = this.h;
        mma0[] mma0VarArr = t;
        if (z && b() == null) {
            this.h = false;
            this.r.c(mma0VarArr[4], this, j1e1.o(this.q));
            wzf0 wzf0VarB = b();
            if (wzf0VarB != null && (view = wzf0VarB.a) != null) {
                e(view);
            }
        }
        mma0 mma0Var = mma0VarArr[3];
        View view2 = (View) ((Function0) this.f46p.a).invoke();
        mma0 mma0Var2 = mma0VarArr[0];
        int iIntValue = ((Number) this.l.a).intValue();
        mma0 mma0Var3 = mma0VarArr[1];
        nk80 nk80Var = (nk80) this.m.a;
        mma0 mma0Var4 = mma0VarArr[2];
        nk80 nk80Var2 = (nk80) this.n.a;
        int height = view2.getHeight();
        int width = view2.getWidth();
        int iMax = Math.max(nk80Var2.b, nk80Var.b);
        int i = nk80Var2.d;
        int iMax2 = Math.max(i, nk80Var.d);
        int[] iArr = this.d;
        view2.getLocationInWindow(iArr);
        int i2 = iArr[0];
        int i3 = width + i2;
        int i4 = iArr[1];
        int i5 = iMax + i4;
        int iMin = Math.min(iIntValue > 0 ? ((i4 + height) - iIntValue) - i : (i4 + height) - iMax2, this.a.getHeight());
        Rect rect = this.e;
        rect.set(i2, i5, i3, iMin);
        if (rect.equals(this.f)) {
            return;
        }
        Rect rect2 = new Rect(rect);
        this.f = rect2;
        this.b.j(rect2);
    }
}
