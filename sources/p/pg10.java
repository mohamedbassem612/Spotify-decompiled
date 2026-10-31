package p;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class pg10 extends tjk1 {
    /* JADX WARN: Multi-variable type inference failed */
    public pg10(int i) {
        this.f1 = i;
    }

    public static float Y(omg1 omg1Var, float f) {
        Float f2;
        return (omg1Var == null || (f2 = (Float) omg1Var.a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    @Override // p.tjk1
    public ObjectAnimator V(ViewGroup viewGroup, View view, omg1 omg1Var, omg1 omg1Var2) {
        rik1.a.getClass();
        return X(view, Y(omg1Var, 0.0f), 1.0f);
    }

    @Override // p.tjk1
    public ObjectAnimator W(ViewGroup viewGroup, View view, omg1 omg1Var, omg1 omg1Var2) {
        tik1 tik1Var = rik1.a;
        tik1Var.getClass();
        ObjectAnimator objectAnimatorX = X(view, Y(omg1Var, 1.0f), 0.0f);
        if (objectAnimatorX == null) {
            tik1Var.z(view, Y(omg1Var2, 1.0f));
        }
        return objectAnimatorX;
    }

    public final ObjectAnimator X(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        rik1.a.z(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, rik1.b, f2);
        og10 og10Var = new og10(view);
        objectAnimatorOfFloat.addListener(og10Var);
        u().a(og10Var);
        return objectAnimatorOfFloat;
    }

    @Override // p.jhg1
    public final void i(omg1 omg1Var) {
        tjk1.T(omg1Var);
        View view = omg1Var.b;
        Float fValueOf = (Float) view.getTag(2131431519);
        if (fValueOf == null) {
            fValueOf = view.getVisibility() == 0 ? Float.valueOf(rik1.a.x(view)) : Float.valueOf(0.0f);
        }
        omg1Var.a.put("android:fade:transitionAlpha", fValueOf);
    }

    @Override // p.jhg1
    public final boolean z() {
        return true;
    }
}
