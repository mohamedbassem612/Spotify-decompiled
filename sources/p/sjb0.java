package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sjb0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ xtb0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sjb0(boolean z, xtb0 xtb0Var, byte b) {
        super(0);
        this.a = b;
        this.b = z;
        this.c = xtb0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        xtb0 xtb0Var = this.c;
        boolean z = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return z ? vgo1.r(xtb0Var) : Float.valueOf(vgo1.s(xtb0Var));
            default:
                return z ? Float.valueOf(vgo1.s(xtb0Var)) : vgo1.r(xtb0Var);
        }
    }
}
