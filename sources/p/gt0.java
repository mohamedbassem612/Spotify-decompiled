package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gt0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c9n b;
    public final /* synthetic */ nt0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gt0(c9n c9nVar, nt0 nt0Var, byte b) {
        super(0);
        this.a = b;
        this.b = c9nVar;
        this.c = nt0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        nt0 nt0Var = this.c;
        c9n c9nVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                fn31.T(c9nVar, (o8n) null, 0, new et0(nt0Var, null, (byte) 1), 3);
                break;
            default:
                fn31.T(c9nVar, (o8n) null, 0, new et0(nt0Var, null, (byte) 2), 3);
                break;
        }
        return rih1Var;
    }
}
