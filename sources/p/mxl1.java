package p;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class mxl1 implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sxl1 b;

    public /* synthetic */ mxl1(sxl1 sxl1Var, byte b) {
        this.a = b;
        this.b = sxl1Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        byte b = this.a;
        wvl1 wvl1Var = wvl1.a;
        sxl1 sxl1Var = this.b;
        switch (b) {
            case 0:
                vwl1 vwl1Var = sxl1Var.a;
                if (vwl1Var.b != wvl1Var) {
                    int i = txl1.a;
                    qs10.a().getClass();
                    return Boolean.TRUE;
                }
                if ((!vwl1Var.c() && (vwl1Var.b != wvl1Var || vwl1Var.k <= 0)) || System.currentTimeMillis() >= vwl1Var.a()) {
                    return Boolean.FALSE;
                }
                qs10 qs10VarA = qs10.a();
                int i2 = txl1.a;
                qs10VarA.getClass();
                return Boolean.TRUE;
            default:
                dxl1 dxl1Var = sxl1Var.h;
                String str = sxl1Var.c;
                boolean z = false;
                if (dxl1Var.c(str) == wvl1Var) {
                    dxl1Var.g(wvl1.b, str);
                    ((Number) qyo1.x(dxl1Var.a, false, true, new jfa(str, (byte) 27))).intValue();
                    dxl1Var.h(-256, str);
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
