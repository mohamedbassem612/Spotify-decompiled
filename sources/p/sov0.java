package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class sov0 implements vgn {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ sov0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final mr20 b() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Flowable flowable = ((xov0) obj).a().map(ua20.c1).toFlowable();
                vbm[] vbmVarArr = q601.a;
                return new lt20(new dy20(new kge(flowable), (byte) 25), new lok0(this, (lnm) null, (byte) 15), (byte) 0);
            default:
                return new uop0(yoi1.g(Observable.create(new upa0((yue0) obj, (byte) 14))), (byte) 25);
        }
    }
}
