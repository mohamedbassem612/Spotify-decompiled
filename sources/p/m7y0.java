package p;

import android.content.Intent;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;
import com.spotify.player.model.command.SignalCommand;
import com.spotify.recently_played_esperanto.proto.GetRecentlyPlayedTracksResponse;
import com.spotify.recently_played_esperanto.proto.RecentlyPlayedEntity;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.completable.CompletableToSingle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class m7y0 implements ya, xi7, Function, qiw, w011, Predicate, SingleOnSubscribe, Producer {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ m7y0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(lnm lnmVar) {
        v011 v011Var;
        if (lnmVar instanceof v011) {
            v011Var = (v011) lnmVar;
            int i = v011Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                v011Var.c = i - Integer.MIN_VALUE;
            } else {
                v011Var = new v011(this, (onm) lnmVar);
            }
        } else {
            v011Var = new v011(this, (onm) lnmVar);
        }
        Object objE = v011Var.a;
        int i2 = v011Var.c;
        if (i2 == 0) {
            hm5.M(objE);
            l2t l2tVar = (l2t) this.b;
            v011Var.c = 1;
            objE = l2tVar.E(v011Var);
            d9n d9nVar = d9n.a;
            if (objE == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objE);
        }
        return new l111(((l111) objE).a, 3);
    }

    public boolean accept(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return !((uro0) obj2).a.h(uro0.b, false);
            case 4:
                return ((vp4) obj2).a() && ((ksk) obj).b;
            default:
                ksk kskVar = (ksk) obj;
                d2f1 d2f1Var = (d2f1) obj2;
                String str = kskVar.a;
                boolean z = kskVar.b;
                le30 le30Var = kskVar.c;
                jq4 jq4Var = d2f1Var.c;
                if (!d2f1Var.a.b()) {
                    return false;
                }
                if (d2f1.a(str, le30Var)) {
                    return jq4Var.e();
                }
                return z ? jq4Var.h() : jq4Var.f();
        }
    }

    public Object apply(Object obj) {
        byte b = this.a;
        o6x o6xVar = o6x.a;
        Object obj2 = this.b;
        switch (b) {
            case 3:
                yxb0 yxb0Var = (yxb0) obj2;
                int iOrdinal = ((sp91) obj).a.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        return ((ruz) yxb0Var.d).a(new k9u0(SignalCommand.create("reshuffle"))).ignoreElement();
                    }
                    if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                }
                return CompletableEmpty.a;
            case 6:
                sjj0 sjj0Var = ((yp01) obj2).a;
                h290 h290VarN = ((GetRecentlyPlayedTracksResponse) obj).n();
                ArrayList arrayList = new ArrayList(q7h.U(h290VarN, 10));
                Iterator it = h290VarN.iterator();
                while (it.hasNext()) {
                    arrayList.add(((RecentlyPlayedEntity) it.next()).n().o().getLink());
                }
                return sjj0Var.a(arrayList);
            case 9:
                return new yyd0(((gxd0) obj2).a);
            case 11:
                c301 c301Var = (c301) obj;
                return new CompletableToSingle(j2h1.D(o6xVar, new d821((zj1) obj2, new frd1(c301Var.b, c301Var.a), (lnm) null, (byte) 2)), ln70.d, (Object) null).onErrorReturn(new zgz0(c301Var, (byte) 8));
            case 12:
                return yoi1.i(new m441(new m2a0((be91) ((g2x0) obj2).b, (lnm) null, (byte) 24)), o6xVar);
            case 16:
                bo31 bo31Var = (bo31) obj2;
                return rqt0.F(bo31Var.l, new d821(bo31Var, (wn3) obj, (lnm) null, (byte) 20));
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return ((Boolean) obj).booleanValue() ? ((u741) obj2).b.o().toObservable() : Observable.just(Boolean.FALSE);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return ((co70) obj2).e(((sa41) obj).c).d(Observable.just(new gb41(true))).onErrorReturn(r5x0.i);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                vy41 vy41Var = (vy41) obj;
                return new tw41(vy41Var.a, vy41Var.b, (List) obj2);
            case 27:
                zsx0 zsx0Var = (zsx0) obj;
                return zsx0Var.f.isEmpty() ? new CompletableFromAction(new ruz0((nf61) obj2, (byte) 8)).d(Observable.just(zsx0Var)) : Observable.just(zsx0Var);
            case 28:
                return ((nt8) obj2).b(((vo61) obj).a).map(o9x0.t).distinctUntilChanged();
            default:
                mt60 mt60Var = (mt60) obj2;
                return Observable.create(new nn61(mt60Var, (mnh) obj, false, (byte) 9)).subscribeOn((Scheduler) mt60Var.d);
        }
    }

    public Object get() {
        return new DispatcherWorker(((t551) this.b).e);
    }

    public Single l(Intent intent, th61 th61Var) {
        return ((Observable) ((ct8) this.b).b.invoke()).firstOrError().map(new iux0(intent, (byte) 1)).onErrorReturn(y6x0.b);
    }

    public void subscribe(SingleEmitter singleEmitter) {
        gsa gsaVar = ((s141) this.b).a;
        zgz0 zgz0Var = new zgz0(singleEmitter, (byte) 13);
        gsaVar.getClass();
        if (gsa.w(new omn1(gsaVar, zgz0Var), 30000L, new sjj1(gsaVar, zgz0Var, (byte) 9), gsaVar.C(), gsaVar.v()) == null) {
            iua iuaVarF = gsaVar.F();
            gsaVar.T(25, 13, iuaVarF);
            zgz0Var.g(iuaVarF);
        }
    }

    public boolean test(Object obj) {
        return ((AtomicInteger) this.b).getAndIncrement() <= 3;
    }

    public void v(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 5:
                ((dtw) ((a901) obj2).i.getValue()).f((dbg1) obj);
                break;
            default:
                ((e061) obj2).a.setBackgroundColor(((Number) obj).intValue());
                break;
        }
    }

    public /* synthetic */ m7y0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
    }
}
