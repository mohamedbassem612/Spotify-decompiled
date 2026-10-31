package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bp51 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ttk0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bp51(ttk0 ttk0Var, byte b) {
        super(0);
        this.a = b;
        this.b = ttk0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        ttk0 ttk0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return ttk0Var.k(1, 2);
            case 1:
                return ttk0Var.k(2, 1);
            default:
                b7x b7xVar = b7x.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), ttk0Var.b, r6h1.c, System.currentTimeMillis());
        }
    }
}
