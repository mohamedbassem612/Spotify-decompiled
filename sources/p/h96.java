package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class h96 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hwx0 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h96(hwx0 hwx0Var, iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.b = hwx0Var;
        this.c = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        String str = null;
        hwx0 hwx0Var = this.b;
        switch (b) {
            case 0:
                fwx0 fwx0Var = (fwx0) r7h.e0(hwx0Var.a);
                if (fwx0Var != null) {
                    hwx0Var.b.add(fwx0Var);
                    str = fwx0Var.a;
                }
                if (str != null) {
                }
                break;
            default:
                fwx0 fwx0Var2 = (fwx0) r7h.e0(hwx0Var.b);
                if (fwx0Var2 != null) {
                    hwx0Var.a.add(fwx0Var2);
                    str = fwx0Var2.b;
                }
                if (str != null) {
                }
                break;
        }
        return rih1Var;
    }
}
