package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class y0g0 extends sgp0 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ z0g0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0g0(z0g0 z0g0Var, byte b) {
        super(0);
        this.b = b;
        switch (b) {
            case 1:
                this.c = z0g0Var;
                super(nk80.e);
                break;
            default:
                this.c = z0g0Var;
                break;
        }
    }

    public final void a(mma0 mma0Var, Object obj, Object obj2) {
        byte b = this.b;
        z0g0 z0g0Var = this.c;
        switch (b) {
            case 0:
                if (((Number) obj).intValue() != ((Number) obj2).intValue()) {
                    z0g0Var.b();
                }
                break;
            case 1:
                if (!u890.j((nk80) obj, (nk80) obj2)) {
                    z0g0Var.b();
                }
                break;
            default:
                if (!u890.j((Function0) obj, (Function0) obj2)) {
                    z0g0Var.b();
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0g0(tzf0 tzf0Var, z0g0 z0g0Var) {
        super(tzf0Var);
        this.b = (byte) 2;
        this.c = z0g0Var;
    }
}
