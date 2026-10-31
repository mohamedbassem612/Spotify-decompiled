package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yx11 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final Object b;

    public yx11(r961 r961Var, nn61 nn61Var, qp91 qp91Var, Scheduler scheduler) {
        this.a = (byte) 23;
        this.b = new yon((Object) nn61Var, (Object) scheduler, (Object) r961Var, (Object) qp91Var, (byte) 9);
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return observable.switchMap(new rut0(this, (byte) 26));
            case 1:
                return observable.flatMap(new uqv0((ai21) obj, (byte) 23));
            case 2:
                return observable.switchMap(new mlw0(this, (byte) 22)).onErrorResumeNext(njx0.g);
            case 3:
                return observable.switchMap(new is21((js21) obj));
            case 4:
                return observable.flatMapSingle(new bb01((ks21) obj, (byte) 10));
            case 5:
                return observable.flatMapSingle(new ks21((ij01) obj, (byte) 1));
            case 6:
                return observable.switchMap(new ij01(this, (byte) 15));
            case 7:
                return ((g2x0) obj).apply(observable);
            case 8:
                return observable.map(new s6z0(this, (byte) 18));
            case 9:
                return observable.switchMap(new ks21(this, (byte) 7));
            case 10:
                return observable.switchMap(new s6z0((by51) obj, (byte) 22));
            case 11:
                return observable.flatMap(new ks21((a061) obj, (byte) 12));
            case 12:
                return ((oay) obj).apply(observable);
            case 13:
                return observable.switchMap(new zgz0((il91) obj, (byte) 22));
            case 14:
                return ((yx11) obj).apply(observable);
            case 15:
                return observable.switchMap(new vr51((ip91) obj, (byte) 3));
            case 16:
                return ((yx11) obj).apply(observable);
            case 17:
                return observable.switchMap(new ij01((n801) obj, (byte) 23));
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return ((yx11) obj).apply(observable);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return observable.switchMapSingle(new s6z0((cs61) obj, (byte) 25));
            case 20:
                return observable.concatMapCompletable(new vr51(this, (byte) 7)).w();
            case 21:
                y441 y441Var = (y441) obj;
                return observable.observeOn((Scheduler) y441Var.d).flatMap(new dr41(y441Var, (byte) 10));
            case 22:
                return observable.flatMap(new s6z0(this, (byte) 27));
            case 23:
                return ((yon) obj).apply(observable);
            case 24:
                return observable.switchMap(new up41((ywv0) obj, (byte) 11));
            case 25:
                return ((yx11) obj).apply(observable);
            case 26:
                return observable.switchMap(new ep31((kt91) obj, (byte) 14));
            case 27:
                return ((yx11) obj).apply(observable);
            case 28:
                return observable.switchMap(new n801((vnd1) obj, (byte) 25));
            default:
                return ((yx11) obj).apply(observable);
        }
    }

    public yx11(il91 il91Var) {
        this.a = (byte) 14;
        this.b = new yx11((Object) il91Var, (byte) 13);
    }

    public yx11(ip91 ip91Var) {
        this.a = (byte) 16;
        this.b = new yx11((Object) ip91Var, (byte) 15);
    }

    public yx11(vnd1 vnd1Var) {
        this.a = (byte) 29;
        this.b = new yx11((Object) vnd1Var, (byte) 28);
    }

    public yx11(Scheduler scheduler) {
        this.a = (byte) 12;
        this.b = new oay(scheduler);
    }

    public yx11(ywv0 ywv0Var) {
        this.a = (byte) 25;
        this.b = new yx11((Object) ywv0Var, (byte) 24);
    }

    public yx11(yqg yqgVar, Scheduler scheduler) {
        this.a = (byte) 7;
        this.b = new g2x0(scheduler, yqgVar, (byte) 7);
    }

    public yx11(n801 n801Var) {
        this.a = (byte) 18;
        this.b = new yx11((Object) n801Var, (byte) 17);
    }

    public yx11(kt91 kt91Var) {
        this.a = (byte) 27;
        this.b = new yx11((Object) kt91Var, (byte) 26);
    }

    public /* synthetic */ yx11(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
