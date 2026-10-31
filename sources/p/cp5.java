package p;

import android.content.Context;
import android.net.Uri;
import android.view.Window;
import androidx.car.app.navigation.model.Maneuver;
import androidx.media3.session.legacy.MediaConstants;
import com.comscore.streaming.WindowState;
import com.spotify.allboarding.entrypoint.EntryPoint;
import com.spotify.allboarding.model.v2.proto.OnboardingResponse;
import com.spotify.authentication.login5esperanto.EsCodeRequired;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cp5 implements Function, Function3, SingleOnSubscribe, oti0 {
    public static final /* synthetic */ int c = 0;
    public final /* synthetic */ byte a;
    public Object b;

    public cp5() {
        this.a = (byte) 16;
        this.b = null;
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            this.b = keyStore;
            keyStore.load(null);
        } catch (IOException | GeneralSecurityException e) {
            bhn0.p(e);
            throw null;
        }
    }

    public void a(char c2) {
        if (c2 <= 127) {
            ((BitSet) this.b).set(c2);
        } else {
            hhg1.n("Can only match ASCII characters");
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 1:
                hi hiVar = (hi) this.b;
                uj ujVar = (ej) obj;
                if (ujVar.e != null) {
                    CompletableEmpty completableEmpty = CompletableEmpty.a;
                    completableEmpty.getClass();
                    return completableEmpty;
                }
                Completable completableFlatMapCompletable = ujVar.a.c(new gjo0(new tj(ujVar, hiVar), new a42(ujVar, (byte) 2))).observeOn(ujVar.b).flatMapCompletable(new gid(ujVar, hiVar, (byte) 4));
                completableFlatMapCompletable.getClass();
                return completableFlatMapCompletable;
            case 2:
                th61 th61Var = (th61) obj;
                boolean z = th61Var.b;
                pq pqVar = (pq) this.b;
                if (z) {
                    pqVar.g = th61Var.a;
                    pqVar.h = false;
                    return CompletableEmpty.a;
                }
                if (fyo1.j(th61Var.f)) {
                    CompletableEmpty completableEmpty2 = CompletableEmpty.a;
                    completableEmpty2.getClass();
                    return completableEmpty2;
                }
                Completable completableFlatMapCompletable2 = ((wbd1) pqVar.c.get()).b.firstOrError().flatMapCompletable(new a42(pqVar, (byte) 3));
                completableFlatMapCompletable2.getClass();
                return completableFlatMapCompletable2.o(Functions.h);
            case 5:
                return ((qw0) this.b).b.a((q9u0) obj).ignoreElement();
            case 7:
                yw41 yw41Var = (yw41) obj;
                return ((oj3) ((bk1) this.b).b).c(yw41Var.b, yw41Var.c, "", yw41Var.d, new gj3(27, yw41Var.e)).ignoreElement();
            case 8:
                return ((qns0) this.b).b("creativeworkplatform_permission", ((qc2) obj).d, false).map(drm0.d).onErrorReturn(cq41.d).toObservable();
            case 9:
                bh90 bh90Var = (bh90) obj;
                String str = bh90Var.b;
                List list = bh90Var.f;
                Set set = (Set) this.b;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!set.contains((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                return new d93(str, arrayList);
            case 11:
                return new e331(ryn1.w((OnboardingResponse) obj, (EntryPoint) this.b));
            case 21:
                return ((tc6) this.b).a((nc6) obj);
            case 26:
                ((Function0) this.b).invoke();
                EsCodeRequired.CodeRequiredResendError codeRequiredResendErrorN = ((EsCodeRequired.CodeRequiredResendResult) obj).n();
                Integer numValueOf = Integer.valueOf(WindowState.NORMAL);
                return xf8.b[codeRequiredResendErrorN.o().ordinal()] == 1 ? new u341(new ug8(numValueOf, "Esperanto failure: unknown context")) : new u341(new ug8(numValueOf, "Esperanto failure: incomplete response"));
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                f7h f7hVar = (f7h) ((Map) obj).get(((pn8) this.b).a);
                return Boolean.valueOf(f7hVar != null ? f7hVar.a : false);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                jm70 jm70Var = (jm70) obj;
                return jm70Var instanceof hm70 ? Single.timer(1L, TimeUnit.SECONDS).flatMap(new uq8((km3) this.b, (byte) 0)) : Single.just(jm70Var);
            default:
                return (n3a) ((j141) ((ic9) this.b).c).invoke((a120) obj);
        }
    }

    public void b(msi0 msi0Var, boolean z) {
        ((yj5) this.b).q(msi0Var);
    }

    public vu30 c() {
        return (k2) this.b;
    }

    public vb8 d(lby lbyVar, v68 v68Var, boolean z, d8r0 d8r0Var, String str, List list) {
        String str2 = lbyVar.a;
        String str3 = lbyVar.b;
        String strG = tb51.g((tb51) this.b, lbyVar);
        String str4 = lbyVar.c;
        boolean z2 = v68Var.b;
        return new vb8(str2, str3, strG, str4, z2 ? 2 : 3, z && z2, str, d8r0Var, v68Var.g instanceof r68, list);
    }

    public void e(char c2, char c3) {
        while (c2 <= c3) {
            a(c2);
            c2 = (char) (c2 + 1);
        }
    }

    public boolean g(msi0 msi0Var) {
        Window.Callback callback = ((yj5) this.b).Y.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, msi0Var);
        return true;
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        uut0 uut0Var = (uut0) obj3;
        f74 f74Var = (f74) this.b;
        smc0 smc0VarN = k4p1.n();
        dn3 dn3Var = f74Var.a;
        List list = ((z310) obj2).a;
        int i = 0;
        smc0VarN.add(dn3.c(dn3Var, (Map) obj, list, false, 12));
        p710 p710Var = new p710(30, (Integer) null, "YOUR_DOWNLOADS", (String) null, (String) null, (String) null);
        ArrayList arrayList = new ArrayList();
        if (uut0Var.a != 1) {
            o3e0 o3e0Var = f74Var.f;
            String str = uut0Var.d;
            Uri uri = Uri.EMPTY;
            arrayList.add(new u310(str, (String) null, uut0Var.b, ((Context) o3e0Var.d).getString(2131960003), ((aai0) o3e0Var.b).g(uut0Var.c), (Uri) null, uri, uri, uri, (Uri) null, (Uri) null, 2, false, false, false, false, 3, 4, (Double) null, (Integer) null, (Integer) null, false, (String) null, (String) null, (Integer) null, 0, (y310) null, (String) null, (Long) null, (String) null, (Map) null, (String) null, (String) null, (oz0) null, 1073741856, 12));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj4 : list) {
            upp0 upp0Var = f74Var.g;
            String str2 = ((u310) obj4).a;
            upp0Var.getClass();
            if (!upp0.b(str2)) {
                arrayList2.add(obj4);
            }
        }
        arrayList.addAll(arrayList2);
        ArrayList arrayList3 = new ArrayList(q7h.U(arrayList, 10));
        for (Object obj5 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            u310 u310Var = (u310) obj5;
            p710 p710Var2 = new p710(18, Integer.valueOf(i), "ITEM", (String) null, u310Var.a, (String) null);
            Map mapJ = sqg0.J(new mmr0[]{new mmr0(MediaConstants.DESCRIPTION_EXTRAS_KEY_CONTENT_STYLE_PLAYABLE, 1), new mmr0(MediaConstants.DESCRIPTION_EXTRAS_KEY_CONTENT_STYLE_BROWSABLE, 1), new mmr0(MediaConstants.DESCRIPTION_EXTRAS_KEY_CONTENT_STYLE_SINGLE_ITEM, 2)});
            y310 y310Var = new y310(p7h.M(new p710[]{p710Var, p710Var2}));
            String string = f74Var.b.getString(2131952353);
            xkg0 xkg0Var = new xkg0();
            xkg0Var.putAll(u310Var.A);
            xkg0Var.putAll(mapJ);
            arrayList3.add(u310.b(u310Var, (String) null, (String) null, (Uri) null, 0, (Double) null, (String) null, 0, y310Var, string, xkg0Var.b(), (Uri) null, (q510) null, -1279262721, 15));
            i = i2;
        }
        smc0VarN.addAll(arrayList3);
        return new z310(k4p1.k(smc0VarN), (f410) null, (m510) null, (String) null);
    }

    public void subscribe(SingleEmitter singleEmitter) {
        byte b = 17;
        switch (this.a) {
            case 14:
                hb4 hb4Var = (hb4) this.b;
                luk lukVar = hb4Var.t;
                if (lukVar == null || !lukVar.i("android-connectivity.short_circuit_all_offline_states")) {
                    lukVar = hb4Var.u;
                }
                if (lukVar != null) {
                    lukVar.e(new p54(singleEmitter, hb4Var, (byte) 3));
                }
                break;
            case 15:
                ek4 ek4Var = (ek4) this.b;
                byte b2 = 15;
                singleEmitter.onSuccess(new ck4(((Boolean) Single.create(new bv40(ek4Var, b2)).blockingGet()).booleanValue(), ((Boolean) Single.create(new kr60(ek4Var, b2)).blockingGet()).booleanValue(), ((Boolean) Single.create(new x6o0(ek4Var, (byte) 18)).blockingGet()).booleanValue(), ((Boolean) Single.create(new t7o0(ek4Var, b)).blockingGet()).booleanValue(), ((Boolean) Single.create(new ymm0(ek4Var, (byte) 16)).blockingGet()).booleanValue()));
                break;
            case 16:
            default:
                m26 m26Var = (m26) this.b;
                luk lukVar2 = m26Var.r;
                if (lukVar2 == null || !lukVar2.i("apps-music-libs-eventsender.max_batch_size")) {
                    lukVar2 = m26Var.s;
                }
                if (lukVar2 != null) {
                    lukVar2.e(new e44(singleEmitter, m26Var, (byte) 4));
                }
                break;
            case 17:
                at4 at4Var = (at4) this.b;
                singleEmitter.onSuccess(new zs4(((Boolean) Single.create(new bv40(at4Var, b)).blockingGet()).booleanValue(), ((Boolean) Single.create(new kr60(at4Var, b)).blockingGet()).booleanValue()));
                break;
            case 18:
                t15 t15Var = (t15) this.b;
                luk lukVar3 = t15Var.b;
                if (lukVar3 == null || !lukVar3.i("android-shuffle-settings-algorithm.settings_item_visible")) {
                    lukVar3 = t15Var.c;
                }
                if (lukVar3 != null) {
                    lukVar3.e(new p54(singleEmitter, t15Var, (byte) 9));
                }
                break;
        }
    }

    public /* synthetic */ cp5(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public cp5(Function0 function0, fg8 fg8Var) {
        this.a = (byte) 26;
        this.b = function0;
    }

    public cp5(iyc0 iyc0Var) {
        this.a = (byte) 3;
        this.b = new k2(this, (lnm) null, (byte) 2);
    }
}
