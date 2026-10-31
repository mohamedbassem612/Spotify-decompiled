package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kgo0 implements xq91, o5s {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kgo0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void b() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((f0i) ((dg30) ((kqi0) obj).b)).a.d(this);
                break;
            default:
                ((f0i) ((dg30) ((dxy) obj).b)).a.d(this);
                break;
        }
    }

    public final void onStop(iac0 iac0Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                kqi0 kqi0Var = (kqi0) obj;
                ((kt91) kqi0Var.d).b();
                ((f0i) ((dg30) kqi0Var.b)).a.d(this);
                break;
            default:
                dxy dxyVar = (dxy) obj;
                ((kt91) dxyVar.c).b();
                ((f0i) ((dg30) dxyVar.b)).a.d(this);
                break;
        }
    }
}
