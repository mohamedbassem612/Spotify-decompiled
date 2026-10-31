package p;

import com.spotify.offline_esperanto.proto.EsOffline;
import io.reactivex.rxjava3.core.Observable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xpp0 {
    public final vpp0 a;
    public final xde0 b;

    public xpp0(vpp0 vpp0Var, xde0 xde0Var) {
        this.a = vpp0Var;
        this.b = xde0Var;
    }

    public static Observable b(LinkedHashSet linkedHashSet, iu30 iu30Var) {
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            linkedHashSet2.add(((a2v) it.next()).a());
        }
        return ((Observable) iu30Var.invoke(linkedHashSet2)).map(b610.T0);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Observable a(Set set) throws NoWhenBranchMatchedException {
        Observable observableJust;
        Observable observableJust2;
        Observable observableJust3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a2v a2vVar = (a2v) it.next();
            int iOrdinal = new y6b1(a2vVar.a(), false).c.ordinal();
            if (iOrdinal != 6) {
                if (iOrdinal != 8) {
                    if (iOrdinal == 19) {
                        int iC = l1d.C(a2vVar.b());
                        if (iC == 0) {
                            linkedHashSet3.add(a2vVar);
                        } else if (iC != 1) {
                            eg.o();
                            return null;
                        }
                    } else if (iOrdinal != 12 && iOrdinal != 13 && iOrdinal != 63) {
                        if (iOrdinal != 64) {
                        }
                    }
                }
                linkedHashSet2.add(a2vVar);
            }
            int iC2 = l1d.C(a2vVar.b());
            if (iC2 == 0) {
                linkedHashSet.add(a2vVar);
            } else if (iC2 != 1) {
                eg.o();
                return null;
            }
        }
        boolean zIsEmpty = linkedHashSet2.isEmpty();
        b7x b7xVar = b7x.a;
        if (zIsEmpty) {
            observableJust = Observable.just(b7xVar);
            observableJust.getClass();
        } else {
            yoz yozVarP = EsOffline.GetItemsRequest.p();
            LinkedHashSet linkedHashSet4 = new LinkedHashSet();
            Iterator it2 = linkedHashSet2.iterator();
            while (it2.hasNext()) {
                linkedHashSet4.add(((a2v) it2.next()).a());
            }
            yozVarP.n(linkedHashSet4);
            observableJust = this.a.callStream("spotify.offline_esperanto.proto.Offline", "SubscribeItems", (EsOffline.GetItemsRequest) yozVarP.build()).map(bj20.T0).throttleLatest(250L, TimeUnit.MILLISECONDS).map(new ewn0(linkedHashSet2, (byte) 10));
        }
        if (linkedHashSet.isEmpty()) {
            observableJust2 = Observable.just(b7xVar);
            observableJust2.getClass();
        } else {
            observableJust2 = b(linkedHashSet, new wao0(this, (byte) 12));
        }
        if (linkedHashSet3.isEmpty()) {
            observableJust3 = Observable.just(b7xVar);
            observableJust3.getClass();
        } else {
            observableJust3 = b(linkedHashSet3, new wao0(this, (byte) 13));
        }
        return Observable.combineLatest(observableJust, observableJust2, observableJust3, xj20.T0);
    }
}
