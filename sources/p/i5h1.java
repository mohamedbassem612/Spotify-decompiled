package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class i5h1 implements o5s {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i5h1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void onDestroy(iac0 iac0Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                j5h1 j5h1Var = (j5h1) obj;
                j5h1Var.b();
                j5h1Var.d.getLifecycle().d(j5h1Var.l);
                idd1 idd1Var = j5h1Var.e;
                if (idd1Var.isInitialized()) {
                    ((ttm0) j5h1Var.a.get()).b((zau0) idd1Var.getValue());
                }
                break;
            case 1:
                ((msj1) obj).g.getLifecycle().d(this);
                break;
            default:
                ((iac0) ((ywv0) obj).h).getLifecycle().d(this);
                break;
        }
    }

    public final void onStop(iac0 iac0Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((j5h1) obj).b();
                break;
            case 1:
                ((msj1) obj).j.c();
                break;
            default:
                ((vku) ((ywv0) obj).i).c();
                break;
        }
    }
}
