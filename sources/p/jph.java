package p;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jph extends ovb {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jph(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void a(View view, float f) {
        switch (this.a) {
            case 8:
                float fAbs = 0.0f;
                if (f <= 0.0f) {
                    fAbs = Math.abs(f) * view.getHeight();
                }
                ((uyb1) this.b).setTranslationY(fAbs);
                break;
        }
    }

    public final void b(View view, int i) {
        BottomSheetBehavior bottomSheetBehavior;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (i == 4 || i == 6) {
                    ((kph) obj).Y0();
                    return;
                }
                return;
            case 1:
                rfm rfmVar = (rfm) obj;
                if (i == 5) {
                    i8h1 i8h1VarR1 = rfmVar.r1();
                    ynb0 ynb0Var = rfmVar.i2;
                    if (ynb0Var == null) {
                        u890.C("eventFactory");
                        throw null;
                    }
                    i3l0 i3l0Var = (i3l0) ynb0Var.get();
                    i3l0Var.getClass();
                    x6h1 x6h1VarC = i3l0Var.a.c();
                    x6h1VarC.i.add(new a7h1("sheet", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    rfmVar.q1().e(new yrn0(i8h1VarR1.m(new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a));
                    return;
                }
                return;
            case 2:
                if (i == 4) {
                    ((mpv) obj).Y0();
                    return;
                }
                return;
            case 3:
                if (i == 4) {
                    ((nlm0) obj).Y0();
                    return;
                }
                return;
            case 4:
                r3p0 r3p0Var = (r3p0) obj;
                if (i == 4 || i == 5) {
                    u4p0 u4p0VarZ0 = r3p0Var.Z0();
                    ViewGroup viewGroup = u4p0VarZ0.t;
                    if (viewGroup == null) {
                        u890.C("rootView");
                        throw null;
                    }
                    ien0 ien0Var = xhk1.a;
                    n8h1 n8h1VarC = mno1.C(xhk1.a(viewGroup));
                    if (!(n8h1VarC instanceof ihl0)) {
                        n8h1VarC = null;
                    }
                    ihl0 ihl0Var = (ihl0) n8h1VarC;
                    ou80 ou80Var = ihl0Var != null ? ((i8h1) u4p0VarZ0.X.getValue()).m(new w7h1("", "", new z7h1("drag", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), ihl0Var.b, ihl0Var.a, System.currentTimeMillis()), (xj61) null).a : null;
                    yrn0 yrn0Var = ou80Var != null ? new yrn0(ou80Var) : new yrn0((ou80) null);
                    mwn0 mwn0Var = r3p0Var.I1;
                    if (mwn0Var == null) {
                        u890.C("navigationLogger");
                        throw null;
                    }
                    mwn0Var.e(yrn0Var);
                    mwn0 mwn0Var2 = r3p0Var.I1;
                    if (mwn0Var2 == null) {
                        u890.C("navigationLogger");
                        throw null;
                    }
                    mwn0Var2.f(yrn0Var);
                    dg30 dg30VarF0 = r3p0Var.f0();
                    if (dg30VarF0 != null) {
                        dg30VarF0.finish();
                    }
                    dg30 dg30VarF1 = r3p0Var.f0();
                    if (dg30VarF1 != null) {
                        dg30VarF1.overridePendingTransition(0, R.anim.fade_out);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (i == 4 || i == 5) {
                    ((x3p0) obj).c.e();
                    return;
                }
                return;
            case 6:
                sbz0 sbz0Var = (sbz0) obj;
                if (i == 1) {
                    sbz0Var.c();
                    return;
                }
                if (!sbz0Var.r) {
                    if (sbz0Var.d() && sbz0Var.j && sbz0Var.a.getResources().getConfiguration().orientation != 2) {
                        if (i == 6 || i == 3) {
                            sbz0Var.e(i == 6);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i != 3 && i != 4) {
                    if (i == 6 && (bottomSheetBehavior = sbz0Var.q) != null) {
                        bottomSheetBehavior.L(4);
                        return;
                    }
                    return;
                }
                sbz0Var.r = false;
                BottomSheetBehavior bottomSheetBehavior2 = sbz0Var.q;
                if (bottomSheetBehavior2 != null) {
                    bottomSheetBehavior2.F(true);
                }
                sbz0Var.f();
                return;
            case 7:
                if (i == 5) {
                    tk21 tk21Var = ((y901) obj).Y1;
                    if (tk21Var != null) {
                        tk21Var.a.c(new jyh0(tk21Var, qk21.a, (byte) 16));
                        return;
                    } else {
                        u890.C("eventConsumer");
                        throw null;
                    }
                }
                return;
            case 8:
                if (i == 3) {
                    ((uyb1) obj).setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                if (i == 4 || i == 5) {
                    ((oyd1) obj).Y0();
                    return;
                }
                return;
        }
    }

    private final void c(View view, float f) {
    }

    private final void d(View view, float f) {
    }

    private final void e(View view, float f) {
    }

    private final void f(View view, float f) {
    }

    private final void g(View view, float f) {
    }

    private final void h(View view, float f) {
    }

    private final void i(View view, float f) {
    }

    private final void j(View view, float f) {
    }

    private final void k(View view, float f) {
    }
}
