package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class eb7 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eb7(boolean z, Function0 function0, Function0 function1, byte b) {
        super(0);
        this.a = b;
        this.b = z;
        this.c = function0;
        this.d = function1;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.d;
        Function0 function1 = this.c;
        boolean z = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                if (z) {
                    function1.invoke();
                } else {
                    function0.invoke();
                }
                return Boolean.TRUE;
            case 1:
                if (!z) {
                    if (function1 != null) {
                        function0 = function1;
                    }
                    function0.invoke();
                }
                return rih1Var;
            case 2:
                if (z) {
                    function1.invoke();
                } else {
                    function0.invoke();
                }
                return rih1Var;
            case 3:
                if (z) {
                    function1.invoke();
                } else {
                    function0.invoke();
                }
                return rih1Var;
            default:
                if (z) {
                    function1.invoke();
                } else {
                    function0.invoke();
                }
                return Boolean.TRUE;
        }
    }
}
