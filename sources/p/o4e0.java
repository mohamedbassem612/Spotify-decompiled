package p;

import com.spotify.scrollsita.v1.Section;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class o4e0 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ o4e0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final ObservableSource apply(Observable observable) {
        Observable observableStartWithItem;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return observable.switchMapSingle(new d4e0(this, (byte) 1));
            case 1:
                return observable.switchMap(new m4e0((e4f0) obj, (byte) 3));
            case 2:
                return observable.switchMap(new d4e0((ObservableFromPublisher) obj, (byte) 6));
            case 3:
                return observable.switchMap(new zc80((npf0) obj, (byte) 18));
            case 4:
                return observable.switchMap(new m4e0((z6h0) obj, (byte) 7));
            case 5:
                return observable.switchMap(new jpa0((pzi0) obj, (byte) 21)).take(1L).map(cj20.O0);
            case 6:
                return observable.flatMap(new m4e0((z8o0) obj, (byte) 17));
            case 7:
                return observable.switchMap(new tym0((k811) obj, (byte) 7));
            case 8:
                return observable.switchMap(new ewn0(this, (byte) 14));
            case 9:
                atq0 atq0Var = ((dtq0) obj).t;
                return (atq0Var == null || (observableStartWithItem = observable.startWithItem(atq0Var)) == null) ? observable : observableStartWithItem;
            case 10:
                return observable.map(new hvp0((x6s0) obj, (byte) 6));
            case 11:
                return observable.flatMapSingle(new fbs0((hbs0) obj));
            case 12:
                return observable.flatMap(new jkp0(this, (byte) 9));
            case 13:
                return observable.flatMap(new swm0(this, (byte) 19));
            case 14:
                return observable.switchMapSingle(new hvp0((kbt0) obj, (byte) 9));
            case 15:
                return observable.flatMap(new sks0((phi0) obj, (byte) 2));
            case 16:
                Observable map = observable.distinctUntilChanged().map(bk20.Z0);
                w7x w7xVar = w7x.a;
                return map.scan(new mmr0(w7xVar, w7xVar), b610.a1).flatMapCompletable(new l1p0((myq0) obj, (byte) 19)).w();
            case 17:
                return ((hx7) obj).a(true).map(fkj0.f1);
            case 18:
                return observable.switchMap(new sks0((f9v0) obj, (byte) 9));
            case 19:
                Completable completableSwitchMapCompletable = observable.switchMapCompletable(new sks0(this, (byte) 12));
                completableSwitchMapCompletable.getClass();
                return completableSwitchMapCompletable.o(Functions.h).d(Observable.empty());
            case 20:
                return observable.flatMapSingle(new vqv0((wqv0) obj, (byte) 0));
            case 21:
                return observable.map(bk20.c1).compose((lk1) obj).map(b610.d1).onErrorComplete();
            case 22:
                return observable.switchMap(new vyq0((j0a1) obj, (byte) 14));
            case 23:
                return observable.switchMap(new yau0((Observable) obj));
            case 24:
                return observable.switchMap(new vyq0((ngx0) obj, (byte) 16));
            case 25:
                return observable.flatMap(new rut0((qpz0) obj, (byte) 19));
            case 26:
                return observable.switchMap(new vqv0((wvq0) obj, (byte) 15));
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                tyt0 tyt0Var = ((yu01) obj).c;
                return observable.switchMap(new uip0(tyt0Var, (byte) 13)).flatMap(new l1p0(tyt0Var, (byte) 16));
            case 28:
                return observable.flatMapMaybe(new s6z0((ytp0) obj, (byte) 7));
            default:
                return observable.switchMapSingle(new vqv0(this, (byte) 18));
        }
    }
}
