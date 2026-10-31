package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uyu extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vyu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uyu(vyu vyuVar, byte b) {
        super(1);
        this.a = b;
        this.b = vyuVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        vyu vyuVar = this.b;
        switch (b) {
            case 0:
                return new xm61(2131961820, (String) null, 2131961817, (String) null, 2131961818, (String) null, 2131961819, (String) null, new syu(vyuVar, null, (byte) 0), new tyu(vyuVar, null, (byte) 0), new wm61(wvu.R0, wvu.S0, wvu.T0), 170);
            default:
                return new xm61((Integer) null, "Unavailable download over cellular 1", (Integer) null, "Unavailable download over cellular 2", (Integer) null, "Unavailable download over cellular 3", (Integer) null, "Unavailable download over cellular 4", new syu(vyuVar, null, (byte) 1), new tyu(vyuVar, null, (byte) 1), new wm61(wvu.U0, wvu.V0, wvu.W0), 85);
        }
    }
}
