package p;

import io.reactivex.rxjava3.functions.Consumer;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nxd implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oxd b;

    public /* synthetic */ nxd(oxd oxdVar, byte b) {
        this.a = b;
        this.b = oxdVar;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        oxd oxdVar = this.b;
        switch (b) {
            case 0:
                exd exdVar = (exd) obj;
                if (!oxdVar.b) {
                    ffe1 ffe1Var = oxdVar.a;
                    xok0 xok0VarB = ffe1Var.b(exdVar.a);
                    i8h1 i8h1Var = (i8h1) ffe1Var.b;
                    x6h1 x6h1VarC = xok0VarB.b.c();
                    x6h1VarC.i.add(new a7h1("action_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = true;
                    i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "")), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                }
                break;
            case 1:
                ffe1 ffe1Var2 = oxdVar.a;
                xok0 xok0VarB2 = ffe1Var2.b(((fxd) obj).a);
                i8h1 i8h1Var2 = (i8h1) ffe1Var2.b;
                x6h1 x6h1VarC2 = xok0VarB2.b.c();
                x6h1VarC2.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                break;
            case 2:
                gxd gxdVar = (gxd) obj;
                if (!oxdVar.b) {
                    ffe1 ffe1Var3 = oxdVar.a;
                    String str = gxdVar.a;
                    int i = gxdVar.b;
                    xok0 xok0VarB3 = ffe1Var3.b(str);
                    i8h1 i8h1Var3 = (i8h1) ffe1Var3.b;
                    x6h1 x6h1VarC3 = xok0VarB3.b.c();
                    x6h1VarC3.i.add(new a7h1("carousel", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    y6h1 y6h1VarA = x6h1VarC3.a();
                    Integer numValueOf = Integer.valueOf(i);
                    x6h1 x6h1VarC4 = y6h1VarA.c();
                    x6h1VarC4.i.add(new a7h1("carousel_card", (String) null, numValueOf, (String) null, (String) null));
                    x6h1VarC4.j = true;
                    y6h1 y6h1VarA2 = x6h1VarC4.a();
                    k7h1 k7h1Var = new k7h1();
                    ((xjn) k7h1Var).a = y6h1VarA2;
                    ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                    i8h1Var3.f(k7h1Var.a(), (Set) null);
                }
                break;
            case 3:
                hxd hxdVar = (hxd) obj;
                if (!oxdVar.b) {
                    int i2 = hxdVar.c;
                    String str2 = hxdVar.a;
                    int i3 = hxdVar.b;
                    ffe1 ffe1Var4 = oxdVar.a;
                    i8h1 i8h1Var4 = (i8h1) ffe1Var4.b;
                    if (i2 <= i3) {
                        x6h1 x6h1VarC5 = ffe1Var4.b(str2).b.c();
                        x6h1VarC5.i.add(new a7h1("carousel", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC5.j = false;
                        y6h1 y6h1VarA3 = x6h1VarC5.a();
                        Integer numValueOf2 = Integer.valueOf(i3);
                        x6h1 x6h1VarC6 = y6h1VarA3.c();
                        x6h1VarC6.i.add(new a7h1("carousel_card", (String) null, numValueOf2, (String) null, (String) null));
                        x6h1VarC6.j = true;
                        i8h1Var4.m(new w7h1("", "", new z7h1("swipe_right", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                    } else {
                        x6h1 x6h1VarC7 = ffe1Var4.b(str2).b.c();
                        x6h1VarC7.i.add(new a7h1("carousel", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC7.j = false;
                        y6h1 y6h1VarA4 = x6h1VarC7.a();
                        Integer numValueOf3 = Integer.valueOf(i3);
                        x6h1 x6h1VarC8 = y6h1VarA4.c();
                        x6h1VarC8.i.add(new a7h1("carousel_card", (String) null, numValueOf3, (String) null, (String) null));
                        x6h1VarC8.j = true;
                        i8h1Var4.m(new w7h1("", "", new z7h1("swipe_left", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC8.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                    }
                }
                break;
            case 4:
                ixd ixdVar = (ixd) obj;
                ffe1 ffe1Var5 = oxdVar.a;
                String str3 = ixdVar.a;
                int i4 = ixdVar.b;
                String str4 = ixdVar.c;
                xok0 xok0VarB4 = ffe1Var5.b(str3);
                i8h1 i8h1Var5 = (i8h1) ffe1Var5.b;
                x6h1 x6h1VarC9 = xok0VarB4.b.c();
                x6h1VarC9.i.add(new a7h1("carousel", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC9.j = false;
                y6h1 y6h1VarA5 = x6h1VarC9.a();
                Integer numValueOf4 = Integer.valueOf(i4);
                x6h1 x6h1VarC10 = y6h1VarA5.c();
                x6h1VarC10.i.add(new a7h1("carousel_card", (String) null, numValueOf4, (String) null, (String) null));
                x6h1VarC10.j = true;
                x6h1 x6h1VarC11 = x6h1VarC10.a().c();
                x6h1VarC11.i.add(new a7h1("link_button", (String) null, (Integer) null, str4, (String) null));
                x6h1VarC11.j = true;
                y6h1 y6h1VarA6 = x6h1VarC11.a();
                k7h1 k7h1Var2 = new k7h1();
                ((xjn) k7h1Var2).a = y6h1VarA6;
                ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                i8h1Var5.f(k7h1Var2.a(), (Set) null);
                break;
            case 5:
                jxd jxdVar = (jxd) obj;
                ffe1 ffe1Var6 = oxdVar.a;
                String str5 = jxdVar.a;
                int i5 = jxdVar.b;
                String str6 = jxdVar.c;
                xok0 xok0VarB5 = ffe1Var6.b(str5);
                i8h1 i8h1Var6 = (i8h1) ffe1Var6.b;
                x6h1 x6h1VarC12 = xok0VarB5.b.c();
                x6h1VarC12.i.add(new a7h1("carousel", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC12.j = false;
                y6h1 y6h1VarA7 = x6h1VarC12.a();
                Integer numValueOf5 = Integer.valueOf(i5);
                x6h1 x6h1VarC13 = y6h1VarA7.c();
                x6h1VarC13.i.add(new a7h1("carousel_card", (String) null, numValueOf5, (String) null, (String) null));
                x6h1VarC13.j = true;
                x6h1 x6h1VarC14 = x6h1VarC13.a().c();
                x6h1VarC14.i.add(new a7h1("link_button", (String) null, (Integer) null, str6, (String) null));
                x6h1VarC14.j = true;
                i8h1Var6.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", str6)), x6h1VarC14.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                break;
            default:
                dxd dxdVar = (dxd) obj;
                if (!oxdVar.b) {
                    ffe1 ffe1Var7 = oxdVar.a;
                    xok0 xok0VarB6 = ffe1Var7.b(dxdVar.a);
                    i8h1 i8h1Var7 = (i8h1) ffe1Var7.b;
                    x6h1 x6h1VarC15 = xok0VarB6.b.c();
                    x6h1VarC15.i.add(new a7h1("action_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC15.j = true;
                    y6h1 y6h1VarA8 = x6h1VarC15.a();
                    k7h1 k7h1Var3 = new k7h1();
                    ((xjn) k7h1Var3).a = y6h1VarA8;
                    ((xjn) k7h1Var3).c = Long.valueOf(System.currentTimeMillis());
                    i8h1Var7.f(k7h1Var3.a(), (Set) null);
                }
                break;
        }
    }
}
