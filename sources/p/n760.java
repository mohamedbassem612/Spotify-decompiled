package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class n760 implements nku {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uoa b;

    public /* synthetic */ n760(uoa uoaVar, byte b) {
        this.a = b;
        this.b = uoaVar;
    }

    public final void dispose() {
        byte b = this.a;
        uoa uoaVar = this.b;
        switch (b) {
            case 0:
                uoaVar.u();
                break;
            case 1:
                uoaVar.u();
                break;
            case 2:
                uoaVar.f();
                break;
            default:
                uoaVar.u();
                uoaVar.i();
                break;
        }
    }
}
