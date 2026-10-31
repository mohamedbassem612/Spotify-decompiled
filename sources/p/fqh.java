package p;

import android.view.View;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fqh implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iqh b;
    public final /* synthetic */ Consumer c;

    public /* synthetic */ fqh(iqh iqhVar, Consumer consumer, byte b) {
        this.a = b;
        this.b = iqhVar;
        this.c = consumer;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        Consumer consumer = this.c;
        b7x b7xVar = b7x.a;
        iqh iqhVar = this.b;
        switch (b) {
            case 0:
                cce cceVar = iqhVar.t;
                i8h1 i8h1Var = (i8h1) cceVar.b;
                x6h1 x6h1VarC = ((gxk0) cceVar.d).a.c();
                x6h1VarC.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                consumer.accept(znh.a);
                break;
            case 1:
                cce cceVar2 = iqhVar.t;
                i8h1 i8h1Var2 = (i8h1) cceVar2.b;
                x6h1 x6h1VarC2 = ((gxk0) cceVar2.d).a.c();
                x6h1VarC2.i.add(new a7h1("show_all_comments_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                consumer.accept(bph.a);
                break;
            default:
                cce cceVar3 = iqhVar.t;
                i8h1 i8h1Var3 = (i8h1) cceVar3.b;
                x6h1 x6h1VarC3 = ((gxk0) cceVar3.d).a.c();
                x6h1VarC3.i.add(new a7h1("comment_input_field", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("dismiss_reply_reminder_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                consumer.accept(ynh.a);
                break;
        }
    }
}
