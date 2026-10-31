package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ej9 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xir b;

    public /* synthetic */ ej9(xir xirVar, byte b) {
        this.a = b;
        this.b = xirVar;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        xir xirVar = this.b;
        switch (b) {
            case 0:
                si9 si9Var = (si9) obj;
                xirVar.e.onNext(new le9(si9Var.a, si9Var.b));
                break;
            case 1:
                xirVar.d.onNext(((ui9) obj).a);
                break;
            case 2:
                xirVar.f.onNext(Long.valueOf(((vi9) obj).a));
                break;
            default:
                xirVar.b.onNext(((wi9) obj).a);
                break;
        }
    }
}
