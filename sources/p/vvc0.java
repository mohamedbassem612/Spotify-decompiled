package p;

import android.content.Context;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vvc0 implements rhh0 {
    public final Context a;
    public final xrc0 b;
    public final iyc0 c;
    public final n3d0 d;
    public final Observable e;
    public final PlaylistRequestDecorationPolicy f;
    public final ki91 g;
    public final pqs h;
    public final kly0 i;
    public final fdc j;
    public final Flowable k;
    public final ue4 l;
    public final mre0 m;

    public vvc0(Context context, xrc0 xrc0Var, iyc0 iyc0Var, PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy, n3d0 n3d0Var, Observable observable, fdc fdcVar, ki91 ki91Var, pqs pqsVar, agc0 agc0Var, xrm1 xrm1Var, wqg wqgVar, chp chpVar, Flowable flowable, ue4 ue4Var, mre0 mre0Var) {
        this.a = context;
        this.b = xrc0Var;
        this.c = iyc0Var;
        this.d = n3d0Var;
        this.e = observable;
        this.j = fdcVar;
        this.f = playlistRequestDecorationPolicy;
        this.g = ki91Var;
        this.h = pqsVar;
        this.i = chpVar;
        this.k = flowable;
        this.l = ue4Var;
        this.m = mre0Var;
    }

    @Override // p.w310
    public final Observable a(r9c r9cVar) {
        Completable completableO;
        String strE = r9cVar.e();
        boolean zK = r9cVar.k();
        hlr0 hlr0VarD = r9cVar.d();
        if (zK) {
            Completable completableFlatMapCompletable = eyo1.x(strE, ddd1.Z0, this.c).timeout(2L, TimeUnit.SECONDS).flatMapCompletable(new mna0((byte) 8));
            completableFlatMapCompletable.getClass();
            completableO = completableFlatMapCompletable.o(Functions.h);
        } else {
            completableO = CompletableEmpty.a;
        }
        Completable completable = completableO;
        Set set = s4b1.f;
        return Observable.defer(new tvc0(this, completable, strE, zK, hlr0VarD, uic.x(strE).c == blc0.SHOW_SHOW)).doOnError(new jld((byte) 8));
    }

    @Override // p.w310
    public final Single b(r9c r9cVar) {
        Completable completableO;
        String strE = r9cVar.e();
        boolean zK = r9cVar.k();
        hlr0 hlr0VarD = r9cVar.d();
        if (r9cVar.k()) {
            Completable completableFlatMapCompletable = eyo1.x(strE, ddd1.X0, this.c).flatMapCompletable(new mna0((byte) 10));
            completableFlatMapCompletable.getClass();
            completableO = completableFlatMapCompletable.o(Functions.h);
        } else {
            completableO = CompletableEmpty.a;
        }
        return Single.defer(new uvc0(this, completableO, strE, zK, hlr0VarD)).doOnError(new jld((byte) 9));
    }

    public final Single c(String str, boolean z, hlr0 hlr0Var) {
        HashSet hashSet = new HashSet(Arrays.asList(sqc0.a, xqc0.a, yqc0.a, wqc0.a));
        if (!z) {
            hashSet.add(pqc0.a);
        }
        return this.e.firstOrError().map(new bf70(this.d, (byte) 22)).map(new hfr(str, (byte) 4)).map(new k65(this, hashSet, hlr0Var, (byte) 13));
    }

    public final z310 d(wsc0 wsc0Var, rp91 rp91Var, Map map) {
        String str;
        k310 k310VarG;
        int i;
        String string;
        wnb1 wnb1Var;
        Map map2 = map;
        List<zuc0> listR = wsc0Var.e;
        Map map3 = wsc0Var.j;
        ArrayList arrayList = new ArrayList(listR.size());
        kby kbyVar = wsc0Var.f;
        String str2 = kbyVar.a;
        Set set = s4b1.f;
        boolean z = uic.x(str2).c == blc0.SHOW_SHOW;
        w281 w281VarK = (!z || (wnb1Var = (wnb1) map2.get(new iey0(str2))) == null || wnb1Var.a() == null || wnb1Var.a().a != 7) ? null : i6p1.k(str2, map2);
        r381 r381VarI = i6p1.i(listR, map2, w281VarK);
        fdc fdcVar = this.j;
        int i2 = 2131952647;
        boolean z2 = z;
        Context context = this.a;
        if (r381VarI != null) {
            for (mmr0 mmr0Var : (ArrayList) r381VarI.b()) {
                zuc0 zuc0Var = (zuc0) mmr0Var.a;
                wnb1 wnb1Var2 = (wnb1) mmr0Var.b;
                String str3 = zuc0Var.c;
                Set set2 = s4b1.f;
                if (uic.x(str3).c == blc0.SHOW_SHOW) {
                    string = context.getResources().getString(i2);
                    i = i2;
                } else {
                    i = i2;
                    string = "%1$s";
                }
                u310 u310VarK = fdcVar.K(zuc0Var, wnb1Var2, str2, string, map2);
                if (u310VarK != null) {
                    arrayList.add(u310VarK);
                }
                i2 = i;
            }
        } else {
            if (z2) {
                listR = i6p1.r(listR, map2);
            }
            for (zuc0 zuc0Var2 : listR) {
                String str4 = zuc0Var2.c;
                wnb1 wnb1VarT = (wnb1) map2.get(new iey0(str4));
                if (wnb1VarT == null && f7p1.m(str4)) {
                    wnb1VarT = z6p1.t(str4);
                }
                if (wnb1VarT != null) {
                    Set set3 = s4b1.f;
                    u310 u310VarK2 = fdcVar.K(zuc0Var2, wnb1VarT, str2, uic.x(str4).c == blc0.SHOW_SHOW ? context.getResources().getString(2131952647) : "%1$s", map2);
                    if (u310VarK2 != null) {
                        arrayList.add(u310VarK2);
                    }
                }
                map2 = map;
            }
        }
        ArrayList arrayList2 = new ArrayList(2);
        if (!arrayList.isEmpty() && !z2 && (map3.keySet().size() != 1 || !map3.containsKey(dlc0.b))) {
            arrayList2.add(p8p1.s(context, str2));
            if (!xrm1.a(str2) && !str2.equals("spotify:playlist:37i9dQZF1CIl0ks0ynmzpD")) {
                arrayList2.add(rp91Var == rp91.c ? p8p1.u(context, str2, this.h) : p8p1.t(context, str2));
            }
        }
        String string2 = sto1.m(str2) ? context.getString(2131957638) : kbyVar.b;
        if (!z2 || r381VarI == null) {
            str = null;
            k310VarG = null;
        } else {
            str = null;
            k310VarG = i6p1.g(str2, w281VarK, r381VarI.a(), context, this.l, this.m);
        }
        return new z310(arrayList, new f410(string2, str, k310VarG, arrayList2));
    }
}
