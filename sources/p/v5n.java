package p;

import com.spotify.identity.proto.v3.IdentityV3$Image;
import com.spotify.identity.proto.v3.IdentityV3$UserProfile;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import spotify.profile_esperanto.proto.GetProfilesRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class v5n {
    public final be a;
    public final Scheduler b;

    public v5n(be beVar, Scheduler scheduler) {
        this.a = beVar;
        this.b = scheduler;
    }

    public static eww0 e(IdentityV3$UserProfile identityV3$UserProfile) {
        Object next;
        String url;
        Iterator it = identityV3$UserProfile.u().iterator();
        Object next2 = null;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                IdentityV3$Image identityV3$Image = (IdentityV3$Image) next;
                int iP = identityV3$Image.p() * identityV3$Image.o();
                do {
                    Object next3 = it.next();
                    IdentityV3$Image identityV3$Image2 = (IdentityV3$Image) next3;
                    int iP2 = identityV3$Image2.p() * identityV3$Image2.o();
                    if (iP < iP2) {
                        next = next3;
                        iP = iP2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        IdentityV3$Image identityV3$Image3 = (IdentityV3$Image) next;
        String url2 = identityV3$Image3 != null ? identityV3$Image3.getUrl() : null;
        String value = identityV3$UserProfile.z().getValue();
        String value2 = identityV3$UserProfile.w().getValue();
        String value3 = identityV3$UserProfile.y().getValue();
        value3.getClass();
        String str = !ihc1.y0(value3) ? value3 : null;
        String value4 = identityV3$UserProfile.q().getValue();
        h290 h290VarU = identityV3$UserProfile.u();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarU, 10));
        Iterator it2 = h290VarU.iterator();
        while (it2.hasNext()) {
            arrayList.add(((IdentityV3$Image) it2.next()).getUrl());
        }
        h290 h290VarU2 = identityV3$UserProfile.u();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : h290VarU2) {
            IdentityV3$Image identityV3$Image4 = (IdentityV3$Image) obj;
            if (identityV3$Image4.o() > 0 && identityV3$Image4.p() > 0) {
                arrayList2.add(obj);
            }
        }
        Iterator it3 = arrayList2.iterator();
        if (it3.hasNext()) {
            next2 = it3.next();
            if (it3.hasNext()) {
                IdentityV3$Image identityV3$Image5 = (IdentityV3$Image) next2;
                int iP3 = identityV3$Image5.p() * identityV3$Image5.o();
                do {
                    Object next4 = it3.next();
                    IdentityV3$Image identityV3$Image6 = (IdentityV3$Image) next4;
                    int iP4 = identityV3$Image6.p() * identityV3$Image6.o();
                    if (iP3 > iP4) {
                        next2 = next4;
                        iP3 = iP4;
                    }
                } while (it3.hasNext());
            }
        }
        IdentityV3$Image identityV3$Image7 = (IdentityV3$Image) next2;
        return new eww0(value, value2, str, value4, arrayList, url2, identityV3$UserProfile.getColor().getValue(), identityV3$UserProfile.r().getValue(), identityV3$UserProfile.x().getValue(), identityV3$UserProfile.p().getValue(), identityV3$UserProfile.o().getValue(), identityV3$UserProfile.s().getValue(), identityV3$UserProfile.t().getValue(), identityV3$UserProfile.v().getValue(), (identityV3$Image7 == null || (url = identityV3$Image7.getUrl()) == null) ? url2 : url);
    }

    public final Single a(String str) {
        return b(str).firstOrError().map(een.a1).map(e4y.U0).onErrorReturn(new ljp1(str, (byte) 7));
    }

    public final Observable b(String str) {
        if (ihc1.y0(str)) {
            eg.m("Parameter 'username' MUST NOT be empty");
            return null;
        }
        xo40 xo40VarP = GetProfilesRequest.p();
        xo40VarP.q(str);
        return this.a.i((GetProfilesRequest) xo40VarP.build()).switchMap(new fjb(this, (byte) 3));
    }

    public final Observable c(String str) {
        return Observable.combineLatest((ObservableSource) b(str).map(mm10.Z0).map(ns80.W0).onErrorReturnItem(new u5n(null)), (ObservableSource) Observable.just(Boolean.TRUE).delay(100L, TimeUnit.MILLISECONDS, this.b).startWithItem(Boolean.FALSE), (BiFunction) bya0.S0).filter(stf0.X0).map(new njp1(str, (byte) 5)).distinctUntilChanged();
    }

    public final Observable d(List list) {
        if (list.isEmpty()) {
            eg.m("Parameter 'usernames' MUST contain at least one string");
            return null;
        }
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (ihc1.y0((String) it.next())) {
                    eg.m("All usernames in passed list MUST NOT be empty");
                    return null;
                }
            }
        }
        xo40 xo40VarP = GetProfilesRequest.p();
        xo40VarP.n(list2);
        return this.a.i((GetProfilesRequest) xo40VarP.build()).switchMap(new sjb(this, (byte) 3));
    }
}
