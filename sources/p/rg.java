package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class rg implements aac0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rg(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void q(iac0 iac0Var, k8c0 k8c0Var) {
        byte b = this.a;
        Object obj = null;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((iu30) obj2).invoke(k8c0Var);
                break;
            case 1:
                ii30 ii30Var = (ii30) obj2;
                if (k8c0Var == k8c0.ON_DESTROY) {
                    zf30 zf30Var = (zf30) iac0Var;
                    for (Object obj3 : (Iterable) ii30Var.b().f.a.getValue()) {
                        if (((hnn0) obj3).f.equals(zf30Var.a1)) {
                            obj = obj3;
                        }
                    }
                    hnn0 hnn0Var = (hnn0) obj;
                    if (hnn0Var != null) {
                        if (ii30.n()) {
                            hnn0Var.toString();
                            iac0Var.toString();
                        }
                        ii30Var.b().c(hnn0Var);
                    }
                }
                break;
            case 2:
                ((bpb1) obj2).m((Object) null, k8c0Var.a());
                break;
            case 3:
                gon0 gon0Var = (gon0) obj2;
                gon0Var.r = k8c0Var.a();
                if (gon0Var.c != null) {
                    for (hnn0 hnn0Var2 : gon0Var.g) {
                        hnn0Var2.getClass();
                        hnn0Var2.d = k8c0Var.a();
                        hnn0Var2.c();
                    }
                }
                break;
            default:
                o6 o6Var = (o6) obj2;
                if (k8c0Var == k8c0.ON_DESTROY) {
                    o6Var.l();
                }
                break;
        }
    }
}
