package p;

import android.os.Bundle;
import android.view.View;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class d411 implements aac0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ d411(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // p.aac0
    public final void q(iac0 iac0Var, k8c0 k8c0Var) {
        View view;
        View view2;
        View view3;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                qe41 qe41Var = (qe41) obj;
                if (k8c0Var != k8c0.ON_CREATE) {
                    eg.f("Next event must be ON_CREATE");
                    return;
                }
                iac0Var.getLifecycle().d(this);
                Bundle bundleA = qe41Var.p().a("androidx.savedstate.Restarter");
                if (bundleA == null) {
                    return;
                }
                ArrayList<String> arrayListI = mue1.I(bundleA);
                if (arrayListI == null) {
                    eg.m("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    return;
                }
                for (String str : arrayListI) {
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str, false, d411.class.getClassLoader()).asSubclass(me41.class);
                        clsAsSubclass.getClass();
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                objNewInstance.getClass();
                                ((me41) objNewInstance).a(qe41Var);
                            } catch (Exception e) {
                                bhn0.o(l1d.m("Failed to instantiate ", str), e);
                                return;
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        bhn0.o(f4i1.f("Class ", str, " wasn't found"), e3);
                        return;
                    }
                }
                return;
            case 1:
                if (k8c0Var != k8c0.ON_STOP || (view = ((zf30) obj).j1) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
                return;
            default:
                jkk1 jkk1Var = (jkk1) obj;
                View.OnLayoutChangeListener onLayoutChangeListener = jkk1Var.s;
                View.OnAttachStateChangeListener onAttachStateChangeListener = jkk1Var.k;
                View view4 = jkk1Var.a;
                int i = gkk1.a[k8c0Var.ordinal()];
                if (i == 1) {
                    view4.addOnAttachStateChangeListener(onAttachStateChangeListener);
                    jkk1Var.c();
                    wzf0 wzf0VarB = jkk1Var.b();
                    if (wzf0VarB == null || (view2 = wzf0VarB.a) == null) {
                        return;
                    }
                    view2.addOnLayoutChangeListener(onLayoutChangeListener);
                    jkk1Var.e(view2);
                    return;
                }
                if (i == 2 || i == 3) {
                    view4.removeOnAttachStateChangeListener(onAttachStateChangeListener);
                    jkk1Var.d();
                    wzf0 wzf0VarB2 = jkk1Var.b();
                    if (wzf0VarB2 != null && (view3 = wzf0VarB2.a) != null) {
                        view3.removeOnLayoutChangeListener(onLayoutChangeListener);
                    }
                    if (k8c0Var == k8c0.ON_DESTROY) {
                        jkk1Var.r.c(jkk1.t[4], jkk1Var, (Object) null);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
