package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ftg1 {
    public static final bma1 e;
    public static final bma1 f;
    public static final bma1 g;
    public static final bma1 h;
    public static final bma1 i;
    public static final bma1 j;
    public final ucd a;
    public final Context b;
    public final joo c;
    public final dt71 d = mgo1.e(0, 4, 0, 4);

    static {
        nbc nbcVar = bma1.b;
        e = nbcVar.u("TrialSignifierDisplayStorage.downloads_snackbar");
        f = nbcVar.u("TrialSignifierDisplayStorage.offline_banner");
        g = nbcVar.u("TrialSignifierDisplayStorage.audio_quality_banner");
        h = nbcVar.u("TrialSignifierDisplayStorage.jam_banner");
        i = nbcVar.u("TrialSignifierDisplayStorage.queue_banner");
        j = nbcVar.u("TrialSignifierDisplayStorage.shuffle_snackbar");
    }

    public ftg1(ucd ucdVar, Context context, joo jooVar) {
        this.a = ucdVar;
        this.b = context;
        this.c = jooVar;
    }

    public static bma1 b(htg1 htg1Var) {
        int iOrdinal = htg1Var.ordinal();
        if (iOrdinal == 0) {
            return e;
        }
        if (iOrdinal == 1) {
            return f;
        }
        if (iOrdinal == 2) {
            return g;
        }
        if (iOrdinal == 3) {
            return h;
        }
        if (iOrdinal == 4) {
            return i;
        }
        if (iOrdinal == 5) {
            return j;
        }
        eg.o();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(htg1 htg1Var, onm onmVar) {
        atg1 atg1Var;
        bma1 bma1Var;
        if (onmVar instanceof atg1) {
            atg1Var = (atg1) onmVar;
            int i2 = atg1Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                atg1Var.d = i2 - Integer.MIN_VALUE;
            } else {
                atg1Var = new atg1(this, onmVar);
            }
        } else {
            atg1Var = new atg1(this, onmVar);
        }
        Object objC = atg1Var.b;
        int i3 = atg1Var.d;
        if (i3 == 0) {
            hm5.M(objC);
            bma1 bma1VarB = b(htg1Var);
            atg1Var.a = bma1VarB;
            atg1Var.d = 1;
            objC = c(atg1Var);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
            bma1Var = bma1VarB;
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bma1Var = atg1Var.a;
            hm5.M(objC);
        }
        return yah0.m(!((dma1) objC).h(bma1Var, false));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(onm onmVar) {
        dtg1 dtg1Var;
        if (onmVar instanceof dtg1) {
            dtg1Var = (dtg1) onmVar;
            int i2 = dtg1Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dtg1Var.c = i2 - Integer.MIN_VALUE;
            } else {
                dtg1Var = new dtg1(this, onmVar);
            }
        } else {
            dtg1Var = new dtg1(this, onmVar);
        }
        Object objA = dtg1Var.a;
        int i3 = dtg1Var.c;
        if (i3 == 0) {
            hm5.M(objA);
            dtg1Var.c = 1;
            objA = this.c.a(dtg1Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objA);
        }
        return this.a.b(this.b, (String) objA);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        if (r7.d.emit(r1, r0) == r5) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(p.htg1 r8, p.onm r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p.etg1
            if (r0 == 0) goto L13
            r0 = r9
            p.etg1 r0 = (p.etg1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.etg1 r0 = new p.etg1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.c
            int r1 = r0.e
            r2 = 2
            r3 = 0
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L39
            if (r1 == r4) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r9)
            goto L6c
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r3
        L31:
            p.bma1 r8 = r0.b
            p.htg1 r1 = r0.a
            p.hm5.M(r9)
            goto L51
        L39:
            p.hm5.M(r9)
            p.bma1 r9 = b(r8)
            r0.a = r8
            r0.b = r9
            r0.e = r4
            java.lang.Object r1 = r7.c(r0)
            if (r1 != r5) goto L4d
            goto L6b
        L4d:
            r6 = r1
            r1 = r8
            r8 = r9
            r9 = r6
        L51:
            p.dma1 r9 = (p.dma1) r9
            p.hma1 r9 = r9.edit()
            r9.a(r8, r4)
            r9.g()
            r0.a = r3
            r0.b = r3
            r0.e = r2
            p.dt71 r7 = r7.d
            java.lang.Object r7 = r7.emit(r1, r0)
            if (r7 != r5) goto L6c
        L6b:
            return r5
        L6c:
            p.rih1 r7 = p.rih1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ftg1.d(p.htg1, p.onm):java.lang.Object");
    }
}
