package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import com.comscore.streaming.ContentDeliveryMode;
import com.spotify.pam.v2.GetBillingViewRequest;
import com.spotify.pam.v2.GetBillingViewResponse;
import com.spotify.subscriptionviewservice.v1.Action;
import com.spotify.subscriptionviewservice.v1.Avatar;
import com.spotify.subscriptionviewservice.v1.BenefitsListItem;
import com.spotify.subscriptionviewservice.v1.Component;
import com.spotify.subscriptionviewservice.v1.Cta;
import com.spotify.subscriptionviewservice.v1.GetPageRequest;
import com.spotify.subscriptionviewservice.v1.GetPageResponse;
import com.spotify.subscriptionviewservice.v1.Icon;
import com.spotify.subscriptionviewservice.v1.InfoPanelAttribute;
import com.spotify.subscriptionviewservice.v1.NavigateTo;
import com.spotify.subscriptionviewservice.v1.Section;
import com.spotify.subscriptionviewservice.v1.SectionedLayout;
import com.spotify.subscriptionviewservice.v1.SubscriptionAttribute;
import com.spotify.subscriptionviewservice.v1.Tab;
import com.spotify.subscriptionviewservice.v1.TabbedLayout;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class ic9 implements Function, z341, wm51, wuc, ix30 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public ic9(bqz bqzVar, pqc1 pqc1Var) {
        this.a = (byte) 3;
        this.b = Collections.singletonList(pqc1Var);
        this.c = new lt20(rqt0.u(new x010(yoi1.g(bqzVar.c("video.subtitles").map(j561.c1)), yoi1.g(bqzVar.c("video.subtitles_cc").map(u321.c1)), new z27(3, (lnm) null, (byte) 1), (byte) 1)), new bz0(3, (lnm) null, (byte) 3), (byte) 0);
    }

    public static xf51 j(Section section) {
        int i;
        int i2;
        Action actionN;
        NavigateTo navigateToP;
        String uri;
        String strQ;
        NavigateTo navigateToP2;
        String uri2;
        String title = section.getTitle();
        String description = section.getDescription();
        String strO = section.o();
        h290<Component> h290VarN = section.n();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarN, 10));
        for (Component component : h290VarN) {
            component.getClass();
            int iQ = component.q();
            int i3 = iQ == 0 ? -1 : ov9.e[l1d.C(iQ)];
            mzh nzhVar = ozh.a;
            switch (i3) {
                case 1:
                    String strX = component.u().x();
                    String strP = component.u().o().p();
                    String strP2 = component.u().o().n().p();
                    String str = strP2.length() == 0 ? "#FFFFFF" : strP2;
                    String strN = component.u().o().n().n();
                    String str2 = strN.length() == 0 ? "#19FFFFFF" : strN;
                    String strP3 = component.u().u().p();
                    String strP4 = component.u().u().n().p();
                    String str3 = strP4.length() == 0 ? "#FFFFFF" : strP4;
                    String subtitle = component.u().getSubtitle();
                    String name = component.u().v().getName();
                    String strP5 = component.u().v().n().p();
                    String str4 = strP5.length() == 0 ? "#FFFFFF" : strP5;
                    String strP6 = component.u().w().p();
                    String strP7 = component.u().w().n().p();
                    String str5 = strP7.length() == 0 ? "#FFFFFF" : strP7;
                    int i4 = ov9.b[component.u().s().ordinal()] == 1 ? 2 : 1;
                    String name2 = component.u().r().getName();
                    String strP8 = component.u().r().n().p();
                    String str6 = strP8.length() == 0 ? "#FFFFFF" : strP8;
                    String strN2 = component.u().r().n().n();
                    if (strN2.length() == 0) {
                        strN2 = "#000000";
                    }
                    String str7 = strN2;
                    h290<Cta> h290VarP = component.u().p();
                    ArrayList arrayList2 = new ArrayList(q7h.U(h290VarP, 10));
                    for (Cta cta : h290VarP) {
                        cta.getClass();
                        arrayList2.add(f4p1.l(cta, 4));
                    }
                    p60 p60Var = (p60) o7h.s0(arrayList2);
                    p60 p60Var2 = p60Var == null ? new p60((String) null, (String) null, (String) null, (String) null, (String) null, 0.0f, (String) null, (String) null, (String) null, 0, (k20) null, (String) null, 4095) : p60Var;
                    h290<SubscriptionAttribute> h290VarT = component.u().t();
                    ArrayList arrayList3 = new ArrayList(q7h.U(h290VarT, 10));
                    for (SubscriptionAttribute subscriptionAttribute : h290VarT) {
                        arrayList3.add(new p60(subscriptionAttribute.n().getName(), (String) null, subscriptionAttribute.o(), (String) null, (String) null, 0.0f, (String) null, (String) null, (String) null, 0, (k20) null, (String) null, 4090));
                    }
                    h290<Avatar> h290VarN2 = component.u().n();
                    ArrayList arrayList4 = new ArrayList(q7h.U(h290VarN2, 10));
                    for (Avatar avatar : h290VarN2) {
                        arrayList4.add(new nni0(avatar.getDisplayName(), avatar.n()));
                    }
                    nzhVar = new nzh(new coc1(strP, str, str2, strP3, str3, subtitle, arrayList4, p60Var2, arrayList3, i4, name2, str6, str7, name, str4, strP6, str5, strX));
                    break;
                case 2:
                    int iO = component.r().o();
                    i = iO != 0 ? ov9.c[l1d.C(iO)] : -1;
                    if (i == 1 || i == 2 || i == 3 || i == 4) {
                        nzhVar = new jzh(f4p1.u(component.r()));
                    } else {
                        if (i != 5) {
                            eg.o();
                            return null;
                        }
                    }
                    break;
                case 3:
                    String title2 = component.n().getTitle();
                    String description2 = component.n().getDescription();
                    String name3 = component.n().q().getName();
                    String strP9 = component.n().n().p();
                    String str8 = strP9.length() == 0 ? "#FFFFFF" : strP9;
                    String strN3 = component.n().n().n();
                    nzhVar = new fzh(new d5a(title2, description2, name3, strN3.length() == 0 ? "#19FFFFFF" : strN3, str8, component.n().p(), component.n().r()));
                    break;
                case 4:
                    String strR = component.t().r();
                    String title3 = component.t().getTitle();
                    String description3 = component.t().getDescription();
                    String strP10 = component.t().p();
                    int iC = l1d.C(component.t().q().o());
                    if (iC == 0) {
                        i2 = 1;
                    } else if (iC == 1) {
                        i2 = 3;
                    } else if (iC == 2) {
                        i2 = 4;
                    } else if (iC != 3) {
                        if (iC != 4) {
                            eg.o();
                            return null;
                        }
                        i2 = 1;
                    } else {
                        i2 = 2;
                    }
                    List listU = f4p1.u(component.t().q());
                    List<InfoPanelAttribute> listN = component.t().n();
                    ArrayList arrayList5 = new ArrayList(q7h.U(listN, 10));
                    for (InfoPanelAttribute infoPanelAttribute : listN) {
                        String name4 = infoPanelAttribute.n().getName();
                        String strP11 = infoPanelAttribute.n().n().p();
                        if (strP11.length() == 0) {
                            strP11 = "#FFFFFF";
                        }
                        arrayList5.add(new bm7(name4, strP11, infoPanelAttribute.o()));
                    }
                    nzhVar = new kzh(new mb80(title3, description3, listU, i2, arrayList5, strP10, strR));
                    break;
                case 5:
                    int iP = component.o().p();
                    i = iP != 0 ? ov9.d[l1d.C(iP)] : -1;
                    if (i == 1) {
                        String strS = component.o().s();
                        Cta cta2 = (Cta) o7h.s0(component.o().q());
                        p60 p60VarL = cta2 != null ? f4p1.l(cta2, 4) : new p60((String) null, (String) null, (String) null, (String) null, (String) null, 0.0f, (String) null, (String) null, (String) null, 0, (k20) null, (String) null, 4095);
                        List<BenefitsListItem> itemsList = component.o().o().getItemsList();
                        ArrayList arrayList6 = new ArrayList(q7h.U(itemsList, 10));
                        for (BenefitsListItem benefitsListItem : itemsList) {
                            String name5 = benefitsListItem.n().getName();
                            String strP12 = benefitsListItem.n().n().p();
                            arrayList6.add(new p60(name5, strP12.length() == 0 ? "#FFFFFF" : strP12, benefitsListItem.o(), (String) null, (String) null, 0.0f, (String) null, (String) null, (String) null, 0, (k20) null, (String) null, 4088));
                        }
                        nzhVar = new gzh(1, new dka(arrayList6, p60VarL, strS), new kka("", "", "", "", z6x.a));
                    } else if (i == 2) {
                        dka dkaVar = new dka((List) null, (p60) null, 7);
                        String title4 = component.o().n().getTitle();
                        String description4 = component.o().n().getDescription();
                        h290 h290VarO = component.o().n().o();
                        ArrayList arrayList7 = new ArrayList(q7h.U(h290VarO, 10));
                        Iterator it = h290VarO.iterator();
                        while (it.hasNext()) {
                            arrayList7.add(((Icon) it.next()).getName());
                        }
                        Cta cta3 = (Cta) o7h.s0(component.o().q());
                        String str9 = cta3 != null ? f4p1.l(cta3, 4).c : "";
                        Cta cta4 = (Cta) o7h.s0(component.o().q());
                        nzhVar = new gzh(2, dkaVar, new kka(title4, description4, str9, cta4 != null ? f4p1.l(cta4, 4).e : nik1.p3.a, arrayList7));
                    }
                    break;
                case 6:
                    ArrayList arrayList8 = new ArrayList();
                    if (component.s().u()) {
                        arrayList8.add(f4p1.l(component.s().s(), 2));
                    }
                    for (Cta cta5 : component.s().q()) {
                        cta5.getClass();
                        arrayList8.add(f4p1.l(cta5, 3));
                    }
                    String strT = component.s().t();
                    String title5 = component.s().getTitle();
                    String strO2 = component.s().r().p().o();
                    String description5 = component.s().getDescription();
                    String strP13 = component.s().p();
                    String strP14 = component.s().o().p();
                    nzhVar = new ezh(new h02(strP13, title5, strP14.length() == 0 ? "#FFFFFF" : strP14, description5, strO2, arrayList8, strT));
                    break;
                case 7:
                    String strP15 = component.p().t().n().p();
                    String str10 = strP15.length() == 0 ? "#FFFFFF" : strP15;
                    String strP16 = component.p().n().p();
                    String strP17 = component.p().t().p();
                    String title6 = component.p().getTitle();
                    String title7 = component.p().r().o().getTitle();
                    String strN4 = component.p().r().o().n();
                    h290 h290VarO2 = component.p().o();
                    ArrayList arrayList9 = new ArrayList(q7h.U(h290VarO2, 10));
                    Iterator it2 = h290VarO2.iterator();
                    while (it2.hasNext()) {
                        arrayList9.add(((BenefitsListItem) it2.next()).o());
                    }
                    String strQ2 = component.p().s().q();
                    String str11 = strQ2 == null ? "" : strQ2;
                    Action actionN2 = component.p().s().n();
                    String str12 = (actionN2 == null || (navigateToP2 = actionN2.p()) == null || (uri2 = navigateToP2.getUri()) == null) ? "" : uri2;
                    Cta cta6 = (Cta) o7h.s0(component.p().q());
                    String str13 = (cta6 == null || (strQ = cta6.q()) == null) ? "" : strQ;
                    Cta cta7 = (Cta) o7h.s0(component.p().q());
                    nzhVar = new mzh(new i7t0(str10, strP16, strP17, title6, title7, strN4, arrayList9, str11, str12, str13, (cta7 == null || (actionN = cta7.n()) == null || (navigateToP = actionN.p()) == null || (uri = navigateToP.getUri()) == null) ? "" : uri, component.p().u()));
                    break;
            }
            arrayList.add(nzhVar);
        }
        return new xf51(title, description, strO, arrayList);
    }

    public static bma1 o(k5d k5dVar) {
        return bma1.b.n(gvg.h("live-events-campaign-collapsed:", k5dVar.a, "|", k5dVar.b));
    }

    public Object a(List list, b751 b751Var) {
        Object objP;
        return (!list.isEmpty() && (objP = l4p1.p(new lt20(new c64(new huz(o7h.s1(list, 5, 5), (byte) 8), this, (byte) 26), new bz0(3, (lnm) null, (byte) 4), (byte) 0), b751Var)) == d9n.a) ? objP : rih1.a;
    }

    public Object apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                return kc9.w((kc9) obj3, (String) obj2);
            default:
                e0b e0bVar = (e0b) obj3;
                return e0bVar.b.a(((kby) obj).p) == le30.g ? Maybe.e(new d0b(e0bVar, (String) obj2, (byte) 0)) : MaybeEmpty.a;
        }
    }

    public y341 b(String str) {
        FileChannel fileChannel;
        FileChannel fileChannel2;
        vgr vgrVar = (vgr) this.c;
        if (!str.equals(":memory:")) {
            str = ((c5r) vgrVar.c).a.getDatabasePath(str).getAbsolutePath();
            str.getClass();
        }
        boolean z = true;
        am00 am00Var = new am00(str, (vgrVar.a || vgrVar.b || str.equals(":memory:")) ? false : true);
        ReentrantLock reentrantLock = am00Var.a;
        reentrantLock.lock();
        yfu yfuVar = am00Var.b;
        if (yfuVar != null) {
            try {
                yfuVar.l();
            } catch (Throwable th) {
                th = th;
                z = false;
            }
        }
        try {
            try {
                if (vgrVar.b) {
                    throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
                }
                y341 y341VarB = ((z341) this.b).b(str);
                if (vgrVar.a) {
                    vgr.k(y341VarB);
                    if (((c5r) vgrVar.c).g == 3) {
                        qxy0.s(y341VarB, "PRAGMA synchronous = NORMAL");
                    } else {
                        qxy0.s(y341VarB, "PRAGMA synchronous = FULL");
                    }
                    ((dyb0) vgrVar.d).u(y341VarB);
                } else {
                    try {
                        vgrVar.b = true;
                        vgrVar.l(y341VarB);
                        vgrVar.b = false;
                    } catch (Throwable th2) {
                        vgrVar.b = false;
                        throw th2;
                    }
                }
                if (yfuVar != null && (fileChannel2 = (FileChannel) yfuVar.c) != null) {
                    try {
                        fileChannel2.close();
                        yfuVar.c = null;
                    } catch (Throwable th3) {
                        yfuVar.c = null;
                        throw th3;
                    }
                }
                reentrantLock.unlock();
                return y341VarB;
            } catch (Throwable th4) {
                if (yfuVar != null && (fileChannel = (FileChannel) yfuVar.c) != null) {
                    try {
                        fileChannel.close();
                    } finally {
                        yfuVar.c = null;
                    }
                }
                throw th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        th = th5;
        try {
            if (z) {
                throw th;
            }
            throw new IllegalStateException("Unable to open database '" + str + "'. Was a proper path / name used in Room's database builder?", th);
        } catch (Throwable th6) {
            reentrantLock.unlock();
            throw th6;
        }
    }

    public boolean c() {
        return ((z341) this.b).c();
    }

    public jhm d(List list) {
        return new jhm("artist_browse", nkx.c, (fhm) null, 2131954330, (String) null, false, (tm81) null, new ihm(ahm.c, new ghm(iub.X, iub.Y), new ztb(this, list, (byte) 4)), 244);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public Object e(boolean z, onm onmVar) {
        gv9 gv9Var;
        boolean z2;
        GetBillingViewResponse getBillingViewResponse;
        if (onmVar instanceof gv9) {
            gv9Var = (gv9) onmVar;
            int i = gv9Var.d;
            if ((i & os00.INVALID_ID) != 0) {
                gv9Var.d = i - os00.INVALID_ID;
            } else {
                gv9Var = new gv9(this, onmVar);
            }
        } else {
            gv9Var = new gv9(this, onmVar);
        }
        Object obj = gv9Var.b;
        int i2 = gv9Var.d;
        if (i2 == 0) {
            hm5.M(obj);
            d9n d9nVar = d9n.a;
            if (z) {
                enr0 enr0Var = (enr0) this.c;
                gv9Var.a = z;
                gv9Var.d = 1;
                Object objF = enr0.f(enr0Var, (GetBillingViewRequest) null, gv9Var, 1, (Object) null);
                if (objF != d9nVar) {
                    obj = objF;
                    z2 = z;
                    getBillingViewResponse = (GetBillingViewResponse) obj;
                }
            } else {
                enr0 enr0Var2 = (enr0) this.b;
                gv9Var.a = z;
                gv9Var.d = 2;
                Object objF2 = enr0.f(enr0Var2, (GetBillingViewRequest) null, gv9Var, 1, (Object) null);
                if (objF2 != d9nVar) {
                    obj = objF2;
                    z2 = z;
                    getBillingViewResponse = (GetBillingViewResponse) obj;
                }
            }
            return d9nVar;
        }
        if (i2 == 1) {
            z2 = gv9Var.a;
            hm5.M(obj);
            getBillingViewResponse = (GetBillingViewResponse) obj;
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = gv9Var.a;
            hm5.M(obj);
            getBillingViewResponse = (GetBillingViewResponse) obj;
        }
        boolean z3 = z2;
        String planName = getBillingViewResponse.r().getPlanName();
        String strW = getBillingViewResponse.r().w();
        String strA = getBillingViewResponse.r().A();
        String title = getBillingViewResponse.p().getTitle();
        String strQ = getBillingViewResponse.p().q();
        String strO = getBillingViewResponse.p().o();
        String strP = getBillingViewResponse.p().p();
        String title2 = getBillingViewResponse.s().getTitle();
        String subtitle = getBillingViewResponse.s().getSubtitle();
        String title3 = getBillingViewResponse.q().getTitle();
        String subtitle2 = getBillingViewResponse.q().getSubtitle();
        String uri = getBillingViewResponse.q().getUri();
        String title4 = getBillingViewResponse.t() ? getBillingViewResponse.n().getTitle() : "";
        title4.getClass();
        String subtitle3 = getBillingViewResponse.t() ? getBillingViewResponse.n().getSubtitle() : "";
        subtitle3.getClass();
        String title5 = getBillingViewResponse.u() ? getBillingViewResponse.o().getTitle() : "";
        title5.getClass();
        String subtitle4 = getBillingViewResponse.u() ? getBillingViewResponse.o().getSubtitle() : "";
        subtitle4.getClass();
        String uri2 = getBillingViewResponse.u() ? getBillingViewResponse.o().getUri() : "";
        uri2.getClass();
        return new aua(planName, strW, strA, title, strQ, strO, strP, title2, subtitle, title4, subtitle3, title5, subtitle4, uri2, title3, subtitle2, uri, z3);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat */
    public CameraCharacteristics f(String str) throws CameraAccessExceptionCompat {
        try {
            return ((CameraManager) this.b).getCameraCharacteristics(str);
        } catch (CameraAccessException e) {
            throw new CameraAccessExceptionCompat(e);
        }
    }

    public Set g() {
        return Collections.EMPTY_SET;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:40:0x0114  */
    /* JADX WARN: Code duplicated, block: B:8:0x0025  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0097, code lost:
    
        if (r2 == r13) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x010d, code lost:
    
        if (r2 == r13) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object h(p.wa71 r17, p.llw0 r18, p.jlw0 r19, p.o571 r20, java.util.List r21, android.net.Uri r22, p.onm r23) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ic9.h(p.wa71, p.llw0, p.jlw0, p.o571, java.util.List, android.net.Uri, p.onm):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: retrofit2.HttpException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object i(String str, Map map, onm onmVar, boolean z) throws HttpException {
        pv9 pv9Var;
        GetPageResponse getPageResponse;
        if (onmVar instanceof pv9) {
            pv9Var = (pv9) onmVar;
            int i = pv9Var.e;
            if ((i & os00.INVALID_ID) != 0) {
                pv9Var.e = i - os00.INVALID_ID;
            } else {
                pv9Var = new pv9(this, onmVar);
            }
        } else {
            pv9Var = new pv9(this, onmVar);
        }
        Object obj = pv9Var.c;
        int i2 = pv9Var.e;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                d9n d9nVar = d9n.a;
                if (z) {
                    xoc1 xoc1Var = (xoc1) this.c;
                    oo40 oo40VarN = GetPageRequest.n();
                    oo40VarN.n(str);
                    GetPageRequest getPageRequest = (GetPageRequest) oo40VarN.build();
                    pv9Var.a = map;
                    pv9Var.b = z;
                    pv9Var.e = 1;
                    Object objA = xoc1Var.a(getPageRequest, pv9Var);
                    if (objA != d9nVar) {
                        obj = objA;
                        getPageResponse = (GetPageResponse) obj;
                    }
                } else {
                    xoc1 xoc1Var2 = (xoc1) this.b;
                    oo40 oo40VarN2 = GetPageRequest.n();
                    oo40VarN2.n(str);
                    GetPageRequest getPageRequest2 = (GetPageRequest) oo40VarN2.build();
                    pv9Var.a = map;
                    pv9Var.b = z;
                    pv9Var.e = 2;
                    Object objA2 = xoc1Var2.a(getPageRequest2, pv9Var);
                    if (objA2 != d9nVar) {
                        obj = objA2;
                        getPageResponse = (GetPageResponse) obj;
                    }
                }
                return d9nVar;
            }
            if (i2 == 1) {
                z = pv9Var.b;
                map = pv9Var.a;
                hm5.M(obj);
                getPageResponse = (GetPageResponse) obj;
            } else {
                if (i2 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = pv9Var.b;
                map = pv9Var.a;
                hm5.M(obj);
                getPageResponse = (GetPageResponse) obj;
            }
            int iN = getPageResponse.n();
            int i3 = iN == 0 ? -1 : ov9.a[l1d.C(iN)];
            if (i3 == 1) {
                SectionedLayout sectionedLayoutP = getPageResponse.p();
                String strO = getPageResponse.o();
                sectionedLayoutP.getClass();
                h290<Section> h290VarO = sectionedLayoutP.o();
                ArrayList arrayList = new ArrayList(q7h.U(h290VarO, 10));
                for (Section section : h290VarO) {
                    section.getClass();
                    arrayList.add(j(section));
                }
                return new soc1(strO, 1, new sj51(1, arrayList, z), null, 8);
            }
            if (i3 != 2) {
                return new soc1(null, 0, null, null, 15);
            }
            TabbedLayout tabbedLayoutQ = getPageResponse.q();
            String strO2 = getPageResponse.o();
            tabbedLayoutQ.getClass();
            Object obj2 = map.get("tab");
            if (obj2 == null) {
                obj2 = "0";
            }
            Integer numC0 = nhc1.c0((String) obj2);
            int iIntValue = numC0 != null ? numC0.intValue() : 0;
            h290<Tab> h290VarO2 = tabbedLayoutQ.o();
            ArrayList arrayList2 = new ArrayList(q7h.U(h290VarO2, 10));
            for (Tab tab : h290VarO2) {
                String strN = tab.n();
                h290<Section> h290VarO3 = tab.o();
                ArrayList arrayList3 = new ArrayList(q7h.U(h290VarO3, 10));
                for (Section section2 : h290VarO3) {
                    section2.getClass();
                    arrayList3.add(j(section2));
                }
                arrayList2.add(new ued1(strN, arrayList3));
            }
            return new soc1(strO2, 2, null, new yjd1(iIntValue, 1, arrayList2, z), 4);
        } catch (HttpException e) {
            if (e.a == 404) {
                throw new HttpException(sy21.a(ContentDeliveryMode.DVR, uz21.a));
            }
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object k(onm onmVar) {
        c6b c6bVar;
        Bitmap m231Var;
        if (onmVar instanceof c6b) {
            c6bVar = (c6b) onmVar;
            int i = c6bVar.c;
            if ((i & os00.INVALID_ID) != 0) {
                c6bVar.c = i - os00.INVALID_ID;
            } else {
                c6bVar = new c6b(this, onmVar);
            }
        } else {
            c6bVar = new c6b(this, onmVar);
        }
        Object objJ = c6bVar.a;
        int i2 = c6bVar.c;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                ixg ixgVarF = ((gw70) this.b).f(nhc1.W("https://sharing-assets.spotifycdn.com/SongDNA/{index}.png", "{index}", String.valueOf(yoi1.H(new tr80(1, 4, 1), dqz0.a))));
                ixgVarF.g = false;
                Single singleI = ixgVarF.i();
                c6bVar.c = 1;
                objJ = fc11.j(singleI, c6bVar);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objJ);
            }
            m231Var = (Bitmap) objJ;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (m231Var instanceof m231) {
            m231Var = null;
        }
        Bitmap bitmap = m231Var;
        if (bitmap == null) {
            return null;
        }
        return new d6b(this, bitmap);
    }

    public void l(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        executor.getClass();
        stateCallback.getClass();
        try {
            ((CameraManager) this.b).openCamera(str, new i1d(executor, stateCallback), ((h4d) this.c).b);
        } catch (CameraAccessException e) {
            throw new CameraAccessExceptionCompat(e);
        }
    }

    public void m(String str) {
        new z7h1("hit", 1, b7x.a);
        new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", str));
        r6h1 r6h1Var = r6h1.c;
        System.currentTimeMillis();
    }

    public void n(String str, String str2) {
        i8h1 i8h1Var = (i8h1) this.b;
        x6h1 x6h1VarC = ((yok0) this.c).b.c();
        x6h1VarC.i.add(new a7h1("web_view", (String) null, (Integer) null, str, str2));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("no_action", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public void onSuccess(Object obj) {
        ((p1d) this.c).Z.remove((iod) this.b);
        int iC = l1d.C(((p1d) this.c).h1);
        if (iC != 1 && iC != 4) {
            if (iC != 5 && (iC != 6 || ((p1d) this.c).X == 0)) {
                return;
            } else {
                ((p1d) this.c).t("Camera reopen required. Checking if the current camera can be closed safely.");
            }
        }
        if (((p1d) this.c).Z.isEmpty()) {
            p1d p1dVar = (p1d) this.c;
            if (p1dVar.t != null) {
                p1dVar.t("closing camera");
                ((p1d) this.c).t.close();
                ((p1d) this.c).t = null;
            }
        }
    }

    public void p(g661 g661Var, j1d j1dVar) {
        c4d c4dVar;
        h4d h4dVar = (h4d) this.c;
        synchronized (h4dVar.a) {
            try {
                c4dVar = (c4d) h4dVar.a.get(j1dVar);
                if (c4dVar == null) {
                    c4dVar = new c4d(g661Var, j1dVar);
                    h4dVar.a.put(j1dVar, c4dVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ((CameraManager) this.b).registerAvailabilityCallback(c4dVar, h4dVar.b);
    }

    public void q(String str, Function0 function0) {
        ((jjz) this.c).a(new xiz(fjz.b, new yiz(str), ajz.d), new pj8(function0, (byte) 18), xrc.d);
    }

    public void r(CameraManager.AvailabilityCallback availabilityCallback) {
        c4d c4dVar;
        if (availabilityCallback != null) {
            h4d h4dVar = (h4d) this.c;
            synchronized (h4dVar.a) {
                c4dVar = (c4d) h4dVar.a.remove(availabilityCallback);
            }
        } else {
            c4dVar = null;
        }
        if (c4dVar != null) {
            synchronized (c4dVar.c) {
                c4dVar.d = true;
            }
        }
        ((CameraManager) this.b).unregisterAvailabilityCallback(c4dVar);
    }

    public void onFailure(Throwable th) {
    }

    public /* synthetic */ ic9(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public ic9(dma1 dma1Var) {
        this.a = (byte) 26;
        this.b = dma1Var;
        this.c = new ConcurrentHashMap();
    }

    public /* synthetic */ ic9(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public ic9(i8h1 i8h1Var) {
        this.a = (byte) 12;
        this.b = i8h1Var;
        this.c = new otk0(new bqk0((byte) 11), (byte) 0);
    }

    public ic9() {
        this.a = (byte) 22;
        this.b = new huz((Object) null, (byte) 10);
        this.c = gio1.b(vuc.a);
    }

    public ic9(Context context, h4d h4dVar) {
        this.a = (byte) 25;
        this.b = (CameraManager) context.getSystemService("camera");
        this.c = h4dVar;
    }

    public ic9(Context context, Object obj, LinkedHashSet linkedHashSet) {
        d4d d4dVarA;
        this.a = (byte) 24;
        cua cuaVar = new cua((byte) 1);
        this.b = new HashMap();
        this.c = cuaVar;
        if (obj instanceof d4d) {
            d4dVarA = (d4d) obj;
        } else {
            d4dVarA = d4d.a(context, w2g0.m());
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ((HashMap) this.b).put(str, new a3d1(context, str, d4dVarA, (cua) this.c));
        }
    }
}
