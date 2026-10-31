package p;

import com.spotify.recentlyplayed.recentlyplayed.RecentlyPlayedEntity;
import com.spotify.recentlyplayed.recentlyplayed.RecentlyPlayedResponse;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dp01 implements rhh0 {
    public final zuz a;
    public final o3e0 b;
    public final o241 c;
    public final vxm1 d;

    public dp01(zuz zuzVar, o3e0 o3e0Var, o241 o241Var, rh11 rh11Var, vxm1 vxm1Var) {
        this.a = zuzVar;
        this.b = o3e0Var;
        this.c = o241Var;
        this.d = vxm1Var;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0027 A[RETURN] */
    public static boolean e(RecentlyPlayedResponse recentlyPlayedResponse) {
        for (Object obj : recentlyPlayedResponse.getItems()) {
            if (((RecentlyPlayedEntity) obj).getDerivedData().a()) {
                if (obj == null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj == null) {
            return true;
        }
        return false;
    }

    @Override // p.w310
    public final Observable a(r9c r9cVar) {
        if (r9cVar.k()) {
            Observable observableWithLatestFrom = this.a.a().filter(new zgz0(r9cVar, this)).distinctUntilChanged().withLatestFrom((ObservableSource) this.c.a, (BiFunction) new pux0(this, r9cVar, (byte) 15));
            observableWithLatestFrom.getClass();
            return observableWithLatestFrom;
        }
        Observable observable = d(r9cVar).toObservable();
        observable.getClass();
        return observable;
    }

    @Override // p.w310
    public final Single b(r9c r9cVar) {
        return this.c.a.firstOrError().flatMap(new uxy0(this, r9cVar, (byte) 6));
    }

    public final ArrayList c(List list, r9c r9cVar, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r9c r9cVar2 = r9cVar;
            boolean z3 = z;
            boolean z4 = z2;
            u310 u310Var = (u310) this.b.f((RecentlyPlayedEntity) it.next(), j5.a, 2, r9cVar2, z3, z4).h();
            if (u310Var != null) {
                arrayList.add(u310Var);
            }
            r9cVar = r9cVar2;
            z = z3;
            z2 = z4;
        }
        return arrayList;
    }

    public final Single d(r9c r9cVar) {
        return this.d.b(r9c.a(r9cVar, (String) null, "com.spotify.downloaded", false, false, (String) null, false, 262013));
    }
}
