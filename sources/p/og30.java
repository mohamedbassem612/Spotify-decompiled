package p;

import android.view.View;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Guideline;
import com.spotify.mainlayout.ui.view.MainLayout;
import com.spotify.mainlayout.ui.view.containers.MainLayoutFragmentContainerView;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class og30 implements azf0 {
    public final zud0 a;
    public final MainLayoutFragmentContainerView b;
    public final Barrier c;
    public final Guideline d;
    public final View e;

    public og30(zud0 zud0Var) {
        this.a = zud0Var;
        MainLayout mainLayout = (MainLayout) zud0Var.b;
        this.b = mainLayout.getFragmentContainer();
        Barrier fragmentContainerBarrierEnd = mainLayout.getFragmentContainerBarrierEnd();
        fragmentContainerBarrierEnd.getClass();
        this.c = fragmentContainerBarrierEnd;
        Guideline fragmentAnimationGuidelineEnd = mainLayout.getFragmentAnimationGuidelineEnd();
        fragmentAnimationGuidelineEnd.getClass();
        this.d = fragmentAnimationGuidelineEnd;
        View displayCutoutPlaceholderEnd = mainLayout.getDisplayCutoutPlaceholderEnd();
        displayCutoutPlaceholderEnd.getClass();
        this.e = displayCutoutPlaceholderEnd;
    }

    @Override // p.azf0
    public final yyf0 a() {
        return new ng30(this.a.k(this.b));
    }

    @Override // p.azf0
    public final void b(zyf0 zyf0Var) {
        int id;
        MainLayoutFragmentContainerView mainLayoutFragmentContainerView = this.b;
        qhl layoutParams = mainLayoutFragmentContainerView.getLayoutParams();
        if (layoutParams == null) {
            bhn0.i("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        qhl qhlVar = layoutParams;
        int iOrdinal = zyf0Var.ordinal();
        if (iOrdinal == 0) {
            id = this.c.getId();
        } else {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                eg.o();
                return;
            }
            id = this.e.getId();
        }
        qhlVar.u = id;
        mainLayoutFragmentContainerView.setLayoutParams(qhlVar);
    }

    @Override // p.azf0
    public final void c(yyf0 yyf0Var) {
        ng30 ng30Var = (ng30) yyf0Var;
        Guideline guideline = this.d;
        qhl layoutParams = guideline.getLayoutParams();
        if (layoutParams == null) {
            bhn0.i("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        qhl qhlVar = layoutParams;
        int width = ng30Var.a;
        zud0 zud0Var = this.a;
        if (zud0Var.r()) {
            width = ((MainLayout) zud0Var.b).getWidth() - width;
        }
        qhlVar.a = width;
        guideline.setLayoutParams(qhlVar);
    }

    @Override // p.azf0
    public final void d(Set set) {
        MainLayoutFragmentContainerView mainLayoutFragmentContainerView = this.b;
        qhl layoutParams = mainLayoutFragmentContainerView.getLayoutParams();
        if (layoutParams == null) {
            bhn0.i("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        qhl qhlVar = layoutParams;
        qhlVar.u = this.d.getId();
        mainLayoutFragmentContainerView.setLayoutParams(qhlVar);
    }

    @Override // p.azf0
    public final yyf0 e(zyf0 zyf0Var) {
        int iP;
        int iOrdinal = zyf0Var.ordinal();
        zud0 zud0Var = this.a;
        if (iOrdinal == 0) {
            iP = zud0Var.p(zud0Var.n(zyf0Var));
        } else {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                eg.o();
                return null;
            }
            iP = zud0Var.p(this.e);
        }
        return new ng30(iP);
    }
}
