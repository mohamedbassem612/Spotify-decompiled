package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ax1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wt1 b;
    public final /* synthetic */ xj0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax1(xj0 xj0Var, wt1 wt1Var) {
        super(0);
        this.a = (byte) 2;
        this.c = xj0Var;
        this.b = wt1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        b7x b7xVar = b7x.a;
        wt1 wt1Var = this.b;
        xj0 xj0Var = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                i8h1 i8h1Var = wt1Var.a;
                x6h1 x6h1VarC = wt1Var.b.a.c();
                x6h1VarC.i.add(new a7h1("filter_container", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("sort_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                xj0Var.invoke(qs1.a);
                break;
            case 1:
                i8h1 i8h1Var2 = wt1Var.a;
                x6h1 x6h1VarC3 = wt1Var.b.a.c();
                x6h1VarC3.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                xj0Var.invoke(as1.a);
                break;
            default:
                i8h1 i8h1Var3 = wt1Var.a;
                x6h1 x6h1VarC4 = wt1Var.b.a.c();
                x6h1VarC4.i.add(new a7h1("toolbar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                x6h1 x6h1VarC5 = x6h1VarC4.a().c();
                x6h1VarC5.i.add(new a7h1("create_playlist", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = false;
                xj0Var.invoke(new cs1(i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis()), (xj61) null)));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ax1(wt1 wt1Var, xj0 xj0Var, byte b) {
        super(0);
        this.a = b;
        this.b = wt1Var;
        this.c = xj0Var;
    }
}
