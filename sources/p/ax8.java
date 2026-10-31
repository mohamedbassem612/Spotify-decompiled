package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ax8 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final Object b;

    public ax8(iyc0 iyc0Var) {
        this.a = (byte) 9;
        this.b = new nm3(iyc0Var, (byte) 21);
    }

    @Override // io.reactivex.rxjava3.core.ObservableTransformer
    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return observable.filter(o9p1.X).switchMap(new l7m0(obj, (byte) 5)).map(vap1.t);
            case 1:
                return observable.switchMap(new sun((xpp0) obj, (byte) 29));
            case 2:
                return observable.switchMap(new anr((iu30) obj, (byte) 1));
            case 3:
                return observable.flatMap(new mhc((v5n) obj, (byte) 12));
            case 4:
                return ut60.a(observable.map(yz10.f), (z1s) obj);
            case 5:
                return observable.switchMap(new nht0((wht0) obj));
            case 6:
                return observable.switchMap(new h5a1((t8r0) obj, (byte) 6));
            case 7:
                return observable.map(new zc80((sam0) obj, (byte) 29));
            case 8:
                return observable.switchMapSingle(new h7o0(this, (byte) 0));
            default:
                return ((nm3) obj).apply(observable);
        }
    }

    public /* synthetic */ ax8(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
