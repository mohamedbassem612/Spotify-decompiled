package p;

import com.spotify.recentlyplayed.recentlyplayed.RecentlyPlayedEntity;
import com.spotify.recentlyplayed.recentlyplayed.RecentlyPlayedResponse;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cts0 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dts0 b;
    public final /* synthetic */ r9c c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public cts0(r9c r9cVar, dts0 dts0Var, boolean z, boolean z2) {
        this.a = (byte) 0;
        this.c = r9cVar;
        this.b = dts0Var;
        this.d = z;
        this.e = z2;
    }

    public final Object apply(Object obj) {
        Single map;
        byte b = this.a;
        dts0 dts0Var = this.b;
        switch (b) {
            case 0:
                l510 l510Var = (l510) obj;
                r9c r9cVar = this.c;
                boolean z = r9cVar.o;
                dts0 dts0Var2 = this.b;
                boolean z2 = this.d;
                boolean z3 = this.e;
                if (z) {
                    return Single.just(dts0Var2.c(l510Var, null, r9cVar, z2, z3));
                }
                List list = l510Var.a;
                boolean z4 = list instanceof Collection;
                j5 j5Var = j5.a;
                if (z4 && list.isEmpty()) {
                    map = Single.just(j5Var);
                } else {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (u890.j(((p510) it.next()).a, "nft-home-recently-played")) {
                            map = dts0Var2.b.a().takeUntil(ta20.X0).takeLast(1).singleOrError().map(new cts0(dts0Var2, r9cVar, z2, z3, (byte) 1));
                        }
                    }
                    map = Single.just(j5Var);
                }
                return map.onErrorReturnItem(j5Var).map(new bts0(dts0Var2, l510Var, this.c, this.d, this.e, (byte) 0));
            case 1:
                RecentlyPlayedResponse recentlyPlayedResponse = (RecentlyPlayedResponse) obj;
                ArrayList arrayList = new ArrayList(recentlyPlayedResponse.getLength());
                for (RecentlyPlayedEntity recentlyPlayedEntity : recentlyPlayedResponse.getItems()) {
                    spq0 spq0VarF = dts0Var.c.f(recentlyPlayedEntity, spq0.d(dts0Var.a.getString(2131960950)), 1, this.c, this.d, this.e);
                    if (spq0VarF.c()) {
                        arrayList.add(spq0VarF.b());
                    }
                }
                return new i5w0(arrayList);
            default:
                RecentlyPlayedResponse recentlyPlayedResponse2 = (RecentlyPlayedResponse) obj;
                ArrayList arrayList2 = new ArrayList(recentlyPlayedResponse2.getLength());
                for (RecentlyPlayedEntity recentlyPlayedEntity2 : recentlyPlayedResponse2.getItems()) {
                    spq0 spq0VarF2 = dts0Var.c.f(recentlyPlayedEntity2, spq0.d(dts0Var.a.getString(2131960950)), 1, this.c, this.d, this.e);
                    if (spq0VarF2.c()) {
                        arrayList2.add(spq0VarF2.b());
                    }
                }
                return new i5w0(arrayList2);
        }
    }

    public /* synthetic */ cts0(dts0 dts0Var, r9c r9cVar, boolean z, boolean z2, byte b) {
        this.a = b;
        this.b = dts0Var;
        this.c = r9cVar;
        this.d = z;
        this.e = z2;
    }
}
