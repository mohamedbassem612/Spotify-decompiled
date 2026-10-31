package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.apprater.appraterdialog.AppRaterActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lv5 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ AppRaterActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lv5(AppRaterActivity appRaterActivity, byte b) {
        super(0);
        this.a = b;
        this.b = appRaterActivity;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        t3b1 t3b1Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                t3b1Var.finish();
                break;
            default:
                t3b1Var.finish();
                break;
        }
        return rih1Var;
    }
}
