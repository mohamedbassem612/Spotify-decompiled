package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class l850 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iro b;

    public /* synthetic */ l850(iro iroVar, byte b) {
        this.a = b;
        this.b = iroVar;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        iro iroVar = this.b;
        switch (b) {
            case 0:
                iroVar.a(((udw) obj).a);
                break;
            default:
                iroVar.a(((sdw) obj).a);
                break;
        }
    }
}
