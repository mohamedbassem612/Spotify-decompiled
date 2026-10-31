package p;

import android.content.Context;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableElementAtSingle;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class so implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public so(muz muzVar, ruz ruzVar, iwp iwpVar, String str) {
        this.a = (byte) 24;
        this.b = str;
        this.c = iwpVar.a(ruzVar, muzVar, "comment-sheet-timestamp", mno1.s);
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        byte b2 = 5;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        byte b3 = 6;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return observable.switchMap(new gid((bza0) obj2, (Context) obj, (byte) 5));
            case 1:
                return observable.concatMap(new px((Observable) obj2, (byte) 1)).concatMap(new jp((v5n) obj, (byte) 1)).map(fmv.Y).onErrorReturnItem(new eww0("", "", (String) null, "", z6x.a, (String) null, 0, false, false, false, false, false, false, false, (String) null)).map(v560.Y);
            case 2:
                return observable.switchMap(new cfd((fno0) obj2, (Scheduler) obj, b3));
            case 3:
                return observable.switchMap(new aod((ajq0) obj2, (Scheduler) obj, (byte) 4));
            case 4:
                return observable.flatMap(new xid((qnv0) obj2, (Scheduler) obj, b2));
            case 5:
                return observable.switchMap(new fp8(this, (byte) 18));
            case 6:
                return observable.switchMap(new kba(this, (byte) 16));
            case 7:
                return observable.observeOn((Scheduler) obj2).map(new x45((nfa0) obj));
            case 8:
                return observable.flatMap(new a1q((kcr) obj2, (sj) obj, (byte) 25));
            case 9:
                return observable.flatMap(new a0m((Object) this, (byte) 17)).cast(lh20.class);
            case 10:
                return observable.flatMapSingle(new tzo(this, (byte) 19));
            case 11:
                return observable.flatMap(new sun((Object) this, (byte) 23));
            case 12:
                return observable.debounce(100L, timeUnit).flatMapCompletable(new jut((Scheduler) obj2, (Consumer) obj, (byte) 19)).w();
            case 13:
                return observable.switchMap(new gmt((kqi0) obj2, (lmw) obj, (byte) 22));
            case 14:
                return observable.flatMap(new dh30((n381) obj2, (nfa0) obj, (byte) 18));
            case 15:
                return observable.switchMap(new hys((Flowable) obj2, (v5n) obj));
            case 16:
                o811 o811Var = new o811();
                yqg yqgVar = (yqg) obj2;
                return observable.distinctUntilChanged(new st60(yqgVar, o811Var, (ft30) obj, (byte) 6)).doOnNext(new lgr(o811Var, yqgVar, (byte) 28));
            case 17:
                return observable.concatMap(new ro30((FlowableElementAtSingle) obj2, (io91) obj, (byte) 21));
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return observable.switchMap(new wb00(this, (byte) 18));
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return observable.switchMap(new laz(this, (byte) 21));
            case 20:
                return observable.debounce(800L, timeUnit).switchMap(new yge0((bhf0) obj2, (lnf0) obj, (byte) 6));
            case 21:
                return observable.switchMap(new j2e0((lnf0) obj2, (Scheduler) obj, (byte) 11));
            case 22:
                return observable.switchMap(new fad0((gj10) obj2, (nwa) obj, (byte) 26));
            case 23:
                return observable.flatMap(new rok0((kt91) obj2, (Context) obj, (byte) 13));
            case 24:
                return observable.switchMapCompletable(new vgq0(this, (byte) 7)).w();
            case 25:
                return observable.switchMap(new qkn0(this, (byte) 18));
            case 26:
                return observable.flatMapSingle(new xmu0((mzr0) obj2, (zhq0) obj, (byte) 9));
            case 27:
                return observable.flatMapSingle(new pxv0(this));
            case 28:
                return observable.observeOn((Scheduler) obj2).switchMapSingle(new mlw0((lls0) obj, (byte) 1));
            default:
                return observable.switchMap(new yeu0((cfi1) obj2, (Scheduler) obj, (byte) 22));
        }
    }

    public /* synthetic */ so(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
