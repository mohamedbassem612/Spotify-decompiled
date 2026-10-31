package p;

import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class om70 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ om70(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0057 A[PHI: r0
      0x0057: PHI (r0v13 int) = (r0v12 int), (r0v14 int) binds: [B:25:0x005f, B:20:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0062  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    private final Object b(Object obj, lnm lnmVar) {
        qoc0 qoc0Var;
        int i;
        int i2;
        if (lnmVar instanceof qoc0) {
            qoc0Var = (qoc0) lnmVar;
            int i3 = qoc0Var.b;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                qoc0Var.b = i3 - Integer.MIN_VALUE;
            } else {
                qoc0Var = new qoc0(this, lnmVar);
            }
        } else {
            qoc0Var = new qoc0(this, lnmVar);
        }
        Object obj2 = qoc0Var.a;
        int i4 = qoc0Var.b;
        if (i4 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            wsc0 wsc0Var = (wsc0) obj;
            roc0 roc0Var = (roc0) this.c;
            int i5 = wsc0Var.a;
            int iOrdinal = roc0Var.m.a.d.ordinal();
            if (iOrdinal == 0) {
                i = i5;
            } else if (iOrdinal == 1) {
                i2 = 50;
                if (i5 > 50) {
                    i = i2;
                } else {
                    i = i5;
                }
            } else {
                if (iOrdinal != 2) {
                    eg.o();
                    return null;
                }
                i2 = 500;
                if (i5 > 500) {
                    i = i2;
                } else {
                    i = i5;
                }
            }
            kby kbyVar = wsc0Var.f;
            long j = wsc0Var.g;
            boolean z = i == 0;
            long j2 = wsc0Var.k;
            Integer num = wsc0Var.h;
            cxc0 cxc0Var = new cxc0(j, i, num != null ? num.intValue() : 0, j2, wsc0Var.m, kbyVar, wsc0Var.b, wsc0Var.c, z, wsc0Var.j);
            qoc0Var.b = 1;
            Object objEmit = vr20Var.emit(cxc0Var, qoc0Var);
            d9n d9nVar = d9n.a;
            if (objEmit == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i4 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0074 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object c(Object obj, lnm lnmVar) {
        dwc0 dwc0Var;
        Object objEmit;
        d9n d9nVar;
        if (lnmVar instanceof dwc0) {
            dwc0Var = (dwc0) lnmVar;
            int i = dwc0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                dwc0Var.b = i - Integer.MIN_VALUE;
            } else {
                dwc0Var = new dwc0(this, lnmVar);
            }
        } else {
            dwc0Var = new dwc0(this, lnmVar);
        }
        Object obj2 = dwc0Var.a;
        int i2 = dwc0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            Map map = (Map) obj;
            List list = ((wsc0) this.c).e;
            if ((list instanceof Collection) && list.isEmpty()) {
                dwc0Var.b = 1;
                objEmit = vr20Var.emit(obj, dwc0Var);
                d9nVar = d9n.a;
                if (objEmit == d9nVar) {
                    return d9nVar;
                }
            } else {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!map.containsKey(new iey0(((zuc0) it.next()).c))) {
                    }
                }
                dwc0Var.b = 1;
                objEmit = vr20Var.emit(obj, dwc0Var);
                d9nVar = d9n.a;
                if (objEmit == d9nVar) {
                    return d9nVar;
                }
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object e(Object obj, lnm lnmVar) {
        r0d0 r0d0Var;
        String str;
        if (lnmVar instanceof r0d0) {
            r0d0Var = (r0d0) lnmVar;
            int i = r0d0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                r0d0Var.b = i - Integer.MIN_VALUE;
            } else {
                r0d0Var = new r0d0(this, lnmVar);
            }
        } else {
            r0d0Var = new r0d0(this, lnmVar);
        }
        Object obj2 = r0d0Var.a;
        int i2 = r0d0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            PlayerState playerState = (PlayerState) obj;
            loa0 loa0Var = (qoa0) this.c;
            boolean z = loa0Var instanceof moa0;
            cob1 cob1Var = cob1.a;
            if (z) {
                String str2 = ((moa0) loa0Var).a;
                boolean z2 = false;
                boolean z3 = playerState.isPlaying() && !playerState.isPaused();
                boolean zC = playerState.track().c();
                if (rjo1.r(playerState, new bmm(str2)) || ((str = (String) playerState.track().i(bx8.l).h()) != null && str.equals(str2))) {
                    z2 = true;
                }
                if (z2 && z3 && zC) {
                    cob1Var = cob1.c;
                } else if (z2 && zC) {
                    cob1Var = cob1.b;
                }
            } else if (loa0Var instanceof loa0) {
                cob1Var = rjo1.p(playerState, new bmm(loa0Var.a)).a;
            } else {
                if (!(loa0Var instanceof noa0)) {
                    eg.o();
                    return null;
                }
                noa0 noa0Var = (noa0) loa0Var;
                p0d0 p0d0VarP = rjo1.p(playerState, new bmm(noa0Var.a));
                cob1 cob1Var2 = p0d0VarP.a;
                n0d0 n0d0Var = p0d0VarP.c;
                if (!(n0d0Var instanceof m0d0)) {
                    if (n0d0Var instanceof n0d0) {
                        if (n0d0Var.a.equals(noa0Var.b)) {
                            cob1Var = cob1Var2;
                        }
                    } else {
                        if (!(n0d0Var instanceof l0d0)) {
                            eg.o();
                            return null;
                        }
                        if (u890.j(((l0d0) n0d0Var).a, noa0Var.c)) {
                            cob1Var = cob1Var2;
                        }
                    }
                }
            }
            r0d0Var.b = 1;
            Object objEmit = vr20Var.emit(cob1Var, r0d0Var);
            d9n d9nVar = d9n.a;
            if (objEmit == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    private final Object f(Object obj, lnm lnmVar) {
        k1d0 k1d0Var;
        rnc0 rnc0Var = (rnc0) this.c;
        if (lnmVar instanceof k1d0) {
            k1d0Var = (k1d0) lnmVar;
            int i = k1d0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                k1d0Var.b = i - Integer.MIN_VALUE;
            } else {
                k1d0Var = new k1d0(this, lnmVar);
            }
        } else {
            k1d0Var = new k1d0(this, lnmVar);
        }
        Object obj2 = k1d0Var.a;
        int i2 = k1d0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            tr80 tr80Var = (tr80) obj;
            int i3 = rnc0Var.a;
            ArrayList arrayList = new ArrayList(q7h.U(tr80Var, 10));
            lr80 it = tr80Var.iterator();
            while (((sr80) it).c) {
                arrayList.add((h8k1) rnc0Var.b.get(it.nextInt()));
            }
            qnc0 qnc0Var = new qnc0(i3, arrayList);
            k1d0Var.b = 1;
            Object objEmit = vr20Var.emit(qnc0Var, k1d0Var);
            d9n d9nVar = d9n.a;
            if (objEmit == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object g(Object obj, lnm lnmVar) {
        b4d0 b4d0Var;
        if (lnmVar instanceof b4d0) {
            b4d0Var = (b4d0) lnmVar;
            int i = b4d0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                b4d0Var.b = i - Integer.MIN_VALUE;
            } else {
                b4d0Var = new b4d0(this, lnmVar);
            }
        } else {
            b4d0Var = new b4d0(this, lnmVar);
        }
        Object obj2 = b4d0Var.a;
        int i2 = b4d0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            mmr0 mmr0Var = new mmr0((g4d0) this.c, (g3d0) obj);
            b4d0Var.b = 1;
            Object objEmit = vr20Var.emit(mmr0Var, b4d0Var);
            d9n d9nVar = d9n.a;
            if (objEmit == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0206  */
    /* JADX WARN: Code duplicated, block: B:138:0x0269  */
    /* JADX WARN: Code duplicated, block: B:154:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:156:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:158:0x02da  */
    /* JADX WARN: Code duplicated, block: B:161:0x02ed A[LOOP:3: B:159:0x02e7->B:161:0x02ed, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:173:0x0324  */
    /* JADX WARN: Code duplicated, block: B:22:0x007b  */
    /* JADX WARN: Code duplicated, block: B:259:0x0492  */
    /* JADX WARN: Code duplicated, block: B:25:0x0084  */
    /* JADX WARN: Code duplicated, block: B:283:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:28:0x008e  */
    /* JADX WARN: Code duplicated, block: B:309:0x057b  */
    /* JADX WARN: Code duplicated, block: B:331:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:353:0x0641  */
    /* JADX WARN: Code duplicated, block: B:369:0x068d  */
    /* JADX WARN: Code duplicated, block: B:393:0x0708  */
    /* JADX WARN: Code duplicated, block: B:423:0x077b  */
    /* JADX WARN: Code duplicated, block: B:438:0x07c8  */
    /* JADX WARN: Code duplicated, block: B:451:0x07ee  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:483:0x0864  */
    /* JADX WARN: Code duplicated, block: B:501:0x08bb  */
    /* JADX WARN: Code duplicated, block: B:535:0x095e  */
    /* JADX WARN: Code duplicated, block: B:554:0x09af  */
    /* JADX WARN: Code duplicated, block: B:574:0x0a08  */
    /* JADX WARN: Code duplicated, block: B:600:0x0a6c  */
    /* JADX WARN: Code duplicated, block: B:614:0x00de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:615:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:616:? A[LOOP:0: B:26:0x0088->B:616:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x011e  */
    /* JADX WARN: Code duplicated, block: B:9:0x002a  */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x03b9, code lost:
    
        if (r2.emit(r0, r3) == r8) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0561, code lost:
    
        if (r0.emit(r3, r4) == r8) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f2, code lost:
    
        if (r2.emit(r1, r4) == r8) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r25, p.lnm r26) {
        /*
            Method dump skipped, instruction units count: 2812
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.om70.emit(java.lang.Object, p.lnm):java.lang.Object");
    }
}
