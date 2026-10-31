package p;

import android.content.Context;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.core.http.CronetRuntime;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class abp0 extends tv30 implements Function0 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ abp0(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.a = b;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return (q8n) ((kly0) ((lyc) this).receiver).get();
            case 1:
                return (ax4) ((kly0) ((lyc) this).receiver).get();
            case 2:
                return (Set) ((kly0) ((lyc) this).receiver).get();
            case 3:
                return (Context) ((kly0) ((lyc) this).receiver).get();
            case 4:
                return (bz81) ((kly0) ((lyc) this).receiver).get();
            case 5:
                return (ltp0) ((kly0) ((lyc) this).receiver).get();
            case 6:
                return (ecl) ((kly0) ((lyc) this).receiver).get();
            case 7:
                return (hb4) ((kly0) ((lyc) this).receiver).get();
            case 8:
                return (q8n) ((kly0) ((lyc) this).receiver).get();
            case 9:
                return (q8n) ((kly0) ((lyc) this).receiver).get();
            case 10:
                return (v4g1) ((kly0) ((lyc) this).receiver).get();
            case 11:
                return (yqg) ((kly0) ((lyc) this).receiver).get();
            case 12:
                return (ax4) ((kly0) ((lyc) this).receiver).get();
            case 13:
                return (ax4) ((kly0) ((lyc) this).receiver).get();
            case 14:
                return (mr20) ((kly0) ((lyc) this).receiver).get();
            case 15:
                return (q8n) ((kly0) ((lyc) this).receiver).get();
            case 16:
                return (Context) ((kly0) ((lyc) this).receiver).get();
            case 17:
                return (lw21) ((kly0) ((lyc) this).receiver).get();
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return (q8n) ((kly0) ((lyc) this).receiver).get();
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return (q8n) ((kly0) ((lyc) this).receiver).get();
            case 20:
                return (r3b1) ((kly0) ((lyc) this).receiver).get();
            case 21:
                return (Context) ((kly0) ((lyc) this).receiver).get();
            case 22:
                return (oo70) ((kly0) ((lyc) this).receiver).get();
            case 23:
                return (crd) ((kly0) ((lyc) this).receiver).get();
            case 24:
                return (Observable) ((kly0) ((lyc) this).receiver).get();
            case 25:
                return (Context) ((kly0) ((lyc) this).receiver).get();
            case 26:
                return (CronetRuntime) ((kly0) ((lyc) this).receiver).get();
            case 27:
                return (Observable) ((kly0) ((lyc) this).receiver).get();
            case 28:
                return (Observable) ((kly0) ((lyc) this).receiver).get();
            default:
                return (Flowable) ((kly0) ((lyc) this).receiver).get();
        }
    }
}
