package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class zrs implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kss b;
    public final /* synthetic */ foa1 c;

    public /* synthetic */ zrs(kss kssVar, foa1 foa1Var, byte b) {
        this.a = b;
        this.b = kssVar;
        this.c = foa1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        foa1 foa1Var = this.c;
        kss kssVar = this.b;
        switch (b) {
            case 0:
                kssVar.a(foa1Var);
                break;
            case 1:
                if (kssVar.b.contains(foa1Var)) {
                    cy30.a(foa1Var.a, foa1Var.c.j1, kssVar.a);
                }
                break;
            default:
                kssVar.b.remove(foa1Var);
                kssVar.c.remove(foa1Var);
                break;
        }
    }
}
