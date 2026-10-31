package p;

import android.net.Uri;
import com.spotify.nowplayingmodes.adsmode.data.AdsModeModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wm0 extends a8d1 implements bv30 {
    public final /* synthetic */ byte a;
    public byte b;
    public /* synthetic */ Object c;
    public final /* synthetic */ avl1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wm0(avl1 avl1Var, lnm lnmVar, byte b) {
        super(5, lnmVar);
        this.a = b;
        this.d = avl1Var;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        suh1 suh1Var = this.d;
        switch (b) {
            case 0:
                wm0 wm0Var = new wm0((an0) suh1Var, (lnm) obj5, (byte) 0);
                wm0Var.c = (um0) obj2;
                return wm0Var.invokeSuspend(rih1Var);
            case 1:
                wm0 wm0Var2 = new wm0((umf0) suh1Var, (lnm) obj5, (byte) 1);
                wm0Var2.c = (e9o) obj3;
                return wm0Var2.invokeSuspend(rih1Var);
            case 2:
                wm0 wm0Var3 = new wm0((azr) suh1Var, (lnm) obj5, (byte) 2);
                wm0Var3.c = (ec20) obj3;
                return wm0Var3.invokeSuspend(rih1Var);
            case 3:
                wm0 wm0Var4 = new wm0((xvu) suh1Var, (lnm) obj5, (byte) 3);
                wm0Var4.c = (hvu) obj2;
                return wm0Var4.invokeSuspend(rih1Var);
            default:
                wm0 wm0Var5 = new wm0(suh1Var, (lnm) obj5, (byte) 4);
                wm0Var5.c = (q5m1) obj3;
                return wm0Var5.invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:165:0x040a  */
    /* JADX WARN: Code duplicated, block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x017c  */
    public final Object invokeSuspend(Object obj) {
        Object objI;
        ghm ghmVar;
        t7d1 t7d1Var;
        Object objE;
        Object objA;
        q4m1 q4m1Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        suh1 suh1Var = this.d;
        switch (b) {
            case 0:
                an0 an0Var = (an0) suh1Var;
                um0 um0Var = (um0) this.c;
                byte b2 = this.b;
                if (b2 == 0) {
                    hm5.M(obj);
                    ezc ezcVarG = yoi1.g(an0Var.a);
                    this.c = um0Var;
                    this.b = (byte) 1;
                    objI = b5p1.i(ezcVarG, this);
                    if (objI != d9nVar) {
                    }
                    return d9nVar;
                }
                if (b2 != 1) {
                    if (b2 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                objI = obj;
                l62 l62Var = (l62) objI;
                boolean z = um0Var.b;
                this.c = null;
                this.b = (byte) 2;
                j62 j62Var = an0Var.e;
                AdsModeModel.Format format = l62Var.R0;
                AdsModeModel.Product product = l62Var.S0;
                String str = l62Var.i;
                String str2 = l62Var.V0;
                g5l0 g5l0VarB = j62Var.b();
                i8h1 i8h1Var = j62Var.b;
                x6h1 x6h1VarC = g5l0VarB.c.c();
                x6h1VarC.i.add(new a7h1("top_bar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                String strA = format.a(product);
                x6h1 x6h1VarC2 = y6h1VarA.c();
                x6h1VarC2.i.add(new a7h1("context_menu_button", str, (Integer) null, str2, strA));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA2 = x6h1VarC2.a();
                b7x b7xVar = b7x.a;
                tv80 tv80VarM = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA2, g5l0VarB.b, System.currentTimeMillis()), (xj61) null);
                if (an0Var.Y.c()) {
                    objE = an0Var.e(l62Var, z, tv80VarM.a, this);
                    if (objE != d9nVar) {
                    }
                    if (objE != d9nVar) {
                        return rih1Var;
                    }
                    return d9nVar;
                }
                g5l0 g5l0VarB2 = j62Var.b();
                String strA2 = format.a(product);
                x6h1 x6h1VarC3 = g5l0VarB2.c.c();
                x6h1VarC3.i.add(new a7h1("context_menu", str, (Integer) null, str2, strA2));
                x6h1VarC3.j = true;
                y6h1 y6h1VarA3 = x6h1VarC3.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA3;
                ((xjn) k7h1Var).b = g5l0VarB2.b;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                i8h1Var.f(k7h1Var.a(), (Set) null);
                u961 u961Var = an0Var.b;
                String str3 = l62Var.f;
                if (str3.length() == 0) {
                    str3 = l62Var.g;
                }
                String str4 = l62Var.b;
                smc0 smc0VarN = k4p1.n();
                if (l62Var.T0) {
                    smc0VarN.add(new zhm("ads_mode_dsa", an0Var.g.getString(2131955138), new ip80(format, product, str, str2), 1, new y4(an0Var, l62Var, (byte) 10)));
                }
                ti tiVar = l62Var.Z;
                lsn lsnVar = tiVar instanceof lsn ? (lsn) tiVar : null;
                if (lsnVar != null && (t7d1Var = lsnVar.c.d) != null) {
                    smc0VarN.add(new zhm("ads_mode_transparency", t7d1Var.a, new ip80(format, product, str, str2), 2, new hh(t7d1Var, l62Var, an0Var, (byte) 1)));
                }
                smc0 smc0VarK = k4p1.k(smc0VarN);
                igm igmVar = new igm(str4, new wfm(Uri.parse(str3)), (String) null, 4);
                ArrayList arrayList = new ArrayList(q7h.U(smc0VarK, 10));
                rmc0 rmc0VarListIterator = smc0VarK.listIterator(0);
                while (true) {
                    rmc0 rmc0Var = rmc0VarListIterator;
                    if (rmc0Var.hasNext()) {
                        zhm zhmVar = (zhm) rmc0Var.next();
                        String str5 = zhmVar.a;
                        eox eoxVar = eox.c;
                        String str6 = zhmVar.b;
                        ip80 ip80Var = zhmVar.c;
                        int iC = l1d.C(zhmVar.d);
                        if (iC == 0) {
                            ghmVar = new ghm(new d62(u961Var, ip80Var, (byte) 0), ny1.N0);
                        } else {
                            if (iC != 1) {
                                eg.o();
                                return null;
                            }
                            ghmVar = new ghm(new d62(u961Var, ip80Var, (byte) 1), ny1.O0);
                        }
                        arrayList.add(new jhm(str5, eoxVar, (fhm) null, (Integer) null, str6, false, (tm81) null, new ihm(zgm.c, ghmVar, new jm1(zhmVar, (byte) 9)), 236));
                    } else {
                        mfm.c((mfm) ((ynb0) u961Var.a).get(), new kjm(igmVar, arrayList, 4), (p6r0) null, (bjm) null, tv80VarM, 22);
                    }
                }
                objE = rih1Var;
                if (objE != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
            case 1:
                umf0 umf0Var = (umf0) suh1Var;
                e9o e9oVar = (e9o) this.c;
                byte b3 = this.b;
                if (b3 == 0) {
                    hm5.M(obj);
                    if (e9oVar != null) {
                        int i = e9oVar.a;
                        if (i == 0) {
                            b7n b7nVar = (b7n) umf0Var.d;
                            Boolean bool = Boolean.FALSE;
                            this.c = null;
                            this.b = (byte) 1;
                            if (b7nVar.b(e6n.a, bool, this) != d9nVar) {
                                return rih1Var;
                            }
                        } else {
                            if (i < 0 || i >= 13) {
                                return rih1Var;
                            }
                            gke gkeVar = new gke(umf0Var, e9oVar, (lnm) null, (byte) 16);
                            this.c = null;
                            this.b = (byte) 2;
                            if (smo1.s(gkeVar, this) != d9nVar) {
                                return rih1Var;
                            }
                        }
                        return d9nVar;
                    }
                    eg.o();
                } else {
                    if (b3 == 1 || b3 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 2:
                euz euzVar = ((azr) suh1Var).a;
                dc20 dc20Var = (ec20) this.c;
                byte b4 = this.b;
                if (b4 == 0) {
                    hm5.M(obj);
                    if (dc20Var instanceof dc20) {
                        List list = dc20Var.a;
                        this.c = null;
                        this.b = (byte) 1;
                        euzVar.c.m((Object) null, list);
                        Object objA2 = euzVar.a(list, this);
                        if (objA2 != d9nVar) {
                            objA2 = rih1Var;
                        }
                        if (objA2 != d9nVar) {
                            return rih1Var;
                        }
                    } else if (dc20Var instanceof cc20) {
                        String str7 = ((cc20) dc20Var).a;
                        this.c = null;
                        this.b = (byte) 2;
                        bpb1 bpb1Var = euzVar.c;
                        List list2 = (List) bpb1Var.getValue();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : list2) {
                            if (!u890.j(((ee21) obj2).a.getId(), str7)) {
                                arrayList2.add(obj2);
                            }
                        }
                        if (arrayList2.size() != list2.size()) {
                            bpb1Var.m((Object) null, arrayList2);
                            objA = euzVar.a(arrayList2, this);
                            if (objA != d9nVar) {
                                objA = rih1Var;
                            }
                        } else {
                            objA = rih1Var;
                        }
                        if (objA != d9nVar) {
                            return rih1Var;
                        }
                    } else {
                        eg.o();
                    }
                    return d9nVar;
                }
                if (b4 == 1 || b4 == 2) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                hvu hvuVar = (hvu) this.c;
                byte b5 = this.b;
                if (b5 != 0) {
                    if (b5 == 1 || b5 == 2 || b5 == 3) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                xvu xvuVar = (xvu) suh1Var;
                fvu fvuVar = hvuVar.a;
                ai90 ai90Var = fvuVar.d;
                fbp1 fbp1Var = fvuVar.e;
                if ((fbp1Var instanceof wwp0) || (fbp1Var instanceof iwp0) || (fbp1Var instanceof kwp0)) {
                    this.c = null;
                    this.b = (byte) 1;
                    if (xvuVar.g(fvuVar, this) != d9nVar) {
                        return rih1Var;
                    }
                } else if (fvuVar.c) {
                    y5v0 y5v0Var = (y5v0) xvuVar.X;
                    this.c = null;
                    this.b = (byte) 2;
                    if (eko1.C(ai90Var, y5v0Var, this) != d9nVar) {
                        return rih1Var;
                    }
                } else {
                    if (hvuVar.c) {
                        ((drp0) xvuVar.Y).g(5, ai90Var.c());
                        return rih1Var;
                    }
                    if (hvuVar.b) {
                        ((i1r0) xvuVar.t).a(ai90Var.c());
                        return rih1Var;
                    }
                    if (!fvuVar.b) {
                        return rih1Var;
                    }
                    this.c = null;
                    this.b = (byte) 3;
                    if (xvuVar.g(fvuVar, this) != d9nVar) {
                        return rih1Var;
                    }
                }
                return d9nVar;
            default:
                suh1 suh1Var2 = suh1Var;
                String str8 = (String) suh1Var2.d;
                y4m1 y4m1Var = (y4m1) suh1Var2.e;
                q5m1 q5m1Var = (q5m1) this.c;
                byte b6 = this.b;
                if (b6 == 0) {
                    hm5.M(obj);
                    if (q5m1Var instanceof p5m1) {
                        this.c = null;
                        this.b = (byte) 1;
                        if (y4m1Var.e(str8, this, true) != d9nVar) {
                            q4m1Var = new q4m1(suh1Var2, (lnm) null);
                            this.c = null;
                            this.b = (byte) 2;
                            if (smo1.s(q4m1Var, this) != d9nVar) {
                                return rih1Var;
                            }
                        }
                    } else {
                        if (!(q5m1Var instanceof o5m1)) {
                            eg.o();
                            return null;
                        }
                        this.c = null;
                        this.b = (byte) 3;
                        if (y4m1Var.e(str8, this, false) != d9nVar) {
                            return rih1Var;
                        }
                    }
                } else {
                    if (b6 != 1) {
                        if (b6 == 2 || b6 == 3) {
                            hm5.M(obj);
                            return rih1Var;
                        }
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    q4m1Var = new q4m1(suh1Var2, (lnm) null);
                    this.c = null;
                    this.b = (byte) 2;
                    if (smo1.s(q4m1Var, this) != d9nVar) {
                        return rih1Var;
                    }
                }
                return d9nVar;
        }
    }
}
