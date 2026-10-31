package p;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jt1 extends zf30 implements o6r0, jik1, lir0 {
    public final g21 F1;
    public final lik1 G1 = nik1.F1;
    public gxo H1;
    public so1 I1;
    public gw70 J1;
    public b2r0 K1;
    public w1r0 L1;
    public Boolean M1;

    public jt1(g21 g21Var) {
        this.F1 = g21Var;
    }

    public final void A0() {
        w1r0 w1r0Var = this.L1;
        if (w1r0Var == null) {
            u890.C("pageBoundOverlayLogger");
            throw null;
        }
        w1r0Var.c = false;
        w1r0Var.b.a();
        ((zf30) this).h1 = true;
    }

    public final void Y0() {
        Boolean bool;
        Window window;
        if (Build.VERSION.SDK_INT < 29 || (bool = this.M1) == null) {
            return;
        }
        boolean zBooleanValue = bool.booleanValue();
        dg30 dg30VarF0 = f0();
        if (dg30VarF0 != null && (window = dg30VarF0.getWindow()) != null) {
            window.setNavigationBarContrastEnforced(zBooleanValue);
        }
        this.M1 = null;
    }

    public final mir0 c() {
        uba ubaVar = this.K1;
        if (ubaVar != null) {
            return new mir0(ubaVar.a());
        }
        u890.C("pageBoundUbiLogger");
        throw null;
    }

    public final n6r0 e() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return yon1.B3();
    }

    public final lik1 getViewUri() {
        return this.G1;
    }

    public final void v0(Context context) {
        this.F1.f(this);
        super.v0(context);
        w1r0 w1r0Var = this.L1;
        if (w1r0Var == null) {
            u890.C("pageBoundOverlayLogger");
            throw null;
        }
        uba ubaVar = this.K1;
        if (ubaVar == null) {
            u890.C("pageBoundUbiLogger");
            throw null;
        }
        w1r0Var.b.b(ubaVar.a().subscribe(new ixp0(w1r0Var, (byte) 7)));
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 29) {
            Window window = N0().getWindow();
            this.M1 = Boolean.valueOf(window.isNavigationBarContrastEnforced());
            window.setNavigationBarContrastEnforced(false);
        }
        ComposeView composeView = new ComposeView(P0(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setClickable(false);
        composeView.setFocusable(false);
        jp80 jp80Var = new jp80(new it1(composeView, (byte) 0));
        b2r0 b2r0Var = this.K1;
        if (b2r0Var == null) {
            u890.C("pageBoundUbiLogger");
            throw null;
        }
        if (b2r0Var == null) {
            u890.C("pageBoundUbiLogger");
            throw null;
        }
        jp80 eq80Var = new eq80(new e3h1(b2r0Var, (n7h1) null, b2r0Var));
        jp80 wchVar = q6x.b;
        if (jp80Var.equals(wchVar) && eq80Var.equals(wchVar)) {
            jp80Var = wchVar;
        } else if (jp80Var.equals(wchVar)) {
            jp80Var = eq80Var;
        } else if (!eq80Var.equals(wchVar)) {
            wchVar = new wch(jp80Var, eq80Var);
            jp80Var = wchVar;
        }
        composeView.setContent(new j2i(341356047, new n2(this, jp80Var, (byte) 14), true));
        return composeView;
    }

    public final void z0() {
        Y0();
        ((zf30) this).h1 = true;
    }
}
