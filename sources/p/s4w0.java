package p;

import com.spotify.collection_platform.esperanto.proto.CollectionPlatformItemsRequest;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class s4w0 {
    public final w4h a;
    public final ccc0 b;
    public final g7h c;

    public s4w0(w4h w4hVar, ccc0 ccc0Var, g7h g7hVar) {
        this.a = w4hVar;
        this.b = ccc0Var;
        this.c = g7hVar;
    }

    public final Observable a(ArrayList arrayList) {
        u4h u4hVarQ = CollectionPlatformItemsRequest.q();
        u4hVarQ.n(arrayList);
        u4hVarQ.t(w5h.d);
        return this.a.c(u4hVarQ.build()).map(new r95(arrayList));
    }

    public final Observable b(String str) {
        if (!bbp1.l(str)) {
            if (!bbp1.m(str)) {
                return Observable.just(Boolean.FALSE);
            }
            return this.c.c("", k4p1.x(str), false).map(new mcn1(str, (byte) 8));
        }
        u4h u4hVarQ = CollectionPlatformItemsRequest.q();
        u4hVarQ.r(str);
        u4hVarQ.t(w5h.d);
        return this.a.c(u4hVarQ.build()).map(eh10.e1);
    }

    public final Observable c(Set set) {
        Set set2 = set;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set2) {
            if (bbp1.l((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : set2) {
            if (bbp1.m((String) obj2)) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : set2) {
            if (!bbp1.k((String) obj3)) {
                arrayList3.add(obj3);
            }
        }
        int iS = zno1.s(q7h.U(arrayList3, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (Object obj4 : arrayList3) {
            linkedHashMap.put(obj4, Boolean.FALSE);
        }
        if (arrayList.isEmpty() && arrayList2.isEmpty()) {
            return Observable.just(linkedHashMap);
        }
        if (arrayList2.isEmpty()) {
            return a(arrayList).map(new vgq0(linkedHashMap, (byte) 17));
        }
        boolean zIsEmpty = arrayList.isEmpty();
        g7h g7hVar = this.c;
        return zIsEmpty ? g7hVar.c("", arrayList2, false).map(new jm40(arrayList2)).map(new rut0(linkedHashMap, (byte) 9)) : Observable.combineLatest((ObservableSource) a(arrayList), (ObservableSource) g7hVar.c("", arrayList2, false).map(new jm40(arrayList2)), (BiFunction) new sks0(linkedHashMap, (byte) 15));
    }

    public final Completable d(String str, tv80 tv80Var, boolean z) {
        Single singleB;
        if (!bbp1.l(str)) {
            if (bbp1.m(str)) {
                return j2h1.D(o6x.a, new kv1(z, this, str, tv80Var != null ? new ubc0(tv80Var) : null, (lnm) null, (byte) 17));
            }
            n57.s("Pre-save requested for a non-pre-savable uri type: ".concat(o7h.y0(o7h.d1(ihc1.P0(str, new char[]{':'}, 6), 2), ":", null, null, null, 62)));
            CompletableEmpty completableEmpty = CompletableEmpty.a;
            completableEmpty.getClass();
            return completableEmpty;
        }
        u4h u4hVarQ = CollectionPlatformItemsRequest.q();
        u4hVarQ.r(str);
        u4hVarQ.t(w5h.d);
        CollectionPlatformItemsRequest collectionPlatformItemsRequestBuild = u4hVarQ.build();
        w4h w4hVar = this.a;
        if (z) {
            collectionPlatformItemsRequestBuild.getClass();
            singleB = w4hVar.a(collectionPlatformItemsRequestBuild);
        } else {
            collectionPlatformItemsRequestBuild.getClass();
            singleB = w4hVar.b(collectionPlatformItemsRequestBuild);
        }
        return singleB.flatMapCompletable(mi10.e1);
    }
}
