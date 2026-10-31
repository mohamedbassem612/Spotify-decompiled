package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class m0s {
    public final i8h1 a;

    public m0s(i8h1 i8h1Var) {
        this.a = i8h1Var;
    }

    public final String a(w7h1 w7h1Var) {
        return this.a.m(w7h1Var, (xj61) null).a.a;
    }

    public final String b(String str) {
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-connect-google-output-switcher";
        x6h1VarI.f = "3.2.0";
        x6h1VarI.g = "22.0.0";
        x6h1 x6h1VarR = kk0.r(x6h1VarI, "background");
        x6h1VarR.i.add(new a7h1("container_view", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarR.j = false;
        x6h1 x6h1VarC = x6h1VarR.a().c();
        x6h1VarC.i.add(new a7h1("device_list", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("active_device", str, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        y6h1 y6h1VarA = x6h1VarC2.a();
        b7x b7xVar = b7x.a;
        return a(new w7h1("", "", new z7h1("key_stroke", 1, b7xVar), new x7h1("decrease_volume", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()));
    }

    public final String c(String str) {
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-connect-google-output-switcher";
        x6h1VarI.f = "3.2.0";
        x6h1VarI.g = "22.0.0";
        x6h1 x6h1VarR = kk0.r(x6h1VarI, "background");
        x6h1VarR.i.add(new a7h1("container_view", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarR.j = false;
        x6h1 x6h1VarC = x6h1VarR.a().c();
        x6h1VarC.i.add(new a7h1("device_list", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("active_device", str, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        y6h1 y6h1VarA = x6h1VarC2.a();
        b7x b7xVar = b7x.a;
        return a(new w7h1("", "", new z7h1("key_stroke", 1, b7xVar), new x7h1("increase_volume", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()));
    }

    public final String d(int i, String str) {
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-connect-google-output-switcher";
        x6h1VarI.f = "3.2.0";
        x6h1VarI.g = "22.0.0";
        x6h1 x6h1VarR = kk0.r(x6h1VarI, "background");
        x6h1VarR.i.add(new a7h1("container_view", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarR.j = false;
        x6h1 x6h1VarC = x6h1VarR.a().c();
        x6h1VarC.i.add(new a7h1("device_list", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("active_device", str, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        y6h1 y6h1VarA = x6h1VarC2.a();
        z7h1 z7h1Var = new z7h1("drag", 1, b7x.a);
        String strValueOf = String.valueOf(i);
        if (strValueOf == null) {
            strValueOf = "";
        }
        return a(new w7h1("", "", z7h1Var, new x7h1("set_volume", 1, Collections.singletonMap("new_volume_percentage", strValueOf)), y6h1VarA, r6h1.c, System.currentTimeMillis()));
    }
}
