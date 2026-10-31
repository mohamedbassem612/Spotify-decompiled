package p;

import android.content.DialogInterface;
import com.spotify.mobius.functions.Consumer;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fcx0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ Consumer a;
    public final /* synthetic */ obx0 b;
    public final /* synthetic */ g1b c;
    public final /* synthetic */ int d;

    public fcx0(Consumer consumer, obx0 obx0Var, g1b g1bVar, int i) {
        this.a = consumer;
        this.b = obx0Var;
        this.c = g1bVar;
        this.d = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        obx0 obx0Var = this.b;
        this.a.accept(new sax0(obx0Var));
        s880 s880Var = (s880) this.c.c;
        Set set = s4b1.f;
        if (uic.x(((sbx0) ((hvp0) s880Var.c).b).a).c != blc0.ge) {
            return;
        }
        String str = obx0Var.b;
        tpl0 tpl0Var = (tpl0) ((idd1) s880Var.h).getValue();
        tpl0Var.getClass();
        x6h1 x6h1VarC = tpl0Var.b.c();
        x6h1VarC.i.add(new a7h1("blocked_users_list", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        Integer numValueOf = Integer.valueOf(this.d);
        x6h1 x6h1VarC2 = y6h1VarA.c();
        x6h1VarC2.i.add(new a7h1("blocked_user", (String) null, numValueOf, str, (String) null));
        x6h1VarC2.j = false;
        x6h1 x6h1VarC3 = x6h1VarC2.a().c();
        x6h1VarC3.i.add(new a7h1("unblock_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC3.j = false;
        y6h1 y6h1VarA2 = x6h1VarC3.a();
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        if (str == null) {
            str = "";
        }
        ((i8h1) s880Var.b).m(new w7h1("", "", z7h1Var, new x7h1("unblock_user", 1, Collections.singletonMap("user_to_be_unblocked", str)), y6h1VarA2, tpl0Var.a, System.currentTimeMillis()), (xj61) null);
    }
}
