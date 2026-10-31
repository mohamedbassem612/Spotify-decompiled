package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class q1g0 extends sgp0 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ r1g0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1g0(r1g0 r1g0Var, byte b) {
        super(0);
        this.b = b;
        switch (b) {
            case 2:
                this.c = r1g0Var;
                super(0);
                break;
            default:
                this.c = r1g0Var;
                break;
        }
    }

    public final void a(mma0 mma0Var, Object obj, Object obj2) {
        byte b = this.b;
        r1g0 r1g0Var = this.c;
        switch (b) {
            case 0:
                erl1 erl1Var = (erl1) obj2;
                if (!u890.j((erl1) obj, erl1Var)) {
                    ((gfn0) ((hrr0) r1g0Var.c.b).getValue()).f(erl1Var);
                    r1g0Var.b();
                }
                break;
            case 1:
                if (((Number) obj).intValue() != ((Number) obj2).intValue()) {
                    r1g0Var.b();
                }
                break;
            default:
                if (((Number) obj).intValue() != ((Number) obj2).intValue()) {
                    r1g0Var.b();
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1g0(mn20 mn20Var, r1g0 r1g0Var) {
        super(mn20Var);
        this.b = (byte) 0;
        this.c = r1g0Var;
    }
}
