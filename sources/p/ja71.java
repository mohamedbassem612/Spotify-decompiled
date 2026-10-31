package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ja71 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xwa b;
    public final /* synthetic */ uwa c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ja71(xwa xwaVar, uwa uwaVar, byte b) {
        super(1);
        this.a = b;
        this.b = xwaVar;
        this.c = uwaVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        uwa uwaVar = this.c;
        xwa xwaVar = this.b;
        switch (b) {
            case 0:
                xwaVar.a = uwaVar;
                return new ia71(xwaVar, uwaVar, (byte) 0);
            default:
                xwaVar.a = uwaVar;
                return new ia71(xwaVar, uwaVar, (byte) 1);
        }
    }
}
