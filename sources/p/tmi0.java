package p;

import android.view.View;
import android.widget.EditText;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tmi0 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ co6 b;
    public final /* synthetic */ Consumer c;

    public /* synthetic */ tmi0(co6 co6Var, Consumer consumer, byte b) {
        this.a = b;
        this.b = co6Var;
        this.c = consumer;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        Consumer consumer = this.c;
        b7x b7xVar = b7x.a;
        co6 co6Var = this.b;
        switch (b) {
            case 0:
                j2e0 j2e0Var = (j2e0) co6Var.c;
                i8h1 i8h1Var = (i8h1) j2e0Var.b;
                ksk0 ksk0Var = (ksk0) j2e0Var.c;
                x6h1 x6h1VarC = ksk0Var.c.c();
                x6h1VarC.i.add(new a7h1("save_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("change_display_name", 1, b7xVar), x6h1VarC.a(), ksk0Var.b, System.currentTimeMillis()), (xj61) null);
                consumer.accept(new jmi0(((EditText) ((ur00) co6Var.f).e).getText().toString()));
                break;
            default:
                j2e0 j2e0Var2 = (j2e0) co6Var.c;
                i8h1 i8h1Var2 = (i8h1) j2e0Var2.b;
                ksk0 ksk0Var2 = (ksk0) j2e0Var2.c;
                x6h1 x6h1VarC2 = ksk0Var2.c.c();
                x6h1VarC2.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC2.a(), ksk0Var2.b, System.currentTimeMillis()), (xj61) null);
                consumer.accept(imi0.a);
                break;
        }
    }
}
