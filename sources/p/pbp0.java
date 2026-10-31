package p;

import android.content.ContentResolver;
import android.content.Context;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class pbp0 extends tv30 implements Function0 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbp0(Object obj, byte b) {
        super(0, obj, kly0.class, "get", "get()Ljava/lang/Object;", 0);
        this.a = b;
        switch (b) {
            case 1:
                super(0, obj, kly0.class, "get", "get()Ljava/lang/Object;", 0);
                break;
            case 2:
                super(0, obj, kly0.class, "get", "get()Ljava/lang/Object;", 0);
                break;
            case 3:
                super(0, obj, kly0.class, "get", "get()Ljava/lang/Object;", 0);
                break;
            case 4:
                super(0, obj, kly0.class, "get", "get()Ljava/lang/Object;", 0);
                break;
            case 5:
                super(0, obj, kly0.class, "get", "get()Ljava/lang/Object;", 0);
                break;
            case 6:
                super(0, obj, kly0.class, "get", "get()Ljava/lang/Object;", 0);
                break;
            case 7:
                super(0, obj, kly0.class, "get", "get()Ljava/lang/Object;", 0);
                break;
            case 8:
                super(0, obj, kly0.class, "get", "get()Ljava/lang/Object;", 0);
                break;
            case 9:
                super(0, obj, kly0.class, "get", "get()Ljava/lang/Object;", 0);
                break;
            case 10:
                super(0, obj, kly0.class, "get", "get()Ljava/lang/Object;", 0);
                break;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                super(0, obj, kly0.class, "get", "get()Ljava/lang/Object;", 0);
                break;
            case grn1.d /* 12 */:
                super(0, obj, kly0.class, "get", "get()Ljava/lang/Object;", 0);
                break;
            case 13:
                super(0, obj, kly0.class, "get", "get()Ljava/lang/Object;", 0);
                break;
            case 14:
                super(0, obj, kly0.class, "get", "get()Ljava/lang/Object;", 0);
                break;
            case 15:
                super(0, obj, kly0.class, "get", "get()Ljava/lang/Object;", 0);
                break;
            case 16:
                super(0, obj, kly0.class, "get", "get()Ljava/lang/Object;", 0);
                break;
            case 17:
                super(0, obj, kly0.class, "get", "get()Ljava/lang/Object;", 0);
                break;
            case 18:
                super(0, obj, kly0.class, "get", "get()Ljava/lang/Object;", 0);
                break;
            case 19:
                super(0, obj, kly0.class, "get", "get()Ljava/lang/Object;", 0);
                break;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                super(0, obj, kly0.class, "get", "get()Ljava/lang/Object;", 0);
                break;
            case 21:
                super(0, obj, kly0.class, "get", "get()Ljava/lang/Object;", 0);
                break;
            case 22:
                super(0, obj, kly0.class, "get", "get()Ljava/lang/Object;", 0);
                break;
            case 23:
                super(0, obj, kly0.class, "get", "get()Ljava/lang/Object;", 0);
                break;
            case 24:
                super(0, obj, kly0.class, "get", "get()Ljava/lang/Object;", 0);
                break;
            case 25:
                super(0, obj, kly0.class, "get", "get()Ljava/lang/Object;", 0);
                break;
            case 26:
                super(0, obj, kly0.class, "get", "get()Ljava/lang/Object;", 0);
                break;
            case 27:
                super(0, obj, kly0.class, "get", "get()Ljava/lang/Object;", 0);
                break;
            case 28:
                super(0, obj, kly0.class, "get", "get()Ljava/lang/Object;", 0);
                break;
            case 29:
                super(0, obj, kly0.class, "get", "get()Ljava/lang/Object;", 0);
                break;
            default:
                break;
        }
    }

    public final Object invoke() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return (Context) ((kly0) ((lyc) this).receiver).get();
            case 1:
                return (liv0) ((kly0) ((lyc) this).receiver).get();
            case 2:
                return (i42) ((kly0) ((lyc) this).receiver).get();
            case 3:
                return (fza1) ((kly0) ((lyc) this).receiver).get();
            case 4:
                return (ov20) ((kly0) ((lyc) this).receiver).get();
            case 5:
                return (dy0) ((kly0) ((lyc) this).receiver).get();
            case 6:
                return (bqb1) ((kly0) ((lyc) this).receiver).get();
            case 7:
                return (ptt) ((kly0) ((lyc) this).receiver).get();
            case 8:
                return (Scheduler) ((kly0) ((lyc) this).receiver).get();
            case 9:
                return (Set) ((kly0) ((lyc) this).receiver).get();
            case 10:
                return (luk) ((kly0) ((lyc) this).receiver).get();
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return (krh) ((kly0) ((lyc) this).receiver).get();
            case grn1.d /* 12 */:
                return (RetrofitMaker) ((kly0) ((lyc) this).receiver).get();
            case 13:
                return (yqg) ((kly0) ((lyc) this).receiver).get();
            case 14:
                return (Context) ((kly0) ((lyc) this).receiver).get();
            case 15:
                return (q8n) ((kly0) ((lyc) this).receiver).get();
            case 16:
                return (y2g0) ((kly0) ((lyc) this).receiver).get();
            case 17:
                return (trd1) ((kly0) ((lyc) this).receiver).get();
            case 18:
                return (qr20) ((kly0) ((lyc) this).receiver).get();
            case 19:
                return (q8n) ((kly0) ((lyc) this).receiver).get();
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return (mw7) ((kly0) ((lyc) this).receiver).get();
            case 21:
                return (jo0) ((kly0) ((lyc) this).receiver).get();
            case 22:
                return (ao0) ((kly0) ((lyc) this).receiver).get();
            case 23:
                return (crd) ((kly0) ((lyc) this).receiver).get();
            case 24:
                return (trd1) ((kly0) ((lyc) this).receiver).get();
            case 25:
                return (i72) ((kly0) ((lyc) this).receiver).get();
            case 26:
                return (ContentResolver) ((kly0) ((lyc) this).receiver).get();
            case 27:
                return (Flowable) ((kly0) ((lyc) this).receiver).get();
            case 28:
                return (Scheduler) ((kly0) ((lyc) this).receiver).get();
            default:
                return (Scheduler) ((kly0) ((lyc) this).receiver).get();
        }
    }
}
