package p;

import android.content.Intent;
import android.net.Uri;
import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zqj0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ arj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zqj0(arj0 arj0Var, byte b) {
        super(0);
        this.a = b;
        this.b = arj0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        gms0 gms0Var = gms0.d;
        arj0 arj0Var = this.b;
        b7x b7xVar = b7x.a;
        switch (b) {
            case 0:
                yge0 yge0Var = arj0Var.i;
                gms0 gms0Var2 = arj0Var.k;
                drj0 drj0Var = arj0Var.h;
                bqk0 bqk0Var = (bqk0) drj0Var.c;
                i8h1 i8h1Var = (i8h1) drj0Var.b;
                if (gms0Var2 != gms0Var) {
                    x6h1 x6h1VarC = bqk0Var.b.c();
                    x6h1VarC.i.add(new a7h1("allow_mic_permission_dialog", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = true;
                    x6h1 x6h1VarC2 = x6h1VarC.a().c();
                    x6h1VarC2.i.add(new a7h1("allow_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("permission_allow", 1, Collections.singletonMap("permission_id", "android.permission.RECORD_AUDIO")), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                    yge0Var.k(new yqj0(arj0Var, (byte) 2));
                } else {
                    x6h1 x6h1VarC3 = bqk0Var.b.c();
                    x6h1VarC3.i.add(new a7h1("declined_mic_access_dialog", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = true;
                    x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                    x6h1VarC4.i.add(new a7h1("settings_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("open_os_settings", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                    yqj0 yqj0Var = new yqj0(arj0Var, (byte) 1);
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    dg30 dg30Var = (dg30) yge0Var.b;
                    intent.setData(Uri.fromParts("package", dg30Var.getPackageName(), null));
                    ((g0i) dg30Var).i.h("mic_settings_request", new e1r0((byte) 5, false), new srt(yge0Var, yqj0Var, (byte) 1)).a(intent);
                }
                break;
            default:
                gms0 gms0Var3 = arj0Var.k;
                drj0 drj0Var2 = arj0Var.h;
                bqk0 bqk0Var2 = (bqk0) drj0Var2.c;
                i8h1 i8h1Var2 = (i8h1) drj0Var2.b;
                if (gms0Var3 == gms0Var) {
                    x6h1 x6h1VarC5 = bqk0Var2.b.c();
                    x6h1VarC5.i.add(new a7h1("declined_mic_access_dialog", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = true;
                    x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                    x6h1VarC6.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                } else {
                    x6h1 x6h1VarC7 = bqk0Var2.b.c();
                    x6h1VarC7.i.add(new a7h1("allow_mic_permission_dialog", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = true;
                    x6h1 x6h1VarC8 = x6h1VarC7.a().c();
                    x6h1VarC8.i.add(new a7h1("deny_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("permission_deny", 1, Collections.singletonMap("permission_id", "android.permission.RECORD_AUDIO")), x6h1VarC8.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                }
                grj0 grj0Var = new grj0(false);
                if (arj0Var.l.compareAndSet(false, true)) {
                    arj0Var.j.b(grj0Var);
                    arj0Var.e.l();
                }
                break;
        }
        return rih1Var;
    }
}
