package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oac1 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ptj b;

    public /* synthetic */ oac1(ptj ptjVar, byte b) {
        this.a = b;
        this.b = ptjVar;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        ptj ptjVar = this.b;
        switch (b) {
            case 0:
                ptjVar.invoke(new a5c1(((ec31) obj).a));
                break;
            default:
                ptjVar.invoke(new k5c1(((hac1) obj).c));
                break;
        }
    }
}
