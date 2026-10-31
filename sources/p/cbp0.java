package p;

import android.content.Context;
import com.spotify.appstorage.userdirectory.UserDirectoryCachePaths;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.cosmos.fireandforgetresolver.FireAndForgetResolver;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class cbp0 extends tv30 implements Function0 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cbp0(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.a = b;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return (cd30) ((kly0) ((lyc) this).receiver).get();
            case 1:
                return (oo70) ((kly0) ((lyc) this).receiver).get();
            case 2:
                return (FireAndForgetResolver) ((kly0) ((lyc) this).receiver).get();
            case 3:
                return (r241) ((kly0) ((lyc) this).receiver).get();
            case 4:
                return (jnh0) ((kly0) ((lyc) this).receiver).get();
            case 5:
                return (y2g0) ((kly0) ((lyc) this).receiver).get();
            case 6:
                return (FireAndForgetResolver) ((kly0) ((lyc) this).receiver).get();
            case 7:
                return (jqb1) ((kly0) ((lyc) this).receiver).get();
            case 8:
                return (jnh0) ((kly0) ((lyc) this).receiver).get();
            case 9:
                return (y2g0) ((kly0) ((lyc) this).receiver).get();
            case 10:
                return (UserDirectoryCachePaths) ((kly0) ((lyc) this).receiver).get();
            case 11:
                return (jqb1) ((kly0) ((lyc) this).receiver).get();
            case 12:
                return (dma1) ((kly0) ((lyc) this).receiver).get();
            case 13:
                return (dma1) ((kly0) ((lyc) this).receiver).get();
            case 14:
                return (q8n) ((kly0) ((lyc) this).receiver).get();
            case 15:
                return (Flowable) ((kly0) ((lyc) this).receiver).get();
            case 16:
                return (bzm0) ((kly0) ((lyc) this).receiver).get();
            case 17:
                return (r0z0) ((kly0) ((lyc) this).receiver).get();
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return (y2g0) ((kly0) ((lyc) this).receiver).get();
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return (Context) ((kly0) ((lyc) this).receiver).get();
            case 20:
                return (qtj0) ((kly0) ((lyc) this).receiver).get();
            case 21:
                return (tpl1) ((kly0) ((lyc) this).receiver).get();
            case 22:
                return (Context) ((kly0) ((lyc) this).receiver).get();
            case 23:
                return (Context) ((kly0) ((lyc) this).receiver).get();
            case 24:
                return (co40) ((kly0) ((lyc) this).receiver).get();
            case 25:
                return (tpl1) ((kly0) ((lyc) this).receiver).get();
            case 26:
                return (Observable) ((kly0) ((lyc) this).receiver).get();
            case 27:
                return (Scheduler) ((kly0) ((lyc) this).receiver).get();
            case 28:
                return (Context) ((kly0) ((lyc) this).receiver).get();
            default:
                return (sz11) ((kly0) ((lyc) this).receiver).get();
        }
    }
}
