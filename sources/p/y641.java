package p;

import android.os.Bundle;
import android.view.View;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class y641 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z641 b;

    public /* synthetic */ y641(z641 z641Var, byte b) {
        this.a = b;
        this.b = z641Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        z641 z641Var = this.b;
        switch (b) {
            case 0:
                bjx bjxVar = z641Var.V1;
                if (bjxVar == null) {
                    u890.C("partnerAccountLinkingDialogLogger");
                    throw null;
                }
                slc0 slc0Var = z641Var.a2;
                if (slc0Var == null) {
                    u890.C("linkingId");
                    throw null;
                }
                x6h1 x6h1VarC = ((pdl0) bjxVar.e).b.c();
                x6h1VarC.i.add(new a7h1("account_linking_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("link_accounts_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA = x6h1VarC2.a();
                ((g1s0) bjxVar.c).getClass();
                ((CompositeDisposable) bjxVar.g).b(fq7.C((xov0) bjxVar.b).subscribe(new p0s0(bjxVar, slc0Var, ((i8h1) bjxVar.d).m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", "com.osp.app.signin")), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null).a.a, 1)));
                a741 a741Var = z641Var.W1;
                if (a741Var == null) {
                    u890.C("samsungAccountLinkingIntentFetcher");
                    throw null;
                }
                slc0 slc0Var2 = z641Var.a2;
                if (slc0Var2 != null) {
                    z641Var.startActivityForResult(a741Var.a(slc0Var2), 0);
                    return;
                } else {
                    u890.C("linkingId");
                    throw null;
                }
            case 1:
                z641Var.Y0();
                bjx bjxVar2 = z641Var.V1;
                if (bjxVar2 == null) {
                    u890.C("partnerAccountLinkingDialogLogger");
                    throw null;
                }
                x6h1 x6h1VarC3 = ((pdl0) bjxVar2.e).b.c();
                x6h1VarC3.i.add(new a7h1("account_linking_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = true;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                ((i8h1) bjxVar2.d).m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                kt91 kt91Var = z641Var.Y1;
                if (kt91Var == null) {
                    u890.C("snackbarManager");
                    throw null;
                }
                if (kt91Var.g()) {
                    myq0 myq0Var = z641Var.X1;
                    if (myq0Var == null) {
                        u890.C("snackbarLogger");
                        throw null;
                    }
                    myq0Var.k();
                    kt91 kt91Var2 = z641Var.Y1;
                    if (kt91Var2 == null) {
                        u890.C("snackbarManager");
                        throw null;
                    }
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131961405});
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131961405});
                    kt91Var2.k(new er91((fs91) null, "", 2131961405, (String) null, 2131961404, new y641(z641Var, (byte) 2), (cvr) null, (xq91) null, false));
                    return;
                }
                return;
            default:
                String strT = pro1.t("samsung");
                myq0 myq0Var2 = z641Var.X1;
                if (myq0Var2 == null) {
                    u890.C("snackbarLogger");
                    throw null;
                }
                tv80 tv80VarJ = myq0Var2.j(strT);
                lzn0 lzn0Var = z641Var.Z1;
                if (lzn0Var != null) {
                    lzn0Var.a(strT, tv80VarJ, (Bundle) null);
                    return;
                } else {
                    u890.C("navigator");
                    throw null;
                }
        }
    }
}
