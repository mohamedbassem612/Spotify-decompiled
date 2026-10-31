package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gm80 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ cl80 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gm80(iu30 iu30Var, cl80 cl80Var, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = cl80Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        cl80 cl80Var = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                iu30Var.invoke(((zk80) cl80Var).d);
                break;
            case 1:
                iu30Var.invoke(cl80Var);
                break;
            case 2:
                iu30Var.invoke(cl80Var);
                break;
            case 3:
                iu30Var.invoke(((yk80) cl80Var).d);
                break;
            default:
                iu30Var.invoke(cl80Var);
                break;
        }
        return rih1Var;
    }
}
