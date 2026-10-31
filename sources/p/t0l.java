package p;

import android.content.Context;
import com.spotify.adsinternal.adscore.model.Format;
import com.spotify.concertpageview.v1.Row;
import com.spotify.connect.esperanto.proto.ConnectMessages;
import com.spotify.connect.esperanto.proto.ConnectMessages$GroupDevice;
import com.spotify.connect.esperanto.proto.ConnectMessages$GroupDeviceIdentifiers;
import com.spotify.connect.esperanto.proto.ConnectMessages$GroupDeviceVolume;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import com.spotify.offline_esperanto.proto.EsOffline;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class t0l implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t0l(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x013b, code lost:
    
        if (r2.emit(r1, r3) == r9) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object b(java.lang.Object r24, p.lnm r25) {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.t0l.b(java.lang.Object, p.lnm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object c(Object obj, lnm lnmVar) {
        ger gerVar;
        if (lnmVar instanceof ger) {
            gerVar = (ger) lnmVar;
            int i = gerVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                gerVar.b = i - Integer.MIN_VALUE;
            } else {
                gerVar = new ger(this, lnmVar);
            }
        } else {
            gerVar = new ger(this, lnmVar);
        }
        Object obj2 = gerVar.a;
        int i2 = gerVar.b;
        Object obj3 = null;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            l0l l0lVar = (l0l) ((spq0) obj).h();
            if (l0lVar == null) {
                for (Object obj4 : ((g0l) ((her) this.c).b).i()) {
                    if (((l0l) obj4).l()) {
                        obj3 = obj4;
                        break;
                    }
                }
                l0lVar = (l0l) obj3;
            }
            gerVar.b = 1;
            Object objEmit = vr20Var.emit(l0lVar, gerVar);
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

    /* JADX WARN: Code duplicated, block: B:66:0x00da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:81:0x0115  */
    /* JADX WARN: Code duplicated, block: B:83:0x0119  */
    /* JADX WARN: Code duplicated, block: B:85:0x011e  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0129  */
    private final Object e(Object obj, lnm lnmVar) {
        ner nerVar;
        crc1 crc1Var;
        Object arc1Var;
        kx7 kx7Var;
        nnr nnrVar;
        kx7 kx7Var2;
        up7 up7Var;
        rer rerVar = (rer) this.c;
        Context context = rerVar.d;
        if (lnmVar instanceof ner) {
            nerVar = (ner) lnmVar;
            int i = nerVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                nerVar.b = i - Integer.MIN_VALUE;
            } else {
                nerVar = new ner(this, lnmVar);
            }
        } else {
            nerVar = new ner(this, lnmVar);
        }
        ner nerVar2 = nerVar;
        Object obj2 = nerVar2.a;
        int i2 = nerVar2.b;
        nnr nnrVarSingletonList = null;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            nnr nnrVar2 = (l0l) ((spq0) obj).h();
            if (nnrVar2 != null) {
                rtt rttVarP = hqq0.P(nnrVar2);
                String strN = j9k1.n(context, rttVarP != null ? rttVarP.a : nnrVar2.getName(), rttVarP != null ? rttVarP.c : nnrVar2.getType(), nnrVar2.l(), nnrVar2.v(), rttVarP != null ? rttVarP.a : null, rttVarP != null ? rttVarP.b : null, rttVarP != null ? rttVarP.c : null);
                String strD = nnrVar2.d();
                String strJ = nnrVar2.j();
                f0u type = nnrVar2.getType();
                boolean z = nnrVar2.z();
                boolean zA0 = hqq0.a0(nnrVar2);
                luq0 luq0Var = luq0.c;
                if (zA0 || hqq0.b0(nnrVar2)) {
                    crc1Var = new crc1(context.getString(a6o1.u(hqq0.l0(rerVar.b.a.a))), 2, null);
                    arc1Var = crc1Var;
                    if (!hqq0.X(nnrVar2)) {
                        nnrVarSingletonList = nnrVar2 instanceof nnr ? nnrVar2 : null;
                        if (nnrVarSingletonList != null || (kx7Var = nnrVarSingletonList.B.a) == null || kx7Var.d != luq0Var) {
                            arc1Var = crc1Var;
                            arc1Var = new arc1(new yqc1(wkx.c, rer.b(1)), crc1Var);
                        }
                    }
                    arc1Var = crc1Var;
                    nnrVarSingletonList = Collections.singletonList(arc1Var);
                } else {
                    boolean z2 = nnrVar2 instanceof nnr;
                    nnr nnrVar3 = z2 ? nnrVar2 : null;
                    kx7 kx7Var3 = nnrVar3 != null ? nnrVar3.B.a : null;
                    if (((kx7Var3 == null || (up7Var = kx7Var3.e) == null) ? 0 : up7Var.a) != 2) {
                        nnr nnrVar4 = z2 ? nnrVar2 : null;
                        kx7 kx7Var4 = nnrVar4 != null ? nnrVar4.B.a : null;
                        if (kx7Var4 == null) {
                            if (z2) {
                                nnrVar = nnrVar2;
                            } else {
                                nnrVar = null;
                            }
                            if ((nnrVar == null && (kx7Var2 = nnrVar.B.a) != null && kx7Var2.d == luq0Var) || hqq0.X(nnrVar2)) {
                                crc1Var = new crc1(context.getString(a6o1.u(hqq0.l0(rerVar.b.a.a))), 2, null);
                                arc1Var = crc1Var;
                                if (!hqq0.X(nnrVar2)) {
                                    if (nnrVar2 instanceof nnr) {
                                    }
                                    if (nnrVarSingletonList != null) {
                                        arc1Var = crc1Var;
                                        arc1Var = new arc1(new yqc1(wkx.c, rer.b(1)), crc1Var);
                                    } else {
                                        arc1Var = crc1Var;
                                        arc1Var = new arc1(new yqc1(wkx.c, rer.b(1)), crc1Var);
                                    }
                                }
                                arc1Var = crc1Var;
                                nnrVarSingletonList = Collections.singletonList(arc1Var);
                            }
                        } else {
                            up7 up7Var2 = kx7Var4.e;
                            if ((up7Var2 != null ? up7Var2.a : 0) == 6) {
                                crc1Var = new crc1(context.getString(a6o1.u(hqq0.l0(rerVar.b.a.a))), 2, null);
                                arc1Var = crc1Var;
                                if (!hqq0.X(nnrVar2)) {
                                    if (nnrVar2 instanceof nnr) {
                                    }
                                    if (nnrVarSingletonList != null) {
                                        arc1Var = crc1Var;
                                        arc1Var = new arc1(new yqc1(wkx.c, rer.b(1)), crc1Var);
                                    } else {
                                        arc1Var = crc1Var;
                                        arc1Var = new arc1(new yqc1(wkx.c, rer.b(1)), crc1Var);
                                    }
                                }
                                arc1Var = crc1Var;
                                nnrVarSingletonList = Collections.singletonList(arc1Var);
                            } else {
                                if (z2) {
                                    nnrVar = nnrVar2;
                                } else {
                                    nnrVar = null;
                                }
                                if (nnrVar == null) {
                                    crc1Var = new crc1(context.getString(a6o1.u(hqq0.l0(rerVar.b.a.a))), 2, null);
                                    arc1Var = crc1Var;
                                    if (!hqq0.X(nnrVar2)) {
                                        if (nnrVar2 instanceof nnr) {
                                        }
                                        if (nnrVarSingletonList != null) {
                                            arc1Var = crc1Var;
                                            arc1Var = new arc1(new yqc1(wkx.c, rer.b(1)), crc1Var);
                                        } else {
                                            arc1Var = crc1Var;
                                            arc1Var = new arc1(new yqc1(wkx.c, rer.b(1)), crc1Var);
                                        }
                                    }
                                    arc1Var = crc1Var;
                                    nnrVarSingletonList = Collections.singletonList(arc1Var);
                                } else {
                                    crc1Var = new crc1(context.getString(a6o1.u(hqq0.l0(rerVar.b.a.a))), 2, null);
                                    arc1Var = crc1Var;
                                    if (!hqq0.X(nnrVar2)) {
                                        if (nnrVar2 instanceof nnr) {
                                        }
                                        if (nnrVarSingletonList != null) {
                                            arc1Var = crc1Var;
                                            arc1Var = new arc1(new yqc1(wkx.c, rer.b(1)), crc1Var);
                                        } else {
                                            arc1Var = crc1Var;
                                            arc1Var = new arc1(new yqc1(wkx.c, rer.b(1)), crc1Var);
                                        }
                                    }
                                    arc1Var = crc1Var;
                                    nnrVarSingletonList = Collections.singletonList(arc1Var);
                                }
                            }
                        }
                    } else {
                        crc1Var = new crc1(context.getString(a6o1.u(hqq0.l0(rerVar.b.a.a))), 2, null);
                        arc1Var = crc1Var;
                        if (!hqq0.X(nnrVar2)) {
                            if (nnrVar2 instanceof nnr) {
                            }
                            if (nnrVarSingletonList != null) {
                                arc1Var = crc1Var;
                                arc1Var = new arc1(new yqc1(wkx.c, rer.b(1)), crc1Var);
                            } else {
                                arc1Var = crc1Var;
                                arc1Var = new arc1(new yqc1(wkx.c, rer.b(1)), crc1Var);
                            }
                        }
                        arc1Var = crc1Var;
                        nnrVarSingletonList = Collections.singletonList(arc1Var);
                    }
                }
                nnrVarSingletonList = new ler(strN, strD, strJ, false, type, z, rttVarP, nnrVarSingletonList, nnrVar2.l());
            }
            nerVar2.b = 1;
            Object objEmit = vr20Var.emit(nnrVarSingletonList, nerVar2);
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
    private final Object f(Object obj, lnm lnmVar) {
        wfr wfrVar;
        if (lnmVar instanceof wfr) {
            wfrVar = (wfr) lnmVar;
            int i = wfrVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                wfrVar.b = i - Integer.MIN_VALUE;
            } else {
                wfrVar = new wfr(this, lnmVar);
            }
        } else {
            wfrVar = new wfr(this, lnmVar);
        }
        Object obj2 = wfrVar.a;
        int i2 = wfrVar.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            List list = (List) obj;
            list.getClass();
            yfr yfrVar = (yfr) this.c;
            l0l l0lVarB = y2o1.B(yfrVar.a, list, yfrVar.m, (String) null);
            if (l0lVarB != null) {
                wfrVar.b = 1;
                Object objEmit = vr20Var.emit(l0lVarB, wfrVar);
                d9n d9nVar = d9n.a;
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:82:0x015b  */
    private final Object g(Object obj, lnm lnmVar) {
        gir girVar;
        ArrayList arrayList;
        if (lnmVar instanceof gir) {
            girVar = (gir) lnmVar;
            int i = girVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                girVar.b = i - Integer.MIN_VALUE;
            } else {
                girVar = new gir(this, lnmVar);
            }
        } else {
            girVar = new gir(this, lnmVar);
        }
        Object obj2 = girVar.a;
        int i2 = girVar.b;
        Object obj3 = null;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            mmr0 mmr0Var = (mmr0) obj;
            l0l l0lVar = (l0l) mmr0Var.a;
            List list = (List) mmr0Var.b;
            hir hirVar = (hir) this.c;
            fuf0 fuf0Var = hirVar.b;
            if (hirVar.c.a()) {
                ArrayList<vuh0> arrayList2 = new ArrayList();
                for (Object obj4 : list) {
                    if (((vuh0) obj4).e) {
                        arrayList2.add(obj4);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj5 : arrayList2) {
                    if (((vuh0) obj5).d == 8) {
                        arrayList3.add(obj5);
                    }
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    r7h.W(((vuh0) it.next()).m, linkedHashSet);
                }
                if (!linkedHashSet.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj6 : arrayList2) {
                        vuh0 vuh0Var = (vuh0) obj6;
                        if (vuh0Var.d == 26) {
                            Set set = vuh0Var.m;
                            if (!(set instanceof Collection) || !set.isEmpty()) {
                                Iterator it2 = set.iterator();
                                do {
                                    if (it2.hasNext()) {
                                    }
                                } while (!linkedHashSet.contains((String) it2.next()));
                            }
                        }
                        arrayList4.add(obj6);
                    }
                    arrayList2 = arrayList4;
                }
                for (Object obj7 : arrayList2) {
                    if (jmo1.n((vuh0) obj7)) {
                        obj3 = obj7;
                        break;
                    }
                }
                String str = (vuh0) obj3;
                boolean z = (l0lVar == null || l0lVar.l()) ? false : true;
                arrayList2.size();
                arrayList2.toString();
                (str == null ? "null" : str).toString();
                if (!z && !arrayList2.isEmpty()) {
                    Iterator it3 = arrayList2.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            vuh0 vuh0Var2 = (vuh0) it3.next();
                            boolean zA = fuf0Var.a(vuh0Var2.a, vuh0Var2.b);
                            if (vuh0Var2.equals(str) || !zA) {
                            }
                        } else if (str != null) {
                            arrayList2 = o7h.J0(arrayList2, str);
                        }
                    }
                } else if (str != null) {
                    arrayList2 = o7h.J0(arrayList2, str);
                }
                arrayList = new ArrayList(q7h.U(arrayList2, 10));
                for (vuh0 vuh0Var3 : arrayList2) {
                    arrayList.add(new ikb(vuh0Var3, fuf0Var.a(vuh0Var3.a, vuh0Var3.b), z || vuh0Var3.equals(str)));
                }
            } else {
                arrayList = z6x.a;
            }
            arrayList.toString();
            girVar.b = 1;
            Object objEmit = vr20Var.emit(arrayList, girVar);
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
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
    
        if (r7.emit(r8, r0) == r5) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object h(java.lang.Object r7, p.lnm r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p.kir
            if (r0 == 0) goto L13
            r0 = r8
            p.kir r0 = (p.kir) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.kir r0 = new p.kir
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            int r1 = r0.b
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L39
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r8)
            goto L7b
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L31:
            int r6 = r0.d
            p.vr20 r7 = r0.c
            p.hm5.M(r8)
            goto L5b
        L39:
            p.hm5.M(r8)
            java.lang.Object r8 = r6.b
            p.vr20 r8 = (p.vr20) r8
            p.u0a0 r7 = (p.u0a0) r7
            java.lang.Object r6 = r6.c
            p.tjq r6 = (p.tjq) r6
            java.lang.Object r6 = r6.a
            p.my91 r6 = (p.my91) r6
            r0.c = r8
            r1 = 0
            r0.d = r1
            r0.b = r3
            java.lang.Object r6 = r6.b(r7, r0)
            if (r6 != r5) goto L58
            goto L7a
        L58:
            r7 = r8
            r8 = r6
            r6 = r1
        L5b:
            p.f1a0 r8 = (p.f1a0) r8
            boolean r1 = r8 instanceof p.d1a0
            if (r1 == 0) goto L64
            p.z6x r8 = p.z6x.a
            goto L6e
        L64:
            boolean r1 = r8 instanceof p.e1a0
            if (r1 == 0) goto L7e
            p.e1a0 r8 = (p.e1a0) r8
            java.lang.Object r8 = r8.a
            java.util.List r8 = (java.util.List) r8
        L6e:
            r0.c = r4
            r0.d = r6
            r0.b = r2
            java.lang.Object r6 = r7.emit(r8, r0)
            if (r6 != r5) goto L7b
        L7a:
            return r5
        L7b:
            p.rih1 r6 = p.rih1.a
            return r6
        L7e:
            p.eg.o()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p.t0l.h(java.lang.Object, p.lnm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object i(Object obj, lnm lnmVar) {
        ynr ynrVar;
        if (lnmVar instanceof ynr) {
            ynrVar = (ynr) lnmVar;
            int i = ynrVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ynrVar.b = i - Integer.MIN_VALUE;
            } else {
                ynrVar = new ynr(this, lnmVar);
            }
        } else {
            ynrVar = new ynr(this, lnmVar);
        }
        Object obj2 = ynrVar.a;
        int i2 = ynrVar.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            g3l g3lVar = new g3l((f3l) this.c, (c2l) obj);
            ynrVar.b = 1;
            Object objEmit = vr20Var.emit(g3lVar, ynrVar);
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
    private final Object j(Object obj, lnm lnmVar) {
        eor eorVar;
        if (lnmVar instanceof eor) {
            eorVar = (eor) lnmVar;
            int i = eorVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                eorVar.b = i - Integer.MIN_VALUE;
            } else {
                eorVar = new eor(this, lnmVar);
            }
        } else {
            eorVar = new eor(this, lnmVar);
        }
        Object obj2 = eorVar.a;
        int i2 = eorVar.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            u3l u3lVar = (u3l) this.c;
            v3l v3lVar = new v3l((z3l) obj, u3lVar.a, u3lVar.b);
            eorVar.b = 1;
            Object objEmit = vr20Var.emit(v3lVar, eorVar);
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
    private final Object k(Object obj, lnm lnmVar) {
        gor gorVar;
        Object w3lVar;
        if (lnmVar instanceof gor) {
            gorVar = (gor) lnmVar;
            int i = gorVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                gorVar.b = i - Integer.MIN_VALUE;
            } else {
                gorVar = new gor(this, lnmVar);
            }
        } else {
            gorVar = new gor(this, lnmVar);
        }
        Object obj2 = gorVar.a;
        int i2 = gorVar.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            m5l m5lVar = (m5l) obj;
            hor horVar = (hor) this.c;
            if (m5lVar instanceof l5l) {
                w3lVar = new y3l(d7p1.d("", ((l5l) m5lVar).a));
            } else if (m5lVar instanceof k5l) {
                w3lVar = new y3l(d7p1.d("", ((k5l) m5lVar).a));
            } else if (m5lVar instanceof j5l) {
                w3lVar = new x3l(m1p1.w(((j5l) m5lVar).a));
            } else {
                if (!(m5lVar instanceof f5l)) {
                    eg.o();
                    return null;
                }
                f5l f5lVar = (f5l) m5lVar;
                hry0 hry0Var = f5lVar.b;
                i5l i5lVar = f5lVar.a;
                if (i5lVar instanceof h5l) {
                    Context context = horVar.a;
                    l0l l0lVar = ((h5l) i5lVar).a;
                    w3lVar = new w3l(d7p1.d(j9k1.m(context, hqq0.V(l0lVar), hqq0.T(l0lVar), hqq0.c0(l0lVar), l0lVar.v(), 96), hry0Var), m1p1.w(l0lVar));
                } else {
                    if (!(i5lVar instanceof g5l)) {
                        eg.o();
                        return null;
                    }
                    kx7 kx7Var = ((g5l) i5lVar).a;
                    w3lVar = new w3l(d7p1.d(kx7Var.b, hry0Var), m1p1.v(kx7Var));
                }
            }
            gorVar.b = 1;
            Object objEmit = vr20Var.emit(w3lVar, gorVar);
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
    private final Object l(Object obj, lnm lnmVar) {
        gpr gprVar;
        if (lnmVar instanceof gpr) {
            gprVar = (gpr) lnmVar;
            int i = gprVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                gprVar.b = i - Integer.MIN_VALUE;
            } else {
                gprVar = new gpr(this, lnmVar);
            }
        } else {
            gprVar = new gpr(this, lnmVar);
        }
        Object obj2 = gprVar.a;
        int i2 = gprVar.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            sn50 sn50VarO = e130.o(((uyc) obj).b, ((lpr) this.c).c);
            if (sn50VarO != null) {
                iwh0 iwh0Var = sn50VarO.d;
                if (iwh0Var == null) {
                    eg.m("Required value was null.");
                    return null;
                }
                if (iwh0Var.n()) {
                    gprVar.b = 1;
                    Object objEmit = vr20Var.emit(obj, gprVar);
                    d9n d9nVar = d9n.a;
                    if (objEmit == d9nVar) {
                        return d9nVar;
                    }
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

    private final Object m(Object obj, lnm lnmVar) {
        long jLongValue = ((Number) obj).longValue();
        gh91 gh91Var = (gh91) this.c;
        wpr wprVar = (wpr) this.b;
        gh91 gh91Var2 = wprVar.d;
        if (u890.j(gh91Var2 != null ? gh91Var2.d : null, gh91Var.d)) {
            faa0 faa0Var = wprVar.c;
            if (faa0Var != null) {
                faa0Var.d((CancellationException) null);
            }
            wprVar.c = c921.y(wprVar.b, (o8n) null, 0, new xn2(wprVar, gh91Var, jLongValue, (lnm) null, (byte) 3), 3);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object n(Object obj, lnm lnmVar) {
        tpr tprVar;
        Object objEmit;
        d9n d9nVar;
        if (lnmVar instanceof tpr) {
            tprVar = (tpr) lnmVar;
            int i = tprVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                tprVar.b = i - Integer.MIN_VALUE;
            } else {
                tprVar = new tpr(this, lnmVar);
            }
        } else {
            tprVar = new tpr(this, lnmVar);
        }
        Object obj2 = tprVar.a;
        int i2 = tprVar.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            gh91 gh91Var = (ih91) obj;
            boolean z = gh91Var instanceof gh91;
            gh91 gh91Var2 = fh91.a;
            if (z) {
                if (gh91Var.g != ((zg91) this.c)) {
                }
                tprVar.b = 1;
                objEmit = vr20Var.emit(gh91Var, tprVar);
                d9nVar = d9n.a;
                if (objEmit == d9nVar) {
                    return d9nVar;
                }
            } else if (!(gh91Var instanceof fh91)) {
                eg.o();
                return null;
            }
            gh91Var = gh91Var2;
            tprVar.b = 1;
            objEmit = vr20Var.emit(gh91Var, tprVar);
            d9nVar = d9n.a;
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
    private final Object o(Object obj, lnm lnmVar) {
        dqr dqrVar;
        if (lnmVar instanceof dqr) {
            dqrVar = (dqr) lnmVar;
            int i = dqrVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                dqrVar.b = i - Integer.MIN_VALUE;
            } else {
                dqrVar = new dqr(this, lnmVar);
            }
        } else {
            dqrVar = new dqr(this, lnmVar);
        }
        Object obj2 = dqrVar.a;
        int i2 = dqrVar.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            mmr0 mmr0Var = new mmr0(((lhm) this.c).getType(), (hd80) obj);
            dqrVar.b = 1;
            Object objEmit = vr20Var.emit(mmr0Var, dqrVar);
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
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
    
        if (r9.emit(r7, r0) == r5) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object p(java.lang.Object r8, p.lnm r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p.vrr
            if (r0 == 0) goto L13
            r0 = r9
            p.vrr r0 = (p.vrr) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.vrr r0 = new p.vrr
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            int r1 = r0.b
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L39
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r9)
            goto L75
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r4
        L31:
            int r7 = r0.d
            p.vr20 r8 = r0.c
            p.hm5.M(r9)
            goto L65
        L39:
            p.hm5.M(r9)
            java.lang.Object r9 = r7.b
            p.vr20 r9 = (p.vr20) r9
            java.util.List r8 = (java.util.List) r8
            boolean r1 = r8.isEmpty()
            r6 = 0
            if (r1 == 0) goto L51
            p.ip3 r7 = new p.ip3
            p.z6x r8 = p.z6x.a
            r7.<init>(r8)
            goto L68
        L51:
            java.lang.Object r7 = r7.c
            p.gfr r7 = (p.gfr) r7
            r0.c = r9
            r0.d = r6
            r0.b = r3
            java.lang.Object r7 = r7.e(r8, r0)
            if (r7 != r5) goto L62
            goto L74
        L62:
            r8 = r9
            r9 = r7
            r7 = r6
        L65:
            r6 = r7
            r7 = r9
            r9 = r8
        L68:
            r0.c = r4
            r0.d = r6
            r0.b = r2
            java.lang.Object r7 = r9.emit(r7, r0)
            if (r7 != r5) goto L75
        L74:
            return r5
        L75:
            p.rih1 r7 = p.rih1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.t0l.p(java.lang.Object, p.lnm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object q(Object obj, lnm lnmVar) {
        vtr vtrVar;
        if (lnmVar instanceof vtr) {
            vtrVar = (vtr) lnmVar;
            int i = vtrVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                vtrVar.b = i - Integer.MIN_VALUE;
            } else {
                vtrVar = new vtr(this, lnmVar);
            }
        } else {
            vtrVar = new vtr(this, lnmVar);
        }
        Object obj2 = vtrVar.a;
        int i2 = vtrVar.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            if (((wtr) this.c).a((fqt) obj)) {
                vtrVar.b = 1;
                Object objEmit = vr20Var.emit(obj, vtrVar);
                d9n d9nVar = d9n.a;
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:102:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:132:0x0258  */
    /* JADX WARN: Code duplicated, block: B:195:0x038a  */
    /* JADX WARN: Code duplicated, block: B:223:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:242:0x0442  */
    /* JADX WARN: Code duplicated, block: B:258:0x048c  */
    /* JADX WARN: Code duplicated, block: B:286:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:311:0x0545  */
    /* JADX WARN: Code duplicated, block: B:336:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:389:0x06d6  */
    /* JADX WARN: Code duplicated, block: B:407:0x0754  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f2 A[PHI: r0
      0x00f2: PHI (r0v185 p.ifx0) = (r0v184 p.ifx0), (r0v187 p.ifx0) binds: [B:43:0x00f8, B:40:0x00f0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:463:0x08b6  */
    /* JADX WARN: Code duplicated, block: B:466:0x08ca  */
    /* JADX WARN: Code duplicated, block: B:468:0x08cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:469:0x08cf  */
    /* JADX WARN: Code duplicated, block: B:471:0x08d2  */
    /* JADX WARN: Code duplicated, block: B:473:0x08d5  */
    /* JADX WARN: Code duplicated, block: B:477:0x08de  */
    /* JADX WARN: Code duplicated, block: B:479:0x08e4  */
    /* JADX WARN: Code duplicated, block: B:480:0x08e8  */
    /* JADX WARN: Code duplicated, block: B:481:0x08ec  */
    /* JADX WARN: Code duplicated, block: B:482:0x08f0  */
    /* JADX WARN: Code duplicated, block: B:537:0x0a36  */
    /* JADX WARN: Code duplicated, block: B:539:0x0a58  */
    /* JADX WARN: Code duplicated, block: B:558:0x0af1  */
    /* JADX WARN: Code duplicated, block: B:598:0x0c03  */
    /* JADX WARN: Code duplicated, block: B:622:0x0c89  */
    /* JADX WARN: Code duplicated, block: B:626:0x0ca6  */
    /* JADX WARN: Code duplicated, block: B:629:0x0cd1  */
    /* JADX WARN: Code duplicated, block: B:633:0x0cde  */
    /* JADX WARN: Code duplicated, block: B:645:0x0d1f  */
    /* JADX WARN: Code duplicated, block: B:670:0x0d83  */
    /* JADX WARN: Code duplicated, block: B:712:0x08d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0165  */
    public final Object emit(Object obj, lnm lnmVar) {
        s0l s0lVar;
        o1l o1lVar;
        i2l i2lVar;
        String str;
        z6x z6xVarSingletonList;
        z6x z6xVarSingletonList2;
        List listSingletonList;
        l0l l0lVarC;
        String str2;
        c1l c1lVarG;
        a3l a3lVar;
        int iY;
        z6x z6xVar;
        s1l s1lVar;
        Iterator it;
        String str3;
        e860 e860Var;
        fj50 fj50Var;
        qk50 qk50Var;
        Object next;
        gq50 gq50Var;
        rk50 rk50Var;
        String str4;
        int iOrdinal;
        String str5;
        int i;
        int i2;
        int i3;
        b4l b4lVar;
        z6x z6xVarSingletonList3;
        x7l x7lVar;
        int iS;
        qsl qslVar;
        sbm sbmVar;
        iun0 iun0Var;
        iix0 iix0Var;
        okm okmVar;
        com comVar;
        own ownVar;
        goj0 goj0VarA;
        a7q0 a7q0Var;
        w6q0 w6q0Var;
        cdo cdoVar;
        Object edoVar;
        String str6;
        String str7;
        xio xioVar;
        gko gkoVar;
        ifx0 ifx0Var;
        byte b = this.a;
        String str8 = "CONNECT";
        z6x z6xVar2 = z6x.a;
        int i4 = 3;
        int i5 = 10;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        ifx0 ifx0Var2 = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof s0l) {
                    s0lVar = (s0l) lnmVar;
                    int i6 = s0lVar.b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        s0lVar.b = i6 - Integer.MIN_VALUE;
                    } else {
                        s0lVar = new s0l(this, lnmVar);
                    }
                } else {
                    s0lVar = new s0l(this, lnmVar);
                }
                Object obj4 = s0lVar.a;
                int i7 = s0lVar.b;
                if (i7 == 0) {
                    hm5.M(obj4);
                    e790 e790Var = new e790((b7l) obj, ((u0l) obj2).b.b());
                    s0lVar.b = 1;
                    if (((vr20) obj3).emit(e790Var, s0lVar) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i7 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj4);
                }
                return rih1Var;
            case 1:
                if (lnmVar instanceof o1l) {
                    o1lVar = (o1l) lnmVar;
                    int i8 = o1lVar.b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        o1lVar.b = i8 - Integer.MIN_VALUE;
                    } else {
                        o1lVar = new o1l(this, lnmVar);
                    }
                } else {
                    o1lVar = new o1l(this, lnmVar);
                }
                Object obj5 = o1lVar.a;
                int i9 = o1lVar.b;
                if (i9 == 0) {
                    hm5.M(obj5);
                    vr20 vr20Var = (vr20) obj3;
                    ea6 ea6Var = (ea6) obj;
                    p1l p1lVar = (p1l) obj2;
                    Boolean boolValueOf = Boolean.valueOf(p1lVar.d.a.c() && p1lVar.i.contains(ea6Var.a) && ea6Var.b != l2r0.c);
                    o1lVar.b = 1;
                    if (vr20Var.emit(boolValueOf, o1lVar) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i9 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj5);
                }
                return rih1Var;
            case 2:
                j2l j2lVar = (j2l) obj2;
                if (lnmVar instanceof i2l) {
                    i2lVar = (i2l) lnmVar;
                    int i10 = i2lVar.b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        i2lVar.b = i10 - Integer.MIN_VALUE;
                    } else {
                        i2lVar = new i2l(this, lnmVar);
                    }
                } else {
                    i2lVar = new i2l(this, lnmVar);
                }
                Object obj6 = i2lVar.a;
                int i11 = i2lVar.b;
                if (i11 == 0) {
                    hm5.M(obj6);
                    vr20 vr20Var2 = (vr20) obj3;
                    List list = (List) obj;
                    ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        nnr nnrVar = (l0l) it2.next();
                        String strM = j9k1.m(j2lVar.b, nnrVar.getName(), nnrVar.getType(), nnrVar.l(), nnrVar.v(), 224);
                        String strJ = nnrVar.j();
                        uzd1 uzd1Var = new uzd1(strM, 1);
                        qk70 qk70Var = new qk70(sqe.t(nnrVar.getType(), nnrVar.z(), 0));
                        boolean zO = nnrVar.o();
                        boolean z = nnrVar.l() || nnrVar.n();
                        Context context = j2lVar.b;
                        if (nnrVar.l()) {
                            nnr nnrVar2 = nnrVar instanceof nnr ? nnrVar : null;
                            if (nnrVar2 != null) {
                                kx7 kx7Var = nnrVar2.B.a;
                                if (kx7Var.b()) {
                                    kx7Var = null;
                                }
                                mmr0 mmr0Var = kx7Var != null ? new mmr0(kx7Var.b, kx7Var.d) : null;
                                if (mmr0Var != null) {
                                    String str9 = (String) mmr0Var.a;
                                    int iOrdinal2 = ((luq0) mmr0Var.b).ordinal();
                                    z6xVarSingletonList2 = Collections.singletonList(iOrdinal2 != 1 ? iOrdinal2 != 3 ? new brc1(context.getString(2131954228, str9), 1, null) : new zqc1(new xqc1(wkx.c, 1), new brc1(context.getString(2131954228, str9), 1, null)) : new brc1(context.getString(2131954255), 1, null));
                                } else {
                                    it2 = it2;
                                    z6xVarSingletonList2 = null;
                                }
                            } else {
                                it2 = it2;
                                z6xVarSingletonList2 = null;
                            }
                            if (z6xVarSingletonList2 == null) {
                                z6xVarSingletonList = z6xVar2;
                            }
                            str = null;
                            if (cw30.a(nnrVar) || nnrVar.r().length() <= 0) {
                                listSingletonList = Collections.singletonList(nnrVar.d());
                            } else {
                                listSingletonList = p7h.M(new String[]{nnrVar.d(), nnrVar.r()});
                            }
                            List list2 = listSingletonList;
                            String str10 = nnrVar.G().a;
                            boolean zL = nnrVar.l();
                            int state = nnrVar.getState();
                            String strD = nnrVar.d();
                            String strH = nnrVar.H();
                            l0lVarC = j2lVar.a.c();
                            if (l0lVarC != null || (c1lVarG = l0lVarC.G()) == null) {
                                str2 = str;
                            } else {
                                str2 = c1lVarG.a;
                            }
                            arrayList.add(new zv31(strJ, uzd1Var, qk70Var, zO, z, list2, z6xVarSingletonList, (ArrayList) null, new n5l(str10, state, strD, strH, zL, str2), 288));
                            it2 = it2;
                        } else {
                            it2 = it2;
                            int state2 = nnrVar.getState();
                            f0u type = nnrVar.getType();
                            String strS = nnrVar.s();
                            List list3 = cw30.a;
                            Integer numL = a6o1.l(state2, type == f0u.t && (ihc1.j0(strS, "ps4") || ihc1.j0(strS, "ps5")));
                            if (numL != null) {
                                z6xVarSingletonList2 = Collections.singletonList(new brc1(context.getString(numL.intValue()), 1, null));
                            } else if (j2lVar.f.isEnabled() || !hqq0.Y(nnrVar)) {
                                str = null;
                                z6xVarSingletonList = z6xVar2;
                            } else {
                                str = null;
                                z6xVarSingletonList = Collections.singletonList(new zqc1(new xqc1(slx.c, 1), new brc1(context.getString(2131954246), 1, null)));
                            }
                            if (cw30.a(nnrVar)) {
                                listSingletonList = Collections.singletonList(nnrVar.d());
                            } else {
                                listSingletonList = Collections.singletonList(nnrVar.d());
                            }
                            List list4 = listSingletonList;
                            String str11 = nnrVar.G().a;
                            boolean zL2 = nnrVar.l();
                            int state3 = nnrVar.getState();
                            String strD2 = nnrVar.d();
                            String strH2 = nnrVar.H();
                            l0lVarC = j2lVar.a.c();
                            if (l0lVarC != null) {
                                str2 = str;
                            } else {
                                str2 = str;
                            }
                            arrayList.add(new zv31(strJ, uzd1Var, qk70Var, zO, z, list4, z6xVarSingletonList, (ArrayList) null, new n5l(str11, state3, strD2, strH2, zL2, str2), 288));
                            it2 = it2;
                        }
                        z6xVarSingletonList = z6xVarSingletonList2;
                        str = null;
                        if (cw30.a(nnrVar)) {
                            listSingletonList = Collections.singletonList(nnrVar.d());
                        } else {
                            listSingletonList = Collections.singletonList(nnrVar.d());
                        }
                        List list5 = listSingletonList;
                        String str12 = nnrVar.G().a;
                        boolean zL3 = nnrVar.l();
                        int state4 = nnrVar.getState();
                        String strD3 = nnrVar.d();
                        String strH3 = nnrVar.H();
                        l0lVarC = j2lVar.a.c();
                        if (l0lVarC != null) {
                            str2 = str;
                        } else {
                            str2 = str;
                        }
                        arrayList.add(new zv31(strJ, uzd1Var, qk70Var, zO, z, list5, z6xVarSingletonList, (ArrayList) null, new n5l(str12, state4, strD3, strH3, zL3, str2), 288));
                        it2 = it2;
                    }
                    i2lVar.b = 1;
                    if (vr20Var2.emit(arrayList, i2lVar) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i11 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj6);
                }
                return rih1Var;
            case 3:
                if (lnmVar instanceof a3l) {
                    a3lVar = (a3l) lnmVar;
                    int i12 = a3lVar.b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        a3lVar.b = i12 - Integer.MIN_VALUE;
                    } else {
                        a3lVar = new a3l(this, lnmVar);
                    }
                } else {
                    a3lVar = new a3l(this, lnmVar);
                }
                Object obj7 = a3lVar.a;
                int i13 = a3lVar.b;
                if (i13 == 0) {
                    hm5.M(obj7);
                    vr20 vr20Var3 = (vr20) obj3;
                    ConnectMessages.StateResponse stateResponse = (ConnectMessages.StateResponse) obj;
                    c3l c3lVar = (c3l) obj2;
                    boolean zP = stateResponse.p();
                    boolean zS = stateResponse.s();
                    h290 h290VarO = stateResponse.o();
                    ArrayList arrayList2 = new ArrayList(q7h.U(h290VarO, 10));
                    Iterator it3 = h290VarO.iterator();
                    while (it3.hasNext()) {
                        ConnectMessages.StateResponse.Device device = (ConnectMessages.StateResponse.Device) it3.next();
                        device.getClass();
                        cxm.u(device.Z());
                        try {
                            iY = hrt.y(device.N().toUpperCase(Locale.ROOT));
                        } catch (IllegalArgumentException unused) {
                            iY = 22;
                        }
                        int i14 = iY;
                        if (device.hasCapabilities()) {
                            z6x z6xVar3 = (List) c3lVar.c.a(device.p(), c3lVar.d);
                            if (z6xVar3 == null) {
                                z6xVar = z6xVar2;
                            } else {
                                z6xVar = z6xVar3;
                            }
                        } else {
                            z6xVar = z6xVar2;
                        }
                        String name = device.getName();
                        String strI = device.I();
                        boolean zC = device.C();
                        boolean zW = device.w();
                        boolean zY = device.y();
                        boolean zF = device.F();
                        boolean zG = device.G();
                        boolean zA = device.A();
                        boolean zD = device.D();
                        boolean zQ = device.Q();
                        boolean zX = device.X();
                        boolean zW2 = device.W();
                        long jR = device.r();
                        String strO = device.o();
                        String strL = device.L();
                        g0u g0uVarU = cxm.u(device.Z());
                        e860 e860Var2 = new e860(device.u().q(), device.u().r(), device.u().p());
                        if (device.f0()) {
                            ConnectMessages.OutputPeripheral outputPeripheralM = device.M();
                            String name2 = outputPeripheralM.hasName() ? outputPeripheralM.getName() : null;
                            String strO2 = outputPeripheralM.t() ? outputPeripheralM.o() : null;
                            String strS2 = outputPeripheralM.w() ? outputPeripheralM.s() : null;
                            int i15 = 6;
                            if (outputPeripheralM.v()) {
                                switch (outputPeripheralM.q().ordinal()) {
                                    case 0:
                                    case 6:
                                        i3 = 1;
                                        i = i3;
                                        break;
                                    case 1:
                                        i3 = 2;
                                        i = i3;
                                        break;
                                    case 2:
                                        i3 = i4;
                                        i = i3;
                                        break;
                                    case 3:
                                        i3 = 4;
                                        i = i3;
                                        break;
                                    case 4:
                                        i3 = 5;
                                        i = i3;
                                        break;
                                    case 5:
                                        i3 = 6;
                                        i = i3;
                                        break;
                                    default:
                                        eg.o();
                                        return null;
                                }
                            } else {
                                i = 0;
                            }
                            if (outputPeripheralM.u()) {
                                switch (outputPeripheralM.p().ordinal()) {
                                    case 0:
                                    case 7:
                                        i15 = 1;
                                        i2 = i15;
                                        break;
                                    case 1:
                                        i15 = 2;
                                        i2 = i15;
                                        break;
                                    case 2:
                                        i15 = i4;
                                        i2 = i15;
                                        break;
                                    case 3:
                                        i15 = 4;
                                        i2 = i15;
                                        break;
                                    case 4:
                                        i15 = 5;
                                        i2 = i15;
                                        break;
                                    case 5:
                                        i2 = i15;
                                        break;
                                    case 6:
                                        i15 = 7;
                                        i2 = i15;
                                        break;
                                    default:
                                        eg.o();
                                        return null;
                                }
                            } else {
                                i2 = 0;
                            }
                            s1lVar = new s1l(i, i2, name2, strO2, strS2);
                        } else {
                            s1lVar = null;
                        }
                        int iA0 = device.a0();
                        int iB0 = device.b0();
                        boolean zB = device.B();
                        boolean z2 = device.z();
                        boolean zE = device.E();
                        boolean isLocal = device.getIsLocal();
                        String strJ2 = device.J();
                        h290 h290VarO2 = device.O();
                        String strQ = device.q();
                        h290<ConnectMessages.StateResponse.Device.Incarnation> h290VarV = device.v();
                        ArrayList arrayList3 = new ArrayList(q7h.U(h290VarV, i5));
                        for (ConnectMessages.StateResponse.Device.Incarnation incarnation : h290VarV) {
                            int iOrdinal3 = incarnation.q().ordinal();
                            ConnectMessages.StateResponse stateResponse2 = stateResponse;
                            if (iOrdinal3 == 0) {
                                str4 = str8;
                                String strP = incarnation.p();
                                boolean zR = incarnation.r();
                                iOrdinal = incarnation.s().ordinal();
                                if (iOrdinal != 0) {
                                    if (iOrdinal == 1) {
                                        str5 = "user_selected";
                                    } else if (iOrdinal == 2) {
                                        str5 = "stream_expansion";
                                    } else if (iOrdinal == 3) {
                                        str5 = "android_tv";
                                    } else if (iOrdinal == 4) {
                                        str5 = "tap_device";
                                    } else if (iOrdinal != 5) {
                                        eg.o();
                                    }
                                    arrayList3.add(new t880(str4, strP, str5, incarnation.o(), zR));
                                    stateResponse = stateResponse2;
                                }
                                str5 = "default";
                                arrayList3.add(new t880(str4, strP, str5, incarnation.o(), zR));
                                stateResponse = stateResponse2;
                            } else if (iOrdinal3 == 1) {
                                str4 = "CAST";
                                String strP2 = incarnation.p();
                                boolean zR2 = incarnation.r();
                                iOrdinal = incarnation.s().ordinal();
                                if (iOrdinal != 0) {
                                    if (iOrdinal == 1) {
                                        str5 = "user_selected";
                                    } else if (iOrdinal == 2) {
                                        str5 = "stream_expansion";
                                    } else if (iOrdinal == 3) {
                                        str5 = "android_tv";
                                    } else if (iOrdinal == 4) {
                                        str5 = "tap_device";
                                    } else if (iOrdinal != 5) {
                                        eg.o();
                                    }
                                    arrayList3.add(new t880(str4, strP2, str5, incarnation.o(), zR2));
                                    stateResponse = stateResponse2;
                                }
                                str5 = "default";
                                arrayList3.add(new t880(str4, strP2, str5, incarnation.o(), zR2));
                                stateResponse = stateResponse2;
                            } else if (iOrdinal3 == 2) {
                                str4 = str8;
                                String strP3 = incarnation.p();
                                boolean zR3 = incarnation.r();
                                iOrdinal = incarnation.s().ordinal();
                                if (iOrdinal != 0) {
                                    if (iOrdinal == 1) {
                                        str5 = "user_selected";
                                    } else if (iOrdinal == 2) {
                                        str5 = "stream_expansion";
                                    } else if (iOrdinal == 3) {
                                        str5 = "android_tv";
                                    } else if (iOrdinal == 4) {
                                        str5 = "tap_device";
                                    } else if (iOrdinal != 5) {
                                        eg.o();
                                    }
                                    arrayList3.add(new t880(str4, strP3, str5, incarnation.o(), zR3));
                                    stateResponse = stateResponse2;
                                }
                                str5 = "default";
                                arrayList3.add(new t880(str4, strP3, str5, incarnation.o(), zR3));
                                stateResponse = stateResponse2;
                            } else {
                                eg.o();
                            }
                            return null;
                        }
                        ConnectMessages.StateResponse stateResponse3 = stateResponse;
                        boolean zP2 = device.P();
                        String strH4 = device.H();
                        boolean zV = device.V();
                        boolean zR4 = device.R();
                        boolean zY2 = device.Y();
                        boolean zS2 = device.S();
                        boolean zT = device.T();
                        boolean zU = device.U();
                        int iS2 = device.s();
                        Boolean boolValueOf2 = device.d0() ? Boolean.valueOf(device.x()) : null;
                        if (device.c0()) {
                            ConnectMessages.GroupData groupDataT = device.t();
                            h290<ConnectMessages$GroupDevice> h290VarQ = groupDataT.q();
                            ArrayList arrayList4 = new ArrayList(q7h.U(h290VarQ, 10));
                            for (ConnectMessages$GroupDevice connectMessages$GroupDevice : h290VarQ) {
                                connectMessages$GroupDevice.getClass();
                                ConnectMessages$GroupDeviceIdentifiers connectMessages$GroupDeviceIdentifiersP = connectMessages$GroupDevice.p();
                                ConnectMessages.GroupData groupData = groupDataT;
                                Iterator it4 = it3;
                                qk50 qk50Var2 = new qk50(connectMessages$GroupDeviceIdentifiersP.q(), connectMessages$GroupDeviceIdentifiersP.u() ? connectMessages$GroupDeviceIdentifiersP.r() : null, connectMessages$GroupDeviceIdentifiersP.t() ? connectMessages$GroupDeviceIdentifiersP.o() : null, connectMessages$GroupDeviceIdentifiersP.s() ? connectMessages$GroupDeviceIdentifiersP.n() : null);
                                String name3 = connectMessages$GroupDevice.getName();
                                String strR = connectMessages$GroupDevice.r();
                                d7 it5 = g0u.t.iterator();
                                while (true) {
                                    d7 d7Var = it5;
                                    if (d7Var.hasNext()) {
                                        next = d7Var.next();
                                        qk50Var = qk50Var2;
                                        if (!nhc1.S(((g0u) next).name(), strR, true)) {
                                            qk50Var2 = qk50Var;
                                        }
                                    } else {
                                        qk50Var = qk50Var2;
                                        next = null;
                                    }
                                }
                                g0u g0uVar = (g0u) next;
                                if (g0uVar == null) {
                                    g0uVar = g0u.a;
                                }
                                g0u g0uVar2 = g0uVar;
                                String strQ2 = connectMessages$GroupDevice.q();
                                mk50 mk50Var = new mk50(connectMessages$GroupDevice.n().o(), connectMessages$GroupDevice.n().p());
                                int iOrdinal4 = connectMessages$GroupDevice.o().ordinal();
                                if (iOrdinal4 != 0) {
                                    if (iOrdinal4 == 1) {
                                        gq50Var = gq50.b;
                                    } else if (iOrdinal4 == 2) {
                                        gq50Var = gq50.c;
                                    } else if (iOrdinal4 == 3) {
                                        gq50Var = gq50.d;
                                    } else if (iOrdinal4 != 4) {
                                        eg.o();
                                        return null;
                                    }
                                    gq50 gq50Var2 = gq50Var;
                                    if (connectMessages$GroupDevice.t()) {
                                        ConnectMessages$GroupDeviceVolume connectMessages$GroupDeviceVolumeS = connectMessages$GroupDevice.s();
                                        rk50Var = new rk50(((double) connectMessages$GroupDeviceVolumeS.o()) / 65535.0d, Integer.valueOf(connectMessages$GroupDeviceVolumeS.p()));
                                    } else {
                                        rk50Var = null;
                                    }
                                    arrayList4.add(new lk50(qk50Var, name3, g0uVar2, strQ2, mk50Var, gq50Var2, rk50Var));
                                    groupDataT = groupData;
                                    it3 = it4;
                                    e860Var2 = e860Var2;
                                    str8 = str8;
                                }
                                gq50Var = gq50.a;
                                gq50 gq50Var3 = gq50Var;
                                if (connectMessages$GroupDevice.t()) {
                                    ConnectMessages$GroupDeviceVolume connectMessages$GroupDeviceVolumeS2 = connectMessages$GroupDevice.s();
                                    rk50Var = new rk50(((double) connectMessages$GroupDeviceVolumeS2.o()) / 65535.0d, Integer.valueOf(connectMessages$GroupDeviceVolumeS2.p()));
                                } else {
                                    rk50Var = null;
                                }
                                arrayList4.add(new lk50(qk50Var, name3, g0uVar2, strQ2, mk50Var, gq50Var3, rk50Var));
                                groupDataT = groupData;
                                it3 = it4;
                                e860Var2 = e860Var2;
                                str8 = str8;
                            }
                            it = it3;
                            str3 = str8;
                            e860Var = e860Var2;
                            fj50Var = new fj50(arrayList4, new ki50(groupDataT.o().o()));
                        } else {
                            it = it3;
                            str3 = str8;
                            e860Var = e860Var2;
                            fj50Var = null;
                        }
                        arrayList2.add(new e2l(zC, zW, zY, zF, zG, zA, zD, zQ, zX, zW2, jR, strO, strL, strI, strQ, device.e0() ? device.K() : null, name, i14, g0uVarU, arrayList3, iA0, zB, z2, z6xVar, e860Var, s1lVar, iB0, zE, isLocal, strJ2, h290VarO2, zP2, strH4, zV, zR4, zY2, zS2, zT, zU, iS2, boolValueOf2, fj50Var));
                        stateResponse = stateResponse3;
                        it3 = it;
                        str8 = str3;
                        i4 = 3;
                        i5 = 10;
                        break;
                    }
                    ConnectMessages.StateResponse stateResponse4 = stateResponse;
                    c7l c7lVar = new c7l(zP, zS, arrayList2, stateResponse4.q(), stateResponse4.r());
                    a3lVar.b = 1;
                    if (vr20Var3.emit(c7lVar, a3lVar) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i13 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj7);
                }
                return rih1Var;
            case 4:
                if (lnmVar instanceof b4l) {
                    b4lVar = (b4l) lnmVar;
                    int i16 = b4lVar.b;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        b4lVar.b = i16 - Integer.MIN_VALUE;
                    } else {
                        b4lVar = new b4l(this, lnmVar);
                    }
                } else {
                    b4lVar = new b4l(this, lnmVar);
                }
                Object obj8 = b4lVar.a;
                int i17 = b4lVar.b;
                if (i17 == 0) {
                    hm5.M(obj8);
                    vr20 vr20Var4 = (vr20) obj3;
                    List list6 = (List) obj;
                    list6.getClass();
                    boolean zB0 = ((no4) ((d4l) obj2).c.a.get()).B0();
                    ArrayList<l0l> arrayList5 = new ArrayList();
                    for (Object obj9 : list6) {
                        l0l l0lVar = (l0l) obj9;
                        if (l0lVar.G().b != 4 && !l0lVar.l()) {
                            arrayList5.add(obj9);
                        }
                    }
                    ArrayList arrayList6 = new ArrayList();
                    for (l0l l0lVar2 : arrayList5) {
                        if (!zB0 || l0lVar2.h().isEmpty()) {
                            z6xVarSingletonList3 = l0lVar2.p() == 1 ? Collections.singletonList(l0lVar2.d()) : z6xVar2;
                        } else {
                            List listH = l0lVar2.h();
                            ArrayList arrayList7 = new ArrayList();
                            for (Object obj10 : listH) {
                                if (u890.j(((t880) obj10).a, "CONNECT")) {
                                    arrayList7.add(obj10);
                                }
                            }
                            z6xVarSingletonList3 = new ArrayList(q7h.U(arrayList7, 10));
                            Iterator it6 = arrayList7.iterator();
                            while (it6.hasNext()) {
                                z6xVarSingletonList3.add(((t880) it6.next()).e);
                            }
                        }
                        r7h.W((Iterable) z6xVarSingletonList3, arrayList6);
                    }
                    ArrayList arrayList8 = new ArrayList(q7h.U(arrayList6, 10));
                    Iterator it7 = arrayList6.iterator();
                    while (it7.hasNext()) {
                        arrayList8.add(new ip90((String) it7.next()));
                    }
                    Set setP1 = o7h.p1(arrayList8);
                    b4lVar.b = 1;
                    if (vr20Var4.emit(setP1, b4lVar) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i17 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj8);
                }
                return rih1Var;
            case 5:
                if (lnmVar instanceof x7l) {
                    x7lVar = (x7l) lnmVar;
                    int i18 = x7lVar.b;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        x7lVar.b = i18 - Integer.MIN_VALUE;
                    } else {
                        x7lVar = new x7l(this, lnmVar);
                    }
                } else {
                    x7lVar = new x7l(this, lnmVar);
                }
                Object obj11 = x7lVar.a;
                int i19 = x7lVar.b;
                if (i19 == 0) {
                    hm5.M(obj11);
                    vr20 vr20Var5 = (vr20) obj3;
                    Double d = (Double) obj;
                    l0l l0lVarC2 = ((y7l) obj2).a.c();
                    if (l0lVarC2 != null) {
                        double dDoubleValue = d.doubleValue();
                        int iA = l0lVarC2.A();
                        if (iA >= 24) {
                            iA = 24;
                        }
                        iS = jch0.S(dDoubleValue * ((double) iA));
                    } else {
                        iS = 0;
                    }
                    Integer num = new Integer(iS);
                    x7lVar.b = 1;
                    if (vr20Var5.emit(num, x7lVar) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i19 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj11);
                }
                return rih1Var;
            case 6:
                if (lnmVar instanceof qsl) {
                    qslVar = (qsl) lnmVar;
                    int i20 = qslVar.b;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        qslVar.b = i20 - Integer.MIN_VALUE;
                    } else {
                        qslVar = new qsl(this, lnmVar);
                    }
                } else {
                    qslVar = new qsl(this, lnmVar);
                }
                Object obj12 = qslVar.a;
                int i21 = qslVar.b;
                if (i21 == 0) {
                    hm5.M(obj12);
                    vr20 vr20Var6 = (vr20) obj3;
                    cxc0 cxc0Var = (cxc0) obj;
                    Boolean boolValueOf3 = Boolean.valueOf(cxc0Var.a() && !(cxc0Var.f.w.b && ((rsl) obj2).a));
                    qslVar.b = 1;
                    if (vr20Var6.emit(boolValueOf3, qslVar) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i21 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj12);
                }
                return rih1Var;
            case 7:
                iun0 iun0Var2 = (iun0) obj2;
                if (lnmVar instanceof sbm) {
                    sbmVar = (sbm) lnmVar;
                    int i22 = sbmVar.b;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        sbmVar.b = i22 - Integer.MIN_VALUE;
                    } else {
                        sbmVar = new sbm(this, lnmVar);
                    }
                } else {
                    sbmVar = new sbm(this, lnmVar);
                }
                Object obj13 = sbmVar.a;
                int i23 = sbmVar.b;
                if (i23 == 0) {
                    hm5.M(obj13);
                    vr20 vr20Var7 = (vr20) obj3;
                    i1r i1rVar = (k1r) obj;
                    if ((!(i1rVar instanceof i1r) || (iix0Var = (iix0) i1rVar.a) == null || iix0Var.f() <= 0) && (iun0Var = iun0Var2.g) != null) {
                        iun0Var2 = iun0Var;
                    }
                    sbmVar.b = 1;
                    if (vr20Var7.emit(iun0Var2, sbmVar) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i23 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj13);
                }
                return rih1Var;
            case 8:
                if (lnmVar instanceof okm) {
                    okmVar = (okm) lnmVar;
                    int i24 = okmVar.b;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        okmVar.b = i24 - Integer.MIN_VALUE;
                    } else {
                        okmVar = new okm(this, lnmVar);
                    }
                } else {
                    okmVar = new okm(this, lnmVar);
                }
                Object obj14 = okmVar.a;
                int i25 = okmVar.b;
                if (i25 == 0) {
                    hm5.M(obj14);
                    p0d0 p0d0VarP = rjo1.p((PlayerState) obj, ((qkm) obj2).e);
                    okmVar.b = 1;
                    if (((vr20) obj3).emit(p0d0VarP, okmVar) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i25 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj14);
                }
                return rih1Var;
            case 9:
                if (lnmVar instanceof com) {
                    comVar = (com) lnmVar;
                    int i26 = comVar.b;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        comVar.b = i26 - Integer.MIN_VALUE;
                    } else {
                        comVar = new com(this, lnmVar);
                    }
                } else {
                    comVar = new com(this, lnmVar);
                }
                Object obj15 = comVar.a;
                int i27 = comVar.b;
                if (i27 == 0) {
                    hm5.M(obj15);
                    vr20 vr20Var8 = (vr20) obj3;
                    if (!((dom) obj2).z1.get()) {
                        comVar.b = 1;
                        if (vr20Var8.emit(obj, comVar) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    if (i27 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj15);
                }
                return rih1Var;
            case 10:
                String str13 = ((cp11) obj2).a;
                if (lnmVar instanceof own) {
                    ownVar = (own) lnmVar;
                    int i28 = ownVar.b;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        ownVar.b = i28 - Integer.MIN_VALUE;
                    } else {
                        ownVar = new own(this, lnmVar);
                    }
                } else {
                    ownVar = new own(this, lnmVar);
                }
                Object obj16 = ownVar.a;
                int i29 = ownVar.b;
                if (i29 == 0) {
                    hm5.M(obj16);
                    vr20 vr20Var9 = (vr20) obj3;
                    hoj0 hoj0VarC = ((ioj0) obj).c(a7q0.class, str13);
                    Object omj0Var = (hoj0VarC == null || (goj0VarA = hoj0VarC.a()) == null || (a7q0Var = (a7q0) goj0VarA.a) == null || (w6q0Var = a7q0Var.a) == null) ? nmj0.a : new omj0(new afv0(w6q0Var.b, str13, w6q0Var.a.a));
                    ownVar.b = 1;
                    if (vr20Var9.emit(omj0Var, ownVar) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i29 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj16);
                }
                return rih1Var;
            case 11:
                if (lnmVar instanceof cdo) {
                    cdoVar = (cdo) lnmVar;
                    int i30 = cdoVar.b;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        cdoVar.b = i30 - Integer.MIN_VALUE;
                    } else {
                        cdoVar = new cdo(this, lnmVar);
                    }
                } else {
                    cdoVar = new cdo(this, lnmVar);
                }
                Object obj17 = cdoVar.a;
                int i31 = cdoVar.b;
                if (i31 != 0) {
                    if (i31 == 1) {
                        hm5.M(obj17);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj17);
                vr20 vr20Var10 = (vr20) obj3;
                v6l v6lVar = (e7l) obj;
                u13 u13Var = ((ddo) obj2).i;
                if (v6lVar instanceof v6l) {
                    ContextTrack contextTrack = v6lVar.a;
                    String str14 = (String) contextTrack.metadata().get("tagline");
                    String str15 = str14 == null ? "" : str14;
                    String str16 = (String) contextTrack.metadata().get("secondaryTag");
                    String str17 = str16 == null ? "" : str16;
                    String str18 = (Boolean.parseBoolean((String) contextTrack.metadata().get("is_connect_cta_enabled")) && (str7 = (String) contextTrack.metadata().get("buttonMessage")) != null) ? str7 : "";
                    String strT = l4o1.t(contextTrack);
                    if (Format.VIDEO == null) {
                        throw null;
                    }
                    edoVar = new edo(str15, str17, str18, strT, f3o1.f(contextTrack, (ji0) null), p2o1.q(contextTrack));
                } else {
                    if (!(v6lVar instanceof z6l)) {
                        eg.o();
                        return null;
                    }
                    z6l z6lVar = (z6l) v6lVar;
                    ContextTrack contextTrack2 = z6lVar.a;
                    ji0 ji0Var = z6lVar.b;
                    if (((k44) u13Var.a.get()).a() && y8v0.a.contains(ji0Var.Y0)) {
                        ifx0 ifx0Var3 = ji0Var.c;
                        ifx0Var2 = u890.j(ihc1.e1(ifx0Var3).toString(), "--") ? null : ifx0Var3;
                        edoVar = new fdo(ifx0Var2 != null ? ifx0Var2 : "", ji0Var.R0, f3o1.f(contextTrack2, ji0Var), p2o1.r(ji0Var));
                    } else {
                        edoVar = new edo(ji0Var.S0, ji0Var.T0, ji0Var.R0, (ji0Var.Z != Format.VIDEO || (str6 = ji0Var.U0) == null) ? l4o1.t(contextTrack2) : str6, f3o1.f(contextTrack2, ji0Var), p2o1.r(ji0Var));
                    }
                }
                cdoVar.b = 1;
                if (vr20Var10.emit(edoVar, cdoVar) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            case 12:
                if (lnmVar instanceof xio) {
                    xioVar = (xio) lnmVar;
                    int i32 = xioVar.b;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        xioVar.b = i32 - Integer.MIN_VALUE;
                    } else {
                        xioVar = new xio(this, lnmVar);
                    }
                } else {
                    xioVar = new xio(this, lnmVar);
                }
                Object obj18 = xioVar.a;
                int i33 = xioVar.b;
                if (i33 == 0) {
                    hm5.M(obj18);
                    vr20 vr20Var11 = (vr20) obj3;
                    ijo ijoVar = (ijo) obj;
                    Set set = (Set) ((z68) obj2).c;
                    ArrayList arrayList9 = new ArrayList();
                    for (Object obj19 : set) {
                        if (!ijoVar.a.contains((String) obj19)) {
                            arrayList9.add(obj19);
                        }
                    }
                    int iS3 = zno1.s(q7h.U(arrayList9, 10));
                    if (iS3 < 16) {
                        iS3 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iS3);
                    for (Object obj20 : arrayList9) {
                        linkedHashMap.put(obj20, new nlq0(Collections.singleton(mlq0.a)));
                    }
                    rlq0 rlq0Var = new rlq0(linkedHashMap);
                    xioVar.b = 1;
                    if (vr20Var11.emit(rlq0Var, xioVar) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i33 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj18);
                }
                return rih1Var;
            case 13:
                if (lnmVar instanceof gko) {
                    gkoVar = (gko) lnmVar;
                    int i34 = gkoVar.b;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        gkoVar.b = i34 - Integer.MIN_VALUE;
                    } else {
                        gkoVar = new gko(this, lnmVar);
                    }
                } else {
                    gkoVar = new gko(this, lnmVar);
                }
                Object obj21 = gkoVar.a;
                int i35 = gkoVar.b;
                if (i35 == 0) {
                    hm5.M(obj21);
                    Boolean boolValueOf4 = Boolean.valueOf(((ijo) obj).b.contains(((yjo) obj2).c));
                    gkoVar.b = 1;
                    if (((vr20) obj3).emit(boolValueOf4, gkoVar) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i35 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj21);
                }
                return rih1Var;
            case 14:
                return b(obj, lnmVar);
            case 15:
                return c(obj, lnmVar);
            case 16:
                return e(obj, lnmVar);
            case 17:
                return f(obj, lnmVar);
            case 18:
                return g(obj, lnmVar);
            case 19:
                return h(obj, lnmVar);
            case 20:
                return i(obj, lnmVar);
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                return j(obj, lnmVar);
            case 22:
                return k(obj, lnmVar);
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                return l(obj, lnmVar);
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                return m(obj, lnmVar);
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                return n(obj, lnmVar);
            case 26:
                return o(obj, lnmVar);
            case 27:
                return p(obj, lnmVar);
            case 28:
                return q(obj, lnmVar);
            default:
                vr20 vr20Var12 = (vr20) obj3;
                zeu zeuVar = (zeu) obj2;
                EsOffline.Progress progressO = ((EsOffline.TotalProgressResponse) obj).o();
                Context context2 = ((dn3) zeuVar.a).a;
                boolean zS3 = progressO.s();
                ifx0 ifx0Var4 = hfx0.a;
                if (zS3) {
                    zeuVar.b = Long.valueOf(progressO.y());
                    if (progressO.y() != 0) {
                        boolean z3 = progressO.r() >= progressO.y();
                        ifx0Var4 = new ifx0(context2.getString(z3 ? 2131964060 : 2131964061), context2.getString(2131964059, Long.valueOf(progressO.r()), Long.valueOf(progressO.y())), progressO.r() / progressO.y(), z3 ? 3 : 1);
                    }
                    ifx0 ifx0Var5 = ifx0Var4 instanceof ifx0 ? ifx0Var4 : null;
                    if (ifx0Var5 != null && ifx0Var5.d == 3) {
                        ifx0Var2 = ifx0Var5;
                    }
                    zeuVar.c = ifx0Var2;
                } else {
                    rih1Var = rih1Var;
                    Long l = (Long) zeuVar.b;
                    if (l != null) {
                        long jLongValue = l.longValue();
                        if (jLongValue == 0 || progressO.r() < jLongValue) {
                            ifx0Var = (ifx0) zeuVar.c;
                            if (ifx0Var != null) {
                                ifx0Var4 = ifx0Var;
                            }
                        } else {
                            zeuVar.b = null;
                            ifx0Var4 = new ifx0(context2.getString(2131964060), context2.getString(2131964059, Long.valueOf(progressO.r()), l), 1.0f, 3);
                            zeuVar.c = ifx0Var4;
                        }
                    } else {
                        ifx0Var = (ifx0) zeuVar.c;
                        if (ifx0Var != null) {
                            ifx0Var4 = ifx0Var;
                        }
                    }
                }
                Object objEmit = vr20Var12.emit(ifx0Var4, lnmVar);
                return objEmit == d9nVar ? objEmit : rih1Var;
        }
    }
}
