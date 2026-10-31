package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import spotify.your_library.esperanto.proto.YourLibraryResponse;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class o010 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;

    public /* synthetic */ o010(byte b, Object obj, vr20 vr20Var) {
        this.a = b;
        this.b = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(mr20 mr20Var, lnm lnmVar) {
        gu20 gu20Var;
        if (lnmVar instanceof gu20) {
            gu20Var = (gu20) lnmVar;
            int i = gu20Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gu20Var.c = i - Integer.MIN_VALUE;
            } else {
                gu20Var = new gu20(this, lnmVar);
            }
        } else {
            gu20Var = new gu20(this, lnmVar);
        }
        Object obj = gu20Var.a;
        int i2 = gu20Var.c;
        if (i2 == 0) {
            hm5.M(obj);
            gu20Var.c = 1;
            Object objS = l4p1.s(this.b, mr20Var, gu20Var);
            d9n d9nVar = d9n.a;
            if (objS == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:130:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:148:0x0223  */
    /* JADX WARN: Code duplicated, block: B:168:0x0268  */
    /* JADX WARN: Code duplicated, block: B:186:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:201:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:220:0x0347  */
    /* JADX WARN: Code duplicated, block: B:238:0x0381  */
    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:263:0x041f  */
    /* JADX WARN: Code duplicated, block: B:278:0x045a  */
    /* JADX WARN: Code duplicated, block: B:298:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:318:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:338:0x0534  */
    /* JADX WARN: Code duplicated, block: B:353:0x056f  */
    /* JADX WARN: Code duplicated, block: B:368:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:394:0x0608  */
    /* JADX WARN: Code duplicated, block: B:409:0x0640  */
    /* JADX WARN: Code duplicated, block: B:424:0x067c  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:447:0x06e2  */
    /* JADX WARN: Code duplicated, block: B:464:0x0721  */
    /* JADX WARN: Code duplicated, block: B:479:0x0770  */
    /* JADX WARN: Code duplicated, block: B:497:0x07ad  */
    /* JADX WARN: Code duplicated, block: B:514:0x07eb  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:79:0x012e  */
    /* JADX WARN: Code duplicated, block: B:98:0x016b  */
    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    public final Object emit(Object obj, lnm lnmVar) {
        n010 n010Var;
        q010 q010Var;
        s010 s010Var;
        t010 t010Var;
        h110 h110Var;
        e310 e310Var;
        g3f a3fVar;
        i810 i810Var;
        vc10 vc10Var;
        ne10 ne10Var;
        wd10 ud10Var;
        oe10 oe10Var;
        pe10 pe10Var;
        lg10 lg10Var;
        kby kbyVar;
        mg10 mg10Var;
        ng10 ng10Var;
        ku10 ku10Var;
        lz10 lz10Var;
        he20 he20Var;
        df20 df20Var;
        xh20 xh20Var;
        ek20 ek20Var;
        gk20 gk20Var;
        int i;
        an20 an20Var;
        or20 or20Var;
        pr20 pr20Var;
        tu20 tu20Var;
        rv20 rv20Var;
        sv20 sv20Var;
        tv20 tv20Var;
        uv20 uv20Var;
        byte b = this.a;
        String strE = "pending";
        pv20 pv20Var = pv20.a;
        pv20 pv20Var2 = pv20.b;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        r2q0 r2q0Var = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof n010) {
                    n010Var = (n010) lnmVar;
                    int i2 = n010Var.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        n010Var.b = i2 - Integer.MIN_VALUE;
                    } else {
                        n010Var = new n010(this, lnmVar);
                    }
                } else {
                    n010Var = new n010(this, lnmVar);
                }
                Object obj2 = n010Var.a;
                int i3 = n010Var.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                mmr0 mmr0Var = (mmr0) obj;
                if (((dvl1) mmr0Var.b).a <= ((dvl1) mmr0Var.a).a) {
                    return rih1Var;
                }
                n010Var.b = 1;
                return vr20Var.emit(obj, n010Var) == d9nVar ? d9nVar : rih1Var;
            case 1:
                if (lnmVar instanceof q010) {
                    q010Var = (q010) lnmVar;
                    int i4 = q010Var.b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        q010Var.b = i4 - Integer.MIN_VALUE;
                    } else {
                        q010Var = new q010(this, lnmVar);
                    }
                } else {
                    q010Var = new q010(this, lnmVar);
                }
                Object obj3 = q010Var.a;
                int i5 = q010Var.b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                Object obj4 = ((dvl1) ((mmr0) obj).b).b;
                if (obj4 == null) {
                    return rih1Var;
                }
                q010Var.b = 1;
                return vr20Var.emit(obj4, q010Var) == d9nVar ? d9nVar : rih1Var;
            case 2:
                if (lnmVar instanceof s010) {
                    s010Var = (s010) lnmVar;
                    int i6 = s010Var.b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        s010Var.b = i6 - Integer.MIN_VALUE;
                    } else {
                        s010Var = new s010(this, lnmVar);
                    }
                } else {
                    s010Var = new s010(this, lnmVar);
                }
                Object obj5 = s010Var.a;
                int i7 = s010Var.b;
                if (i7 == 0) {
                    hm5.M(obj5);
                    Boolean boolValueOf = Boolean.valueOf(((pp90) obj) != null);
                    s010Var.b = 1;
                    return vr20Var.emit(boolValueOf, s010Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i7 == 1) {
                    hm5.M(obj5);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                if (lnmVar instanceof t010) {
                    t010Var = (t010) lnmVar;
                    int i8 = t010Var.b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        t010Var.b = i8 - Integer.MIN_VALUE;
                    } else {
                        t010Var = new t010(this, lnmVar);
                    }
                } else {
                    t010Var = new t010(this, lnmVar);
                }
                Object obj6 = t010Var.a;
                int i9 = t010Var.b;
                if (i9 != 0) {
                    if (i9 == 1) {
                        hm5.M(obj6);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj6);
                gbl gblVar = (gbl) obj;
                gblVar.getClass();
                List list = r110.a;
                Boolean boolValueOf2 = Boolean.valueOf(p7h.M(new gbl[]{gbl.X, gbl.Y}).contains(gblVar));
                t010Var.b = 1;
                return vr20Var.emit(boolValueOf2, t010Var) == d9nVar ? d9nVar : rih1Var;
            case 4:
                if (lnmVar instanceof h110) {
                    h110Var = (h110) lnmVar;
                    int i10 = h110Var.b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        h110Var.b = i10 - Integer.MIN_VALUE;
                    } else {
                        h110Var = new h110(this, lnmVar);
                    }
                } else {
                    h110Var = new h110(this, lnmVar);
                }
                Object obj7 = h110Var.a;
                int i11 = h110Var.b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        hm5.M(obj7);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj7);
                if (!((syc) obj).a().c) {
                    return rih1Var;
                }
                h110Var.b = 1;
                return vr20Var.emit(obj, h110Var) == d9nVar ? d9nVar : rih1Var;
            case 5:
                if (lnmVar instanceof e310) {
                    e310Var = (e310) lnmVar;
                    int i12 = e310Var.b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        e310Var.b = i12 - Integer.MIN_VALUE;
                    } else {
                        e310Var = new e310(this, lnmVar);
                    }
                } else {
                    e310Var = new e310(this, lnmVar);
                }
                Object obj8 = e310Var.a;
                int i13 = e310Var.b;
                if (i13 == 0) {
                    hm5.M(obj8);
                    a310 a310Var = (a310) obj;
                    d310 d310Var = a310Var.a;
                    long j = a310Var.b;
                    if (d310Var instanceof c310) {
                        a3fVar = new g3f(pro1.w(((c310) d310Var).a), j);
                    } else if (d310Var instanceof b310) {
                        b310 b310Var = (b310) d310Var;
                        a3fVar = new a3f(b310Var.a.a, pro1.w(b310Var.b), j);
                    } else {
                        eg.o();
                    }
                    e310Var.b = 1;
                    return vr20Var.emit(a3fVar, e310Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i13 == 1) {
                    hm5.M(obj8);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                if (lnmVar instanceof i810) {
                    i810Var = (i810) lnmVar;
                    int i14 = i810Var.b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        i810Var.b = i14 - Integer.MIN_VALUE;
                    } else {
                        i810Var = new i810(this, lnmVar);
                    }
                } else {
                    i810Var = new i810(this, lnmVar);
                }
                Object obj9 = i810Var.a;
                int i15 = i810Var.b;
                if (i15 == 0) {
                    hm5.M(obj9);
                    Boolean boolValueOf3 = Boolean.valueOf(((h810) obj).a);
                    i810Var.b = 1;
                    return vr20Var.emit(boolValueOf3, i810Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i15 == 1) {
                    hm5.M(obj9);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                if (lnmVar instanceof vc10) {
                    vc10Var = (vc10) lnmVar;
                    int i16 = vc10Var.b;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        vc10Var.b = i16 - Integer.MIN_VALUE;
                    } else {
                        vc10Var = new vc10(this, lnmVar);
                    }
                } else {
                    vc10Var = new vc10(this, lnmVar);
                }
                Object obj10 = vc10Var.a;
                int i17 = vc10Var.b;
                if (i17 == 0) {
                    hm5.M(obj10);
                    k1r k1rVar = ((rc10) obj).b;
                    vc10Var.b = 1;
                    return vr20Var.emit(k1rVar, vc10Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i17 == 1) {
                    hm5.M(obj10);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 8:
                if (lnmVar instanceof ne10) {
                    ne10Var = (ne10) lnmVar;
                    int i18 = ne10Var.b;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        ne10Var.b = i18 - Integer.MIN_VALUE;
                    } else {
                        ne10Var = new ne10(this, lnmVar);
                    }
                } else {
                    ne10Var = new ne10(this, lnmVar);
                }
                Object obj11 = ne10Var.a;
                int i19 = ne10Var.b;
                if (i19 == 0) {
                    hm5.M(obj11);
                    y2a y2aVar = (y2a) obj;
                    if (u890.j(y2aVar, v2a.a)) {
                        ud10Var = wd10.a;
                    } else if (u890.j(y2aVar, u2a.a)) {
                        ud10Var = vd10.a;
                    } else if (y2aVar instanceof t2a) {
                        ud10Var = new ud10(((t2a) y2aVar).a);
                    } else {
                        eg.o();
                    }
                    ne10Var.b = 1;
                    return vr20Var.emit(ud10Var, ne10Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i19 == 1) {
                    hm5.M(obj11);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
                if (lnmVar instanceof oe10) {
                    oe10Var = (oe10) lnmVar;
                    int i20 = oe10Var.b;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        oe10Var.b = i20 - Integer.MIN_VALUE;
                    } else {
                        oe10Var = new oe10(this, lnmVar);
                    }
                } else {
                    oe10Var = new oe10(this, lnmVar);
                }
                Object obj12 = oe10Var.a;
                int i21 = oe10Var.b;
                if (i21 == 0) {
                    hm5.M(obj12);
                    be10 be10Var = new be10((xd10) obj);
                    oe10Var.b = 1;
                    return vr20Var.emit(be10Var, oe10Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i21 == 1) {
                    hm5.M(obj12);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 10:
                if (lnmVar instanceof pe10) {
                    pe10Var = (pe10) lnmVar;
                    int i22 = pe10Var.b;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        pe10Var.b = i22 - Integer.MIN_VALUE;
                    } else {
                        pe10Var = new pe10(this, lnmVar);
                    }
                } else {
                    pe10Var = new pe10(this, lnmVar);
                }
                Object obj13 = pe10Var.a;
                int i23 = pe10Var.b;
                if (i23 == 0) {
                    hm5.M(obj13);
                    ae10 ae10Var = new ae10((List) obj);
                    pe10Var.b = 1;
                    return vr20Var.emit(ae10Var, pe10Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i23 == 1) {
                    hm5.M(obj13);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 11:
                if (lnmVar instanceof lg10) {
                    lg10Var = (lg10) lnmVar;
                    int i24 = lg10Var.b;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        lg10Var.b = i24 - Integer.MIN_VALUE;
                    } else {
                        lg10Var = new lg10(this, lnmVar);
                    }
                } else {
                    lg10Var = new lg10(this, lnmVar);
                }
                Object obj14 = lg10Var.a;
                int i25 = lg10Var.b;
                if (i25 != 0) {
                    if (i25 == 1) {
                        hm5.M(obj14);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj14);
                wsc0 wsc0Var = (wsc0) ((py21) obj).c();
                if (wsc0Var != null && (kbyVar = wsc0Var.f) != null) {
                    r2q0Var = kbyVar.n;
                }
                lg10Var.b = 1;
                return vr20Var.emit(r2q0Var, lg10Var) == d9nVar ? d9nVar : rih1Var;
            case 12:
                if (lnmVar instanceof mg10) {
                    mg10Var = (mg10) lnmVar;
                    int i26 = mg10Var.b;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        mg10Var.b = i26 - Integer.MIN_VALUE;
                    } else {
                        mg10Var = new mg10(this, lnmVar);
                    }
                } else {
                    mg10Var = new mg10(this, lnmVar);
                }
                Object obj15 = mg10Var.a;
                int i27 = mg10Var.b;
                if (i27 != 0) {
                    if (i27 == 1) {
                        hm5.M(obj15);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj15);
                Map map = (Map) obj;
                Boolean boolValueOf4 = Boolean.valueOf(y7y0.G(map) || y7y0.L(map));
                mg10Var.b = 1;
                return vr20Var.emit(boolValueOf4, mg10Var) == d9nVar ? d9nVar : rih1Var;
            case 13:
                if (lnmVar instanceof ng10) {
                    ng10Var = (ng10) lnmVar;
                    int i28 = ng10Var.b;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        ng10Var.b = i28 - Integer.MIN_VALUE;
                    } else {
                        ng10Var = new ng10(this, lnmVar);
                    }
                } else {
                    ng10Var = new ng10(this, lnmVar);
                }
                Object obj16 = ng10Var.a;
                int i29 = ng10Var.b;
                if (i29 != 0) {
                    if (i29 == 1) {
                        hm5.M(obj16);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj16);
                Map map2 = (Map) obj;
                if (!y7y0.L(map2) && yto.j((String) map2.get("pick-and-shuffle"))) {
                    z = true;
                }
                Boolean boolValueOf5 = Boolean.valueOf(z);
                ng10Var.b = 1;
                return vr20Var.emit(boolValueOf5, ng10Var) == d9nVar ? d9nVar : rih1Var;
            case 14:
                if (lnmVar instanceof ku10) {
                    ku10Var = (ku10) lnmVar;
                    int i30 = ku10Var.b;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        ku10Var.b = i30 - Integer.MIN_VALUE;
                    } else {
                        ku10Var = new ku10(this, lnmVar);
                    }
                } else {
                    ku10Var = new ku10(this, lnmVar);
                }
                Object obj17 = ku10Var.a;
                int i31 = ku10Var.b;
                if (i31 == 0) {
                    hm5.M(obj17);
                    nu10 nu10Var = new nu10((uv10) obj);
                    ku10Var.b = 1;
                    return vr20Var.emit(nu10Var, ku10Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i31 == 1) {
                    hm5.M(obj17);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 15:
                if (lnmVar instanceof lz10) {
                    lz10Var = (lz10) lnmVar;
                    int i32 = lz10Var.b;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        lz10Var.b = i32 - Integer.MIN_VALUE;
                    } else {
                        lz10Var = new lz10(this, lnmVar);
                    }
                } else {
                    lz10Var = new lz10(this, lnmVar);
                }
                Object obj18 = lz10Var.a;
                int i33 = lz10Var.b;
                if (i33 != 0) {
                    if (i33 == 1) {
                        hm5.M(obj18);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj18);
                h290 h290VarN = ((YourLibraryResponse) obj).n();
                ArrayList<YourLibraryDecoratedEntityOuterClass.YourLibraryDecoratedEntity> arrayList = new ArrayList();
                for (Object obj19 : h290VarN) {
                    if (((YourLibraryDecoratedEntityOuterClass.YourLibraryDecoratedEntity) obj19).hasPlaylist()) {
                        arrayList.add(obj19);
                    }
                }
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                for (YourLibraryDecoratedEntityOuterClass.YourLibraryDecoratedEntity yourLibraryDecoratedEntity : arrayList) {
                    arrayList2.add(new snu0(yourLibraryDecoratedEntity.e().getUri(), yourLibraryDecoratedEntity.e().getName(), yourLibraryDecoratedEntity.w().o(), yourLibraryDecoratedEntity.e().q()));
                }
                lz10Var.b = 1;
                return vr20Var.emit(arrayList2, lz10Var) == d9nVar ? d9nVar : rih1Var;
            case 16:
                if (lnmVar instanceof he20) {
                    he20Var = (he20) lnmVar;
                    int i34 = he20Var.b;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        he20Var.b = i34 - Integer.MIN_VALUE;
                    } else {
                        he20Var = new he20(this, lnmVar);
                    }
                } else {
                    he20Var = new he20(this, lnmVar);
                }
                Object obj20 = he20Var.a;
                int i35 = he20Var.b;
                if (i35 != 0) {
                    if (i35 == 1) {
                        hm5.M(obj20);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj20);
                String str = (String) obj;
                if (str == null) {
                    str = "";
                }
                he20Var.b = 1;
                return vr20Var.emit(str, he20Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                if (lnmVar instanceof df20) {
                    df20Var = (df20) lnmVar;
                    int i36 = df20Var.b;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        df20Var.b = i36 - Integer.MIN_VALUE;
                    } else {
                        df20Var = new df20(this, lnmVar);
                    }
                } else {
                    df20Var = new df20(this, lnmVar);
                }
                Object obj21 = df20Var.a;
                int i37 = df20Var.b;
                if (i37 != 0) {
                    if (i37 == 1) {
                        hm5.M(obj21);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj21);
                List<ye20> list2 = (List) obj;
                ArrayList arrayList3 = new ArrayList(q7h.U(list2, 10));
                for (ye20 ye20Var : list2) {
                    arrayList3.add(new xe20(ye20Var.c, ye20Var.a, ye20Var.b, ye20Var.d));
                }
                df20Var.b = 1;
                return vr20Var.emit(arrayList3, df20Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                if (lnmVar instanceof xh20) {
                    xh20Var = (xh20) lnmVar;
                    int i38 = xh20Var.b;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        xh20Var.b = i38 - Integer.MIN_VALUE;
                    } else {
                        xh20Var = new xh20(this, lnmVar);
                    }
                } else {
                    xh20Var = new xh20(this, lnmVar);
                }
                Object obj22 = xh20Var.a;
                int i39 = xh20Var.b;
                if (i39 == 0) {
                    hm5.M(obj22);
                    String string = ihc1.e1((String) obj).toString();
                    xh20Var.b = 1;
                    return vr20Var.emit(string, xh20Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i39 == 1) {
                    hm5.M(obj22);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                if (lnmVar instanceof ek20) {
                    ek20Var = (ek20) lnmVar;
                    int i40 = ek20Var.b;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        ek20Var.b = i40 - Integer.MIN_VALUE;
                    } else {
                        ek20Var = new ek20(this, lnmVar);
                    }
                } else {
                    ek20Var = new ek20(this, lnmVar);
                }
                Object obj23 = ek20Var.a;
                int i41 = ek20Var.b;
                if (i41 != 0) {
                    if (i41 == 1) {
                        hm5.M(obj23);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj23);
                ik20 ik20Var = (ik20) obj;
                xen xenVar = new xen(ik20Var != null ? ik20Var.b : "pending");
                ek20Var.b = 1;
                return vr20Var.emit(xenVar, ek20Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                if (lnmVar instanceof gk20) {
                    gk20Var = (gk20) lnmVar;
                    int i42 = gk20Var.b;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        gk20Var.b = i42 - Integer.MIN_VALUE;
                    } else {
                        gk20Var = new gk20(this, lnmVar);
                    }
                } else {
                    gk20Var = new gk20(this, lnmVar);
                }
                Object obj24 = gk20Var.a;
                int i43 = gk20Var.b;
                if (i43 != 0) {
                    if (i43 == 1) {
                        hm5.M(obj24);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj24);
                ik20 ik20Var2 = (ik20) obj;
                if (ik20Var2 != null && (i = ik20Var2.a) != 0) {
                    strE = bb00.e(i);
                }
                yen yenVar = new yen(strE);
                gk20Var.b = 1;
                return vr20Var.emit(yenVar, gk20Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                if (lnmVar instanceof an20) {
                    an20Var = (an20) lnmVar;
                    int i44 = an20Var.b;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        an20Var.b = i44 - Integer.MIN_VALUE;
                    } else {
                        an20Var = new an20(this, lnmVar);
                    }
                } else {
                    an20Var = new an20(this, lnmVar);
                }
                Object obj25 = an20Var.a;
                int i45 = an20Var.b;
                if (i45 == 0) {
                    hm5.M(obj25);
                    Boolean boolValueOf6 = Boolean.valueOf(((u6g1) obj).b.d == 2);
                    an20Var.b = 1;
                    return vr20Var.emit(boolValueOf6, an20Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i45 == 1) {
                    hm5.M(obj25);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 22:
                if (lnmVar instanceof or20) {
                    or20Var = (or20) lnmVar;
                    int i46 = or20Var.b;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        or20Var.b = i46 - Integer.MIN_VALUE;
                    } else {
                        or20Var = new or20(this, lnmVar);
                    }
                } else {
                    or20Var = new or20(this, lnmVar);
                }
                Object obj26 = or20Var.a;
                int i47 = or20Var.b;
                if (i47 != 0) {
                    if (i47 == 1) {
                        hm5.M(obj26);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj26);
                if (!((Boolean) obj).booleanValue()) {
                    return rih1Var;
                }
                or20Var.b = 1;
                return vr20Var.emit(obj, or20Var) == d9nVar ? d9nVar : rih1Var;
            case 23:
                if (lnmVar instanceof pr20) {
                    pr20Var = (pr20) lnmVar;
                    int i48 = pr20Var.b;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        pr20Var.b = i48 - Integer.MIN_VALUE;
                    } else {
                        pr20Var = new pr20(this, lnmVar);
                    }
                } else {
                    pr20Var = new pr20(this, lnmVar);
                }
                Object obj27 = pr20Var.a;
                int i49 = pr20Var.b;
                if (i49 == 0) {
                    hm5.M(obj27);
                    ((Boolean) obj).getClass();
                    pr20Var.b = 1;
                    return vr20Var.emit(rih1Var, pr20Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i49 == 1) {
                    hm5.M(obj27);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return b((mr20) obj, lnmVar);
            case 25:
                if (lnmVar instanceof tu20) {
                    tu20Var = (tu20) lnmVar;
                    int i50 = tu20Var.b;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        tu20Var.b = i50 - Integer.MIN_VALUE;
                    } else {
                        tu20Var = new tu20(this, lnmVar);
                    }
                } else {
                    tu20Var = new tu20(this, lnmVar);
                }
                Object obj28 = tu20Var.a;
                int i51 = tu20Var.b;
                if (i51 != 0) {
                    if (i51 == 1) {
                        hm5.M(obj28);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj28);
                if (obj == null) {
                    return rih1Var;
                }
                tu20Var.b = 1;
                return vr20Var.emit(obj, tu20Var) == d9nVar ? d9nVar : rih1Var;
            case 26:
                if (lnmVar instanceof rv20) {
                    rv20Var = (rv20) lnmVar;
                    int i52 = rv20Var.b;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        rv20Var.b = i52 - Integer.MIN_VALUE;
                    } else {
                        rv20Var = new rv20(this, lnmVar);
                    }
                } else {
                    rv20Var = new rv20(this, lnmVar);
                }
                Object obj29 = rv20Var.a;
                int i53 = rv20Var.b;
                if (i53 != 0) {
                    if (i53 == 1) {
                        hm5.M(obj29);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj29);
                String lowerCase = ((String) obj).toLowerCase(Locale.ROOT);
                if (!lowerCase.equals("premium")) {
                    lowerCase.equals("free");
                    pv20Var = pv20Var2;
                }
                rv20Var.b = 1;
                return vr20Var.emit(pv20Var, rv20Var) == d9nVar ? d9nVar : rih1Var;
            case 27:
                if (lnmVar instanceof sv20) {
                    sv20Var = (sv20) lnmVar;
                    int i54 = sv20Var.b;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        sv20Var.b = i54 - Integer.MIN_VALUE;
                    } else {
                        sv20Var = new sv20(this, lnmVar);
                    }
                } else {
                    sv20Var = new sv20(this, lnmVar);
                }
                Object obj30 = sv20Var.a;
                int i55 = sv20Var.b;
                if (i55 == 0) {
                    hm5.M(obj30);
                    Boolean boolValueOf7 = Boolean.valueOf(((pv20) obj) == pv20Var);
                    sv20Var.b = 1;
                    return vr20Var.emit(boolValueOf7, sv20Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i55 == 1) {
                    hm5.M(obj30);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 28:
                if (lnmVar instanceof tv20) {
                    tv20Var = (tv20) lnmVar;
                    int i56 = tv20Var.b;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        tv20Var.b = i56 - Integer.MIN_VALUE;
                    } else {
                        tv20Var = new tv20(this, lnmVar);
                    }
                } else {
                    tv20Var = new tv20(this, lnmVar);
                }
                Object obj31 = tv20Var.a;
                int i57 = tv20Var.b;
                if (i57 == 0) {
                    hm5.M(obj31);
                    Boolean boolValueOf8 = Boolean.valueOf(((pv20) obj) == pv20Var2);
                    tv20Var.b = 1;
                    return vr20Var.emit(boolValueOf8, tv20Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i57 == 1) {
                    hm5.M(obj31);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (lnmVar instanceof uv20) {
                    uv20Var = (uv20) lnmVar;
                    int i58 = uv20Var.b;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        uv20Var.b = i58 - Integer.MIN_VALUE;
                    } else {
                        uv20Var = new uv20(this, lnmVar);
                    }
                } else {
                    uv20Var = new uv20(this, lnmVar);
                }
                Object obj32 = uv20Var.a;
                int i59 = uv20Var.b;
                if (i59 == 0) {
                    hm5.M(obj32);
                    Boolean boolValueOf9 = Boolean.valueOf(y7y0.L((Map) obj));
                    uv20Var.b = 1;
                    return vr20Var.emit(boolValueOf9, uv20Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i59 == 1) {
                    hm5.M(obj32);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public /* synthetic */ o010(vr20 vr20Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }
}
