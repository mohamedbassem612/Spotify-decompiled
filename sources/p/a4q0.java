package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class a4q0 {
    public final wn4 a;
    public final u3q0 b;
    public final ftg1 c;

    public a4q0(wn4 wn4Var, u3q0 u3q0Var, ftg1 ftg1Var) {
        this.a = wn4Var;
        this.b = u3q0Var;
        this.c = ftg1Var;
    }

    public final Object a(gtg1 gtg1Var, onm onmVar) {
        Object objD;
        htg1 htg1Var = gtg1Var.a;
        return (htg1Var == null || (objD = this.c.d(htg1Var, onmVar)) != d9n.a) ? rih1.a : objD;
    }

    public final mr20 b() {
        if (!this.a.g()) {
            return h4p1.m(qrg1.e);
        }
        u3q0 u3q0Var = this.b;
        return h5p1.t(lyg.w(u3q0Var.b), u3q0Var.a(), new cq2(this, (lnm) null, (byte) 5));
    }

    public final mr20 c(gtg1 gtg1Var) {
        u3q0 u3q0Var = this.b;
        mr20 mr20VarW = lyg.w(u3q0Var.b);
        switch (gtg1Var) {
            case DOWNLOAD_MENU_ITEM:
            case REMOTE_DOWNLOAD_MENU_ITEM:
            case OFFLINE_BACKUP_BANNER:
            case QUEUE_BANNER:
            case DOWNLOADS_SNACKBAR:
            case SHUFFLE_SNACKBAR:
                return mr20VarW;
            case JAM_MENU_ITEM:
            case JAM_BANNER:
                return h5p1.t(mr20VarW, u3q0Var.a(), x3q0.h);
            case AUDIO_QUALITY_SETTINGS_ITEM:
            case AUDIO_QUALITY_BANNER:
                return this.a.f() ? h5p1.t(mr20VarW, u3q0Var.a(), y3q0.h) : h4p1.m(Boolean.FALSE);
            default:
                eg.o();
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(gtg1 gtg1Var, onm onmVar) {
        z3q0 z3q0Var;
        if (onmVar instanceof z3q0) {
            z3q0Var = (z3q0) onmVar;
            int i = z3q0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                z3q0Var.d = i - Integer.MIN_VALUE;
            } else {
                z3q0Var = new z3q0(this, onmVar);
            }
        } else {
            z3q0Var = new z3q0(this, onmVar);
        }
        Object objI = z3q0Var.b;
        int i2 = z3q0Var.d;
        boolean z = false;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objI);
            if (!this.a.g()) {
                return yah0.m(false);
            }
            z3q0Var.a = gtg1Var;
            z3q0Var.d = 1;
            objI = b5p1.i(c(gtg1Var), z3q0Var);
            if (objI != d9nVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objI);
                return objI;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        gtg1Var = z3q0Var.a;
        hm5.M(objI);
        boolean zBooleanValue = ((Boolean) objI).booleanValue();
        htg1 htg1Var = gtg1Var.a;
        if (zBooleanValue) {
            if (htg1Var != null) {
                z3q0Var.a = null;
                z3q0Var.d = 2;
                Object objA = this.c.a(htg1Var, z3q0Var);
                return objA == d9nVar ? d9nVar : objA;
            }
            z = true;
        }
        return yah0.m(z);
    }

    public final mr20 e(gtg1 gtg1Var) {
        if (!this.a.g()) {
            return h4p1.m(Boolean.FALSE);
        }
        mr20 mr20VarC = c(gtg1Var);
        htg1 htg1Var = gtg1Var.a;
        if (htg1Var == null) {
            return mr20VarC;
        }
        ftg1 ftg1Var = this.c;
        return h5p1.t(mr20VarC, u4p1.b0(new mpy0(new a1b1(d5p1.g(ftg1Var.d), htg1Var, (byte) 19), ftg1Var, htg1Var, (byte) 28), new l3g1(ftg1Var, htg1Var, (lnm) null, (byte) 5)), new irp0((byte) 3));
    }
}
