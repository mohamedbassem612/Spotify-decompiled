package p;

import android.content.Context;
import android.content.res.Resources;
import com.spotify.home.evopage.mobius.Event;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$ListFilteringStore;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$UserFilters;
import com.spotify.listplatform.sortingimpl.ListSortingProto$ListSortingStore;
import com.spotify.listplatform.sortingimpl.ListSortingProto$UserSortOrders;
import com.spotify.mobius.functions.Consumer;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import spotify.playlist.esperanto.proto.PlaylistGetResponse;
import spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto;
import spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto$ItemProgress;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ap70 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public ap70(vr20 vr20Var, b1n0 b1n0Var, t0n0 t0n0Var, zf30 zf30Var) {
        this.a = (byte) 19;
        this.b = vr20Var;
        this.c = b1n0Var;
        this.d = zf30Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object b(Object obj, lnm lnmVar) {
        c6p0 c6p0Var;
        zkt0 zkt0Var;
        if (lnmVar instanceof c6p0) {
            c6p0Var = (c6p0) lnmVar;
            int i = c6p0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                c6p0Var.b = i - Integer.MIN_VALUE;
            } else {
                c6p0Var = new c6p0(this, lnmVar);
            }
        } else {
            c6p0Var = new c6p0(this, lnmVar);
        }
        Object obj2 = c6p0Var.a;
        int i2 = c6p0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            PlayerState playerState = (PlayerState) obj;
            drj0 drj0Var = (drj0) this.c;
            hfu0 hfu0Var = (hfu0) this.d;
            ContextTrack contextTrack = (ContextTrack) playerState.track().h();
            if (contextTrack != null && loo1.x(playerState, ((yb7) drj0Var.b).c) && u890.j(contextTrack.uri(), hfu0Var.a) && u890.j(contextTrack.uid(), hfu0Var.e)) {
                zkt0Var = (!playerState.isPlaying() || playerState.isPaused()) ? zkt0.b : zkt0.a;
            } else {
                zkt0Var = zkt0.c;
            }
            c6p0Var.b = 1;
            Object objEmit = vr20Var.emit(zkt0Var, c6p0Var);
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

    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    private final Object c(Object obj, lnm lnmVar) {
        z6p0 z6p0Var;
        knn0 knn0VarB;
        w6p0 w6p0Var = (w6p0) this.d;
        b7p0 b7p0Var = (b7p0) this.c;
        lnn0 lnn0Var = b7p0Var.f;
        if (lnmVar instanceof z6p0) {
            z6p0Var = (z6p0) lnmVar;
            int i = z6p0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                z6p0Var.b = i - Integer.MIN_VALUE;
            } else {
                z6p0Var = new z6p0(this, lnmVar);
            }
        } else {
            z6p0Var = new z6p0(this, lnmVar);
        }
        z6p0 z6p0Var2 = z6p0Var;
        Object obj2 = z6p0Var2.a;
        int i2 = z6p0Var2.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            Boolean bool = (Boolean) obj;
            t6p0 t6p0Var = w6p0Var.a;
            boolean z = t6p0Var instanceof u6p0;
            onr0 onr0Var = onr0.b;
            if (z) {
                knn0VarB = lnn0.b(lnn0Var, onr0Var, 2);
            } else {
                if (!(t6p0Var instanceof t6p0)) {
                    eg.o();
                    return null;
                }
                knn0VarB = t6p0Var.a == null ? lnn0.b(lnn0Var, onr0.c, 1) : lnn0.b(lnn0Var, onr0Var, 4);
            }
            czf0 czf0Var = new czf0((zob1) b7p0Var.g.getValue(), new j2i(-382138696, new c9o(knn0VarB, w6p0Var, bool, b7p0Var, (byte) 3), true));
            z6p0Var2.b = 1;
            Object objEmit = vr20Var.emit(czf0Var, z6p0Var2);
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

    private final Object e(Object obj, lnm lnmVar) {
        Set setM0 = z561.m0(new fp20(new i46((List) obj, (byte) 1), new xr1((c380) this.c, (byte) 6), new cix0((byte) 16)));
        Set set = (Set) this.b;
        Set setV0 = dm61.v0(setM0, set);
        ven0 ven0Var = (ven0) this.d;
        Iterator it = setV0.iterator();
        while (it.hasNext()) {
            ((iu30) ven0Var.getValue()).invoke((s3t0) it.next());
        }
        set.addAll(setM0);
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:130:0x0248  */
    /* JADX WARN: Code duplicated, block: B:155:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:176:0x0329  */
    /* JADX WARN: Code duplicated, block: B:215:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:22:0x006b  */
    /* JADX WARN: Code duplicated, block: B:231:0x0420  */
    /* JADX WARN: Code duplicated, block: B:251:0x0476  */
    /* JADX WARN: Code duplicated, block: B:267:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:291:0x0516  */
    /* JADX WARN: Code duplicated, block: B:323:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:373:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:404:0x0758  */
    /* JADX WARN: Code duplicated, block: B:430:0x07c7  */
    /* JADX WARN: Code duplicated, block: B:447:0x081b  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:464:0x086f  */
    /* JADX WARN: Code duplicated, block: B:481:0x08c2  */
    /* JADX WARN: Code duplicated, block: B:505:0x094b  */
    /* JADX WARN: Code duplicated, block: B:560:0x0a3b  */
    /* JADX WARN: Code duplicated, block: B:577:0x0a84  */
    /* JADX WARN: Code duplicated, block: B:647:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0145  */
    public final Object emit(Object obj, lnm lnmVar) {
        zo70 zo70Var;
        wv70 wv70Var;
        Object objF;
        em90 em90Var;
        LinkedHashMap linkedHashMapF;
        cm90 cm90Var;
        k7c0 k7c0Var;
        nsc0 nsc0Var;
        psc0 psc0Var;
        ztc0 ztc0Var;
        int i;
        mmr0 mmr0Var;
        Map mapO;
        q3d0 q3d0Var;
        vr20 vr20Var;
        int i2;
        Map mapP;
        jod0 jod0Var;
        czd0 czd0Var;
        q2e0 q2e0Var;
        cq60 cq60VarH;
        v3f0 v3f0Var;
        w7f0 w7f0Var;
        hyj0 hyj0Var;
        wok0 wok0Var;
        List listSingletonList;
        jom0 jom0Var;
        vr20 vr20Var2;
        q0n0 q0n0Var;
        r0n0 r0n0Var;
        lik1 lik1Var;
        kun0 kun0Var;
        lik1 lik1Var2;
        f3p0 f3p0Var;
        c9p0 c9p0Var;
        byte b = this.a;
        int i3 = 0;
        z = false;
        boolean z = false;
        Object obj2 = d9n.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        Object obj6 = rih1.a;
        gzg0 arrayList = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof zo70) {
                    zo70Var = (zo70) lnmVar;
                    int i4 = zo70Var.b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        zo70Var.b = i4 - Integer.MIN_VALUE;
                    } else {
                        zo70Var = new zo70(this, lnmVar);
                    }
                } else {
                    zo70Var = new zo70(this, lnmVar);
                }
                Object obj7 = zo70Var.a;
                int i5 = zo70Var.b;
                if (i5 == 0) {
                    hm5.M(obj7);
                    Boolean bool = (Boolean) obj;
                    String str = ((hti0) obj3).a;
                    bool.getClass();
                    jhm jhmVarP = ((st60) ((jl1) obj4).e).p(str, 2, bool.booleanValue());
                    zo70Var.b = 1;
                    if (((vr20) obj5).emit(jhmVarP, zo70Var) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i5 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj7);
                }
                return obj6;
            case 1:
                if (lnmVar instanceof wv70) {
                    wv70Var = (wv70) lnmVar;
                    int i6 = wv70Var.b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        wv70Var.b = i6 - Integer.MIN_VALUE;
                    } else {
                        wv70Var = new wv70(this, lnmVar);
                    }
                } else {
                    wv70Var = new wv70(this, lnmVar);
                }
                Object obj8 = wv70Var.a;
                int i7 = wv70Var.b;
                if (i7 == 0) {
                    hm5.M(obj8);
                    rv70 rv70Var = new rv70((pv70) obj4, (ArrayList) obj3, (Set) obj);
                    wv70Var.b = 1;
                    if (((vr20) obj5).emit(rv70Var, wv70Var) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i7 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj8);
                }
                return obj6;
            case 2:
                dv0 dv0Var = (dv0) obj;
                b890 b890Var = (b890) obj5;
                if (dv0Var.b()) {
                    objF = b890Var.f(t790.a, lnmVar);
                    if (objF != obj2) {
                        return obj6;
                    }
                } else {
                    if (dv0Var.b || dv0Var.d == 0) {
                        return obj6;
                    }
                    ((ven0) obj3).setValue(Boolean.TRUE);
                    objF = b890Var.f(new s790((String) obj4), lnmVar);
                    if (objF != obj2) {
                        return obj6;
                    }
                }
                return objF;
            case 3:
                if (lnmVar instanceof em90) {
                    em90Var = (em90) lnmVar;
                    int i8 = em90Var.b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        em90Var.b = i8 - Integer.MIN_VALUE;
                    } else {
                        em90Var = new em90(this, lnmVar);
                    }
                } else {
                    em90Var = new em90(this, lnmVar);
                }
                Object obj9 = em90Var.a;
                int i9 = em90Var.b;
                if (i9 == 0) {
                    hm5.M(obj9);
                    vr20 vr20Var3 = (vr20) obj5;
                    ResumptionProgressEsperanto.GetProgressResponse getProgressResponse = (ResumptionProgressEsperanto.GetProgressResponse) obj;
                    hm90 hm90Var = (hm90) obj4;
                    Set setP1 = o7h.p1((List) obj3);
                    if (getProgressResponse.n() != w831.RESPONSE_RESULT_SUCCESS) {
                        linkedHashMapF = hm90Var.f(setP1);
                    } else {
                        List itemsList = getProgressResponse.getItemsList();
                        ArrayList<ResumptionProgressEsperanto.ProgressItem> arrayList2 = new ArrayList();
                        for (Object obj10 : itemsList) {
                            if (setP1.contains(((ResumptionProgressEsperanto.ProgressItem) obj10).n())) {
                                arrayList2.add(obj10);
                            }
                        }
                        ArrayList arrayList3 = new ArrayList();
                        for (ResumptionProgressEsperanto.ProgressItem progressItem : arrayList2) {
                            progressItem.getClass();
                            if (!progressItem.s() || progressItem.q()) {
                                ResumptionProgressEsperanto$ItemProgress resumptionProgressEsperanto$ItemProgressO = progressItem.o().o();
                                if (progressItem.p() != r831.c || ((progressItem.t() && progressItem.r() == y831.STATE_FINISHED) || !progressItem.o().q() || resumptionProgressEsperanto$ItemProgressO.p() <= 0 || resumptionProgressEsperanto$ItemProgressO.n() <= 0)) {
                                    cm90Var = null;
                                } else {
                                    cm90Var = new cm90(resumptionProgressEsperanto$ItemProgressO.n(), resumptionProgressEsperanto$ItemProgressO.p(), progressItem.o().p());
                                }
                            } else {
                                cm90Var = null;
                            }
                            mmr0 mmr0Var2 = cm90Var != null ? new mmr0(progressItem.n(), cm90Var) : null;
                            if (mmr0Var2 != null) {
                                arrayList3.add(mmr0Var2);
                            }
                        }
                        Map mapT = sqg0.T(arrayList3);
                        Set set = setP1;
                        int iS = zno1.s(q7h.U(set, 10));
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iS >= 16 ? iS : 16);
                        for (Object obj11 : set) {
                            cm90 cm90Var2 = (cm90) mapT.get((String) obj11);
                            linkedHashMap.put(obj11, cm90Var2 != null ? new j3r(cm90Var2) : hm90Var.g);
                        }
                        linkedHashMapF = linkedHashMap;
                    }
                    em90Var.b = 1;
                    if (vr20Var3.emit(linkedHashMapF, em90Var) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i9 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj9);
                }
                return obj6;
            case 4:
                if (lnmVar instanceof k7c0) {
                    k7c0Var = (k7c0) lnmVar;
                    int i10 = k7c0Var.b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        k7c0Var.b = i10 - Integer.MIN_VALUE;
                    } else {
                        k7c0Var = new k7c0(this, lnmVar);
                    }
                } else {
                    k7c0Var = new k7c0(this, lnmVar);
                }
                Object obj12 = k7c0Var.a;
                int i11 = k7c0Var.b;
                if (i11 == 0) {
                    hm5.M(obj12);
                    j7c0.a.getClass();
                    b7c0 b7c0VarA = ((m7c0) obj4).a(((dma1) obj3).e(i7c0.b, (String) null));
                    k7c0Var.b = 1;
                    if (((vr20) obj5).emit(b7c0VarA, k7c0Var) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i11 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj12);
                }
                return obj6;
            case 5:
                if (lnmVar instanceof nsc0) {
                    nsc0Var = (nsc0) lnmVar;
                    int i12 = nsc0Var.b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        nsc0Var.b = i12 - Integer.MIN_VALUE;
                    } else {
                        nsc0Var = new nsc0(this, lnmVar);
                    }
                } else {
                    nsc0Var = new nsc0(this, lnmVar);
                }
                Object obj13 = nsc0Var.a;
                int i13 = nsc0Var.b;
                if (i13 == 0) {
                    hm5.M(obj13);
                    PlaylistGetResponse playlistGetResponse = (PlaylistGetResponse) obj;
                    py21 py21VarL = i2x0.l(playlistGetResponse.r(), ((qvc0) obj4).a, new dsc0((rsc0) obj3, playlistGetResponse, (byte) 4));
                    nsc0Var.b = 1;
                    if (((vr20) obj5).emit(py21VarL, nsc0Var) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i13 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj13);
                }
                return obj6;
            case 6:
                if (lnmVar instanceof psc0) {
                    psc0Var = (psc0) lnmVar;
                    int i14 = psc0Var.b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        psc0Var.b = i14 - Integer.MIN_VALUE;
                    } else {
                        psc0Var = new psc0(this, lnmVar);
                    }
                } else {
                    psc0Var = new psc0(this, lnmVar);
                }
                Object obj14 = psc0Var.a;
                int i15 = psc0Var.b;
                if (i15 == 0) {
                    hm5.M(obj14);
                    PlaylistGetResponse playlistGetResponse2 = (PlaylistGetResponse) obj;
                    py21 py21VarL2 = i2x0.l(playlistGetResponse2.r(), ((rxc0) obj4).a, new dsc0((rsc0) obj3, playlistGetResponse2, (byte) 5));
                    psc0Var.b = 1;
                    if (((vr20) obj5).emit(py21VarL2, psc0Var) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i15 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj14);
                }
                return obj6;
            case 7:
                String str2 = (String) obj3;
                haa0 haa0Var = (haa0) obj4;
                if (lnmVar instanceof ztc0) {
                    ztc0Var = (ztc0) lnmVar;
                    int i16 = ztc0Var.b;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        ztc0Var.b = i16 - Integer.MIN_VALUE;
                    } else {
                        ztc0Var = new ztc0(this, lnmVar);
                    }
                } else {
                    ztc0Var = new ztc0(this, lnmVar);
                }
                Object obj15 = ztc0Var.a;
                int i17 = ztc0Var.b;
                if (i17 == 0) {
                    hm5.M(obj15);
                    vr20 vr20Var4 = (vr20) obj5;
                    ListFilteringProto$ListFilteringStore listFilteringProto$ListFilteringStore = (ListFilteringProto$ListFilteringStore) obj;
                    ListFilteringProto$UserFilters listFilteringProto$UserFilters = (ListFilteringProto$UserFilters) listFilteringProto$ListFilteringStore.o().get((String) haa0Var.b);
                    if (listFilteringProto$UserFilters == null || (mapO = listFilteringProto$UserFilters.o()) == null) {
                        i = 1;
                    } else {
                        i = 1;
                        boolean z2 = mapO.containsKey(str2);
                        mmr0Var = new mmr0(Boolean.valueOf(z2), haa0Var.r(listFilteringProto$ListFilteringStore, str2));
                        ztc0Var.b = i;
                        if (vr20Var4.emit(mmr0Var, ztc0Var) == obj2) {
                            return obj2;
                        }
                    }
                    mmr0Var = new mmr0(Boolean.valueOf(z2), haa0Var.r(listFilteringProto$ListFilteringStore, str2));
                    ztc0Var.b = i;
                    if (vr20Var4.emit(mmr0Var, ztc0Var) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i17 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj15);
                }
                return obj6;
            case 8:
                r3d0 r3d0Var = (r3d0) obj4;
                String str3 = (String) obj3;
                if (lnmVar instanceof q3d0) {
                    q3d0Var = (q3d0) lnmVar;
                    int i18 = q3d0Var.b;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        q3d0Var.b = i18 - Integer.MIN_VALUE;
                    } else {
                        q3d0Var = new q3d0(this, lnmVar);
                    }
                } else {
                    q3d0Var = new q3d0(this, lnmVar);
                }
                Object objB = q3d0Var.a;
                int i19 = q3d0Var.b;
                if (i19 != 0) {
                    if (i19 == 1) {
                        i2 = q3d0Var.d;
                        vr20Var = q3d0Var.c;
                        hm5.M(objB);
                    } else {
                        if (i19 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(objB);
                    }
                    return obj6;
                }
                hm5.M(objB);
                vr20Var = (vr20) obj5;
                ListSortingProto$UserSortOrders listSortingProto$UserSortOrders = (ListSortingProto$UserSortOrders) ((ListSortingProto$ListSortingStore) obj).o().get(r3d0Var.a);
                String str4 = (listSortingProto$UserSortOrders == null || (mapP = listSortingProto$UserSortOrders.p()) == null) ? null : (String) mapP.get(str3);
                if (str4 != null) {
                    objB = ot11.B(str4, s3d0.a(listSortingProto$UserSortOrders, str3));
                    i2 = 0;
                } else {
                    q3d0Var.c = vr20Var;
                    q3d0Var.d = 0;
                    q3d0Var.b = 1;
                    objB = r3d0Var.b(str3, q3d0Var);
                    if (objB == obj2) {
                        return obj2;
                    }
                    i2 = 0;
                }
                q3d0Var.c = null;
                q3d0Var.d = i2;
                q3d0Var.b = 2;
                if (vr20Var.emit(objB, q3d0Var) == obj2) {
                    return obj2;
                }
                return obj6;
            case 9:
                ArrayList arrayList4 = (ArrayList) obj3;
                if (lnmVar instanceof jod0) {
                    jod0Var = (jod0) lnmVar;
                    int i20 = jod0Var.b;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        jod0Var.b = i20 - Integer.MIN_VALUE;
                    } else {
                        jod0Var = new jod0(this, lnmVar);
                    }
                } else {
                    jod0Var = new jod0(this, lnmVar);
                }
                Object obj16 = jod0Var.a;
                int i21 = jod0Var.b;
                if (i21 == 0) {
                    hm5.M(obj16);
                    vr20 vr20Var5 = (vr20) obj5;
                    uv00 uv00Var = (uv00) obj;
                    ArrayList arrayList5 = (ArrayList) obj4;
                    int iS2 = zno1.s(q7h.U(arrayList5, 10));
                    if (iS2 < 16) {
                        iS2 = 16;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS2);
                    for (Object obj17 : arrayList5) {
                        String str5 = (String) obj17;
                        j6k j6kVar = uv00Var.a(j6k.class, str5).b;
                        mmr0 mmr0Var3 = new mmr0(j6k.class, j6kVar != null ? new goj0(j6kVar) : new foj0(2));
                        lhe0 lhe0Var = uv00Var.a(lhe0.class, str5).b;
                        linkedHashMap2.put(obj17, sqg0.J(new mmr0[]{mmr0Var3, new mmr0(lhe0.class, lhe0Var != null ? new goj0(lhe0Var) : new foj0(2))}));
                    }
                    ioj0 ioj0Var = new ioj0(linkedHashMap2);
                    if (!arrayList4.isEmpty()) {
                        int iS3 = zno1.s(q7h.U(arrayList4, 10));
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iS3 >= 16 ? iS3 : 16);
                        for (Object obj18 : arrayList4) {
                            String str6 = (String) obj18;
                            jo70 jo70Var = uv00Var.a(jo70.class, str6).b;
                            mmr0 mmr0Var4 = new mmr0(jo70.class, jo70Var != null ? new goj0(jo70Var) : new foj0(2));
                            xkk1 xkk1Var = uv00Var.a(xkk1.class, str6).b;
                            linkedHashMap3.put(obj18, sqg0.J(new mmr0[]{mmr0Var4, new mmr0(xkk1.class, xkk1Var != null ? new goj0(xkk1Var) : new foj0(2))}));
                        }
                        ioj0Var = ioj0Var.a(linkedHashMap3, false);
                    }
                    jod0Var.b = 1;
                    if (vr20Var5.emit(ioj0Var, jod0Var) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i21 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj16);
                }
                return obj6;
            case 10:
                p811 p811Var = (p811) obj4;
                if (lnmVar instanceof czd0) {
                    czd0Var = (czd0) lnmVar;
                    int i22 = czd0Var.b;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        czd0Var.b = i22 - Integer.MIN_VALUE;
                    } else {
                        czd0Var = new czd0(this, lnmVar);
                    }
                } else {
                    czd0Var = new czd0(this, lnmVar);
                }
                Object obj19 = czd0Var.a;
                int i23 = czd0Var.b;
                if (i23 != 0) {
                    if (i23 == 1 || i23 == 2) {
                        hm5.M(obj19);
                        return obj6;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj19);
                vr20 vr20Var6 = (vr20) obj5;
                pld0 pld0Var = (pld0) obj;
                if (pld0Var instanceof nld0) {
                    bzd0 bzd0Var = new bzd0(iud0.d, ((nld0) pld0Var).a);
                    czd0Var.b = 1;
                    if (vr20Var6.emit(bzd0Var, czd0Var) == obj2) {
                        return obj2;
                    }
                } else if (pld0Var instanceof mld0) {
                    bzd0 bzd0Var2 = new bzd0(iud0.e, ((mld0) pld0Var).a);
                    czd0Var.b = 2;
                    if (vr20Var6.emit(bzd0Var2, czd0Var) == obj2) {
                        return obj2;
                    }
                } else {
                    if (!(pld0Var instanceof old0)) {
                        eg.o();
                        return null;
                    }
                    Object obj20 = p811Var.a;
                    boolean z3 = ((old0) pld0Var).a;
                    if (!u890.j(obj20, Boolean.valueOf(z3))) {
                        p811Var.a = Boolean.valueOf(z3);
                        ((Consumer) obj3).accept(new fyd0(z3));
                    }
                }
                return obj6;
            case 11:
                l811 l811Var = (l811) obj4;
                if (lnmVar instanceof q2e0) {
                    q2e0Var = (q2e0) lnmVar;
                    int i24 = q2e0Var.b;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        q2e0Var.b = i24 - Integer.MIN_VALUE;
                    } else {
                        q2e0Var = new q2e0(this, lnmVar);
                    }
                } else {
                    q2e0Var = new q2e0(this, lnmVar);
                }
                Object obj21 = q2e0Var.a;
                int i25 = q2e0Var.b;
                if (i25 == 0) {
                    hm5.M(obj21);
                    vr20 vr20Var7 = (vr20) obj5;
                    Event.GotSlotBasedHomeContent gotSlotBasedHomeContent = (Event.GotSlotBasedHomeContent) obj;
                    if (l811Var.a) {
                        y2e0 y2e0Var = (y2e0) obj3;
                        if (gotSlotBasedHomeContent != null && (cq60VarH = n3p1.h(gotSlotBasedHomeContent.getLoadSource())) != null) {
                            y2e0Var.k.i(cq60VarH);
                        }
                        l811Var.a = false;
                    }
                    q2e0Var.b = 1;
                    if (vr20Var7.emit(gotSlotBasedHomeContent, q2e0Var) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i25 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj21);
                }
                return obj6;
            case 12:
                if (lnmVar instanceof v3f0) {
                    v3f0Var = (v3f0) lnmVar;
                    int i26 = v3f0Var.b;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        v3f0Var.b = i26 - Integer.MIN_VALUE;
                    } else {
                        v3f0Var = new v3f0(this, lnmVar);
                    }
                } else {
                    v3f0Var = new v3f0(this, lnmVar);
                }
                Object obj22 = v3f0Var.a;
                int i27 = v3f0Var.b;
                if (i27 == 0) {
                    hm5.M(obj22);
                    List list = (List) obj;
                    list.getClass();
                    z3f0 z3f0VarB = ((x3f0) obj4).b(((gpt) obj3).a, list);
                    v3f0Var.b = 1;
                    if (((vr20) obj5).emit(z3f0VarB, v3f0Var) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i27 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj22);
                }
                return obj6;
            case 13:
                if (lnmVar instanceof w7f0) {
                    w7f0Var = (w7f0) lnmVar;
                    int i28 = w7f0Var.b;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        w7f0Var.b = i28 - Integer.MIN_VALUE;
                    } else {
                        w7f0Var = new w7f0(this, lnmVar);
                    }
                } else {
                    w7f0Var = new w7f0(this, lnmVar);
                }
                Object obj23 = w7f0Var.a;
                int i29 = w7f0Var.b;
                if (i29 == 0) {
                    hm5.M(obj23);
                    vr20 vr20Var8 = (vr20) obj5;
                    gzg0 hd80Var = new hd80(obj6, (xpw) ((y880) obj4).b.get());
                    if (((Boolean) obj).booleanValue() && ((gpt) obj3).b == 1) {
                        arrayList = hd80Var;
                    }
                    w7f0Var.b = 1;
                    if (vr20Var8.emit(arrayList, w7f0Var) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i29 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj23);
                }
                return obj6;
            case 14:
                if (lnmVar instanceof hyj0) {
                    hyj0Var = (hyj0) lnmVar;
                    int i30 = hyj0Var.b;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        hyj0Var.b = i30 - Integer.MIN_VALUE;
                    } else {
                        hyj0Var = new hyj0(this, lnmVar);
                    }
                } else {
                    hyj0Var = new hyj0(this, lnmVar);
                }
                Object obj24 = hyj0Var.a;
                int i31 = hyj0Var.b;
                if (i31 == 0) {
                    hm5.M(obj24);
                    jhm jhmVarF = ((pzx) obj4).f(((hti0) obj3).a, ((ibk0) obj).equals(ebk0.a));
                    hyj0Var.b = 1;
                    if (((vr20) obj5).emit(jhmVarF, hyj0Var) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i31 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj24);
                }
                return obj6;
            case 15:
                fkc1 fkc1Var = (fkc1) o7h.t0(((Number) obj).intValue(), (c380) obj5);
                if (fkc1Var != null && fkc1Var != ((kkk0) obj4).a.b) {
                    ((iu30) obj3).invoke(new xjk0(fkc1Var));
                }
                return obj6;
            case 16:
                String str7 = (String) obj4;
                if (lnmVar instanceof wok0) {
                    wok0Var = (wok0) lnmVar;
                    int i32 = wok0Var.b;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        wok0Var.b = i32 - Integer.MIN_VALUE;
                    } else {
                        wok0Var = new wok0(this, lnmVar);
                    }
                } else {
                    wok0Var = new wok0(this, lnmVar);
                }
                Object obj25 = wok0Var.a;
                int i33 = wok0Var.b;
                if (i33 == 0) {
                    hm5.M(obj25);
                    vr20 vr20Var9 = (vr20) obj5;
                    v761 v761Var = (y761) obj;
                    v761 v761Var2 = v761Var instanceof v761 ? v761Var : null;
                    if (v761Var2 != null) {
                        ArrayList arrayList6 = v761Var2.a;
                        arrayList = new ArrayList();
                        for (Object obj26 : arrayList6) {
                            if (!u890.j((String) obj26, str7)) {
                                arrayList.add(obj26);
                            }
                        }
                    }
                    if (arrayList == null || arrayList.size() <= 1) {
                        listSingletonList = z6x.a;
                    } else {
                        ljd1 ljd1Var = new ljd1(str7, (String) ((drj0) obj3).c, arrayList);
                        listSingletonList = Collections.singletonList(new h8k1(ljd1Var, ljd1Var));
                    }
                    wok0Var.b = 1;
                    if (vr20Var9.emit(listSingletonList, wok0Var) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i33 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj25);
                }
                return obj6;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                if (lnmVar instanceof jom0) {
                    jom0Var = (jom0) lnmVar;
                    int i34 = jom0Var.b;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        jom0Var.b = i34 - Integer.MIN_VALUE;
                    } else {
                        jom0Var = new jom0(this, lnmVar);
                    }
                } else {
                    jom0Var = new jom0(this, lnmVar);
                }
                Object objD = jom0Var.a;
                int i35 = jom0Var.b;
                if (i35 != 0) {
                    if (i35 == 1) {
                        i3 = jom0Var.d;
                        vr20Var2 = jom0Var.c;
                        hm5.M(objD);
                    } else {
                        if (i35 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(objD);
                    }
                    return obj6;
                }
                hm5.M(objD);
                vr20Var2 = (vr20) obj5;
                String str8 = ((hti0) obj3).a;
                jom0Var.c = vr20Var2;
                jom0Var.d = 0;
                jom0Var.b = 1;
                objD = ((pzx) obj4).d(str8, (String) obj, jom0Var);
                if (objD == obj2) {
                    return obj2;
                }
                jom0Var.c = null;
                jom0Var.d = i3;
                jom0Var.b = 2;
                if (vr20Var2.emit(objD, jom0Var) == obj2) {
                    return obj2;
                }
                return obj6;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                ((Boolean) obj).getClass();
                ((rtm0) obj4).a(new zsm0(((jtm0) ((poj0) obj3).b).a, ((i091) ((r091) obj5).g.getValue()).h instanceof k091));
                return obj6;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                b1n0 b1n0Var = (b1n0) obj4;
                if (lnmVar instanceof q0n0) {
                    q0n0Var = (q0n0) lnmVar;
                    int i36 = q0n0Var.b;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        q0n0Var.b = i36 - Integer.MIN_VALUE;
                    } else {
                        q0n0Var = new q0n0(this, lnmVar);
                    }
                } else {
                    q0n0Var = new q0n0(this, lnmVar);
                }
                Object obj27 = q0n0Var.a;
                int i37 = q0n0Var.b;
                if (i37 == 0) {
                    hm5.M(obj27);
                    vr20 vr20Var10 = (vr20) obj5;
                    gzg0 gzg0Var = (u0n0) b1n0Var.i.get((gvn0) obj);
                    if (gzg0Var != null || ((gzg0Var = (u0n0) b1n0Var.t.get(mno1.n((zf30) obj3))) != null && !((u0n0) gzg0Var).g)) {
                        arrayList = gzg0Var;
                    }
                    q0n0Var.b = 1;
                    if (vr20Var10.emit(arrayList, q0n0Var) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i37 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj27);
                }
                return obj6;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                if (lnmVar instanceof r0n0) {
                    r0n0Var = (r0n0) lnmVar;
                    int i38 = r0n0Var.b;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        r0n0Var.b = i38 - Integer.MIN_VALUE;
                    } else {
                        r0n0Var = new r0n0(this, lnmVar);
                    }
                } else {
                    r0n0Var = new r0n0(this, lnmVar);
                }
                Object obj28 = r0n0Var.a;
                int i39 = r0n0Var.b;
                if (i39 == 0) {
                    hm5.M(obj28);
                    vr20 vr20Var11 = (vr20) obj5;
                    u0n0 u0n0Var = (u0n0) obj;
                    if (u0n0Var == null || (lik1Var = u0n0Var.c) == null) {
                        lik1Var = ((t0n0) obj4).c;
                    }
                    zf30 zf30Var = (zf30) obj3;
                    ssn0 ssn0Var = new ssn0(lik1Var, new p0n0(zf30Var), new o0n0(zf30Var));
                    r0n0Var.b = 1;
                    if (vr20Var11.emit(ssn0Var, r0n0Var) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i39 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj28);
                }
                return obj6;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                PlayerState playerState = (PlayerState) obj3;
                if (lnmVar instanceof kun0) {
                    kun0Var = (kun0) lnmVar;
                    int i40 = kun0Var.b;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        kun0Var.b = i40 - Integer.MIN_VALUE;
                    } else {
                        kun0Var = new kun0(this, lnmVar);
                    }
                } else {
                    kun0Var = new kun0(this, lnmVar);
                }
                Object obj29 = kun0Var.a;
                int i41 = kun0Var.b;
                if (i41 == 0) {
                    hm5.M(obj29);
                    vr20 vr20Var12 = (vr20) obj5;
                    iun0 iun0Var = (iun0) obj;
                    lun0 lun0Var = (lun0) obj4;
                    playerState.getClass();
                    if (((Boolean) lun0Var.c.e(Boolean.FALSE)).booleanValue()) {
                        dzy.c.getClass();
                        dzy dzyVarC = gtv0.c(playerState);
                        dzyVarC.getClass();
                        bx21 bx21Var = dzyVarC.a;
                        bx21 bx21Var2 = dzy.d.contains(dzyVarC) ? new bx21(2131954502) : bx21Var;
                        if (!u890.j(bx21Var2, bx21Var)) {
                            Resources resources = lun0Var.b;
                            int i42 = bx21Var2.a;
                            String string = i42 != 0 ? resources.getString(i42) : "";
                            string.getClass();
                            iun0Var = new iun0(string, iun0Var.b, iun0Var.c, iun0Var.d, iun0Var.e, iun0Var.f, iun0Var.g);
                        }
                    }
                    kun0Var.b = 1;
                    if (vr20Var12.emit(iun0Var, kun0Var) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i41 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj29);
                }
                return obj6;
            case 22:
                bn70 bn70Var = (bn70) obj;
                knn0 knn0Var = (knn0) obj3;
                if (bn70Var == null || (lik1Var2 = bn70Var.b) == null) {
                    lik1Var2 = (lik1) obj5;
                }
                ((fvn0) obj4).e.put(knn0Var, lik1Var2);
                knn0Var.a(new aar0(lik1Var2, bn70Var != null ? bn70Var.a : null, (String) null));
                return obj6;
            case 23:
                if (lnmVar instanceof f3p0) {
                    f3p0Var = (f3p0) lnmVar;
                    int i43 = f3p0Var.b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        f3p0Var.b = i43 - Integer.MIN_VALUE;
                    } else {
                        f3p0Var = new f3p0(this, lnmVar);
                    }
                } else {
                    f3p0Var = new f3p0(this, lnmVar);
                }
                Object obj30 = f3p0Var.a;
                int i44 = f3p0Var.b;
                if (i44 == 0) {
                    hm5.M(obj30);
                    vr20 vr20Var13 = (vr20) obj5;
                    if (((Boolean) obj).booleanValue()) {
                        ((qmu) obj4).getClass();
                        if (x74.j((Context) obj3, "android.permission.RECORD_AUDIO") == 0) {
                            z = true;
                        }
                    }
                    k3p0 k3p0Var = new k3p0(z);
                    f3p0Var.b = 1;
                    if (vr20Var13.emit(k3p0Var, f3p0Var) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i44 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj30);
                }
                return obj6;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return b(obj, lnmVar);
            case 25:
                return c(obj, lnmVar);
            case 26:
                if (lnmVar instanceof c9p0) {
                    c9p0Var = (c9p0) lnmVar;
                    int i45 = c9p0Var.b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        c9p0Var.b = i45 - Integer.MIN_VALUE;
                    } else {
                        c9p0Var = new c9p0(this, lnmVar);
                    }
                } else {
                    c9p0Var = new c9p0(this, lnmVar);
                }
                Object obj31 = c9p0Var.a;
                int i46 = c9p0Var.b;
                if (i46 == 0) {
                    hm5.M(obj31);
                    vr20 vr20Var14 = (vr20) obj5;
                    arrayList = ((Boolean) obj).booleanValue() ? new gzg0(((d9p0) obj4).c.getString(2131952902), (String) obj3) : null;
                    c9p0Var.b = 1;
                    if (vr20Var14.emit(arrayList, c9p0Var) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i46 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj31);
                }
                return obj6;
            case 27:
                return e(obj, lnmVar);
            case 28:
                ((AtomicBoolean) obj5).set(true);
                ((xab1) obj4).d((CancellationException) null);
                Object objB2 = ((ssw0) obj3).b((xnu) obj, lnmVar);
                return objB2 == obj2 ? objB2 : obj6;
            default:
                Object objB3 = ((ssw0) obj5).b(Boolean.valueOf(((s2s0) obj4).a((e3s0) obj3)), lnmVar);
                if (objB3 != obj2) {
                    objB3 = obj6;
                }
                return objB3 == obj2 ? objB3 : obj6;
        }
    }

    public /* synthetic */ ap70(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
