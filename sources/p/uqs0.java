package p;

import com.spotify.player.model.ContextTrack;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uqs0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public uqs0(ju51 ju51Var, vr20 vr20Var, l811 l811Var) {
        this.a = (byte) 21;
        this.b = ju51Var;
        this.d = vr20Var;
        this.c = l811Var;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x006f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    /* JADX WARN: Code duplicated, block: B:32:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0090  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object f(Object obj, lnm lnmVar) {
        ue51 ue51Var;
        q281 q281Var;
        String str;
        String str2;
        if (lnmVar instanceof ue51) {
            ue51Var = (ue51) lnmVar;
            int i = ue51Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ue51Var.b = i - Integer.MIN_VALUE;
            } else {
                ue51Var = new ue51(this, lnmVar);
            }
        } else {
            ue51Var = new ue51(this, lnmVar);
        }
        Object obj2 = ue51Var.a;
        int i2 = ue51Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.d;
            i1r i1rVar = (k1r) obj;
            boolean z = i1rVar instanceof i1r;
            Object re51Var = pe51.a;
            if (z) {
                oe51 oe51Var = (oe51) this.b;
                String str3 = oe51Var.a;
                w281 w281Var = (w281) i1rVar.a;
                boolean z2 = ((ve51) this.c).c;
                t281 t281Var = w281Var != null ? w281Var.i : null;
                if (t281Var != null) {
                    String str4 = t281Var.b;
                    if (ihc1.y0(str4)) {
                        q281Var = w281Var != null ? w281Var.h : null;
                        if (q281Var != null) {
                            str = q281Var.b;
                            str2 = q281Var.a;
                            if (ihc1.y0(str2) || !ihc1.y0(str)) {
                                re51Var = new qe51(str3, new e98(str2, str));
                            } else if (z2) {
                                re51Var = new re51(str3);
                            }
                        } else if (z2) {
                            re51Var = new re51(str3);
                        }
                    } else {
                        re51Var = new se51(oe51Var.a, t281Var.a, str4, t281Var.c, t281Var.d);
                    }
                } else {
                    if (w281Var != null) {
                    }
                    if (q281Var != null) {
                        str = q281Var.b;
                        str2 = q281Var.a;
                        if (ihc1.y0(str2)) {
                        }
                        re51Var = new qe51(str3, new e98(str2, str));
                    } else if (z2) {
                        re51Var = new re51(str3);
                    }
                }
            }
            ue51Var.b = 1;
            Object objEmit = vr20Var.emit(re51Var, ue51Var);
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
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, java.lang.String] */
    private final Object g(Object obj, lnm lnmVar) {
        q761 q761Var;
        ?? r7;
        zc8 zc8Var;
        if (lnmVar instanceof q761) {
            q761Var = (q761) lnmVar;
            int i = q761Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                q761Var.b = i - Integer.MIN_VALUE;
            } else {
                q761Var = new q761(this, lnmVar);
            }
        } else {
            q761Var = new q761(this, lnmVar);
        }
        Object obj2 = q761Var.a;
        int i2 = q761Var.b;
        String str = null;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.d;
            String str2 = (String) this.b;
            List list = (List) this.c;
            List<i1r> list2 = (List) obj;
            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
            for (i1r i1rVar : list2) {
                o3r o3rVar = r761.a;
                i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
                arrayList.add((i1rVar2 == null || (zc8Var = (zc8) i1rVar2.a) == null) ? null : zc8Var.i);
            }
            o3r o3rVar2 = r761.a;
            smc0 smc0VarN = k4p1.n();
            ?? r6 = 0;
            for (mmr0 mmr0Var : o7h.v1(list, arrayList)) {
                pvc0 pvc0Var = (pvc0) mmr0Var.a;
                String str3 = (String) mmr0Var.b;
                if (str3 == null || ihc1.y0(str3)) {
                    r7 = str3;
                    r7 = str;
                }
                if (r7 != 0 && !r7.equals(r6)) {
                    smc0VarN.add(new h8k1(new o761(r7), l1d.m("heading:", pvc0Var.c)));
                    r6 = r7;
                }
                String str4 = pvc0Var.c;
                String str5 = pvc0Var.a;
                smc0VarN.add(new h8k1(new n761(new uv11(str4, str2, (Integer) null, str5.length() == 0 ? str : str5, mqo1.B(pvc0Var.f), (tv11) null, 0, 228)), str5.length() == 0 ? pvc0Var.c : str5));
                str = null;
                r6 = r6;
            }
            smc0 smc0VarK = k4p1.k(smc0VarN);
            q761Var.b = 1;
            Object objEmit = vr20Var.emit(smc0VarK, q761Var);
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

    /* JADX WARN: Code duplicated, block: B:4:0x0013  */
    private final Object h(Object obj, lnm lnmVar) {
        Object next;
        Integer numValueOf;
        xtb0 xtb0Var = (xtb0) this.b;
        List list = xtb0Var.h().l;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            int iG = ((int) (xtb0Var.h().g() >> 32)) / 2;
            int iAbs = Math.abs(xtb0Var.h().m);
            Iterator it = list.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    qtb0 qtb0Var = (qtb0) next;
                    int iAbs2 = Math.abs(((qtb0Var.q / 2) + (qtb0Var.p + iAbs)) - iG);
                    do {
                        Object next2 = it.next();
                        qtb0 qtb0Var2 = (qtb0) next2;
                        int iAbs3 = Math.abs(((qtb0Var2.q / 2) + (qtb0Var2.p + iAbs)) - iG);
                        if (iAbs2 > iAbs3) {
                            next = next2;
                            iAbs2 = iAbs3;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            qtb0 qtb0Var3 = (qtb0) next;
            if (qtb0Var3 != null) {
                numValueOf = Integer.valueOf(qtb0Var3.a);
            } else {
                numValueOf = null;
            }
        }
        if (numValueOf != null) {
            Integer num = numValueOf.intValue() != ((dl71) this.d).a.s() ? numValueOf : null;
            if (num != null) {
                ((iu30) this.c).invoke(num);
            }
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object i(Object obj, lnm lnmVar) {
        zx71 zx71Var;
        if (lnmVar instanceof zx71) {
            zx71Var = (zx71) lnmVar;
            int i = zx71Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                zx71Var.b = i - Integer.MIN_VALUE;
            } else {
                zx71Var = new zx71(this, lnmVar);
            }
        } else {
            zx71Var = new zx71(this, lnmVar);
        }
        Object obj2 = zx71Var.a;
        int i2 = zx71Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.d;
            if (((Boolean) obj).booleanValue() && !((Boolean) ((ven0) this.b).getValue()).booleanValue() && ((ven0) this.c).getValue() != null) {
                zx71Var.b = 1;
                Object objEmit = vr20Var.emit(obj, zx71Var);
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
    private final Object j(Object obj, lnm lnmVar) {
        q481 q481Var;
        ikd ikdVarE;
        if (lnmVar instanceof q481) {
            q481Var = (q481) lnmVar;
            int i = q481Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                q481Var.b = i - Integer.MIN_VALUE;
            } else {
                q481Var = new q481(this, lnmVar);
            }
        } else {
            q481Var = new q481(this, lnmVar);
        }
        Object obj2 = q481Var.a;
        int i2 = q481Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.d;
            l7m0 l7m0Var = ((Boolean) obj).booleanValue() ? ((r481) this.b).b : null;
            Boolean boolValueOf = Boolean.valueOf((l7m0Var == null || (ikdVarE = l7m0Var.e((ContextTrack) this.c)) == null) ? false : ikdVarE.i);
            q481Var.b = 1;
            Object objEmit = vr20Var.emit(boolValueOf, q481Var);
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

    private final Object k(Object obj, lnm lnmVar) {
        he81 he81Var = (he81) obj;
        ((iu30) this.b).invoke(he81Var);
        hd81 hd81Var = (hd81) this.c;
        id81 id81Var = (id81) this.d;
        Boolean bool = hd81Var.Y0;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if (he81Var.F && !id81Var.e.a.equals(hd81Var.X0)) {
                hd81Var.e(id81Var, he81Var, zBooleanValue);
            }
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object l(Object obj, lnm lnmVar) {
        ed81 ed81Var;
        if (lnmVar instanceof ed81) {
            ed81Var = (ed81) lnmVar;
            int i = ed81Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ed81Var.b = i - Integer.MIN_VALUE;
            } else {
                ed81Var = new ed81(this, lnmVar);
            }
        } else {
            ed81Var = new ed81(this, lnmVar);
        }
        Object obj2 = ed81Var.a;
        int i2 = ed81Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.d;
            id81 id81Var = (id81) this.b;
            hd81 hd81Var = (hd81) this.c;
            he81 he81VarJ = jon1.J(id81Var, (t910) obj, hd81Var.d, hd81Var.e, hd81Var.Q0);
            ed81Var.b = 1;
            Object objEmit = vr20Var.emit(he81VarJ, ed81Var);
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
    public Object b(jo70 jo70Var, lnm lnmVar) {
        c1u0 c1u0Var;
        vr20 vr20Var = (vr20) this.d;
        if (lnmVar instanceof c1u0) {
            c1u0Var = (c1u0) lnmVar;
            int i = c1u0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1u0Var.d = i - Integer.MIN_VALUE;
            } else {
                c1u0Var = new c1u0(this, lnmVar);
            }
        } else {
            c1u0Var = new c1u0(this, lnmVar);
        }
        Object obj = c1u0Var.b;
        int i2 = c1u0Var.d;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            v0u0 v0u0Var = new v0u0(jo70Var, 2);
            c1u0Var.a = jo70Var;
            c1u0Var.d = 1;
            if (vr20Var.emit(v0u0Var, c1u0Var) != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jo70Var = c1u0Var.a;
        hm5.M(obj);
        io70 io70Var = jo70Var.e;
        String str = io70Var != null ? io70Var.b : null;
        if (((x0u0) this.b).b && str != null) {
            ezc ezcVarG = yoi1.g(l0p1.i(str, ((g1u0) this.c).l));
            s4q0 s4q0Var = new s4q0(vr20Var, jo70Var, (byte) 12);
            c1u0Var.a = null;
            c1u0Var.d = 2;
            if (ezcVarG.collect(s4q0Var, c1u0Var) == d9nVar) {
                return d9nVar;
            }
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object c(y2r0 y2r0Var, lnm lnmVar) {
        gkx0 gkx0Var;
        ArrayList arrayList = (ArrayList) this.b;
        if (lnmVar instanceof gkx0) {
            gkx0Var = (gkx0) lnmVar;
            int i = gkx0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                gkx0Var.d = i - Integer.MIN_VALUE;
            } else {
                gkx0Var = new gkx0(this, lnmVar);
            }
        } else {
            gkx0Var = new gkx0(this, lnmVar);
        }
        Object objN = gkx0Var.b;
        int i2 = gkx0Var.d;
        if (i2 == 0) {
            hm5.M(objN);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((c0r) it.next()).dispose();
            }
            arrayList.clear();
            hkx0 hkx0Var = (hkx0) this.c;
            c9n c9nVar = (c9n) this.d;
            gkx0Var.a = arrayList;
            gkx0Var.d = 1;
            objN = hkx0Var.n(c9nVar, y2r0Var, gkx0Var);
            d9n d9nVar = d9n.a;
            if (objN == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = gkx0Var.a;
            hm5.M(objN);
        }
        arrayList.addAll((Collection) objN);
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (r1.emit(p.trb.a, r3) == r7) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
    
        if (r1.emit(p.srb.a, r3) == r7) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
    
        return r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object e(boolean r8, p.lnm r9) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.c
            p.l811 r0 = (p.l811) r0
            java.lang.Object r1 = r7.d
            p.vr20 r1 = (p.vr20) r1
            java.lang.Object r2 = r7.b
            p.ju51 r2 = (p.ju51) r2
            p.bpb1 r2 = r2.l
            boolean r3 = r9 instanceof p.iu51
            if (r3 == 0) goto L21
            r3 = r9
            p.iu51 r3 = (p.iu51) r3
            int r4 = r3.d
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L21
            int r4 = r4 - r5
            r3.d = r4
            goto L26
        L21:
            p.iu51 r3 = new p.iu51
            r3.<init>(r7, r9)
        L26:
            java.lang.Object r7 = r3.b
            int r9 = r3.d
            r4 = 2
            r5 = 1
            if (r9 == 0) goto L40
            if (r9 == r5) goto L3a
            if (r9 != r4) goto L33
            goto L3a
        L33:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            r7 = 0
            return r7
        L3a:
            boolean r8 = r3.a
            p.hm5.M(r7)
            goto L7f
        L40:
            p.hm5.M(r7)
            p.d9n r7 = p.d9n.a
            if (r8 == 0) goto L60
            java.lang.Object r9 = r2.getValue()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L60
            r3.a = r8
            r3.d = r5
            p.trb r9 = p.trb.a
            java.lang.Object r9 = r1.emit(r9, r3)
            if (r9 != r7) goto L7f
            goto L7e
        L60:
            boolean r9 = r0.a
            if (r9 == 0) goto L7f
            if (r8 != 0) goto L7f
            java.lang.Object r9 = r2.getValue()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L7f
            r3.a = r8
            r3.d = r4
            p.srb r9 = p.srb.a
            java.lang.Object r9 = r1.emit(r9, r3)
            if (r9 != r7) goto L7f
        L7e:
            return r7
        L7f:
            r0.a = r8
            p.rih1 r7 = p.rih1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.uqs0.e(boolean, p.lnm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:122:0x0213  */
    /* JADX WARN: Code duplicated, block: B:138:0x025f  */
    /* JADX WARN: Code duplicated, block: B:157:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:180:0x032b  */
    /* JADX WARN: Code duplicated, block: B:228:0x0408  */
    /* JADX WARN: Code duplicated, block: B:261:0x0490  */
    /* JADX WARN: Code duplicated, block: B:319:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:350:0x065c  */
    /* JADX WARN: Code duplicated, block: B:374:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:377:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:382:0x06e0  */
    /* JADX WARN: Code duplicated, block: B:425:0x0768  */
    /* JADX WARN: Code duplicated, block: B:443:0x07b5  */
    /* JADX WARN: Code duplicated, block: B:459:0x07f9  */
    /* JADX WARN: Code duplicated, block: B:507:0x08e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:508:0x08e7  */
    /* JADX WARN: Code duplicated, block: B:515:0x090e  */
    /* JADX WARN: Code duplicated, block: B:516:0x0911  */
    /* JADX WARN: Code duplicated, block: B:518:0x0914  */
    /* JADX WARN: Code duplicated, block: B:519:0x0917  */
    /* JADX WARN: Code duplicated, block: B:522:0x091c  */
    /* JADX WARN: Code duplicated, block: B:527:0x0934  */
    /* JADX WARN: Code duplicated, block: B:528:0x0937  */
    /* JADX WARN: Code duplicated, block: B:530:0x093a  */
    /* JADX WARN: Code duplicated, block: B:531:0x093d  */
    /* JADX WARN: Code duplicated, block: B:533:0x0940  */
    /* JADX WARN: Code duplicated, block: B:535:0x094a  */
    /* JADX WARN: Code duplicated, block: B:538:0x0951  */
    /* JADX WARN: Code duplicated, block: B:543:0x095c  */
    /* JADX WARN: Code duplicated, block: B:545:0x0960  */
    /* JADX WARN: Code duplicated, block: B:546:0x0963  */
    /* JADX WARN: Code duplicated, block: B:549:0x0978  */
    /* JADX WARN: Code duplicated, block: B:552:0x098e  */
    /* JADX WARN: Code duplicated, block: B:555:0x0999  */
    /* JADX WARN: Code duplicated, block: B:559:0x09b3  */
    /* JADX WARN: Code duplicated, block: B:566:0x09d0  */
    /* JADX WARN: Code duplicated, block: B:567:0x09d2  */
    /* JADX WARN: Code duplicated, block: B:570:0x09dd  */
    /* JADX WARN: Code duplicated, block: B:572:0x09e6  */
    /* JADX WARN: Code duplicated, block: B:573:0x09eb  */
    /* JADX WARN: Code duplicated, block: B:576:0x09f7  */
    /* JADX WARN: Code duplicated, block: B:577:0x09fc  */
    /* JADX WARN: Code duplicated, block: B:580:0x0a03  */
    /* JADX WARN: Code duplicated, block: B:585:0x0a0f  */
    /* JADX WARN: Code duplicated, block: B:588:0x0a16  */
    /* JADX WARN: Code duplicated, block: B:590:0x0a19  */
    /* JADX WARN: Code duplicated, block: B:591:0x0a1c  */
    /* JADX WARN: Code duplicated, block: B:60:0x0103  */
    /* JADX WARN: Code duplicated, block: B:633:0x06dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:634:0x06da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:635:? A[LOOP:7: B:375:0x06bc->B:635:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:639:0x09be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:643:0x09ad A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v31 java.lang.Object, still in use, count: 2, list:
          (r3v31 java.lang.Object) from 0x06b4: PHI (r3 I:??) = (r3v24 java.lang.Object), (r3v31 java.lang.Object) binds: [B:371:0x06b3, B:630:0x06b4] A[DONT_GENERATE, DONT_INLINE]
          (r3v31 java.lang.Object) from 0x06a3: CHECK_CAST (p.o3w0) (r3v31 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public final java.lang.Object emit(java.lang.Object r26, p.lnm r27) {
        /*
            Method dump skipped, instruction units count: 2718
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.uqs0.emit(java.lang.Object, p.lnm):java.lang.Object");
    }

    public /* synthetic */ uqs0(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ uqs0(byte b, Object obj, Object obj2, vr20 vr20Var) {
        this.a = b;
        this.d = vr20Var;
        this.b = obj;
        this.c = obj2;
    }
}
