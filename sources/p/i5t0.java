package p;

import android.graphics.Rect;
import android.view.View;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/i5t0;", "Lp/uim0;", "Lp/k5t0;", "src_main_java_com_spotify_home_evopage_promo_pixeltracking-pixeltracking"}, k = 1, mv = {2, 3, 0}, xi = 48)
final /* data */ class i5t0 extends uim0 {
    public final View a;
    public final iac0 b;
    public final int c;
    public final iu30 d;

    public i5t0(View view, iac0 iac0Var, int i, iu30 iu30Var) {
        this.a = view;
        this.b = iac0Var;
        this.c = i;
        this.d = iu30Var;
    }

    public final pim0 a() {
        return new k5t0(this.a, this.b, this.c, this.d);
    }

    public final void b(pim0 pim0Var) {
        k5t0 k5t0Var = (k5t0) pim0Var;
        Rect rect = k5t0Var.S0;
        ek2 ek2Var = k5t0Var.Y0;
        View view = k5t0Var.O0;
        View view2 = this.a;
        boolean z = view != view2;
        iac0 iac0Var = k5t0Var.P0;
        iac0 iac0Var2 = this.b;
        boolean z2 = iac0Var != iac0Var2;
        int i = k5t0Var.Q0;
        int i2 = this.c;
        boolean z3 = i != i2;
        if (((pim0) k5t0Var).N0 && z2) {
            k5t0Var.I1();
            k5t0Var.P0.getLifecycle().d(ek2Var);
        }
        k5t0Var.O0 = view2;
        k5t0Var.P0 = iac0Var2;
        k5t0Var.Q0 = i2;
        k5t0Var.R0 = this.d;
        if (((pim0) k5t0Var).N0 && z2) {
            iac0Var2.getLifecycle().a(ek2Var);
        }
        if (((pim0) k5t0Var).N0 && ((z || z2) && iac0Var2.getLifecycle().b().a(w8c0.e) && (z || k5t0Var.T0 == null))) {
            k5t0Var.O0.getWindowVisibleDisplayFrame(rect);
            k5t0Var.T0 = l0p1.w(new Rect(rect.left, rect.top, rect.right, rect.bottom - k5t0Var.Q0));
        } else if (z3 && k5t0Var.T0 != null) {
            k5t0Var.T0 = l0p1.w(new Rect(rect.left, rect.top, rect.right, rect.bottom - k5t0Var.Q0));
        }
        if (((pim0) k5t0Var).N0) {
            if (z || z2 || z3) {
                k5t0Var.H1();
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5t0)) {
            return false;
        }
        i5t0 i5t0Var = (i5t0) obj;
        return u890.j(this.a, i5t0Var.a) && u890.j(this.b, i5t0Var.b) && this.c == i5t0Var.c && u890.j(this.d, i5t0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kaa0.f(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }
}
