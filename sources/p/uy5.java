package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class uy5 implements yta0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ uy5(Function0 function0, byte b) {
        this.a = b;
        this.b = function0;
    }

    public final void a() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                this.b.invoke();
                break;
            case 1:
                this.b.invoke();
                break;
            case 2:
                this.b.invoke();
                break;
            case 3:
                this.b.invoke();
                break;
            case 4:
                this.b.invoke();
                break;
            case 5:
                this.b.invoke();
                break;
            default:
                this.b.invoke();
                break;
        }
    }
}
