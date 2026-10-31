package p;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hrg1 {
    public static final bma1 f;
    public static final bma1 g;
    public static final bma1 h;
    public static final bma1 i;
    public static final bma1 j;
    public static final bma1 k;
    public static final bma1 l;
    public static final bma1 m;
    public final ucd a;
    public final Context b;
    public final joo c;
    public final dt71 d = mgo1.e(0, 8, 0, 4);
    public final dt71 e = mgo1.e(0, 8, 0, 4);

    static {
        nbc nbcVar = bma1.b;
        f = nbcVar.u("OnDemandTrialConfigurationPreferences.key_eligibility");
        g = nbcVar.u("OnDemandTrialConfigurationPreferences.key_eligibility_window_end_timestamp");
        h = nbcVar.u("OnDemandTrialConfigurationPreferences.key_eligibility_trial_length");
        i = nbcVar.u("OnDemandTrialConfigurationPreferences.key_eligibility_is_manual_trial_flow");
        j = nbcVar.u("OnDemandTrialConfigurationPreferences.key_trial_end_timestamp");
        k = nbcVar.u("OnDemandTrialConfigurationPreferences.key_started_trial_length_days");
        l = nbcVar.u("OnDemandTrialConfigurationPreferences.key_should_fetch_trial_end_timestamp");
        m = nbcVar.u("OnDemandTrialConfigurationPreferences.key_active_days");
    }

    public hrg1(ucd ucdVar, Context context, joo jooVar) {
        this.a = ucdVar;
        this.b = context;
        this.c = jooVar;
    }

    public static List d(dma1 dma1Var) {
        bma1 bma1Var = m;
        Set set = w7x.a;
        Set setB = dma1Var.b(bma1Var, set);
        if (setB != null) {
            set = setB;
        }
        Set set2 = set;
        ArrayList arrayList = new ArrayList(q7h.U(set2, 10));
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(Long.parseLong((String) it.next())));
        }
        return o7h.Z0(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        tqg1 tqg1Var;
        if (onmVar instanceof tqg1) {
            tqg1Var = (tqg1) onmVar;
            int i2 = tqg1Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tqg1Var.c = i2 - Integer.MIN_VALUE;
            } else {
                tqg1Var = new tqg1(this, onmVar);
            }
        } else {
            tqg1Var = new tqg1(this, onmVar);
        }
        Object objE = tqg1Var.a;
        int i3 = tqg1Var.c;
        if (i3 == 0) {
            hm5.M(objE);
            tqg1Var.c = 1;
            objE = e(tqg1Var);
            d9n d9nVar = d9n.a;
            if (objE == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objE);
        }
        hma1 hma1VarEdit = ((dma1) objE).edit();
        hma1VarEdit.b(k, -1);
        hma1VarEdit.g();
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(onm onmVar) {
        uqg1 uqg1Var;
        if (onmVar instanceof uqg1) {
            uqg1Var = (uqg1) onmVar;
            int i2 = uqg1Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uqg1Var.c = i2 - Integer.MIN_VALUE;
            } else {
                uqg1Var = new uqg1(this, onmVar);
            }
        } else {
            uqg1Var = new uqg1(this, onmVar);
        }
        Object objE = uqg1Var.a;
        int i3 = uqg1Var.c;
        if (i3 == 0) {
            hm5.M(objE);
            uqg1Var.c = 1;
            objE = e(uqg1Var);
            d9n d9nVar = d9n.a;
            if (objE == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objE);
        }
        hma1 hma1VarEdit = ((dma1) objE).edit();
        hma1VarEdit.c(j, -1L);
        hma1VarEdit.g();
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(onm onmVar) {
        vqg1 vqg1Var;
        if (onmVar instanceof vqg1) {
            vqg1Var = (vqg1) onmVar;
            int i2 = vqg1Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vqg1Var.c = i2 - Integer.MIN_VALUE;
            } else {
                vqg1Var = new vqg1(this, onmVar);
            }
        } else {
            vqg1Var = new vqg1(this, onmVar);
        }
        Object objE = vqg1Var.a;
        int i3 = vqg1Var.c;
        if (i3 == 0) {
            hm5.M(objE);
            vqg1Var.c = 1;
            objE = e(vqg1Var);
            d9n d9nVar = d9n.a;
            if (objE == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objE);
        }
        return d((dma1) objE);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(onm onmVar) {
        xqg1 xqg1Var;
        if (onmVar instanceof xqg1) {
            xqg1Var = (xqg1) onmVar;
            int i2 = xqg1Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xqg1Var.c = i2 - Integer.MIN_VALUE;
            } else {
                xqg1Var = new xqg1(this, onmVar);
            }
        } else {
            xqg1Var = new xqg1(this, onmVar);
        }
        Object objA = xqg1Var.a;
        int i3 = xqg1Var.c;
        if (i3 == 0) {
            hm5.M(objA);
            xqg1Var.c = 1;
            objA = this.c.a(xqg1Var);
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
    public final Object f(onm onmVar) {
        yqg1 yqg1Var;
        if (onmVar instanceof yqg1) {
            yqg1Var = (yqg1) onmVar;
            int i2 = yqg1Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yqg1Var.c = i2 - Integer.MIN_VALUE;
            } else {
                yqg1Var = new yqg1(this, onmVar);
            }
        } else {
            yqg1Var = new yqg1(this, onmVar);
        }
        Object objE = yqg1Var.a;
        int i3 = yqg1Var.c;
        if (i3 == 0) {
            hm5.M(objE);
            yqg1Var.c = 1;
            objE = e(yqg1Var);
            d9n d9nVar = d9n.a;
            if (objE == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objE);
        }
        return yah0.p(((dma1) objE).l(k, -1));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(onm onmVar) {
        zqg1 zqg1Var;
        if (onmVar instanceof zqg1) {
            zqg1Var = (zqg1) onmVar;
            int i2 = zqg1Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zqg1Var.c = i2 - Integer.MIN_VALUE;
            } else {
                zqg1Var = new zqg1(this, onmVar);
            }
        } else {
            zqg1Var = new zqg1(this, onmVar);
        }
        Object objE = zqg1Var.a;
        int i3 = zqg1Var.c;
        if (i3 == 0) {
            hm5.M(objE);
            zqg1Var.c = 1;
            objE = e(zqg1Var);
            d9n d9nVar = d9n.a;
            if (objE == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objE);
        }
        dma1 dma1Var = (dma1) objE;
        boolean zH = dma1Var.h(f, false);
        Long lQ = yah0.q(dma1Var.g(g, -1L));
        if (lQ.longValue() == -1) {
            lQ = null;
        }
        Integer numP = yah0.p(dma1Var.l(h, -1));
        return new nrg1(numP.intValue() != -1 ? numP : null, lQ, zH, dma1Var.h(i, false));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(onm onmVar) {
        arg1 arg1Var;
        if (onmVar instanceof arg1) {
            arg1Var = (arg1) onmVar;
            int i2 = arg1Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                arg1Var.c = i2 - Integer.MIN_VALUE;
            } else {
                arg1Var = new arg1(this, onmVar);
            }
        } else {
            arg1Var = new arg1(this, onmVar);
        }
        Object objE = arg1Var.a;
        int i3 = arg1Var.c;
        if (i3 == 0) {
            hm5.M(objE);
            arg1Var.c = 1;
            objE = e(arg1Var);
            d9n d9nVar = d9n.a;
            if (objE == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objE);
        }
        Long lQ = yah0.q(((dma1) objE).g(j, -1L));
        if (lQ.longValue() == -1) {
            return null;
        }
        return lQ;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
    
        if (r6.e.emit(r9, r0) == r4) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(long r7, p.onm r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p.brg1
            if (r0 == 0) goto L13
            r0 = r9
            p.brg1 r0 = (p.brg1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.brg1 r0 = new p.brg1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            p.d9n r4 = p.d9n.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            p.hm5.M(r9)
            goto L7b
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            r6 = 0
            return r6
        L31:
            long r7 = r0.a
            p.hm5.M(r9)
            goto L45
        L37:
            p.hm5.M(r9)
            r0.a = r7
            r0.d = r3
            java.lang.Object r9 = r6.e(r0)
            if (r9 != r4) goto L45
            goto L7a
        L45:
            p.dma1 r9 = (p.dma1) r9
            p.bma1 r1 = p.hrg1.m
            p.w7x r3 = p.w7x.a
            java.util.Set r5 = r9.b(r1, r3)
            if (r5 != 0) goto L52
            goto L53
        L52:
            r3 = r5
        L53:
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Set r3 = p.o7h.o1(r3)
            java.lang.String r5 = java.lang.String.valueOf(r7)
            r3.add(r5)
            p.hma1 r5 = r9.edit()
            r5.e(r1, r3)
            r5.g()
            java.util.List r9 = d(r9)
            r0.a = r7
            r0.d = r2
            p.dt71 r6 = r6.e
            java.lang.Object r6 = r6.emit(r9, r0)
            if (r6 != r4) goto L7b
        L7a:
            return r4
        L7b:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.hrg1.i(long, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(onm onmVar) {
        crg1 crg1Var;
        if (onmVar instanceof crg1) {
            crg1Var = (crg1) onmVar;
            int i2 = crg1Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                crg1Var.c = i2 - Integer.MIN_VALUE;
            } else {
                crg1Var = new crg1(this, onmVar);
            }
        } else {
            crg1Var = new crg1(this, onmVar);
        }
        Object objE = crg1Var.a;
        int i3 = crg1Var.c;
        if (i3 == 0) {
            hm5.M(objE);
            crg1Var.c = 1;
            objE = e(crg1Var);
            d9n d9nVar = d9n.a;
            if (objE == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objE);
        }
        return yah0.m(((dma1) objE).h(l, false));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(boolean z, onm onmVar) {
        drg1 drg1Var;
        if (onmVar instanceof drg1) {
            drg1Var = (drg1) onmVar;
            int i2 = drg1Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                drg1Var.d = i2 - Integer.MIN_VALUE;
            } else {
                drg1Var = new drg1(this, onmVar);
            }
        } else {
            drg1Var = new drg1(this, onmVar);
        }
        Object objE = drg1Var.b;
        int i3 = drg1Var.d;
        if (i3 == 0) {
            hm5.M(objE);
            drg1Var.a = z;
            drg1Var.d = 1;
            objE = e(drg1Var);
            d9n d9nVar = d9n.a;
            if (objE == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = drg1Var.a;
            hm5.M(objE);
        }
        hma1 hma1VarEdit = ((dma1) objE).edit();
        hma1VarEdit.a(l, z);
        hma1VarEdit.g();
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(int i2, onm onmVar) {
        erg1 erg1Var;
        if (onmVar instanceof erg1) {
            erg1Var = (erg1) onmVar;
            int i3 = erg1Var.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                erg1Var.d = i3 - Integer.MIN_VALUE;
            } else {
                erg1Var = new erg1(this, onmVar);
            }
        } else {
            erg1Var = new erg1(this, onmVar);
        }
        Object objE = erg1Var.b;
        int i4 = erg1Var.d;
        if (i4 == 0) {
            hm5.M(objE);
            erg1Var.a = i2;
            erg1Var.d = 1;
            objE = e(erg1Var);
            d9n d9nVar = d9n.a;
            if (objE == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i4 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = erg1Var.a;
            hm5.M(objE);
        }
        hma1 hma1VarEdit = ((dma1) objE).edit();
        hma1VarEdit.b(k, i2);
        hma1VarEdit.g();
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
    
        if (r8.d.emit(r9, r0) == r5) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(p.nrg1 r9, p.onm r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof p.frg1
            if (r0 == 0) goto L13
            r0 = r10
            p.frg1 r0 = (p.frg1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.frg1 r0 = new p.frg1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L37
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            p.hm5.M(r10)
            goto L90
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            return r2
        L31:
            p.nrg1 r9 = r0.a
            p.hm5.M(r10)
            goto L45
        L37:
            p.hm5.M(r10)
            r0.a = r9
            r0.d = r4
            java.lang.Object r10 = r8.e(r0)
            if (r10 != r5) goto L45
            goto L8f
        L45:
            p.dma1 r10 = (p.dma1) r10
            p.hma1 r10 = r10.edit()
            p.bma1 r1 = p.hrg1.f
            boolean r4 = r9.c()
            r10.a(r1, r4)
            java.lang.Long r1 = r9.b()
            if (r1 == 0) goto L5f
            long r6 = r1.longValue()
            goto L61
        L5f:
            r6 = -1
        L61:
            p.bma1 r1 = p.hrg1.g
            r10.c(r1, r6)
            java.lang.Integer r1 = r9.a()
            if (r1 == 0) goto L71
            int r1 = r1.intValue()
            goto L72
        L71:
            r1 = -1
        L72:
            p.bma1 r4 = p.hrg1.h
            r10.b(r4, r1)
            p.bma1 r1 = p.hrg1.i
            boolean r4 = r9.d()
            r10.a(r1, r4)
            r10.g()
            r0.a = r2
            r0.d = r3
            p.dt71 r8 = r8.d
            java.lang.Object r8 = r8.emit(r9, r0)
            if (r8 != r5) goto L90
        L8f:
            return r5
        L90:
            p.rih1 r8 = p.rih1.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.hrg1.m(p.nrg1, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(long j2, onm onmVar) {
        grg1 grg1Var;
        if (onmVar instanceof grg1) {
            grg1Var = (grg1) onmVar;
            int i2 = grg1Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                grg1Var.d = i2 - Integer.MIN_VALUE;
            } else {
                grg1Var = new grg1(this, onmVar);
            }
        } else {
            grg1Var = new grg1(this, onmVar);
        }
        Object objE = grg1Var.b;
        int i3 = grg1Var.d;
        if (i3 == 0) {
            hm5.M(objE);
            grg1Var.a = j2;
            grg1Var.d = 1;
            objE = e(grg1Var);
            d9n d9nVar = d9n.a;
            if (objE == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j2 = grg1Var.a;
            hm5.M(objE);
        }
        hma1 hma1VarEdit = ((dma1) objE).edit();
        hma1VarEdit.c(j, j2);
        hma1VarEdit.g();
        return rih1.a;
    }
}
