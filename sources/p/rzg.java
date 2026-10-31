package p;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.spotify.allboarding.allboardingimpl.utils.PickerCollapsingTitleBar;
import com.spotify.encoreconsumermobile.layout.headers.BehaviorRetainingAppBarLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rzg implements wi5 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rzg(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void a(AppBarLayout appBarLayout, int i) {
        ten0 ten0VarC;
        float fO;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) obj;
                pzg pzgVar = collapsingToolbarLayout.N0;
                collapsingToolbarLayout.Z0 = i;
                hsl1 hsl1Var = collapsingToolbarLayout.b1;
                int iD = hsl1Var != null ? hsl1Var.d() : 0;
                int childCount = collapsingToolbarLayout.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = collapsingToolbarLayout.getChildAt(i2);
                    qzg layoutParams = childAt.getLayoutParams();
                    xck1 xck1VarB = CollapsingToolbarLayout.b(childAt);
                    int i3 = layoutParams.a;
                    if (i3 == 1) {
                        xck1VarB.b(u890.o(-i, 0, ((collapsingToolbarLayout.getHeight() - CollapsingToolbarLayout.b(childAt).b) - childAt.getHeight()) - ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin));
                    } else if (i3 == 2) {
                        xck1VarB.b(Math.round((-i) * layoutParams.b));
                    }
                }
                collapsingToolbarLayout.d();
                if (collapsingToolbarLayout.S0 != null && iD > 0) {
                    WeakHashMap weakHashMap = b8k1.a;
                    collapsingToolbarLayout.postInvalidateOnAnimation();
                }
                int height = collapsingToolbarLayout.getHeight();
                WeakHashMap weakHashMap2 = b8k1.a;
                int minimumHeight = (height - collapsingToolbarLayout.getMinimumHeight()) - iD;
                float scrimVisibleHeightTrigger = height - collapsingToolbarLayout.getScrimVisibleHeightTrigger();
                float f = minimumHeight;
                float fMin = Math.min(1.0f, scrimVisibleHeightTrigger / f);
                pzgVar.e = fMin;
                pzgVar.f = l1d.e(1.0f, fMin, 0.5f, fMin);
                pzgVar.g = collapsingToolbarLayout.Z0 + minimumHeight;
                pzgVar.n(Math.abs(i) / f);
                return;
            case 1:
                h72 h72Var = (h72) obj;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                if (totalScrollRange > 0) {
                    float f2 = (-i) / totalScrollRange;
                    ((Toolbar) h72Var.X).setAlpha(f2);
                    ((TextView) h72Var.Y).setAlpha(f2);
                    return;
                }
                return;
            case 2:
                mpk mpkVar = (mpk) obj;
                h360.l(mpkVar.b, i, (Barrier) mpkVar.c.c);
                return;
            case 3:
                iu30 iu30Var = ((avn) obj).S0;
                if (iu30Var != null) {
                    iu30Var.invoke(new ysn(i));
                    return;
                } else {
                    u890.C("event");
                    throw null;
                }
            case 4:
                imr imrVar = (imr) obj;
                h360.l(imrVar.a, i, (TextView) imrVar.b.g);
                return;
            case 5:
                zmr zmrVar = (zmr) obj;
                h72 h72Var2 = zmrVar.d;
                e93 e93Var = zmrVar.e;
                xik xikVar = zmrVar.c1;
                h360.l(h72Var2, i, (TextView) ((xikVar == null || xikVar.t == null) ? e93Var.U0 : e93Var.Q0));
                float measuredHeight = (appBarLayout.getMeasuredHeight() - ((Toolbar) h72Var2.X).getMeasuredHeight()) - ((ConstraintLayout) zmrVar.f.b).getMeasuredHeight();
                float f3 = ((i + measuredHeight) / measuredHeight) * 255.0f;
                ((View) e93Var.S0).getBackground().setAlpha((int) (255.0f - ((float) Math.rint(f3 >= 0.0f ? f3 : 0.0f))));
                return;
            case 6:
                f260 f260Var = new f260(yoi1.o((-i) / appBarLayout.getTotalScrollRange(), 0.01f, 1.0f), i);
                m2s m2sVar = (m2s) obj;
                h72 h72Var3 = m2sVar.h;
                ten0 ten0VarH = pv91.h();
                ten0 ten0Var = ten0VarH instanceof ten0 ? ten0VarH : null;
                if (ten0Var == null || (ten0VarC = ten0Var.C((iu30) null, (iu30) null)) == null) {
                    eg.m("Cannot create a mutable snapshot of an read-only snapshot");
                    return;
                }
                try {
                    jv91 jv91VarJ = ten0VarC.j();
                    try {
                        m2sVar.g.setValue(f260Var);
                        jv91.q(jv91VarJ);
                        ten0VarC.w().q();
                        ten0VarC.c();
                        h360.l(h72Var3, i, (Barrier) m2sVar.i.c);
                        h360.b(h72Var3, i);
                        h360.c(h72Var3, ((Number) m2sVar.e.getValue()).floatValue(), i, m2sVar.b ? m2sVar.c : null);
                        return;
                    } catch (Throwable th) {
                        jv91.q(jv91VarJ);
                        throw th;
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        ten0VarC.c();
                        throw th3;
                    }
                }
            case 7:
                uhs uhsVar = (uhs) obj;
                h360.l(uhsVar.d, i, (TextView) uhsVar.e.d);
                return;
            case 8:
                vis visVar = (vis) obj;
                h360.l(visVar.b, i, visVar.c.z);
                return;
            case 9:
                jys jysVar = (jys) obj;
                h360.l(jysVar.c, i, (Barrier) jysVar.d.c);
                return;
            case 10:
                xe00 xe00Var = (xe00) obj;
                byp bypVar = xe00Var.d;
                Barrier barrier = (Barrier) xe00Var.e.c;
                AppBarLayout appBarLayout2 = (BehaviorRetainingAppBarLayout) bypVar.b;
                float dimensionPixelSize = appBarLayout2.getContext().getResources().getDimensionPixelSize(2131167142);
                float y = barrier.getY();
                Toolbar toolbar = (Toolbar) bypVar.g;
                float f4 = -i;
                toolbar.setAlpha(yoi1.o(f4 - ((y - toolbar.getHeight()) - dimensionPixelSize), 0.0f, dimensionPixelSize) / dimensionPixelSize);
                float fMin2 = Math.min(toolbar.getHeight(), (appBarLayout2.getHeight() - barrier.getY()) - dimensionPixelSize);
                ((TextView) bypVar.i).setAlpha(yoi1.o(f4 - ((barrier.getY() - toolbar.getHeight()) + dimensionPixelSize), 0.0f, fMin2) / fMin2);
                return;
            case 11:
                PickerCollapsingTitleBar pickerCollapsingTitleBar = (PickerCollapsingTitleBar) obj;
                if (!pickerCollapsingTitleBar.f1) {
                    pickerCollapsingTitleBar.W0.setAlpha(appBarLayout.getTotalScrollRange() != 0 ? Math.abs(i / appBarLayout.getTotalScrollRange()) : 0.0f);
                    return;
                }
                float totalScrollRange2 = appBarLayout.getTotalScrollRange();
                fO = totalScrollRange2 > 0.0f ? yoi1.o(Math.abs(i) / totalScrollRange2, 0.0f, 1.0f) : 0.0f;
                iu30 onCollapseFractionChanged = pickerCollapsingTitleBar.getOnCollapseFractionChanged();
                if (onCollapseFractionChanged != null) {
                    onCollapseFractionChanged.invoke(Float.valueOf(fO));
                    return;
                }
                return;
            default:
                int iAbs = Math.abs(i);
                int totalScrollRange3 = appBarLayout.getTotalScrollRange();
                fO = totalScrollRange3 != 0 ? iAbs / totalScrollRange3 : 0.0f;
                bpb1 bpb1Var = ((uvv0) ((wva0) obj).e).b;
                Float fValueOf = Float.valueOf(fO);
                bpb1Var.getClass();
                bpb1Var.m((Object) null, fValueOf);
                return;
        }
    }
}
