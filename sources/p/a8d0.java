package p;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.nsd.NsdServiceInfo;
import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import com.spotify.base.java.logging.Logger;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.local_files_esperanto.proto.EsLocalFiles;
import com.spotify.localfiles.localfilesmonorepo.AddedLocalFile;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.internal.observers.BlockingMultiObserver;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import j$.time.Instant;
import j$.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class a8d0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public a8d0(vr20 vr20Var, lpd0 lpd0Var, h290 h290Var) {
        this.a = (byte) 7;
        this.b = vr20Var;
        this.c = h290Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    private final Object b(Object obj, lnm lnmVar) {
        b3g0 b3g0Var;
        CastDevice castDeviceK;
        boolean z;
        ur31 ur31Var;
        Object next;
        ur31 ur31Var2;
        int i;
        int i2;
        int i3;
        va6 va6VarA;
        if (lnmVar instanceof b3g0) {
            b3g0Var = (b3g0) lnmVar;
            int i4 = b3g0Var.b;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                b3g0Var.b = i4 - Integer.MIN_VALUE;
            } else {
                b3g0Var = new b3g0(this, lnmVar);
            }
        } else {
            b3g0Var = new b3g0(this, lnmVar);
        }
        Object obj2 = b3g0Var.a;
        int i5 = b3g0Var.b;
        int i6 = 1;
        va6 va6Var = null;
        if (i5 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            List list = (List) obj;
            cp31 cp31Var = ((c3g0) this.c).c;
            ArrayList arrayList = new ArrayList(q7h.U(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                cpt cptVar = (cpt) it.next();
                ogr ogrVar = (ogr) cp31Var.a;
                iuq0 iuq0Var = (g3e) cp31Var.d;
                jo20 jo20Var = (jo20) cp31Var.e;
                boolean z2 = cptVar.l;
                String str = cptVar.a;
                String str2 = cptVar.b;
                wmy wmyVar = new wmy(str, str2);
                va6 va6Var2 = va6Var;
                Bundle bundle = (Bundle) wmyVar.a;
                boolean z3 = cptVar.h;
                Iterator it2 = it;
                boolean z4 = cptVar.j;
                int i7 = cptVar.g;
                ur31 ur31Var3 = new ur31(z3, i7 <= 0 ? 0 : jch0.S(wmo1.B(cptVar.f) * ((double) i7)), i7);
                if (jo20Var.isEnabled() && z4) {
                    va6 va6Var3 = (va6) ((itz) cp31Var.f).e.getValue();
                    if (va6Var3 != null) {
                        if (!va6Var3.a) {
                            va6Var3 = va6Var2;
                        }
                        if (va6Var3 != null && (va6VarA = va6Var3.a(str)) != null) {
                            if (!((ab6) va6VarA).g) {
                                va6VarA = va6Var2;
                            }
                            if (va6VarA != null) {
                                ur31Var2 = new ur31(true, jch0.S(yoi1.n(((ab6) va6VarA).e, 0.0d, 1.0d) * 100.0d), 100);
                            }
                        }
                    }
                    ur31Var = ur31Var3;
                    ur31Var2 = ur31Var;
                } else {
                    if (iuq0Var.c() && z4 && (castDeviceK = ogrVar.K(str)) != null) {
                        Iterator it3 = ((p7s) cp31Var.b).d().iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                next = it3.next();
                                CastDevice castDevice = castDeviceK;
                                z = z3;
                                ur31Var = ur31Var3;
                                if (!ihc1.h0(((pr31) next).a, castDevice.j(), false)) {
                                    castDeviceK = castDevice;
                                    z3 = z;
                                    ur31Var3 = ur31Var;
                                }
                            } else {
                                z = z3;
                                ur31Var = ur31Var3;
                                next = va6Var2;
                            }
                        }
                        pr31 pr31Var = (pr31) next;
                        if (pr31Var != null) {
                            ur31Var2 = new ur31(z2 ? z : true, pr31Var.h, pr31Var.i);
                        }
                    } else {
                        ur31Var = ur31Var3;
                    }
                    ur31Var2 = ur31Var;
                }
                bundle.putStringArrayList("deduplicationIds", new ArrayList<>(cptVar.q));
                int iC = l1d.C(cptVar.c);
                if (iC == 0) {
                    i = 2;
                } else if (iC == 1) {
                    i = 1;
                } else {
                    if (iC != 2) {
                        eg.o();
                        return va6Var2;
                    }
                    i = 0;
                }
                wmyVar.v(i);
                if (cptVar.m) {
                    i2 = 1000;
                } else {
                    switch (l1d.C(cptVar.n)) {
                        case 0:
                            i2 = 0;
                            break;
                        case 1:
                            i2 = 7;
                            break;
                        case 2:
                            i2 = 5;
                            break;
                        case 3:
                            i2 = 11;
                            break;
                        case 4:
                            i2 = 2;
                            break;
                        case 5:
                            i2 = 1;
                            break;
                        case 6:
                            i2 = 4;
                            break;
                        case 7:
                            i2 = 8;
                            break;
                        case 8:
                            i2 = 9;
                            break;
                        case 9:
                            i2 = 10;
                            break;
                        case 10:
                            i2 = 3;
                            break;
                        default:
                            eg.o();
                            return va6Var2;
                    }
                }
                wmyVar.x(i2);
                wmyVar.y(z2 || cptVar.i);
                wmyVar.G(ur31Var2.a ? 1 : 0);
                wmyVar.F(ur31Var2.b);
                wmyVar.H(ur31Var2.c);
                wmyVar.w(cptVar.d);
                String str3 = (String) cp31Var.c;
                wmyVar.d(p7h.H(new IntentFilter[]{cp31.B(str3, "audio/*"), cp31.B(str3, "video/*")}));
                wmyVar.B(3);
                wmyVar.C(1);
                bundle.putBoolean("isDynamicGroupRoute", false);
                bundle.putBoolean("canDisconnect", true);
                bundle.putBoolean("isVisibilityPublic", false);
                wmyVar.d = new HashSet((Collection) w7x.a);
                Bundle bundleG = cy30.g("com.spotify.connect.EXTRA_CONNECT_STATE_IDENTIFIER", str);
                if (z4) {
                    if (!jo20Var.isEnabled()) {
                        CastDevice castDeviceK2 = ogrVar.K(str);
                        if (castDeviceK2 != null) {
                            bundleG.putParcelable("com.spotify.connect.EXTRA_CAST_DEVICE_INFO", iho1.r(castDeviceK2));
                            if (iuq0Var.c()) {
                                bundleG.putBoolean("com.google.android.gms.cast.EXTRA_ROUTE_CONNECTION", true);
                            }
                        } else {
                            Logger.d(cy30.p("Cast device not found ", str2, "(", str, ")"), new Object[0]);
                        }
                    }
                    i3 = 1;
                    bundleG.putBoolean("com.spotify.connect.EXTRA_IS_CAST", true);
                } else {
                    i3 = 1;
                }
                wmyVar.z(bundleG);
                arrayList.add(wmyVar.h());
                it = it2;
                va6Var = va6Var2;
                i6 = i3;
            }
            b3g0Var.b = i6;
            Object objEmit = vr20Var.emit(arrayList, b3g0Var);
            d9n d9nVar = d9n.a;
            if (objEmit == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i5 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x018b A[PHI: r17
      0x018b: PHI (r17v2 p.vr20) = (r17v1 p.vr20), (r17v5 p.vr20) binds: [B:86:0x01cf, B:67:0x0186] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02d7, code lost:
    
        if (r6.emit(r5, r3) == r8) goto L132;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object c(java.lang.Object r25, p.lnm r26) {
        /*
            Method dump skipped, instruction units count: 733
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.a8d0.c(java.lang.Object, p.lnm):java.lang.Object");
    }

    private final Object e(Object obj, lnm lnmVar) {
        iy90 iy90VarA;
        String str;
        gy90 gy90Var = (gy90) obj;
        List list = jy90.a;
        p811 p811Var = (p811) this.b;
        hy90 hy90Var = (hy90) p811Var.a;
        String str2 = null;
        if (gy90Var instanceof cy90) {
            cy90 cy90Var = (cy90) gy90Var;
            iy90VarA = new iy90(hy90.a(hy90Var, null, null, cy90Var.a, 0, 11), new yx90(cy90Var.a.a.c, 0));
        } else if (gy90Var instanceof dy90) {
            iy90VarA = new iy90(hy90.a(hy90Var, null, null, null, 0, 11), null);
        } else if (gy90Var instanceof by90) {
            vo90 vo90Var = hy90Var.a;
            iy90VarA = new iy90(hy90.a(hy90Var, null, null, null, 0, 11), vo90Var != null ? new yx90(vo90Var.c, 2) : null);
        } else if (gy90Var instanceof ey90) {
            ey90 ey90Var = (ey90) gy90Var;
            iy90VarA = jy90.a(hy90.a(hy90Var, ey90Var.a, null, null, ey90Var.b, 6));
        } else {
            if (!(gy90Var instanceof fy90)) {
                eg.o();
                return null;
            }
            iy90VarA = jy90.a(hy90.a(hy90Var, null, ((fy90) gy90Var).a, null, 0, 13));
        }
        p811Var.a = iy90VarA.a;
        ay90 ay90Var = iy90VarA.b;
        if (ay90Var != null) {
            neh0 neh0Var = (neh0) this.c;
            g7s g7sVar = neh0Var.b;
            if (ay90Var instanceof xx90) {
                jeh0 jeh0Var = ((xx90) ay90Var).a;
                dxy dxyVar = g7sVar.a;
                ((BehaviorSubject) dxyVar.e).onNext(jeh0Var);
                ((BehaviorSubject) dxyVar.f).onNext(ebc0.a);
            } else if (ay90Var instanceof zx90) {
                ((BehaviorSubject) g7sVar.a.f).onNext(fbc0.a);
            } else {
                if (!(ay90Var instanceof yx90)) {
                    eg.o();
                    return null;
                }
                yx90 yx90Var = (yx90) ay90Var;
                int i = yx90Var.b;
                g2z g2zVar = neh0Var.c;
                String str3 = yx90Var.a;
                if (i != 0) {
                    if (i == 1) {
                        str = "local_network_missing";
                    } else if (i == 2) {
                        str = "mdns_unavailable";
                    } else if (i == 3) {
                        str = "not_reachable";
                    } else if (i == 4) {
                        str = "active_device_out_of_sync";
                    } else {
                        if (i != 5) {
                            throw null;
                        }
                        str = "ui_toggle_out_of_sync";
                    }
                    str2 = str;
                }
                g2zVar.v(1, str3, str2);
            }
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object f(Object obj, lnm lnmVar) {
        ueh0 ueh0Var;
        NsdServiceInfo m231Var;
        if (lnmVar instanceof ueh0) {
            ueh0Var = (ueh0) lnmVar;
            int i = ueh0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ueh0Var.b = i - Integer.MIN_VALUE;
            } else {
                ueh0Var = new ueh0(this, lnmVar);
            }
        } else {
            ueh0Var = new ueh0(this, lnmVar);
        }
        Object obj2 = ueh0Var.a;
        int i2 = ueh0Var.b;
        iap0 eap0Var = null;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            iap0 iap0Var = (iap0) obj;
            if (iap0Var instanceof eap0) {
                try {
                    Maybe maybeB = ((jap0) this.c).b(((eap0) iap0Var).a);
                    BlockingMultiObserver blockingMultiObserver = new BlockingMultiObserver();
                    maybeB.subscribe(blockingMultiObserver);
                    m231Var = (NsdServiceInfo) blockingMultiObserver.b();
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                if (m231Var instanceof m231) {
                    m231Var = null;
                }
                NsdServiceInfo nsdServiceInfo = m231Var;
                if (nsdServiceInfo == null) {
                    nsdServiceInfo = null;
                }
                if (nsdServiceInfo != null) {
                    eap0Var = new eap0(nsdServiceInfo);
                }
            } else {
                eap0Var = iap0Var;
            }
            if (eap0Var != null) {
                ueh0Var.b = 1;
                Object objEmit = vr20Var.emit(eap0Var, ueh0Var);
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

    /* JADX WARN: Code duplicated, block: B:122:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:156:0x025e  */
    /* JADX WARN: Code duplicated, block: B:161:0x026c  */
    /* JADX WARN: Code duplicated, block: B:181:0x0305  */
    /* JADX WARN: Code duplicated, block: B:199:0x0352  */
    /* JADX WARN: Code duplicated, block: B:222:0x039e  */
    /* JADX WARN: Code duplicated, block: B:251:0x041d  */
    /* JADX WARN: Code duplicated, block: B:272:0x046f  */
    /* JADX WARN: Code duplicated, block: B:288:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:312:0x0540  */
    /* JADX WARN: Code duplicated, block: B:330:0x058c  */
    /* JADX WARN: Code duplicated, block: B:341:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:359:0x05f9  */
    /* JADX WARN: Code duplicated, block: B:36:0x008f  */
    /* JADX WARN: Code duplicated, block: B:370:0x0618  */
    /* JADX WARN: Code duplicated, block: B:397:0x06db  */
    /* JADX WARN: Code duplicated, block: B:431:0x079c  */
    /* JADX WARN: Code duplicated, block: B:478:0x087b  */
    /* JADX WARN: Code duplicated, block: B:493:0x08ba  */
    /* JADX WARN: Code duplicated, block: B:513:0x090a  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:547:0x09ac  */
    /* JADX WARN: Code duplicated, block: B:566:0x09fc  */
    /* JADX WARN: Code duplicated, block: B:586:0x0a57  */
    /* JADX WARN: Code duplicated, block: B:611:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x010b  */
    /* JADX WARN: Code duplicated, block: B:71:0x0111  */
    /* JADX WARN: Code duplicated, block: B:73:0x0119  */
    /* JADX WARN: Code duplicated, block: B:74:0x011e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0128  */
    /* JADX WARN: Code duplicated, block: B:78:0x012c  */
    /* JADX WARN: Code duplicated, block: B:80:0x012f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0162  */
    /* JADX WARN: Code duplicated, block: B:9:0x0031  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object emit(Object obj, lnm lnmVar) {
        z7d0 z7d0Var;
        icd0 icd0Var;
        kh81 kh81Var;
        ded0 ded0Var;
        qjd0 qjd0Var;
        vr20 vr20Var;
        hse hseVar;
        Long lValueOf;
        wkd0 wkd0Var;
        Object gld0Var;
        zod0 zod0Var;
        int i;
        kpd0 kpd0Var;
        Object objEmit;
        j1e0 j1e0Var;
        u1e0 u1e0Var;
        Object i5i1Var;
        v1e0 v1e0Var;
        Object aw00Var;
        pde0 pde0Var;
        Object obj2;
        uee0 uee0Var;
        uie0 uie0Var;
        w3f0 w3f0Var;
        nuf0 nuf0Var;
        xxf0 xxf0Var;
        r6l p6lVar;
        r6l r6lVar;
        int iC;
        String str;
        o0g0 o0g0Var;
        iqg0 iqg0Var;
        uch0 uch0Var;
        vr20 vr20Var2;
        vr20 vr20Var3;
        zfc1 zfc1Var;
        mdh0 mdh0Var;
        int i2;
        Object obj3;
        t0z t0zVar;
        o0i0 o0i0Var;
        byte b = this.a;
        wls0 wls0Var = wls0.c;
        int i3 = 0;
        i = 0;
        i = 0;
        int i4 = 0;
        objArr = 0;
        Object[] objArr = 0;
        z = false;
        boolean z = false;
        z = false;
        z = false;
        boolean z2 = false;
        i3 = 0;
        i3 = 0;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.b;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                if (lnmVar instanceof z7d0) {
                    z7d0Var = (z7d0) lnmVar;
                    int i5 = z7d0Var.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        z7d0Var.b = i5 - Integer.MIN_VALUE;
                    } else {
                        z7d0Var = new z7d0(this, lnmVar);
                    }
                } else {
                    z7d0Var = new z7d0(this, lnmVar);
                }
                Object obj6 = z7d0Var.a;
                int i6 = z7d0Var.b;
                if (i6 == 0) {
                    hm5.M(obj6);
                    ly50 ly50VarA = ly50.a((ly50) obj, iy50.a, true, false, 0, false, null, new by50(((Context) ((uqg) obj5).b).getColor(2131101751)), 188);
                    z7d0Var.b = 1;
                    if (((vr20) obj4).emit(ly50VarA, z7d0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i6 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj6);
                }
                return rih1Var;
            case 1:
                gcd0 gcd0Var = (gcd0) obj5;
                if (lnmVar instanceof icd0) {
                    icd0Var = (icd0) lnmVar;
                    int i7 = icd0Var.b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        icd0Var.b = i7 - Integer.MIN_VALUE;
                    } else {
                        icd0Var = new icd0(this, lnmVar);
                    }
                } else {
                    icd0Var = new icd0(this, lnmVar);
                }
                Object obj7 = icd0Var.a;
                int i8 = icd0Var.b;
                if (i8 == 0) {
                    hm5.M(obj7);
                    vr20 vr20Var4 = (vr20) obj4;
                    if (((Boolean) obj).booleanValue()) {
                        gcd0Var.getClass();
                        kh81Var = new kh81(new ng81(new bcd0(1, o7h.p1(ubd0.c)), gcd0Var));
                    } else {
                        kh81Var = null;
                    }
                    icd0Var.b = 1;
                    if (vr20Var4.emit(kh81Var, icd0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i8 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj7);
                }
                return rih1Var;
            case 2:
                m9d0 m9d0Var = (m9d0) obj5;
                if (lnmVar instanceof ded0) {
                    ded0Var = (ded0) lnmVar;
                    int i9 = ded0Var.b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        ded0Var.b = i9 - Integer.MIN_VALUE;
                    } else {
                        ded0Var = new ded0(this, lnmVar);
                    }
                } else {
                    ded0Var = new ded0(this, lnmVar);
                }
                Object obj8 = ded0Var.a;
                int i10 = ded0Var.b;
                if (i10 == 0) {
                    hm5.M(obj8);
                    vr20 vr20Var5 = (vr20) obj4;
                    tl10 tl10Var = (vl10) ((Map) obj).get(m9d0Var);
                    if (tl10Var == null) {
                        tl10Var = new tl10(m9d0Var.a(), rd.a);
                    }
                    ded0Var.b = 1;
                    if (vr20Var5.emit(tl10Var, ded0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i10 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj8);
                }
                return rih1Var;
            case 3:
                vjd0 vjd0Var = (vjd0) obj5;
                if (lnmVar instanceof qjd0) {
                    qjd0Var = (qjd0) lnmVar;
                    int i11 = qjd0Var.b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        qjd0Var.b = i11 - Integer.MIN_VALUE;
                    } else {
                        qjd0Var = new qjd0(this, lnmVar);
                    }
                } else {
                    qjd0Var = new qjd0(this, lnmVar);
                }
                Object obj9 = qjd0Var.a;
                int i12 = qjd0Var.b;
                if (i12 != 0) {
                    if (i12 == 1) {
                        i3 = qjd0Var.d;
                        hseVar = qjd0Var.f;
                        vr20Var = qjd0Var.c;
                        hm5.M(obj9);
                    } else {
                        if (i12 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj9);
                    }
                    return rih1Var;
                }
                hm5.M(obj9);
                vr20Var = (vr20) obj4;
                hseVar = (hse) obj;
                long jE = ((qq4) vjd0Var.d.get()).e();
                hseVar.getClass();
                try {
                    lValueOf = Long.valueOf(Instant.parse(hseVar.a().a).toEpochMilli());
                } catch (DateTimeParseException unused) {
                    lValueOf = null;
                }
                if (lValueOf != null) {
                    long jB = jE - (vjd0Var.a.b() - lValueOf.longValue());
                    if (jB <= jE) {
                        jE = jB;
                    }
                    if (jE > 0) {
                        qjd0Var.c = vr20Var;
                        qjd0Var.f = hseVar;
                        qjd0Var.d = 0;
                        qjd0Var.b = 1;
                        if (hap1.i(jE, qjd0Var) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    hseVar = null;
                }
                break;
                if (hseVar != null) {
                    qjd0Var.c = null;
                    qjd0Var.f = null;
                    qjd0Var.d = i3;
                    qjd0Var.b = 2;
                    if (vr20Var.emit(hseVar, qjd0Var) == d9nVar) {
                        return d9nVar;
                    }
                }
                return rih1Var;
            case 4:
                if (lnmVar instanceof wkd0) {
                    wkd0Var = (wkd0) lnmVar;
                    int i13 = wkd0Var.b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        wkd0Var.b = i13 - Integer.MIN_VALUE;
                    } else {
                        wkd0Var = new wkd0(this, lnmVar);
                    }
                } else {
                    wkd0Var = new wkd0(this, lnmVar);
                }
                Object obj10 = wkd0Var.a;
                int i14 = wkd0Var.b;
                if (i14 == 0) {
                    hm5.M(obj10);
                    vr20 vr20Var6 = (vr20) obj4;
                    bld0 bld0Var = (bld0) obj;
                    vyo0 vyo0Var = bld0Var != null ? new vyo0(bld0Var, (cld0) ((ykd0) obj5).b.getValue()) : null;
                    wkd0Var.b = 1;
                    if (vr20Var6.emit(vyo0Var, wkd0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i14 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj10);
                }
                return rih1Var;
            case 5:
                PlayerState playerState = (PlayerState) obj;
                p811 p811Var = (p811) obj5;
                ild0 ild0Var = (ild0) obj4;
                playerState.getClass();
                if (playerState.track().c()) {
                    String strContextUri = playerState.contextUri();
                    j380 j380VarContextMetadata = playerState.contextMetadata();
                    if (playerState.isPaused()) {
                        gld0Var = eld0.a;
                    } else {
                        strContextUri.getClass();
                        if (!ihc1.y0(strContextUri) && u890.j(j380VarContextMetadata.get("is_listening_party_preview"), "true") && u890.j(j380VarContextMetadata.get("end_of_list_action"), "STOP")) {
                            gld0Var = new gld0(strContextUri);
                        } else {
                            gld0Var = eld0.a;
                        }
                    }
                } else {
                    gld0Var = fld0.a;
                }
                hld0 hld0Var = (hld0) p811Var.a;
                if ((hld0Var instanceof gld0) && (gld0Var instanceof fld0)) {
                    LinkedHashSet linkedHashSet = ild0Var.b;
                    String str2 = ((gld0) hld0Var).a;
                    if (linkedHashSet.add(str2)) {
                        ild0Var.c.a(new dld0(str2, new jqb0(ild0Var, (byte) 5)));
                    }
                }
                p811Var.a = gld0Var;
                return rih1Var;
            case 6:
                if (lnmVar instanceof zod0) {
                    zod0Var = (zod0) lnmVar;
                    int i15 = zod0Var.b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        zod0Var.b = i15 - Integer.MIN_VALUE;
                    } else {
                        zod0Var = new zod0(this, lnmVar);
                    }
                } else {
                    zod0Var = new zod0(this, lnmVar);
                }
                Object obj11 = zod0Var.a;
                int i16 = zod0Var.b;
                if (i16 == 0) {
                    hm5.M(obj11);
                    vr20 vr20Var7 = (vr20) obj4;
                    cxc0 cxc0Var = (cxc0) obj;
                    kby kbyVar = cxc0Var.f;
                    xou0 xou0VarA = kbyVar.x.a(xou0.class);
                    Object[] objArr2 = xou0VarA != null && (xou0VarA.a.isEmpty() ^ true);
                    if (xou0VarA != null) {
                        Iterator it = xou0VarA.b.iterator();
                        i = 0;
                        while (it.hasNext()) {
                            i += ((xs6) it.next()).d;
                        }
                    } else {
                        i = 0;
                    }
                    Object[] objArr3 = i > 0;
                    if (!cxc0Var.i && ((objArr2 != false || objArr3 != false) && (((apd0) obj5).d.a(kbyVar.p) == le30.k1 || u890.j(kbyVar.q.get("editorial.series"), "this-is")))) {
                        z2 = true;
                    }
                    Boolean boolValueOf = Boolean.valueOf(z2);
                    zod0Var.b = 1;
                    if (vr20Var7.emit(boolValueOf, zod0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i16 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj11);
                }
                return rih1Var;
            case 7:
                if (lnmVar instanceof kpd0) {
                    kpd0Var = (kpd0) lnmVar;
                    int i17 = kpd0Var.b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        kpd0Var.b = i17 - Integer.MIN_VALUE;
                    } else {
                        kpd0Var = new kpd0(this, lnmVar);
                    }
                } else {
                    kpd0Var = new kpd0(this, lnmVar);
                }
                Object obj12 = kpd0Var.a;
                int i18 = kpd0Var.b;
                if (i18 == 0) {
                    hm5.M(obj12);
                    vr20 vr20Var8 = (vr20) obj4;
                    uv00 uv00Var = (uv00) obj;
                    uv00Var.getClass();
                    h290 h290Var = (h290) obj5;
                    Set set = lpd0.j;
                    int i19 = 10;
                    int iS = zno1.s(q7h.U(h290Var, 10));
                    int i20 = 16;
                    if (iS < 16) {
                        iS = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                    for (Object obj13 : h290Var) {
                        String str3 = (String) obj13;
                        Set<aq21> set2 = lpd0.j;
                        int iS2 = zno1.s(q7h.U(set2, i19));
                        if (iS2 < i20) {
                            iS2 = i20;
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS2);
                        for (aq21 aq21Var : set2) {
                            ez00 ez00Var = uv00Var.a((Class) aq21Var.getKey(), str3).b;
                            linkedHashMap2.put(aq21Var.getKey(), ez00Var != null ? new goj0(ez00Var) : new foj0(2));
                        }
                        linkedHashMap.put(obj13, linkedHashMap2);
                        i19 = 10;
                        i20 = 16;
                    }
                    ioj0 ioj0Var = new ioj0(linkedHashMap);
                    kpd0Var.b = 1;
                    if (vr20Var8.emit(ioj0Var, kpd0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i18 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj12);
                }
                return rih1Var;
            case 8:
                i1r i1rVar = (k1r) obj;
                m0k0 m0k0Var = (m0k0) obj5;
                vr20 vr20Var9 = (vr20) obj4;
                if (i1rVar instanceof i1r) {
                    s0e0 s0e0Var = (s0e0) i1rVar.a;
                    objEmit = vr20Var9.emit(new c2k0(m0k0Var.c, s0e0Var.a, s0e0Var.b, (int) s0e0Var.c, (int) s0e0Var.d, s0e0Var.e, s0e0Var.f), lnmVar);
                    if (objEmit != d9nVar) {
                        return rih1Var;
                    }
                } else if (!(i1rVar instanceof h1r) || (objEmit = vr20Var9.emit(new c2k0(m0k0Var.c, null, null, 0, 0, null, null), lnmVar)) != d9nVar) {
                    return rih1Var;
                }
                return objEmit;
            case 9:
                if (lnmVar instanceof j1e0) {
                    j1e0Var = (j1e0) lnmVar;
                    int i21 = j1e0Var.b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        j1e0Var.b = i21 - Integer.MIN_VALUE;
                    } else {
                        j1e0Var = new j1e0(this, lnmVar);
                    }
                } else {
                    j1e0Var = new j1e0(this, lnmVar);
                }
                Object obj14 = j1e0Var.a;
                int i22 = j1e0Var.b;
                if (i22 == 0) {
                    hm5.M(obj14);
                    mmr0 mmr0Var = (mmr0) obj;
                    had0 had0Var = (had0) obj5;
                    had0 had0Var2 = new had0(had0Var.a, had0Var.b, had0Var.c, had0Var.d, had0Var.e, had0Var.f, (String) mmr0Var.a, (String) mmr0Var.b);
                    j1e0Var.b = 1;
                    if (((vr20) obj4).emit(had0Var2, j1e0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i22 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj14);
                }
                return rih1Var;
            case 10:
                fad0 fad0Var = (fad0) obj5;
                if (lnmVar instanceof u1e0) {
                    u1e0Var = (u1e0) lnmVar;
                    int i23 = u1e0Var.b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        u1e0Var.b = i23 - Integer.MIN_VALUE;
                    } else {
                        u1e0Var = new u1e0(this, lnmVar);
                    }
                } else {
                    u1e0Var = new u1e0(this, lnmVar);
                }
                Object obj15 = u1e0Var.a;
                int i24 = u1e0Var.b;
                if (i24 == 0) {
                    hm5.M(obj15);
                    vr20 vr20Var10 = (vr20) obj4;
                    aiu0 aiu0Var = (aiu0) ((i1r) obj).a;
                    if (aiu0Var.b != wls0Var) {
                        String str4 = aiu0Var.c;
                        if ((str4 == null || str4.length() == 0) ? true : ne30.a.contains(((me30) fad0Var.c).a(str4))) {
                            i5i1Var = new i5i1(aiu0Var.a);
                        } else {
                            i5i1Var = j5i1.a;
                        }
                    } else {
                        i5i1Var = j5i1.a;
                    }
                    u1e0Var.b = 1;
                    if (vr20Var10.emit(i5i1Var, u1e0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i24 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj15);
                }
                return rih1Var;
            case 11:
                v6a0 v6a0Var = (v6a0) obj5;
                if (lnmVar instanceof v1e0) {
                    v1e0Var = (v1e0) lnmVar;
                    int i25 = v1e0Var.b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        v1e0Var.b = i25 - Integer.MIN_VALUE;
                    } else {
                        v1e0Var = new v1e0(this, lnmVar);
                    }
                } else {
                    v1e0Var = new v1e0(this, lnmVar);
                }
                Object obj16 = v1e0Var.a;
                int i26 = v1e0Var.b;
                if (i26 == 0) {
                    hm5.M(obj16);
                    vr20 vr20Var11 = (vr20) obj4;
                    biu0 biu0Var = (biu0) ((i1r) obj).a;
                    if (biu0Var.b != wls0Var) {
                        String str5 = biu0Var.c;
                        if ((str5 == null || str5.length() == 0) ? true : ne30.a.contains(((me30) v6a0Var.c).a(str5))) {
                            aw00Var = new aw00(biu0Var.a);
                        } else {
                            aw00Var = bw00.a;
                        }
                    } else {
                        aw00Var = bw00.a;
                    }
                    v1e0Var.b = 1;
                    if (vr20Var11.emit(aw00Var, v1e0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i26 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj16);
                }
                return rih1Var;
            case 12:
                if (lnmVar instanceof pde0) {
                    pde0Var = (pde0) lnmVar;
                    int i27 = pde0Var.b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        pde0Var.b = i27 - Integer.MIN_VALUE;
                    } else {
                        pde0Var = new pde0(this, lnmVar);
                    }
                } else {
                    pde0Var = new pde0(this, lnmVar);
                }
                Object obj17 = pde0Var.a;
                int i28 = pde0Var.b;
                if (i28 == 0) {
                    hm5.M(obj17);
                    vr20 vr20Var12 = (vr20) obj4;
                    Iterator it2 = ((EsLocalFiles.GetTracksResponse) obj).n().o().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Object next = it2.next();
                            if (u890.j(((EsLocalFiles.Item) next).n().getLink(), ((AddedLocalFile) obj5).getLocalTrackUri())) {
                                obj2 = next;
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    if (obj2 != null) {
                        pde0Var.b = 1;
                        if (vr20Var12.emit(obj2, pde0Var) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    if (i28 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj17);
                }
                return rih1Var;
            case 13:
                if (lnmVar instanceof uee0) {
                    uee0Var = (uee0) lnmVar;
                    int i29 = uee0Var.b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        uee0Var.b = i29 - Integer.MIN_VALUE;
                    } else {
                        uee0Var = new uee0(this, lnmVar);
                    }
                } else {
                    uee0Var = new uee0(this, lnmVar);
                }
                Object obj18 = uee0Var.a;
                int i30 = uee0Var.b;
                if (i30 == 0) {
                    hm5.M(obj18);
                    ly50 ly50VarA2 = ly50.a((ly50) obj, null, true, false, 0, false, null, new by50(((Context) ((uqg) obj5).b).getColor(2131103938)), 185);
                    uee0Var.b = 1;
                    if (((vr20) obj4).emit(ly50VarA2, uee0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i30 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj18);
                }
                return rih1Var;
            case 14:
                if (lnmVar instanceof uie0) {
                    uie0Var = (uie0) lnmVar;
                    int i31 = uie0Var.b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        uie0Var.b = i31 - Integer.MIN_VALUE;
                    } else {
                        uie0Var = new uie0(this, lnmVar);
                    }
                } else {
                    uie0Var = new uie0(this, lnmVar);
                }
                Object obj19 = uie0Var.a;
                int i32 = uie0Var.b;
                if (i32 == 0) {
                    hm5.M(obj19);
                    vr20 vr20Var13 = (vr20) obj4;
                    ea6 ea6Var = (ea6) obj;
                    if (((pm70) obj5).b.contains(ea6Var.a) && ea6Var.b != l2r0.c) {
                        z = true;
                    }
                    Boolean boolValueOf2 = Boolean.valueOf(z);
                    uie0Var.b = 1;
                    if (vr20Var13.emit(boolValueOf2, uie0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i32 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj19);
                }
                return rih1Var;
            case 15:
                f0f0 f0f0Var = (f0f0) obj;
                if (f0f0Var instanceof d0f0) {
                    ((Context) ((byp) obj4).d).startActivity((Intent) obj5);
                    ((d0f0) f0f0Var).a.c(yg8.t, 0);
                    return rih1Var;
                }
                if (u890.j(f0f0Var, e0f0.a)) {
                    eg.m("Logout API unavailable");
                } else {
                    eg.o();
                }
                return null;
            case 16:
                if (lnmVar instanceof w3f0) {
                    w3f0Var = (w3f0) lnmVar;
                    int i33 = w3f0Var.b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        w3f0Var.b = i33 - Integer.MIN_VALUE;
                    } else {
                        w3f0Var = new w3f0(this, lnmVar);
                    }
                } else {
                    w3f0Var = new w3f0(this, lnmVar);
                }
                Object obj20 = w3f0Var.a;
                int i34 = w3f0Var.b;
                if (i34 == 0) {
                    hm5.M(obj20);
                    vr20 vr20Var14 = (vr20) obj4;
                    z3f0 z3f0Var = (z3f0) obj;
                    hd80 hd80Var = z3f0Var != null ? new hd80(z3f0Var, (xpw) ((x3f0) obj5).a.get()) : null;
                    w3f0Var.b = 1;
                    if (vr20Var14.emit(hd80Var, w3f0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i34 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj20);
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                ur00 ur00Var = (ur00) obj5;
                if (lnmVar instanceof nuf0) {
                    nuf0Var = (nuf0) lnmVar;
                    int i35 = nuf0Var.b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        nuf0Var.b = i35 - Integer.MIN_VALUE;
                    } else {
                        nuf0Var = new nuf0(this, lnmVar);
                    }
                } else {
                    nuf0Var = new nuf0(this, lnmVar);
                }
                Object obj21 = nuf0Var.a;
                int i36 = nuf0Var.b;
                if (i36 == 0) {
                    hm5.M(obj21);
                    vr20 vr20Var15 = (vr20) obj4;
                    Boolean bool = (Boolean) obj;
                    Boolean bool2 = (Boolean) ur00Var.e;
                    if (bool2 != null && !u890.j(bool, bool2)) {
                        objArr = 1;
                    }
                    ur00Var.e = bool;
                    if (objArr != 0) {
                        nuf0Var.b = 1;
                        if (vr20Var15.emit(obj, nuf0Var) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    if (i36 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj21);
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                if (lnmVar instanceof xxf0) {
                    xxf0Var = (xxf0) lnmVar;
                    int i37 = xxf0Var.b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        xxf0Var.b = i37 - Integer.MIN_VALUE;
                    } else {
                        xxf0Var = new xxf0(this, lnmVar);
                    }
                } else {
                    xxf0Var = new xxf0(this, lnmVar);
                }
                Object obj22 = xxf0Var.a;
                int i38 = xxf0Var.b;
                if (i38 == 0) {
                    hm5.M(obj22);
                    vr20 vr20Var16 = (vr20) obj4;
                    if (((Boolean) ((ssn0) obj).b.invoke((zf30) obj5)).booleanValue()) {
                        xxf0Var.b = 1;
                        if (vr20Var16.emit(obj, xxf0Var) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    if (i38 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj22);
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                nh91 nh91Var = ((hh91) obj4).b;
                int iOrdinal = ((bh91) obj).ordinal();
                if (iOrdinal == 1) {
                    nh91Var.c(1);
                } else if (iOrdinal == 2 || iOrdinal == 3) {
                    nh91Var.c(2);
                    ((jyf0) obj5).X = null;
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                hh91 hh91Var = (hh91) obj;
                jyf0 jyf0Var = (jyf0) obj4;
                nqs nqsVar = jyf0Var.t;
                if (hh91Var == null) {
                    if (nqsVar != null) {
                        nqsVar.a();
                    }
                    jyf0Var.t = null;
                    jyf0Var.X = null;
                    return rih1Var;
                }
                int i39 = jyf0Var.g;
                if (nqsVar != null) {
                    nqsVar.a();
                }
                nh91 nh91Var2 = jyf0Var.X;
                if (nh91Var2 != null) {
                    nh91Var2.c(2);
                }
                xab1 xab1Var = jyf0Var.i;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                jyf0Var.X = hh91Var.b;
                cvg1 cvg1Var = hh91Var.a;
                qor qorVar = (qor) jyf0Var.b.get();
                int iC2 = l1d.C(i39);
                if (iC2 != 0) {
                    if (iC2 == 1) {
                        p6lVar = new q6l(sqe.t(cvg1Var.a, cvg1Var.b, 0));
                    } else {
                        if (iC2 == 2) {
                            r6lVar = null;
                            iC = l1d.C(i39);
                            if (iC == 0) {
                                str = null;
                            } else if (iC != 1 || iC == 2) {
                                str = cvg1Var.c;
                            } else {
                                eg.o();
                            }
                            nqs nqsVarD = qorVar.d(new s6l(r6lVar, str, new o6l(jyf0Var.a.getString(2131954958), new e4f0(cvg1Var, (byte) 13), new d0e0(cvg1Var, jyf0Var, (byte) 26)), cvg1Var.f, cvg1Var.g, cvg1Var.e, false, 132), new l6l(), cvg1Var.h);
                            jyf0Var.t = nqsVarD;
                            jyf0Var.i = fn31.T((c9n) obj5, (o8n) null, 0, new v4e0(nqsVarD, hh91Var, jyf0Var, (lnm) null, (byte) 13), 3);
                            return rih1Var;
                        }
                        eg.o();
                    }
                    return null;
                }
                p6lVar = new p6l(new j2i(-1434994285, new mbf0(cvg1Var, (byte) 9), true));
                r6lVar = p6lVar;
                iC = l1d.C(i39);
                if (iC == 0) {
                    if (iC != 1) {
                    }
                    str = cvg1Var.c;
                } else {
                    str = null;
                }
                nqs nqsVarD2 = qorVar.d(new s6l(r6lVar, str, new o6l(jyf0Var.a.getString(2131954958), new e4f0(cvg1Var, (byte) 13), new d0e0(cvg1Var, jyf0Var, (byte) 26)), cvg1Var.f, cvg1Var.g, cvg1Var.e, false, 132), new l6l(), cvg1Var.h);
                jyf0Var.t = nqsVarD2;
                jyf0Var.i = fn31.T((c9n) obj5, (o8n) null, 0, new v4e0(nqsVarD2, hh91Var, jyf0Var, (lnm) null, (byte) 13), 3);
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                if (lnmVar instanceof o0g0) {
                    o0g0Var = (o0g0) lnmVar;
                    int i40 = o0g0Var.b;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        o0g0Var.b = i40 - Integer.MIN_VALUE;
                    } else {
                        o0g0Var = new o0g0(this, lnmVar);
                    }
                } else {
                    o0g0Var = new o0g0(this, lnmVar);
                }
                Object obj23 = o0g0Var.a;
                int i41 = o0g0Var.b;
                if (i41 == 0) {
                    hm5.M(obj23);
                    Boolean boolValueOf3 = Boolean.valueOf(u890.j((v0g0) obj, (v0g0) obj5));
                    o0g0Var.b = 1;
                    if (((vr20) obj4).emit(boolValueOf3, o0g0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i41 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj23);
                }
                return rih1Var;
            case 22:
                return b(obj, lnmVar);
            case 23:
                return c(obj, lnmVar);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                Object objEmit2 = ((vr20) obj4).emit(((ypg0) obj5).b.invoke(obj), lnmVar);
                return objEmit2 == d9nVar ? objEmit2 : rih1Var;
            case 25:
                if (lnmVar instanceof iqg0) {
                    iqg0Var = (iqg0) lnmVar;
                    int i42 = iqg0Var.b;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        iqg0Var.b = i42 - Integer.MIN_VALUE;
                    } else {
                        iqg0Var = new iqg0(this, lnmVar);
                    }
                } else {
                    iqg0Var = new iqg0(this, lnmVar);
                }
                Object obj24 = iqg0Var.a;
                int i43 = iqg0Var.b;
                if (i43 == 0) {
                    hm5.M(obj24);
                    Object objInvoke = ((jqg0) obj5).b.invoke(obj);
                    iqg0Var.b = 1;
                    if (((vr20) obj4).emit(objInvoke, iqg0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i43 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj24);
                }
                return rih1Var;
            case 26:
                vqb0 vqb0Var = (vqb0) obj5;
                if (lnmVar instanceof uch0) {
                    uch0Var = (uch0) lnmVar;
                    int i44 = uch0Var.b;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        uch0Var.b = i44 - Integer.MIN_VALUE;
                    } else {
                        uch0Var = new uch0(this, lnmVar);
                    }
                } else {
                    uch0Var = new uch0(this, lnmVar);
                }
                Object obj25 = uch0Var.a;
                int i45 = uch0Var.b;
                if (i45 == 0) {
                    hm5.M(obj25);
                    vr20Var2 = (vr20) obj4;
                    q5l q5lVar = (r5l) obj;
                    if (q5lVar instanceof q5l) {
                        bah1 bah1Var = (bah1) vqb0Var.c;
                        String str6 = q5lVar.a;
                        uch0Var.c = vr20Var2;
                        uch0Var.d = 0;
                        uch0Var.b = 1;
                        Object objA = bah1Var.a(str6, uch0Var);
                        if (objA == d9nVar) {
                            return d9nVar;
                        }
                        vr20Var3 = vr20Var2;
                        obj25 = objA;
                        mdh0Var = (ndh0) obj25;
                        if (mdh0Var instanceof mdh0) {
                            i2 = mdh0Var.a;
                            if (i2 >= 0) {
                                t0zVar = zfc1.i;
                                if (i2 < t0zVar.b()) {
                                    obj3 = t0zVar.get(i2);
                                } else {
                                    obj3 = zfc1.a;
                                }
                            } else {
                                obj3 = zfc1.a;
                            }
                            vr20 vr20Var17 = vr20Var3;
                            zfc1Var = (zfc1) obj3;
                            vr20Var2 = vr20Var17;
                        } else {
                            if (mdh0Var instanceof ldh0) {
                                eg.o();
                                return null;
                            }
                            vr20Var2 = vr20Var3;
                            zfc1Var = null;
                        }
                        uch0Var.c = null;
                        uch0Var.d = i4;
                        uch0Var.b = 2;
                        if (vr20Var2.emit(zfc1Var, uch0Var) == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!(q5lVar instanceof o5l) && !(q5lVar instanceof p5l)) {
                            eg.o();
                            return null;
                        }
                        zfc1Var = null;
                        uch0Var.c = null;
                        uch0Var.d = i4;
                        uch0Var.b = 2;
                        if (vr20Var2.emit(zfc1Var, uch0Var) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else if (i45 == 1) {
                    i4 = uch0Var.d;
                    vr20Var3 = uch0Var.c;
                    hm5.M(obj25);
                    mdh0Var = (ndh0) obj25;
                    if (mdh0Var instanceof mdh0) {
                        i2 = mdh0Var.a;
                        if (i2 >= 0) {
                            t0zVar = zfc1.i;
                            if (i2 < t0zVar.b()) {
                                obj3 = t0zVar.get(i2);
                            } else {
                                obj3 = zfc1.a;
                            }
                        } else {
                            obj3 = zfc1.a;
                        }
                        vr20 vr20Var18 = vr20Var3;
                        zfc1Var = (zfc1) obj3;
                        vr20Var2 = vr20Var18;
                    } else {
                        if (mdh0Var instanceof ldh0) {
                            eg.o();
                            return null;
                        }
                        vr20Var2 = vr20Var3;
                        zfc1Var = null;
                    }
                    uch0Var.c = null;
                    uch0Var.d = i4;
                    uch0Var.b = 2;
                    if (vr20Var2.emit(zfc1Var, uch0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i45 != 2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj25);
                }
                return rih1Var;
            case 27:
                return e(obj, lnmVar);
            case 28:
                return f(obj, lnmVar);
            default:
                q0i0 q0i0Var = (q0i0) obj5;
                if (lnmVar instanceof o0i0) {
                    o0i0Var = (o0i0) lnmVar;
                    int i46 = o0i0Var.b;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        o0i0Var.b = i46 - Integer.MIN_VALUE;
                    } else {
                        o0i0Var = new o0i0(this, lnmVar);
                    }
                } else {
                    o0i0Var = new o0i0(this, lnmVar);
                }
                Object obj26 = o0i0Var.a;
                int i47 = o0i0Var.b;
                if (i47 != 0) {
                    if (i47 == 1) {
                        hm5.M(obj26);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj26);
                vr20 vr20Var19 = (vr20) obj4;
                i1r i1rVar2 = (k1r) obj;
                q0i0Var.getClass();
                i1r i1rVar3 = i1rVar2 instanceof i1r ? i1rVar2 : null;
                k1r k1rVar = i1rVar3 != null ? (k1r) i1rVar3.a : null;
                Object vu21Var = uu21.a;
                if (k1rVar != null && !(k1rVar instanceof j1r)) {
                    boolean z3 = k1rVar instanceof h1r;
                    tu21 tu21Var = tu21.a;
                    if (z3) {
                        vu21Var = tu21Var;
                    } else {
                        if (!(k1rVar instanceof i1r)) {
                            eg.o();
                            return null;
                        }
                        mq70 mq70Var = ((xkk1) ((i1r) k1rVar).a).a;
                        if (mq70Var.a.isEmpty()) {
                            vu21Var = tu21Var;
                        } else {
                            vu21Var = new vu21(mq70Var);
                        }
                    }
                }
                o0i0Var.b = 1;
                if (vr20Var19.emit(vu21Var, o0i0Var) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
        }
    }

    public /* synthetic */ a8d0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
