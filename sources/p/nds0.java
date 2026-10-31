package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class nds0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ods0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ nds0(ods0 ods0Var, String str, String str2, byte b) {
        this.a = b;
        this.b = ods0Var;
        this.c = str;
        this.d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        String str = this.d;
        String str2 = this.c;
        ods0 ods0Var = this.b;
        switch (b) {
            case 0:
                ods0Var.a.d(str2, str);
                break;
            default:
                ods0Var.a.k(str2, str);
                break;
        }
    }
}
