package p;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kgr0 extends o6 {
    public static final /* synthetic */ int T0 = 0;
    public final hrr0 N0;
    public final hrr0 O0;
    public final hrr0 P0;
    public final hrr0 Q0;
    public final hrr0 R0;
    public final idd1 S0;

    /* JADX WARN: Multi-variable type inference failed */
    public kgr0(Context context) {
        super(context, (AttributeSet) null, 4, 0);
        this.N0 = v8r.q((Object) null);
        this.O0 = v8r.q((Object) null);
        this.P0 = v8r.q(ogr0.a);
        this.Q0 = v8r.q((Object) null);
        this.R0 = v8r.q((Object) null);
        this.S0 = new idd1(new gyq0(this, (byte) 16));
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    }

    private final bbr0 getPageProperties() {
        return (bbr0) this.S0.getValue();
    }

    public final void a(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(791401767);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            kiv kivVar = szf0.a;
            rzf0 rzf0VarB = szf0.b((View) x340Var.k(AndroidCompositionLocals_androidKt.f));
            mod.c(new ely0[]{k2r0.b.a(getPageProperties()), kivVar.a(rzf0VarB), szf0.b.a(rzf0VarB != null ? rzf0VarB.a() : null)}, apo.r(-1879873433, new jgr0(this, (byte) 2), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jgr0(this, i);
        }
    }

    public final vu30 getActions() {
        return (vu30) this.O0.getValue();
    }

    public final sgr0 getBackground() {
        return (sgr0) this.P0.getValue();
    }

    public final Function0 getOnBackPressed() {
        return (Function0) this.R0.getValue();
    }

    public final ygr0 getScrollState() {
        return (ygr0) this.Q0.getValue();
    }

    public final vu30 getTitle() {
        return (vu30) this.N0.getValue();
    }

    public final void setActions(vu30 vu30Var) {
        this.O0.setValue(vu30Var);
    }

    public final void setBackground(sgr0 sgr0Var) {
        this.P0.setValue(sgr0Var);
    }

    public final void setOnBackPressed(Function0 function0) {
        this.R0.setValue(function0);
    }

    public final void setScrollState(ygr0 ygr0Var) {
        this.Q0.setValue(ygr0Var);
    }

    public final void setTitle(vu30 vu30Var) {
        this.N0.setValue(vu30Var);
    }
}
