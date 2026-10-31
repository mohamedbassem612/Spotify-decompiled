package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ha90 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ia90 b;
    public final /* synthetic */ txk0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ha90(ia90 ia90Var, txk0 txk0Var, byte b) {
        super(0);
        this.a = b;
        this.b = ia90Var;
        this.c = txk0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        b7x b7xVar = b7x.a;
        txk0 txk0Var = this.c;
        ia90 ia90Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                i8h1 i8h1Var = ia90Var.f;
                x6h1 x6h1VarC = txk0Var.b.c();
                x6h1VarC.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                ia90Var.b.e();
                break;
            default:
                i8h1 i8h1Var2 = ia90Var.f;
                x6h1 x6h1VarC2 = txk0Var.b.c();
                x6h1VarC2.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                ia90Var.b.e();
                break;
        }
        return rih1Var;
    }
}
