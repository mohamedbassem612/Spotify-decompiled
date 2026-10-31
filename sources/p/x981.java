package p;

import android.os.Handler;
import android.os.Looper;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class x981 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final Object b;
    public final boolean c;
    public final Object d;

    public x981(jjz jjzVar, boolean z, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = jjzVar;
                this.c = z;
                this.d = new Handler(Looper.getMainLooper());
                break;
            case 2:
                this.b = jjzVar;
                this.c = z;
                this.d = new Handler(Looper.getMainLooper());
                break;
            case 3:
                this.b = jjzVar;
                this.c = z;
                this.d = new Handler(Looper.getMainLooper());
                break;
            default:
                this.b = jjzVar;
                this.c = z;
                this.d = new Handler(Looper.getMainLooper());
                break;
        }
    }

    public final ObservableSource apply(Observable observable) {
        switch (this.a) {
            case 0:
                return observable.flatMap(new vr51(this, (byte) 10));
            case 1:
                return observable.flatMap(new s6z0(this, (byte) 29));
            case 2:
                return observable.flatMap(new q881(this, (byte) 1));
            case 3:
                return observable.flatMap(new c681((Object) this, (byte) 2));
            default:
                return !this.c ? observable.map(ak20.W0) : Observable.combineLatest(new ObservableFromPublisher((h690) this.d), observable, bk20.Y0).switchMap(new uip0(this, (byte) 15));
        }
    }

    public x981(uwh uwhVar, h690 h690Var, boolean z) {
        this.a = (byte) 4;
        this.b = uwhVar;
        this.d = h690Var;
        this.c = z;
    }
}
