package p;

import android.content.Context;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class qbp0 extends tv30 implements Function0 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbp0(Object obj, byte b) {
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
                return (q8n) ((kly0) ((lyc) this).receiver).get();
            case 1:
                return (ark1) ((kly0) ((lyc) this).receiver).get();
            case 2:
                return (mwt) ((kly0) ((lyc) this).receiver).get();
            case 3:
                return (x8c0) ((kly0) ((lyc) this).receiver).get();
            case 4:
                return (q44) ((kly0) ((lyc) this).receiver).get();
            case 5:
                return (Flowable) ((kly0) ((lyc) this).receiver).get();
            case 6:
                return (ov20) ((kly0) ((lyc) this).receiver).get();
            case 7:
                return (qns0) ((kly0) ((lyc) this).receiver).get();
            case 8:
                return (t8u0) ((kly0) ((lyc) this).receiver).get();
            case 9:
                return (q8n) ((kly0) ((lyc) this).receiver).get();
            case 10:
                return (i8h1) ((kly0) ((lyc) this).receiver).get();
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return (Context) ((kly0) ((lyc) this).receiver).get();
            case grn1.d /* 12 */:
                return (q8n) ((kly0) ((lyc) this).receiver).get();
            case 13:
                return (q8n) ((kly0) ((lyc) this).receiver).get();
            case 14:
                return (ov20) ((kly0) ((lyc) this).receiver).get();
            case 15:
                return (r241) ((kly0) ((lyc) this).receiver).get();
            case 16:
                return (RetrofitMaker) ((kly0) ((lyc) this).receiver).get();
            case 17:
                return (dma1) ((kly0) ((lyc) this).receiver).get();
            case 18:
                return (yqg) ((kly0) ((lyc) this).receiver).get();
            case 19:
                return (luk) ((kly0) ((lyc) this).receiver).get();
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return (y6a) ((kly0) ((lyc) this).receiver).get();
            case 21:
                return (ypd) ((kly0) ((lyc) this).receiver).get();
            case 22:
                return (xo5) ((kly0) ((lyc) this).receiver).get();
            case 23:
                return (odb0) ((kly0) ((lyc) this).receiver).get();
            case 24:
                return (Observable) ((kly0) ((lyc) this).receiver).get();
            case 25:
                return (vpp0) ((kly0) ((lyc) this).receiver).get();
            case 26:
                return (Set) ((kly0) ((lyc) this).receiver).get();
            case 27:
                return (njr) ((kly0) ((lyc) this).receiver).get();
            case 28:
                return (gkb) ((kly0) ((lyc) this).receiver).get();
            default:
                return (Context) ((kly0) ((lyc) this).receiver).get();
        }
    }
}
