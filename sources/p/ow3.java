package p;

import android.app.ForegroundServiceStartNotAllowedException;
import android.bluetooth.BluetoothAdapter;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.AudioRecord;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import com.spotify.audio.record.AudioRecordingException;
import com.spotify.base.java.logging.Logger;
import com.spotify.metadata.cosmos.proto.MetadataCosmos;
import com.spotify.metadata.proto.Metadata;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.functions.ObjectHelper;
import io.reactivex.rxjava3.internal.operators.completable.CompletableSubscribeOn;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableCombineLatest;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureBufferStrategy;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableRefCount;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.functions.Function0;
import spotify.autodownload.esperanto.proto.DecoratedFollowedShowsResponse;
import spotify.autodownload.esperanto.proto.DecoratedShow;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ow3 implements Function, SingleOnSubscribe, bdr0 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public ow3(File file) {
        this.a = (byte) 19;
        this.b = file;
        this.c = new File(file.getPath() + ".bak");
    }

    public CompletableSubscribeOn a(List list) {
        tj60 tj60Var;
        nj60 pj60Var;
        nj60 hj60Var;
        nj60 gj60Var;
        n451 n451Var = (n451) this.c;
        List<hi90> list2 = list;
        ArrayList<mj60> arrayList = new ArrayList(q7h.U(list2, 10));
        for (hi90 hi90Var : list2) {
            Context context = (Context) this.b;
            boolean z = hi90Var instanceof bh90;
            z6x z6xVar = z6x.a;
            if (z) {
                bh90 bh90Var = (bh90) hi90Var;
                pj60Var = new ej60(bh90Var.a, bh90Var.b, aqo1.r(context, hi90Var), bh90Var.c, z6xVar);
            } else {
                if (hi90Var instanceof ch90) {
                    ch90 ch90Var = (ch90) hi90Var;
                    gj60Var = new fj60(ch90Var.a, ch90Var.b, aqo1.r(context, hi90Var), ch90Var.c, false);
                } else {
                    if (hi90Var instanceof oh90) {
                        oh90 oh90Var = (oh90) hi90Var;
                        hj60Var = new nj60(oh90Var.a, oh90Var.b, aqo1.r(context, hi90Var), oh90Var.c);
                    } else if (hi90Var instanceof eh90) {
                        eh90 eh90Var = (eh90) hi90Var;
                        gj60Var = new jj60(eh90Var.a, eh90Var.b, aqo1.r(context, hi90Var), eh90Var.c, eh90Var.h);
                    } else if (hi90Var instanceof jh90) {
                        jh90 jh90Var = (jh90) hi90Var;
                        gj60Var = new gj60(jh90Var.a, jh90Var.b, aqo1.r(context, hi90Var), jh90Var.c, null, jh90Var.g, jh90Var.h, false);
                    } else if (hi90Var instanceof vh90) {
                        vh90 vh90Var = (vh90) hi90Var;
                        hj60Var = new hj60(vh90Var.a, vh90Var.b, aqo1.r(context, hi90Var), vh90Var.c);
                    } else {
                        if (!(hi90Var instanceof yh90)) {
                            eg.o();
                            return null;
                        }
                        yh90 yh90Var = (yh90) hi90Var;
                        String str = yh90Var.a;
                        String str2 = yh90Var.b;
                        String str3 = yh90Var.c;
                        boolean z2 = yh90Var.h;
                        String str4 = yh90Var.f;
                        if (!ihc1.h0(str4, "/", false)) {
                            str4 = null;
                        }
                        pj60Var = new pj60(str, str2, aqo1.r(context, hi90Var), str3, (String) null, false, str4 != null ? (String) o7h.C0(ihc1.Q0(str4, new String[]{"/"}, 0, 6)) : null, yh90Var.g, z2, z6xVar, false);
                    }
                    pj60Var = hj60Var;
                }
                pj60Var = gj60Var;
            }
            arrayList.add(pj60Var);
        }
        w6e0 w6e0Var = n451Var.a;
        kh60 kh60Var = (kh60) w6e0Var.d;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        for (mj60 mj60Var : arrayList) {
            yqg yqgVar = ((uj60) w6e0Var.b).a;
            if (mj60Var instanceof ej60) {
                ej60 ej60Var = (ej60) mj60Var;
                tj60Var = new tj60(ej60Var.a, ej60Var.b, ej60Var.c, ej60Var.d, (String) null, 1, (Boolean) null, (String) null, (Boolean) null, (Boolean) null, ej60Var.e, yqgVar.b(), (Boolean) null, (Boolean) null, 13264);
            } else if (mj60Var instanceof fj60) {
                fj60 fj60Var = (fj60) mj60Var;
                tj60Var = new tj60(fj60Var.a, fj60Var.b, fj60Var.c, fj60Var.d, (String) null, 2, (Boolean) null, (String) null, (Boolean) null, (Boolean) null, (List) null, yqgVar.b(), (Boolean) null, Boolean.valueOf(fj60Var.e), 6096);
            } else if (mj60Var instanceof gj60) {
                gj60 gj60Var2 = (gj60) mj60Var;
                tj60Var = new tj60(gj60Var2.a, gj60Var2.b, gj60Var2.c, gj60Var2.d, gj60Var2.e, 4, Boolean.valueOf(gj60Var2.f), (String) null, Boolean.valueOf(gj60Var2.g), (Boolean) null, (List) null, yqgVar.b(), Boolean.valueOf(gj60Var2.h), (Boolean) null, 9856);
            } else if (mj60Var instanceof hj60) {
                hj60 hj60Var2 = (hj60) mj60Var;
                tj60Var = new tj60(hj60Var2.a, hj60Var2.b, hj60Var2.c, hj60Var2.d, (String) null, 5, (Boolean) null, (String) null, (Boolean) null, (Boolean) null, (List) null, yqgVar.b(), (Boolean) null, (Boolean) null, 14288);
            } else if (mj60Var instanceof mj60) {
                mj60 mj60Var2 = mj60Var;
                tj60Var = new tj60(mj60Var2.a, mj60Var2.b, mj60Var2.c, mj60Var2.d, (String) null, 6, (Boolean) null, (String) null, (Boolean) null, (Boolean) null, (List) null, yqgVar.b(), (Boolean) null, (Boolean) null, 14288);
            } else if (mj60Var instanceof nj60) {
                nj60 nj60Var = (nj60) mj60Var;
                tj60Var = new tj60(nj60Var.a, nj60Var.b, nj60Var.c, nj60Var.d, (String) null, 7, (Boolean) null, (String) null, (Boolean) null, (Boolean) null, (List) null, yqgVar.b(), (Boolean) null, (Boolean) null, 14288);
            } else if (mj60Var instanceof oj60) {
                oj60 oj60Var = (oj60) mj60Var;
                tj60Var = new tj60(oj60Var.a, oj60Var.b, oj60Var.c, oj60Var.d, (String) null, 8, (Boolean) null, (String) null, (Boolean) null, (Boolean) null, (List) null, yqgVar.b(), (Boolean) null, Boolean.valueOf(oj60Var.e), 6096);
            } else if (mj60Var instanceof pj60) {
                pj60 pj60Var2 = (pj60) mj60Var;
                String str5 = pj60Var2.a;
                String str6 = pj60Var2.b;
                String str7 = pj60Var2.c;
                String str8 = pj60Var2.d;
                String str9 = pj60Var2.e;
                String str10 = pj60Var2.g;
                boolean z3 = pj60Var2.f;
                tj60Var = new tj60(str5, str6, str7, str8, str9, 9, Boolean.valueOf(pj60Var2.h), str10, Boolean.valueOf(pj60Var2.i), Boolean.valueOf(z3), pj60Var2.t, yqgVar.b(), Boolean.valueOf(pj60Var2.X), (Boolean) null, 8192);
            } else if (mj60Var instanceof jj60) {
                jj60 jj60Var = (jj60) mj60Var;
                tj60Var = new tj60(jj60Var.a, jj60Var.b, jj60Var.c, jj60Var.d, (String) null, 3, Boolean.valueOf(jj60Var.e), (String) null, (Boolean) null, (Boolean) null, (List) null, yqgVar.b(), (Boolean) null, (Boolean) null, 14224);
            } else if (mj60Var instanceof kj60) {
                kj60 kj60Var = (kj60) mj60Var;
                tj60Var = new tj60(kj60Var.a, kj60Var.b, kj60Var.c, kj60Var.d, (String) null, 10, Boolean.FALSE, (String) null, (Boolean) null, (Boolean) null, (List) null, yqgVar.b(), (Boolean) null, (Boolean) null, 14224);
            } else if (mj60Var instanceof lj60) {
                lj60 lj60Var = (lj60) mj60Var;
                tj60Var = new tj60(lj60Var.a, lj60Var.b, lj60Var.c, lj60Var.d, (String) null, 11, Boolean.FALSE, (String) null, (Boolean) null, (Boolean) null, (List) null, yqgVar.b(), (Boolean) null, (Boolean) null, 14224);
            } else {
                if (!(mj60Var instanceof qj60)) {
                    eg.o();
                    return null;
                }
                qj60 qj60Var = (qj60) mj60Var;
                tj60Var = new tj60(qj60Var.a, qj60Var.b, qj60Var.c, qj60Var.d, (String) null, 12, Boolean.FALSE, (String) null, (Boolean) null, (Boolean) null, (List) null, yqgVar.b(), (Boolean) null, (Boolean) null, 14224);
            }
            arrayList2.add(tj60Var);
        }
        return m5n1.l(kh60Var.a, new s6o(arrayList2.size(), (byte) 1)).c(m5n1.l(kh60Var.a, new d(kh60Var, arrayList2, (byte) 10))).s((Scheduler) w6e0Var.c);
    }

    public Object apply(Object obj) {
        Observable observableH;
        String strJoin;
        u310 u310Var;
        Observable observableCombineLatest;
        byte b = this.a;
        byte b2 = 12;
        o6x o6xVar = o6x.a;
        b7x b7xVar = b7x.a;
        byte b3 = 15;
        int i = 4;
        byte b4 = 16;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 2:
                String str = (String) obj2;
                Logger.d("AAMBS: observeChildren error for %s, %s", new Object[]{str, (Throwable) obj});
                b74 b74Var = (b74) obj3;
                Disposable disposable = (Disposable) b74Var.x.remove(str);
                if (disposable != null) {
                    disposable.dispose();
                }
                b74Var.w.remove(str);
                return Observable.empty();
            case 4:
                ys4 ys4Var = (ys4) obj2;
                int iOrdinal = ((yr4) obj).ordinal();
                if (iOrdinal == 0) {
                    return Flowable.I(r0i0.o);
                }
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        return yoi1.h(o4p1.r(new m441(new hi2(ys4Var, (lnm) null, (byte) 18)), ys4Var.A), o6xVar);
                    }
                    eg.o();
                    return null;
                }
                x610 x610Var = (x610) obj3;
                at4 at4Var = ys4Var.k;
                p241 p241Var = ys4Var.f;
                Flowable flowable = ys4Var.c;
                mr20 mr20Var = ys4Var.x;
                Flowable flowableRefCount = new FlowableRefCount(yoi1.h(hu20.e(rqt0.u(new ik(new u70(mr20Var, (byte) 15), (byte) 7)), new zr4((lnm) null, ys4Var, (byte) 0)), o6xVar).U(ktl.a).Q());
                Flowable flowableH = yoi1.h(!ys4Var.l.a ? new huz(Boolean.FALSE, (byte) 10) : hu20.e(rqt0.u(new ik(new u70(mr20Var, (byte) 18), (byte) 10)), new ms4((lnm) null, ys4Var, (byte) 0)), o6xVar);
                Boolean bool = Boolean.FALSE;
                Flowable flowableRefCount2 = new FlowableRefCount(flowableH.U(bool).Q());
                Flowable flowableB = ys4Var.b(flowable.X(new lan1(ys4Var, (byte) 19)), PlayerState.builder().build());
                Flowable flowable2 = ((i710) x610Var.a.j.get()).b.c;
                Observable observableA = x610Var.b().a();
                BackpressureStrategy backpressureStrategy = BackpressureStrategy.b;
                Flowable flowable3 = observableA.toFlowable(backpressureStrategy);
                Flowable flowable4 = t3k1.n((pta1) x610Var.c().l.getValue()).toFlowable(backpressureStrategy);
                Observable observableB = ys4Var.e.b();
                BackpressureStrategy backpressureStrategy2 = BackpressureStrategy.d;
                Flowable flowable5 = observableB.toFlowable(backpressureStrategy2);
                Flowable flowable6 = ys4Var.B;
                p241 p241Var2 = p241Var;
                Flowable flowable7 = p241Var2.b("offline").map(wcp1.f).distinctUntilChanged().toFlowable(backpressureStrategy2);
                Flowable flowable8 = ys4Var.h.toFlowable(backpressureStrategy2);
                FlowableMap flowableMapJ = flowable.J(qz70.f).x(b6j0.e).J(new kr60(ys4Var, (byte) 16));
                Function function = Functions.a;
                Flowable flowableA = Flowable.a(flowableMapJ.t(function).X(new x6o0(x610Var, (byte) 19)).U(bool), ys4Var.b(p241Var2.a.distinctUntilChanged().onErrorReturn(q9w.h).toFlowable(backpressureStrategy2), b7xVar), flowable.J(zhm0.e).s(drm0.f).X(new t7o0(ys4Var, (byte) 18)).U(bool), flowableRefCount, !at4Var.k() ? Flowable.I(bool) : yoi1.h(((o791) ys4Var.C.getValue()).c, o6xVar).J(pbo1.e).U(bool), flowableRefCount2, new e4b1(ys4Var, (byte) 19));
                g710 g710VarC = x610Var.c();
                Observable observableSwitchMap = new ObservableFromPublisher(g710VarC.a.J(c710.b).t(function)).switchMap(new bm00(g710VarC, (byte) 1));
                rp91 rp91Var = rp91.a;
                Flowable flowable9 = observableSwitchMap.startWith(Observable.just(new sp91(rp91Var, rp91Var, rp91Var))).distinctUntilChanged().toFlowable(backpressureStrategy2);
                Flowable flowableB2 = ys4Var.b(flowable.s(v560.f).X(new bv40(x610Var, (byte) 16)), bool);
                if (at4Var.k != null) {
                    observableH = ((Observable) at4Var.m.getValue()).map(s9w.h).distinctUntilChanged();
                    observableH.getClass();
                } else {
                    observableH = l1d.h(at4Var.h);
                }
                Flowable flowable10 = observableH.switchMap(new yo31(ys4Var, (byte) 20)).distinctUntilChanged().toFlowable(backpressureStrategy2);
                wp20 wp20Var = ys4Var.i;
                Uri uri = Uri.EMPTY;
                pbn pbnVar = new pbn(uri, (Bitmap) null);
                Flowable flowableB3 = ys4Var.b(yoi1.h(new ht20(hu20.e(rqt0.u(new f8f0((mr20) wp20Var.c, (byte) 16)), new c6e0((lnm) null, pbnVar, wp20Var, (byte) 1)), new tfe0(pbnVar, (lnm) null, (byte) 25)), o6xVar).L(ys4Var.b).J(xbp1.g), new odn(new pbn(uri, (Bitmap) null), false));
                Flowable flowableX = flowable.J(uwg.h).t(function).X(new fl1((Object) ys4Var, (byte) 18));
                j5 j5Var = j5.a;
                Flowable flowableU = flowableX.U(j5Var);
                Flowable flowableU2 = flowable.j(ys4Var.n).U(j5Var);
                Flowable flowableU3 = yoi1.h(new tf2(hu20.e(hu20.e(rqt0.u(new ik(new u70(mr20Var, (byte) 17), (byte) 9)), new zr4((lnm) null, ys4Var, (byte) 2)), new zr4((lnm) null, ys4Var, (byte) 3)), (byte) 3), o6xVar).U(b7xVar);
                Flowable flowableU4 = yoi1.h(!at4Var.j() ? new huz("", (byte) 10) : r4p1.k(hu20.e(rqt0.u(new ik(new u70(mr20Var, (byte) 16), (byte) 8)), new zr4((lnm) null, ys4Var, (byte) 1)), 300L), o6xVar).U("");
                Flowable flowableU5 = ((Observable) ys4Var.q.e.getValue()).map(cq41.f).onErrorReturnItem(bool).toFlowable(backpressureStrategy2).U(bool);
                flowableU5.getClass();
                List listI0 = f46.i0(new Flowable[]{flowableB, flowable2, flowable3, flowable4, flowable5, flowable6, flowable7, flowable8, flowableA, flowable9, flowableB2, flowable10, flowableB3, flowableU, flowableU2, flowableU3, flowableRefCount, flowableU4, flowableU5.t(function), !ys4Var.z ? Flowable.I("") : flowable.J(qbo1.e).x(cxo1.g).J(o9p1.g).s(vap1.f).X(new w4b1((Object) ys4Var, (byte) 21)).U(""), flowableRefCount2, Flowable.e(ys4Var.b(p241Var2.b("streaming").distinctUntilChanged().map(fmv.f).toFlowable(backpressureStrategy2), bool), ys4Var.b(p241Var2.b("country_code").distinctUntilChanged().toFlowable(backpressureStrategy2), ""), p241Var2.b("payment-state").distinctUntilChanged().timeout(2L, TimeUnit.SECONDS, Observable.error(new TimeoutException())).onErrorReturnItem("").toFlowable(backpressureStrategy2), p9w.h), ys4Var.w.a(true).toFlowable(backpressureStrategy2)});
                dp5 dp5Var = new dp5(ys4Var, (byte) 4);
                int i2 = Flowable.a;
                ObjectHelper.a(i2, "bufferSize");
                FlowableCombineLatest flowableCombineLatest = new FlowableCombineLatest(listI0, dp5Var, i2);
                ObjectHelper.b(10L, "capacity");
                return new FlowableOnBackpressureBufferStrategy(flowableCombineLatest).U(r0i0.o);
            case 10:
                feh fehVar = (feh) obj;
                tc6 tc6Var = (tc6) obj2;
                if (!(fehVar instanceof ceh)) {
                    return Single.just(fehVar);
                }
                Flowable flowable11 = tc6Var.d;
                return x0d.j(flowable11, flowable11).filter(new vdn1(tc6Var.j, (byte) 1)).firstOrError().flatMap(new g23((String) obj3, tc6Var, fehVar, (byte) 21));
            case 13:
                byte b5 = 4;
                List itemsList = ((MetadataCosmos.MultiResponse) obj).getItemsList();
                yr6 yr6Var = (yr6) obj2;
                String str2 = (String) obj3;
                ArrayList arrayList = new ArrayList();
                Iterator it = itemsList.iterator();
                while (it.hasNext()) {
                    Metadata.Track trackT = ((MetadataCosmos.MetadataItem) it.next()).t();
                    String name = trackT.hasAlbum() ? trackT.n().getName() : "";
                    o3e0 o3e0Var = yr6Var.d;
                    String str3 = yr6Var.g;
                    String string = y6b1.m(g9a.a(trackT.r().t())).toString();
                    if (jhc1.F(string)) {
                        u310Var = null;
                    } else {
                        spq0 spq0VarQ = o3e0.q(trackT.n().n());
                        if (trackT.getArtistCount() > 0) {
                            List artistList = trackT.getArtistList();
                            strJoin = artistList != null ? TextUtils.join((CharSequence) ", ", (Iterable) new wn90(new wn90(artistList, new cwa((byte) 10), (byte) 1), new fv7(b5), (byte) 0)) : null;
                        } else {
                            strJoin = "";
                        }
                        Uri uri2 = Uri.EMPTY;
                        Uri uri3 = Uri.parse(string);
                        String name2 = trackT.getName();
                        String str4 = name != null ? name : strJoin;
                        Set set = s4b1.f;
                        u310Var = new u310(string, (String) null, name2, str4, Uri.parse(spq0VarQ.c() ? (String) spq0VarQ.b() : ""), (Uri) null, uri2, uri2, uri2, uri3, Uri.parse(uic.x(string).y()), 1, false, trackT.q(), false, false, 3, 4, (Double) null, (Integer) null, (Integer) null, false, (String) null, str2, (Integer) null, 0, (y310) null, str3, (Long) null, (String) null, (Map) null, (String) null, (String) null, (oz0) null, 1073741856, 12);
                    }
                    if (u310Var != null) {
                        arrayList.add(u310Var);
                    }
                    b5 = 4;
                }
                return arrayList;
            case 14:
                tm6 tm6Var = (tm6) obj;
                em3 em3Var = (em3) obj2;
                String str5 = (String) obj3;
                ArrayList arrayList2 = tm6Var.b;
                Single singleJust = arrayList2.isEmpty() ? Single.just(as6.a) : ((sjj0) em3Var.b).a(arrayList2).map(e4y.i).map((lfb) em3Var.c).map(mm10.N0).map(new km3(tm6Var, str5, b3));
                singleJust.getClass();
                return singleJust;
            case 16:
                il51 il51Var = (il51) obj;
                s87 s87Var = (s87) obj2;
                boolean z = s87Var.a;
                z6x z6xVar = z6x.a;
                if (z) {
                    observableCombineLatest = Observable.just(z6xVar);
                } else {
                    y87 y87Var = (y87) obj3;
                    yvd yvdVar = y87Var.b;
                    djo djoVar = y87Var.g;
                    smc0 smc0VarN = k4p1.n();
                    smc0VarN.add(gn90.a);
                    if (s87Var.b) {
                        smc0VarN.add(gn90.b);
                    }
                    if (s87Var.c) {
                        smc0VarN.add(gn90.c);
                    }
                    smc0 smc0VarK = k4p1.k(smc0VarN);
                    List list = il51Var.a;
                    Collection collectionValues = yvdVar.e.values();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj4 : collectionValues) {
                        int i3 = i;
                        if (!djoVar.k().contains(((x9a) obj4).e())) {
                            arrayList3.add(obj4);
                        }
                        i = i3;
                    }
                    int i4 = i;
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj5 : arrayList3) {
                        if (djoVar.j(list).containsAll(((x9a) obj5).a())) {
                            arrayList4.add(obj5);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj6 : arrayList4) {
                        if (smc0VarK.containsAll(((x9a) obj6).a())) {
                            arrayList5.add(obj6);
                        }
                    }
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj7 : arrayList5) {
                        if (((x9a) obj7).k(il51Var)) {
                            arrayList6.add(obj7);
                        }
                    }
                    List<x9a> listA1 = o7h.a1(arrayList6, new xvd(il51Var, (byte) 0));
                    int iS = zno1.s(q7h.U(listA1, 10));
                    if (iS < 16) {
                        iS = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                    for (x9a x9aVar : listA1) {
                        linkedHashMap.put(x9aVar.e(), new wvd(x9aVar.g(list), false));
                    }
                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(linkedHashMap);
                    ArrayList arrayList7 = new ArrayList(q7h.U(listA1, 10));
                    for (x9a x9aVar2 : listA1) {
                        Observable observableH2 = x9aVar2.h(il51Var);
                        String str6 = x9aVar2.e().a;
                        rqa rqaVar = new rqa(concurrentHashMap, x9aVar2, b4);
                        rg7 rg7Var = yvdVar.c;
                        rg7Var.getClass();
                        String strC = rg7.c(td6.q(i4), str6);
                        byte b6 = b2;
                        Observable observableDoOnNext = observableH2.doOnSubscribe(new a21(rg7Var, strC, b2)).doOnNext(new qg7((Object) rg7Var, (Object) strC, (Object) rqaVar, (byte) 0));
                        if (!x9aVar2.g(list)) {
                            observableDoOnNext = observableDoOnNext.startWithItem(z6xVar);
                        }
                        arrayList7.add(observableDoOnNext);
                        b2 = b6;
                        b4 = 16;
                    }
                    observableCombineLatest = Observable.combineLatest(arrayList7, new fta(concurrentHashMap, yvdVar, il51Var, djoVar, (byte) 20));
                }
                return observableCombineLatest.map(new km3((Object) il51Var, (Object) s87Var, (byte) 17));
            case 23:
                if (((Boolean) obj).booleanValue()) {
                    return yoi1.i(((l78) obj2).b.c(ql10.b), o6xVar).map(rzs0.i);
                }
                Observable observableJust = Observable.just((umb) obj3);
                observableJust.getClass();
                return observableJust;
            case 25:
                wpb wpbVar = (ypb) obj;
                vi8 vi8Var = (vi8) obj2;
                if (wpbVar instanceof wpb) {
                    wpb wpbVar2 = wpbVar;
                    vi8Var.c.b(new ll8(((ui8) obj3).f().a.a, wpbVar2.b));
                    BehaviorSubject behaviorSubject = vi8Var.a;
                    n2q n2qVar = vi8Var.b;
                    Map map = wpbVar2.b;
                    p2p p2pVar = n2qVar.a;
                    daq daqVar = (daq) p2pVar.c;
                    jly0 jly0Var = daqVar.Xm;
                    jly0 jly0Var2 = daqVar.kh;
                    caq caqVar = daqVar.z4;
                    jly0 jly0Var3 = daqVar.Ym;
                    jly0 jly0Var4 = daqVar.ih;
                    caq caqVar2 = daqVar.N5;
                    g5t g5tVar = daqVar.L1;
                    jo80 jo80Var = daqVar.x1;
                    jly0 jly0Var5 = daqVar.Zm;
                    p2p p2pVar2 = (p2p) ((wdm) p2pVar.d).i;
                    caq caqVar3 = daqVar.en;
                    caq caqVar4 = daqVar.gn;
                    caq caqVar5 = daqVar.in;
                    caq caqVar6 = daqVar.kn;
                    caq caqVar7 = daqVar.X1;
                    jly0 jly0Var6 = daqVar.xm;
                    jly0 jly0Var7 = daqVar.a2;
                    jly0 jly0Var8 = daqVar.Ih;
                    caq caqVar8 = daqVar.A2;
                    behaviorSubject.onNext(new tlv0(new pug(map, jly0Var, jly0Var2, jly0Var3, caqVar2, g5tVar, jo80Var, jly0Var5, g5tVar, p2pVar2, caqVar3, caqVar4, caqVar5, caqVar6, caqVar7, jly0Var6, jly0Var7, jly0Var8, daqVar.r3, daqVar.J8, daqVar.nn, daqVar.on, daqVar.E1)));
                } else if (wpbVar instanceof vpb) {
                    vi8Var.c.b(new ml8(yg8.g));
                }
                return rih1.a;
            case 26:
                ((op8) obj2).d.a.add((String) obj3);
                String message = ((Throwable) obj).getMessage();
                return new eeh(2, message != null ? cy30.g("com.spotify.music.extra.ERROR_MESSAGE", message) : null);
            default:
                DecoratedFollowedShowsResponse decoratedFollowedShowsResponse = (DecoratedFollowedShowsResponse) obj;
                tr80 tr80Var = (tr80) obj3;
                nt8 nt8Var = (nt8) obj2;
                h290 h290VarP = decoratedFollowedShowsResponse.p();
                ArrayList arrayList8 = new ArrayList(q7h.U(h290VarP, 10));
                Iterator it2 = h290VarP.iterator();
                while (it2.hasNext()) {
                    arrayList8.add(((DecoratedShow) it2.next()).getUri());
                }
                return arrayList8.isEmpty() ? Observable.just(nt8.a(decoratedFollowedShowsResponse, b7xVar, tr80Var)) : nt8Var.b.b(new oi("autodownload-settings-content-experience", false, new ib5(arrayList8, (byte) 4))).filter(zhm0.i).map(new ix7(arrayList8, nt8Var, decoratedFollowedShowsResponse, tr80Var));
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.audio.record.AudioRecordingException */
    public w28 b(int i, int i2, y28 y28Var) throws AudioRecordingException {
        l();
        int minBufferSize = AudioRecord.getMinBufferSize(i2, 16, 2);
        if (minBufferSize == -2 || minBufferSize == -1) {
            throw new AudioRecordingException(new IllegalArgumentException("No supported buffer size for PCM microphone recording"));
        }
        x28 x28Var = (x28) y28Var.invoke(Integer.valueOf(minBufferSize));
        try {
            t28 t28VarK = ((u28) this.c).k(i, i2, x28Var.a);
            if (t28VarK.getState() == 1) {
                return new w28(t28VarK, x28Var.b);
            }
            t28VarK.release();
            x74.j((Context) this.b, "android.permission.RECORD_AUDIO");
            throw new AudioRecordingException(new IllegalStateException("AudioRecord is not initialized"));
        } catch (IllegalArgumentException e) {
            throw new AudioRecordingException(e);
        } catch (SecurityException e2) {
            throw new AudioRecordingException(e2);
        }
    }

    public cdr0 c(zob1 zob1Var, y2r0 y2r0Var) {
        u9p u9pVar = (u9p) ((h9p) this.c).a.c;
        l1o l1oVar = (l1o) u9pVar.D;
        Set setW = u9pVar.w();
        sjq0 sjq0VarR = u9pVar.r();
        i1o i1oVar = (i1o) u9pVar.C;
        oj3 oj3Var = (oj3) i1oVar.O0.get();
        c8o.l(oj3Var);
        kly0 kly0Var = i1oVar.M0;
        qut0 qut0Var = (qut0) kly0Var.get();
        c8o.l(qut0Var);
        xrc0 xrc0VarF = i1oVar.f();
        c8o.l(xrc0VarF);
        hku0 hku0Var = new hku0(xrc0VarF);
        g7h g7hVar = (g7h) i1oVar.z.get();
        c8o.l(g7hVar);
        dp5 dp5Var = new dp5(g7hVar, (byte) 10);
        mwm1 mwm1Var = (mwm1) i1oVar.P0.get();
        c8o.l(mwm1Var);
        kly0 kly0Var2 = i1oVar.Q0;
        w4h w4hVar = (w4h) kly0Var2.get();
        c8o.l(w4hVar);
        qpj1 qpj1Var = new qpj1(mwm1Var, w4hVar, (byte) 26);
        w4h w4hVar2 = (w4h) kly0Var2.get();
        c8o.l(w4hVar2);
        il00 il00Var = new il00(w4hVar2, (byte) 25);
        qut0 qut0Var2 = (qut0) kly0Var.get();
        c8o.l(qut0Var2);
        y1t0 y1t0Var = new y1t0(qut0Var2, (byte) 1);
        cig1 cig1Var = (cig1) i1oVar.A.get();
        c8o.l(cig1Var);
        el3 el3Var = (el3) i1oVar.B.get();
        c8o.l(el3Var);
        ffe1 ffe1Var = new ffe1(cig1Var, el3Var, (byte) 13);
        w4h w4hVar3 = (w4h) kly0Var2.get();
        c8o.l(w4hVar3);
        cp70 cp70Var = new cp70(w4hVar3);
        fns fnsVar = igu.a;
        c8o.m(fnsVar);
        plo ploVar = new plo(new nsm0(2, new qlw(oj3Var, qut0Var, hku0Var, dp5Var, qpj1Var, il00Var, y1t0Var, ffe1Var, cp70Var, fnsVar), qlw.class, "create", "create(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/spotify/mobius/Connectable;", 0, (byte) 6), fnsVar);
        lko lkoVar = (lko) i1oVar.c1.get();
        c8o.l(lkoVar);
        xf4 xf4VarC = u9pVar.c();
        pix0 pix0Var = (pix0) i1oVar.t.get();
        c8o.l(pix0Var);
        qeq qeqVar = (qeq) i1oVar.D.get();
        c8o.l(qeqVar);
        sbq sbqVar = (sbq) i1oVar.G.get();
        c8o.l(sbqVar);
        return new d520(l1oVar, setW, sjq0VarR, ploVar, lkoVar, xf4VarC, pix0Var, qeqVar, sbqVar, u9pVar.p(), y2r0Var, zob1Var);
    }

    public Set d(y2r0 y2r0Var) {
        return ((sjq0) this.b).t0(y2r0Var);
    }

    public l420 e(String str) {
        oi oiVar = (oi) this.c;
        l420 l420VarN = oiVar.n(((Context) this.b).getCacheDir(), "appwidget");
        if (!l420VarN.b.exists()) {
            l420VarN.mkdir();
        }
        l420 l420VarP = oiVar.p(l420VarN, str.concat("_widget-recommendations.json"));
        if (!l420VarP.b.exists()) {
            l420VarP.createNewFile();
        }
        return l420VarP;
    }

    public qf5 f(efy0 efy0Var, zjn0 zjn0Var) {
        Map mapT;
        xdg xdgVar;
        beg begVarJ = x1p1.j((zim0) this.b, dem1.x(zjn0Var, efy0Var.c), (poj0) this.c);
        if (efy0Var.d.size() == 0 || bkz.e(begVarJ) || !iht.l(begVarJ, 5) || (xdgVar = (xdg) o7h.W0(begVarJ.h())) == null) {
            mapT = b7x.a;
        } else {
            List listF = xdgVar.F();
            int iS = zno1.s(q7h.U(listF, 10));
            if (iS < 16) {
                iS = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
            for (Object obj : listF) {
                linkedHashMap.put(((tsi1) obj).getName(), obj);
            }
            List<cfy0> list = efy0Var.d;
            ArrayList arrayList = new ArrayList();
            for (cfy0 cfy0Var : list) {
                cfy0Var.getClass();
                tsi1 tsi1Var = (tsi1) linkedHashMap.get(dem1.y(zjn0Var, cfy0Var.c));
                ckz mmr0Var = null;
                if (tsi1Var != null) {
                    ajn0 ajn0VarY = dem1.y(zjn0Var, cfy0Var.c);
                    a8b0 type = tsi1Var.getType();
                    bfy0 bfy0Var = cfy0Var.d;
                    ckz ckzVarM = m(type, bfy0Var, zjn0Var);
                    mmr0Var = g(ckzVarM, type, bfy0Var) ? ckzVarM : null;
                    if (mmr0Var == null) {
                        mmr0Var = new ckz("Unexpected argument value: actual type " + bfy0Var.c + " != expected type " + type);
                    }
                    mmr0Var = new mmr0(ajn0VarY, mmr0Var);
                }
                if (mmr0Var != null) {
                    arrayList.add(mmr0Var);
                }
            }
            mapT = sqg0.T(arrayList);
        }
        return new qf5(begVarJ.m(), mapT, mka1.m0);
    }

    public boolean g(sgl sglVar, a8b0 a8b0Var, bfy0 bfy0Var) {
        zim0 zim0Var = (zim0) this.b;
        afy0 afy0Var = bfy0Var.c;
        int i = afy0Var == null ? -1 : rf5.a[afy0Var.ordinal()];
        if (i != 10) {
            if (i != 13) {
                return u890.j(sglVar.a(zim0Var), a8b0Var);
            }
            if (sglVar instanceof e46) {
                Object obj = ((sgl) ((e46) sglVar)).a;
                if (((List) obj).size() == bfy0Var.X.size()) {
                    a8b0 a8b0VarH = zim0Var.e().h(a8b0Var);
                    if (a8b0VarH != null) {
                        Collection collectionK = p7h.K((Collection) obj);
                        if ((collectionK instanceof Collection) && collectionK.isEmpty()) {
                            return true;
                        }
                        lr80 it = collectionK.iterator();
                        while (((sr80) it).c) {
                            int iNextInt = it.nextInt();
                            if (!g((sgl) ((List) obj).get(iNextInt), a8b0VarH, (bfy0) bfy0Var.X.get(iNextInt))) {
                            }
                        }
                        return true;
                    }
                }
            }
            bhn0.g(sglVar, "Deserialized ArrayValue should have the same number of elements as the original array value: ");
            return false;
        }
        beg begVarS = a8b0Var.t0().s();
        beg begVar = begVarS instanceof beg ? begVarS : null;
        if (begVar == null) {
            return true;
        }
        ajn0 ajn0Var = g6b0.e;
        if (g6b0.b(begVar, rfb1.Q)) {
            return true;
        }
        return false;
    }

    public Executor h() {
        return (Executor) this.b;
    }

    public anm1 i() {
        return (anm1) this.c;
    }

    public void j() {
        i8h1 i8h1Var = (i8h1) this.b;
        x6h1 x6h1VarC = ((rrk0) this.c).b.c();
        x6h1VarC.i.add(new a7h1("icon_change_confirm_dialog", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        y6h1 y6h1VarA = x6h1VarC2.a();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public void k(AppBarLayout appBarLayout, View view, float f) {
        Rect rect = (Rect) this.c;
        Rect rect2 = (Rect) this.b;
        view.getDrawingRect(rect2);
        appBarLayout.offsetDescendantRectToMyCoords(view, rect2);
        rect2.offset(0, -appBarLayout.getTopInset());
        float fAbs = rect2.top - Math.abs(f);
        float f2 = 0.0f;
        if (fAbs > 0.0f) {
            WeakHashMap weakHashMap = b8k1.a;
            view.setClipBounds(null);
            view.setTranslationY(0.0f);
            return;
        }
        float fAbs2 = Math.abs(fAbs / rect2.height());
        if (fAbs2 >= 0.0f) {
            f2 = fAbs2 > 1.0f ? 1.0f : fAbs2;
        }
        float f3 = 1.0f - f2;
        float fHeight = (-fAbs) - ((rect2.height() * 0.3f) * (1.0f - (f3 * f3)));
        view.setTranslationY(fHeight);
        view.getDrawingRect(rect);
        rect.offset(0, (int) (-fHeight));
        WeakHashMap weakHashMap2 = b8k1.a;
        view.setClipBounds(rect);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.audio.record.AudioRecordingException */
    public void l() throws AudioRecordingException {
        if (x74.j((Context) this.b, "android.permission.RECORD_AUDIO") != 0) {
            throw new AudioRecordingException(new IllegalStateException("Cannot initialize audio record without mic permission"));
        }
    }

    public sgl m(a8b0 a8b0Var, bfy0 bfy0Var, zjn0 zjn0Var) {
        boolean zBooleanValue = no20.S.e(bfy0Var.Z).booleanValue();
        afy0 afy0Var = bfy0Var.c;
        switch (afy0Var == null ? -1 : rf5.a[afy0Var.ordinal()]) {
            case 1:
                byte b = (byte) bfy0Var.d;
                return zBooleanValue ? new u3h1(b) : new shc(b);
            case 2:
                return new fne(Character.valueOf((char) bfy0Var.d));
            case 3:
                short s = (short) bfy0Var.d;
                return zBooleanValue ? new u3h1(s) : new wz71(s);
            case 4:
                int i = (int) bfy0Var.d;
                return zBooleanValue ? new u3h1(i) : new zr80(i);
            case 5:
                long j = bfy0Var.d;
                return zBooleanValue ? new u3h1(j) : new r5f0(j);
            case 6:
                return new hpb(bfy0Var.e);
            case 7:
                return new hpb(bfy0Var.f);
            case 8:
                return new hpb(Boolean.valueOf(bfy0Var.d != 0));
            case 9:
                return new ghc1(zjn0Var.getString(bfy0Var.g));
            case 10:
                return new fla0(dem1.x(zjn0Var, bfy0Var.h), bfy0Var.Y);
            case 11:
                return new b1z(dem1.x(zjn0Var, bfy0Var.h), dem1.y(zjn0Var, bfy0Var.i));
            case 12:
                return new dg5(f(bfy0Var.t, zjn0Var));
            case 13:
                List<bfy0> list = bfy0Var.X;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                for (bfy0 bfy0Var2 : list) {
                    qx81 qx81VarF = ((zim0) this.b).e().f();
                    bfy0Var2.getClass();
                    arrayList.add(m(qx81VarF, bfy0Var2, zjn0Var));
                }
                return new q1h1(arrayList, a8b0Var);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + bfy0Var.c + " (expected " + a8b0Var + ')').toString());
        }
    }

    public void n(Context context, String str, Function0 function0) {
        ComponentName componentName;
        try {
            function0.invoke();
            ((l961) this.c).a(1, str);
        } catch (ForegroundServiceStartNotAllowedException unused) {
            Logger.b("Trying to connect to MBS as a workaround", new Object[0]);
            hh hhVar = new hh(this, function0, str, (byte) 13);
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("android.media.browse.MediaBrowserService");
            intent.setPackage(context.getPackageName());
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (listQueryIntentServices.size() == 1) {
                ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
            } else {
                if (!listQueryIntentServices.isEmpty()) {
                    eg.m(f4i1.c(listQueryIntentServices.size(), "Expected 1 service that handles android.media.browse.MediaBrowserService, found "));
                    return;
                }
                componentName = null;
            }
            if (componentName != null) {
                ((y2g0) this.b).a(new hh(this, componentName, context, hhVar));
            }
        }
    }

    public tj7 o() throws IOException {
        File file = (File) this.c;
        File file2 = (File) this.b;
        if (file2.exists()) {
            if (file.exists()) {
                file2.delete();
            } else if (!file2.renameTo(file)) {
                oon1.H("Couldn't rename file " + file2 + " to backup file " + file);
            }
        }
        try {
            return new tj7(file2);
        } catch (FileNotFoundException e) {
            File parentFile = file2.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + file2, e);
            }
            try {
                return new tj7(file2);
            } catch (FileNotFoundException e2) {
                throw new IOException("Couldn't create " + file2, e2);
            }
        }
    }

    public void subscribe(SingleEmitter singleEmitter) {
        BluetoothAdapter bluetoothAdapter = (BluetoothAdapter) this.c;
        b84 b84Var = new b84(singleEmitter, bluetoothAdapter);
        int profileConnectionState = bluetoothAdapter.getProfileConnectionState(2);
        if (profileConnectionState == 2 || profileConnectionState == 1) {
            bluetoothAdapter.getProfileProxy((Context) this.b, b84Var, 2);
        } else {
            singleEmitter.onSuccess(z6x.a);
        }
    }

    public /* synthetic */ ow3(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public ow3(c9c0 c9c0Var) {
        this.a = (byte) 1;
        this.b = c9c0Var;
        this.c = new vpg0(c9c0Var.e.a(), (byte) 0);
    }

    public ow3(Context context, g420 g420Var) {
        this.a = (byte) 9;
        this.b = context;
        this.c = g420Var.a();
    }

    public ow3(ewo ewoVar) {
        this.a = (byte) 12;
        this.b = ewoVar;
        this.c = new dsk0((byte) 0);
    }

    public ow3(Context context) {
        this.a = (byte) 0;
        this.b = context;
        this.c = new idd1(new g82(this, (byte) 17));
    }

    public ow3(BluetoothAdapter bluetoothAdapter, Context context) {
        this.a = (byte) 3;
        this.c = bluetoothAdapter;
        this.b = context;
    }

    public ow3() {
        this.a = (byte) 7;
        this.b = new Rect();
        this.c = new Rect();
    }
}
