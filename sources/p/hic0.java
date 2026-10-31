package p;

import android.view.View;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hic0 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iic0 b;
    public final /* synthetic */ d781 c;

    public /* synthetic */ hic0(iic0 iic0Var, d781 d781Var, byte b) {
        this.a = b;
        this.b = iic0Var;
        this.c = d781Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        d781 d781Var = this.c;
        b7x b7xVar = b7x.a;
        iic0 iic0Var = this.b;
        switch (b) {
            case 0:
                n381 n381Var = iic0Var.a;
                i8h1 i8h1Var = (i8h1) n381Var.b;
                ezl0 ezl0Var = (ezl0) n381Var.c;
                x6h1 x6h1VarC = ezl0Var.c.c();
                x6h1VarC.i.add(new a7h1("explore_premium_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                String str = xgl.a;
                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                if (str == null) {
                    str = "";
                }
                i8h1Var.m(new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), y6h1VarA, ezl0Var.b, System.currentTimeMillis()), (xj61) null);
                d781Var.invoke(wwv0.b);
                break;
            default:
                n381 n381Var2 = iic0Var.a;
                i8h1 i8h1Var2 = (i8h1) n381Var2.b;
                ezl0 ezl0Var2 = (ezl0) n381Var2.c;
                x6h1 x6h1VarC2 = ezl0Var2.c.c();
                x6h1VarC2.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), ezl0Var2.b, System.currentTimeMillis()), (xj61) null);
                d781Var.invoke(wwv0.a);
                break;
        }
    }
}
