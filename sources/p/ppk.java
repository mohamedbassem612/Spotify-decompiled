package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ppk extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ upb0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ppk(upb0 upb0Var, byte b) {
        super(0);
        this.a = b;
        this.b = upb0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        boolean z = false;
        upb0 upb0Var = this.b;
        switch (b) {
            case 0:
                return upb0Var.h().n;
            case 1:
                return Integer.valueOf(((err0) upb0Var.d.c).s());
            case 2:
                return Integer.valueOf(((err0) upb0Var.d.c).s());
            case 3:
                return Boolean.valueOf(a6o1.q(upb0Var));
            case 4:
                return Boolean.valueOf(upb0Var.h.b());
            case 5:
                mpb0 mpb0Var = (mpb0) o7h.C0(upb0Var.h().n);
                if (mpb0Var != null && mpb0Var.a >= upb0Var.h().q - 1) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                mpb0 mpb0Var2 = (mpb0) o7h.C0(upb0Var.h().n);
                if (mpb0Var2 != null) {
                    return Boolean.valueOf(mpb0Var2.a >= upb0Var.h().q + (-50));
                }
                return Boolean.FALSE;
        }
    }
}
