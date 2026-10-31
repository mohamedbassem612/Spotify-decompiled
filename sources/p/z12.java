package p;

import android.view.View;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.checkout.spotifycheckout.events.proto.AddressCollectionCancel;
import com.spotify.checkout.spotifycheckout.events.proto.AddressCollectionEdit;
import com.spotify.checkout.spotifycheckout.events.proto.AddressCollectionSaveIntent;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class z12 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h22 b;

    public /* synthetic */ z12(h22 h22Var, byte b) {
        this.a = b;
        this.b = h22Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        boolean z = false;
        hwz hwzVar = hwz.a;
        b7x b7xVar = b7x.a;
        h22 h22Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                uba ubaVar = h22Var.K1;
                if (ubaVar == null) {
                    u890.C("pageBoundUbiLogger");
                    throw null;
                }
                dsk0 dsk0Var = h22Var.T1;
                if (dsk0Var == null) {
                    u890.C("ubiEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC = dsk0Var.b.c();
                x6h1VarC.i.add(new a7h1("error", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = true;
                ubaVar.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                h22Var.Z0().U(hwzVar);
                return;
            case 1:
                uba ubaVar2 = h22Var.K1;
                if (ubaVar2 == null) {
                    u890.C("pageBoundUbiLogger");
                    throw null;
                }
                dsk0 dsk0Var2 = h22Var.T1;
                if (dsk0Var2 == null) {
                    u890.C("ubiEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC3 = dsk0Var2.b.c();
                x6h1VarC3.i.add(new a7h1("view_address", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = true;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("edit_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                ubaVar2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                b8p1 b8p1VarY0 = h22Var.Y0();
                t2j0 t2j0Var = (t2j0) b8p1VarY0.c;
                a12 a12VarN = AddressCollectionEdit.n();
                a12VarN.n(((UUID) b8p1VarY0.e).toString());
                t2j0Var.a(a12VarN.build());
                h22Var.Z0().U(iyz.a);
                return;
            case 2:
                uba ubaVar3 = h22Var.K1;
                if (ubaVar3 == null) {
                    u890.C("pageBoundUbiLogger");
                    throw null;
                }
                dsk0 dsk0Var3 = h22Var.T1;
                if (dsk0Var3 == null) {
                    u890.C("ubiEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC5 = dsk0Var3.b.c();
                x6h1VarC5.i.add(new a7h1("edit_address", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = true;
                x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                x6h1VarC6.i.add(new a7h1("save_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC6.j = false;
                ubaVar3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                b8p1 b8p1VarY1 = h22Var.Y0();
                Object objV = h22Var.Z0().V();
                sgm0 sgm0Var = objV instanceof sgm0 ? (sgm0) objV : null;
                if (sgm0Var != null && sgm0Var.b()) {
                    z = true;
                }
                t2j0 t2j0Var2 = (t2j0) b8p1VarY1.c;
                e12 e12VarN = AddressCollectionSaveIntent.n();
                e12VarN.n(((UUID) b8p1VarY1.e).toString());
                e12VarN.q(z);
                t2j0Var2.a(e12VarN.build());
                h22Var.Z0().U(o400.a);
                return;
            case 3:
                uba ubaVar4 = h22Var.K1;
                if (ubaVar4 == null) {
                    u890.C("pageBoundUbiLogger");
                    throw null;
                }
                dsk0 dsk0Var4 = h22Var.T1;
                if (dsk0Var4 == null) {
                    u890.C("ubiEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC7 = dsk0Var4.b.c();
                x6h1VarC7.i.add(new a7h1("edit_address", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC7.j = true;
                x6h1 x6h1VarC8 = x6h1VarC7.a().c();
                x6h1VarC8.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC8.j = true;
                ubaVar4.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC8.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                b8p1 b8p1VarY2 = h22Var.Y0();
                t2j0 t2j0Var3 = (t2j0) b8p1VarY2.c;
                y02 y02VarN = AddressCollectionCancel.n();
                y02VarN.n(((UUID) b8p1VarY2.e).toString());
                t2j0Var3.a(y02VarN.build());
                h22Var.Z0().U(hwzVar);
                return;
            default:
                uba ubaVar5 = h22Var.K1;
                if (ubaVar5 == null) {
                    u890.C("pageBoundUbiLogger");
                    throw null;
                }
                dsk0 dsk0Var5 = h22Var.T1;
                if (dsk0Var5 == null) {
                    u890.C("ubiEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC9 = dsk0Var5.b.c();
                x6h1VarC9.i.add(new a7h1("error", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC9.j = true;
                x6h1 x6h1VarC10 = x6h1VarC9.a().c();
                x6h1VarC10.i.add(new a7h1("retry_btton", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC10.j = true;
                ubaVar5.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), x6h1VarC10.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                h22Var.Z0().U(e400.a);
                return;
        }
    }
}
