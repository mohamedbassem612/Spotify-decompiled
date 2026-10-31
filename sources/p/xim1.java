package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xim1 {
    public final wpl1 a;
    public final zrj1 b;

    public xim1(wpl1 wpl1Var, zrj1 zrj1Var) {
        this.a = wpl1Var;
        this.b = zrj1Var;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0074 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    /* JADX WARN: Code duplicated, block: B:29:0x0089  */
    /* JADX WARN: Code duplicated, block: B:31:0x008d  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(onm onmVar) {
        wim1 wim1Var;
        Object objA;
        ajm1 ajm1Var;
        int iOrdinal;
        xim1 xim1Var = this;
        if (onmVar instanceof wim1) {
            wim1Var = (wim1) onmVar;
            int i = wim1Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                wim1Var.e = i - Integer.MIN_VALUE;
            } else {
                wim1Var = new wim1(xim1Var, onmVar);
            }
        } else {
            wim1Var = new wim1(xim1Var, onmVar);
        }
        Object obj = wim1Var.c;
        int i2 = wim1Var.e;
        Enum r7 = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            wim1Var.e = 1;
            objA = xim1Var.a.a(wim1Var);
            if (objA != r7) {
            }
            return r7;
        }
        if (i2 == 1) {
            hm5.M(obj);
            objA = ((e331) obj).a;
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xim1Var = wim1Var.b;
            ajm1Var = wim1Var.a;
            hm5.M(obj);
        }
        xim1Var.getClass();
        iOrdinal = ((bjm1) obj).ordinal();
        if (iOrdinal != 0) {
            objA = new uim1(ajm1Var.a, ajm1Var.c, ajm1Var.b, ajm1Var.e, ajm1Var.f, ajm1Var.j, ajm1Var.i, ajm1Var.g, ajm1Var.k);
        } else {
            if (iOrdinal == 1) {
                eg.o();
                return null;
            }
            objA = new tim1(ajm1Var.d, ajm1Var.e, ajm1Var.f, ajm1Var.l, ajm1Var.h, ajm1Var.i);
        }
        if (objA instanceof m231) {
            return sim1.a;
        }
        return objA;
        if (!(objA instanceof m231)) {
            ajm1 ajm1Var2 = (ajm1) objA;
            wim1Var.a = ajm1Var2;
            wim1Var.b = xim1Var;
            wim1Var.e = 2;
            Enum enumH = xim1Var.b.h(wim1Var);
            if (enumH != r7) {
                ajm1Var = ajm1Var2;
                obj = enumH;
                xim1Var.getClass();
                iOrdinal = ((bjm1) obj).ordinal();
                if (iOrdinal != 0) {
                    objA = new uim1(ajm1Var.a, ajm1Var.c, ajm1Var.b, ajm1Var.e, ajm1Var.f, ajm1Var.j, ajm1Var.i, ajm1Var.g, ajm1Var.k);
                } else {
                    if (iOrdinal == 1) {
                        eg.o();
                        return null;
                    }
                    objA = new tim1(ajm1Var.d, ajm1Var.e, ajm1Var.f, ajm1Var.l, ajm1Var.h, ajm1Var.i);
                }
            }
            return r7;
        }
        if (objA instanceof m231) {
            return sim1.a;
        }
        return objA;
    }
}
