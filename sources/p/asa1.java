package p;

import com.spotify.automix.esperanto.proto.EsAutomix;
import com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class asa1 {
    public static final PlaylistRequestDecorationPolicy n;
    public final xrc0 a;
    public final m021 b;
    public final esa1 c;
    public final pmw0 d;
    public final los e;
    public final sro f;
    public final jig1 g;
    public final jn7 h;
    public final oqa1 i;
    public final rss j;
    public final w8n k;
    public final yh2 l;
    public final q8n m;

    static {
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        iou0 iou0VarV = PlaylistItemDecorationPolicy.v();
        iou0VarV.v();
        hru0VarS.u(iou0VarV.build());
        vwu0 vwu0VarR = PlaylistTrackDecorationPolicy.r();
        vwu0VarR.C(TrackDecorationPolicy.newBuilder().setLink(true).setPlayable(true));
        hru0VarS.y(vwu0VarR.build());
        n = hru0VarS.build();
    }

    public asa1(xrc0 xrc0Var, m021 m021Var, esa1 esa1Var, pmw0 pmw0Var, los losVar, sro sroVar, jig1 jig1Var, kkg1 kkg1Var, jn7 jn7Var, oqa1 oqa1Var, rss rssVar, w8n w8nVar, yh2 yh2Var, q8n q8nVar) {
        this.a = xrc0Var;
        this.b = m021Var;
        this.c = esa1Var;
        this.d = pmw0Var;
        this.e = losVar;
        this.f = sroVar;
        this.g = jig1Var;
        this.h = jn7Var;
        this.i = oqa1Var;
        this.j = rssVar;
        this.k = w8nVar;
        this.l = yh2Var;
        this.m = q8nVar;
    }

    public static qjg1 f(asa1 asa1Var, tro troVar, Float f, Float f2, int i) {
        if ((i & 2) != 0) {
            f = null;
        }
        if ((i & 4) != 0) {
            f2 = null;
        }
        if (troVar == null) {
            return ljg1.a;
        }
        return !troVar.e ? asa1Var.g(troVar, f, f2) : new njg1(troVar.b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(tro troVar, Float f, Float f2, onm onmVar) {
        fra1 fra1Var;
        if (onmVar instanceof fra1) {
            fra1Var = (fra1) onmVar;
            int i = fra1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                fra1Var.d = i - Integer.MIN_VALUE;
            } else {
                fra1Var = new fra1(this, onmVar);
            }
        } else {
            fra1Var = new fra1(this, onmVar);
        }
        Object objB = fra1Var.b;
        int i2 = fra1Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objB);
                if (troVar == null) {
                    return ljg1.a;
                }
                if (!troVar.e) {
                    return g(troVar, f, f2);
                }
                dlz dlzVarN = EsAutomix.AdjustTransitionRecipeForItemSpeedsRequest.n();
                dlzVarN.r(troVar.d);
                if (f != null) {
                    dlzVarN.n(f.floatValue());
                }
                if (f2 != null) {
                    dlzVarN.q(f2.floatValue());
                }
                EsAutomix.AdjustTransitionRecipeForItemSpeedsRequest adjustTransitionRecipeForItemSpeedsRequestBuild = dlzVarN.build();
                jn7 jn7Var = this.h;
                adjustTransitionRecipeForItemSpeedsRequestBuild.getClass();
                fra1Var.a = troVar;
                fra1Var.d = 1;
                objB = jn7Var.b(adjustTransitionRecipeForItemSpeedsRequestBuild, fra1Var);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                troVar = fra1Var.a;
                hm5.M(objB);
            }
            String strN = ((EsAutomix.AdjustTransitionRecipeForItemSpeedsResponse) objB).n();
            strN.getClass();
            return strN.length() == 0 ? new pjg1(troVar.b) : new mjg1(troVar.b, strN, troVar.d);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return new pjg1(troVar.b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:59:0x0173  */
    /* JADX WARN: Code duplicated, block: B:60:0x0176  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v9, types: [boolean, int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x015d -> B:54:0x0164). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x016b -> B:58:0x0171). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(p.vr20 r19, p.rqa1 r20, p.onm r21) {
        /*
            Method dump skipped, instruction units count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.asa1.b(p.vr20, p.rqa1, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ee, code lost:
    
        if (r11.emit(r10, r0) == r7) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(p.vr20 r11, p.tqa1 r12, p.onm r13) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.asa1.c(p.vr20, p.tqa1, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
    
        if (r7.emit(r8, r0) == r5) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(p.vr20 r7, p.uqa1 r8, p.onm r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p.ira1
            if (r0 == 0) goto L13
            r0 = r9
            p.ira1 r0 = (p.ira1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.ira1 r0 = new p.ira1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r9)
            goto L6e
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L31:
            p.vr20 r7 = r0.a
            p.hm5.M(r9)
            goto L4d
        L37:
            p.hm5.M(r9)
            java.lang.String r9 = r8.a
            java.lang.String r1 = r8.b
            java.lang.String r8 = r8.c
            r0.a = r7
            r0.d = r3
            p.pmw0 r6 = r6.d
            java.lang.Object r9 = r6.a(r9, r1, r8, r0)
            if (r9 != r5) goto L4d
            goto L6d
        L4d:
            p.qmw0 r9 = (p.qmw0) r9
            if (r9 == 0) goto L5d
            p.nmw0 r6 = new p.nmw0
            java.lang.String r8 = r9.a
            java.lang.String r1 = r9.b
            java.lang.Float r9 = r9.c
            r6.<init>(r8, r1, r9)
            goto L5e
        L5d:
            r6 = r4
        L5e:
            p.rsa1 r8 = new p.rsa1
            r8.<init>(r6)
            r0.a = r4
            r0.d = r2
            java.lang.Object r6 = r7.emit(r8, r0)
            if (r6 != r5) goto L6e
        L6d:
            return r5
        L6e:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.asa1.d(p.vr20, p.uqa1, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0098 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x0099 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(vr20 vr20Var, vqa1 vqa1Var, onm onmVar) {
        jra1 jra1Var;
        if (onmVar instanceof jra1) {
            jra1Var = (jra1) onmVar;
            int i = jra1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                jra1Var.d = i - Integer.MIN_VALUE;
            } else {
                jra1Var = new jra1(this, onmVar);
            }
        } else {
            jra1Var = new jra1(this, onmVar);
        }
        Object objH = jra1Var.b;
        int i2 = jra1Var.d;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objH);
            String str = vqa1Var.a;
            String str2 = vqa1Var.b;
            jra1Var.a = vr20Var;
            jra1Var.d = 1;
            objH = this.a.h(str, str2, n, jra1Var);
            if (objH != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objH);
                return rih1Var;
            }
            if (i2 == 3) {
                hm5.M(objH);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        vr20Var = jra1Var.a;
        hm5.M(objH);
        oy21 oy21Var = (py21) objH;
        if (!(oy21Var instanceof oy21)) {
            jra1Var.a = null;
            jra1Var.d = 3;
            if (vr20Var.emit(nsa1.a, jra1Var) == d9nVar) {
                return d9nVar;
            }
            return rih1Var;
        }
        zuc0 zuc0Var = (zuc0) oy21Var.a;
        String str3 = (String) zuc0Var.g.get("item.speed");
        wsa1 wsa1Var = new wsa1(zuc0Var.c, str3 != null ? nhc1.b0(str3) : null, zuc0Var.b());
        jra1Var.a = null;
        jra1Var.d = 2;
        if (vr20Var.emit(wsa1Var, jra1Var) == d9nVar) {
            return d9nVar;
        }
        return rih1Var;
    }

    public final qjg1 g(tro troVar, Float f, Float f2) {
        lhg1 lhg1VarA = kkg1.a(troVar.d);
        if (lhg1VarA == null) {
            return ljg1.a;
        }
        ruq0 ruq0Var = lhg1VarA.b;
        return new ojg1(troVar.b, kkg1.c(lhg1.a(lhg1VarA, (q6w0) null, ruq0.a(ruq0Var, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, (Float) null, (Float) null, (Integer) null, false, 0.0f, 0.0f, f != null ? f.floatValue() : ruq0Var.R0, f2 != null ? f2.floatValue() : lhg1VarA.b.S0, 131071), false, false, 13)), troVar.d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(wqa1 wqa1Var, onm onmVar) {
        kra1 kra1Var;
        if (onmVar instanceof kra1) {
            kra1Var = (kra1) onmVar;
            int i = kra1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kra1Var.c = i - Integer.MIN_VALUE;
            } else {
                kra1Var = new kra1(this, onmVar);
            }
        } else {
            kra1Var = new kra1(this, onmVar);
        }
        Object obj = kra1Var.a;
        int i2 = kra1Var.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                esa1 esa1Var = this.c;
                String str = wqa1Var.a;
                double d = wqa1Var.b;
                kra1Var.c = 1;
                Object objX = esa1Var.x(str, d, kra1Var);
                d9n d9nVar = d9n.a;
                if (objX == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0075 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x0076 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(vr20 vr20Var, xqa1 xqa1Var, onm onmVar) {
        yra1 yra1Var;
        Object objE;
        if (onmVar instanceof yra1) {
            yra1Var = (yra1) onmVar;
            int i = yra1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                yra1Var.d = i - Integer.MIN_VALUE;
            } else {
                yra1Var = new yra1(this, onmVar);
            }
        } else {
            yra1Var = new yra1(this, onmVar);
        }
        Object obj = yra1Var.b;
        int i2 = yra1Var.d;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            String str = xqa1Var.a;
            String str2 = xqa1Var.b;
            yra1Var.a = vr20Var;
            yra1Var.d = 1;
            objE = this.b.e(str, str2, yra1Var);
            if (objE != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(obj);
                return rih1Var;
            }
            if (i2 == 3) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        vr20Var = yra1Var.a;
        hm5.M(obj);
        objE = ((e331) obj).a;
        if (objE instanceof m231) {
            yra1Var.a = null;
            yra1Var.d = 3;
            if (vr20Var.emit(tsa1.a, yra1Var) == d9nVar) {
                return d9nVar;
            }
            return rih1Var;
        }
        yra1Var.a = null;
        yra1Var.d = 2;
        if (vr20Var.emit(usa1.a, yra1Var) == d9nVar) {
            return d9nVar;
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0077 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x0078 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(vr20 vr20Var, yqa1 yqa1Var, onm onmVar) {
        zra1 zra1Var;
        Object objJ;
        if (onmVar instanceof zra1) {
            zra1Var = (zra1) onmVar;
            int i = zra1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                zra1Var.d = i - Integer.MIN_VALUE;
            } else {
                zra1Var = new zra1(this, onmVar);
            }
        } else {
            zra1Var = new zra1(this, onmVar);
        }
        Object obj = zra1Var.b;
        int i2 = zra1Var.d;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            String str = yqa1Var.a;
            String str2 = yqa1Var.b;
            float f = yqa1Var.c;
            zra1Var.a = vr20Var;
            zra1Var.d = 1;
            objJ = this.b.j(str, str2, f, zra1Var);
            if (objJ != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(obj);
                return rih1Var;
            }
            if (i2 == 3) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        vr20Var = zra1Var.a;
        hm5.M(obj);
        objJ = ((e331) obj).a;
        if (objJ instanceof m231) {
            zra1Var.a = null;
            zra1Var.d = 3;
            if (vr20Var.emit(tsa1.a, zra1Var) == d9nVar) {
                return d9nVar;
            }
            return rih1Var;
        }
        zra1Var.a = null;
        zra1Var.d = 2;
        if (vr20Var.emit(usa1.a, zra1Var) == d9nVar) {
            return d9nVar;
        }
        return rih1Var;
    }
}
