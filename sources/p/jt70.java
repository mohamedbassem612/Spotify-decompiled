package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jt70 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zs70 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jt70(zs70 zs70Var, byte b) {
        super(0);
        this.a = b;
        this.b = zs70Var;
    }

    public final Object invoke() {
        byte b = this.a;
        zs70 zs70Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return (xfh0) zs70Var.b.get(zs70Var.c);
            case 1:
                return (xfh0) zs70Var.b.get(zs70Var.c);
            default:
                return Integer.valueOf(zs70Var.b.size());
        }
    }
}
