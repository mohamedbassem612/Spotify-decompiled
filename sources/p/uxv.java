package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class uxv extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zxv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uxv(zxv zxvVar, byte b) {
        super(2);
        this.a = b;
        this.b = zxvVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        zxv zxvVar = this.b;
        switch (b) {
            case 0:
                return (xpw) zxvVar.b.get();
            case 1:
                return zxvVar.g;
            case 2:
                return (xpw) zxvVar.d.get();
            case 3:
                return zxvVar.g;
            case 4:
                h3h1 h3h1Var = zxvVar.g;
                k3h1 k3h1Var = new k3h1(((hoy0) obj).c);
                wch wchVar = q6x.b;
                if (!h3h1Var.equals(wchVar) || !k3h1Var.equals(wchVar)) {
                    if (h3h1Var.equals(wchVar)) {
                        return k3h1Var;
                    }
                    if (k3h1Var.equals(wchVar)) {
                        return h3h1Var;
                    }
                    wchVar = new wch(h3h1Var, k3h1Var);
                }
                return wchVar;
            case 5:
                return (xpw) zxvVar.f.get();
            case 6:
                return zxvVar.h;
            default:
                h3h1 h3h1Var2 = zxvVar.h;
                k3h1 k3h1Var2 = new k3h1(((yny0) obj).c);
                wch wchVar2 = q6x.b;
                if (!h3h1Var2.equals(wchVar2) || !k3h1Var2.equals(wchVar2)) {
                    if (h3h1Var2.equals(wchVar2)) {
                        return k3h1Var2;
                    }
                    if (k3h1Var2.equals(wchVar2)) {
                        return h3h1Var2;
                    }
                    wchVar2 = new wch(h3h1Var2, k3h1Var2);
                }
                return wchVar2;
        }
    }
}
