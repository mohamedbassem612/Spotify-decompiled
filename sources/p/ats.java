package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ats {
    public final sjb1 a;
    public final kly0 b;
    public final c9c0 c;
    public final z1s d;
    public final yqg e;

    public ats(sjb1 sjb1Var, jly0 jly0Var, c9c0 c9c0Var, z1s z1sVar, yqg yqgVar) {
        this.a = sjb1Var;
        this.b = jly0Var;
        this.c = c9c0Var;
        this.d = z1sVar;
        this.e = yqgVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        yss yssVar;
        if (onmVar instanceof yss) {
            yssVar = (yss) onmVar;
            int i = yssVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yssVar.c = i - Integer.MIN_VALUE;
            } else {
                yssVar = new yss(this, onmVar);
            }
        } else {
            yssVar = new yss(this, onmVar);
        }
        Object objI = yssVar.a;
        int i2 = yssVar.c;
        if (i2 == 0) {
            hm5.M(objI);
            zob1 zob1VarB = this.c.d.b();
            yssVar.c = 1;
            objI = b5p1.i(zob1VarB, yssVar);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objI);
        }
        zo90 zo90Var = ((ap90) objI).b.c;
        if (zo90Var != null) {
            return zo90Var.a;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0090, code lost:
    
        if (r0 == r7) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(boolean r13, p.onm r14) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ats.b(boolean, p.onm):java.lang.Object");
    }
}
