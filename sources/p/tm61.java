package p;

import com.spotify.connectivity.reachability.esperanto.proto.EsReachabilityProvider;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.settings.esperanto.proto.SettingsOuterClass;
import com.spotify.sharecard.config.impl.proto.BackgroundWithSticker;
import com.spotify.sharecard.config.impl.proto.CardData;
import com.spotify.sharecard.config.impl.proto.Line;
import com.spotify.sharecard.config.impl.proto.Quote;
import com.spotify.sharecard.config.impl.proto.Timestamp;
import j$.util.Base64;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tm61 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;

    public tm61(vr20 vr20Var, lc71 lc71Var) {
        this.a = (byte) 15;
        this.b = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object b(Object obj, lnm lnmVar) {
        dv71 dv71Var;
        swz0 twz0Var;
        a7o0 a7o0Var;
        if (lnmVar instanceof dv71) {
            dv71Var = (dv71) lnmVar;
            int i = dv71Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                dv71Var.b = i - Integer.MIN_VALUE;
            } else {
                dv71Var = new dv71(this, lnmVar);
            }
        } else {
            dv71Var = new dv71(this, lnmVar);
        }
        Object obj2 = dv71Var.a;
        int i2 = dv71Var.b;
        Set setP1 = null;
        if (i2 == 0) {
            hm5.M(obj2);
            EsReachabilityProvider.ReachabilityState reachabilityState = (EsReachabilityProvider.ReachabilityState) obj;
            reachabilityState.getClass();
            int iR = reachabilityState.r();
            int i3 = iR == 0 ? -1 : lhy0.a[l1d.C(iR)];
            if (i3 == 1) {
                d290<moz> d290VarO = reachabilityState.q().o();
                if (!d290VarO.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (moz mozVar : d290VarO) {
                        mozVar.getClass();
                        int iOrdinal = mozVar.ordinal();
                        if (iOrdinal == 0) {
                            a7o0Var = a7o0.a;
                        } else if (iOrdinal == 1) {
                            a7o0Var = a7o0.b;
                        } else if (iOrdinal == 2) {
                            a7o0Var = a7o0.c;
                        } else if (iOrdinal == 3) {
                            a7o0Var = a7o0.d;
                        } else {
                            if (iOrdinal != 4) {
                                eg.o();
                                return null;
                            }
                            a7o0Var = null;
                        }
                        if (a7o0Var != null) {
                            arrayList.add(a7o0Var);
                        }
                    }
                    setP1 = o7h.p1(arrayList);
                }
                twz0Var = new twz0(setP1);
            } else if (i3 != 2) {
                twz0Var = new swz0(new eho0(false, false));
            } else {
                twz0Var = new swz0(((AbstractCollection) reachabilityState.p().p()).contains(rqz.b) ? dho0.a : new eho0(!reachabilityState.o().q(), !reachabilityState.o().p()));
            }
            dv71Var.b = 1;
            Object objEmit = this.b.emit(twz0Var, dv71Var);
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

    /* JADX WARN: Code duplicated, block: B:109:0x0199  */
    /* JADX WARN: Code duplicated, block: B:124:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:141:0x0211  */
    /* JADX WARN: Code duplicated, block: B:156:0x024f  */
    /* JADX WARN: Code duplicated, block: B:173:0x0287  */
    /* JADX WARN: Code duplicated, block: B:190:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:207:0x0301  */
    /* JADX WARN: Code duplicated, block: B:224:0x0340  */
    /* JADX WARN: Code duplicated, block: B:24:0x0068  */
    /* JADX WARN: Code duplicated, block: B:312:0x059f  */
    /* JADX WARN: Code duplicated, block: B:350:0x064d  */
    /* JADX WARN: Code duplicated, block: B:368:0x0690  */
    /* JADX WARN: Code duplicated, block: B:384:0x06cf  */
    /* JADX WARN: Code duplicated, block: B:400:0x0717  */
    /* JADX WARN: Code duplicated, block: B:416:0x0762  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:432:0x07a9  */
    /* JADX WARN: Code duplicated, block: B:448:0x07e8  */
    /* JADX WARN: Code duplicated, block: B:472:0x083d  */
    /* JADX WARN: Code duplicated, block: B:488:0x087d  */
    /* JADX WARN: Code duplicated, block: B:504:0x08bd  */
    /* JADX WARN: Code duplicated, block: B:524:0x0908  */
    /* JADX WARN: Code duplicated, block: B:554:0x0968  */
    /* JADX WARN: Code duplicated, block: B:570:0x09b1  */
    /* JADX WARN: Code duplicated, block: B:586:0x09f7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:607:0x0a4e  */
    /* JADX WARN: Code duplicated, block: B:643:0x05ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:646:0x05b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0129  */
    /* JADX WARN: Code duplicated, block: B:92:0x0161  */
    /* JADX WARN: Code duplicated, block: B:9:0x0028  */
    public final Object emit(Object obj, lnm lnmVar) {
        sm61 sm61Var;
        on61 on61Var;
        fp61 fp61Var;
        gp61 gp61Var;
        qq61 qq61Var;
        ns61 ns61Var;
        bt61 bt61Var;
        ft61 ft61Var;
        gt61 gt61Var;
        wv61 wv61Var;
        p171 p171Var;
        n671 n671Var;
        u671 u671Var;
        b771 b771Var;
        jc71 jc71Var;
        kc71 kc71Var;
        rih1 rih1Var;
        ub71 tb71Var;
        int i;
        ib71 ib71Var;
        List list;
        Iterator it;
        rih1 rih1Var2;
        zsd vsdVar;
        mmr0 mmr0Var;
        yx9 wx9Var;
        wk71 wk71Var;
        xk71 xk71Var;
        zk71 zk71Var;
        bm71 bm71Var;
        cm71 cm71Var;
        dm71 dm71Var;
        em71 em71Var;
        lm71 lm71Var;
        sn71 sn71Var;
        io71 io71Var;
        ds71 ds71Var;
        gv71 gv71Var;
        hv71 hv71Var;
        byte b = this.a;
        boolean z = false;
        rih1 rih1Var3 = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof sm61) {
                    sm61Var = (sm61) lnmVar;
                    int i2 = sm61Var.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        sm61Var.b = i2 - Integer.MIN_VALUE;
                    } else {
                        sm61Var = new sm61(this, lnmVar);
                    }
                } else {
                    sm61Var = new sm61(this, lnmVar);
                }
                Object obj2 = sm61Var.a;
                int i3 = sm61Var.b;
                if (i3 == 0) {
                    hm5.M(obj2);
                    cxc0 cxc0Var = (cxc0) obj;
                    exc0 exc0Var = cxc0Var.f.w.g;
                    boolean z2 = exc0Var.a || exc0Var.c || exc0Var.b;
                    boolean z3 = cxc0Var.i;
                    if (z2 && !z3) {
                        z = true;
                    }
                    Boolean boolValueOf = Boolean.valueOf(z);
                    sm61Var.b = 1;
                    if (vr20Var.emit(boolValueOf, sm61Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i3 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj2);
                }
                return rih1Var3;
            case 1:
                if (lnmVar instanceof on61) {
                    on61Var = (on61) lnmVar;
                    int i4 = on61Var.b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        on61Var.b = i4 - Integer.MIN_VALUE;
                    } else {
                        on61Var = new on61(this, lnmVar);
                    }
                } else {
                    on61Var = new on61(this, lnmVar);
                }
                Object obj3 = on61Var.a;
                int i5 = on61Var.b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        hm5.M(obj3);
                        return rih1Var3;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                byte[] bArr = (byte[]) obj;
                try {
                    SettingsOuterClass.SettingsState settingsStateJ = SettingsOuterClass.SettingsState.J(bArr);
                    on61Var.b = 1;
                    if (vr20Var.emit(settingsStateJ, on61Var) == d9nVar) {
                        return d9nVar;
                    }
                    return rih1Var3;
                } catch (Exception e) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.settings.esperanto.proto.SettingsOuterClass.SettingsState: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                }
                break;
            case 2:
                if (lnmVar instanceof fp61) {
                    fp61Var = (fp61) lnmVar;
                    int i6 = fp61Var.b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        fp61Var.b = i6 - Integer.MIN_VALUE;
                    } else {
                        fp61Var = new fp61(this, lnmVar);
                    }
                } else {
                    fp61Var = new fp61(this, lnmVar);
                }
                Object obj4 = fp61Var.a;
                int i7 = fp61Var.b;
                if (i7 == 0) {
                    hm5.M(obj4);
                    ((bu8) obj).getClass();
                    bp61 bp61Var = new bp61();
                    fp61Var.b = 1;
                    if (vr20Var.emit(bp61Var, fp61Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i7 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj4);
                }
                return rih1Var3;
            case 3:
                if (lnmVar instanceof gp61) {
                    gp61Var = (gp61) lnmVar;
                    int i8 = gp61Var.b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        gp61Var.b = i8 - Integer.MIN_VALUE;
                    } else {
                        gp61Var = new gp61(this, lnmVar);
                    }
                } else {
                    gp61Var = new gp61(this, lnmVar);
                }
                Object obj5 = gp61Var.a;
                int i9 = gp61Var.b;
                if (i9 == 0) {
                    hm5.M(obj5);
                    cp61 cp61Var = new cp61(u890.j((fcl) obj, fcl.b));
                    gp61Var.b = 1;
                    if (vr20Var.emit(cp61Var, gp61Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i9 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj5);
                }
                return rih1Var3;
            case 4:
                if (lnmVar instanceof qq61) {
                    qq61Var = (qq61) lnmVar;
                    int i10 = qq61Var.b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        qq61Var.b = i10 - Integer.MIN_VALUE;
                    } else {
                        qq61Var = new qq61(this, lnmVar);
                    }
                } else {
                    qq61Var = new qq61(this, lnmVar);
                }
                Object obj6 = qq61Var.a;
                int i11 = qq61Var.b;
                if (i11 == 0) {
                    hm5.M(obj6);
                    cxc0 cxc0Var2 = (cxc0) obj;
                    exc0 exc0Var2 = cxc0Var2.f.w.g;
                    boolean z4 = exc0Var2.a || exc0Var2.c || exc0Var2.b;
                    boolean z5 = cxc0Var2.i;
                    if (z4 && !z5) {
                        z = true;
                    }
                    Boolean boolValueOf2 = Boolean.valueOf(z);
                    qq61Var.b = 1;
                    if (vr20Var.emit(boolValueOf2, qq61Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i11 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj6);
                }
                return rih1Var3;
            case 5:
                if (lnmVar instanceof ns61) {
                    ns61Var = (ns61) lnmVar;
                    int i12 = ns61Var.b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        ns61Var.b = i12 - Integer.MIN_VALUE;
                    } else {
                        ns61Var = new ns61(this, lnmVar);
                    }
                } else {
                    ns61Var = new ns61(this, lnmVar);
                }
                Object obj7 = ns61Var.a;
                int i13 = ns61Var.b;
                if (i13 == 0) {
                    hm5.M(obj7);
                    Boolean boolValueOf3 = Boolean.valueOf(((Number) obj).intValue() == 4);
                    ns61Var.b = 1;
                    if (vr20Var.emit(boolValueOf3, ns61Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i13 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj7);
                }
                return rih1Var3;
            case 6:
                if (lnmVar instanceof bt61) {
                    bt61Var = (bt61) lnmVar;
                    int i14 = bt61Var.b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        bt61Var.b = i14 - Integer.MIN_VALUE;
                    } else {
                        bt61Var = new bt61(this, lnmVar);
                    }
                } else {
                    bt61Var = new bt61(this, lnmVar);
                }
                Object obj8 = bt61Var.a;
                int i15 = bt61Var.b;
                if (i15 == 0) {
                    hm5.M(obj8);
                    it61 it61Var = new it61(obj);
                    bt61Var.b = 1;
                    if (vr20Var.emit(it61Var, bt61Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i15 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj8);
                }
                return rih1Var3;
            case 7:
                if (lnmVar instanceof ft61) {
                    ft61Var = (ft61) lnmVar;
                    int i16 = ft61Var.b;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        ft61Var.b = i16 - Integer.MIN_VALUE;
                    } else {
                        ft61Var = new ft61(this, lnmVar);
                    }
                } else {
                    ft61Var = new ft61(this, lnmVar);
                }
                Object obj9 = ft61Var.a;
                int i17 = ft61Var.b;
                if (i17 == 0) {
                    hm5.M(obj9);
                    it61 it61Var2 = new it61(obj);
                    ft61Var.b = 1;
                    if (vr20Var.emit(it61Var2, ft61Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i17 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj9);
                }
                return rih1Var3;
            case 8:
                if (lnmVar instanceof gt61) {
                    gt61Var = (gt61) lnmVar;
                    int i18 = gt61Var.b;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        gt61Var.b = i18 - Integer.MIN_VALUE;
                    } else {
                        gt61Var = new gt61(this, lnmVar);
                    }
                } else {
                    gt61Var = new gt61(this, lnmVar);
                }
                Object obj10 = gt61Var.a;
                int i19 = gt61Var.b;
                if (i19 == 0) {
                    hm5.M(obj10);
                    Object obj11 = ((e331) obj).a;
                    if (obj11 instanceof m231) {
                        obj11 = null;
                    }
                    it61 it61Var3 = obj11 != null ? new it61(obj11) : new ht61((Integer) null, 0);
                    gt61Var.b = 1;
                    if (vr20Var.emit(it61Var3, gt61Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i19 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj10);
                }
                return rih1Var3;
            case 9:
                if (lnmVar instanceof wv61) {
                    wv61Var = (wv61) lnmVar;
                    int i20 = wv61Var.b;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        wv61Var.b = i20 - Integer.MIN_VALUE;
                    } else {
                        wv61Var = new wv61(this, lnmVar);
                    }
                } else {
                    wv61Var = new wv61(this, lnmVar);
                }
                Object obj12 = wv61Var.a;
                int i21 = wv61Var.b;
                if (i21 == 0) {
                    hm5.M(obj12);
                    String str = ((th61) obj).a;
                    wv61Var.b = 1;
                    if (vr20Var.emit(str, wv61Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i21 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj12);
                }
                return rih1Var3;
            case 10:
                if (lnmVar instanceof p171) {
                    p171Var = (p171) lnmVar;
                    int i22 = p171Var.b;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        p171Var.b = i22 - Integer.MIN_VALUE;
                    } else {
                        p171Var = new p171(this, lnmVar);
                    }
                } else {
                    p171Var = new p171(this, lnmVar);
                }
                Object obj13 = p171Var.a;
                int i23 = p171Var.b;
                if (i23 == 0) {
                    hm5.M(obj13);
                    m171 m171Var = new m171(((Boolean) obj).booleanValue(), (ibk0) null);
                    p171Var.b = 1;
                    if (vr20Var.emit(m171Var, p171Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i23 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj13);
                }
                return rih1Var3;
            case 11:
                if (lnmVar instanceof n671) {
                    n671Var = (n671) lnmVar;
                    int i24 = n671Var.b;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        n671Var.b = i24 - Integer.MIN_VALUE;
                    } else {
                        n671Var = new n671(this, lnmVar);
                    }
                } else {
                    n671Var = new n671(this, lnmVar);
                }
                Object obj14 = n671Var.a;
                int i25 = n671Var.b;
                if (i25 == 0) {
                    hm5.M(obj14);
                    String strUri = ((ContextTrack) ((PlayerState) obj).track().b()).uri();
                    n671Var.b = 1;
                    if (vr20Var.emit(strUri, n671Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i25 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj14);
                }
                return rih1Var3;
            case 12:
                if (lnmVar instanceof u671) {
                    u671Var = (u671) lnmVar;
                    int i26 = u671Var.b;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        u671Var.b = i26 - Integer.MIN_VALUE;
                    } else {
                        u671Var = new u671(this, lnmVar);
                    }
                } else {
                    u671Var = new u671(this, lnmVar);
                }
                Object obj15 = u671Var.a;
                int i27 = u671Var.b;
                if (i27 == 0) {
                    hm5.M(obj15);
                    Boolean boolValueOf4 = Boolean.valueOf(!u890.j((n2r0) obj, ck7.a));
                    u671Var.b = 1;
                    if (vr20Var.emit(boolValueOf4, u671Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i27 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj15);
                }
                return rih1Var3;
            case 13:
                if (lnmVar instanceof b771) {
                    b771Var = (b771) lnmVar;
                    int i28 = b771Var.b;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        b771Var.b = i28 - Integer.MIN_VALUE;
                    } else {
                        b771Var = new b771(this, lnmVar);
                    }
                } else {
                    b771Var = new b771(this, lnmVar);
                }
                Object obj16 = b771Var.a;
                int i29 = b771Var.b;
                if (i29 == 0) {
                    hm5.M(obj16);
                    kby kbyVar = ((cxc0) obj).f;
                    b771Var.b = 1;
                    if (vr20Var.emit(kbyVar, b771Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i29 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj16);
                }
                return rih1Var3;
            case 14:
                if (lnmVar instanceof jc71) {
                    jc71Var = (jc71) lnmVar;
                    int i30 = jc71Var.b;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        jc71Var.b = i30 - Integer.MIN_VALUE;
                    } else {
                        jc71Var = new jc71(this, lnmVar);
                    }
                } else {
                    jc71Var = new jc71(this, lnmVar);
                }
                Object obj17 = jc71Var.a;
                int i31 = jc71Var.b;
                if (i31 == 0) {
                    hm5.M(obj17);
                    if (!((uv00) obj).f) {
                        jc71Var.b = 1;
                        if (vr20Var.emit(obj, jc71Var) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    if (i31 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj17);
                }
                return rih1Var3;
            case 15:
                if (lnmVar instanceof kc71) {
                    kc71Var = (kc71) lnmVar;
                    int i32 = kc71Var.b;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        kc71Var.b = i32 - Integer.MIN_VALUE;
                    } else {
                        kc71Var = new kc71(this, lnmVar);
                    }
                } else {
                    kc71Var = new kc71(this, lnmVar);
                }
                Object obj18 = kc71Var.a;
                int i33 = kc71Var.b;
                if (i33 != 0) {
                    if (i33 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj18);
                    rih1Var = rih1Var3;
                    return rih1Var;
                }
                hm5.M(obj18);
                uv00 uv00Var = (uv00) obj;
                List listB = uv00Var.b(opa1.class);
                List listB2 = uv00Var.b(bpf.class);
                List listB3 = uv00Var.b(rz61.class);
                ArrayList arrayList = new ArrayList();
                Iterator it2 = listB3.iterator();
                while (it2.hasNext()) {
                    tv00 tv00Var = (tv00) it2.next();
                    rz61 rz61Var = tv00Var.b;
                    if (rz61Var == null) {
                        it = it2;
                        rih1Var2 = rih1Var3;
                        listB = listB;
                        listB2 = listB2;
                        mmr0Var = null;
                    } else {
                        String str2 = tv00Var.a;
                        CardData cardDataR = CardData.r(rz61Var.c);
                        String str3 = rz61Var.a;
                        Set set = s4b1.f;
                        z771 z771Var = new z771(uic.x(str3));
                        s4b1 s4b1VarX = uic.x(rz61Var.b);
                        cardDataR.getClass();
                        int iO = cardDataR.o();
                        int i34 = iO == 0 ? -1 : uz61.a[l1d.C(iO)];
                        if (i34 == -1) {
                            it = it2;
                            rih1Var2 = rih1Var3;
                            vsdVar = ysd.a;
                        } else if (i34 == 1) {
                            it = it2;
                            rih1Var2 = rih1Var3;
                            BackgroundWithSticker backgroundWithStickerN = cardDataR.n();
                            if (backgroundWithStickerN.n().hasColor()) {
                                String strO = backgroundWithStickerN.n().o().o();
                                String strP = backgroundWithStickerN.n().o().p();
                                strP.getClass();
                                if (strP.length() <= 0) {
                                    strP = null;
                                }
                                wx9Var = new vx9(strO, strP);
                            } else if (backgroundWithStickerN.n().t()) {
                                wx9Var = new xx9(backgroundWithStickerN.n().r().getUrl());
                            } else {
                                wx9Var = backgroundWithStickerN.n().s() ? new wx9(backgroundWithStickerN.n().q().getUrl()) : new vx9("#000000", null);
                            }
                            vsdVar = new vsd(new mz9(new ox9(wx9Var, backgroundWithStickerN.n().n()), backgroundWithStickerN.hasSticker() ? new wx9(backgroundWithStickerN.p().getUrl()) : null));
                        } else if (i34 == 2) {
                            Quote quoteP = cardDataR.p();
                            h290<Line> h290VarP = quoteP.p();
                            ArrayList arrayList2 = new ArrayList(q7h.U(h290VarP, 10));
                            for (Line line : h290VarP) {
                                Iterator it3 = it2;
                                String strN = line.n();
                                String strO2 = line.o();
                                strO2.getClass();
                                if (strO2.length() <= 0) {
                                    strO2 = null;
                                }
                                rih1 rih1Var4 = rih1Var3;
                                arrayList2.add(new khc0(strN, strO2));
                                it2 = it3;
                                rih1Var3 = rih1Var4;
                            }
                            it = it2;
                            rih1Var2 = rih1Var3;
                            vsdVar = new wsd(new amz0(quoteP.hasTimestamp() ? Long.valueOf(quoteP.getTimestamp()) : null, arrayList2));
                        } else if (i34 != 3) {
                            if (i34 != 4) {
                                eg.o();
                                return null;
                            }
                            it = it2;
                            rih1Var2 = rih1Var3;
                            vsdVar = ysd.a;
                        } else {
                            Timestamp timestampQ = cardDataR.q();
                            vsdVar = new xsd(new zve1(timestampQ.hasTimestamp() ? timestampQ.o().o() : 0L));
                            it = it2;
                            rih1Var2 = rih1Var3;
                        }
                        mmr0Var = new mmr0(str2, new qz61(z771Var, s4b1VarX, vsdVar));
                    }
                    if (mmr0Var != null) {
                        arrayList.add(mmr0Var);
                    }
                    listB = listB;
                    listB2 = listB2;
                    it2 = it;
                    rih1Var3 = rih1Var2;
                }
                rih1Var = rih1Var3;
                List list2 = listB;
                List list3 = listB2;
                Map mapT = sqg0.T(arrayList);
                List<tv00> listB4 = uv00Var.b(hll.class);
                int iS = zno1.s(q7h.U(listB4, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (tv00 tv00Var2 : listB4) {
                    String str4 = tv00Var2.a;
                    hll hllVar = tv00Var2.b;
                    if (hllVar == null || (list = hllVar.b) == null) {
                        ib71Var = null;
                    } else if (list.contains(ell.d)) {
                        ib71Var = ib71.b;
                    } else if (list.contains(ell.b)) {
                        ib71Var = ib71.a;
                    } else {
                        ib71Var = null;
                    }
                    linkedHashMap.put(str4, ib71Var);
                }
                List<tv00> listB5 = uv00Var.b(hzy.class);
                ArrayList arrayList3 = new ArrayList();
                for (tv00 tv00Var3 : listB5) {
                    hzy hzyVar = tv00Var3.b;
                    if (hzyVar != null && (i = hzyVar.a) != 0) {
                        String str5 = tv00Var3.a;
                        int i35 = gc71.a[l1d.C(i)];
                        if (i35 == 1) {
                            tb71Var = new tb71(str5);
                        } else if (i35 == 2) {
                            tb71Var = new ub71(str5);
                        }
                        if (tb71Var != null) {
                            arrayList3.add(tb71Var);
                        }
                    }
                    tb71Var = null;
                    if (tb71Var != null) {
                        arrayList3.add(tb71Var);
                    }
                }
                int iS2 = zno1.s(q7h.U(arrayList3, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS2 >= 16 ? iS2 : 16);
                for (Object obj19 : arrayList3) {
                    linkedHashMap2.put(((vb71) obj19).getUri(), obj19);
                }
                fc71 fc71Var = new fc71(list2, list3, mapT, linkedHashMap, linkedHashMap2);
                kc71Var.b = 1;
                if (vr20Var.emit(fc71Var, kc71Var) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            case 16:
                if (lnmVar instanceof wk71) {
                    wk71Var = (wk71) lnmVar;
                    int i36 = wk71Var.b;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        wk71Var.b = i36 - Integer.MIN_VALUE;
                    } else {
                        wk71Var = new wk71(this, lnmVar);
                    }
                } else {
                    wk71Var = new wk71(this, lnmVar);
                }
                Object obj20 = wk71Var.a;
                int i37 = wk71Var.b;
                if (i37 != 0) {
                    if (i37 == 1) {
                        hm5.M(obj20);
                        return rih1Var3;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj20);
                if (((List) obj).isEmpty()) {
                    return rih1Var3;
                }
                wk71Var.b = 1;
                return vr20Var.emit(obj, wk71Var) == d9nVar ? d9nVar : rih1Var3;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                if (lnmVar instanceof xk71) {
                    xk71Var = (xk71) lnmVar;
                    int i38 = xk71Var.b;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        xk71Var.b = i38 - Integer.MIN_VALUE;
                    } else {
                        xk71Var = new xk71(this, lnmVar);
                    }
                } else {
                    xk71Var = new xk71(this, lnmVar);
                }
                Object obj21 = xk71Var.a;
                int i39 = xk71Var.b;
                if (i39 != 0) {
                    if (i39 == 1) {
                        hm5.M(obj21);
                        return rih1Var3;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj21);
                if (((Boolean) obj).booleanValue()) {
                    return rih1Var3;
                }
                xk71Var.b = 1;
                return vr20Var.emit(obj, xk71Var) == d9nVar ? d9nVar : rih1Var3;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                if (lnmVar instanceof zk71) {
                    zk71Var = (zk71) lnmVar;
                    int i40 = zk71Var.b;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        zk71Var.b = i40 - Integer.MIN_VALUE;
                    } else {
                        zk71Var = new zk71(this, lnmVar);
                    }
                } else {
                    zk71Var = new zk71(this, lnmVar);
                }
                Object obj22 = zk71Var.a;
                int i41 = zk71Var.b;
                if (i41 != 0) {
                    if (i41 == 1) {
                        hm5.M(obj22);
                        return rih1Var3;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj22);
                if (((Number) obj).intValue() <= 0) {
                    return rih1Var3;
                }
                zk71Var.b = 1;
                return vr20Var.emit(obj, zk71Var) == d9nVar ? d9nVar : rih1Var3;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                if (lnmVar instanceof bm71) {
                    bm71Var = (bm71) lnmVar;
                    int i42 = bm71Var.b;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        bm71Var.b = i42 - Integer.MIN_VALUE;
                    } else {
                        bm71Var = new bm71(this, lnmVar);
                    }
                } else {
                    bm71Var = new bm71(this, lnmVar);
                }
                Object obj23 = bm71Var.a;
                int i43 = bm71Var.b;
                if (i43 != 0) {
                    if (i43 == 1) {
                        hm5.M(obj23);
                        return rih1Var3;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj23);
                if (!(obj instanceof blw0)) {
                    return rih1Var3;
                }
                bm71Var.b = 1;
                return vr20Var.emit(obj, bm71Var) == d9nVar ? d9nVar : rih1Var3;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                if (lnmVar instanceof cm71) {
                    cm71Var = (cm71) lnmVar;
                    int i44 = cm71Var.b;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        cm71Var.b = i44 - Integer.MIN_VALUE;
                    } else {
                        cm71Var = new cm71(this, lnmVar);
                    }
                } else {
                    cm71Var = new cm71(this, lnmVar);
                }
                Object obj24 = cm71Var.a;
                int i45 = cm71Var.b;
                if (i45 == 0) {
                    hm5.M(obj24);
                    hm71 hm71Var = new hm71(((blw0) obj).a);
                    cm71Var.b = 1;
                    return vr20Var.emit(hm71Var, cm71Var) == d9nVar ? d9nVar : rih1Var3;
                }
                if (i45 == 1) {
                    hm5.M(obj24);
                    return rih1Var3;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                if (lnmVar instanceof dm71) {
                    dm71Var = (dm71) lnmVar;
                    int i46 = dm71Var.b;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        dm71Var.b = i46 - Integer.MIN_VALUE;
                    } else {
                        dm71Var = new dm71(this, lnmVar);
                    }
                } else {
                    dm71Var = new dm71(this, lnmVar);
                }
                Object obj25 = dm71Var.a;
                int i47 = dm71Var.b;
                if (i47 != 0) {
                    if (i47 == 1) {
                        hm5.M(obj25);
                        return rih1Var3;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj25);
                if (!(obj instanceof shw0)) {
                    return rih1Var3;
                }
                dm71Var.b = 1;
                return vr20Var.emit(obj, dm71Var) == d9nVar ? d9nVar : rih1Var3;
            case 22:
                if (lnmVar instanceof em71) {
                    em71Var = (em71) lnmVar;
                    int i48 = em71Var.b;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        em71Var.b = i48 - Integer.MIN_VALUE;
                    } else {
                        em71Var = new em71(this, lnmVar);
                    }
                } else {
                    em71Var = new em71(this, lnmVar);
                }
                Object obj26 = em71Var.a;
                int i49 = em71Var.b;
                if (i49 != 0) {
                    if (i49 == 1) {
                        hm5.M(obj26);
                        return rih1Var3;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj26);
                shw0 shw0Var = (shw0) obj;
                gm71 gm71Var = new gm71(shw0Var.a, shw0Var.b);
                em71Var.b = 1;
                return vr20Var.emit(gm71Var, em71Var) == d9nVar ? d9nVar : rih1Var3;
            case 23:
                if (lnmVar instanceof lm71) {
                    lm71Var = (lm71) lnmVar;
                    int i50 = lm71Var.b;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        lm71Var.b = i50 - Integer.MIN_VALUE;
                    } else {
                        lm71Var = new lm71(this, lnmVar);
                    }
                } else {
                    lm71Var = new lm71(this, lnmVar);
                }
                Object obj27 = lm71Var.a;
                int i51 = lm71Var.b;
                if (i51 != 0) {
                    if (i51 == 1) {
                        hm5.M(obj27);
                        return rih1Var3;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj27);
                if (!(obj instanceof rhw0)) {
                    return rih1Var3;
                }
                lm71Var.b = 1;
                return vr20Var.emit(obj, lm71Var) == d9nVar ? d9nVar : rih1Var3;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                if (lnmVar instanceof sn71) {
                    sn71Var = (sn71) lnmVar;
                    int i52 = sn71Var.b;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        sn71Var.b = i52 - Integer.MIN_VALUE;
                    } else {
                        sn71Var = new sn71(this, lnmVar);
                    }
                } else {
                    sn71Var = new sn71(this, lnmVar);
                }
                Object obj28 = sn71Var.a;
                int i53 = sn71Var.b;
                if (i53 != 0) {
                    if (i53 == 1) {
                        hm5.M(obj28);
                        return rih1Var3;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj28);
                if (!(obj instanceof thw0)) {
                    return rih1Var3;
                }
                sn71Var.b = 1;
                return vr20Var.emit(obj, sn71Var) == d9nVar ? d9nVar : rih1Var3;
            case 25:
                if (lnmVar instanceof io71) {
                    io71Var = (io71) lnmVar;
                    int i54 = io71Var.b;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        io71Var.b = i54 - Integer.MIN_VALUE;
                    } else {
                        io71Var = new io71(this, lnmVar);
                    }
                } else {
                    io71Var = new io71(this, lnmVar);
                }
                Object obj29 = io71Var.a;
                int i55 = io71Var.b;
                if (i55 != 0) {
                    if (i55 == 1) {
                        hm5.M(obj29);
                        return rih1Var3;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj29);
                if (((uv00) obj).f) {
                    return rih1Var3;
                }
                io71Var.b = 1;
                return vr20Var.emit(obj, io71Var) == d9nVar ? d9nVar : rih1Var3;
            case 26:
                if (lnmVar instanceof ds71) {
                    ds71Var = (ds71) lnmVar;
                    int i56 = ds71Var.b;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        ds71Var.b = i56 - Integer.MIN_VALUE;
                    } else {
                        ds71Var = new ds71(this, lnmVar);
                    }
                } else {
                    ds71Var = new ds71(this, lnmVar);
                }
                Object obj30 = ds71Var.a;
                int i57 = ds71Var.b;
                if (i57 != 0) {
                    if (i57 == 1) {
                        hm5.M(obj30);
                        return rih1Var3;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj30);
                if ("spotify:meta:node_rules_placeholder".equals((String) obj)) {
                    return rih1Var3;
                }
                ds71Var.b = 1;
                return vr20Var.emit(obj, ds71Var) == d9nVar ? d9nVar : rih1Var3;
            case 27:
                return b(obj, lnmVar);
            case 28:
                if (lnmVar instanceof gv71) {
                    gv71Var = (gv71) lnmVar;
                    int i58 = gv71Var.b;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        gv71Var.b = i58 - Integer.MIN_VALUE;
                    } else {
                        gv71Var = new gv71(this, lnmVar);
                    }
                } else {
                    gv71Var = new gv71(this, lnmVar);
                }
                Object obj31 = gv71Var.a;
                int i59 = gv71Var.b;
                if (i59 == 0) {
                    hm5.M(obj31);
                    Boolean boolValueOf5 = Boolean.valueOf(!((Boolean) obj).booleanValue());
                    gv71Var.b = 1;
                    return vr20Var.emit(boolValueOf5, gv71Var) == d9nVar ? d9nVar : rih1Var3;
                }
                if (i59 == 1) {
                    hm5.M(obj31);
                    return rih1Var3;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (lnmVar instanceof hv71) {
                    hv71Var = (hv71) lnmVar;
                    int i60 = hv71Var.b;
                    if ((i60 & Integer.MIN_VALUE) != 0) {
                        hv71Var.b = i60 - Integer.MIN_VALUE;
                    } else {
                        hv71Var = new hv71(this, lnmVar);
                    }
                } else {
                    hv71Var = new hv71(this, lnmVar);
                }
                Object obj32 = hv71Var.a;
                int i61 = hv71Var.b;
                if (i61 == 0) {
                    hm5.M(obj32);
                    Boolean boolValueOf6 = Boolean.valueOf(!((Boolean) obj).booleanValue());
                    hv71Var.b = 1;
                    return vr20Var.emit(boolValueOf6, hv71Var) == d9nVar ? d9nVar : rih1Var3;
                }
                if (i61 == 1) {
                    hm5.M(obj32);
                    return rih1Var3;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public /* synthetic */ tm61(vr20 vr20Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }
}
