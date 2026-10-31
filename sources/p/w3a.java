package p;

import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import io.reactivex.rxjava3.core.Completable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class w3a extends a8d1 implements bv30 {
    public final /* synthetic */ byte a;
    public byte b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ avl1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w3a(avl1 avl1Var, lnm lnmVar, byte b) {
        super(5, lnmVar);
        this.a = b;
        this.e = avl1Var;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        zke1 zke1Var = this.e;
        switch (b) {
            case 0:
                w3a w3aVar = new w3a((bs0) zke1Var, (lnm) obj5, (byte) 0);
                w3aVar.c = (p3a) obj;
                w3aVar.d = (t3a) obj2;
                return w3aVar.invokeSuspend(rih1Var);
            case 1:
                w3a w3aVar2 = new w3a((qj0) zke1Var, (lnm) obj5, (byte) 1);
                w3aVar2.c = (nc21) obj;
                w3aVar2.d = (mc21) obj3;
                return w3aVar2.invokeSuspend(rih1Var);
            case 2:
                w3a w3aVar3 = new w3a((ams) zke1Var, (lnm) obj5, (byte) 2);
                w3aVar3.c = (lls) obj2;
                w3aVar3.d = (hls) obj3;
                return w3aVar3.invokeSuspend(rih1Var);
            case 3:
                w3a w3aVar4 = new w3a((zdc0) zke1Var, (lnm) obj5, (byte) 3);
                w3aVar4.c = (ndc0) obj2;
                w3aVar4.d = (idc0) obj3;
                return w3aVar4.invokeSuspend(rih1Var);
            case 4:
                w3a w3aVar5 = new w3a((res) zke1Var, (lnm) obj5, (byte) 4);
                w3aVar5.c = (qpo0) obj;
                w3aVar5.d = (ppo0) obj3;
                return w3aVar5.invokeSuspend(rih1Var);
            case 5:
                w3a w3aVar6 = new w3a((umf0) zke1Var, (lnm) obj5, (byte) 5);
                w3aVar6.c = (fpp0) obj2;
                w3aVar6.d = (epp0) obj3;
                return w3aVar6.invokeSuspend(rih1Var);
            case 6:
                w3a w3aVar7 = new w3a((dc61) zke1Var, (lnm) obj5, (byte) 6);
                w3aVar7.c = (wb61) obj2;
                w3aVar7.d = (ub61) obj3;
                return w3aVar7.invokeSuspend(rih1Var);
            default:
                w3a w3aVar8 = new w3a(zke1Var, (lnm) obj5, (byte) 7);
                w3aVar8.c = (uke1) obj3;
                w3aVar8.d = (tqw) obj4;
                return w3aVar8.invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:280:0x0418 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:283:0x03f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:292:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:308:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x02e8  */
    public final Object invokeSuspend(Object obj) {
        String str;
        l820 l820Var;
        Object objI;
        byte b = this.a;
        d9n d9nVar = d9n.a;
        zke1 zke1Var = this.e;
        rih1 rih1Var = rih1.a;
        Object obj2 = null;
        switch (b) {
            case 0:
                p3a p3aVar = (p3a) this.c;
                t3a t3aVar = (t3a) this.d;
                byte b2 = this.b;
                if (b2 == 0) {
                    hm5.M(obj);
                    boolean z = t3aVar.d;
                    ijr ijrVar = (ijr) ((bs0) zke1Var).d;
                    if (z) {
                        String str2 = t3aVar.a;
                        String str3 = t3aVar.b;
                        this.c = null;
                        this.d = null;
                        this.b = (byte) 1;
                        if (ijrVar.f(str2, str3, this) == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        String str4 = t3aVar.a;
                        String str5 = t3aVar.b;
                        p3aVar.getClass();
                        fly0 fly0Var = new fly0(t3aVar.e);
                        this.c = null;
                        this.d = null;
                        this.b = (byte) 2;
                        if (ijrVar.b(str4, str5, true, fly0Var, this) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    if (b2 != 1 && b2 != 2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            case 1:
                qj0 qj0Var = (qj0) zke1Var;
                f1n0 f1n0Var = (f1n0) qj0Var.d;
                nc21 nc21Var = (nc21) this.c;
                lc21 lc21Var = (mc21) this.d;
                byte b3 = this.b;
                if (b3 == 0) {
                    hm5.M(obj);
                    if (lc21Var instanceof lc21) {
                        j130 j130Var = (j130) qj0Var.e;
                        String str6 = nc21Var.a;
                        String str7 = lc21Var.a;
                        this.c = null;
                        this.d = null;
                        this.b = (byte) 1;
                        if (((o130) j130Var).c(str6, str7, this) == d9nVar) {
                            return d9nVar;
                        }
                        this.c = null;
                        this.d = null;
                        this.b = (byte) 2;
                        if (f1n0Var.a(this) == d9nVar) {
                            return d9nVar;
                        }
                    } else if (lc21Var instanceof jc21) {
                        this.c = null;
                        this.d = null;
                        this.b = (byte) 3;
                        if (f1n0Var.a(this) == d9nVar) {
                            return d9nVar;
                        }
                    } else if (!(lc21Var instanceof kc21)) {
                        eg.o();
                        return null;
                    }
                } else if (b3 == 1) {
                    hm5.M(obj);
                    this.c = null;
                    this.d = null;
                    this.b = (byte) 2;
                    if (f1n0Var.a(this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (b3 != 2 && b3 != 3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            case 2:
                ams amsVar = (ams) zke1Var;
                jls jlsVar = (lls) this.c;
                hls hlsVar = (hls) this.d;
                byte b4 = this.b;
                if (b4 != 0) {
                    if (b4 == 1 || b4 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (jlsVar instanceof jls) {
                    int iOrdinal = hlsVar.ordinal();
                    if (iOrdinal == 0) {
                        jls jlsVar2 = jlsVar;
                        String str8 = jlsVar2.c;
                        gls glsVar = jlsVar2.e;
                        this.c = null;
                        this.d = null;
                        this.b = (byte) 1;
                        if (amsVar.h(str8, glsVar, this) == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (iOrdinal != 1) {
                            eg.o();
                            return null;
                        }
                        jls jlsVar3 = jlsVar;
                        String str9 = jlsVar3.c;
                        gls glsVar2 = jlsVar3.e;
                        this.c = null;
                        this.d = null;
                        this.b = (byte) 2;
                        if (amsVar.i(str9, glsVar2, this) == d9nVar) {
                            return d9nVar;
                        }
                    }
                }
                return rih1Var;
            case 3:
                zdc0 zdc0Var = (zdc0) zke1Var;
                ndc0 ndc0Var = (ndc0) this.c;
                fdc0 fdc0Var = (idc0) this.d;
                byte b5 = this.b;
                if (b5 != 0) {
                    if (b5 == 1 || b5 == 2 || b5 == 3 || b5 == 4) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (fdc0Var instanceof gdc0) {
                    Collection<ldc0> collectionValues = ndc0Var.a.values();
                    ArrayList arrayList = new ArrayList();
                    for (ldc0 ldc0Var : collectionValues) {
                        if (ldc0Var instanceof kdc0) {
                            kdc0 kdc0Var = (kdc0) ldc0Var;
                            str = kdc0Var.d ? kdc0Var.b : null;
                            if (str != null) {
                                arrayList.add(str);
                            }
                        } else if (!(ldc0Var instanceof jdc0)) {
                            eg.o();
                            return null;
                        }
                        if (str != null) {
                            arrayList.add(str);
                        }
                    }
                    String str10 = (String) o7h.s0(arrayList);
                    this.c = null;
                    this.d = null;
                    this.b = (byte) 1;
                    PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy = zdc0.R0;
                    if (zdc0Var.j(str10, this) == d9nVar) {
                        return d9nVar;
                    }
                    return rih1Var;
                }
                if (fdc0Var instanceof fdc0) {
                    ldc0 ldc0Var2 = (ldc0) ndc0Var.a.get(fdc0Var.a);
                    this.c = null;
                    this.d = null;
                    this.b = (byte) 2;
                    PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy2 = zdc0.R0;
                    if (zdc0Var.i(ldc0Var2, this) == d9nVar) {
                        return d9nVar;
                    }
                } else if (fdc0Var instanceof edc0) {
                    ldc0 ldc0Var3 = (ldc0) ndc0Var.a.get(((edc0) fdc0Var).a);
                    this.c = null;
                    this.d = null;
                    this.b = (byte) 3;
                    PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy3 = zdc0.R0;
                    if (zdc0Var.h(ldc0Var3, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!(fdc0Var instanceof hdc0)) {
                        eg.o();
                        return null;
                    }
                    this.c = null;
                    this.d = null;
                    this.b = (byte) 4;
                    PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy4 = zdc0.R0;
                    if (zdc0Var.k(ndc0Var, this) == d9nVar) {
                        return d9nVar;
                    }
                }
                return rih1Var;
            case 4:
                res resVar = (res) zke1Var;
                bpb1 bpb1Var = (bpb1) resVar.h;
                qpo0 qpo0Var = (qpo0) this.c;
                ppo0 ppo0Var = (ppo0) this.d;
                byte b6 = this.b;
                try {
                    if (b6 != 0) {
                        if (b6 == 1) {
                            hm5.M(obj);
                            jpo0 jpo0Var = jpo0.c;
                            bpb1Var.getClass();
                            bpb1Var.m((Object) null, jpo0Var);
                        } else {
                            if (b6 != 2) {
                                eg.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            hm5.M(obj);
                        }
                        break;
                    } else {
                        hm5.M(obj);
                        if (ppo0Var instanceof kpo0) {
                            bpb1Var.getClass();
                            bpb1Var.m((Object) null, jpo0.b);
                            Completable completableU = resVar.u(qpo0Var.b);
                            this.c = null;
                            this.d = null;
                            this.b = (byte) 1;
                            if (fc11.i(completableU, this) == d9nVar) {
                                return d9nVar;
                            }
                            jpo0 jpo0Var2 = jpo0.c;
                            bpb1Var.getClass();
                            bpb1Var.m((Object) null, jpo0Var2);
                            break;
                        } else if (ppo0Var instanceof opo0) {
                            fns fnsVar = igu.a;
                            bs50 bs50Var = pyf0.a;
                            iyb0 iyb0Var = new iyb0(resVar, (lnm) null, (byte) 21);
                            this.c = null;
                            this.d = null;
                            this.b = (byte) 2;
                            if (fn31.Y(bs50Var, iyb0Var, this) == d9nVar) {
                                return d9nVar;
                            }
                        } else if (ppo0Var instanceof npo0) {
                            ((ck20) resVar.f).a().subscribe();
                        } else if (!(ppo0Var instanceof lpo0) && !(ppo0Var instanceof mpo0)) {
                            eg.o();
                            return null;
                        }
                    }
                } catch (Exception unused) {
                    bpb1Var.getClass();
                    bpb1Var.m((Object) null, jpo0.d);
                }
                return rih1Var;
            case 5:
                fdc fdcVar = (fdc) ((umf0) zke1Var).e;
                fpp0 fpp0Var = (fpp0) this.c;
                epp0 epp0Var = (epp0) this.d;
                byte b7 = this.b;
                if (b7 != 0) {
                    if (b7 == 1 || b7 == 2 || b7 == 3) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (epp0Var instanceof dpp0) {
                    this.c = null;
                    this.d = null;
                    this.b = (byte) 1;
                    for (Object obj3 : fpp0Var.a) {
                        if (((l820) obj3).c) {
                            obj2 = obj3;
                            l820Var = (l820) obj2;
                            if (l820Var != null || (objI = fdcVar.I(l820Var.b, this)) != d9nVar) {
                                objI = rih1Var;
                            }
                            if (objI == d9nVar) {
                                return d9nVar;
                            }
                        }
                    }
                    l820Var = (l820) obj2;
                    if (l820Var != null) {
                        objI = rih1Var;
                    } else {
                        objI = rih1Var;
                    }
                    if (objI == d9nVar) {
                        return d9nVar;
                    }
                } else if (epp0Var instanceof cpp0) {
                    String str11 = ((cpp0) epp0Var).a.b;
                    this.c = null;
                    this.d = null;
                    this.b = (byte) 2;
                    Object objJ0 = fdcVar.j0(str11, this);
                    if (objJ0 != d9nVar) {
                        objJ0 = rih1Var;
                    }
                    if (objJ0 == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!(epp0Var instanceof bpp0)) {
                        eg.o();
                        return null;
                    }
                    String str12 = ((bpp0) epp0Var).a.b;
                    this.c = null;
                    this.d = null;
                    this.b = (byte) 3;
                    Object objI2 = fdcVar.I(str12, this);
                    if (objI2 != d9nVar) {
                        objI2 = rih1Var;
                    }
                    if (objI2 == d9nVar) {
                        return d9nVar;
                    }
                }
                return rih1Var;
            case 6:
                dc61 dc61Var = (dc61) zke1Var;
                m021 m021Var = dc61Var.g;
                wb61 wb61Var = (wb61) this.c;
                ub61 ub61Var = (ub61) this.d;
                byte b8 = this.b;
                if (b8 != 0) {
                    if (b8 == 1 || b8 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                boolean z2 = ub61Var instanceof tb61;
                b7x b7xVar = b7x.a;
                if (z2) {
                    vb61 vb61Var = (vb61) wb61Var.a.get(((tb61) ub61Var).a);
                    if (vb61Var != null) {
                        Map map = wb61Var.a;
                        this.c = null;
                        this.d = null;
                        this.b = (byte) 1;
                        Collection collectionValues2 = map.values();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj4 : collectionValues2) {
                            if (((vb61) obj4).c == rb61.b) {
                                arrayList2.add(obj4);
                            }
                        }
                        ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(((vb61) it.next()).a);
                        }
                        Set setP1 = o7h.p1(arrayList3);
                        vb61 vb61Var2 = (vb61) o7h.s0(arrayList2);
                        String str13 = vb61Var2 != null ? vb61Var2.d : null;
                        if (str13 == null) {
                            str13 = "";
                        }
                        String str14 = str13;
                        String str15 = vb61Var.a;
                        String strY0 = o7h.y0(o7h.Z0(setP1), ",", (String) null, (String) null, (iu30) null, 62);
                        i8h1 i8h1Var = (i8h1) m021Var.b;
                        opl0 opl0Var = (opl0) m021Var.c;
                        x6h1 x6h1VarC = opl0Var.c.c();
                        x6h1VarC.i.add(new a7h1("chip_section", strY0, (Integer) null, (String) null, str14));
                        x6h1VarC.j = false;
                        x6h1 x6h1VarC2 = x6h1VarC.a().c();
                        x6h1VarC2.i.add(new a7h1("chip", str15, (Integer) null, (String) null, (String) null));
                        x6h1VarC2.j = true;
                        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("clear_filter", 1, b7xVar), x6h1VarC2.a(), opl0Var.b, System.currentTimeMillis()), (xj61) null);
                        Object objG = dc61.g(dc61Var, vb61Var, "session-control-reset", null, this, 14);
                        if (objG != d9nVar) {
                            objG = rih1Var;
                        }
                        if (objG == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    if (!(ub61Var instanceof sb61)) {
                        eg.o();
                        return null;
                    }
                    vb61 vb61Var3 = (vb61) wb61Var.a.get(((sb61) ub61Var).a);
                    if (vb61Var3 != null) {
                        String str16 = vb61Var3.a;
                        this.c = null;
                        this.d = null;
                        this.b = (byte) 2;
                        bpb1 bpb1Var2 = dc61Var.N0;
                        bpb1Var2.m((Object) null, dm61.x0(str16, (Set) bpb1Var2.getValue()));
                        LinkedHashSet linkedHashSetX0 = dm61.x0(str16, vb61Var3.f);
                        String str17 = vb61Var3.g;
                        String strY1 = o7h.y0(o7h.Z0(linkedHashSetX0), ",", (String) null, (String) null, (iu30) null, 62);
                        i8h1 i8h1Var2 = (i8h1) m021Var.b;
                        opl0 opl0Var2 = (opl0) m021Var.c;
                        x6h1 x6h1VarC3 = opl0Var2.c.c();
                        x6h1VarC3.i.add(new a7h1("chip_section", strY1, (Integer) null, (String) null, str17));
                        x6h1VarC3.j = false;
                        x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                        x6h1VarC4.i.add(new a7h1("chip", str16, (Integer) null, (String) null, (String) null));
                        x6h1VarC4.j = true;
                        Object objG2 = dc61.g(dc61Var, vb61Var3, vb61Var3.a, i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("filter", 1, b7xVar), x6h1VarC4.a(), opl0Var2.b, System.currentTimeMillis()), (xj61) null).a, this, 12);
                        if (objG2 != d9nVar) {
                            objG2 = rih1Var;
                        }
                        if (objG2 == d9nVar) {
                            return d9nVar;
                        }
                    }
                }
                return rih1Var;
            default:
                zke1 zke1Var2 = zke1Var;
                uke1 uke1Var = (uke1) this.c;
                tqw tqwVar = (tqw) this.d;
                byte b9 = this.b;
                if (b9 != 0) {
                    if (b9 == 1 || b9 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (u890.j(uke1Var, ske1.a)) {
                    pyh1 pyh1Var = (pyh1) zke1Var2.b.get();
                    this.c = null;
                    this.d = null;
                    this.b = (byte) 1;
                    Object objY = fn31.Y(pyh1Var.b, new vbc1(pyh1Var, (lnm) null, (byte) 16), this);
                    if (objY != d9nVar) {
                        objY = rih1Var;
                    }
                    if (objY == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!u890.j(uke1Var, tke1.a)) {
                        eg.o();
                        return null;
                    }
                    if (tqwVar != null) {
                        tv80 tv80VarY = n3o1.y(tqwVar);
                        qs00 qs00Var = (qs00) zke1Var2.a.get();
                        this.c = null;
                        this.d = null;
                        this.b = (byte) 2;
                        Object objY2 = fn31.Y(qs00Var.c, new nnu(qs00Var, tv80VarY, (lnm) null, (byte) 29), this);
                        if (objY2 != d9nVar) {
                            objY2 = rih1Var;
                        }
                        if (objY2 == d9nVar) {
                            return d9nVar;
                        }
                    }
                }
                return rih1Var;
        }
    }
}
