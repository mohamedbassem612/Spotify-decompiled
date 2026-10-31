package p;

import android.bluetooth.le.ScanResult;
import android.content.Context;
import com.spotify.base.java.logging.Logger;
import com.spotify.deviceproxy.navigation.v1.RegisterSupportedNavigationCommandsRequest;
import com.spotify.deviceproxy.navigation.v1.RegisterSupportedNavigationCommandsResponse;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.scrollsita.v1.Section;
import io.reactivex.rxjava3.core.Single;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ip61 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public ip61(vr20 vr20Var, d520 d520Var, hbd1 hbd1Var) {
        this.a = (byte) 27;
        this.b = vr20Var;
        this.c = hbd1Var;
    }

    private final /* bridge */ /* synthetic */ Object e(Object obj, lnm lnmVar) {
        return c(((Boolean) obj).booleanValue(), lnmVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object f(Object obj, lnm lnmVar) {
        rbd1 rbd1Var;
        if (lnmVar instanceof rbd1) {
            rbd1Var = (rbd1) lnmVar;
            int i = rbd1Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                rbd1Var.b = i - Integer.MIN_VALUE;
            } else {
                rbd1Var = new rbd1(this, lnmVar);
            }
        } else {
            rbd1Var = new rbd1(this, lnmVar);
        }
        Object obj2 = rbd1Var.a;
        int i2 = rbd1Var.b;
        Boolean boolValueOf = null;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            String str = (String) obj;
            if (str != null) {
                dbd1 dbd1Var = (dbd1) ((hbd1) this.c);
                boolean zK = yto.k(str, dbd1Var.b);
                if (dbd1Var.c) {
                    zK = !zK;
                }
                boolValueOf = Boolean.valueOf(zK);
            }
            rbd1Var.b = 1;
            Object objEmit = vr20Var.emit(boolValueOf, rbd1Var);
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
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Object g(ScanResult scanResult, lnm lnmVar) {
        ypd1 ypd1Var;
        ScanResult scanResult2;
        String str;
        aqd1 aqd1Var;
        xgn0 xgn0Var;
        if (lnmVar instanceof ypd1) {
            ypd1Var = (ypd1) lnmVar;
            int i = ypd1Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                ypd1Var.g = i - Integer.MIN_VALUE;
            } else {
                ypd1Var = new ypd1(this, lnmVar);
            }
        } else {
            ypd1Var = new ypd1(this, lnmVar);
        }
        Object obj = ypd1Var.e;
        int i2 = ypd1Var.g;
        Object obj2 = this.b;
        if (i2 == 0) {
            hm5.M(obj);
            String address = scanResult.getDevice().getAddress();
            aqd1 aqd1Var2 = (aqd1) obj2;
            xgn0 xgn0Var2 = aqd1Var2.h;
            ypd1Var.a = scanResult;
            ypd1Var.b = address;
            ypd1Var.c = xgn0Var2;
            ypd1Var.d = aqd1Var2;
            ypd1Var.g = 1;
            Object objA = xgn0Var2.a(ypd1Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
            scanResult2 = scanResult;
            str = address;
            aqd1Var = aqd1Var2;
            xgn0Var = xgn0Var2;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aqd1Var = ypd1Var.d;
            xgn0Var = ypd1Var.c;
            String str2 = ypd1Var.b;
            ScanResult scanResult3 = ypd1Var.a;
            hm5.M(obj);
            scanResult2 = scanResult3;
            str = str2;
        }
        try {
            LinkedHashSet linkedHashSet = aqd1Var.i;
            str.getClass();
            boolean zAdd = linkedHashSet.add(str);
            rih1 rih1Var = rih1.a;
            if (!zAdd) {
                xgn0Var.c((Object) null);
                return rih1Var;
            }
            Object obj3 = aqd1Var.e.get();
            eqd1 eqd1Var = (eqd1) obj3;
            ArrayList arrayList = aqd1Var.j;
            eqd1Var.getClass();
            arrayList.add(eqd1Var);
            eqd1 eqd1Var2 = (eqd1) obj3;
            xgn0Var.c((Object) null);
            fn31.T((c9n) this.c, (o8n) null, 0, new sh6(eqd1Var2, scanResult2, (aqd1) obj2, str, (lnm) null), 3);
            return rih1Var;
        } catch (Throwable th) {
            xgn0Var.c((Object) null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object c(boolean z, lnm lnmVar) {
        m2d1 m2d1Var;
        RegisterSupportedNavigationCommandsResponse m231Var;
        if (lnmVar instanceof m2d1) {
            m2d1Var = (m2d1) lnmVar;
            int i = m2d1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                m2d1Var.c = i - Integer.MIN_VALUE;
            } else {
                m2d1Var = new m2d1(this, lnmVar);
            }
        } else {
            m2d1Var = new m2d1(this, lnmVar);
        }
        m2d1 m2d1Var2 = m2d1Var;
        Object objC = m2d1Var2.a;
        d9n d9nVar = d9n.a;
        int i2 = m2d1Var2.c;
        try {
            if (i2 == 0) {
                hm5.M(objC);
                long jB = ((n2d1) this.b).c.b() - ((n2d1) this.b).i;
                if (jB >= 43200000) {
                    Logger.g("[NAV_REG] Re-registering on foreground resume after %ds", new Object[]{new Long(jB / 1000)});
                    n2d1 n2d1Var = (n2d1) this.b;
                    RegisterSupportedNavigationCommandsRequest registerSupportedNavigationCommandsRequest = (RegisterSupportedNavigationCommandsRequest) this.c;
                    svt svtVar = n2d1Var.b;
                    m2d1Var2.c = 1;
                    objC = svt.c(svtVar, registerSupportedNavigationCommandsRequest, (fq21) null, m2d1Var2, 2, (Object) null);
                    if (objC == d9nVar) {
                        return d9nVar;
                    }
                }
                return rih1.a;
            }
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objC);
            m231Var = (RegisterSupportedNavigationCommandsResponse) objC;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        n2d1 n2d1Var2 = (n2d1) this.b;
        if (!(m231Var instanceof m231)) {
            n2d1Var2.i = n2d1Var2.c.b();
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null) {
            Logger.k("[NAV_REG] Foreground re-registration failed: %s", new Object[]{thA.getMessage()});
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0260  */
    /* JADX WARN: Code duplicated, block: B:139:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:155:0x0321  */
    /* JADX WARN: Code duplicated, block: B:176:0x0373  */
    /* JADX WARN: Code duplicated, block: B:192:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:245:0x0481  */
    /* JADX WARN: Code duplicated, block: B:261:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:294:0x0541  */
    /* JADX WARN: Code duplicated, block: B:315:0x0595  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:369:0x067a  */
    /* JADX WARN: Code duplicated, block: B:433:0x07da  */
    /* JADX WARN: Code duplicated, block: B:449:0x081c  */
    /* JADX WARN: Code duplicated, block: B:479:0x08d9  */
    /* JADX WARN: Code duplicated, block: B:499:0x094c  */
    /* JADX WARN: Code duplicated, block: B:511:0x0981  */
    /* JADX WARN: Code duplicated, block: B:521:0x099f  */
    /* JADX WARN: Code duplicated, block: B:537:0x09f0  */
    /* JADX WARN: Code duplicated, block: B:557:0x0a58  */
    /* JADX WARN: Code duplicated, block: B:577:0x0aa0  */
    /* JADX WARN: Code duplicated, block: B:620:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:626:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:655:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:97:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:9:0x0031  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v34 */
    public final Object emit(Object obj, lnm lnmVar) {
        hp61 hp61Var;
        yq61 yq61Var;
        y671 y671Var;
        j871 j871Var;
        vh71 vh71Var;
        Integer num;
        bl71 bl71Var;
        es71 es71Var;
        vr20 vr20Var;
        String str;
        Object objI;
        or71 or71Var;
        mu71 mu71Var;
        bn91 bn91Var;
        oha1 oha1Var;
        cva1 cva1Var;
        yya1 yya1Var;
        g0b1 g0b1Var;
        ecb1 ecb1Var;
        String str2;
        ffb1 ffb1Var;
        sib1 sib1Var;
        v2c1 v2c1Var;
        bgc1 bgc1Var;
        int i;
        fay fayVar;
        mjc1 mjc1Var;
        luc1 luc1Var;
        bxt bxtVar;
        o1d1 o1d1Var;
        vr20 vr20Var2;
        Object obj2;
        vr20 vr20Var3;
        fvd1 fvd1Var;
        byte b = this.a;
        int i2 = 3;
        int i3 = 0;
        i = 0;
        int i4 = 0;
        z = false;
        boolean z = false;
        boolean zEquals = false;
        zF = false;
        zF = false;
        boolean zF = false;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.b;
        Object obj4 = this.c;
        guc1 guc1VarP = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof hp61) {
                    hp61Var = (hp61) lnmVar;
                    int i5 = hp61Var.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        hp61Var.b = i5 - Integer.MIN_VALUE;
                    } else {
                        hp61Var = new hp61(this, lnmVar);
                    }
                } else {
                    hp61Var = new hp61(this, lnmVar);
                }
                Object obj5 = hp61Var.a;
                int i6 = hp61Var.b;
                if (i6 == 0) {
                    hm5.M(obj5);
                    lp61 lp61Var = new lp61((jp61) obj4, (lax) obj, (Serializable) null, (Map) null, 28);
                    hp61Var.b = 1;
                    if (((vr20) obj3).emit(lp61Var, hp61Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i6 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj5);
                }
                return rih1Var;
            case 1:
                if (lnmVar instanceof yq61) {
                    yq61Var = (yq61) lnmVar;
                    int i7 = yq61Var.b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        yq61Var.b = i7 - Integer.MIN_VALUE;
                    } else {
                        yq61Var = new yq61(this, lnmVar);
                    }
                } else {
                    yq61Var = new yq61(this, lnmVar);
                }
                Object obj6 = yq61Var.a;
                int i8 = yq61Var.b;
                if (i8 == 0) {
                    hm5.M(obj6);
                    vr20 vr20Var4 = (vr20) obj3;
                    sq61 sq61Var = ((Boolean) obj).booleanValue() ? (sq61) obj4 : null;
                    yq61Var.b = 1;
                    if (vr20Var4.emit(sq61Var, yq61Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i8 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj6);
                }
                return rih1Var;
            case 2:
                im0 im0Var = (im0) obj4;
                if (lnmVar instanceof y671) {
                    y671Var = (y671) lnmVar;
                    int i9 = y671Var.b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        y671Var.b = i9 - Integer.MIN_VALUE;
                    } else {
                        y671Var = new y671(this, lnmVar);
                    }
                } else {
                    y671Var = new y671(this, lnmVar);
                }
                Object obj7 = y671Var.a;
                int i10 = y671Var.b;
                if (i10 == 0) {
                    hm5.M(obj7);
                    vr20 vr20Var5 = (vr20) obj3;
                    PlayerState playerState = (PlayerState) obj;
                    ContextTrack contextTrack = (ContextTrack) playerState.track().b();
                    String str3 = im0Var.g(playerState).a;
                    String strUri = contextTrack.uri();
                    String strUri2 = l4o1.U(contextTrack) ? contextTrack.uri() : str3;
                    strUri2.getClass();
                    w671 w671Var = new w671(strUri, str3, strUri2, im0.f(contextTrack));
                    y671Var.b = 1;
                    if (vr20Var5.emit(w671Var, y671Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i10 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj7);
                }
                return rih1Var;
            case 3:
                if (lnmVar instanceof j871) {
                    j871Var = (j871) lnmVar;
                    int i11 = j871Var.b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        j871Var.b = i11 - Integer.MIN_VALUE;
                    } else {
                        j871Var = new j871(this, lnmVar);
                    }
                } else {
                    j871Var = new j871(this, lnmVar);
                }
                Object obj8 = j871Var.a;
                int i12 = j871Var.b;
                if (i12 == 0) {
                    hm5.M(obj8);
                    kby kbyVar = ((cxc0) obj).f;
                    Boolean boolValueOf = Boolean.valueOf(((k871) obj4).a(kbyVar.q, kbyVar.w, kbyVar.v));
                    j871Var.b = 1;
                    if (((vr20) obj3).emit(boolValueOf, j871Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i12 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj8);
                }
                return rih1Var;
            case 4:
                if (lnmVar instanceof vh71) {
                    vh71Var = (vh71) lnmVar;
                    int i13 = vh71Var.b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        vh71Var.b = i13 - Integer.MIN_VALUE;
                    } else {
                        vh71Var = new vh71(this, lnmVar);
                    }
                } else {
                    vh71Var = new vh71(this, lnmVar);
                }
                Object obj9 = vh71Var.a;
                int i14 = vh71Var.b;
                if (i14 == 0) {
                    hm5.M(obj9);
                    vr20 vr20Var6 = (vr20) obj3;
                    l771 l771Var = (l771) obj;
                    if (!(l771Var instanceof mtd) || (num = ((uh71) obj4).b) == null) {
                        vh71Var.b = 1;
                        if (vr20Var6.emit(obj, vh71Var) == d9nVar) {
                            return d9nVar;
                        }
                    } else if (num.intValue() == ((mtd) l771Var).a()) {
                        vh71Var.b = 1;
                        if (vr20Var6.emit(obj, vh71Var) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj9);
                }
                return rih1Var;
            case 5:
                if (lnmVar instanceof bl71) {
                    bl71Var = (bl71) lnmVar;
                    int i15 = bl71Var.b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        bl71Var.b = i15 - Integer.MIN_VALUE;
                    } else {
                        bl71Var = new bl71(this, lnmVar);
                    }
                } else {
                    bl71Var = new bl71(this, lnmVar);
                }
                Object obj10 = bl71Var.a;
                int i16 = bl71Var.b;
                if (i16 == 0) {
                    hm5.M(obj10);
                    vr20 vr20Var7 = (vr20) obj3;
                    List<bb71> list = (List) obj;
                    ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                    for (bb71 bb71Var : list) {
                        u771 u771Var = bb71Var.a;
                        int i17 = bb71Var.b;
                        arrayList.add(new h8k1(new g271(u771Var, i17, bb71Var.c, (ela1) obj4), new Integer(i17)));
                    }
                    bl71Var.b = 1;
                    if (vr20Var7.emit(arrayList, bl71Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i16 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj10);
                }
                return rih1Var;
            case 6:
                if (lnmVar instanceof es71) {
                    es71Var = (es71) lnmVar;
                    int i18 = es71Var.b;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        es71Var.b = i18 - Integer.MIN_VALUE;
                    } else {
                        es71Var = new es71(this, lnmVar);
                    }
                } else {
                    es71Var = new es71(this, lnmVar);
                }
                Object obj11 = es71Var.a;
                int i19 = es71Var.b;
                if (i19 != 0) {
                    if (i19 == 1) {
                        i3 = es71Var.d;
                        str = es71Var.f;
                        vr20Var = es71Var.c;
                        hm5.M(obj11);
                        objI = ((e331) obj11).a;
                    } else {
                        if (i19 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj11);
                    }
                    return rih1Var;
                }
                hm5.M(obj11);
                vr20Var = (vr20) obj3;
                str = (String) obj;
                dc31 dc31Var = ((fs71) obj4).a;
                es71Var.c = vr20Var;
                es71Var.f = str;
                es71Var.d = 0;
                es71Var.b = 1;
                objI = dc31Var.i(str, es71Var);
                if (objI == d9nVar) {
                    return d9nVar;
                }
                if (e331.a(objI) == null) {
                    List<ux61> list2 = ((is71) objI).b;
                    ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
                    for (ux61 ux61Var : list2) {
                        w4i1 w4i1Var = ux61Var.d;
                        arrayList2.add(new qr71(new rr71(w4i1Var.a, w4i1Var.b, w4i1Var.d, w4i1Var.c), pcf.d(2, ux61Var.a, ux61Var.b)));
                    }
                    or71Var = new or71(new sr71(str, arrayList2));
                } else {
                    or71Var = nr71.a;
                }
                es71Var.c = null;
                es71Var.f = null;
                es71Var.d = i3;
                es71Var.b = 2;
                if (vr20Var.emit(or71Var, es71Var) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            case 7:
                if (lnmVar instanceof mu71) {
                    mu71Var = (mu71) lnmVar;
                    int i20 = mu71Var.b;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        mu71Var.b = i20 - Integer.MIN_VALUE;
                    } else {
                        mu71Var = new mu71(this, lnmVar);
                    }
                } else {
                    mu71Var = new mu71(this, lnmVar);
                }
                Object obj12 = mu71Var.a;
                int i21 = mu71Var.b;
                if (i21 == 0) {
                    hm5.M(obj12);
                    dma1 dma1VarA = ((nu71) obj4).a((String) obj);
                    mu71Var.b = 1;
                    if (((vr20) obj3).emit(dma1VarA, mu71Var) == d9nVar) {
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
            case 8:
                vr20 vr20Var8 = (vr20) obj3;
                Object objL1 = ((e331) obj).a;
                w2g1 w2g1Var = (w2g1) obj4;
                if (!(objL1 instanceof m231)) {
                    LinkedHashMap linkedHashMap = w2g1Var.a;
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Object obj13 : (List) objL1) {
                        String str4 = ((na81) obj13).d.a;
                        Object objH = linkedHashMap2.get(str4);
                        if (objH == null) {
                            objH = cfm0.h(str4, linkedHashMap2);
                        }
                        ((List) objH).add(obj13);
                    }
                    Collection collectionValues = linkedHashMap2.values();
                    ArrayList<na81> arrayList3 = new ArrayList(q7h.U(collectionValues, 10));
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        Iterator it2 = ((List) it.next()).iterator();
                        if (!it2.hasNext()) {
                            hhg1.h("Empty collection can't be reduced.");
                            return null;
                        }
                        Object next = it2.next();
                        while (it2.hasNext()) {
                            na81 na81Var = (na81) it2.next();
                            next = (na81) next;
                            if (t6p1.o(na81Var, next)) {
                                next = na81Var;
                            }
                        }
                        arrayList3.add((na81) next);
                    }
                    Set setKeySet = linkedHashMap.keySet();
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        linkedHashSet.add(((na81) it3.next()).d.a);
                    }
                    setKeySet.retainAll(linkedHashSet);
                    for (na81 na81Var2 : arrayList3) {
                        ah40 ah40Var = na81Var2.d;
                        dh40 dh40Var = ah40Var.b;
                        Set set = w2g1.b;
                        String str5 = ah40Var.a;
                        if (set.contains(dh40Var)) {
                            na81 na81Var3 = (na81) linkedHashMap.get(str5);
                            if (na81Var3 == null) {
                                if (dh40Var == dh40.b || dh40Var == dh40.e || t6p1.k(na81Var2)) {
                                    linkedHashMap.put(str5, na81Var2);
                                }
                            } else if (t6p1.o(na81Var2, na81Var3)) {
                                linkedHashMap.put(str5, na81Var2);
                            }
                        }
                    }
                    objL1 = o7h.l1(linkedHashMap.values());
                }
                Object objEmit = vr20Var8.emit(new e331(objL1), lnmVar);
                return objEmit == d9nVar ? objEmit : rih1Var;
            case 9:
                if (lnmVar instanceof bn91) {
                    bn91Var = (bn91) lnmVar;
                    int i22 = bn91Var.b;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        bn91Var.b = i22 - Integer.MIN_VALUE;
                    } else {
                        bn91Var = new bn91(this, lnmVar);
                    }
                } else {
                    bn91Var = new bn91(this, lnmVar);
                }
                Object obj14 = bn91Var.a;
                int i23 = bn91Var.b;
                if (i23 == 0) {
                    hm5.M(obj14);
                    Boolean boolValueOf2 = Boolean.valueOf(!((xyl1) ((cn91) obj4).a.c).a(((cxc0) obj).f.q));
                    bn91Var.b = 1;
                    if (((vr20) obj3).emit(boolValueOf2, bn91Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i23 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj14);
                }
                return rih1Var;
            case 10:
                me81 me81Var = (me81) obj;
                ((p811) obj3).a = me81Var;
                pda1 pda1Var = (pda1) obj4;
                brl0 brl0Var = pda1Var.m;
                int i24 = me81Var.a;
                String strD = pda1Var.d();
                String strE = pda1Var.e();
                if (i24 == 1) {
                    if (strD.equals("recently_played")) {
                        i2 = 4;
                    } else if (strD.equals("followed_artists")) {
                        i2 = 1;
                    } else if (strD.equals("liked_songs")) {
                        i2 = 2;
                    } else if (!strD.equals("most_played")) {
                        i2 = 0;
                    }
                    if (i2 != 0) {
                        guc1VarP = new e1m0(brl0Var, i2);
                    }
                } else {
                    guc1VarP = d9y0.p(brl0Var, i24, strE);
                }
                if (guc1VarP != null) {
                    j0p1.w(pda1Var.t, new gy00(guc1VarP, (byte) 11));
                }
                return rih1Var;
            case 11:
                pha1 pha1Var = (pha1) obj4;
                if (lnmVar instanceof oha1) {
                    oha1Var = (oha1) lnmVar;
                    int i25 = oha1Var.b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        oha1Var.b = i25 - Integer.MIN_VALUE;
                    } else {
                        oha1Var = new oha1(this, lnmVar);
                    }
                } else {
                    oha1Var = new oha1(this, lnmVar);
                }
                Object obj15 = oha1Var.a;
                int i26 = oha1Var.b;
                if (i26 == 0) {
                    hm5.M(obj15);
                    vr20 vr20Var9 = (vr20) obj3;
                    cxc0 cxc0Var = (cxc0) obj;
                    le30 le30VarA = pha1Var.e.a(cxc0Var.f.p);
                    d2f1 d2f1Var = pha1Var.d;
                    String str6 = pha1Var.a;
                    boolean z2 = cxc0Var.i;
                    kby kbyVar2 = cxc0Var.f;
                    boolean z3 = kbyVar2.D;
                    x7i1 x7i1Var = kbyVar2.w;
                    Map map = kbyVar2.q;
                    jq4 jq4Var = d2f1Var.c;
                    if (!z2) {
                        if (d2f1.a(str6, le30VarA)) {
                            zF = jq4Var.e();
                        } else if (!z3) {
                            CharSequence charSequence = (CharSequence) map.get("image_url");
                            if (charSequence == null || charSequence.length() == 0) {
                                zF = jq4Var.f();
                            }
                        } else if (jq4Var.h() || x7i1Var.b) {
                            zF = true;
                        }
                    }
                    Boolean boolValueOf3 = Boolean.valueOf(zF);
                    oha1Var.b = 1;
                    if (vr20Var9.emit(boolValueOf3, oha1Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i26 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj15);
                }
                return rih1Var;
            case 12:
                if (lnmVar instanceof cva1) {
                    cva1Var = (cva1) lnmVar;
                    int i27 = cva1Var.b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        cva1Var.b = i27 - Integer.MIN_VALUE;
                    } else {
                        cva1Var = new cva1(this, lnmVar);
                    }
                } else {
                    cva1Var = new cva1(this, lnmVar);
                }
                Object obj16 = cva1Var.a;
                int i28 = cva1Var.b;
                if (i28 == 0) {
                    hm5.M(obj16);
                    vr20 vr20Var10 = (vr20) obj3;
                    zua1 zua1Var = (((oqa1) ((hp91) obj4).b).a && ((Boolean) obj).booleanValue()) ? zua1.a : ava1.a;
                    cva1Var.b = 1;
                    if (vr20Var10.emit(zua1Var, cva1Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i28 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj16);
                }
                return rih1Var;
            case 13:
                fza1 fza1Var = ((dza1) obj4).c;
                if (lnmVar instanceof yya1) {
                    yya1Var = (yya1) lnmVar;
                    int i29 = yya1Var.b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        yya1Var.b = i29 - Integer.MIN_VALUE;
                    } else {
                        yya1Var = new yya1(this, lnmVar);
                    }
                } else {
                    yya1Var = new yya1(this, lnmVar);
                }
                Object obj17 = yya1Var.a;
                int i30 = yya1Var.b;
                if (i30 == 0) {
                    hm5.M(obj17);
                    vr20 vr20Var11 = (vr20) obj3;
                    mmr0 mmr0Var = (mmr0) obj;
                    ji0 ji0Var = (ji0) mmr0Var.a;
                    String str7 = (String) mmr0Var.b;
                    if (ji0Var != null && fza1Var.b(str7)) {
                        String str8 = ji0Var.W0;
                        String str9 = ji0Var.c;
                        if (str8.equals("sponsored_playlist")) {
                            String strA = fza1Var.a(str7);
                            zEquals = (str9.length() == 0 || strA == null || strA.length() == 0) ? true : str9.equals(strA);
                        }
                        if (!zEquals) {
                            yya1Var.b = 1;
                            if (vr20Var11.emit(obj, yya1Var) == d9nVar) {
                                return d9nVar;
                            }
                        }
                    }
                } else {
                    if (i30 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj17);
                }
                return rih1Var;
            case 14:
                if (lnmVar instanceof g0b1) {
                    g0b1Var = (g0b1) lnmVar;
                    int i31 = g0b1Var.b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        g0b1Var.b = i31 - Integer.MIN_VALUE;
                    } else {
                        g0b1Var = new g0b1(this, lnmVar);
                    }
                } else {
                    g0b1Var = new g0b1(this, lnmVar);
                }
                Object obj18 = g0b1Var.a;
                int i32 = g0b1Var.b;
                if (i32 == 0) {
                    hm5.M(obj18);
                    d0b1 d0b1Var = new d0b1((ji0) obj4, ((Boolean) obj).booleanValue());
                    g0b1Var.b = 1;
                    if (((vr20) obj3).emit(d0b1Var, g0b1Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i32 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj18);
                }
                return rih1Var;
            case 15:
                HashSet hashSet = (HashSet) obj;
                Set set2 = (Set) obj3;
                kd41 kd41Var = (kd41) obj4;
                Iterator it4 = dm61.v0(set2, hashSet).iterator();
                while (it4.hasNext()) {
                    kd41Var.b(it4.next());
                }
                set2.retainAll(hashSet);
                r7h.W(hashSet, set2);
                return rih1Var;
            case 16:
                fcb1 fcb1Var = (fcb1) obj4;
                if (lnmVar instanceof ecb1) {
                    ecb1Var = (ecb1) lnmVar;
                    int i33 = ecb1Var.b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        ecb1Var.b = i33 - Integer.MIN_VALUE;
                    } else {
                        ecb1Var = new ecb1(this, lnmVar);
                    }
                } else {
                    ecb1Var = new ecb1(this, lnmVar);
                }
                Object obj19 = ecb1Var.a;
                int i34 = ecb1Var.b;
                if (i34 == 0) {
                    hm5.M(obj19);
                    vr20 vr20Var12 = (vr20) obj3;
                    cxc0 cxc0Var2 = (cxc0) obj;
                    kby kbyVar3 = cxc0Var2.f;
                    iy50 iy50Var = fcb1Var.b;
                    if (iy50Var == null) {
                        iy50Var = (kbyVar3.w.b && ((str2 = kbyVar3.A) == null || str2.length() == 0) && cxc0Var2.a()) ? iy50.b : fcb1.d(kbyVar3) ? iy50.c : iy50.a;
                        fcb1Var.b = iy50Var;
                    }
                    ly50 ly50Var = new ly50(iy50Var, fcb1.d(kbyVar3) || kbyVar3.D, true, 2131956016, true, Boolean.valueOf(fcb1.d(kbyVar3) || fcb1Var.a.a()));
                    ecb1Var.b = 1;
                    if (vr20Var12.emit(ly50Var, ecb1Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i34 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj19);
                }
                return rih1Var;
            case 17:
                if (lnmVar instanceof ffb1) {
                    ffb1Var = (ffb1) lnmVar;
                    int i35 = ffb1Var.b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        ffb1Var.b = i35 - Integer.MIN_VALUE;
                    } else {
                        ffb1Var = new ffb1(this, lnmVar);
                    }
                } else {
                    ffb1Var = new ffb1(this, lnmVar);
                }
                Object obj20 = ffb1Var.a;
                int i36 = ffb1Var.b;
                if (i36 == 0) {
                    hm5.M(obj20);
                    yeb1 yeb1VarY = ryn1.y((yeb1) obj4, (Map) obj);
                    ffb1Var.b = 1;
                    if (((vr20) obj3).emit(yeb1VarY, ffb1Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i36 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj20);
                }
                return rih1Var;
            case 18:
                if (lnmVar instanceof sib1) {
                    sib1Var = (sib1) lnmVar;
                    int i37 = sib1Var.b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        sib1Var.b = i37 - Integer.MIN_VALUE;
                    } else {
                        sib1Var = new sib1(this, lnmVar);
                    }
                } else {
                    sib1Var = new sib1(this, lnmVar);
                }
                Object obj21 = sib1Var.a;
                int i38 = sib1Var.b;
                if (i38 == 0) {
                    hm5.M(obj21);
                    vr20 vr20Var13 = (vr20) obj3;
                    pp90 pp90Var = (pp90) obj;
                    qib1 qib1Var = (qib1) obj4;
                    phx phxVar = qib1Var.a;
                    c380 c380Var = qib1Var.b;
                    if (pp90Var != null && pp90Var.h.b.e) {
                        z = true;
                    }
                    rib1 rib1Var = new rib1(phxVar, c380Var, z);
                    sib1Var.b = 1;
                    if (vr20Var13.emit(rib1Var, sib1Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i38 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj21);
                }
                return rih1Var;
            case 19:
                if (lnmVar instanceof v2c1) {
                    v2c1Var = (v2c1) lnmVar;
                    int i39 = v2c1Var.b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        v2c1Var.b = i39 - Integer.MIN_VALUE;
                    } else {
                        v2c1Var = new v2c1(this, lnmVar);
                    }
                } else {
                    v2c1Var = new v2c1(this, lnmVar);
                }
                Object obj22 = v2c1Var.a;
                int i40 = v2c1Var.b;
                if (i40 == 0) {
                    hm5.M(obj22);
                    Object objL = dug.l((Class) obj4, ((u2c1) obj).a);
                    v2c1Var.b = 1;
                    if (((vr20) obj3).emit(objL, v2c1Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i40 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj22);
                }
                return rih1Var;
            case 20:
                Context context = ((cgc1) obj4).b;
                if (lnmVar instanceof bgc1) {
                    bgc1Var = (bgc1) lnmVar;
                    int i41 = bgc1Var.b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        bgc1Var.b = i41 - Integer.MIN_VALUE;
                    } else {
                        bgc1Var = new bgc1(this, lnmVar);
                    }
                } else {
                    bgc1Var = new bgc1(this, lnmVar);
                }
                Object obj23 = bgc1Var.a;
                int i42 = bgc1Var.b;
                if (i42 != 0) {
                    if (i42 == 1) {
                        hm5.M(obj23);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj23);
                vr20 vr20Var14 = (vr20) obj3;
                zfc1 zfc1Var = (zfc1) obj;
                zfc1Var.getClass();
                switch (zfc1Var.ordinal()) {
                    case 0:
                        i = 2131957777;
                        String string = context.getString(i);
                        fayVar = new fay(Collections.singletonList(new brc1(string, 1, context.getString(2131951701, string))));
                        bgc1Var.b = 1;
                        if (vr20Var14.emit(fayVar, bgc1Var) == d9nVar) {
                            return d9nVar;
                        }
                        return rih1Var;
                    case 1:
                        i = 2131957773;
                        String string2 = context.getString(i);
                        fayVar = new fay(Collections.singletonList(new brc1(string2, 1, context.getString(2131951701, string2))));
                        bgc1Var.b = 1;
                        if (vr20Var14.emit(fayVar, bgc1Var) == d9nVar) {
                            return d9nVar;
                        }
                        return rih1Var;
                    case 2:
                        i = 2131957775;
                        String string3 = context.getString(i);
                        fayVar = new fay(Collections.singletonList(new brc1(string3, 1, context.getString(2131951701, string3))));
                        bgc1Var.b = 1;
                        if (vr20Var14.emit(fayVar, bgc1Var) == d9nVar) {
                            return d9nVar;
                        }
                        return rih1Var;
                    case 3:
                        i = 2131957766;
                        String string4 = context.getString(i);
                        fayVar = new fay(Collections.singletonList(new brc1(string4, 1, context.getString(2131951701, string4))));
                        bgc1Var.b = 1;
                        if (vr20Var14.emit(fayVar, bgc1Var) == d9nVar) {
                            return d9nVar;
                        }
                        return rih1Var;
                    case 4:
                        i = 2131957778;
                        String string5 = context.getString(i);
                        fayVar = new fay(Collections.singletonList(new brc1(string5, 1, context.getString(2131951701, string5))));
                        bgc1Var.b = 1;
                        if (vr20Var14.emit(fayVar, bgc1Var) == d9nVar) {
                            return d9nVar;
                        }
                        return rih1Var;
                    case 5:
                    case 6:
                        i = 2131957768;
                        String string6 = context.getString(i);
                        fayVar = new fay(Collections.singletonList(new brc1(string6, 1, context.getString(2131951701, string6))));
                        bgc1Var.b = 1;
                        if (vr20Var14.emit(fayVar, bgc1Var) == d9nVar) {
                            return d9nVar;
                        }
                        return rih1Var;
                    default:
                        eg.o();
                        return null;
                }
            case 21:
                if (lnmVar instanceof mjc1) {
                    mjc1Var = (mjc1) lnmVar;
                    int i43 = mjc1Var.b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        mjc1Var.b = i43 - Integer.MIN_VALUE;
                    } else {
                        mjc1Var = new mjc1(this, lnmVar);
                    }
                } else {
                    mjc1Var = new mjc1(this, lnmVar);
                }
                Object obj24 = mjc1Var.a;
                int i44 = mjc1Var.b;
                if (i44 == 0) {
                    hm5.M(obj24);
                    ly50 ly50VarA = ly50.a((ly50) obj, (iy50) null, true, false, 0, false, (px50) null, new by50(((Context) ((uqg) obj4).b).getColor(2131104057)), 189);
                    mjc1Var.b = 1;
                    if (((vr20) obj3).emit(ly50VarA, mjc1Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i44 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj24);
                }
                return rih1Var;
            case 22:
                if (lnmVar instanceof luc1) {
                    luc1Var = (luc1) lnmVar;
                    int i45 = luc1Var.b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        luc1Var.b = i45 - Integer.MIN_VALUE;
                    } else {
                        luc1Var = new luc1(this, lnmVar);
                    }
                } else {
                    luc1Var = new luc1(this, lnmVar);
                }
                Object obj25 = luc1Var.a;
                int i46 = luc1Var.b;
                if (i46 == 0) {
                    hm5.M(obj25);
                    vr20 vr20Var15 = (vr20) obj3;
                    kuc1 kuc1Var = (kuc1) ((Map) obj).get(((jwc1) obj4).a());
                    if (kuc1Var != null) {
                        if (kuc1Var.c != 1) {
                            kuc1Var = null;
                        }
                        if (kuc1Var != null) {
                            guc1VarP = kuc1Var.a;
                        }
                    }
                    luc1Var.b = 1;
                    if (vr20Var15.emit(guc1VarP, luc1Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i46 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj25);
                }
                return rih1Var;
            case 23:
                guc1 guc1Var = (guc1) obj;
                ewc1 ewc1Var = (ewc1) obj3;
                if (guc1Var == null) {
                    ewc1Var.b();
                } else {
                    bxt bxtVar2 = guc1Var.a;
                    ewc1Var.getSurface().getClass();
                    bxtVar2.getClass();
                    ewc1Var.a(bxtVar2, guc1Var.b, new ccb1(obj4, (Object) ewc1Var, (byte) 16));
                }
                return rih1Var;
            case 24:
                guc1 guc1Var2 = (guc1) obj;
                kwc1 kwc1Var = (kwc1) obj3;
                if (guc1Var2 != null && (bxtVar = guc1Var2.a) != null) {
                    bxtVar.getName();
                }
                muc1 muc1Var = ((fvc1) obj4).a;
                c921.y(muc1Var.c, (o8n) null, 0, new ku91(guc1Var2, muc1Var, kwc1Var, (lnm) null, (byte) 9), 3);
                return rih1Var;
            case 25:
                if (lnmVar instanceof o1d1) {
                    o1d1Var = (o1d1) lnmVar;
                    int i47 = o1d1Var.b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        o1d1Var.b = i47 - Integer.MIN_VALUE;
                    } else {
                        o1d1Var = new o1d1(this, lnmVar);
                    }
                } else {
                    o1d1Var = new o1d1(this, lnmVar);
                }
                Object obj26 = o1d1Var.a;
                int i48 = o1d1Var.b;
                if (i48 != 0) {
                    if (i48 == 1) {
                        i4 = o1d1Var.d;
                        vr20Var3 = o1d1Var.c;
                        hm5.M(obj26);
                    } else {
                        if (i48 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj26);
                    }
                    return rih1Var;
                }
                hm5.M(obj26);
                vr20Var2 = (vr20) obj3;
                if (((Boolean) obj).booleanValue()) {
                    obj2 = Boolean.TRUE;
                } else {
                    Single singleA = ((fzm0) ((ua91) obj4).e).a();
                    o1d1Var.c = vr20Var2;
                    o1d1Var.d = 0;
                    o1d1Var.b = 1;
                    Object objJ = fc11.j(singleA, o1d1Var);
                    if (objJ == d9nVar) {
                        return d9nVar;
                    }
                    vr20Var3 = vr20Var2;
                    obj26 = objJ;
                }
                o1d1Var.c = null;
                o1d1Var.d = i4;
                o1d1Var.b = 2;
                if (vr20Var2.emit(obj2, o1d1Var) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
                vr20 vr20Var16 = vr20Var3;
                obj2 = obj26;
                vr20Var2 = vr20Var16;
                o1d1Var.c = null;
                o1d1Var.d = i4;
                o1d1Var.b = 2;
                if (vr20Var2.emit(obj2, o1d1Var) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            case 26:
                return e(obj, lnmVar);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return f(obj, lnmVar);
            case 28:
                return g(obj, lnmVar);
            default:
                gvd1 gvd1Var = (gvd1) obj4;
                if (lnmVar instanceof fvd1) {
                    fvd1Var = (fvd1) lnmVar;
                    int i49 = fvd1Var.b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        fvd1Var.b = i49 - Integer.MIN_VALUE;
                    } else {
                        fvd1Var = new fvd1(this, lnmVar);
                    }
                } else {
                    fvd1Var = new fvd1(this, lnmVar);
                }
                Object obj27 = fvd1Var.a;
                int i50 = fvd1Var.b;
                if (i50 == 0) {
                    hm5.M(obj27);
                    vr20 vr20Var17 = (vr20) obj3;
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    if (gvd1Var.a.a() && zBooleanValue) {
                        gtx gtxVar = gtx.c;
                        tm81 tm81Var = new tm81(0, 12, p3d1.d(1), new k7b1(1, gvd1Var.c, ivd1.class, "newnessExpiryDate", "newnessExpiryDate(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 12), false);
                        String str10 = nik1.R6.a;
                        uzl0 uzl0Var = (uzl0) gvd1Var.b.get();
                        uzl0Var.getClass();
                        guc1VarP = new kh81(gtxVar, 2131962462, str10, tm81Var, new jh81(new szl0(uzl0Var), ppd1.e), null, 66);
                    }
                    fvd1Var.b = 1;
                    if (vr20Var17.emit(guc1VarP, fvd1Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i50 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj27);
                }
                return rih1Var;
        }
    }

    public /* synthetic */ ip61(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
