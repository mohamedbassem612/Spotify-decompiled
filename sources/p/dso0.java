package p;

import android.view.View;
import com.spotify.allboarding.notificationpermission.view.NotificationPermissionFragment;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dso0 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ NotificationPermissionFragment b;

    public /* synthetic */ dso0(NotificationPermissionFragment notificationPermissionFragment, byte b) {
        this.a = b;
        this.b = notificationPermissionFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        NotificationPermissionFragment notificationPermissionFragment = this.b;
        switch (b) {
            case 0:
                bnj0 bnj0Var = notificationPermissionFragment.K1;
                if (bnj0Var == null) {
                    u890.C("enableNotificationChannel");
                    throw null;
                }
                bnj0Var.m();
                rok0 rok0Var = notificationPermissionFragment.H1;
                if (rok0Var == null) {
                    u890.C("ubiLogger");
                    throw null;
                }
                i8h1 i8h1Var = (i8h1) rok0Var.b;
                x6h1 x6h1VarC = ((yvk0) rok0Var.c).b.c();
                x6h1VarC.i.add(new a7h1("opt_in_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                jpa0 jpa0Var = notificationPermissionFragment.J1;
                if (jpa0Var == null) {
                    u890.C("permissionRequester");
                    throw null;
                }
                pf30 pf30Var = (pf30) jpa0Var.b;
                if (pf30Var != null) {
                    pf30Var.a("android.permission.POST_NOTIFICATIONS");
                    return;
                } else {
                    u890.C("requestPermissionLauncher");
                    throw null;
                }
            default:
                rok0 rok0Var2 = notificationPermissionFragment.H1;
                if (rok0Var2 == null) {
                    u890.C("ubiLogger");
                    throw null;
                }
                i8h1 i8h1Var2 = (i8h1) rok0Var2.b;
                x6h1 x6h1VarC2 = ((yvk0) rok0Var2.c).b.c();
                x6h1VarC2.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = true;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                notificationPermissionFragment.Y0();
                return;
        }
    }
}
