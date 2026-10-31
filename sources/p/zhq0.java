package p;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Size;
import android.view.View;
import androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import com.spotify.base.java.logging.Logger;
import com.spotify.payment.endpoint.proto.PaymentSdkNativeServiceProto$ProceedPaymentResponse;
import com.spotify.player.model.Context;
import com.spotify.player.model.Context$Builder;
import com.spotify.player.model.ContextPage;
import com.spotify.player.model.ContextTrack;
import com.spotify.premiumdestination.destination.mobius.domain.MappingException;
import com.spotify.premiummarketing.premiumdestinationpage.v1.BenefitItem;
import com.spotify.premiummarketing.premiumdestinationpage.v1.CTAClickEvent;
import com.spotify.premiummarketing.premiumdestinationpage.v1.GroupedOfferCards;
import com.spotify.premiummarketing.premiumdestinationpage.v1.HeaderCTA;
import com.spotify.premiummarketing.premiumdestinationpage.v1.PDPComponent;
import com.spotify.premiummarketing.premiumdestinationpage.v1.PremiumBenefitsSection;
import com.spotify.premiummarketing.premiumdestinationpage.v1.PremiumDestinationPageResponse;
import com.spotify.premiummarketing.premiumdestinationpage.v1.PremiumFeatureCard;
import com.spotify.premiummarketing.premiumdestinationpage.v1.PremiumLegalText;
import com.spotify.premiummarketing.premiumdestinationpage.v1.PremiumOfferCard;
import com.spotify.premiummarketing.premiumdestinationpage.v1.PremiumPageHeader;
import com.spotify.premiummarketing.premiumdestinationpage.v1.PremiumSectionHeader;
import com.spotify.watchfeedentrypoints.api.v1.ExplorerItem;
import com.spotify.watchfeedentrypoints.api.v1.FilterItem;
import com.spotify.watchfeedentrypoints.api.v1.GetPivotsResponse;
import com.spotify.watchfeedentrypoints.api.v1.PivotsBentoSection;
import com.spotify.watchfeedentrypoints.api.v1.PivotsSection;
import com.spotify.watchfeedentrypoints.api.v1.VideoItem;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zhq0 implements uhd, Function {
    public final /* synthetic */ byte a;
    public final Object b;
    public Object c;

    public zhq0(byte b) {
        this.a = b;
        switch (b) {
            case 14:
                this.b = new ArrayDeque();
                this.c = new ArrayDeque();
                break;
            default:
                bpb1 bpb1VarB = gio1.b(q1s0.a);
                this.b = bpb1VarB;
                this.c = d5p1.h(bpb1VarB);
                break;
        }
    }

    public static Bundle h(String str) {
        return cy30.g("mode", str);
    }

    public ses0 a(int i) {
        ses0 ves0Var;
        synchronized (((ArrayDeque) this.b)) {
            try {
                if (i < 0) {
                    throw new IllegalArgumentException("size must be non-negative");
                }
                if (i > 64) {
                    ves0Var = new tes0(i);
                } else {
                    ves0Var = ((ArrayDeque) this.b).isEmpty() ? new ves0(0, new jh5[64], new k3r[64]) : (ses0) ((ArrayDeque) this.b).removeFirst();
                }
                if (ves0Var.d) {
                    eg.m("PeekBuffer is already leased");
                } else if (i <= ves0Var.b.length) {
                    ves0Var.d = true;
                    ves0Var.a = i;
                    ves0Var.e = 0;
                    ves0Var.m();
                } else {
                    eg.m("PeekBuffer capacity exceeded");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ves0Var;
    }

    public Object apply(Object obj) {
        Observable map;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 13:
                return new n300((String) obj2, gbs0.b(((PaymentSdkNativeServiceProto$ProceedPaymentResponse) obj).n()), ((agw) this.c).s());
            case 15:
                h39 h39Var = (h39) obj2;
                return new y051(h39Var.b, ((mx41) this.c).c, new p851(h39Var.a));
            case 18:
                return ((ats0) obj2).f((m210) this.c, (l510) obj);
            case 19:
                mmr0 mmr0Var = (mmr0) obj;
                l510 l510Var = (l510) mmr0Var.a;
                Map map2 = (Map) mmr0Var.b;
                boolean zL = y7y0.L(map2);
                boolean zC = rh11.c(map2);
                r9c r9cVar = (r9c) this.c;
                dts0 dts0Var = (dts0) obj2;
                if (r9cVar.o) {
                    return Observable.just(new z310(dts0Var.c(l510Var, null, r9cVar, zL, zC), (f410) null, l510Var.b, l510Var.c));
                }
                List list = l510Var.a;
                boolean z = list instanceof Collection;
                j5 j5Var = j5.a;
                if (z && list.isEmpty()) {
                    map = Observable.just(j5Var);
                } else {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (u890.j(((p510) it.next()).a, "nft-home-recently-played")) {
                            Observable observableA = dts0Var.b.a();
                            cts0 cts0Var = new cts0(dts0Var, r9cVar, zL, zC, (byte) 2);
                            r9cVar = r9cVar;
                            zL = zL;
                            zC = zC;
                            map = observableA.map(cts0Var);
                        }
                    }
                    map = Observable.just(j5Var);
                }
                return map.onErrorReturnItem(j5Var).map(new bts0(dts0Var, l510Var, r9cVar, zL, zC, (byte) 1));
            case 23:
                return ((Single) ((get0) obj2).g.invoke((String) this.c)).toMaybe();
            case 25:
                tut0 tut0Var = (tut0) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    return Observable.just(Boolean.FALSE);
                }
                return ((buc) tut0Var.a.get()).a((auc) this.c).observeOn(tut0Var.c);
            case 26:
                xut0 xut0Var = (xut0) obj2;
                return rqt0.F(xut0Var.a, new dvq0(xut0Var, (sp91) obj, (String) this.c, (lnm) null, (byte) 20));
            default:
                Map<String, String> map3 = (Map) obj;
                s8u0 s8u0Var = (s8u0) this.c;
                e6v0 e6v0Var = (e6v0) obj2;
                if (!(e6v0Var instanceof d6v0)) {
                    if (!(e6v0Var instanceof c6v0)) {
                        eg.o();
                        return null;
                    }
                    c6v0 c6v0Var = (c6v0) e6v0Var;
                    String str = c6v0Var.b;
                    Context$Builder builder = Context.fromUri(c6v0Var.a).toBuilder();
                    if (!map3.isEmpty()) {
                        builder.metadata(map3);
                    }
                    return s8u0Var.d(str, builder.build(), c6v0Var.c, gqt0.a);
                }
                d6v0 d6v0Var = (d6v0) e6v0Var;
                String str2 = d6v0Var.b;
                Context$Builder context$BuilderBuilder = Context.builder(d6v0Var.a);
                ContextPage.Builder builder2 = ContextPage.builder();
                List<b6v0> list2 = d6v0Var.c;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                for (b6v0 b6v0Var : list2) {
                    ContextTrack.Builder builder3 = ContextTrack.builder(b6v0Var.a);
                    xkg0 xkg0Var = new xkg0();
                    xkg0Var.put("subtitle", b6v0Var.b);
                    arrayList.add(builder3.metadata(xkg0Var.b()).build());
                }
                Context$Builder context$BuilderPages = context$BuilderBuilder.pages(Collections.singletonList(builder2.tracks(arrayList).build()));
                xkg0 xkg0Var2 = new xkg0();
                xkg0Var2.putAll(map3);
                if (s8u0Var.h) {
                    xkg0Var2.put("end_of_context_action", "stop");
                }
                xkg0 xkg0VarB = xkg0Var2.b();
                if (!xkg0VarB.isEmpty()) {
                    context$BuilderPages.metadata((Map<String, String>) xkg0VarB);
                }
                return s8u0Var.d(str2, context$BuilderPages.build(), d6v0Var.d, d6v0Var.e);
        }
    }

    public ues0 b(int i) {
        ues0 ues0Var;
        if (i < 0) {
            hhg1.n("size must be non-negative");
            return null;
        }
        if (i > 64) {
            return new ues0(new int[i]);
        }
        synchronized (((ArrayDeque) this.c)) {
            ues0Var = (ues0) ((ArrayDeque) this.c).pollFirst();
        }
        return ues0Var == null ? new ues0(new int[64]) : ues0Var;
    }

    public Size[] c(Size[] sizeArr, int i) {
        List arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = new ArrayList(Arrays.asList(sizeArr));
        if (((ExtraSupportedOutputSizeQuirk) this.b) != null) {
            Size[] sizeArr2 = (i == 34 && "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL)) ? new Size[]{new Size(1440, 1080), new Size(960, 720)} : new Size[0];
            if (sizeArr2.length > 0) {
                arrayList3.addAll(Arrays.asList(sizeArr2));
            }
        }
        clv clvVar = (clv) this.c;
        if (vvt.a.m(ExcludedSupportedSizesQuirk.class) == null) {
            arrayList = new ArrayList();
        } else {
            String str = clvVar.b;
            String str2 = Build.BRAND;
            if ("OnePlus".equalsIgnoreCase(str2) && "OnePlus6".equalsIgnoreCase(Build.DEVICE)) {
                arrayList2 = new ArrayList();
                if (str.equals("0") && i == 256) {
                    arrayList2.add(new Size(4160, 3120));
                    arrayList2.add(new Size(4000, 3000));
                }
            } else if ("OnePlus".equalsIgnoreCase(str2) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE)) {
                arrayList2 = new ArrayList();
                if (str.equals("0") && i == 256) {
                    arrayList2.add(new Size(4160, 3120));
                    arrayList2.add(new Size(4000, 3000));
                }
            } else if ("HUAWEI".equalsIgnoreCase(str2) && "HWANE".equalsIgnoreCase(Build.DEVICE)) {
                arrayList2 = new ArrayList();
                if (str.equals("0") && (i == 34 || i == 35)) {
                    arrayList2.add(new Size(720, 720));
                    arrayList2.add(new Size(400, 400));
                }
            } else if (ExcludedSupportedSizesQuirk.c()) {
                arrayList2 = new ArrayList();
                if (str.equals("0")) {
                    if (i == 34) {
                        arrayList2.add(new Size(4128, 3096));
                        arrayList2.add(new Size(4128, 2322));
                        arrayList2.add(new Size(3088, 3088));
                        arrayList2.add(new Size(3264, 2448));
                        arrayList2.add(new Size(3264, 1836));
                        arrayList2.add(new Size(2048, 1536));
                        arrayList2.add(new Size(2048, 1152));
                        arrayList2.add(new Size(1920, 1080));
                    } else if (i == 35) {
                        arrayList2.add(new Size(4128, 2322));
                        arrayList2.add(new Size(3088, 3088));
                        arrayList2.add(new Size(3264, 2448));
                        arrayList2.add(new Size(3264, 1836));
                        arrayList2.add(new Size(2048, 1536));
                        arrayList2.add(new Size(2048, 1152));
                        arrayList2.add(new Size(1920, 1080));
                    }
                } else if (str.equals("1") && (i == 34 || i == 35)) {
                    arrayList2.add(new Size(3264, 2448));
                    arrayList2.add(new Size(3264, 1836));
                    arrayList2.add(new Size(2448, 2448));
                    arrayList2.add(new Size(1920, 1920));
                    arrayList2.add(new Size(2048, 1536));
                    arrayList2.add(new Size(2048, 1152));
                    arrayList2.add(new Size(1920, 1080));
                }
            } else if (ExcludedSupportedSizesQuirk.b()) {
                arrayList2 = new ArrayList();
                if (str.equals("0")) {
                    if (i == 34) {
                        arrayList2.add(new Size(4128, 3096));
                        arrayList2.add(new Size(4128, 2322));
                        arrayList2.add(new Size(3088, 3088));
                        arrayList2.add(new Size(3264, 2448));
                        arrayList2.add(new Size(3264, 1836));
                        arrayList2.add(new Size(2048, 1536));
                        arrayList2.add(new Size(2048, 1152));
                        arrayList2.add(new Size(1920, 1080));
                    } else if (i == 35) {
                        arrayList2.add(new Size(2048, 1536));
                        arrayList2.add(new Size(2048, 1152));
                        arrayList2.add(new Size(1920, 1080));
                    }
                } else if (str.equals("1") && (i == 34 || i == 35)) {
                    arrayList2.add(new Size(2576, 1932));
                    arrayList2.add(new Size(2560, 1440));
                    arrayList2.add(new Size(1920, 1920));
                    arrayList2.add(new Size(2048, 1536));
                    arrayList2.add(new Size(2048, 1152));
                    arrayList2.add(new Size(1920, 1080));
                }
            } else if ("REDMI".equalsIgnoreCase(str2) && "joyeuse".equalsIgnoreCase(Build.DEVICE)) {
                arrayList2 = new ArrayList();
                if (str.equals("0") && i == 256) {
                    arrayList2.add(new Size(9280, 6944));
                }
            } else {
                j2h1.M("ExcludedSupportedSizesQuirk");
                arrayList = Collections.EMPTY_LIST;
            }
            arrayList = arrayList2;
        }
        if (!arrayList.isEmpty()) {
            arrayList3.removeAll(arrayList);
        }
        if (arrayList3.isEmpty()) {
            j2h1.M("OutputSizesCorrector");
        }
        return (Size[]) arrayList3.toArray(new Size[0]);
    }

    public void cancel() {
        if (((uj7) this.c).compareAndSet(1, 1)) {
            return;
        }
        ((uc9) this.b).invoke();
    }

    public qro1 d(String str) {
        Function0 function0 = (Function0) this.b;
        if (x74.j((android.content.Context) function0.invoke(), str) == 0) {
            return cat.c;
        }
        return ag0.C0((Activity) function0.invoke(), str) ? h981.b : cat.b;
    }

    public void e() {
        LinkedHashSet<View> linkedHashSet = (LinkedHashSet) this.c;
        o7g1 o7g1Var = (o7g1) this.b;
        if (o7g1Var != null) {
            for (View view : linkedHashSet) {
                if (view.getTag(2131431636) == o7g1Var) {
                    view.setTag(2131431636, null);
                }
            }
        }
        linkedHashSet.clear();
    }

    public void f() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 8:
                e();
                o7g1 o7g1Var = (o7g1) obj;
                if (o7g1Var != null) {
                    o7g1Var.g();
                }
                break;
            default:
                smo1.p((llm) obj, new CancellationException("PlayCommandsHandler disposed"));
                break;
        }
    }

    public fi20 g() {
        List<ResolveInfo> listQueryIntentServices = ((PackageManager) this.b).queryIntentServices(new Intent("android.media.browse.MediaBrowserService"), 64);
        if (!listQueryIntentServices.isEmpty()) {
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                if (((List) this.c).contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    return new di20(new ComponentName(serviceInfo.packageName, serviceInfo.name));
                }
            }
        }
        return ei20.a;
    }

    public xe01 i() {
        return (xe01) this.c;
    }

    public tjs0 j() {
        z6x z6xVarM;
        lks0 lks0Var = (lks0) this.b;
        q550 q550Var = (q550) lks0Var.b.getValue();
        tjs0 tjs0Var = null;
        if (q550Var instanceof o550) {
            o550 o550Var = (o550) q550Var;
            d650 d650VarA = ((j650) this.c).a.a(o550Var.c, o550Var.b);
            if (d650VarA.equals(g650.a)) {
                z6xVarM = z6x.a;
            } else if (d650VarA instanceof d650) {
                z6xVarM = Collections.singletonList(d650VarA.a);
            } else if (d650VarA instanceof f650) {
                z6xVarM = Collections.singletonList(((f650) d650VarA).a);
            } else if (d650VarA instanceof c650) {
                c650 c650Var = (c650) d650VarA;
                z6xVarM = p7h.M(new String[]{c650Var.a, c650Var.b});
            } else {
                if (!(d650VarA instanceof e650)) {
                    eg.o();
                    return null;
                }
                e650 e650Var = (e650) d650VarA;
                z6xVarM = p7h.M(new String[]{e650Var.a, e650Var.b, e650Var.c});
            }
            Iterator it = o7h.j0((Iterable) z6xVarM).iterator();
            while (it.hasNext()) {
                tjs0 tjs0Var2 = (tjs0) j650.b.get((String) it.next());
                if (tjs0Var2 != null) {
                    tjs0Var = tjs0Var2;
                    break;
                }
            }
        } else if (!u890.j(q550Var, p550.a)) {
            eg.o();
            return null;
        }
        if (tjs0Var != null) {
            return tjs0Var;
        }
        Logger.k("Successfully read GPU data but couldn't find performance tier, GPU: " + q550Var, new Object[0]);
        long j = ((x4r) lks0Var.c.getValue()).a;
        if (u890.r(j, 3221225472L) <= 0) {
            return tjs0.d;
        }
        if (u890.r(j, 4294967296L) <= 0) {
            return tjs0.b;
        }
        return u890.r(j, 6442450944L) <= 0 ? tjs0.c : tjs0.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object k(String str, onm onmVar) {
        c5t0 c5t0Var;
        Object next;
        vxx0 vxx0Var;
        l4t0 m4t0Var;
        if (onmVar instanceof c5t0) {
            c5t0Var = (c5t0) onmVar;
            int i = c5t0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5t0Var.c = i - Integer.MIN_VALUE;
            } else {
                c5t0Var = new c5t0(this, onmVar);
            }
        } else {
            c5t0Var = new c5t0(this, onmVar);
        }
        Object objB = c5t0Var.a;
        int i2 = c5t0Var.c;
        yf20 yf20Var = null;
        int i3 = 1;
        if (i2 == 0) {
            hm5.M(objB);
            k4t0 k4t0Var = (k4t0) this.b;
            String str2 = ((a5t0) this.c).b;
            c5t0Var.c = 1;
            objB = k4t0Var.b(str2, str, c5t0Var);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objB);
        }
        GetPivotsResponse getPivotsResponse = (GetPivotsResponse) objB;
        Iterator it = getPivotsResponse.n().q().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((PivotsSection) next).p() != 1);
        if (next == null) {
            hhg1.n("There is no supported section in the response. Currently, only a single Bento section is supported.");
            return null;
        }
        PivotsSection pivotsSection = (PivotsSection) next;
        List<PivotsBentoSection.Item> itemsList = pivotsSection.n().getItemsList();
        ArrayList arrayList = new ArrayList();
        for (PivotsBentoSection.Item item : itemsList) {
            int iO = item.o();
            int i4 = iO == 0 ? -1 : giy0.b[l1d.C(iO)];
            if (i4 == 1) {
                VideoItem videoItemP = item.p();
                m4t0Var = new m4t0(giy0.a[videoItemP.n().ordinal()] != 1 ? 1 : 2, videoItemP.getUri(), videoItemP.q(), videoItemP.o(), videoItemP.r());
            } else if (i4 != 2) {
                m4t0Var = null;
            } else {
                ExplorerItem explorerItemN = item.n();
                m4t0Var = new l4t0(explorerItemN.getUri(), explorerItemN.p(), explorerItemN.n(), explorerItemN.q());
            }
            if (m4t0Var != null) {
                arrayList.add(m4t0Var);
            }
        }
        String title = getPivotsResponse.n().getTitle();
        o4t0 o4t0Var = new o4t0(pivotsSection.o().o(), arrayList);
        if (getPivotsResponse.n().s()) {
            String uri = getPivotsResponse.n().p().getUri();
            String title2 = getPivotsResponse.n().p().getTitle();
            String strO = getPivotsResponse.n().p().o();
            int i5 = giy0.c[getPivotsResponse.n().p().p().ordinal()];
            if (i5 != 1 && i5 == 2) {
                i3 = 2;
            }
            vxx0Var = new vxx0(uri, title2, i3, strO);
        } else {
            vxx0Var = null;
        }
        if (getPivotsResponse.n().r()) {
            xf20 xf20Var = new xf20(getPivotsResponse.n().o().p().o());
            h290<FilterItem> h290VarO = getPivotsResponse.n().o().o();
            ArrayList arrayList2 = new ArrayList(q7h.U(h290VarO, 10));
            for (FilterItem filterItem : h290VarO) {
                arrayList2.add(new wf20(filterItem.getUri(), filterItem.getTitle()));
            }
            yf20Var = new yf20(xf20Var, mqo1.F(arrayList2));
        }
        return new e5t0(title, o4t0Var, vxx0Var, yf20Var);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.premiumdestination.destination.mobius.domain.MappingException */
    public mvv0 l(PremiumDestinationPageResponse premiumDestinationPageResponse) throws MappingException {
        g760 g760Var;
        String id = premiumDestinationPageResponse.getId();
        id.getClass();
        int iOrdinal = premiumDestinationPageResponse.o().o().ordinal();
        if (iOrdinal == 0) {
            g760Var = h760.a;
        } else if (iOrdinal == 1) {
            g760Var = f760.a;
        } else if (iOrdinal == 2) {
            g760Var = i760.a;
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                eg.o();
                return null;
            }
            g760Var = h760.a;
        } else {
            g760Var = g760.a;
        }
        uuv0 uuv0Var = new uuv0(g760Var);
        try {
            int i = 0;
            ayq0 ayq0VarM = m(id, 0, premiumDestinationPageResponse.p(), uuv0Var);
            h290 h290VarN = premiumDestinationPageResponse.n();
            ArrayList arrayList = new ArrayList(q7h.U(h290VarN, 10));
            for (Object obj : h290VarN) {
                int i2 = i + 1;
                if (i < 0) {
                    p7h.T();
                    throw null;
                }
                PDPComponent pDPComponent = (PDPComponent) obj;
                pDPComponent.getClass();
                arrayList.add(m(id, i, pDPComponent, uuv0Var));
                i = i2;
            }
            return new mvv0(ayq0VarM, arrayList);
        } catch (Exception e) {
            throw new MappingException(e);
        }
    }

    public ayq0 m(String str, int i, PDPComponent pDPComponent, uuv0 uuv0Var) {
        switch (pDPComponent.o().ordinal()) {
            case 1:
                PremiumPageHeader premiumPageHeaderS = pDPComponent.s();
                String title = premiumPageHeaderS.getTitle();
                String subtitle = premiumPageHeaderS.getSubtitle();
                String description = premiumPageHeaderS.getDescription();
                String imageUrl = premiumPageHeaderS.getImageUrl();
                String url = premiumPageHeaderS.r().getUrl();
                String str2 = url.length() == 0 ? null : url;
                String strO = premiumPageHeaderS.r().o();
                String str3 = strO.length() == 0 ? null : strO;
                String strP = premiumPageHeaderS.r().p();
                String str4 = strP.length() == 0 ? null : strP;
                String strQ = premiumPageHeaderS.r().q();
                String str5 = strQ.length() == 0 ? null : strQ;
                String strP2 = premiumPageHeaderS.p();
                String str6 = strP2.length() == 0 ? null : strP2;
                String strO2 = premiumPageHeaderS.o();
                return new vuv0(title, subtitle, description, imageUrl, t2b.j(str, i, premiumPageHeaderS.q()), str2, str3, str4, str5, str6, strO2.length() == 0 ? null : strO2, uuv0Var);
            case 2:
                HeaderCTA headerCTAT = pDPComponent.t();
                String title2 = headerCTAT.getTitle();
                CTAClickEvent cTAClickEventN = headerCTAT.n();
                doc docVar = new doc(cTAClickEventN.getName(), cTAClickEventN.getUri(), cTAClickEventN.n());
                ave0 ave0VarJ = t2b.j(str, i, headerCTAT.q());
                String strO3 = headerCTAT.o();
                return new ow50(title2, docVar, 0, ave0VarJ, strO3.length() == 0 ? null : strO3, 4);
            case 3:
                PremiumLegalText premiumLegalTextU = pDPComponent.u();
                return new etv0(premiumLegalTextU.p(), premiumLegalTextU.q(), 2, (uqg0) null, t2b.j(str, i, premiumLegalTextU.o()));
            case 4:
                PremiumBenefitsSection premiumBenefitsSectionN = pDPComponent.n();
                List<BenefitItem> itemsList = premiumBenefitsSectionN.getItemsList();
                ArrayList arrayList = new ArrayList(q7h.U(itemsList, 10));
                for (BenefitItem benefitItem : itemsList) {
                    arrayList.add(new mja(benefitItem.o(), benefitItem.n()));
                }
                return new hqv0(premiumBenefitsSectionN.getTitle(), arrayList, t2b.j(str, i, premiumBenefitsSectionN.o()));
            case 5:
                PremiumSectionHeader premiumSectionHeaderW = pDPComponent.w();
                return new jwv0(premiumSectionHeaderW.getTitle(), premiumSectionHeaderW.p(), t2b.j(str, i, premiumSectionHeaderW.o()));
            case 6:
                return ((cua) this.b).i(str, i, pDPComponent.v());
            case 7:
                bm00 bm00Var = (bm00) this.c;
                GroupedOfferCards groupedOfferCardsR = pDPComponent.r();
                h290<PremiumOfferCard> h290VarR = groupedOfferCardsR.r();
                ArrayList arrayList2 = new ArrayList(q7h.U(h290VarR, 10));
                for (PremiumOfferCard premiumOfferCard : h290VarR) {
                    cua cuaVar = (cua) bm00Var.b;
                    premiumOfferCard.getClass();
                    arrayList2.add(cuaVar.i(str, i, premiumOfferCard));
                }
                return new aq50(groupedOfferCardsR.n(), groupedOfferCardsR.p(), t2b.j(str, i, groupedOfferCardsR.q()), arrayList2);
            case 8:
                PremiumFeatureCard premiumFeatureCardQ = pDPComponent.q();
                return new osv0(premiumFeatureCardQ.getName(), premiumFeatureCardQ.getTitle(), premiumFeatureCardQ.q(), premiumFeatureCardQ.getDescription(), premiumFeatureCardQ.r(), premiumFeatureCardQ.n(), premiumFeatureCardQ.o(), t2b.j(str, i, premiumFeatureCardQ.s()));
            default:
                return new ayq0(1);
        }
    }

    public void n(upn1 upn1Var) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.c;
        o7g1 o7g1Var = (o7g1) this.b;
        if (upn1Var instanceof m7r0) {
            View view = ((m7r0) upn1Var).c;
            if (view == null || o7g1Var == null) {
                return;
            }
            linkedHashSet.add(view);
            view.setTag(2131431636, o7g1Var);
            return;
        }
        if (!(upn1Var instanceof l7r0)) {
            if (upn1Var instanceof n7r0) {
                e();
            }
        } else {
            View view2 = ((l7r0) upn1Var).c;
            if (view2 == null || o7g1Var == null) {
                return;
            }
            linkedHashSet.add(view2);
            view2.setTag(2131431636, o7g1Var);
        }
    }

    public void o(rgt0 rgt0Var) {
        fn31.T((llm) this.b, (o8n) null, 0, new f3t0(this, rgt0Var, (lnm) null, (byte) 6), 3);
    }

    public mfe p() {
        return k4p1.B((bbc) this.c);
    }

    public void q(ses0 ses0Var) {
        ses0Var.a();
        if (ses0Var.e != 0) {
            eg.m("Cannot release PeekBuffer with an active filter frame");
            return;
        }
        int i = ses0Var.a;
        for (int i2 = 0; i2 < i; i2++) {
            ses0Var.b[i2] = null;
            ses0Var.c[i2] = null;
        }
        ses0Var.m();
        ses0Var.a = 0;
        ses0Var.d = false;
        if (ses0Var instanceof ves0) {
            synchronized (((ArrayDeque) this.b)) {
                if (((ArrayDeque) this.b).size() < 8) {
                    ((ArrayDeque) this.b).addLast(ses0Var);
                }
            }
        }
    }

    public void r(ues0 ues0Var) {
        if (ues0Var.a.length != 64) {
            return;
        }
        synchronized (((ArrayDeque) this.c)) {
            if (((ArrayDeque) this.c).size() < 8) {
                ((ArrayDeque) this.c).addLast(ues0Var);
            }
        }
    }

    public void s(String... strArr) {
        ((kh0) this.c).a(Arrays.copyOf(strArr, strArr.length));
    }

    public zhq0(String str, gbs0 gbs0Var, agw agwVar) {
        this.a = (byte) 13;
        this.b = str;
        this.c = agwVar;
    }

    public zhq0(yon yonVar, h39 h39Var, mx41 mx41Var) {
        this.a = (byte) 15;
        this.b = h39Var;
        this.c = mx41Var;
    }

    public zhq0(yqg yqgVar) {
        this.a = (byte) 21;
        this.b = yqgVar;
    }

    public /* synthetic */ zhq0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public zhq0(android.content.Context context) {
        this.a = (byte) 4;
        this.b = context.getPackageManager();
        this.c = p7h.M(new String[]{"com.spotify.music.canary", "com.spotify.music.debug", "com.spotify.music"});
    }

    public zhq0(q8n q8nVar) {
        this.a = (byte) 24;
        this.b = smo1.e(q8nVar);
        this.c = mno1.a(0, 0, 7);
    }

    public zhq0(int i, boolean z) {
        o7g1 o7g1Var;
        this.a = (byte) 8;
        fns fnsVar = igu.a;
        q8n q8nVarM = xch1.b.M(1);
        bs50 bs50Var = pyf0.a.f;
        if (z) {
            ytw0 ytw0Var = jfv.b;
            o7g1Var = new o7g1(q8nVarM, fdg1.k0(i, ngv.d), bs50Var);
        } else {
            o7g1Var = null;
        }
        this.b = o7g1Var;
        this.c = new LinkedHashSet();
    }

    public zhq0(dgb dgbVar, c9c c9cVar, ekb ekbVar, mka mkaVar, mta mtaVar, cua cuaVar, xgc xgcVar, bm00 bm00Var, twb twbVar) {
        this.a = (byte) 3;
        this.b = cuaVar;
        this.c = bm00Var;
    }

    public zhq0(lr01 lr01Var, t2j0 t2j0Var) {
        this.a = (byte) 7;
        b3s b3sVar = b3s.c;
        this.b = t2j0Var;
        this.c = lr01Var.a("spotify:list:recents:page");
    }

    public zhq0(uc9 uc9Var) {
        this.a = (byte) 0;
        this.b = uc9Var;
        this.c = new uj7(0);
    }

    public zhq0(String str) {
        this.a = (byte) 2;
        this.b = vvt.a.m(ExtraSupportedOutputSizeQuirk.class);
        this.c = new clv(str, (byte) 8);
    }
}
