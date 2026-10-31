package p;

import android.content.Context;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.connectivity.AnalyticsDelegate;
import com.spotify.connectivity.AuthenticatedScopeConfiguration;
import com.spotify.core.corefullimpl.FullAuthenticatedScopeConfiguration;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class gcp0 extends tv30 implements Function0 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gcp0(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.a = b;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return (t2j0) ((kly0) ((lyc) this).receiver).get();
            case 1:
                return (krh) ((kly0) ((lyc) this).receiver).get();
            case 2:
                return (ov20) ((kly0) ((lyc) this).receiver).get();
            case 3:
                return (gw70) ((kly0) ((lyc) this).receiver).get();
            case 4:
                return (Scheduler) ((kly0) ((lyc) this).receiver).get();
            case 5:
                return (Scheduler) ((kly0) ((lyc) this).receiver).get();
            case 6:
                return (q8n) ((kly0) ((lyc) this).receiver).get();
            case 7:
                return (be91) ((kly0) ((lyc) this).receiver).get();
            case 8:
                return (np61) ((kly0) ((lyc) this).receiver).get();
            case 9:
                return (luk) ((kly0) ((lyc) this).receiver).get();
            case 10:
                return (zwz0) ((kly0) ((lyc) this).receiver).get();
            case 11:
                return (jo0) ((kly0) ((lyc) this).receiver).get();
            case 12:
                return (o241) ((kly0) ((lyc) this).receiver).get();
            case 13:
                return (eur) ((kly0) ((lyc) this).receiver).get();
            case 14:
                return (Context) ((kly0) ((lyc) this).receiver).get();
            case 15:
                return (Scheduler) ((kly0) ((lyc) this).receiver).get();
            case 16:
                return (Flowable) ((kly0) ((lyc) this).receiver).get();
            case 17:
                return (g0l) ((kly0) ((lyc) this).receiver).get();
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return (kt91) ((kly0) ((lyc) this).receiver).get();
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return (AnalyticsDelegate) ((kly0) ((lyc) this).receiver).get();
            case 20:
                return (AuthenticatedScopeConfiguration) ((kly0) ((lyc) this).receiver).get();
            case 21:
                return (lmy0) ((kly0) ((lyc) this).receiver).get();
            case 22:
                return (FullAuthenticatedScopeConfiguration) ((kly0) ((lyc) this).receiver).get();
            case 23:
                return (e5n) ((kly0) ((lyc) this).receiver).get();
            case 24:
                return (Observable) ((kly0) ((lyc) this).receiver).get();
            case 25:
                return (z48) ((kly0) ((lyc) this).receiver).get();
            case 26:
                return (nrt) ((kly0) ((lyc) this).receiver).get();
            case 27:
                return (azp0) ((kly0) ((lyc) this).receiver).get();
            case 28:
                return (q8n) ((kly0) ((lyc) this).receiver).get();
            default:
                return (ajg) ((kly0) ((lyc) this).receiver).get();
        }
    }
}
