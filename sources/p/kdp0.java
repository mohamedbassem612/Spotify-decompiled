package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kdp0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nx9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kdp0(nx9 nx9Var, byte b) {
        super(0);
        this.a = b;
        this.b = nx9Var;
    }

    public final Object invoke() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return this.b.p();
            default:
                return this.b.h();
        }
    }
}
