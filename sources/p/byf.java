package p;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class byf {
    public final i550 a;
    public final r5p b;
    public final s5p c;
    public final t5p d;
    public final u5p e;
    public final v5p f;
    public final w5p g;

    public byf(i550 i550Var, r5p r5pVar, s5p s5pVar, t5p t5pVar, u5p u5pVar, v5p v5pVar, w5p w5pVar) {
        this.a = i550Var;
        this.b = r5pVar;
        this.c = s5pVar;
        this.d = t5pVar;
        this.e = u5pVar;
        this.f = v5pVar;
        this.g = w5pVar;
    }

    public static izj c(byf byfVar, ch0 ch0Var, e4b1 e4b1Var, dg30 dg30Var, zxf zxfVar, iac0 iac0Var) {
        byfVar.getClass();
        return byfVar.b(dg30Var, new a42(ch0Var, (byte) 4), e4b1Var, dg30Var, zxfVar, true, iac0Var);
    }

    public final ayf a(Context context, cir0 cir0Var, fyf fyfVar, zxf zxfVar, boolean z) {
        dg30 dg30Var;
        Context baseContext = context;
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                dg30Var = null;
                break;
            }
            if (baseContext instanceof dg30) {
                dg30Var = (dg30) baseContext;
                break;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        dg30 dg30Var2 = dg30Var;
        dg30Var2.getClass();
        sjq0 sjq0Var = new sjq0(cir0Var);
        return new ayf(b(context, sjq0Var, fyfVar, dg30Var2, zxfVar, z, cir0Var.e()), sjq0Var);
    }

    public final izj b(Context context, mh0 mh0Var, fyf fyfVar, dg30 dg30Var, zxf zxfVar, boolean z, iac0 iac0Var) {
        lan1 lan1Var = new lan1(dg30Var, (byte) 2);
        daq daqVar = this.a.a.a.a;
        q2i1 w8gVar = new w8g(new i3b((x8g) daqVar.fk.get(), (byte) 12), new cce(mh0Var, fyfVar, zxfVar, (x8g) daqVar.fk.get()));
        this.b.getClass();
        q2i1 w8gVar2 = new w8g(new uq8((Object) zxfVar, (byte) 13), new l2a(fyfVar, (byte) 14));
        th30 th30VarE0 = dg30Var.e0();
        nfb nfbVar = new nfb((byte) 15, false);
        z5p z5pVar = (z5p) this.c.a.c;
        q2i1 w8gVar3 = new w8g(nfbVar, new wp20(context, iac0Var, th30VarE0, fyfVar, (i8h1) z5pVar.a.m.get(), (pf61) z5pVar.c.get()));
        q2i1 w8gVar4 = new w8g(new ejb((byte) 10), new oi(lan1Var, fyfVar, eyo1.A(new d85(false, ((z5p) this.e.a.c).a.c())), (byte) 19));
        sjb sjbVar = new sjb((byte) 10);
        z5p z5pVar2 = (z5p) this.f.a.c;
        q2i1 w8gVar5 = new w8g(sjbVar, new p68((g341) z5pVar2.a.l.get(), lan1Var, fyfVar, iac0Var, context, eyo1.A(new d85(false, z5pVar2.a.c()))));
        z5p z5pVar3 = (z5p) this.g.a.c;
        z5pVar3.getClass();
        ArrayList arrayListO = p7h.O(new q2i1[]{w8gVar, w8gVar2, w8gVar3, w8gVar4, w8gVar5, new w8g(new vgq0(new frv0(z5pVar3.a.d()), (byte) 15), new n0v0(mh0Var, fyfVar, zxfVar))});
        if (z) {
            gw40 gw40Var = new gw40(dg30Var);
            this.d.getClass();
            arrayListO.add(new w8g(new z210(), new t7y(lan1Var, gw40Var, (byte) 12)));
        }
        return new izj(arrayListO);
    }
}
