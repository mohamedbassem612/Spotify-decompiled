package p;

import android.R;
import android.net.http.X509TrustManagerExtensions;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.download.esperanto.proto.EsDownload;
import io.reactivex.rxjava3.core.Single;
import java.io.IOException;
import java.security.cert.X509Certificate;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class c4z extends tv30 implements vu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4z(ym21 ym21Var, byte b) {
        super(2, ym21Var, ym21.class, "setInteractionLoggingResult", "setInteractionLoggingResult(Ljava/lang/String;Lcom/spotify/ubi/logger/InteractionLoggingResult;)V", 0);
        this.a = b;
        switch (b) {
            case 29:
                super(2, ym21Var, ym21.class, "setLinkingId", "setLinkingId(Ljava/lang/String;Ljava/lang/String;)V", 0);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:129:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:375:0x026c A[EDGE_INSN: B:375:0x026c->B:85:0x026c BREAK  A[LOOP:2: B:79:0x0257->B:83:0x0260], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:376:0x0263 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x024e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0259  */
    /* JADX WARN: Code duplicated, block: B:83:0x0260 A[LOOP:2: B:79:0x0257->B:83:0x0260, LOOP_END] */
    public final Object invoke(Object obj, Object obj2) {
        Single map;
        boolean zB;
        nsb0 nsb0Var;
        boolean zB2;
        uba ubaVar;
        goj0 goj0VarA;
        String str;
        i1e i1eVar;
        mq70 mq70Var;
        up70 up70VarA;
        int iMax;
        y1k1 y1k1Var;
        y1k1 y1k1Var2;
        int i;
        int length;
        goj0 goj0VarA2;
        jvd0 jvd0Var;
        gvd0 gvd0Var;
        byte b = this.a;
        d9n d9nVar = d9n.a;
        int i2 = 3;
        int i3 = 2;
        int i4 = 0;
        iMin = 0;
        int iMin = 0;
        zEquals = false;
        zEquals = false;
        zEquals = false;
        boolean zEquals = false;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return ((eg40) ((lyc) this).receiver).f((String) obj, (lnm) obj2);
            case 1:
                return ((mar) ((lyc) this).receiver).a((String) obj, (lnm) obj2);
            case 2:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                lnm lnmVar = (lnm) obj2;
                zy10 zy10Var = (zy10) ((lyc) this).receiver;
                zy10Var.getClass();
                SystemClock.elapsedRealtime();
                String id = "";
                Boolean boolValueOf = null;
                while (i2 > 0) {
                    try {
                        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(zy10Var.b);
                        id = advertisingIdInfo.getId();
                        if (id == null) {
                            id = "";
                        }
                        if (!zBooleanValue) {
                            id = "00000000-0000-0000-0000-000000000000";
                        }
                        boolValueOf = Boolean.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled());
                        SystemClock.elapsedRealtime();
                    } catch (IOException | SecurityException | GooglePlayServicesNotAvailableException unused) {
                    } catch (GooglePlayServicesRepairableException unused2) {
                        i2--;
                    }
                    i2 = 0;
                }
                LinkedHashMap linkedHashMapM = sqg0.M(new mmr0[]{new mmr0("idtype", "gaid")});
                if (!TextUtils.isEmpty(id)) {
                    linkedHashMapM.put("rdid", id);
                }
                if (boolValueOf != null) {
                    linkedHashMapM.put("is_lat", boolValueOf.booleanValue() ? "1" : "0");
                }
                trd1 trd1Var = zy10Var.a;
                Object objH = c921.H(trd1Var.b, new pec1(trd1Var, linkedHashMapM, (lnm) null, (byte) 10), lnmVar);
                if (objH != d9nVar) {
                    objH = rih1Var;
                }
                return objH == d9nVar ? objH : rih1Var;
            case 3:
                String str2 = (String) obj;
                Function0 function0 = (Function0) obj2;
                LinkedHashMap linkedHashMap = ((iz10) ((lyc) this).receiver).b;
                Object objInvoke = linkedHashMap.get(str2);
                if (objInvoke == null) {
                    objInvoke = function0.invoke();
                    linkedHashMap.put(str2, objInvoke);
                }
                return (f520) objInvoke;
            case 4:
                long jLongValue = ((Number) obj).longValue();
                long jLongValue2 = ((Number) obj2).longValue();
                f520 f520Var = (f520) ((lyc) this).receiver;
                Integer num = f520Var.j;
                if (num == null || (map = Single.just(Integer.valueOf(num.intValue()))) == null) {
                    hnz hnzVarN = EsDownload.ProgressiveFileStreamerParams.n();
                    hnzVarN.s(f520Var.c.toString());
                    hnzVarN.q(f520Var.d);
                    hnzVarN.r(f520Var.e);
                    hnzVarN.n(f520Var.h);
                    EsDownload.ProgressiveFileStreamerParams progressiveFileStreamerParamsBuild = hnzVarN.build();
                    ptu ptuVar = f520Var.a;
                    progressiveFileStreamerParamsBuild.getClass();
                    map = ptuVar.callSingle("spotify.download.esperanto.proto.Download", "CreateProgressiveFileStreamer", progressiveFileStreamerParamsBuild).map(stf0.d1).map(new fey(f520Var, (byte) 9));
                }
                return map.toObservable().flatMap(new m1d(f520Var, jLongValue, jLongValue2));
            case 5:
                wz20 wz20Var = (wz20) obj;
                wz20 wz20Var2 = (wz20) obj2;
                b030 b030Var = (b030) ((lyc) this).receiver;
                if (((pim0) b030Var).N0 && (zB = wz20Var2.b()) != wz20Var.b()) {
                    if (zB) {
                        p811 p811Var = new p811();
                        p9p1.z(b030Var, new og(p811Var, b030Var, (byte) 22));
                        nsb0 nsb0Var2 = (nsb0) p811Var.a;
                        if (nsb0Var2 != null) {
                            nsb0Var2.a();
                            nsb0Var = nsb0Var2;
                        } else {
                            nsb0Var = null;
                        }
                        b030Var.R0 = nsb0Var;
                    } else {
                        nsb0 nsb0Var3 = b030Var.R0;
                        if (nsb0Var3 != null) {
                            nsb0Var3.b();
                        }
                        b030Var.R0 = null;
                    }
                }
                return rih1Var;
            case 6:
                wz20 wz20Var3 = (wz20) obj;
                wz20 wz20Var4 = (wz20) obj2;
                l030 l030Var = (l030) ((lyc) this).receiver;
                if (((pim0) l030Var).N0 && (zB2 = wz20Var4.b()) != wz20Var3.b()) {
                    iu30 iu30Var = l030Var.R0;
                    if (iu30Var != null) {
                        iu30Var.invoke(Boolean.valueOf(zB2));
                    }
                    if (zB2) {
                        fn31.T(l030Var.v1(), (o8n) null, 4, new j020(l030Var, (lnm) null, (byte) 6), 1);
                        p811 p811Var2 = new p811();
                        p9p1.z(l030Var, new og(p811Var2, l030Var, (byte) 24));
                        nsb0 nsb0Var4 = (nsb0) p811Var2.a;
                        if (nsb0Var4 != null) {
                            nsb0Var4.a();
                        } else {
                            nsb0Var4 = null;
                        }
                        l030Var.T0 = nsb0Var4;
                        ndo0 ndo0Var = l030Var.U0;
                        if (ndo0Var != null && ndo0Var.f1().N0 && ((pim0) l030Var).N0) {
                            don1.s(l030Var);
                        }
                    } else {
                        nsb0 nsb0Var5 = l030Var.T0;
                        if (nsb0Var5 != null) {
                            nsb0Var5.b();
                        }
                        l030Var.T0 = null;
                        if (((pim0) l030Var).N0) {
                            don1.s(l030Var);
                        }
                    }
                    nko1.C(l030Var);
                    idn0 idn0Var = l030Var.Q0;
                    if (idn0Var != null) {
                        ry20 ry20Var = l030Var.S0;
                        if (zB2) {
                            if (ry20Var != null) {
                                l030Var.K1(idn0Var, new sy20(ry20Var));
                                l030Var.S0 = null;
                            }
                            ry20 ry20Var2 = new ry20();
                            l030Var.K1(idn0Var, ry20Var2);
                            l030Var.S0 = ry20Var2;
                        } else if (ry20Var != null) {
                            l030Var.K1(idn0Var, new sy20(ry20Var));
                            l030Var.S0 = null;
                        }
                    }
                }
                return rih1Var;
            case 7:
                String str3 = (String) obj;
                ((cc30) ((lyc) this).receiver).getClass();
                X509TrustManagerExtensions x509TrustManagerExtensions = (X509TrustManagerExtensions) dc30.i.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : (List) obj2) {
                    if (obj3 instanceof X509Certificate) {
                        arrayList.add(obj3);
                    }
                }
                return x509TrustManagerExtensions.checkServerTrusted((X509Certificate[]) arrayList.toArray(new X509Certificate[0]), "RSA", str3);
            case 8:
                String str4 = (String) obj;
                rhc rhcVar = (rhc) obj2;
                ((cc30) ((lyc) this).receiver).getClass();
                if (dc30.j.add(str4 + "/" + rhcVar.e())) {
                    n57.s("Rejected TLS connection to " + str4 + ": chain contains forbidden SPKI " + rhcVar.e());
                }
                return rih1Var;
            case 9:
                sy50 sy50Var = (uy50) obj;
                ou80 ou80Var = (ou80) obj2;
                hw30 hw30Var = (hw30) ((lyc) this).receiver;
                u830 u830Var = hw30Var.a;
                if (sy50Var instanceof sy50) {
                    if (ou80Var != null && (ubaVar = hw30Var.f) != null) {
                        ubaVar.w(new lsn0((String) null, ou80Var));
                    }
                    u830Var.invoke(new c000(sy50Var.a));
                    return rih1Var;
                }
                if (sy50Var instanceof ty50) {
                    u830Var.invoke(new q300(((ty50) sy50Var).b));
                    return rih1Var;
                }
                eg.o();
                return null;
            case 10:
                ((dd50) ((lyc) this).receiver).getClass();
                hoj0 hoj0VarC = ((ioj0) obj2).c(a7q0.class, ((wc50) obj).a);
                a7q0 a7q0Var = (hoj0VarC == null || (goj0VarA = hoj0VarC.a()) == null) ? null : (a7q0) goj0VarA.a;
                y6q0 y6q0Var = a7q0Var != null ? a7q0Var.d : null;
                x6q0 x6q0Var = y6q0Var != null ? y6q0Var.c : null;
                if (y6q0Var != null && x6q0Var != null) {
                    long j = y6q0Var.b;
                    if (j > 0) {
                        double d = y6q0Var.a;
                        List<mmr0> listM = p7h.M(new mmr0[]{new mmr0(5, Long.valueOf(x6q0Var.e)), new mmr0(4, Long.valueOf(x6q0Var.d)), new mmr0(3, Long.valueOf(x6q0Var.c)), new mmr0(2, Long.valueOf(x6q0Var.b)), new mmr0(1, Long.valueOf(x6q0Var.a))});
                        ArrayList arrayList2 = new ArrayList(q7h.U(listM, 10));
                        for (mmr0 mmr0Var : listM) {
                            int iIntValue = ((Number) mmr0Var.a).intValue();
                            long jLongValue3 = ((Number) mmr0Var.b).longValue();
                            float f = 0.0f;
                            float f2 = j > 0 ? jLongValue3 / j : 0.0f;
                            if (f2 >= 0.01f) {
                                f = f2;
                            }
                            arrayList2.add(new ad50(f, jLongValue3, iIntValue));
                        }
                        return new bd50(d, j, mqo1.A(arrayList2));
                    }
                }
                return zc50.a;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                wj50 wj50Var = (wj50) obj;
                Collator collator = ((bk50) ((lyc) this).receiver).c;
                List list = (List) obj2;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((k1r) it.next()) instanceof j1r) {
                            return zj50.a;
                        }
                    }
                }
                ArrayList<mmr0> arrayListV1 = o7h.v1(wj50Var.a, list);
                ArrayList arrayList3 = new ArrayList(q7h.U(arrayListV1, 10));
                for (mmr0 mmr0Var2 : arrayListV1) {
                    vj50 vj50Var = (vj50) mmr0Var2.a;
                    i1r i1rVar = (k1r) mmr0Var2.b;
                    i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
                    if (i1rVar2 == null || (i1eVar = (i1e) i1rVar2.a) == null || (str = i1eVar.a) == null) {
                        str = vj50Var.a;
                    }
                    arrayList3.add(new xj50(vj50Var.e, vj50Var.a, vj50Var.b, vj50Var.c, str, vj50Var.d));
                }
                return new yj50(mqo1.A(o7h.a1(arrayList3, new cvt((byte) 11).thenComparing((Comparator) new ck50(collator, (byte) 0)))));
            case grn1.d /* 12 */:
                ((rq50) ((lyc) this).receiver).c.a(((y3g) obj).b, (tv80) obj2, (Bundle) null);
                return rih1Var;
            case 13:
                mu70 mu70Var = (mu70) obj;
                i1r i1rVar3 = (k1r) obj2;
                au70 au70Var = mu70Var.d;
                String str5 = mu70Var.a;
                ((lu70) ((lyc) this).receiver).getClass();
                if (!(i1rVar3 instanceof i1r)) {
                    return new hu70(au70Var, str5);
                }
                nu70 nu70Var = (nu70) i1rVar3.a;
                gw81 gw81Var = nu70Var.a;
                String str6 = gw81Var.d;
                String strG = o1p1.G(nu70Var, mu70Var);
                boolean z = mu70Var.j && lnn1.l(nu70Var.f);
                xkk1 xkk1Var = nu70Var.d;
                String str7 = (xkk1Var == null || (mq70Var = xkk1Var.a) == null || (up70VarA = mq70Var.a(vp70.c)) == null) ? null : up70VarA.a.a;
                if (str7 == null) {
                    str7 = "";
                }
                int i5 = mu70Var.b;
                String str8 = gw81Var.b;
                String str9 = gw81Var.c;
                Set set = s4b1.f;
                return new gu70(new aw70(i5, str5, str8, str9, strG, new xt70(Collections.singletonList(new j47(uic.g(str6, blc0.u1) ? new l07(new g07(str7), false) : new e17(new g07(str7, yz6.d)), x47.a)), (m87) null), gw81Var.h, str6, "", "", (m9m) null, false, false, false, false, mu70Var.m, ero1.h(strG, str8, str9, z), mu70Var.h, mu70Var.e, z), au70Var, str6, wgo1.C(mu70Var.l ? new sgo0(str5, nu70Var.g, nu70Var.c) : null, str5, str7));
            case 14:
                ie30 ie30Var = (ie30) obj;
                List list2 = (List) obj2;
                r390 r390Var = (r390) ((lyc) this).receiver;
                int i6 = ie30Var.x;
                int i7 = ie30Var.w;
                if (!r390Var.f || (((y1k1Var = r390Var.e1) == null || y1k1Var.equals(new y1k1(0, 0)) || (i7 >= y1k1Var.a && i6 >= y1k1Var.b)) && ((y1k1Var2 = r390Var.d1) == null || y1k1Var2.equals(new y1k1(0, 0)) || (i7 <= y1k1Var2.a && i6 <= y1k1Var2.b)))) {
                    VideoSurfaceView videoSurfaceView = r390Var.f1;
                    if (videoSurfaceView == null) {
                        zEquals = true;
                    } else {
                        int width = videoSurfaceView.getWidth();
                        int height = videoSurfaceView.getHeight();
                        if (width <= 0 || height <= 0 || (i7 <= (iMax = Math.max(width, height)) && i6 <= iMax)) {
                            zEquals = true;
                        } else {
                            int i8 = s390.b;
                            k0d k0dVar = k0d.f;
                            Collections.sort(list2, k0dVar);
                            ge30 ge30Var = new ge30();
                            ge30Var.v = width;
                            ge30Var.w = height;
                            int iBinarySearch = Collections.binarySearch(list2, new ie30(ge30Var), k0dVar);
                            if (iBinarySearch >= 0) {
                                zEquals = true;
                            } else {
                                int iAbs = Math.abs(iBinarySearch);
                                if (iAbs >= list2.size()) {
                                    iAbs--;
                                }
                                if (!(r390Var.b.a instanceof sn10) || !r390Var.c) {
                                    i4 = iAbs - 1;
                                } else if (iAbs != 1) {
                                    i4 = iAbs - 2;
                                }
                                zEquals = ie30Var.equals(list2.get(i4));
                            }
                        }
                    }
                }
                return Boolean.valueOf(zEquals);
            case 15:
                tv80 tv80Var = (tv80) obj;
                lnm lnmVar2 = (lnm) obj2;
                mq90 mq90Var = (mq90) ((lyc) this).receiver;
                pp90 pp90Var = (pp90) mq90Var.a.b.current().getValue();
                if (pp90Var == null) {
                    Object objB = mq90Var.b(tv80Var, true, lnmVar2);
                    return objB == d9nVar ? objB : rih1Var;
                }
                vx40 vx40Var = mq90Var.d;
                boolean z2 = pp90Var.h.b.e;
                String str10 = pno1.h(pp90Var.c).b;
                e4b e4bVar = new e4b(mq90Var, tv80Var, (lnm) null, (byte) 1);
                dg30 dg30Var = (dg30) vx40Var.b;
                nqk0 nqk0Var = new nqk0(new n3l0(new o3l0(), 6, (Integer) null), z2 ? 1 : 2);
                mw40 mw40VarT = yoi1.T(dg30Var, z2 ? dg30Var.getString(2131954646) : dg30Var.getString(2131954647, str10), dg30Var.getString(z2 ? 2131954643 : 2131954644));
                String string = dg30Var.getString(2131954645);
                j7b j7bVar = new j7b(vx40Var, nqk0Var, e4bVar, (byte) 3);
                mw40VarT.a = string;
                mw40VarT.c = j7bVar;
                String string2 = dg30Var.getString(R.string.cancel);
                ln5 ln5Var = new ln5(vx40Var, nqk0Var, (byte) 13);
                mw40VarT.b = string2;
                mw40VarT.d = ln5Var;
                mw40VarT.b().b();
                return rih1Var;
            case 16:
                int iIntValue2 = ((Number) obj2).intValue();
                leb0 leb0Var = (leb0) ((lyc) this).receiver;
                i8h1 i8h1Var = leb0Var.a;
                tdl0 tdl0Var = leb0Var.b;
                Integer numValueOf = Integer.valueOf(iIntValue2);
                x6h1 x6h1VarC = tdl0Var.b.c();
                x6h1VarC.i.add(new a7h1("language_row", (String) obj, numValueOf, (String) null, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var.e = tdl0Var.c;
                i8h1Var.f(k7h1Var.a(), (Set) null);
                return rih1Var;
            case 17:
                int iIntValue3 = ((Number) obj).intValue();
                int iIntValue4 = ((Number) obj2).intValue();
                fvb0 fvb0Var = (fvb0) ((lyc) this).receiver;
                mgc mgcVar = fvb0Var.e;
                int[] iArr = new int[iIntValue4];
                if (((yub0) fvb0Var.d.getValue()).j.f(iIntValue3)) {
                    f46.f0(iIntValue3, 0, 6, iArr);
                } else {
                    mgcVar.m(iIntValue3 + iIntValue4);
                    int iZ = mgcVar.z(iIntValue3);
                    if (iZ != -2 && iZ != -1) {
                        if (iZ < 0) {
                            tf80.a("Expected positive lane number, got " + iZ + " instead.");
                        }
                        iMin = Math.min(iZ, iIntValue4);
                    }
                    int iN = iIntValue3;
                    for (int i9 = iMin - 1; -1 < i9; i9--) {
                        iN = mgcVar.n(iN, i9);
                        iArr[i9] = iN;
                        if (iN == -1) {
                            f46.f0(-1, i9, 2, iArr);
                            iArr[iMin] = iIntValue3;
                            for (i = iMin + 1; i < iIntValue4; i++) {
                                iIntValue3++;
                                length = mgcVar.b + ((int[]) mgcVar.c).length;
                                while (true) {
                                    if (iIntValue3 < length) {
                                        iIntValue3 = mgcVar.b + ((int[]) mgcVar.c).length;
                                    }
                                    if (mgcVar.f(iIntValue3, i)) {
                                    }
                                    iIntValue3++;
                                    break;
                                    break;
                                }
                                iArr[i] = iIntValue3;
                            }
                        }
                    }
                    iArr[iMin] = iIntValue3;
                    while (i < iIntValue4) {
                        iIntValue3++;
                        length = mgcVar.b + ((int[]) mgcVar.c).length;
                        while (true) {
                            if (iIntValue3 < length) {
                                iIntValue3 = mgcVar.b + ((int[]) mgcVar.c).length;
                            }
                            if (mgcVar.f(iIntValue3, i)) {
                            }
                            iIntValue3++;
                            break;
                            break;
                        }
                        iArr[i] = iIntValue3;
                    }
                }
                return iArr;
            case 18:
                uv11 uv11Var = (uv11) obj;
                kbc0 kbc0Var = (kbc0) obj2;
                String str11 = uv11Var.a;
                ((mbc0) ((lyc) this).receiver).getClass();
                q6g1 q6g1Var = kbc0Var.a;
                if (q6g1Var.equals(p6g1.a)) {
                    return new tlb1(str11);
                }
                if (q6g1Var.equals(r6g1.a)) {
                    return new inb1(str11);
                }
                if (!(q6g1Var instanceof q6g1)) {
                    eg.o();
                    return null;
                }
                q6g1 q6g1Var2 = q6g1Var;
                bv11 bv11Var = q6g1Var2.b;
                xn70 xn70Var = q6g1Var2.a;
                n4m n4mVarA = bv11Var.a();
                rrt0 rrt0Var = kbc0Var.b;
                n6u n6uVar = kbc0Var.c;
                return new jmb1(uv11Var, bv11Var, xn70Var, (xn70) null, (iix0) null, rrt0Var, new dt11((q1v) null, 3), n4mVarA, n6uVar, kbc0Var.d, n6uVar.equals(j6u.a), true, false, false, (me2) null, (Double) null, false);
            case 19:
                return ((xec0) ((lyc) this).receiver).b((List) obj, (lnm) obj2);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return ((fs21) ((lyc) this).receiver).a((wa71) obj, (lnm) obj2);
            case 21:
                ioj0 ioj0Var = (ioj0) obj2;
                ((yud0) ((lyc) this).receiver).getClass();
                String str12 = ((rud0) obj).a;
                hoj0 hoj0VarC2 = ioj0Var.c(jvd0.class, str12);
                String str13 = (hoj0VarC2 == null || (goj0VarA2 = hoj0VarC2.a()) == null || (jvd0Var = (jvd0) goj0VarA2.a) == null || (gvd0Var = jvd0Var.a) == null) ? null : gvd0Var.f;
                String str14 = str13 != null ? str13 : "";
                hoj0 hoj0VarC3 = ioj0Var.c(jvd0.class, str12);
                goj0 goj0VarA3 = hoj0VarC3 != null ? hoj0VarC3.a() : null;
                if (goj0VarA3 == null) {
                    n57.s("LivestreamEntitySection metadata unavailable.");
                } else {
                    gvd0 gvd0Var2 = ((jvd0) goj0VarA3.a).a;
                    if (gvd0Var2 != null && !gvd0Var2.n) {
                        i3 = 1;
                    }
                }
                return new uud0(str14, i3);
            case 22:
                return ((i1n0) ((lyc) this).receiver).a((o6r0) obj2, (jik1) obj);
            case 23:
                return ((i1n0) ((lyc) this).receiver).a((o6r0) obj2, (jik1) obj);
            case 24:
                return ((i1n0) ((lyc) this).receiver).a((o6r0) obj2, (jik1) obj);
            case 25:
                return ((mie0) ((lyc) this).receiver).a((bst) obj, (lnm) obj2);
            case 26:
                aoe0 aoe0Var = (aoe0) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                oie0 oie0Var = (oie0) ((lyc) this).receiver;
                boe0 boe0Var = oie0Var.g;
                String strValueOf = String.valueOf(aoe0Var.c);
                i8h1 i8h1Var2 = (i8h1) boe0Var.a.get();
                h7l0 h7l0Var = boe0Var.b;
                Integer numValueOf2 = Integer.valueOf(iIntValue5);
                x6h1 x6h1VarC2 = h7l0Var.b.c();
                x6h1VarC2.i.add(new a7h1("suggestion_row", strValueOf, numValueOf2, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA2 = x6h1VarC2.a();
                b7x b7xVar = b7x.a;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), y6h1VarA2, r6h1.c, System.currentTimeMillis()), (xj61) null);
                oie0Var.m(aoe0Var, true);
                return rih1Var;
            case 27:
                ((spj0) ((lyc) this).receiver).b((ps41) obj, ((Boolean) obj2).booleanValue());
                return rih1Var;
            case 28:
                ((ym21) ((lyc) this).receiver).b.put((String) obj, (tv80) obj2);
                return rih1Var;
            default:
                ((ym21) ((lyc) this).receiver).c.put((String) obj, (String) obj2);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4z(zy10 zy10Var) {
        super(2, zy10Var, zy10.class, "runFetchIdTask", "runFetchIdTask(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = (byte) 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4z(b030 b030Var) {
        super(2, b030Var, b030.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0);
        this.a = (byte) 5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4z(l030 l030Var) {
        super(2, l030Var, l030.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0);
        this.a = (byte) 6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4z(hw30 hw30Var) {
        super(2, hw30Var, hw30.class, "handleFilterChipsEvents", "handleFilterChipsEvents(Lcom/spotify/home/funkispage/header/HeaderContainerElement$Events;Lcom/spotify/ubi/model/InteractionId;)V", 0);
        this.a = (byte) 9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4z(lu70 lu70Var) {
        super(2, lu70Var, lu70.class, "mapToStateResult", "mapToStateResult(Lcom/spotify/home/evopage/element/imagelinks/models/ImageLinkCardDataProps;Lcom/spotify/kodiak/dataloader/DataResult;)Lcom/spotify/home/evopage/element/imagelinks/ImageLinkCardDataElement$State;", 0);
        this.a = (byte) 13;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4z(spj0 spj0Var) {
        super(2, spj0Var, spj0.class, "setViewScrolling", "setViewScrolling$src_main_java_com_spotify_performancesdk_androidmetrickeeper_androidmetrickeeper(Lcom/spotify/performancesdk/androidmetrickeeper/ScrollWindow;Z)V", 0);
        this.a = (byte) 27;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c4z(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.a = b;
    }
}
