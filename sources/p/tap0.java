package p;

import android.app.ActivityManager;
import android.content.Context;
import com.spotify.accessory.categorizer.BluetoothCategorizer;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.cosmos.callbackrouter.CallbackRouter;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class tap0 extends tv30 implements Function0 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tap0(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.a = b;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return (bzm0) ((kly0) ((lyc) this).receiver).get();
            case 1:
                return (c3n0) ((kly0) ((lyc) this).receiver).get();
            case 2:
                return (Context) ((kly0) ((lyc) this).receiver).get();
            case 3:
                return (yqg) ((kly0) ((lyc) this).receiver).get();
            case 4:
                return (Scheduler) ((kly0) ((lyc) this).receiver).get();
            case 5:
                return (lw21) ((kly0) ((lyc) this).receiver).get();
            case 6:
                return (pz11) ((kly0) ((lyc) this).receiver).get();
            case 7:
                return (xav0) ((kly0) ((lyc) this).receiver).get();
            case 8:
                return (u3f0) ((kly0) ((lyc) this).receiver).get();
            case 9:
                return (x54) ((kly0) ((lyc) this).receiver).get();
            case 10:
                return (CallbackRouter) ((kly0) ((lyc) this).receiver).get();
            case 11:
                return (q8n) ((kly0) ((lyc) this).receiver).get();
            case 12:
                return (xf01) ((kly0) ((lyc) this).receiver).get();
            case 13:
                return (i8b0) ((kly0) ((lyc) this).receiver).get();
            case 14:
                return (Scheduler) ((kly0) ((lyc) this).receiver).get();
            case 15:
                return (ajg) ((kly0) ((lyc) this).receiver).get();
            case 16:
                return (yqg) ((kly0) ((lyc) this).receiver).get();
            case 17:
                return (q8n) ((kly0) ((lyc) this).receiver).get();
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return (Context) ((kly0) ((lyc) this).receiver).get();
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return (ActivityManager) ((kly0) ((lyc) this).receiver).get();
            case 20:
                return (t2j0) ((kly0) ((lyc) this).receiver).get();
            case 21:
                return (ut71) ((kly0) ((lyc) this).receiver).get();
            case 22:
                return (Scheduler) ((kly0) ((lyc) this).receiver).get();
            case 23:
                return (BluetoothCategorizer) ((kly0) ((lyc) this).receiver).get();
            case 24:
                return (t141) ((kly0) ((lyc) this).receiver).get();
            case 25:
                return (Scheduler) ((kly0) ((lyc) this).receiver).get();
            case 26:
                return (i210) ((kly0) ((lyc) this).receiver).get();
            case 27:
                return (Observable) ((kly0) ((lyc) this).receiver).get();
            case 28:
                return (em4) ((kly0) ((lyc) this).receiver).get();
            default:
                return (ttz) ((kly0) ((lyc) this).receiver).get();
        }
    }
}
