package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jxb0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kxb0 b;
    public final /* synthetic */ cxb0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jxb0(kxb0 kxb0Var, cxb0 cxb0Var, byte b) {
        super(0);
        this.a = b;
        this.b = kxb0Var;
        this.c = cxb0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        cxb0 cxb0Var = this.c;
        kxb0 kxb0Var = this.b;
        switch (b) {
            case 0:
                byp bypVar = kxb0Var.g;
                ji0 ji0Var = cxb0Var.a;
                int i = cxb0Var.b;
                int iC = l1d.C(kxb0Var.b);
                int i2 = 1;
                if (iC != 0) {
                    if (iC == 1) {
                        i2 = 2;
                    } else {
                        if (iC != 2) {
                            eg.o();
                            return null;
                        }
                        i2 = 3;
                    }
                }
                bypVar.z(i, i2, cxb0Var.d, ji0Var);
                return rih1Var;
            default:
                kxb0Var.d.a(cxb0Var.a.a, new jxb0(kxb0Var, cxb0Var, (byte) 0));
                return rih1Var;
        }
    }
}
