package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qzn0 {
    public final q8n a;
    public final hp41 b;
    public final mwn0 c;
    public final kly0 d;
    public final zvc e;
    public final i8h1 f;
    public final t64 g;
    public final dsk0 h = new dsk0((byte) 2);

    public qzn0(q8n q8nVar, hp41 hp41Var, mwn0 mwn0Var, w0q w0qVar, zvc zvcVar, i8h1 i8h1Var, t64 t64Var, wuc wucVar) {
        this.a = q8nVar;
        this.b = hp41Var;
        this.c = mwn0Var;
        this.d = w0qVar;
        this.e = zvcVar;
        this.f = i8h1Var;
        this.g = t64Var;
    }

    public static void g(mwn0 mwn0Var, nsn0 nsn0Var) {
        nsn0Var.b();
        mwn0Var.e(nsn0Var);
        mwn0Var.f(nsn0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(wqn0 wqn0Var, onm onmVar) {
        nzn0 nzn0Var;
        if (onmVar instanceof nzn0) {
            nzn0Var = (nzn0) onmVar;
            int i = nzn0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                nzn0Var.d = i - Integer.MIN_VALUE;
            } else {
                nzn0Var = new nzn0(this, onmVar);
            }
        } else {
            nzn0Var = new nzn0(this, onmVar);
        }
        Object objY = nzn0Var.b;
        int i2 = nzn0Var.d;
        if (i2 == 0) {
            hm5.M(objY);
            wqn0Var.getClass();
            ozn0 ozn0Var = new ozn0(this, (lnm) null, (byte) 0);
            nzn0Var.a = wqn0Var;
            nzn0Var.d = 1;
            objY = fn31.Y(this.a, ozn0Var, nzn0Var);
            d9n d9nVar = d9n.a;
            if (objY == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wqn0Var = nzn0Var.a;
            hm5.M(objY);
        }
        this.c.g(new gwn0(wqn0Var.a(), wqn0Var.getUri(), (String) objY, (u8h1) null, 8));
        return rih1.a;
    }

    public final qhd1 b() {
        return (qhd1) c().j.getValue();
    }

    public final yvc c() {
        yvc yvcVar = this.e.a;
        if (yvcVar != null) {
            return yvcVar;
        }
        eg.m("CAL content is not available");
        return null;
    }

    public final void d() {
        fqn0 fqn0Var = fqn0.a;
        w7h1 w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("open_app", 1, sqg0.J(new mmr0[]{new mmr0("destination", "spotify:now-playing-view"), new mmr0("app", "music")})), this.h.b, r6h1.c, System.currentTimeMillis());
        ou80 ou80Var = this.f.m(w7h1Var, (xj61) null).a;
        this.g.a(w7h1Var, ou80Var);
        g(this.c, new lsn0("spotify:now-playing-view", ou80Var));
    }

    public final Object e(wqn0 wqn0Var, lnm lnmVar) {
        Object objY = fn31.Y(this.a, new m3n0(wqn0Var, this, (lnm) null, (byte) 13), lnmVar);
        return objY == d9n.a ? objY : rih1.a;
    }

    public final Object f(wqn0 wqn0Var, jzn1 jzn1Var, lnm lnmVar) {
        lsn0 lsn0Var;
        if (jzn1Var instanceof ezn0) {
            lsn0Var = new lsn0(wqn0Var.getUri(), ((ezn0) jzn1Var).b);
        } else {
            if (!(jzn1Var instanceof dzn0)) {
                eg.o();
                return null;
            }
            lsn0Var = jsn0.a;
        }
        g(this.c, lsn0Var);
        Object objE = e(wqn0Var, lnmVar);
        return objE == d9n.a ? objE : rih1.a;
    }
}
