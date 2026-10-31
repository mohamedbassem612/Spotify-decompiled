package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class w1s extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x1s b;
    public final /* synthetic */ ui70 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w1s(x1s x1sVar, ui70 ui70Var, byte b) {
        super(0);
        this.a = b;
        this.b = x1sVar;
        this.c = ui70Var;
    }

    public final Object invoke() {
        ou80 ou80Var;
        ou80 ou80Var2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = null;
        ui70 ui70Var = this.c;
        x1s x1sVar = this.b;
        switch (b) {
            case 0:
                tv80 tv80Var = ui70Var.c;
                if (tv80Var != null && (ou80Var = tv80Var.a) != null) {
                    str = ou80Var.a;
                }
                new nxr(x1sVar, new jj70(ui70Var, str), (byte) 6).invoke();
                break;
            default:
                tv80 tv80Var2 = ui70Var.c;
                if (tv80Var2 != null && (ou80Var2 = tv80Var2.a) != null) {
                    str = ou80Var2.a;
                }
                new nxr(x1sVar, new ij70(ui70Var, str), (byte) 6).invoke();
                break;
        }
        return rih1Var;
    }
}
