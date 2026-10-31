package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vre0 implements ete0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wre0 b;

    public /* synthetic */ vre0(wre0 wre0Var, byte b) {
        this.a = b;
        this.b = wre0Var;
    }

    public final void a(String str, String str2) {
        byte b = this.a;
        wre0 wre0Var = this.b;
        switch (b) {
            case 0:
                wre0Var.a.a('W', "Spotify", wre0.g(str, str2), null);
                break;
            default:
                wre0Var.a.a('E', "YELL", wre0.g(str, str2), null);
                break;
        }
    }

    public final void i(String str, String str2, Throwable th) {
        byte b = this.a;
        wre0 wre0Var = this.b;
        switch (b) {
            case 0:
                wre0Var.a.a('W', "Spotify", wre0.g(str, str2), th);
                break;
            default:
                wre0Var.a.a('E', "YELL", wre0.g(str, str2), th);
                break;
        }
    }
}
