package p;

import android.os.Build;
import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sro0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ drj0 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sro0(drj0 drj0Var, iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.b = drj0Var;
        this.c = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        b7x b7xVar = b7x.a;
        drj0 drj0Var = this.b;
        switch (b) {
            case 0:
                i8h1 i8h1Var = (i8h1) drj0Var.b;
                x6h1 x6h1VarC = ((tdl0) drj0Var.c).b.c();
                x6h1VarC.i.add(new a7h1("notification_opt_in_sheet", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("confirm_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(dro0.a);
                break;
            case 1:
                x6h1 x6h1VarC3 = ((tdl0) drj0Var.c).b.c();
                x6h1VarC3.i.add(new a7h1("system_notification_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("accept_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                y6h1 y6h1VarA = x6h1VarC4.a();
                ((i8h1) drj0Var.b).m(Build.VERSION.SDK_INT >= 33 ? new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("request_os_permission", 1, Collections.singletonMap("permission_to_be_requested", "push")), y6h1VarA, r6h1.c, System.currentTimeMillis()) : new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("open_os_settings", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(jro0.a);
                break;
            default:
                i8h1 i8h1Var2 = (i8h1) drj0Var.b;
                x6h1 x6h1VarC5 = ((tdl0) drj0Var.c).b.c();
                x6h1VarC5.i.add(new a7h1("system_notification_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = false;
                x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                x6h1VarC6.i.add(new a7h1("reject_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC6.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(gro0.a);
                break;
        }
        return rih1Var;
    }
}
