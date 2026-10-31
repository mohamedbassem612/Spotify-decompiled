package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cvn0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ knn0 b;

    public /* synthetic */ cvn0(knn0 knn0Var, byte b) {
        this.a = b;
        this.b = knn0Var;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        knn0 knn0Var = this.b;
        switch (b) {
            case 0:
                knn0Var.a(new bar0((nar0) obj));
                break;
            default:
                knn0Var.a(new z9r0(((Boolean) obj).booleanValue() ? sir0.a : new tir0(3)));
                break;
        }
        return rih1Var;
    }
}
