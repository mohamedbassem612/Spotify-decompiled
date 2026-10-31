package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class j5z extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ u800 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j5z(u800 u800Var, byte b) {
        super(0);
        this.a = b;
        this.b = u800Var;
    }

    public final Object invoke() {
        byte b = this.a;
        u800 u800Var = this.b;
        switch (b) {
            case 0:
                return u800Var.getView();
            case 1:
                return u800Var.getView();
            case 2:
                return ((wr61) u800Var.a.getValue()).b;
            case 3:
                return ((wr61) u800Var.a.getValue()).c;
            default:
                int i = kgr0.T0;
                return xyn1.z(((wr61) u800Var.a.getValue()).a);
        }
    }
}
