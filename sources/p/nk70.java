package p;

import android.os.Bundle;
import com.spotify.externalintegration.ubi.UbiSpecificationId;
import com.spotify.interapp.service.IapException;
import com.spotify.interapp.service.service.AppProtocolRemoteService;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableError;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTakeUntilPredicate;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nk70 {
    public final fe a;
    public final gv5 b;
    public final i3b c;
    public final LinkedHashMap d = new LinkedHashMap(35);

    public nk70(fe feVar, gv5 gv5Var, i3b i3bVar, final ifl1 ifl1Var) {
        this.a = feVar;
        this.b = gv5Var;
        this.c = i3bVar;
        final byte b = 1;
        gv5 gv5Var2 = new gv5(this, (byte) 1);
        gv5Var2.accept(new slv());
        final byte b2 = 0;
        gv5Var2.accept(new v5y(wq5.class, "com.spotify.connect_switch_to_local_device", 1, new w5y() { // from class: p.e2s
            /* JADX WARN: Code duplicated, block: B:11:0x0044  */
            /* JADX WARN: Code duplicated, block: B:12:0x0047  */
            /* JADX WARN: Code duplicated, block: B:9:0x0038  */
            @Override // p.w5y
            public final Observable a(Object obj) {
                String str;
                byte b3 = b2;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                wq5 wq5Var = cv5.a;
                final byte b4 = 0;
                final byte b5 = 1;
                ifl1 ifl1Var2 = ifl1Var;
                switch (b3) {
                    case 0:
                        oh61 oh61Var = ((hv5) ifl1Var2.b).a;
                        int i = AppProtocolRemoteService.f1;
                        g510 g510Var = oh61Var.k;
                        m210 m210Var = oh61Var.z;
                        String strP = g510Var.p();
                        if (strP == null) {
                            strP = "";
                        }
                        return g510.q(g510Var, m210Var, g510Var.h.j(strP)).flatMapCompletable(new mh61(oh61Var, (byte) 7)).d(oh61Var.c.b().a().takeUntil(new nh61((byte) 4)).flatMap(new nh61((byte) 5)).timeout(25L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new nh61((byte) 6)));
                    case 1:
                        oh61 oh61Var2 = ((hv5) ifl1Var2.b).a;
                        int i2 = AppProtocolRemoteService.f1;
                        return oh61Var2.h((pu5) obj);
                    case 2:
                        oh61 oh61Var3 = ((hv5) ifl1Var2.b).a;
                        int i3 = AppProtocolRemoteService.f1;
                        return oh61Var3.e.b("type").startWith(new CompletableFromAction(new w43(oh61Var3.m, (byte) 6)).w()).map(new f341((byte) 17)).onErrorResumeNext(new f341((byte) 29));
                    case 3:
                        oh61 oh61Var4 = ((hv5) ifl1Var2.b).a;
                        int i4 = AppProtocolRemoteService.f1;
                        return oh61Var4.i((vu5) obj);
                    case 4:
                        su5 su5Var = (su5) obj;
                        oh61 oh61Var5 = ((hv5) ifl1Var2.b).a;
                        int i5 = AppProtocolRemoteService.f1;
                        return Single.create(new jf11((Object) su5Var, (byte) 18)).flatMap(new h341(oh61Var5, su5Var, (byte) 9)).toObservable().startWith(oh61Var5.m.c(2).w());
                    case 5:
                        final ks5 ks5Var = (ks5) obj;
                        final oh61 oh61Var6 = ((hv5) ifl1Var2.b).a;
                        int i6 = AppProtocolRemoteService.f1;
                        return oh61Var6.k.l(ks5Var.b.longValue(), oh61Var6.z).map(new f341((byte) 23)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b6 = b4;
                                ks5 ks5Var2 = ks5Var;
                                oh61 oh61Var7 = oh61Var6;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b6) {
                                    case 0:
                                        return oh61Var7.v.j(ks5Var2.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var7.v.i(ks5Var2.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek in song", (byte) 18)).toObservable().startWith(oh61Var6.m.c(1).w());
                    case 6:
                        final ks5 ks5Var2 = (ks5) obj;
                        final oh61 oh61Var7 = ((hv5) ifl1Var2.b).a;
                        int i7 = AppProtocolRemoteService.f1;
                        return oh61Var7.k.k(ks5Var2.b.longValue(), oh61Var7.z).map(new f341((byte) 28)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b6 = b5;
                                ks5 ks5Var3 = ks5Var2;
                                oh61 oh61Var8 = oh61Var7;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b6) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek by in a song", (byte) 18)).toObservable().startWith(oh61Var7.m.c(1).w());
                    case 7:
                        oh61 oh61Var8 = ((hv5) ifl1Var2.b).a;
                        int i8 = AppProtocolRemoteService.f1;
                        dbm dbmVar = oh61Var8.m;
                        Flowable flowable = oh61Var8.h;
                        g510 g510Var2 = oh61Var8.k;
                        Integer num = ((ns5) obj).b;
                        int iIntValue = num.intValue();
                        if (iIntValue == 0) {
                            Flowable flowableT = flowable.T(dbmVar.c(1).v()).T(g510Var2.d(oh61Var8.z).map(new nh61((byte) 19)).flatMapCompletable(new mh61(oh61Var8, (byte) 10)).v());
                            nh61 nh61Var = new nh61((byte) 20);
                            flowableT.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT, nh61Var).x(new nh61((byte) 21)).J(new nh61((byte) 22)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 23));
                        }
                        if (iIntValue == 1) {
                            Flowable flowableT2 = flowable.T(dbmVar.c(1).v()).T(g510Var2.j(oh61Var8.z).map(new nh61((byte) 13)).flatMapCompletable(new mh61(oh61Var8, (byte) 9)).v());
                            nh61 nh61Var2 = new nh61((byte) 14);
                            flowableT2.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT2, nh61Var2).x(new nh61((byte) 16)).J(new nh61((byte) 17)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 18));
                        }
                        if (iIntValue == 50 || iIntValue == 80 || iIntValue == 100 || iIntValue == 120 || iIntValue == 150 || iIntValue == 200 || iIntValue == 300) {
                            return oh61Var8.j(num.intValue());
                        }
                        return IapException.a("Unexpected playback speed " + num);
                    case 8:
                        oh61 oh61Var9 = ((hv5) ifl1Var2.b).a;
                        int i9 = AppProtocolRemoteService.f1;
                        return oh61Var9.j((int) (((ot5) obj).b.floatValue() * 100.0f));
                    case 9:
                        oh61 oh61Var10 = ((hv5) ifl1Var2.b).a;
                        int i10 = AppProtocolRemoteService.f1;
                        return oh61Var10.k((zs5) obj);
                    case 10:
                        oh61 oh61Var11 = ((hv5) ifl1Var2.b).a;
                        int i11 = AppProtocolRemoteService.f1;
                        Flowable flowable2 = oh61Var11.f;
                        return Observable.combineLatest(x0d.j(flowable2, flowable2).startWith(new CompletableFromAction(new ok70(oh61Var11.m, 4)).w()), yoi1.i(oh61Var11.g.a(o6n.a), o6x.a).startWithItem(Boolean.FALSE).distinctUntilChanged(), new mh61(oh61Var11, (byte) 3));
                    case 11:
                        oh61 oh61Var12 = ((hv5) ifl1Var2.b).a;
                        int i12 = AppProtocolRemoteService.f1;
                        Flowable flowable3 = oh61Var12.h;
                        ObservableFromPublisher observableFromPublisherJ = x0d.j(flowable3, flowable3);
                        ys5 ys5Var = zs5.Companion;
                        Objects.requireNonNull(ys5Var);
                        return observableFromPublisherJ.map(new nh61(ys5Var, (byte) 15)).flatMap(new mh61(oh61Var12, (byte) 11));
                    case 12:
                        ft5 ft5Var = (ft5) obj;
                        oh61 oh61Var13 = ((hv5) ifl1Var2.b).a;
                        int i13 = AppProtocolRemoteService.f1;
                        return oh61Var13.h.T(oh61Var13.m.c(1).v()).z().flatMapCompletable(new h341(oh61Var13, ft5Var, (byte) 6)).d(Observable.just(wq5Var)).startWith(oh61Var13.k.c(oh61Var13.z, ft5Var.d.booleanValue()).ignoreElement().w());
                    case 13:
                        mq5 mq5Var = (mq5) obj;
                        oh61 oh61Var14 = ((hv5) ifl1Var2.b).a;
                        int i14 = AppProtocolRemoteService.f1;
                        Integer num2 = mq5Var.c;
                        int iIntValue2 = num2 == null ? 20 : num2.intValue();
                        String str2 = mq5Var.b;
                        if (str2.equals("spotify:recently-played")) {
                            str2 = "com.spotify.recently-played";
                        } else if (str2.equals("spotify:browse")) {
                            str2 = "com.spotify.browse";
                        }
                        String str3 = str2;
                        c610 c610Var = oh61Var14.u;
                        hlr0 hlr0Var = new hlr0();
                        UbiSpecificationId ubiSpecificationId = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var = oh61Var14.o.c;
                        String str4 = cr5Var.e;
                        String str5 = cr5Var.d;
                        String str6 = oh61Var14.y;
                        m210 m210Var2 = oh61Var14.z;
                        if (m210Var2 == null) {
                            m210Var2 = oh61.D;
                        }
                        return c610Var.c(new r9c(str6, str3, str4, str5, m210Var2, false, true, false, false, hlr0Var, 2, 1, ubiSpecificationId, (String) null, false, false, false), new Bundle()).map(new mp5(mq5Var, iIntValue2, (byte) 8)).doOnError(new fv5(str3, (byte) 21)).toObservable().doOnSubscribe(new po5(oh61Var14, mq5Var, (byte) 5)).startWith(oh61Var14.m.c(8).w());
                    case 14:
                        oh61 oh61Var15 = ((hv5) ifl1Var2.b).a;
                        int i15 = AppProtocolRemoteService.f1;
                        return oh61Var15.l((rt5) obj);
                    case 15:
                        oh61 oh61Var16 = ((hv5) ifl1Var2.b).a;
                        int i16 = AppProtocolRemoteService.f1;
                        Flowable flowable4 = oh61Var16.h;
                        return x0d.j(flowable4, flowable4).map(new nh61((byte) 1)).flatMap(new mh61(oh61Var16, (byte) 4));
                    case 16:
                        oh61 oh61Var17 = ((hv5) ifl1Var2.b).a;
                        int i17 = AppProtocolRemoteService.f1;
                        return oh61Var17.k.n(oh61Var17.z).map(new nh61((byte) 2)).flatMap(new mh61(oh61Var17, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var17.m.c(1).w());
                    case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                        oh61 oh61Var18 = ((hv5) ifl1Var2.b).a;
                        int i18 = AppProtocolRemoteService.f1;
                        return oh61Var18.k.o(oh61Var18.z).map(new f341((byte) 21)).zipWith(oh61Var18.h.z(), new f341((byte) 22)).flatMap(new h341(oh61Var18, (ut5) obj, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var18.m.c(1).w());
                    case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                        jr5 jr5Var = (jr5) obj;
                        oh61 oh61Var19 = ((hv5) ifl1Var2.b).a;
                        int i19 = AppProtocolRemoteService.f1;
                        return Observable.just(jr5Var).startWith(oh61Var19.m.c(1).w()).switchMap(new mh61(oh61Var19, (byte) 1)).flatMapSingle(new mh61(oh61Var19, (byte) 2)).filter(new f341((byte) 24)).map(new f341((byte) 25)).flatMap(new h341(oh61Var19, jr5Var, (byte) 7)).timeout(15L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new f341((byte) 26));
                    case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                        pu5 pu5Var = (pu5) obj;
                        oh61 oh61Var20 = ((hv5) ifl1Var2.b).a;
                        int i20 = AppProtocolRemoteService.f1;
                        Observable observable = oh61Var20.h.T(oh61Var20.m.c(2).v()).z().toObservable();
                        g510 g510Var3 = oh61Var20.k;
                        return observable.startWith(g510.q(g510Var3, oh61Var20.z, g510Var3.h.e(pu5Var.b)).ignoreElement().w()).map(new h341(oh61Var20, pu5Var, (byte) 8));
                    case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                        oh61 oh61Var21 = ((hv5) ifl1Var2.b).a;
                        int i21 = AppProtocolRemoteService.f1;
                        return oh61Var21.c.a.k.b().map(new nh61((byte) 9));
                    case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                        oh61 oh61Var22 = ((hv5) ifl1Var2.b).a;
                        int i22 = AppProtocolRemoteService.f1;
                        return oh61Var22.m.c(4).d(Observable.just(new ws5()));
                    case 22:
                        oh61 oh61Var23 = ((hv5) ifl1Var2.b).a;
                        int i23 = AppProtocolRemoteService.f1;
                        return oh61Var23.i((vu5) obj);
                    case 23:
                        oh61 oh61Var24 = ((hv5) ifl1Var2.b).a;
                        int i24 = AppProtocolRemoteService.f1;
                        return oh61Var24.l.a(((sr5) obj).b.intValue(), oh61Var24.z).q(oh61Var24.m.c(1)).d(Observable.just(wq5Var));
                    case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                        oh61 oh61Var25 = ((hv5) ifl1Var2.b).a;
                        int i25 = AppProtocolRemoteService.f1;
                        return new poj0(oh61Var25.c, oh61Var25.j, oh61Var25.h, oh61Var25.n, (byte) 10).r(oh61Var25.a.getResources()).startWith(oh61Var25.m.c(4).w()).firstOrError().toObservable().map(new f341((byte) 27));
                    case 25:
                        oh61 oh61Var26 = ((hv5) ifl1Var2.b).a;
                        int i26 = AppProtocolRemoteService.f1;
                        Flowable flowable5 = oh61Var26.h;
                        iu5 iu5Var = ju5.Companion;
                        Objects.requireNonNull(iu5Var);
                        Flowable flowableT3 = flowable5.J(new nh61(iu5Var, (byte) 8)).T(oh61Var26.m.c(4).v());
                        flowableT3.getClass();
                        return new ObservableFromPublisher(flowableT3);
                    case 26:
                        pr5 pr5Var = (pr5) obj;
                        oh61 oh61Var27 = ((hv5) ifl1Var2.b).a;
                        int i27 = AppProtocolRemoteService.f1;
                        cr5 cr5Var2 = oh61Var27.o.c;
                        return Single.create(new u2i0(oh61Var27, pr5Var, cr5Var2.l, cr5Var2.k, true)).toObservable().startWith(oh61Var27.m.b(4, pr5Var).w());
                    case 27:
                        oh61 oh61Var28 = ((hv5) ifl1Var2.b).a;
                        int i28 = AppProtocolRemoteService.f1;
                        return oh61Var28.h.T(oh61Var28.m.c(4).v()).z().toObservable().map(new nh61((byte) 0));
                    case 28:
                        oh61 oh61Var29 = ((hv5) ifl1Var2.b).a;
                        int i29 = AppProtocolRemoteService.f1;
                        return oh61Var29.f();
                    default:
                        ct5 ct5Var = (ct5) obj;
                        oh61 oh61Var30 = ((hv5) ifl1Var2.b).a;
                        int i30 = AppProtocolRemoteService.f1;
                        if (ct5Var != null) {
                            str = ct5Var.b;
                            if ("default".equals(str)) {
                                if ("car".equals(oh61Var30.z.f)) {
                                    str = "default-cars";
                                } else {
                                    str = "default";
                                }
                            }
                        } else if ("car".equals(oh61Var30.z.f)) {
                            str = "default-cars";
                        } else {
                            str = "default";
                        }
                        Observable observableJust = (oh61Var30.o.c.e.equals("com.google.android.apps.maps") && str.equals("default")) ? Observable.just(new yr5(0, 0, 0, z6x.a)) : null;
                        if (observableJust != null) {
                            return observableJust;
                        }
                        oh61Var30.y = str;
                        Bundle bundleG = cy30.g("_type", str);
                        String str7 = oh61Var30.f31p;
                        hlr0 hlr0Var2 = new hlr0();
                        UbiSpecificationId ubiSpecificationId2 = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var3 = oh61Var30.o.c;
                        String str8 = cr5Var3.e;
                        String str9 = cr5Var3.d;
                        m210 m210Var3 = oh61Var30.z;
                        if (m210Var3 == null) {
                            m210Var3 = oh61.D;
                        }
                        return oh61Var30.u.c(new r9c(str, str7, str8, str9, m210Var3, true, true, false, false, hlr0Var2, 2, 1, ubiSpecificationId2, (String) null, false, false, false), bundleG).map(new nh61((byte) 7)).toObservable().startWith(oh61Var30.m.c(8).w()).doOnSubscribe(new fv5(oh61Var30, (byte) 19));
                }
            }
        }));
        final byte b3 = 2;
        gv5Var2.accept(new v5y(wq5.class, "com.spotify.get_capabilities", 0, new w5y() { // from class: p.e2s
            /* JADX WARN: Code duplicated, block: B:11:0x0044  */
            /* JADX WARN: Code duplicated, block: B:12:0x0047  */
            /* JADX WARN: Code duplicated, block: B:9:0x0038  */
            @Override // p.w5y
            public final Observable a(Object obj) {
                String str;
                byte b4 = b3;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                wq5 wq5Var = cv5.a;
                final byte b5 = 0;
                final byte b6 = 1;
                ifl1 ifl1Var2 = ifl1Var;
                switch (b4) {
                    case 0:
                        oh61 oh61Var = ((hv5) ifl1Var2.b).a;
                        int i = AppProtocolRemoteService.f1;
                        g510 g510Var = oh61Var.k;
                        m210 m210Var = oh61Var.z;
                        String strP = g510Var.p();
                        if (strP == null) {
                            strP = "";
                        }
                        return g510.q(g510Var, m210Var, g510Var.h.j(strP)).flatMapCompletable(new mh61(oh61Var, (byte) 7)).d(oh61Var.c.b().a().takeUntil(new nh61((byte) 4)).flatMap(new nh61((byte) 5)).timeout(25L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new nh61((byte) 6)));
                    case 1:
                        oh61 oh61Var2 = ((hv5) ifl1Var2.b).a;
                        int i2 = AppProtocolRemoteService.f1;
                        return oh61Var2.h((pu5) obj);
                    case 2:
                        oh61 oh61Var3 = ((hv5) ifl1Var2.b).a;
                        int i3 = AppProtocolRemoteService.f1;
                        return oh61Var3.e.b("type").startWith(new CompletableFromAction(new w43(oh61Var3.m, (byte) 6)).w()).map(new f341((byte) 17)).onErrorResumeNext(new f341((byte) 29));
                    case 3:
                        oh61 oh61Var4 = ((hv5) ifl1Var2.b).a;
                        int i4 = AppProtocolRemoteService.f1;
                        return oh61Var4.i((vu5) obj);
                    case 4:
                        su5 su5Var = (su5) obj;
                        oh61 oh61Var5 = ((hv5) ifl1Var2.b).a;
                        int i5 = AppProtocolRemoteService.f1;
                        return Single.create(new jf11((Object) su5Var, (byte) 18)).flatMap(new h341(oh61Var5, su5Var, (byte) 9)).toObservable().startWith(oh61Var5.m.c(2).w());
                    case 5:
                        final ks5 ks5Var = (ks5) obj;
                        final oh61 oh61Var6 = ((hv5) ifl1Var2.b).a;
                        int i6 = AppProtocolRemoteService.f1;
                        return oh61Var6.k.l(ks5Var.b.longValue(), oh61Var6.z).map(new f341((byte) 23)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b7 = b5;
                                ks5 ks5Var3 = ks5Var;
                                oh61 oh61Var8 = oh61Var6;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b7) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek in song", (byte) 18)).toObservable().startWith(oh61Var6.m.c(1).w());
                    case 6:
                        final ks5 ks5Var2 = (ks5) obj;
                        final oh61 oh61Var7 = ((hv5) ifl1Var2.b).a;
                        int i7 = AppProtocolRemoteService.f1;
                        return oh61Var7.k.k(ks5Var2.b.longValue(), oh61Var7.z).map(new f341((byte) 28)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b7 = b6;
                                ks5 ks5Var3 = ks5Var2;
                                oh61 oh61Var8 = oh61Var7;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b7) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek by in a song", (byte) 18)).toObservable().startWith(oh61Var7.m.c(1).w());
                    case 7:
                        oh61 oh61Var8 = ((hv5) ifl1Var2.b).a;
                        int i8 = AppProtocolRemoteService.f1;
                        dbm dbmVar = oh61Var8.m;
                        Flowable flowable = oh61Var8.h;
                        g510 g510Var2 = oh61Var8.k;
                        Integer num = ((ns5) obj).b;
                        int iIntValue = num.intValue();
                        if (iIntValue == 0) {
                            Flowable flowableT = flowable.T(dbmVar.c(1).v()).T(g510Var2.d(oh61Var8.z).map(new nh61((byte) 19)).flatMapCompletable(new mh61(oh61Var8, (byte) 10)).v());
                            nh61 nh61Var = new nh61((byte) 20);
                            flowableT.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT, nh61Var).x(new nh61((byte) 21)).J(new nh61((byte) 22)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 23));
                        }
                        if (iIntValue == 1) {
                            Flowable flowableT2 = flowable.T(dbmVar.c(1).v()).T(g510Var2.j(oh61Var8.z).map(new nh61((byte) 13)).flatMapCompletable(new mh61(oh61Var8, (byte) 9)).v());
                            nh61 nh61Var2 = new nh61((byte) 14);
                            flowableT2.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT2, nh61Var2).x(new nh61((byte) 16)).J(new nh61((byte) 17)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 18));
                        }
                        if (iIntValue == 50 || iIntValue == 80 || iIntValue == 100 || iIntValue == 120 || iIntValue == 150 || iIntValue == 200 || iIntValue == 300) {
                            return oh61Var8.j(num.intValue());
                        }
                        return IapException.a("Unexpected playback speed " + num);
                    case 8:
                        oh61 oh61Var9 = ((hv5) ifl1Var2.b).a;
                        int i9 = AppProtocolRemoteService.f1;
                        return oh61Var9.j((int) (((ot5) obj).b.floatValue() * 100.0f));
                    case 9:
                        oh61 oh61Var10 = ((hv5) ifl1Var2.b).a;
                        int i10 = AppProtocolRemoteService.f1;
                        return oh61Var10.k((zs5) obj);
                    case 10:
                        oh61 oh61Var11 = ((hv5) ifl1Var2.b).a;
                        int i11 = AppProtocolRemoteService.f1;
                        Flowable flowable2 = oh61Var11.f;
                        return Observable.combineLatest(x0d.j(flowable2, flowable2).startWith(new CompletableFromAction(new ok70(oh61Var11.m, 4)).w()), yoi1.i(oh61Var11.g.a(o6n.a), o6x.a).startWithItem(Boolean.FALSE).distinctUntilChanged(), new mh61(oh61Var11, (byte) 3));
                    case 11:
                        oh61 oh61Var12 = ((hv5) ifl1Var2.b).a;
                        int i12 = AppProtocolRemoteService.f1;
                        Flowable flowable3 = oh61Var12.h;
                        ObservableFromPublisher observableFromPublisherJ = x0d.j(flowable3, flowable3);
                        ys5 ys5Var = zs5.Companion;
                        Objects.requireNonNull(ys5Var);
                        return observableFromPublisherJ.map(new nh61(ys5Var, (byte) 15)).flatMap(new mh61(oh61Var12, (byte) 11));
                    case 12:
                        ft5 ft5Var = (ft5) obj;
                        oh61 oh61Var13 = ((hv5) ifl1Var2.b).a;
                        int i13 = AppProtocolRemoteService.f1;
                        return oh61Var13.h.T(oh61Var13.m.c(1).v()).z().flatMapCompletable(new h341(oh61Var13, ft5Var, (byte) 6)).d(Observable.just(wq5Var)).startWith(oh61Var13.k.c(oh61Var13.z, ft5Var.d.booleanValue()).ignoreElement().w());
                    case 13:
                        mq5 mq5Var = (mq5) obj;
                        oh61 oh61Var14 = ((hv5) ifl1Var2.b).a;
                        int i14 = AppProtocolRemoteService.f1;
                        Integer num2 = mq5Var.c;
                        int iIntValue2 = num2 == null ? 20 : num2.intValue();
                        String str2 = mq5Var.b;
                        if (str2.equals("spotify:recently-played")) {
                            str2 = "com.spotify.recently-played";
                        } else if (str2.equals("spotify:browse")) {
                            str2 = "com.spotify.browse";
                        }
                        String str3 = str2;
                        c610 c610Var = oh61Var14.u;
                        hlr0 hlr0Var = new hlr0();
                        UbiSpecificationId ubiSpecificationId = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var = oh61Var14.o.c;
                        String str4 = cr5Var.e;
                        String str5 = cr5Var.d;
                        String str6 = oh61Var14.y;
                        m210 m210Var2 = oh61Var14.z;
                        if (m210Var2 == null) {
                            m210Var2 = oh61.D;
                        }
                        return c610Var.c(new r9c(str6, str3, str4, str5, m210Var2, false, true, false, false, hlr0Var, 2, 1, ubiSpecificationId, (String) null, false, false, false), new Bundle()).map(new mp5(mq5Var, iIntValue2, (byte) 8)).doOnError(new fv5(str3, (byte) 21)).toObservable().doOnSubscribe(new po5(oh61Var14, mq5Var, (byte) 5)).startWith(oh61Var14.m.c(8).w());
                    case 14:
                        oh61 oh61Var15 = ((hv5) ifl1Var2.b).a;
                        int i15 = AppProtocolRemoteService.f1;
                        return oh61Var15.l((rt5) obj);
                    case 15:
                        oh61 oh61Var16 = ((hv5) ifl1Var2.b).a;
                        int i16 = AppProtocolRemoteService.f1;
                        Flowable flowable4 = oh61Var16.h;
                        return x0d.j(flowable4, flowable4).map(new nh61((byte) 1)).flatMap(new mh61(oh61Var16, (byte) 4));
                    case 16:
                        oh61 oh61Var17 = ((hv5) ifl1Var2.b).a;
                        int i17 = AppProtocolRemoteService.f1;
                        return oh61Var17.k.n(oh61Var17.z).map(new nh61((byte) 2)).flatMap(new mh61(oh61Var17, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var17.m.c(1).w());
                    case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                        oh61 oh61Var18 = ((hv5) ifl1Var2.b).a;
                        int i18 = AppProtocolRemoteService.f1;
                        return oh61Var18.k.o(oh61Var18.z).map(new f341((byte) 21)).zipWith(oh61Var18.h.z(), new f341((byte) 22)).flatMap(new h341(oh61Var18, (ut5) obj, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var18.m.c(1).w());
                    case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                        jr5 jr5Var = (jr5) obj;
                        oh61 oh61Var19 = ((hv5) ifl1Var2.b).a;
                        int i19 = AppProtocolRemoteService.f1;
                        return Observable.just(jr5Var).startWith(oh61Var19.m.c(1).w()).switchMap(new mh61(oh61Var19, (byte) 1)).flatMapSingle(new mh61(oh61Var19, (byte) 2)).filter(new f341((byte) 24)).map(new f341((byte) 25)).flatMap(new h341(oh61Var19, jr5Var, (byte) 7)).timeout(15L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new f341((byte) 26));
                    case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                        pu5 pu5Var = (pu5) obj;
                        oh61 oh61Var20 = ((hv5) ifl1Var2.b).a;
                        int i20 = AppProtocolRemoteService.f1;
                        Observable observable = oh61Var20.h.T(oh61Var20.m.c(2).v()).z().toObservable();
                        g510 g510Var3 = oh61Var20.k;
                        return observable.startWith(g510.q(g510Var3, oh61Var20.z, g510Var3.h.e(pu5Var.b)).ignoreElement().w()).map(new h341(oh61Var20, pu5Var, (byte) 8));
                    case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                        oh61 oh61Var21 = ((hv5) ifl1Var2.b).a;
                        int i21 = AppProtocolRemoteService.f1;
                        return oh61Var21.c.a.k.b().map(new nh61((byte) 9));
                    case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                        oh61 oh61Var22 = ((hv5) ifl1Var2.b).a;
                        int i22 = AppProtocolRemoteService.f1;
                        return oh61Var22.m.c(4).d(Observable.just(new ws5()));
                    case 22:
                        oh61 oh61Var23 = ((hv5) ifl1Var2.b).a;
                        int i23 = AppProtocolRemoteService.f1;
                        return oh61Var23.i((vu5) obj);
                    case 23:
                        oh61 oh61Var24 = ((hv5) ifl1Var2.b).a;
                        int i24 = AppProtocolRemoteService.f1;
                        return oh61Var24.l.a(((sr5) obj).b.intValue(), oh61Var24.z).q(oh61Var24.m.c(1)).d(Observable.just(wq5Var));
                    case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                        oh61 oh61Var25 = ((hv5) ifl1Var2.b).a;
                        int i25 = AppProtocolRemoteService.f1;
                        return new poj0(oh61Var25.c, oh61Var25.j, oh61Var25.h, oh61Var25.n, (byte) 10).r(oh61Var25.a.getResources()).startWith(oh61Var25.m.c(4).w()).firstOrError().toObservable().map(new f341((byte) 27));
                    case 25:
                        oh61 oh61Var26 = ((hv5) ifl1Var2.b).a;
                        int i26 = AppProtocolRemoteService.f1;
                        Flowable flowable5 = oh61Var26.h;
                        iu5 iu5Var = ju5.Companion;
                        Objects.requireNonNull(iu5Var);
                        Flowable flowableT3 = flowable5.J(new nh61(iu5Var, (byte) 8)).T(oh61Var26.m.c(4).v());
                        flowableT3.getClass();
                        return new ObservableFromPublisher(flowableT3);
                    case 26:
                        pr5 pr5Var = (pr5) obj;
                        oh61 oh61Var27 = ((hv5) ifl1Var2.b).a;
                        int i27 = AppProtocolRemoteService.f1;
                        cr5 cr5Var2 = oh61Var27.o.c;
                        return Single.create(new u2i0(oh61Var27, pr5Var, cr5Var2.l, cr5Var2.k, true)).toObservable().startWith(oh61Var27.m.b(4, pr5Var).w());
                    case 27:
                        oh61 oh61Var28 = ((hv5) ifl1Var2.b).a;
                        int i28 = AppProtocolRemoteService.f1;
                        return oh61Var28.h.T(oh61Var28.m.c(4).v()).z().toObservable().map(new nh61((byte) 0));
                    case 28:
                        oh61 oh61Var29 = ((hv5) ifl1Var2.b).a;
                        int i29 = AppProtocolRemoteService.f1;
                        return oh61Var29.f();
                    default:
                        ct5 ct5Var = (ct5) obj;
                        oh61 oh61Var30 = ((hv5) ifl1Var2.b).a;
                        int i30 = AppProtocolRemoteService.f1;
                        if (ct5Var != null) {
                            str = ct5Var.b;
                            if ("default".equals(str)) {
                                if ("car".equals(oh61Var30.z.f)) {
                                    str = "default-cars";
                                } else {
                                    str = "default";
                                }
                            }
                        } else if ("car".equals(oh61Var30.z.f)) {
                            str = "default-cars";
                        } else {
                            str = "default";
                        }
                        Observable observableJust = (oh61Var30.o.c.e.equals("com.google.android.apps.maps") && str.equals("default")) ? Observable.just(new yr5(0, 0, 0, z6x.a)) : null;
                        if (observableJust != null) {
                            return observableJust;
                        }
                        oh61Var30.y = str;
                        Bundle bundleG = cy30.g("_type", str);
                        String str7 = oh61Var30.f31p;
                        hlr0 hlr0Var2 = new hlr0();
                        UbiSpecificationId ubiSpecificationId2 = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var3 = oh61Var30.o.c;
                        String str8 = cr5Var3.e;
                        String str9 = cr5Var3.d;
                        m210 m210Var3 = oh61Var30.z;
                        if (m210Var3 == null) {
                            m210Var3 = oh61.D;
                        }
                        return oh61Var30.u.c(new r9c(str, str7, str8, str9, m210Var3, true, true, false, false, hlr0Var2, 2, 1, ubiSpecificationId2, (String) null, false, false, false), bundleG).map(new nh61((byte) 7)).toObservable().startWith(oh61Var30.m.c(8).w()).doOnSubscribe(new fv5(oh61Var30, (byte) 19));
                }
            }
        }));
        final byte b4 = 13;
        final byte b5 = 8;
        gv5Var2.accept(new v5y(mq5.class, "com.spotify.get_children_of_item", 8, new w5y() { // from class: p.e2s
            /* JADX WARN: Code duplicated, block: B:11:0x0044  */
            /* JADX WARN: Code duplicated, block: B:12:0x0047  */
            /* JADX WARN: Code duplicated, block: B:9:0x0038  */
            @Override // p.w5y
            public final Observable a(Object obj) {
                String str;
                byte b6 = b4;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                wq5 wq5Var = cv5.a;
                final byte b7 = 0;
                final byte b8 = 1;
                ifl1 ifl1Var2 = ifl1Var;
                switch (b6) {
                    case 0:
                        oh61 oh61Var = ((hv5) ifl1Var2.b).a;
                        int i = AppProtocolRemoteService.f1;
                        g510 g510Var = oh61Var.k;
                        m210 m210Var = oh61Var.z;
                        String strP = g510Var.p();
                        if (strP == null) {
                            strP = "";
                        }
                        return g510.q(g510Var, m210Var, g510Var.h.j(strP)).flatMapCompletable(new mh61(oh61Var, (byte) 7)).d(oh61Var.c.b().a().takeUntil(new nh61((byte) 4)).flatMap(new nh61((byte) 5)).timeout(25L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new nh61((byte) 6)));
                    case 1:
                        oh61 oh61Var2 = ((hv5) ifl1Var2.b).a;
                        int i2 = AppProtocolRemoteService.f1;
                        return oh61Var2.h((pu5) obj);
                    case 2:
                        oh61 oh61Var3 = ((hv5) ifl1Var2.b).a;
                        int i3 = AppProtocolRemoteService.f1;
                        return oh61Var3.e.b("type").startWith(new CompletableFromAction(new w43(oh61Var3.m, (byte) 6)).w()).map(new f341((byte) 17)).onErrorResumeNext(new f341((byte) 29));
                    case 3:
                        oh61 oh61Var4 = ((hv5) ifl1Var2.b).a;
                        int i4 = AppProtocolRemoteService.f1;
                        return oh61Var4.i((vu5) obj);
                    case 4:
                        su5 su5Var = (su5) obj;
                        oh61 oh61Var5 = ((hv5) ifl1Var2.b).a;
                        int i5 = AppProtocolRemoteService.f1;
                        return Single.create(new jf11((Object) su5Var, (byte) 18)).flatMap(new h341(oh61Var5, su5Var, (byte) 9)).toObservable().startWith(oh61Var5.m.c(2).w());
                    case 5:
                        final ks5 ks5Var = (ks5) obj;
                        final oh61 oh61Var6 = ((hv5) ifl1Var2.b).a;
                        int i6 = AppProtocolRemoteService.f1;
                        return oh61Var6.k.l(ks5Var.b.longValue(), oh61Var6.z).map(new f341((byte) 23)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b9 = b7;
                                ks5 ks5Var3 = ks5Var;
                                oh61 oh61Var8 = oh61Var6;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b9) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek in song", (byte) 18)).toObservable().startWith(oh61Var6.m.c(1).w());
                    case 6:
                        final ks5 ks5Var2 = (ks5) obj;
                        final oh61 oh61Var7 = ((hv5) ifl1Var2.b).a;
                        int i7 = AppProtocolRemoteService.f1;
                        return oh61Var7.k.k(ks5Var2.b.longValue(), oh61Var7.z).map(new f341((byte) 28)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b9 = b8;
                                ks5 ks5Var3 = ks5Var2;
                                oh61 oh61Var8 = oh61Var7;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b9) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek by in a song", (byte) 18)).toObservable().startWith(oh61Var7.m.c(1).w());
                    case 7:
                        oh61 oh61Var8 = ((hv5) ifl1Var2.b).a;
                        int i8 = AppProtocolRemoteService.f1;
                        dbm dbmVar = oh61Var8.m;
                        Flowable flowable = oh61Var8.h;
                        g510 g510Var2 = oh61Var8.k;
                        Integer num = ((ns5) obj).b;
                        int iIntValue = num.intValue();
                        if (iIntValue == 0) {
                            Flowable flowableT = flowable.T(dbmVar.c(1).v()).T(g510Var2.d(oh61Var8.z).map(new nh61((byte) 19)).flatMapCompletable(new mh61(oh61Var8, (byte) 10)).v());
                            nh61 nh61Var = new nh61((byte) 20);
                            flowableT.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT, nh61Var).x(new nh61((byte) 21)).J(new nh61((byte) 22)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 23));
                        }
                        if (iIntValue == 1) {
                            Flowable flowableT2 = flowable.T(dbmVar.c(1).v()).T(g510Var2.j(oh61Var8.z).map(new nh61((byte) 13)).flatMapCompletable(new mh61(oh61Var8, (byte) 9)).v());
                            nh61 nh61Var2 = new nh61((byte) 14);
                            flowableT2.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT2, nh61Var2).x(new nh61((byte) 16)).J(new nh61((byte) 17)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 18));
                        }
                        if (iIntValue == 50 || iIntValue == 80 || iIntValue == 100 || iIntValue == 120 || iIntValue == 150 || iIntValue == 200 || iIntValue == 300) {
                            return oh61Var8.j(num.intValue());
                        }
                        return IapException.a("Unexpected playback speed " + num);
                    case 8:
                        oh61 oh61Var9 = ((hv5) ifl1Var2.b).a;
                        int i9 = AppProtocolRemoteService.f1;
                        return oh61Var9.j((int) (((ot5) obj).b.floatValue() * 100.0f));
                    case 9:
                        oh61 oh61Var10 = ((hv5) ifl1Var2.b).a;
                        int i10 = AppProtocolRemoteService.f1;
                        return oh61Var10.k((zs5) obj);
                    case 10:
                        oh61 oh61Var11 = ((hv5) ifl1Var2.b).a;
                        int i11 = AppProtocolRemoteService.f1;
                        Flowable flowable2 = oh61Var11.f;
                        return Observable.combineLatest(x0d.j(flowable2, flowable2).startWith(new CompletableFromAction(new ok70(oh61Var11.m, 4)).w()), yoi1.i(oh61Var11.g.a(o6n.a), o6x.a).startWithItem(Boolean.FALSE).distinctUntilChanged(), new mh61(oh61Var11, (byte) 3));
                    case 11:
                        oh61 oh61Var12 = ((hv5) ifl1Var2.b).a;
                        int i12 = AppProtocolRemoteService.f1;
                        Flowable flowable3 = oh61Var12.h;
                        ObservableFromPublisher observableFromPublisherJ = x0d.j(flowable3, flowable3);
                        ys5 ys5Var = zs5.Companion;
                        Objects.requireNonNull(ys5Var);
                        return observableFromPublisherJ.map(new nh61(ys5Var, (byte) 15)).flatMap(new mh61(oh61Var12, (byte) 11));
                    case 12:
                        ft5 ft5Var = (ft5) obj;
                        oh61 oh61Var13 = ((hv5) ifl1Var2.b).a;
                        int i13 = AppProtocolRemoteService.f1;
                        return oh61Var13.h.T(oh61Var13.m.c(1).v()).z().flatMapCompletable(new h341(oh61Var13, ft5Var, (byte) 6)).d(Observable.just(wq5Var)).startWith(oh61Var13.k.c(oh61Var13.z, ft5Var.d.booleanValue()).ignoreElement().w());
                    case 13:
                        mq5 mq5Var = (mq5) obj;
                        oh61 oh61Var14 = ((hv5) ifl1Var2.b).a;
                        int i14 = AppProtocolRemoteService.f1;
                        Integer num2 = mq5Var.c;
                        int iIntValue2 = num2 == null ? 20 : num2.intValue();
                        String str2 = mq5Var.b;
                        if (str2.equals("spotify:recently-played")) {
                            str2 = "com.spotify.recently-played";
                        } else if (str2.equals("spotify:browse")) {
                            str2 = "com.spotify.browse";
                        }
                        String str3 = str2;
                        c610 c610Var = oh61Var14.u;
                        hlr0 hlr0Var = new hlr0();
                        UbiSpecificationId ubiSpecificationId = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var = oh61Var14.o.c;
                        String str4 = cr5Var.e;
                        String str5 = cr5Var.d;
                        String str6 = oh61Var14.y;
                        m210 m210Var2 = oh61Var14.z;
                        if (m210Var2 == null) {
                            m210Var2 = oh61.D;
                        }
                        return c610Var.c(new r9c(str6, str3, str4, str5, m210Var2, false, true, false, false, hlr0Var, 2, 1, ubiSpecificationId, (String) null, false, false, false), new Bundle()).map(new mp5(mq5Var, iIntValue2, (byte) 8)).doOnError(new fv5(str3, (byte) 21)).toObservable().doOnSubscribe(new po5(oh61Var14, mq5Var, (byte) 5)).startWith(oh61Var14.m.c(8).w());
                    case 14:
                        oh61 oh61Var15 = ((hv5) ifl1Var2.b).a;
                        int i15 = AppProtocolRemoteService.f1;
                        return oh61Var15.l((rt5) obj);
                    case 15:
                        oh61 oh61Var16 = ((hv5) ifl1Var2.b).a;
                        int i16 = AppProtocolRemoteService.f1;
                        Flowable flowable4 = oh61Var16.h;
                        return x0d.j(flowable4, flowable4).map(new nh61((byte) 1)).flatMap(new mh61(oh61Var16, (byte) 4));
                    case 16:
                        oh61 oh61Var17 = ((hv5) ifl1Var2.b).a;
                        int i17 = AppProtocolRemoteService.f1;
                        return oh61Var17.k.n(oh61Var17.z).map(new nh61((byte) 2)).flatMap(new mh61(oh61Var17, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var17.m.c(1).w());
                    case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                        oh61 oh61Var18 = ((hv5) ifl1Var2.b).a;
                        int i18 = AppProtocolRemoteService.f1;
                        return oh61Var18.k.o(oh61Var18.z).map(new f341((byte) 21)).zipWith(oh61Var18.h.z(), new f341((byte) 22)).flatMap(new h341(oh61Var18, (ut5) obj, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var18.m.c(1).w());
                    case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                        jr5 jr5Var = (jr5) obj;
                        oh61 oh61Var19 = ((hv5) ifl1Var2.b).a;
                        int i19 = AppProtocolRemoteService.f1;
                        return Observable.just(jr5Var).startWith(oh61Var19.m.c(1).w()).switchMap(new mh61(oh61Var19, (byte) 1)).flatMapSingle(new mh61(oh61Var19, (byte) 2)).filter(new f341((byte) 24)).map(new f341((byte) 25)).flatMap(new h341(oh61Var19, jr5Var, (byte) 7)).timeout(15L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new f341((byte) 26));
                    case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                        pu5 pu5Var = (pu5) obj;
                        oh61 oh61Var20 = ((hv5) ifl1Var2.b).a;
                        int i20 = AppProtocolRemoteService.f1;
                        Observable observable = oh61Var20.h.T(oh61Var20.m.c(2).v()).z().toObservable();
                        g510 g510Var3 = oh61Var20.k;
                        return observable.startWith(g510.q(g510Var3, oh61Var20.z, g510Var3.h.e(pu5Var.b)).ignoreElement().w()).map(new h341(oh61Var20, pu5Var, (byte) 8));
                    case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                        oh61 oh61Var21 = ((hv5) ifl1Var2.b).a;
                        int i21 = AppProtocolRemoteService.f1;
                        return oh61Var21.c.a.k.b().map(new nh61((byte) 9));
                    case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                        oh61 oh61Var22 = ((hv5) ifl1Var2.b).a;
                        int i22 = AppProtocolRemoteService.f1;
                        return oh61Var22.m.c(4).d(Observable.just(new ws5()));
                    case 22:
                        oh61 oh61Var23 = ((hv5) ifl1Var2.b).a;
                        int i23 = AppProtocolRemoteService.f1;
                        return oh61Var23.i((vu5) obj);
                    case 23:
                        oh61 oh61Var24 = ((hv5) ifl1Var2.b).a;
                        int i24 = AppProtocolRemoteService.f1;
                        return oh61Var24.l.a(((sr5) obj).b.intValue(), oh61Var24.z).q(oh61Var24.m.c(1)).d(Observable.just(wq5Var));
                    case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                        oh61 oh61Var25 = ((hv5) ifl1Var2.b).a;
                        int i25 = AppProtocolRemoteService.f1;
                        return new poj0(oh61Var25.c, oh61Var25.j, oh61Var25.h, oh61Var25.n, (byte) 10).r(oh61Var25.a.getResources()).startWith(oh61Var25.m.c(4).w()).firstOrError().toObservable().map(new f341((byte) 27));
                    case 25:
                        oh61 oh61Var26 = ((hv5) ifl1Var2.b).a;
                        int i26 = AppProtocolRemoteService.f1;
                        Flowable flowable5 = oh61Var26.h;
                        iu5 iu5Var = ju5.Companion;
                        Objects.requireNonNull(iu5Var);
                        Flowable flowableT3 = flowable5.J(new nh61(iu5Var, (byte) 8)).T(oh61Var26.m.c(4).v());
                        flowableT3.getClass();
                        return new ObservableFromPublisher(flowableT3);
                    case 26:
                        pr5 pr5Var = (pr5) obj;
                        oh61 oh61Var27 = ((hv5) ifl1Var2.b).a;
                        int i27 = AppProtocolRemoteService.f1;
                        cr5 cr5Var2 = oh61Var27.o.c;
                        return Single.create(new u2i0(oh61Var27, pr5Var, cr5Var2.l, cr5Var2.k, true)).toObservable().startWith(oh61Var27.m.b(4, pr5Var).w());
                    case 27:
                        oh61 oh61Var28 = ((hv5) ifl1Var2.b).a;
                        int i28 = AppProtocolRemoteService.f1;
                        return oh61Var28.h.T(oh61Var28.m.c(4).v()).z().toObservable().map(new nh61((byte) 0));
                    case 28:
                        oh61 oh61Var29 = ((hv5) ifl1Var2.b).a;
                        int i29 = AppProtocolRemoteService.f1;
                        return oh61Var29.f();
                    default:
                        ct5 ct5Var = (ct5) obj;
                        oh61 oh61Var30 = ((hv5) ifl1Var2.b).a;
                        int i30 = AppProtocolRemoteService.f1;
                        if (ct5Var != null) {
                            str = ct5Var.b;
                            if ("default".equals(str)) {
                                if ("car".equals(oh61Var30.z.f)) {
                                    str = "default-cars";
                                } else {
                                    str = "default";
                                }
                            }
                        } else if ("car".equals(oh61Var30.z.f)) {
                            str = "default-cars";
                        } else {
                            str = "default";
                        }
                        Observable observableJust = (oh61Var30.o.c.e.equals("com.google.android.apps.maps") && str.equals("default")) ? Observable.just(new yr5(0, 0, 0, z6x.a)) : null;
                        if (observableJust != null) {
                            return observableJust;
                        }
                        oh61Var30.y = str;
                        Bundle bundleG = cy30.g("_type", str);
                        String str7 = oh61Var30.f31p;
                        hlr0 hlr0Var2 = new hlr0();
                        UbiSpecificationId ubiSpecificationId2 = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var3 = oh61Var30.o.c;
                        String str8 = cr5Var3.e;
                        String str9 = cr5Var3.d;
                        m210 m210Var3 = oh61Var30.z;
                        if (m210Var3 == null) {
                            m210Var3 = oh61.D;
                        }
                        return oh61Var30.u.c(new r9c(str, str7, str8, str9, m210Var3, true, true, false, false, hlr0Var2, 2, 1, ubiSpecificationId2, (String) null, false, false, false), bundleG).map(new nh61((byte) 7)).toObservable().startWith(oh61Var30.m.c(8).w()).doOnSubscribe(new fv5(oh61Var30, (byte) 19));
                }
            }
        }));
        final byte b6 = 24;
        final byte b7 = 4;
        gv5Var2.accept(new v5y(wq5.class, "com.spotify.get_current_context", 4, new w5y() { // from class: p.e2s
            /* JADX WARN: Code duplicated, block: B:11:0x0044  */
            /* JADX WARN: Code duplicated, block: B:12:0x0047  */
            /* JADX WARN: Code duplicated, block: B:9:0x0038  */
            @Override // p.w5y
            public final Observable a(Object obj) {
                String str;
                byte b8 = b6;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                wq5 wq5Var = cv5.a;
                final byte b9 = 0;
                final byte b10 = 1;
                ifl1 ifl1Var2 = ifl1Var;
                switch (b8) {
                    case 0:
                        oh61 oh61Var = ((hv5) ifl1Var2.b).a;
                        int i = AppProtocolRemoteService.f1;
                        g510 g510Var = oh61Var.k;
                        m210 m210Var = oh61Var.z;
                        String strP = g510Var.p();
                        if (strP == null) {
                            strP = "";
                        }
                        return g510.q(g510Var, m210Var, g510Var.h.j(strP)).flatMapCompletable(new mh61(oh61Var, (byte) 7)).d(oh61Var.c.b().a().takeUntil(new nh61((byte) 4)).flatMap(new nh61((byte) 5)).timeout(25L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new nh61((byte) 6)));
                    case 1:
                        oh61 oh61Var2 = ((hv5) ifl1Var2.b).a;
                        int i2 = AppProtocolRemoteService.f1;
                        return oh61Var2.h((pu5) obj);
                    case 2:
                        oh61 oh61Var3 = ((hv5) ifl1Var2.b).a;
                        int i3 = AppProtocolRemoteService.f1;
                        return oh61Var3.e.b("type").startWith(new CompletableFromAction(new w43(oh61Var3.m, (byte) 6)).w()).map(new f341((byte) 17)).onErrorResumeNext(new f341((byte) 29));
                    case 3:
                        oh61 oh61Var4 = ((hv5) ifl1Var2.b).a;
                        int i4 = AppProtocolRemoteService.f1;
                        return oh61Var4.i((vu5) obj);
                    case 4:
                        su5 su5Var = (su5) obj;
                        oh61 oh61Var5 = ((hv5) ifl1Var2.b).a;
                        int i5 = AppProtocolRemoteService.f1;
                        return Single.create(new jf11((Object) su5Var, (byte) 18)).flatMap(new h341(oh61Var5, su5Var, (byte) 9)).toObservable().startWith(oh61Var5.m.c(2).w());
                    case 5:
                        final ks5 ks5Var = (ks5) obj;
                        final oh61 oh61Var6 = ((hv5) ifl1Var2.b).a;
                        int i6 = AppProtocolRemoteService.f1;
                        return oh61Var6.k.l(ks5Var.b.longValue(), oh61Var6.z).map(new f341((byte) 23)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b11 = b9;
                                ks5 ks5Var3 = ks5Var;
                                oh61 oh61Var8 = oh61Var6;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b11) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek in song", (byte) 18)).toObservable().startWith(oh61Var6.m.c(1).w());
                    case 6:
                        final ks5 ks5Var2 = (ks5) obj;
                        final oh61 oh61Var7 = ((hv5) ifl1Var2.b).a;
                        int i7 = AppProtocolRemoteService.f1;
                        return oh61Var7.k.k(ks5Var2.b.longValue(), oh61Var7.z).map(new f341((byte) 28)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b11 = b10;
                                ks5 ks5Var3 = ks5Var2;
                                oh61 oh61Var8 = oh61Var7;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b11) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek by in a song", (byte) 18)).toObservable().startWith(oh61Var7.m.c(1).w());
                    case 7:
                        oh61 oh61Var8 = ((hv5) ifl1Var2.b).a;
                        int i8 = AppProtocolRemoteService.f1;
                        dbm dbmVar = oh61Var8.m;
                        Flowable flowable = oh61Var8.h;
                        g510 g510Var2 = oh61Var8.k;
                        Integer num = ((ns5) obj).b;
                        int iIntValue = num.intValue();
                        if (iIntValue == 0) {
                            Flowable flowableT = flowable.T(dbmVar.c(1).v()).T(g510Var2.d(oh61Var8.z).map(new nh61((byte) 19)).flatMapCompletable(new mh61(oh61Var8, (byte) 10)).v());
                            nh61 nh61Var = new nh61((byte) 20);
                            flowableT.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT, nh61Var).x(new nh61((byte) 21)).J(new nh61((byte) 22)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 23));
                        }
                        if (iIntValue == 1) {
                            Flowable flowableT2 = flowable.T(dbmVar.c(1).v()).T(g510Var2.j(oh61Var8.z).map(new nh61((byte) 13)).flatMapCompletable(new mh61(oh61Var8, (byte) 9)).v());
                            nh61 nh61Var2 = new nh61((byte) 14);
                            flowableT2.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT2, nh61Var2).x(new nh61((byte) 16)).J(new nh61((byte) 17)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 18));
                        }
                        if (iIntValue == 50 || iIntValue == 80 || iIntValue == 100 || iIntValue == 120 || iIntValue == 150 || iIntValue == 200 || iIntValue == 300) {
                            return oh61Var8.j(num.intValue());
                        }
                        return IapException.a("Unexpected playback speed " + num);
                    case 8:
                        oh61 oh61Var9 = ((hv5) ifl1Var2.b).a;
                        int i9 = AppProtocolRemoteService.f1;
                        return oh61Var9.j((int) (((ot5) obj).b.floatValue() * 100.0f));
                    case 9:
                        oh61 oh61Var10 = ((hv5) ifl1Var2.b).a;
                        int i10 = AppProtocolRemoteService.f1;
                        return oh61Var10.k((zs5) obj);
                    case 10:
                        oh61 oh61Var11 = ((hv5) ifl1Var2.b).a;
                        int i11 = AppProtocolRemoteService.f1;
                        Flowable flowable2 = oh61Var11.f;
                        return Observable.combineLatest(x0d.j(flowable2, flowable2).startWith(new CompletableFromAction(new ok70(oh61Var11.m, 4)).w()), yoi1.i(oh61Var11.g.a(o6n.a), o6x.a).startWithItem(Boolean.FALSE).distinctUntilChanged(), new mh61(oh61Var11, (byte) 3));
                    case 11:
                        oh61 oh61Var12 = ((hv5) ifl1Var2.b).a;
                        int i12 = AppProtocolRemoteService.f1;
                        Flowable flowable3 = oh61Var12.h;
                        ObservableFromPublisher observableFromPublisherJ = x0d.j(flowable3, flowable3);
                        ys5 ys5Var = zs5.Companion;
                        Objects.requireNonNull(ys5Var);
                        return observableFromPublisherJ.map(new nh61(ys5Var, (byte) 15)).flatMap(new mh61(oh61Var12, (byte) 11));
                    case 12:
                        ft5 ft5Var = (ft5) obj;
                        oh61 oh61Var13 = ((hv5) ifl1Var2.b).a;
                        int i13 = AppProtocolRemoteService.f1;
                        return oh61Var13.h.T(oh61Var13.m.c(1).v()).z().flatMapCompletable(new h341(oh61Var13, ft5Var, (byte) 6)).d(Observable.just(wq5Var)).startWith(oh61Var13.k.c(oh61Var13.z, ft5Var.d.booleanValue()).ignoreElement().w());
                    case 13:
                        mq5 mq5Var = (mq5) obj;
                        oh61 oh61Var14 = ((hv5) ifl1Var2.b).a;
                        int i14 = AppProtocolRemoteService.f1;
                        Integer num2 = mq5Var.c;
                        int iIntValue2 = num2 == null ? 20 : num2.intValue();
                        String str2 = mq5Var.b;
                        if (str2.equals("spotify:recently-played")) {
                            str2 = "com.spotify.recently-played";
                        } else if (str2.equals("spotify:browse")) {
                            str2 = "com.spotify.browse";
                        }
                        String str3 = str2;
                        c610 c610Var = oh61Var14.u;
                        hlr0 hlr0Var = new hlr0();
                        UbiSpecificationId ubiSpecificationId = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var = oh61Var14.o.c;
                        String str4 = cr5Var.e;
                        String str5 = cr5Var.d;
                        String str6 = oh61Var14.y;
                        m210 m210Var2 = oh61Var14.z;
                        if (m210Var2 == null) {
                            m210Var2 = oh61.D;
                        }
                        return c610Var.c(new r9c(str6, str3, str4, str5, m210Var2, false, true, false, false, hlr0Var, 2, 1, ubiSpecificationId, (String) null, false, false, false), new Bundle()).map(new mp5(mq5Var, iIntValue2, (byte) 8)).doOnError(new fv5(str3, (byte) 21)).toObservable().doOnSubscribe(new po5(oh61Var14, mq5Var, (byte) 5)).startWith(oh61Var14.m.c(8).w());
                    case 14:
                        oh61 oh61Var15 = ((hv5) ifl1Var2.b).a;
                        int i15 = AppProtocolRemoteService.f1;
                        return oh61Var15.l((rt5) obj);
                    case 15:
                        oh61 oh61Var16 = ((hv5) ifl1Var2.b).a;
                        int i16 = AppProtocolRemoteService.f1;
                        Flowable flowable4 = oh61Var16.h;
                        return x0d.j(flowable4, flowable4).map(new nh61((byte) 1)).flatMap(new mh61(oh61Var16, (byte) 4));
                    case 16:
                        oh61 oh61Var17 = ((hv5) ifl1Var2.b).a;
                        int i17 = AppProtocolRemoteService.f1;
                        return oh61Var17.k.n(oh61Var17.z).map(new nh61((byte) 2)).flatMap(new mh61(oh61Var17, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var17.m.c(1).w());
                    case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                        oh61 oh61Var18 = ((hv5) ifl1Var2.b).a;
                        int i18 = AppProtocolRemoteService.f1;
                        return oh61Var18.k.o(oh61Var18.z).map(new f341((byte) 21)).zipWith(oh61Var18.h.z(), new f341((byte) 22)).flatMap(new h341(oh61Var18, (ut5) obj, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var18.m.c(1).w());
                    case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                        jr5 jr5Var = (jr5) obj;
                        oh61 oh61Var19 = ((hv5) ifl1Var2.b).a;
                        int i19 = AppProtocolRemoteService.f1;
                        return Observable.just(jr5Var).startWith(oh61Var19.m.c(1).w()).switchMap(new mh61(oh61Var19, (byte) 1)).flatMapSingle(new mh61(oh61Var19, (byte) 2)).filter(new f341((byte) 24)).map(new f341((byte) 25)).flatMap(new h341(oh61Var19, jr5Var, (byte) 7)).timeout(15L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new f341((byte) 26));
                    case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                        pu5 pu5Var = (pu5) obj;
                        oh61 oh61Var20 = ((hv5) ifl1Var2.b).a;
                        int i20 = AppProtocolRemoteService.f1;
                        Observable observable = oh61Var20.h.T(oh61Var20.m.c(2).v()).z().toObservable();
                        g510 g510Var3 = oh61Var20.k;
                        return observable.startWith(g510.q(g510Var3, oh61Var20.z, g510Var3.h.e(pu5Var.b)).ignoreElement().w()).map(new h341(oh61Var20, pu5Var, (byte) 8));
                    case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                        oh61 oh61Var21 = ((hv5) ifl1Var2.b).a;
                        int i21 = AppProtocolRemoteService.f1;
                        return oh61Var21.c.a.k.b().map(new nh61((byte) 9));
                    case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                        oh61 oh61Var22 = ((hv5) ifl1Var2.b).a;
                        int i22 = AppProtocolRemoteService.f1;
                        return oh61Var22.m.c(4).d(Observable.just(new ws5()));
                    case 22:
                        oh61 oh61Var23 = ((hv5) ifl1Var2.b).a;
                        int i23 = AppProtocolRemoteService.f1;
                        return oh61Var23.i((vu5) obj);
                    case 23:
                        oh61 oh61Var24 = ((hv5) ifl1Var2.b).a;
                        int i24 = AppProtocolRemoteService.f1;
                        return oh61Var24.l.a(((sr5) obj).b.intValue(), oh61Var24.z).q(oh61Var24.m.c(1)).d(Observable.just(wq5Var));
                    case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                        oh61 oh61Var25 = ((hv5) ifl1Var2.b).a;
                        int i25 = AppProtocolRemoteService.f1;
                        return new poj0(oh61Var25.c, oh61Var25.j, oh61Var25.h, oh61Var25.n, (byte) 10).r(oh61Var25.a.getResources()).startWith(oh61Var25.m.c(4).w()).firstOrError().toObservable().map(new f341((byte) 27));
                    case 25:
                        oh61 oh61Var26 = ((hv5) ifl1Var2.b).a;
                        int i26 = AppProtocolRemoteService.f1;
                        Flowable flowable5 = oh61Var26.h;
                        iu5 iu5Var = ju5.Companion;
                        Objects.requireNonNull(iu5Var);
                        Flowable flowableT3 = flowable5.J(new nh61(iu5Var, (byte) 8)).T(oh61Var26.m.c(4).v());
                        flowableT3.getClass();
                        return new ObservableFromPublisher(flowableT3);
                    case 26:
                        pr5 pr5Var = (pr5) obj;
                        oh61 oh61Var27 = ((hv5) ifl1Var2.b).a;
                        int i27 = AppProtocolRemoteService.f1;
                        cr5 cr5Var2 = oh61Var27.o.c;
                        return Single.create(new u2i0(oh61Var27, pr5Var, cr5Var2.l, cr5Var2.k, true)).toObservable().startWith(oh61Var27.m.b(4, pr5Var).w());
                    case 27:
                        oh61 oh61Var28 = ((hv5) ifl1Var2.b).a;
                        int i28 = AppProtocolRemoteService.f1;
                        return oh61Var28.h.T(oh61Var28.m.c(4).v()).z().toObservable().map(new nh61((byte) 0));
                    case 28:
                        oh61 oh61Var29 = ((hv5) ifl1Var2.b).a;
                        int i29 = AppProtocolRemoteService.f1;
                        return oh61Var29.f();
                    default:
                        ct5 ct5Var = (ct5) obj;
                        oh61 oh61Var30 = ((hv5) ifl1Var2.b).a;
                        int i30 = AppProtocolRemoteService.f1;
                        if (ct5Var != null) {
                            str = ct5Var.b;
                            if ("default".equals(str)) {
                                if ("car".equals(oh61Var30.z.f)) {
                                    str = "default-cars";
                                } else {
                                    str = "default";
                                }
                            }
                        } else if ("car".equals(oh61Var30.z.f)) {
                            str = "default-cars";
                        } else {
                            str = "default";
                        }
                        Observable observableJust = (oh61Var30.o.c.e.equals("com.google.android.apps.maps") && str.equals("default")) ? Observable.just(new yr5(0, 0, 0, z6x.a)) : null;
                        if (observableJust != null) {
                            return observableJust;
                        }
                        oh61Var30.y = str;
                        Bundle bundleG = cy30.g("_type", str);
                        String str7 = oh61Var30.f31p;
                        hlr0 hlr0Var2 = new hlr0();
                        UbiSpecificationId ubiSpecificationId2 = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var3 = oh61Var30.o.c;
                        String str8 = cr5Var3.e;
                        String str9 = cr5Var3.d;
                        m210 m210Var3 = oh61Var30.z;
                        if (m210Var3 == null) {
                            m210Var3 = oh61.D;
                        }
                        return oh61Var30.u.c(new r9c(str, str7, str8, str9, m210Var3, true, true, false, false, hlr0Var2, 2, 1, ubiSpecificationId2, (String) null, false, false, false), bundleG).map(new nh61((byte) 7)).toObservable().startWith(oh61Var30.m.c(8).w()).doOnSubscribe(new fv5(oh61Var30, (byte) 19));
                }
            }
        }));
        final byte b8 = 25;
        gv5Var2.accept(new v5y(wq5.class, "com.spotify.get_current_track", 4, new w5y() { // from class: p.e2s
            /* JADX WARN: Code duplicated, block: B:11:0x0044  */
            /* JADX WARN: Code duplicated, block: B:12:0x0047  */
            /* JADX WARN: Code duplicated, block: B:9:0x0038  */
            @Override // p.w5y
            public final Observable a(Object obj) {
                String str;
                byte b9 = b8;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                wq5 wq5Var = cv5.a;
                final byte b10 = 0;
                final byte b11 = 1;
                ifl1 ifl1Var2 = ifl1Var;
                switch (b9) {
                    case 0:
                        oh61 oh61Var = ((hv5) ifl1Var2.b).a;
                        int i = AppProtocolRemoteService.f1;
                        g510 g510Var = oh61Var.k;
                        m210 m210Var = oh61Var.z;
                        String strP = g510Var.p();
                        if (strP == null) {
                            strP = "";
                        }
                        return g510.q(g510Var, m210Var, g510Var.h.j(strP)).flatMapCompletable(new mh61(oh61Var, (byte) 7)).d(oh61Var.c.b().a().takeUntil(new nh61((byte) 4)).flatMap(new nh61((byte) 5)).timeout(25L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new nh61((byte) 6)));
                    case 1:
                        oh61 oh61Var2 = ((hv5) ifl1Var2.b).a;
                        int i2 = AppProtocolRemoteService.f1;
                        return oh61Var2.h((pu5) obj);
                    case 2:
                        oh61 oh61Var3 = ((hv5) ifl1Var2.b).a;
                        int i3 = AppProtocolRemoteService.f1;
                        return oh61Var3.e.b("type").startWith(new CompletableFromAction(new w43(oh61Var3.m, (byte) 6)).w()).map(new f341((byte) 17)).onErrorResumeNext(new f341((byte) 29));
                    case 3:
                        oh61 oh61Var4 = ((hv5) ifl1Var2.b).a;
                        int i4 = AppProtocolRemoteService.f1;
                        return oh61Var4.i((vu5) obj);
                    case 4:
                        su5 su5Var = (su5) obj;
                        oh61 oh61Var5 = ((hv5) ifl1Var2.b).a;
                        int i5 = AppProtocolRemoteService.f1;
                        return Single.create(new jf11((Object) su5Var, (byte) 18)).flatMap(new h341(oh61Var5, su5Var, (byte) 9)).toObservable().startWith(oh61Var5.m.c(2).w());
                    case 5:
                        final ks5 ks5Var = (ks5) obj;
                        final oh61 oh61Var6 = ((hv5) ifl1Var2.b).a;
                        int i6 = AppProtocolRemoteService.f1;
                        return oh61Var6.k.l(ks5Var.b.longValue(), oh61Var6.z).map(new f341((byte) 23)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b12 = b10;
                                ks5 ks5Var3 = ks5Var;
                                oh61 oh61Var8 = oh61Var6;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b12) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek in song", (byte) 18)).toObservable().startWith(oh61Var6.m.c(1).w());
                    case 6:
                        final ks5 ks5Var2 = (ks5) obj;
                        final oh61 oh61Var7 = ((hv5) ifl1Var2.b).a;
                        int i7 = AppProtocolRemoteService.f1;
                        return oh61Var7.k.k(ks5Var2.b.longValue(), oh61Var7.z).map(new f341((byte) 28)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b12 = b11;
                                ks5 ks5Var3 = ks5Var2;
                                oh61 oh61Var8 = oh61Var7;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b12) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek by in a song", (byte) 18)).toObservable().startWith(oh61Var7.m.c(1).w());
                    case 7:
                        oh61 oh61Var8 = ((hv5) ifl1Var2.b).a;
                        int i8 = AppProtocolRemoteService.f1;
                        dbm dbmVar = oh61Var8.m;
                        Flowable flowable = oh61Var8.h;
                        g510 g510Var2 = oh61Var8.k;
                        Integer num = ((ns5) obj).b;
                        int iIntValue = num.intValue();
                        if (iIntValue == 0) {
                            Flowable flowableT = flowable.T(dbmVar.c(1).v()).T(g510Var2.d(oh61Var8.z).map(new nh61((byte) 19)).flatMapCompletable(new mh61(oh61Var8, (byte) 10)).v());
                            nh61 nh61Var = new nh61((byte) 20);
                            flowableT.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT, nh61Var).x(new nh61((byte) 21)).J(new nh61((byte) 22)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 23));
                        }
                        if (iIntValue == 1) {
                            Flowable flowableT2 = flowable.T(dbmVar.c(1).v()).T(g510Var2.j(oh61Var8.z).map(new nh61((byte) 13)).flatMapCompletable(new mh61(oh61Var8, (byte) 9)).v());
                            nh61 nh61Var2 = new nh61((byte) 14);
                            flowableT2.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT2, nh61Var2).x(new nh61((byte) 16)).J(new nh61((byte) 17)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 18));
                        }
                        if (iIntValue == 50 || iIntValue == 80 || iIntValue == 100 || iIntValue == 120 || iIntValue == 150 || iIntValue == 200 || iIntValue == 300) {
                            return oh61Var8.j(num.intValue());
                        }
                        return IapException.a("Unexpected playback speed " + num);
                    case 8:
                        oh61 oh61Var9 = ((hv5) ifl1Var2.b).a;
                        int i9 = AppProtocolRemoteService.f1;
                        return oh61Var9.j((int) (((ot5) obj).b.floatValue() * 100.0f));
                    case 9:
                        oh61 oh61Var10 = ((hv5) ifl1Var2.b).a;
                        int i10 = AppProtocolRemoteService.f1;
                        return oh61Var10.k((zs5) obj);
                    case 10:
                        oh61 oh61Var11 = ((hv5) ifl1Var2.b).a;
                        int i11 = AppProtocolRemoteService.f1;
                        Flowable flowable2 = oh61Var11.f;
                        return Observable.combineLatest(x0d.j(flowable2, flowable2).startWith(new CompletableFromAction(new ok70(oh61Var11.m, 4)).w()), yoi1.i(oh61Var11.g.a(o6n.a), o6x.a).startWithItem(Boolean.FALSE).distinctUntilChanged(), new mh61(oh61Var11, (byte) 3));
                    case 11:
                        oh61 oh61Var12 = ((hv5) ifl1Var2.b).a;
                        int i12 = AppProtocolRemoteService.f1;
                        Flowable flowable3 = oh61Var12.h;
                        ObservableFromPublisher observableFromPublisherJ = x0d.j(flowable3, flowable3);
                        ys5 ys5Var = zs5.Companion;
                        Objects.requireNonNull(ys5Var);
                        return observableFromPublisherJ.map(new nh61(ys5Var, (byte) 15)).flatMap(new mh61(oh61Var12, (byte) 11));
                    case 12:
                        ft5 ft5Var = (ft5) obj;
                        oh61 oh61Var13 = ((hv5) ifl1Var2.b).a;
                        int i13 = AppProtocolRemoteService.f1;
                        return oh61Var13.h.T(oh61Var13.m.c(1).v()).z().flatMapCompletable(new h341(oh61Var13, ft5Var, (byte) 6)).d(Observable.just(wq5Var)).startWith(oh61Var13.k.c(oh61Var13.z, ft5Var.d.booleanValue()).ignoreElement().w());
                    case 13:
                        mq5 mq5Var = (mq5) obj;
                        oh61 oh61Var14 = ((hv5) ifl1Var2.b).a;
                        int i14 = AppProtocolRemoteService.f1;
                        Integer num2 = mq5Var.c;
                        int iIntValue2 = num2 == null ? 20 : num2.intValue();
                        String str2 = mq5Var.b;
                        if (str2.equals("spotify:recently-played")) {
                            str2 = "com.spotify.recently-played";
                        } else if (str2.equals("spotify:browse")) {
                            str2 = "com.spotify.browse";
                        }
                        String str3 = str2;
                        c610 c610Var = oh61Var14.u;
                        hlr0 hlr0Var = new hlr0();
                        UbiSpecificationId ubiSpecificationId = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var = oh61Var14.o.c;
                        String str4 = cr5Var.e;
                        String str5 = cr5Var.d;
                        String str6 = oh61Var14.y;
                        m210 m210Var2 = oh61Var14.z;
                        if (m210Var2 == null) {
                            m210Var2 = oh61.D;
                        }
                        return c610Var.c(new r9c(str6, str3, str4, str5, m210Var2, false, true, false, false, hlr0Var, 2, 1, ubiSpecificationId, (String) null, false, false, false), new Bundle()).map(new mp5(mq5Var, iIntValue2, (byte) 8)).doOnError(new fv5(str3, (byte) 21)).toObservable().doOnSubscribe(new po5(oh61Var14, mq5Var, (byte) 5)).startWith(oh61Var14.m.c(8).w());
                    case 14:
                        oh61 oh61Var15 = ((hv5) ifl1Var2.b).a;
                        int i15 = AppProtocolRemoteService.f1;
                        return oh61Var15.l((rt5) obj);
                    case 15:
                        oh61 oh61Var16 = ((hv5) ifl1Var2.b).a;
                        int i16 = AppProtocolRemoteService.f1;
                        Flowable flowable4 = oh61Var16.h;
                        return x0d.j(flowable4, flowable4).map(new nh61((byte) 1)).flatMap(new mh61(oh61Var16, (byte) 4));
                    case 16:
                        oh61 oh61Var17 = ((hv5) ifl1Var2.b).a;
                        int i17 = AppProtocolRemoteService.f1;
                        return oh61Var17.k.n(oh61Var17.z).map(new nh61((byte) 2)).flatMap(new mh61(oh61Var17, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var17.m.c(1).w());
                    case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                        oh61 oh61Var18 = ((hv5) ifl1Var2.b).a;
                        int i18 = AppProtocolRemoteService.f1;
                        return oh61Var18.k.o(oh61Var18.z).map(new f341((byte) 21)).zipWith(oh61Var18.h.z(), new f341((byte) 22)).flatMap(new h341(oh61Var18, (ut5) obj, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var18.m.c(1).w());
                    case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                        jr5 jr5Var = (jr5) obj;
                        oh61 oh61Var19 = ((hv5) ifl1Var2.b).a;
                        int i19 = AppProtocolRemoteService.f1;
                        return Observable.just(jr5Var).startWith(oh61Var19.m.c(1).w()).switchMap(new mh61(oh61Var19, (byte) 1)).flatMapSingle(new mh61(oh61Var19, (byte) 2)).filter(new f341((byte) 24)).map(new f341((byte) 25)).flatMap(new h341(oh61Var19, jr5Var, (byte) 7)).timeout(15L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new f341((byte) 26));
                    case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                        pu5 pu5Var = (pu5) obj;
                        oh61 oh61Var20 = ((hv5) ifl1Var2.b).a;
                        int i20 = AppProtocolRemoteService.f1;
                        Observable observable = oh61Var20.h.T(oh61Var20.m.c(2).v()).z().toObservable();
                        g510 g510Var3 = oh61Var20.k;
                        return observable.startWith(g510.q(g510Var3, oh61Var20.z, g510Var3.h.e(pu5Var.b)).ignoreElement().w()).map(new h341(oh61Var20, pu5Var, (byte) 8));
                    case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                        oh61 oh61Var21 = ((hv5) ifl1Var2.b).a;
                        int i21 = AppProtocolRemoteService.f1;
                        return oh61Var21.c.a.k.b().map(new nh61((byte) 9));
                    case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                        oh61 oh61Var22 = ((hv5) ifl1Var2.b).a;
                        int i22 = AppProtocolRemoteService.f1;
                        return oh61Var22.m.c(4).d(Observable.just(new ws5()));
                    case 22:
                        oh61 oh61Var23 = ((hv5) ifl1Var2.b).a;
                        int i23 = AppProtocolRemoteService.f1;
                        return oh61Var23.i((vu5) obj);
                    case 23:
                        oh61 oh61Var24 = ((hv5) ifl1Var2.b).a;
                        int i24 = AppProtocolRemoteService.f1;
                        return oh61Var24.l.a(((sr5) obj).b.intValue(), oh61Var24.z).q(oh61Var24.m.c(1)).d(Observable.just(wq5Var));
                    case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                        oh61 oh61Var25 = ((hv5) ifl1Var2.b).a;
                        int i25 = AppProtocolRemoteService.f1;
                        return new poj0(oh61Var25.c, oh61Var25.j, oh61Var25.h, oh61Var25.n, (byte) 10).r(oh61Var25.a.getResources()).startWith(oh61Var25.m.c(4).w()).firstOrError().toObservable().map(new f341((byte) 27));
                    case 25:
                        oh61 oh61Var26 = ((hv5) ifl1Var2.b).a;
                        int i26 = AppProtocolRemoteService.f1;
                        Flowable flowable5 = oh61Var26.h;
                        iu5 iu5Var = ju5.Companion;
                        Objects.requireNonNull(iu5Var);
                        Flowable flowableT3 = flowable5.J(new nh61(iu5Var, (byte) 8)).T(oh61Var26.m.c(4).v());
                        flowableT3.getClass();
                        return new ObservableFromPublisher(flowableT3);
                    case 26:
                        pr5 pr5Var = (pr5) obj;
                        oh61 oh61Var27 = ((hv5) ifl1Var2.b).a;
                        int i27 = AppProtocolRemoteService.f1;
                        cr5 cr5Var2 = oh61Var27.o.c;
                        return Single.create(new u2i0(oh61Var27, pr5Var, cr5Var2.l, cr5Var2.k, true)).toObservable().startWith(oh61Var27.m.b(4, pr5Var).w());
                    case 27:
                        oh61 oh61Var28 = ((hv5) ifl1Var2.b).a;
                        int i28 = AppProtocolRemoteService.f1;
                        return oh61Var28.h.T(oh61Var28.m.c(4).v()).z().toObservable().map(new nh61((byte) 0));
                    case 28:
                        oh61 oh61Var29 = ((hv5) ifl1Var2.b).a;
                        int i29 = AppProtocolRemoteService.f1;
                        return oh61Var29.f();
                    default:
                        ct5 ct5Var = (ct5) obj;
                        oh61 oh61Var30 = ((hv5) ifl1Var2.b).a;
                        int i30 = AppProtocolRemoteService.f1;
                        if (ct5Var != null) {
                            str = ct5Var.b;
                            if ("default".equals(str)) {
                                if ("car".equals(oh61Var30.z.f)) {
                                    str = "default-cars";
                                } else {
                                    str = "default";
                                }
                            }
                        } else if ("car".equals(oh61Var30.z.f)) {
                            str = "default-cars";
                        } else {
                            str = "default";
                        }
                        Observable observableJust = (oh61Var30.o.c.e.equals("com.google.android.apps.maps") && str.equals("default")) ? Observable.just(new yr5(0, 0, 0, z6x.a)) : null;
                        if (observableJust != null) {
                            return observableJust;
                        }
                        oh61Var30.y = str;
                        Bundle bundleG = cy30.g("_type", str);
                        String str7 = oh61Var30.f31p;
                        hlr0 hlr0Var2 = new hlr0();
                        UbiSpecificationId ubiSpecificationId2 = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var3 = oh61Var30.o.c;
                        String str8 = cr5Var3.e;
                        String str9 = cr5Var3.d;
                        m210 m210Var3 = oh61Var30.z;
                        if (m210Var3 == null) {
                            m210Var3 = oh61.D;
                        }
                        return oh61Var30.u.c(new r9c(str, str7, str8, str9, m210Var3, true, true, false, false, hlr0Var2, 2, 1, ubiSpecificationId2, (String) null, false, false, false), bundleG).map(new nh61((byte) 7)).toObservable().startWith(oh61Var30.m.c(8).w()).doOnSubscribe(new fv5(oh61Var30, (byte) 19));
                }
            }
        }));
        final byte b9 = 26;
        gv5Var2.accept(new v5y(pr5.class, "com.spotify.get_image", 4, new w5y() { // from class: p.e2s
            /* JADX WARN: Code duplicated, block: B:11:0x0044  */
            /* JADX WARN: Code duplicated, block: B:12:0x0047  */
            /* JADX WARN: Code duplicated, block: B:9:0x0038  */
            @Override // p.w5y
            public final Observable a(Object obj) {
                String str;
                byte b10 = b9;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                wq5 wq5Var = cv5.a;
                final byte b11 = 0;
                final byte b12 = 1;
                ifl1 ifl1Var2 = ifl1Var;
                switch (b10) {
                    case 0:
                        oh61 oh61Var = ((hv5) ifl1Var2.b).a;
                        int i = AppProtocolRemoteService.f1;
                        g510 g510Var = oh61Var.k;
                        m210 m210Var = oh61Var.z;
                        String strP = g510Var.p();
                        if (strP == null) {
                            strP = "";
                        }
                        return g510.q(g510Var, m210Var, g510Var.h.j(strP)).flatMapCompletable(new mh61(oh61Var, (byte) 7)).d(oh61Var.c.b().a().takeUntil(new nh61((byte) 4)).flatMap(new nh61((byte) 5)).timeout(25L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new nh61((byte) 6)));
                    case 1:
                        oh61 oh61Var2 = ((hv5) ifl1Var2.b).a;
                        int i2 = AppProtocolRemoteService.f1;
                        return oh61Var2.h((pu5) obj);
                    case 2:
                        oh61 oh61Var3 = ((hv5) ifl1Var2.b).a;
                        int i3 = AppProtocolRemoteService.f1;
                        return oh61Var3.e.b("type").startWith(new CompletableFromAction(new w43(oh61Var3.m, (byte) 6)).w()).map(new f341((byte) 17)).onErrorResumeNext(new f341((byte) 29));
                    case 3:
                        oh61 oh61Var4 = ((hv5) ifl1Var2.b).a;
                        int i4 = AppProtocolRemoteService.f1;
                        return oh61Var4.i((vu5) obj);
                    case 4:
                        su5 su5Var = (su5) obj;
                        oh61 oh61Var5 = ((hv5) ifl1Var2.b).a;
                        int i5 = AppProtocolRemoteService.f1;
                        return Single.create(new jf11((Object) su5Var, (byte) 18)).flatMap(new h341(oh61Var5, su5Var, (byte) 9)).toObservable().startWith(oh61Var5.m.c(2).w());
                    case 5:
                        final ks5 ks5Var = (ks5) obj;
                        final oh61 oh61Var6 = ((hv5) ifl1Var2.b).a;
                        int i6 = AppProtocolRemoteService.f1;
                        return oh61Var6.k.l(ks5Var.b.longValue(), oh61Var6.z).map(new f341((byte) 23)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b13 = b11;
                                ks5 ks5Var3 = ks5Var;
                                oh61 oh61Var8 = oh61Var6;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b13) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek in song", (byte) 18)).toObservable().startWith(oh61Var6.m.c(1).w());
                    case 6:
                        final ks5 ks5Var2 = (ks5) obj;
                        final oh61 oh61Var7 = ((hv5) ifl1Var2.b).a;
                        int i7 = AppProtocolRemoteService.f1;
                        return oh61Var7.k.k(ks5Var2.b.longValue(), oh61Var7.z).map(new f341((byte) 28)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b13 = b12;
                                ks5 ks5Var3 = ks5Var2;
                                oh61 oh61Var8 = oh61Var7;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b13) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek by in a song", (byte) 18)).toObservable().startWith(oh61Var7.m.c(1).w());
                    case 7:
                        oh61 oh61Var8 = ((hv5) ifl1Var2.b).a;
                        int i8 = AppProtocolRemoteService.f1;
                        dbm dbmVar = oh61Var8.m;
                        Flowable flowable = oh61Var8.h;
                        g510 g510Var2 = oh61Var8.k;
                        Integer num = ((ns5) obj).b;
                        int iIntValue = num.intValue();
                        if (iIntValue == 0) {
                            Flowable flowableT = flowable.T(dbmVar.c(1).v()).T(g510Var2.d(oh61Var8.z).map(new nh61((byte) 19)).flatMapCompletable(new mh61(oh61Var8, (byte) 10)).v());
                            nh61 nh61Var = new nh61((byte) 20);
                            flowableT.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT, nh61Var).x(new nh61((byte) 21)).J(new nh61((byte) 22)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 23));
                        }
                        if (iIntValue == 1) {
                            Flowable flowableT2 = flowable.T(dbmVar.c(1).v()).T(g510Var2.j(oh61Var8.z).map(new nh61((byte) 13)).flatMapCompletable(new mh61(oh61Var8, (byte) 9)).v());
                            nh61 nh61Var2 = new nh61((byte) 14);
                            flowableT2.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT2, nh61Var2).x(new nh61((byte) 16)).J(new nh61((byte) 17)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 18));
                        }
                        if (iIntValue == 50 || iIntValue == 80 || iIntValue == 100 || iIntValue == 120 || iIntValue == 150 || iIntValue == 200 || iIntValue == 300) {
                            return oh61Var8.j(num.intValue());
                        }
                        return IapException.a("Unexpected playback speed " + num);
                    case 8:
                        oh61 oh61Var9 = ((hv5) ifl1Var2.b).a;
                        int i9 = AppProtocolRemoteService.f1;
                        return oh61Var9.j((int) (((ot5) obj).b.floatValue() * 100.0f));
                    case 9:
                        oh61 oh61Var10 = ((hv5) ifl1Var2.b).a;
                        int i10 = AppProtocolRemoteService.f1;
                        return oh61Var10.k((zs5) obj);
                    case 10:
                        oh61 oh61Var11 = ((hv5) ifl1Var2.b).a;
                        int i11 = AppProtocolRemoteService.f1;
                        Flowable flowable2 = oh61Var11.f;
                        return Observable.combineLatest(x0d.j(flowable2, flowable2).startWith(new CompletableFromAction(new ok70(oh61Var11.m, 4)).w()), yoi1.i(oh61Var11.g.a(o6n.a), o6x.a).startWithItem(Boolean.FALSE).distinctUntilChanged(), new mh61(oh61Var11, (byte) 3));
                    case 11:
                        oh61 oh61Var12 = ((hv5) ifl1Var2.b).a;
                        int i12 = AppProtocolRemoteService.f1;
                        Flowable flowable3 = oh61Var12.h;
                        ObservableFromPublisher observableFromPublisherJ = x0d.j(flowable3, flowable3);
                        ys5 ys5Var = zs5.Companion;
                        Objects.requireNonNull(ys5Var);
                        return observableFromPublisherJ.map(new nh61(ys5Var, (byte) 15)).flatMap(new mh61(oh61Var12, (byte) 11));
                    case 12:
                        ft5 ft5Var = (ft5) obj;
                        oh61 oh61Var13 = ((hv5) ifl1Var2.b).a;
                        int i13 = AppProtocolRemoteService.f1;
                        return oh61Var13.h.T(oh61Var13.m.c(1).v()).z().flatMapCompletable(new h341(oh61Var13, ft5Var, (byte) 6)).d(Observable.just(wq5Var)).startWith(oh61Var13.k.c(oh61Var13.z, ft5Var.d.booleanValue()).ignoreElement().w());
                    case 13:
                        mq5 mq5Var = (mq5) obj;
                        oh61 oh61Var14 = ((hv5) ifl1Var2.b).a;
                        int i14 = AppProtocolRemoteService.f1;
                        Integer num2 = mq5Var.c;
                        int iIntValue2 = num2 == null ? 20 : num2.intValue();
                        String str2 = mq5Var.b;
                        if (str2.equals("spotify:recently-played")) {
                            str2 = "com.spotify.recently-played";
                        } else if (str2.equals("spotify:browse")) {
                            str2 = "com.spotify.browse";
                        }
                        String str3 = str2;
                        c610 c610Var = oh61Var14.u;
                        hlr0 hlr0Var = new hlr0();
                        UbiSpecificationId ubiSpecificationId = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var = oh61Var14.o.c;
                        String str4 = cr5Var.e;
                        String str5 = cr5Var.d;
                        String str6 = oh61Var14.y;
                        m210 m210Var2 = oh61Var14.z;
                        if (m210Var2 == null) {
                            m210Var2 = oh61.D;
                        }
                        return c610Var.c(new r9c(str6, str3, str4, str5, m210Var2, false, true, false, false, hlr0Var, 2, 1, ubiSpecificationId, (String) null, false, false, false), new Bundle()).map(new mp5(mq5Var, iIntValue2, (byte) 8)).doOnError(new fv5(str3, (byte) 21)).toObservable().doOnSubscribe(new po5(oh61Var14, mq5Var, (byte) 5)).startWith(oh61Var14.m.c(8).w());
                    case 14:
                        oh61 oh61Var15 = ((hv5) ifl1Var2.b).a;
                        int i15 = AppProtocolRemoteService.f1;
                        return oh61Var15.l((rt5) obj);
                    case 15:
                        oh61 oh61Var16 = ((hv5) ifl1Var2.b).a;
                        int i16 = AppProtocolRemoteService.f1;
                        Flowable flowable4 = oh61Var16.h;
                        return x0d.j(flowable4, flowable4).map(new nh61((byte) 1)).flatMap(new mh61(oh61Var16, (byte) 4));
                    case 16:
                        oh61 oh61Var17 = ((hv5) ifl1Var2.b).a;
                        int i17 = AppProtocolRemoteService.f1;
                        return oh61Var17.k.n(oh61Var17.z).map(new nh61((byte) 2)).flatMap(new mh61(oh61Var17, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var17.m.c(1).w());
                    case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                        oh61 oh61Var18 = ((hv5) ifl1Var2.b).a;
                        int i18 = AppProtocolRemoteService.f1;
                        return oh61Var18.k.o(oh61Var18.z).map(new f341((byte) 21)).zipWith(oh61Var18.h.z(), new f341((byte) 22)).flatMap(new h341(oh61Var18, (ut5) obj, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var18.m.c(1).w());
                    case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                        jr5 jr5Var = (jr5) obj;
                        oh61 oh61Var19 = ((hv5) ifl1Var2.b).a;
                        int i19 = AppProtocolRemoteService.f1;
                        return Observable.just(jr5Var).startWith(oh61Var19.m.c(1).w()).switchMap(new mh61(oh61Var19, (byte) 1)).flatMapSingle(new mh61(oh61Var19, (byte) 2)).filter(new f341((byte) 24)).map(new f341((byte) 25)).flatMap(new h341(oh61Var19, jr5Var, (byte) 7)).timeout(15L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new f341((byte) 26));
                    case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                        pu5 pu5Var = (pu5) obj;
                        oh61 oh61Var20 = ((hv5) ifl1Var2.b).a;
                        int i20 = AppProtocolRemoteService.f1;
                        Observable observable = oh61Var20.h.T(oh61Var20.m.c(2).v()).z().toObservable();
                        g510 g510Var3 = oh61Var20.k;
                        return observable.startWith(g510.q(g510Var3, oh61Var20.z, g510Var3.h.e(pu5Var.b)).ignoreElement().w()).map(new h341(oh61Var20, pu5Var, (byte) 8));
                    case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                        oh61 oh61Var21 = ((hv5) ifl1Var2.b).a;
                        int i21 = AppProtocolRemoteService.f1;
                        return oh61Var21.c.a.k.b().map(new nh61((byte) 9));
                    case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                        oh61 oh61Var22 = ((hv5) ifl1Var2.b).a;
                        int i22 = AppProtocolRemoteService.f1;
                        return oh61Var22.m.c(4).d(Observable.just(new ws5()));
                    case 22:
                        oh61 oh61Var23 = ((hv5) ifl1Var2.b).a;
                        int i23 = AppProtocolRemoteService.f1;
                        return oh61Var23.i((vu5) obj);
                    case 23:
                        oh61 oh61Var24 = ((hv5) ifl1Var2.b).a;
                        int i24 = AppProtocolRemoteService.f1;
                        return oh61Var24.l.a(((sr5) obj).b.intValue(), oh61Var24.z).q(oh61Var24.m.c(1)).d(Observable.just(wq5Var));
                    case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                        oh61 oh61Var25 = ((hv5) ifl1Var2.b).a;
                        int i25 = AppProtocolRemoteService.f1;
                        return new poj0(oh61Var25.c, oh61Var25.j, oh61Var25.h, oh61Var25.n, (byte) 10).r(oh61Var25.a.getResources()).startWith(oh61Var25.m.c(4).w()).firstOrError().toObservable().map(new f341((byte) 27));
                    case 25:
                        oh61 oh61Var26 = ((hv5) ifl1Var2.b).a;
                        int i26 = AppProtocolRemoteService.f1;
                        Flowable flowable5 = oh61Var26.h;
                        iu5 iu5Var = ju5.Companion;
                        Objects.requireNonNull(iu5Var);
                        Flowable flowableT3 = flowable5.J(new nh61(iu5Var, (byte) 8)).T(oh61Var26.m.c(4).v());
                        flowableT3.getClass();
                        return new ObservableFromPublisher(flowableT3);
                    case 26:
                        pr5 pr5Var = (pr5) obj;
                        oh61 oh61Var27 = ((hv5) ifl1Var2.b).a;
                        int i27 = AppProtocolRemoteService.f1;
                        cr5 cr5Var2 = oh61Var27.o.c;
                        return Single.create(new u2i0(oh61Var27, pr5Var, cr5Var2.l, cr5Var2.k, true)).toObservable().startWith(oh61Var27.m.b(4, pr5Var).w());
                    case 27:
                        oh61 oh61Var28 = ((hv5) ifl1Var2.b).a;
                        int i28 = AppProtocolRemoteService.f1;
                        return oh61Var28.h.T(oh61Var28.m.c(4).v()).z().toObservable().map(new nh61((byte) 0));
                    case 28:
                        oh61 oh61Var29 = ((hv5) ifl1Var2.b).a;
                        int i29 = AppProtocolRemoteService.f1;
                        return oh61Var29.f();
                    default:
                        ct5 ct5Var = (ct5) obj;
                        oh61 oh61Var30 = ((hv5) ifl1Var2.b).a;
                        int i30 = AppProtocolRemoteService.f1;
                        if (ct5Var != null) {
                            str = ct5Var.b;
                            if ("default".equals(str)) {
                                if ("car".equals(oh61Var30.z.f)) {
                                    str = "default-cars";
                                } else {
                                    str = "default";
                                }
                            }
                        } else if ("car".equals(oh61Var30.z.f)) {
                            str = "default-cars";
                        } else {
                            str = "default";
                        }
                        Observable observableJust = (oh61Var30.o.c.e.equals("com.google.android.apps.maps") && str.equals("default")) ? Observable.just(new yr5(0, 0, 0, z6x.a)) : null;
                        if (observableJust != null) {
                            return observableJust;
                        }
                        oh61Var30.y = str;
                        Bundle bundleG = cy30.g("_type", str);
                        String str7 = oh61Var30.f31p;
                        hlr0 hlr0Var2 = new hlr0();
                        UbiSpecificationId ubiSpecificationId2 = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var3 = oh61Var30.o.c;
                        String str8 = cr5Var3.e;
                        String str9 = cr5Var3.d;
                        m210 m210Var3 = oh61Var30.z;
                        if (m210Var3 == null) {
                            m210Var3 = oh61.D;
                        }
                        return oh61Var30.u.c(new r9c(str, str7, str8, str9, m210Var3, true, true, false, false, hlr0Var2, 2, 1, ubiSpecificationId2, (String) null, false, false, false), bundleG).map(new nh61((byte) 7)).toObservable().startWith(oh61Var30.m.c(8).w()).doOnSubscribe(new fv5(oh61Var30, (byte) 19));
                }
            }
        }));
        final byte b10 = 27;
        gv5Var2.accept(new v5y(wq5.class, "com.spotify.get_playback_speed", 4, new w5y() { // from class: p.e2s
            /* JADX WARN: Code duplicated, block: B:11:0x0044  */
            /* JADX WARN: Code duplicated, block: B:12:0x0047  */
            /* JADX WARN: Code duplicated, block: B:9:0x0038  */
            @Override // p.w5y
            public final Observable a(Object obj) {
                String str;
                byte b11 = b10;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                wq5 wq5Var = cv5.a;
                final byte b12 = 0;
                final byte b13 = 1;
                ifl1 ifl1Var2 = ifl1Var;
                switch (b11) {
                    case 0:
                        oh61 oh61Var = ((hv5) ifl1Var2.b).a;
                        int i = AppProtocolRemoteService.f1;
                        g510 g510Var = oh61Var.k;
                        m210 m210Var = oh61Var.z;
                        String strP = g510Var.p();
                        if (strP == null) {
                            strP = "";
                        }
                        return g510.q(g510Var, m210Var, g510Var.h.j(strP)).flatMapCompletable(new mh61(oh61Var, (byte) 7)).d(oh61Var.c.b().a().takeUntil(new nh61((byte) 4)).flatMap(new nh61((byte) 5)).timeout(25L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new nh61((byte) 6)));
                    case 1:
                        oh61 oh61Var2 = ((hv5) ifl1Var2.b).a;
                        int i2 = AppProtocolRemoteService.f1;
                        return oh61Var2.h((pu5) obj);
                    case 2:
                        oh61 oh61Var3 = ((hv5) ifl1Var2.b).a;
                        int i3 = AppProtocolRemoteService.f1;
                        return oh61Var3.e.b("type").startWith(new CompletableFromAction(new w43(oh61Var3.m, (byte) 6)).w()).map(new f341((byte) 17)).onErrorResumeNext(new f341((byte) 29));
                    case 3:
                        oh61 oh61Var4 = ((hv5) ifl1Var2.b).a;
                        int i4 = AppProtocolRemoteService.f1;
                        return oh61Var4.i((vu5) obj);
                    case 4:
                        su5 su5Var = (su5) obj;
                        oh61 oh61Var5 = ((hv5) ifl1Var2.b).a;
                        int i5 = AppProtocolRemoteService.f1;
                        return Single.create(new jf11((Object) su5Var, (byte) 18)).flatMap(new h341(oh61Var5, su5Var, (byte) 9)).toObservable().startWith(oh61Var5.m.c(2).w());
                    case 5:
                        final ks5 ks5Var = (ks5) obj;
                        final oh61 oh61Var6 = ((hv5) ifl1Var2.b).a;
                        int i6 = AppProtocolRemoteService.f1;
                        return oh61Var6.k.l(ks5Var.b.longValue(), oh61Var6.z).map(new f341((byte) 23)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b14 = b12;
                                ks5 ks5Var3 = ks5Var;
                                oh61 oh61Var8 = oh61Var6;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b14) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek in song", (byte) 18)).toObservable().startWith(oh61Var6.m.c(1).w());
                    case 6:
                        final ks5 ks5Var2 = (ks5) obj;
                        final oh61 oh61Var7 = ((hv5) ifl1Var2.b).a;
                        int i7 = AppProtocolRemoteService.f1;
                        return oh61Var7.k.k(ks5Var2.b.longValue(), oh61Var7.z).map(new f341((byte) 28)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b14 = b13;
                                ks5 ks5Var3 = ks5Var2;
                                oh61 oh61Var8 = oh61Var7;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b14) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek by in a song", (byte) 18)).toObservable().startWith(oh61Var7.m.c(1).w());
                    case 7:
                        oh61 oh61Var8 = ((hv5) ifl1Var2.b).a;
                        int i8 = AppProtocolRemoteService.f1;
                        dbm dbmVar = oh61Var8.m;
                        Flowable flowable = oh61Var8.h;
                        g510 g510Var2 = oh61Var8.k;
                        Integer num = ((ns5) obj).b;
                        int iIntValue = num.intValue();
                        if (iIntValue == 0) {
                            Flowable flowableT = flowable.T(dbmVar.c(1).v()).T(g510Var2.d(oh61Var8.z).map(new nh61((byte) 19)).flatMapCompletable(new mh61(oh61Var8, (byte) 10)).v());
                            nh61 nh61Var = new nh61((byte) 20);
                            flowableT.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT, nh61Var).x(new nh61((byte) 21)).J(new nh61((byte) 22)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 23));
                        }
                        if (iIntValue == 1) {
                            Flowable flowableT2 = flowable.T(dbmVar.c(1).v()).T(g510Var2.j(oh61Var8.z).map(new nh61((byte) 13)).flatMapCompletable(new mh61(oh61Var8, (byte) 9)).v());
                            nh61 nh61Var2 = new nh61((byte) 14);
                            flowableT2.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT2, nh61Var2).x(new nh61((byte) 16)).J(new nh61((byte) 17)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 18));
                        }
                        if (iIntValue == 50 || iIntValue == 80 || iIntValue == 100 || iIntValue == 120 || iIntValue == 150 || iIntValue == 200 || iIntValue == 300) {
                            return oh61Var8.j(num.intValue());
                        }
                        return IapException.a("Unexpected playback speed " + num);
                    case 8:
                        oh61 oh61Var9 = ((hv5) ifl1Var2.b).a;
                        int i9 = AppProtocolRemoteService.f1;
                        return oh61Var9.j((int) (((ot5) obj).b.floatValue() * 100.0f));
                    case 9:
                        oh61 oh61Var10 = ((hv5) ifl1Var2.b).a;
                        int i10 = AppProtocolRemoteService.f1;
                        return oh61Var10.k((zs5) obj);
                    case 10:
                        oh61 oh61Var11 = ((hv5) ifl1Var2.b).a;
                        int i11 = AppProtocolRemoteService.f1;
                        Flowable flowable2 = oh61Var11.f;
                        return Observable.combineLatest(x0d.j(flowable2, flowable2).startWith(new CompletableFromAction(new ok70(oh61Var11.m, 4)).w()), yoi1.i(oh61Var11.g.a(o6n.a), o6x.a).startWithItem(Boolean.FALSE).distinctUntilChanged(), new mh61(oh61Var11, (byte) 3));
                    case 11:
                        oh61 oh61Var12 = ((hv5) ifl1Var2.b).a;
                        int i12 = AppProtocolRemoteService.f1;
                        Flowable flowable3 = oh61Var12.h;
                        ObservableFromPublisher observableFromPublisherJ = x0d.j(flowable3, flowable3);
                        ys5 ys5Var = zs5.Companion;
                        Objects.requireNonNull(ys5Var);
                        return observableFromPublisherJ.map(new nh61(ys5Var, (byte) 15)).flatMap(new mh61(oh61Var12, (byte) 11));
                    case 12:
                        ft5 ft5Var = (ft5) obj;
                        oh61 oh61Var13 = ((hv5) ifl1Var2.b).a;
                        int i13 = AppProtocolRemoteService.f1;
                        return oh61Var13.h.T(oh61Var13.m.c(1).v()).z().flatMapCompletable(new h341(oh61Var13, ft5Var, (byte) 6)).d(Observable.just(wq5Var)).startWith(oh61Var13.k.c(oh61Var13.z, ft5Var.d.booleanValue()).ignoreElement().w());
                    case 13:
                        mq5 mq5Var = (mq5) obj;
                        oh61 oh61Var14 = ((hv5) ifl1Var2.b).a;
                        int i14 = AppProtocolRemoteService.f1;
                        Integer num2 = mq5Var.c;
                        int iIntValue2 = num2 == null ? 20 : num2.intValue();
                        String str2 = mq5Var.b;
                        if (str2.equals("spotify:recently-played")) {
                            str2 = "com.spotify.recently-played";
                        } else if (str2.equals("spotify:browse")) {
                            str2 = "com.spotify.browse";
                        }
                        String str3 = str2;
                        c610 c610Var = oh61Var14.u;
                        hlr0 hlr0Var = new hlr0();
                        UbiSpecificationId ubiSpecificationId = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var = oh61Var14.o.c;
                        String str4 = cr5Var.e;
                        String str5 = cr5Var.d;
                        String str6 = oh61Var14.y;
                        m210 m210Var2 = oh61Var14.z;
                        if (m210Var2 == null) {
                            m210Var2 = oh61.D;
                        }
                        return c610Var.c(new r9c(str6, str3, str4, str5, m210Var2, false, true, false, false, hlr0Var, 2, 1, ubiSpecificationId, (String) null, false, false, false), new Bundle()).map(new mp5(mq5Var, iIntValue2, (byte) 8)).doOnError(new fv5(str3, (byte) 21)).toObservable().doOnSubscribe(new po5(oh61Var14, mq5Var, (byte) 5)).startWith(oh61Var14.m.c(8).w());
                    case 14:
                        oh61 oh61Var15 = ((hv5) ifl1Var2.b).a;
                        int i15 = AppProtocolRemoteService.f1;
                        return oh61Var15.l((rt5) obj);
                    case 15:
                        oh61 oh61Var16 = ((hv5) ifl1Var2.b).a;
                        int i16 = AppProtocolRemoteService.f1;
                        Flowable flowable4 = oh61Var16.h;
                        return x0d.j(flowable4, flowable4).map(new nh61((byte) 1)).flatMap(new mh61(oh61Var16, (byte) 4));
                    case 16:
                        oh61 oh61Var17 = ((hv5) ifl1Var2.b).a;
                        int i17 = AppProtocolRemoteService.f1;
                        return oh61Var17.k.n(oh61Var17.z).map(new nh61((byte) 2)).flatMap(new mh61(oh61Var17, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var17.m.c(1).w());
                    case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                        oh61 oh61Var18 = ((hv5) ifl1Var2.b).a;
                        int i18 = AppProtocolRemoteService.f1;
                        return oh61Var18.k.o(oh61Var18.z).map(new f341((byte) 21)).zipWith(oh61Var18.h.z(), new f341((byte) 22)).flatMap(new h341(oh61Var18, (ut5) obj, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var18.m.c(1).w());
                    case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                        jr5 jr5Var = (jr5) obj;
                        oh61 oh61Var19 = ((hv5) ifl1Var2.b).a;
                        int i19 = AppProtocolRemoteService.f1;
                        return Observable.just(jr5Var).startWith(oh61Var19.m.c(1).w()).switchMap(new mh61(oh61Var19, (byte) 1)).flatMapSingle(new mh61(oh61Var19, (byte) 2)).filter(new f341((byte) 24)).map(new f341((byte) 25)).flatMap(new h341(oh61Var19, jr5Var, (byte) 7)).timeout(15L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new f341((byte) 26));
                    case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                        pu5 pu5Var = (pu5) obj;
                        oh61 oh61Var20 = ((hv5) ifl1Var2.b).a;
                        int i20 = AppProtocolRemoteService.f1;
                        Observable observable = oh61Var20.h.T(oh61Var20.m.c(2).v()).z().toObservable();
                        g510 g510Var3 = oh61Var20.k;
                        return observable.startWith(g510.q(g510Var3, oh61Var20.z, g510Var3.h.e(pu5Var.b)).ignoreElement().w()).map(new h341(oh61Var20, pu5Var, (byte) 8));
                    case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                        oh61 oh61Var21 = ((hv5) ifl1Var2.b).a;
                        int i21 = AppProtocolRemoteService.f1;
                        return oh61Var21.c.a.k.b().map(new nh61((byte) 9));
                    case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                        oh61 oh61Var22 = ((hv5) ifl1Var2.b).a;
                        int i22 = AppProtocolRemoteService.f1;
                        return oh61Var22.m.c(4).d(Observable.just(new ws5()));
                    case 22:
                        oh61 oh61Var23 = ((hv5) ifl1Var2.b).a;
                        int i23 = AppProtocolRemoteService.f1;
                        return oh61Var23.i((vu5) obj);
                    case 23:
                        oh61 oh61Var24 = ((hv5) ifl1Var2.b).a;
                        int i24 = AppProtocolRemoteService.f1;
                        return oh61Var24.l.a(((sr5) obj).b.intValue(), oh61Var24.z).q(oh61Var24.m.c(1)).d(Observable.just(wq5Var));
                    case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                        oh61 oh61Var25 = ((hv5) ifl1Var2.b).a;
                        int i25 = AppProtocolRemoteService.f1;
                        return new poj0(oh61Var25.c, oh61Var25.j, oh61Var25.h, oh61Var25.n, (byte) 10).r(oh61Var25.a.getResources()).startWith(oh61Var25.m.c(4).w()).firstOrError().toObservable().map(new f341((byte) 27));
                    case 25:
                        oh61 oh61Var26 = ((hv5) ifl1Var2.b).a;
                        int i26 = AppProtocolRemoteService.f1;
                        Flowable flowable5 = oh61Var26.h;
                        iu5 iu5Var = ju5.Companion;
                        Objects.requireNonNull(iu5Var);
                        Flowable flowableT3 = flowable5.J(new nh61(iu5Var, (byte) 8)).T(oh61Var26.m.c(4).v());
                        flowableT3.getClass();
                        return new ObservableFromPublisher(flowableT3);
                    case 26:
                        pr5 pr5Var = (pr5) obj;
                        oh61 oh61Var27 = ((hv5) ifl1Var2.b).a;
                        int i27 = AppProtocolRemoteService.f1;
                        cr5 cr5Var2 = oh61Var27.o.c;
                        return Single.create(new u2i0(oh61Var27, pr5Var, cr5Var2.l, cr5Var2.k, true)).toObservable().startWith(oh61Var27.m.b(4, pr5Var).w());
                    case 27:
                        oh61 oh61Var28 = ((hv5) ifl1Var2.b).a;
                        int i28 = AppProtocolRemoteService.f1;
                        return oh61Var28.h.T(oh61Var28.m.c(4).v()).z().toObservable().map(new nh61((byte) 0));
                    case 28:
                        oh61 oh61Var29 = ((hv5) ifl1Var2.b).a;
                        int i29 = AppProtocolRemoteService.f1;
                        return oh61Var29.f();
                    default:
                        ct5 ct5Var = (ct5) obj;
                        oh61 oh61Var30 = ((hv5) ifl1Var2.b).a;
                        int i30 = AppProtocolRemoteService.f1;
                        if (ct5Var != null) {
                            str = ct5Var.b;
                            if ("default".equals(str)) {
                                if ("car".equals(oh61Var30.z.f)) {
                                    str = "default-cars";
                                } else {
                                    str = "default";
                                }
                            }
                        } else if ("car".equals(oh61Var30.z.f)) {
                            str = "default-cars";
                        } else {
                            str = "default";
                        }
                        Observable observableJust = (oh61Var30.o.c.e.equals("com.google.android.apps.maps") && str.equals("default")) ? Observable.just(new yr5(0, 0, 0, z6x.a)) : null;
                        if (observableJust != null) {
                            return observableJust;
                        }
                        oh61Var30.y = str;
                        Bundle bundleG = cy30.g("_type", str);
                        String str7 = oh61Var30.f31p;
                        hlr0 hlr0Var2 = new hlr0();
                        UbiSpecificationId ubiSpecificationId2 = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var3 = oh61Var30.o.c;
                        String str8 = cr5Var3.e;
                        String str9 = cr5Var3.d;
                        m210 m210Var3 = oh61Var30.z;
                        if (m210Var3 == null) {
                            m210Var3 = oh61.D;
                        }
                        return oh61Var30.u.c(new r9c(str, str7, str8, str9, m210Var3, true, true, false, false, hlr0Var2, 2, 1, ubiSpecificationId2, (String) null, false, false, false), bundleG).map(new nh61((byte) 7)).toObservable().startWith(oh61Var30.m.c(8).w()).doOnSubscribe(new fv5(oh61Var30, (byte) 19));
                }
            }
        }));
        final byte b11 = 28;
        gv5Var2.accept(new v5y(wq5.class, "com.spotify.get_player_state", 4, new w5y() { // from class: p.e2s
            /* JADX WARN: Code duplicated, block: B:11:0x0044  */
            /* JADX WARN: Code duplicated, block: B:12:0x0047  */
            /* JADX WARN: Code duplicated, block: B:9:0x0038  */
            @Override // p.w5y
            public final Observable a(Object obj) {
                String str;
                byte b12 = b11;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                wq5 wq5Var = cv5.a;
                final byte b13 = 0;
                final byte b14 = 1;
                ifl1 ifl1Var2 = ifl1Var;
                switch (b12) {
                    case 0:
                        oh61 oh61Var = ((hv5) ifl1Var2.b).a;
                        int i = AppProtocolRemoteService.f1;
                        g510 g510Var = oh61Var.k;
                        m210 m210Var = oh61Var.z;
                        String strP = g510Var.p();
                        if (strP == null) {
                            strP = "";
                        }
                        return g510.q(g510Var, m210Var, g510Var.h.j(strP)).flatMapCompletable(new mh61(oh61Var, (byte) 7)).d(oh61Var.c.b().a().takeUntil(new nh61((byte) 4)).flatMap(new nh61((byte) 5)).timeout(25L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new nh61((byte) 6)));
                    case 1:
                        oh61 oh61Var2 = ((hv5) ifl1Var2.b).a;
                        int i2 = AppProtocolRemoteService.f1;
                        return oh61Var2.h((pu5) obj);
                    case 2:
                        oh61 oh61Var3 = ((hv5) ifl1Var2.b).a;
                        int i3 = AppProtocolRemoteService.f1;
                        return oh61Var3.e.b("type").startWith(new CompletableFromAction(new w43(oh61Var3.m, (byte) 6)).w()).map(new f341((byte) 17)).onErrorResumeNext(new f341((byte) 29));
                    case 3:
                        oh61 oh61Var4 = ((hv5) ifl1Var2.b).a;
                        int i4 = AppProtocolRemoteService.f1;
                        return oh61Var4.i((vu5) obj);
                    case 4:
                        su5 su5Var = (su5) obj;
                        oh61 oh61Var5 = ((hv5) ifl1Var2.b).a;
                        int i5 = AppProtocolRemoteService.f1;
                        return Single.create(new jf11((Object) su5Var, (byte) 18)).flatMap(new h341(oh61Var5, su5Var, (byte) 9)).toObservable().startWith(oh61Var5.m.c(2).w());
                    case 5:
                        final ks5 ks5Var = (ks5) obj;
                        final oh61 oh61Var6 = ((hv5) ifl1Var2.b).a;
                        int i6 = AppProtocolRemoteService.f1;
                        return oh61Var6.k.l(ks5Var.b.longValue(), oh61Var6.z).map(new f341((byte) 23)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b15 = b13;
                                ks5 ks5Var3 = ks5Var;
                                oh61 oh61Var8 = oh61Var6;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b15) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek in song", (byte) 18)).toObservable().startWith(oh61Var6.m.c(1).w());
                    case 6:
                        final ks5 ks5Var2 = (ks5) obj;
                        final oh61 oh61Var7 = ((hv5) ifl1Var2.b).a;
                        int i7 = AppProtocolRemoteService.f1;
                        return oh61Var7.k.k(ks5Var2.b.longValue(), oh61Var7.z).map(new f341((byte) 28)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b15 = b14;
                                ks5 ks5Var3 = ks5Var2;
                                oh61 oh61Var8 = oh61Var7;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b15) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek by in a song", (byte) 18)).toObservable().startWith(oh61Var7.m.c(1).w());
                    case 7:
                        oh61 oh61Var8 = ((hv5) ifl1Var2.b).a;
                        int i8 = AppProtocolRemoteService.f1;
                        dbm dbmVar = oh61Var8.m;
                        Flowable flowable = oh61Var8.h;
                        g510 g510Var2 = oh61Var8.k;
                        Integer num = ((ns5) obj).b;
                        int iIntValue = num.intValue();
                        if (iIntValue == 0) {
                            Flowable flowableT = flowable.T(dbmVar.c(1).v()).T(g510Var2.d(oh61Var8.z).map(new nh61((byte) 19)).flatMapCompletable(new mh61(oh61Var8, (byte) 10)).v());
                            nh61 nh61Var = new nh61((byte) 20);
                            flowableT.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT, nh61Var).x(new nh61((byte) 21)).J(new nh61((byte) 22)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 23));
                        }
                        if (iIntValue == 1) {
                            Flowable flowableT2 = flowable.T(dbmVar.c(1).v()).T(g510Var2.j(oh61Var8.z).map(new nh61((byte) 13)).flatMapCompletable(new mh61(oh61Var8, (byte) 9)).v());
                            nh61 nh61Var2 = new nh61((byte) 14);
                            flowableT2.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT2, nh61Var2).x(new nh61((byte) 16)).J(new nh61((byte) 17)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 18));
                        }
                        if (iIntValue == 50 || iIntValue == 80 || iIntValue == 100 || iIntValue == 120 || iIntValue == 150 || iIntValue == 200 || iIntValue == 300) {
                            return oh61Var8.j(num.intValue());
                        }
                        return IapException.a("Unexpected playback speed " + num);
                    case 8:
                        oh61 oh61Var9 = ((hv5) ifl1Var2.b).a;
                        int i9 = AppProtocolRemoteService.f1;
                        return oh61Var9.j((int) (((ot5) obj).b.floatValue() * 100.0f));
                    case 9:
                        oh61 oh61Var10 = ((hv5) ifl1Var2.b).a;
                        int i10 = AppProtocolRemoteService.f1;
                        return oh61Var10.k((zs5) obj);
                    case 10:
                        oh61 oh61Var11 = ((hv5) ifl1Var2.b).a;
                        int i11 = AppProtocolRemoteService.f1;
                        Flowable flowable2 = oh61Var11.f;
                        return Observable.combineLatest(x0d.j(flowable2, flowable2).startWith(new CompletableFromAction(new ok70(oh61Var11.m, 4)).w()), yoi1.i(oh61Var11.g.a(o6n.a), o6x.a).startWithItem(Boolean.FALSE).distinctUntilChanged(), new mh61(oh61Var11, (byte) 3));
                    case 11:
                        oh61 oh61Var12 = ((hv5) ifl1Var2.b).a;
                        int i12 = AppProtocolRemoteService.f1;
                        Flowable flowable3 = oh61Var12.h;
                        ObservableFromPublisher observableFromPublisherJ = x0d.j(flowable3, flowable3);
                        ys5 ys5Var = zs5.Companion;
                        Objects.requireNonNull(ys5Var);
                        return observableFromPublisherJ.map(new nh61(ys5Var, (byte) 15)).flatMap(new mh61(oh61Var12, (byte) 11));
                    case 12:
                        ft5 ft5Var = (ft5) obj;
                        oh61 oh61Var13 = ((hv5) ifl1Var2.b).a;
                        int i13 = AppProtocolRemoteService.f1;
                        return oh61Var13.h.T(oh61Var13.m.c(1).v()).z().flatMapCompletable(new h341(oh61Var13, ft5Var, (byte) 6)).d(Observable.just(wq5Var)).startWith(oh61Var13.k.c(oh61Var13.z, ft5Var.d.booleanValue()).ignoreElement().w());
                    case 13:
                        mq5 mq5Var = (mq5) obj;
                        oh61 oh61Var14 = ((hv5) ifl1Var2.b).a;
                        int i14 = AppProtocolRemoteService.f1;
                        Integer num2 = mq5Var.c;
                        int iIntValue2 = num2 == null ? 20 : num2.intValue();
                        String str2 = mq5Var.b;
                        if (str2.equals("spotify:recently-played")) {
                            str2 = "com.spotify.recently-played";
                        } else if (str2.equals("spotify:browse")) {
                            str2 = "com.spotify.browse";
                        }
                        String str3 = str2;
                        c610 c610Var = oh61Var14.u;
                        hlr0 hlr0Var = new hlr0();
                        UbiSpecificationId ubiSpecificationId = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var = oh61Var14.o.c;
                        String str4 = cr5Var.e;
                        String str5 = cr5Var.d;
                        String str6 = oh61Var14.y;
                        m210 m210Var2 = oh61Var14.z;
                        if (m210Var2 == null) {
                            m210Var2 = oh61.D;
                        }
                        return c610Var.c(new r9c(str6, str3, str4, str5, m210Var2, false, true, false, false, hlr0Var, 2, 1, ubiSpecificationId, (String) null, false, false, false), new Bundle()).map(new mp5(mq5Var, iIntValue2, (byte) 8)).doOnError(new fv5(str3, (byte) 21)).toObservable().doOnSubscribe(new po5(oh61Var14, mq5Var, (byte) 5)).startWith(oh61Var14.m.c(8).w());
                    case 14:
                        oh61 oh61Var15 = ((hv5) ifl1Var2.b).a;
                        int i15 = AppProtocolRemoteService.f1;
                        return oh61Var15.l((rt5) obj);
                    case 15:
                        oh61 oh61Var16 = ((hv5) ifl1Var2.b).a;
                        int i16 = AppProtocolRemoteService.f1;
                        Flowable flowable4 = oh61Var16.h;
                        return x0d.j(flowable4, flowable4).map(new nh61((byte) 1)).flatMap(new mh61(oh61Var16, (byte) 4));
                    case 16:
                        oh61 oh61Var17 = ((hv5) ifl1Var2.b).a;
                        int i17 = AppProtocolRemoteService.f1;
                        return oh61Var17.k.n(oh61Var17.z).map(new nh61((byte) 2)).flatMap(new mh61(oh61Var17, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var17.m.c(1).w());
                    case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                        oh61 oh61Var18 = ((hv5) ifl1Var2.b).a;
                        int i18 = AppProtocolRemoteService.f1;
                        return oh61Var18.k.o(oh61Var18.z).map(new f341((byte) 21)).zipWith(oh61Var18.h.z(), new f341((byte) 22)).flatMap(new h341(oh61Var18, (ut5) obj, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var18.m.c(1).w());
                    case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                        jr5 jr5Var = (jr5) obj;
                        oh61 oh61Var19 = ((hv5) ifl1Var2.b).a;
                        int i19 = AppProtocolRemoteService.f1;
                        return Observable.just(jr5Var).startWith(oh61Var19.m.c(1).w()).switchMap(new mh61(oh61Var19, (byte) 1)).flatMapSingle(new mh61(oh61Var19, (byte) 2)).filter(new f341((byte) 24)).map(new f341((byte) 25)).flatMap(new h341(oh61Var19, jr5Var, (byte) 7)).timeout(15L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new f341((byte) 26));
                    case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                        pu5 pu5Var = (pu5) obj;
                        oh61 oh61Var20 = ((hv5) ifl1Var2.b).a;
                        int i20 = AppProtocolRemoteService.f1;
                        Observable observable = oh61Var20.h.T(oh61Var20.m.c(2).v()).z().toObservable();
                        g510 g510Var3 = oh61Var20.k;
                        return observable.startWith(g510.q(g510Var3, oh61Var20.z, g510Var3.h.e(pu5Var.b)).ignoreElement().w()).map(new h341(oh61Var20, pu5Var, (byte) 8));
                    case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                        oh61 oh61Var21 = ((hv5) ifl1Var2.b).a;
                        int i21 = AppProtocolRemoteService.f1;
                        return oh61Var21.c.a.k.b().map(new nh61((byte) 9));
                    case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                        oh61 oh61Var22 = ((hv5) ifl1Var2.b).a;
                        int i22 = AppProtocolRemoteService.f1;
                        return oh61Var22.m.c(4).d(Observable.just(new ws5()));
                    case 22:
                        oh61 oh61Var23 = ((hv5) ifl1Var2.b).a;
                        int i23 = AppProtocolRemoteService.f1;
                        return oh61Var23.i((vu5) obj);
                    case 23:
                        oh61 oh61Var24 = ((hv5) ifl1Var2.b).a;
                        int i24 = AppProtocolRemoteService.f1;
                        return oh61Var24.l.a(((sr5) obj).b.intValue(), oh61Var24.z).q(oh61Var24.m.c(1)).d(Observable.just(wq5Var));
                    case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                        oh61 oh61Var25 = ((hv5) ifl1Var2.b).a;
                        int i25 = AppProtocolRemoteService.f1;
                        return new poj0(oh61Var25.c, oh61Var25.j, oh61Var25.h, oh61Var25.n, (byte) 10).r(oh61Var25.a.getResources()).startWith(oh61Var25.m.c(4).w()).firstOrError().toObservable().map(new f341((byte) 27));
                    case 25:
                        oh61 oh61Var26 = ((hv5) ifl1Var2.b).a;
                        int i26 = AppProtocolRemoteService.f1;
                        Flowable flowable5 = oh61Var26.h;
                        iu5 iu5Var = ju5.Companion;
                        Objects.requireNonNull(iu5Var);
                        Flowable flowableT3 = flowable5.J(new nh61(iu5Var, (byte) 8)).T(oh61Var26.m.c(4).v());
                        flowableT3.getClass();
                        return new ObservableFromPublisher(flowableT3);
                    case 26:
                        pr5 pr5Var = (pr5) obj;
                        oh61 oh61Var27 = ((hv5) ifl1Var2.b).a;
                        int i27 = AppProtocolRemoteService.f1;
                        cr5 cr5Var2 = oh61Var27.o.c;
                        return Single.create(new u2i0(oh61Var27, pr5Var, cr5Var2.l, cr5Var2.k, true)).toObservable().startWith(oh61Var27.m.b(4, pr5Var).w());
                    case 27:
                        oh61 oh61Var28 = ((hv5) ifl1Var2.b).a;
                        int i28 = AppProtocolRemoteService.f1;
                        return oh61Var28.h.T(oh61Var28.m.c(4).v()).z().toObservable().map(new nh61((byte) 0));
                    case 28:
                        oh61 oh61Var29 = ((hv5) ifl1Var2.b).a;
                        int i29 = AppProtocolRemoteService.f1;
                        return oh61Var29.f();
                    default:
                        ct5 ct5Var = (ct5) obj;
                        oh61 oh61Var30 = ((hv5) ifl1Var2.b).a;
                        int i30 = AppProtocolRemoteService.f1;
                        if (ct5Var != null) {
                            str = ct5Var.b;
                            if ("default".equals(str)) {
                                if ("car".equals(oh61Var30.z.f)) {
                                    str = "default-cars";
                                } else {
                                    str = "default";
                                }
                            }
                        } else if ("car".equals(oh61Var30.z.f)) {
                            str = "default-cars";
                        } else {
                            str = "default";
                        }
                        Observable observableJust = (oh61Var30.o.c.e.equals("com.google.android.apps.maps") && str.equals("default")) ? Observable.just(new yr5(0, 0, 0, z6x.a)) : null;
                        if (observableJust != null) {
                            return observableJust;
                        }
                        oh61Var30.y = str;
                        Bundle bundleG = cy30.g("_type", str);
                        String str7 = oh61Var30.f31p;
                        hlr0 hlr0Var2 = new hlr0();
                        UbiSpecificationId ubiSpecificationId2 = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var3 = oh61Var30.o.c;
                        String str8 = cr5Var3.e;
                        String str9 = cr5Var3.d;
                        m210 m210Var3 = oh61Var30.z;
                        if (m210Var3 == null) {
                            m210Var3 = oh61.D;
                        }
                        return oh61Var30.u.c(new r9c(str, str7, str8, str9, m210Var3, true, true, false, false, hlr0Var2, 2, 1, ubiSpecificationId2, (String) null, false, false, false), bundleG).map(new nh61((byte) 7)).toObservable().startWith(oh61Var30.m.c(8).w()).doOnSubscribe(new fv5(oh61Var30, (byte) 19));
                }
            }
        }));
        final byte b12 = 29;
        gv5Var2.accept(new v5y(ct5.class, "com.spotify.get_recommended_root_items", 8, new w5y() { // from class: p.e2s
            /* JADX WARN: Code duplicated, block: B:11:0x0044  */
            /* JADX WARN: Code duplicated, block: B:12:0x0047  */
            /* JADX WARN: Code duplicated, block: B:9:0x0038  */
            @Override // p.w5y
            public final Observable a(Object obj) {
                String str;
                byte b13 = b12;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                wq5 wq5Var = cv5.a;
                final byte b14 = 0;
                final byte b15 = 1;
                ifl1 ifl1Var2 = ifl1Var;
                switch (b13) {
                    case 0:
                        oh61 oh61Var = ((hv5) ifl1Var2.b).a;
                        int i = AppProtocolRemoteService.f1;
                        g510 g510Var = oh61Var.k;
                        m210 m210Var = oh61Var.z;
                        String strP = g510Var.p();
                        if (strP == null) {
                            strP = "";
                        }
                        return g510.q(g510Var, m210Var, g510Var.h.j(strP)).flatMapCompletable(new mh61(oh61Var, (byte) 7)).d(oh61Var.c.b().a().takeUntil(new nh61((byte) 4)).flatMap(new nh61((byte) 5)).timeout(25L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new nh61((byte) 6)));
                    case 1:
                        oh61 oh61Var2 = ((hv5) ifl1Var2.b).a;
                        int i2 = AppProtocolRemoteService.f1;
                        return oh61Var2.h((pu5) obj);
                    case 2:
                        oh61 oh61Var3 = ((hv5) ifl1Var2.b).a;
                        int i3 = AppProtocolRemoteService.f1;
                        return oh61Var3.e.b("type").startWith(new CompletableFromAction(new w43(oh61Var3.m, (byte) 6)).w()).map(new f341((byte) 17)).onErrorResumeNext(new f341((byte) 29));
                    case 3:
                        oh61 oh61Var4 = ((hv5) ifl1Var2.b).a;
                        int i4 = AppProtocolRemoteService.f1;
                        return oh61Var4.i((vu5) obj);
                    case 4:
                        su5 su5Var = (su5) obj;
                        oh61 oh61Var5 = ((hv5) ifl1Var2.b).a;
                        int i5 = AppProtocolRemoteService.f1;
                        return Single.create(new jf11((Object) su5Var, (byte) 18)).flatMap(new h341(oh61Var5, su5Var, (byte) 9)).toObservable().startWith(oh61Var5.m.c(2).w());
                    case 5:
                        final ks5 ks5Var = (ks5) obj;
                        final oh61 oh61Var6 = ((hv5) ifl1Var2.b).a;
                        int i6 = AppProtocolRemoteService.f1;
                        return oh61Var6.k.l(ks5Var.b.longValue(), oh61Var6.z).map(new f341((byte) 23)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b16 = b14;
                                ks5 ks5Var3 = ks5Var;
                                oh61 oh61Var8 = oh61Var6;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b16) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek in song", (byte) 18)).toObservable().startWith(oh61Var6.m.c(1).w());
                    case 6:
                        final ks5 ks5Var2 = (ks5) obj;
                        final oh61 oh61Var7 = ((hv5) ifl1Var2.b).a;
                        int i7 = AppProtocolRemoteService.f1;
                        return oh61Var7.k.k(ks5Var2.b.longValue(), oh61Var7.z).map(new f341((byte) 28)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b16 = b15;
                                ks5 ks5Var3 = ks5Var2;
                                oh61 oh61Var8 = oh61Var7;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b16) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek by in a song", (byte) 18)).toObservable().startWith(oh61Var7.m.c(1).w());
                    case 7:
                        oh61 oh61Var8 = ((hv5) ifl1Var2.b).a;
                        int i8 = AppProtocolRemoteService.f1;
                        dbm dbmVar = oh61Var8.m;
                        Flowable flowable = oh61Var8.h;
                        g510 g510Var2 = oh61Var8.k;
                        Integer num = ((ns5) obj).b;
                        int iIntValue = num.intValue();
                        if (iIntValue == 0) {
                            Flowable flowableT = flowable.T(dbmVar.c(1).v()).T(g510Var2.d(oh61Var8.z).map(new nh61((byte) 19)).flatMapCompletable(new mh61(oh61Var8, (byte) 10)).v());
                            nh61 nh61Var = new nh61((byte) 20);
                            flowableT.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT, nh61Var).x(new nh61((byte) 21)).J(new nh61((byte) 22)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 23));
                        }
                        if (iIntValue == 1) {
                            Flowable flowableT2 = flowable.T(dbmVar.c(1).v()).T(g510Var2.j(oh61Var8.z).map(new nh61((byte) 13)).flatMapCompletable(new mh61(oh61Var8, (byte) 9)).v());
                            nh61 nh61Var2 = new nh61((byte) 14);
                            flowableT2.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT2, nh61Var2).x(new nh61((byte) 16)).J(new nh61((byte) 17)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 18));
                        }
                        if (iIntValue == 50 || iIntValue == 80 || iIntValue == 100 || iIntValue == 120 || iIntValue == 150 || iIntValue == 200 || iIntValue == 300) {
                            return oh61Var8.j(num.intValue());
                        }
                        return IapException.a("Unexpected playback speed " + num);
                    case 8:
                        oh61 oh61Var9 = ((hv5) ifl1Var2.b).a;
                        int i9 = AppProtocolRemoteService.f1;
                        return oh61Var9.j((int) (((ot5) obj).b.floatValue() * 100.0f));
                    case 9:
                        oh61 oh61Var10 = ((hv5) ifl1Var2.b).a;
                        int i10 = AppProtocolRemoteService.f1;
                        return oh61Var10.k((zs5) obj);
                    case 10:
                        oh61 oh61Var11 = ((hv5) ifl1Var2.b).a;
                        int i11 = AppProtocolRemoteService.f1;
                        Flowable flowable2 = oh61Var11.f;
                        return Observable.combineLatest(x0d.j(flowable2, flowable2).startWith(new CompletableFromAction(new ok70(oh61Var11.m, 4)).w()), yoi1.i(oh61Var11.g.a(o6n.a), o6x.a).startWithItem(Boolean.FALSE).distinctUntilChanged(), new mh61(oh61Var11, (byte) 3));
                    case 11:
                        oh61 oh61Var12 = ((hv5) ifl1Var2.b).a;
                        int i12 = AppProtocolRemoteService.f1;
                        Flowable flowable3 = oh61Var12.h;
                        ObservableFromPublisher observableFromPublisherJ = x0d.j(flowable3, flowable3);
                        ys5 ys5Var = zs5.Companion;
                        Objects.requireNonNull(ys5Var);
                        return observableFromPublisherJ.map(new nh61(ys5Var, (byte) 15)).flatMap(new mh61(oh61Var12, (byte) 11));
                    case 12:
                        ft5 ft5Var = (ft5) obj;
                        oh61 oh61Var13 = ((hv5) ifl1Var2.b).a;
                        int i13 = AppProtocolRemoteService.f1;
                        return oh61Var13.h.T(oh61Var13.m.c(1).v()).z().flatMapCompletable(new h341(oh61Var13, ft5Var, (byte) 6)).d(Observable.just(wq5Var)).startWith(oh61Var13.k.c(oh61Var13.z, ft5Var.d.booleanValue()).ignoreElement().w());
                    case 13:
                        mq5 mq5Var = (mq5) obj;
                        oh61 oh61Var14 = ((hv5) ifl1Var2.b).a;
                        int i14 = AppProtocolRemoteService.f1;
                        Integer num2 = mq5Var.c;
                        int iIntValue2 = num2 == null ? 20 : num2.intValue();
                        String str2 = mq5Var.b;
                        if (str2.equals("spotify:recently-played")) {
                            str2 = "com.spotify.recently-played";
                        } else if (str2.equals("spotify:browse")) {
                            str2 = "com.spotify.browse";
                        }
                        String str3 = str2;
                        c610 c610Var = oh61Var14.u;
                        hlr0 hlr0Var = new hlr0();
                        UbiSpecificationId ubiSpecificationId = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var = oh61Var14.o.c;
                        String str4 = cr5Var.e;
                        String str5 = cr5Var.d;
                        String str6 = oh61Var14.y;
                        m210 m210Var2 = oh61Var14.z;
                        if (m210Var2 == null) {
                            m210Var2 = oh61.D;
                        }
                        return c610Var.c(new r9c(str6, str3, str4, str5, m210Var2, false, true, false, false, hlr0Var, 2, 1, ubiSpecificationId, (String) null, false, false, false), new Bundle()).map(new mp5(mq5Var, iIntValue2, (byte) 8)).doOnError(new fv5(str3, (byte) 21)).toObservable().doOnSubscribe(new po5(oh61Var14, mq5Var, (byte) 5)).startWith(oh61Var14.m.c(8).w());
                    case 14:
                        oh61 oh61Var15 = ((hv5) ifl1Var2.b).a;
                        int i15 = AppProtocolRemoteService.f1;
                        return oh61Var15.l((rt5) obj);
                    case 15:
                        oh61 oh61Var16 = ((hv5) ifl1Var2.b).a;
                        int i16 = AppProtocolRemoteService.f1;
                        Flowable flowable4 = oh61Var16.h;
                        return x0d.j(flowable4, flowable4).map(new nh61((byte) 1)).flatMap(new mh61(oh61Var16, (byte) 4));
                    case 16:
                        oh61 oh61Var17 = ((hv5) ifl1Var2.b).a;
                        int i17 = AppProtocolRemoteService.f1;
                        return oh61Var17.k.n(oh61Var17.z).map(new nh61((byte) 2)).flatMap(new mh61(oh61Var17, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var17.m.c(1).w());
                    case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                        oh61 oh61Var18 = ((hv5) ifl1Var2.b).a;
                        int i18 = AppProtocolRemoteService.f1;
                        return oh61Var18.k.o(oh61Var18.z).map(new f341((byte) 21)).zipWith(oh61Var18.h.z(), new f341((byte) 22)).flatMap(new h341(oh61Var18, (ut5) obj, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var18.m.c(1).w());
                    case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                        jr5 jr5Var = (jr5) obj;
                        oh61 oh61Var19 = ((hv5) ifl1Var2.b).a;
                        int i19 = AppProtocolRemoteService.f1;
                        return Observable.just(jr5Var).startWith(oh61Var19.m.c(1).w()).switchMap(new mh61(oh61Var19, (byte) 1)).flatMapSingle(new mh61(oh61Var19, (byte) 2)).filter(new f341((byte) 24)).map(new f341((byte) 25)).flatMap(new h341(oh61Var19, jr5Var, (byte) 7)).timeout(15L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new f341((byte) 26));
                    case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                        pu5 pu5Var = (pu5) obj;
                        oh61 oh61Var20 = ((hv5) ifl1Var2.b).a;
                        int i20 = AppProtocolRemoteService.f1;
                        Observable observable = oh61Var20.h.T(oh61Var20.m.c(2).v()).z().toObservable();
                        g510 g510Var3 = oh61Var20.k;
                        return observable.startWith(g510.q(g510Var3, oh61Var20.z, g510Var3.h.e(pu5Var.b)).ignoreElement().w()).map(new h341(oh61Var20, pu5Var, (byte) 8));
                    case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                        oh61 oh61Var21 = ((hv5) ifl1Var2.b).a;
                        int i21 = AppProtocolRemoteService.f1;
                        return oh61Var21.c.a.k.b().map(new nh61((byte) 9));
                    case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                        oh61 oh61Var22 = ((hv5) ifl1Var2.b).a;
                        int i22 = AppProtocolRemoteService.f1;
                        return oh61Var22.m.c(4).d(Observable.just(new ws5()));
                    case 22:
                        oh61 oh61Var23 = ((hv5) ifl1Var2.b).a;
                        int i23 = AppProtocolRemoteService.f1;
                        return oh61Var23.i((vu5) obj);
                    case 23:
                        oh61 oh61Var24 = ((hv5) ifl1Var2.b).a;
                        int i24 = AppProtocolRemoteService.f1;
                        return oh61Var24.l.a(((sr5) obj).b.intValue(), oh61Var24.z).q(oh61Var24.m.c(1)).d(Observable.just(wq5Var));
                    case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                        oh61 oh61Var25 = ((hv5) ifl1Var2.b).a;
                        int i25 = AppProtocolRemoteService.f1;
                        return new poj0(oh61Var25.c, oh61Var25.j, oh61Var25.h, oh61Var25.n, (byte) 10).r(oh61Var25.a.getResources()).startWith(oh61Var25.m.c(4).w()).firstOrError().toObservable().map(new f341((byte) 27));
                    case 25:
                        oh61 oh61Var26 = ((hv5) ifl1Var2.b).a;
                        int i26 = AppProtocolRemoteService.f1;
                        Flowable flowable5 = oh61Var26.h;
                        iu5 iu5Var = ju5.Companion;
                        Objects.requireNonNull(iu5Var);
                        Flowable flowableT3 = flowable5.J(new nh61(iu5Var, (byte) 8)).T(oh61Var26.m.c(4).v());
                        flowableT3.getClass();
                        return new ObservableFromPublisher(flowableT3);
                    case 26:
                        pr5 pr5Var = (pr5) obj;
                        oh61 oh61Var27 = ((hv5) ifl1Var2.b).a;
                        int i27 = AppProtocolRemoteService.f1;
                        cr5 cr5Var2 = oh61Var27.o.c;
                        return Single.create(new u2i0(oh61Var27, pr5Var, cr5Var2.l, cr5Var2.k, true)).toObservable().startWith(oh61Var27.m.b(4, pr5Var).w());
                    case 27:
                        oh61 oh61Var28 = ((hv5) ifl1Var2.b).a;
                        int i28 = AppProtocolRemoteService.f1;
                        return oh61Var28.h.T(oh61Var28.m.c(4).v()).z().toObservable().map(new nh61((byte) 0));
                    case 28:
                        oh61 oh61Var29 = ((hv5) ifl1Var2.b).a;
                        int i29 = AppProtocolRemoteService.f1;
                        return oh61Var29.f();
                    default:
                        ct5 ct5Var = (ct5) obj;
                        oh61 oh61Var30 = ((hv5) ifl1Var2.b).a;
                        int i30 = AppProtocolRemoteService.f1;
                        if (ct5Var != null) {
                            str = ct5Var.b;
                            if ("default".equals(str)) {
                                if ("car".equals(oh61Var30.z.f)) {
                                    str = "default-cars";
                                } else {
                                    str = "default";
                                }
                            }
                        } else if ("car".equals(oh61Var30.z.f)) {
                            str = "default-cars";
                        } else {
                            str = "default";
                        }
                        Observable observableJust = (oh61Var30.o.c.e.equals("com.google.android.apps.maps") && str.equals("default")) ? Observable.just(new yr5(0, 0, 0, z6x.a)) : null;
                        if (observableJust != null) {
                            return observableJust;
                        }
                        oh61Var30.y = str;
                        Bundle bundleG = cy30.g("_type", str);
                        String str7 = oh61Var30.f31p;
                        hlr0 hlr0Var2 = new hlr0();
                        UbiSpecificationId ubiSpecificationId2 = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var3 = oh61Var30.o.c;
                        String str8 = cr5Var3.e;
                        String str9 = cr5Var3.d;
                        m210 m210Var3 = oh61Var30.z;
                        if (m210Var3 == null) {
                            m210Var3 = oh61.D;
                        }
                        return oh61Var30.u.c(new r9c(str, str7, str8, str9, m210Var3, true, true, false, false, hlr0Var2, 2, 1, ubiSpecificationId2, (String) null, false, false, false), bundleG).map(new nh61((byte) 7)).toObservable().startWith(oh61Var30.m.c(8).w()).doOnSubscribe(new fv5(oh61Var30, (byte) 19));
                }
            }
        }));
        gv5Var2.accept(new v5y(jr5.class, "com.spotify.get_saved", 1, new w5y() { // from class: p.f2s
            /* JADX WARN: Code duplicated, block: B:35:0x0152  */
            @Override // p.w5y
            public final Observable a(Object obj) {
                String str;
                Single singleB;
                byte b13 = b2;
                ifl1 ifl1Var2 = ifl1Var;
                switch (b13) {
                    case 0:
                        jr5 jr5Var = (jr5) obj;
                        oh61 oh61Var = ((hv5) ifl1Var2.b).a;
                        int i = AppProtocolRemoteService.f1;
                        if (jr5Var == null || (str = jr5Var.b) == null || str.isEmpty()) {
                            Flowable flowableT = oh61Var.h.J(new nh61((byte) 24)).T(oh61Var.m.c(1).v());
                            flowableT.getClass();
                            return new ObservableFromPublisher(flowableT);
                        }
                        g610 g610VarA = oh61Var.c.a();
                        g610VarA.getClass();
                        Set set = s4b1.f;
                        v5b1 v5b1Var = uic.x(str).d;
                        if (u890.j(v5b1Var != null ? v5b1Var.getType() : null, nyu0.e)) {
                            singleB = g610VarA.b(str);
                        } else {
                            if (u890.j(v5b1Var != null ? v5b1Var.getType() : null, wyu0.f)) {
                                singleB = g610VarA.b(str);
                            } else {
                                singleB = g7h.b(g610VarA.b, str, new String[]{str}).map(new vdn1(str, (byte) 8));
                                singleB.getClass();
                            }
                        }
                        return singleB.map(new jf11((Object) jr5Var, (byte) 19)).toObservable();
                    case 1:
                        oh61 oh61Var2 = ((hv5) ifl1Var2.b).a;
                        int i2 = AppProtocolRemoteService.f1;
                        return oh61Var2.h.T(oh61Var2.m.c(4).v()).z().toObservable().map(new f341((byte) 18));
                    case 2:
                        oh61 oh61Var3 = ((hv5) ifl1Var2.b).a;
                        int i3 = AppProtocolRemoteService.f1;
                        return oh61Var3.h.T(oh61Var3.m.c(4).v()).z().toObservable().map(new nh61((byte) 10));
                    case 3:
                        pr5 pr5Var = (pr5) obj;
                        oh61 oh61Var4 = ((hv5) ifl1Var2.b).a;
                        int i4 = AppProtocolRemoteService.f1;
                        cr5 cr5Var = oh61Var4.o.c;
                        return Single.create(new u2i0(oh61Var4, pr5Var, cr5Var.n, cr5Var.m, false)).toObservable().startWith(oh61Var4.m.b(8, pr5Var).w());
                    case 4:
                        oh61 oh61Var5 = ((hv5) ifl1Var2.b).a;
                        int i5 = AppProtocolRemoteService.f1;
                        return new ObservableFromPublisher(oh61Var5.h.T(oh61Var5.m.c(4).v()).J(new mh61(oh61Var5, (byte) 8)));
                    case 5:
                        jr5 jr5Var2 = (jr5) obj;
                        oh61 oh61Var6 = ((hv5) ifl1Var2.b).a;
                        int i6 = AppProtocolRemoteService.f1;
                        return oh61Var6.g(jr5Var2.b, null, jr5Var2.c).toObservable().startWith(oh61Var6.m.c(8).w());
                    default:
                        oh61 oh61Var7 = ((hv5) ifl1Var2.b).a;
                        int i7 = AppProtocolRemoteService.f1;
                        return oh61Var7.h((pu5) obj);
                }
            }
        }));
        final byte b13 = 10;
        gv5Var2.accept(new v5y(wq5.class, "com.spotify.get_session_state", 4, new w5y() { // from class: p.e2s
            /* JADX WARN: Code duplicated, block: B:11:0x0044  */
            /* JADX WARN: Code duplicated, block: B:12:0x0047  */
            /* JADX WARN: Code duplicated, block: B:9:0x0038  */
            @Override // p.w5y
            public final Observable a(Object obj) {
                String str;
                byte b14 = b13;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                wq5 wq5Var = cv5.a;
                final byte b15 = 0;
                final byte b16 = 1;
                ifl1 ifl1Var2 = ifl1Var;
                switch (b14) {
                    case 0:
                        oh61 oh61Var = ((hv5) ifl1Var2.b).a;
                        int i = AppProtocolRemoteService.f1;
                        g510 g510Var = oh61Var.k;
                        m210 m210Var = oh61Var.z;
                        String strP = g510Var.p();
                        if (strP == null) {
                            strP = "";
                        }
                        return g510.q(g510Var, m210Var, g510Var.h.j(strP)).flatMapCompletable(new mh61(oh61Var, (byte) 7)).d(oh61Var.c.b().a().takeUntil(new nh61((byte) 4)).flatMap(new nh61((byte) 5)).timeout(25L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new nh61((byte) 6)));
                    case 1:
                        oh61 oh61Var2 = ((hv5) ifl1Var2.b).a;
                        int i2 = AppProtocolRemoteService.f1;
                        return oh61Var2.h((pu5) obj);
                    case 2:
                        oh61 oh61Var3 = ((hv5) ifl1Var2.b).a;
                        int i3 = AppProtocolRemoteService.f1;
                        return oh61Var3.e.b("type").startWith(new CompletableFromAction(new w43(oh61Var3.m, (byte) 6)).w()).map(new f341((byte) 17)).onErrorResumeNext(new f341((byte) 29));
                    case 3:
                        oh61 oh61Var4 = ((hv5) ifl1Var2.b).a;
                        int i4 = AppProtocolRemoteService.f1;
                        return oh61Var4.i((vu5) obj);
                    case 4:
                        su5 su5Var = (su5) obj;
                        oh61 oh61Var5 = ((hv5) ifl1Var2.b).a;
                        int i5 = AppProtocolRemoteService.f1;
                        return Single.create(new jf11((Object) su5Var, (byte) 18)).flatMap(new h341(oh61Var5, su5Var, (byte) 9)).toObservable().startWith(oh61Var5.m.c(2).w());
                    case 5:
                        final ks5 ks5Var = (ks5) obj;
                        final oh61 oh61Var6 = ((hv5) ifl1Var2.b).a;
                        int i6 = AppProtocolRemoteService.f1;
                        return oh61Var6.k.l(ks5Var.b.longValue(), oh61Var6.z).map(new f341((byte) 23)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b17 = b15;
                                ks5 ks5Var3 = ks5Var;
                                oh61 oh61Var8 = oh61Var6;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b17) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek in song", (byte) 18)).toObservable().startWith(oh61Var6.m.c(1).w());
                    case 6:
                        final ks5 ks5Var2 = (ks5) obj;
                        final oh61 oh61Var7 = ((hv5) ifl1Var2.b).a;
                        int i7 = AppProtocolRemoteService.f1;
                        return oh61Var7.k.k(ks5Var2.b.longValue(), oh61Var7.z).map(new f341((byte) 28)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b17 = b16;
                                ks5 ks5Var3 = ks5Var2;
                                oh61 oh61Var8 = oh61Var7;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b17) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek by in a song", (byte) 18)).toObservable().startWith(oh61Var7.m.c(1).w());
                    case 7:
                        oh61 oh61Var8 = ((hv5) ifl1Var2.b).a;
                        int i8 = AppProtocolRemoteService.f1;
                        dbm dbmVar = oh61Var8.m;
                        Flowable flowable = oh61Var8.h;
                        g510 g510Var2 = oh61Var8.k;
                        Integer num = ((ns5) obj).b;
                        int iIntValue = num.intValue();
                        if (iIntValue == 0) {
                            Flowable flowableT = flowable.T(dbmVar.c(1).v()).T(g510Var2.d(oh61Var8.z).map(new nh61((byte) 19)).flatMapCompletable(new mh61(oh61Var8, (byte) 10)).v());
                            nh61 nh61Var = new nh61((byte) 20);
                            flowableT.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT, nh61Var).x(new nh61((byte) 21)).J(new nh61((byte) 22)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 23));
                        }
                        if (iIntValue == 1) {
                            Flowable flowableT2 = flowable.T(dbmVar.c(1).v()).T(g510Var2.j(oh61Var8.z).map(new nh61((byte) 13)).flatMapCompletable(new mh61(oh61Var8, (byte) 9)).v());
                            nh61 nh61Var2 = new nh61((byte) 14);
                            flowableT2.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT2, nh61Var2).x(new nh61((byte) 16)).J(new nh61((byte) 17)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 18));
                        }
                        if (iIntValue == 50 || iIntValue == 80 || iIntValue == 100 || iIntValue == 120 || iIntValue == 150 || iIntValue == 200 || iIntValue == 300) {
                            return oh61Var8.j(num.intValue());
                        }
                        return IapException.a("Unexpected playback speed " + num);
                    case 8:
                        oh61 oh61Var9 = ((hv5) ifl1Var2.b).a;
                        int i9 = AppProtocolRemoteService.f1;
                        return oh61Var9.j((int) (((ot5) obj).b.floatValue() * 100.0f));
                    case 9:
                        oh61 oh61Var10 = ((hv5) ifl1Var2.b).a;
                        int i10 = AppProtocolRemoteService.f1;
                        return oh61Var10.k((zs5) obj);
                    case 10:
                        oh61 oh61Var11 = ((hv5) ifl1Var2.b).a;
                        int i11 = AppProtocolRemoteService.f1;
                        Flowable flowable2 = oh61Var11.f;
                        return Observable.combineLatest(x0d.j(flowable2, flowable2).startWith(new CompletableFromAction(new ok70(oh61Var11.m, 4)).w()), yoi1.i(oh61Var11.g.a(o6n.a), o6x.a).startWithItem(Boolean.FALSE).distinctUntilChanged(), new mh61(oh61Var11, (byte) 3));
                    case 11:
                        oh61 oh61Var12 = ((hv5) ifl1Var2.b).a;
                        int i12 = AppProtocolRemoteService.f1;
                        Flowable flowable3 = oh61Var12.h;
                        ObservableFromPublisher observableFromPublisherJ = x0d.j(flowable3, flowable3);
                        ys5 ys5Var = zs5.Companion;
                        Objects.requireNonNull(ys5Var);
                        return observableFromPublisherJ.map(new nh61(ys5Var, (byte) 15)).flatMap(new mh61(oh61Var12, (byte) 11));
                    case 12:
                        ft5 ft5Var = (ft5) obj;
                        oh61 oh61Var13 = ((hv5) ifl1Var2.b).a;
                        int i13 = AppProtocolRemoteService.f1;
                        return oh61Var13.h.T(oh61Var13.m.c(1).v()).z().flatMapCompletable(new h341(oh61Var13, ft5Var, (byte) 6)).d(Observable.just(wq5Var)).startWith(oh61Var13.k.c(oh61Var13.z, ft5Var.d.booleanValue()).ignoreElement().w());
                    case 13:
                        mq5 mq5Var = (mq5) obj;
                        oh61 oh61Var14 = ((hv5) ifl1Var2.b).a;
                        int i14 = AppProtocolRemoteService.f1;
                        Integer num2 = mq5Var.c;
                        int iIntValue2 = num2 == null ? 20 : num2.intValue();
                        String str2 = mq5Var.b;
                        if (str2.equals("spotify:recently-played")) {
                            str2 = "com.spotify.recently-played";
                        } else if (str2.equals("spotify:browse")) {
                            str2 = "com.spotify.browse";
                        }
                        String str3 = str2;
                        c610 c610Var = oh61Var14.u;
                        hlr0 hlr0Var = new hlr0();
                        UbiSpecificationId ubiSpecificationId = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var = oh61Var14.o.c;
                        String str4 = cr5Var.e;
                        String str5 = cr5Var.d;
                        String str6 = oh61Var14.y;
                        m210 m210Var2 = oh61Var14.z;
                        if (m210Var2 == null) {
                            m210Var2 = oh61.D;
                        }
                        return c610Var.c(new r9c(str6, str3, str4, str5, m210Var2, false, true, false, false, hlr0Var, 2, 1, ubiSpecificationId, (String) null, false, false, false), new Bundle()).map(new mp5(mq5Var, iIntValue2, (byte) 8)).doOnError(new fv5(str3, (byte) 21)).toObservable().doOnSubscribe(new po5(oh61Var14, mq5Var, (byte) 5)).startWith(oh61Var14.m.c(8).w());
                    case 14:
                        oh61 oh61Var15 = ((hv5) ifl1Var2.b).a;
                        int i15 = AppProtocolRemoteService.f1;
                        return oh61Var15.l((rt5) obj);
                    case 15:
                        oh61 oh61Var16 = ((hv5) ifl1Var2.b).a;
                        int i16 = AppProtocolRemoteService.f1;
                        Flowable flowable4 = oh61Var16.h;
                        return x0d.j(flowable4, flowable4).map(new nh61((byte) 1)).flatMap(new mh61(oh61Var16, (byte) 4));
                    case 16:
                        oh61 oh61Var17 = ((hv5) ifl1Var2.b).a;
                        int i17 = AppProtocolRemoteService.f1;
                        return oh61Var17.k.n(oh61Var17.z).map(new nh61((byte) 2)).flatMap(new mh61(oh61Var17, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var17.m.c(1).w());
                    case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                        oh61 oh61Var18 = ((hv5) ifl1Var2.b).a;
                        int i18 = AppProtocolRemoteService.f1;
                        return oh61Var18.k.o(oh61Var18.z).map(new f341((byte) 21)).zipWith(oh61Var18.h.z(), new f341((byte) 22)).flatMap(new h341(oh61Var18, (ut5) obj, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var18.m.c(1).w());
                    case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                        jr5 jr5Var = (jr5) obj;
                        oh61 oh61Var19 = ((hv5) ifl1Var2.b).a;
                        int i19 = AppProtocolRemoteService.f1;
                        return Observable.just(jr5Var).startWith(oh61Var19.m.c(1).w()).switchMap(new mh61(oh61Var19, (byte) 1)).flatMapSingle(new mh61(oh61Var19, (byte) 2)).filter(new f341((byte) 24)).map(new f341((byte) 25)).flatMap(new h341(oh61Var19, jr5Var, (byte) 7)).timeout(15L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new f341((byte) 26));
                    case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                        pu5 pu5Var = (pu5) obj;
                        oh61 oh61Var20 = ((hv5) ifl1Var2.b).a;
                        int i20 = AppProtocolRemoteService.f1;
                        Observable observable = oh61Var20.h.T(oh61Var20.m.c(2).v()).z().toObservable();
                        g510 g510Var3 = oh61Var20.k;
                        return observable.startWith(g510.q(g510Var3, oh61Var20.z, g510Var3.h.e(pu5Var.b)).ignoreElement().w()).map(new h341(oh61Var20, pu5Var, (byte) 8));
                    case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                        oh61 oh61Var21 = ((hv5) ifl1Var2.b).a;
                        int i21 = AppProtocolRemoteService.f1;
                        return oh61Var21.c.a.k.b().map(new nh61((byte) 9));
                    case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                        oh61 oh61Var22 = ((hv5) ifl1Var2.b).a;
                        int i22 = AppProtocolRemoteService.f1;
                        return oh61Var22.m.c(4).d(Observable.just(new ws5()));
                    case 22:
                        oh61 oh61Var23 = ((hv5) ifl1Var2.b).a;
                        int i23 = AppProtocolRemoteService.f1;
                        return oh61Var23.i((vu5) obj);
                    case 23:
                        oh61 oh61Var24 = ((hv5) ifl1Var2.b).a;
                        int i24 = AppProtocolRemoteService.f1;
                        return oh61Var24.l.a(((sr5) obj).b.intValue(), oh61Var24.z).q(oh61Var24.m.c(1)).d(Observable.just(wq5Var));
                    case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                        oh61 oh61Var25 = ((hv5) ifl1Var2.b).a;
                        int i25 = AppProtocolRemoteService.f1;
                        return new poj0(oh61Var25.c, oh61Var25.j, oh61Var25.h, oh61Var25.n, (byte) 10).r(oh61Var25.a.getResources()).startWith(oh61Var25.m.c(4).w()).firstOrError().toObservable().map(new f341((byte) 27));
                    case 25:
                        oh61 oh61Var26 = ((hv5) ifl1Var2.b).a;
                        int i26 = AppProtocolRemoteService.f1;
                        Flowable flowable5 = oh61Var26.h;
                        iu5 iu5Var = ju5.Companion;
                        Objects.requireNonNull(iu5Var);
                        Flowable flowableT3 = flowable5.J(new nh61(iu5Var, (byte) 8)).T(oh61Var26.m.c(4).v());
                        flowableT3.getClass();
                        return new ObservableFromPublisher(flowableT3);
                    case 26:
                        pr5 pr5Var = (pr5) obj;
                        oh61 oh61Var27 = ((hv5) ifl1Var2.b).a;
                        int i27 = AppProtocolRemoteService.f1;
                        cr5 cr5Var2 = oh61Var27.o.c;
                        return Single.create(new u2i0(oh61Var27, pr5Var, cr5Var2.l, cr5Var2.k, true)).toObservable().startWith(oh61Var27.m.b(4, pr5Var).w());
                    case 27:
                        oh61 oh61Var28 = ((hv5) ifl1Var2.b).a;
                        int i28 = AppProtocolRemoteService.f1;
                        return oh61Var28.h.T(oh61Var28.m.c(4).v()).z().toObservable().map(new nh61((byte) 0));
                    case 28:
                        oh61 oh61Var29 = ((hv5) ifl1Var2.b).a;
                        int i29 = AppProtocolRemoteService.f1;
                        return oh61Var29.f();
                    default:
                        ct5 ct5Var = (ct5) obj;
                        oh61 oh61Var30 = ((hv5) ifl1Var2.b).a;
                        int i30 = AppProtocolRemoteService.f1;
                        if (ct5Var != null) {
                            str = ct5Var.b;
                            if ("default".equals(str)) {
                                if ("car".equals(oh61Var30.z.f)) {
                                    str = "default-cars";
                                } else {
                                    str = "default";
                                }
                            }
                        } else if ("car".equals(oh61Var30.z.f)) {
                            str = "default-cars";
                        } else {
                            str = "default";
                        }
                        Observable observableJust = (oh61Var30.o.c.e.equals("com.google.android.apps.maps") && str.equals("default")) ? Observable.just(new yr5(0, 0, 0, z6x.a)) : null;
                        if (observableJust != null) {
                            return observableJust;
                        }
                        oh61Var30.y = str;
                        Bundle bundleG = cy30.g("_type", str);
                        String str7 = oh61Var30.f31p;
                        hlr0 hlr0Var2 = new hlr0();
                        UbiSpecificationId ubiSpecificationId2 = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var3 = oh61Var30.o.c;
                        String str8 = cr5Var3.e;
                        String str9 = cr5Var3.d;
                        m210 m210Var3 = oh61Var30.z;
                        if (m210Var3 == null) {
                            m210Var3 = oh61.D;
                        }
                        return oh61Var30.u.c(new r9c(str, str7, str8, str9, m210Var3, true, true, false, false, hlr0Var2, 2, 1, ubiSpecificationId2, (String) null, false, false, false), bundleG).map(new nh61((byte) 7)).toObservable().startWith(oh61Var30.m.c(8).w()).doOnSubscribe(new fv5(oh61Var30, (byte) 19));
                }
            }
        }));
        final byte b14 = 21;
        gv5Var2.accept(new v5y(wq5.class, "com.spotify.get_rating", 4, new w5y() { // from class: p.e2s
            /* JADX WARN: Code duplicated, block: B:11:0x0044  */
            /* JADX WARN: Code duplicated, block: B:12:0x0047  */
            /* JADX WARN: Code duplicated, block: B:9:0x0038  */
            @Override // p.w5y
            public final Observable a(Object obj) {
                String str;
                byte b15 = b14;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                wq5 wq5Var = cv5.a;
                final byte b16 = 0;
                final byte b17 = 1;
                ifl1 ifl1Var2 = ifl1Var;
                switch (b15) {
                    case 0:
                        oh61 oh61Var = ((hv5) ifl1Var2.b).a;
                        int i = AppProtocolRemoteService.f1;
                        g510 g510Var = oh61Var.k;
                        m210 m210Var = oh61Var.z;
                        String strP = g510Var.p();
                        if (strP == null) {
                            strP = "";
                        }
                        return g510.q(g510Var, m210Var, g510Var.h.j(strP)).flatMapCompletable(new mh61(oh61Var, (byte) 7)).d(oh61Var.c.b().a().takeUntil(new nh61((byte) 4)).flatMap(new nh61((byte) 5)).timeout(25L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new nh61((byte) 6)));
                    case 1:
                        oh61 oh61Var2 = ((hv5) ifl1Var2.b).a;
                        int i2 = AppProtocolRemoteService.f1;
                        return oh61Var2.h((pu5) obj);
                    case 2:
                        oh61 oh61Var3 = ((hv5) ifl1Var2.b).a;
                        int i3 = AppProtocolRemoteService.f1;
                        return oh61Var3.e.b("type").startWith(new CompletableFromAction(new w43(oh61Var3.m, (byte) 6)).w()).map(new f341((byte) 17)).onErrorResumeNext(new f341((byte) 29));
                    case 3:
                        oh61 oh61Var4 = ((hv5) ifl1Var2.b).a;
                        int i4 = AppProtocolRemoteService.f1;
                        return oh61Var4.i((vu5) obj);
                    case 4:
                        su5 su5Var = (su5) obj;
                        oh61 oh61Var5 = ((hv5) ifl1Var2.b).a;
                        int i5 = AppProtocolRemoteService.f1;
                        return Single.create(new jf11((Object) su5Var, (byte) 18)).flatMap(new h341(oh61Var5, su5Var, (byte) 9)).toObservable().startWith(oh61Var5.m.c(2).w());
                    case 5:
                        final ks5 ks5Var = (ks5) obj;
                        final oh61 oh61Var6 = ((hv5) ifl1Var2.b).a;
                        int i6 = AppProtocolRemoteService.f1;
                        return oh61Var6.k.l(ks5Var.b.longValue(), oh61Var6.z).map(new f341((byte) 23)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b18 = b16;
                                ks5 ks5Var3 = ks5Var;
                                oh61 oh61Var8 = oh61Var6;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b18) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek in song", (byte) 18)).toObservable().startWith(oh61Var6.m.c(1).w());
                    case 6:
                        final ks5 ks5Var2 = (ks5) obj;
                        final oh61 oh61Var7 = ((hv5) ifl1Var2.b).a;
                        int i7 = AppProtocolRemoteService.f1;
                        return oh61Var7.k.k(ks5Var2.b.longValue(), oh61Var7.z).map(new f341((byte) 28)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b18 = b17;
                                ks5 ks5Var3 = ks5Var2;
                                oh61 oh61Var8 = oh61Var7;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b18) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek by in a song", (byte) 18)).toObservable().startWith(oh61Var7.m.c(1).w());
                    case 7:
                        oh61 oh61Var8 = ((hv5) ifl1Var2.b).a;
                        int i8 = AppProtocolRemoteService.f1;
                        dbm dbmVar = oh61Var8.m;
                        Flowable flowable = oh61Var8.h;
                        g510 g510Var2 = oh61Var8.k;
                        Integer num = ((ns5) obj).b;
                        int iIntValue = num.intValue();
                        if (iIntValue == 0) {
                            Flowable flowableT = flowable.T(dbmVar.c(1).v()).T(g510Var2.d(oh61Var8.z).map(new nh61((byte) 19)).flatMapCompletable(new mh61(oh61Var8, (byte) 10)).v());
                            nh61 nh61Var = new nh61((byte) 20);
                            flowableT.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT, nh61Var).x(new nh61((byte) 21)).J(new nh61((byte) 22)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 23));
                        }
                        if (iIntValue == 1) {
                            Flowable flowableT2 = flowable.T(dbmVar.c(1).v()).T(g510Var2.j(oh61Var8.z).map(new nh61((byte) 13)).flatMapCompletable(new mh61(oh61Var8, (byte) 9)).v());
                            nh61 nh61Var2 = new nh61((byte) 14);
                            flowableT2.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT2, nh61Var2).x(new nh61((byte) 16)).J(new nh61((byte) 17)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 18));
                        }
                        if (iIntValue == 50 || iIntValue == 80 || iIntValue == 100 || iIntValue == 120 || iIntValue == 150 || iIntValue == 200 || iIntValue == 300) {
                            return oh61Var8.j(num.intValue());
                        }
                        return IapException.a("Unexpected playback speed " + num);
                    case 8:
                        oh61 oh61Var9 = ((hv5) ifl1Var2.b).a;
                        int i9 = AppProtocolRemoteService.f1;
                        return oh61Var9.j((int) (((ot5) obj).b.floatValue() * 100.0f));
                    case 9:
                        oh61 oh61Var10 = ((hv5) ifl1Var2.b).a;
                        int i10 = AppProtocolRemoteService.f1;
                        return oh61Var10.k((zs5) obj);
                    case 10:
                        oh61 oh61Var11 = ((hv5) ifl1Var2.b).a;
                        int i11 = AppProtocolRemoteService.f1;
                        Flowable flowable2 = oh61Var11.f;
                        return Observable.combineLatest(x0d.j(flowable2, flowable2).startWith(new CompletableFromAction(new ok70(oh61Var11.m, 4)).w()), yoi1.i(oh61Var11.g.a(o6n.a), o6x.a).startWithItem(Boolean.FALSE).distinctUntilChanged(), new mh61(oh61Var11, (byte) 3));
                    case 11:
                        oh61 oh61Var12 = ((hv5) ifl1Var2.b).a;
                        int i12 = AppProtocolRemoteService.f1;
                        Flowable flowable3 = oh61Var12.h;
                        ObservableFromPublisher observableFromPublisherJ = x0d.j(flowable3, flowable3);
                        ys5 ys5Var = zs5.Companion;
                        Objects.requireNonNull(ys5Var);
                        return observableFromPublisherJ.map(new nh61(ys5Var, (byte) 15)).flatMap(new mh61(oh61Var12, (byte) 11));
                    case 12:
                        ft5 ft5Var = (ft5) obj;
                        oh61 oh61Var13 = ((hv5) ifl1Var2.b).a;
                        int i13 = AppProtocolRemoteService.f1;
                        return oh61Var13.h.T(oh61Var13.m.c(1).v()).z().flatMapCompletable(new h341(oh61Var13, ft5Var, (byte) 6)).d(Observable.just(wq5Var)).startWith(oh61Var13.k.c(oh61Var13.z, ft5Var.d.booleanValue()).ignoreElement().w());
                    case 13:
                        mq5 mq5Var = (mq5) obj;
                        oh61 oh61Var14 = ((hv5) ifl1Var2.b).a;
                        int i14 = AppProtocolRemoteService.f1;
                        Integer num2 = mq5Var.c;
                        int iIntValue2 = num2 == null ? 20 : num2.intValue();
                        String str2 = mq5Var.b;
                        if (str2.equals("spotify:recently-played")) {
                            str2 = "com.spotify.recently-played";
                        } else if (str2.equals("spotify:browse")) {
                            str2 = "com.spotify.browse";
                        }
                        String str3 = str2;
                        c610 c610Var = oh61Var14.u;
                        hlr0 hlr0Var = new hlr0();
                        UbiSpecificationId ubiSpecificationId = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var = oh61Var14.o.c;
                        String str4 = cr5Var.e;
                        String str5 = cr5Var.d;
                        String str6 = oh61Var14.y;
                        m210 m210Var2 = oh61Var14.z;
                        if (m210Var2 == null) {
                            m210Var2 = oh61.D;
                        }
                        return c610Var.c(new r9c(str6, str3, str4, str5, m210Var2, false, true, false, false, hlr0Var, 2, 1, ubiSpecificationId, (String) null, false, false, false), new Bundle()).map(new mp5(mq5Var, iIntValue2, (byte) 8)).doOnError(new fv5(str3, (byte) 21)).toObservable().doOnSubscribe(new po5(oh61Var14, mq5Var, (byte) 5)).startWith(oh61Var14.m.c(8).w());
                    case 14:
                        oh61 oh61Var15 = ((hv5) ifl1Var2.b).a;
                        int i15 = AppProtocolRemoteService.f1;
                        return oh61Var15.l((rt5) obj);
                    case 15:
                        oh61 oh61Var16 = ((hv5) ifl1Var2.b).a;
                        int i16 = AppProtocolRemoteService.f1;
                        Flowable flowable4 = oh61Var16.h;
                        return x0d.j(flowable4, flowable4).map(new nh61((byte) 1)).flatMap(new mh61(oh61Var16, (byte) 4));
                    case 16:
                        oh61 oh61Var17 = ((hv5) ifl1Var2.b).a;
                        int i17 = AppProtocolRemoteService.f1;
                        return oh61Var17.k.n(oh61Var17.z).map(new nh61((byte) 2)).flatMap(new mh61(oh61Var17, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var17.m.c(1).w());
                    case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                        oh61 oh61Var18 = ((hv5) ifl1Var2.b).a;
                        int i18 = AppProtocolRemoteService.f1;
                        return oh61Var18.k.o(oh61Var18.z).map(new f341((byte) 21)).zipWith(oh61Var18.h.z(), new f341((byte) 22)).flatMap(new h341(oh61Var18, (ut5) obj, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var18.m.c(1).w());
                    case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                        jr5 jr5Var = (jr5) obj;
                        oh61 oh61Var19 = ((hv5) ifl1Var2.b).a;
                        int i19 = AppProtocolRemoteService.f1;
                        return Observable.just(jr5Var).startWith(oh61Var19.m.c(1).w()).switchMap(new mh61(oh61Var19, (byte) 1)).flatMapSingle(new mh61(oh61Var19, (byte) 2)).filter(new f341((byte) 24)).map(new f341((byte) 25)).flatMap(new h341(oh61Var19, jr5Var, (byte) 7)).timeout(15L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new f341((byte) 26));
                    case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                        pu5 pu5Var = (pu5) obj;
                        oh61 oh61Var20 = ((hv5) ifl1Var2.b).a;
                        int i20 = AppProtocolRemoteService.f1;
                        Observable observable = oh61Var20.h.T(oh61Var20.m.c(2).v()).z().toObservable();
                        g510 g510Var3 = oh61Var20.k;
                        return observable.startWith(g510.q(g510Var3, oh61Var20.z, g510Var3.h.e(pu5Var.b)).ignoreElement().w()).map(new h341(oh61Var20, pu5Var, (byte) 8));
                    case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                        oh61 oh61Var21 = ((hv5) ifl1Var2.b).a;
                        int i21 = AppProtocolRemoteService.f1;
                        return oh61Var21.c.a.k.b().map(new nh61((byte) 9));
                    case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                        oh61 oh61Var22 = ((hv5) ifl1Var2.b).a;
                        int i22 = AppProtocolRemoteService.f1;
                        return oh61Var22.m.c(4).d(Observable.just(new ws5()));
                    case 22:
                        oh61 oh61Var23 = ((hv5) ifl1Var2.b).a;
                        int i23 = AppProtocolRemoteService.f1;
                        return oh61Var23.i((vu5) obj);
                    case 23:
                        oh61 oh61Var24 = ((hv5) ifl1Var2.b).a;
                        int i24 = AppProtocolRemoteService.f1;
                        return oh61Var24.l.a(((sr5) obj).b.intValue(), oh61Var24.z).q(oh61Var24.m.c(1)).d(Observable.just(wq5Var));
                    case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                        oh61 oh61Var25 = ((hv5) ifl1Var2.b).a;
                        int i25 = AppProtocolRemoteService.f1;
                        return new poj0(oh61Var25.c, oh61Var25.j, oh61Var25.h, oh61Var25.n, (byte) 10).r(oh61Var25.a.getResources()).startWith(oh61Var25.m.c(4).w()).firstOrError().toObservable().map(new f341((byte) 27));
                    case 25:
                        oh61 oh61Var26 = ((hv5) ifl1Var2.b).a;
                        int i26 = AppProtocolRemoteService.f1;
                        Flowable flowable5 = oh61Var26.h;
                        iu5 iu5Var = ju5.Companion;
                        Objects.requireNonNull(iu5Var);
                        Flowable flowableT3 = flowable5.J(new nh61(iu5Var, (byte) 8)).T(oh61Var26.m.c(4).v());
                        flowableT3.getClass();
                        return new ObservableFromPublisher(flowableT3);
                    case 26:
                        pr5 pr5Var = (pr5) obj;
                        oh61 oh61Var27 = ((hv5) ifl1Var2.b).a;
                        int i27 = AppProtocolRemoteService.f1;
                        cr5 cr5Var2 = oh61Var27.o.c;
                        return Single.create(new u2i0(oh61Var27, pr5Var, cr5Var2.l, cr5Var2.k, true)).toObservable().startWith(oh61Var27.m.b(4, pr5Var).w());
                    case 27:
                        oh61 oh61Var28 = ((hv5) ifl1Var2.b).a;
                        int i28 = AppProtocolRemoteService.f1;
                        return oh61Var28.h.T(oh61Var28.m.c(4).v()).z().toObservable().map(new nh61((byte) 0));
                    case 28:
                        oh61 oh61Var29 = ((hv5) ifl1Var2.b).a;
                        int i29 = AppProtocolRemoteService.f1;
                        return oh61Var29.f();
                    default:
                        ct5 ct5Var = (ct5) obj;
                        oh61 oh61Var30 = ((hv5) ifl1Var2.b).a;
                        int i30 = AppProtocolRemoteService.f1;
                        if (ct5Var != null) {
                            str = ct5Var.b;
                            if ("default".equals(str)) {
                                if ("car".equals(oh61Var30.z.f)) {
                                    str = "default-cars";
                                } else {
                                    str = "default";
                                }
                            }
                        } else if ("car".equals(oh61Var30.z.f)) {
                            str = "default-cars";
                        } else {
                            str = "default";
                        }
                        Observable observableJust = (oh61Var30.o.c.e.equals("com.google.android.apps.maps") && str.equals("default")) ? Observable.just(new yr5(0, 0, 0, z6x.a)) : null;
                        if (observableJust != null) {
                            return observableJust;
                        }
                        oh61Var30.y = str;
                        Bundle bundleG = cy30.g("_type", str);
                        String str7 = oh61Var30.f31p;
                        hlr0 hlr0Var2 = new hlr0();
                        UbiSpecificationId ubiSpecificationId2 = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var3 = oh61Var30.o.c;
                        String str8 = cr5Var3.e;
                        String str9 = cr5Var3.d;
                        m210 m210Var3 = oh61Var30.z;
                        if (m210Var3 == null) {
                            m210Var3 = oh61.D;
                        }
                        return oh61Var30.u.c(new r9c(str, str7, str8, str9, m210Var3, true, true, false, false, hlr0Var2, 2, 1, ubiSpecificationId2, (String) null, false, false, false), bundleG).map(new nh61((byte) 7)).toObservable().startWith(oh61Var30.m.c(8).w()).doOnSubscribe(new fv5(oh61Var30, (byte) 19));
                }
            }
        }));
        gv5Var2.accept(new v5y(wq5.class, "com.spotify.get_repeat", 4, new w5y() { // from class: p.f2s
            /* JADX WARN: Code duplicated, block: B:35:0x0152  */
            @Override // p.w5y
            public final Observable a(Object obj) {
                String str;
                Single singleB;
                byte b15 = b;
                ifl1 ifl1Var2 = ifl1Var;
                switch (b15) {
                    case 0:
                        jr5 jr5Var = (jr5) obj;
                        oh61 oh61Var = ((hv5) ifl1Var2.b).a;
                        int i = AppProtocolRemoteService.f1;
                        if (jr5Var == null || (str = jr5Var.b) == null || str.isEmpty()) {
                            Flowable flowableT = oh61Var.h.J(new nh61((byte) 24)).T(oh61Var.m.c(1).v());
                            flowableT.getClass();
                            return new ObservableFromPublisher(flowableT);
                        }
                        g610 g610VarA = oh61Var.c.a();
                        g610VarA.getClass();
                        Set set = s4b1.f;
                        v5b1 v5b1Var = uic.x(str).d;
                        if (u890.j(v5b1Var != null ? v5b1Var.getType() : null, nyu0.e)) {
                            singleB = g610VarA.b(str);
                        } else {
                            if (u890.j(v5b1Var != null ? v5b1Var.getType() : null, wyu0.f)) {
                                singleB = g610VarA.b(str);
                            } else {
                                singleB = g7h.b(g610VarA.b, str, new String[]{str}).map(new vdn1(str, (byte) 8));
                                singleB.getClass();
                            }
                        }
                        return singleB.map(new jf11((Object) jr5Var, (byte) 19)).toObservable();
                    case 1:
                        oh61 oh61Var2 = ((hv5) ifl1Var2.b).a;
                        int i2 = AppProtocolRemoteService.f1;
                        return oh61Var2.h.T(oh61Var2.m.c(4).v()).z().toObservable().map(new f341((byte) 18));
                    case 2:
                        oh61 oh61Var3 = ((hv5) ifl1Var2.b).a;
                        int i3 = AppProtocolRemoteService.f1;
                        return oh61Var3.h.T(oh61Var3.m.c(4).v()).z().toObservable().map(new nh61((byte) 10));
                    case 3:
                        pr5 pr5Var = (pr5) obj;
                        oh61 oh61Var4 = ((hv5) ifl1Var2.b).a;
                        int i4 = AppProtocolRemoteService.f1;
                        cr5 cr5Var = oh61Var4.o.c;
                        return Single.create(new u2i0(oh61Var4, pr5Var, cr5Var.n, cr5Var.m, false)).toObservable().startWith(oh61Var4.m.b(8, pr5Var).w());
                    case 4:
                        oh61 oh61Var5 = ((hv5) ifl1Var2.b).a;
                        int i5 = AppProtocolRemoteService.f1;
                        return new ObservableFromPublisher(oh61Var5.h.T(oh61Var5.m.c(4).v()).J(new mh61(oh61Var5, (byte) 8)));
                    case 5:
                        jr5 jr5Var2 = (jr5) obj;
                        oh61 oh61Var6 = ((hv5) ifl1Var2.b).a;
                        int i6 = AppProtocolRemoteService.f1;
                        return oh61Var6.g(jr5Var2.b, null, jr5Var2.c).toObservable().startWith(oh61Var6.m.c(8).w());
                    default:
                        oh61 oh61Var7 = ((hv5) ifl1Var2.b).a;
                        int i7 = AppProtocolRemoteService.f1;
                        return oh61Var7.h((pu5) obj);
                }
            }
        }));
        gv5Var2.accept(new v5y(wq5.class, "com.spotify.get_shuffle", 4, new w5y() { // from class: p.f2s
            /* JADX WARN: Code duplicated, block: B:35:0x0152  */
            @Override // p.w5y
            public final Observable a(Object obj) {
                String str;
                Single singleB;
                byte b15 = b3;
                ifl1 ifl1Var2 = ifl1Var;
                switch (b15) {
                    case 0:
                        jr5 jr5Var = (jr5) obj;
                        oh61 oh61Var = ((hv5) ifl1Var2.b).a;
                        int i = AppProtocolRemoteService.f1;
                        if (jr5Var == null || (str = jr5Var.b) == null || str.isEmpty()) {
                            Flowable flowableT = oh61Var.h.J(new nh61((byte) 24)).T(oh61Var.m.c(1).v());
                            flowableT.getClass();
                            return new ObservableFromPublisher(flowableT);
                        }
                        g610 g610VarA = oh61Var.c.a();
                        g610VarA.getClass();
                        Set set = s4b1.f;
                        v5b1 v5b1Var = uic.x(str).d;
                        if (u890.j(v5b1Var != null ? v5b1Var.getType() : null, nyu0.e)) {
                            singleB = g610VarA.b(str);
                        } else {
                            if (u890.j(v5b1Var != null ? v5b1Var.getType() : null, wyu0.f)) {
                                singleB = g610VarA.b(str);
                            } else {
                                singleB = g7h.b(g610VarA.b, str, new String[]{str}).map(new vdn1(str, (byte) 8));
                                singleB.getClass();
                            }
                        }
                        return singleB.map(new jf11((Object) jr5Var, (byte) 19)).toObservable();
                    case 1:
                        oh61 oh61Var2 = ((hv5) ifl1Var2.b).a;
                        int i2 = AppProtocolRemoteService.f1;
                        return oh61Var2.h.T(oh61Var2.m.c(4).v()).z().toObservable().map(new f341((byte) 18));
                    case 2:
                        oh61 oh61Var3 = ((hv5) ifl1Var2.b).a;
                        int i3 = AppProtocolRemoteService.f1;
                        return oh61Var3.h.T(oh61Var3.m.c(4).v()).z().toObservable().map(new nh61((byte) 10));
                    case 3:
                        pr5 pr5Var = (pr5) obj;
                        oh61 oh61Var4 = ((hv5) ifl1Var2.b).a;
                        int i4 = AppProtocolRemoteService.f1;
                        cr5 cr5Var = oh61Var4.o.c;
                        return Single.create(new u2i0(oh61Var4, pr5Var, cr5Var.n, cr5Var.m, false)).toObservable().startWith(oh61Var4.m.b(8, pr5Var).w());
                    case 4:
                        oh61 oh61Var5 = ((hv5) ifl1Var2.b).a;
                        int i5 = AppProtocolRemoteService.f1;
                        return new ObservableFromPublisher(oh61Var5.h.T(oh61Var5.m.c(4).v()).J(new mh61(oh61Var5, (byte) 8)));
                    case 5:
                        jr5 jr5Var2 = (jr5) obj;
                        oh61 oh61Var6 = ((hv5) ifl1Var2.b).a;
                        int i6 = AppProtocolRemoteService.f1;
                        return oh61Var6.g(jr5Var2.b, null, jr5Var2.c).toObservable().startWith(oh61Var6.m.c(8).w());
                    default:
                        oh61 oh61Var7 = ((hv5) ifl1Var2.b).a;
                        int i7 = AppProtocolRemoteService.f1;
                        return oh61Var7.h((pu5) obj);
                }
            }
        }));
        final byte b15 = 3;
        gv5Var2.accept(new v5y(pr5.class, "com.spotify.get_thumbnail_image", 8, new w5y() { // from class: p.f2s
            /* JADX WARN: Code duplicated, block: B:35:0x0152  */
            @Override // p.w5y
            public final Observable a(Object obj) {
                String str;
                Single singleB;
                byte b16 = b15;
                ifl1 ifl1Var2 = ifl1Var;
                switch (b16) {
                    case 0:
                        jr5 jr5Var = (jr5) obj;
                        oh61 oh61Var = ((hv5) ifl1Var2.b).a;
                        int i = AppProtocolRemoteService.f1;
                        if (jr5Var == null || (str = jr5Var.b) == null || str.isEmpty()) {
                            Flowable flowableT = oh61Var.h.J(new nh61((byte) 24)).T(oh61Var.m.c(1).v());
                            flowableT.getClass();
                            return new ObservableFromPublisher(flowableT);
                        }
                        g610 g610VarA = oh61Var.c.a();
                        g610VarA.getClass();
                        Set set = s4b1.f;
                        v5b1 v5b1Var = uic.x(str).d;
                        if (u890.j(v5b1Var != null ? v5b1Var.getType() : null, nyu0.e)) {
                            singleB = g610VarA.b(str);
                        } else {
                            if (u890.j(v5b1Var != null ? v5b1Var.getType() : null, wyu0.f)) {
                                singleB = g610VarA.b(str);
                            } else {
                                singleB = g7h.b(g610VarA.b, str, new String[]{str}).map(new vdn1(str, (byte) 8));
                                singleB.getClass();
                            }
                        }
                        return singleB.map(new jf11((Object) jr5Var, (byte) 19)).toObservable();
                    case 1:
                        oh61 oh61Var2 = ((hv5) ifl1Var2.b).a;
                        int i2 = AppProtocolRemoteService.f1;
                        return oh61Var2.h.T(oh61Var2.m.c(4).v()).z().toObservable().map(new f341((byte) 18));
                    case 2:
                        oh61 oh61Var3 = ((hv5) ifl1Var2.b).a;
                        int i3 = AppProtocolRemoteService.f1;
                        return oh61Var3.h.T(oh61Var3.m.c(4).v()).z().toObservable().map(new nh61((byte) 10));
                    case 3:
                        pr5 pr5Var = (pr5) obj;
                        oh61 oh61Var4 = ((hv5) ifl1Var2.b).a;
                        int i4 = AppProtocolRemoteService.f1;
                        cr5 cr5Var = oh61Var4.o.c;
                        return Single.create(new u2i0(oh61Var4, pr5Var, cr5Var.n, cr5Var.m, false)).toObservable().startWith(oh61Var4.m.b(8, pr5Var).w());
                    case 4:
                        oh61 oh61Var5 = ((hv5) ifl1Var2.b).a;
                        int i5 = AppProtocolRemoteService.f1;
                        return new ObservableFromPublisher(oh61Var5.h.T(oh61Var5.m.c(4).v()).J(new mh61(oh61Var5, (byte) 8)));
                    case 5:
                        jr5 jr5Var2 = (jr5) obj;
                        oh61 oh61Var6 = ((hv5) ifl1Var2.b).a;
                        int i6 = AppProtocolRemoteService.f1;
                        return oh61Var6.g(jr5Var2.b, null, jr5Var2.c).toObservable().startWith(oh61Var6.m.c(8).w());
                    default:
                        oh61 oh61Var7 = ((hv5) ifl1Var2.b).a;
                        int i7 = AppProtocolRemoteService.f1;
                        return oh61Var7.h((pu5) obj);
                }
            }
        }));
        gv5Var2.accept(new v5y(wq5.class, "com.spotify.get_track_elapsed", 4, new w5y() { // from class: p.f2s
            /* JADX WARN: Code duplicated, block: B:35:0x0152  */
            @Override // p.w5y
            public final Observable a(Object obj) {
                String str;
                Single singleB;
                byte b16 = b7;
                ifl1 ifl1Var2 = ifl1Var;
                switch (b16) {
                    case 0:
                        jr5 jr5Var = (jr5) obj;
                        oh61 oh61Var = ((hv5) ifl1Var2.b).a;
                        int i = AppProtocolRemoteService.f1;
                        if (jr5Var == null || (str = jr5Var.b) == null || str.isEmpty()) {
                            Flowable flowableT = oh61Var.h.J(new nh61((byte) 24)).T(oh61Var.m.c(1).v());
                            flowableT.getClass();
                            return new ObservableFromPublisher(flowableT);
                        }
                        g610 g610VarA = oh61Var.c.a();
                        g610VarA.getClass();
                        Set set = s4b1.f;
                        v5b1 v5b1Var = uic.x(str).d;
                        if (u890.j(v5b1Var != null ? v5b1Var.getType() : null, nyu0.e)) {
                            singleB = g610VarA.b(str);
                        } else {
                            if (u890.j(v5b1Var != null ? v5b1Var.getType() : null, wyu0.f)) {
                                singleB = g610VarA.b(str);
                            } else {
                                singleB = g7h.b(g610VarA.b, str, new String[]{str}).map(new vdn1(str, (byte) 8));
                                singleB.getClass();
                            }
                        }
                        return singleB.map(new jf11((Object) jr5Var, (byte) 19)).toObservable();
                    case 1:
                        oh61 oh61Var2 = ((hv5) ifl1Var2.b).a;
                        int i2 = AppProtocolRemoteService.f1;
                        return oh61Var2.h.T(oh61Var2.m.c(4).v()).z().toObservable().map(new f341((byte) 18));
                    case 2:
                        oh61 oh61Var3 = ((hv5) ifl1Var2.b).a;
                        int i3 = AppProtocolRemoteService.f1;
                        return oh61Var3.h.T(oh61Var3.m.c(4).v()).z().toObservable().map(new nh61((byte) 10));
                    case 3:
                        pr5 pr5Var = (pr5) obj;
                        oh61 oh61Var4 = ((hv5) ifl1Var2.b).a;
                        int i4 = AppProtocolRemoteService.f1;
                        cr5 cr5Var = oh61Var4.o.c;
                        return Single.create(new u2i0(oh61Var4, pr5Var, cr5Var.n, cr5Var.m, false)).toObservable().startWith(oh61Var4.m.b(8, pr5Var).w());
                    case 4:
                        oh61 oh61Var5 = ((hv5) ifl1Var2.b).a;
                        int i5 = AppProtocolRemoteService.f1;
                        return new ObservableFromPublisher(oh61Var5.h.T(oh61Var5.m.c(4).v()).J(new mh61(oh61Var5, (byte) 8)));
                    case 5:
                        jr5 jr5Var2 = (jr5) obj;
                        oh61 oh61Var6 = ((hv5) ifl1Var2.b).a;
                        int i6 = AppProtocolRemoteService.f1;
                        return oh61Var6.g(jr5Var2.b, null, jr5Var2.c).toObservable().startWith(oh61Var6.m.c(8).w());
                    default:
                        oh61 oh61Var7 = ((hv5) ifl1Var2.b).a;
                        int i7 = AppProtocolRemoteService.f1;
                        return oh61Var7.h((pu5) obj);
                }
            }
        }));
        final byte b16 = 7;
        gv5Var2.accept(new v5y(bs5.class, "com.spotify.log_message", 0, new ofr(ifl1Var, (byte) 7)));
        final byte b17 = 5;
        gv5Var2.accept(new v5y(jr5.class, "com.spotify.play_item", 8, new w5y() { // from class: p.f2s
            /* JADX WARN: Code duplicated, block: B:35:0x0152  */
            @Override // p.w5y
            public final Observable a(Object obj) {
                String str;
                Single singleB;
                byte b18 = b17;
                ifl1 ifl1Var2 = ifl1Var;
                switch (b18) {
                    case 0:
                        jr5 jr5Var = (jr5) obj;
                        oh61 oh61Var = ((hv5) ifl1Var2.b).a;
                        int i = AppProtocolRemoteService.f1;
                        if (jr5Var == null || (str = jr5Var.b) == null || str.isEmpty()) {
                            Flowable flowableT = oh61Var.h.J(new nh61((byte) 24)).T(oh61Var.m.c(1).v());
                            flowableT.getClass();
                            return new ObservableFromPublisher(flowableT);
                        }
                        g610 g610VarA = oh61Var.c.a();
                        g610VarA.getClass();
                        Set set = s4b1.f;
                        v5b1 v5b1Var = uic.x(str).d;
                        if (u890.j(v5b1Var != null ? v5b1Var.getType() : null, nyu0.e)) {
                            singleB = g610VarA.b(str);
                        } else {
                            if (u890.j(v5b1Var != null ? v5b1Var.getType() : null, wyu0.f)) {
                                singleB = g610VarA.b(str);
                            } else {
                                singleB = g7h.b(g610VarA.b, str, new String[]{str}).map(new vdn1(str, (byte) 8));
                                singleB.getClass();
                            }
                        }
                        return singleB.map(new jf11((Object) jr5Var, (byte) 19)).toObservable();
                    case 1:
                        oh61 oh61Var2 = ((hv5) ifl1Var2.b).a;
                        int i2 = AppProtocolRemoteService.f1;
                        return oh61Var2.h.T(oh61Var2.m.c(4).v()).z().toObservable().map(new f341((byte) 18));
                    case 2:
                        oh61 oh61Var3 = ((hv5) ifl1Var2.b).a;
                        int i3 = AppProtocolRemoteService.f1;
                        return oh61Var3.h.T(oh61Var3.m.c(4).v()).z().toObservable().map(new nh61((byte) 10));
                    case 3:
                        pr5 pr5Var = (pr5) obj;
                        oh61 oh61Var4 = ((hv5) ifl1Var2.b).a;
                        int i4 = AppProtocolRemoteService.f1;
                        cr5 cr5Var = oh61Var4.o.c;
                        return Single.create(new u2i0(oh61Var4, pr5Var, cr5Var.n, cr5Var.m, false)).toObservable().startWith(oh61Var4.m.b(8, pr5Var).w());
                    case 4:
                        oh61 oh61Var5 = ((hv5) ifl1Var2.b).a;
                        int i5 = AppProtocolRemoteService.f1;
                        return new ObservableFromPublisher(oh61Var5.h.T(oh61Var5.m.c(4).v()).J(new mh61(oh61Var5, (byte) 8)));
                    case 5:
                        jr5 jr5Var2 = (jr5) obj;
                        oh61 oh61Var6 = ((hv5) ifl1Var2.b).a;
                        int i6 = AppProtocolRemoteService.f1;
                        return oh61Var6.g(jr5Var2.b, null, jr5Var2.c).toObservable().startWith(oh61Var6.m.c(8).w());
                    default:
                        oh61 oh61Var7 = ((hv5) ifl1Var2.b).a;
                        int i7 = AppProtocolRemoteService.f1;
                        return oh61Var7.h((pu5) obj);
                }
            }
        }));
        final byte b18 = 6;
        gv5Var2.accept(new v5y(pu5.class, "com.spotify.play_spotify_track_uri", 2, new w5y() { // from class: p.f2s
            /* JADX WARN: Code duplicated, block: B:35:0x0152  */
            @Override // p.w5y
            public final Observable a(Object obj) {
                String str;
                Single singleB;
                byte b19 = b18;
                ifl1 ifl1Var2 = ifl1Var;
                switch (b19) {
                    case 0:
                        jr5 jr5Var = (jr5) obj;
                        oh61 oh61Var = ((hv5) ifl1Var2.b).a;
                        int i = AppProtocolRemoteService.f1;
                        if (jr5Var == null || (str = jr5Var.b) == null || str.isEmpty()) {
                            Flowable flowableT = oh61Var.h.J(new nh61((byte) 24)).T(oh61Var.m.c(1).v());
                            flowableT.getClass();
                            return new ObservableFromPublisher(flowableT);
                        }
                        g610 g610VarA = oh61Var.c.a();
                        g610VarA.getClass();
                        Set set = s4b1.f;
                        v5b1 v5b1Var = uic.x(str).d;
                        if (u890.j(v5b1Var != null ? v5b1Var.getType() : null, nyu0.e)) {
                            singleB = g610VarA.b(str);
                        } else {
                            if (u890.j(v5b1Var != null ? v5b1Var.getType() : null, wyu0.f)) {
                                singleB = g610VarA.b(str);
                            } else {
                                singleB = g7h.b(g610VarA.b, str, new String[]{str}).map(new vdn1(str, (byte) 8));
                                singleB.getClass();
                            }
                        }
                        return singleB.map(new jf11((Object) jr5Var, (byte) 19)).toObservable();
                    case 1:
                        oh61 oh61Var2 = ((hv5) ifl1Var2.b).a;
                        int i2 = AppProtocolRemoteService.f1;
                        return oh61Var2.h.T(oh61Var2.m.c(4).v()).z().toObservable().map(new f341((byte) 18));
                    case 2:
                        oh61 oh61Var3 = ((hv5) ifl1Var2.b).a;
                        int i3 = AppProtocolRemoteService.f1;
                        return oh61Var3.h.T(oh61Var3.m.c(4).v()).z().toObservable().map(new nh61((byte) 10));
                    case 3:
                        pr5 pr5Var = (pr5) obj;
                        oh61 oh61Var4 = ((hv5) ifl1Var2.b).a;
                        int i4 = AppProtocolRemoteService.f1;
                        cr5 cr5Var = oh61Var4.o.c;
                        return Single.create(new u2i0(oh61Var4, pr5Var, cr5Var.n, cr5Var.m, false)).toObservable().startWith(oh61Var4.m.b(8, pr5Var).w());
                    case 4:
                        oh61 oh61Var5 = ((hv5) ifl1Var2.b).a;
                        int i5 = AppProtocolRemoteService.f1;
                        return new ObservableFromPublisher(oh61Var5.h.T(oh61Var5.m.c(4).v()).J(new mh61(oh61Var5, (byte) 8)));
                    case 5:
                        jr5 jr5Var2 = (jr5) obj;
                        oh61 oh61Var6 = ((hv5) ifl1Var2.b).a;
                        int i6 = AppProtocolRemoteService.f1;
                        return oh61Var6.g(jr5Var2.b, null, jr5Var2.c).toObservable().startWith(oh61Var6.m.c(8).w());
                    default:
                        oh61 oh61Var7 = ((hv5) ifl1Var2.b).a;
                        int i7 = AppProtocolRemoteService.f1;
                        return oh61Var7.h((pu5) obj);
                }
            }
        }));
        gv5Var2.accept(new v5y(pu5.class, "com.spotify.play_spotify_uri", 2, new w5y() { // from class: p.e2s
            /* JADX WARN: Code duplicated, block: B:11:0x0044  */
            /* JADX WARN: Code duplicated, block: B:12:0x0047  */
            /* JADX WARN: Code duplicated, block: B:9:0x0038  */
            @Override // p.w5y
            public final Observable a(Object obj) {
                String str;
                byte b19 = b;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                wq5 wq5Var = cv5.a;
                final byte b110 = 0;
                final byte b111 = 1;
                ifl1 ifl1Var2 = ifl1Var;
                switch (b19) {
                    case 0:
                        oh61 oh61Var = ((hv5) ifl1Var2.b).a;
                        int i = AppProtocolRemoteService.f1;
                        g510 g510Var = oh61Var.k;
                        m210 m210Var = oh61Var.z;
                        String strP = g510Var.p();
                        if (strP == null) {
                            strP = "";
                        }
                        return g510.q(g510Var, m210Var, g510Var.h.j(strP)).flatMapCompletable(new mh61(oh61Var, (byte) 7)).d(oh61Var.c.b().a().takeUntil(new nh61((byte) 4)).flatMap(new nh61((byte) 5)).timeout(25L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new nh61((byte) 6)));
                    case 1:
                        oh61 oh61Var2 = ((hv5) ifl1Var2.b).a;
                        int i2 = AppProtocolRemoteService.f1;
                        return oh61Var2.h((pu5) obj);
                    case 2:
                        oh61 oh61Var3 = ((hv5) ifl1Var2.b).a;
                        int i3 = AppProtocolRemoteService.f1;
                        return oh61Var3.e.b("type").startWith(new CompletableFromAction(new w43(oh61Var3.m, (byte) 6)).w()).map(new f341((byte) 17)).onErrorResumeNext(new f341((byte) 29));
                    case 3:
                        oh61 oh61Var4 = ((hv5) ifl1Var2.b).a;
                        int i4 = AppProtocolRemoteService.f1;
                        return oh61Var4.i((vu5) obj);
                    case 4:
                        su5 su5Var = (su5) obj;
                        oh61 oh61Var5 = ((hv5) ifl1Var2.b).a;
                        int i5 = AppProtocolRemoteService.f1;
                        return Single.create(new jf11((Object) su5Var, (byte) 18)).flatMap(new h341(oh61Var5, su5Var, (byte) 9)).toObservable().startWith(oh61Var5.m.c(2).w());
                    case 5:
                        final ks5 ks5Var = (ks5) obj;
                        final oh61 oh61Var6 = ((hv5) ifl1Var2.b).a;
                        int i6 = AppProtocolRemoteService.f1;
                        return oh61Var6.k.l(ks5Var.b.longValue(), oh61Var6.z).map(new f341((byte) 23)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b112 = b110;
                                ks5 ks5Var3 = ks5Var;
                                oh61 oh61Var8 = oh61Var6;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b112) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek in song", (byte) 18)).toObservable().startWith(oh61Var6.m.c(1).w());
                    case 6:
                        final ks5 ks5Var2 = (ks5) obj;
                        final oh61 oh61Var7 = ((hv5) ifl1Var2.b).a;
                        int i7 = AppProtocolRemoteService.f1;
                        return oh61Var7.k.k(ks5Var2.b.longValue(), oh61Var7.z).map(new f341((byte) 28)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b112 = b111;
                                ks5 ks5Var3 = ks5Var2;
                                oh61 oh61Var8 = oh61Var7;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b112) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek by in a song", (byte) 18)).toObservable().startWith(oh61Var7.m.c(1).w());
                    case 7:
                        oh61 oh61Var8 = ((hv5) ifl1Var2.b).a;
                        int i8 = AppProtocolRemoteService.f1;
                        dbm dbmVar = oh61Var8.m;
                        Flowable flowable = oh61Var8.h;
                        g510 g510Var2 = oh61Var8.k;
                        Integer num = ((ns5) obj).b;
                        int iIntValue = num.intValue();
                        if (iIntValue == 0) {
                            Flowable flowableT = flowable.T(dbmVar.c(1).v()).T(g510Var2.d(oh61Var8.z).map(new nh61((byte) 19)).flatMapCompletable(new mh61(oh61Var8, (byte) 10)).v());
                            nh61 nh61Var = new nh61((byte) 20);
                            flowableT.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT, nh61Var).x(new nh61((byte) 21)).J(new nh61((byte) 22)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 23));
                        }
                        if (iIntValue == 1) {
                            Flowable flowableT2 = flowable.T(dbmVar.c(1).v()).T(g510Var2.j(oh61Var8.z).map(new nh61((byte) 13)).flatMapCompletable(new mh61(oh61Var8, (byte) 9)).v());
                            nh61 nh61Var2 = new nh61((byte) 14);
                            flowableT2.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT2, nh61Var2).x(new nh61((byte) 16)).J(new nh61((byte) 17)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 18));
                        }
                        if (iIntValue == 50 || iIntValue == 80 || iIntValue == 100 || iIntValue == 120 || iIntValue == 150 || iIntValue == 200 || iIntValue == 300) {
                            return oh61Var8.j(num.intValue());
                        }
                        return IapException.a("Unexpected playback speed " + num);
                    case 8:
                        oh61 oh61Var9 = ((hv5) ifl1Var2.b).a;
                        int i9 = AppProtocolRemoteService.f1;
                        return oh61Var9.j((int) (((ot5) obj).b.floatValue() * 100.0f));
                    case 9:
                        oh61 oh61Var10 = ((hv5) ifl1Var2.b).a;
                        int i10 = AppProtocolRemoteService.f1;
                        return oh61Var10.k((zs5) obj);
                    case 10:
                        oh61 oh61Var11 = ((hv5) ifl1Var2.b).a;
                        int i11 = AppProtocolRemoteService.f1;
                        Flowable flowable2 = oh61Var11.f;
                        return Observable.combineLatest(x0d.j(flowable2, flowable2).startWith(new CompletableFromAction(new ok70(oh61Var11.m, 4)).w()), yoi1.i(oh61Var11.g.a(o6n.a), o6x.a).startWithItem(Boolean.FALSE).distinctUntilChanged(), new mh61(oh61Var11, (byte) 3));
                    case 11:
                        oh61 oh61Var12 = ((hv5) ifl1Var2.b).a;
                        int i12 = AppProtocolRemoteService.f1;
                        Flowable flowable3 = oh61Var12.h;
                        ObservableFromPublisher observableFromPublisherJ = x0d.j(flowable3, flowable3);
                        ys5 ys5Var = zs5.Companion;
                        Objects.requireNonNull(ys5Var);
                        return observableFromPublisherJ.map(new nh61(ys5Var, (byte) 15)).flatMap(new mh61(oh61Var12, (byte) 11));
                    case 12:
                        ft5 ft5Var = (ft5) obj;
                        oh61 oh61Var13 = ((hv5) ifl1Var2.b).a;
                        int i13 = AppProtocolRemoteService.f1;
                        return oh61Var13.h.T(oh61Var13.m.c(1).v()).z().flatMapCompletable(new h341(oh61Var13, ft5Var, (byte) 6)).d(Observable.just(wq5Var)).startWith(oh61Var13.k.c(oh61Var13.z, ft5Var.d.booleanValue()).ignoreElement().w());
                    case 13:
                        mq5 mq5Var = (mq5) obj;
                        oh61 oh61Var14 = ((hv5) ifl1Var2.b).a;
                        int i14 = AppProtocolRemoteService.f1;
                        Integer num2 = mq5Var.c;
                        int iIntValue2 = num2 == null ? 20 : num2.intValue();
                        String str2 = mq5Var.b;
                        if (str2.equals("spotify:recently-played")) {
                            str2 = "com.spotify.recently-played";
                        } else if (str2.equals("spotify:browse")) {
                            str2 = "com.spotify.browse";
                        }
                        String str3 = str2;
                        c610 c610Var = oh61Var14.u;
                        hlr0 hlr0Var = new hlr0();
                        UbiSpecificationId ubiSpecificationId = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var = oh61Var14.o.c;
                        String str4 = cr5Var.e;
                        String str5 = cr5Var.d;
                        String str6 = oh61Var14.y;
                        m210 m210Var2 = oh61Var14.z;
                        if (m210Var2 == null) {
                            m210Var2 = oh61.D;
                        }
                        return c610Var.c(new r9c(str6, str3, str4, str5, m210Var2, false, true, false, false, hlr0Var, 2, 1, ubiSpecificationId, (String) null, false, false, false), new Bundle()).map(new mp5(mq5Var, iIntValue2, (byte) 8)).doOnError(new fv5(str3, (byte) 21)).toObservable().doOnSubscribe(new po5(oh61Var14, mq5Var, (byte) 5)).startWith(oh61Var14.m.c(8).w());
                    case 14:
                        oh61 oh61Var15 = ((hv5) ifl1Var2.b).a;
                        int i15 = AppProtocolRemoteService.f1;
                        return oh61Var15.l((rt5) obj);
                    case 15:
                        oh61 oh61Var16 = ((hv5) ifl1Var2.b).a;
                        int i16 = AppProtocolRemoteService.f1;
                        Flowable flowable4 = oh61Var16.h;
                        return x0d.j(flowable4, flowable4).map(new nh61((byte) 1)).flatMap(new mh61(oh61Var16, (byte) 4));
                    case 16:
                        oh61 oh61Var17 = ((hv5) ifl1Var2.b).a;
                        int i17 = AppProtocolRemoteService.f1;
                        return oh61Var17.k.n(oh61Var17.z).map(new nh61((byte) 2)).flatMap(new mh61(oh61Var17, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var17.m.c(1).w());
                    case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                        oh61 oh61Var18 = ((hv5) ifl1Var2.b).a;
                        int i18 = AppProtocolRemoteService.f1;
                        return oh61Var18.k.o(oh61Var18.z).map(new f341((byte) 21)).zipWith(oh61Var18.h.z(), new f341((byte) 22)).flatMap(new h341(oh61Var18, (ut5) obj, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var18.m.c(1).w());
                    case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                        jr5 jr5Var = (jr5) obj;
                        oh61 oh61Var19 = ((hv5) ifl1Var2.b).a;
                        int i19 = AppProtocolRemoteService.f1;
                        return Observable.just(jr5Var).startWith(oh61Var19.m.c(1).w()).switchMap(new mh61(oh61Var19, (byte) 1)).flatMapSingle(new mh61(oh61Var19, (byte) 2)).filter(new f341((byte) 24)).map(new f341((byte) 25)).flatMap(new h341(oh61Var19, jr5Var, (byte) 7)).timeout(15L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new f341((byte) 26));
                    case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                        pu5 pu5Var = (pu5) obj;
                        oh61 oh61Var20 = ((hv5) ifl1Var2.b).a;
                        int i20 = AppProtocolRemoteService.f1;
                        Observable observable = oh61Var20.h.T(oh61Var20.m.c(2).v()).z().toObservable();
                        g510 g510Var3 = oh61Var20.k;
                        return observable.startWith(g510.q(g510Var3, oh61Var20.z, g510Var3.h.e(pu5Var.b)).ignoreElement().w()).map(new h341(oh61Var20, pu5Var, (byte) 8));
                    case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                        oh61 oh61Var21 = ((hv5) ifl1Var2.b).a;
                        int i21 = AppProtocolRemoteService.f1;
                        return oh61Var21.c.a.k.b().map(new nh61((byte) 9));
                    case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                        oh61 oh61Var22 = ((hv5) ifl1Var2.b).a;
                        int i22 = AppProtocolRemoteService.f1;
                        return oh61Var22.m.c(4).d(Observable.just(new ws5()));
                    case 22:
                        oh61 oh61Var23 = ((hv5) ifl1Var2.b).a;
                        int i23 = AppProtocolRemoteService.f1;
                        return oh61Var23.i((vu5) obj);
                    case 23:
                        oh61 oh61Var24 = ((hv5) ifl1Var2.b).a;
                        int i24 = AppProtocolRemoteService.f1;
                        return oh61Var24.l.a(((sr5) obj).b.intValue(), oh61Var24.z).q(oh61Var24.m.c(1)).d(Observable.just(wq5Var));
                    case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                        oh61 oh61Var25 = ((hv5) ifl1Var2.b).a;
                        int i25 = AppProtocolRemoteService.f1;
                        return new poj0(oh61Var25.c, oh61Var25.j, oh61Var25.h, oh61Var25.n, (byte) 10).r(oh61Var25.a.getResources()).startWith(oh61Var25.m.c(4).w()).firstOrError().toObservable().map(new f341((byte) 27));
                    case 25:
                        oh61 oh61Var26 = ((hv5) ifl1Var2.b).a;
                        int i26 = AppProtocolRemoteService.f1;
                        Flowable flowable5 = oh61Var26.h;
                        iu5 iu5Var = ju5.Companion;
                        Objects.requireNonNull(iu5Var);
                        Flowable flowableT3 = flowable5.J(new nh61(iu5Var, (byte) 8)).T(oh61Var26.m.c(4).v());
                        flowableT3.getClass();
                        return new ObservableFromPublisher(flowableT3);
                    case 26:
                        pr5 pr5Var = (pr5) obj;
                        oh61 oh61Var27 = ((hv5) ifl1Var2.b).a;
                        int i27 = AppProtocolRemoteService.f1;
                        cr5 cr5Var2 = oh61Var27.o.c;
                        return Single.create(new u2i0(oh61Var27, pr5Var, cr5Var2.l, cr5Var2.k, true)).toObservable().startWith(oh61Var27.m.b(4, pr5Var).w());
                    case 27:
                        oh61 oh61Var28 = ((hv5) ifl1Var2.b).a;
                        int i28 = AppProtocolRemoteService.f1;
                        return oh61Var28.h.T(oh61Var28.m.c(4).v()).z().toObservable().map(new nh61((byte) 0));
                    case 28:
                        oh61 oh61Var29 = ((hv5) ifl1Var2.b).a;
                        int i29 = AppProtocolRemoteService.f1;
                        return oh61Var29.f();
                    default:
                        ct5 ct5Var = (ct5) obj;
                        oh61 oh61Var30 = ((hv5) ifl1Var2.b).a;
                        int i30 = AppProtocolRemoteService.f1;
                        if (ct5Var != null) {
                            str = ct5Var.b;
                            if ("default".equals(str)) {
                                if ("car".equals(oh61Var30.z.f)) {
                                    str = "default-cars";
                                } else {
                                    str = "default";
                                }
                            }
                        } else if ("car".equals(oh61Var30.z.f)) {
                            str = "default-cars";
                        } else {
                            str = "default";
                        }
                        Observable observableJust = (oh61Var30.o.c.e.equals("com.google.android.apps.maps") && str.equals("default")) ? Observable.just(new yr5(0, 0, 0, z6x.a)) : null;
                        if (observableJust != null) {
                            return observableJust;
                        }
                        oh61Var30.y = str;
                        Bundle bundleG = cy30.g("_type", str);
                        String str7 = oh61Var30.f31p;
                        hlr0 hlr0Var2 = new hlr0();
                        UbiSpecificationId ubiSpecificationId2 = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var3 = oh61Var30.o.c;
                        String str8 = cr5Var3.e;
                        String str9 = cr5Var3.d;
                        m210 m210Var3 = oh61Var30.z;
                        if (m210Var3 == null) {
                            m210Var3 = oh61.D;
                        }
                        return oh61Var30.u.c(new r9c(str, str7, str8, str9, m210Var3, true, true, false, false, hlr0Var2, 2, 1, ubiSpecificationId2, (String) null, false, false, false), bundleG).map(new nh61((byte) 7)).toObservable().startWith(oh61Var30.m.c(8).w()).doOnSubscribe(new fv5(oh61Var30, (byte) 19));
                }
            }
        }));
        gv5Var2.accept(new v5y(vu5.class, "com.spotify.play_spotify_uri_option_extras", 2, new w5y() { // from class: p.e2s
            /* JADX WARN: Code duplicated, block: B:11:0x0044  */
            /* JADX WARN: Code duplicated, block: B:12:0x0047  */
            /* JADX WARN: Code duplicated, block: B:9:0x0038  */
            @Override // p.w5y
            public final Observable a(Object obj) {
                String str;
                byte b19 = b15;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                wq5 wq5Var = cv5.a;
                final byte b110 = 0;
                final byte b111 = 1;
                ifl1 ifl1Var2 = ifl1Var;
                switch (b19) {
                    case 0:
                        oh61 oh61Var = ((hv5) ifl1Var2.b).a;
                        int i = AppProtocolRemoteService.f1;
                        g510 g510Var = oh61Var.k;
                        m210 m210Var = oh61Var.z;
                        String strP = g510Var.p();
                        if (strP == null) {
                            strP = "";
                        }
                        return g510.q(g510Var, m210Var, g510Var.h.j(strP)).flatMapCompletable(new mh61(oh61Var, (byte) 7)).d(oh61Var.c.b().a().takeUntil(new nh61((byte) 4)).flatMap(new nh61((byte) 5)).timeout(25L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new nh61((byte) 6)));
                    case 1:
                        oh61 oh61Var2 = ((hv5) ifl1Var2.b).a;
                        int i2 = AppProtocolRemoteService.f1;
                        return oh61Var2.h((pu5) obj);
                    case 2:
                        oh61 oh61Var3 = ((hv5) ifl1Var2.b).a;
                        int i3 = AppProtocolRemoteService.f1;
                        return oh61Var3.e.b("type").startWith(new CompletableFromAction(new w43(oh61Var3.m, (byte) 6)).w()).map(new f341((byte) 17)).onErrorResumeNext(new f341((byte) 29));
                    case 3:
                        oh61 oh61Var4 = ((hv5) ifl1Var2.b).a;
                        int i4 = AppProtocolRemoteService.f1;
                        return oh61Var4.i((vu5) obj);
                    case 4:
                        su5 su5Var = (su5) obj;
                        oh61 oh61Var5 = ((hv5) ifl1Var2.b).a;
                        int i5 = AppProtocolRemoteService.f1;
                        return Single.create(new jf11((Object) su5Var, (byte) 18)).flatMap(new h341(oh61Var5, su5Var, (byte) 9)).toObservable().startWith(oh61Var5.m.c(2).w());
                    case 5:
                        final ks5 ks5Var = (ks5) obj;
                        final oh61 oh61Var6 = ((hv5) ifl1Var2.b).a;
                        int i6 = AppProtocolRemoteService.f1;
                        return oh61Var6.k.l(ks5Var.b.longValue(), oh61Var6.z).map(new f341((byte) 23)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b112 = b110;
                                ks5 ks5Var3 = ks5Var;
                                oh61 oh61Var8 = oh61Var6;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b112) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek in song", (byte) 18)).toObservable().startWith(oh61Var6.m.c(1).w());
                    case 6:
                        final ks5 ks5Var2 = (ks5) obj;
                        final oh61 oh61Var7 = ((hv5) ifl1Var2.b).a;
                        int i7 = AppProtocolRemoteService.f1;
                        return oh61Var7.k.k(ks5Var2.b.longValue(), oh61Var7.z).map(new f341((byte) 28)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b112 = b111;
                                ks5 ks5Var3 = ks5Var2;
                                oh61 oh61Var8 = oh61Var7;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b112) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek by in a song", (byte) 18)).toObservable().startWith(oh61Var7.m.c(1).w());
                    case 7:
                        oh61 oh61Var8 = ((hv5) ifl1Var2.b).a;
                        int i8 = AppProtocolRemoteService.f1;
                        dbm dbmVar = oh61Var8.m;
                        Flowable flowable = oh61Var8.h;
                        g510 g510Var2 = oh61Var8.k;
                        Integer num = ((ns5) obj).b;
                        int iIntValue = num.intValue();
                        if (iIntValue == 0) {
                            Flowable flowableT = flowable.T(dbmVar.c(1).v()).T(g510Var2.d(oh61Var8.z).map(new nh61((byte) 19)).flatMapCompletable(new mh61(oh61Var8, (byte) 10)).v());
                            nh61 nh61Var = new nh61((byte) 20);
                            flowableT.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT, nh61Var).x(new nh61((byte) 21)).J(new nh61((byte) 22)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 23));
                        }
                        if (iIntValue == 1) {
                            Flowable flowableT2 = flowable.T(dbmVar.c(1).v()).T(g510Var2.j(oh61Var8.z).map(new nh61((byte) 13)).flatMapCompletable(new mh61(oh61Var8, (byte) 9)).v());
                            nh61 nh61Var2 = new nh61((byte) 14);
                            flowableT2.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT2, nh61Var2).x(new nh61((byte) 16)).J(new nh61((byte) 17)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 18));
                        }
                        if (iIntValue == 50 || iIntValue == 80 || iIntValue == 100 || iIntValue == 120 || iIntValue == 150 || iIntValue == 200 || iIntValue == 300) {
                            return oh61Var8.j(num.intValue());
                        }
                        return IapException.a("Unexpected playback speed " + num);
                    case 8:
                        oh61 oh61Var9 = ((hv5) ifl1Var2.b).a;
                        int i9 = AppProtocolRemoteService.f1;
                        return oh61Var9.j((int) (((ot5) obj).b.floatValue() * 100.0f));
                    case 9:
                        oh61 oh61Var10 = ((hv5) ifl1Var2.b).a;
                        int i10 = AppProtocolRemoteService.f1;
                        return oh61Var10.k((zs5) obj);
                    case 10:
                        oh61 oh61Var11 = ((hv5) ifl1Var2.b).a;
                        int i11 = AppProtocolRemoteService.f1;
                        Flowable flowable2 = oh61Var11.f;
                        return Observable.combineLatest(x0d.j(flowable2, flowable2).startWith(new CompletableFromAction(new ok70(oh61Var11.m, 4)).w()), yoi1.i(oh61Var11.g.a(o6n.a), o6x.a).startWithItem(Boolean.FALSE).distinctUntilChanged(), new mh61(oh61Var11, (byte) 3));
                    case 11:
                        oh61 oh61Var12 = ((hv5) ifl1Var2.b).a;
                        int i12 = AppProtocolRemoteService.f1;
                        Flowable flowable3 = oh61Var12.h;
                        ObservableFromPublisher observableFromPublisherJ = x0d.j(flowable3, flowable3);
                        ys5 ys5Var = zs5.Companion;
                        Objects.requireNonNull(ys5Var);
                        return observableFromPublisherJ.map(new nh61(ys5Var, (byte) 15)).flatMap(new mh61(oh61Var12, (byte) 11));
                    case 12:
                        ft5 ft5Var = (ft5) obj;
                        oh61 oh61Var13 = ((hv5) ifl1Var2.b).a;
                        int i13 = AppProtocolRemoteService.f1;
                        return oh61Var13.h.T(oh61Var13.m.c(1).v()).z().flatMapCompletable(new h341(oh61Var13, ft5Var, (byte) 6)).d(Observable.just(wq5Var)).startWith(oh61Var13.k.c(oh61Var13.z, ft5Var.d.booleanValue()).ignoreElement().w());
                    case 13:
                        mq5 mq5Var = (mq5) obj;
                        oh61 oh61Var14 = ((hv5) ifl1Var2.b).a;
                        int i14 = AppProtocolRemoteService.f1;
                        Integer num2 = mq5Var.c;
                        int iIntValue2 = num2 == null ? 20 : num2.intValue();
                        String str2 = mq5Var.b;
                        if (str2.equals("spotify:recently-played")) {
                            str2 = "com.spotify.recently-played";
                        } else if (str2.equals("spotify:browse")) {
                            str2 = "com.spotify.browse";
                        }
                        String str3 = str2;
                        c610 c610Var = oh61Var14.u;
                        hlr0 hlr0Var = new hlr0();
                        UbiSpecificationId ubiSpecificationId = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var = oh61Var14.o.c;
                        String str4 = cr5Var.e;
                        String str5 = cr5Var.d;
                        String str6 = oh61Var14.y;
                        m210 m210Var2 = oh61Var14.z;
                        if (m210Var2 == null) {
                            m210Var2 = oh61.D;
                        }
                        return c610Var.c(new r9c(str6, str3, str4, str5, m210Var2, false, true, false, false, hlr0Var, 2, 1, ubiSpecificationId, (String) null, false, false, false), new Bundle()).map(new mp5(mq5Var, iIntValue2, (byte) 8)).doOnError(new fv5(str3, (byte) 21)).toObservable().doOnSubscribe(new po5(oh61Var14, mq5Var, (byte) 5)).startWith(oh61Var14.m.c(8).w());
                    case 14:
                        oh61 oh61Var15 = ((hv5) ifl1Var2.b).a;
                        int i15 = AppProtocolRemoteService.f1;
                        return oh61Var15.l((rt5) obj);
                    case 15:
                        oh61 oh61Var16 = ((hv5) ifl1Var2.b).a;
                        int i16 = AppProtocolRemoteService.f1;
                        Flowable flowable4 = oh61Var16.h;
                        return x0d.j(flowable4, flowable4).map(new nh61((byte) 1)).flatMap(new mh61(oh61Var16, (byte) 4));
                    case 16:
                        oh61 oh61Var17 = ((hv5) ifl1Var2.b).a;
                        int i17 = AppProtocolRemoteService.f1;
                        return oh61Var17.k.n(oh61Var17.z).map(new nh61((byte) 2)).flatMap(new mh61(oh61Var17, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var17.m.c(1).w());
                    case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                        oh61 oh61Var18 = ((hv5) ifl1Var2.b).a;
                        int i18 = AppProtocolRemoteService.f1;
                        return oh61Var18.k.o(oh61Var18.z).map(new f341((byte) 21)).zipWith(oh61Var18.h.z(), new f341((byte) 22)).flatMap(new h341(oh61Var18, (ut5) obj, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var18.m.c(1).w());
                    case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                        jr5 jr5Var = (jr5) obj;
                        oh61 oh61Var19 = ((hv5) ifl1Var2.b).a;
                        int i19 = AppProtocolRemoteService.f1;
                        return Observable.just(jr5Var).startWith(oh61Var19.m.c(1).w()).switchMap(new mh61(oh61Var19, (byte) 1)).flatMapSingle(new mh61(oh61Var19, (byte) 2)).filter(new f341((byte) 24)).map(new f341((byte) 25)).flatMap(new h341(oh61Var19, jr5Var, (byte) 7)).timeout(15L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new f341((byte) 26));
                    case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                        pu5 pu5Var = (pu5) obj;
                        oh61 oh61Var20 = ((hv5) ifl1Var2.b).a;
                        int i20 = AppProtocolRemoteService.f1;
                        Observable observable = oh61Var20.h.T(oh61Var20.m.c(2).v()).z().toObservable();
                        g510 g510Var3 = oh61Var20.k;
                        return observable.startWith(g510.q(g510Var3, oh61Var20.z, g510Var3.h.e(pu5Var.b)).ignoreElement().w()).map(new h341(oh61Var20, pu5Var, (byte) 8));
                    case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                        oh61 oh61Var21 = ((hv5) ifl1Var2.b).a;
                        int i21 = AppProtocolRemoteService.f1;
                        return oh61Var21.c.a.k.b().map(new nh61((byte) 9));
                    case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                        oh61 oh61Var22 = ((hv5) ifl1Var2.b).a;
                        int i22 = AppProtocolRemoteService.f1;
                        return oh61Var22.m.c(4).d(Observable.just(new ws5()));
                    case 22:
                        oh61 oh61Var23 = ((hv5) ifl1Var2.b).a;
                        int i23 = AppProtocolRemoteService.f1;
                        return oh61Var23.i((vu5) obj);
                    case 23:
                        oh61 oh61Var24 = ((hv5) ifl1Var2.b).a;
                        int i24 = AppProtocolRemoteService.f1;
                        return oh61Var24.l.a(((sr5) obj).b.intValue(), oh61Var24.z).q(oh61Var24.m.c(1)).d(Observable.just(wq5Var));
                    case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                        oh61 oh61Var25 = ((hv5) ifl1Var2.b).a;
                        int i25 = AppProtocolRemoteService.f1;
                        return new poj0(oh61Var25.c, oh61Var25.j, oh61Var25.h, oh61Var25.n, (byte) 10).r(oh61Var25.a.getResources()).startWith(oh61Var25.m.c(4).w()).firstOrError().toObservable().map(new f341((byte) 27));
                    case 25:
                        oh61 oh61Var26 = ((hv5) ifl1Var2.b).a;
                        int i26 = AppProtocolRemoteService.f1;
                        Flowable flowable5 = oh61Var26.h;
                        iu5 iu5Var = ju5.Companion;
                        Objects.requireNonNull(iu5Var);
                        Flowable flowableT3 = flowable5.J(new nh61(iu5Var, (byte) 8)).T(oh61Var26.m.c(4).v());
                        flowableT3.getClass();
                        return new ObservableFromPublisher(flowableT3);
                    case 26:
                        pr5 pr5Var = (pr5) obj;
                        oh61 oh61Var27 = ((hv5) ifl1Var2.b).a;
                        int i27 = AppProtocolRemoteService.f1;
                        cr5 cr5Var2 = oh61Var27.o.c;
                        return Single.create(new u2i0(oh61Var27, pr5Var, cr5Var2.l, cr5Var2.k, true)).toObservable().startWith(oh61Var27.m.b(4, pr5Var).w());
                    case 27:
                        oh61 oh61Var28 = ((hv5) ifl1Var2.b).a;
                        int i28 = AppProtocolRemoteService.f1;
                        return oh61Var28.h.T(oh61Var28.m.c(4).v()).z().toObservable().map(new nh61((byte) 0));
                    case 28:
                        oh61 oh61Var29 = ((hv5) ifl1Var2.b).a;
                        int i29 = AppProtocolRemoteService.f1;
                        return oh61Var29.f();
                    default:
                        ct5 ct5Var = (ct5) obj;
                        oh61 oh61Var30 = ((hv5) ifl1Var2.b).a;
                        int i30 = AppProtocolRemoteService.f1;
                        if (ct5Var != null) {
                            str = ct5Var.b;
                            if ("default".equals(str)) {
                                if ("car".equals(oh61Var30.z.f)) {
                                    str = "default-cars";
                                } else {
                                    str = "default";
                                }
                            }
                        } else if ("car".equals(oh61Var30.z.f)) {
                            str = "default-cars";
                        } else {
                            str = "default";
                        }
                        Observable observableJust = (oh61Var30.o.c.e.equals("com.google.android.apps.maps") && str.equals("default")) ? Observable.just(new yr5(0, 0, 0, z6x.a)) : null;
                        if (observableJust != null) {
                            return observableJust;
                        }
                        oh61Var30.y = str;
                        Bundle bundleG = cy30.g("_type", str);
                        String str7 = oh61Var30.f31p;
                        hlr0 hlr0Var2 = new hlr0();
                        UbiSpecificationId ubiSpecificationId2 = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var3 = oh61Var30.o.c;
                        String str8 = cr5Var3.e;
                        String str9 = cr5Var3.d;
                        m210 m210Var3 = oh61Var30.z;
                        if (m210Var3 == null) {
                            m210Var3 = oh61.D;
                        }
                        return oh61Var30.u.c(new r9c(str, str7, str8, str9, m210Var3, true, true, false, false, hlr0Var2, 2, 1, ubiSpecificationId2, (String) null, false, false, false), bundleG).map(new nh61((byte) 7)).toObservable().startWith(oh61Var30.m.c(8).w()).doOnSubscribe(new fv5(oh61Var30, (byte) 19));
                }
            }
        }));
        gv5Var2.accept(new v5y(su5.class, "com.spotify.play_uri", 2, new w5y() { // from class: p.e2s
            /* JADX WARN: Code duplicated, block: B:11:0x0044  */
            /* JADX WARN: Code duplicated, block: B:12:0x0047  */
            /* JADX WARN: Code duplicated, block: B:9:0x0038  */
            @Override // p.w5y
            public final Observable a(Object obj) {
                String str;
                byte b19 = b7;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                wq5 wq5Var = cv5.a;
                final byte b110 = 0;
                final byte b111 = 1;
                ifl1 ifl1Var2 = ifl1Var;
                switch (b19) {
                    case 0:
                        oh61 oh61Var = ((hv5) ifl1Var2.b).a;
                        int i = AppProtocolRemoteService.f1;
                        g510 g510Var = oh61Var.k;
                        m210 m210Var = oh61Var.z;
                        String strP = g510Var.p();
                        if (strP == null) {
                            strP = "";
                        }
                        return g510.q(g510Var, m210Var, g510Var.h.j(strP)).flatMapCompletable(new mh61(oh61Var, (byte) 7)).d(oh61Var.c.b().a().takeUntil(new nh61((byte) 4)).flatMap(new nh61((byte) 5)).timeout(25L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new nh61((byte) 6)));
                    case 1:
                        oh61 oh61Var2 = ((hv5) ifl1Var2.b).a;
                        int i2 = AppProtocolRemoteService.f1;
                        return oh61Var2.h((pu5) obj);
                    case 2:
                        oh61 oh61Var3 = ((hv5) ifl1Var2.b).a;
                        int i3 = AppProtocolRemoteService.f1;
                        return oh61Var3.e.b("type").startWith(new CompletableFromAction(new w43(oh61Var3.m, (byte) 6)).w()).map(new f341((byte) 17)).onErrorResumeNext(new f341((byte) 29));
                    case 3:
                        oh61 oh61Var4 = ((hv5) ifl1Var2.b).a;
                        int i4 = AppProtocolRemoteService.f1;
                        return oh61Var4.i((vu5) obj);
                    case 4:
                        su5 su5Var = (su5) obj;
                        oh61 oh61Var5 = ((hv5) ifl1Var2.b).a;
                        int i5 = AppProtocolRemoteService.f1;
                        return Single.create(new jf11((Object) su5Var, (byte) 18)).flatMap(new h341(oh61Var5, su5Var, (byte) 9)).toObservable().startWith(oh61Var5.m.c(2).w());
                    case 5:
                        final ks5 ks5Var = (ks5) obj;
                        final oh61 oh61Var6 = ((hv5) ifl1Var2.b).a;
                        int i6 = AppProtocolRemoteService.f1;
                        return oh61Var6.k.l(ks5Var.b.longValue(), oh61Var6.z).map(new f341((byte) 23)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b112 = b110;
                                ks5 ks5Var3 = ks5Var;
                                oh61 oh61Var8 = oh61Var6;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b112) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek in song", (byte) 18)).toObservable().startWith(oh61Var6.m.c(1).w());
                    case 6:
                        final ks5 ks5Var2 = (ks5) obj;
                        final oh61 oh61Var7 = ((hv5) ifl1Var2.b).a;
                        int i7 = AppProtocolRemoteService.f1;
                        return oh61Var7.k.k(ks5Var2.b.longValue(), oh61Var7.z).map(new f341((byte) 28)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b112 = b111;
                                ks5 ks5Var3 = ks5Var2;
                                oh61 oh61Var8 = oh61Var7;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b112) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek by in a song", (byte) 18)).toObservable().startWith(oh61Var7.m.c(1).w());
                    case 7:
                        oh61 oh61Var8 = ((hv5) ifl1Var2.b).a;
                        int i8 = AppProtocolRemoteService.f1;
                        dbm dbmVar = oh61Var8.m;
                        Flowable flowable = oh61Var8.h;
                        g510 g510Var2 = oh61Var8.k;
                        Integer num = ((ns5) obj).b;
                        int iIntValue = num.intValue();
                        if (iIntValue == 0) {
                            Flowable flowableT = flowable.T(dbmVar.c(1).v()).T(g510Var2.d(oh61Var8.z).map(new nh61((byte) 19)).flatMapCompletable(new mh61(oh61Var8, (byte) 10)).v());
                            nh61 nh61Var = new nh61((byte) 20);
                            flowableT.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT, nh61Var).x(new nh61((byte) 21)).J(new nh61((byte) 22)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 23));
                        }
                        if (iIntValue == 1) {
                            Flowable flowableT2 = flowable.T(dbmVar.c(1).v()).T(g510Var2.j(oh61Var8.z).map(new nh61((byte) 13)).flatMapCompletable(new mh61(oh61Var8, (byte) 9)).v());
                            nh61 nh61Var2 = new nh61((byte) 14);
                            flowableT2.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT2, nh61Var2).x(new nh61((byte) 16)).J(new nh61((byte) 17)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 18));
                        }
                        if (iIntValue == 50 || iIntValue == 80 || iIntValue == 100 || iIntValue == 120 || iIntValue == 150 || iIntValue == 200 || iIntValue == 300) {
                            return oh61Var8.j(num.intValue());
                        }
                        return IapException.a("Unexpected playback speed " + num);
                    case 8:
                        oh61 oh61Var9 = ((hv5) ifl1Var2.b).a;
                        int i9 = AppProtocolRemoteService.f1;
                        return oh61Var9.j((int) (((ot5) obj).b.floatValue() * 100.0f));
                    case 9:
                        oh61 oh61Var10 = ((hv5) ifl1Var2.b).a;
                        int i10 = AppProtocolRemoteService.f1;
                        return oh61Var10.k((zs5) obj);
                    case 10:
                        oh61 oh61Var11 = ((hv5) ifl1Var2.b).a;
                        int i11 = AppProtocolRemoteService.f1;
                        Flowable flowable2 = oh61Var11.f;
                        return Observable.combineLatest(x0d.j(flowable2, flowable2).startWith(new CompletableFromAction(new ok70(oh61Var11.m, 4)).w()), yoi1.i(oh61Var11.g.a(o6n.a), o6x.a).startWithItem(Boolean.FALSE).distinctUntilChanged(), new mh61(oh61Var11, (byte) 3));
                    case 11:
                        oh61 oh61Var12 = ((hv5) ifl1Var2.b).a;
                        int i12 = AppProtocolRemoteService.f1;
                        Flowable flowable3 = oh61Var12.h;
                        ObservableFromPublisher observableFromPublisherJ = x0d.j(flowable3, flowable3);
                        ys5 ys5Var = zs5.Companion;
                        Objects.requireNonNull(ys5Var);
                        return observableFromPublisherJ.map(new nh61(ys5Var, (byte) 15)).flatMap(new mh61(oh61Var12, (byte) 11));
                    case 12:
                        ft5 ft5Var = (ft5) obj;
                        oh61 oh61Var13 = ((hv5) ifl1Var2.b).a;
                        int i13 = AppProtocolRemoteService.f1;
                        return oh61Var13.h.T(oh61Var13.m.c(1).v()).z().flatMapCompletable(new h341(oh61Var13, ft5Var, (byte) 6)).d(Observable.just(wq5Var)).startWith(oh61Var13.k.c(oh61Var13.z, ft5Var.d.booleanValue()).ignoreElement().w());
                    case 13:
                        mq5 mq5Var = (mq5) obj;
                        oh61 oh61Var14 = ((hv5) ifl1Var2.b).a;
                        int i14 = AppProtocolRemoteService.f1;
                        Integer num2 = mq5Var.c;
                        int iIntValue2 = num2 == null ? 20 : num2.intValue();
                        String str2 = mq5Var.b;
                        if (str2.equals("spotify:recently-played")) {
                            str2 = "com.spotify.recently-played";
                        } else if (str2.equals("spotify:browse")) {
                            str2 = "com.spotify.browse";
                        }
                        String str3 = str2;
                        c610 c610Var = oh61Var14.u;
                        hlr0 hlr0Var = new hlr0();
                        UbiSpecificationId ubiSpecificationId = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var = oh61Var14.o.c;
                        String str4 = cr5Var.e;
                        String str5 = cr5Var.d;
                        String str6 = oh61Var14.y;
                        m210 m210Var2 = oh61Var14.z;
                        if (m210Var2 == null) {
                            m210Var2 = oh61.D;
                        }
                        return c610Var.c(new r9c(str6, str3, str4, str5, m210Var2, false, true, false, false, hlr0Var, 2, 1, ubiSpecificationId, (String) null, false, false, false), new Bundle()).map(new mp5(mq5Var, iIntValue2, (byte) 8)).doOnError(new fv5(str3, (byte) 21)).toObservable().doOnSubscribe(new po5(oh61Var14, mq5Var, (byte) 5)).startWith(oh61Var14.m.c(8).w());
                    case 14:
                        oh61 oh61Var15 = ((hv5) ifl1Var2.b).a;
                        int i15 = AppProtocolRemoteService.f1;
                        return oh61Var15.l((rt5) obj);
                    case 15:
                        oh61 oh61Var16 = ((hv5) ifl1Var2.b).a;
                        int i16 = AppProtocolRemoteService.f1;
                        Flowable flowable4 = oh61Var16.h;
                        return x0d.j(flowable4, flowable4).map(new nh61((byte) 1)).flatMap(new mh61(oh61Var16, (byte) 4));
                    case 16:
                        oh61 oh61Var17 = ((hv5) ifl1Var2.b).a;
                        int i17 = AppProtocolRemoteService.f1;
                        return oh61Var17.k.n(oh61Var17.z).map(new nh61((byte) 2)).flatMap(new mh61(oh61Var17, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var17.m.c(1).w());
                    case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                        oh61 oh61Var18 = ((hv5) ifl1Var2.b).a;
                        int i18 = AppProtocolRemoteService.f1;
                        return oh61Var18.k.o(oh61Var18.z).map(new f341((byte) 21)).zipWith(oh61Var18.h.z(), new f341((byte) 22)).flatMap(new h341(oh61Var18, (ut5) obj, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var18.m.c(1).w());
                    case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                        jr5 jr5Var = (jr5) obj;
                        oh61 oh61Var19 = ((hv5) ifl1Var2.b).a;
                        int i19 = AppProtocolRemoteService.f1;
                        return Observable.just(jr5Var).startWith(oh61Var19.m.c(1).w()).switchMap(new mh61(oh61Var19, (byte) 1)).flatMapSingle(new mh61(oh61Var19, (byte) 2)).filter(new f341((byte) 24)).map(new f341((byte) 25)).flatMap(new h341(oh61Var19, jr5Var, (byte) 7)).timeout(15L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new f341((byte) 26));
                    case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                        pu5 pu5Var = (pu5) obj;
                        oh61 oh61Var20 = ((hv5) ifl1Var2.b).a;
                        int i20 = AppProtocolRemoteService.f1;
                        Observable observable = oh61Var20.h.T(oh61Var20.m.c(2).v()).z().toObservable();
                        g510 g510Var3 = oh61Var20.k;
                        return observable.startWith(g510.q(g510Var3, oh61Var20.z, g510Var3.h.e(pu5Var.b)).ignoreElement().w()).map(new h341(oh61Var20, pu5Var, (byte) 8));
                    case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                        oh61 oh61Var21 = ((hv5) ifl1Var2.b).a;
                        int i21 = AppProtocolRemoteService.f1;
                        return oh61Var21.c.a.k.b().map(new nh61((byte) 9));
                    case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                        oh61 oh61Var22 = ((hv5) ifl1Var2.b).a;
                        int i22 = AppProtocolRemoteService.f1;
                        return oh61Var22.m.c(4).d(Observable.just(new ws5()));
                    case 22:
                        oh61 oh61Var23 = ((hv5) ifl1Var2.b).a;
                        int i23 = AppProtocolRemoteService.f1;
                        return oh61Var23.i((vu5) obj);
                    case 23:
                        oh61 oh61Var24 = ((hv5) ifl1Var2.b).a;
                        int i24 = AppProtocolRemoteService.f1;
                        return oh61Var24.l.a(((sr5) obj).b.intValue(), oh61Var24.z).q(oh61Var24.m.c(1)).d(Observable.just(wq5Var));
                    case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                        oh61 oh61Var25 = ((hv5) ifl1Var2.b).a;
                        int i25 = AppProtocolRemoteService.f1;
                        return new poj0(oh61Var25.c, oh61Var25.j, oh61Var25.h, oh61Var25.n, (byte) 10).r(oh61Var25.a.getResources()).startWith(oh61Var25.m.c(4).w()).firstOrError().toObservable().map(new f341((byte) 27));
                    case 25:
                        oh61 oh61Var26 = ((hv5) ifl1Var2.b).a;
                        int i26 = AppProtocolRemoteService.f1;
                        Flowable flowable5 = oh61Var26.h;
                        iu5 iu5Var = ju5.Companion;
                        Objects.requireNonNull(iu5Var);
                        Flowable flowableT3 = flowable5.J(new nh61(iu5Var, (byte) 8)).T(oh61Var26.m.c(4).v());
                        flowableT3.getClass();
                        return new ObservableFromPublisher(flowableT3);
                    case 26:
                        pr5 pr5Var = (pr5) obj;
                        oh61 oh61Var27 = ((hv5) ifl1Var2.b).a;
                        int i27 = AppProtocolRemoteService.f1;
                        cr5 cr5Var2 = oh61Var27.o.c;
                        return Single.create(new u2i0(oh61Var27, pr5Var, cr5Var2.l, cr5Var2.k, true)).toObservable().startWith(oh61Var27.m.b(4, pr5Var).w());
                    case 27:
                        oh61 oh61Var28 = ((hv5) ifl1Var2.b).a;
                        int i28 = AppProtocolRemoteService.f1;
                        return oh61Var28.h.T(oh61Var28.m.c(4).v()).z().toObservable().map(new nh61((byte) 0));
                    case 28:
                        oh61 oh61Var29 = ((hv5) ifl1Var2.b).a;
                        int i29 = AppProtocolRemoteService.f1;
                        return oh61Var29.f();
                    default:
                        ct5 ct5Var = (ct5) obj;
                        oh61 oh61Var30 = ((hv5) ifl1Var2.b).a;
                        int i30 = AppProtocolRemoteService.f1;
                        if (ct5Var != null) {
                            str = ct5Var.b;
                            if ("default".equals(str)) {
                                if ("car".equals(oh61Var30.z.f)) {
                                    str = "default-cars";
                                } else {
                                    str = "default";
                                }
                            }
                        } else if ("car".equals(oh61Var30.z.f)) {
                            str = "default-cars";
                        } else {
                            str = "default";
                        }
                        Observable observableJust = (oh61Var30.o.c.e.equals("com.google.android.apps.maps") && str.equals("default")) ? Observable.just(new yr5(0, 0, 0, z6x.a)) : null;
                        if (observableJust != null) {
                            return observableJust;
                        }
                        oh61Var30.y = str;
                        Bundle bundleG = cy30.g("_type", str);
                        String str7 = oh61Var30.f31p;
                        hlr0 hlr0Var2 = new hlr0();
                        UbiSpecificationId ubiSpecificationId2 = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var3 = oh61Var30.o.c;
                        String str8 = cr5Var3.e;
                        String str9 = cr5Var3.d;
                        m210 m210Var3 = oh61Var30.z;
                        if (m210Var3 == null) {
                            m210Var3 = oh61.D;
                        }
                        return oh61Var30.u.c(new r9c(str, str7, str8, str9, m210Var3, true, true, false, false, hlr0Var2, 2, 1, ubiSpecificationId2, (String) null, false, false, false), bundleG).map(new nh61((byte) 7)).toObservable().startWith(oh61Var30.m.c(8).w()).doOnSubscribe(new fv5(oh61Var30, (byte) 19));
                }
            }
        }));
        gv5Var2.accept(new v5y(ks5.class, "com.spotify.set_playback_position", 1, new w5y() { // from class: p.e2s
            /* JADX WARN: Code duplicated, block: B:11:0x0044  */
            /* JADX WARN: Code duplicated, block: B:12:0x0047  */
            /* JADX WARN: Code duplicated, block: B:9:0x0038  */
            @Override // p.w5y
            public final Observable a(Object obj) {
                String str;
                byte b19 = b17;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                wq5 wq5Var = cv5.a;
                final byte b110 = 0;
                final byte b111 = 1;
                ifl1 ifl1Var2 = ifl1Var;
                switch (b19) {
                    case 0:
                        oh61 oh61Var = ((hv5) ifl1Var2.b).a;
                        int i = AppProtocolRemoteService.f1;
                        g510 g510Var = oh61Var.k;
                        m210 m210Var = oh61Var.z;
                        String strP = g510Var.p();
                        if (strP == null) {
                            strP = "";
                        }
                        return g510.q(g510Var, m210Var, g510Var.h.j(strP)).flatMapCompletable(new mh61(oh61Var, (byte) 7)).d(oh61Var.c.b().a().takeUntil(new nh61((byte) 4)).flatMap(new nh61((byte) 5)).timeout(25L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new nh61((byte) 6)));
                    case 1:
                        oh61 oh61Var2 = ((hv5) ifl1Var2.b).a;
                        int i2 = AppProtocolRemoteService.f1;
                        return oh61Var2.h((pu5) obj);
                    case 2:
                        oh61 oh61Var3 = ((hv5) ifl1Var2.b).a;
                        int i3 = AppProtocolRemoteService.f1;
                        return oh61Var3.e.b("type").startWith(new CompletableFromAction(new w43(oh61Var3.m, (byte) 6)).w()).map(new f341((byte) 17)).onErrorResumeNext(new f341((byte) 29));
                    case 3:
                        oh61 oh61Var4 = ((hv5) ifl1Var2.b).a;
                        int i4 = AppProtocolRemoteService.f1;
                        return oh61Var4.i((vu5) obj);
                    case 4:
                        su5 su5Var = (su5) obj;
                        oh61 oh61Var5 = ((hv5) ifl1Var2.b).a;
                        int i5 = AppProtocolRemoteService.f1;
                        return Single.create(new jf11((Object) su5Var, (byte) 18)).flatMap(new h341(oh61Var5, su5Var, (byte) 9)).toObservable().startWith(oh61Var5.m.c(2).w());
                    case 5:
                        final ks5 ks5Var = (ks5) obj;
                        final oh61 oh61Var6 = ((hv5) ifl1Var2.b).a;
                        int i6 = AppProtocolRemoteService.f1;
                        return oh61Var6.k.l(ks5Var.b.longValue(), oh61Var6.z).map(new f341((byte) 23)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b112 = b110;
                                ks5 ks5Var3 = ks5Var;
                                oh61 oh61Var8 = oh61Var6;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b112) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek in song", (byte) 18)).toObservable().startWith(oh61Var6.m.c(1).w());
                    case 6:
                        final ks5 ks5Var2 = (ks5) obj;
                        final oh61 oh61Var7 = ((hv5) ifl1Var2.b).a;
                        int i7 = AppProtocolRemoteService.f1;
                        return oh61Var7.k.k(ks5Var2.b.longValue(), oh61Var7.z).map(new f341((byte) 28)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b112 = b111;
                                ks5 ks5Var3 = ks5Var2;
                                oh61 oh61Var8 = oh61Var7;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b112) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek by in a song", (byte) 18)).toObservable().startWith(oh61Var7.m.c(1).w());
                    case 7:
                        oh61 oh61Var8 = ((hv5) ifl1Var2.b).a;
                        int i8 = AppProtocolRemoteService.f1;
                        dbm dbmVar = oh61Var8.m;
                        Flowable flowable = oh61Var8.h;
                        g510 g510Var2 = oh61Var8.k;
                        Integer num = ((ns5) obj).b;
                        int iIntValue = num.intValue();
                        if (iIntValue == 0) {
                            Flowable flowableT = flowable.T(dbmVar.c(1).v()).T(g510Var2.d(oh61Var8.z).map(new nh61((byte) 19)).flatMapCompletable(new mh61(oh61Var8, (byte) 10)).v());
                            nh61 nh61Var = new nh61((byte) 20);
                            flowableT.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT, nh61Var).x(new nh61((byte) 21)).J(new nh61((byte) 22)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 23));
                        }
                        if (iIntValue == 1) {
                            Flowable flowableT2 = flowable.T(dbmVar.c(1).v()).T(g510Var2.j(oh61Var8.z).map(new nh61((byte) 13)).flatMapCompletable(new mh61(oh61Var8, (byte) 9)).v());
                            nh61 nh61Var2 = new nh61((byte) 14);
                            flowableT2.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT2, nh61Var2).x(new nh61((byte) 16)).J(new nh61((byte) 17)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 18));
                        }
                        if (iIntValue == 50 || iIntValue == 80 || iIntValue == 100 || iIntValue == 120 || iIntValue == 150 || iIntValue == 200 || iIntValue == 300) {
                            return oh61Var8.j(num.intValue());
                        }
                        return IapException.a("Unexpected playback speed " + num);
                    case 8:
                        oh61 oh61Var9 = ((hv5) ifl1Var2.b).a;
                        int i9 = AppProtocolRemoteService.f1;
                        return oh61Var9.j((int) (((ot5) obj).b.floatValue() * 100.0f));
                    case 9:
                        oh61 oh61Var10 = ((hv5) ifl1Var2.b).a;
                        int i10 = AppProtocolRemoteService.f1;
                        return oh61Var10.k((zs5) obj);
                    case 10:
                        oh61 oh61Var11 = ((hv5) ifl1Var2.b).a;
                        int i11 = AppProtocolRemoteService.f1;
                        Flowable flowable2 = oh61Var11.f;
                        return Observable.combineLatest(x0d.j(flowable2, flowable2).startWith(new CompletableFromAction(new ok70(oh61Var11.m, 4)).w()), yoi1.i(oh61Var11.g.a(o6n.a), o6x.a).startWithItem(Boolean.FALSE).distinctUntilChanged(), new mh61(oh61Var11, (byte) 3));
                    case 11:
                        oh61 oh61Var12 = ((hv5) ifl1Var2.b).a;
                        int i12 = AppProtocolRemoteService.f1;
                        Flowable flowable3 = oh61Var12.h;
                        ObservableFromPublisher observableFromPublisherJ = x0d.j(flowable3, flowable3);
                        ys5 ys5Var = zs5.Companion;
                        Objects.requireNonNull(ys5Var);
                        return observableFromPublisherJ.map(new nh61(ys5Var, (byte) 15)).flatMap(new mh61(oh61Var12, (byte) 11));
                    case 12:
                        ft5 ft5Var = (ft5) obj;
                        oh61 oh61Var13 = ((hv5) ifl1Var2.b).a;
                        int i13 = AppProtocolRemoteService.f1;
                        return oh61Var13.h.T(oh61Var13.m.c(1).v()).z().flatMapCompletable(new h341(oh61Var13, ft5Var, (byte) 6)).d(Observable.just(wq5Var)).startWith(oh61Var13.k.c(oh61Var13.z, ft5Var.d.booleanValue()).ignoreElement().w());
                    case 13:
                        mq5 mq5Var = (mq5) obj;
                        oh61 oh61Var14 = ((hv5) ifl1Var2.b).a;
                        int i14 = AppProtocolRemoteService.f1;
                        Integer num2 = mq5Var.c;
                        int iIntValue2 = num2 == null ? 20 : num2.intValue();
                        String str2 = mq5Var.b;
                        if (str2.equals("spotify:recently-played")) {
                            str2 = "com.spotify.recently-played";
                        } else if (str2.equals("spotify:browse")) {
                            str2 = "com.spotify.browse";
                        }
                        String str3 = str2;
                        c610 c610Var = oh61Var14.u;
                        hlr0 hlr0Var = new hlr0();
                        UbiSpecificationId ubiSpecificationId = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var = oh61Var14.o.c;
                        String str4 = cr5Var.e;
                        String str5 = cr5Var.d;
                        String str6 = oh61Var14.y;
                        m210 m210Var2 = oh61Var14.z;
                        if (m210Var2 == null) {
                            m210Var2 = oh61.D;
                        }
                        return c610Var.c(new r9c(str6, str3, str4, str5, m210Var2, false, true, false, false, hlr0Var, 2, 1, ubiSpecificationId, (String) null, false, false, false), new Bundle()).map(new mp5(mq5Var, iIntValue2, (byte) 8)).doOnError(new fv5(str3, (byte) 21)).toObservable().doOnSubscribe(new po5(oh61Var14, mq5Var, (byte) 5)).startWith(oh61Var14.m.c(8).w());
                    case 14:
                        oh61 oh61Var15 = ((hv5) ifl1Var2.b).a;
                        int i15 = AppProtocolRemoteService.f1;
                        return oh61Var15.l((rt5) obj);
                    case 15:
                        oh61 oh61Var16 = ((hv5) ifl1Var2.b).a;
                        int i16 = AppProtocolRemoteService.f1;
                        Flowable flowable4 = oh61Var16.h;
                        return x0d.j(flowable4, flowable4).map(new nh61((byte) 1)).flatMap(new mh61(oh61Var16, (byte) 4));
                    case 16:
                        oh61 oh61Var17 = ((hv5) ifl1Var2.b).a;
                        int i17 = AppProtocolRemoteService.f1;
                        return oh61Var17.k.n(oh61Var17.z).map(new nh61((byte) 2)).flatMap(new mh61(oh61Var17, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var17.m.c(1).w());
                    case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                        oh61 oh61Var18 = ((hv5) ifl1Var2.b).a;
                        int i18 = AppProtocolRemoteService.f1;
                        return oh61Var18.k.o(oh61Var18.z).map(new f341((byte) 21)).zipWith(oh61Var18.h.z(), new f341((byte) 22)).flatMap(new h341(oh61Var18, (ut5) obj, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var18.m.c(1).w());
                    case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                        jr5 jr5Var = (jr5) obj;
                        oh61 oh61Var19 = ((hv5) ifl1Var2.b).a;
                        int i19 = AppProtocolRemoteService.f1;
                        return Observable.just(jr5Var).startWith(oh61Var19.m.c(1).w()).switchMap(new mh61(oh61Var19, (byte) 1)).flatMapSingle(new mh61(oh61Var19, (byte) 2)).filter(new f341((byte) 24)).map(new f341((byte) 25)).flatMap(new h341(oh61Var19, jr5Var, (byte) 7)).timeout(15L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new f341((byte) 26));
                    case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                        pu5 pu5Var = (pu5) obj;
                        oh61 oh61Var20 = ((hv5) ifl1Var2.b).a;
                        int i20 = AppProtocolRemoteService.f1;
                        Observable observable = oh61Var20.h.T(oh61Var20.m.c(2).v()).z().toObservable();
                        g510 g510Var3 = oh61Var20.k;
                        return observable.startWith(g510.q(g510Var3, oh61Var20.z, g510Var3.h.e(pu5Var.b)).ignoreElement().w()).map(new h341(oh61Var20, pu5Var, (byte) 8));
                    case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                        oh61 oh61Var21 = ((hv5) ifl1Var2.b).a;
                        int i21 = AppProtocolRemoteService.f1;
                        return oh61Var21.c.a.k.b().map(new nh61((byte) 9));
                    case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                        oh61 oh61Var22 = ((hv5) ifl1Var2.b).a;
                        int i22 = AppProtocolRemoteService.f1;
                        return oh61Var22.m.c(4).d(Observable.just(new ws5()));
                    case 22:
                        oh61 oh61Var23 = ((hv5) ifl1Var2.b).a;
                        int i23 = AppProtocolRemoteService.f1;
                        return oh61Var23.i((vu5) obj);
                    case 23:
                        oh61 oh61Var24 = ((hv5) ifl1Var2.b).a;
                        int i24 = AppProtocolRemoteService.f1;
                        return oh61Var24.l.a(((sr5) obj).b.intValue(), oh61Var24.z).q(oh61Var24.m.c(1)).d(Observable.just(wq5Var));
                    case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                        oh61 oh61Var25 = ((hv5) ifl1Var2.b).a;
                        int i25 = AppProtocolRemoteService.f1;
                        return new poj0(oh61Var25.c, oh61Var25.j, oh61Var25.h, oh61Var25.n, (byte) 10).r(oh61Var25.a.getResources()).startWith(oh61Var25.m.c(4).w()).firstOrError().toObservable().map(new f341((byte) 27));
                    case 25:
                        oh61 oh61Var26 = ((hv5) ifl1Var2.b).a;
                        int i26 = AppProtocolRemoteService.f1;
                        Flowable flowable5 = oh61Var26.h;
                        iu5 iu5Var = ju5.Companion;
                        Objects.requireNonNull(iu5Var);
                        Flowable flowableT3 = flowable5.J(new nh61(iu5Var, (byte) 8)).T(oh61Var26.m.c(4).v());
                        flowableT3.getClass();
                        return new ObservableFromPublisher(flowableT3);
                    case 26:
                        pr5 pr5Var = (pr5) obj;
                        oh61 oh61Var27 = ((hv5) ifl1Var2.b).a;
                        int i27 = AppProtocolRemoteService.f1;
                        cr5 cr5Var2 = oh61Var27.o.c;
                        return Single.create(new u2i0(oh61Var27, pr5Var, cr5Var2.l, cr5Var2.k, true)).toObservable().startWith(oh61Var27.m.b(4, pr5Var).w());
                    case 27:
                        oh61 oh61Var28 = ((hv5) ifl1Var2.b).a;
                        int i28 = AppProtocolRemoteService.f1;
                        return oh61Var28.h.T(oh61Var28.m.c(4).v()).z().toObservable().map(new nh61((byte) 0));
                    case 28:
                        oh61 oh61Var29 = ((hv5) ifl1Var2.b).a;
                        int i29 = AppProtocolRemoteService.f1;
                        return oh61Var29.f();
                    default:
                        ct5 ct5Var = (ct5) obj;
                        oh61 oh61Var30 = ((hv5) ifl1Var2.b).a;
                        int i30 = AppProtocolRemoteService.f1;
                        if (ct5Var != null) {
                            str = ct5Var.b;
                            if ("default".equals(str)) {
                                if ("car".equals(oh61Var30.z.f)) {
                                    str = "default-cars";
                                } else {
                                    str = "default";
                                }
                            }
                        } else if ("car".equals(oh61Var30.z.f)) {
                            str = "default-cars";
                        } else {
                            str = "default";
                        }
                        Observable observableJust = (oh61Var30.o.c.e.equals("com.google.android.apps.maps") && str.equals("default")) ? Observable.just(new yr5(0, 0, 0, z6x.a)) : null;
                        if (observableJust != null) {
                            return observableJust;
                        }
                        oh61Var30.y = str;
                        Bundle bundleG = cy30.g("_type", str);
                        String str7 = oh61Var30.f31p;
                        hlr0 hlr0Var2 = new hlr0();
                        UbiSpecificationId ubiSpecificationId2 = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var3 = oh61Var30.o.c;
                        String str8 = cr5Var3.e;
                        String str9 = cr5Var3.d;
                        m210 m210Var3 = oh61Var30.z;
                        if (m210Var3 == null) {
                            m210Var3 = oh61.D;
                        }
                        return oh61Var30.u.c(new r9c(str, str7, str8, str9, m210Var3, true, true, false, false, hlr0Var2, 2, 1, ubiSpecificationId2, (String) null, false, false, false), bundleG).map(new nh61((byte) 7)).toObservable().startWith(oh61Var30.m.c(8).w()).doOnSubscribe(new fv5(oh61Var30, (byte) 19));
                }
            }
        }));
        gv5Var2.accept(new v5y(ks5.class, "com.spotify.seek_to_relative_position", 1, new w5y() { // from class: p.e2s
            /* JADX WARN: Code duplicated, block: B:11:0x0044  */
            /* JADX WARN: Code duplicated, block: B:12:0x0047  */
            /* JADX WARN: Code duplicated, block: B:9:0x0038  */
            @Override // p.w5y
            public final Observable a(Object obj) {
                String str;
                byte b19 = b18;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                wq5 wq5Var = cv5.a;
                final byte b110 = 0;
                final byte b111 = 1;
                ifl1 ifl1Var2 = ifl1Var;
                switch (b19) {
                    case 0:
                        oh61 oh61Var = ((hv5) ifl1Var2.b).a;
                        int i = AppProtocolRemoteService.f1;
                        g510 g510Var = oh61Var.k;
                        m210 m210Var = oh61Var.z;
                        String strP = g510Var.p();
                        if (strP == null) {
                            strP = "";
                        }
                        return g510.q(g510Var, m210Var, g510Var.h.j(strP)).flatMapCompletable(new mh61(oh61Var, (byte) 7)).d(oh61Var.c.b().a().takeUntil(new nh61((byte) 4)).flatMap(new nh61((byte) 5)).timeout(25L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new nh61((byte) 6)));
                    case 1:
                        oh61 oh61Var2 = ((hv5) ifl1Var2.b).a;
                        int i2 = AppProtocolRemoteService.f1;
                        return oh61Var2.h((pu5) obj);
                    case 2:
                        oh61 oh61Var3 = ((hv5) ifl1Var2.b).a;
                        int i3 = AppProtocolRemoteService.f1;
                        return oh61Var3.e.b("type").startWith(new CompletableFromAction(new w43(oh61Var3.m, (byte) 6)).w()).map(new f341((byte) 17)).onErrorResumeNext(new f341((byte) 29));
                    case 3:
                        oh61 oh61Var4 = ((hv5) ifl1Var2.b).a;
                        int i4 = AppProtocolRemoteService.f1;
                        return oh61Var4.i((vu5) obj);
                    case 4:
                        su5 su5Var = (su5) obj;
                        oh61 oh61Var5 = ((hv5) ifl1Var2.b).a;
                        int i5 = AppProtocolRemoteService.f1;
                        return Single.create(new jf11((Object) su5Var, (byte) 18)).flatMap(new h341(oh61Var5, su5Var, (byte) 9)).toObservable().startWith(oh61Var5.m.c(2).w());
                    case 5:
                        final ks5 ks5Var = (ks5) obj;
                        final oh61 oh61Var6 = ((hv5) ifl1Var2.b).a;
                        int i6 = AppProtocolRemoteService.f1;
                        return oh61Var6.k.l(ks5Var.b.longValue(), oh61Var6.z).map(new f341((byte) 23)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b112 = b110;
                                ks5 ks5Var3 = ks5Var;
                                oh61 oh61Var8 = oh61Var6;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b112) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek in song", (byte) 18)).toObservable().startWith(oh61Var6.m.c(1).w());
                    case 6:
                        final ks5 ks5Var2 = (ks5) obj;
                        final oh61 oh61Var7 = ((hv5) ifl1Var2.b).a;
                        int i7 = AppProtocolRemoteService.f1;
                        return oh61Var7.k.k(ks5Var2.b.longValue(), oh61Var7.z).map(new f341((byte) 28)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b112 = b111;
                                ks5 ks5Var3 = ks5Var2;
                                oh61 oh61Var8 = oh61Var7;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b112) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek by in a song", (byte) 18)).toObservable().startWith(oh61Var7.m.c(1).w());
                    case 7:
                        oh61 oh61Var8 = ((hv5) ifl1Var2.b).a;
                        int i8 = AppProtocolRemoteService.f1;
                        dbm dbmVar = oh61Var8.m;
                        Flowable flowable = oh61Var8.h;
                        g510 g510Var2 = oh61Var8.k;
                        Integer num = ((ns5) obj).b;
                        int iIntValue = num.intValue();
                        if (iIntValue == 0) {
                            Flowable flowableT = flowable.T(dbmVar.c(1).v()).T(g510Var2.d(oh61Var8.z).map(new nh61((byte) 19)).flatMapCompletable(new mh61(oh61Var8, (byte) 10)).v());
                            nh61 nh61Var = new nh61((byte) 20);
                            flowableT.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT, nh61Var).x(new nh61((byte) 21)).J(new nh61((byte) 22)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 23));
                        }
                        if (iIntValue == 1) {
                            Flowable flowableT2 = flowable.T(dbmVar.c(1).v()).T(g510Var2.j(oh61Var8.z).map(new nh61((byte) 13)).flatMapCompletable(new mh61(oh61Var8, (byte) 9)).v());
                            nh61 nh61Var2 = new nh61((byte) 14);
                            flowableT2.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT2, nh61Var2).x(new nh61((byte) 16)).J(new nh61((byte) 17)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 18));
                        }
                        if (iIntValue == 50 || iIntValue == 80 || iIntValue == 100 || iIntValue == 120 || iIntValue == 150 || iIntValue == 200 || iIntValue == 300) {
                            return oh61Var8.j(num.intValue());
                        }
                        return IapException.a("Unexpected playback speed " + num);
                    case 8:
                        oh61 oh61Var9 = ((hv5) ifl1Var2.b).a;
                        int i9 = AppProtocolRemoteService.f1;
                        return oh61Var9.j((int) (((ot5) obj).b.floatValue() * 100.0f));
                    case 9:
                        oh61 oh61Var10 = ((hv5) ifl1Var2.b).a;
                        int i10 = AppProtocolRemoteService.f1;
                        return oh61Var10.k((zs5) obj);
                    case 10:
                        oh61 oh61Var11 = ((hv5) ifl1Var2.b).a;
                        int i11 = AppProtocolRemoteService.f1;
                        Flowable flowable2 = oh61Var11.f;
                        return Observable.combineLatest(x0d.j(flowable2, flowable2).startWith(new CompletableFromAction(new ok70(oh61Var11.m, 4)).w()), yoi1.i(oh61Var11.g.a(o6n.a), o6x.a).startWithItem(Boolean.FALSE).distinctUntilChanged(), new mh61(oh61Var11, (byte) 3));
                    case 11:
                        oh61 oh61Var12 = ((hv5) ifl1Var2.b).a;
                        int i12 = AppProtocolRemoteService.f1;
                        Flowable flowable3 = oh61Var12.h;
                        ObservableFromPublisher observableFromPublisherJ = x0d.j(flowable3, flowable3);
                        ys5 ys5Var = zs5.Companion;
                        Objects.requireNonNull(ys5Var);
                        return observableFromPublisherJ.map(new nh61(ys5Var, (byte) 15)).flatMap(new mh61(oh61Var12, (byte) 11));
                    case 12:
                        ft5 ft5Var = (ft5) obj;
                        oh61 oh61Var13 = ((hv5) ifl1Var2.b).a;
                        int i13 = AppProtocolRemoteService.f1;
                        return oh61Var13.h.T(oh61Var13.m.c(1).v()).z().flatMapCompletable(new h341(oh61Var13, ft5Var, (byte) 6)).d(Observable.just(wq5Var)).startWith(oh61Var13.k.c(oh61Var13.z, ft5Var.d.booleanValue()).ignoreElement().w());
                    case 13:
                        mq5 mq5Var = (mq5) obj;
                        oh61 oh61Var14 = ((hv5) ifl1Var2.b).a;
                        int i14 = AppProtocolRemoteService.f1;
                        Integer num2 = mq5Var.c;
                        int iIntValue2 = num2 == null ? 20 : num2.intValue();
                        String str2 = mq5Var.b;
                        if (str2.equals("spotify:recently-played")) {
                            str2 = "com.spotify.recently-played";
                        } else if (str2.equals("spotify:browse")) {
                            str2 = "com.spotify.browse";
                        }
                        String str3 = str2;
                        c610 c610Var = oh61Var14.u;
                        hlr0 hlr0Var = new hlr0();
                        UbiSpecificationId ubiSpecificationId = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var = oh61Var14.o.c;
                        String str4 = cr5Var.e;
                        String str5 = cr5Var.d;
                        String str6 = oh61Var14.y;
                        m210 m210Var2 = oh61Var14.z;
                        if (m210Var2 == null) {
                            m210Var2 = oh61.D;
                        }
                        return c610Var.c(new r9c(str6, str3, str4, str5, m210Var2, false, true, false, false, hlr0Var, 2, 1, ubiSpecificationId, (String) null, false, false, false), new Bundle()).map(new mp5(mq5Var, iIntValue2, (byte) 8)).doOnError(new fv5(str3, (byte) 21)).toObservable().doOnSubscribe(new po5(oh61Var14, mq5Var, (byte) 5)).startWith(oh61Var14.m.c(8).w());
                    case 14:
                        oh61 oh61Var15 = ((hv5) ifl1Var2.b).a;
                        int i15 = AppProtocolRemoteService.f1;
                        return oh61Var15.l((rt5) obj);
                    case 15:
                        oh61 oh61Var16 = ((hv5) ifl1Var2.b).a;
                        int i16 = AppProtocolRemoteService.f1;
                        Flowable flowable4 = oh61Var16.h;
                        return x0d.j(flowable4, flowable4).map(new nh61((byte) 1)).flatMap(new mh61(oh61Var16, (byte) 4));
                    case 16:
                        oh61 oh61Var17 = ((hv5) ifl1Var2.b).a;
                        int i17 = AppProtocolRemoteService.f1;
                        return oh61Var17.k.n(oh61Var17.z).map(new nh61((byte) 2)).flatMap(new mh61(oh61Var17, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var17.m.c(1).w());
                    case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                        oh61 oh61Var18 = ((hv5) ifl1Var2.b).a;
                        int i18 = AppProtocolRemoteService.f1;
                        return oh61Var18.k.o(oh61Var18.z).map(new f341((byte) 21)).zipWith(oh61Var18.h.z(), new f341((byte) 22)).flatMap(new h341(oh61Var18, (ut5) obj, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var18.m.c(1).w());
                    case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                        jr5 jr5Var = (jr5) obj;
                        oh61 oh61Var19 = ((hv5) ifl1Var2.b).a;
                        int i19 = AppProtocolRemoteService.f1;
                        return Observable.just(jr5Var).startWith(oh61Var19.m.c(1).w()).switchMap(new mh61(oh61Var19, (byte) 1)).flatMapSingle(new mh61(oh61Var19, (byte) 2)).filter(new f341((byte) 24)).map(new f341((byte) 25)).flatMap(new h341(oh61Var19, jr5Var, (byte) 7)).timeout(15L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new f341((byte) 26));
                    case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                        pu5 pu5Var = (pu5) obj;
                        oh61 oh61Var20 = ((hv5) ifl1Var2.b).a;
                        int i20 = AppProtocolRemoteService.f1;
                        Observable observable = oh61Var20.h.T(oh61Var20.m.c(2).v()).z().toObservable();
                        g510 g510Var3 = oh61Var20.k;
                        return observable.startWith(g510.q(g510Var3, oh61Var20.z, g510Var3.h.e(pu5Var.b)).ignoreElement().w()).map(new h341(oh61Var20, pu5Var, (byte) 8));
                    case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                        oh61 oh61Var21 = ((hv5) ifl1Var2.b).a;
                        int i21 = AppProtocolRemoteService.f1;
                        return oh61Var21.c.a.k.b().map(new nh61((byte) 9));
                    case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                        oh61 oh61Var22 = ((hv5) ifl1Var2.b).a;
                        int i22 = AppProtocolRemoteService.f1;
                        return oh61Var22.m.c(4).d(Observable.just(new ws5()));
                    case 22:
                        oh61 oh61Var23 = ((hv5) ifl1Var2.b).a;
                        int i23 = AppProtocolRemoteService.f1;
                        return oh61Var23.i((vu5) obj);
                    case 23:
                        oh61 oh61Var24 = ((hv5) ifl1Var2.b).a;
                        int i24 = AppProtocolRemoteService.f1;
                        return oh61Var24.l.a(((sr5) obj).b.intValue(), oh61Var24.z).q(oh61Var24.m.c(1)).d(Observable.just(wq5Var));
                    case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                        oh61 oh61Var25 = ((hv5) ifl1Var2.b).a;
                        int i25 = AppProtocolRemoteService.f1;
                        return new poj0(oh61Var25.c, oh61Var25.j, oh61Var25.h, oh61Var25.n, (byte) 10).r(oh61Var25.a.getResources()).startWith(oh61Var25.m.c(4).w()).firstOrError().toObservable().map(new f341((byte) 27));
                    case 25:
                        oh61 oh61Var26 = ((hv5) ifl1Var2.b).a;
                        int i26 = AppProtocolRemoteService.f1;
                        Flowable flowable5 = oh61Var26.h;
                        iu5 iu5Var = ju5.Companion;
                        Objects.requireNonNull(iu5Var);
                        Flowable flowableT3 = flowable5.J(new nh61(iu5Var, (byte) 8)).T(oh61Var26.m.c(4).v());
                        flowableT3.getClass();
                        return new ObservableFromPublisher(flowableT3);
                    case 26:
                        pr5 pr5Var = (pr5) obj;
                        oh61 oh61Var27 = ((hv5) ifl1Var2.b).a;
                        int i27 = AppProtocolRemoteService.f1;
                        cr5 cr5Var2 = oh61Var27.o.c;
                        return Single.create(new u2i0(oh61Var27, pr5Var, cr5Var2.l, cr5Var2.k, true)).toObservable().startWith(oh61Var27.m.b(4, pr5Var).w());
                    case 27:
                        oh61 oh61Var28 = ((hv5) ifl1Var2.b).a;
                        int i28 = AppProtocolRemoteService.f1;
                        return oh61Var28.h.T(oh61Var28.m.c(4).v()).z().toObservable().map(new nh61((byte) 0));
                    case 28:
                        oh61 oh61Var29 = ((hv5) ifl1Var2.b).a;
                        int i29 = AppProtocolRemoteService.f1;
                        return oh61Var29.f();
                    default:
                        ct5 ct5Var = (ct5) obj;
                        oh61 oh61Var30 = ((hv5) ifl1Var2.b).a;
                        int i30 = AppProtocolRemoteService.f1;
                        if (ct5Var != null) {
                            str = ct5Var.b;
                            if ("default".equals(str)) {
                                if ("car".equals(oh61Var30.z.f)) {
                                    str = "default-cars";
                                } else {
                                    str = "default";
                                }
                            }
                        } else if ("car".equals(oh61Var30.z.f)) {
                            str = "default-cars";
                        } else {
                            str = "default";
                        }
                        Observable observableJust = (oh61Var30.o.c.e.equals("com.google.android.apps.maps") && str.equals("default")) ? Observable.just(new yr5(0, 0, 0, z6x.a)) : null;
                        if (observableJust != null) {
                            return observableJust;
                        }
                        oh61Var30.y = str;
                        Bundle bundleG = cy30.g("_type", str);
                        String str7 = oh61Var30.f31p;
                        hlr0 hlr0Var2 = new hlr0();
                        UbiSpecificationId ubiSpecificationId2 = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var3 = oh61Var30.o.c;
                        String str8 = cr5Var3.e;
                        String str9 = cr5Var3.d;
                        m210 m210Var3 = oh61Var30.z;
                        if (m210Var3 == null) {
                            m210Var3 = oh61.D;
                        }
                        return oh61Var30.u.c(new r9c(str, str7, str8, str9, m210Var3, true, true, false, false, hlr0Var2, 2, 1, ubiSpecificationId2, (String) null, false, false, false), bundleG).map(new nh61((byte) 7)).toObservable().startWith(oh61Var30.m.c(8).w()).doOnSubscribe(new fv5(oh61Var30, (byte) 19));
                }
            }
        }));
        gv5Var2.accept(new v5y(ns5.class, "com.spotify.set_playback_speed", 1, new w5y() { // from class: p.e2s
            /* JADX WARN: Code duplicated, block: B:11:0x0044  */
            /* JADX WARN: Code duplicated, block: B:12:0x0047  */
            /* JADX WARN: Code duplicated, block: B:9:0x0038  */
            @Override // p.w5y
            public final Observable a(Object obj) {
                String str;
                byte b19 = b16;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                wq5 wq5Var = cv5.a;
                final byte b110 = 0;
                final byte b111 = 1;
                ifl1 ifl1Var2 = ifl1Var;
                switch (b19) {
                    case 0:
                        oh61 oh61Var = ((hv5) ifl1Var2.b).a;
                        int i = AppProtocolRemoteService.f1;
                        g510 g510Var = oh61Var.k;
                        m210 m210Var = oh61Var.z;
                        String strP = g510Var.p();
                        if (strP == null) {
                            strP = "";
                        }
                        return g510.q(g510Var, m210Var, g510Var.h.j(strP)).flatMapCompletable(new mh61(oh61Var, (byte) 7)).d(oh61Var.c.b().a().takeUntil(new nh61((byte) 4)).flatMap(new nh61((byte) 5)).timeout(25L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new nh61((byte) 6)));
                    case 1:
                        oh61 oh61Var2 = ((hv5) ifl1Var2.b).a;
                        int i2 = AppProtocolRemoteService.f1;
                        return oh61Var2.h((pu5) obj);
                    case 2:
                        oh61 oh61Var3 = ((hv5) ifl1Var2.b).a;
                        int i3 = AppProtocolRemoteService.f1;
                        return oh61Var3.e.b("type").startWith(new CompletableFromAction(new w43(oh61Var3.m, (byte) 6)).w()).map(new f341((byte) 17)).onErrorResumeNext(new f341((byte) 29));
                    case 3:
                        oh61 oh61Var4 = ((hv5) ifl1Var2.b).a;
                        int i4 = AppProtocolRemoteService.f1;
                        return oh61Var4.i((vu5) obj);
                    case 4:
                        su5 su5Var = (su5) obj;
                        oh61 oh61Var5 = ((hv5) ifl1Var2.b).a;
                        int i5 = AppProtocolRemoteService.f1;
                        return Single.create(new jf11((Object) su5Var, (byte) 18)).flatMap(new h341(oh61Var5, su5Var, (byte) 9)).toObservable().startWith(oh61Var5.m.c(2).w());
                    case 5:
                        final ks5 ks5Var = (ks5) obj;
                        final oh61 oh61Var6 = ((hv5) ifl1Var2.b).a;
                        int i6 = AppProtocolRemoteService.f1;
                        return oh61Var6.k.l(ks5Var.b.longValue(), oh61Var6.z).map(new f341((byte) 23)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b112 = b110;
                                ks5 ks5Var3 = ks5Var;
                                oh61 oh61Var8 = oh61Var6;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b112) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek in song", (byte) 18)).toObservable().startWith(oh61Var6.m.c(1).w());
                    case 6:
                        final ks5 ks5Var2 = (ks5) obj;
                        final oh61 oh61Var7 = ((hv5) ifl1Var2.b).a;
                        int i7 = AppProtocolRemoteService.f1;
                        return oh61Var7.k.k(ks5Var2.b.longValue(), oh61Var7.z).map(new f341((byte) 28)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b112 = b111;
                                ks5 ks5Var3 = ks5Var2;
                                oh61 oh61Var8 = oh61Var7;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b112) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek by in a song", (byte) 18)).toObservable().startWith(oh61Var7.m.c(1).w());
                    case 7:
                        oh61 oh61Var8 = ((hv5) ifl1Var2.b).a;
                        int i8 = AppProtocolRemoteService.f1;
                        dbm dbmVar = oh61Var8.m;
                        Flowable flowable = oh61Var8.h;
                        g510 g510Var2 = oh61Var8.k;
                        Integer num = ((ns5) obj).b;
                        int iIntValue = num.intValue();
                        if (iIntValue == 0) {
                            Flowable flowableT = flowable.T(dbmVar.c(1).v()).T(g510Var2.d(oh61Var8.z).map(new nh61((byte) 19)).flatMapCompletable(new mh61(oh61Var8, (byte) 10)).v());
                            nh61 nh61Var = new nh61((byte) 20);
                            flowableT.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT, nh61Var).x(new nh61((byte) 21)).J(new nh61((byte) 22)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 23));
                        }
                        if (iIntValue == 1) {
                            Flowable flowableT2 = flowable.T(dbmVar.c(1).v()).T(g510Var2.j(oh61Var8.z).map(new nh61((byte) 13)).flatMapCompletable(new mh61(oh61Var8, (byte) 9)).v());
                            nh61 nh61Var2 = new nh61((byte) 14);
                            flowableT2.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT2, nh61Var2).x(new nh61((byte) 16)).J(new nh61((byte) 17)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 18));
                        }
                        if (iIntValue == 50 || iIntValue == 80 || iIntValue == 100 || iIntValue == 120 || iIntValue == 150 || iIntValue == 200 || iIntValue == 300) {
                            return oh61Var8.j(num.intValue());
                        }
                        return IapException.a("Unexpected playback speed " + num);
                    case 8:
                        oh61 oh61Var9 = ((hv5) ifl1Var2.b).a;
                        int i9 = AppProtocolRemoteService.f1;
                        return oh61Var9.j((int) (((ot5) obj).b.floatValue() * 100.0f));
                    case 9:
                        oh61 oh61Var10 = ((hv5) ifl1Var2.b).a;
                        int i10 = AppProtocolRemoteService.f1;
                        return oh61Var10.k((zs5) obj);
                    case 10:
                        oh61 oh61Var11 = ((hv5) ifl1Var2.b).a;
                        int i11 = AppProtocolRemoteService.f1;
                        Flowable flowable2 = oh61Var11.f;
                        return Observable.combineLatest(x0d.j(flowable2, flowable2).startWith(new CompletableFromAction(new ok70(oh61Var11.m, 4)).w()), yoi1.i(oh61Var11.g.a(o6n.a), o6x.a).startWithItem(Boolean.FALSE).distinctUntilChanged(), new mh61(oh61Var11, (byte) 3));
                    case 11:
                        oh61 oh61Var12 = ((hv5) ifl1Var2.b).a;
                        int i12 = AppProtocolRemoteService.f1;
                        Flowable flowable3 = oh61Var12.h;
                        ObservableFromPublisher observableFromPublisherJ = x0d.j(flowable3, flowable3);
                        ys5 ys5Var = zs5.Companion;
                        Objects.requireNonNull(ys5Var);
                        return observableFromPublisherJ.map(new nh61(ys5Var, (byte) 15)).flatMap(new mh61(oh61Var12, (byte) 11));
                    case 12:
                        ft5 ft5Var = (ft5) obj;
                        oh61 oh61Var13 = ((hv5) ifl1Var2.b).a;
                        int i13 = AppProtocolRemoteService.f1;
                        return oh61Var13.h.T(oh61Var13.m.c(1).v()).z().flatMapCompletable(new h341(oh61Var13, ft5Var, (byte) 6)).d(Observable.just(wq5Var)).startWith(oh61Var13.k.c(oh61Var13.z, ft5Var.d.booleanValue()).ignoreElement().w());
                    case 13:
                        mq5 mq5Var = (mq5) obj;
                        oh61 oh61Var14 = ((hv5) ifl1Var2.b).a;
                        int i14 = AppProtocolRemoteService.f1;
                        Integer num2 = mq5Var.c;
                        int iIntValue2 = num2 == null ? 20 : num2.intValue();
                        String str2 = mq5Var.b;
                        if (str2.equals("spotify:recently-played")) {
                            str2 = "com.spotify.recently-played";
                        } else if (str2.equals("spotify:browse")) {
                            str2 = "com.spotify.browse";
                        }
                        String str3 = str2;
                        c610 c610Var = oh61Var14.u;
                        hlr0 hlr0Var = new hlr0();
                        UbiSpecificationId ubiSpecificationId = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var = oh61Var14.o.c;
                        String str4 = cr5Var.e;
                        String str5 = cr5Var.d;
                        String str6 = oh61Var14.y;
                        m210 m210Var2 = oh61Var14.z;
                        if (m210Var2 == null) {
                            m210Var2 = oh61.D;
                        }
                        return c610Var.c(new r9c(str6, str3, str4, str5, m210Var2, false, true, false, false, hlr0Var, 2, 1, ubiSpecificationId, (String) null, false, false, false), new Bundle()).map(new mp5(mq5Var, iIntValue2, (byte) 8)).doOnError(new fv5(str3, (byte) 21)).toObservable().doOnSubscribe(new po5(oh61Var14, mq5Var, (byte) 5)).startWith(oh61Var14.m.c(8).w());
                    case 14:
                        oh61 oh61Var15 = ((hv5) ifl1Var2.b).a;
                        int i15 = AppProtocolRemoteService.f1;
                        return oh61Var15.l((rt5) obj);
                    case 15:
                        oh61 oh61Var16 = ((hv5) ifl1Var2.b).a;
                        int i16 = AppProtocolRemoteService.f1;
                        Flowable flowable4 = oh61Var16.h;
                        return x0d.j(flowable4, flowable4).map(new nh61((byte) 1)).flatMap(new mh61(oh61Var16, (byte) 4));
                    case 16:
                        oh61 oh61Var17 = ((hv5) ifl1Var2.b).a;
                        int i17 = AppProtocolRemoteService.f1;
                        return oh61Var17.k.n(oh61Var17.z).map(new nh61((byte) 2)).flatMap(new mh61(oh61Var17, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var17.m.c(1).w());
                    case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                        oh61 oh61Var18 = ((hv5) ifl1Var2.b).a;
                        int i18 = AppProtocolRemoteService.f1;
                        return oh61Var18.k.o(oh61Var18.z).map(new f341((byte) 21)).zipWith(oh61Var18.h.z(), new f341((byte) 22)).flatMap(new h341(oh61Var18, (ut5) obj, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var18.m.c(1).w());
                    case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                        jr5 jr5Var = (jr5) obj;
                        oh61 oh61Var19 = ((hv5) ifl1Var2.b).a;
                        int i19 = AppProtocolRemoteService.f1;
                        return Observable.just(jr5Var).startWith(oh61Var19.m.c(1).w()).switchMap(new mh61(oh61Var19, (byte) 1)).flatMapSingle(new mh61(oh61Var19, (byte) 2)).filter(new f341((byte) 24)).map(new f341((byte) 25)).flatMap(new h341(oh61Var19, jr5Var, (byte) 7)).timeout(15L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new f341((byte) 26));
                    case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                        pu5 pu5Var = (pu5) obj;
                        oh61 oh61Var20 = ((hv5) ifl1Var2.b).a;
                        int i20 = AppProtocolRemoteService.f1;
                        Observable observable = oh61Var20.h.T(oh61Var20.m.c(2).v()).z().toObservable();
                        g510 g510Var3 = oh61Var20.k;
                        return observable.startWith(g510.q(g510Var3, oh61Var20.z, g510Var3.h.e(pu5Var.b)).ignoreElement().w()).map(new h341(oh61Var20, pu5Var, (byte) 8));
                    case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                        oh61 oh61Var21 = ((hv5) ifl1Var2.b).a;
                        int i21 = AppProtocolRemoteService.f1;
                        return oh61Var21.c.a.k.b().map(new nh61((byte) 9));
                    case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                        oh61 oh61Var22 = ((hv5) ifl1Var2.b).a;
                        int i22 = AppProtocolRemoteService.f1;
                        return oh61Var22.m.c(4).d(Observable.just(new ws5()));
                    case 22:
                        oh61 oh61Var23 = ((hv5) ifl1Var2.b).a;
                        int i23 = AppProtocolRemoteService.f1;
                        return oh61Var23.i((vu5) obj);
                    case 23:
                        oh61 oh61Var24 = ((hv5) ifl1Var2.b).a;
                        int i24 = AppProtocolRemoteService.f1;
                        return oh61Var24.l.a(((sr5) obj).b.intValue(), oh61Var24.z).q(oh61Var24.m.c(1)).d(Observable.just(wq5Var));
                    case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                        oh61 oh61Var25 = ((hv5) ifl1Var2.b).a;
                        int i25 = AppProtocolRemoteService.f1;
                        return new poj0(oh61Var25.c, oh61Var25.j, oh61Var25.h, oh61Var25.n, (byte) 10).r(oh61Var25.a.getResources()).startWith(oh61Var25.m.c(4).w()).firstOrError().toObservable().map(new f341((byte) 27));
                    case 25:
                        oh61 oh61Var26 = ((hv5) ifl1Var2.b).a;
                        int i26 = AppProtocolRemoteService.f1;
                        Flowable flowable5 = oh61Var26.h;
                        iu5 iu5Var = ju5.Companion;
                        Objects.requireNonNull(iu5Var);
                        Flowable flowableT3 = flowable5.J(new nh61(iu5Var, (byte) 8)).T(oh61Var26.m.c(4).v());
                        flowableT3.getClass();
                        return new ObservableFromPublisher(flowableT3);
                    case 26:
                        pr5 pr5Var = (pr5) obj;
                        oh61 oh61Var27 = ((hv5) ifl1Var2.b).a;
                        int i27 = AppProtocolRemoteService.f1;
                        cr5 cr5Var2 = oh61Var27.o.c;
                        return Single.create(new u2i0(oh61Var27, pr5Var, cr5Var2.l, cr5Var2.k, true)).toObservable().startWith(oh61Var27.m.b(4, pr5Var).w());
                    case 27:
                        oh61 oh61Var28 = ((hv5) ifl1Var2.b).a;
                        int i28 = AppProtocolRemoteService.f1;
                        return oh61Var28.h.T(oh61Var28.m.c(4).v()).z().toObservable().map(new nh61((byte) 0));
                    case 28:
                        oh61 oh61Var29 = ((hv5) ifl1Var2.b).a;
                        int i29 = AppProtocolRemoteService.f1;
                        return oh61Var29.f();
                    default:
                        ct5 ct5Var = (ct5) obj;
                        oh61 oh61Var30 = ((hv5) ifl1Var2.b).a;
                        int i30 = AppProtocolRemoteService.f1;
                        if (ct5Var != null) {
                            str = ct5Var.b;
                            if ("default".equals(str)) {
                                if ("car".equals(oh61Var30.z.f)) {
                                    str = "default-cars";
                                } else {
                                    str = "default";
                                }
                            }
                        } else if ("car".equals(oh61Var30.z.f)) {
                            str = "default-cars";
                        } else {
                            str = "default";
                        }
                        Observable observableJust = (oh61Var30.o.c.e.equals("com.google.android.apps.maps") && str.equals("default")) ? Observable.just(new yr5(0, 0, 0, z6x.a)) : null;
                        if (observableJust != null) {
                            return observableJust;
                        }
                        oh61Var30.y = str;
                        Bundle bundleG = cy30.g("_type", str);
                        String str7 = oh61Var30.f31p;
                        hlr0 hlr0Var2 = new hlr0();
                        UbiSpecificationId ubiSpecificationId2 = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var3 = oh61Var30.o.c;
                        String str8 = cr5Var3.e;
                        String str9 = cr5Var3.d;
                        m210 m210Var3 = oh61Var30.z;
                        if (m210Var3 == null) {
                            m210Var3 = oh61.D;
                        }
                        return oh61Var30.u.c(new r9c(str, str7, str8, str9, m210Var3, true, true, false, false, hlr0Var2, 2, 1, ubiSpecificationId2, (String) null, false, false, false), bundleG).map(new nh61((byte) 7)).toObservable().startWith(oh61Var30.m.c(8).w()).doOnSubscribe(new fv5(oh61Var30, (byte) 19));
                }
            }
        }));
        gv5Var2.accept(new v5y(ot5.class, "com.spotify.set_podcast_playback_speed", 4, new w5y() { // from class: p.e2s
            /* JADX WARN: Code duplicated, block: B:11:0x0044  */
            /* JADX WARN: Code duplicated, block: B:12:0x0047  */
            /* JADX WARN: Code duplicated, block: B:9:0x0038  */
            @Override // p.w5y
            public final Observable a(Object obj) {
                String str;
                byte b19 = b5;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                wq5 wq5Var = cv5.a;
                final byte b110 = 0;
                final byte b111 = 1;
                ifl1 ifl1Var2 = ifl1Var;
                switch (b19) {
                    case 0:
                        oh61 oh61Var = ((hv5) ifl1Var2.b).a;
                        int i = AppProtocolRemoteService.f1;
                        g510 g510Var = oh61Var.k;
                        m210 m210Var = oh61Var.z;
                        String strP = g510Var.p();
                        if (strP == null) {
                            strP = "";
                        }
                        return g510.q(g510Var, m210Var, g510Var.h.j(strP)).flatMapCompletable(new mh61(oh61Var, (byte) 7)).d(oh61Var.c.b().a().takeUntil(new nh61((byte) 4)).flatMap(new nh61((byte) 5)).timeout(25L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new nh61((byte) 6)));
                    case 1:
                        oh61 oh61Var2 = ((hv5) ifl1Var2.b).a;
                        int i2 = AppProtocolRemoteService.f1;
                        return oh61Var2.h((pu5) obj);
                    case 2:
                        oh61 oh61Var3 = ((hv5) ifl1Var2.b).a;
                        int i3 = AppProtocolRemoteService.f1;
                        return oh61Var3.e.b("type").startWith(new CompletableFromAction(new w43(oh61Var3.m, (byte) 6)).w()).map(new f341((byte) 17)).onErrorResumeNext(new f341((byte) 29));
                    case 3:
                        oh61 oh61Var4 = ((hv5) ifl1Var2.b).a;
                        int i4 = AppProtocolRemoteService.f1;
                        return oh61Var4.i((vu5) obj);
                    case 4:
                        su5 su5Var = (su5) obj;
                        oh61 oh61Var5 = ((hv5) ifl1Var2.b).a;
                        int i5 = AppProtocolRemoteService.f1;
                        return Single.create(new jf11((Object) su5Var, (byte) 18)).flatMap(new h341(oh61Var5, su5Var, (byte) 9)).toObservable().startWith(oh61Var5.m.c(2).w());
                    case 5:
                        final ks5 ks5Var = (ks5) obj;
                        final oh61 oh61Var6 = ((hv5) ifl1Var2.b).a;
                        int i6 = AppProtocolRemoteService.f1;
                        return oh61Var6.k.l(ks5Var.b.longValue(), oh61Var6.z).map(new f341((byte) 23)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b112 = b110;
                                ks5 ks5Var3 = ks5Var;
                                oh61 oh61Var8 = oh61Var6;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b112) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek in song", (byte) 18)).toObservable().startWith(oh61Var6.m.c(1).w());
                    case 6:
                        final ks5 ks5Var2 = (ks5) obj;
                        final oh61 oh61Var7 = ((hv5) ifl1Var2.b).a;
                        int i7 = AppProtocolRemoteService.f1;
                        return oh61Var7.k.k(ks5Var2.b.longValue(), oh61Var7.z).map(new f341((byte) 28)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b112 = b111;
                                ks5 ks5Var3 = ks5Var2;
                                oh61 oh61Var8 = oh61Var7;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b112) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek by in a song", (byte) 18)).toObservable().startWith(oh61Var7.m.c(1).w());
                    case 7:
                        oh61 oh61Var8 = ((hv5) ifl1Var2.b).a;
                        int i8 = AppProtocolRemoteService.f1;
                        dbm dbmVar = oh61Var8.m;
                        Flowable flowable = oh61Var8.h;
                        g510 g510Var2 = oh61Var8.k;
                        Integer num = ((ns5) obj).b;
                        int iIntValue = num.intValue();
                        if (iIntValue == 0) {
                            Flowable flowableT = flowable.T(dbmVar.c(1).v()).T(g510Var2.d(oh61Var8.z).map(new nh61((byte) 19)).flatMapCompletable(new mh61(oh61Var8, (byte) 10)).v());
                            nh61 nh61Var = new nh61((byte) 20);
                            flowableT.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT, nh61Var).x(new nh61((byte) 21)).J(new nh61((byte) 22)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 23));
                        }
                        if (iIntValue == 1) {
                            Flowable flowableT2 = flowable.T(dbmVar.c(1).v()).T(g510Var2.j(oh61Var8.z).map(new nh61((byte) 13)).flatMapCompletable(new mh61(oh61Var8, (byte) 9)).v());
                            nh61 nh61Var2 = new nh61((byte) 14);
                            flowableT2.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT2, nh61Var2).x(new nh61((byte) 16)).J(new nh61((byte) 17)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 18));
                        }
                        if (iIntValue == 50 || iIntValue == 80 || iIntValue == 100 || iIntValue == 120 || iIntValue == 150 || iIntValue == 200 || iIntValue == 300) {
                            return oh61Var8.j(num.intValue());
                        }
                        return IapException.a("Unexpected playback speed " + num);
                    case 8:
                        oh61 oh61Var9 = ((hv5) ifl1Var2.b).a;
                        int i9 = AppProtocolRemoteService.f1;
                        return oh61Var9.j((int) (((ot5) obj).b.floatValue() * 100.0f));
                    case 9:
                        oh61 oh61Var10 = ((hv5) ifl1Var2.b).a;
                        int i10 = AppProtocolRemoteService.f1;
                        return oh61Var10.k((zs5) obj);
                    case 10:
                        oh61 oh61Var11 = ((hv5) ifl1Var2.b).a;
                        int i11 = AppProtocolRemoteService.f1;
                        Flowable flowable2 = oh61Var11.f;
                        return Observable.combineLatest(x0d.j(flowable2, flowable2).startWith(new CompletableFromAction(new ok70(oh61Var11.m, 4)).w()), yoi1.i(oh61Var11.g.a(o6n.a), o6x.a).startWithItem(Boolean.FALSE).distinctUntilChanged(), new mh61(oh61Var11, (byte) 3));
                    case 11:
                        oh61 oh61Var12 = ((hv5) ifl1Var2.b).a;
                        int i12 = AppProtocolRemoteService.f1;
                        Flowable flowable3 = oh61Var12.h;
                        ObservableFromPublisher observableFromPublisherJ = x0d.j(flowable3, flowable3);
                        ys5 ys5Var = zs5.Companion;
                        Objects.requireNonNull(ys5Var);
                        return observableFromPublisherJ.map(new nh61(ys5Var, (byte) 15)).flatMap(new mh61(oh61Var12, (byte) 11));
                    case 12:
                        ft5 ft5Var = (ft5) obj;
                        oh61 oh61Var13 = ((hv5) ifl1Var2.b).a;
                        int i13 = AppProtocolRemoteService.f1;
                        return oh61Var13.h.T(oh61Var13.m.c(1).v()).z().flatMapCompletable(new h341(oh61Var13, ft5Var, (byte) 6)).d(Observable.just(wq5Var)).startWith(oh61Var13.k.c(oh61Var13.z, ft5Var.d.booleanValue()).ignoreElement().w());
                    case 13:
                        mq5 mq5Var = (mq5) obj;
                        oh61 oh61Var14 = ((hv5) ifl1Var2.b).a;
                        int i14 = AppProtocolRemoteService.f1;
                        Integer num2 = mq5Var.c;
                        int iIntValue2 = num2 == null ? 20 : num2.intValue();
                        String str2 = mq5Var.b;
                        if (str2.equals("spotify:recently-played")) {
                            str2 = "com.spotify.recently-played";
                        } else if (str2.equals("spotify:browse")) {
                            str2 = "com.spotify.browse";
                        }
                        String str3 = str2;
                        c610 c610Var = oh61Var14.u;
                        hlr0 hlr0Var = new hlr0();
                        UbiSpecificationId ubiSpecificationId = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var = oh61Var14.o.c;
                        String str4 = cr5Var.e;
                        String str5 = cr5Var.d;
                        String str6 = oh61Var14.y;
                        m210 m210Var2 = oh61Var14.z;
                        if (m210Var2 == null) {
                            m210Var2 = oh61.D;
                        }
                        return c610Var.c(new r9c(str6, str3, str4, str5, m210Var2, false, true, false, false, hlr0Var, 2, 1, ubiSpecificationId, (String) null, false, false, false), new Bundle()).map(new mp5(mq5Var, iIntValue2, (byte) 8)).doOnError(new fv5(str3, (byte) 21)).toObservable().doOnSubscribe(new po5(oh61Var14, mq5Var, (byte) 5)).startWith(oh61Var14.m.c(8).w());
                    case 14:
                        oh61 oh61Var15 = ((hv5) ifl1Var2.b).a;
                        int i15 = AppProtocolRemoteService.f1;
                        return oh61Var15.l((rt5) obj);
                    case 15:
                        oh61 oh61Var16 = ((hv5) ifl1Var2.b).a;
                        int i16 = AppProtocolRemoteService.f1;
                        Flowable flowable4 = oh61Var16.h;
                        return x0d.j(flowable4, flowable4).map(new nh61((byte) 1)).flatMap(new mh61(oh61Var16, (byte) 4));
                    case 16:
                        oh61 oh61Var17 = ((hv5) ifl1Var2.b).a;
                        int i17 = AppProtocolRemoteService.f1;
                        return oh61Var17.k.n(oh61Var17.z).map(new nh61((byte) 2)).flatMap(new mh61(oh61Var17, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var17.m.c(1).w());
                    case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                        oh61 oh61Var18 = ((hv5) ifl1Var2.b).a;
                        int i18 = AppProtocolRemoteService.f1;
                        return oh61Var18.k.o(oh61Var18.z).map(new f341((byte) 21)).zipWith(oh61Var18.h.z(), new f341((byte) 22)).flatMap(new h341(oh61Var18, (ut5) obj, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var18.m.c(1).w());
                    case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                        jr5 jr5Var = (jr5) obj;
                        oh61 oh61Var19 = ((hv5) ifl1Var2.b).a;
                        int i19 = AppProtocolRemoteService.f1;
                        return Observable.just(jr5Var).startWith(oh61Var19.m.c(1).w()).switchMap(new mh61(oh61Var19, (byte) 1)).flatMapSingle(new mh61(oh61Var19, (byte) 2)).filter(new f341((byte) 24)).map(new f341((byte) 25)).flatMap(new h341(oh61Var19, jr5Var, (byte) 7)).timeout(15L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new f341((byte) 26));
                    case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                        pu5 pu5Var = (pu5) obj;
                        oh61 oh61Var20 = ((hv5) ifl1Var2.b).a;
                        int i20 = AppProtocolRemoteService.f1;
                        Observable observable = oh61Var20.h.T(oh61Var20.m.c(2).v()).z().toObservable();
                        g510 g510Var3 = oh61Var20.k;
                        return observable.startWith(g510.q(g510Var3, oh61Var20.z, g510Var3.h.e(pu5Var.b)).ignoreElement().w()).map(new h341(oh61Var20, pu5Var, (byte) 8));
                    case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                        oh61 oh61Var21 = ((hv5) ifl1Var2.b).a;
                        int i21 = AppProtocolRemoteService.f1;
                        return oh61Var21.c.a.k.b().map(new nh61((byte) 9));
                    case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                        oh61 oh61Var22 = ((hv5) ifl1Var2.b).a;
                        int i22 = AppProtocolRemoteService.f1;
                        return oh61Var22.m.c(4).d(Observable.just(new ws5()));
                    case 22:
                        oh61 oh61Var23 = ((hv5) ifl1Var2.b).a;
                        int i23 = AppProtocolRemoteService.f1;
                        return oh61Var23.i((vu5) obj);
                    case 23:
                        oh61 oh61Var24 = ((hv5) ifl1Var2.b).a;
                        int i24 = AppProtocolRemoteService.f1;
                        return oh61Var24.l.a(((sr5) obj).b.intValue(), oh61Var24.z).q(oh61Var24.m.c(1)).d(Observable.just(wq5Var));
                    case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                        oh61 oh61Var25 = ((hv5) ifl1Var2.b).a;
                        int i25 = AppProtocolRemoteService.f1;
                        return new poj0(oh61Var25.c, oh61Var25.j, oh61Var25.h, oh61Var25.n, (byte) 10).r(oh61Var25.a.getResources()).startWith(oh61Var25.m.c(4).w()).firstOrError().toObservable().map(new f341((byte) 27));
                    case 25:
                        oh61 oh61Var26 = ((hv5) ifl1Var2.b).a;
                        int i26 = AppProtocolRemoteService.f1;
                        Flowable flowable5 = oh61Var26.h;
                        iu5 iu5Var = ju5.Companion;
                        Objects.requireNonNull(iu5Var);
                        Flowable flowableT3 = flowable5.J(new nh61(iu5Var, (byte) 8)).T(oh61Var26.m.c(4).v());
                        flowableT3.getClass();
                        return new ObservableFromPublisher(flowableT3);
                    case 26:
                        pr5 pr5Var = (pr5) obj;
                        oh61 oh61Var27 = ((hv5) ifl1Var2.b).a;
                        int i27 = AppProtocolRemoteService.f1;
                        cr5 cr5Var2 = oh61Var27.o.c;
                        return Single.create(new u2i0(oh61Var27, pr5Var, cr5Var2.l, cr5Var2.k, true)).toObservable().startWith(oh61Var27.m.b(4, pr5Var).w());
                    case 27:
                        oh61 oh61Var28 = ((hv5) ifl1Var2.b).a;
                        int i28 = AppProtocolRemoteService.f1;
                        return oh61Var28.h.T(oh61Var28.m.c(4).v()).z().toObservable().map(new nh61((byte) 0));
                    case 28:
                        oh61 oh61Var29 = ((hv5) ifl1Var2.b).a;
                        int i29 = AppProtocolRemoteService.f1;
                        return oh61Var29.f();
                    default:
                        ct5 ct5Var = (ct5) obj;
                        oh61 oh61Var30 = ((hv5) ifl1Var2.b).a;
                        int i30 = AppProtocolRemoteService.f1;
                        if (ct5Var != null) {
                            str = ct5Var.b;
                            if ("default".equals(str)) {
                                if ("car".equals(oh61Var30.z.f)) {
                                    str = "default-cars";
                                } else {
                                    str = "default";
                                }
                            }
                        } else if ("car".equals(oh61Var30.z.f)) {
                            str = "default-cars";
                        } else {
                            str = "default";
                        }
                        Observable observableJust = (oh61Var30.o.c.e.equals("com.google.android.apps.maps") && str.equals("default")) ? Observable.just(new yr5(0, 0, 0, z6x.a)) : null;
                        if (observableJust != null) {
                            return observableJust;
                        }
                        oh61Var30.y = str;
                        Bundle bundleG = cy30.g("_type", str);
                        String str7 = oh61Var30.f31p;
                        hlr0 hlr0Var2 = new hlr0();
                        UbiSpecificationId ubiSpecificationId2 = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var3 = oh61Var30.o.c;
                        String str8 = cr5Var3.e;
                        String str9 = cr5Var3.d;
                        m210 m210Var3 = oh61Var30.z;
                        if (m210Var3 == null) {
                            m210Var3 = oh61.D;
                        }
                        return oh61Var30.u.c(new r9c(str, str7, str8, str9, m210Var3, true, true, false, false, hlr0Var2, 2, 1, ubiSpecificationId2, (String) null, false, false, false), bundleG).map(new nh61((byte) 7)).toObservable().startWith(oh61Var30.m.c(8).w()).doOnSubscribe(new fv5(oh61Var30, (byte) 19));
                }
            }
        }));
        gv5Var2.accept(new v5y(ws5.class, "com.spotify.set_rating", 1, new ofr(ifl1Var, (byte) 6)));
        final byte b19 = 9;
        gv5Var2.accept(new v5y(zs5.class, "com.spotify.set_repeat", 1, new w5y() { // from class: p.e2s
            /* JADX WARN: Code duplicated, block: B:11:0x0044  */
            /* JADX WARN: Code duplicated, block: B:12:0x0047  */
            /* JADX WARN: Code duplicated, block: B:9:0x0038  */
            @Override // p.w5y
            public final Observable a(Object obj) {
                String str;
                byte b110 = b19;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                wq5 wq5Var = cv5.a;
                final byte b111 = 0;
                final byte b112 = 1;
                ifl1 ifl1Var2 = ifl1Var;
                switch (b110) {
                    case 0:
                        oh61 oh61Var = ((hv5) ifl1Var2.b).a;
                        int i = AppProtocolRemoteService.f1;
                        g510 g510Var = oh61Var.k;
                        m210 m210Var = oh61Var.z;
                        String strP = g510Var.p();
                        if (strP == null) {
                            strP = "";
                        }
                        return g510.q(g510Var, m210Var, g510Var.h.j(strP)).flatMapCompletable(new mh61(oh61Var, (byte) 7)).d(oh61Var.c.b().a().takeUntil(new nh61((byte) 4)).flatMap(new nh61((byte) 5)).timeout(25L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new nh61((byte) 6)));
                    case 1:
                        oh61 oh61Var2 = ((hv5) ifl1Var2.b).a;
                        int i2 = AppProtocolRemoteService.f1;
                        return oh61Var2.h((pu5) obj);
                    case 2:
                        oh61 oh61Var3 = ((hv5) ifl1Var2.b).a;
                        int i3 = AppProtocolRemoteService.f1;
                        return oh61Var3.e.b("type").startWith(new CompletableFromAction(new w43(oh61Var3.m, (byte) 6)).w()).map(new f341((byte) 17)).onErrorResumeNext(new f341((byte) 29));
                    case 3:
                        oh61 oh61Var4 = ((hv5) ifl1Var2.b).a;
                        int i4 = AppProtocolRemoteService.f1;
                        return oh61Var4.i((vu5) obj);
                    case 4:
                        su5 su5Var = (su5) obj;
                        oh61 oh61Var5 = ((hv5) ifl1Var2.b).a;
                        int i5 = AppProtocolRemoteService.f1;
                        return Single.create(new jf11((Object) su5Var, (byte) 18)).flatMap(new h341(oh61Var5, su5Var, (byte) 9)).toObservable().startWith(oh61Var5.m.c(2).w());
                    case 5:
                        final ks5 ks5Var = (ks5) obj;
                        final oh61 oh61Var6 = ((hv5) ifl1Var2.b).a;
                        int i6 = AppProtocolRemoteService.f1;
                        return oh61Var6.k.l(ks5Var.b.longValue(), oh61Var6.z).map(new f341((byte) 23)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b113 = b111;
                                ks5 ks5Var3 = ks5Var;
                                oh61 oh61Var8 = oh61Var6;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b113) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek in song", (byte) 18)).toObservable().startWith(oh61Var6.m.c(1).w());
                    case 6:
                        final ks5 ks5Var2 = (ks5) obj;
                        final oh61 oh61Var7 = ((hv5) ifl1Var2.b).a;
                        int i7 = AppProtocolRemoteService.f1;
                        return oh61Var7.k.k(ks5Var2.b.longValue(), oh61Var7.z).map(new f341((byte) 28)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b113 = b112;
                                ks5 ks5Var3 = ks5Var2;
                                oh61 oh61Var8 = oh61Var7;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b113) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek by in a song", (byte) 18)).toObservable().startWith(oh61Var7.m.c(1).w());
                    case 7:
                        oh61 oh61Var8 = ((hv5) ifl1Var2.b).a;
                        int i8 = AppProtocolRemoteService.f1;
                        dbm dbmVar = oh61Var8.m;
                        Flowable flowable = oh61Var8.h;
                        g510 g510Var2 = oh61Var8.k;
                        Integer num = ((ns5) obj).b;
                        int iIntValue = num.intValue();
                        if (iIntValue == 0) {
                            Flowable flowableT = flowable.T(dbmVar.c(1).v()).T(g510Var2.d(oh61Var8.z).map(new nh61((byte) 19)).flatMapCompletable(new mh61(oh61Var8, (byte) 10)).v());
                            nh61 nh61Var = new nh61((byte) 20);
                            flowableT.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT, nh61Var).x(new nh61((byte) 21)).J(new nh61((byte) 22)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 23));
                        }
                        if (iIntValue == 1) {
                            Flowable flowableT2 = flowable.T(dbmVar.c(1).v()).T(g510Var2.j(oh61Var8.z).map(new nh61((byte) 13)).flatMapCompletable(new mh61(oh61Var8, (byte) 9)).v());
                            nh61 nh61Var2 = new nh61((byte) 14);
                            flowableT2.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT2, nh61Var2).x(new nh61((byte) 16)).J(new nh61((byte) 17)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 18));
                        }
                        if (iIntValue == 50 || iIntValue == 80 || iIntValue == 100 || iIntValue == 120 || iIntValue == 150 || iIntValue == 200 || iIntValue == 300) {
                            return oh61Var8.j(num.intValue());
                        }
                        return IapException.a("Unexpected playback speed " + num);
                    case 8:
                        oh61 oh61Var9 = ((hv5) ifl1Var2.b).a;
                        int i9 = AppProtocolRemoteService.f1;
                        return oh61Var9.j((int) (((ot5) obj).b.floatValue() * 100.0f));
                    case 9:
                        oh61 oh61Var10 = ((hv5) ifl1Var2.b).a;
                        int i10 = AppProtocolRemoteService.f1;
                        return oh61Var10.k((zs5) obj);
                    case 10:
                        oh61 oh61Var11 = ((hv5) ifl1Var2.b).a;
                        int i11 = AppProtocolRemoteService.f1;
                        Flowable flowable2 = oh61Var11.f;
                        return Observable.combineLatest(x0d.j(flowable2, flowable2).startWith(new CompletableFromAction(new ok70(oh61Var11.m, 4)).w()), yoi1.i(oh61Var11.g.a(o6n.a), o6x.a).startWithItem(Boolean.FALSE).distinctUntilChanged(), new mh61(oh61Var11, (byte) 3));
                    case 11:
                        oh61 oh61Var12 = ((hv5) ifl1Var2.b).a;
                        int i12 = AppProtocolRemoteService.f1;
                        Flowable flowable3 = oh61Var12.h;
                        ObservableFromPublisher observableFromPublisherJ = x0d.j(flowable3, flowable3);
                        ys5 ys5Var = zs5.Companion;
                        Objects.requireNonNull(ys5Var);
                        return observableFromPublisherJ.map(new nh61(ys5Var, (byte) 15)).flatMap(new mh61(oh61Var12, (byte) 11));
                    case 12:
                        ft5 ft5Var = (ft5) obj;
                        oh61 oh61Var13 = ((hv5) ifl1Var2.b).a;
                        int i13 = AppProtocolRemoteService.f1;
                        return oh61Var13.h.T(oh61Var13.m.c(1).v()).z().flatMapCompletable(new h341(oh61Var13, ft5Var, (byte) 6)).d(Observable.just(wq5Var)).startWith(oh61Var13.k.c(oh61Var13.z, ft5Var.d.booleanValue()).ignoreElement().w());
                    case 13:
                        mq5 mq5Var = (mq5) obj;
                        oh61 oh61Var14 = ((hv5) ifl1Var2.b).a;
                        int i14 = AppProtocolRemoteService.f1;
                        Integer num2 = mq5Var.c;
                        int iIntValue2 = num2 == null ? 20 : num2.intValue();
                        String str2 = mq5Var.b;
                        if (str2.equals("spotify:recently-played")) {
                            str2 = "com.spotify.recently-played";
                        } else if (str2.equals("spotify:browse")) {
                            str2 = "com.spotify.browse";
                        }
                        String str3 = str2;
                        c610 c610Var = oh61Var14.u;
                        hlr0 hlr0Var = new hlr0();
                        UbiSpecificationId ubiSpecificationId = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var = oh61Var14.o.c;
                        String str4 = cr5Var.e;
                        String str5 = cr5Var.d;
                        String str6 = oh61Var14.y;
                        m210 m210Var2 = oh61Var14.z;
                        if (m210Var2 == null) {
                            m210Var2 = oh61.D;
                        }
                        return c610Var.c(new r9c(str6, str3, str4, str5, m210Var2, false, true, false, false, hlr0Var, 2, 1, ubiSpecificationId, (String) null, false, false, false), new Bundle()).map(new mp5(mq5Var, iIntValue2, (byte) 8)).doOnError(new fv5(str3, (byte) 21)).toObservable().doOnSubscribe(new po5(oh61Var14, mq5Var, (byte) 5)).startWith(oh61Var14.m.c(8).w());
                    case 14:
                        oh61 oh61Var15 = ((hv5) ifl1Var2.b).a;
                        int i15 = AppProtocolRemoteService.f1;
                        return oh61Var15.l((rt5) obj);
                    case 15:
                        oh61 oh61Var16 = ((hv5) ifl1Var2.b).a;
                        int i16 = AppProtocolRemoteService.f1;
                        Flowable flowable4 = oh61Var16.h;
                        return x0d.j(flowable4, flowable4).map(new nh61((byte) 1)).flatMap(new mh61(oh61Var16, (byte) 4));
                    case 16:
                        oh61 oh61Var17 = ((hv5) ifl1Var2.b).a;
                        int i17 = AppProtocolRemoteService.f1;
                        return oh61Var17.k.n(oh61Var17.z).map(new nh61((byte) 2)).flatMap(new mh61(oh61Var17, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var17.m.c(1).w());
                    case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                        oh61 oh61Var18 = ((hv5) ifl1Var2.b).a;
                        int i18 = AppProtocolRemoteService.f1;
                        return oh61Var18.k.o(oh61Var18.z).map(new f341((byte) 21)).zipWith(oh61Var18.h.z(), new f341((byte) 22)).flatMap(new h341(oh61Var18, (ut5) obj, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var18.m.c(1).w());
                    case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                        jr5 jr5Var = (jr5) obj;
                        oh61 oh61Var19 = ((hv5) ifl1Var2.b).a;
                        int i19 = AppProtocolRemoteService.f1;
                        return Observable.just(jr5Var).startWith(oh61Var19.m.c(1).w()).switchMap(new mh61(oh61Var19, (byte) 1)).flatMapSingle(new mh61(oh61Var19, (byte) 2)).filter(new f341((byte) 24)).map(new f341((byte) 25)).flatMap(new h341(oh61Var19, jr5Var, (byte) 7)).timeout(15L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new f341((byte) 26));
                    case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                        pu5 pu5Var = (pu5) obj;
                        oh61 oh61Var20 = ((hv5) ifl1Var2.b).a;
                        int i20 = AppProtocolRemoteService.f1;
                        Observable observable = oh61Var20.h.T(oh61Var20.m.c(2).v()).z().toObservable();
                        g510 g510Var3 = oh61Var20.k;
                        return observable.startWith(g510.q(g510Var3, oh61Var20.z, g510Var3.h.e(pu5Var.b)).ignoreElement().w()).map(new h341(oh61Var20, pu5Var, (byte) 8));
                    case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                        oh61 oh61Var21 = ((hv5) ifl1Var2.b).a;
                        int i21 = AppProtocolRemoteService.f1;
                        return oh61Var21.c.a.k.b().map(new nh61((byte) 9));
                    case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                        oh61 oh61Var22 = ((hv5) ifl1Var2.b).a;
                        int i22 = AppProtocolRemoteService.f1;
                        return oh61Var22.m.c(4).d(Observable.just(new ws5()));
                    case 22:
                        oh61 oh61Var23 = ((hv5) ifl1Var2.b).a;
                        int i23 = AppProtocolRemoteService.f1;
                        return oh61Var23.i((vu5) obj);
                    case 23:
                        oh61 oh61Var24 = ((hv5) ifl1Var2.b).a;
                        int i24 = AppProtocolRemoteService.f1;
                        return oh61Var24.l.a(((sr5) obj).b.intValue(), oh61Var24.z).q(oh61Var24.m.c(1)).d(Observable.just(wq5Var));
                    case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                        oh61 oh61Var25 = ((hv5) ifl1Var2.b).a;
                        int i25 = AppProtocolRemoteService.f1;
                        return new poj0(oh61Var25.c, oh61Var25.j, oh61Var25.h, oh61Var25.n, (byte) 10).r(oh61Var25.a.getResources()).startWith(oh61Var25.m.c(4).w()).firstOrError().toObservable().map(new f341((byte) 27));
                    case 25:
                        oh61 oh61Var26 = ((hv5) ifl1Var2.b).a;
                        int i26 = AppProtocolRemoteService.f1;
                        Flowable flowable5 = oh61Var26.h;
                        iu5 iu5Var = ju5.Companion;
                        Objects.requireNonNull(iu5Var);
                        Flowable flowableT3 = flowable5.J(new nh61(iu5Var, (byte) 8)).T(oh61Var26.m.c(4).v());
                        flowableT3.getClass();
                        return new ObservableFromPublisher(flowableT3);
                    case 26:
                        pr5 pr5Var = (pr5) obj;
                        oh61 oh61Var27 = ((hv5) ifl1Var2.b).a;
                        int i27 = AppProtocolRemoteService.f1;
                        cr5 cr5Var2 = oh61Var27.o.c;
                        return Single.create(new u2i0(oh61Var27, pr5Var, cr5Var2.l, cr5Var2.k, true)).toObservable().startWith(oh61Var27.m.b(4, pr5Var).w());
                    case 27:
                        oh61 oh61Var28 = ((hv5) ifl1Var2.b).a;
                        int i28 = AppProtocolRemoteService.f1;
                        return oh61Var28.h.T(oh61Var28.m.c(4).v()).z().toObservable().map(new nh61((byte) 0));
                    case 28:
                        oh61 oh61Var29 = ((hv5) ifl1Var2.b).a;
                        int i29 = AppProtocolRemoteService.f1;
                        return oh61Var29.f();
                    default:
                        ct5 ct5Var = (ct5) obj;
                        oh61 oh61Var30 = ((hv5) ifl1Var2.b).a;
                        int i30 = AppProtocolRemoteService.f1;
                        if (ct5Var != null) {
                            str = ct5Var.b;
                            if ("default".equals(str)) {
                                if ("car".equals(oh61Var30.z.f)) {
                                    str = "default-cars";
                                } else {
                                    str = "default";
                                }
                            }
                        } else if ("car".equals(oh61Var30.z.f)) {
                            str = "default-cars";
                        } else {
                            str = "default";
                        }
                        Observable observableJust = (oh61Var30.o.c.e.equals("com.google.android.apps.maps") && str.equals("default")) ? Observable.just(new yr5(0, 0, 0, z6x.a)) : null;
                        if (observableJust != null) {
                            return observableJust;
                        }
                        oh61Var30.y = str;
                        Bundle bundleG = cy30.g("_type", str);
                        String str7 = oh61Var30.f31p;
                        hlr0 hlr0Var2 = new hlr0();
                        UbiSpecificationId ubiSpecificationId2 = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var3 = oh61Var30.o.c;
                        String str8 = cr5Var3.e;
                        String str9 = cr5Var3.d;
                        m210 m210Var3 = oh61Var30.z;
                        if (m210Var3 == null) {
                            m210Var3 = oh61.D;
                        }
                        return oh61Var30.u.c(new r9c(str, str7, str8, str9, m210Var3, true, true, false, false, hlr0Var2, 2, 1, ubiSpecificationId2, (String) null, false, false, false), bundleG).map(new nh61((byte) 7)).toObservable().startWith(oh61Var30.m.c(8).w()).doOnSubscribe(new fv5(oh61Var30, (byte) 19));
                }
            }
        }));
        final byte b20 = 11;
        gv5Var2.accept(new v5y(wq5.class, "com.spotify.toggle_repeat", 1, new w5y() { // from class: p.e2s
            /* JADX WARN: Code duplicated, block: B:11:0x0044  */
            /* JADX WARN: Code duplicated, block: B:12:0x0047  */
            /* JADX WARN: Code duplicated, block: B:9:0x0038  */
            @Override // p.w5y
            public final Observable a(Object obj) {
                String str;
                byte b110 = b20;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                wq5 wq5Var = cv5.a;
                final byte b111 = 0;
                final byte b112 = 1;
                ifl1 ifl1Var2 = ifl1Var;
                switch (b110) {
                    case 0:
                        oh61 oh61Var = ((hv5) ifl1Var2.b).a;
                        int i = AppProtocolRemoteService.f1;
                        g510 g510Var = oh61Var.k;
                        m210 m210Var = oh61Var.z;
                        String strP = g510Var.p();
                        if (strP == null) {
                            strP = "";
                        }
                        return g510.q(g510Var, m210Var, g510Var.h.j(strP)).flatMapCompletable(new mh61(oh61Var, (byte) 7)).d(oh61Var.c.b().a().takeUntil(new nh61((byte) 4)).flatMap(new nh61((byte) 5)).timeout(25L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new nh61((byte) 6)));
                    case 1:
                        oh61 oh61Var2 = ((hv5) ifl1Var2.b).a;
                        int i2 = AppProtocolRemoteService.f1;
                        return oh61Var2.h((pu5) obj);
                    case 2:
                        oh61 oh61Var3 = ((hv5) ifl1Var2.b).a;
                        int i3 = AppProtocolRemoteService.f1;
                        return oh61Var3.e.b("type").startWith(new CompletableFromAction(new w43(oh61Var3.m, (byte) 6)).w()).map(new f341((byte) 17)).onErrorResumeNext(new f341((byte) 29));
                    case 3:
                        oh61 oh61Var4 = ((hv5) ifl1Var2.b).a;
                        int i4 = AppProtocolRemoteService.f1;
                        return oh61Var4.i((vu5) obj);
                    case 4:
                        su5 su5Var = (su5) obj;
                        oh61 oh61Var5 = ((hv5) ifl1Var2.b).a;
                        int i5 = AppProtocolRemoteService.f1;
                        return Single.create(new jf11((Object) su5Var, (byte) 18)).flatMap(new h341(oh61Var5, su5Var, (byte) 9)).toObservable().startWith(oh61Var5.m.c(2).w());
                    case 5:
                        final ks5 ks5Var = (ks5) obj;
                        final oh61 oh61Var6 = ((hv5) ifl1Var2.b).a;
                        int i6 = AppProtocolRemoteService.f1;
                        return oh61Var6.k.l(ks5Var.b.longValue(), oh61Var6.z).map(new f341((byte) 23)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b113 = b111;
                                ks5 ks5Var3 = ks5Var;
                                oh61 oh61Var8 = oh61Var6;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b113) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek in song", (byte) 18)).toObservable().startWith(oh61Var6.m.c(1).w());
                    case 6:
                        final ks5 ks5Var2 = (ks5) obj;
                        final oh61 oh61Var7 = ((hv5) ifl1Var2.b).a;
                        int i7 = AppProtocolRemoteService.f1;
                        return oh61Var7.k.k(ks5Var2.b.longValue(), oh61Var7.z).map(new f341((byte) 28)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b113 = b112;
                                ks5 ks5Var3 = ks5Var2;
                                oh61 oh61Var8 = oh61Var7;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b113) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek by in a song", (byte) 18)).toObservable().startWith(oh61Var7.m.c(1).w());
                    case 7:
                        oh61 oh61Var8 = ((hv5) ifl1Var2.b).a;
                        int i8 = AppProtocolRemoteService.f1;
                        dbm dbmVar = oh61Var8.m;
                        Flowable flowable = oh61Var8.h;
                        g510 g510Var2 = oh61Var8.k;
                        Integer num = ((ns5) obj).b;
                        int iIntValue = num.intValue();
                        if (iIntValue == 0) {
                            Flowable flowableT = flowable.T(dbmVar.c(1).v()).T(g510Var2.d(oh61Var8.z).map(new nh61((byte) 19)).flatMapCompletable(new mh61(oh61Var8, (byte) 10)).v());
                            nh61 nh61Var = new nh61((byte) 20);
                            flowableT.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT, nh61Var).x(new nh61((byte) 21)).J(new nh61((byte) 22)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 23));
                        }
                        if (iIntValue == 1) {
                            Flowable flowableT2 = flowable.T(dbmVar.c(1).v()).T(g510Var2.j(oh61Var8.z).map(new nh61((byte) 13)).flatMapCompletable(new mh61(oh61Var8, (byte) 9)).v());
                            nh61 nh61Var2 = new nh61((byte) 14);
                            flowableT2.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT2, nh61Var2).x(new nh61((byte) 16)).J(new nh61((byte) 17)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 18));
                        }
                        if (iIntValue == 50 || iIntValue == 80 || iIntValue == 100 || iIntValue == 120 || iIntValue == 150 || iIntValue == 200 || iIntValue == 300) {
                            return oh61Var8.j(num.intValue());
                        }
                        return IapException.a("Unexpected playback speed " + num);
                    case 8:
                        oh61 oh61Var9 = ((hv5) ifl1Var2.b).a;
                        int i9 = AppProtocolRemoteService.f1;
                        return oh61Var9.j((int) (((ot5) obj).b.floatValue() * 100.0f));
                    case 9:
                        oh61 oh61Var10 = ((hv5) ifl1Var2.b).a;
                        int i10 = AppProtocolRemoteService.f1;
                        return oh61Var10.k((zs5) obj);
                    case 10:
                        oh61 oh61Var11 = ((hv5) ifl1Var2.b).a;
                        int i11 = AppProtocolRemoteService.f1;
                        Flowable flowable2 = oh61Var11.f;
                        return Observable.combineLatest(x0d.j(flowable2, flowable2).startWith(new CompletableFromAction(new ok70(oh61Var11.m, 4)).w()), yoi1.i(oh61Var11.g.a(o6n.a), o6x.a).startWithItem(Boolean.FALSE).distinctUntilChanged(), new mh61(oh61Var11, (byte) 3));
                    case 11:
                        oh61 oh61Var12 = ((hv5) ifl1Var2.b).a;
                        int i12 = AppProtocolRemoteService.f1;
                        Flowable flowable3 = oh61Var12.h;
                        ObservableFromPublisher observableFromPublisherJ = x0d.j(flowable3, flowable3);
                        ys5 ys5Var = zs5.Companion;
                        Objects.requireNonNull(ys5Var);
                        return observableFromPublisherJ.map(new nh61(ys5Var, (byte) 15)).flatMap(new mh61(oh61Var12, (byte) 11));
                    case 12:
                        ft5 ft5Var = (ft5) obj;
                        oh61 oh61Var13 = ((hv5) ifl1Var2.b).a;
                        int i13 = AppProtocolRemoteService.f1;
                        return oh61Var13.h.T(oh61Var13.m.c(1).v()).z().flatMapCompletable(new h341(oh61Var13, ft5Var, (byte) 6)).d(Observable.just(wq5Var)).startWith(oh61Var13.k.c(oh61Var13.z, ft5Var.d.booleanValue()).ignoreElement().w());
                    case 13:
                        mq5 mq5Var = (mq5) obj;
                        oh61 oh61Var14 = ((hv5) ifl1Var2.b).a;
                        int i14 = AppProtocolRemoteService.f1;
                        Integer num2 = mq5Var.c;
                        int iIntValue2 = num2 == null ? 20 : num2.intValue();
                        String str2 = mq5Var.b;
                        if (str2.equals("spotify:recently-played")) {
                            str2 = "com.spotify.recently-played";
                        } else if (str2.equals("spotify:browse")) {
                            str2 = "com.spotify.browse";
                        }
                        String str3 = str2;
                        c610 c610Var = oh61Var14.u;
                        hlr0 hlr0Var = new hlr0();
                        UbiSpecificationId ubiSpecificationId = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var = oh61Var14.o.c;
                        String str4 = cr5Var.e;
                        String str5 = cr5Var.d;
                        String str6 = oh61Var14.y;
                        m210 m210Var2 = oh61Var14.z;
                        if (m210Var2 == null) {
                            m210Var2 = oh61.D;
                        }
                        return c610Var.c(new r9c(str6, str3, str4, str5, m210Var2, false, true, false, false, hlr0Var, 2, 1, ubiSpecificationId, (String) null, false, false, false), new Bundle()).map(new mp5(mq5Var, iIntValue2, (byte) 8)).doOnError(new fv5(str3, (byte) 21)).toObservable().doOnSubscribe(new po5(oh61Var14, mq5Var, (byte) 5)).startWith(oh61Var14.m.c(8).w());
                    case 14:
                        oh61 oh61Var15 = ((hv5) ifl1Var2.b).a;
                        int i15 = AppProtocolRemoteService.f1;
                        return oh61Var15.l((rt5) obj);
                    case 15:
                        oh61 oh61Var16 = ((hv5) ifl1Var2.b).a;
                        int i16 = AppProtocolRemoteService.f1;
                        Flowable flowable4 = oh61Var16.h;
                        return x0d.j(flowable4, flowable4).map(new nh61((byte) 1)).flatMap(new mh61(oh61Var16, (byte) 4));
                    case 16:
                        oh61 oh61Var17 = ((hv5) ifl1Var2.b).a;
                        int i17 = AppProtocolRemoteService.f1;
                        return oh61Var17.k.n(oh61Var17.z).map(new nh61((byte) 2)).flatMap(new mh61(oh61Var17, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var17.m.c(1).w());
                    case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                        oh61 oh61Var18 = ((hv5) ifl1Var2.b).a;
                        int i18 = AppProtocolRemoteService.f1;
                        return oh61Var18.k.o(oh61Var18.z).map(new f341((byte) 21)).zipWith(oh61Var18.h.z(), new f341((byte) 22)).flatMap(new h341(oh61Var18, (ut5) obj, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var18.m.c(1).w());
                    case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                        jr5 jr5Var = (jr5) obj;
                        oh61 oh61Var19 = ((hv5) ifl1Var2.b).a;
                        int i19 = AppProtocolRemoteService.f1;
                        return Observable.just(jr5Var).startWith(oh61Var19.m.c(1).w()).switchMap(new mh61(oh61Var19, (byte) 1)).flatMapSingle(new mh61(oh61Var19, (byte) 2)).filter(new f341((byte) 24)).map(new f341((byte) 25)).flatMap(new h341(oh61Var19, jr5Var, (byte) 7)).timeout(15L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new f341((byte) 26));
                    case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                        pu5 pu5Var = (pu5) obj;
                        oh61 oh61Var20 = ((hv5) ifl1Var2.b).a;
                        int i20 = AppProtocolRemoteService.f1;
                        Observable observable = oh61Var20.h.T(oh61Var20.m.c(2).v()).z().toObservable();
                        g510 g510Var3 = oh61Var20.k;
                        return observable.startWith(g510.q(g510Var3, oh61Var20.z, g510Var3.h.e(pu5Var.b)).ignoreElement().w()).map(new h341(oh61Var20, pu5Var, (byte) 8));
                    case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                        oh61 oh61Var21 = ((hv5) ifl1Var2.b).a;
                        int i21 = AppProtocolRemoteService.f1;
                        return oh61Var21.c.a.k.b().map(new nh61((byte) 9));
                    case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                        oh61 oh61Var22 = ((hv5) ifl1Var2.b).a;
                        int i22 = AppProtocolRemoteService.f1;
                        return oh61Var22.m.c(4).d(Observable.just(new ws5()));
                    case 22:
                        oh61 oh61Var23 = ((hv5) ifl1Var2.b).a;
                        int i23 = AppProtocolRemoteService.f1;
                        return oh61Var23.i((vu5) obj);
                    case 23:
                        oh61 oh61Var24 = ((hv5) ifl1Var2.b).a;
                        int i24 = AppProtocolRemoteService.f1;
                        return oh61Var24.l.a(((sr5) obj).b.intValue(), oh61Var24.z).q(oh61Var24.m.c(1)).d(Observable.just(wq5Var));
                    case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                        oh61 oh61Var25 = ((hv5) ifl1Var2.b).a;
                        int i25 = AppProtocolRemoteService.f1;
                        return new poj0(oh61Var25.c, oh61Var25.j, oh61Var25.h, oh61Var25.n, (byte) 10).r(oh61Var25.a.getResources()).startWith(oh61Var25.m.c(4).w()).firstOrError().toObservable().map(new f341((byte) 27));
                    case 25:
                        oh61 oh61Var26 = ((hv5) ifl1Var2.b).a;
                        int i26 = AppProtocolRemoteService.f1;
                        Flowable flowable5 = oh61Var26.h;
                        iu5 iu5Var = ju5.Companion;
                        Objects.requireNonNull(iu5Var);
                        Flowable flowableT3 = flowable5.J(new nh61(iu5Var, (byte) 8)).T(oh61Var26.m.c(4).v());
                        flowableT3.getClass();
                        return new ObservableFromPublisher(flowableT3);
                    case 26:
                        pr5 pr5Var = (pr5) obj;
                        oh61 oh61Var27 = ((hv5) ifl1Var2.b).a;
                        int i27 = AppProtocolRemoteService.f1;
                        cr5 cr5Var2 = oh61Var27.o.c;
                        return Single.create(new u2i0(oh61Var27, pr5Var, cr5Var2.l, cr5Var2.k, true)).toObservable().startWith(oh61Var27.m.b(4, pr5Var).w());
                    case 27:
                        oh61 oh61Var28 = ((hv5) ifl1Var2.b).a;
                        int i28 = AppProtocolRemoteService.f1;
                        return oh61Var28.h.T(oh61Var28.m.c(4).v()).z().toObservable().map(new nh61((byte) 0));
                    case 28:
                        oh61 oh61Var29 = ((hv5) ifl1Var2.b).a;
                        int i29 = AppProtocolRemoteService.f1;
                        return oh61Var29.f();
                    default:
                        ct5 ct5Var = (ct5) obj;
                        oh61 oh61Var30 = ((hv5) ifl1Var2.b).a;
                        int i30 = AppProtocolRemoteService.f1;
                        if (ct5Var != null) {
                            str = ct5Var.b;
                            if ("default".equals(str)) {
                                if ("car".equals(oh61Var30.z.f)) {
                                    str = "default-cars";
                                } else {
                                    str = "default";
                                }
                            }
                        } else if ("car".equals(oh61Var30.z.f)) {
                            str = "default-cars";
                        } else {
                            str = "default";
                        }
                        Observable observableJust = (oh61Var30.o.c.e.equals("com.google.android.apps.maps") && str.equals("default")) ? Observable.just(new yr5(0, 0, 0, z6x.a)) : null;
                        if (observableJust != null) {
                            return observableJust;
                        }
                        oh61Var30.y = str;
                        Bundle bundleG = cy30.g("_type", str);
                        String str7 = oh61Var30.f31p;
                        hlr0 hlr0Var2 = new hlr0();
                        UbiSpecificationId ubiSpecificationId2 = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var3 = oh61Var30.o.c;
                        String str8 = cr5Var3.e;
                        String str9 = cr5Var3.d;
                        m210 m210Var3 = oh61Var30.z;
                        if (m210Var3 == null) {
                            m210Var3 = oh61.D;
                        }
                        return oh61Var30.u.c(new r9c(str, str7, str8, str9, m210Var3, true, true, false, false, hlr0Var2, 2, 1, ubiSpecificationId2, (String) null, false, false, false), bundleG).map(new nh61((byte) 7)).toObservable().startWith(oh61Var30.m.c(8).w()).doOnSubscribe(new fv5(oh61Var30, (byte) 19));
                }
            }
        }));
        final byte b21 = 12;
        gv5Var2.accept(new v5y(ft5.class, "com.spotify.set_saved", 1, new w5y() { // from class: p.e2s
            /* JADX WARN: Code duplicated, block: B:11:0x0044  */
            /* JADX WARN: Code duplicated, block: B:12:0x0047  */
            /* JADX WARN: Code duplicated, block: B:9:0x0038  */
            @Override // p.w5y
            public final Observable a(Object obj) {
                String str;
                byte b110 = b21;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                wq5 wq5Var = cv5.a;
                final byte b111 = 0;
                final byte b112 = 1;
                ifl1 ifl1Var2 = ifl1Var;
                switch (b110) {
                    case 0:
                        oh61 oh61Var = ((hv5) ifl1Var2.b).a;
                        int i = AppProtocolRemoteService.f1;
                        g510 g510Var = oh61Var.k;
                        m210 m210Var = oh61Var.z;
                        String strP = g510Var.p();
                        if (strP == null) {
                            strP = "";
                        }
                        return g510.q(g510Var, m210Var, g510Var.h.j(strP)).flatMapCompletable(new mh61(oh61Var, (byte) 7)).d(oh61Var.c.b().a().takeUntil(new nh61((byte) 4)).flatMap(new nh61((byte) 5)).timeout(25L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new nh61((byte) 6)));
                    case 1:
                        oh61 oh61Var2 = ((hv5) ifl1Var2.b).a;
                        int i2 = AppProtocolRemoteService.f1;
                        return oh61Var2.h((pu5) obj);
                    case 2:
                        oh61 oh61Var3 = ((hv5) ifl1Var2.b).a;
                        int i3 = AppProtocolRemoteService.f1;
                        return oh61Var3.e.b("type").startWith(new CompletableFromAction(new w43(oh61Var3.m, (byte) 6)).w()).map(new f341((byte) 17)).onErrorResumeNext(new f341((byte) 29));
                    case 3:
                        oh61 oh61Var4 = ((hv5) ifl1Var2.b).a;
                        int i4 = AppProtocolRemoteService.f1;
                        return oh61Var4.i((vu5) obj);
                    case 4:
                        su5 su5Var = (su5) obj;
                        oh61 oh61Var5 = ((hv5) ifl1Var2.b).a;
                        int i5 = AppProtocolRemoteService.f1;
                        return Single.create(new jf11((Object) su5Var, (byte) 18)).flatMap(new h341(oh61Var5, su5Var, (byte) 9)).toObservable().startWith(oh61Var5.m.c(2).w());
                    case 5:
                        final ks5 ks5Var = (ks5) obj;
                        final oh61 oh61Var6 = ((hv5) ifl1Var2.b).a;
                        int i6 = AppProtocolRemoteService.f1;
                        return oh61Var6.k.l(ks5Var.b.longValue(), oh61Var6.z).map(new f341((byte) 23)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b113 = b111;
                                ks5 ks5Var3 = ks5Var;
                                oh61 oh61Var8 = oh61Var6;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b113) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek in song", (byte) 18)).toObservable().startWith(oh61Var6.m.c(1).w());
                    case 6:
                        final ks5 ks5Var2 = (ks5) obj;
                        final oh61 oh61Var7 = ((hv5) ifl1Var2.b).a;
                        int i7 = AppProtocolRemoteService.f1;
                        return oh61Var7.k.k(ks5Var2.b.longValue(), oh61Var7.z).map(new f341((byte) 28)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b113 = b112;
                                ks5 ks5Var3 = ks5Var2;
                                oh61 oh61Var8 = oh61Var7;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b113) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek by in a song", (byte) 18)).toObservable().startWith(oh61Var7.m.c(1).w());
                    case 7:
                        oh61 oh61Var8 = ((hv5) ifl1Var2.b).a;
                        int i8 = AppProtocolRemoteService.f1;
                        dbm dbmVar = oh61Var8.m;
                        Flowable flowable = oh61Var8.h;
                        g510 g510Var2 = oh61Var8.k;
                        Integer num = ((ns5) obj).b;
                        int iIntValue = num.intValue();
                        if (iIntValue == 0) {
                            Flowable flowableT = flowable.T(dbmVar.c(1).v()).T(g510Var2.d(oh61Var8.z).map(new nh61((byte) 19)).flatMapCompletable(new mh61(oh61Var8, (byte) 10)).v());
                            nh61 nh61Var = new nh61((byte) 20);
                            flowableT.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT, nh61Var).x(new nh61((byte) 21)).J(new nh61((byte) 22)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 23));
                        }
                        if (iIntValue == 1) {
                            Flowable flowableT2 = flowable.T(dbmVar.c(1).v()).T(g510Var2.j(oh61Var8.z).map(new nh61((byte) 13)).flatMapCompletable(new mh61(oh61Var8, (byte) 9)).v());
                            nh61 nh61Var2 = new nh61((byte) 14);
                            flowableT2.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT2, nh61Var2).x(new nh61((byte) 16)).J(new nh61((byte) 17)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 18));
                        }
                        if (iIntValue == 50 || iIntValue == 80 || iIntValue == 100 || iIntValue == 120 || iIntValue == 150 || iIntValue == 200 || iIntValue == 300) {
                            return oh61Var8.j(num.intValue());
                        }
                        return IapException.a("Unexpected playback speed " + num);
                    case 8:
                        oh61 oh61Var9 = ((hv5) ifl1Var2.b).a;
                        int i9 = AppProtocolRemoteService.f1;
                        return oh61Var9.j((int) (((ot5) obj).b.floatValue() * 100.0f));
                    case 9:
                        oh61 oh61Var10 = ((hv5) ifl1Var2.b).a;
                        int i10 = AppProtocolRemoteService.f1;
                        return oh61Var10.k((zs5) obj);
                    case 10:
                        oh61 oh61Var11 = ((hv5) ifl1Var2.b).a;
                        int i11 = AppProtocolRemoteService.f1;
                        Flowable flowable2 = oh61Var11.f;
                        return Observable.combineLatest(x0d.j(flowable2, flowable2).startWith(new CompletableFromAction(new ok70(oh61Var11.m, 4)).w()), yoi1.i(oh61Var11.g.a(o6n.a), o6x.a).startWithItem(Boolean.FALSE).distinctUntilChanged(), new mh61(oh61Var11, (byte) 3));
                    case 11:
                        oh61 oh61Var12 = ((hv5) ifl1Var2.b).a;
                        int i12 = AppProtocolRemoteService.f1;
                        Flowable flowable3 = oh61Var12.h;
                        ObservableFromPublisher observableFromPublisherJ = x0d.j(flowable3, flowable3);
                        ys5 ys5Var = zs5.Companion;
                        Objects.requireNonNull(ys5Var);
                        return observableFromPublisherJ.map(new nh61(ys5Var, (byte) 15)).flatMap(new mh61(oh61Var12, (byte) 11));
                    case 12:
                        ft5 ft5Var = (ft5) obj;
                        oh61 oh61Var13 = ((hv5) ifl1Var2.b).a;
                        int i13 = AppProtocolRemoteService.f1;
                        return oh61Var13.h.T(oh61Var13.m.c(1).v()).z().flatMapCompletable(new h341(oh61Var13, ft5Var, (byte) 6)).d(Observable.just(wq5Var)).startWith(oh61Var13.k.c(oh61Var13.z, ft5Var.d.booleanValue()).ignoreElement().w());
                    case 13:
                        mq5 mq5Var = (mq5) obj;
                        oh61 oh61Var14 = ((hv5) ifl1Var2.b).a;
                        int i14 = AppProtocolRemoteService.f1;
                        Integer num2 = mq5Var.c;
                        int iIntValue2 = num2 == null ? 20 : num2.intValue();
                        String str2 = mq5Var.b;
                        if (str2.equals("spotify:recently-played")) {
                            str2 = "com.spotify.recently-played";
                        } else if (str2.equals("spotify:browse")) {
                            str2 = "com.spotify.browse";
                        }
                        String str3 = str2;
                        c610 c610Var = oh61Var14.u;
                        hlr0 hlr0Var = new hlr0();
                        UbiSpecificationId ubiSpecificationId = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var = oh61Var14.o.c;
                        String str4 = cr5Var.e;
                        String str5 = cr5Var.d;
                        String str6 = oh61Var14.y;
                        m210 m210Var2 = oh61Var14.z;
                        if (m210Var2 == null) {
                            m210Var2 = oh61.D;
                        }
                        return c610Var.c(new r9c(str6, str3, str4, str5, m210Var2, false, true, false, false, hlr0Var, 2, 1, ubiSpecificationId, (String) null, false, false, false), new Bundle()).map(new mp5(mq5Var, iIntValue2, (byte) 8)).doOnError(new fv5(str3, (byte) 21)).toObservable().doOnSubscribe(new po5(oh61Var14, mq5Var, (byte) 5)).startWith(oh61Var14.m.c(8).w());
                    case 14:
                        oh61 oh61Var15 = ((hv5) ifl1Var2.b).a;
                        int i15 = AppProtocolRemoteService.f1;
                        return oh61Var15.l((rt5) obj);
                    case 15:
                        oh61 oh61Var16 = ((hv5) ifl1Var2.b).a;
                        int i16 = AppProtocolRemoteService.f1;
                        Flowable flowable4 = oh61Var16.h;
                        return x0d.j(flowable4, flowable4).map(new nh61((byte) 1)).flatMap(new mh61(oh61Var16, (byte) 4));
                    case 16:
                        oh61 oh61Var17 = ((hv5) ifl1Var2.b).a;
                        int i17 = AppProtocolRemoteService.f1;
                        return oh61Var17.k.n(oh61Var17.z).map(new nh61((byte) 2)).flatMap(new mh61(oh61Var17, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var17.m.c(1).w());
                    case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                        oh61 oh61Var18 = ((hv5) ifl1Var2.b).a;
                        int i18 = AppProtocolRemoteService.f1;
                        return oh61Var18.k.o(oh61Var18.z).map(new f341((byte) 21)).zipWith(oh61Var18.h.z(), new f341((byte) 22)).flatMap(new h341(oh61Var18, (ut5) obj, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var18.m.c(1).w());
                    case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                        jr5 jr5Var = (jr5) obj;
                        oh61 oh61Var19 = ((hv5) ifl1Var2.b).a;
                        int i19 = AppProtocolRemoteService.f1;
                        return Observable.just(jr5Var).startWith(oh61Var19.m.c(1).w()).switchMap(new mh61(oh61Var19, (byte) 1)).flatMapSingle(new mh61(oh61Var19, (byte) 2)).filter(new f341((byte) 24)).map(new f341((byte) 25)).flatMap(new h341(oh61Var19, jr5Var, (byte) 7)).timeout(15L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new f341((byte) 26));
                    case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                        pu5 pu5Var = (pu5) obj;
                        oh61 oh61Var20 = ((hv5) ifl1Var2.b).a;
                        int i20 = AppProtocolRemoteService.f1;
                        Observable observable = oh61Var20.h.T(oh61Var20.m.c(2).v()).z().toObservable();
                        g510 g510Var3 = oh61Var20.k;
                        return observable.startWith(g510.q(g510Var3, oh61Var20.z, g510Var3.h.e(pu5Var.b)).ignoreElement().w()).map(new h341(oh61Var20, pu5Var, (byte) 8));
                    case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                        oh61 oh61Var21 = ((hv5) ifl1Var2.b).a;
                        int i21 = AppProtocolRemoteService.f1;
                        return oh61Var21.c.a.k.b().map(new nh61((byte) 9));
                    case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                        oh61 oh61Var22 = ((hv5) ifl1Var2.b).a;
                        int i22 = AppProtocolRemoteService.f1;
                        return oh61Var22.m.c(4).d(Observable.just(new ws5()));
                    case 22:
                        oh61 oh61Var23 = ((hv5) ifl1Var2.b).a;
                        int i23 = AppProtocolRemoteService.f1;
                        return oh61Var23.i((vu5) obj);
                    case 23:
                        oh61 oh61Var24 = ((hv5) ifl1Var2.b).a;
                        int i24 = AppProtocolRemoteService.f1;
                        return oh61Var24.l.a(((sr5) obj).b.intValue(), oh61Var24.z).q(oh61Var24.m.c(1)).d(Observable.just(wq5Var));
                    case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                        oh61 oh61Var25 = ((hv5) ifl1Var2.b).a;
                        int i25 = AppProtocolRemoteService.f1;
                        return new poj0(oh61Var25.c, oh61Var25.j, oh61Var25.h, oh61Var25.n, (byte) 10).r(oh61Var25.a.getResources()).startWith(oh61Var25.m.c(4).w()).firstOrError().toObservable().map(new f341((byte) 27));
                    case 25:
                        oh61 oh61Var26 = ((hv5) ifl1Var2.b).a;
                        int i26 = AppProtocolRemoteService.f1;
                        Flowable flowable5 = oh61Var26.h;
                        iu5 iu5Var = ju5.Companion;
                        Objects.requireNonNull(iu5Var);
                        Flowable flowableT3 = flowable5.J(new nh61(iu5Var, (byte) 8)).T(oh61Var26.m.c(4).v());
                        flowableT3.getClass();
                        return new ObservableFromPublisher(flowableT3);
                    case 26:
                        pr5 pr5Var = (pr5) obj;
                        oh61 oh61Var27 = ((hv5) ifl1Var2.b).a;
                        int i27 = AppProtocolRemoteService.f1;
                        cr5 cr5Var2 = oh61Var27.o.c;
                        return Single.create(new u2i0(oh61Var27, pr5Var, cr5Var2.l, cr5Var2.k, true)).toObservable().startWith(oh61Var27.m.b(4, pr5Var).w());
                    case 27:
                        oh61 oh61Var28 = ((hv5) ifl1Var2.b).a;
                        int i28 = AppProtocolRemoteService.f1;
                        return oh61Var28.h.T(oh61Var28.m.c(4).v()).z().toObservable().map(new nh61((byte) 0));
                    case 28:
                        oh61 oh61Var29 = ((hv5) ifl1Var2.b).a;
                        int i29 = AppProtocolRemoteService.f1;
                        return oh61Var29.f();
                    default:
                        ct5 ct5Var = (ct5) obj;
                        oh61 oh61Var30 = ((hv5) ifl1Var2.b).a;
                        int i30 = AppProtocolRemoteService.f1;
                        if (ct5Var != null) {
                            str = ct5Var.b;
                            if ("default".equals(str)) {
                                if ("car".equals(oh61Var30.z.f)) {
                                    str = "default-cars";
                                } else {
                                    str = "default";
                                }
                            }
                        } else if ("car".equals(oh61Var30.z.f)) {
                            str = "default-cars";
                        } else {
                            str = "default";
                        }
                        Observable observableJust = (oh61Var30.o.c.e.equals("com.google.android.apps.maps") && str.equals("default")) ? Observable.just(new yr5(0, 0, 0, z6x.a)) : null;
                        if (observableJust != null) {
                            return observableJust;
                        }
                        oh61Var30.y = str;
                        Bundle bundleG = cy30.g("_type", str);
                        String str7 = oh61Var30.f31p;
                        hlr0 hlr0Var2 = new hlr0();
                        UbiSpecificationId ubiSpecificationId2 = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var3 = oh61Var30.o.c;
                        String str8 = cr5Var3.e;
                        String str9 = cr5Var3.d;
                        m210 m210Var3 = oh61Var30.z;
                        if (m210Var3 == null) {
                            m210Var3 = oh61.D;
                        }
                        return oh61Var30.u.c(new r9c(str, str7, str8, str9, m210Var3, true, true, false, false, hlr0Var2, 2, 1, ubiSpecificationId2, (String) null, false, false, false), bundleG).map(new nh61((byte) 7)).toObservable().startWith(oh61Var30.m.c(8).w()).doOnSubscribe(new fv5(oh61Var30, (byte) 19));
                }
            }
        }));
        final byte b22 = 14;
        gv5Var2.accept(new v5y(rt5.class, "com.spotify.set_shuffle", 1, new w5y() { // from class: p.e2s
            /* JADX WARN: Code duplicated, block: B:11:0x0044  */
            /* JADX WARN: Code duplicated, block: B:12:0x0047  */
            /* JADX WARN: Code duplicated, block: B:9:0x0038  */
            @Override // p.w5y
            public final Observable a(Object obj) {
                String str;
                byte b110 = b22;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                wq5 wq5Var = cv5.a;
                final byte b111 = 0;
                final byte b112 = 1;
                ifl1 ifl1Var2 = ifl1Var;
                switch (b110) {
                    case 0:
                        oh61 oh61Var = ((hv5) ifl1Var2.b).a;
                        int i = AppProtocolRemoteService.f1;
                        g510 g510Var = oh61Var.k;
                        m210 m210Var = oh61Var.z;
                        String strP = g510Var.p();
                        if (strP == null) {
                            strP = "";
                        }
                        return g510.q(g510Var, m210Var, g510Var.h.j(strP)).flatMapCompletable(new mh61(oh61Var, (byte) 7)).d(oh61Var.c.b().a().takeUntil(new nh61((byte) 4)).flatMap(new nh61((byte) 5)).timeout(25L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new nh61((byte) 6)));
                    case 1:
                        oh61 oh61Var2 = ((hv5) ifl1Var2.b).a;
                        int i2 = AppProtocolRemoteService.f1;
                        return oh61Var2.h((pu5) obj);
                    case 2:
                        oh61 oh61Var3 = ((hv5) ifl1Var2.b).a;
                        int i3 = AppProtocolRemoteService.f1;
                        return oh61Var3.e.b("type").startWith(new CompletableFromAction(new w43(oh61Var3.m, (byte) 6)).w()).map(new f341((byte) 17)).onErrorResumeNext(new f341((byte) 29));
                    case 3:
                        oh61 oh61Var4 = ((hv5) ifl1Var2.b).a;
                        int i4 = AppProtocolRemoteService.f1;
                        return oh61Var4.i((vu5) obj);
                    case 4:
                        su5 su5Var = (su5) obj;
                        oh61 oh61Var5 = ((hv5) ifl1Var2.b).a;
                        int i5 = AppProtocolRemoteService.f1;
                        return Single.create(new jf11((Object) su5Var, (byte) 18)).flatMap(new h341(oh61Var5, su5Var, (byte) 9)).toObservable().startWith(oh61Var5.m.c(2).w());
                    case 5:
                        final ks5 ks5Var = (ks5) obj;
                        final oh61 oh61Var6 = ((hv5) ifl1Var2.b).a;
                        int i6 = AppProtocolRemoteService.f1;
                        return oh61Var6.k.l(ks5Var.b.longValue(), oh61Var6.z).map(new f341((byte) 23)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b113 = b111;
                                ks5 ks5Var3 = ks5Var;
                                oh61 oh61Var8 = oh61Var6;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b113) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek in song", (byte) 18)).toObservable().startWith(oh61Var6.m.c(1).w());
                    case 6:
                        final ks5 ks5Var2 = (ks5) obj;
                        final oh61 oh61Var7 = ((hv5) ifl1Var2.b).a;
                        int i7 = AppProtocolRemoteService.f1;
                        return oh61Var7.k.k(ks5Var2.b.longValue(), oh61Var7.z).map(new f341((byte) 28)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b113 = b112;
                                ks5 ks5Var3 = ks5Var2;
                                oh61 oh61Var8 = oh61Var7;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b113) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek by in a song", (byte) 18)).toObservable().startWith(oh61Var7.m.c(1).w());
                    case 7:
                        oh61 oh61Var8 = ((hv5) ifl1Var2.b).a;
                        int i8 = AppProtocolRemoteService.f1;
                        dbm dbmVar = oh61Var8.m;
                        Flowable flowable = oh61Var8.h;
                        g510 g510Var2 = oh61Var8.k;
                        Integer num = ((ns5) obj).b;
                        int iIntValue = num.intValue();
                        if (iIntValue == 0) {
                            Flowable flowableT = flowable.T(dbmVar.c(1).v()).T(g510Var2.d(oh61Var8.z).map(new nh61((byte) 19)).flatMapCompletable(new mh61(oh61Var8, (byte) 10)).v());
                            nh61 nh61Var = new nh61((byte) 20);
                            flowableT.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT, nh61Var).x(new nh61((byte) 21)).J(new nh61((byte) 22)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 23));
                        }
                        if (iIntValue == 1) {
                            Flowable flowableT2 = flowable.T(dbmVar.c(1).v()).T(g510Var2.j(oh61Var8.z).map(new nh61((byte) 13)).flatMapCompletable(new mh61(oh61Var8, (byte) 9)).v());
                            nh61 nh61Var2 = new nh61((byte) 14);
                            flowableT2.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT2, nh61Var2).x(new nh61((byte) 16)).J(new nh61((byte) 17)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 18));
                        }
                        if (iIntValue == 50 || iIntValue == 80 || iIntValue == 100 || iIntValue == 120 || iIntValue == 150 || iIntValue == 200 || iIntValue == 300) {
                            return oh61Var8.j(num.intValue());
                        }
                        return IapException.a("Unexpected playback speed " + num);
                    case 8:
                        oh61 oh61Var9 = ((hv5) ifl1Var2.b).a;
                        int i9 = AppProtocolRemoteService.f1;
                        return oh61Var9.j((int) (((ot5) obj).b.floatValue() * 100.0f));
                    case 9:
                        oh61 oh61Var10 = ((hv5) ifl1Var2.b).a;
                        int i10 = AppProtocolRemoteService.f1;
                        return oh61Var10.k((zs5) obj);
                    case 10:
                        oh61 oh61Var11 = ((hv5) ifl1Var2.b).a;
                        int i11 = AppProtocolRemoteService.f1;
                        Flowable flowable2 = oh61Var11.f;
                        return Observable.combineLatest(x0d.j(flowable2, flowable2).startWith(new CompletableFromAction(new ok70(oh61Var11.m, 4)).w()), yoi1.i(oh61Var11.g.a(o6n.a), o6x.a).startWithItem(Boolean.FALSE).distinctUntilChanged(), new mh61(oh61Var11, (byte) 3));
                    case 11:
                        oh61 oh61Var12 = ((hv5) ifl1Var2.b).a;
                        int i12 = AppProtocolRemoteService.f1;
                        Flowable flowable3 = oh61Var12.h;
                        ObservableFromPublisher observableFromPublisherJ = x0d.j(flowable3, flowable3);
                        ys5 ys5Var = zs5.Companion;
                        Objects.requireNonNull(ys5Var);
                        return observableFromPublisherJ.map(new nh61(ys5Var, (byte) 15)).flatMap(new mh61(oh61Var12, (byte) 11));
                    case 12:
                        ft5 ft5Var = (ft5) obj;
                        oh61 oh61Var13 = ((hv5) ifl1Var2.b).a;
                        int i13 = AppProtocolRemoteService.f1;
                        return oh61Var13.h.T(oh61Var13.m.c(1).v()).z().flatMapCompletable(new h341(oh61Var13, ft5Var, (byte) 6)).d(Observable.just(wq5Var)).startWith(oh61Var13.k.c(oh61Var13.z, ft5Var.d.booleanValue()).ignoreElement().w());
                    case 13:
                        mq5 mq5Var = (mq5) obj;
                        oh61 oh61Var14 = ((hv5) ifl1Var2.b).a;
                        int i14 = AppProtocolRemoteService.f1;
                        Integer num2 = mq5Var.c;
                        int iIntValue2 = num2 == null ? 20 : num2.intValue();
                        String str2 = mq5Var.b;
                        if (str2.equals("spotify:recently-played")) {
                            str2 = "com.spotify.recently-played";
                        } else if (str2.equals("spotify:browse")) {
                            str2 = "com.spotify.browse";
                        }
                        String str3 = str2;
                        c610 c610Var = oh61Var14.u;
                        hlr0 hlr0Var = new hlr0();
                        UbiSpecificationId ubiSpecificationId = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var = oh61Var14.o.c;
                        String str4 = cr5Var.e;
                        String str5 = cr5Var.d;
                        String str6 = oh61Var14.y;
                        m210 m210Var2 = oh61Var14.z;
                        if (m210Var2 == null) {
                            m210Var2 = oh61.D;
                        }
                        return c610Var.c(new r9c(str6, str3, str4, str5, m210Var2, false, true, false, false, hlr0Var, 2, 1, ubiSpecificationId, (String) null, false, false, false), new Bundle()).map(new mp5(mq5Var, iIntValue2, (byte) 8)).doOnError(new fv5(str3, (byte) 21)).toObservable().doOnSubscribe(new po5(oh61Var14, mq5Var, (byte) 5)).startWith(oh61Var14.m.c(8).w());
                    case 14:
                        oh61 oh61Var15 = ((hv5) ifl1Var2.b).a;
                        int i15 = AppProtocolRemoteService.f1;
                        return oh61Var15.l((rt5) obj);
                    case 15:
                        oh61 oh61Var16 = ((hv5) ifl1Var2.b).a;
                        int i16 = AppProtocolRemoteService.f1;
                        Flowable flowable4 = oh61Var16.h;
                        return x0d.j(flowable4, flowable4).map(new nh61((byte) 1)).flatMap(new mh61(oh61Var16, (byte) 4));
                    case 16:
                        oh61 oh61Var17 = ((hv5) ifl1Var2.b).a;
                        int i17 = AppProtocolRemoteService.f1;
                        return oh61Var17.k.n(oh61Var17.z).map(new nh61((byte) 2)).flatMap(new mh61(oh61Var17, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var17.m.c(1).w());
                    case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                        oh61 oh61Var18 = ((hv5) ifl1Var2.b).a;
                        int i18 = AppProtocolRemoteService.f1;
                        return oh61Var18.k.o(oh61Var18.z).map(new f341((byte) 21)).zipWith(oh61Var18.h.z(), new f341((byte) 22)).flatMap(new h341(oh61Var18, (ut5) obj, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var18.m.c(1).w());
                    case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                        jr5 jr5Var = (jr5) obj;
                        oh61 oh61Var19 = ((hv5) ifl1Var2.b).a;
                        int i19 = AppProtocolRemoteService.f1;
                        return Observable.just(jr5Var).startWith(oh61Var19.m.c(1).w()).switchMap(new mh61(oh61Var19, (byte) 1)).flatMapSingle(new mh61(oh61Var19, (byte) 2)).filter(new f341((byte) 24)).map(new f341((byte) 25)).flatMap(new h341(oh61Var19, jr5Var, (byte) 7)).timeout(15L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new f341((byte) 26));
                    case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                        pu5 pu5Var = (pu5) obj;
                        oh61 oh61Var20 = ((hv5) ifl1Var2.b).a;
                        int i20 = AppProtocolRemoteService.f1;
                        Observable observable = oh61Var20.h.T(oh61Var20.m.c(2).v()).z().toObservable();
                        g510 g510Var3 = oh61Var20.k;
                        return observable.startWith(g510.q(g510Var3, oh61Var20.z, g510Var3.h.e(pu5Var.b)).ignoreElement().w()).map(new h341(oh61Var20, pu5Var, (byte) 8));
                    case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                        oh61 oh61Var21 = ((hv5) ifl1Var2.b).a;
                        int i21 = AppProtocolRemoteService.f1;
                        return oh61Var21.c.a.k.b().map(new nh61((byte) 9));
                    case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                        oh61 oh61Var22 = ((hv5) ifl1Var2.b).a;
                        int i22 = AppProtocolRemoteService.f1;
                        return oh61Var22.m.c(4).d(Observable.just(new ws5()));
                    case 22:
                        oh61 oh61Var23 = ((hv5) ifl1Var2.b).a;
                        int i23 = AppProtocolRemoteService.f1;
                        return oh61Var23.i((vu5) obj);
                    case 23:
                        oh61 oh61Var24 = ((hv5) ifl1Var2.b).a;
                        int i24 = AppProtocolRemoteService.f1;
                        return oh61Var24.l.a(((sr5) obj).b.intValue(), oh61Var24.z).q(oh61Var24.m.c(1)).d(Observable.just(wq5Var));
                    case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                        oh61 oh61Var25 = ((hv5) ifl1Var2.b).a;
                        int i25 = AppProtocolRemoteService.f1;
                        return new poj0(oh61Var25.c, oh61Var25.j, oh61Var25.h, oh61Var25.n, (byte) 10).r(oh61Var25.a.getResources()).startWith(oh61Var25.m.c(4).w()).firstOrError().toObservable().map(new f341((byte) 27));
                    case 25:
                        oh61 oh61Var26 = ((hv5) ifl1Var2.b).a;
                        int i26 = AppProtocolRemoteService.f1;
                        Flowable flowable5 = oh61Var26.h;
                        iu5 iu5Var = ju5.Companion;
                        Objects.requireNonNull(iu5Var);
                        Flowable flowableT3 = flowable5.J(new nh61(iu5Var, (byte) 8)).T(oh61Var26.m.c(4).v());
                        flowableT3.getClass();
                        return new ObservableFromPublisher(flowableT3);
                    case 26:
                        pr5 pr5Var = (pr5) obj;
                        oh61 oh61Var27 = ((hv5) ifl1Var2.b).a;
                        int i27 = AppProtocolRemoteService.f1;
                        cr5 cr5Var2 = oh61Var27.o.c;
                        return Single.create(new u2i0(oh61Var27, pr5Var, cr5Var2.l, cr5Var2.k, true)).toObservable().startWith(oh61Var27.m.b(4, pr5Var).w());
                    case 27:
                        oh61 oh61Var28 = ((hv5) ifl1Var2.b).a;
                        int i28 = AppProtocolRemoteService.f1;
                        return oh61Var28.h.T(oh61Var28.m.c(4).v()).z().toObservable().map(new nh61((byte) 0));
                    case 28:
                        oh61 oh61Var29 = ((hv5) ifl1Var2.b).a;
                        int i29 = AppProtocolRemoteService.f1;
                        return oh61Var29.f();
                    default:
                        ct5 ct5Var = (ct5) obj;
                        oh61 oh61Var30 = ((hv5) ifl1Var2.b).a;
                        int i30 = AppProtocolRemoteService.f1;
                        if (ct5Var != null) {
                            str = ct5Var.b;
                            if ("default".equals(str)) {
                                if ("car".equals(oh61Var30.z.f)) {
                                    str = "default-cars";
                                } else {
                                    str = "default";
                                }
                            }
                        } else if ("car".equals(oh61Var30.z.f)) {
                            str = "default-cars";
                        } else {
                            str = "default";
                        }
                        Observable observableJust = (oh61Var30.o.c.e.equals("com.google.android.apps.maps") && str.equals("default")) ? Observable.just(new yr5(0, 0, 0, z6x.a)) : null;
                        if (observableJust != null) {
                            return observableJust;
                        }
                        oh61Var30.y = str;
                        Bundle bundleG = cy30.g("_type", str);
                        String str7 = oh61Var30.f31p;
                        hlr0 hlr0Var2 = new hlr0();
                        UbiSpecificationId ubiSpecificationId2 = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var3 = oh61Var30.o.c;
                        String str8 = cr5Var3.e;
                        String str9 = cr5Var3.d;
                        m210 m210Var3 = oh61Var30.z;
                        if (m210Var3 == null) {
                            m210Var3 = oh61.D;
                        }
                        return oh61Var30.u.c(new r9c(str, str7, str8, str9, m210Var3, true, true, false, false, hlr0Var2, 2, 1, ubiSpecificationId2, (String) null, false, false, false), bundleG).map(new nh61((byte) 7)).toObservable().startWith(oh61Var30.m.c(8).w()).doOnSubscribe(new fv5(oh61Var30, (byte) 19));
                }
            }
        }));
        final byte b23 = 15;
        gv5Var2.accept(new v5y(wq5.class, "com.spotify.toggle_shuffle", 1, new w5y() { // from class: p.e2s
            /* JADX WARN: Code duplicated, block: B:11:0x0044  */
            /* JADX WARN: Code duplicated, block: B:12:0x0047  */
            /* JADX WARN: Code duplicated, block: B:9:0x0038  */
            @Override // p.w5y
            public final Observable a(Object obj) {
                String str;
                byte b110 = b23;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                wq5 wq5Var = cv5.a;
                final byte b111 = 0;
                final byte b112 = 1;
                ifl1 ifl1Var2 = ifl1Var;
                switch (b110) {
                    case 0:
                        oh61 oh61Var = ((hv5) ifl1Var2.b).a;
                        int i = AppProtocolRemoteService.f1;
                        g510 g510Var = oh61Var.k;
                        m210 m210Var = oh61Var.z;
                        String strP = g510Var.p();
                        if (strP == null) {
                            strP = "";
                        }
                        return g510.q(g510Var, m210Var, g510Var.h.j(strP)).flatMapCompletable(new mh61(oh61Var, (byte) 7)).d(oh61Var.c.b().a().takeUntil(new nh61((byte) 4)).flatMap(new nh61((byte) 5)).timeout(25L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new nh61((byte) 6)));
                    case 1:
                        oh61 oh61Var2 = ((hv5) ifl1Var2.b).a;
                        int i2 = AppProtocolRemoteService.f1;
                        return oh61Var2.h((pu5) obj);
                    case 2:
                        oh61 oh61Var3 = ((hv5) ifl1Var2.b).a;
                        int i3 = AppProtocolRemoteService.f1;
                        return oh61Var3.e.b("type").startWith(new CompletableFromAction(new w43(oh61Var3.m, (byte) 6)).w()).map(new f341((byte) 17)).onErrorResumeNext(new f341((byte) 29));
                    case 3:
                        oh61 oh61Var4 = ((hv5) ifl1Var2.b).a;
                        int i4 = AppProtocolRemoteService.f1;
                        return oh61Var4.i((vu5) obj);
                    case 4:
                        su5 su5Var = (su5) obj;
                        oh61 oh61Var5 = ((hv5) ifl1Var2.b).a;
                        int i5 = AppProtocolRemoteService.f1;
                        return Single.create(new jf11((Object) su5Var, (byte) 18)).flatMap(new h341(oh61Var5, su5Var, (byte) 9)).toObservable().startWith(oh61Var5.m.c(2).w());
                    case 5:
                        final ks5 ks5Var = (ks5) obj;
                        final oh61 oh61Var6 = ((hv5) ifl1Var2.b).a;
                        int i6 = AppProtocolRemoteService.f1;
                        return oh61Var6.k.l(ks5Var.b.longValue(), oh61Var6.z).map(new f341((byte) 23)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b113 = b111;
                                ks5 ks5Var3 = ks5Var;
                                oh61 oh61Var8 = oh61Var6;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b113) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek in song", (byte) 18)).toObservable().startWith(oh61Var6.m.c(1).w());
                    case 6:
                        final ks5 ks5Var2 = (ks5) obj;
                        final oh61 oh61Var7 = ((hv5) ifl1Var2.b).a;
                        int i7 = AppProtocolRemoteService.f1;
                        return oh61Var7.k.k(ks5Var2.b.longValue(), oh61Var7.z).map(new f341((byte) 28)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b113 = b112;
                                ks5 ks5Var3 = ks5Var2;
                                oh61 oh61Var8 = oh61Var7;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b113) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek by in a song", (byte) 18)).toObservable().startWith(oh61Var7.m.c(1).w());
                    case 7:
                        oh61 oh61Var8 = ((hv5) ifl1Var2.b).a;
                        int i8 = AppProtocolRemoteService.f1;
                        dbm dbmVar = oh61Var8.m;
                        Flowable flowable = oh61Var8.h;
                        g510 g510Var2 = oh61Var8.k;
                        Integer num = ((ns5) obj).b;
                        int iIntValue = num.intValue();
                        if (iIntValue == 0) {
                            Flowable flowableT = flowable.T(dbmVar.c(1).v()).T(g510Var2.d(oh61Var8.z).map(new nh61((byte) 19)).flatMapCompletable(new mh61(oh61Var8, (byte) 10)).v());
                            nh61 nh61Var = new nh61((byte) 20);
                            flowableT.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT, nh61Var).x(new nh61((byte) 21)).J(new nh61((byte) 22)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 23));
                        }
                        if (iIntValue == 1) {
                            Flowable flowableT2 = flowable.T(dbmVar.c(1).v()).T(g510Var2.j(oh61Var8.z).map(new nh61((byte) 13)).flatMapCompletable(new mh61(oh61Var8, (byte) 9)).v());
                            nh61 nh61Var2 = new nh61((byte) 14);
                            flowableT2.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT2, nh61Var2).x(new nh61((byte) 16)).J(new nh61((byte) 17)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 18));
                        }
                        if (iIntValue == 50 || iIntValue == 80 || iIntValue == 100 || iIntValue == 120 || iIntValue == 150 || iIntValue == 200 || iIntValue == 300) {
                            return oh61Var8.j(num.intValue());
                        }
                        return IapException.a("Unexpected playback speed " + num);
                    case 8:
                        oh61 oh61Var9 = ((hv5) ifl1Var2.b).a;
                        int i9 = AppProtocolRemoteService.f1;
                        return oh61Var9.j((int) (((ot5) obj).b.floatValue() * 100.0f));
                    case 9:
                        oh61 oh61Var10 = ((hv5) ifl1Var2.b).a;
                        int i10 = AppProtocolRemoteService.f1;
                        return oh61Var10.k((zs5) obj);
                    case 10:
                        oh61 oh61Var11 = ((hv5) ifl1Var2.b).a;
                        int i11 = AppProtocolRemoteService.f1;
                        Flowable flowable2 = oh61Var11.f;
                        return Observable.combineLatest(x0d.j(flowable2, flowable2).startWith(new CompletableFromAction(new ok70(oh61Var11.m, 4)).w()), yoi1.i(oh61Var11.g.a(o6n.a), o6x.a).startWithItem(Boolean.FALSE).distinctUntilChanged(), new mh61(oh61Var11, (byte) 3));
                    case 11:
                        oh61 oh61Var12 = ((hv5) ifl1Var2.b).a;
                        int i12 = AppProtocolRemoteService.f1;
                        Flowable flowable3 = oh61Var12.h;
                        ObservableFromPublisher observableFromPublisherJ = x0d.j(flowable3, flowable3);
                        ys5 ys5Var = zs5.Companion;
                        Objects.requireNonNull(ys5Var);
                        return observableFromPublisherJ.map(new nh61(ys5Var, (byte) 15)).flatMap(new mh61(oh61Var12, (byte) 11));
                    case 12:
                        ft5 ft5Var = (ft5) obj;
                        oh61 oh61Var13 = ((hv5) ifl1Var2.b).a;
                        int i13 = AppProtocolRemoteService.f1;
                        return oh61Var13.h.T(oh61Var13.m.c(1).v()).z().flatMapCompletable(new h341(oh61Var13, ft5Var, (byte) 6)).d(Observable.just(wq5Var)).startWith(oh61Var13.k.c(oh61Var13.z, ft5Var.d.booleanValue()).ignoreElement().w());
                    case 13:
                        mq5 mq5Var = (mq5) obj;
                        oh61 oh61Var14 = ((hv5) ifl1Var2.b).a;
                        int i14 = AppProtocolRemoteService.f1;
                        Integer num2 = mq5Var.c;
                        int iIntValue2 = num2 == null ? 20 : num2.intValue();
                        String str2 = mq5Var.b;
                        if (str2.equals("spotify:recently-played")) {
                            str2 = "com.spotify.recently-played";
                        } else if (str2.equals("spotify:browse")) {
                            str2 = "com.spotify.browse";
                        }
                        String str3 = str2;
                        c610 c610Var = oh61Var14.u;
                        hlr0 hlr0Var = new hlr0();
                        UbiSpecificationId ubiSpecificationId = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var = oh61Var14.o.c;
                        String str4 = cr5Var.e;
                        String str5 = cr5Var.d;
                        String str6 = oh61Var14.y;
                        m210 m210Var2 = oh61Var14.z;
                        if (m210Var2 == null) {
                            m210Var2 = oh61.D;
                        }
                        return c610Var.c(new r9c(str6, str3, str4, str5, m210Var2, false, true, false, false, hlr0Var, 2, 1, ubiSpecificationId, (String) null, false, false, false), new Bundle()).map(new mp5(mq5Var, iIntValue2, (byte) 8)).doOnError(new fv5(str3, (byte) 21)).toObservable().doOnSubscribe(new po5(oh61Var14, mq5Var, (byte) 5)).startWith(oh61Var14.m.c(8).w());
                    case 14:
                        oh61 oh61Var15 = ((hv5) ifl1Var2.b).a;
                        int i15 = AppProtocolRemoteService.f1;
                        return oh61Var15.l((rt5) obj);
                    case 15:
                        oh61 oh61Var16 = ((hv5) ifl1Var2.b).a;
                        int i16 = AppProtocolRemoteService.f1;
                        Flowable flowable4 = oh61Var16.h;
                        return x0d.j(flowable4, flowable4).map(new nh61((byte) 1)).flatMap(new mh61(oh61Var16, (byte) 4));
                    case 16:
                        oh61 oh61Var17 = ((hv5) ifl1Var2.b).a;
                        int i17 = AppProtocolRemoteService.f1;
                        return oh61Var17.k.n(oh61Var17.z).map(new nh61((byte) 2)).flatMap(new mh61(oh61Var17, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var17.m.c(1).w());
                    case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                        oh61 oh61Var18 = ((hv5) ifl1Var2.b).a;
                        int i18 = AppProtocolRemoteService.f1;
                        return oh61Var18.k.o(oh61Var18.z).map(new f341((byte) 21)).zipWith(oh61Var18.h.z(), new f341((byte) 22)).flatMap(new h341(oh61Var18, (ut5) obj, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var18.m.c(1).w());
                    case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                        jr5 jr5Var = (jr5) obj;
                        oh61 oh61Var19 = ((hv5) ifl1Var2.b).a;
                        int i19 = AppProtocolRemoteService.f1;
                        return Observable.just(jr5Var).startWith(oh61Var19.m.c(1).w()).switchMap(new mh61(oh61Var19, (byte) 1)).flatMapSingle(new mh61(oh61Var19, (byte) 2)).filter(new f341((byte) 24)).map(new f341((byte) 25)).flatMap(new h341(oh61Var19, jr5Var, (byte) 7)).timeout(15L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new f341((byte) 26));
                    case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                        pu5 pu5Var = (pu5) obj;
                        oh61 oh61Var20 = ((hv5) ifl1Var2.b).a;
                        int i20 = AppProtocolRemoteService.f1;
                        Observable observable = oh61Var20.h.T(oh61Var20.m.c(2).v()).z().toObservable();
                        g510 g510Var3 = oh61Var20.k;
                        return observable.startWith(g510.q(g510Var3, oh61Var20.z, g510Var3.h.e(pu5Var.b)).ignoreElement().w()).map(new h341(oh61Var20, pu5Var, (byte) 8));
                    case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                        oh61 oh61Var21 = ((hv5) ifl1Var2.b).a;
                        int i21 = AppProtocolRemoteService.f1;
                        return oh61Var21.c.a.k.b().map(new nh61((byte) 9));
                    case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                        oh61 oh61Var22 = ((hv5) ifl1Var2.b).a;
                        int i22 = AppProtocolRemoteService.f1;
                        return oh61Var22.m.c(4).d(Observable.just(new ws5()));
                    case 22:
                        oh61 oh61Var23 = ((hv5) ifl1Var2.b).a;
                        int i23 = AppProtocolRemoteService.f1;
                        return oh61Var23.i((vu5) obj);
                    case 23:
                        oh61 oh61Var24 = ((hv5) ifl1Var2.b).a;
                        int i24 = AppProtocolRemoteService.f1;
                        return oh61Var24.l.a(((sr5) obj).b.intValue(), oh61Var24.z).q(oh61Var24.m.c(1)).d(Observable.just(wq5Var));
                    case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                        oh61 oh61Var25 = ((hv5) ifl1Var2.b).a;
                        int i25 = AppProtocolRemoteService.f1;
                        return new poj0(oh61Var25.c, oh61Var25.j, oh61Var25.h, oh61Var25.n, (byte) 10).r(oh61Var25.a.getResources()).startWith(oh61Var25.m.c(4).w()).firstOrError().toObservable().map(new f341((byte) 27));
                    case 25:
                        oh61 oh61Var26 = ((hv5) ifl1Var2.b).a;
                        int i26 = AppProtocolRemoteService.f1;
                        Flowable flowable5 = oh61Var26.h;
                        iu5 iu5Var = ju5.Companion;
                        Objects.requireNonNull(iu5Var);
                        Flowable flowableT3 = flowable5.J(new nh61(iu5Var, (byte) 8)).T(oh61Var26.m.c(4).v());
                        flowableT3.getClass();
                        return new ObservableFromPublisher(flowableT3);
                    case 26:
                        pr5 pr5Var = (pr5) obj;
                        oh61 oh61Var27 = ((hv5) ifl1Var2.b).a;
                        int i27 = AppProtocolRemoteService.f1;
                        cr5 cr5Var2 = oh61Var27.o.c;
                        return Single.create(new u2i0(oh61Var27, pr5Var, cr5Var2.l, cr5Var2.k, true)).toObservable().startWith(oh61Var27.m.b(4, pr5Var).w());
                    case 27:
                        oh61 oh61Var28 = ((hv5) ifl1Var2.b).a;
                        int i28 = AppProtocolRemoteService.f1;
                        return oh61Var28.h.T(oh61Var28.m.c(4).v()).z().toObservable().map(new nh61((byte) 0));
                    case 28:
                        oh61 oh61Var29 = ((hv5) ifl1Var2.b).a;
                        int i29 = AppProtocolRemoteService.f1;
                        return oh61Var29.f();
                    default:
                        ct5 ct5Var = (ct5) obj;
                        oh61 oh61Var30 = ((hv5) ifl1Var2.b).a;
                        int i30 = AppProtocolRemoteService.f1;
                        if (ct5Var != null) {
                            str = ct5Var.b;
                            if ("default".equals(str)) {
                                if ("car".equals(oh61Var30.z.f)) {
                                    str = "default-cars";
                                } else {
                                    str = "default";
                                }
                            }
                        } else if ("car".equals(oh61Var30.z.f)) {
                            str = "default-cars";
                        } else {
                            str = "default";
                        }
                        Observable observableJust = (oh61Var30.o.c.e.equals("com.google.android.apps.maps") && str.equals("default")) ? Observable.just(new yr5(0, 0, 0, z6x.a)) : null;
                        if (observableJust != null) {
                            return observableJust;
                        }
                        oh61Var30.y = str;
                        Bundle bundleG = cy30.g("_type", str);
                        String str7 = oh61Var30.f31p;
                        hlr0 hlr0Var2 = new hlr0();
                        UbiSpecificationId ubiSpecificationId2 = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var3 = oh61Var30.o.c;
                        String str8 = cr5Var3.e;
                        String str9 = cr5Var3.d;
                        m210 m210Var3 = oh61Var30.z;
                        if (m210Var3 == null) {
                            m210Var3 = oh61.D;
                        }
                        return oh61Var30.u.c(new r9c(str, str7, str8, str9, m210Var3, true, true, false, false, hlr0Var2, 2, 1, ubiSpecificationId2, (String) null, false, false, false), bundleG).map(new nh61((byte) 7)).toObservable().startWith(oh61Var30.m.c(8).w()).doOnSubscribe(new fv5(oh61Var30, (byte) 19));
                }
            }
        }));
        final byte b24 = 16;
        gv5Var2.accept(new v5y(wq5.class, "com.spotify.skip_next", 1, new w5y() { // from class: p.e2s
            /* JADX WARN: Code duplicated, block: B:11:0x0044  */
            /* JADX WARN: Code duplicated, block: B:12:0x0047  */
            /* JADX WARN: Code duplicated, block: B:9:0x0038  */
            @Override // p.w5y
            public final Observable a(Object obj) {
                String str;
                byte b110 = b24;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                wq5 wq5Var = cv5.a;
                final byte b111 = 0;
                final byte b112 = 1;
                ifl1 ifl1Var2 = ifl1Var;
                switch (b110) {
                    case 0:
                        oh61 oh61Var = ((hv5) ifl1Var2.b).a;
                        int i = AppProtocolRemoteService.f1;
                        g510 g510Var = oh61Var.k;
                        m210 m210Var = oh61Var.z;
                        String strP = g510Var.p();
                        if (strP == null) {
                            strP = "";
                        }
                        return g510.q(g510Var, m210Var, g510Var.h.j(strP)).flatMapCompletable(new mh61(oh61Var, (byte) 7)).d(oh61Var.c.b().a().takeUntil(new nh61((byte) 4)).flatMap(new nh61((byte) 5)).timeout(25L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new nh61((byte) 6)));
                    case 1:
                        oh61 oh61Var2 = ((hv5) ifl1Var2.b).a;
                        int i2 = AppProtocolRemoteService.f1;
                        return oh61Var2.h((pu5) obj);
                    case 2:
                        oh61 oh61Var3 = ((hv5) ifl1Var2.b).a;
                        int i3 = AppProtocolRemoteService.f1;
                        return oh61Var3.e.b("type").startWith(new CompletableFromAction(new w43(oh61Var3.m, (byte) 6)).w()).map(new f341((byte) 17)).onErrorResumeNext(new f341((byte) 29));
                    case 3:
                        oh61 oh61Var4 = ((hv5) ifl1Var2.b).a;
                        int i4 = AppProtocolRemoteService.f1;
                        return oh61Var4.i((vu5) obj);
                    case 4:
                        su5 su5Var = (su5) obj;
                        oh61 oh61Var5 = ((hv5) ifl1Var2.b).a;
                        int i5 = AppProtocolRemoteService.f1;
                        return Single.create(new jf11((Object) su5Var, (byte) 18)).flatMap(new h341(oh61Var5, su5Var, (byte) 9)).toObservable().startWith(oh61Var5.m.c(2).w());
                    case 5:
                        final ks5 ks5Var = (ks5) obj;
                        final oh61 oh61Var6 = ((hv5) ifl1Var2.b).a;
                        int i6 = AppProtocolRemoteService.f1;
                        return oh61Var6.k.l(ks5Var.b.longValue(), oh61Var6.z).map(new f341((byte) 23)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b113 = b111;
                                ks5 ks5Var3 = ks5Var;
                                oh61 oh61Var8 = oh61Var6;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b113) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek in song", (byte) 18)).toObservable().startWith(oh61Var6.m.c(1).w());
                    case 6:
                        final ks5 ks5Var2 = (ks5) obj;
                        final oh61 oh61Var7 = ((hv5) ifl1Var2.b).a;
                        int i7 = AppProtocolRemoteService.f1;
                        return oh61Var7.k.k(ks5Var2.b.longValue(), oh61Var7.z).map(new f341((byte) 28)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b113 = b112;
                                ks5 ks5Var3 = ks5Var2;
                                oh61 oh61Var8 = oh61Var7;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b113) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek by in a song", (byte) 18)).toObservable().startWith(oh61Var7.m.c(1).w());
                    case 7:
                        oh61 oh61Var8 = ((hv5) ifl1Var2.b).a;
                        int i8 = AppProtocolRemoteService.f1;
                        dbm dbmVar = oh61Var8.m;
                        Flowable flowable = oh61Var8.h;
                        g510 g510Var2 = oh61Var8.k;
                        Integer num = ((ns5) obj).b;
                        int iIntValue = num.intValue();
                        if (iIntValue == 0) {
                            Flowable flowableT = flowable.T(dbmVar.c(1).v()).T(g510Var2.d(oh61Var8.z).map(new nh61((byte) 19)).flatMapCompletable(new mh61(oh61Var8, (byte) 10)).v());
                            nh61 nh61Var = new nh61((byte) 20);
                            flowableT.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT, nh61Var).x(new nh61((byte) 21)).J(new nh61((byte) 22)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 23));
                        }
                        if (iIntValue == 1) {
                            Flowable flowableT2 = flowable.T(dbmVar.c(1).v()).T(g510Var2.j(oh61Var8.z).map(new nh61((byte) 13)).flatMapCompletable(new mh61(oh61Var8, (byte) 9)).v());
                            nh61 nh61Var2 = new nh61((byte) 14);
                            flowableT2.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT2, nh61Var2).x(new nh61((byte) 16)).J(new nh61((byte) 17)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 18));
                        }
                        if (iIntValue == 50 || iIntValue == 80 || iIntValue == 100 || iIntValue == 120 || iIntValue == 150 || iIntValue == 200 || iIntValue == 300) {
                            return oh61Var8.j(num.intValue());
                        }
                        return IapException.a("Unexpected playback speed " + num);
                    case 8:
                        oh61 oh61Var9 = ((hv5) ifl1Var2.b).a;
                        int i9 = AppProtocolRemoteService.f1;
                        return oh61Var9.j((int) (((ot5) obj).b.floatValue() * 100.0f));
                    case 9:
                        oh61 oh61Var10 = ((hv5) ifl1Var2.b).a;
                        int i10 = AppProtocolRemoteService.f1;
                        return oh61Var10.k((zs5) obj);
                    case 10:
                        oh61 oh61Var11 = ((hv5) ifl1Var2.b).a;
                        int i11 = AppProtocolRemoteService.f1;
                        Flowable flowable2 = oh61Var11.f;
                        return Observable.combineLatest(x0d.j(flowable2, flowable2).startWith(new CompletableFromAction(new ok70(oh61Var11.m, 4)).w()), yoi1.i(oh61Var11.g.a(o6n.a), o6x.a).startWithItem(Boolean.FALSE).distinctUntilChanged(), new mh61(oh61Var11, (byte) 3));
                    case 11:
                        oh61 oh61Var12 = ((hv5) ifl1Var2.b).a;
                        int i12 = AppProtocolRemoteService.f1;
                        Flowable flowable3 = oh61Var12.h;
                        ObservableFromPublisher observableFromPublisherJ = x0d.j(flowable3, flowable3);
                        ys5 ys5Var = zs5.Companion;
                        Objects.requireNonNull(ys5Var);
                        return observableFromPublisherJ.map(new nh61(ys5Var, (byte) 15)).flatMap(new mh61(oh61Var12, (byte) 11));
                    case 12:
                        ft5 ft5Var = (ft5) obj;
                        oh61 oh61Var13 = ((hv5) ifl1Var2.b).a;
                        int i13 = AppProtocolRemoteService.f1;
                        return oh61Var13.h.T(oh61Var13.m.c(1).v()).z().flatMapCompletable(new h341(oh61Var13, ft5Var, (byte) 6)).d(Observable.just(wq5Var)).startWith(oh61Var13.k.c(oh61Var13.z, ft5Var.d.booleanValue()).ignoreElement().w());
                    case 13:
                        mq5 mq5Var = (mq5) obj;
                        oh61 oh61Var14 = ((hv5) ifl1Var2.b).a;
                        int i14 = AppProtocolRemoteService.f1;
                        Integer num2 = mq5Var.c;
                        int iIntValue2 = num2 == null ? 20 : num2.intValue();
                        String str2 = mq5Var.b;
                        if (str2.equals("spotify:recently-played")) {
                            str2 = "com.spotify.recently-played";
                        } else if (str2.equals("spotify:browse")) {
                            str2 = "com.spotify.browse";
                        }
                        String str3 = str2;
                        c610 c610Var = oh61Var14.u;
                        hlr0 hlr0Var = new hlr0();
                        UbiSpecificationId ubiSpecificationId = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var = oh61Var14.o.c;
                        String str4 = cr5Var.e;
                        String str5 = cr5Var.d;
                        String str6 = oh61Var14.y;
                        m210 m210Var2 = oh61Var14.z;
                        if (m210Var2 == null) {
                            m210Var2 = oh61.D;
                        }
                        return c610Var.c(new r9c(str6, str3, str4, str5, m210Var2, false, true, false, false, hlr0Var, 2, 1, ubiSpecificationId, (String) null, false, false, false), new Bundle()).map(new mp5(mq5Var, iIntValue2, (byte) 8)).doOnError(new fv5(str3, (byte) 21)).toObservable().doOnSubscribe(new po5(oh61Var14, mq5Var, (byte) 5)).startWith(oh61Var14.m.c(8).w());
                    case 14:
                        oh61 oh61Var15 = ((hv5) ifl1Var2.b).a;
                        int i15 = AppProtocolRemoteService.f1;
                        return oh61Var15.l((rt5) obj);
                    case 15:
                        oh61 oh61Var16 = ((hv5) ifl1Var2.b).a;
                        int i16 = AppProtocolRemoteService.f1;
                        Flowable flowable4 = oh61Var16.h;
                        return x0d.j(flowable4, flowable4).map(new nh61((byte) 1)).flatMap(new mh61(oh61Var16, (byte) 4));
                    case 16:
                        oh61 oh61Var17 = ((hv5) ifl1Var2.b).a;
                        int i17 = AppProtocolRemoteService.f1;
                        return oh61Var17.k.n(oh61Var17.z).map(new nh61((byte) 2)).flatMap(new mh61(oh61Var17, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var17.m.c(1).w());
                    case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                        oh61 oh61Var18 = ((hv5) ifl1Var2.b).a;
                        int i18 = AppProtocolRemoteService.f1;
                        return oh61Var18.k.o(oh61Var18.z).map(new f341((byte) 21)).zipWith(oh61Var18.h.z(), new f341((byte) 22)).flatMap(new h341(oh61Var18, (ut5) obj, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var18.m.c(1).w());
                    case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                        jr5 jr5Var = (jr5) obj;
                        oh61 oh61Var19 = ((hv5) ifl1Var2.b).a;
                        int i19 = AppProtocolRemoteService.f1;
                        return Observable.just(jr5Var).startWith(oh61Var19.m.c(1).w()).switchMap(new mh61(oh61Var19, (byte) 1)).flatMapSingle(new mh61(oh61Var19, (byte) 2)).filter(new f341((byte) 24)).map(new f341((byte) 25)).flatMap(new h341(oh61Var19, jr5Var, (byte) 7)).timeout(15L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new f341((byte) 26));
                    case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                        pu5 pu5Var = (pu5) obj;
                        oh61 oh61Var20 = ((hv5) ifl1Var2.b).a;
                        int i20 = AppProtocolRemoteService.f1;
                        Observable observable = oh61Var20.h.T(oh61Var20.m.c(2).v()).z().toObservable();
                        g510 g510Var3 = oh61Var20.k;
                        return observable.startWith(g510.q(g510Var3, oh61Var20.z, g510Var3.h.e(pu5Var.b)).ignoreElement().w()).map(new h341(oh61Var20, pu5Var, (byte) 8));
                    case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                        oh61 oh61Var21 = ((hv5) ifl1Var2.b).a;
                        int i21 = AppProtocolRemoteService.f1;
                        return oh61Var21.c.a.k.b().map(new nh61((byte) 9));
                    case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                        oh61 oh61Var22 = ((hv5) ifl1Var2.b).a;
                        int i22 = AppProtocolRemoteService.f1;
                        return oh61Var22.m.c(4).d(Observable.just(new ws5()));
                    case 22:
                        oh61 oh61Var23 = ((hv5) ifl1Var2.b).a;
                        int i23 = AppProtocolRemoteService.f1;
                        return oh61Var23.i((vu5) obj);
                    case 23:
                        oh61 oh61Var24 = ((hv5) ifl1Var2.b).a;
                        int i24 = AppProtocolRemoteService.f1;
                        return oh61Var24.l.a(((sr5) obj).b.intValue(), oh61Var24.z).q(oh61Var24.m.c(1)).d(Observable.just(wq5Var));
                    case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                        oh61 oh61Var25 = ((hv5) ifl1Var2.b).a;
                        int i25 = AppProtocolRemoteService.f1;
                        return new poj0(oh61Var25.c, oh61Var25.j, oh61Var25.h, oh61Var25.n, (byte) 10).r(oh61Var25.a.getResources()).startWith(oh61Var25.m.c(4).w()).firstOrError().toObservable().map(new f341((byte) 27));
                    case 25:
                        oh61 oh61Var26 = ((hv5) ifl1Var2.b).a;
                        int i26 = AppProtocolRemoteService.f1;
                        Flowable flowable5 = oh61Var26.h;
                        iu5 iu5Var = ju5.Companion;
                        Objects.requireNonNull(iu5Var);
                        Flowable flowableT3 = flowable5.J(new nh61(iu5Var, (byte) 8)).T(oh61Var26.m.c(4).v());
                        flowableT3.getClass();
                        return new ObservableFromPublisher(flowableT3);
                    case 26:
                        pr5 pr5Var = (pr5) obj;
                        oh61 oh61Var27 = ((hv5) ifl1Var2.b).a;
                        int i27 = AppProtocolRemoteService.f1;
                        cr5 cr5Var2 = oh61Var27.o.c;
                        return Single.create(new u2i0(oh61Var27, pr5Var, cr5Var2.l, cr5Var2.k, true)).toObservable().startWith(oh61Var27.m.b(4, pr5Var).w());
                    case 27:
                        oh61 oh61Var28 = ((hv5) ifl1Var2.b).a;
                        int i28 = AppProtocolRemoteService.f1;
                        return oh61Var28.h.T(oh61Var28.m.c(4).v()).z().toObservable().map(new nh61((byte) 0));
                    case 28:
                        oh61 oh61Var29 = ((hv5) ifl1Var2.b).a;
                        int i29 = AppProtocolRemoteService.f1;
                        return oh61Var29.f();
                    default:
                        ct5 ct5Var = (ct5) obj;
                        oh61 oh61Var30 = ((hv5) ifl1Var2.b).a;
                        int i30 = AppProtocolRemoteService.f1;
                        if (ct5Var != null) {
                            str = ct5Var.b;
                            if ("default".equals(str)) {
                                if ("car".equals(oh61Var30.z.f)) {
                                    str = "default-cars";
                                } else {
                                    str = "default";
                                }
                            }
                        } else if ("car".equals(oh61Var30.z.f)) {
                            str = "default-cars";
                        } else {
                            str = "default";
                        }
                        Observable observableJust = (oh61Var30.o.c.e.equals("com.google.android.apps.maps") && str.equals("default")) ? Observable.just(new yr5(0, 0, 0, z6x.a)) : null;
                        if (observableJust != null) {
                            return observableJust;
                        }
                        oh61Var30.y = str;
                        Bundle bundleG = cy30.g("_type", str);
                        String str7 = oh61Var30.f31p;
                        hlr0 hlr0Var2 = new hlr0();
                        UbiSpecificationId ubiSpecificationId2 = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var3 = oh61Var30.o.c;
                        String str8 = cr5Var3.e;
                        String str9 = cr5Var3.d;
                        m210 m210Var3 = oh61Var30.z;
                        if (m210Var3 == null) {
                            m210Var3 = oh61.D;
                        }
                        return oh61Var30.u.c(new r9c(str, str7, str8, str9, m210Var3, true, true, false, false, hlr0Var2, 2, 1, ubiSpecificationId2, (String) null, false, false, false), bundleG).map(new nh61((byte) 7)).toObservable().startWith(oh61Var30.m.c(8).w()).doOnSubscribe(new fv5(oh61Var30, (byte) 19));
                }
            }
        }));
        final byte b25 = 17;
        gv5Var2.accept(new v5y(ut5.class, "com.spotify.skip_previous", 1, new w5y() { // from class: p.e2s
            /* JADX WARN: Code duplicated, block: B:11:0x0044  */
            /* JADX WARN: Code duplicated, block: B:12:0x0047  */
            /* JADX WARN: Code duplicated, block: B:9:0x0038  */
            @Override // p.w5y
            public final Observable a(Object obj) {
                String str;
                byte b110 = b25;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                wq5 wq5Var = cv5.a;
                final byte b111 = 0;
                final byte b112 = 1;
                ifl1 ifl1Var2 = ifl1Var;
                switch (b110) {
                    case 0:
                        oh61 oh61Var = ((hv5) ifl1Var2.b).a;
                        int i = AppProtocolRemoteService.f1;
                        g510 g510Var = oh61Var.k;
                        m210 m210Var = oh61Var.z;
                        String strP = g510Var.p();
                        if (strP == null) {
                            strP = "";
                        }
                        return g510.q(g510Var, m210Var, g510Var.h.j(strP)).flatMapCompletable(new mh61(oh61Var, (byte) 7)).d(oh61Var.c.b().a().takeUntil(new nh61((byte) 4)).flatMap(new nh61((byte) 5)).timeout(25L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new nh61((byte) 6)));
                    case 1:
                        oh61 oh61Var2 = ((hv5) ifl1Var2.b).a;
                        int i2 = AppProtocolRemoteService.f1;
                        return oh61Var2.h((pu5) obj);
                    case 2:
                        oh61 oh61Var3 = ((hv5) ifl1Var2.b).a;
                        int i3 = AppProtocolRemoteService.f1;
                        return oh61Var3.e.b("type").startWith(new CompletableFromAction(new w43(oh61Var3.m, (byte) 6)).w()).map(new f341((byte) 17)).onErrorResumeNext(new f341((byte) 29));
                    case 3:
                        oh61 oh61Var4 = ((hv5) ifl1Var2.b).a;
                        int i4 = AppProtocolRemoteService.f1;
                        return oh61Var4.i((vu5) obj);
                    case 4:
                        su5 su5Var = (su5) obj;
                        oh61 oh61Var5 = ((hv5) ifl1Var2.b).a;
                        int i5 = AppProtocolRemoteService.f1;
                        return Single.create(new jf11((Object) su5Var, (byte) 18)).flatMap(new h341(oh61Var5, su5Var, (byte) 9)).toObservable().startWith(oh61Var5.m.c(2).w());
                    case 5:
                        final ks5 ks5Var = (ks5) obj;
                        final oh61 oh61Var6 = ((hv5) ifl1Var2.b).a;
                        int i6 = AppProtocolRemoteService.f1;
                        return oh61Var6.k.l(ks5Var.b.longValue(), oh61Var6.z).map(new f341((byte) 23)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b113 = b111;
                                ks5 ks5Var3 = ks5Var;
                                oh61 oh61Var8 = oh61Var6;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b113) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek in song", (byte) 18)).toObservable().startWith(oh61Var6.m.c(1).w());
                    case 6:
                        final ks5 ks5Var2 = (ks5) obj;
                        final oh61 oh61Var7 = ((hv5) ifl1Var2.b).a;
                        int i7 = AppProtocolRemoteService.f1;
                        return oh61Var7.k.k(ks5Var2.b.longValue(), oh61Var7.z).map(new f341((byte) 28)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b113 = b112;
                                ks5 ks5Var3 = ks5Var2;
                                oh61 oh61Var8 = oh61Var7;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b113) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek by in a song", (byte) 18)).toObservable().startWith(oh61Var7.m.c(1).w());
                    case 7:
                        oh61 oh61Var8 = ((hv5) ifl1Var2.b).a;
                        int i8 = AppProtocolRemoteService.f1;
                        dbm dbmVar = oh61Var8.m;
                        Flowable flowable = oh61Var8.h;
                        g510 g510Var2 = oh61Var8.k;
                        Integer num = ((ns5) obj).b;
                        int iIntValue = num.intValue();
                        if (iIntValue == 0) {
                            Flowable flowableT = flowable.T(dbmVar.c(1).v()).T(g510Var2.d(oh61Var8.z).map(new nh61((byte) 19)).flatMapCompletable(new mh61(oh61Var8, (byte) 10)).v());
                            nh61 nh61Var = new nh61((byte) 20);
                            flowableT.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT, nh61Var).x(new nh61((byte) 21)).J(new nh61((byte) 22)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 23));
                        }
                        if (iIntValue == 1) {
                            Flowable flowableT2 = flowable.T(dbmVar.c(1).v()).T(g510Var2.j(oh61Var8.z).map(new nh61((byte) 13)).flatMapCompletable(new mh61(oh61Var8, (byte) 9)).v());
                            nh61 nh61Var2 = new nh61((byte) 14);
                            flowableT2.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT2, nh61Var2).x(new nh61((byte) 16)).J(new nh61((byte) 17)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 18));
                        }
                        if (iIntValue == 50 || iIntValue == 80 || iIntValue == 100 || iIntValue == 120 || iIntValue == 150 || iIntValue == 200 || iIntValue == 300) {
                            return oh61Var8.j(num.intValue());
                        }
                        return IapException.a("Unexpected playback speed " + num);
                    case 8:
                        oh61 oh61Var9 = ((hv5) ifl1Var2.b).a;
                        int i9 = AppProtocolRemoteService.f1;
                        return oh61Var9.j((int) (((ot5) obj).b.floatValue() * 100.0f));
                    case 9:
                        oh61 oh61Var10 = ((hv5) ifl1Var2.b).a;
                        int i10 = AppProtocolRemoteService.f1;
                        return oh61Var10.k((zs5) obj);
                    case 10:
                        oh61 oh61Var11 = ((hv5) ifl1Var2.b).a;
                        int i11 = AppProtocolRemoteService.f1;
                        Flowable flowable2 = oh61Var11.f;
                        return Observable.combineLatest(x0d.j(flowable2, flowable2).startWith(new CompletableFromAction(new ok70(oh61Var11.m, 4)).w()), yoi1.i(oh61Var11.g.a(o6n.a), o6x.a).startWithItem(Boolean.FALSE).distinctUntilChanged(), new mh61(oh61Var11, (byte) 3));
                    case 11:
                        oh61 oh61Var12 = ((hv5) ifl1Var2.b).a;
                        int i12 = AppProtocolRemoteService.f1;
                        Flowable flowable3 = oh61Var12.h;
                        ObservableFromPublisher observableFromPublisherJ = x0d.j(flowable3, flowable3);
                        ys5 ys5Var = zs5.Companion;
                        Objects.requireNonNull(ys5Var);
                        return observableFromPublisherJ.map(new nh61(ys5Var, (byte) 15)).flatMap(new mh61(oh61Var12, (byte) 11));
                    case 12:
                        ft5 ft5Var = (ft5) obj;
                        oh61 oh61Var13 = ((hv5) ifl1Var2.b).a;
                        int i13 = AppProtocolRemoteService.f1;
                        return oh61Var13.h.T(oh61Var13.m.c(1).v()).z().flatMapCompletable(new h341(oh61Var13, ft5Var, (byte) 6)).d(Observable.just(wq5Var)).startWith(oh61Var13.k.c(oh61Var13.z, ft5Var.d.booleanValue()).ignoreElement().w());
                    case 13:
                        mq5 mq5Var = (mq5) obj;
                        oh61 oh61Var14 = ((hv5) ifl1Var2.b).a;
                        int i14 = AppProtocolRemoteService.f1;
                        Integer num2 = mq5Var.c;
                        int iIntValue2 = num2 == null ? 20 : num2.intValue();
                        String str2 = mq5Var.b;
                        if (str2.equals("spotify:recently-played")) {
                            str2 = "com.spotify.recently-played";
                        } else if (str2.equals("spotify:browse")) {
                            str2 = "com.spotify.browse";
                        }
                        String str3 = str2;
                        c610 c610Var = oh61Var14.u;
                        hlr0 hlr0Var = new hlr0();
                        UbiSpecificationId ubiSpecificationId = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var = oh61Var14.o.c;
                        String str4 = cr5Var.e;
                        String str5 = cr5Var.d;
                        String str6 = oh61Var14.y;
                        m210 m210Var2 = oh61Var14.z;
                        if (m210Var2 == null) {
                            m210Var2 = oh61.D;
                        }
                        return c610Var.c(new r9c(str6, str3, str4, str5, m210Var2, false, true, false, false, hlr0Var, 2, 1, ubiSpecificationId, (String) null, false, false, false), new Bundle()).map(new mp5(mq5Var, iIntValue2, (byte) 8)).doOnError(new fv5(str3, (byte) 21)).toObservable().doOnSubscribe(new po5(oh61Var14, mq5Var, (byte) 5)).startWith(oh61Var14.m.c(8).w());
                    case 14:
                        oh61 oh61Var15 = ((hv5) ifl1Var2.b).a;
                        int i15 = AppProtocolRemoteService.f1;
                        return oh61Var15.l((rt5) obj);
                    case 15:
                        oh61 oh61Var16 = ((hv5) ifl1Var2.b).a;
                        int i16 = AppProtocolRemoteService.f1;
                        Flowable flowable4 = oh61Var16.h;
                        return x0d.j(flowable4, flowable4).map(new nh61((byte) 1)).flatMap(new mh61(oh61Var16, (byte) 4));
                    case 16:
                        oh61 oh61Var17 = ((hv5) ifl1Var2.b).a;
                        int i17 = AppProtocolRemoteService.f1;
                        return oh61Var17.k.n(oh61Var17.z).map(new nh61((byte) 2)).flatMap(new mh61(oh61Var17, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var17.m.c(1).w());
                    case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                        oh61 oh61Var18 = ((hv5) ifl1Var2.b).a;
                        int i18 = AppProtocolRemoteService.f1;
                        return oh61Var18.k.o(oh61Var18.z).map(new f341((byte) 21)).zipWith(oh61Var18.h.z(), new f341((byte) 22)).flatMap(new h341(oh61Var18, (ut5) obj, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var18.m.c(1).w());
                    case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                        jr5 jr5Var = (jr5) obj;
                        oh61 oh61Var19 = ((hv5) ifl1Var2.b).a;
                        int i19 = AppProtocolRemoteService.f1;
                        return Observable.just(jr5Var).startWith(oh61Var19.m.c(1).w()).switchMap(new mh61(oh61Var19, (byte) 1)).flatMapSingle(new mh61(oh61Var19, (byte) 2)).filter(new f341((byte) 24)).map(new f341((byte) 25)).flatMap(new h341(oh61Var19, jr5Var, (byte) 7)).timeout(15L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new f341((byte) 26));
                    case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                        pu5 pu5Var = (pu5) obj;
                        oh61 oh61Var20 = ((hv5) ifl1Var2.b).a;
                        int i20 = AppProtocolRemoteService.f1;
                        Observable observable = oh61Var20.h.T(oh61Var20.m.c(2).v()).z().toObservable();
                        g510 g510Var3 = oh61Var20.k;
                        return observable.startWith(g510.q(g510Var3, oh61Var20.z, g510Var3.h.e(pu5Var.b)).ignoreElement().w()).map(new h341(oh61Var20, pu5Var, (byte) 8));
                    case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                        oh61 oh61Var21 = ((hv5) ifl1Var2.b).a;
                        int i21 = AppProtocolRemoteService.f1;
                        return oh61Var21.c.a.k.b().map(new nh61((byte) 9));
                    case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                        oh61 oh61Var22 = ((hv5) ifl1Var2.b).a;
                        int i22 = AppProtocolRemoteService.f1;
                        return oh61Var22.m.c(4).d(Observable.just(new ws5()));
                    case 22:
                        oh61 oh61Var23 = ((hv5) ifl1Var2.b).a;
                        int i23 = AppProtocolRemoteService.f1;
                        return oh61Var23.i((vu5) obj);
                    case 23:
                        oh61 oh61Var24 = ((hv5) ifl1Var2.b).a;
                        int i24 = AppProtocolRemoteService.f1;
                        return oh61Var24.l.a(((sr5) obj).b.intValue(), oh61Var24.z).q(oh61Var24.m.c(1)).d(Observable.just(wq5Var));
                    case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                        oh61 oh61Var25 = ((hv5) ifl1Var2.b).a;
                        int i25 = AppProtocolRemoteService.f1;
                        return new poj0(oh61Var25.c, oh61Var25.j, oh61Var25.h, oh61Var25.n, (byte) 10).r(oh61Var25.a.getResources()).startWith(oh61Var25.m.c(4).w()).firstOrError().toObservable().map(new f341((byte) 27));
                    case 25:
                        oh61 oh61Var26 = ((hv5) ifl1Var2.b).a;
                        int i26 = AppProtocolRemoteService.f1;
                        Flowable flowable5 = oh61Var26.h;
                        iu5 iu5Var = ju5.Companion;
                        Objects.requireNonNull(iu5Var);
                        Flowable flowableT3 = flowable5.J(new nh61(iu5Var, (byte) 8)).T(oh61Var26.m.c(4).v());
                        flowableT3.getClass();
                        return new ObservableFromPublisher(flowableT3);
                    case 26:
                        pr5 pr5Var = (pr5) obj;
                        oh61 oh61Var27 = ((hv5) ifl1Var2.b).a;
                        int i27 = AppProtocolRemoteService.f1;
                        cr5 cr5Var2 = oh61Var27.o.c;
                        return Single.create(new u2i0(oh61Var27, pr5Var, cr5Var2.l, cr5Var2.k, true)).toObservable().startWith(oh61Var27.m.b(4, pr5Var).w());
                    case 27:
                        oh61 oh61Var28 = ((hv5) ifl1Var2.b).a;
                        int i28 = AppProtocolRemoteService.f1;
                        return oh61Var28.h.T(oh61Var28.m.c(4).v()).z().toObservable().map(new nh61((byte) 0));
                    case 28:
                        oh61 oh61Var29 = ((hv5) ifl1Var2.b).a;
                        int i29 = AppProtocolRemoteService.f1;
                        return oh61Var29.f();
                    default:
                        ct5 ct5Var = (ct5) obj;
                        oh61 oh61Var30 = ((hv5) ifl1Var2.b).a;
                        int i30 = AppProtocolRemoteService.f1;
                        if (ct5Var != null) {
                            str = ct5Var.b;
                            if ("default".equals(str)) {
                                if ("car".equals(oh61Var30.z.f)) {
                                    str = "default-cars";
                                } else {
                                    str = "default";
                                }
                            }
                        } else if ("car".equals(oh61Var30.z.f)) {
                            str = "default-cars";
                        } else {
                            str = "default";
                        }
                        Observable observableJust = (oh61Var30.o.c.e.equals("com.google.android.apps.maps") && str.equals("default")) ? Observable.just(new yr5(0, 0, 0, z6x.a)) : null;
                        if (observableJust != null) {
                            return observableJust;
                        }
                        oh61Var30.y = str;
                        Bundle bundleG = cy30.g("_type", str);
                        String str7 = oh61Var30.f31p;
                        hlr0 hlr0Var2 = new hlr0();
                        UbiSpecificationId ubiSpecificationId2 = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var3 = oh61Var30.o.c;
                        String str8 = cr5Var3.e;
                        String str9 = cr5Var3.d;
                        m210 m210Var3 = oh61Var30.z;
                        if (m210Var3 == null) {
                            m210Var3 = oh61.D;
                        }
                        return oh61Var30.u.c(new r9c(str, str7, str8, str9, m210Var3, true, true, false, false, hlr0Var2, 2, 1, ubiSpecificationId2, (String) null, false, false, false), bundleG).map(new nh61((byte) 7)).toObservable().startWith(oh61Var30.m.c(8).w()).doOnSubscribe(new fv5(oh61Var30, (byte) 19));
                }
            }
        }));
        final byte b26 = 18;
        gv5Var2.accept(new v5y(jr5.class, "com.spotify.start_radio", 1, new w5y() { // from class: p.e2s
            /* JADX WARN: Code duplicated, block: B:11:0x0044  */
            /* JADX WARN: Code duplicated, block: B:12:0x0047  */
            /* JADX WARN: Code duplicated, block: B:9:0x0038  */
            @Override // p.w5y
            public final Observable a(Object obj) {
                String str;
                byte b110 = b26;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                wq5 wq5Var = cv5.a;
                final byte b111 = 0;
                final byte b112 = 1;
                ifl1 ifl1Var2 = ifl1Var;
                switch (b110) {
                    case 0:
                        oh61 oh61Var = ((hv5) ifl1Var2.b).a;
                        int i = AppProtocolRemoteService.f1;
                        g510 g510Var = oh61Var.k;
                        m210 m210Var = oh61Var.z;
                        String strP = g510Var.p();
                        if (strP == null) {
                            strP = "";
                        }
                        return g510.q(g510Var, m210Var, g510Var.h.j(strP)).flatMapCompletable(new mh61(oh61Var, (byte) 7)).d(oh61Var.c.b().a().takeUntil(new nh61((byte) 4)).flatMap(new nh61((byte) 5)).timeout(25L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new nh61((byte) 6)));
                    case 1:
                        oh61 oh61Var2 = ((hv5) ifl1Var2.b).a;
                        int i2 = AppProtocolRemoteService.f1;
                        return oh61Var2.h((pu5) obj);
                    case 2:
                        oh61 oh61Var3 = ((hv5) ifl1Var2.b).a;
                        int i3 = AppProtocolRemoteService.f1;
                        return oh61Var3.e.b("type").startWith(new CompletableFromAction(new w43(oh61Var3.m, (byte) 6)).w()).map(new f341((byte) 17)).onErrorResumeNext(new f341((byte) 29));
                    case 3:
                        oh61 oh61Var4 = ((hv5) ifl1Var2.b).a;
                        int i4 = AppProtocolRemoteService.f1;
                        return oh61Var4.i((vu5) obj);
                    case 4:
                        su5 su5Var = (su5) obj;
                        oh61 oh61Var5 = ((hv5) ifl1Var2.b).a;
                        int i5 = AppProtocolRemoteService.f1;
                        return Single.create(new jf11((Object) su5Var, (byte) 18)).flatMap(new h341(oh61Var5, su5Var, (byte) 9)).toObservable().startWith(oh61Var5.m.c(2).w());
                    case 5:
                        final ks5 ks5Var = (ks5) obj;
                        final oh61 oh61Var6 = ((hv5) ifl1Var2.b).a;
                        int i6 = AppProtocolRemoteService.f1;
                        return oh61Var6.k.l(ks5Var.b.longValue(), oh61Var6.z).map(new f341((byte) 23)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b113 = b111;
                                ks5 ks5Var3 = ks5Var;
                                oh61 oh61Var8 = oh61Var6;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b113) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek in song", (byte) 18)).toObservable().startWith(oh61Var6.m.c(1).w());
                    case 6:
                        final ks5 ks5Var2 = (ks5) obj;
                        final oh61 oh61Var7 = ((hv5) ifl1Var2.b).a;
                        int i7 = AppProtocolRemoteService.f1;
                        return oh61Var7.k.k(ks5Var2.b.longValue(), oh61Var7.z).map(new f341((byte) 28)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b113 = b112;
                                ks5 ks5Var3 = ks5Var2;
                                oh61 oh61Var8 = oh61Var7;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b113) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek by in a song", (byte) 18)).toObservable().startWith(oh61Var7.m.c(1).w());
                    case 7:
                        oh61 oh61Var8 = ((hv5) ifl1Var2.b).a;
                        int i8 = AppProtocolRemoteService.f1;
                        dbm dbmVar = oh61Var8.m;
                        Flowable flowable = oh61Var8.h;
                        g510 g510Var2 = oh61Var8.k;
                        Integer num = ((ns5) obj).b;
                        int iIntValue = num.intValue();
                        if (iIntValue == 0) {
                            Flowable flowableT = flowable.T(dbmVar.c(1).v()).T(g510Var2.d(oh61Var8.z).map(new nh61((byte) 19)).flatMapCompletable(new mh61(oh61Var8, (byte) 10)).v());
                            nh61 nh61Var = new nh61((byte) 20);
                            flowableT.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT, nh61Var).x(new nh61((byte) 21)).J(new nh61((byte) 22)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 23));
                        }
                        if (iIntValue == 1) {
                            Flowable flowableT2 = flowable.T(dbmVar.c(1).v()).T(g510Var2.j(oh61Var8.z).map(new nh61((byte) 13)).flatMapCompletable(new mh61(oh61Var8, (byte) 9)).v());
                            nh61 nh61Var2 = new nh61((byte) 14);
                            flowableT2.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT2, nh61Var2).x(new nh61((byte) 16)).J(new nh61((byte) 17)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 18));
                        }
                        if (iIntValue == 50 || iIntValue == 80 || iIntValue == 100 || iIntValue == 120 || iIntValue == 150 || iIntValue == 200 || iIntValue == 300) {
                            return oh61Var8.j(num.intValue());
                        }
                        return IapException.a("Unexpected playback speed " + num);
                    case 8:
                        oh61 oh61Var9 = ((hv5) ifl1Var2.b).a;
                        int i9 = AppProtocolRemoteService.f1;
                        return oh61Var9.j((int) (((ot5) obj).b.floatValue() * 100.0f));
                    case 9:
                        oh61 oh61Var10 = ((hv5) ifl1Var2.b).a;
                        int i10 = AppProtocolRemoteService.f1;
                        return oh61Var10.k((zs5) obj);
                    case 10:
                        oh61 oh61Var11 = ((hv5) ifl1Var2.b).a;
                        int i11 = AppProtocolRemoteService.f1;
                        Flowable flowable2 = oh61Var11.f;
                        return Observable.combineLatest(x0d.j(flowable2, flowable2).startWith(new CompletableFromAction(new ok70(oh61Var11.m, 4)).w()), yoi1.i(oh61Var11.g.a(o6n.a), o6x.a).startWithItem(Boolean.FALSE).distinctUntilChanged(), new mh61(oh61Var11, (byte) 3));
                    case 11:
                        oh61 oh61Var12 = ((hv5) ifl1Var2.b).a;
                        int i12 = AppProtocolRemoteService.f1;
                        Flowable flowable3 = oh61Var12.h;
                        ObservableFromPublisher observableFromPublisherJ = x0d.j(flowable3, flowable3);
                        ys5 ys5Var = zs5.Companion;
                        Objects.requireNonNull(ys5Var);
                        return observableFromPublisherJ.map(new nh61(ys5Var, (byte) 15)).flatMap(new mh61(oh61Var12, (byte) 11));
                    case 12:
                        ft5 ft5Var = (ft5) obj;
                        oh61 oh61Var13 = ((hv5) ifl1Var2.b).a;
                        int i13 = AppProtocolRemoteService.f1;
                        return oh61Var13.h.T(oh61Var13.m.c(1).v()).z().flatMapCompletable(new h341(oh61Var13, ft5Var, (byte) 6)).d(Observable.just(wq5Var)).startWith(oh61Var13.k.c(oh61Var13.z, ft5Var.d.booleanValue()).ignoreElement().w());
                    case 13:
                        mq5 mq5Var = (mq5) obj;
                        oh61 oh61Var14 = ((hv5) ifl1Var2.b).a;
                        int i14 = AppProtocolRemoteService.f1;
                        Integer num2 = mq5Var.c;
                        int iIntValue2 = num2 == null ? 20 : num2.intValue();
                        String str2 = mq5Var.b;
                        if (str2.equals("spotify:recently-played")) {
                            str2 = "com.spotify.recently-played";
                        } else if (str2.equals("spotify:browse")) {
                            str2 = "com.spotify.browse";
                        }
                        String str3 = str2;
                        c610 c610Var = oh61Var14.u;
                        hlr0 hlr0Var = new hlr0();
                        UbiSpecificationId ubiSpecificationId = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var = oh61Var14.o.c;
                        String str4 = cr5Var.e;
                        String str5 = cr5Var.d;
                        String str6 = oh61Var14.y;
                        m210 m210Var2 = oh61Var14.z;
                        if (m210Var2 == null) {
                            m210Var2 = oh61.D;
                        }
                        return c610Var.c(new r9c(str6, str3, str4, str5, m210Var2, false, true, false, false, hlr0Var, 2, 1, ubiSpecificationId, (String) null, false, false, false), new Bundle()).map(new mp5(mq5Var, iIntValue2, (byte) 8)).doOnError(new fv5(str3, (byte) 21)).toObservable().doOnSubscribe(new po5(oh61Var14, mq5Var, (byte) 5)).startWith(oh61Var14.m.c(8).w());
                    case 14:
                        oh61 oh61Var15 = ((hv5) ifl1Var2.b).a;
                        int i15 = AppProtocolRemoteService.f1;
                        return oh61Var15.l((rt5) obj);
                    case 15:
                        oh61 oh61Var16 = ((hv5) ifl1Var2.b).a;
                        int i16 = AppProtocolRemoteService.f1;
                        Flowable flowable4 = oh61Var16.h;
                        return x0d.j(flowable4, flowable4).map(new nh61((byte) 1)).flatMap(new mh61(oh61Var16, (byte) 4));
                    case 16:
                        oh61 oh61Var17 = ((hv5) ifl1Var2.b).a;
                        int i17 = AppProtocolRemoteService.f1;
                        return oh61Var17.k.n(oh61Var17.z).map(new nh61((byte) 2)).flatMap(new mh61(oh61Var17, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var17.m.c(1).w());
                    case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                        oh61 oh61Var18 = ((hv5) ifl1Var2.b).a;
                        int i18 = AppProtocolRemoteService.f1;
                        return oh61Var18.k.o(oh61Var18.z).map(new f341((byte) 21)).zipWith(oh61Var18.h.z(), new f341((byte) 22)).flatMap(new h341(oh61Var18, (ut5) obj, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var18.m.c(1).w());
                    case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                        jr5 jr5Var = (jr5) obj;
                        oh61 oh61Var19 = ((hv5) ifl1Var2.b).a;
                        int i19 = AppProtocolRemoteService.f1;
                        return Observable.just(jr5Var).startWith(oh61Var19.m.c(1).w()).switchMap(new mh61(oh61Var19, (byte) 1)).flatMapSingle(new mh61(oh61Var19, (byte) 2)).filter(new f341((byte) 24)).map(new f341((byte) 25)).flatMap(new h341(oh61Var19, jr5Var, (byte) 7)).timeout(15L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new f341((byte) 26));
                    case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                        pu5 pu5Var = (pu5) obj;
                        oh61 oh61Var20 = ((hv5) ifl1Var2.b).a;
                        int i20 = AppProtocolRemoteService.f1;
                        Observable observable = oh61Var20.h.T(oh61Var20.m.c(2).v()).z().toObservable();
                        g510 g510Var3 = oh61Var20.k;
                        return observable.startWith(g510.q(g510Var3, oh61Var20.z, g510Var3.h.e(pu5Var.b)).ignoreElement().w()).map(new h341(oh61Var20, pu5Var, (byte) 8));
                    case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                        oh61 oh61Var21 = ((hv5) ifl1Var2.b).a;
                        int i21 = AppProtocolRemoteService.f1;
                        return oh61Var21.c.a.k.b().map(new nh61((byte) 9));
                    case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                        oh61 oh61Var22 = ((hv5) ifl1Var2.b).a;
                        int i22 = AppProtocolRemoteService.f1;
                        return oh61Var22.m.c(4).d(Observable.just(new ws5()));
                    case 22:
                        oh61 oh61Var23 = ((hv5) ifl1Var2.b).a;
                        int i23 = AppProtocolRemoteService.f1;
                        return oh61Var23.i((vu5) obj);
                    case 23:
                        oh61 oh61Var24 = ((hv5) ifl1Var2.b).a;
                        int i24 = AppProtocolRemoteService.f1;
                        return oh61Var24.l.a(((sr5) obj).b.intValue(), oh61Var24.z).q(oh61Var24.m.c(1)).d(Observable.just(wq5Var));
                    case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                        oh61 oh61Var25 = ((hv5) ifl1Var2.b).a;
                        int i25 = AppProtocolRemoteService.f1;
                        return new poj0(oh61Var25.c, oh61Var25.j, oh61Var25.h, oh61Var25.n, (byte) 10).r(oh61Var25.a.getResources()).startWith(oh61Var25.m.c(4).w()).firstOrError().toObservable().map(new f341((byte) 27));
                    case 25:
                        oh61 oh61Var26 = ((hv5) ifl1Var2.b).a;
                        int i26 = AppProtocolRemoteService.f1;
                        Flowable flowable5 = oh61Var26.h;
                        iu5 iu5Var = ju5.Companion;
                        Objects.requireNonNull(iu5Var);
                        Flowable flowableT3 = flowable5.J(new nh61(iu5Var, (byte) 8)).T(oh61Var26.m.c(4).v());
                        flowableT3.getClass();
                        return new ObservableFromPublisher(flowableT3);
                    case 26:
                        pr5 pr5Var = (pr5) obj;
                        oh61 oh61Var27 = ((hv5) ifl1Var2.b).a;
                        int i27 = AppProtocolRemoteService.f1;
                        cr5 cr5Var2 = oh61Var27.o.c;
                        return Single.create(new u2i0(oh61Var27, pr5Var, cr5Var2.l, cr5Var2.k, true)).toObservable().startWith(oh61Var27.m.b(4, pr5Var).w());
                    case 27:
                        oh61 oh61Var28 = ((hv5) ifl1Var2.b).a;
                        int i28 = AppProtocolRemoteService.f1;
                        return oh61Var28.h.T(oh61Var28.m.c(4).v()).z().toObservable().map(new nh61((byte) 0));
                    case 28:
                        oh61 oh61Var29 = ((hv5) ifl1Var2.b).a;
                        int i29 = AppProtocolRemoteService.f1;
                        return oh61Var29.f();
                    default:
                        ct5 ct5Var = (ct5) obj;
                        oh61 oh61Var30 = ((hv5) ifl1Var2.b).a;
                        int i30 = AppProtocolRemoteService.f1;
                        if (ct5Var != null) {
                            str = ct5Var.b;
                            if ("default".equals(str)) {
                                if ("car".equals(oh61Var30.z.f)) {
                                    str = "default-cars";
                                } else {
                                    str = "default";
                                }
                            }
                        } else if ("car".equals(oh61Var30.z.f)) {
                            str = "default-cars";
                        } else {
                            str = "default";
                        }
                        Observable observableJust = (oh61Var30.o.c.e.equals("com.google.android.apps.maps") && str.equals("default")) ? Observable.just(new yr5(0, 0, 0, z6x.a)) : null;
                        if (observableJust != null) {
                            return observableJust;
                        }
                        oh61Var30.y = str;
                        Bundle bundleG = cy30.g("_type", str);
                        String str7 = oh61Var30.f31p;
                        hlr0 hlr0Var2 = new hlr0();
                        UbiSpecificationId ubiSpecificationId2 = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var3 = oh61Var30.o.c;
                        String str8 = cr5Var3.e;
                        String str9 = cr5Var3.d;
                        m210 m210Var3 = oh61Var30.z;
                        if (m210Var3 == null) {
                            m210Var3 = oh61.D;
                        }
                        return oh61Var30.u.c(new r9c(str, str7, str8, str9, m210Var3, true, true, false, false, hlr0Var2, 2, 1, ubiSpecificationId2, (String) null, false, false, false), bundleG).map(new nh61((byte) 7)).toObservable().startWith(oh61Var30.m.c(8).w()).doOnSubscribe(new fv5(oh61Var30, (byte) 19));
                }
            }
        }));
        final byte b27 = 19;
        gv5Var2.accept(new v5y(pu5.class, "com.spotify.queue_spotify_uri", 1, new w5y() { // from class: p.e2s
            /* JADX WARN: Code duplicated, block: B:11:0x0044  */
            /* JADX WARN: Code duplicated, block: B:12:0x0047  */
            /* JADX WARN: Code duplicated, block: B:9:0x0038  */
            @Override // p.w5y
            public final Observable a(Object obj) {
                String str;
                byte b110 = b27;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                wq5 wq5Var = cv5.a;
                final byte b111 = 0;
                final byte b112 = 1;
                ifl1 ifl1Var2 = ifl1Var;
                switch (b110) {
                    case 0:
                        oh61 oh61Var = ((hv5) ifl1Var2.b).a;
                        int i = AppProtocolRemoteService.f1;
                        g510 g510Var = oh61Var.k;
                        m210 m210Var = oh61Var.z;
                        String strP = g510Var.p();
                        if (strP == null) {
                            strP = "";
                        }
                        return g510.q(g510Var, m210Var, g510Var.h.j(strP)).flatMapCompletable(new mh61(oh61Var, (byte) 7)).d(oh61Var.c.b().a().takeUntil(new nh61((byte) 4)).flatMap(new nh61((byte) 5)).timeout(25L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new nh61((byte) 6)));
                    case 1:
                        oh61 oh61Var2 = ((hv5) ifl1Var2.b).a;
                        int i2 = AppProtocolRemoteService.f1;
                        return oh61Var2.h((pu5) obj);
                    case 2:
                        oh61 oh61Var3 = ((hv5) ifl1Var2.b).a;
                        int i3 = AppProtocolRemoteService.f1;
                        return oh61Var3.e.b("type").startWith(new CompletableFromAction(new w43(oh61Var3.m, (byte) 6)).w()).map(new f341((byte) 17)).onErrorResumeNext(new f341((byte) 29));
                    case 3:
                        oh61 oh61Var4 = ((hv5) ifl1Var2.b).a;
                        int i4 = AppProtocolRemoteService.f1;
                        return oh61Var4.i((vu5) obj);
                    case 4:
                        su5 su5Var = (su5) obj;
                        oh61 oh61Var5 = ((hv5) ifl1Var2.b).a;
                        int i5 = AppProtocolRemoteService.f1;
                        return Single.create(new jf11((Object) su5Var, (byte) 18)).flatMap(new h341(oh61Var5, su5Var, (byte) 9)).toObservable().startWith(oh61Var5.m.c(2).w());
                    case 5:
                        final ks5 ks5Var = (ks5) obj;
                        final oh61 oh61Var6 = ((hv5) ifl1Var2.b).a;
                        int i6 = AppProtocolRemoteService.f1;
                        return oh61Var6.k.l(ks5Var.b.longValue(), oh61Var6.z).map(new f341((byte) 23)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b113 = b111;
                                ks5 ks5Var3 = ks5Var;
                                oh61 oh61Var8 = oh61Var6;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b113) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek in song", (byte) 18)).toObservable().startWith(oh61Var6.m.c(1).w());
                    case 6:
                        final ks5 ks5Var2 = (ks5) obj;
                        final oh61 oh61Var7 = ((hv5) ifl1Var2.b).a;
                        int i7 = AppProtocolRemoteService.f1;
                        return oh61Var7.k.k(ks5Var2.b.longValue(), oh61Var7.z).map(new f341((byte) 28)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b113 = b112;
                                ks5 ks5Var3 = ks5Var2;
                                oh61 oh61Var8 = oh61Var7;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b113) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek by in a song", (byte) 18)).toObservable().startWith(oh61Var7.m.c(1).w());
                    case 7:
                        oh61 oh61Var8 = ((hv5) ifl1Var2.b).a;
                        int i8 = AppProtocolRemoteService.f1;
                        dbm dbmVar = oh61Var8.m;
                        Flowable flowable = oh61Var8.h;
                        g510 g510Var2 = oh61Var8.k;
                        Integer num = ((ns5) obj).b;
                        int iIntValue = num.intValue();
                        if (iIntValue == 0) {
                            Flowable flowableT = flowable.T(dbmVar.c(1).v()).T(g510Var2.d(oh61Var8.z).map(new nh61((byte) 19)).flatMapCompletable(new mh61(oh61Var8, (byte) 10)).v());
                            nh61 nh61Var = new nh61((byte) 20);
                            flowableT.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT, nh61Var).x(new nh61((byte) 21)).J(new nh61((byte) 22)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 23));
                        }
                        if (iIntValue == 1) {
                            Flowable flowableT2 = flowable.T(dbmVar.c(1).v()).T(g510Var2.j(oh61Var8.z).map(new nh61((byte) 13)).flatMapCompletable(new mh61(oh61Var8, (byte) 9)).v());
                            nh61 nh61Var2 = new nh61((byte) 14);
                            flowableT2.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT2, nh61Var2).x(new nh61((byte) 16)).J(new nh61((byte) 17)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 18));
                        }
                        if (iIntValue == 50 || iIntValue == 80 || iIntValue == 100 || iIntValue == 120 || iIntValue == 150 || iIntValue == 200 || iIntValue == 300) {
                            return oh61Var8.j(num.intValue());
                        }
                        return IapException.a("Unexpected playback speed " + num);
                    case 8:
                        oh61 oh61Var9 = ((hv5) ifl1Var2.b).a;
                        int i9 = AppProtocolRemoteService.f1;
                        return oh61Var9.j((int) (((ot5) obj).b.floatValue() * 100.0f));
                    case 9:
                        oh61 oh61Var10 = ((hv5) ifl1Var2.b).a;
                        int i10 = AppProtocolRemoteService.f1;
                        return oh61Var10.k((zs5) obj);
                    case 10:
                        oh61 oh61Var11 = ((hv5) ifl1Var2.b).a;
                        int i11 = AppProtocolRemoteService.f1;
                        Flowable flowable2 = oh61Var11.f;
                        return Observable.combineLatest(x0d.j(flowable2, flowable2).startWith(new CompletableFromAction(new ok70(oh61Var11.m, 4)).w()), yoi1.i(oh61Var11.g.a(o6n.a), o6x.a).startWithItem(Boolean.FALSE).distinctUntilChanged(), new mh61(oh61Var11, (byte) 3));
                    case 11:
                        oh61 oh61Var12 = ((hv5) ifl1Var2.b).a;
                        int i12 = AppProtocolRemoteService.f1;
                        Flowable flowable3 = oh61Var12.h;
                        ObservableFromPublisher observableFromPublisherJ = x0d.j(flowable3, flowable3);
                        ys5 ys5Var = zs5.Companion;
                        Objects.requireNonNull(ys5Var);
                        return observableFromPublisherJ.map(new nh61(ys5Var, (byte) 15)).flatMap(new mh61(oh61Var12, (byte) 11));
                    case 12:
                        ft5 ft5Var = (ft5) obj;
                        oh61 oh61Var13 = ((hv5) ifl1Var2.b).a;
                        int i13 = AppProtocolRemoteService.f1;
                        return oh61Var13.h.T(oh61Var13.m.c(1).v()).z().flatMapCompletable(new h341(oh61Var13, ft5Var, (byte) 6)).d(Observable.just(wq5Var)).startWith(oh61Var13.k.c(oh61Var13.z, ft5Var.d.booleanValue()).ignoreElement().w());
                    case 13:
                        mq5 mq5Var = (mq5) obj;
                        oh61 oh61Var14 = ((hv5) ifl1Var2.b).a;
                        int i14 = AppProtocolRemoteService.f1;
                        Integer num2 = mq5Var.c;
                        int iIntValue2 = num2 == null ? 20 : num2.intValue();
                        String str2 = mq5Var.b;
                        if (str2.equals("spotify:recently-played")) {
                            str2 = "com.spotify.recently-played";
                        } else if (str2.equals("spotify:browse")) {
                            str2 = "com.spotify.browse";
                        }
                        String str3 = str2;
                        c610 c610Var = oh61Var14.u;
                        hlr0 hlr0Var = new hlr0();
                        UbiSpecificationId ubiSpecificationId = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var = oh61Var14.o.c;
                        String str4 = cr5Var.e;
                        String str5 = cr5Var.d;
                        String str6 = oh61Var14.y;
                        m210 m210Var2 = oh61Var14.z;
                        if (m210Var2 == null) {
                            m210Var2 = oh61.D;
                        }
                        return c610Var.c(new r9c(str6, str3, str4, str5, m210Var2, false, true, false, false, hlr0Var, 2, 1, ubiSpecificationId, (String) null, false, false, false), new Bundle()).map(new mp5(mq5Var, iIntValue2, (byte) 8)).doOnError(new fv5(str3, (byte) 21)).toObservable().doOnSubscribe(new po5(oh61Var14, mq5Var, (byte) 5)).startWith(oh61Var14.m.c(8).w());
                    case 14:
                        oh61 oh61Var15 = ((hv5) ifl1Var2.b).a;
                        int i15 = AppProtocolRemoteService.f1;
                        return oh61Var15.l((rt5) obj);
                    case 15:
                        oh61 oh61Var16 = ((hv5) ifl1Var2.b).a;
                        int i16 = AppProtocolRemoteService.f1;
                        Flowable flowable4 = oh61Var16.h;
                        return x0d.j(flowable4, flowable4).map(new nh61((byte) 1)).flatMap(new mh61(oh61Var16, (byte) 4));
                    case 16:
                        oh61 oh61Var17 = ((hv5) ifl1Var2.b).a;
                        int i17 = AppProtocolRemoteService.f1;
                        return oh61Var17.k.n(oh61Var17.z).map(new nh61((byte) 2)).flatMap(new mh61(oh61Var17, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var17.m.c(1).w());
                    case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                        oh61 oh61Var18 = ((hv5) ifl1Var2.b).a;
                        int i18 = AppProtocolRemoteService.f1;
                        return oh61Var18.k.o(oh61Var18.z).map(new f341((byte) 21)).zipWith(oh61Var18.h.z(), new f341((byte) 22)).flatMap(new h341(oh61Var18, (ut5) obj, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var18.m.c(1).w());
                    case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                        jr5 jr5Var = (jr5) obj;
                        oh61 oh61Var19 = ((hv5) ifl1Var2.b).a;
                        int i19 = AppProtocolRemoteService.f1;
                        return Observable.just(jr5Var).startWith(oh61Var19.m.c(1).w()).switchMap(new mh61(oh61Var19, (byte) 1)).flatMapSingle(new mh61(oh61Var19, (byte) 2)).filter(new f341((byte) 24)).map(new f341((byte) 25)).flatMap(new h341(oh61Var19, jr5Var, (byte) 7)).timeout(15L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new f341((byte) 26));
                    case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                        pu5 pu5Var = (pu5) obj;
                        oh61 oh61Var20 = ((hv5) ifl1Var2.b).a;
                        int i20 = AppProtocolRemoteService.f1;
                        Observable observable = oh61Var20.h.T(oh61Var20.m.c(2).v()).z().toObservable();
                        g510 g510Var3 = oh61Var20.k;
                        return observable.startWith(g510.q(g510Var3, oh61Var20.z, g510Var3.h.e(pu5Var.b)).ignoreElement().w()).map(new h341(oh61Var20, pu5Var, (byte) 8));
                    case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                        oh61 oh61Var21 = ((hv5) ifl1Var2.b).a;
                        int i21 = AppProtocolRemoteService.f1;
                        return oh61Var21.c.a.k.b().map(new nh61((byte) 9));
                    case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                        oh61 oh61Var22 = ((hv5) ifl1Var2.b).a;
                        int i22 = AppProtocolRemoteService.f1;
                        return oh61Var22.m.c(4).d(Observable.just(new ws5()));
                    case 22:
                        oh61 oh61Var23 = ((hv5) ifl1Var2.b).a;
                        int i23 = AppProtocolRemoteService.f1;
                        return oh61Var23.i((vu5) obj);
                    case 23:
                        oh61 oh61Var24 = ((hv5) ifl1Var2.b).a;
                        int i24 = AppProtocolRemoteService.f1;
                        return oh61Var24.l.a(((sr5) obj).b.intValue(), oh61Var24.z).q(oh61Var24.m.c(1)).d(Observable.just(wq5Var));
                    case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                        oh61 oh61Var25 = ((hv5) ifl1Var2.b).a;
                        int i25 = AppProtocolRemoteService.f1;
                        return new poj0(oh61Var25.c, oh61Var25.j, oh61Var25.h, oh61Var25.n, (byte) 10).r(oh61Var25.a.getResources()).startWith(oh61Var25.m.c(4).w()).firstOrError().toObservable().map(new f341((byte) 27));
                    case 25:
                        oh61 oh61Var26 = ((hv5) ifl1Var2.b).a;
                        int i26 = AppProtocolRemoteService.f1;
                        Flowable flowable5 = oh61Var26.h;
                        iu5 iu5Var = ju5.Companion;
                        Objects.requireNonNull(iu5Var);
                        Flowable flowableT3 = flowable5.J(new nh61(iu5Var, (byte) 8)).T(oh61Var26.m.c(4).v());
                        flowableT3.getClass();
                        return new ObservableFromPublisher(flowableT3);
                    case 26:
                        pr5 pr5Var = (pr5) obj;
                        oh61 oh61Var27 = ((hv5) ifl1Var2.b).a;
                        int i27 = AppProtocolRemoteService.f1;
                        cr5 cr5Var2 = oh61Var27.o.c;
                        return Single.create(new u2i0(oh61Var27, pr5Var, cr5Var2.l, cr5Var2.k, true)).toObservable().startWith(oh61Var27.m.b(4, pr5Var).w());
                    case 27:
                        oh61 oh61Var28 = ((hv5) ifl1Var2.b).a;
                        int i28 = AppProtocolRemoteService.f1;
                        return oh61Var28.h.T(oh61Var28.m.c(4).v()).z().toObservable().map(new nh61((byte) 0));
                    case 28:
                        oh61 oh61Var29 = ((hv5) ifl1Var2.b).a;
                        int i29 = AppProtocolRemoteService.f1;
                        return oh61Var29.f();
                    default:
                        ct5 ct5Var = (ct5) obj;
                        oh61 oh61Var30 = ((hv5) ifl1Var2.b).a;
                        int i30 = AppProtocolRemoteService.f1;
                        if (ct5Var != null) {
                            str = ct5Var.b;
                            if ("default".equals(str)) {
                                if ("car".equals(oh61Var30.z.f)) {
                                    str = "default-cars";
                                } else {
                                    str = "default";
                                }
                            }
                        } else if ("car".equals(oh61Var30.z.f)) {
                            str = "default-cars";
                        } else {
                            str = "default";
                        }
                        Observable observableJust = (oh61Var30.o.c.e.equals("com.google.android.apps.maps") && str.equals("default")) ? Observable.just(new yr5(0, 0, 0, z6x.a)) : null;
                        if (observableJust != null) {
                            return observableJust;
                        }
                        oh61Var30.y = str;
                        Bundle bundleG = cy30.g("_type", str);
                        String str7 = oh61Var30.f31p;
                        hlr0 hlr0Var2 = new hlr0();
                        UbiSpecificationId ubiSpecificationId2 = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var3 = oh61Var30.o.c;
                        String str8 = cr5Var3.e;
                        String str9 = cr5Var3.d;
                        m210 m210Var3 = oh61Var30.z;
                        if (m210Var3 == null) {
                            m210Var3 = oh61.D;
                        }
                        return oh61Var30.u.c(new r9c(str, str7, str8, str9, m210Var3, true, true, false, false, hlr0Var2, 2, 1, ubiSpecificationId2, (String) null, false, false, false), bundleG).map(new nh61((byte) 7)).toObservable().startWith(oh61Var30.m.c(8).w()).doOnSubscribe(new fv5(oh61Var30, (byte) 19));
                }
            }
        }));
        final byte b28 = 20;
        gv5Var2.accept(new v5y(wq5.class, "com.spotify.get_crossfade", 4, new w5y() { // from class: p.e2s
            /* JADX WARN: Code duplicated, block: B:11:0x0044  */
            /* JADX WARN: Code duplicated, block: B:12:0x0047  */
            /* JADX WARN: Code duplicated, block: B:9:0x0038  */
            @Override // p.w5y
            public final Observable a(Object obj) {
                String str;
                byte b110 = b28;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                wq5 wq5Var = cv5.a;
                final byte b111 = 0;
                final byte b112 = 1;
                ifl1 ifl1Var2 = ifl1Var;
                switch (b110) {
                    case 0:
                        oh61 oh61Var = ((hv5) ifl1Var2.b).a;
                        int i = AppProtocolRemoteService.f1;
                        g510 g510Var = oh61Var.k;
                        m210 m210Var = oh61Var.z;
                        String strP = g510Var.p();
                        if (strP == null) {
                            strP = "";
                        }
                        return g510.q(g510Var, m210Var, g510Var.h.j(strP)).flatMapCompletable(new mh61(oh61Var, (byte) 7)).d(oh61Var.c.b().a().takeUntil(new nh61((byte) 4)).flatMap(new nh61((byte) 5)).timeout(25L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new nh61((byte) 6)));
                    case 1:
                        oh61 oh61Var2 = ((hv5) ifl1Var2.b).a;
                        int i2 = AppProtocolRemoteService.f1;
                        return oh61Var2.h((pu5) obj);
                    case 2:
                        oh61 oh61Var3 = ((hv5) ifl1Var2.b).a;
                        int i3 = AppProtocolRemoteService.f1;
                        return oh61Var3.e.b("type").startWith(new CompletableFromAction(new w43(oh61Var3.m, (byte) 6)).w()).map(new f341((byte) 17)).onErrorResumeNext(new f341((byte) 29));
                    case 3:
                        oh61 oh61Var4 = ((hv5) ifl1Var2.b).a;
                        int i4 = AppProtocolRemoteService.f1;
                        return oh61Var4.i((vu5) obj);
                    case 4:
                        su5 su5Var = (su5) obj;
                        oh61 oh61Var5 = ((hv5) ifl1Var2.b).a;
                        int i5 = AppProtocolRemoteService.f1;
                        return Single.create(new jf11((Object) su5Var, (byte) 18)).flatMap(new h341(oh61Var5, su5Var, (byte) 9)).toObservable().startWith(oh61Var5.m.c(2).w());
                    case 5:
                        final ks5 ks5Var = (ks5) obj;
                        final oh61 oh61Var6 = ((hv5) ifl1Var2.b).a;
                        int i6 = AppProtocolRemoteService.f1;
                        return oh61Var6.k.l(ks5Var.b.longValue(), oh61Var6.z).map(new f341((byte) 23)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b113 = b111;
                                ks5 ks5Var3 = ks5Var;
                                oh61 oh61Var8 = oh61Var6;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b113) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek in song", (byte) 18)).toObservable().startWith(oh61Var6.m.c(1).w());
                    case 6:
                        final ks5 ks5Var2 = (ks5) obj;
                        final oh61 oh61Var7 = ((hv5) ifl1Var2.b).a;
                        int i7 = AppProtocolRemoteService.f1;
                        return oh61Var7.k.k(ks5Var2.b.longValue(), oh61Var7.z).map(new f341((byte) 28)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b113 = b112;
                                ks5 ks5Var3 = ks5Var2;
                                oh61 oh61Var8 = oh61Var7;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b113) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek by in a song", (byte) 18)).toObservable().startWith(oh61Var7.m.c(1).w());
                    case 7:
                        oh61 oh61Var8 = ((hv5) ifl1Var2.b).a;
                        int i8 = AppProtocolRemoteService.f1;
                        dbm dbmVar = oh61Var8.m;
                        Flowable flowable = oh61Var8.h;
                        g510 g510Var2 = oh61Var8.k;
                        Integer num = ((ns5) obj).b;
                        int iIntValue = num.intValue();
                        if (iIntValue == 0) {
                            Flowable flowableT = flowable.T(dbmVar.c(1).v()).T(g510Var2.d(oh61Var8.z).map(new nh61((byte) 19)).flatMapCompletable(new mh61(oh61Var8, (byte) 10)).v());
                            nh61 nh61Var = new nh61((byte) 20);
                            flowableT.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT, nh61Var).x(new nh61((byte) 21)).J(new nh61((byte) 22)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 23));
                        }
                        if (iIntValue == 1) {
                            Flowable flowableT2 = flowable.T(dbmVar.c(1).v()).T(g510Var2.j(oh61Var8.z).map(new nh61((byte) 13)).flatMapCompletable(new mh61(oh61Var8, (byte) 9)).v());
                            nh61 nh61Var2 = new nh61((byte) 14);
                            flowableT2.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT2, nh61Var2).x(new nh61((byte) 16)).J(new nh61((byte) 17)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 18));
                        }
                        if (iIntValue == 50 || iIntValue == 80 || iIntValue == 100 || iIntValue == 120 || iIntValue == 150 || iIntValue == 200 || iIntValue == 300) {
                            return oh61Var8.j(num.intValue());
                        }
                        return IapException.a("Unexpected playback speed " + num);
                    case 8:
                        oh61 oh61Var9 = ((hv5) ifl1Var2.b).a;
                        int i9 = AppProtocolRemoteService.f1;
                        return oh61Var9.j((int) (((ot5) obj).b.floatValue() * 100.0f));
                    case 9:
                        oh61 oh61Var10 = ((hv5) ifl1Var2.b).a;
                        int i10 = AppProtocolRemoteService.f1;
                        return oh61Var10.k((zs5) obj);
                    case 10:
                        oh61 oh61Var11 = ((hv5) ifl1Var2.b).a;
                        int i11 = AppProtocolRemoteService.f1;
                        Flowable flowable2 = oh61Var11.f;
                        return Observable.combineLatest(x0d.j(flowable2, flowable2).startWith(new CompletableFromAction(new ok70(oh61Var11.m, 4)).w()), yoi1.i(oh61Var11.g.a(o6n.a), o6x.a).startWithItem(Boolean.FALSE).distinctUntilChanged(), new mh61(oh61Var11, (byte) 3));
                    case 11:
                        oh61 oh61Var12 = ((hv5) ifl1Var2.b).a;
                        int i12 = AppProtocolRemoteService.f1;
                        Flowable flowable3 = oh61Var12.h;
                        ObservableFromPublisher observableFromPublisherJ = x0d.j(flowable3, flowable3);
                        ys5 ys5Var = zs5.Companion;
                        Objects.requireNonNull(ys5Var);
                        return observableFromPublisherJ.map(new nh61(ys5Var, (byte) 15)).flatMap(new mh61(oh61Var12, (byte) 11));
                    case 12:
                        ft5 ft5Var = (ft5) obj;
                        oh61 oh61Var13 = ((hv5) ifl1Var2.b).a;
                        int i13 = AppProtocolRemoteService.f1;
                        return oh61Var13.h.T(oh61Var13.m.c(1).v()).z().flatMapCompletable(new h341(oh61Var13, ft5Var, (byte) 6)).d(Observable.just(wq5Var)).startWith(oh61Var13.k.c(oh61Var13.z, ft5Var.d.booleanValue()).ignoreElement().w());
                    case 13:
                        mq5 mq5Var = (mq5) obj;
                        oh61 oh61Var14 = ((hv5) ifl1Var2.b).a;
                        int i14 = AppProtocolRemoteService.f1;
                        Integer num2 = mq5Var.c;
                        int iIntValue2 = num2 == null ? 20 : num2.intValue();
                        String str2 = mq5Var.b;
                        if (str2.equals("spotify:recently-played")) {
                            str2 = "com.spotify.recently-played";
                        } else if (str2.equals("spotify:browse")) {
                            str2 = "com.spotify.browse";
                        }
                        String str3 = str2;
                        c610 c610Var = oh61Var14.u;
                        hlr0 hlr0Var = new hlr0();
                        UbiSpecificationId ubiSpecificationId = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var = oh61Var14.o.c;
                        String str4 = cr5Var.e;
                        String str5 = cr5Var.d;
                        String str6 = oh61Var14.y;
                        m210 m210Var2 = oh61Var14.z;
                        if (m210Var2 == null) {
                            m210Var2 = oh61.D;
                        }
                        return c610Var.c(new r9c(str6, str3, str4, str5, m210Var2, false, true, false, false, hlr0Var, 2, 1, ubiSpecificationId, (String) null, false, false, false), new Bundle()).map(new mp5(mq5Var, iIntValue2, (byte) 8)).doOnError(new fv5(str3, (byte) 21)).toObservable().doOnSubscribe(new po5(oh61Var14, mq5Var, (byte) 5)).startWith(oh61Var14.m.c(8).w());
                    case 14:
                        oh61 oh61Var15 = ((hv5) ifl1Var2.b).a;
                        int i15 = AppProtocolRemoteService.f1;
                        return oh61Var15.l((rt5) obj);
                    case 15:
                        oh61 oh61Var16 = ((hv5) ifl1Var2.b).a;
                        int i16 = AppProtocolRemoteService.f1;
                        Flowable flowable4 = oh61Var16.h;
                        return x0d.j(flowable4, flowable4).map(new nh61((byte) 1)).flatMap(new mh61(oh61Var16, (byte) 4));
                    case 16:
                        oh61 oh61Var17 = ((hv5) ifl1Var2.b).a;
                        int i17 = AppProtocolRemoteService.f1;
                        return oh61Var17.k.n(oh61Var17.z).map(new nh61((byte) 2)).flatMap(new mh61(oh61Var17, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var17.m.c(1).w());
                    case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                        oh61 oh61Var18 = ((hv5) ifl1Var2.b).a;
                        int i18 = AppProtocolRemoteService.f1;
                        return oh61Var18.k.o(oh61Var18.z).map(new f341((byte) 21)).zipWith(oh61Var18.h.z(), new f341((byte) 22)).flatMap(new h341(oh61Var18, (ut5) obj, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var18.m.c(1).w());
                    case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                        jr5 jr5Var = (jr5) obj;
                        oh61 oh61Var19 = ((hv5) ifl1Var2.b).a;
                        int i19 = AppProtocolRemoteService.f1;
                        return Observable.just(jr5Var).startWith(oh61Var19.m.c(1).w()).switchMap(new mh61(oh61Var19, (byte) 1)).flatMapSingle(new mh61(oh61Var19, (byte) 2)).filter(new f341((byte) 24)).map(new f341((byte) 25)).flatMap(new h341(oh61Var19, jr5Var, (byte) 7)).timeout(15L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new f341((byte) 26));
                    case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                        pu5 pu5Var = (pu5) obj;
                        oh61 oh61Var20 = ((hv5) ifl1Var2.b).a;
                        int i20 = AppProtocolRemoteService.f1;
                        Observable observable = oh61Var20.h.T(oh61Var20.m.c(2).v()).z().toObservable();
                        g510 g510Var3 = oh61Var20.k;
                        return observable.startWith(g510.q(g510Var3, oh61Var20.z, g510Var3.h.e(pu5Var.b)).ignoreElement().w()).map(new h341(oh61Var20, pu5Var, (byte) 8));
                    case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                        oh61 oh61Var21 = ((hv5) ifl1Var2.b).a;
                        int i21 = AppProtocolRemoteService.f1;
                        return oh61Var21.c.a.k.b().map(new nh61((byte) 9));
                    case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                        oh61 oh61Var22 = ((hv5) ifl1Var2.b).a;
                        int i22 = AppProtocolRemoteService.f1;
                        return oh61Var22.m.c(4).d(Observable.just(new ws5()));
                    case 22:
                        oh61 oh61Var23 = ((hv5) ifl1Var2.b).a;
                        int i23 = AppProtocolRemoteService.f1;
                        return oh61Var23.i((vu5) obj);
                    case 23:
                        oh61 oh61Var24 = ((hv5) ifl1Var2.b).a;
                        int i24 = AppProtocolRemoteService.f1;
                        return oh61Var24.l.a(((sr5) obj).b.intValue(), oh61Var24.z).q(oh61Var24.m.c(1)).d(Observable.just(wq5Var));
                    case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                        oh61 oh61Var25 = ((hv5) ifl1Var2.b).a;
                        int i25 = AppProtocolRemoteService.f1;
                        return new poj0(oh61Var25.c, oh61Var25.j, oh61Var25.h, oh61Var25.n, (byte) 10).r(oh61Var25.a.getResources()).startWith(oh61Var25.m.c(4).w()).firstOrError().toObservable().map(new f341((byte) 27));
                    case 25:
                        oh61 oh61Var26 = ((hv5) ifl1Var2.b).a;
                        int i26 = AppProtocolRemoteService.f1;
                        Flowable flowable5 = oh61Var26.h;
                        iu5 iu5Var = ju5.Companion;
                        Objects.requireNonNull(iu5Var);
                        Flowable flowableT3 = flowable5.J(new nh61(iu5Var, (byte) 8)).T(oh61Var26.m.c(4).v());
                        flowableT3.getClass();
                        return new ObservableFromPublisher(flowableT3);
                    case 26:
                        pr5 pr5Var = (pr5) obj;
                        oh61 oh61Var27 = ((hv5) ifl1Var2.b).a;
                        int i27 = AppProtocolRemoteService.f1;
                        cr5 cr5Var2 = oh61Var27.o.c;
                        return Single.create(new u2i0(oh61Var27, pr5Var, cr5Var2.l, cr5Var2.k, true)).toObservable().startWith(oh61Var27.m.b(4, pr5Var).w());
                    case 27:
                        oh61 oh61Var28 = ((hv5) ifl1Var2.b).a;
                        int i28 = AppProtocolRemoteService.f1;
                        return oh61Var28.h.T(oh61Var28.m.c(4).v()).z().toObservable().map(new nh61((byte) 0));
                    case 28:
                        oh61 oh61Var29 = ((hv5) ifl1Var2.b).a;
                        int i29 = AppProtocolRemoteService.f1;
                        return oh61Var29.f();
                    default:
                        ct5 ct5Var = (ct5) obj;
                        oh61 oh61Var30 = ((hv5) ifl1Var2.b).a;
                        int i30 = AppProtocolRemoteService.f1;
                        if (ct5Var != null) {
                            str = ct5Var.b;
                            if ("default".equals(str)) {
                                if ("car".equals(oh61Var30.z.f)) {
                                    str = "default-cars";
                                } else {
                                    str = "default";
                                }
                            }
                        } else if ("car".equals(oh61Var30.z.f)) {
                            str = "default-cars";
                        } else {
                            str = "default";
                        }
                        Observable observableJust = (oh61Var30.o.c.e.equals("com.google.android.apps.maps") && str.equals("default")) ? Observable.just(new yr5(0, 0, 0, z6x.a)) : null;
                        if (observableJust != null) {
                            return observableJust;
                        }
                        oh61Var30.y = str;
                        Bundle bundleG = cy30.g("_type", str);
                        String str7 = oh61Var30.f31p;
                        hlr0 hlr0Var2 = new hlr0();
                        UbiSpecificationId ubiSpecificationId2 = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var3 = oh61Var30.o.c;
                        String str8 = cr5Var3.e;
                        String str9 = cr5Var3.d;
                        m210 m210Var3 = oh61Var30.z;
                        if (m210Var3 == null) {
                            m210Var3 = oh61.D;
                        }
                        return oh61Var30.u.c(new r9c(str, str7, str8, str9, m210Var3, true, true, false, false, hlr0Var2, 2, 1, ubiSpecificationId2, (String) null, false, false, false), bundleG).map(new nh61((byte) 7)).toObservable().startWith(oh61Var30.m.c(8).w()).doOnSubscribe(new fv5(oh61Var30, (byte) 19));
                }
            }
        }));
        final byte b29 = 22;
        gv5Var2.accept(new v5y(vu5.class, "com.spotify.skip_to_index", 4, new w5y() { // from class: p.e2s
            /* JADX WARN: Code duplicated, block: B:11:0x0044  */
            /* JADX WARN: Code duplicated, block: B:12:0x0047  */
            /* JADX WARN: Code duplicated, block: B:9:0x0038  */
            @Override // p.w5y
            public final Observable a(Object obj) {
                String str;
                byte b110 = b29;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                wq5 wq5Var = cv5.a;
                final byte b111 = 0;
                final byte b112 = 1;
                ifl1 ifl1Var2 = ifl1Var;
                switch (b110) {
                    case 0:
                        oh61 oh61Var = ((hv5) ifl1Var2.b).a;
                        int i = AppProtocolRemoteService.f1;
                        g510 g510Var = oh61Var.k;
                        m210 m210Var = oh61Var.z;
                        String strP = g510Var.p();
                        if (strP == null) {
                            strP = "";
                        }
                        return g510.q(g510Var, m210Var, g510Var.h.j(strP)).flatMapCompletable(new mh61(oh61Var, (byte) 7)).d(oh61Var.c.b().a().takeUntil(new nh61((byte) 4)).flatMap(new nh61((byte) 5)).timeout(25L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new nh61((byte) 6)));
                    case 1:
                        oh61 oh61Var2 = ((hv5) ifl1Var2.b).a;
                        int i2 = AppProtocolRemoteService.f1;
                        return oh61Var2.h((pu5) obj);
                    case 2:
                        oh61 oh61Var3 = ((hv5) ifl1Var2.b).a;
                        int i3 = AppProtocolRemoteService.f1;
                        return oh61Var3.e.b("type").startWith(new CompletableFromAction(new w43(oh61Var3.m, (byte) 6)).w()).map(new f341((byte) 17)).onErrorResumeNext(new f341((byte) 29));
                    case 3:
                        oh61 oh61Var4 = ((hv5) ifl1Var2.b).a;
                        int i4 = AppProtocolRemoteService.f1;
                        return oh61Var4.i((vu5) obj);
                    case 4:
                        su5 su5Var = (su5) obj;
                        oh61 oh61Var5 = ((hv5) ifl1Var2.b).a;
                        int i5 = AppProtocolRemoteService.f1;
                        return Single.create(new jf11((Object) su5Var, (byte) 18)).flatMap(new h341(oh61Var5, su5Var, (byte) 9)).toObservable().startWith(oh61Var5.m.c(2).w());
                    case 5:
                        final ks5 ks5Var = (ks5) obj;
                        final oh61 oh61Var6 = ((hv5) ifl1Var2.b).a;
                        int i6 = AppProtocolRemoteService.f1;
                        return oh61Var6.k.l(ks5Var.b.longValue(), oh61Var6.z).map(new f341((byte) 23)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b113 = b111;
                                ks5 ks5Var3 = ks5Var;
                                oh61 oh61Var8 = oh61Var6;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b113) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek in song", (byte) 18)).toObservable().startWith(oh61Var6.m.c(1).w());
                    case 6:
                        final ks5 ks5Var2 = (ks5) obj;
                        final oh61 oh61Var7 = ((hv5) ifl1Var2.b).a;
                        int i7 = AppProtocolRemoteService.f1;
                        return oh61Var7.k.k(ks5Var2.b.longValue(), oh61Var7.z).map(new f341((byte) 28)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b113 = b112;
                                ks5 ks5Var3 = ks5Var2;
                                oh61 oh61Var8 = oh61Var7;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b113) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek by in a song", (byte) 18)).toObservable().startWith(oh61Var7.m.c(1).w());
                    case 7:
                        oh61 oh61Var8 = ((hv5) ifl1Var2.b).a;
                        int i8 = AppProtocolRemoteService.f1;
                        dbm dbmVar = oh61Var8.m;
                        Flowable flowable = oh61Var8.h;
                        g510 g510Var2 = oh61Var8.k;
                        Integer num = ((ns5) obj).b;
                        int iIntValue = num.intValue();
                        if (iIntValue == 0) {
                            Flowable flowableT = flowable.T(dbmVar.c(1).v()).T(g510Var2.d(oh61Var8.z).map(new nh61((byte) 19)).flatMapCompletable(new mh61(oh61Var8, (byte) 10)).v());
                            nh61 nh61Var = new nh61((byte) 20);
                            flowableT.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT, nh61Var).x(new nh61((byte) 21)).J(new nh61((byte) 22)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 23));
                        }
                        if (iIntValue == 1) {
                            Flowable flowableT2 = flowable.T(dbmVar.c(1).v()).T(g510Var2.j(oh61Var8.z).map(new nh61((byte) 13)).flatMapCompletable(new mh61(oh61Var8, (byte) 9)).v());
                            nh61 nh61Var2 = new nh61((byte) 14);
                            flowableT2.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT2, nh61Var2).x(new nh61((byte) 16)).J(new nh61((byte) 17)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 18));
                        }
                        if (iIntValue == 50 || iIntValue == 80 || iIntValue == 100 || iIntValue == 120 || iIntValue == 150 || iIntValue == 200 || iIntValue == 300) {
                            return oh61Var8.j(num.intValue());
                        }
                        return IapException.a("Unexpected playback speed " + num);
                    case 8:
                        oh61 oh61Var9 = ((hv5) ifl1Var2.b).a;
                        int i9 = AppProtocolRemoteService.f1;
                        return oh61Var9.j((int) (((ot5) obj).b.floatValue() * 100.0f));
                    case 9:
                        oh61 oh61Var10 = ((hv5) ifl1Var2.b).a;
                        int i10 = AppProtocolRemoteService.f1;
                        return oh61Var10.k((zs5) obj);
                    case 10:
                        oh61 oh61Var11 = ((hv5) ifl1Var2.b).a;
                        int i11 = AppProtocolRemoteService.f1;
                        Flowable flowable2 = oh61Var11.f;
                        return Observable.combineLatest(x0d.j(flowable2, flowable2).startWith(new CompletableFromAction(new ok70(oh61Var11.m, 4)).w()), yoi1.i(oh61Var11.g.a(o6n.a), o6x.a).startWithItem(Boolean.FALSE).distinctUntilChanged(), new mh61(oh61Var11, (byte) 3));
                    case 11:
                        oh61 oh61Var12 = ((hv5) ifl1Var2.b).a;
                        int i12 = AppProtocolRemoteService.f1;
                        Flowable flowable3 = oh61Var12.h;
                        ObservableFromPublisher observableFromPublisherJ = x0d.j(flowable3, flowable3);
                        ys5 ys5Var = zs5.Companion;
                        Objects.requireNonNull(ys5Var);
                        return observableFromPublisherJ.map(new nh61(ys5Var, (byte) 15)).flatMap(new mh61(oh61Var12, (byte) 11));
                    case 12:
                        ft5 ft5Var = (ft5) obj;
                        oh61 oh61Var13 = ((hv5) ifl1Var2.b).a;
                        int i13 = AppProtocolRemoteService.f1;
                        return oh61Var13.h.T(oh61Var13.m.c(1).v()).z().flatMapCompletable(new h341(oh61Var13, ft5Var, (byte) 6)).d(Observable.just(wq5Var)).startWith(oh61Var13.k.c(oh61Var13.z, ft5Var.d.booleanValue()).ignoreElement().w());
                    case 13:
                        mq5 mq5Var = (mq5) obj;
                        oh61 oh61Var14 = ((hv5) ifl1Var2.b).a;
                        int i14 = AppProtocolRemoteService.f1;
                        Integer num2 = mq5Var.c;
                        int iIntValue2 = num2 == null ? 20 : num2.intValue();
                        String str2 = mq5Var.b;
                        if (str2.equals("spotify:recently-played")) {
                            str2 = "com.spotify.recently-played";
                        } else if (str2.equals("spotify:browse")) {
                            str2 = "com.spotify.browse";
                        }
                        String str3 = str2;
                        c610 c610Var = oh61Var14.u;
                        hlr0 hlr0Var = new hlr0();
                        UbiSpecificationId ubiSpecificationId = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var = oh61Var14.o.c;
                        String str4 = cr5Var.e;
                        String str5 = cr5Var.d;
                        String str6 = oh61Var14.y;
                        m210 m210Var2 = oh61Var14.z;
                        if (m210Var2 == null) {
                            m210Var2 = oh61.D;
                        }
                        return c610Var.c(new r9c(str6, str3, str4, str5, m210Var2, false, true, false, false, hlr0Var, 2, 1, ubiSpecificationId, (String) null, false, false, false), new Bundle()).map(new mp5(mq5Var, iIntValue2, (byte) 8)).doOnError(new fv5(str3, (byte) 21)).toObservable().doOnSubscribe(new po5(oh61Var14, mq5Var, (byte) 5)).startWith(oh61Var14.m.c(8).w());
                    case 14:
                        oh61 oh61Var15 = ((hv5) ifl1Var2.b).a;
                        int i15 = AppProtocolRemoteService.f1;
                        return oh61Var15.l((rt5) obj);
                    case 15:
                        oh61 oh61Var16 = ((hv5) ifl1Var2.b).a;
                        int i16 = AppProtocolRemoteService.f1;
                        Flowable flowable4 = oh61Var16.h;
                        return x0d.j(flowable4, flowable4).map(new nh61((byte) 1)).flatMap(new mh61(oh61Var16, (byte) 4));
                    case 16:
                        oh61 oh61Var17 = ((hv5) ifl1Var2.b).a;
                        int i17 = AppProtocolRemoteService.f1;
                        return oh61Var17.k.n(oh61Var17.z).map(new nh61((byte) 2)).flatMap(new mh61(oh61Var17, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var17.m.c(1).w());
                    case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                        oh61 oh61Var18 = ((hv5) ifl1Var2.b).a;
                        int i18 = AppProtocolRemoteService.f1;
                        return oh61Var18.k.o(oh61Var18.z).map(new f341((byte) 21)).zipWith(oh61Var18.h.z(), new f341((byte) 22)).flatMap(new h341(oh61Var18, (ut5) obj, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var18.m.c(1).w());
                    case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                        jr5 jr5Var = (jr5) obj;
                        oh61 oh61Var19 = ((hv5) ifl1Var2.b).a;
                        int i19 = AppProtocolRemoteService.f1;
                        return Observable.just(jr5Var).startWith(oh61Var19.m.c(1).w()).switchMap(new mh61(oh61Var19, (byte) 1)).flatMapSingle(new mh61(oh61Var19, (byte) 2)).filter(new f341((byte) 24)).map(new f341((byte) 25)).flatMap(new h341(oh61Var19, jr5Var, (byte) 7)).timeout(15L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new f341((byte) 26));
                    case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                        pu5 pu5Var = (pu5) obj;
                        oh61 oh61Var20 = ((hv5) ifl1Var2.b).a;
                        int i20 = AppProtocolRemoteService.f1;
                        Observable observable = oh61Var20.h.T(oh61Var20.m.c(2).v()).z().toObservable();
                        g510 g510Var3 = oh61Var20.k;
                        return observable.startWith(g510.q(g510Var3, oh61Var20.z, g510Var3.h.e(pu5Var.b)).ignoreElement().w()).map(new h341(oh61Var20, pu5Var, (byte) 8));
                    case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                        oh61 oh61Var21 = ((hv5) ifl1Var2.b).a;
                        int i21 = AppProtocolRemoteService.f1;
                        return oh61Var21.c.a.k.b().map(new nh61((byte) 9));
                    case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                        oh61 oh61Var22 = ((hv5) ifl1Var2.b).a;
                        int i22 = AppProtocolRemoteService.f1;
                        return oh61Var22.m.c(4).d(Observable.just(new ws5()));
                    case 22:
                        oh61 oh61Var23 = ((hv5) ifl1Var2.b).a;
                        int i23 = AppProtocolRemoteService.f1;
                        return oh61Var23.i((vu5) obj);
                    case 23:
                        oh61 oh61Var24 = ((hv5) ifl1Var2.b).a;
                        int i24 = AppProtocolRemoteService.f1;
                        return oh61Var24.l.a(((sr5) obj).b.intValue(), oh61Var24.z).q(oh61Var24.m.c(1)).d(Observable.just(wq5Var));
                    case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                        oh61 oh61Var25 = ((hv5) ifl1Var2.b).a;
                        int i25 = AppProtocolRemoteService.f1;
                        return new poj0(oh61Var25.c, oh61Var25.j, oh61Var25.h, oh61Var25.n, (byte) 10).r(oh61Var25.a.getResources()).startWith(oh61Var25.m.c(4).w()).firstOrError().toObservable().map(new f341((byte) 27));
                    case 25:
                        oh61 oh61Var26 = ((hv5) ifl1Var2.b).a;
                        int i26 = AppProtocolRemoteService.f1;
                        Flowable flowable5 = oh61Var26.h;
                        iu5 iu5Var = ju5.Companion;
                        Objects.requireNonNull(iu5Var);
                        Flowable flowableT3 = flowable5.J(new nh61(iu5Var, (byte) 8)).T(oh61Var26.m.c(4).v());
                        flowableT3.getClass();
                        return new ObservableFromPublisher(flowableT3);
                    case 26:
                        pr5 pr5Var = (pr5) obj;
                        oh61 oh61Var27 = ((hv5) ifl1Var2.b).a;
                        int i27 = AppProtocolRemoteService.f1;
                        cr5 cr5Var2 = oh61Var27.o.c;
                        return Single.create(new u2i0(oh61Var27, pr5Var, cr5Var2.l, cr5Var2.k, true)).toObservable().startWith(oh61Var27.m.b(4, pr5Var).w());
                    case 27:
                        oh61 oh61Var28 = ((hv5) ifl1Var2.b).a;
                        int i28 = AppProtocolRemoteService.f1;
                        return oh61Var28.h.T(oh61Var28.m.c(4).v()).z().toObservable().map(new nh61((byte) 0));
                    case 28:
                        oh61 oh61Var29 = ((hv5) ifl1Var2.b).a;
                        int i29 = AppProtocolRemoteService.f1;
                        return oh61Var29.f();
                    default:
                        ct5 ct5Var = (ct5) obj;
                        oh61 oh61Var30 = ((hv5) ifl1Var2.b).a;
                        int i30 = AppProtocolRemoteService.f1;
                        if (ct5Var != null) {
                            str = ct5Var.b;
                            if ("default".equals(str)) {
                                if ("car".equals(oh61Var30.z.f)) {
                                    str = "default-cars";
                                } else {
                                    str = "default";
                                }
                            }
                        } else if ("car".equals(oh61Var30.z.f)) {
                            str = "default-cars";
                        } else {
                            str = "default";
                        }
                        Observable observableJust = (oh61Var30.o.c.e.equals("com.google.android.apps.maps") && str.equals("default")) ? Observable.just(new yr5(0, 0, 0, z6x.a)) : null;
                        if (observableJust != null) {
                            return observableJust;
                        }
                        oh61Var30.y = str;
                        Bundle bundleG = cy30.g("_type", str);
                        String str7 = oh61Var30.f31p;
                        hlr0 hlr0Var2 = new hlr0();
                        UbiSpecificationId ubiSpecificationId2 = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var3 = oh61Var30.o.c;
                        String str8 = cr5Var3.e;
                        String str9 = cr5Var3.d;
                        m210 m210Var3 = oh61Var30.z;
                        if (m210Var3 == null) {
                            m210Var3 = oh61.D;
                        }
                        return oh61Var30.u.c(new r9c(str, str7, str8, str9, m210Var3, true, true, false, false, hlr0Var2, 2, 1, ubiSpecificationId2, (String) null, false, false, false), bundleG).map(new nh61((byte) 7)).toObservable().startWith(oh61Var30.m.c(8).w()).doOnSubscribe(new fv5(oh61Var30, (byte) 19));
                }
            }
        }));
        final byte b30 = 23;
        gv5Var2.accept(new v5y(sr5.class, "com.spotify.skip_to_index_in_queue", 1, new w5y() { // from class: p.e2s
            /* JADX WARN: Code duplicated, block: B:11:0x0044  */
            /* JADX WARN: Code duplicated, block: B:12:0x0047  */
            /* JADX WARN: Code duplicated, block: B:9:0x0038  */
            @Override // p.w5y
            public final Observable a(Object obj) {
                String str;
                byte b110 = b30;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                wq5 wq5Var = cv5.a;
                final byte b111 = 0;
                final byte b112 = 1;
                ifl1 ifl1Var2 = ifl1Var;
                switch (b110) {
                    case 0:
                        oh61 oh61Var = ((hv5) ifl1Var2.b).a;
                        int i = AppProtocolRemoteService.f1;
                        g510 g510Var = oh61Var.k;
                        m210 m210Var = oh61Var.z;
                        String strP = g510Var.p();
                        if (strP == null) {
                            strP = "";
                        }
                        return g510.q(g510Var, m210Var, g510Var.h.j(strP)).flatMapCompletable(new mh61(oh61Var, (byte) 7)).d(oh61Var.c.b().a().takeUntil(new nh61((byte) 4)).flatMap(new nh61((byte) 5)).timeout(25L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new nh61((byte) 6)));
                    case 1:
                        oh61 oh61Var2 = ((hv5) ifl1Var2.b).a;
                        int i2 = AppProtocolRemoteService.f1;
                        return oh61Var2.h((pu5) obj);
                    case 2:
                        oh61 oh61Var3 = ((hv5) ifl1Var2.b).a;
                        int i3 = AppProtocolRemoteService.f1;
                        return oh61Var3.e.b("type").startWith(new CompletableFromAction(new w43(oh61Var3.m, (byte) 6)).w()).map(new f341((byte) 17)).onErrorResumeNext(new f341((byte) 29));
                    case 3:
                        oh61 oh61Var4 = ((hv5) ifl1Var2.b).a;
                        int i4 = AppProtocolRemoteService.f1;
                        return oh61Var4.i((vu5) obj);
                    case 4:
                        su5 su5Var = (su5) obj;
                        oh61 oh61Var5 = ((hv5) ifl1Var2.b).a;
                        int i5 = AppProtocolRemoteService.f1;
                        return Single.create(new jf11((Object) su5Var, (byte) 18)).flatMap(new h341(oh61Var5, su5Var, (byte) 9)).toObservable().startWith(oh61Var5.m.c(2).w());
                    case 5:
                        final ks5 ks5Var = (ks5) obj;
                        final oh61 oh61Var6 = ((hv5) ifl1Var2.b).a;
                        int i6 = AppProtocolRemoteService.f1;
                        return oh61Var6.k.l(ks5Var.b.longValue(), oh61Var6.z).map(new f341((byte) 23)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b113 = b111;
                                ks5 ks5Var3 = ks5Var;
                                oh61 oh61Var8 = oh61Var6;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b113) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek in song", (byte) 18)).toObservable().startWith(oh61Var6.m.c(1).w());
                    case 6:
                        final ks5 ks5Var2 = (ks5) obj;
                        final oh61 oh61Var7 = ((hv5) ifl1Var2.b).a;
                        int i7 = AppProtocolRemoteService.f1;
                        return oh61Var7.k.k(ks5Var2.b.longValue(), oh61Var7.z).map(new f341((byte) 28)).flatMap(new Function() { // from class: p.lh61
                            public final Object apply(Object obj2) {
                                byte b113 = b112;
                                ks5 ks5Var3 = ks5Var2;
                                oh61 oh61Var8 = oh61Var7;
                                spq0 spq0Var = (spq0) obj2;
                                switch (b113) {
                                    case 0:
                                        return oh61Var8.v.j(ks5Var3.b.longValue(), spq0Var);
                                    default:
                                        return oh61Var8.v.i(ks5Var3.b.longValue(), spq0Var);
                                }
                            }
                        }).map(new hfr("Cannot seek by in a song", (byte) 18)).toObservable().startWith(oh61Var7.m.c(1).w());
                    case 7:
                        oh61 oh61Var8 = ((hv5) ifl1Var2.b).a;
                        int i8 = AppProtocolRemoteService.f1;
                        dbm dbmVar = oh61Var8.m;
                        Flowable flowable = oh61Var8.h;
                        g510 g510Var2 = oh61Var8.k;
                        Integer num = ((ns5) obj).b;
                        int iIntValue = num.intValue();
                        if (iIntValue == 0) {
                            Flowable flowableT = flowable.T(dbmVar.c(1).v()).T(g510Var2.d(oh61Var8.z).map(new nh61((byte) 19)).flatMapCompletable(new mh61(oh61Var8, (byte) 10)).v());
                            nh61 nh61Var = new nh61((byte) 20);
                            flowableT.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT, nh61Var).x(new nh61((byte) 21)).J(new nh61((byte) 22)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 23));
                        }
                        if (iIntValue == 1) {
                            Flowable flowableT2 = flowable.T(dbmVar.c(1).v()).T(g510Var2.j(oh61Var8.z).map(new nh61((byte) 13)).flatMapCompletable(new mh61(oh61Var8, (byte) 9)).v());
                            nh61 nh61Var2 = new nh61((byte) 14);
                            flowableT2.getClass();
                            return new ObservableFromPublisher(new FlowableTakeUntilPredicate(flowableT2, nh61Var2).x(new nh61((byte) 16)).J(new nh61((byte) 17)).Y(25L, new FlowableError(Functions.h(new TimeoutException())))).onErrorResumeNext(new nh61((byte) 18));
                        }
                        if (iIntValue == 50 || iIntValue == 80 || iIntValue == 100 || iIntValue == 120 || iIntValue == 150 || iIntValue == 200 || iIntValue == 300) {
                            return oh61Var8.j(num.intValue());
                        }
                        return IapException.a("Unexpected playback speed " + num);
                    case 8:
                        oh61 oh61Var9 = ((hv5) ifl1Var2.b).a;
                        int i9 = AppProtocolRemoteService.f1;
                        return oh61Var9.j((int) (((ot5) obj).b.floatValue() * 100.0f));
                    case 9:
                        oh61 oh61Var10 = ((hv5) ifl1Var2.b).a;
                        int i10 = AppProtocolRemoteService.f1;
                        return oh61Var10.k((zs5) obj);
                    case 10:
                        oh61 oh61Var11 = ((hv5) ifl1Var2.b).a;
                        int i11 = AppProtocolRemoteService.f1;
                        Flowable flowable2 = oh61Var11.f;
                        return Observable.combineLatest(x0d.j(flowable2, flowable2).startWith(new CompletableFromAction(new ok70(oh61Var11.m, 4)).w()), yoi1.i(oh61Var11.g.a(o6n.a), o6x.a).startWithItem(Boolean.FALSE).distinctUntilChanged(), new mh61(oh61Var11, (byte) 3));
                    case 11:
                        oh61 oh61Var12 = ((hv5) ifl1Var2.b).a;
                        int i12 = AppProtocolRemoteService.f1;
                        Flowable flowable3 = oh61Var12.h;
                        ObservableFromPublisher observableFromPublisherJ = x0d.j(flowable3, flowable3);
                        ys5 ys5Var = zs5.Companion;
                        Objects.requireNonNull(ys5Var);
                        return observableFromPublisherJ.map(new nh61(ys5Var, (byte) 15)).flatMap(new mh61(oh61Var12, (byte) 11));
                    case 12:
                        ft5 ft5Var = (ft5) obj;
                        oh61 oh61Var13 = ((hv5) ifl1Var2.b).a;
                        int i13 = AppProtocolRemoteService.f1;
                        return oh61Var13.h.T(oh61Var13.m.c(1).v()).z().flatMapCompletable(new h341(oh61Var13, ft5Var, (byte) 6)).d(Observable.just(wq5Var)).startWith(oh61Var13.k.c(oh61Var13.z, ft5Var.d.booleanValue()).ignoreElement().w());
                    case 13:
                        mq5 mq5Var = (mq5) obj;
                        oh61 oh61Var14 = ((hv5) ifl1Var2.b).a;
                        int i14 = AppProtocolRemoteService.f1;
                        Integer num2 = mq5Var.c;
                        int iIntValue2 = num2 == null ? 20 : num2.intValue();
                        String str2 = mq5Var.b;
                        if (str2.equals("spotify:recently-played")) {
                            str2 = "com.spotify.recently-played";
                        } else if (str2.equals("spotify:browse")) {
                            str2 = "com.spotify.browse";
                        }
                        String str3 = str2;
                        c610 c610Var = oh61Var14.u;
                        hlr0 hlr0Var = new hlr0();
                        UbiSpecificationId ubiSpecificationId = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var = oh61Var14.o.c;
                        String str4 = cr5Var.e;
                        String str5 = cr5Var.d;
                        String str6 = oh61Var14.y;
                        m210 m210Var2 = oh61Var14.z;
                        if (m210Var2 == null) {
                            m210Var2 = oh61.D;
                        }
                        return c610Var.c(new r9c(str6, str3, str4, str5, m210Var2, false, true, false, false, hlr0Var, 2, 1, ubiSpecificationId, (String) null, false, false, false), new Bundle()).map(new mp5(mq5Var, iIntValue2, (byte) 8)).doOnError(new fv5(str3, (byte) 21)).toObservable().doOnSubscribe(new po5(oh61Var14, mq5Var, (byte) 5)).startWith(oh61Var14.m.c(8).w());
                    case 14:
                        oh61 oh61Var15 = ((hv5) ifl1Var2.b).a;
                        int i15 = AppProtocolRemoteService.f1;
                        return oh61Var15.l((rt5) obj);
                    case 15:
                        oh61 oh61Var16 = ((hv5) ifl1Var2.b).a;
                        int i16 = AppProtocolRemoteService.f1;
                        Flowable flowable4 = oh61Var16.h;
                        return x0d.j(flowable4, flowable4).map(new nh61((byte) 1)).flatMap(new mh61(oh61Var16, (byte) 4));
                    case 16:
                        oh61 oh61Var17 = ((hv5) ifl1Var2.b).a;
                        int i17 = AppProtocolRemoteService.f1;
                        return oh61Var17.k.n(oh61Var17.z).map(new nh61((byte) 2)).flatMap(new mh61(oh61Var17, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var17.m.c(1).w());
                    case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                        oh61 oh61Var18 = ((hv5) ifl1Var2.b).a;
                        int i18 = AppProtocolRemoteService.f1;
                        return oh61Var18.k.o(oh61Var18.z).map(new f341((byte) 21)).zipWith(oh61Var18.h.z(), new f341((byte) 22)).flatMap(new h341(oh61Var18, (ut5) obj, (byte) 5)).map(new hfr("Cannot skip song", (byte) 18)).toObservable().startWith(oh61Var18.m.c(1).w());
                    case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                        jr5 jr5Var = (jr5) obj;
                        oh61 oh61Var19 = ((hv5) ifl1Var2.b).a;
                        int i19 = AppProtocolRemoteService.f1;
                        return Observable.just(jr5Var).startWith(oh61Var19.m.c(1).w()).switchMap(new mh61(oh61Var19, (byte) 1)).flatMapSingle(new mh61(oh61Var19, (byte) 2)).filter(new f341((byte) 24)).map(new f341((byte) 25)).flatMap(new h341(oh61Var19, jr5Var, (byte) 7)).timeout(15L, timeUnit, Observable.error(new TimeoutException())).onErrorResumeNext(new f341((byte) 26));
                    case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                        pu5 pu5Var = (pu5) obj;
                        oh61 oh61Var20 = ((hv5) ifl1Var2.b).a;
                        int i20 = AppProtocolRemoteService.f1;
                        Observable observable = oh61Var20.h.T(oh61Var20.m.c(2).v()).z().toObservable();
                        g510 g510Var3 = oh61Var20.k;
                        return observable.startWith(g510.q(g510Var3, oh61Var20.z, g510Var3.h.e(pu5Var.b)).ignoreElement().w()).map(new h341(oh61Var20, pu5Var, (byte) 8));
                    case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                        oh61 oh61Var21 = ((hv5) ifl1Var2.b).a;
                        int i21 = AppProtocolRemoteService.f1;
                        return oh61Var21.c.a.k.b().map(new nh61((byte) 9));
                    case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                        oh61 oh61Var22 = ((hv5) ifl1Var2.b).a;
                        int i22 = AppProtocolRemoteService.f1;
                        return oh61Var22.m.c(4).d(Observable.just(new ws5()));
                    case 22:
                        oh61 oh61Var23 = ((hv5) ifl1Var2.b).a;
                        int i23 = AppProtocolRemoteService.f1;
                        return oh61Var23.i((vu5) obj);
                    case 23:
                        oh61 oh61Var24 = ((hv5) ifl1Var2.b).a;
                        int i24 = AppProtocolRemoteService.f1;
                        return oh61Var24.l.a(((sr5) obj).b.intValue(), oh61Var24.z).q(oh61Var24.m.c(1)).d(Observable.just(wq5Var));
                    case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                        oh61 oh61Var25 = ((hv5) ifl1Var2.b).a;
                        int i25 = AppProtocolRemoteService.f1;
                        return new poj0(oh61Var25.c, oh61Var25.j, oh61Var25.h, oh61Var25.n, (byte) 10).r(oh61Var25.a.getResources()).startWith(oh61Var25.m.c(4).w()).firstOrError().toObservable().map(new f341((byte) 27));
                    case 25:
                        oh61 oh61Var26 = ((hv5) ifl1Var2.b).a;
                        int i26 = AppProtocolRemoteService.f1;
                        Flowable flowable5 = oh61Var26.h;
                        iu5 iu5Var = ju5.Companion;
                        Objects.requireNonNull(iu5Var);
                        Flowable flowableT3 = flowable5.J(new nh61(iu5Var, (byte) 8)).T(oh61Var26.m.c(4).v());
                        flowableT3.getClass();
                        return new ObservableFromPublisher(flowableT3);
                    case 26:
                        pr5 pr5Var = (pr5) obj;
                        oh61 oh61Var27 = ((hv5) ifl1Var2.b).a;
                        int i27 = AppProtocolRemoteService.f1;
                        cr5 cr5Var2 = oh61Var27.o.c;
                        return Single.create(new u2i0(oh61Var27, pr5Var, cr5Var2.l, cr5Var2.k, true)).toObservable().startWith(oh61Var27.m.b(4, pr5Var).w());
                    case 27:
                        oh61 oh61Var28 = ((hv5) ifl1Var2.b).a;
                        int i28 = AppProtocolRemoteService.f1;
                        return oh61Var28.h.T(oh61Var28.m.c(4).v()).z().toObservable().map(new nh61((byte) 0));
                    case 28:
                        oh61 oh61Var29 = ((hv5) ifl1Var2.b).a;
                        int i29 = AppProtocolRemoteService.f1;
                        return oh61Var29.f();
                    default:
                        ct5 ct5Var = (ct5) obj;
                        oh61 oh61Var30 = ((hv5) ifl1Var2.b).a;
                        int i30 = AppProtocolRemoteService.f1;
                        if (ct5Var != null) {
                            str = ct5Var.b;
                            if ("default".equals(str)) {
                                if ("car".equals(oh61Var30.z.f)) {
                                    str = "default-cars";
                                } else {
                                    str = "default";
                                }
                            }
                        } else if ("car".equals(oh61Var30.z.f)) {
                            str = "default-cars";
                        } else {
                            str = "default";
                        }
                        Observable observableJust = (oh61Var30.o.c.e.equals("com.google.android.apps.maps") && str.equals("default")) ? Observable.just(new yr5(0, 0, 0, z6x.a)) : null;
                        if (observableJust != null) {
                            return observableJust;
                        }
                        oh61Var30.y = str;
                        Bundle bundleG = cy30.g("_type", str);
                        String str7 = oh61Var30.f31p;
                        hlr0 hlr0Var2 = new hlr0();
                        UbiSpecificationId ubiSpecificationId2 = UbiSpecificationId.UNKNOWN;
                        cr5 cr5Var3 = oh61Var30.o.c;
                        String str8 = cr5Var3.e;
                        String str9 = cr5Var3.d;
                        m210 m210Var3 = oh61Var30.z;
                        if (m210Var3 == null) {
                            m210Var3 = oh61.D;
                        }
                        return oh61Var30.u.c(new r9c(str, str7, str8, str9, m210Var3, true, true, false, false, hlr0Var2, 2, 1, ubiSpecificationId2, (String) null, false, false, false), bundleG).map(new nh61((byte) 7)).toObservable().startWith(oh61Var30.m.c(8).w()).doOnSubscribe(new fv5(oh61Var30, (byte) 19));
                }
            }
        }));
    }
}
