package p;

import android.content.ClipDescription;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.widget.ImageView;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import com.spotify.base.java.logging.Logger;
import com.spotify.clientrestrictions.v1.RestrictedIntegrationsResponse;
import com.spotify.kidsgraduation.v1.AcknowledgeDeclinedGraduationRequest;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ConflictResolutionStrategy;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.TriggerType;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerQueue;
import com.spotify.scrollsita.v1.NpvScrollResponse;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import spotify.your_library.esperanto.proto.YourLibraryRequest;
import spotify.your_library.esperanto.proto.YourLibraryRequestHeader;
import spotify.your_library.proto.YourLibraryConfig;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jl00 implements qiw, Function, s891, Predicate, hj71, ya {
    public final /* synthetic */ byte a;
    public final Object b;

    public jl00(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = (byte) 19;
        if (Build.VERSION.SDK_INT >= 25) {
            this.b = new hi80(uri, clipDescription, uri2);
        } else {
            this.b = new st60((Object) uri, (Object) clipDescription, (Object) uri2, (byte) 15);
        }
    }

    public ArrayList a(String str) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) ((ConcurrentHashMap) this.b).get(str);
        if (concurrentHashMap == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(concurrentHashMap.size());
        Iterator it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((k440) ((Map.Entry) it.next()).getValue());
        }
        return arrayList;
    }

    public boolean accept(Object obj) {
        return ((qp4) this.b).a();
    }

    public Object apply(Object obj) {
        pwt qwtVar;
        pwt pwtVar;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 2:
                RestrictedIntegrationsResponse restrictedIntegrationsResponse = (RestrictedIntegrationsResponse) obj;
                if (restrictedIntegrationsResponse.q()) {
                    return new aqc(true, restrictedIntegrationsResponse);
                }
                u031 builder = ((p031) ((s031) obj2)).a.toBuilder();
                builder.n(restrictedIntegrationsResponse.n());
                RestrictedIntegrationsResponse restrictedIntegrationsResponseBuild = builder.build();
                restrictedIntegrationsResponseBuild.getClass();
                return new aqc(true, restrictedIntegrationsResponseBuild);
            case 3:
                return yoi1.h(((lkd) obj2).c((ContextTrack) obj), o6x.a);
            case 4:
                return new mmr0((ContextTrack) obj2, (NpvScrollResponse) obj);
            case 5:
                vk20 vk20Var = (vk20) obj2;
                if (((Boolean) obj).booleanValue()) {
                    return Single.just(Boolean.FALSE);
                }
                mwm1 mwm1Var = vk20Var.b;
                gvm1 gvm1VarO = YourLibraryRequest.o();
                gvm1VarO.t(100);
                hvm1 hvm1VarQ = YourLibraryRequestHeader.q();
                jsm1 jsm1VarR = YourLibraryConfig.YourLibraryFilters.r();
                jsm1VarR.q(ksm1.d);
                jsm1VarR.q(ksm1.t);
                hvm1VarQ.u(jsm1VarR.build());
                hvm1VarQ.C(1);
                hvm1VarQ.G(0);
                gvm1VarO.q(hvm1VarQ.build());
                return mwm1Var.b(gvm1VarO.build()).map(yb10.c).first(Boolean.TRUE).map(new il00(vk20Var, (byte) 4));
            case 8:
                return ljg.c(((ml30) obj2).d, "reinvent-free:free-employee-day-release:v1", (TriggerType) null, (String) null, (List) null, (tv80) null, (uy31) null, (DynamicTagsMetadata) null, (ConflictResolutionStrategy) null, (d3j0) null, 510).ignoreElement();
            case 11:
                xmg0 xmg0Var = (ymg0) obj;
                if (!(xmg0Var instanceof xmg0)) {
                    if (xmg0Var instanceof wmg0) {
                        return new zb20(((wmg0) xmg0Var).a);
                    }
                    eg.o();
                    return null;
                }
                umg0 umg0Var = xmg0Var.a;
                dk40 dk40Var = (gk40) obj2;
                String str = dk40Var.f;
                String str2 = dk40Var.e;
                String str3 = dk40Var.d;
                String str4 = dk40Var.b;
                soa1 soa1Var = umg0Var.b;
                eb10 eb10Var = umg0Var.d;
                bpa1 bpa1Var = umg0Var.a;
                lz3 lz3Var = umg0Var.g;
                String str5 = umg0Var.f;
                ovt ovtVar = umg0Var.e;
                ovt ovtVar2 = ovt.b;
                if (ovtVar != ovtVar2 || str5 == null || lz3Var == null) {
                    if (ovtVar == ovtVar2 && str5 == null && lz3Var == null) {
                        n57.e("[Puffin] Incorrect state - should never get ambiguous device without name or type");
                    }
                    kb10 kb10Var = umg0Var.c;
                    if (bpa1Var == null) {
                        qwtVar = new swt(new le20(new fb10(kb10Var.c, kb10Var.d, kb10Var.a, bwp0.p(kb10Var.b)), new za10(eb10Var.c, eb10Var.d, eb10Var.a, bwp0.p(eb10Var.b)), (woa1) null, new noa1(soa1Var.c, soa1Var.d, soa1Var.a, bwp0.p(soa1Var.b))), new bnv0(str4, str3, str2, str));
                    } else {
                        qwtVar = new qwt(new le20(new fb10(kb10Var.c, kb10Var.d, kb10Var.a, bwp0.p(kb10Var.b)), new za10(eb10Var.c, eb10Var.d, eb10Var.a, bwp0.p(eb10Var.b)), new woa1(bpa1Var.a, bwp0.p(bpa1Var.e), bpa1Var.b, bpa1Var.c, bpa1Var.d, bpa1Var.f, bpa1Var.g), new noa1(soa1Var.c, soa1Var.d, soa1Var.a, bwp0.p(soa1Var.b))), new bnv0(str4, str3, str2, str));
                    }
                    pwtVar = qwtVar;
                } else {
                    pwtVar = new pwt(new bnv0(str4, str3, str2, str), str5, lz3Var == lz3.b);
                }
                return new ac20(pwtVar);
            case 13:
                my myVarN = AcknowledgeDeclinedGraduationRequest.n();
                myVarN.n();
                AcknowledgeDeclinedGraduationRequest acknowledgeDeclinedGraduationRequest = (AcknowledgeDeclinedGraduationRequest) myVarN.build();
                g0b0 g0b0Var = ((f0b0) obj2).a;
                acknowledgeDeclinedGraduationRequest.getClass();
                return g0b0Var.a(acknowledgeDeclinedGraduationRequest).d(Observable.just(j000.a)).onErrorReturn(mi10.e);
            case 14:
                PlayerQueue playerQueue = (PlayerQueue) obj;
                ArrayList arrayListN0 = o7h.N0(p7h.N(playerQueue.track().c() ? (ContextTrack) playerQueue.track().b() : null), playerQueue.nextTracks());
                ArrayList arrayList = new ArrayList(q7h.U(arrayListN0, 10));
                Iterator it = arrayListN0.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ContextTrack) it.next()).uri());
                }
                return new il51(arrayList, ((Context) ((ro30) obj2).c).getResources().getString(2131952495), 8186);
            case 16:
                return new wt60(((zs60) obj2).b, rs60.b);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                if (((Boolean) obj).booleanValue()) {
                    return ((rj70) obj2).h.e;
                }
                Observable observableEmpty = Observable.empty();
                observableEmpty.getClass();
                return observableEmpty;
            case 25:
                voc0 voc0Var = (voc0) obj;
                return ((Observable) ((epc0) ((g2z) obj2).c).invoke(voc0Var)).flatMap(new il00(voc0Var, (byte) 24));
            default:
                lbu0 lbu0Var = (lbu0) ((hod0) obj2).b;
                return lbu0Var.e.a(lbu0Var.f).a().a(new d9u0("listening-parties", true)).ignoreElement().o(Functions.h).w();
        }
    }

    public void b() {
        ur00 ur00Var = (ur00) this.b;
        if (((String) ur00Var.e) != null) {
            ur00Var.e = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public Object c(String str, String str2, onm onmVar) {
        cv00 cv00Var;
        Exception exc;
        if (onmVar instanceof cv00) {
            cv00Var = (cv00) onmVar;
            int i = cv00Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                cv00Var.d = i - Integer.MIN_VALUE;
            } else {
                cv00Var = new cv00(this, onmVar);
            }
        } else {
            cv00Var = new cv00(this, onmVar);
        }
        Object objO = cv00Var.b;
        int i2 = cv00Var.d;
        lnm lnmVar = null;
        try {
            if (i2 == 0) {
                hm5.M(objO);
                try {
                    try {
                        l2w l2wVar = new l2w((Object) this, (Object) str2, (Object) str, lnmVar, (byte) 17);
                        cv00Var.a = str;
                        cv00Var.d = 1;
                        objO = rc2.O(5000L, l2wVar, cv00Var);
                        d9n d9nVar = d9n.a;
                        if (objO == d9nVar) {
                            return d9nVar;
                        }
                        str = str;
                    } catch (Exception e) {
                        exc = e;
                        str = str;
                        Logger.k("ExtendedMetadataCurationTraitSource", new Object[]{l1d.m("Failed to resolve curation trait for ", str), exc});
                        return null;
                    }
                } catch (Exception e2) {
                    e = e2;
                    exc = e;
                    Logger.k("ExtendedMetadataCurationTraitSource", new Object[]{l1d.m("Failed to resolve curation trait for ", str), exc});
                    return null;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = cv00Var.a;
                try {
                    hm5.M(objO);
                } catch (Exception e3) {
                    e = e3;
                    exc = e;
                    Logger.k("ExtendedMetadataCurationTraitSource", new Object[]{l1d.m("Failed to resolve curation trait for ", str), exc});
                    return null;
                }
            }
            uv00 uv00Var = (uv00) objO;
            if (uv00Var == null) {
                Logger.k("ExtendedMetadataCurationTraitSource", new Object[]{"Timed out resolving curation trait for " + str});
            }
            if (uv00Var != null) {
                return uv00Var.a(uio.class, str).b;
            }
            return null;
        } catch (CancellationException e4) {
            throw e4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(String str, onm onmVar) {
        w230 w230Var;
        if (onmVar instanceof w230) {
            w230Var = (w230) onmVar;
            int i = w230Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                w230Var.c = i - Integer.MIN_VALUE;
            } else {
                w230Var = new w230(this, onmVar);
            }
        } else {
            w230Var = new w230(this, onmVar);
        }
        Object objJ = w230Var.a;
        int i2 = w230Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            Single map = g7h.b((g7h) this.b, str, new String[]{str}).map(new k9p1(str, (byte) 12));
            w230Var.c = 1;
            objJ = fc11.j(map, w230Var);
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
        return objJ;
    }

    public void e(String str, ArrayList arrayList) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            k440 k440Var = (k440) it.next();
            concurrentHashMap.put(k440Var.a, k440Var);
        }
        ((ConcurrentHashMap) this.b).put(str, concurrentHashMap);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object n(k371 k371Var, lnm lnmVar) {
        yf60 yf60Var;
        cmt cmtVar;
        cmt cmtVar2;
        if (lnmVar instanceof yf60) {
            yf60Var = (yf60) lnmVar;
            int i = yf60Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                yf60Var.d = i - Integer.MIN_VALUE;
            } else {
                yf60Var = new yf60(this, (onm) lnmVar);
            }
        } else {
            yf60Var = new yf60(this, (onm) lnmVar);
        }
        Object objY = yf60Var.b;
        int i2 = yf60Var.d;
        lnm lnmVar2 = null;
        if (i2 == 0) {
            hm5.M(objY);
            vf60 vf60Var = (vf60) jhc1.t(k371Var.b, "highlightsstats.share.loader_params", vf60.class);
            if (vf60Var == null || (cmtVar = (cmt) jhc1.t(k371Var.b, "highlightsstats.share.destination_list_configuration", cmt.class)) == null) {
                return null;
            }
            zsc zscVar = (zsc) this.b;
            yf60Var.a = cmtVar;
            yf60Var.d = 1;
            objY = fn31.Y((q8n) zscVar.e, new xtz(zscVar, vf60Var, lnmVar2, (byte) 11), yf60Var);
            d9n d9nVar = d9n.a;
            if (objY == d9nVar) {
                return d9nVar;
            }
            cmtVar2 = cmtVar;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cmtVar2 = yf60Var.a;
            hm5.M(objY);
        }
        return new qj71((List) objY, 0, new quk(new va71(cmtVar2)));
    }

    public boolean test(Object obj) {
        v231 v231Var = (j331) obj;
        usw0 usw0Var = (vsw0) this.b;
        if (!(v231Var instanceof v231)) {
            return true;
        }
        Iterable iterable = (Iterable) v231Var.a;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((uuy0) it.next()).c.containsAll(usw0Var.a())) {
                    return true;
                }
            }
        }
        if (!(usw0Var instanceof usw0)) {
            return false;
        }
        usw0 usw0Var2 = usw0Var;
        if (usw0Var2.e == nf21.d) {
            return true;
        }
        List list = usw0Var2.c;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            gtw0 gtw0Var = ((qnc1) it2.next()).c;
            if ((gtw0Var != null ? gtw0Var.b : null) == ioc1.d) {
                return true;
            }
        }
        return false;
    }

    public void v(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                Set set = (Set) obj;
                set.getClass();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : set) {
                    if (nhc1.Y((String) obj3, "spotify:episode", false)) {
                        arrayList.add(obj3);
                    }
                }
                ((ll00) obj2).a.d(o7h.p1(arrayList));
                break;
            default:
                qbn qbnVar = (qbn) obj;
                kqd0 kqd0Var = (kqd0) obj2;
                gw70 gw70Var = kqd0Var.c;
                ImageView imageView = kqd0Var.Y;
                ixg ixgVar = kqd0Var.P0;
                if (ixgVar != null) {
                    ixgVar.c();
                }
                kqd0Var.P0 = null;
                String str = qbnVar.a;
                if (str == null) {
                    gw70Var.d(imageView);
                    imageView.setVisibility(8);
                } else {
                    imageView.setVisibility(0);
                    ixg ixgVarF = gw70Var.f(str);
                    ixgVarF.l(2131230929);
                    ixgVarF.g = false;
                    kqd0Var.P0 = ixgVarF;
                    ixgVarF.j(new jqd0(kqd0Var, ixgVarF, qbnVar.b, (byte) 0));
                }
                break;
        }
    }

    public /* synthetic */ jl00(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ jl00(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.b = obj2;
    }

    public jl00(xvo xvoVar) {
        this.a = (byte) 26;
        this.b = new mnc0(rqt0.u(yoi1.g(xvoVar.a(false))), (byte) 8);
    }

    public jl00() {
        this.a = (byte) 10;
        this.b = new ConcurrentHashMap();
    }

    public jl00(g4r g4rVar) {
        this.a = (byte) 7;
        this.b = g4rVar.m(CaptureSessionOnClosedNotCalledQuirk.class);
    }

    public /* synthetic */ jl00(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
