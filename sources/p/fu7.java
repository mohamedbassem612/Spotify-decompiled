package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fu7 implements o5s {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fu7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void onPause(iac0 iac0Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((gu7) obj).e.c();
                break;
            default:
                ((vku) ((mzr0) obj).g).c();
                break;
        }
    }
}
