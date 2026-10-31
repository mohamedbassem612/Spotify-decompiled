package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qj51 implements ek90 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b8p1 b;
    public final /* synthetic */ List c;
    public final /* synthetic */ Function0 d;

    public /* synthetic */ qj51(b8p1 b8p1Var, List list, Function0 function0, byte b) {
        this.a = b;
        this.b = b8p1Var;
        this.c = list;
        this.d = function0;
    }

    public final void c(int i, int i2) {
        byte b = this.a;
        Function0 function0 = this.d;
        List list = this.c;
        b8p1 b8p1Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                if (b8p1Var != null) {
                    b8p1Var.u(i, i2, list.size());
                }
                if (function0 != null) {
                    function0.invoke();
                }
                break;
            default:
                if (b8p1Var != null) {
                    b8p1Var.u(i, i2, list.size());
                }
                if (function0 != null) {
                    function0.invoke();
                }
                break;
        }
    }
}
