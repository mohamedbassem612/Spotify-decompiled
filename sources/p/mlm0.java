package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mlm0 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nlm0 b;

    public /* synthetic */ mlm0(nlm0 nlm0Var, byte b) {
        this.a = b;
        this.b = nlm0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        nlm0 nlm0Var = this.b;
        switch (b) {
            case 0:
                plm0 plm0Var = (plm0) nlm0Var.e2.getValue();
                String str = (String) nlm0Var.a2.getValue();
                x6h1 x6h1VarC = plm0Var.b.b.c();
                x6h1VarC.i.add(new a7h1("more_options_group", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("clear_history_button", str, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                nlm0Var.N0().e0().i0(mno1.h(new mmr0[]{oqn1.n("more_option_selected_key", new ilm0(plm0Var.a.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("clear_recent_searches", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null)))}), "req_more_option_fragment_key");
                nlm0Var.dismiss();
                break;
            default:
                plm0 plm0Var2 = (plm0) nlm0Var.e2.getValue();
                String str2 = (String) nlm0Var.a2.getValue();
                x6h1 x6h1VarC3 = plm0Var2.b.b.c();
                x6h1VarC3.i.add(new a7h1("more_options_group", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("report_a_problem_button", str2, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                nlm0Var.N0().e0().i0(mno1.h(new mmr0[]{oqn1.n("more_option_selected_key", new jlm0(plm0Var2.a.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null)))}), "req_more_option_fragment_key");
                nlm0Var.dismiss();
                break;
        }
    }
}
