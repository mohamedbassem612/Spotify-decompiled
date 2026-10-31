package p;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.show.proto.ShowDecorateRequest$ProtoDecorateResponse;
import com.spotify.mobile.android.spotlets.show.proto.ShowDecorateRequest$ProtoDecorateShowItem;
import com.spotify.mobile.android.spotlets.show.proto.ShowMetadata$ProtoShowMetadata;
import com.spotify.mobile.android.spotlets.show.proto.ShowState;
import com.spotify.mobile.android.spotlets.show.proto.ShowState$ProtoShowCollectionState;
import com.spotify.mobile.android.spotlets.show.proto.ShowState$ProtoShowOfflineState;
import com.spotify.mobius.functions.Consumer;
import com.spotify.player.model.ContextTrack$Metadata;
import j$.time.LocalDateTime;
import j$.time.format.DateTimeParseException;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class v3v0 extends tv30 implements iu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3v0(Object obj, byte b) {
        super(1, obj, vo30.class, "createEpisodes", "createEpisodes(Lcom/spotify/mobile/android/spotlets/show/proto/ShowDecorateRequest$ProtoDecorateResponse;)Ljava/util/Map;", 0);
        this.a = b;
        switch (b) {
            case 1:
                super(1, obj, vo30.class, "createEpisodes", "createEpisodes(Lcom/spotify/mobile/android/spotlets/show/proto/ShowDecorateRequest$ProtoDecorateResponse;)Ljava/util/Map;", 0);
                break;
            case 2:
                super(1, obj, vo30.class, "createShows", "createShows(Lcom/spotify/mobile/android/spotlets/show/proto/ShowDecorateRequest$ProtoDecorateResponse;)Ljava/util/Map;", 0);
                break;
            case 10:
                super(1, obj, f46.class, "contains", "contains([Ljava/lang/Object;Ljava/lang/Object;)Z", 1);
                break;
            default:
                break;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.xkg0 */
    /* JADX WARN: Code duplicated, block: B:128:0x0379  */
    /* JADX WARN: Code duplicated, block: B:130:0x0384  */
    /* JADX WARN: Code duplicated, block: B:133:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:135:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:137:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:138:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:140:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:147:0x0403  */
    /* JADX WARN: Code duplicated, block: B:149:0x0407  */
    /* JADX WARN: Code duplicated, block: B:155:0x0420  */
    /* JADX WARN: Code duplicated, block: B:157:0x0429  */
    /* JADX WARN: Code duplicated, block: B:158:0x0432  */
    /* JADX WARN: Code duplicated, block: B:164:0x044c  */
    /* JADX WARN: Code duplicated, block: B:166:0x0450  */
    /* JADX WARN: Code duplicated, block: B:167:0x0453  */
    /* JADX WARN: Code duplicated, block: B:173:0x0468  */
    /* JADX WARN: Code duplicated, block: B:178:0x0473  */
    /* JADX WARN: Code duplicated, block: B:183:0x047e  */
    /* JADX WARN: Code duplicated, block: B:188:0x048a  */
    /* JADX WARN: Code duplicated, block: B:292:0x01b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:294:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x0410 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:304:0x040a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x019f  */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.String, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v25 */
    public final Object invoke(Object obj) throws xkg0 {
        List list;
        Object value;
        aev0 aev0VarA;
        LocalDateTime localDateTime;
        xkg0 xkg0Var;
        w0u w0uVar;
        xkg0 xkg0Var2;
        long jLastModified;
        xkg0 xkg0Var3;
        xkg0 xkg0Var4;
        xkg0 xkg0Var5;
        xkg0 xkg0Var6;
        dos0 dos0Var;
        dos0 dos0Var2;
        dos0 dos0Var3;
        dos0 dos0Var4;
        dos0 dos0Var5;
        gmt gmtVar;
        List list2;
        nit nitVar;
        long jLongValue;
        ArrayList arrayList;
        int i;
        int i2;
        dos0 dos0Var6;
        long jLongValue2;
        dos0 dos0Var7;
        long j;
        long j2;
        xkg0 xkg0Var7;
        List list3;
        Object value2;
        o4z0 o4z0VarA;
        xkg0 linkedHashMap;
        boolean z = true;
        xkg0 w0uVar2 = null;
        switch (this.a) {
            case 0:
                return ((vo30) ((lyc) this).receiver).e((ShowDecorateRequest$ProtoDecorateResponse) obj);
            case 1:
                return ((vo30) ((lyc) this).receiver).e((ShowDecorateRequest$ProtoDecorateResponse) obj);
            case 2:
                ShowDecorateRequest$ProtoDecorateResponse showDecorateRequest$ProtoDecorateResponse = (ShowDecorateRequest$ProtoDecorateResponse) obj;
                vo30 vo30Var = (vo30) ((lyc) this).receiver;
                vo30Var.getClass();
                if (showDecorateRequest$ProtoDecorateResponse == null) {
                    return null;
                }
                h290<ShowDecorateRequest$ProtoDecorateShowItem> h290VarO = showDecorateRequest$ProtoDecorateResponse.o();
                int iS = zno1.s(q7h.U(h290VarO, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS);
                for (ShowDecorateRequest$ProtoDecorateShowItem showDecorateRequest$ProtoDecorateShowItem : h290VarO) {
                    String link = showDecorateRequest$ProtoDecorateShowItem.getLink();
                    ShowMetadata$ProtoShowMetadata showMetadata$ProtoShowMetadataO = showDecorateRequest$ProtoDecorateShowItem.o();
                    if (!showDecorateRequest$ProtoDecorateShowItem.s()) {
                        showMetadata$ProtoShowMetadataO = null;
                    }
                    ShowState$ProtoShowCollectionState showState$ProtoShowCollectionStateN = showDecorateRequest$ProtoDecorateShowItem.n();
                    if (!showDecorateRequest$ProtoDecorateShowItem.r()) {
                        showState$ProtoShowCollectionStateN = null;
                    }
                    ShowState.ProtoShowPlayState protoShowPlayStateQ = showDecorateRequest$ProtoDecorateShowItem.q();
                    if (!showDecorateRequest$ProtoDecorateShowItem.u()) {
                        protoShowPlayStateQ = null;
                    }
                    ShowState$ProtoShowOfflineState showState$ProtoShowOfflineStateP = showDecorateRequest$ProtoDecorateShowItem.p();
                    if (!showDecorateRequest$ProtoDecorateShowItem.t()) {
                        showState$ProtoShowOfflineStateP = null;
                    }
                    linkedHashMap2.put(link, vo30Var.d(showMetadata$ProtoShowMetadataO, showState$ProtoShowCollectionStateN, protoShowPlayStateQ, showState$ProtoShowOfflineStateP));
                }
                return linkedHashMap2;
            case 3:
                lnc1 lnc1Var = (lnc1) ((lyc) this).receiver;
                lnc1Var.getClass();
                View viewInflate = LayoutInflater.from((Context) obj).inflate(2131626211, (ViewGroup) null, false);
                lnc1Var.a(viewInflate);
                return viewInflate;
            case 4:
                return Boolean.valueOf(((rob) ((lyc) this).receiver).a((Throwable) obj));
            case 5:
                return Boolean.valueOf(((rob) ((lyc) this).receiver).a((Throwable) obj));
            case 6:
                wdv0 wdv0Var = (wdv0) obj;
                oev0 oev0Var = (oev0) ((lyc) this).receiver;
                String str = wdv0Var.a;
                xmu0 xmu0Var = oev0Var.a;
                yqu0 yqu0Var = (yqu0) xmu0Var.c;
                aev0 aev0Var = (aev0) ((xe01) yqu0Var.b).a.getValue();
                if (aev0Var.b().size() < 2 || u890.j(str, aev0Var.b) || !((list = wdv0Var.b) == null || list.equals(xmu0Var.g(aev0Var).a))) {
                    z = false;
                } else {
                    if (str != null) {
                        ArrayList arrayListB = aev0Var.b();
                        if (!arrayListB.isEmpty()) {
                            Iterator it = arrayListB.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (u890.j(((uod1) it.next()).a, str)) {
                                    }
                                }
                            }
                        }
                        z = false;
                    }
                    ?? r1 = 0;
                    oev0Var.d = null;
                    bpb1 bpb1Var = (bpb1) yqu0Var.c;
                    if (str == null) {
                        while (true) {
                            Object value3 = bpb1Var.getValue();
                            if (!bpb1Var.k(value3, aev0.a((aev0) value3, (List) r1, (String) r1, 1))) {
                                r1 = 0;
                            }
                        }
                    } else {
                        do {
                            value = bpb1Var.getValue();
                            aev0VarA = (aev0) value;
                            List list4 = aev0VarA.a;
                            if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                                Iterator it2 = list4.iterator();
                                while (it2.hasNext()) {
                                    if (u890.j(((uod1) it2.next()).a, str)) {
                                        aev0VarA = aev0.a(aev0VarA, (List) null, str, 1);
                                    }
                                }
                            }
                        } while (!bpb1Var.k(value, aev0VarA));
                    }
                }
                return Boolean.valueOf(z);
            case 7:
                Intent intent = (Intent) obj;
                ((iqv0) ((lyc) this).receiver).getClass();
                return Boolean.valueOf(intent != null ? intent.getBooleanExtra("PremiumCheckoutActivity", false) : false);
            case 8:
                ejw0 ejw0Var = (ejw0) obj;
                fjw0 fjw0Var = (fjw0) ((lyc) this).receiver;
                synchronized (fjw0Var.b) {
                    if (fjw0Var.c == ejw0Var) {
                        fjw0Var.c = null;
                    }
                    break;
                }
                return rih1.a;
            case 9:
                File file = (File) obj;
                sex0 sex0Var = (sex0) ((lyc) this).receiver;
                sex0Var.f.getClass();
                mbh0 mbh0VarD = zy4.a.d(file.getName());
                String str2 = mbh0VarD != null ? (String) mbh0VarD.a().get(1) : null;
                if (str2 != null) {
                    try {
                        localDateTime = LocalDateTime.parse(str2, zy4.b);
                        break;
                    } catch (DateTimeParseException unused) {
                        Logger.d("Invalid timestamp in Android profile filename", new Object[0]);
                        localDateTime = null;
                    }
                    if (localDateTime != null) {
                        gmtVar = sex0Var.e;
                        gmtVar.getClass();
                        if (localDateTime.getNano() == 0) {
                            hhg1.n("Expected a second-precision capture timestamp");
                            return null;
                        }
                        list2 = (List) ((t0r0) gmtVar.b).invoke();
                        nitVar = new nit(localDateTime, (byte) 3);
                        jLongValue = ((Number) ((Function0) gmtVar.c).invoke()).longValue();
                        arrayList = new ArrayList();
                        i = 0;
                        for (Object obj2 : list2) {
                            i2 = i + 1;
                            if (i >= 0) {
                                xkg0 xkg0Var8 = w0uVar2;
                                p7h.T();
                                throw xkg0Var8;
                            }
                            dos0Var6 = (dos0) obj2;
                            jLongValue2 = ((Long) nitVar.invoke(dos0Var6)).longValue();
                            if (jLongValue2 > jLongValue) {
                                xkg0Var7 = w0uVar2;
                                list3 = list2;
                            } else {
                                dos0Var7 = (dos0) o7h.t0(i2, list2);
                                j = jLongValue2 / 1000;
                                j2 = dos0Var6.b / 1000;
                                xkg0Var7 = w0uVar2;
                                list3 = list2;
                                if (dos0Var7 != null) {
                                    w0uVar2 = Long.valueOf(dos0Var7.b / 1000);
                                }
                                if (j > j2 || (w0uVar2 != null && j >= w0uVar2.longValue())) {
                                    w0uVar2 = xkg0Var7;
                                } else {
                                    w0uVar2 = new w0u(dos0Var6, jLongValue2);
                                }
                            }
                            if (w0uVar2 != null) {
                                arrayList.add(w0uVar2);
                            }
                            i = i2;
                            w0uVar2 = xkg0Var7;
                            list2 = list3;
                        }
                        xkg0Var = w0uVar2;
                        w0uVar = (w0u) o7h.X0(arrayList);
                        if (w0uVar == null) {
                            Logger.d("Could not attribute report to one diagnostic session", new Object[0]);
                        }
                    } else {
                        xkg0Var = null;
                        w0uVar = null;
                    }
                    String string = UUID.randomUUID().toString();
                    n1u n1uVar = n1u.b;
                    if (w0uVar != null || (dos0Var5 = w0uVar.a) == null) {
                        xkg0Var2 = xkg0Var;
                    } else {
                        xkg0Var2 = dos0Var5.a;
                    }
                    if (w0uVar != null) {
                        jLastModified = w0uVar.b;
                    } else {
                        jLastModified = file.lastModified();
                    }
                    long length = file.length();
                    if (w0uVar != null || (dos0Var4 = w0uVar.a) == null) {
                        xkg0Var3 = xkg0Var;
                    } else {
                        xkg0Var3 = dos0Var4.d;
                    }
                    if (w0uVar != null || (dos0Var3 = w0uVar.a) == null) {
                        xkg0Var4 = xkg0Var;
                    } else {
                        xkg0Var4 = dos0Var3.e;
                    }
                    if (w0uVar != null || (dos0Var2 = w0uVar.a) == null) {
                        xkg0Var5 = xkg0Var;
                    } else {
                        xkg0Var5 = dos0Var2.f;
                    }
                    if (w0uVar != null || (dos0Var = w0uVar.a) == null) {
                        xkg0Var6 = xkg0Var;
                    } else {
                        xkg0Var6 = dos0Var.g;
                    }
                    return new v0u(file, string, n1uVar, xkg0Var2, jLastModified, length, "PERFETTO", "1", xkg0Var3, xkg0Var4, xkg0Var5, xkg0Var6);
                }
                Logger.d("Unexpected Android profile filename", new Object[0]);
                localDateTime = null;
                if (localDateTime != null) {
                    gmtVar = sex0Var.e;
                    gmtVar.getClass();
                    if (localDateTime.getNano() == 0) {
                        hhg1.n("Expected a second-precision capture timestamp");
                        return null;
                    }
                    list2 = (List) ((t0r0) gmtVar.b).invoke();
                    nitVar = new nit(localDateTime, (byte) 3);
                    jLongValue = ((Number) ((Function0) gmtVar.c).invoke()).longValue();
                    arrayList = new ArrayList();
                    i = 0;
                    while (r0.hasNext()) {
                        i2 = i + 1;
                        if (i >= 0) {
                            xkg0 xkg0Var9 = w0uVar2;
                            p7h.T();
                            throw xkg0Var9;
                        }
                        dos0Var6 = (dos0) obj2;
                        jLongValue2 = ((Long) nitVar.invoke(dos0Var6)).longValue();
                        if (jLongValue2 > jLongValue) {
                            xkg0Var7 = w0uVar2;
                            list3 = list2;
                        } else {
                            dos0Var7 = (dos0) o7h.t0(i2, list2);
                            j = jLongValue2 / 1000;
                            j2 = dos0Var6.b / 1000;
                            xkg0Var7 = w0uVar2;
                            list3 = list2;
                            if (dos0Var7 != null) {
                                w0uVar2 = Long.valueOf(dos0Var7.b / 1000);
                            }
                            if (j > j2) {
                                w0uVar2 = xkg0Var7;
                            } else {
                                w0uVar2 = xkg0Var7;
                            }
                        }
                        if (w0uVar2 != null) {
                            arrayList.add(w0uVar2);
                        }
                        i = i2;
                        w0uVar2 = xkg0Var7;
                        list2 = list3;
                    }
                    xkg0Var = w0uVar2;
                    w0uVar = (w0u) o7h.X0(arrayList);
                    if (w0uVar == null) {
                        Logger.d("Could not attribute report to one diagnostic session", new Object[0]);
                    }
                } else {
                    xkg0Var = null;
                    w0uVar = null;
                }
                String string2 = UUID.randomUUID().toString();
                n1u n1uVar2 = n1u.b;
                if (w0uVar != null) {
                    xkg0Var2 = xkg0Var;
                } else {
                    xkg0Var2 = xkg0Var;
                }
                if (w0uVar != null) {
                    jLastModified = w0uVar.b;
                } else {
                    jLastModified = file.lastModified();
                }
                long length2 = file.length();
                if (w0uVar != null) {
                    xkg0Var3 = xkg0Var;
                } else {
                    xkg0Var3 = xkg0Var;
                }
                if (w0uVar != null) {
                    xkg0Var4 = xkg0Var;
                } else {
                    xkg0Var4 = xkg0Var;
                }
                if (w0uVar != null) {
                    xkg0Var5 = xkg0Var;
                } else {
                    xkg0Var5 = xkg0Var;
                }
                if (w0uVar != null) {
                    xkg0Var6 = xkg0Var;
                } else {
                    xkg0Var6 = xkg0Var;
                }
                return new v0u(file, string2, n1uVar2, xkg0Var2, jLastModified, length2, "PERFETTO", "1", xkg0Var3, xkg0Var4, xkg0Var5, xkg0Var6);
            case 10:
                return Boolean.valueOf(f46.M((Object[]) ((lyc) this).receiver, (View) obj));
            case 11:
                String str3 = (String) obj;
                bpb1 bpb1Var2 = ((i4z0) ((lyc) this).receiver).t;
                do {
                    value2 = bpb1Var2.getValue();
                    o4z0VarA = (o4z0) value2;
                    if (!o4z0VarA.d) {
                        o4z0VarA = o4z0.a(o4z0VarA, (ArrayList) null, str3, false, 11);
                    }
                } while (!bpb1Var2.k(value2, o4z0VarA));
                return rih1.a;
            case 12:
                return Boolean.valueOf(((obz0) ((mbz0) ((lyc) this).receiver)).g(((Number) obj).intValue()) == 1);
            case 13:
                ((ufz0) ((lyc) this).receiver).a(((Number) obj).intValue());
                return rih1.a;
            case 14:
                ((Consumer) ((lyc) this).receiver).accept((f501) obj);
                return rih1.a;
            case 15:
                return ((g3h) ((lyc) this).receiver).b((fkt) obj);
            case 16:
                return ((g3h) ((lyc) this).receiver).b((fkt) obj);
            case 17:
                return ((g3h) ((lyc) this).receiver).b((fkt) obj);
            case 18:
                y311 y311Var = (y311) ((lyc) this).receiver;
                return new xzq(y311Var.a.a((d0r) obj, new tlt0(y311Var.b, y311Var.c)), t011.T0);
            case 19:
                q911 q911Var = (q911) obj;
                return new r911(q911Var.a, q911Var.b, ((l911) ((s911) ((lyc) this).receiver).b.getValue()).b());
            case 20:
                hp11 hp11Var = (hp11) ((lyc) this).receiver;
                hp11Var.getClass();
                ComposeView composeView = new ComposeView(((ViewGroup) obj).getContext(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                composeView.setContent(new j2i(528552825, new ep11(hp11Var, (byte) 3), true));
                return composeView;
            case 21:
                Function0 function0 = (Function0) obj;
                vk21 vk21Var = (vk21) ((lyc) this).receiver;
                l811 l811Var = new l811();
                gw91 gw91Var = vk21Var.c;
                gw91Var.d(function0, vk21Var.d, new uk21(l811Var, function0, (byte) 0));
                if (l811Var.a) {
                    gw91Var.b(vk21Var.b);
                    dt30 dt30Var = vk21Var.a;
                    if (!dt30Var.c()) {
                        dt30Var.d();
                    }
                    gw91Var.a();
                    gw91Var.f();
                }
                return rih1.a;
            case 22:
                m0u0 m0u0Var = (m0u0) obj;
                ym21 ym21Var = (ym21) ((lyc) this).receiver;
                ym21Var.getClass();
                xkg0 xkg0Var10 = b7x.a;
                String str4 = m0u0Var.d;
                Map map = m0u0Var.a.d;
                tv80 tv80Var = (tv80) ym21Var.b.get(str4);
                xkg0 xkg0VarV = tv80Var != null ? c97.v(tv80Var) : null;
                if (xkg0VarV == null) {
                    xkg0VarV = xkg0Var10;
                }
                String str5 = (String) ym21Var.c.get(str4);
                String str6 = (String) ym21Var.a.invoke();
                xkg0 xkg0VarSingletonMap = str6 != null ? Collections.singletonMap(ContextTrack$Metadata.KEY_PAGE_INSTANCE_ID, str6) : null;
                Set setKeySet = map.keySet();
                if ((setKeySet instanceof Collection) && setKeySet.isEmpty()) {
                    linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : xkg0VarV.entrySet()) {
                        if (zm21.a.contains((String) entry.getKey())) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                } else {
                    Iterator it3 = setKeySet.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            linkedHashMap = new LinkedHashMap();
                            while (r7.hasNext()) {
                                if (zm21.a.contains((String) entry.getKey())) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                        } else if (zm21.a.contains((String) it3.next())) {
                            linkedHashMap = xkg0Var10;
                        }
                    }
                }
                xkg0 xkg0VarSingletonMap2 = (map.containsKey("feature_tracking_id") || str5 == null) ? null : Collections.singletonMap("feature_tracking_id", str5);
                String str7 = (String) ym21Var.d.get(str4);
                if (!map.containsKey("provenance_id") && str7 != null) {
                    w0uVar2 = Collections.singletonMap("provenance_id", str7);
                }
                if (xkg0VarSingletonMap == null) {
                    xkg0VarSingletonMap = xkg0Var10;
                }
                LinkedHashMap linkedHashMapO = sqg0.O(sqg0.O(map, xkg0VarSingletonMap), linkedHashMap);
                if (xkg0VarSingletonMap2 == null) {
                    xkg0VarSingletonMap2 = xkg0Var10;
                }
                LinkedHashMap linkedHashMapO2 = sqg0.O(linkedHashMapO, xkg0VarSingletonMap2);
                if (w0uVar2 != null) {
                    xkg0Var10 = w0uVar2;
                }
                return sqg0.O(linkedHashMapO2, xkg0Var10);
            case 23:
                ym21 ym21Var2 = (ym21) ((lyc) this).receiver;
                LinkedHashMap linkedHashMap3 = ym21Var2.b;
                String str8 = ((m0u0) obj).d;
                linkedHashMap3.remove(str8);
                ym21Var2.c.remove(str8);
                ym21Var2.d.remove(str8);
                return rih1.a;
            case 24:
                int iIntValue = ((Number) obj).intValue();
                yjs yjsVar = (yjs) ((lyc) this).receiver;
                uxy0 uxy0Var = yjsVar.c;
                List list5 = yjsVar.a;
                String str9 = ((h631) list5.get(iIntValue)).d;
                int size = list5.size();
                i8h1 i8h1Var = (i8h1) ((uyp) uxy0Var.b).get();
                brl0 brl0Var = (brl0) uxy0Var.c;
                Integer numValueOf = Integer.valueOf(iIntValue + 1);
                String strValueOf = String.valueOf(size);
                x6h1 x6h1VarC = brl0Var.b.c();
                x6h1VarC.i.add(new a7h1("winner_card", (String) null, numValueOf, str9, strValueOf));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var.e = brl0Var.c;
                i8h1Var.f(k7h1Var.a(), (Set) null);
                return rih1.a;
            case 25:
                jh5 jh5Var = (jh5) obj;
                ts31 ts31Var = (ts31) ((lyc) this).receiver;
                if (ts31Var.q.contains(jh5Var)) {
                    return null;
                }
                k3r k3rVar = (k3r) ts31Var.k.get(jh5Var);
                return k3rVar == null ? (k3r) ts31Var.i.get(jh5Var) : k3rVar;
            case 26:
                int i3 = ((xb51) obj).a;
                ec51 ec51Var = (ec51) ((hc51) ((lyc) this).receiver).b.get();
                return Boolean.valueOf(ec51Var.e() == i3 && ec51Var.b() != null);
            case 27:
                return Boolean.valueOf(((hc51) ((lyc) this).receiver).c(((xb51) obj).a));
            case 28:
                ((s551) ((lyc) this).receiver).a((qnc0) obj);
                return rih1.a;
            default:
                q151 q151Var = (q151) obj;
                c751 c751Var = (c751) ((lyc) this).receiver;
                c751Var.X.d(q151Var);
                c751Var.N0.getClass();
                c751Var.X0.l(q151Var);
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v3v0(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3v0(ts31 ts31Var) {
        super(1, ts31Var, ts31.class, "latestResult", "latestResult(Lcom/spotify/kodiak/table/table/AnyTableKey;)Lcom/spotify/kodiak/table/table/DataSourceResult;", 0);
        this.a = (byte) 25;
    }
}
