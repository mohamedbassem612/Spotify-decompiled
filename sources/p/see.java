package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class see implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h72 b;

    public /* synthetic */ see(h72 h72Var, byte b) {
        this.a = b;
        this.b = h72Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        h72 h72Var = this.b;
        switch (b) {
            case 0:
                ((lzn0) ((l7m0) ((ree) h72Var.g).b).b).e();
                break;
            default:
                oee oeeVar = (oee) h72Var.h;
                h72 h72Var2 = oeeVar.a;
                String strY0 = o7h.y0(oeeVar.a(), "/", (String) null, (String) null, (iu30) null, 62);
                cfd cfdVar = (ree) h72Var2.g;
                iu30 iu30Var = (iu30) ((y0w) cfdVar.c).a.get();
                if (iu30Var != null) {
                    iu30Var.invoke(strY0);
                }
                ((lzn0) ((l7m0) cfdVar.b).b).e();
                xid xidVar = oeeVar.c;
                x6h1 x6h1VarC = ((yok0) xidVar.c).b.c();
                x6h1VarC.i.add(new a7h1("toolbar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("save_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA = x6h1VarC2.a();
                b7x b7xVar = b7x.a;
                ((i8h1) xidVar.b).m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                break;
        }
    }
}
