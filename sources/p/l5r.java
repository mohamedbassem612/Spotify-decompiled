package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class l5r extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v720 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l5r(v720 v720Var, byte b) {
        super(0);
        this.a = b;
        this.b = v720Var;
    }

    public final Object invoke() {
        byte b = this.a;
        v720 v720Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
        }
        return v8r.q(v720Var.c);
    }
}
