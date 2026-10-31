package p;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Guideline;
import com.spotify.mainlayout.ui.view.MainLayout;
import com.spotify.mainlayout.ui.view.containers.MainLayoutConstrainedContainerView;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wtn0 implements azf0 {
    public final zud0 a;
    public final MainLayout b;
    public final MainLayoutConstrainedContainerView c;
    public final Guideline d;
    public final Barrier e;
    public final View f;
    public final idd1 g;
    public final idd1 h;

    public wtn0(zud0 zud0Var) {
        this.a = zud0Var;
        MainLayout mainLayout = (MainLayout) zud0Var.b;
        this.b = mainLayout;
        MainLayoutConstrainedContainerView navigationContainerWrapper = mainLayout.getNavigationContainerWrapper();
        navigationContainerWrapper.getClass();
        this.c = navigationContainerWrapper;
        Guideline navigationAnimationGuidelineEnd = mainLayout.getNavigationAnimationGuidelineEnd();
        navigationAnimationGuidelineEnd.getClass();
        this.d = navigationAnimationGuidelineEnd;
        Barrier fragmentContainerBarrierEnd = mainLayout.getFragmentContainerBarrierEnd();
        fragmentContainerBarrierEnd.getClass();
        this.e = fragmentContainerBarrierEnd;
        View displayCutoutPlaceholderEnd = mainLayout.getDisplayCutoutPlaceholderEnd();
        displayCutoutPlaceholderEnd.getClass();
        this.f = displayCutoutPlaceholderEnd;
        this.g = new idd1(new vtn0(this, (byte) 1));
        this.h = new idd1(new vtn0(this, (byte) 0));
    }

    @Override // p.azf0
    public final yyf0 a() {
        zud0 zud0Var = this.a;
        MainLayoutConstrainedContainerView mainLayoutConstrainedContainerView = this.c;
        int iK = zud0Var.k(mainLayoutConstrainedContainerView);
        ViewGroup.LayoutParams layoutParams = mainLayoutConstrainedContainerView.getLayoutParams();
        return new utn0(iK, layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0, mainLayoutConstrainedContainerView.getPercentageWidth());
    }

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
        int id;
        int iIntValue;
        float fFloatValue;
        MainLayoutConstrainedContainerView mainLayoutConstrainedContainerView = this.c;
        ViewGroup.LayoutParams layoutParams = mainLayoutConstrainedContainerView.getLayoutParams();
        if (layoutParams == null) {
            bhn0.i("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        qhl qhlVar = (qhl) layoutParams;
        boolean z = zyf0Var.b;
        if (z) {
            id = this.f.getId();
        } else {
            if (z) {
                eg.o();
                return;
            }
            id = this.e.getId();
        }
        qhlVar.u = id;
        int iOrdinal = zyf0Var.ordinal();
        if (iOrdinal == 0) {
            iIntValue = 0;
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2 && iOrdinal != 3) {
                eg.o();
                return;
            }
            iIntValue = 0;
        } else {
            iIntValue = ((Number) this.h.getValue()).intValue();
        }
        qhlVar.setMarginStart(iIntValue);
        mainLayoutConstrainedContainerView.setLayoutParams(qhlVar);
        int iOrdinal2 = zyf0Var.ordinal();
        if (iOrdinal2 == 0) {
            fFloatValue = ((Number) this.g.getValue()).floatValue();
        } else if (iOrdinal2 != 1) {
            if (iOrdinal2 != 2 && iOrdinal2 != 3) {
                eg.o();
                return;
            }
            fFloatValue = ((Number) this.g.getValue()).floatValue();
        } else {
            fFloatValue = 1.0f;
        }
        mainLayoutConstrainedContainerView.setPercentageWidth(fFloatValue);
    }

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
        utn0 utn0Var = (utn0) yyf0Var;
        Guideline guideline = this.d;
        qhl layoutParams = guideline.getLayoutParams();
        if (layoutParams == null) {
            bhn0.i("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        qhl qhlVar = layoutParams;
        int width = utn0Var.a;
        zud0 zud0Var = this.a;
        if (zud0Var.r()) {
            width = ((MainLayout) zud0Var.b).getWidth() - width;
        }
        qhlVar.a = width;
        guideline.setLayoutParams(qhlVar);
        MainLayoutConstrainedContainerView mainLayoutConstrainedContainerView = this.c;
        ViewGroup.LayoutParams layoutParams2 = mainLayoutConstrainedContainerView.getLayoutParams();
        if (layoutParams2 == null) {
            bhn0.i("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        qhl qhlVar2 = (qhl) layoutParams2;
        qhlVar2.setMarginStart(utn0Var.b);
        mainLayoutConstrainedContainerView.setLayoutParams(qhlVar2);
        mainLayoutConstrainedContainerView.setPercentageWidth(utn0Var.c);
    }

    @Override // p.azf0
    public final void d(Set set) {
        MainLayoutConstrainedContainerView mainLayoutConstrainedContainerView = this.c;
        qhl layoutParams = mainLayoutConstrainedContainerView.getLayoutParams();
        if (layoutParams == null) {
            bhn0.i("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        qhl qhlVar = layoutParams;
        qhlVar.u = this.d.getId();
        mainLayoutConstrainedContainerView.setLayoutParams(qhlVar);
    }

    @Override // p.azf0
    public final yyf0 e(zyf0 zyf0Var) {
        int iP;
        int iIntValue;
        float fFloatValue;
        boolean z = zyf0Var.b;
        zud0 zud0Var = this.a;
        if (z) {
            iP = zud0Var.p(this.f);
        } else {
            if (z) {
                eg.o();
                return null;
            }
            iP = zud0Var.p(zud0Var.n(zyf0Var));
        }
        int iOrdinal = zyf0Var.ordinal();
        if (iOrdinal == 0) {
            iIntValue = 0;
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2 && iOrdinal != 3) {
                eg.o();
                return null;
            }
            iIntValue = 0;
        } else {
            iIntValue = ((Number) this.h.getValue()).intValue();
        }
        int iOrdinal2 = zyf0Var.ordinal();
        if (iOrdinal2 == 0) {
            fFloatValue = ((Number) this.g.getValue()).floatValue();
        } else if (iOrdinal2 != 1) {
            if (iOrdinal2 != 2 && iOrdinal2 != 3) {
                eg.o();
                return null;
            }
            fFloatValue = ((Number) this.g.getValue()).floatValue();
        } else {
            fFloatValue = 1.0f;
        }
        return new utn0(iP, iIntValue, fFloatValue);
    }
}
