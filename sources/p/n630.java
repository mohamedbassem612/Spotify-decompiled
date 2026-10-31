package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class n630 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r630 b;
    public final /* synthetic */ String c;

    public /* synthetic */ n630(r630 r630Var, String str, byte b) {
        this.a = b;
        this.b = r630Var;
        this.c = str;
    }

    public final void a(boolean z) {
        byte b = this.a;
        String str = this.c;
        r630 r630Var = this.b;
        switch (b) {
            case 0:
                r630Var.h(str, z);
                break;
            default:
                r630Var.i(str, z);
                break;
        }
    }
}
