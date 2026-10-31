package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gnf extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ inf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gnf(inf infVar, byte b) {
        super(3);
        this.a = b;
        this.b = infVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        w7h1 w7h1Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        inf infVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                enf enfVar = (enf) obj2;
                dnf dnfVar = (dnf) obj3;
                yjq yjqVar = infVar.e;
                if (dnfVar.equals(cnf.a)) {
                    return enfVar.c ? (w7h1) ((Function0) yjqVar.b).invoke() : (w7h1) ((Function0) yjqVar.d).invoke();
                }
                if (dnfVar.equals(zmf.a)) {
                    return (w7h1) ((Function0) yjqVar.e).invoke();
                }
                boolean zEquals = dnfVar.equals(ymf.a);
                b7x b7xVar = b7x.a;
                if (zEquals) {
                    x6h1 x6h1VarC = ((ttk0) yjqVar.c).b.c();
                    x6h1VarC.i.add(new a7h1("go_to_settings_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", (String) yjqVar.f)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (!dnfVar.equals(xmf.a)) {
                        if (!dnfVar.equals(bnf.a) && !dnfVar.equals(anf.a)) {
                            eg.o();
                        }
                        return null;
                    }
                    x6h1 x6h1VarC2 = ((ttk0) yjqVar.c).b.c();
                    x6h1VarC2.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var;
            case 1:
                ((Number) obj3).intValue();
                uwo1.e(infVar.b, null, null, 0L, null, null, 0, false, null, 0, null, (b0k) obj2, 0, 0, 2046);
                return rih1Var;
            default:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                String str = infVar.a;
                uwr uwrVar = cbx.a;
                uwo1.e(str, null, cbx.d(b0kVar).g, 0L, null, null, 0, false, null, 0, null, b0kVar, 0, 0, 2042);
                return rih1Var;
        }
    }
}
