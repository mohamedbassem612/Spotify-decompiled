package p;

import io.reactivex.rxjava3.functions.Action;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ea41 implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wdm b;
    public final /* synthetic */ ca41 c;

    public /* synthetic */ ea41(wdm wdmVar, ca41 ca41Var, byte b) {
        this.a = b;
        this.b = wdmVar;
        this.c = ca41Var;
    }

    public final void run() {
        byte b = this.a;
        ca41 ca41Var = this.c;
        wdm wdmVar = this.b;
        switch (b) {
            case 0:
                ((l0x0) wdmVar.f).q(ca41Var.b, ca41Var.d);
                ((rb00) wdmVar.Y).a("SAVE_ENTITY", ca41Var.b, ca41Var.c, ca41Var.d, ca41Var.e);
                break;
            default:
                l0x0 l0x0Var = (l0x0) wdmVar.f;
                String str = ca41Var.b;
                String str2 = ca41Var.d;
                i8h1 i8h1Var = (i8h1) l0x0Var.b;
                url0 url0Var = (url0) l0x0Var.d;
                url0Var.getClass();
                x6h1 x6h1VarC = url0Var.a.c();
                x6h1VarC.i.add(new a7h1("push_message_quick_action", str, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
                if (str2 == null) {
                    str2 = "";
                }
                i8h1Var.m(new w7h1("", "", z7h1Var, new x7h1("like", 1, Collections.singletonMap("item_to_be_liked", str2)), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                ((rb00) wdmVar.Y).a("SAVE_ENTITY", ca41Var.b, ca41Var.c, ca41Var.d, ca41Var.e);
                break;
        }
    }
}
