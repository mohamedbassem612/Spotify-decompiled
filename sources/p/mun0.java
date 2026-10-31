package p;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mun0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kqi0 b;

    public /* synthetic */ mun0(kqi0 kqi0Var, byte b) {
        this.a = b;
        this.b = kqi0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        kqi0 kqi0Var = this.b;
        switch (b) {
            case 0:
                Intent intent = new Intent("android.settings.APP_LOCALE_SETTINGS");
                Activity activity = (Activity) kqi0Var.b;
                intent.setData(Uri.fromParts("package", activity.getPackageName(), null));
                activity.startActivity(intent);
                rok0 rok0Var = (rok0) kqi0Var.c;
                i8h1 i8h1Var = (i8h1) rok0Var.b;
                jqk0 jqk0Var = (jqk0) rok0Var.c;
                x6h1 x6h1VarC = jqk0Var.c.c();
                x6h1VarC.i.add(new a7h1("language_update_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("open_os_settings_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("open_os_settings", 1, b7xVar), x6h1VarC2.a(), jqk0Var.b, System.currentTimeMillis()), (xj61) null);
                break;
            default:
                rok0 rok0Var2 = (rok0) kqi0Var.c;
                i8h1 i8h1Var2 = (i8h1) rok0Var2.b;
                jqk0 jqk0Var2 = (jqk0) rok0Var2.c;
                x6h1 x6h1VarC3 = jqk0Var2.c.c();
                x6h1VarC3.i.add(new a7h1("language_update_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = true;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC4.a(), jqk0Var2.b, System.currentTimeMillis()), (xj61) null);
                break;
        }
    }
}
