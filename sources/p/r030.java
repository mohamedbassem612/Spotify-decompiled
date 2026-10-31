package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class r030 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t030 b;

    public /* synthetic */ r030(t030 t030Var, byte b) {
        this.a = b;
        this.b = t030Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        t030 t030Var = this.b;
        switch (b) {
            case 0:
                bo3 bo3Var = (bo3) obj;
                td41 td41Var = t030Var.a;
                dia1 dia1Var = bo3Var.d;
                uia1 uia1Var = bo3Var.e;
                td41Var.e(dia1Var, uia1Var.a, uia1Var.b);
                break;
            case 1:
                t030Var.a.b(((co3) obj).d);
                break;
            default:
                t030Var.c.c(((fo3) obj).d);
                break;
        }
    }
}
