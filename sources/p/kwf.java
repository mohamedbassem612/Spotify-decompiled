package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kwf implements o5s {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ kwf(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public final void onDestroy(iac0 iac0Var) {
        byte b = this.a;
        Object obj = this.d;
        switch (b) {
            case 0:
                ((x8c0) obj).d(this);
                break;
            case 1:
                l811 l811Var = (l811) this.b;
                brw brwVar = (brw) this.c;
                if (l811Var.a) {
                    l811Var.a = false;
                    brwVar.stop();
                }
                iac0Var.getLifecycle().d(this);
                p811 p811Var = (p811) obj;
                if (p811Var.a == iac0Var) {
                    p811Var.a = null;
                }
                break;
            default:
                iac0Var.getLifecycle().d(this);
                break;
        }
    }

    public final void onStart(iac0 iac0Var) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                lwf lwfVar = (lwf) obj2;
                lwfVar.getClass();
                lwfVar.c = ((cir0) obj).b().m().h("family_downgrade_checkout_tag", new yhh1(lwfVar.a, (byte) 0), new cj8(lwfVar, (byte) 1));
                break;
            case 1:
                l811 l811Var = (l811) obj2;
                brw brwVar = (brw) obj;
                if (!l811Var.a) {
                    l811Var.a = true;
                    brwVar.start();
                }
                break;
            default:
                ((p811) obj2).a = ((osm0) obj).b((esm0) this.d, 3);
                break;
        }
    }

    public final void onStop(iac0 iac0Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                rh0 rh0Var = ((lwf) obj).c;
                if (rh0Var != null) {
                    rh0Var.b();
                    return;
                } else {
                    u890.C("checkoutContract");
                    throw null;
                }
            case 1:
                l811 l811Var = (l811) obj;
                brw brwVar = (brw) this.c;
                if (l811Var.a) {
                    l811Var.a = false;
                    brwVar.stop();
                    return;
                }
                return;
            default:
                p811 p811Var = (p811) obj;
                ttm0 ttm0Var = (ttm0) p811Var.a;
                if (ttm0Var != null) {
                    ttm0Var.d();
                }
                p811Var.a = null;
                return;
        }
    }
}
