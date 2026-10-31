package p;

import j$.time.Instant;
import j$.time.ZoneId;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qes {
    public final dma1 a;
    public final yqg b;

    public /* synthetic */ qes(yqg yqgVar, dma1 dma1Var) {
        this.a = dma1Var;
        this.b = yqgVar;
    }

    public nig0 a() {
        String strF;
        int iL;
        bma1 bma1Var = oig0.d;
        dma1 dma1Var = this.a;
        if (dma1Var.g(bma1Var, -1L) != Instant.ofEpochMilli(this.b.b()).atZone(ZoneId.systemDefault()).toLocalDate().toEpochDay() || (strF = dma1Var.f(oig0.a)) == null || (iL = dma1Var.l(oig0.c, -1)) == -1) {
            return null;
        }
        String strF2 = dma1Var.f(oig0.b);
        if (strF2 == null) {
            strF2 = "";
        }
        return new nig0(iL, strF, strF2);
    }

    public Set b() {
        Set setB = this.a.b(oa91.a, w7x.a);
        setB.getClass();
        return setB;
    }

    public void c() {
        Set setO1 = o7h.o1(b());
        setO1.add(f4p1.o(this.b.d().getTime()));
        hma1 hma1VarEdit = this.a.edit();
        hma1VarEdit.e(oa91.a, setO1);
        hma1VarEdit.g();
    }
}
