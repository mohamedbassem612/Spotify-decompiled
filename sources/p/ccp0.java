package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class ccp0 extends tv30 implements Function0 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ccp0(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.a = b;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return (mr20) ((kly0) ((lyc) this).receiver).get();
            case 1:
                return (wen0) ((kly0) ((lyc) this).receiver).get();
            case 2:
                return (edp) ((kly0) ((lyc) this).receiver).get();
            case 3:
                return (b1y) ((kly0) ((lyc) this).receiver).get();
            case 4:
                return (RetrofitMaker) ((kly0) ((lyc) this).receiver).get();
            case 5:
                return (t8u0) ((kly0) ((lyc) this).receiver).get();
            case 6:
                return (mw7) ((kly0) ((lyc) this).receiver).get();
            case 7:
                return (crd) ((kly0) ((lyc) this).receiver).get();
            case 8:
                return (Observable) ((kly0) ((lyc) this).receiver).get();
            case 9:
                return (Observable) ((kly0) ((lyc) this).receiver).get();
            case 10:
                return (Observable) ((kly0) ((lyc) this).receiver).get();
            case 11:
                return (Scheduler) ((kly0) ((lyc) this).receiver).get();
            case 12:
                return (jgz0) ((kly0) ((lyc) this).receiver).get();
            case 13:
                return (i8h1) ((kly0) ((lyc) this).receiver).get();
            case 14:
                return (t2j0) ((kly0) ((lyc) this).receiver).get();
            case 15:
                return (b7r0) ((kly0) ((lyc) this).receiver).get();
            case 16:
                return (g0l) ((kly0) ((lyc) this).receiver).get();
            case 17:
                return (Flowable) ((kly0) ((lyc) this).receiver).get();
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return (ypd) ((kly0) ((lyc) this).receiver).get();
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return (zip0) ((kly0) ((lyc) this).receiver).get();
            case 20:
                return (q3s0) ((kly0) ((lyc) this).receiver).get();
            case 21:
                return (q8n) ((kly0) ((lyc) this).receiver).get();
            case 22:
                return (Flowable) ((kly0) ((lyc) this).receiver).get();
            case 23:
                return (uq4) ((kly0) ((lyc) this).receiver).get();
            case 24:
                return (Scheduler) ((kly0) ((lyc) this).receiver).get();
            case 25:
                return (q8n) ((kly0) ((lyc) this).receiver).get();
            case 26:
                return (t8u0) ((kly0) ((lyc) this).receiver).get();
            case 27:
                return (luk) ((kly0) ((lyc) this).receiver).get();
            case 28:
                return (gw70) ((kly0) ((lyc) this).receiver).get();
            default:
                return (cor) ((kly0) ((lyc) this).receiver).get();
        }
    }
}
