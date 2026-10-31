package p;

import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i850 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lc20 b;
    public final /* synthetic */ p850 c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i850(lc20 lc20Var, p850 p850Var, iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.b = lc20Var;
        this.c = p850Var;
        this.d = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.d;
        b7x b7xVar = b7x.a;
        p850 p850Var = this.c;
        lc20 lc20Var = this.b;
        switch (b) {
            case 0:
                String str = p850Var.d;
                i8h1 i8h1Var = (i8h1) ((xep) lc20Var.b).get();
                ksk0 ksk0Var = (ksk0) lc20Var.c;
                x6h1 x6h1VarC = ksk0Var.c.c();
                x6h1VarC.i.add(new a7h1("footer", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("support_site_label", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", str)), x6h1VarC2.a(), ksk0Var.b, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(m000.g);
                break;
            case 1:
                boolean z = p850Var.c;
                ksk0 ksk0Var2 = (ksk0) lc20Var.c;
                r6h1 r6h1Var = ksk0Var2.b;
                y6h1 y6h1Var = ksk0Var2.c;
                xep xepVar = (xep) lc20Var.b;
                if (z) {
                    i8h1 i8h1Var2 = (i8h1) xepVar.get();
                    x6h1 x6h1VarC3 = y6h1Var.c();
                    x6h1VarC3.i.add(new a7h1("content", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                    x6h1VarC4.i.add(new a7h1("send_request_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC4.a(), r6h1Var, System.currentTimeMillis()), (xj61) null);
                } else {
                    i8h1 i8h1Var3 = (i8h1) xepVar.get();
                    x6h1 x6h1VarC5 = y6h1Var.c();
                    x6h1VarC5.i.add(new a7h1("content", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                    x6h1VarC6.i.add(new a7h1("send_request_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    y6h1 y6h1VarA = x6h1VarC6.a();
                    String str2 = nik1.d4.a;
                    i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2 != null ? str2 : "")), y6h1VarA, r6h1Var, System.currentTimeMillis()), (xj61) null);
                }
                iu30Var.invoke(m000.d);
                break;
            default:
                boolean z2 = p850Var.c;
                ksk0 ksk0Var3 = (ksk0) lc20Var.c;
                r6h1 r6h1Var2 = ksk0Var3.b;
                y6h1 y6h1Var2 = ksk0Var3.c;
                xep xepVar2 = (xep) lc20Var.b;
                if (z2) {
                    i8h1 i8h1Var4 = (i8h1) xepVar2.get();
                    x6h1 x6h1VarC7 = y6h1Var2.c();
                    x6h1VarC7.i.add(new a7h1("content", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    x6h1 x6h1VarC8 = x6h1VarC7.a().c();
                    x6h1VarC8.i.add(new a7h1("not_now_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    i8h1Var4.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC8.a(), r6h1Var2, System.currentTimeMillis()), (xj61) null);
                } else {
                    i8h1 i8h1Var5 = (i8h1) xepVar2.get();
                    x6h1 x6h1VarC9 = y6h1Var2.c();
                    x6h1VarC9.i.add(new a7h1("content", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = false;
                    x6h1 x6h1VarC10 = x6h1VarC9.a().c();
                    x6h1VarC10.i.add(new a7h1("not_now_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC10.j = false;
                    y6h1 y6h1VarA2 = x6h1VarC10.a();
                    String str3 = nik1.c4.a;
                    i8h1Var5.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str3 != null ? str3 : "")), y6h1VarA2, r6h1Var2, System.currentTimeMillis()), (xj61) null);
                }
                iu30Var.invoke(m000.c);
                break;
        }
        return rih1Var;
    }
}
