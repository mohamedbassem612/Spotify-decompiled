package p;

import android.content.Intent;
import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.base.java.logging.Logger;
import com.spotify.checkout.proto.model.v1.proto.GetCheckoutPageRequest;
import com.spotify.checkout.proto.model.v1.proto.TrackingData;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.TriggerType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.InAppMessage;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.MessageParsingException;
import com.spotify.pendragon.v1.proto.FetchMessageResponse;
import com.spotify.premiumdestinationbadge.v1.BadgeRequest;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function4;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeToSingle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import spotify.your_library.esperanto.proto.IsCuratedResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mp8 implements Function, Predicate, BiFunction, io20, Function4, xi7, SingleOnSubscribe {
    public final /* synthetic */ byte a;
    public Object b;

    public mp8(CameraDevice cameraDevice, Handler handler) {
        this.a = (byte) 10;
        if (Build.VERSION.SDK_INT < 28) {
            this.b = new it8(cameraDevice, new g3d(handler));
        } else {
            cameraDevice.getClass();
            this.b = new f3d(cameraDevice, (g3d) null);
        }
    }

    public Object N(Object obj, Object obj2, Object obj3, Object obj4) {
        mmr0 mmr0Var = (mmr0) obj;
        String str = (String) obj2;
        boolean zBooleanValue = ((Boolean) mmr0Var.a).booleanValue();
        String str2 = (String) mmr0Var.b;
        str2.getClass();
        return new mnd(zBooleanValue, str2, str, (hpc1) ((Optional) obj3).orElse(null), ((pnd) this.b).d.f, ((Boolean) obj4).booleanValue());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(daw dawVar, onm onmVar) {
        bkn bknVar;
        nyz m231Var;
        tv80 tv80Var;
        String str;
        if (onmVar instanceof bkn) {
            bknVar = (bkn) onmVar;
            int i = bknVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                bknVar.e = i - Integer.MIN_VALUE;
            } else {
                bknVar = new bkn(this, onmVar);
            }
        } else {
            bknVar = new bkn(this, onmVar);
        }
        Object obj = bknVar.c;
        int i2 = bknVar.e;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                String str2 = dawVar.a;
                tv80 tv80Var2 = dawVar.b;
                rgy rgyVar = (rgy) this.b;
                bknVar.a = str2;
                bknVar.b = tv80Var2;
                bknVar.e = 1;
                Object objA = rgyVar.a(str2, bknVar);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
                obj = objA;
                tv80Var = tv80Var2;
                str = str2;
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tv80Var = bknVar.b;
                str = bknVar.a;
                hm5.M(obj);
            }
            m231Var = new nyz(str, (String) obj, tv80Var);
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null) {
            Logger.e(thA, "Failed to create entity", new Object[0]);
        }
        return m231Var instanceof m231 ? oyz.a : m231Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.MessageParsingException */
    public Object apply(Object obj) throws MessageParsingException {
        byte b = 15;
        byte b2 = 2;
        switch (this.a) {
            case 0:
                Throwable th = (Throwable) obj;
                Logger.d("Error when authorizing client %s %s", new Object[]{((wq8) this.b).a, th});
                return new dr8(nhz.Y, l1d.m("Error when authorizing: ", th.getMessage()), null);
            case 2:
                String str = (String) ((Map) obj).get("country_code");
                if (str == null) {
                    return MaybeEmpty.a;
                }
                g2a g2aVarN = BadgeRequest.n();
                g2aVarN.n(str);
                BadgeRequest badgeRequestBuild = g2aVarN.build();
                t1a t1aVar = (t1a) this.b;
                badgeRequestBuild.getClass();
                return t1aVar.a(badgeRequestBuild).map(rbc.Z).toMaybe();
            case 5:
                kva0 kva0Var = (kva0) obj;
                int iC = l1d.C(((iwa) this.b).b.c(kva0Var.b, kva0Var.d, kva0Var.c));
                if (iC == 0) {
                    b2 = 3;
                } else if (iC != 1 && iC != 2) {
                    eg.o();
                    return null;
                }
                return Observable.just(new nva0(b2));
            case 9:
                ulc ulcVar = ((mlc) this.b).a;
                String strP = ulc.p();
                nlc nlcVar = (plc) obj;
                String str2 = nlcVar.a;
                return new gmc(strP, str2, TriggerType.URI, str2, (tv80) null, (uy31) null, new DynamicTagsMetadata(nlcVar.a, (String) null, (String) null, (String) null, 14, (DefaultConstructorMarker) null), new d3j0(new z2j0(false), x2j0.a), 368);
            case 13:
                Map map = (Map) obj;
                ((kvd) this.b).b = fsd.a;
                return map;
            case 14:
                spq0 spq0Var = (spq0) obj;
                if (!spq0Var.c()) {
                    Observable observableJust = Observable.just(e5e.a);
                    observableJust.getClass();
                    return observableJust;
                }
                String str3 = (String) spq0Var.b();
                fno0 fno0Var = (fno0) this.b;
                str3.getClass();
                List list = fno0Var.d;
                Observable observable = new MaybeToSingle((list != null ? Single.just(list) : fno0Var.a.a().map(si10.R0).doOnSuccess(new lrj0(fno0Var, (byte) 15))).flatMapMaybe(new njp1(str3, (byte) 11)).f(new mcn1(str3, (byte) 2)), i5e.a).toObservable();
                observable.getClass();
                return observable;
            case 17:
                f6g f6gVar = (f6g) obj;
                s6g s6gVar = (s6g) this.b;
                t6g t6gVar = s6gVar.b;
                kl40 kl40VarO = GetCheckoutPageRequest.o();
                v5g v5gVar = s6gVar.c;
                kl40VarO.n(v5gVar.b);
                c3g1 c3g1VarN = TrackingData.n();
                String str4 = v5gVar.c;
                if (str4 != null) {
                    c3g1VarN.q(str4);
                }
                c3g1VarN.r(v5gVar.a.a);
                c3g1VarN.n(s6gVar.g);
                kl40VarO.s(c3g1VarN.build());
                String str5 = f6gVar.b;
                if (str5 != null) {
                    kl40VarO.q(str5);
                }
                kl40VarO.r(f6gVar.a ? b3d1.SUPPORTED : b3d1.UNSUPPORTED);
                return t6gVar.c(kl40VarO.build()).compose(new dn81((byte) 2)).map(new jc9(s6gVar, b)).onErrorReturn(wcp1.O0);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                FetchMessageResponse fetchMessageResponse = (FetchMessageResponse) obj;
                lag lagVar = (lag) this.b;
                if (!fetchMessageResponse.p()) {
                    return new com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.network.FetchMessageResponse((InAppMessage) null);
                }
                try {
                    return new com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.network.FetchMessageResponse((InAppMessage) ((ffr) lagVar.c).invoke(fetchMessageResponse.o()));
                } catch (MessageParsingException e) {
                    lagVar.o(fetchMessageResponse.o(), e);
                    throw e;
                }
            case 20:
                t8r0 t8r0Var = ((z0h) this.b).c;
                return j2h1.D((q8n) t8r0Var.b, new xht0(t8r0Var, ((q0h) obj).a.a, null, (byte) 1));
            case 21:
                return u9c.t((IsCuratedResponse) obj, ((d7h) this.b).b, (Map) null);
            default:
                ArrayList arrayList = (ArrayList) obj;
                bxh bxhVar = (bxh) this.b;
                if (arrayList.isEmpty()) {
                    return Observable.just(z6x.a);
                }
                return bxhVar.b.b(new oi("companion-content-loader", false, new ib5(arrayList, (byte) 9))).filter(pbo1.P0).map(new jc9((Object) arrayList, (byte) 22)).doOnNext(new yrh(bxhVar, b2));
        }
    }

    public Object b() {
        return Integer.valueOf(((dhb) ((kly0) this.b).get()).v());
    }

    public Single c() {
        return ((oi) this.b).I();
    }

    public boolean d(String str, wls0 wls0Var) {
        le30 le30VarA;
        return (str == null || str.length() == 0 || (le30VarA = ((me30) this.b).a(str)) == le30.S0 || le30VarA == le30.T0 || wls0Var.a()) ? false : true;
    }

    public void e(String str, String str2, tv80 tv80Var) {
        ((vu30) this.b).invoke(gvg.h("spotify:audiobook:chapter-playback-confirmation:", ihc1.V0(str, ':', str), ":", ihc1.V0(str2, ':', str2)), tv80Var);
    }

    public Single l(Intent intent, th61 th61Var) {
        switch (this.a) {
            case 16:
                baf bafVar = (baf) this.b;
                return rqt0.F(bafVar.c, new hsc(bafVar, th61Var, null, (byte) 15)).onErrorReturn(bbn.O0).observeOn(bafVar.a);
            default:
                acr0 acr0Var = (acr0) this.b;
                Class clsB = acr0Var.b();
                Set set = s4b1.f;
                return Single.just(new hrn0(clsB, acr0Var.c(intent, uic.x(intent.getDataString()), th61Var), acr0Var.d()));
        }
    }

    public void subscribe(SingleEmitter singleEmitter) {
        ixg ixgVar = (ixg) this.b;
        vy70 vy70Var = ixgVar.b;
        boolean z = ixgVar.g;
        jc10 jc10Var = dz70.a;
        vy70Var.b().a(dz70.f, Boolean.valueOf(z));
        vy70Var.e = new dxg(singleEmitter);
        vy70Var.d = new exg(singleEmitter);
        ixgVar.d = ixgVar.a.a(vy70Var.a());
    }

    public boolean test(Object obj) {
        return ((List) obj).size() == ((Number) ((af9) this.b).c.e.b()).intValue();
    }

    public /* synthetic */ mp8(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public mp8(u9c u9cVar, d7h d7hVar) {
        this.a = (byte) 21;
        this.b = d7hVar;
    }

    public Object apply(Object obj, Object obj2) {
        return new xjb0(((jz10) this.b).c.b.a, (j331) obj, (j331) obj2);
    }
}
