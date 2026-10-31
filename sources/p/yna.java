package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class yna {
    public final ena a;
    public final cna b;
    public final t390 c;
    public final q8n d;

    public yna(ena enaVar, cna cnaVar, t390 t390Var, q8n q8nVar) {
        this.a = enaVar;
        this.b = cnaVar;
        this.c = t390Var;
        this.d = q8nVar;
    }

    public final gxu a(String str) {
        cna cnaVar = this.b;
        kru kruVar = (kru) cnaVar.g.get(str);
        if (kruVar != null) {
            j0v j0vVar = kruVar.a;
            if (t9p1.i(kruVar)) {
                ctp0 ctp0Var = (ctp0) qyo1.x(cnaVar.b.a.u().a, true, false, new atp0(str, (byte) 0));
                b8c0 b8c0Var = ctp0Var != null ? new b8c0(ctp0Var.c()) : null;
                String str2 = j0vVar.c;
                String string = j0vVar.b.toString();
                if (str2 == null) {
                    str2 = "";
                }
                return new gxu(string, str2, j0vVar.d, b8c0Var);
            }
        }
        return null;
    }

    public final long b(String str) {
        kru kruVar = (kru) this.b.g.get(str);
        if (kruVar == null) {
            return -1L;
        }
        int iH = t9p1.h(kruVar);
        double dB = kruVar.b();
        if (iH == 1 || dB <= 0.0d) {
            return -1L;
        }
        return ((long) (kruVar.a() / dB)) * 100;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(onm onmVar) {
        xna xnaVar;
        if (onmVar instanceof xna) {
            xnaVar = (xna) onmVar;
            int i = xnaVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xnaVar.c = i - Integer.MIN_VALUE;
            } else {
                xnaVar = new xna(this, onmVar);
            }
        } else {
            xnaVar = new xna(this, onmVar);
        }
        Object obj = xnaVar.a;
        int i2 = xnaVar.c;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            kk kkVar = new kk(this, (lnm) null, (byte) 22);
            xnaVar.c = 1;
            if (c921.H(this.d, kkVar, xnaVar) != d9nVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        xnaVar.c = 2;
        cna cnaVar = this.b;
        Object objH = c921.H(cnaVar.e, new ana(cnaVar, (lnm) null, (byte) 1), xnaVar);
        if (objH != d9nVar) {
            objH = rih1Var;
        }
        return objH == d9nVar ? d9nVar : rih1Var;
    }
}
