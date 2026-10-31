package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bdp0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mlv0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bdp0(mlv0 mlv0Var, byte b) {
        super(0);
        this.a = b;
        this.b = mlv0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        mlv0 mlv0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
        }
        return mlv0Var.e();
    }
}
