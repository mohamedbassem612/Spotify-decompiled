package p;

import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qmm implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rmm b;

    public /* synthetic */ qmm(rmm rmmVar, byte b) {
        this.a = b;
        this.b = rmmVar;
    }

    public final void run() {
        byte b = this.a;
        ieu ieuVar = ieu.a;
        rmm rmmVar = this.b;
        switch (b) {
            case 0:
                rmmVar.d.j(ieuVar);
                break;
            default:
                rmmVar.d.j(ieuVar);
                break;
        }
    }
}
