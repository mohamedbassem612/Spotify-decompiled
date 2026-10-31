package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class p5j0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zyi0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p5j0(zyi0 zyi0Var, byte b) {
        super(0);
        this.a = b;
        this.b = zyi0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        zyi0 zyi0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                zyi0Var.j.invoke();
                break;
            default:
                zyi0Var.j.invoke();
                break;
        }
        return rih1Var;
    }
}
