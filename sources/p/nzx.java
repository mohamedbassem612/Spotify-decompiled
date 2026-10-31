package p;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nzx implements uqd0 {
    public final /* synthetic */ byte a;
    public final yrd0 b;

    public /* synthetic */ nzx(yrd0 yrd0Var, byte b) {
        this.a = b;
        this.b = yrd0Var;
    }

    @Override // p.uqd0
    public final void a() {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        yrd0 yrd0Var = this.b;
        switch (b) {
            case 0:
                i8h1 i8h1Var = yrd0Var.a;
                py9 py9Var = yrd0Var.b;
                x6h1 x6h1VarC = py9Var.c.c();
                x6h1VarC.i.add(new a7h1("end_session_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("end_session_link", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA = x6h1VarC2.a();
                String str = nik1.z0.a;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str != null ? str : "")), y6h1VarA, py9Var.b, System.currentTimeMillis()), (xj61) null);
                break;
            case 1:
                i8h1 i8h1Var2 = yrd0Var.a;
                py9 py9Var2 = yrd0Var.b;
                x6h1 x6h1VarC3 = py9Var2.c.c();
                x6h1VarC3.i.add(new a7h1("join_session_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = true;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("join_session_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                y6h1 y6h1VarA2 = x6h1VarC4.a();
                String str2 = nik1.z0.a;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2 != null ? str2 : "")), y6h1VarA2, py9Var2.b, System.currentTimeMillis()), (xj61) null);
                break;
            case 2:
                i8h1 i8h1Var3 = yrd0Var.a;
                py9 py9Var3 = yrd0Var.b;
                x6h1 x6h1VarC5 = py9Var3.c.c();
                x6h1VarC5.i.add(new a7h1("start_new_session_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = true;
                x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                x6h1VarC6.i.add(new a7h1("start_new_session_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC6.j = false;
                y6h1 y6h1VarA3 = x6h1VarC6.a();
                String str3 = nik1.z0.a;
                i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str3 != null ? str3 : "")), y6h1VarA3, py9Var3.b, System.currentTimeMillis()), (xj61) null);
                break;
            default:
                i8h1 i8h1Var4 = yrd0Var.a;
                py9 py9Var4 = yrd0Var.b;
                x6h1 x6h1VarC7 = py9Var4.c.c();
                x6h1VarC7.i.add(new a7h1("upsell_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC7.j = true;
                x6h1 x6h1VarC8 = x6h1VarC7.a().c();
                x6h1VarC8.i.add(new a7h1("upgrade_to_premium_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC8.j = false;
                y6h1 y6h1VarA4 = x6h1VarC8.a();
                String str4 = nik1.b2.a;
                i8h1Var4.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str4 != null ? str4 : "")), y6h1VarA4, py9Var4.b, System.currentTimeMillis()), (xj61) null);
                break;
        }
    }

    @Override // p.uqd0
    public final void b() {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        yrd0 yrd0Var = this.b;
        switch (b) {
            case 0:
                i8h1 i8h1Var = yrd0Var.a;
                py9 py9Var = yrd0Var.b;
                x6h1 x6h1VarC = py9Var.c.c();
                x6h1VarC.i.add(new a7h1("end_session_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("close_dialog_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA = x6h1VarC2.a();
                String str = nik1.z0.a;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str != null ? str : "")), y6h1VarA, py9Var.b, System.currentTimeMillis()), (xj61) null);
                break;
            case 1:
                i8h1 i8h1Var2 = yrd0Var.a;
                py9 py9Var2 = yrd0Var.b;
                x6h1 x6h1VarC3 = py9Var2.c.c();
                x6h1VarC3.i.add(new a7h1("join_session_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = true;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("close_dialog_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                y6h1 y6h1VarA2 = x6h1VarC4.a();
                String str2 = nik1.z0.a;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2 != null ? str2 : "")), y6h1VarA2, py9Var2.b, System.currentTimeMillis()), (xj61) null);
                break;
            case 2:
                i8h1 i8h1Var3 = yrd0Var.a;
                py9 py9Var3 = yrd0Var.b;
                x6h1 x6h1VarC5 = py9Var3.c.c();
                x6h1VarC5.i.add(new a7h1("start_new_session_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = true;
                x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                x6h1VarC6.i.add(new a7h1("close_dialog_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC6.j = false;
                y6h1 y6h1VarA3 = x6h1VarC6.a();
                String str3 = nik1.z0.a;
                i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str3 != null ? str3 : "")), y6h1VarA3, py9Var3.b, System.currentTimeMillis()), (xj61) null);
                break;
            default:
                i8h1 i8h1Var4 = yrd0Var.a;
                py9 py9Var4 = yrd0Var.b;
                x6h1 x6h1VarC7 = py9Var4.c.c();
                x6h1VarC7.i.add(new a7h1("upsell_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC7.j = true;
                x6h1 x6h1VarC8 = x6h1VarC7.a().c();
                x6h1VarC8.i.add(new a7h1("close_dialog_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC8.j = false;
                y6h1 y6h1VarA4 = x6h1VarC8.a();
                String str4 = nik1.z0.a;
                i8h1Var4.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str4 != null ? str4 : "")), y6h1VarA4, py9Var4.b, System.currentTimeMillis()), (xj61) null);
                break;
        }
    }

    @Override // p.uqd0
    public final void c() {
        byte b = this.a;
        yrd0 yrd0Var = this.b;
        switch (b) {
            case 0:
                i8h1 i8h1Var = yrd0Var.a;
                py9 py9Var = yrd0Var.b;
                x6h1 x6h1VarC = py9Var.c.c();
                x6h1VarC.i.add(new a7h1("end_session_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).b = py9Var.b;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                i8h1Var.f(k7h1Var.a(), (Set) null);
                break;
            case 1:
                i8h1 i8h1Var2 = yrd0Var.a;
                py9 py9Var2 = yrd0Var.b;
                x6h1 x6h1VarC2 = py9Var2.c.c();
                x6h1VarC2.i.add(new a7h1("join_session_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = true;
                y6h1 y6h1VarA2 = x6h1VarC2.a();
                k7h1 k7h1Var2 = new k7h1();
                ((xjn) k7h1Var2).a = y6h1VarA2;
                ((xjn) k7h1Var2).b = py9Var2.b;
                ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                i8h1Var2.f(k7h1Var2.a(), (Set) null);
                break;
            case 2:
                i8h1 i8h1Var3 = yrd0Var.a;
                py9 py9Var3 = yrd0Var.b;
                x6h1 x6h1VarC3 = py9Var3.c.c();
                x6h1VarC3.i.add(new a7h1("start_new_session_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = true;
                y6h1 y6h1VarA3 = x6h1VarC3.a();
                k7h1 k7h1Var3 = new k7h1();
                ((xjn) k7h1Var3).a = y6h1VarA3;
                ((xjn) k7h1Var3).b = py9Var3.b;
                ((xjn) k7h1Var3).c = Long.valueOf(System.currentTimeMillis());
                i8h1Var3.f(k7h1Var3.a(), (Set) null);
                break;
            default:
                i8h1 i8h1Var4 = yrd0Var.a;
                py9 py9Var4 = yrd0Var.b;
                x6h1 x6h1VarC4 = py9Var4.c.c();
                x6h1VarC4.i.add(new a7h1("upsell_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = true;
                y6h1 y6h1VarA4 = x6h1VarC4.a();
                k7h1 k7h1Var4 = new k7h1();
                ((xjn) k7h1Var4).a = y6h1VarA4;
                ((xjn) k7h1Var4).b = py9Var4.b;
                ((xjn) k7h1Var4).c = Long.valueOf(System.currentTimeMillis());
                i8h1Var4.f(k7h1Var4.a(), (Set) null);
                break;
        }
    }
}
