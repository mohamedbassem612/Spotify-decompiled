package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dsr0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ su01 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dsr0(su01 su01Var, byte b) {
        super(0);
        this.a = b;
        this.b = su01Var;
    }

    public final Object invoke() {
        byte b = this.a;
        ou01 ou01Var = ou01.a;
        ou01 ou01Var2 = ou01.f;
        ou01 ou01Var3 = ou01.c;
        ou01 ou01Var4 = ou01.d;
        ou01 ou01Var5 = ou01.e;
        rih1 rih1Var = rih1.a;
        su01 su01Var = this.b;
        switch (b) {
            case 0:
                su01Var.e(ou01.b);
                break;
            case 1:
                su01Var.e(ou01Var);
                break;
            case 2:
                su01Var.e(ou01Var3);
                break;
            case 3:
                su01Var.e(ou01Var2);
                break;
            case 4:
                su01Var.d(ou01Var);
                break;
            case 5:
                su01Var.d(ou01Var2);
                break;
            case 6:
                su01Var.d(ou01Var4);
                break;
            case 7:
                su01Var.d(ou01Var5);
                break;
            case 8:
                su01Var.d(ou01.g);
                break;
            case 9:
                su01Var.d(ou01Var3);
                break;
            case 10:
                su01Var.e(ou01Var4);
                break;
            default:
                su01Var.e(ou01Var5);
                break;
        }
        return rih1Var;
    }
}
