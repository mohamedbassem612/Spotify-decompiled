package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class exd1 implements ete0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jxd1 b;
    public final /* synthetic */ hxd1 c;

    public /* synthetic */ exd1(jxd1 jxd1Var, hxd1 hxd1Var, byte b) {
        this.a = b;
        this.b = jxd1Var;
        this.c = hxd1Var;
    }

    public final void a(String str, String str2) {
        byte b = this.a;
        hxd1 hxd1Var = this.c;
        jxd1 jxd1Var = this.b;
        switch (b) {
            case 0:
                jxd1Var.b(hxd1Var.g('B', str, str2, (Throwable) null));
                break;
            case 1:
                jxd1Var.b(hxd1Var.g('I', str, str2, (Throwable) null));
                break;
            default:
                jxd1Var.b(hxd1Var.g('Y', str, str2, (Throwable) null));
                break;
        }
    }

    public final void i(String str, String str2, Throwable th) {
        byte b = this.a;
        hxd1 hxd1Var = this.c;
        jxd1 jxd1Var = this.b;
        switch (b) {
            case 0:
                jxd1Var.b(hxd1Var.g('B', str, str2, th));
                break;
            case 1:
                jxd1Var.b(hxd1Var.g('I', str, str2, th));
                break;
            default:
                jxd1Var.b(hxd1Var.g('Y', str, str2, th));
                break;
        }
    }
}
