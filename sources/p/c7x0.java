package p;

import com.spotify.mobius.functions.Consumer;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class c7x0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e7x0 b;
    public final /* synthetic */ Consumer c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c7x0(e7x0 e7x0Var, Consumer consumer, byte b) {
        super(1);
        this.a = b;
        this.b = e7x0Var;
        this.c = consumer;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Consumer consumer = this.c;
        e7x0 e7x0Var = this.b;
        switch (b) {
            case 0:
                if (((q9x) obj).equals(q9x.a)) {
                    consumer.accept(new n6x0(e7x0Var.b.a()));
                    return rih1Var;
                }
                eg.o();
                return null;
            default:
                o3x0 o3x0Var = e7x0Var.b;
                int iOrdinal = ((q7x0) obj).ordinal();
                b7x b7xVar = b7x.a;
                switch (iOrdinal) {
                    case 0:
                        i8h1 i8h1Var = o3x0Var.a;
                        x6h1 x6h1VarC = o3x0Var.c.a.c();
                        x6h1VarC.i.add(new a7h1("toolbar", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC.j = false;
                        x6h1 x6h1VarC2 = x6h1VarC.a().c();
                        x6h1VarC2.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC2.j = false;
                        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                        consumer.accept(w5x0.a);
                        return rih1Var;
                    case 1:
                        i8h1 i8h1Var2 = o3x0Var.a;
                        x6h1 x6h1VarC3 = o3x0Var.c.a.c();
                        x6h1VarC3.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC3.j = false;
                        x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                        x6h1VarC4.i.add(new a7h1("edit_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC4.j = false;
                        i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "edit profile")), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                        consumer.accept(c6x0.a);
                        return rih1Var;
                    case 2:
                        i8h1 i8h1Var3 = o3x0Var.a;
                        x6h1 x6h1VarC5 = o3x0Var.c.a.c();
                        x6h1VarC5.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC5.j = false;
                        x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                        x6h1VarC6.i.add(new a7h1("settings_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC6.j = false;
                        y6h1 y6h1VarA = x6h1VarC6.a();
                        String str = o3x0Var.d;
                        z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                        if (str == null) {
                            str = "";
                        }
                        consumer.accept(new n6x0(i8h1Var3.m(new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null)));
                        return rih1Var;
                    case 3:
                        i8h1 i8h1Var4 = o3x0Var.a;
                        x6h1 x6h1VarC7 = o3x0Var.c.a.c();
                        x6h1VarC7.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC7.j = false;
                        x6h1 x6h1VarC8 = x6h1VarC7.a().c();
                        x6h1VarC8.i.add(new a7h1("profile_picture", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC8.j = false;
                        i8h1Var4.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC8.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                        consumer.accept(p6x0.a);
                        return rih1Var;
                    case 4:
                        i8h1 i8h1Var5 = o3x0Var.a;
                        x6h1 x6h1VarC9 = o3x0Var.c.a.c();
                        x6h1VarC9.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC9.j = false;
                        x6h1 x6h1VarC10 = x6h1VarC9.a().c();
                        x6h1VarC10.i.add(new a7h1("profile_name", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC10.j = false;
                        i8h1Var5.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "edit profile")), x6h1VarC10.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                        consumer.accept(o6x0.a);
                        return rih1Var;
                    case 5:
                        i8h1 i8h1Var6 = o3x0Var.a;
                        x6h1 x6h1VarC11 = o3x0Var.c.a.c();
                        x6h1VarC11.i.add(new a7h1("button_row", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC11.j = false;
                        x6h1 x6h1VarC12 = x6h1VarC11.a().c();
                        x6h1VarC12.i.add(new a7h1("following_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC12.j = false;
                        i8h1Var6.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", f4i1.e(o3x0Var.b, ":following"))), x6h1VarC12.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                        consumer.accept(h6x0.a);
                        return rih1Var;
                    case 6:
                        i8h1 i8h1Var7 = o3x0Var.a;
                        x6h1 x6h1VarC13 = o3x0Var.c.a.c();
                        x6h1VarC13.i.add(new a7h1("button_row", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC13.j = false;
                        x6h1 x6h1VarC14 = x6h1VarC13.a().c();
                        x6h1VarC14.i.add(new a7h1("followers_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC14.j = false;
                        i8h1Var7.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", f4i1.e(o3x0Var.b, ":followers"))), x6h1VarC14.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                        consumer.accept(g6x0.a);
                        return rih1Var;
                    case 7:
                        consumer.accept(new d6x0(null));
                        return rih1Var;
                    case 8:
                        consumer.accept(l6x0.a);
                        return rih1Var;
                    case 9:
                        i8h1 i8h1Var8 = o3x0Var.a;
                        x6h1 x6h1VarC15 = o3x0Var.c.a.c();
                        x6h1VarC15.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC15.j = false;
                        x6h1 x6h1VarC16 = x6h1VarC15.a().c();
                        x6h1VarC16.i.add(new a7h1("add_friend_button", (String) null, (Integer) null, (String) null, "not_invited"));
                        x6h1VarC16.j = true;
                        i8h1Var8.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC16.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                        consumer.accept(k6x0.a);
                        return rih1Var;
                    case 10:
                        consumer.accept(b6x0.a);
                        return rih1Var;
                    case 11:
                        i8h1 i8h1Var9 = o3x0Var.a;
                        x6h1 x6h1VarC17 = o3x0Var.c.a.c();
                        x6h1VarC17.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC17.j = false;
                        x6h1 x6h1VarC18 = x6h1VarC17.a().c();
                        x6h1VarC18.i.add(new a7h1("biography_text", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC18.j = false;
                        consumer.accept(new v5x0(i8h1Var9.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", f4i1.e(o3x0Var.b, ":edit:bio"))), x6h1VarC18.a(), r6h1.c, System.currentTimeMillis()), (xj61) null)));
                        return rih1Var;
                    case 12:
                        i8h1 i8h1Var10 = o3x0Var.a;
                        x6h1 x6h1VarC19 = o3x0Var.c.a.c();
                        x6h1VarC19.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC19.j = false;
                        x6h1 x6h1VarC20 = x6h1VarC19.a().c();
                        x6h1VarC20.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC20.j = false;
                        consumer.accept(new z5x0(i8h1Var10.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC20.a(), r6h1.c, System.currentTimeMillis()), (xj61) null)));
                        return rih1Var;
                    case 13:
                        return rih1Var;
                    case 14:
                        i8h1 i8h1Var11 = o3x0Var.a;
                        x6h1 x6h1VarC21 = o3x0Var.c.a.c();
                        x6h1VarC21.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC21.j = false;
                        x6h1 x6h1VarC22 = x6h1VarC21.a().c();
                        x6h1VarC22.i.add(new a7h1("biography_text", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC22.j = false;
                        i8h1Var11.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC22.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                        return rih1Var;
                    case 15:
                        i8h1 i8h1Var12 = o3x0Var.a;
                        x6h1 x6h1VarC23 = o3x0Var.c.a.c();
                        x6h1VarC23.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC23.j = false;
                        x6h1 x6h1VarC24 = x6h1VarC23.a().c();
                        x6h1VarC24.i.add(new a7h1("biography_text", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC24.j = false;
                        i8h1Var12.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC24.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                        return rih1Var;
                    default:
                        eg.o();
                        return null;
                }
        }
    }
}
