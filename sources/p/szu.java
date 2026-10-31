package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class szu implements shm {
    public final ov20 a;
    public final p5y b;
    public final me30 c;
    public final a4q0 d;
    public final drp0 e;
    public final zeu f;
    public final h9n0 g;

    public szu(ov20 ov20Var, p5y p5yVar, me30 me30Var, a4q0 a4q0Var, drp0 drp0Var, zeu zeuVar, h9n0 h9n0Var) {
        this.a = ov20Var;
        this.b = p5yVar;
        this.c = me30Var;
        this.d = a4q0Var;
        this.e = drp0Var;
        this.f = zeuVar;
        this.g = h9n0Var;
    }

    @Override // p.shm
    public final mr20 a(hti0 hti0Var, rzq rzqVar) {
        return new m441(new rzu(hti0Var, this, rzqVar, null, (byte) 0));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p.shm
    public final Object b(hti0 hti0Var, d0r d0rVar, lnm lnmVar) {
        pzu pzuVar;
        hti0 hti0Var2;
        qxc0 qxc0Var;
        if (lnmVar instanceof pzu) {
            pzuVar = (pzu) lnmVar;
            int i = pzuVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                pzuVar.f = i - Integer.MIN_VALUE;
            } else {
                pzuVar = new pzu(this, (onm) lnmVar);
            }
        } else {
            pzuVar = new pzu(this, (onm) lnmVar);
        }
        Object obj = pzuVar.d;
        int i2 = pzuVar.f;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            qxc0 qxc0Var2 = hti0Var.d;
            if (qxc0Var2 != null && c(hti0Var, qxc0Var2)) {
                ezc ezcVar = this.a.a;
                pzuVar.a = hti0Var;
                pzuVar.b = d0rVar;
                pzuVar.c = qxc0Var2;
                pzuVar.f = 1;
                Object objI = b5p1.i(ezcVar, pzuVar);
                if (objI != d9nVar) {
                    hti0Var2 = hti0Var;
                    qxc0Var = qxc0Var2;
                    obj = objI;
                }
            }
            return null;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(obj);
                return obj;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        qxc0 qxc0Var3 = pzuVar.c;
        d0rVar = pzuVar.b;
        hti0 hti0Var3 = pzuVar.a;
        hm5.M(obj);
        qxc0Var = qxc0Var3;
        hti0Var2 = hti0Var3;
        d0r d0rVar2 = d0rVar;
        Map map = (Map) obj;
        boolean z = (y7y0.G(map) || !y7y0.L(map) || y7y0.F(map)) ? false : true;
        if (y7y0.t("offline", map) || z) {
            i2e i2eVar = new i2e(this, hti0Var2, qxc0Var, d0rVar2, null);
            pzuVar.a = null;
            pzuVar.b = null;
            pzuVar.c = null;
            pzuVar.f = 2;
            Object objS = smo1.s(i2eVar, pzuVar);
            return objS == d9nVar ? d9nVar : objS;
        }
        return null;
    }

    public final boolean c(hti0 hti0Var, qxc0 qxc0Var) {
        if (this.e.b() || this.d.a.g()) {
            return false;
        }
        le30 le30VarA = this.c.a(qxc0Var.e);
        String str = hti0Var.a;
        this.b.getClass();
        return p5y.a(str) == null && le30VarA != le30.U0 && !gyo1.H(qxc0Var.O0, dlc0.b) && this.g.c(qxc0Var.X);
    }
}
