package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class bo51 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jo51 b;

    public /* synthetic */ bo51(jo51 jo51Var, byte b) {
        this.a = b;
        this.b = jo51Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        jo51 jo51Var = this.b;
        long jLongValue = ((Long) obj).longValue();
        switch (b) {
            case 0:
                jo51Var.N0 = jLongValue;
                break;
            default:
                long j = jLongValue - jo51Var.N0;
                jo51Var.N0 = jLongValue;
                long jA0 = jch0.a0(j / ((double) jo51Var.R0));
                wdn0 wdn0Var = jo51Var.O0;
                if (wdn0Var.j()) {
                    Object[] objArr = wdn0Var.a;
                    int i = wdn0Var.b;
                    int i2 = 0;
                    for (int i3 = 0; i3 < i; i3++) {
                        co51 co51Var = (co51) objArr[i3];
                        jo51.y1(co51Var, jA0);
                        co51Var.c = true;
                    }
                    mhg1 mhg1Var = jo51Var.f;
                    if (mhg1Var != null) {
                        mhg1Var.p();
                    }
                    int i4 = wdn0Var.b;
                    Object[] objArr2 = wdn0Var.a;
                    tr80 tr80VarQ = yoi1.Q(0, i4);
                    int i5 = ((rr80) tr80VarQ).a;
                    int i6 = ((rr80) tr80VarQ).b;
                    if (i5 <= i6) {
                        while (true) {
                            objArr2[i5 - i2] = objArr2[i5];
                            if (((co51) objArr2[i5]).c) {
                                i2++;
                            }
                            if (i5 != i6) {
                                i5++;
                            }
                        }
                    }
                    Arrays.fill(objArr2, i4 - i2, i4, (Object) null);
                    wdn0Var.b -= i2;
                }
                co51 co51Var2 = jo51Var.P0;
                if (co51Var2 != null) {
                    co51Var2.g = jo51Var.g;
                    jo51.y1(co51Var2, jA0);
                    jo51Var.C1(co51Var2.d);
                    if (co51Var2.d == 1.0f) {
                        jo51Var.P0 = null;
                    }
                    jo51Var.B1();
                }
                break;
        }
        return rih1Var;
    }
}
