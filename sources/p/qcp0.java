package p;

import android.content.Context;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.appstorage.userdirectory.UserDirectoryCachePaths;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.localfiles.mediastore.OpenedAudioFiles;
import io.reactivex.rxjava3.core.Scheduler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class qcp0 extends tv30 implements Function0 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qcp0(Object obj) {
        super(0, obj, kly0.class, "get", "get()Ljava/lang/Object;", 0);
        this.a = (byte) 16;
    }

    public final Object invoke() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return (Context) ((kly0) ((lyc) this).receiver).get();
            case 1:
                return (luk) ((kly0) ((lyc) this).receiver).get();
            case 2:
                return (OpenedAudioFiles) ((kly0) ((lyc) this).receiver).get();
            case 3:
                return (luk) ((kly0) ((lyc) this).receiver).get();
            case 4:
                return (onf0) ((kly0) ((lyc) this).receiver).get();
            case 5:
                return (pmf0) ((kly0) ((lyc) this).receiver).get();
            case 6:
                return (nmf0) ((kly0) ((lyc) this).receiver).get();
            case 7:
                return (kyl1) ((kly0) ((lyc) this).receiver).get();
            case 8:
                return (Scheduler) ((kly0) ((lyc) this).receiver).get();
            case 9:
                return (azp0) ((kly0) ((lyc) this).receiver).get();
            case 10:
                return (q8n) ((kly0) ((lyc) this).receiver).get();
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return (ajg) ((kly0) ((lyc) this).receiver).get();
            case grn1.d /* 12 */:
                return (lw21) ((kly0) ((lyc) this).receiver).get();
            case 13:
                return (ajg) ((kly0) ((lyc) this).receiver).get();
            case 14:
                return (UserDirectoryCachePaths) ((kly0) ((lyc) this).receiver).get();
            case 15:
                return (rh61) ((kly0) ((lyc) this).receiver).get();
            case 16:
                return (jb0) ((kly0) ((lyc) this).receiver).get();
            case 17:
                return (q8n) ((kly0) ((lyc) this).receiver).get();
            case 18:
                return (a44) ((kly0) ((lyc) this).receiver).get();
            case 19:
                return (zwz0) ((kly0) ((lyc) this).receiver).get();
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return (crd) ((kly0) ((lyc) this).receiver).get();
            case 21:
                return (xob1) ((kly0) ((lyc) this).receiver).get();
            case 22:
                return (Context) ((kly0) ((lyc) this).receiver).get();
            case 23:
                return (Context) ((kly0) ((lyc) this).receiver).get();
            case 24:
                return (luk) ((kly0) ((lyc) this).receiver).get();
            case 25:
                return (ov20) ((kly0) ((lyc) this).receiver).get();
            case 26:
                return (ri2) ((kly0) ((lyc) this).receiver).get();
            case 27:
                return (mbo0) ((kly0) ((lyc) this).receiver).get();
            case 28:
                return (ohv0) ((kly0) ((lyc) this).receiver).get();
            default:
                return (t2j0) ((kly0) ((lyc) this).receiver).get();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qcp0(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.a = b;
    }
}
