package p;

import android.content.Context;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.connectivity.AnalyticsDelegate;
import com.spotify.connectivity.ApplicationScopeConfiguration;
import com.spotify.connectivity.MobileDeviceInfo;
import com.spotify.eventsender.api.EventSenderCoreBridge;
import com.spotify.settings.settings.SettingsDelegate;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Optional;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class bbp0 extends tv30 implements Function0 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bbp0(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.a = b;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return (q8n) ((kly0) ((lyc) this).receiver).get();
            case 1:
                return (AnalyticsDelegate) ((kly0) ((lyc) this).receiver).get();
            case 2:
                return (ApplicationScopeConfiguration) ((kly0) ((lyc) this).receiver).get();
            case 3:
                return (v4g1) ((kly0) ((lyc) this).receiver).get();
            case 4:
                return (MobileDeviceInfo) ((kly0) ((lyc) this).receiver).get();
            case 5:
                return (EventSenderCoreBridge) ((kly0) ((lyc) this).receiver).get();
            case 6:
                return (xb00) ((kly0) ((lyc) this).receiver).get();
            case 7:
                return (t2j0) ((kly0) ((lyc) this).receiver).get();
            case 8:
                return (Context) ((kly0) ((lyc) this).receiver).get();
            case 9:
                return (q8n) ((kly0) ((lyc) this).receiver).get();
            case 10:
                return (Context) ((kly0) ((lyc) this).receiver).get();
            case 11:
                return (gzm0) ((kly0) ((lyc) this).receiver).get();
            case 12:
                return (Boolean) ((kly0) ((lyc) this).receiver).get();
            case 13:
                return (Flowable) ((kly0) ((lyc) this).receiver).get();
            case 14:
                return (glg) ((kly0) ((lyc) this).receiver).get();
            case 15:
                return (jlg) ((kly0) ((lyc) this).receiver).get();
            case 16:
                return (Optional) ((kly0) ((lyc) this).receiver).get();
            case 17:
                return (q8n) ((kly0) ((lyc) this).receiver).get();
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return (lw21) ((kly0) ((lyc) this).receiver).get();
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return (Context) ((kly0) ((lyc) this).receiver).get();
            case 20:
                return (Scheduler) ((kly0) ((lyc) this).receiver).get();
            case 21:
                return (pz11) ((kly0) ((lyc) this).receiver).get();
            case 22:
                return (xav0) ((kly0) ((lyc) this).receiver).get();
            case 23:
                return (sz11) ((kly0) ((lyc) this).receiver).get();
            case 24:
                return (Optional) ((kly0) ((lyc) this).receiver).get();
            case 25:
                return (SettingsDelegate) ((kly0) ((lyc) this).receiver).get();
            case 26:
                return (x8c0) ((kly0) ((lyc) this).receiver).get();
            case 27:
                return (v4g1) ((kly0) ((lyc) this).receiver).get();
            case 28:
                return (y2g0) ((kly0) ((lyc) this).receiver).get();
            default:
                return (Context) ((kly0) ((lyc) this).receiver).get();
        }
    }
}
