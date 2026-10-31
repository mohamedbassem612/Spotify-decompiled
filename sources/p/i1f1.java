package p;

import android.view.View;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class i1f1 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j1f1 b;

    public /* synthetic */ i1f1(j1f1 j1f1Var, byte b) {
        this.a = b;
        this.b = j1f1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        j1f1 j1f1Var = this.b;
        switch (b) {
            case 0:
                qhe0 qhe0Var = j1f1Var.X1;
                if (qhe0Var == null) {
                    u890.C("ubiLogger");
                    throw null;
                }
                xdl0 xdl0Var = j1f1Var.Y1;
                if (xdl0Var == null) {
                    u890.C("troubleModalEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC = xdl0Var.a.c();
                x6h1VarC.i.add(new a7h1("open_email_app_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                tv80 tv80VarJ = qhe0Var.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", "")), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()));
                ohv0 ohv0Var = j1f1Var.a2;
                if (ohv0Var == null) {
                    u890.C("authTracker");
                    throw null;
                }
                ohv0Var.a(new mhv0("autosend_dual_button", "open_email_app", ew80.c, (String) null));
                lsn0 lsn0Var = new lsn0((String) null, tv80VarJ.a);
                mwn0 mwn0Var = j1f1Var.Z1;
                if (mwn0Var == null) {
                    u890.C("navigationLogger");
                    throw null;
                }
                nyn1.Q(mwn0Var, lsn0Var);
                if (j1f1Var.W1 == null) {
                    u890.C("emailClientLauncher");
                    throw null;
                }
                bvw.a(j1f1Var.P0());
                j1f1Var.dismiss();
                return;
            default:
                qhe0 qhe0Var2 = j1f1Var.X1;
                if (qhe0Var2 == null) {
                    u890.C("ubiLogger");
                    throw null;
                }
                xdl0 xdl0Var2 = j1f1Var.Y1;
                if (xdl0Var2 == null) {
                    u890.C("troubleModalEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC2 = xdl0Var2.a.c();
                x6h1VarC2.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                qhe0Var2.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()));
                ohv0 ohv0Var2 = j1f1Var.a2;
                if (ohv0Var2 == null) {
                    u890.C("authTracker");
                    throw null;
                }
                ohv0Var2.a(new mhv0("autosend_dual_button", "dismiss", ew80.c, (String) null));
                j1f1Var.dismiss();
                return;
        }
    }
}
