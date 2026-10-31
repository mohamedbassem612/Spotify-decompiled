package p;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class x22 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public x22(hzb1 hzb1Var, w2s w2sVar) {
        this.a = (byte) 9;
        this.b = hzb1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        nk80 nk80VarI;
        byte b = this.a;
        int i = 0;
        i = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((lt41) obj).invoke();
                return;
            case 1:
                vk5 vk5Var = (vk5) obj;
                if (!vk5Var.getInternalPopup().a()) {
                    vk5Var.f.i(vk5Var.getTextDirection(), vk5Var.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = vk5Var.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    return;
                }
                return;
            case 2:
                sk5 sk5Var = (sk5) obj;
                vk5 vk5Var2 = sk5Var.f1;
                if (!vk5Var2.isAttachedToWindow() || !vk5Var2.getGlobalVisibleRect(sk5Var.d1)) {
                    sk5Var.dismiss();
                    return;
                } else {
                    sk5Var.s();
                    sk5Var.m();
                    return;
                }
            case 3:
                a2e a2eVar = (a2e) obj;
                ArrayList arrayList = a2eVar.h;
                if (!a2eVar.a() || arrayList.size() <= 0 || ((z1e) arrayList.get(0)).a.X0) {
                    return;
                }
                View view = a2eVar.O0;
                if (view == null || !view.isShown()) {
                    a2eVar.dismiss();
                    return;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((z1e) it.next()).a.m();
                }
                return;
            case 4:
                View view2 = ((a2w) obj).i;
                WeakHashMap weakHashMap = b8k1.a;
                hsl1 hsl1VarA = s7k1.a(view2);
                if (hsl1VarA != null && (nk80VarI = hsl1VarA.a.i(519)) != null) {
                    i = nk80VarI.b;
                }
                view2.setPadding(view2.getPaddingLeft(), i, view2.getPaddingRight(), view2.getPaddingBottom());
                return;
            case 5:
                ze70 ze70Var = (ze70) obj;
                View view3 = ze70Var.R1;
                if (view3 == null) {
                    u890.C("gradient");
                    throw null;
                }
                view3.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                ze70.Y0(ze70Var);
                eg7 eg7Var = new eg7(ze70Var, (byte) 15);
                ze70Var.V1 = eg7Var;
                View view4 = ze70Var.R1;
                if (view4 != null) {
                    view4.addOnLayoutChangeListener(eg7Var);
                    return;
                } else {
                    u890.C("gradient");
                    throw null;
                }
            case 6:
                ((dt90) obj).invoke();
                return;
            case 7:
                mzr0 mzr0Var = (mzr0) ((wva0) obj).c;
                View childAt = ((NestedScrollView) mzr0Var.f).getChildAt(0);
                if (childAt == null) {
                    return;
                }
                ((NestedScrollView) mzr0Var.f).setNestedScrollingEnabled(childAt.getHeight() > ((NestedScrollView) mzr0Var.f).getHeight());
                return;
            case 8:
                qfb1 qfb1Var = (qfb1) obj;
                lti0 lti0Var = qfb1Var.h;
                if (!qfb1Var.a() || lti0Var.X0) {
                    return;
                }
                View view5 = qfb1Var.Z;
                if (view5 == null || !view5.isShown()) {
                    qfb1Var.dismiss();
                    return;
                } else {
                    lti0Var.m();
                    return;
                }
            case 9:
                hzb1 hzb1Var = (hzb1) obj;
                ViewGroup viewGroup = hzb1Var.a;
                viewGroup.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                View view6 = hzb1Var.c;
                View view7 = hzb1Var.d;
                View view8 = hzb1Var.f;
                View view9 = hzb1Var.e;
                View view10 = hzb1Var.g;
                int iU = oho1.u(viewGroup.getContext(), 2131165897);
                int iU2 = oho1.u(viewGroup.getContext(), 2131165905);
                int iU3 = oho1.u(viewGroup.getContext(), 2131165907);
                int iU4 = oho1.u(viewGroup.getContext(), 2131167119);
                WeakHashMap weakHashMap2 = b8k1.a;
                view6.setId(View.generateViewId());
                if (view8 != null) {
                    view8.setId(View.generateViewId());
                }
                view7.setId(2131431093);
                view9.setId(View.generateViewId());
                if (view10 != null) {
                    view10.setId(View.generateViewId());
                }
                viewGroup.removeAllViews();
                viewGroup.setMinHeight(oho1.u(viewGroup.getContext(), 2131167078));
                if (view10 != null) {
                    int iU5 = oho1.u(viewGroup.getContext(), 2131167081);
                    int iU6 = oho1.u(viewGroup.getContext(), 2131167080);
                    view10.setClipToOutline(true);
                    view10.setOutlineProvider(new hr31(viewGroup, (byte) 1));
                    sl11 sl11Var = new sl11(iU, (byte) 9);
                    qhl qhlVar = new qhl(iU5, iU6);
                    sl11Var.invoke(qhlVar);
                    viewGroup.addView(view10, (ViewGroup.LayoutParams) qhlVar);
                }
                e90 e90Var = new e90(view10, iU2, iU, (byte) 3);
                ViewGroup.LayoutParams qhlVar2 = new qhl(0, -2);
                e90Var.invoke(qhlVar2);
                viewGroup.addView(view6, qhlVar2);
                if (view8 != null) {
                    viewGroup.addView(view8, iU4, iU4);
                }
                int iU7 = oho1.u(viewGroup.getContext(), 2131165905);
                view7.setPadding(iU7, iU7, iU7, iU7);
                sl11 sl11Var2 = new sl11(iU, (byte) 10);
                ViewGroup.LayoutParams qhlVar3 = new qhl(iU4, iU4);
                sl11Var2.invoke(qhlVar3);
                viewGroup.addView(view7, qhlVar3);
                viewGroup.addView(view9, -1, oho1.u(viewGroup.getContext(), 2131167079));
                dgo1.r(viewGroup, false);
                ovd ovdVar = new ovd(view10, viewGroup, iU3, view6, iU, view8, view7, view9);
                kil kilVar = new kil();
                kilVar.f(viewGroup);
                ovdVar.invoke(kilVar);
                kilVar.b(viewGroup);
                ViewParent parent = viewGroup.getParent();
                View view11 = parent instanceof View ? (View) parent : null;
                if (view11 == null || !view11.getFitsSystemWindows()) {
                    if (viewGroup.isAttachedToWindow()) {
                        viewGroup.requestApplyInsets();
                    } else {
                        viewGroup.addOnAttachStateChangeListener(new c9s(viewGroup, viewGroup, (byte) 10));
                    }
                    ViewParent parent2 = viewGroup.getParent();
                    ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                    if (viewGroup2 == null) {
                        viewGroup2 = viewGroup;
                    }
                    r7k1.c(viewGroup2, new xq81(viewGroup, (byte) 10));
                }
                view9.setImportantForAccessibility(2);
                View view12 = hzb1Var.g;
                if (view12 != null) {
                    view12.setImportantForAccessibility(2);
                }
                String string = viewGroup.getContext().getString(2131963219);
                b8k1.a(viewGroup, string, new nl51(viewGroup, (byte) 22));
                b8k1.m(viewGroup, fg.g, string, new dr41(viewGroup, (byte) 23));
                return;
            default:
                jkk1 jkk1Var = (jkk1) obj;
                if (jkk1Var.b() == null) {
                    jkk1Var.h = true;
                    return;
                }
                return;
        }
    }

    public /* synthetic */ x22(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
