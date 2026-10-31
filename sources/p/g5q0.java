package p;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class g5q0 extends pim0 implements sjp0 {
    public Function0 O0;
    public bhe1 P0;
    public xab1 Q0;
    public boolean R0;
    public ho11 S0;
    public final gv20 T0 = new gv20((Object) this, (byte) 29);

    public g5q0(Function0 function0) {
        this.O0 = function0;
    }

    public final void A1() {
        bhe1 bhe1Var = this.P0;
        if (bhe1Var != null) {
            bhe1Var.b();
        }
    }

    public final void B1() {
        xab1 xab1Var = this.Q0;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.Q0 = null;
        this.R0 = false;
        this.S0 = null;
    }

    public final void H1(ho11 ho11Var) {
        xab1 xab1Var;
        this.S0 = ho11Var;
        long j = ho11Var.e;
        int i = (int) (j >> 32);
        int i2 = (int) j;
        long j2 = ho11Var.a;
        int i3 = (int) (j2 >> 32);
        int iMin = Math.min(Math.max(i3, 0), i);
        int i4 = (int) j2;
        int iMin2 = Math.min(Math.max(i4, 0), i2);
        long j3 = ho11Var.b;
        int i5 = (int) (j3 >> 32);
        int i6 = (int) j3;
        float fMax = Math.max((Math.max(Math.min(i6, i2), 0) - iMin2) * (Math.max(Math.min(i5, i), 0) - iMin), 0) / Math.min(i2 * i, (i6 - i4) * (i5 - i3));
        boolean z = fMax > 1.0f || fMax == 1.0f;
        if (z && !this.R0) {
            bhe1 bhe1Var = this.P0;
            if (bhe1Var != null) {
                bhe1Var.b();
            }
            xab1 xab1Var2 = this.Q0;
            if (xab1Var2 != null) {
                xab1Var2.d((CancellationException) null);
            }
            this.O0.invoke();
        } else if (!z && this.R0 && (xab1Var = this.Q0) != null) {
            xab1Var.d((CancellationException) null);
        }
        this.R0 = z;
    }

    public final void z1() {
        bhe1 bhe1Var = this.P0;
        if (bhe1Var != null) {
            bhe1Var.b();
        }
        this.P0 = grn1.t(this, 0L, 0L, this.T0);
    }

    public final void f0() {
    }
}
