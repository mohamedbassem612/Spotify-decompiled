package p;

import android.view.View;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class o1b0 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wp20 b;

    public /* synthetic */ o1b0(wp20 wp20Var, byte b) {
        this.a = b;
        this.b = wp20Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        wp20 wp20Var = this.b;
        switch (b) {
            case 0:
                ye90 ye90Var = (ye90) wp20Var.a;
                String str = nik1.H0.a;
                i8h1 i8h1Var = (i8h1) ye90Var.b;
                x6h1 x6h1VarC = ((xok0) ye90Var.c).b.c();
                x6h1VarC.i.add(new a7h1("done_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                String str2 = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a.a;
                m42 m42Var = (m42) wp20Var.b;
                if (m42Var != null) {
                    m42Var.invoke(q9h.a);
                }
                break;
            default:
                m42 m42Var2 = (m42) wp20Var.b;
                if (m42Var2 != null) {
                    m42Var2.invoke(p9h.a);
                }
                break;
        }
    }
}
