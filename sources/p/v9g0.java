package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class v9g0 implements r331 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ v9g0(Function0 function0, byte b) {
        this.a = b;
        this.b = function0;
    }

    public final void e(d331 d331Var) {
        byte b = this.a;
        Function0 function0 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                if (d331Var instanceof y231) {
                    function0.invoke();
                }
                break;
            case 1:
                if (d331Var instanceof y231) {
                    function0.invoke();
                }
                break;
            case 2:
                if (d331Var instanceof y231) {
                    function0.invoke();
                }
                break;
            default:
                if (d331Var instanceof y231) {
                    function0.invoke();
                }
                break;
        }
    }
}
