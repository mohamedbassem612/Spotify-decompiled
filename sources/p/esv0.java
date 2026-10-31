package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class esv0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wva0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ esv0(wva0 wva0Var, byte b) {
        super(1);
        this.a = b;
        this.b = wva0Var;
    }

    private final Object a(Object obj) {
        int iOrdinal = ((cw70) obj).ordinal();
        if (iOrdinal == 0) {
            rrv0 rrv0Var = (rrv0) this.b.i;
            synchronized (rrv0Var) {
                rrv0Var.h("loaded", true);
            }
        } else {
            if (iOrdinal != 1) {
                eg.o();
                return null;
            }
            rrv0 rrv0Var2 = (rrv0) this.b.i;
            synchronized (rrv0Var2) {
                rrv0Var2.h("failed", false);
            }
        }
        return rih1.a;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return a(obj);
            default:
                int iOrdinal = ((u760) obj).ordinal();
                if (iOrdinal == 0) {
                    rrv0 rrv0Var = (rrv0) this.b.i;
                    synchronized (rrv0Var) {
                        rrv0Var.i("loaded", true);
                    }
                } else if (iOrdinal == 1) {
                    rrv0 rrv0Var2 = (rrv0) this.b.i;
                    synchronized (rrv0Var2) {
                        rrv0Var2.i("failed", false);
                    }
                } else if (iOrdinal == 2) {
                    rrv0 rrv0Var3 = (rrv0) this.b.i;
                    synchronized (rrv0Var3) {
                        rrv0Var3.i("absent", false);
                    }
                } else {
                    if (iOrdinal != 3) {
                        eg.o();
                        return null;
                    }
                    rrv0 rrv0Var4 = (rrv0) this.b.i;
                    synchronized (rrv0Var4) {
                        rrv0Var4.i("blocked", false);
                    }
                }
                return rih1.a;
        }
    }
}
