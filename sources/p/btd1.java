package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class btd1 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bjg1 b;

    public /* synthetic */ btd1(bjg1 bjg1Var, byte b) {
        this.a = b;
        this.b = bjg1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        bjg1 bjg1Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return bjg1Var.f();
            case 1:
                return ((mhg1) bjg1Var).d.getValue();
            case 2:
                return bjg1Var.f();
            case 3:
                return ((mhg1) bjg1Var).d.getValue();
            case 4:
                return bjg1Var.f();
            case 5:
                return ((mhg1) bjg1Var).d.getValue();
            case 6:
                return bjg1Var.f();
            case 7:
                return ((mhg1) bjg1Var).d.getValue();
            case 8:
                return bjg1Var.f();
            case 9:
                return ((mhg1) bjg1Var).d.getValue();
            default:
                return bjg1Var.f();
        }
    }
}
