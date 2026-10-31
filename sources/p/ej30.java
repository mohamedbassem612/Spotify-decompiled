package p;

import android.graphics.Rect;
import android.graphics.RectF;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class ej30 {
    public static void f(View view, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) == view) {
                return;
            }
        }
        WeakHashMap weakHashMap = b8k1.a;
        if (view.getTransitionName() != null) {
            list.add(view);
        }
        for (int i2 = size; i2 < list.size(); i2++) {
            View view2 = (View) list.get(i2);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = viewGroup.getChildAt(i3);
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size) {
                            if (childAt.getTransitionName() == null) {
                                break;
                            }
                            list.add(childAt);
                            break;
                        } else if (list.get(i4) == childAt) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
            }
        }
    }

    public static void j(Rect rect, View view) {
        if (view.isAttachedToWindow()) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset(iArr[0], iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public static boolean k(List list) {
        return list == null || list.isEmpty();
    }

    public void a(View view, Object obj) {
        ((Transition) obj).addTarget(view);
    }

    public abstract void b(Object obj, ArrayList arrayList);

    public void e(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    public boolean g(Object obj) {
        return obj instanceof Transition;
    }

    public Object h(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    public Object i(ViewGroup viewGroup, Object obj) {
        return null;
    }

    public boolean l() {
        th30.P(4);
        return false;
    }

    public boolean m(Object obj) {
        if (!th30.P(2)) {
            return false;
        }
        Objects.toString(obj);
        return false;
    }

    public abstract Object n(Object obj, Object obj2, Object obj3);

    public Object o(Object obj, Object obj2) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        transitionSet.addTransition((Transition) obj2);
        return transitionSet;
    }

    public void p(Object obj, View view, ArrayList arrayList) {
        ((Transition) obj).addListener(new zi30(view, arrayList, (byte) 0));
    }

    public abstract void q(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2);

    public void s(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            j(rect, view);
            ((Transition) obj).setEpicenterCallback(new yi30(rect, (byte) 0));
        }
    }

    public void t(Object obj, Rect rect) {
        ((Transition) obj).setEpicenterCallback(new yi30(rect, (byte) 1));
    }

    public void u(Object obj, vhd vhdVar, fss fssVar, Runnable runnable) {
        ((gss) runnable).run();
    }

    public void v(zf30 zf30Var, Object obj, vhd vhdVar, Runnable runnable) {
        ((Transition) obj).addListener(new bj30(runnable));
    }

    public abstract void w(Object obj, View view, ArrayList arrayList);

    public abstract void x(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public Object y(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    public void c(Object obj) {
    }

    public void d(Object obj, e0i e0iVar) {
    }

    public void r(float f, Object obj) {
    }
}
