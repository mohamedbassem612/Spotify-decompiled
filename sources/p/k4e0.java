package p;

import com.spotify.playlist.policy.proto.ItemOfflineStateDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class k4e0 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public /* synthetic */ k4e0(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public Observable a(boolean z, boolean z2) {
        on01 on01Var = (on01) this.b;
        if (z) {
            Observable<R> observableStartWith = j2h1.D(o6x.a, new vse0(on01Var, (lnm) null, (byte) 15)).d(a(false, z2)).startWith(a(false, z2));
            observableStartWith.getClass();
            return observableStartWith;
        }
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        iou0 iou0VarV = PlaylistItemDecorationPolicy.v();
        iou0VarV.D(true);
        ol90 ol90VarO = ItemOfflineStateDecorationPolicy.o();
        ol90VarO.n(true);
        iou0VarV.z(ol90VarO);
        hru0VarS.v(iou0VarV);
        PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy = (PlaylistRequestDecorationPolicy) hru0VarS.build();
        playlistRequestDecorationPolicy.getClass();
        Observable observable = zho1.H(on01Var.c, new zkz0(on01Var, new trc0(playlistRequestDecorationPolicy, null, null, false, qrc0.a, hqz0.a, null, 1, null, 334), (byte) 10)).doOnError(new lyw0(on01Var, (byte) 15)).map(new wgz0(on01Var, z2, (byte) 2)).map(kc20.X).toObservable();
        observable.getClass();
        return observable;
    }

    @Override // io.reactivex.rxjava3.core.ObservableTransformer
    public final ObservableSource apply(Observable observable) {
        switch (this.a) {
            case 0:
                return observable.switchMap(new eea0(this, (byte) 12));
            default:
                return observable.switchMap(new n801(this, (byte) 6));
        }
    }
}
