package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w0g0 implements rjp0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z0g0 b;

    public /* synthetic */ w0g0(z0g0 z0g0Var, byte b) {
        this.a = b;
        this.b = z0g0Var;
    }

    public final void b(Object obj) {
        byte b = this.a;
        z0g0 z0g0Var = this.b;
        switch (b) {
            case 0:
                Integer num = (Integer) obj;
                num.getClass();
                z0g0Var.c.c(z0g0.f[0], z0g0Var, num);
                break;
            default:
                Function0 function0 = (Function0) obj;
                function0.getClass();
                z0g0Var.e.c(z0g0.f[2], z0g0Var, function0);
                break;
        }
    }
}
