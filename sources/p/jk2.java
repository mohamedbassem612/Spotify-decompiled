package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.ageverification.dialog.view.AgeVerificationDialogActivity;
import com.spotify.mobius.functions.Consumer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jk2 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ AgeVerificationDialogActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jk2(AgeVerificationDialogActivity ageVerificationDialogActivity, byte b) {
        super(0);
        this.a = b;
        this.b = ageVerificationDialogActivity;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        AgeVerificationDialogActivity ageVerificationDialogActivity = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                Consumer consumer = ageVerificationDialogActivity.m1;
                if (consumer != null) {
                    consumer.accept(cm2.d);
                    return rih1Var;
                }
                u890.C("eventConsumer");
                throw null;
            case 1:
                Consumer consumer2 = ageVerificationDialogActivity.m1;
                if (consumer2 != null) {
                    consumer2.accept(cm2.c);
                    return rih1Var;
                }
                u890.C("eventConsumer");
                throw null;
            default:
                Consumer consumer3 = ageVerificationDialogActivity.m1;
                if (consumer3 != null) {
                    consumer3.accept(cm2.b);
                    return rih1Var;
                }
                u890.C("eventConsumer");
                throw null;
        }
    }
}
