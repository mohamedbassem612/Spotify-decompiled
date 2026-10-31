package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dav extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ttk0 b;
    public final /* synthetic */ fav c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dav(ttk0 ttk0Var, fav favVar, byte b) {
        super(0);
        this.a = b;
        this.b = ttk0Var;
        this.c = favVar;
    }

    public final Object invoke() {
        byte b = this.a;
        fav favVar = this.c;
        ttk0 ttk0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                l320 state = favVar.getState();
                if (state == null) {
                    hhg1.n("Required value was null.");
                    return null;
                }
                String str = state.a;
                x6h1 x6h1VarC = ttk0Var.b.c();
                x6h1VarC.i.add(new a7h1("form_field", str, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var.a();
            default:
                l320 state2 = favVar.getState();
                if (state2 == null) {
                    hhg1.n("Required value was null.");
                    return null;
                }
                String str2 = state2.a;
                x6h1 x6h1VarC2 = ttk0Var.b.c();
                x6h1VarC2.i.add(new a7h1("form_field_error", str2, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = true;
                y6h1 y6h1VarA2 = x6h1VarC2.a();
                k7h1 k7h1Var2 = new k7h1();
                ((xjn) k7h1Var2).a = y6h1VarA2;
                ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var2.a();
        }
    }
}
