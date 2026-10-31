package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rrr0 {
    public final xrp a;
    public final idd1 b = new idd1(new gyq0(this, (byte) 20));
    public final txk0 c = new txk0((byte) 21);

    public rrr0(xrp xrpVar) {
        this.a = xrpVar;
    }

    public final tv80 a(String str) {
        i8h1 i8h1Var = (i8h1) this.b.getValue();
        txk0 txk0Var = this.c;
        txk0Var.getClass();
        x6h1 x6h1VarC = txk0Var.b.c();
        x6h1VarC.i.add(new a7h1("next_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
    }
}
