package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class sdo0 implements nku {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rdo0 b;

    public /* synthetic */ sdo0(rdo0 rdo0Var, byte b) {
        this.a = b;
        this.b = rdo0Var;
    }

    public final void dispose() {
        switch (this.a) {
            case 0:
                this.b.dispose();
                break;
            default:
                this.b.dispose();
                break;
        }
    }
}
