package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sl9 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cuk0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sl9(cuk0 cuk0Var, byte b) {
        super(1);
        this.a = b;
        this.b = cuk0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        cuk0 cuk0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj).intValue();
                return cuk0Var.b();
            default:
                return new h3h1(new sl9(cuk0Var, (byte) 0));
        }
    }
}
