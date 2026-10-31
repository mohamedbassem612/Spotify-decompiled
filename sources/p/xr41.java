package p;

import androidx.car.app.model.Alert;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xr41 extends pim0 implements zlb0, t161 {
    public es41 O0;
    public boolean P0;

    public final int P0(x5f0 x5f0Var, afh0 afh0Var, int i) {
        if (this.P0) {
            i = Alert.DURATION_SHOW_INDEFINITELY;
        }
        return afh0Var.w(i);
    }

    public final int V0(x5f0 x5f0Var, afh0 afh0Var, int i) {
        if (this.P0) {
            i = Alert.DURATION_SHOW_INDEFINITELY;
        }
        return afh0Var.C(i);
    }

    public final hfh0 d(ifh0 ifh0Var, afh0 afh0Var, long j) {
        vxo1.k(j, this.P0 ? qqq0.a : qqq0.b);
        boolean z = this.P0;
        int i = Alert.DURATION_SHOW_INDEFINITELY;
        int iH = z ? Integer.MAX_VALUE : hjl.h(j);
        if (this.P0) {
            i = hjl.i(j);
        }
        q5t0 q5t0VarH = afh0Var.H(hjl.b(j, 0, i, 0, iH, 5));
        int i2 = q5t0VarH.a;
        int i3 = hjl.i(j);
        if (i2 > i3) {
            i2 = i3;
        }
        int i4 = q5t0VarH.b;
        int iH2 = hjl.h(j);
        if (i4 > iH2) {
            i4 = iH2;
        }
        int i5 = q5t0VarH.b - i4;
        int i6 = q5t0VarH.a - i2;
        if (!this.P0) {
            i5 = i6;
        }
        this.O0.h(i5);
        this.O0.b.t(this.P0 ? i4 : i2);
        this.O0.c.t(this.P0 ? q5t0VarH.b : q5t0VarH.a);
        this.O0.d.setValue(Boolean.FALSE);
        return ifh0Var.S(i2, i4, b7x.a, new g311(this, i5, q5t0VarH, (byte) 1));
    }

    public final void g(e261 e261Var) {
        final byte b = 1;
        b261.F(e261Var, true);
        final byte b2 = 0;
        pq41 pq41Var = new pq41(new Function0(this) { // from class: p.wr41
            public final /* synthetic */ xr41 b;

            {
                this.b = this;
            }

            public final Object invoke() {
                int iS;
                byte b3 = b2;
                xr41 xr41Var = this.b;
                switch (b3) {
                    case 0:
                        iS = xr41Var.O0.a.s();
                        break;
                    default:
                        iS = xr41Var.O0.f.s();
                        break;
                }
                return Float.valueOf(iS);
            }
        }, new Function0(this) { // from class: p.wr41
            public final /* synthetic */ xr41 b;

            {
                this.b = this;
            }

            public final Object invoke() {
                int iS;
                byte b3 = b;
                xr41 xr41Var = this.b;
                switch (b3) {
                    case 0:
                        iS = xr41Var.O0.a.s();
                        break;
                    default:
                        iS = xr41Var.O0.f.s();
                        break;
                }
                return Float.valueOf(iS);
            }
        }, false);
        if (this.P0) {
            d261 d261Var = z161.w;
            mma0 mma0Var = b261.a[13];
            d261Var.getClass();
            e261Var.b(d261Var, pq41Var);
            return;
        }
        d261 d261Var2 = z161.v;
        mma0 mma0Var2 = b261.a[12];
        d261Var2.getClass();
        e261Var.b(d261Var2, pq41Var);
    }

    public final int s0(x5f0 x5f0Var, afh0 afh0Var, int i) {
        if (!this.P0) {
            i = Alert.DURATION_SHOW_INDEFINITELY;
        }
        return afh0Var.n(i);
    }

    public final int x(x5f0 x5f0Var, afh0 afh0Var, int i) {
        if (!this.P0) {
            i = Alert.DURATION_SHOW_INDEFINITELY;
        }
        return afh0Var.d(i);
    }
}
