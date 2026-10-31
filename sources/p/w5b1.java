package p;

import java.util.Optional;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class w5b1 {
    public final azp0 a;
    public final azp0 b;
    public final yyp0 c;
    public final yyp0 d;
    public final yyp0 e;
    public final yyp0 f;
    public final czp0 g;

    public w5b1(kly0 kly0Var, yqg yqgVar, xf01 xf01Var, xf01 xf01Var2, gkl1 gkl1Var, v7o0 v7o0Var, vzp0 vzp0Var, wzp0 wzp0Var, dj2 dj2Var, Set set, Set set2, ve11 ve11Var, bzp0 bzp0Var, mzp0 mzp0Var, hb4 hb4Var, Optional optional, Optional optional2) {
        jkl1 jkl1Var = new jkl1(gkl1Var, yqgVar);
        fkl1 fkl1Var = new fkl1(gkl1Var, kly0Var);
        o4c o4cVar = new o4c(xf01Var, (byte) 1);
        qd81 qd81Var = new qd81(v7o0Var, (byte) 8);
        o6b1 o6b1VarS = e4p1.s(optional);
        zyp0 zyp0Var = o6b1VarS != null ? new zyp0() : new azp0().b();
        zyp0Var.a(wzp0Var);
        zyp0Var.d.add(vzp0Var);
        zyp0Var.e = new rm5(new azp0(zyp0Var).d, mzp0Var);
        o6b1VarS = o6b1VarS == null ? new o6b1() : o6b1VarS;
        zyp0Var.b(o6b1VarS, o6b1VarS.a());
        r6b1 r6b1Var = new r6b1();
        if (!r6b1Var.equals(zyp0Var.p)) {
            zyp0Var.E = null;
        }
        zyp0Var.p = r6b1Var;
        zyp0Var.d.addAll(set2);
        zyp0Var.g = true;
        t9p1.k(zyp0Var, optional2);
        azp0 azp0Var = new azp0(zyp0Var);
        zyp0 zyp0VarB = azp0Var.b();
        Set set3 = set;
        zyp0VarB.c.addAll(set3);
        zyp0VarB.a(dj2Var);
        azp0 azp0Var2 = new azp0((zyp0) qd81Var.invoke(zyp0VarB));
        zyp0 zyp0VarB2 = azp0Var.b();
        zfu zfuVar = new zfu();
        int i = bzp0Var.a;
        if (i < 1) {
            hhg1.f(f4i1.c(i, "max < 1: "));
            throw null;
        }
        synchronized (zfuVar) {
            zfuVar.a = i;
        }
        zfu.c(zfuVar, (gf01) null, (jf01) null, (gf01) null, 7);
        int i2 = bzp0Var.b;
        if (i2 < 1) {
            hhg1.f(f4i1.c(i2, "max < 1: "));
            throw null;
        }
        synchronized (zfuVar) {
            zfuVar.b = i2;
        }
        zfu.c(zfuVar, (gf01) null, (jf01) null, (gf01) null, 7);
        zyp0VarB2.a = zfuVar;
        zyp0VarB2.b = new w9l(bzp0Var.c, bzp0Var.d);
        long j = bzp0Var.e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        zyp0VarB2.y = z4n1.b("timeout", j, timeUnit);
        zyp0VarB2.z = z4n1.b("timeout", bzp0Var.f, timeUnit);
        zyp0VarB2.A = z4n1.b("timeout", bzp0Var.g, timeUnit);
        zyp0VarB2.x = z4n1.b("timeout", bzp0Var.h, timeUnit);
        zyp0VarB2.f = bzp0Var.i;
        zyp0VarB2.a(ve11Var);
        xf01Var.a(zyp0VarB2);
        zyp0VarB2.a(dj2Var);
        azp0 azp0Var3 = new azp0((zyp0) qd81Var.invoke(zyp0VarB2));
        this.a = azp0Var3;
        zyp0 zyp0VarB3 = azp0Var3.b();
        zyp0VarB3.c.addAll(set3);
        azp0 azp0Var4 = new azp0(zyp0VarB3);
        zyp0 zyp0VarB4 = azp0Var4.b();
        zyp0VarB4.c.add(jkl1Var);
        zyp0VarB4.c.add(fkl1Var);
        if (!hb4Var.d()) {
            zyp0VarB4.a(o4cVar);
        }
        azp0 azp0Var5 = new azp0((zyp0) qd81Var.invoke(zyp0VarB4));
        this.b = azp0Var5;
        zyp0 zyp0VarB5 = azp0Var4.b();
        xf01Var2.a(zyp0VarB5);
        azp0 azp0Var6 = new azp0((zyp0) qd81Var.invoke(zyp0VarB5));
        this.c = new yyp0(azp0Var3);
        this.d = new yyp0(azp0Var5);
        this.e = new yyp0(azp0Var6);
        this.f = new yyp0(azp0Var2);
        this.g = new czp0(new azp0[]{azp0Var3, azp0Var5, azp0Var6, azp0Var2});
        new sun(azp0Var3.a);
    }
}
