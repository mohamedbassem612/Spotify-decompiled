package p;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.spotify.mainlayout.ui.view.MainLayout;
import com.spotify.mainlayout.ui.view.containers.MainLayoutContentContainerView;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class y6p0 implements azf0 {
    public final zud0 a;
    public final MainLayout b;
    public final MainLayoutContentContainerView c;
    public final MainLayoutContentContainerView d;
    public final Guideline e;
    public final View f;
    public final View g;

    public y6p0(zud0 zud0Var) {
        this.a = zud0Var;
        MainLayout mainLayout = (MainLayout) zud0Var.b;
        this.b = mainLayout;
        MainLayoutContentContainerView nowPlayingViewContainer = mainLayout.getNowPlayingViewContainer();
        nowPlayingViewContainer.getClass();
        this.c = nowPlayingViewContainer;
        this.d = mainLayout.getNowPlayingViewAttachmentsContainer();
        Guideline nowPlayingViewAnimationGuidelineBottom = mainLayout.getNowPlayingViewAnimationGuidelineBottom();
        nowPlayingViewAnimationGuidelineBottom.getClass();
        this.e = nowPlayingViewAnimationGuidelineBottom;
        View nowPlayingViewRegionExpanded = mainLayout.getNowPlayingViewRegionExpanded();
        nowPlayingViewRegionExpanded.getClass();
        this.f = nowPlayingViewRegionExpanded;
        View nowPlayingViewRegionCollapsed = mainLayout.getNowPlayingViewRegionCollapsed();
        nowPlayingViewRegionCollapsed.getClass();
        this.g = nowPlayingViewRegionCollapsed;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, com.spotify.mainlayout.ui.view.containers.MainLayoutContentContainerView] */
    @Override // p.azf0
    public final yyf0 a() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        ?? r1 = this.c;
        int translationY = ((int) r1.getTranslationY()) + r1.getTop();
        int translationY2 = ((int) r1.getTranslationY()) + r1.getBottom();
        if (this.a.r()) {
            int right = r1.getRight();
            ViewGroup.LayoutParams layoutParams = r1.getLayoutParams();
            marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            i = right + (marginLayoutParams != null ? marginLayoutParams.rightMargin : 0);
        } else {
            int left = r1.getLeft();
            ViewGroup.LayoutParams layoutParams2 = r1.getLayoutParams();
            marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            i = left - (marginLayoutParams != null ? marginLayoutParams.leftMargin : 0);
        }
        return new x6p0(r1.m76getBackgroundColor0d7_KjU(), translationY, translationY2, i + ((int) r1.getTranslationX()));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, com.spotify.mainlayout.ui.view.containers.MainLayoutContentContainerView] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p.azf0
    public final void b(zyf0 zyf0Var) {
        int i;
        long jE;
        c7p0 c7p0Var = zyf0Var.a;
        ?? r1 = this.c;
        qhl layoutParams = r1.getLayoutParams();
        if (layoutParams == null) {
            bhn0.i("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        qhl qhlVar = layoutParams;
        boolean z = zyf0Var == zyf0.f;
        boolean z2 = zyf0Var == zyf0.e;
        View viewN = this.a.n(zyf0Var);
        ((ViewGroup.MarginLayoutParams) qhlVar).width = z2 ? viewN.getRight() - viewN.getLeft() : 0;
        int iOrdinal = c7p0Var.ordinal();
        if (iOrdinal == 0) {
            i = 0;
        } else {
            if (iOrdinal != 1) {
                eg.o();
                return;
            }
            i = -2;
        }
        ((ViewGroup.MarginLayoutParams) qhlVar).height = i;
        qhlVar.i = z ? -1 : viewN.getId();
        qhlVar.j = z ? 0 : -1;
        qhlVar.l = z ? -1 : viewN.getId();
        qhlVar.F = 1.0f;
        qhlVar.t = z2 ? -1 : viewN.getId();
        qhlVar.s = z2 ? 0 : -1;
        qhlVar.v = z2 ? -1 : viewN.getId();
        r1.setLayoutParams(qhlVar);
        r1.setTranslationX(0.0f);
        r1.setTranslationY(0.0f);
        o6 o6Var = this.d;
        if (o6Var != null) {
            o6Var.setTranslationY(0.0f);
        }
        int iOrdinal2 = c7p0Var.ordinal();
        ConstraintLayout constraintLayout = this.b;
        if (iOrdinal2 == 0) {
            jE = z4p1.e(xfo1.r(constraintLayout, 2130968768));
        } else {
            if (iOrdinal2 != 1) {
                eg.o();
                return;
            }
            jE = z4p1.e(xfo1.r(constraintLayout, 2130968739));
        }
        r1.m80setBackgroundColor8_81llA(jE);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [android.view.View, com.spotify.mainlayout.ui.view.containers.MainLayoutContentContainerView] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p.azf0
    public final void c(yyf0 yyf0Var) {
        x6p0 x6p0Var = (x6p0) yyf0Var;
        int i = x6p0Var.c;
        zud0 zud0Var = this.a;
        View view = this.f;
        int iP = i - zud0Var.p(view);
        int top = x6p0Var.a - view.getTop();
        ?? r2 = this.c;
        r2.setTranslationX(iP);
        float f = top;
        r2.setTranslationY(f);
        o6 o6Var = this.d;
        if (o6Var != null) {
            o6Var.setTranslationY(f);
        }
        Guideline guideline = this.e;
        qhl layoutParams = guideline.getLayoutParams();
        if (layoutParams == null) {
            bhn0.i("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        qhl qhlVar = layoutParams;
        qhlVar.a = x6p0Var.b - top;
        guideline.setLayoutParams(qhlVar);
        r2.m80setBackgroundColor8_81llA(x6p0Var.d);
    }

    @Override // p.azf0
    public final void d(Set set) {
        o6 o6Var = this.c;
        ViewGroup.LayoutParams layoutParams = o6Var.getLayoutParams();
        if (layoutParams == null) {
            bhn0.i("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        qhl qhlVar = (qhl) layoutParams;
        ((ViewGroup.MarginLayoutParams) qhlVar).height = 0;
        View view = this.f;
        qhlVar.i = view.getId();
        qhlVar.j = -1;
        qhlVar.l = this.e.getId();
        qhlVar.t = view.getId();
        qhlVar.s = -1;
        if (qhlVar.v == -1 || set.contains(zyf0.c)) {
            qhlVar.v = view.getId();
            ((ViewGroup.MarginLayoutParams) qhlVar).width = 0;
        } else {
            ((ViewGroup.MarginLayoutParams) qhlVar).width = o6Var.getWidth();
        }
        o6Var.setLayoutParams(qhlVar);
    }

    @Override // p.azf0
    public final yyf0 e(zyf0 zyf0Var) {
        int height;
        long jE;
        zud0 zud0Var = this.a;
        View viewN = zud0Var.n(zyf0Var);
        ConstraintLayout constraintLayout = (MainLayout) zud0Var.b;
        int iOrdinal = zyf0Var.ordinal();
        int width = 0;
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            height = 0;
        } else {
            if (iOrdinal != 3) {
                eg.o();
                return null;
            }
            height = constraintLayout.getHeight() - this.g.getTop();
        }
        int iOrdinal2 = zyf0Var.ordinal();
        if (iOrdinal2 != 0 && iOrdinal2 != 1) {
            if (iOrdinal2 == 2) {
                boolean zR = zud0Var.r();
                View view = this.f;
                width = zR ? -view.getRight() : constraintLayout.getWidth() - view.getLeft();
            } else if (iOrdinal2 != 3) {
                eg.o();
                return null;
            }
        }
        int top = viewN.getTop() + height;
        int bottom = viewN.getBottom() + height;
        int iP = zud0Var.p(viewN) + width;
        int iOrdinal3 = zyf0Var.a.ordinal();
        ConstraintLayout constraintLayout2 = this.b;
        if (iOrdinal3 == 0) {
            jE = z4p1.e(xfo1.r(constraintLayout2, 2130968768));
        } else {
            if (iOrdinal3 != 1) {
                eg.o();
                return null;
            }
            jE = z4p1.e(xfo1.r(constraintLayout2, 2130968739));
        }
        return new x6p0(jE, top, bottom, iP);
    }
}
