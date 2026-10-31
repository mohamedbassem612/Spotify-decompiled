package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.PlayerState;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dzt implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ String c;

    public /* synthetic */ dzt(vr20 vr20Var, String str, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object b(Object obj, lnm lnmVar) {
        xba0 xba0Var;
        ns60 ns60Var;
        if (lnmVar instanceof xba0) {
            xba0Var = (xba0) lnmVar;
            int i = xba0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                xba0Var.b = i - Integer.MIN_VALUE;
            } else {
                xba0Var = new xba0(this, lnmVar);
            }
        } else {
            xba0Var = new xba0(this, lnmVar);
        }
        Object obj2 = xba0Var.a;
        int i2 = xba0Var.b;
        ns60 ns60Var2 = null;
        if (i2 == 0) {
            hm5.M(obj2);
            os60 os60Var = (os60) obj;
            if (os60Var != null && (ns60Var = os60Var.a) != null && u890.j(ns60Var.b.a, this.c) && ns60Var.e == j16.a) {
                ns60Var2 = ns60Var;
            }
            xba0Var.b = 1;
            Object objEmit = this.b.emit(ns60Var2, xba0Var);
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
    private final Object c(Object obj, lnm lnmVar) {
        zba0 zba0Var;
        Boolean boolValueOf;
        tcd0 tcd0Var;
        if (lnmVar instanceof zba0) {
            zba0Var = (zba0) lnmVar;
            int i = zba0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                zba0Var.b = i - Integer.MIN_VALUE;
            } else {
                zba0Var = new zba0(this, lnmVar);
            }
        } else {
            zba0Var = new zba0(this, lnmVar);
        }
        Object obj2 = zba0Var.a;
        int i2 = zba0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            Object obj3 = ((e331) obj).a;
            if (e331.a(obj3) == null) {
                List<ucd0> list = (List) obj3;
                boolean z = false;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (ucd0 ucd0Var : list) {
                        if (u890.j(ucd0Var.a, this.c) && (tcd0Var = ucd0Var.b) != null && tcd0Var.c) {
                            z = true;
                            break;
                        }
                    }
                }
                boolValueOf = Boolean.valueOf(z);
            } else {
                boolValueOf = Boolean.FALSE;
            }
            zba0Var.b = 1;
            Object objEmit = this.b.emit(boolValueOf, zba0Var);
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
    private final Object e(Object obj, lnm lnmVar) {
        nqa0 nqa0Var;
        if (lnmVar instanceof nqa0) {
            nqa0Var = (nqa0) lnmVar;
            int i = nqa0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                nqa0Var.b = i - Integer.MIN_VALUE;
            } else {
                nqa0Var = new nqa0(this, lnmVar);
            }
        } else {
            nqa0Var = new nqa0(this, lnmVar);
        }
        Object obj2 = nqa0Var.a;
        int i2 = nqa0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            String strE = ((dma1) obj).e(rqa0.d.I(this.c), "");
            String str = strE != null ? strE : "";
            nqa0Var.b = 1;
            Object objEmit = this.b.emit(str, nqa0Var);
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

    /* JADX WARN: Code duplicated, block: B:104:0x0186  */
    /* JADX WARN: Code duplicated, block: B:175:0x0335  */
    /* JADX WARN: Code duplicated, block: B:190:0x0374  */
    /* JADX WARN: Code duplicated, block: B:207:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:222:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:240:0x0435  */
    /* JADX WARN: Code duplicated, block: B:257:0x0476  */
    /* JADX WARN: Code duplicated, block: B:274:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:294:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:309:0x0538  */
    /* JADX WARN: Code duplicated, block: B:324:0x0579  */
    /* JADX WARN: Code duplicated, block: B:339:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:361:0x0619  */
    /* JADX WARN: Code duplicated, block: B:363:0x0621  */
    /* JADX WARN: Code duplicated, block: B:374:0x0644  */
    /* JADX WARN: Code duplicated, block: B:37:0x008c  */
    /* JADX WARN: Code duplicated, block: B:390:0x0683  */
    /* JADX WARN: Code duplicated, block: B:414:0x06c5  */
    /* JADX WARN: Code duplicated, block: B:432:0x070c  */
    /* JADX WARN: Code duplicated, block: B:460:0x076c  */
    /* JADX WARN: Code duplicated, block: B:484:0x07e1  */
    /* JADX WARN: Code duplicated, block: B:501:0x081f  */
    /* JADX WARN: Code duplicated, block: B:516:0x085e  */
    /* JADX WARN: Code duplicated, block: B:531:0x08a4  */
    /* JADX WARN: Code duplicated, block: B:546:0x08eb  */
    /* JADX WARN: Code duplicated, block: B:568:0x093e  */
    /* JADX WARN: Code duplicated, block: B:583:0x0982  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:683:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:684:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0146  */
    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    public final Object emit(Object obj, lnm lnmVar) {
        czt cztVar;
        boolean z;
        boolean z2;
        Boolean boolValueOf;
        wow wowVar;
        yow yowVar;
        zow zowVar;
        fqy fqyVar;
        tuy tuyVar;
        vuy vuyVar;
        b3z b3zVar;
        qgw0 rgw0Var;
        y8z y8zVar;
        or00 or00Var;
        nv00 nv00Var;
        gvd0 gvd0Var;
        String str;
        ugf ugfVar;
        c210 c210Var;
        qv20 qv20Var;
        yv20 yv20Var;
        aw20 aw20Var;
        h530 h530Var;
        hr30 hr30Var;
        z840 z840Var;
        mm40 mm40Var;
        sk50 sk50Var;
        xr60 xr60Var;
        lf90 lf90Var;
        fm90 fm90Var;
        z6x z6xVarM;
        rs90 rs90Var;
        wu90 wu90Var;
        wba0 wba0Var;
        b1b0 b1b0Var;
        muf0 muf0Var;
        byte b = this.a;
        boolean z3 = false;
        rih1 rih1Var = rih1.a;
        String str2 = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        r3s0 r3s0Var = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof czt) {
                    cztVar = (czt) lnmVar;
                    int i = cztVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        cztVar.b = i - Integer.MIN_VALUE;
                    } else {
                        cztVar = new czt(this, lnmVar);
                    }
                } else {
                    cztVar = new czt(this, lnmVar);
                }
                Object obj2 = cztVar.a;
                int i2 = cztVar.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                szt sztVar = (szt) obj;
                if (sztVar == null) {
                    boolValueOf = Boolean.FALSE;
                } else {
                    Set set = sztVar.c.a;
                    if ((set instanceof Collection) && set.isEmpty()) {
                        z = false;
                    } else {
                        Iterator it = set.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = false;
                            } else if (u890.j(((o89) it.next()).a, str2)) {
                                z = true;
                            }
                        }
                    }
                    Set set2 = sztVar.b.c;
                    if ((set2 instanceof Collection) && set2.isEmpty()) {
                        z2 = false;
                    } else {
                        Iterator it2 = set2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z2 = false;
                            } else if (u890.j(((n89) it2.next()).a, str2)) {
                                z2 = true;
                            }
                        }
                    }
                    if (!z && !z2) {
                        z3 = true;
                    }
                    boolValueOf = Boolean.valueOf(z3);
                }
                cztVar.b = 1;
                return vr20Var.emit(boolValueOf, cztVar) == d9nVar ? d9nVar : rih1Var;
            case 1:
                if (lnmVar instanceof wow) {
                    wowVar = (wow) lnmVar;
                    int i3 = wowVar.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        wowVar.b = i3 - Integer.MIN_VALUE;
                    } else {
                        wowVar = new wow(this, lnmVar);
                    }
                } else {
                    wowVar = new wow(this, lnmVar);
                }
                Object obj3 = wowVar.a;
                int i4 = wowVar.b;
                if (i4 == 0) {
                    hm5.M(obj3);
                    Boolean boolValueOf2 = Boolean.valueOf(fgr.a(str2, ((PlayerState) obj).contextUri()));
                    wowVar.b = 1;
                    return vr20Var.emit(boolValueOf2, wowVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i4 == 1) {
                    hm5.M(obj3);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                if (lnmVar instanceof yow) {
                    yowVar = (yow) lnmVar;
                    int i5 = yowVar.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        yowVar.b = i5 - Integer.MIN_VALUE;
                    } else {
                        yowVar = new yow(this, lnmVar);
                    }
                } else {
                    yowVar = new yow(this, lnmVar);
                }
                Object obj4 = yowVar.a;
                int i6 = yowVar.b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        hm5.M(obj4);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj4);
                PlayerState playerState = (PlayerState) obj;
                if (playerState.isPlaying() && !playerState.isPaused() && fgr.a(str2, playerState.contextUri())) {
                    z3 = true;
                }
                Boolean boolValueOf3 = Boolean.valueOf(z3);
                yowVar.b = 1;
                return vr20Var.emit(boolValueOf3, yowVar) == d9nVar ? d9nVar : rih1Var;
            case 3:
                if (lnmVar instanceof zow) {
                    zowVar = (zow) lnmVar;
                    int i7 = zowVar.b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        zowVar.b = i7 - Integer.MIN_VALUE;
                    } else {
                        zowVar = new zow(this, lnmVar);
                    }
                } else {
                    zowVar = new zow(this, lnmVar);
                }
                Object obj5 = zowVar.a;
                int i8 = zowVar.b;
                if (i8 != 0) {
                    if (i8 == 1) {
                        hm5.M(obj5);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj5);
                PlayerState playerState2 = (PlayerState) obj;
                playerState2.getClass();
                Boolean boolValueOf4 = Boolean.valueOf(o4p1.o(playerState2).equals(str2));
                zowVar.b = 1;
                return vr20Var.emit(boolValueOf4, zowVar) == d9nVar ? d9nVar : rih1Var;
            case 4:
                if (lnmVar instanceof fqy) {
                    fqyVar = (fqy) lnmVar;
                    int i9 = fqyVar.b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        fqyVar.b = i9 - Integer.MIN_VALUE;
                    } else {
                        fqyVar = new fqy(this, lnmVar);
                    }
                } else {
                    fqyVar = new fqy(this, lnmVar);
                }
                Object obj6 = fqyVar.a;
                int i10 = fqyVar.b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        hm5.M(obj6);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj6);
                y2 y2Var = new y2((String) obj, str2);
                List listSingletonList = Collections.singletonList(new h8k1(y2Var, y2Var));
                fqyVar.b = 1;
                return vr20Var.emit(listSingletonList, fqyVar) == d9nVar ? d9nVar : rih1Var;
            case 5:
                if (lnmVar instanceof tuy) {
                    tuyVar = (tuy) lnmVar;
                    int i11 = tuyVar.b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        tuyVar.b = i11 - Integer.MIN_VALUE;
                    } else {
                        tuyVar = new tuy(this, lnmVar);
                    }
                } else {
                    tuyVar = new tuy(this, lnmVar);
                }
                Object obj7 = tuyVar.a;
                int i12 = tuyVar.b;
                if (i12 == 0) {
                    hm5.M(obj7);
                    mmr0 mmr0Var = new mmr0(str2, ((hi40) obj).a);
                    tuyVar.b = 1;
                    return vr20Var.emit(mmr0Var, tuyVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i12 == 1) {
                    hm5.M(obj7);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                if (lnmVar instanceof vuy) {
                    vuyVar = (vuy) lnmVar;
                    int i13 = vuyVar.b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        vuyVar.b = i13 - Integer.MIN_VALUE;
                    } else {
                        vuyVar = new vuy(this, lnmVar);
                    }
                } else {
                    vuyVar = new vuy(this, lnmVar);
                }
                Object obj8 = vuyVar.a;
                int i14 = vuyVar.b;
                if (i14 != 0) {
                    if (i14 == 1) {
                        hm5.M(obj8);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj8);
                if (!u890.j((String) obj, str2)) {
                    return rih1Var;
                }
                vuyVar.b = 1;
                return vr20Var.emit(obj, vuyVar) == d9nVar ? d9nVar : rih1Var;
            case 7:
                if (lnmVar instanceof b3z) {
                    b3zVar = (b3z) lnmVar;
                    int i15 = b3zVar.b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        b3zVar.b = i15 - Integer.MIN_VALUE;
                    } else {
                        b3zVar = new b3z(this, lnmVar);
                    }
                } else {
                    b3zVar = new b3z(this, lnmVar);
                }
                Object obj9 = b3zVar.a;
                int i16 = b3zVar.b;
                if (i16 != 0) {
                    if (i16 == 1) {
                        hm5.M(obj9);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj9);
                mdz mdzVar = ((uv00) obj).a(mdz.class, str2).b;
                if (mdzVar == null) {
                    Logger.d("EpisodeV4 not found for preview uri ".concat(str2), new Object[0]);
                    rgw0Var = qgw0.a;
                } else {
                    String str3 = null;
                    String str4 = mdzVar.c;
                    kdz kdzVar = mdzVar.d;
                    if (kdzVar != null) {
                        str3 = kdzVar.a;
                    }
                    if (str3 == null) {
                        str3 = "";
                    }
                    rgw0Var = new rgw0(str4, str3, mdzVar.e.a, mdzVar.n, mdzVar.i, qqn1.X(mdzVar));
                }
                b3zVar.b = 1;
                return vr20Var.emit(rgw0Var, b3zVar) == d9nVar ? d9nVar : rih1Var;
            case 8:
                if (lnmVar instanceof y8z) {
                    y8zVar = (y8z) lnmVar;
                    int i17 = y8zVar.b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        y8zVar.b = i17 - Integer.MIN_VALUE;
                    } else {
                        y8zVar = new y8z(this, lnmVar);
                    }
                } else {
                    y8zVar = new y8z(this, lnmVar);
                }
                Object obj10 = y8zVar.a;
                int i18 = y8zVar.b;
                if (i18 != 0) {
                    if (i18 == 1) {
                        hm5.M(obj10);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj10);
                hwn hwnVar = (jwn) obj;
                boolean z4 = hwnVar instanceof gwn;
                rrt0 rrt0Var = rrt0.b;
                if (!z4) {
                    if ((hwnVar instanceof hwn) && u890.j(hwnVar.a, str2)) {
                        rrt0Var = rrt0.c;
                    } else if ((hwnVar instanceof iwn) && u890.j(((iwn) hwnVar).a, str2)) {
                        rrt0Var = rrt0.a;
                    }
                }
                y8zVar.b = 1;
                return vr20Var.emit(rrt0Var, y8zVar) == d9nVar ? d9nVar : rih1Var;
            case 9:
                if (lnmVar instanceof or00) {
                    or00Var = (or00) lnmVar;
                    int i19 = or00Var.b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        or00Var.b = i19 - Integer.MIN_VALUE;
                    } else {
                        or00Var = new or00(this, lnmVar);
                    }
                } else {
                    or00Var = new or00(this, lnmVar);
                }
                Object obj11 = or00Var.a;
                int i20 = or00Var.b;
                if (i20 != 0) {
                    if (i20 == 1) {
                        hm5.M(obj11);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj11);
                Boolean bool = (Boolean) ((Map) obj).get(str2);
                Boolean boolValueOf5 = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                or00Var.b = 1;
                return vr20Var.emit(boolValueOf5, or00Var) == d9nVar ? d9nVar : rih1Var;
            case 10:
                if (lnmVar instanceof nv00) {
                    nv00Var = (nv00) lnmVar;
                    int i21 = nv00Var.b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        nv00Var.b = i21 - Integer.MIN_VALUE;
                    } else {
                        nv00Var = new nv00(this, lnmVar);
                    }
                } else {
                    nv00Var = new nv00(this, lnmVar);
                }
                Object obj12 = nv00Var.a;
                int i22 = nv00Var.b;
                if (i22 == 0) {
                    hm5.M(obj12);
                    jvd0 jvd0Var = ((uv00) obj).a(jvd0.class, str2).b;
                    if (jvd0Var != null && (gvd0Var = jvd0Var.a) != null) {
                        hvd0 hvd0Var = (hvd0) o7h.s0(gvd0Var.c);
                        if (hvd0Var != null) {
                            str = hvd0Var.a;
                            if (ihc1.y0(str)) {
                                str = null;
                            }
                        } else {
                            str = null;
                        }
                        int iC = l1d.C(gvd0Var.i);
                        if (iC == 0) {
                            ugfVar = ugf.a;
                        } else if (iC == 1) {
                            ugfVar = ugf.b;
                        } else if (iC == 2) {
                            ugfVar = ugf.c;
                        } else if (iC == 3) {
                            ugfVar = ugf.d;
                        } else {
                            eg.o();
                        }
                        r3s0Var = new r3s0(str, ugfVar);
                    }
                    if (r3s0Var == null) {
                        return rih1Var;
                    }
                    nv00Var.b = 1;
                    return vr20Var.emit(r3s0Var, nv00Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i22 == 1) {
                    hm5.M(obj12);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 11:
                if (lnmVar instanceof c210) {
                    c210Var = (c210) lnmVar;
                    int i23 = c210Var.b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        c210Var.b = i23 - Integer.MIN_VALUE;
                    } else {
                        c210Var = new c210(this, lnmVar);
                    }
                } else {
                    c210Var = new c210(this, lnmVar);
                }
                Object obj13 = c210Var.a;
                int i24 = c210Var.b;
                if (i24 == 0) {
                    hm5.M(obj13);
                    i1r i1rVar = (k1r) obj;
                    if (!(i1rVar instanceof i1r)) {
                        if (!(i1rVar instanceof j1r)) {
                            if (i1rVar instanceof h1r) {
                                u890.k(i1rVar, (d0r) null, (n4r) null);
                                jah.d();
                            } else {
                                eg.o();
                            }
                        }
                        if (r3s0Var != null) {
                            return rih1Var;
                        }
                        c210Var.b = 1;
                        if (vr20Var.emit(r3s0Var, c210Var) == d9nVar) {
                            return d9nVar;
                        }
                        return rih1Var;
                    }
                    x110 x110Var = (z110) i1rVar.a;
                    if (x110Var instanceof x110) {
                        r3s0Var = new e331(x110Var.a);
                    } else if (!u890.j(x110Var, y110.a)) {
                        if (x110Var instanceof w110) {
                            r3s0Var = new e331(new m231((Throwable) ((w110) x110Var).a.invoke(str2)));
                        } else {
                            eg.o();
                        }
                    }
                    if (r3s0Var != null) {
                        return rih1Var;
                    }
                    c210Var.b = 1;
                    if (vr20Var.emit(r3s0Var, c210Var) == d9nVar) {
                        return d9nVar;
                    }
                    return rih1Var;
                }
                if (i24 == 1) {
                    hm5.M(obj13);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 12:
                if (lnmVar instanceof qv20) {
                    qv20Var = (qv20) lnmVar;
                    int i25 = qv20Var.b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        qv20Var.b = i25 - Integer.MIN_VALUE;
                    } else {
                        qv20Var = new qv20(this, lnmVar);
                    }
                } else {
                    qv20Var = new qv20(this, lnmVar);
                }
                Object obj14 = qv20Var.a;
                int i26 = qv20Var.b;
                if (i26 == 0) {
                    hm5.M(obj14);
                    Boolean boolValueOf6 = Boolean.valueOf(nhc1.S((String) obj, str2, true));
                    qv20Var.b = 1;
                    return vr20Var.emit(boolValueOf6, qv20Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i26 == 1) {
                    hm5.M(obj14);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 13:
                if (lnmVar instanceof yv20) {
                    yv20Var = (yv20) lnmVar;
                    int i27 = yv20Var.b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        yv20Var.b = i27 - Integer.MIN_VALUE;
                    } else {
                        yv20Var = new yv20(this, lnmVar);
                    }
                } else {
                    yv20Var = new yv20(this, lnmVar);
                }
                Object obj15 = yv20Var.a;
                int i28 = yv20Var.b;
                if (i28 == 0) {
                    hm5.M(obj15);
                    Boolean boolL = yto.l((String) ((Map) obj).get(str2));
                    yv20Var.b = 1;
                    return vr20Var.emit(boolL, yv20Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i28 == 1) {
                    hm5.M(obj15);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 14:
                if (lnmVar instanceof aw20) {
                    aw20Var = (aw20) lnmVar;
                    int i29 = aw20Var.b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        aw20Var.b = i29 - Integer.MIN_VALUE;
                    } else {
                        aw20Var = new aw20(this, lnmVar);
                    }
                } else {
                    aw20Var = new aw20(this, lnmVar);
                }
                Object obj16 = aw20Var.a;
                int i30 = aw20Var.b;
                if (i30 == 0) {
                    hm5.M(obj16);
                    Object obj17 = ((Map) obj).get(str2);
                    aw20Var.b = 1;
                    return vr20Var.emit(obj17, aw20Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i30 == 1) {
                    hm5.M(obj16);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 15:
                if (lnmVar instanceof h530) {
                    h530Var = (h530) lnmVar;
                    int i31 = h530Var.b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        h530Var.b = i31 - Integer.MIN_VALUE;
                    } else {
                        h530Var = new h530(this, lnmVar);
                    }
                } else {
                    h530Var = new h530(this, lnmVar);
                }
                Object obj18 = h530Var.a;
                int i32 = h530Var.b;
                if (i32 != 0) {
                    if (i32 == 1) {
                        hm5.M(obj18);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj18);
                f7h f7hVar = (f7h) ((Map) obj).get(str2);
                if (f7hVar != null && f7hVar.a) {
                    z3 = true;
                }
                Boolean boolValueOf7 = Boolean.valueOf(z3);
                h530Var.b = 1;
                return vr20Var.emit(boolValueOf7, h530Var) == d9nVar ? d9nVar : rih1Var;
            case 16:
                if (lnmVar instanceof hr30) {
                    hr30Var = (hr30) lnmVar;
                    int i33 = hr30Var.b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        hr30Var.b = i33 - Integer.MIN_VALUE;
                    } else {
                        hr30Var = new hr30(this, lnmVar);
                    }
                } else {
                    hr30Var = new hr30(this, lnmVar);
                }
                Object obj19 = hr30Var.a;
                int i34 = hr30Var.b;
                if (i34 != 0) {
                    if (i34 == 1) {
                        hm5.M(obj19);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj19);
                if (!((o731) obj).e.contains(str2)) {
                    return rih1Var;
                }
                hr30Var.b = 1;
                return vr20Var.emit(obj, hr30Var) == d9nVar ? d9nVar : rih1Var;
            case 17:
                if (lnmVar instanceof z840) {
                    z840Var = (z840) lnmVar;
                    int i35 = z840Var.b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        z840Var.b = i35 - Integer.MIN_VALUE;
                    } else {
                        z840Var = new z840(this, lnmVar);
                    }
                } else {
                    z840Var = new z840(this, lnmVar);
                }
                Object obj20 = z840Var.a;
                int i36 = z840Var.b;
                if (i36 != 0) {
                    if (i36 == 1) {
                        hm5.M(obj20);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj20);
                ez00 ez00Var = ((uv00) obj).a(w281.class, str2).b;
                if (ez00Var == null) {
                    return rih1Var;
                }
                z840Var.b = 1;
                return vr20Var.emit(ez00Var, z840Var) == d9nVar ? d9nVar : rih1Var;
            case 18:
                if (lnmVar instanceof mm40) {
                    mm40Var = (mm40) lnmVar;
                    int i37 = mm40Var.b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        mm40Var.b = i37 - Integer.MIN_VALUE;
                    } else {
                        mm40Var = new mm40(this, lnmVar);
                    }
                } else {
                    mm40Var = new mm40(this, lnmVar);
                }
                Object obj21 = mm40Var.a;
                int i38 = mm40Var.b;
                if (i38 != 0) {
                    if (i38 == 1) {
                        hm5.M(obj21);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj21);
                f7h f7hVar2 = (f7h) ((Map) obj).get(str2);
                if (f7hVar2 == null) {
                    f7hVar2 = om40.c;
                }
                mm40Var.b = 1;
                return vr20Var.emit(f7hVar2, mm40Var) == d9nVar ? d9nVar : rih1Var;
            case 19:
                if (lnmVar instanceof sk50) {
                    sk50Var = (sk50) lnmVar;
                    int i39 = sk50Var.b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        sk50Var.b = i39 - Integer.MIN_VALUE;
                    } else {
                        sk50Var = new sk50(this, lnmVar);
                    }
                } else {
                    sk50Var = new sk50(this, lnmVar);
                }
                Object obj22 = sk50Var.a;
                int i40 = sk50Var.b;
                if (i40 == 0) {
                    hm5.M(obj22);
                    Object obj23 = ((Map) obj).get(str2);
                    sk50Var.b = 1;
                    return vr20Var.emit(obj23, sk50Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i40 == 1) {
                    hm5.M(obj22);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 20:
                if (lnmVar instanceof xr60) {
                    xr60Var = (xr60) lnmVar;
                    int i41 = xr60Var.b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        xr60Var.b = i41 - Integer.MIN_VALUE;
                    } else {
                        xr60Var = new xr60(this, lnmVar);
                    }
                } else {
                    xr60Var = new xr60(this, lnmVar);
                }
                Object obj24 = xr60Var.a;
                int i42 = xr60Var.b;
                if (i42 != 0) {
                    if (i42 == 1) {
                        hm5.M(obj24);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj24);
                if (!u890.j(str2, ((l0l) ((mmr0) obj).a).d())) {
                    return rih1Var;
                }
                xr60Var.b = 1;
                return vr20Var.emit(obj, xr60Var) == d9nVar ? d9nVar : rih1Var;
            case 21:
                if (lnmVar instanceof lf90) {
                    lf90Var = (lf90) lnmVar;
                    int i43 = lf90Var.b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        lf90Var.b = i43 - Integer.MIN_VALUE;
                    } else {
                        lf90Var = new lf90(this, lnmVar);
                    }
                } else {
                    lf90Var = new lf90(this, lnmVar);
                }
                Object obj25 = lf90Var.a;
                int i44 = lf90Var.b;
                if (i44 == 0) {
                    hm5.M(obj25);
                    Boolean boolValueOf8 = Boolean.valueOf(((Set) obj).contains(str2));
                    lf90Var.b = 1;
                    return vr20Var.emit(boolValueOf8, lf90Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i44 == 1) {
                    hm5.M(obj25);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 22:
                if (lnmVar instanceof fm90) {
                    fm90Var = (fm90) lnmVar;
                    int i45 = fm90Var.b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        fm90Var.b = i45 - Integer.MIN_VALUE;
                    } else {
                        fm90Var = new fm90(this, lnmVar);
                    }
                } else {
                    fm90Var = new fm90(this, lnmVar);
                }
                Object obj26 = fm90Var.a;
                int i46 = fm90Var.b;
                if (i46 == 0) {
                    hm5.M(obj26);
                    x2d0 x2d0Var = (g3d0) obj;
                    if (x2d0Var instanceof u2d0) {
                        z6xVarM = z6x.a;
                    } else {
                        boolean z5 = x2d0Var instanceof x2d0;
                        m3d0 m3d0Var = don1.a;
                        if (z5) {
                            z6xVarM = p7h.M(new m3d0[]{new m3d0("name", !x2d0Var.a), m3d0Var});
                        } else if (x2d0Var instanceof y2d0) {
                            z6xVarM = p7h.M(new m3d0[]{new m3d0("name", true), m3d0Var});
                        } else if (x2d0Var instanceof q2d0) {
                            z6xVarM = don1.m(!((q2d0) x2d0Var).a);
                        } else if (x2d0Var instanceof r2d0) {
                            z6xVarM = don1.m(true);
                        } else if (x2d0Var instanceof s2d0) {
                            z6xVarM = don1.n(!((s2d0) x2d0Var).a);
                        } else if (x2d0Var instanceof t2d0) {
                            z6xVarM = don1.n(true);
                        } else if (x2d0Var instanceof m2d0) {
                            z6xVarM = don1.l(!((m2d0) x2d0Var).a);
                        } else if (x2d0Var instanceof n2d0) {
                            z6xVarM = don1.l(false);
                        } else if (x2d0Var instanceof w2d0) {
                            z6xVarM = p7h.M(new m3d0[]{new m3d0("length", !((w2d0) x2d0Var).a), m3d0Var});
                        } else if (x2d0Var instanceof v2d0) {
                            z6xVarM = p7h.M(new m3d0[]{new m3d0("discNumber", !((v2d0) x2d0Var).a), new m3d0("trackNumber", true), m3d0Var});
                        } else if (x2d0Var instanceof f3d0) {
                            z6xVarM = p7h.M(new m3d0[]{new m3d0("trackNumber", !((f3d0) x2d0Var).a), m3d0Var});
                        } else if (x2d0Var instanceof p2d0) {
                            z6xVarM = p7h.M(new m3d0[]{new m3d0("album.artist.name", !((p2d0) x2d0Var).a), m3d0Var});
                        } else if (x2d0Var instanceof o2d0) {
                            boolean z6 = !((o2d0) x2d0Var).a;
                            z6xVarM = p7h.M(new m3d0[]{new m3d0("addedByDisplayName", z6), new m3d0("addedBy", z6), m3d0Var});
                        } else if (x2d0Var instanceof e3d0) {
                            z6xVarM = p7h.M(new m3d0[]{new m3d0("show.name", !((e3d0) x2d0Var).a), m3d0Var});
                        } else if (x2d0Var instanceof c3d0) {
                            z6xVarM = p7h.M(new m3d0[]{new m3d0("publishDate", !((c3d0) x2d0Var).a), m3d0Var});
                        } else if (x2d0Var instanceof z2d0) {
                            z6xVarM = p7h.M(new m3d0[]{new m3d0("providedSort", !((z2d0) x2d0Var).c), m3d0Var});
                        } else if (x2d0Var instanceof a3d0) {
                            z6xVarM = p7h.M(new m3d0[]{new m3d0("providedSort", true), m3d0Var});
                        } else {
                            eg.o();
                        }
                    }
                    mmr0 mmr0Var2 = new mmr0(str2, z6xVarM);
                    fm90Var.b = 1;
                    return vr20Var.emit(mmr0Var2, fm90Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i46 == 1) {
                    hm5.M(obj26);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                if (lnmVar instanceof rs90) {
                    rs90Var = (rs90) lnmVar;
                    int i47 = rs90Var.b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        rs90Var.b = i47 - Integer.MIN_VALUE;
                    } else {
                        rs90Var = new rs90(this, lnmVar);
                    }
                } else {
                    rs90Var = new rs90(this, lnmVar);
                }
                Object obj27 = rs90Var.a;
                int i48 = rs90Var.b;
                if (i48 == 0) {
                    hm5.M(obj27);
                    ms90 ms90Var = new ms90(str2, ((ap90) obj).a.a);
                    rs90Var.b = 1;
                    return vr20Var.emit(ms90Var, rs90Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i48 == 1) {
                    hm5.M(obj27);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 24:
                if (lnmVar instanceof wu90) {
                    wu90Var = (wu90) lnmVar;
                    int i49 = wu90Var.b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        wu90Var.b = i49 - Integer.MIN_VALUE;
                    } else {
                        wu90Var = new wu90(this, lnmVar);
                    }
                } else {
                    wu90Var = new wu90(this, lnmVar);
                }
                Object obj28 = wu90Var.a;
                int i50 = wu90Var.b;
                if (i50 != 0) {
                    if (i50 == 1) {
                        hm5.M(obj28);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj28);
                pp90 pp90Var = (pp90) obj;
                if (pp90Var != null) {
                    ArrayList arrayList = pp90Var.c;
                    if (!arrayList.isEmpty()) {
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            if (u890.j(((hp90) it3.next()).c, str2)) {
                                z3 = true;
                            }
                        }
                    }
                }
                Boolean boolValueOf9 = Boolean.valueOf(z3);
                wu90Var.b = 1;
                return vr20Var.emit(boolValueOf9, wu90Var) == d9nVar ? d9nVar : rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                if (lnmVar instanceof wba0) {
                    wba0Var = (wba0) lnmVar;
                    int i51 = wba0Var.b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        wba0Var.b = i51 - Integer.MIN_VALUE;
                    } else {
                        wba0Var = new wba0(this, lnmVar);
                    }
                } else {
                    wba0Var = new wba0(this, lnmVar);
                }
                Object obj29 = wba0Var.a;
                int i52 = wba0Var.b;
                if (i52 != 0) {
                    if (i52 == 1) {
                        hm5.M(obj29);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj29);
                r3s0 r3s0Var2 = (pp90) obj;
                if (r3s0Var2 != null) {
                    ArrayList arrayList2 = ((pp90) r3s0Var2).c;
                    if (!arrayList2.isEmpty()) {
                        Iterator it4 = arrayList2.iterator();
                        while (it4.hasNext()) {
                            if (u890.j(((hp90) it4.next()).c, str2)) {
                                r3s0Var = r3s0Var2;
                            }
                        }
                    }
                }
                wba0Var.b = 1;
                return vr20Var.emit(r3s0Var, wba0Var) == d9nVar ? d9nVar : rih1Var;
            case 26:
                return b(obj, lnmVar);
            case 27:
                return c(obj, lnmVar);
            case 28:
                return e(obj, lnmVar);
            default:
                if (lnmVar instanceof b1b0) {
                    b1b0Var = (b1b0) lnmVar;
                    int i53 = b1b0Var.b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        b1b0Var.b = i53 - Integer.MIN_VALUE;
                    } else {
                        b1b0Var = new b1b0(this, lnmVar);
                    }
                } else {
                    b1b0Var = new b1b0(this, lnmVar);
                }
                Object obj30 = b1b0Var.a;
                int i54 = b1b0Var.b;
                if (i54 != 0) {
                    if (i54 == 1) {
                        hm5.M(obj30);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj30);
                tv00 tv00VarA = ((uv00) obj).a(muf0.class, str2);
                if (tv00VarA.c.a && (muf0Var = (muf0) tv00VarA.b) != null && muf0Var.a) {
                    z3 = true;
                }
                Boolean boolValueOf10 = Boolean.valueOf(z3);
                b1b0Var.b = 1;
                return vr20Var.emit(boolValueOf10, b1b0Var) == d9nVar ? d9nVar : rih1Var;
        }
    }

    public /* synthetic */ dzt(vr20 vr20Var, goq goqVar, String str, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = str;
    }
}
