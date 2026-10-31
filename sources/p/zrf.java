package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zrf implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nsw0 b;

    public /* synthetic */ zrf(nsw0 nsw0Var, byte b) {
        this.a = b;
        this.b = nsw0Var;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        psw0 psw0Var = this.b;
        switch (b) {
            case 0:
                psw0Var.setValue((ehd0) obj);
                break;
            case 1:
                psw0Var.setValue((ehd0) obj);
                break;
            case 2:
                psw0Var.setValue(obj);
                break;
            case 3:
                psw0Var.setValue((i091) obj);
                break;
            case 4:
                psw0Var.setValue((dbr0) obj);
                break;
            case 5:
                psw0Var.setValue((eh01) obj);
                break;
            case 6:
                psw0Var.setValue(obj);
                break;
            case 7:
                psw0Var.setValue(obj);
                break;
            default:
                fpk1 fpk1Var = ((gpk1) obj).a;
                psw0Var.setValue(Boolean.valueOf(fpk1Var.equals(epk1.a) || fpk1Var.equals(cpk1.a)));
                break;
        }
        return rih1Var;
    }
}
