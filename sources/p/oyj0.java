package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class oyj0 extends xbk1 {
    public final kyj0 b;
    public nyj0 c;

    public oyj0(int i) {
        this.b = new kyj0(i);
    }

    public final lyj0 T(a7k0 a7k0Var) {
        kyj0 kyj0Var = this.b;
        kyj0Var.c.clear();
        kyj0Var.d.clear();
        LinkedHashMap linkedHashMap = kyj0Var.e;
        linkedHashMap.clear();
        LinkedHashMap linkedHashMap2 = kyj0Var.f;
        linkedHashMap2.clear();
        kyj0Var.h = null;
        kyj0Var.i = 1L;
        int i = kyj0Var.a;
        kyj0Var.g = i == 0 ? null : kyj0.h(a7k0Var, 0L);
        if (i > 0) {
            ilk0 ilk0Var = a7k0Var.b;
            linkedHashMap2.put(ilk0Var.a, ilk0Var);
            q6w0 q6w0Var = a7k0Var.a.b.a;
            s69 s69Var = q6w0Var.h;
            s69 s69Var2 = q6w0Var.i;
            buk1 buk1Var = q6w0Var.b;
            duk1 duk1Var = (s69Var == null && s69Var2 == null) ? null : buk1Var != null ? buk1Var.a : null;
            gez gezVar = q6w0Var.t;
            gez gezVar2 = q6w0Var.X;
            hez hezVar = q6w0Var.c;
            jez jezVar = (gezVar == null && gezVar2 == null) ? null : hezVar != null ? hezVar.a : null;
            r920 r920Var = q6w0Var.Y;
            r920 r920Var2 = q6w0Var.Z;
            fa20 fa20Var = q6w0Var.d;
            ha20 ha20Var = (r920Var == null && r920Var2 == null) ? null : fa20Var != null ? fa20Var.a : null;
            ox30 ox30Var = q6w0Var.N0;
            ox30 ox30Var2 = q6w0Var.O0;
            px30 px30Var = q6w0Var.e;
            linkedHashMap.put(0L, new wxj0(s69Var, s69Var2, duk1Var, gezVar, gezVar2, jezVar, r920Var, r920Var2, ha20Var, ox30Var, ox30Var2, (ox30Var == null && ox30Var2 == null) ? null : px30Var != null ? px30Var.a : null));
        }
        return kyj0Var.c();
    }
}
