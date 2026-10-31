package p;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class o3x0 {
    public final i8h1 a;
    public final String b;
    public final fql0 c;
    public final String d;

    public o3x0(i8h1 i8h1Var, hvp0 hvp0Var) {
        this.a = i8h1Var;
        String str = ((y3x0) hvp0Var.b).a;
        this.b = str;
        this.c = new fql0(str);
        Set set = s4b1.f;
        this.d = uic.x("spotify:edit:profile:privacy-settings").z();
    }

    public final tv80 a() {
        x6h1 x6h1VarC = this.c.a.c();
        x6h1VarC.i.add(new a7h1("empty_view", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("manage_settings_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        y6h1 y6h1VarA = x6h1VarC2.a();
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        String str = this.d;
        if (str == null) {
            str = "";
        }
        return this.a.m(new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public final tv80 b(boolean z) {
        y6h1 y6h1Var = this.c.a;
        b7x b7xVar = b7x.a;
        String str = this.b;
        i8h1 i8h1Var = this.a;
        if (z) {
            x6h1 x6h1VarC = y6h1Var.c();
            x6h1VarC.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            x6h1 x6h1VarC2 = x6h1VarC.a().c();
            x6h1VarC2.i.add(new a7h1("follow_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC2.j = false;
            return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("follow", 1, Collections.singletonMap("item_to_be_followed", str != null ? str : "")), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
        }
        x6h1 x6h1VarC3 = y6h1Var.c();
        x6h1VarC3.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC3.j = false;
        x6h1 x6h1VarC4 = x6h1VarC3.a().c();
        x6h1VarC4.i.add(new a7h1("follow_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC4.j = false;
        return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("unfollow", 1, Collections.singletonMap("item_to_be_unfollowed", str != null ? str : "")), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
    }
}
