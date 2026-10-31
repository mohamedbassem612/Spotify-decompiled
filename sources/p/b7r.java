package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import j$.time.LocalDate;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class b7r extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ LocalDate c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b7r(iu30 iu30Var, LocalDate localDate, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = localDate;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        LocalDate localDate = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                iu30Var.invoke(localDate);
                break;
            case 1:
                iu30Var.invoke(localDate);
                break;
            default:
                iu30Var.invoke(localDate);
                break;
        }
        return rih1Var;
    }
}
