package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class b7x0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e7x0 b;

    public /* synthetic */ b7x0(e7x0 e7x0Var, byte b) {
        this.a = b;
        this.b = e7x0Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        e7x0 e7x0Var = this.b;
        switch (b) {
            case 0:
                z6x0 z6x0Var = (z6x0) obj;
                z6x0Var.getClass();
                e7x0Var.b(z6x0Var);
                break;
            case 1:
                z6x0 z6x0Var2 = (z6x0) obj;
                z6x0Var2.getClass();
                e7x0Var.X.f(ot11.M(z6x0Var2, e7x0Var.f));
                e7x0Var.a();
                break;
            default:
                e7x0Var.Z = ((Boolean) obj).booleanValue();
                e7x0Var.a();
                break;
        }
    }
}
