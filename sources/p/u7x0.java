package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class u7x0 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v7x0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u7x0(v7x0 v7x0Var, byte b) {
        super(4);
        this.a = b;
        this.b = v7x0Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        byte b = this.a;
        v7x0 v7x0Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                return new fql0(v7x0Var.c);
            default:
                t7x0 t7x0Var = (t7x0) obj2;
                String str = v7x0Var.d;
                String str2 = v7x0Var.c;
                y6h1 y6h1Var = ((fql0) obj).a;
                int iOrdinal = ((s7x0) obj4).a.ordinal();
                b7x b7xVar = b7x.a;
                switch (iOrdinal) {
                    case 0:
                        x6h1 x6h1VarC = y6h1Var.c();
                        x6h1VarC.i.add(new a7h1("toolbar", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC.j = false;
                        x6h1 x6h1VarC2 = x6h1VarC.a().c();
                        x6h1VarC2.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC2.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
                        return w7h1Var;
                    case 1:
                        x6h1 x6h1VarC3 = y6h1Var.c();
                        x6h1VarC3.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC3.j = false;
                        x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                        x6h1VarC4.i.add(new a7h1("edit_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC4.j = false;
                        y6h1 y6h1VarA = x6h1VarC4.a();
                        z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                        if (str == null) {
                            str = "";
                        }
                        w7h1Var = new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), y6h1VarA, r6h1.c, System.currentTimeMillis());
                        return w7h1Var;
                    case 2:
                        x6h1 x6h1VarC5 = y6h1Var.c();
                        x6h1VarC5.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC5.j = false;
                        x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                        x6h1VarC6.i.add(new a7h1("settings_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC6.j = false;
                        y6h1 y6h1VarA2 = x6h1VarC6.a();
                        String str3 = v7x0Var.h;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str3 != null ? str3 : "")), y6h1VarA2, r6h1.c, System.currentTimeMillis());
                        return w7h1Var;
                    case 3:
                        x6h1 x6h1VarC7 = y6h1Var.c();
                        x6h1VarC7.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC7.j = false;
                        x6h1 x6h1VarC8 = x6h1VarC7.a().c();
                        x6h1VarC8.i.add(new a7h1("profile_picture", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC8.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC8.a(), r6h1.c, System.currentTimeMillis());
                        return w7h1Var;
                    case 4:
                        x6h1 x6h1VarC9 = y6h1Var.c();
                        x6h1VarC9.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC9.j = false;
                        x6h1 x6h1VarC10 = x6h1VarC9.a().c();
                        x6h1VarC10.i.add(new a7h1("profile_name", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC10.j = false;
                        y6h1 y6h1VarA3 = x6h1VarC10.a();
                        z7h1 z7h1Var2 = new z7h1("hit", 1, b7xVar);
                        if (str == null) {
                            str = "";
                        }
                        w7h1Var = new w7h1("", "", z7h1Var2, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), y6h1VarA3, r6h1.c, System.currentTimeMillis());
                        return w7h1Var;
                    case 5:
                        x6h1 x6h1VarC11 = y6h1Var.c();
                        x6h1VarC11.i.add(new a7h1("button_row", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC11.j = false;
                        x6h1 x6h1VarC12 = x6h1VarC11.a().c();
                        x6h1VarC12.i.add(new a7h1("following_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC12.j = false;
                        y6h1 y6h1VarA4 = x6h1VarC12.a();
                        String str4 = v7x0Var.f;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str4 != null ? str4 : "")), y6h1VarA4, r6h1.c, System.currentTimeMillis());
                        return w7h1Var;
                    case 6:
                        x6h1 x6h1VarC13 = y6h1Var.c();
                        x6h1VarC13.i.add(new a7h1("button_row", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC13.j = false;
                        x6h1 x6h1VarC14 = x6h1VarC13.a().c();
                        x6h1VarC14.i.add(new a7h1("followers_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC14.j = false;
                        y6h1 y6h1VarA5 = x6h1VarC14.a();
                        String str5 = v7x0Var.e;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str5 != null ? str5 : "")), y6h1VarA5, r6h1.c, System.currentTimeMillis());
                        return w7h1Var;
                    case 7:
                        List list = t7x0Var.a.f;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj5 : list) {
                            if (obj5 instanceof l7x0) {
                                arrayList.add(obj5);
                            }
                        }
                        l7x0 l7x0Var = (l7x0) o7h.s0(arrayList);
                        if (l7x0Var != null && l7x0Var.a) {
                            x6h1 x6h1VarC15 = y6h1Var.c();
                            x6h1VarC15.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC15.j = false;
                            x6h1 x6h1VarC16 = x6h1VarC15.a().c();
                            x6h1VarC16.i.add(new a7h1("follow_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC16.j = false;
                            y6h1 y6h1VarA6 = x6h1VarC16.a();
                            z7h1 z7h1Var3 = new z7h1("hit", 1, b7xVar);
                            if (str2 == null) {
                                str2 = "";
                            }
                            w7h1Var = new w7h1("", "", z7h1Var3, new x7h1("unfollow", 1, Collections.singletonMap("item_to_be_unfollowed", str2)), y6h1VarA6, r6h1.c, System.currentTimeMillis());
                        } else if (l7x0Var == null || !l7x0Var.b) {
                            x6h1 x6h1VarC17 = y6h1Var.c();
                            x6h1VarC17.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC17.j = false;
                            x6h1 x6h1VarC18 = x6h1VarC17.a().c();
                            x6h1VarC18.i.add(new a7h1("follow_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC18.j = false;
                            y6h1 y6h1VarA7 = x6h1VarC18.a();
                            z7h1 z7h1Var4 = new z7h1("hit", 1, b7xVar);
                            if (str2 == null) {
                                str2 = "";
                            }
                            w7h1Var = new w7h1("", "", z7h1Var4, new x7h1("follow", 1, Collections.singletonMap("item_to_be_followed", str2)), y6h1VarA7, r6h1.c, System.currentTimeMillis());
                        } else {
                            x6h1 x6h1VarC19 = y6h1Var.c();
                            x6h1VarC19.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC19.j = false;
                            x6h1 x6h1VarC20 = x6h1VarC19.a().c();
                            x6h1VarC20.i.add(new a7h1("follow_back_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC20.j = false;
                            y6h1 y6h1VarA8 = x6h1VarC20.a();
                            z7h1 z7h1Var5 = new z7h1("hit", 1, b7xVar);
                            if (str2 == null) {
                                str2 = "";
                            }
                            w7h1Var = new w7h1("", "", z7h1Var5, new x7h1("follow", 1, Collections.singletonMap("item_to_be_followed", str2)), y6h1VarA8, r6h1.c, System.currentTimeMillis());
                        }
                        return w7h1Var;
                    case 8:
                        String str6 = t7x0Var.e;
                        if (str6 == null) {
                            str6 = v7x0Var.i;
                        }
                        String str7 = str6;
                        x6h1 x6h1VarC21 = y6h1Var.c();
                        x6h1VarC21.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC21.j = false;
                        x6h1 x6h1VarC22 = x6h1VarC21.a().c();
                        x6h1VarC22.i.add(new a7h1("message_button", (String) null, (Integer) null, str7, (String) null));
                        x6h1VarC22.j = true;
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str7 != null ? str7 : "")), x6h1VarC22.a(), r6h1.c, System.currentTimeMillis());
                        return w7h1Var2;
                    case 9:
                        x6h1 x6h1VarC23 = y6h1Var.c();
                        x6h1VarC23.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC23.j = false;
                        x6h1 x6h1VarC24 = x6h1VarC23.a().c();
                        x6h1VarC24.i.add(new a7h1("add_friend_button", (String) null, (Integer) null, (String) null, "not_invited"));
                        x6h1VarC24.j = true;
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC24.a(), r6h1.c, System.currentTimeMillis());
                        return w7h1Var2;
                    case 10:
                    case 13:
                        return null;
                    case 11:
                        x6h1 x6h1VarC25 = y6h1Var.c();
                        x6h1VarC25.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC25.j = false;
                        x6h1 x6h1VarC26 = x6h1VarC25.a().c();
                        x6h1VarC26.i.add(new a7h1("biography_text", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC26.j = false;
                        y6h1 y6h1VarA9 = x6h1VarC26.a();
                        String str8 = v7x0Var.g;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str8 != null ? str8 : "")), y6h1VarA9, r6h1.c, System.currentTimeMillis());
                        return w7h1Var;
                    case 12:
                        x6h1 x6h1VarC27 = y6h1Var.c();
                        x6h1VarC27.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC27.j = false;
                        x6h1 x6h1VarC28 = x6h1VarC27.a().c();
                        x6h1VarC28.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC28.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC28.a(), r6h1.c, System.currentTimeMillis());
                        return w7h1Var;
                    case 14:
                        x6h1 x6h1VarC29 = y6h1Var.c();
                        x6h1VarC29.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC29.j = false;
                        x6h1 x6h1VarC30 = x6h1VarC29.a().c();
                        x6h1VarC30.i.add(new a7h1("biography_text", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC30.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC30.a(), r6h1.c, System.currentTimeMillis());
                        return w7h1Var;
                    case 15:
                        x6h1 x6h1VarC31 = y6h1Var.c();
                        x6h1VarC31.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC31.j = false;
                        x6h1 x6h1VarC32 = x6h1VarC31.a().c();
                        x6h1VarC32.i.add(new a7h1("biography_text", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC32.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC32.a(), r6h1.c, System.currentTimeMillis());
                        return w7h1Var;
                    default:
                        eg.o();
                        return null;
                }
        }
    }
}
