package p;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import androidx.car.app.model.Alert;
import androidx.car.app.navigation.model.Maneuver;
import androidx.media3.session.legacy.MediaConstants;
import com.spotify.allboarding.entrypoint.EntryPoint;
import com.spotify.allboarding.model.v2.proto.OnboardingResponse;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.ErrorType;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.PlayAsNextInQueueCommand;
import com.spotify.playlist.ai.creation.v2.GetPusherMessageResponse;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableNever;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeFlatMapCompletable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bv40 implements Function, oti0, ObservableOnSubscribe, Function3, k2r, SingleOnSubscribe, vq8, Predicate {
    public static volatile bv40 c;
    public final /* synthetic */ byte a;
    public final Object b;

    public bv40(byte b) {
        this.a = b;
        switch (b) {
            case 24:
                this.b = new vbx0((byte) 29);
                break;
            default:
                this.b = new HashSet();
                break;
        }
    }

    public static cp5 i() {
        return new cp5((Object) new BitSet(), (byte) 22);
    }

    public spq0 a(Uri uri, br8 br8Var) {
        return j5.a;
    }

    public Object apply(Object obj) {
        Single singleJust;
        ou80 ou80Var;
        String strUri;
        byte b = this.a;
        String str = null;
        byte b2 = 1;
        Object obj2 = this.b;
        switch (b) {
            case 1:
                hi hiVar = (hi) obj;
                hiVar.toString();
                wj wjVar = ((yj) obj2).b;
                if (Build.VERSION.SDK_INT >= 31) {
                    singleJust = wjVar.b.h();
                } else {
                    wjVar.getClass();
                    singleJust = Single.just(p4o0.a);
                    singleJust.getClass();
                }
                return new MaybeFlatMapCompletable(singleJust.flatMapMaybe(new oj80(wjVar, hiVar, (byte) 4)), new cp5(hiVar, b2));
            case 2:
                Flowable flowable = ((pq) obj2).a;
                return x0d.j(flowable, flowable);
            case 5:
                return ((tw0) obj2).b.a((q9u0) obj).ignoreElement();
            case 6:
                return ((tj1) obj2).c.z(jvx0.a).e(Single.error((Throwable) obj));
            case 7:
                zw41 zw41Var = (zw41) obj;
                qn1 qn1Var = (qn1) obj2;
                aas aasVar = (aas) qn1Var.b;
                String str2 = zw41Var.b;
                y6r0 y6r0Var = ((b7r0) qn1Var.c).get();
                String str3 = y6r0Var != null ? y6r0Var.a : null;
                if (str3 == null) {
                    str3 = "";
                }
                tv80 tv80Var = zw41Var.c;
                if (tv80Var != null && (ou80Var = tv80Var.a) != null) {
                    str = ou80Var.a;
                }
                return aasVar.b(str2, str3, 2, str != null ? str : "").w().onErrorResumeNext(rbc.e);
            case 8:
                q42 q42Var = (q42) obj;
                return ((sav) ((rjn) ((u961) obj2).a).b).a(new vav(q42Var.a, q42Var.b)).map(uml1.V0).onErrorReturn(pbo1.U0).map(bya0.e);
            case 10:
                GetPusherMessageResponse getPusherMessageResponse = (GetPusherMessageResponse) obj;
                return ((j23) obj2).f(new d23(getPusherMessageResponse.getMessageId(), getPusherMessageResponse.getStatus(), getPusherMessageResponse.hasPlaylist() ? getPusherMessageResponse.getPlaylist() : null, getPusherMessageResponse.getSubmitTimestamp(), getPusherMessageResponse.getUpdatedTimestamp(), new svi0(o7h.j1(getPusherMessageResponse.getMessagePreferences().getExcludedUrisList()), o7h.j1(getPusherMessageResponse.getMessagePreferences().getIncludedUrisList()))), Observable.empty());
            case 12:
                return new e331(ryn1.w((OnboardingResponse) obj, (EntryPoint) obj2));
            case 16:
                PlayerState playerState = (PlayerState) obj;
                if (!playerState.track().c()) {
                    int i = Flowable.a;
                    return FlowableNever.b.T(Flowable.I(Boolean.FALSE));
                }
                ContextTrack contextTrack = (ContextTrack) playerState.track().b();
                contextTrack.getClass();
                String strContextUri = l4o1.I(contextTrack) ? "" : playerState.contextUri();
                if (!l4o1.U(contextTrack) || (strUri = l4o1.a0(contextTrack, "pointer.uri")) == null) {
                    strUri = contextTrack.uri();
                }
                g610 g610VarA = ((x610) obj2).a();
                strUri.getClass();
                strContextUri.getClass();
                g610VarA.getClass();
                Set set = s4b1.f;
                blc0 blc0Var = uic.x(strUri).c;
                blc0 blc0Var2 = blc0.ed;
                if (blc0Var == blc0Var2) {
                    strContextUri = "spotify:playlist:37i9dQZF1FgnTBfUlzkeKt";
                }
                return g610VarA.b.c(strContextUri, Collections.singletonList(strUri), uic.x(strUri).c == blc0Var2 || uic.x(strUri).c == blc0.M3).flatMapSingle(new e610(g610VarA, strUri, strContextUri, (byte) 1)).distinctUntilChanged().toFlowable(BackpressureStrategy.d);
            case 20:
                String str4 = (String) obj;
                tc6 tc6Var = (tc6) obj2;
                if (str4.length() == 0) {
                    return Single.just(new lc6(ErrorType.UNKNOWN));
                }
                return tc6Var.b(tc6Var.l.a(new f9u0(PlayAsNextInQueueCommand.create(Collections.singletonList(ContextTrack.create(str4))))), tc6Var.f());
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                String str5 = (String) obj;
                gxu gxuVarA = ((hna) obj2).a.a(str5);
                return gxuVarA != null ? Maybe.e(new mmr0(str5, gxuVarA)) : MaybeEmpty.a;
            default:
                s141 s141Var = ((esa) obj2).a;
                s141Var.getClass();
                return Single.create(new sw9(s141Var, 2, (byte) 28)).toObservable().map(olj0.Y);
        }
    }

    public void b(msi0 msi0Var, boolean z) {
        xj5 xj5Var;
        byte b = this.a;
        Object obj = this.b;
        int i = 0;
        switch (b) {
            case 3:
                if (msi0Var instanceof alc1) {
                    ((alc1) msi0Var).z.l().d(false);
                }
                oti0 oti0Var = ((g60) obj).e;
                if (oti0Var != null) {
                    oti0Var.b(msi0Var, z);
                }
                break;
            default:
                yj5 yj5Var = (yj5) obj;
                msi0 msi0VarL = msi0Var.l();
                boolean z2 = msi0VarL != msi0Var;
                if (z2) {
                    msi0Var = msi0VarL;
                }
                xj5[] xj5VarArr = yj5Var.j1;
                int length = xj5VarArr != null ? xj5VarArr.length : 0;
                while (true) {
                    if (i >= length) {
                        xj5Var = null;
                    } else {
                        xj5Var = xj5VarArr[i];
                        if (xj5Var == null || xj5Var.h != msi0Var) {
                            i++;
                        }
                    }
                }
                if (xj5Var != null) {
                    if (!z2) {
                        yj5Var.r(xj5Var, z);
                    } else {
                        yj5Var.p(xj5Var.a, xj5Var, msi0VarL);
                        yj5Var.r(xj5Var, true);
                    }
                }
                break;
        }
    }

    public Bundle c(String str, String str2, int i, String str3) {
        return ((vbx0) this.b).c(str, str2, i, str3);
    }

    public Intent d(nhz nhzVar, String str, String str2) {
        return ((vbx0) this.b).d(nhzVar, str, str2);
    }

    public Bundle e(String str, String str2, String str3) {
        Bundle bundleF = pzm.f("CODE", str, "RESPONSE_TYPE", "code");
        bundleF.putString("STATE", str2);
        return bundleF;
    }

    public Intent f(Bundle bundle) {
        Intent intent = new Intent();
        intent.putExtras(bundle);
        return intent;
    }

    public boolean g(msi0 msi0Var) {
        Window.Callback callback;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 3:
                g60 g60Var = (g60) obj;
                if (msi0Var != g60Var.c) {
                    ysi0 ysi0Var = ((alc1) msi0Var).A;
                    oti0 oti0Var = g60Var.e;
                    if (oti0Var != null) {
                        return oti0Var.g(msi0Var);
                    }
                }
                return false;
            default:
                yj5 yj5Var = (yj5) obj;
                if (msi0Var != msi0Var.l() || !yj5Var.d1 || (callback = yj5Var.Y.getCallback()) == null || yj5Var.o1) {
                    return true;
                }
                callback.onMenuOpened(108, msi0Var);
                return true;
        }
    }

    public spq0 h(Uri uri, nhz nhzVar, String str) {
        return j5.a;
    }

    public o2r j() {
        return new igc((byte[]) this.b);
    }

    public mr20 k(String str) {
        return o4p1.k(new lt20(new ld2(hu20.b(Alert.DURATION_SHOW_INDEFINITELY, new ht20(((qns0) this.b).c(), new sd0(2, (lnm) null, (byte) 3)), new k2(this, str, (lnm) null, (byte) 15)), str, (byte) 0), new re1(3, (lnm) null, (byte) 3), (byte) 0), -1, 2);
    }

    public cp5 l() {
        return (cp5) this.b;
    }

    public Set m() {
        Set setUnmodifiableSet;
        synchronized (((HashSet) this.b)) {
            setUnmodifiableSet = Collections.unmodifiableSet((HashSet) this.b);
        }
        return setUnmodifiableSet;
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        boolean z = false;
        Object obj4 = this.b;
        switch (b) {
            case 13:
                z310 z310Var = (z310) obj3;
                smc0 smc0VarN = k4p1.n();
                dn3 dn3Var = ((d74) obj4).b;
                List list = ((z310) obj2).a;
                smc0VarN.add(dn3.c(dn3Var, (Map) obj, list, false, 28));
                if (!list.isEmpty()) {
                    List list2 = z310Var.a;
                    Map mapJ = sqg0.J(new mmr0[]{new mmr0(MediaConstants.DESCRIPTION_EXTRAS_KEY_CONTENT_STYLE_PLAYABLE, 1), new mmr0(MediaConstants.DESCRIPTION_EXTRAS_KEY_CONTENT_STYLE_BROWSABLE, 1), new mmr0(MediaConstants.DESCRIPTION_EXTRAS_KEY_CONTENT_STYLE_SINGLE_ITEM, 1)});
                    List<u310> list3 = list2;
                    ArrayList arrayList = new ArrayList(q7h.U(list3, 10));
                    for (u310 u310Var : list3) {
                        xkg0 xkg0Var = new xkg0();
                        xkg0Var.putAll(u310Var.A);
                        xkg0Var.putAll(mapJ);
                        arrayList.add(u310.b(u310Var, (String) null, (String) null, (Uri) null, 0, (Double) null, (String) null, 0, (y310) null, (String) null, xkg0Var.b(), (Uri) null, (q510) null, -1073741825, 15));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj5 : arrayList) {
                        if (((u310) obj5).l) {
                            arrayList2.add(obj5);
                        }
                    }
                    smc0VarN.addAll(arrayList2);
                }
                return new z310(k4p1.k(smc0VarN), (f410) null, (m510) null, (String) null);
            default:
                PlayerState playerState = (PlayerState) obj;
                ContextTrack contextTrack = (ContextTrack) obj2;
                ip31 ip31Var = (ip31) obj4;
                if (!((Boolean) obj3).booleanValue() && (((wm70) ((ynb0) ip31Var.f).get()).a(playerState) || ydh.b(ln91.a(contextTrack)))) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }

    public cp5 o() {
        return new cp5(((BitSet) this.b).clone(), (byte) 22);
    }

    public void subscribe(SingleEmitter singleEmitter) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 15:
                ek4 ek4Var = (ek4) obj;
                luk lukVar = ek4Var.i;
                if (lukVar == null || !lukVar.i("android-gen-alpha-blocking.is_allowlisting_management_enabled")) {
                    lukVar = ek4Var.j;
                }
                if (lukVar != null) {
                    lukVar.e(new dk4(singleEmitter, ek4Var, (byte) 0));
                }
                break;
            case 16:
            default:
                m26 m26Var = (m26) obj;
                luk lukVar2 = m26Var.r;
                if (lukVar2 == null || !lukVar2.i("apps-music-libs-eventsender.rate_limiting_rule_1_events_per_time_unit")) {
                    lukVar2 = m26Var.s;
                }
                if (lukVar2 != null) {
                    lukVar2.e(new k26(singleEmitter, m26Var, (byte) 7));
                }
                break;
            case 17:
                at4 at4Var = (at4) obj;
                luk lukVar3 = at4Var.k;
                if (lukVar3 == null || !lukVar3.i("android-media-session.media3_enabled")) {
                    lukVar3 = at4Var.l;
                }
                if (lukVar3 != null) {
                    lukVar3.e(new e44(singleEmitter, at4Var, (byte) 2));
                }
                break;
        }
    }

    public boolean test(Object obj) {
        Integer num;
        mmr0 mmr0Var = (mmr0) obj;
        fi41 fi41Var = (fi41) mmr0Var.a;
        Set set = (Set) mmr0Var.b;
        if (!((tgb) ((wg9) this.b).e).isEnabled() || (num = fi41Var.b) == null) {
            return true;
        }
        int iIntValue = num.intValue();
        Map map = lya.a;
        Set set2 = set;
        ArrayList arrayList = new ArrayList(q7h.U(set2, 10));
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            arrayList.add(((ee9) it.next()).getUuid());
        }
        Iterator it2 = o7h.p1(arrayList).iterator();
        int iIntValue2 = 0;
        while (it2.hasNext()) {
            Integer num2 = (Integer) lya.a.get((UUID) it2.next());
            if (num2 != null) {
                iIntValue2 |= num2.intValue();
            }
        }
        return (iIntValue & iIntValue2) != 0;
    }

    public bv40(cp5 cp5Var) {
        this.a = (byte) 21;
        this.b = (BitSet) cp5Var.b;
    }

    public /* synthetic */ bv40(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public void subscribe(ObservableEmitter observableEmitter) {
        eyh0 eyh0Var = (eyh0) this.b;
        eyh0Var.c = observableEmitter;
        observableEmitter.setCancellable(new ci0(eyh0Var, (byte) 0));
        Boolean bool = (Boolean) eyh0Var.d;
        if (bool != null) {
            observableEmitter.onNext(bool);
        }
    }
}
