package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class e8e1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gik1 b;
    public final /* synthetic */ f8e1 c;
    public final /* synthetic */ ttk0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e8e1(gik1 gik1Var, f8e1 f8e1Var, ttk0 ttk0Var, byte b) {
        super(0);
        this.a = b;
        this.b = gik1Var;
        this.c = f8e1Var;
        this.d = ttk0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        ttk0 ttk0Var = this.d;
        f8e1 f8e1Var = this.c;
        gik1 gik1Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return gik1Var.a(f8e1Var, new d8e1(ttk0Var, f8e1Var, (byte) 0));
            default:
                return gik1Var.a(f8e1Var, new d8e1(ttk0Var, f8e1Var, (byte) 1));
        }
    }
}
