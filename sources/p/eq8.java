package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class eq8 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ km3 b;

    public /* synthetic */ eq8(km3 km3Var, byte b) {
        this.a = b;
        this.b = km3Var;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        final km3 km3Var = this.b;
        switch (b) {
            case 0:
                final byte b2 = 0;
                return observable.switchMap(new Function() { // from class: p.fq8
                    public final Object apply(Object obj) {
                        byte b3 = b2;
                        km3 km3Var2 = km3Var;
                        switch (b3) {
                            case 0:
                                xp8 xp8Var = (xp8) obj;
                                wq8 wq8Var = xp8Var.a;
                                String str = xp8Var.b;
                                return Single.create(new ix7(km3Var2, kyo1.w(wq8Var, str, Boolean.TRUE).toString(), wq8Var.e, (byte) 7)).toObservable().map(new q58((byte) 4));
                            default:
                                return ((yze1) km3Var2.b).c().map(t9w.X).flatMap(new cp5(km3Var2, (byte) 28)).toObservable().map(new q58((byte) 2));
                        }
                    }
                });
            default:
                final byte b3 = 1;
                return observable.switchMap(new Function() { // from class: p.fq8
                    public final Object apply(Object obj) {
                        byte b4 = b3;
                        km3 km3Var2 = km3Var;
                        switch (b4) {
                            case 0:
                                xp8 xp8Var = (xp8) obj;
                                wq8 wq8Var = xp8Var.a;
                                String str = xp8Var.b;
                                return Single.create(new ix7(km3Var2, kyo1.w(wq8Var, str, Boolean.TRUE).toString(), wq8Var.e, (byte) 7)).toObservable().map(new q58((byte) 4));
                            default:
                                return ((yze1) km3Var2.b).c().map(t9w.X).flatMap(new cp5(km3Var2, (byte) 28)).toObservable().map(new q58((byte) 2));
                        }
                    }
                });
        }
    }
}
