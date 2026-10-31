package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ymi1 {
    public final i8h1 a;
    public final String b;
    public brl0 c;

    public ymi1(i8h1 i8h1Var, hni1 hni1Var) {
        this.a = i8h1Var;
        String str = hni1Var.b;
        this.b = str;
        this.c = new brl0((String) null, str, (byte) 19);
    }

    public final void a(coi1 coi1Var) {
        w7h1 w7h1Var;
        boolean z = coi1Var instanceof xni1;
        b7x b7xVar = b7x.a;
        if (z) {
            brl0 brl0Var = this.c;
            brl0Var.getClass();
            x6h1 x6h1VarC = brl0Var.b.c();
            x6h1VarC.i.add(new a7h1("bluetooth_prompt_button", "got_it_bluetooth_off", (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis());
        } else {
            if (!(coi1Var instanceof yni1)) {
                return;
            }
            brl0 brl0Var2 = this.c;
            brl0Var2.getClass();
            x6h1 x6h1VarC2 = brl0Var2.b.c();
            x6h1VarC2.i.add(new a7h1("bluetooth_prompt_button", "allow_permissions", (Integer) null, (String) null, (String) null));
            x6h1VarC2.j = false;
            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
        }
        this.a.m(w7h1Var, (xj61) null);
    }

    public final sqk0 b(yc90 yc90Var, int i) {
        brl0 brl0Var = this.c;
        Integer numValueOf = Integer.valueOf(i);
        int iOrdinal = yc90Var.b.ordinal();
        int i2 = 1;
        if (iOrdinal != 0 && iOrdinal != 1) {
            i2 = 4;
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    i2 = 3;
                } else {
                    if (iOrdinal != 4) {
                        eg.o();
                        return null;
                    }
                    i2 = 2;
                }
            }
        }
        String str = "spotify:user:" + Uri.encode(yc90Var.a.getUsername());
        brl0Var.getClass();
        return new sqk0(brl0Var, numValueOf, i2, str);
    }
}
