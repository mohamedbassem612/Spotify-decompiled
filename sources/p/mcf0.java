package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mcf0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ncf0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mcf0(ncf0 ncf0Var, byte b) {
        super(0);
        this.a = b;
        this.b = ncf0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        boolean z = false;
        ncf0 ncf0Var = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf((ncf0Var.c() == null && ((Throwable) ncf0Var.c.getValue()) == null) ? false : true);
            case 1:
                return Boolean.valueOf(((Throwable) ncf0Var.c.getValue()) != null);
            case 2:
                if (ncf0Var.c() == null && ((Throwable) ncf0Var.c.getValue()) == null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                return Boolean.valueOf(ncf0Var.c() != null);
        }
    }
}
