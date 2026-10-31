package p;

import android.view.ViewGroup;
import androidx.fragment.app.strictmode.FragmentReuseViolation;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;
import androidx.fragment.app.strictmode.GetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.Violation;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import androidx.fragment.app.strictmode.WrongNestedHierarchyViolation;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class vi30 {
    public static final ui30 a = ui30.a;

    public static ui30 a(zf30 zf30Var) {
        while (zf30Var != null) {
            if (zf30Var.q0()) {
                zf30Var.j0();
            }
            zf30Var = zf30Var.X0;
        }
        return a;
    }

    public static void b(Violation violation) {
        if (th30.P(3)) {
            violation.a.getClass();
        }
    }

    public static final void c(String str, zf30 zf30Var) {
        b(new FragmentReuseViolation("Attempting to reuse fragment " + zf30Var + " with previous ID " + str, zf30Var));
        a(zf30Var).getClass();
    }

    public static final void d(zf30 zf30Var, ViewGroup viewGroup) {
        b(new FragmentTagUsageViolation("Attempting to use <fragment> tag to add fragment " + zf30Var + " to container " + viewGroup, zf30Var));
        a(zf30Var).getClass();
    }

    public static final void e(zf30 zf30Var) {
        b(new GetRetainInstanceUsageViolation("Attempting to get retain instance for fragment " + zf30Var, zf30Var));
        a(zf30Var).getClass();
    }

    public static final void f(zf30 zf30Var) {
        b(new GetTargetFragmentUsageViolation("Attempting to get target fragment from fragment " + zf30Var, zf30Var));
        a(zf30Var).getClass();
    }

    public static final void g(zf30 zf30Var) {
        b(new SetRetainInstanceUsageViolation("Attempting to set retain instance for fragment " + zf30Var, zf30Var));
        a(zf30Var).getClass();
    }

    public static final void h(zf30 zf30Var, ViewGroup viewGroup) {
        b(new WrongFragmentContainerViolation("Attempting to add fragment " + zf30Var + " to container " + viewGroup + " which is not a FragmentContainerView", zf30Var));
        a(zf30Var).getClass();
    }

    public static final void i(zf30 zf30Var, zf30 zf30Var2, int i) {
        StringBuilder sb = new StringBuilder("Attempting to nest fragment ");
        sb.append(zf30Var);
        sb.append(" within the view of parent fragment ");
        sb.append(zf30Var2);
        sb.append(" via container with ID ");
        b(new WrongNestedHierarchyViolation(gvg.j(sb, i, " without using parent's childFragmentManager"), zf30Var));
        a(zf30Var).getClass();
    }
}
