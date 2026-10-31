package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerQueue;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class buc0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ String c;

    public /* synthetic */ buc0(vr20 vr20Var, Object obj, String str, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object b(Object obj, lnm lnmVar) {
        iv01 iv01Var;
        if (lnmVar instanceof iv01) {
            iv01Var = (iv01) lnmVar;
            int i = iv01Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                iv01Var.b = i - Integer.MIN_VALUE;
            } else {
                iv01Var = new iv01(this, lnmVar);
            }
        } else {
            iv01Var = new iv01(this, lnmVar);
        }
        Object obj2 = iv01Var.a;
        int i2 = iv01Var.b;
        Integer num = null;
        if (i2 == 0) {
            hm5.M(obj2);
            String str = this.c;
            hix0 hix0Var = (iix0) ((Map) obj).get(str);
            boolean z = hix0Var instanceof gix0;
            boolean z2 = z || ((hix0Var instanceof hix0) && hix0Var.a);
            gix0 gix0Var = z ? (gix0) hix0Var : null;
            if (gix0Var != null) {
                long j = gix0Var.b;
                if (j > 0) {
                    num = new Integer((int) ((gix0Var.c * 100) / j));
                }
            }
            jv01 jv01Var = new jv01(num, str, z2, hix0Var != null ? hix0Var.g() : false);
            iv01Var.b = 1;
            Object objEmit = this.b.emit(jv01Var, iv01Var);
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

    /* JADX WARN: Code duplicated, block: B:101:0x01be  */
    /* JADX WARN: Code duplicated, block: B:119:0x0205  */
    /* JADX WARN: Code duplicated, block: B:137:0x0248  */
    /* JADX WARN: Code duplicated, block: B:152:0x0285  */
    /* JADX WARN: Code duplicated, block: B:167:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:189:0x0312  */
    /* JADX WARN: Code duplicated, block: B:207:0x0353  */
    /* JADX WARN: Code duplicated, block: B:226:0x0394  */
    /* JADX WARN: Code duplicated, block: B:245:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:275:0x0456  */
    /* JADX WARN: Code duplicated, block: B:282:0x0469  */
    /* JADX WARN: Code duplicated, block: B:317:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:327:0x050d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0081  */
    /* JADX WARN: Code duplicated, block: B:342:0x054c  */
    /* JADX WARN: Code duplicated, block: B:362:0x0596  */
    /* JADX WARN: Code duplicated, block: B:377:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:394:0x061b  */
    /* JADX WARN: Code duplicated, block: B:404:0x063b  */
    /* JADX WARN: Code duplicated, block: B:419:0x0674  */
    /* JADX WARN: Code duplicated, block: B:434:0x06af  */
    /* JADX WARN: Code duplicated, block: B:449:0x06ea  */
    /* JADX WARN: Code duplicated, block: B:464:0x0729  */
    /* JADX WARN: Code duplicated, block: B:482:0x076a  */
    /* JADX WARN: Code duplicated, block: B:500:0x07aa  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:549:0x085e  */
    /* JADX WARN: Code duplicated, block: B:560:0x0888  */
    /* JADX WARN: Code duplicated, block: B:583:0x08dc  */
    /* JADX WARN: Code duplicated, block: B:600:0x0919  */
    /* JADX WARN: Code duplicated, block: B:663:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0140  */
    /* JADX WARN: Code duplicated, block: B:86:0x017f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0031  */
    public final Object emit(Object obj, lnm lnmVar) {
        auc0 auc0Var;
        xcd0 xcd0Var;
        i5g0 i5g0Var;
        gyg0 gyg0Var;
        int iNextIndex;
        String str;
        vah0 vah0Var;
        f9i0 f9i0Var;
        kuj0 kuj0Var;
        dum0 dum0Var;
        x7n0 x7n0Var;
        ozo0 ozo0Var;
        cip0 cip0Var;
        k3r0 k3r0Var;
        r4r0 r4r0Var;
        goj0 goj0VarA;
        f8r0 f8r0Var;
        ulr0 ulr0Var;
        ylr0 ylr0Var;
        goj0 goj0VarA2;
        goj0 goj0VarA3;
        z4s0 z4s0Var;
        x5s0 x5s0Var;
        x5s0 x5s0Var2;
        dst0 dst0Var;
        fst0 fst0Var;
        rtt0 rtt0Var;
        w1u0 w1u0Var;
        fku0 fku0Var;
        q4v0 q4v0Var;
        gjx0 gjx0Var;
        hlx0 hlx0Var;
        laz0 laz0Var;
        naz0 naz0Var;
        cez0 cez0Var;
        va01 va01Var;
        vk11 vk11Var;
        byte b = this.a;
        yrt0 yrt0Var = yrt0.b;
        int i = 0;
        z = false;
        boolean z = false;
        z = false;
        boolean z2 = false;
        z = false;
        z = false;
        boolean z3 = false;
        rih1 rih1Var = rih1.a;
        String str2 = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        djs0 l6g0Var = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof auc0) {
                    auc0Var = (auc0) lnmVar;
                    int i2 = auc0Var.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        auc0Var.b = i2 - Integer.MIN_VALUE;
                    } else {
                        auc0Var = new auc0(this, lnmVar);
                    }
                } else {
                    auc0Var = new auc0(this, lnmVar);
                }
                Object obj2 = auc0Var.a;
                int i3 = auc0Var.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                Map map = (Map) obj;
                Boolean boolValueOf = Boolean.valueOf(map.containsKey(str2));
                w7x w7xVar = (Set) map.get(str2);
                if (w7xVar == null) {
                    w7xVar = w7x.a;
                }
                mmr0 mmr0Var = new mmr0(boolValueOf, w7xVar);
                auc0Var.b = 1;
                return vr20Var.emit(mmr0Var, auc0Var) == d9nVar ? d9nVar : rih1Var;
            case 1:
                if (lnmVar instanceof xcd0) {
                    xcd0Var = (xcd0) lnmVar;
                    int i4 = xcd0Var.b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        xcd0Var.b = i4 - Integer.MIN_VALUE;
                    } else {
                        xcd0Var = new xcd0(this, lnmVar);
                    }
                } else {
                    xcd0Var = new xcd0(this, lnmVar);
                }
                Object obj3 = xcd0Var.a;
                int i5 = xcd0Var.b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                if (!u890.j((String) obj, str2)) {
                    return rih1Var;
                }
                xcd0Var.b = 1;
                return vr20Var.emit(obj, xcd0Var) == d9nVar ? d9nVar : rih1Var;
            case 2:
                if (lnmVar instanceof i5g0) {
                    i5g0Var = (i5g0) lnmVar;
                    int i6 = i5g0Var.b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        i5g0Var.b = i6 - Integer.MIN_VALUE;
                    } else {
                        i5g0Var = new i5g0(this, lnmVar);
                    }
                } else {
                    i5g0Var = new i5g0(this, lnmVar);
                }
                Object obj4 = i5g0Var.a;
                int i7 = i5g0Var.b;
                if (i7 == 0) {
                    hm5.M(obj4);
                    pr91 pr91Var = (pr91) obj;
                    if (u890.j(pr91Var, or91.a)) {
                        l6g0Var = new l6g0(str2);
                    } else if (!u890.j(pr91Var, nr91.a)) {
                        eg.o();
                    }
                    if (l6g0Var == null) {
                        return rih1Var;
                    }
                    i5g0Var.b = 1;
                    return vr20Var.emit(l6g0Var, i5g0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i7 == 1) {
                    hm5.M(obj4);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                if (lnmVar instanceof gyg0) {
                    gyg0Var = (gyg0) lnmVar;
                    int i8 = gyg0Var.b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        gyg0Var.b = i8 - Integer.MIN_VALUE;
                    } else {
                        gyg0Var = new gyg0(this, lnmVar);
                    }
                } else {
                    gyg0Var = new gyg0(this, lnmVar);
                }
                Object obj5 = gyg0Var.a;
                int i9 = gyg0Var.b;
                if (i9 != 0) {
                    if (i9 == 1) {
                        hm5.M(obj5);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj5);
                List list = ((rnc0) obj).b;
                Iterator it = list.iterator();
                while (true) {
                    iNextIndex = -1;
                    if (it.hasNext()) {
                        Object obj6 = ((h8k1) it.next()).a;
                        if (obj6 instanceof n5h0) {
                            str = ((n5h0) obj6).c;
                        } else if (obj6 instanceof i5h0) {
                            str = ((i5h0) obj6).c;
                        } else if (obj6 instanceof v5h0) {
                            str = ((v5h0) obj6).c;
                        } else if (obj6 instanceof k5h0) {
                            str = ((k5h0) obj6).c;
                        } else if (obj6 instanceof u5h0) {
                            str = ((u5h0) obj6).c;
                        } else if (obj6 instanceof s5h0) {
                            str = ((s5h0) obj6).c;
                        } else {
                            str = obj6 instanceof w5h0 ? ((w5h0) obj6).c : null;
                        }
                        if (!u890.j(str, str2)) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                djs0 p6i1Var = i < 0 ? null : new p6i1(i, ((h8k1) list.get(i)).b);
                if (p6i1Var != null) {
                    l6g0Var = p6i1Var;
                } else {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (listIterator.hasPrevious()) {
                        if (!(((h8k1) listIterator.previous()).a instanceof q5h0)) {
                            iNextIndex = listIterator.nextIndex();
                            if (iNextIndex >= 0) {
                                l6g0Var = new p6i1(iNextIndex, ((h8k1) list.get(iNextIndex)).b);
                            }
                        }
                    }
                    if (iNextIndex >= 0) {
                        l6g0Var = new p6i1(iNextIndex, ((h8k1) list.get(iNextIndex)).b);
                    }
                }
                if (l6g0Var == null) {
                    return rih1Var;
                }
                gyg0Var.b = 1;
                return vr20Var.emit(l6g0Var, gyg0Var) == d9nVar ? d9nVar : rih1Var;
            case 4:
                if (lnmVar instanceof vah0) {
                    vah0Var = (vah0) lnmVar;
                    int i10 = vah0Var.b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        vah0Var.b = i10 - Integer.MIN_VALUE;
                    } else {
                        vah0Var = new vah0(this, lnmVar);
                    }
                } else {
                    vah0Var = new vah0(this, lnmVar);
                }
                Object obj7 = vah0Var.a;
                int i11 = vah0Var.b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        hm5.M(obj7);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj7);
                djs0 djs0Var = (tah0) obj;
                l6g0Var = u890.j(djs0Var.a, str2) ? djs0Var : null;
                vah0Var.b = 1;
                return vr20Var.emit(l6g0Var, vah0Var) == d9nVar ? d9nVar : rih1Var;
            case 5:
                if (lnmVar instanceof f9i0) {
                    f9i0Var = (f9i0) lnmVar;
                    int i12 = f9i0Var.b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        f9i0Var.b = i12 - Integer.MIN_VALUE;
                    } else {
                        f9i0Var = new f9i0(this, lnmVar);
                    }
                } else {
                    f9i0Var = new f9i0(this, lnmVar);
                }
                Object obj8 = f9i0Var.a;
                int i13 = f9i0Var.b;
                if (i13 != 0) {
                    if (i13 == 1) {
                        hm5.M(obj8);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj8);
                z6x z6xVar = (List) ((Map) obj).get(str2);
                if (z6xVar == null) {
                    z6xVar = z6x.a;
                }
                f9i0Var.b = 1;
                return vr20Var.emit(z6xVar, f9i0Var) == d9nVar ? d9nVar : rih1Var;
            case 6:
                if (lnmVar instanceof kuj0) {
                    kuj0Var = (kuj0) lnmVar;
                    int i14 = kuj0Var.b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        kuj0Var.b = i14 - Integer.MIN_VALUE;
                    } else {
                        kuj0Var = new kuj0(this, lnmVar);
                    }
                } else {
                    kuj0Var = new kuj0(this, lnmVar);
                }
                Object obj9 = kuj0Var.a;
                int i15 = kuj0Var.b;
                if (i15 == 0) {
                    hm5.M(obj9);
                    ez00 ez00Var = ((uv00) obj).a(wuj0.class, str2).b;
                    kuj0Var.b = 1;
                    return vr20Var.emit(ez00Var, kuj0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i15 == 1) {
                    hm5.M(obj9);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                if (lnmVar instanceof dum0) {
                    dum0Var = (dum0) lnmVar;
                    int i16 = dum0Var.b;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        dum0Var.b = i16 - Integer.MIN_VALUE;
                    } else {
                        dum0Var = new dum0(this, lnmVar);
                    }
                } else {
                    dum0Var = new dum0(this, lnmVar);
                }
                Object obj10 = dum0Var.a;
                int i17 = dum0Var.b;
                if (i17 == 0) {
                    hm5.M(obj10);
                    tv00 tv00VarA = ((uv00) obj).a(xkk1.class, str2);
                    dum0Var.b = 1;
                    return vr20Var.emit(tv00VarA, dum0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i17 == 1) {
                    hm5.M(obj10);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 8:
                if (lnmVar instanceof x7n0) {
                    x7n0Var = (x7n0) lnmVar;
                    int i18 = x7n0Var.b;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        x7n0Var.b = i18 - Integer.MIN_VALUE;
                    } else {
                        x7n0Var = new x7n0(this, lnmVar);
                    }
                } else {
                    x7n0Var = new x7n0(this, lnmVar);
                }
                Object obj11 = x7n0Var.a;
                int i19 = x7n0Var.b;
                if (i19 == 0) {
                    hm5.M(obj11);
                    tv00 tv00VarA2 = ((uv00) obj).a(xkk1.class, str2);
                    x7n0Var.b = 1;
                    return vr20Var.emit(tv00VarA2, x7n0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i19 == 1) {
                    hm5.M(obj11);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
                if (lnmVar instanceof ozo0) {
                    ozo0Var = (ozo0) lnmVar;
                    int i20 = ozo0Var.b;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        ozo0Var.b = i20 - Integer.MIN_VALUE;
                    } else {
                        ozo0Var = new ozo0(this, lnmVar);
                    }
                } else {
                    ozo0Var = new ozo0(this, lnmVar);
                }
                Object obj12 = ozo0Var.a;
                int i21 = ozo0Var.b;
                if (i21 == 0) {
                    hm5.M(obj12);
                    mmr0 mmr0Var2 = new mmr0(str2, obj);
                    ozo0Var.b = 1;
                    return vr20Var.emit(mmr0Var2, ozo0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i21 == 1) {
                    hm5.M(obj12);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 10:
                if (lnmVar instanceof cip0) {
                    cip0Var = (cip0) lnmVar;
                    int i22 = cip0Var.b;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        cip0Var.b = i22 - Integer.MIN_VALUE;
                    } else {
                        cip0Var = new cip0(this, lnmVar);
                    }
                } else {
                    cip0Var = new cip0(this, lnmVar);
                }
                Object obj13 = cip0Var.a;
                int i23 = cip0Var.b;
                if (i23 != 0) {
                    if (i23 == 1) {
                        hm5.M(obj13);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj13);
                PlayerState playerState = (PlayerState) obj;
                if (playerState.isPlaying() && !playerState.isPaused()) {
                    if (u890.j(playerState.contextUri(), str2)) {
                        z3 = true;
                    } else {
                        ContextTrack contextTrack = (ContextTrack) playerState.track().h();
                        if (u890.j(contextTrack != null ? l4o1.a0(contextTrack, "album_uri") : null, str2)) {
                            z3 = true;
                        }
                    }
                }
                Boolean boolValueOf2 = Boolean.valueOf(z3);
                cip0Var.b = 1;
                return vr20Var.emit(boolValueOf2, cip0Var) == d9nVar ? d9nVar : rih1Var;
            case 11:
                if (lnmVar instanceof k3r0) {
                    k3r0Var = (k3r0) lnmVar;
                    int i24 = k3r0Var.b;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        k3r0Var.b = i24 - Integer.MIN_VALUE;
                    } else {
                        k3r0Var = new k3r0(this, lnmVar);
                    }
                } else {
                    k3r0Var = new k3r0(this, lnmVar);
                }
                Object obj14 = k3r0Var.a;
                int i25 = k3r0Var.b;
                if (i25 == 0) {
                    hm5.M(obj14);
                    List listY = zl5.y(str2, (ioj0) obj);
                    k3r0Var.b = 1;
                    return vr20Var.emit(listY, k3r0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i25 == 1) {
                    hm5.M(obj14);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 12:
                if (lnmVar instanceof r4r0) {
                    r4r0Var = (r4r0) lnmVar;
                    int i26 = r4r0Var.b;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        r4r0Var.b = i26 - Integer.MIN_VALUE;
                    } else {
                        r4r0Var = new r4r0(this, lnmVar);
                    }
                } else {
                    r4r0Var = new r4r0(this, lnmVar);
                }
                Object obj15 = r4r0Var.a;
                int i27 = r4r0Var.b;
                if (i27 != 0) {
                    if (i27 == 1) {
                        hm5.M(obj15);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj15);
                hoj0 hoj0VarC = ((ioj0) obj).c(myv0.class, str2);
                if (hoj0VarC != null && (goj0VarA = hoj0VarC.a()) != null) {
                    l6g0Var = (myv0) goj0VarA.a;
                }
                r4r0Var.b = 1;
                return vr20Var.emit(l6g0Var, r4r0Var) == d9nVar ? d9nVar : rih1Var;
            case 13:
                if (lnmVar instanceof f8r0) {
                    f8r0Var = (f8r0) lnmVar;
                    int i28 = f8r0Var.b;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        f8r0Var.b = i28 - Integer.MIN_VALUE;
                    } else {
                        f8r0Var = new f8r0(this, lnmVar);
                    }
                } else {
                    f8r0Var = new f8r0(this, lnmVar);
                }
                Object obj16 = f8r0Var.a;
                int i29 = f8r0Var.b;
                if (i29 == 0) {
                    hm5.M(obj16);
                    ez00 ez00Var2 = ((uv00) obj).a(ldg1.class, str2).b;
                    f8r0Var.b = 1;
                    return vr20Var.emit(ez00Var2, f8r0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i29 == 1) {
                    hm5.M(obj16);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 14:
                if (lnmVar instanceof ulr0) {
                    ulr0Var = (ulr0) lnmVar;
                    int i30 = ulr0Var.b;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        ulr0Var.b = i30 - Integer.MIN_VALUE;
                    } else {
                        ulr0Var = new ulr0(this, lnmVar);
                    }
                } else {
                    ulr0Var = new ulr0(this, lnmVar);
                }
                Object obj17 = ulr0Var.a;
                int i31 = ulr0Var.b;
                if (i31 != 0) {
                    if (i31 == 1) {
                        hm5.M(obj17);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj17);
                ioj0 ioj0Var = (ioj0) obj;
                hoj0 hoj0VarC2 = ioj0Var.c(w281.class, str2);
                w281 w281Var = (hoj0VarC2 == null || (goj0VarA3 = hoj0VarC2.a()) == null) ? null : (w281) goj0VarA3.a;
                hoj0 hoj0VarC3 = ioj0Var.c(tlr0.class, str2);
                if (hoj0VarC3 != null && (goj0VarA2 = hoj0VarC3.a()) != null) {
                    l6g0Var = (tlr0) goj0VarA2.a;
                }
                if (l6g0Var != null) {
                    int i32 = ((tlr0) l6g0Var).f;
                    if (w281Var != null && w281Var.c && i32 == 5) {
                        ylr0Var = xlr0.a;
                    } else {
                        boolean z4 = i32 == 5;
                        String str3 = ((tlr0) l6g0Var).b;
                        String str4 = ((tlr0) l6g0Var).g;
                        if (str4.length() == 0) {
                            str4 = ((tlr0) l6g0Var).c;
                        }
                        String str5 = str4;
                        String str6 = ((tlr0) l6g0Var).h;
                        if (str6.length() == 0) {
                            str6 = ((tlr0) l6g0Var).d;
                        }
                        ylr0Var = new ylr0(str3, str5, str6, ((tlr0) l6g0Var).a, z4, ((tlr0) l6g0Var).i.b);
                    }
                } else {
                    ylr0Var = xlr0.a;
                }
                ylr0 ylr0Var2 = ylr0Var;
                ulr0Var.b = 1;
                return vr20Var.emit(ylr0Var2, ulr0Var) == d9nVar ? d9nVar : rih1Var;
            case 15:
                if (lnmVar instanceof z4s0) {
                    z4s0Var = (z4s0) lnmVar;
                    int i33 = z4s0Var.b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        z4s0Var.b = i33 - Integer.MIN_VALUE;
                    } else {
                        z4s0Var = new z4s0(this, lnmVar);
                    }
                } else {
                    z4s0Var = new z4s0(this, lnmVar);
                }
                Object obj18 = z4s0Var.a;
                int i34 = z4s0Var.b;
                if (i34 != 0) {
                    if (i34 == 1) {
                        hm5.M(obj18);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj18);
                fn0 fn0Var = (fn0) obj;
                int iC = l1d.C(fn0Var.g);
                if (iC != 2) {
                    if (iC != 3) {
                        x5s0Var2 = new x5s0(1, 12, str2, (ArrayList) null);
                    } else {
                        int i35 = fn0Var.f != 3 ? 1 : 3;
                        ArrayList arrayListA = b5s0.a(fn0Var);
                        List list2 = fn0Var.a;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            Iterator it2 = list2.iterator();
                            while (it2.hasNext()) {
                                if (((en0) it2.next()).g.a < -275) {
                                    z2 = true;
                                }
                            }
                        }
                        x5s0Var = new x5s0(i35, str2, arrayListA, z2);
                    }
                    z4s0Var.b = 1;
                    if (vr20Var.emit(x5s0Var2, z4s0Var) == d9nVar) {
                        return d9nVar;
                    }
                    return rih1Var;
                }
                x5s0Var = new x5s0(2, 8, str2, b5s0.a(fn0Var));
                x5s0Var2 = x5s0Var;
                z4s0Var.b = 1;
                if (vr20Var.emit(x5s0Var2, z4s0Var) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            case 16:
                if (lnmVar instanceof dst0) {
                    dst0Var = (dst0) lnmVar;
                    int i36 = dst0Var.b;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        dst0Var.b = i36 - Integer.MIN_VALUE;
                    } else {
                        dst0Var = new dst0(this, lnmVar);
                    }
                } else {
                    dst0Var = new dst0(this, lnmVar);
                }
                Object obj19 = dst0Var.a;
                int i37 = dst0Var.b;
                if (i37 != 0) {
                    if (i37 == 1) {
                        hm5.M(obj19);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj19);
                yrt0 yrt0Var2 = (yrt0) ((Map) obj).get(str2);
                if (yrt0Var2 != null) {
                    yrt0Var = yrt0Var2;
                }
                dst0Var.b = 1;
                return vr20Var.emit(yrt0Var, dst0Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                if (lnmVar instanceof fst0) {
                    fst0Var = (fst0) lnmVar;
                    int i38 = fst0Var.b;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        fst0Var.b = i38 - Integer.MIN_VALUE;
                    } else {
                        fst0Var = new fst0(this, lnmVar);
                    }
                } else {
                    fst0Var = new fst0(this, lnmVar);
                }
                Object obj20 = fst0Var.a;
                int i39 = fst0Var.b;
                if (i39 != 0) {
                    if (i39 == 1) {
                        hm5.M(obj20);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj20);
                yrt0 yrt0Var3 = (yrt0) ((Map) obj).get(str2);
                if (yrt0Var3 != null) {
                    yrt0Var = yrt0Var3;
                }
                fst0Var.b = 1;
                return vr20Var.emit(yrt0Var, fst0Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                if (lnmVar instanceof rtt0) {
                    rtt0Var = (rtt0) lnmVar;
                    int i40 = rtt0Var.b;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        rtt0Var.b = i40 - Integer.MIN_VALUE;
                    } else {
                        rtt0Var = new rtt0(this, lnmVar);
                    }
                } else {
                    rtt0Var = new rtt0(this, lnmVar);
                }
                Object obj21 = rtt0Var.a;
                int i41 = rtt0Var.b;
                if (i41 != 0) {
                    if (i41 == 1) {
                        hm5.M(obj21);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj21);
                utt0 utt0Var = (wtt0) ((Map) obj).get(str2);
                if (utt0Var == null) {
                    utt0Var = utt0.a;
                }
                rtt0Var.b = 1;
                return vr20Var.emit(utt0Var, rtt0Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                if (lnmVar instanceof w1u0) {
                    w1u0Var = (w1u0) lnmVar;
                    int i42 = w1u0Var.b;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        w1u0Var.b = i42 - Integer.MIN_VALUE;
                    } else {
                        w1u0Var = new w1u0(this, lnmVar);
                    }
                } else {
                    w1u0Var = new w1u0(this, lnmVar);
                }
                Object obj22 = w1u0Var.a;
                int i43 = w1u0Var.b;
                if (i43 != 0) {
                    if (i43 == 1) {
                        hm5.M(obj22);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj22);
                PlayerState playerState2 = (PlayerState) obj;
                jx00 jx00Var = o4p1.o(playerState2).equals(str2) ? playerState2.isPaused() ? jx00.b : jx00.c : jx00.a;
                w1u0Var.b = 1;
                return vr20Var.emit(jx00Var, w1u0Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                if (lnmVar instanceof fku0) {
                    fku0Var = (fku0) lnmVar;
                    int i44 = fku0Var.b;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        fku0Var.b = i44 - Integer.MIN_VALUE;
                    } else {
                        fku0Var = new fku0(this, lnmVar);
                    }
                } else {
                    fku0Var = new fku0(this, lnmVar);
                }
                Object obj23 = fku0Var.a;
                int i45 = fku0Var.b;
                if (i45 != 0) {
                    if (i45 == 1) {
                        hm5.M(obj23);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj23);
                Boolean bool = (Boolean) obj;
                bool.getClass();
                Map mapSingletonMap = Collections.singletonMap(str2, bool);
                fku0Var.b = 1;
                return vr20Var.emit(mapSingletonMap, fku0Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                if (lnmVar instanceof q4v0) {
                    q4v0Var = (q4v0) lnmVar;
                    int i46 = q4v0Var.b;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        q4v0Var.b = i46 - Integer.MIN_VALUE;
                    } else {
                        q4v0Var = new q4v0(this, lnmVar);
                    }
                } else {
                    q4v0Var = new q4v0(this, lnmVar);
                }
                Object obj24 = q4v0Var.a;
                int i47 = q4v0Var.b;
                if (i47 == 0) {
                    hm5.M(obj24);
                    Object obj25 = ((whx0) obj).a.get(str2);
                    q4v0Var.b = 1;
                    return vr20Var.emit(obj25, q4v0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i47 == 1) {
                    hm5.M(obj24);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 22:
                if (lnmVar instanceof gjx0) {
                    gjx0Var = (gjx0) lnmVar;
                    int i48 = gjx0Var.b;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        gjx0Var.b = i48 - Integer.MIN_VALUE;
                    } else {
                        gjx0Var = new gjx0(this, lnmVar);
                    }
                } else {
                    gjx0Var = new gjx0(this, lnmVar);
                }
                Object obj26 = gjx0Var.a;
                int i49 = gjx0Var.b;
                if (i49 != 0) {
                    if (i49 == 1) {
                        hm5.M(obj26);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj26);
                hix0 hix0Var = (iix0) ((whx0) obj).a.get(str2);
                if (hix0Var == null) {
                    hix0Var = f3o1.a;
                }
                gjx0Var.b = 1;
                return vr20Var.emit(hix0Var, gjx0Var) == d9nVar ? d9nVar : rih1Var;
            case 23:
                if (lnmVar instanceof hlx0) {
                    hlx0Var = (hlx0) lnmVar;
                    int i50 = hlx0Var.b;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        hlx0Var.b = i50 - Integer.MIN_VALUE;
                    } else {
                        hlx0Var = new hlx0(this, lnmVar);
                    }
                } else {
                    hlx0Var = new hlx0(this, lnmVar);
                }
                Object obj27 = hlx0Var.a;
                int i51 = hlx0Var.b;
                if (i51 != 0) {
                    if (i51 == 1) {
                        hm5.M(obj27);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj27);
                i1r i1rVar = (k1r) obj;
                mmr0 mmr0Var3 = new mmr0(str2, i1rVar instanceof i1r ? (iix0) i1rVar.a : null);
                hlx0Var.b = 1;
                return vr20Var.emit(mmr0Var3, hlx0Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                if (lnmVar instanceof laz0) {
                    laz0Var = (laz0) lnmVar;
                    int i52 = laz0Var.b;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        laz0Var.b = i52 - Integer.MIN_VALUE;
                    } else {
                        laz0Var = new laz0(this, lnmVar);
                    }
                } else {
                    laz0Var = new laz0(this, lnmVar);
                }
                Object obj28 = laz0Var.a;
                int i53 = laz0Var.b;
                if (i53 == 0) {
                    hm5.M(obj28);
                    Boolean boolValueOf3 = Boolean.valueOf(y1u0.a(str2, (PlayerQueue) obj));
                    laz0Var.b = 1;
                    return vr20Var.emit(boolValueOf3, laz0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i53 == 1) {
                    hm5.M(obj28);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 25:
                if (lnmVar instanceof naz0) {
                    naz0Var = (naz0) lnmVar;
                    int i54 = naz0Var.b;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        naz0Var.b = i54 - Integer.MIN_VALUE;
                    } else {
                        naz0Var = new naz0(this, lnmVar);
                    }
                } else {
                    naz0Var = new naz0(this, lnmVar);
                }
                Object obj29 = naz0Var.a;
                int i55 = naz0Var.b;
                if (i55 == 0) {
                    hm5.M(obj29);
                    Boolean boolValueOf4 = Boolean.valueOf(y1u0.a(str2, (PlayerQueue) obj));
                    naz0Var.b = 1;
                    return vr20Var.emit(boolValueOf4, naz0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i55 == 1) {
                    hm5.M(obj29);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 26:
                if (lnmVar instanceof cez0) {
                    cez0Var = (cez0) lnmVar;
                    int i56 = cez0Var.b;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        cez0Var.b = i56 - Integer.MIN_VALUE;
                    } else {
                        cez0Var = new cez0(this, lnmVar);
                    }
                } else {
                    cez0Var = new cez0(this, lnmVar);
                }
                Object obj30 = cez0Var.a;
                int i57 = cez0Var.b;
                if (i57 != 0) {
                    if (i57 == 1) {
                        hm5.M(obj30);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj30);
                str2.getClass();
                gu61 gu61Var = new gu61(str2);
                List<wq61> list3 = (List) obj;
                ArrayList arrayList = new ArrayList(q7h.U(list3, 10));
                for (wq61 wq61Var : list3) {
                    arrayList.add(new aez0((sq61) wq61Var.e, wq61Var.d.a));
                }
                bez0 bez0Var = new bez0(gu61Var, arrayList);
                cez0Var.b = 1;
                return vr20Var.emit(bez0Var, cez0Var) == d9nVar ? d9nVar : rih1Var;
            case 27:
                if (lnmVar instanceof va01) {
                    va01Var = (va01) lnmVar;
                    int i58 = va01Var.b;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        va01Var.b = i58 - Integer.MIN_VALUE;
                    } else {
                        va01Var = new va01(this, lnmVar);
                    }
                } else {
                    va01Var = new va01(this, lnmVar);
                }
                Object obj31 = va01Var.a;
                int i59 = va01Var.b;
                if (i59 != 0) {
                    if (i59 == 1) {
                        hm5.M(obj31);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj31);
                w281 w281Var2 = ((uv00) obj).a(w281.class, str2).b;
                if (w281Var2 != null && (!w281Var2.c)) {
                    z = true;
                }
                Boolean boolValueOf5 = Boolean.valueOf(!z);
                va01Var.b = 1;
                return vr20Var.emit(boolValueOf5, va01Var) == d9nVar ? d9nVar : rih1Var;
            case 28:
                return b(obj, lnmVar);
            default:
                if (lnmVar instanceof vk11) {
                    vk11Var = (vk11) lnmVar;
                    int i60 = vk11Var.b;
                    if ((i60 & Integer.MIN_VALUE) != 0) {
                        vk11Var.b = i60 - Integer.MIN_VALUE;
                    } else {
                        vk11Var = new vk11(this, lnmVar);
                    }
                } else {
                    vk11Var = new vk11(this, lnmVar);
                }
                Object obj32 = vk11Var.a;
                int i61 = vk11Var.b;
                if (i61 != 0) {
                    if (i61 == 1) {
                        hm5.M(obj32);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj32);
                i1r i1rVar2 = (k1r) obj;
                i1r i1rVar3 = i1rVar2 instanceof i1r ? i1rVar2 : null;
                mmr0 mmr0Var4 = new mmr0(str2, i1rVar3 != null ? (djs0) i1rVar3.a : null);
                vk11Var.b = 1;
                return vr20Var.emit(mmr0Var4, vk11Var) == d9nVar ? d9nVar : rih1Var;
        }
    }

    public /* synthetic */ buc0(vr20 vr20Var, String str, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = str;
    }
}
