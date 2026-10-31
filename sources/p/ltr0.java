package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ltr0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ str0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ltr0(str0 str0Var, byte b) {
        super(0);
        this.a = b;
        this.b = str0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        str0 str0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((i8h1) str0Var.d.getValue()).m(str0Var.c.e(), (xj61) null);
                return rih1.a;
            default:
                return (i8h1) str0Var.a.get();
        }
    }
}
