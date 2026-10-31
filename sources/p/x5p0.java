package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class x5p0 {
    public static final long g;
    public static final /* synthetic */ int h = 0;
    public final yb7 a;
    public final rxj0 b;
    public final mr20 c;
    public final xrc0 d;
    public final mnk0 e;
    public final sjj0 f;

    static {
        ytw0 ytw0Var = jfv.b;
        g = fdg1.k0(2, ngv.e);
    }

    public x5p0(yb7 yb7Var, rxj0 rxj0Var, mr20 mr20Var, xrc0 xrc0Var, mnk0 mnk0Var, z6k0 z6k0Var, sjj0 sjj0Var) {
        this.a = yb7Var;
        this.b = rxj0Var;
        this.c = mr20Var;
        this.d = xrc0Var;
        this.e = mnk0Var;
        this.f = sjj0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum a(onm onmVar) {
        n5p0 n5p0Var;
        if (onmVar instanceof n5p0) {
            n5p0Var = (n5p0) onmVar;
            int i = n5p0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                n5p0Var.c = i - Integer.MIN_VALUE;
            } else {
                n5p0Var = new n5p0(this, onmVar);
            }
        } else {
            n5p0Var = new n5p0(this, onmVar);
        }
        Object objD = n5p0Var.a;
        int i2 = n5p0Var.c;
        m5p0 m5p0Var = m5p0.b;
        if (i2 == 0) {
            hm5.M(objD);
            if (this.b.a0) {
                yb7 yb7Var = this.a;
                if (yb7Var.d == qb7.a) {
                    String str = yb7Var.c;
                    Set set = s4b1.f;
                    if (uic.k(str, new b3i1[]{nyu0.e, wyu0.f})) {
                        iu30 oxa0Var = new oxa0(this, (lnm) null, (byte) 21);
                        n5p0Var.c = 1;
                        objD = d(null, oxa0Var, n5p0Var);
                        d9n d9nVar = d9n.a;
                        if (objD == d9nVar) {
                            return d9nVar;
                        }
                    }
                }
            }
            return m5p0Var;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objD);
        Boolean bool = (Boolean) objD;
        if (bool == null) {
            return m5p0.c;
        }
        if (bool.equals(Boolean.FALSE)) {
            return m5p0Var;
        }
        if (bool.equals(Boolean.TRUE)) {
            return m5p0.a;
        }
        eg.o();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(hfu0 hfu0Var, onm onmVar) {
        p5p0 p5p0Var;
        if (onmVar instanceof p5p0) {
            p5p0Var = (p5p0) onmVar;
            int i = p5p0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                p5p0Var.d = i - Integer.MIN_VALUE;
            } else {
                p5p0Var = new p5p0(this, onmVar);
            }
        } else {
            p5p0Var = new p5p0(this, onmVar);
        }
        Object objP = p5p0Var.b;
        int i2 = p5p0Var.d;
        yh90 yh90Var = null;
        try {
            if (i2 == 0) {
                hm5.M(objP);
                long j = g;
                q5p0 q5p0Var = new q5p0(this, hfu0Var, null, (byte) 0);
                p5p0Var.a = hfu0Var;
                p5p0Var.d = 1;
                objP = rc2.P(j, q5p0Var, p5p0Var);
                d9n d9nVar = d9n.a;
                if (objP == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hfu0Var = p5p0Var.a;
                hm5.M(objP);
            }
            yh90Var = (yh90) objP;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.e(e2, "Assisted Curation: Failed to decorate the playing reference", new Object[0]);
        }
        if (yh90Var == null) {
            return hfu0Var;
        }
        String str = yh90Var.b;
        if (str.length() == 0) {
            str = hfu0Var.b;
        }
        String str2 = str;
        String strY0 = o7h.y0(yh90Var.X, ", ", (String) null, (String) null, pzo0.i, 30);
        if (strY0.length() == 0) {
            strY0 = hfu0Var.c;
        }
        String str3 = strY0;
        String str4 = yh90Var.c;
        if (str4.length() == 0) {
            str4 = hfu0Var.d;
        }
        return new hfu0(hfu0Var.a, str2, str3, str4, hfu0Var.e);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        if (r7 == r5) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(p.onm r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof p.r5p0
            if (r0 == 0) goto L13
            r0 = r7
            p.r5p0 r0 = (p.r5p0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.r5p0 r0 = new p.r5p0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            int r1 = r0.c
            r2 = 0
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L35
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            p.hm5.M(r7)
            goto L66
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r2
        L31:
            p.hm5.M(r7)
            goto L45
        L35:
            p.hm5.M(r7)
            p.mnk0 r7 = r6.e
            p.mr20 r7 = r7.a
            r0.c = r4
            java.lang.Object r7 = p.b5p1.i(r7, r0)
            if (r7 != r5) goto L45
            goto L65
        L45:
            p.ibk0 r7 = (p.ibk0) r7
            boolean r7 = r7.b()
            if (r7 != 0) goto L50
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L50:
            p.rxc0 r7 = new p.rxc0
            p.yb7 r1 = r6.a
            java.lang.String r1 = r1.c
            r7.<init>(r1)
            r0.c = r3
            p.xrc0 r6 = r6.d
            p.rsc0 r6 = (p.rsc0) r6
            java.lang.Object r7 = r6.j(r7, r0)
            if (r7 != r5) goto L66
        L65:
            return r5
        L66:
            p.py21 r7 = (p.py21) r7
            java.lang.Object r6 = r7.c()
            p.qxc0 r6 = (p.qxc0) r6
            if (r6 == 0) goto L7d
            java.util.Map r6 = r6.X
            if (r6 == 0) goto L7d
            boolean r6 = p.z6k0.b(r6)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L7d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p.x5p0.c(p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(Object obj, iu30 iu30Var, onm onmVar) {
        s5p0 s5p0Var;
        if (onmVar instanceof s5p0) {
            s5p0Var = (s5p0) onmVar;
            int i = s5p0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                s5p0Var.d = i - Integer.MIN_VALUE;
            } else {
                s5p0Var = new s5p0(this, onmVar);
            }
        } else {
            s5p0Var = new s5p0(this, onmVar);
        }
        Object obj2 = s5p0Var.b;
        int i2 = s5p0Var.d;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Object obj3 = s5p0Var.a;
                hm5.M(obj2);
                return obj2;
            }
            hm5.M(obj2);
            s5p0Var.a = obj;
            s5p0Var.d = 1;
            Object objInvoke = iu30Var.invoke(s5p0Var);
            d9n d9nVar = d9n.a;
            return objInvoke == d9nVar ? d9nVar : objInvoke;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.e(e2, "Assisted Curation: Failed to capture the playing reference", new Object[0]);
            return obj;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        if (r8 == r5) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(p.hfu0 r7, p.onm r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p.t5p0
            if (r0 == 0) goto L13
            r0 = r8
            p.t5p0 r0 = (p.t5p0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.t5p0 r0 = new p.t5p0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            int r1 = r0.c
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r8)
            goto L5d
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L31:
            p.hm5.M(r8)
            goto L4a
        L35:
            p.hm5.M(r8)
            p.fpo r8 = new p.fpo
            r1 = 26
            r8.<init>(r7, r6, r4, r1)
            r0.c = r3
            p.j5p0 r7 = p.j5p0.a
            java.lang.Object r8 = r6.d(r7, r8, r0)
            if (r8 != r5) goto L4a
            goto L5c
        L4a:
            p.l5p0 r8 = (p.l5p0) r8
            boolean r7 = r8 instanceof p.i5p0
            if (r7 == 0) goto L65
            p.i5p0 r8 = (p.i5p0) r8
            p.hfu0 r7 = r8.a
            r0.c = r2
            java.lang.Object r8 = r6.b(r7, r0)
            if (r8 != r5) goto L5d
        L5c:
            return r5
        L5d:
            p.hfu0 r8 = (p.hfu0) r8
            p.i5p0 r6 = new p.i5p0
            r6.<init>(r8)
            return r6
        L65:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.x5p0.e(p.hfu0, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(String str, String str2, onm onmVar) {
        u5p0 u5p0Var;
        if (onmVar instanceof u5p0) {
            u5p0Var = (u5p0) onmVar;
            int i = u5p0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                u5p0Var.e = i - Integer.MIN_VALUE;
            } else {
                u5p0Var = new u5p0(this, onmVar);
            }
        } else {
            u5p0Var = new u5p0(this, onmVar);
        }
        Object objI = u5p0Var.c;
        int i2 = u5p0Var.e;
        boolean z = false;
        if (i2 == 0) {
            hm5.M(objI);
            qvc0 qvc0Var = new qvc0(this.a.c, (c3d0) null, Collections.singleton(new hrc0(str)), new iqz0(0, 1), 2);
            u5p0Var.a = str;
            u5p0Var.b = str2;
            u5p0Var.e = 1;
            objI = this.d.i(qvc0Var, u5p0Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = u5p0Var.b;
            str = u5p0Var.a;
            hm5.M(objI);
        }
        List list = (List) ((py21) objI).c();
        if (list == null) {
            return null;
        }
        List<pvc0> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (pvc0 pvc0Var : list2) {
                if (u890.j(pvc0Var.a, str) && u890.j(pvc0Var.c, str2)) {
                    z = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(long j, onm onmVar) {
        w5p0 w5p0Var;
        ContextTrack contextTrack;
        if (onmVar instanceof w5p0) {
            w5p0Var = (w5p0) onmVar;
            int i = w5p0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                w5p0Var.d = i - Integer.MIN_VALUE;
            } else {
                w5p0Var = new w5p0(this, onmVar);
            }
        } else {
            w5p0Var = new w5p0(this, onmVar);
        }
        Object objP = w5p0Var.b;
        int i2 = w5p0Var.d;
        if (i2 == 0) {
            hm5.M(objP);
            o5p0 o5p0Var = new o5p0(this, null, (byte) 1);
            w5p0Var.a = j;
            w5p0Var.d = 1;
            objP = rc2.P(g, o5p0Var, w5p0Var);
            d9n d9nVar = d9n.a;
            if (objP == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = w5p0Var.a;
            hm5.M(objP);
        }
        PlayerState playerState = (PlayerState) objP;
        if (playerState == null) {
            return j5p0.a;
        }
        if (playerState.timestamp() <= j && loo1.x(playerState, this.a.c) && (contextTrack = (ContextTrack) playerState.track().h()) != null) {
            String strUid = contextTrack.uid();
            strUid.getClass();
            String str = strUid.length() > 0 ? strUid : null;
            if (str != null) {
                Set set = s4b1.f;
                if (uic.g(contextTrack.uri(), blc0.ti)) {
                    String strUri = contextTrack.uri();
                    String str2 = (String) contextTrack.metadata().get("title");
                    String str3 = str2 == null ? "" : str2;
                    String str4 = (String) contextTrack.metadata().get("artist_name");
                    String str5 = str4 == null ? "" : str4;
                    String str6 = (String) contextTrack.metadata().get("image_url");
                    return new i5p0(new hfu0(strUri, str3, str5, str6 == null ? "" : str6, str));
                }
            }
        }
        return k5p0.a;
    }
}
