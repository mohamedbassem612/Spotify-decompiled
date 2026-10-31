package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ia71 implements nku {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xwa b;
    public final /* synthetic */ uwa c;

    public /* synthetic */ ia71(xwa xwaVar, uwa uwaVar, byte b) {
        this.a = b;
        this.b = xwaVar;
        this.c = uwaVar;
    }

    public final void dispose() {
        byte b = this.a;
        uwa uwaVar = this.c;
        xwa xwaVar = this.b;
        switch (b) {
            case 0:
                if (xwaVar.a == uwaVar) {
                    xwaVar.a = null;
                }
                break;
            default:
                if (xwaVar.a == uwaVar) {
                    xwaVar.a = null;
                }
                break;
        }
    }
}
