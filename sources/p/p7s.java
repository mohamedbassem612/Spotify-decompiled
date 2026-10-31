package p;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class p7s {
    public final ynb0 a;
    public final ynb0 b;
    public final c9n c;
    public final String f;
    public final idd1 d = new idd1(new d4e(this, (byte) 15));
    public final idd1 e = new idd1(new dor(this, (byte) 15));
    public final LinkedHashMap g = new LinkedHashMap();

    public p7s(ynb0 ynb0Var, ynb0 ynb0Var2, ajg ajgVar, c9n c9nVar) {
        this.a = ynb0Var;
        this.b = ynb0Var2;
        this.c = c9nVar;
        this.f = ((zym0) ajgVar).a;
    }

    public static void g(p7s p7sVar) {
        c921.y(p7sVar.c, (o8n) null, 0, new n3s(p7sVar, (lnm) null, (byte) 1), 3);
    }

    public final void a(ewh0 ewh0Var, w2z w2zVar, int i) {
        c921.y(this.c, (o8n) null, 0, new m7s(this, ewh0Var, w2zVar, i, (lnm) null, (byte) 0), 3);
    }

    public final fwh0 b(w2z w2zVar, boolean z) {
        LinkedHashMap linkedHashMap = this.g;
        fwh0 fwh0VarO = (fwh0) linkedHashMap.get(w2zVar);
        if (fwh0VarO == null) {
            Objects.toString(w2zVar);
            fwh0VarO = smo1.o(w2zVar, this, this.f);
            linkedHashMap.put(w2zVar, fwh0VarO);
        }
        if (z) {
            Objects.toString(w2zVar);
            linkedHashMap.remove(w2zVar);
        }
        return fwh0VarO;
    }

    public final owh0 c() {
        return (owh0) this.d.getValue();
    }

    public final ArrayList d() {
        c();
        owh0.b();
        return e130.w(this.f, owh0.c().i);
    }

    public final void e(w2z w2zVar) {
        c921.y(this.c, (o8n) null, 0, new xw0(this, w2zVar, (lnm) null, (byte) 3), 3);
    }

    public final void f(eyh0 eyh0Var) {
        c921.y(this.c, (o8n) null, 0, new eum(this, eyh0Var, (lnm) null, (byte) 21), 3);
    }
}
