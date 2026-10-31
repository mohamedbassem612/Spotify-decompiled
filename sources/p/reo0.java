package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class reo0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ bjx b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public reo0(boolean z, bjx bjxVar) {
        super(1);
        this.c = z;
        this.b = bjxVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        boolean z = this.c;
        bjx bjxVar = this.b;
        switch (b) {
            case 0:
                return new xm61(2131961910, (String) null, 2131961907, (String) null, 2131961909, (String) null, 2131961908, (String) null, new bz0(3, (lnm) null, (byte) 21), new qeo0(z, bjxVar, null, (byte) 0), new wm61(htn0.U0, htn0.V0, htn0.W0), 170);
            default:
                return new xm61((Integer) null, "Unavailable stream 1", (Integer) null, "Unavailable stream 2", (Integer) null, "Unavailable stream 4", (Integer) null, "Unavailable stream 5", new bz0(3, (lnm) null, (byte) 22), new qeo0(z, bjxVar, null, (byte) 1), new wm61(htn0.X0, htn0.Y0, htn0.Z0), 85);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public reo0(bjx bjxVar, boolean z) {
        super(1);
        this.b = bjxVar;
        this.c = z;
    }
}
