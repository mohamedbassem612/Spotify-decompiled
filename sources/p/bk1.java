package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableElementAtSingle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bk1 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final Object b;

    public bk1(byte b, FlowableElementAtSingle flowableElementAtSingle, io91 io91Var) {
        this.a = b;
        switch (b) {
            case 23:
                this.b = new so(flowableElementAtSingle, io91Var, (byte) 17);
                break;
            default:
                this.b = new qn1(flowableElementAtSingle, io91Var, (byte) 2);
                break;
        }
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        byte b2 = 15;
        byte b3 = 21;
        byte b4 = 6;
        Object obj = this.b;
        switch (b) {
            case 0:
                return observable.flatMap(new lan1(this, (byte) 7));
            case 1:
                return observable.flatMapCompletable(new cp5(this, (byte) 7)).w();
            case 2:
                return observable.flatMap(new w4b1((e4b1) obj, (byte) 10));
            case 3:
                return observable.switchMap(new cp5((qns0) obj, (byte) 8));
            case 4:
                return observable.map(new w4b1((hh2) obj, (byte) 12));
            case 5:
                return observable.flatMap(new jc9((t4d1) obj, (byte) 5)).map(ios.Y);
            case 6:
                return observable.concatMap(new dg8((x0b) obj, (byte) 7)).map(qz70.Y);
            case 7:
                return observable.map(new kba(this, b2));
            case 8:
                return observable.flatMap(new n4b((nzl) obj, (byte) 15));
            case 9:
                return observable.switchMap(new fna(this, (byte) 26));
            case 10:
                kcr kcrVar = (kcr) obj;
                return observable.subscribeOn(kcrVar.e).map(new n4b(kcrVar, (byte) 26));
            case 11:
                return observable.flatMapCompletable(new rmr((ias) obj, (byte) 6)).w();
            case 12:
                return observable.switchMap(new a0m((fjx0) obj, (byte) 21));
            case 13:
                return observable.flatMapSingle(new lqr(this, (byte) 16));
            case 14:
                oo5 oo5Var = (oo5) obj;
                return observable.filter(new xap(oo5Var, b3)).switchMapSingle(new sun(oo5Var, (byte) 28));
            case 15:
                return observable.flatMap(new xap(obj, (byte) 24));
            case 16:
                return observable.flatMapSingle(new laz(this, (byte) 4));
            case 17:
                return observable.switchMap(new hl00((re10) obj, (byte) 1));
            case 18:
                return observable.flatMapSingle(new laz((fey) obj, (byte) 6));
            case 19:
                return observable.flatMapMaybe(new wb00(this, (byte) 4));
            case 20:
                return observable.map(eh10.f).distinctUntilChanged().switchMap(new wb00((qg60) obj, (byte) 15)).distinctUntilChanged().map(mi10.f);
            case 21:
                return observable.map(zz10.f).flatMap(rh20.f).flatMap(new fey((z1s) obj, (byte) 21));
            case 22:
                return ((qn1) obj).apply(observable);
            case 23:
                return ((so) obj).apply(observable);
            case 24:
                return observable.concatMap(new eea0((deb0) obj, (byte) 2));
            case 25:
                return observable.map(xj20.i).distinctUntilChanged().switchMap(new wb00((t0c0) obj, (byte) 27)).distinctUntilChanged().map(yj20.h);
            case 26:
                return observable.switchMap(new mht0((wht0) obj));
            case 27:
                return observable.switchMap(new y281((t8r0) obj, (byte) 14));
            case 28:
                o860 o860Var = (o860) obj;
                return observable.filter(new uic(o860Var, (byte) 14)).filter(new z8c0(o860Var, b4)).map(ws10.Y).map(yz10.X);
            default:
                return observable.switchMapSingle(new il00((o3e0) obj, (byte) 28));
        }
    }

    public /* synthetic */ bk1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public bk1(ymh1 ymh1Var, dnh1 dnh1Var) {
        this.a = (byte) 19;
        this.b = ymh1Var;
    }
}
