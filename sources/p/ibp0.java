package p;

import android.content.Context;
import android.os.Handler;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class ibp0 extends tv30 implements Function0 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibp0(Object obj, byte b) {
        super(0, obj, kly0.class, "get", "get()Ljava/lang/Object;", 0);
        this.a = b;
        switch (b) {
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
                return (pz11) ((kly0) ((lyc) this).receiver).get();
            case 1:
                return (xav0) ((kly0) ((lyc) this).receiver).get();
            case 2:
                return (yqg) ((kly0) ((lyc) this).receiver).get();
            case 3:
                return (fnh0) ((kly0) ((lyc) this).receiver).get();
            case 4:
                return (q8n) ((kly0) ((lyc) this).receiver).get();
            case 5:
                return (xm41) ((kly0) ((lyc) this).receiver).get();
            case 6:
                return (xm41) ((kly0) ((lyc) this).receiver).get();
            case 7:
                return (wbd1) ((kly0) ((lyc) this).receiver).get();
            case 8:
                return (vbd1) ((kly0) ((lyc) this).receiver).get();
            case 9:
                return (Scheduler) ((kly0) ((lyc) this).receiver).get();
            case 10:
                return (q8n) ((kly0) ((lyc) this).receiver).get();
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return (g0l) ((kly0) ((lyc) this).receiver).get();
            case grn1.d /* 12 */:
                return (t2j0) ((kly0) ((lyc) this).receiver).get();
            case 13:
                return (Context) ((kly0) ((lyc) this).receiver).get();
            case 14:
                return (wve0) ((kly0) ((lyc) this).receiver).get();
            case 15:
                return (yqg) ((kly0) ((lyc) this).receiver).get();
            case 16:
                return (nfa0) ((kly0) ((lyc) this).receiver).get();
            case 17:
                return (uh8) ((kly0) ((lyc) this).receiver).get();
            case 18:
                return (Flowable) ((kly0) ((lyc) this).receiver).get();
            case 19:
                return (luk) ((kly0) ((lyc) this).receiver).get();
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return (mya1) ((kly0) ((lyc) this).receiver).get();
            case 21:
                return (RetrofitMaker) ((kly0) ((lyc) this).receiver).get();
            case 22:
                return (be91) ((kly0) ((lyc) this).receiver).get();
            case 23:
                return (crd) ((kly0) ((lyc) this).receiver).get();
            case 24:
                return (q8n) ((kly0) ((lyc) this).receiver).get();
            case 25:
                return (q8n) ((kly0) ((lyc) this).receiver).get();
            case 26:
                return (Handler) ((kly0) ((lyc) this).receiver).get();
            case 27:
                return (Observable) ((kly0) ((lyc) this).receiver).get();
            case 28:
                return (x8c0) ((kly0) ((lyc) this).receiver).get();
            default:
                return (luk) ((kly0) ((lyc) this).receiver).get();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ibp0(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.a = b;
    }
}
