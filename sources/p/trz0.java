package p;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class trz0 {
    public final xaz0 a;
    public final zq4 b;
    public final LinkedHashMap c = new LinkedHashMap();
    public final PublishSubject d;

    public trz0(xaz0 xaz0Var, zq4 zq4Var) {
        this.a = xaz0Var;
        this.b = zq4Var;
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        PublishSubject publishSubject = new PublishSubject();
        this.d = publishSubject;
        compositeDisposable.b(Single.fromCallable(new sra(xaz0Var, (byte) 19)).map(ytw0.c).subscribeOn(Schedulers.c).subscribe(new dy40(this, (byte) 19), new srz0(this, (byte) 0)));
        compositeDisposable.b(publishSubject.concatMap(new jxp0(this, (byte) 29)).subscribe(new srz0(this, (byte) 1), new srz0(this, (byte) 2)));
    }

    public final LinkedHashMap c() {
        return this.c;
    }

    public final void d(String str) {
        LinkedHashMap linkedHashMap = this.c;
        Integer num = (Integer) linkedHashMap.get(str);
        linkedHashMap.put(str, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
        this.d.onNext(str);
    }
}
