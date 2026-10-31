package p;

import android.content.Context;
import android.os.Build;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class eae1 extends pim0 implements mv40, sjp0, j4k {
    public y9e1 O0;
    public iu30 P0;
    public Function0 Q0;
    public boolean R0;
    public final LinkedHashMap S0 = new LinkedHashMap();
    public int T0;
    public int U0;
    public xab1 V0;
    public nk80 W0;
    public nk80 X0;
    public m511 Y0;
    public elb0 Z0;

    public eae1(y9e1 y9e1Var, iu30 iu30Var, Function0 function0, boolean z) {
        this.O0 = y9e1Var;
        this.P0 = iu30Var;
        this.Q0 = function0;
        this.R0 = z;
        nk80 nk80Var = nk80.e;
        this.W0 = nk80Var;
        this.X0 = nk80Var;
    }

    public final void A1() {
        xab1 xab1Var = this.V0;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.V0 = null;
        this.S0.clear();
    }

    public final void E(elb0 elb0Var) {
        this.Z0 = elb0Var;
        if (!((pim0) this).N0 || this.S0.size() == this.O0.b.f) {
            return;
        }
        float fFloatValue = ((Number) this.Q0.invoke()).floatValue();
        xab1 xab1Var = this.V0;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.V0 = fn31.T(v1(), (o8n) null, 0, new dae1(xab1Var, fFloatValue, this, elb0Var, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    public final void H1() {
        m511 m511Var;
        nk80 nk80VarI;
        int iIntValue;
        nk80 nk80VarI2;
        if (this.R0) {
            jp80 jp80VarA = ((op80) ((u601) lcc.z(this, gfe0.a)).getValue()).a(vgp1.R0);
            Function0 function0 = jp80VarA != null ? jp80VarA.c : null;
            if (function0 != null) {
                m511Var = (m511) function0.invoke();
            } else {
                m511Var = null;
            }
        } else {
            m511Var = null;
        }
        this.Y0 = m511Var;
        View view = (View) lcc.z(this, AndroidCompositionLocals_androidKt.f);
        WeakHashMap weakHashMap = b8k1.a;
        hsl1 hsl1VarA = s7k1.a(view);
        nk80 nk80Var = nk80.e;
        if (hsl1VarA == null || (nk80VarI = hsl1VarA.a.i(519)) == null) {
            nk80VarI = nk80Var;
        }
        this.W0 = nk80VarI;
        if (hsl1VarA != null && (nk80VarI2 = hsl1VarA.a.i(128)) != null) {
            nk80Var = nk80VarI2;
        }
        this.X0 = nk80Var;
        this.U0 = ((Context) lcc.z(this, AndroidCompositionLocals_androidKt.b)).getResources().getDisplayMetrics().heightPixels;
        int iA = (int) (((crl1) lcc.z(this, t4k.u)).a() & 4294967295L);
        Integer numValueOf = iA > 0 ? Integer.valueOf(iA) : null;
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue();
        } else {
            int i = Build.VERSION.SDK_INT;
            int i2 = this.U0;
            if (i < 35) {
                i2 = i2 + this.X0.b + this.W0.d;
            }
            iIntValue = i2;
        }
        this.T0 = iIntValue;
    }

    public final void f0() {
        H1();
    }

    public final boolean w1() {
        return false;
    }

    public final void z1() {
        H1();
        p9p1.z(this, new fjc1(this, (byte) 16));
    }
}
