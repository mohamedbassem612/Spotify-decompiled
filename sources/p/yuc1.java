package p;

import android.view.View;
import com.spotify.checkout.spotifycheckout.events.proto.AddressCollectionConfirmIntent;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yuc1 implements View.OnClickListener {
    public final /* synthetic */ zuc1 a;

    public yuc1(zuc1 zuc1Var) {
        this.a = zuc1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zuc1 zuc1Var = this.a;
        h22 h22Var = zuc1Var.c2;
        if (h22Var == null) {
            u890.C("listener");
            throw null;
        }
        wuc1 wuc1Var = zuc1Var.b2;
        if (wuc1Var == null) {
            u890.C("args");
            throw null;
        }
        h290 h290VarU = wuc1Var.a.u();
        h22 h22Var2 = h22Var;
        uba ubaVar = h22Var2.K1;
        if (ubaVar == null) {
            u890.C("pageBoundUbiLogger");
            throw null;
        }
        dsk0 dsk0Var = h22Var2.T1;
        if (dsk0Var == null) {
            u890.C("ubiEventFactory");
            throw null;
        }
        x6h1 x6h1VarC = dsk0Var.b.c();
        x6h1VarC.i.add(new a7h1("suggestion_dialog", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("accept_suggestion", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        y6h1 y6h1VarA = x6h1VarC2.a();
        b7x b7xVar = b7x.a;
        ubaVar.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
        b8p1 b8p1VarY0 = h22Var2.Y0();
        t2j0 t2j0Var = (t2j0) b8p1VarY0.c;
        z02 z02VarN = AddressCollectionConfirmIntent.n();
        z02VarN.n(((UUID) b8p1VarY0.e).toString());
        t2j0Var.a(z02VarN.build());
        h22Var2.Z0().U(new k500(h290VarU));
        zuc1Var.dismiss();
    }
}
