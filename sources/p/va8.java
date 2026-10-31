package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class va8 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lik1 b;
    public final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ va8(lik1 lik1Var, Function0 function0, byte b) {
        super(1);
        this.a = b;
        this.b = lik1Var;
        this.c = function0;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        Function0 function0 = this.c;
        lik1 lik1Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                uv11 uv11Var = (uv11) obj;
                return new gcm(uv11Var.a, lik1Var.a, (ucm) null, new ua8(function0, uv11Var, (byte) 0), 12);
            default:
                uv11 uv11Var2 = (uv11) obj;
                return new gcm(uv11Var2.a, lik1Var.a, (ucm) null, new ua8(function0, uv11Var2, (byte) 2), 12);
        }
    }
}
