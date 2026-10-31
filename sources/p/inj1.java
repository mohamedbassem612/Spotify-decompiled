package p;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class inj1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pnj1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ inj1(pnj1 pnj1Var, byte b) {
        super(0);
        this.a = b;
        this.b = pnj1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        pnj1 pnj1Var = this.b;
        switch (b) {
            case 0:
                ConstraintLayout constraintLayout = pnj1Var.f2;
                if (constraintLayout == null) {
                    u890.C("playbackControlsContainer");
                    throw null;
                }
                NestedScrollView nestedScrollView = pnj1Var.S1;
                if (nestedScrollView != null) {
                    return Integer.valueOf(i8p1.o(constraintLayout, nestedScrollView).bottom);
                }
                u890.C("scrollCardsScrollView");
                throw null;
            case 1:
                ViewGroup viewGroup = pnj1Var.V1;
                if (viewGroup == null) {
                    u890.C("videoAndHeaderContainer");
                    throw null;
                }
                NestedScrollView nestedScrollView2 = pnj1Var.S1;
                if (nestedScrollView2 != null) {
                    return Integer.valueOf(i8p1.o(viewGroup, nestedScrollView2).bottom);
                }
                u890.C("scrollCardsScrollView");
                throw null;
            case 2:
                ConstraintLayout constraintLayout2 = pnj1Var.f2;
                if (constraintLayout2 == null) {
                    u890.C("playbackControlsContainer");
                    throw null;
                }
                NestedScrollView nestedScrollView3 = pnj1Var.S1;
                if (nestedScrollView3 != null) {
                    return Integer.valueOf(i8p1.o(constraintLayout2, nestedScrollView3).top);
                }
                u890.C("scrollCardsScrollView");
                throw null;
            case 3:
                ConstraintLayout constraintLayout3 = pnj1Var.f2;
                if (constraintLayout3 == null) {
                    u890.C("playbackControlsContainer");
                    throw null;
                }
                NestedScrollView nestedScrollView4 = pnj1Var.S1;
                if (nestedScrollView4 != null) {
                    return Integer.valueOf(i8p1.o(constraintLayout3, nestedScrollView4).bottom);
                }
                u890.C("scrollCardsScrollView");
                throw null;
            case 4:
                ViewGroup viewGroup2 = pnj1Var.V1;
                if (viewGroup2 == null) {
                    u890.C("videoAndHeaderContainer");
                    throw null;
                }
                NestedScrollView nestedScrollView5 = pnj1Var.S1;
                if (nestedScrollView5 != null) {
                    return Integer.valueOf(i8p1.o(viewGroup2, nestedScrollView5).bottom);
                }
                u890.C("scrollCardsScrollView");
                throw null;
            case 5:
                ConstraintLayout constraintLayout4 = pnj1Var.f2;
                if (constraintLayout4 == null) {
                    u890.C("playbackControlsContainer");
                    throw null;
                }
                NestedScrollView nestedScrollView6 = pnj1Var.S1;
                if (nestedScrollView6 != null) {
                    return Integer.valueOf(i8p1.o(constraintLayout4, nestedScrollView6).top);
                }
                u890.C("scrollCardsScrollView");
                throw null;
            case 6:
                ConstraintLayout constraintLayout5 = pnj1Var.f2;
                if (constraintLayout5 == null) {
                    u890.C("playbackControlsContainer");
                    throw null;
                }
                NestedScrollView nestedScrollView7 = pnj1Var.S1;
                if (nestedScrollView7 != null) {
                    return Integer.valueOf(i8p1.o(constraintLayout5, nestedScrollView7).bottom);
                }
                u890.C("scrollCardsScrollView");
                throw null;
            case 7:
                ViewGroup viewGroup3 = pnj1Var.V1;
                if (viewGroup3 == null) {
                    u890.C("videoAndHeaderContainer");
                    throw null;
                }
                NestedScrollView nestedScrollView8 = pnj1Var.S1;
                if (nestedScrollView8 != null) {
                    return Integer.valueOf(i8p1.o(viewGroup3, nestedScrollView8).bottom);
                }
                u890.C("scrollCardsScrollView");
                throw null;
            case 8:
                ConstraintLayout constraintLayout6 = pnj1Var.f2;
                if (constraintLayout6 == null) {
                    u890.C("playbackControlsContainer");
                    throw null;
                }
                NestedScrollView nestedScrollView9 = pnj1Var.S1;
                if (nestedScrollView9 != null) {
                    return Integer.valueOf(i8p1.o(constraintLayout6, nestedScrollView9).top);
                }
                u890.C("scrollCardsScrollView");
                throw null;
            case 9:
                return ((s691) pnj1Var.n1.get()).a(voo1.s(pnj1Var.a));
            case 10:
                return (wpw) pnj1Var.i1.get();
            case 11:
                return ((k691) pnj1Var.o1.get()).a(voo1.r(pnj1Var.a));
            case 12:
                return new jpg0((laa) pnj1Var.j1.get(), jmj1.O0);
            case 13:
                return new jpg0(((mo51) pnj1Var.u1.get()).a(voo1.t(pnj1Var.a, (xzf1) null)), jmj1.Y);
            case 14:
                return pnj1Var.b(1);
            case 15:
                return ((dm91) pnj1Var.m1.get()).a(voo1.v(pnj1Var.a), pnj1Var.G1.b());
            case 16:
                return (wpw) pnj1Var.l1.get();
            case 17:
                return ((s691) pnj1Var.n1.get()).a(voo1.s(pnj1Var.a));
            case 18:
                return (wpw) pnj1Var.i1.get();
            case 19:
                return ((k691) pnj1Var.o1.get()).a(voo1.r(pnj1Var.a));
            case 20:
                return new jpg0((laa) pnj1Var.j1.get(), jmj1.P0);
            case 21:
                return (wpw) pnj1Var.p1.get();
            case 22:
                return (wpw) pnj1Var.k1.get();
            case 23:
                return new jpg0(((mo51) pnj1Var.u1.get()).a(voo1.t(pnj1Var.a, (xzf1) null)), jmj1.Y);
            case 24:
                return pnj1Var.b(1);
            case 25:
                r0y r0yVar = pnj1Var.F1;
                i8h1 i8h1Var = (i8h1) r0yVar.c.getValue();
                g5l0 g5l0VarF = r0yVar.f();
                x6h1 x6h1VarC = g5l0VarF.c.c();
                x6h1VarC.i.add(new a7h1("content_area", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                b7x b7xVar = b7x.a;
                i8h1Var.m(new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, g5l0VarF.b, System.currentTimeMillis()), (xj61) null);
                ioj1 ioj1Var = pnj1Var.x2;
                if (ioj1Var != null) {
                    ioj1Var.u.a(vnj1.c);
                    return rih1.a;
                }
                u890.C("pageStateController");
                throw null;
            case 26:
                return new jpg0(((mo51) pnj1Var.u1.get()).a(new qws(pnj1Var.a.h.a, 2131626304)), jmj1.Y);
            case 27:
                return pnj1Var.b(2);
            case 28:
                return pnj1Var.E1.a(pnj1Var);
            default:
                return ((s691) pnj1Var.n1.get()).a(voo1.s(pnj1Var.a));
        }
    }
}
