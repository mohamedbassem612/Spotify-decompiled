package p;

import android.net.Uri;
import android.os.Message;
import android.os.ResultReceiver;
import com.spotify.appauthorization.builtinauth.authenticator.BuiltInAuthException;
import com.spotify.base.java.logging.Logger;
import com.spotify.interapp.service.IapException;
import com.spotify.interapp.service.service.AppProtocolRemoteService;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.musicappplatform.offlineerrors.OfflineDeviceLimitReachedActivity;
import com.spotify.player.model.PlayerState;
import com.spotify.radio.radio.formatlist.RadioFormatListService;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.functions.ObjectHelper;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDoFinally;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowablePublish;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableRefCount;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import io.reactivex.rxjava3.internal.util.ConnectConsumer;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class fv5 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fv5(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [android.app.Service, com.spotify.radio.radio.formatlist.RadioFormatListService] */
    public final void accept(Object obj) {
        an90 an90Var;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                AppProtocolRemoteService appProtocolRemoteService = (AppProtocolRemoteService) obj2;
                int i = AppProtocolRemoteService.f1;
                appProtocolRemoteService.a1 = (x610) obj;
                HashSet<Message> hashSet = appProtocolRemoteService.Z0;
                for (Message message : hashSet) {
                    appProtocolRemoteService.a(message);
                    message.recycle();
                }
                hashSet.clear();
                break;
            case 1:
                olm olmVar = (olm) obj2;
                qq5 qq5Var = (qq5) obj;
                if (!qq5Var.equals((qq5) olmVar.j)) {
                    olmVar.j = qq5Var;
                    olmVar.b(qq5Var);
                }
                break;
            case 2:
                fno fnoVar = (fno) obj2;
                ju5.Companion.getClass();
                ju5 ju5VarA = iu5.a((PlayerState) obj);
                if (!ju5VarA.equals((ju5) fnoVar.k)) {
                    fnoVar.k = ju5VarA;
                    fnoVar.b(ju5VarA);
                }
                break;
            case 3:
                ((hqo) obj2).e = (PlayerState) obj;
                break;
            case 4:
                h5z h5zVar = (h5z) obj2;
                qnw qnwVar = (tnw) obj;
                if (qnwVar instanceof qnw) {
                    h5zVar.accept(qnwVar.a);
                } else if (qnwVar instanceof snw) {
                    Logger.d("Error when checking if we should show effortless login %s", new Object[]{((snw) qnwVar).a});
                }
                break;
            case 5:
                ((oi) obj2).b = ((Boolean) obj).booleanValue();
                break;
            case 6:
                ((suf0) obj2).a.c((re70) obj);
                break;
            case 7:
                ResultReceiver resultReceiver = (ResultReceiver) obj2;
                eeh eehVar = (eeh) obj;
                if (resultReceiver != null) {
                    resultReceiver.send(eehVar.a, eehVar.b);
                }
                break;
            case 8:
                OfflineDeviceLimitReachedActivity offlineDeviceLimitReachedActivity = (OfflineDeviceLimitReachedActivity) obj2;
                int i2 = OfflineDeviceLimitReachedActivity.k1;
                b7x b7xVar = b7x.a;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                xok0 xok0Var = offlineDeviceLimitReachedActivity.j1;
                iu4 iu4Var = offlineDeviceLimitReachedActivity.h1;
                if (zBooleanValue) {
                    int i3 = iu4Var.a() ? 2131959324 : 2131959323;
                    xok0Var.getClass();
                    y6h1 y6h1Var = xok0Var.b;
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("devicelimit_auto_download_dialog", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = true;
                    y6h1 y6h1VarA = x6h1VarC.a();
                    k7h1 k7h1Var = new k7h1();
                    ((xjn) k7h1Var).a = y6h1VarA;
                    ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                    l7h1 l7h1VarA = k7h1Var.a();
                    x6h1 x6h1VarC2 = y6h1Var.c();
                    x6h1VarC2.i.add(new a7h1("devicelimit_auto_download_dialog", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = true;
                    x6h1 x6h1VarC3 = x6h1VarC2.a().c();
                    x6h1VarC3.i.add(new a7h1("button_ok", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    offlineDeviceLimitReachedActivity.o0(i3, l7h1VarA, new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis()));
                } else {
                    int i4 = iu4Var.a() ? 2131959326 : 2131959325;
                    xok0Var.getClass();
                    y6h1 y6h1Var2 = xok0Var.b;
                    x6h1 x6h1VarC4 = y6h1Var2.c();
                    x6h1VarC4.i.add(new a7h1("devicelimit_dialog", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = true;
                    y6h1 y6h1VarA2 = x6h1VarC4.a();
                    k7h1 k7h1Var2 = new k7h1();
                    ((xjn) k7h1Var2).a = y6h1VarA2;
                    ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                    l7h1 l7h1VarA2 = k7h1Var2.a();
                    x6h1 x6h1VarC5 = y6h1Var2.c();
                    x6h1VarC5.i.add(new a7h1("devicelimit_dialog", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = true;
                    x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                    x6h1VarC6.i.add(new a7h1("button_ok", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    offlineDeviceLimitReachedActivity.o0(i4, l7h1VarA2, new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis()));
                }
                break;
            case 9:
                w1t0 w1t0Var = (w1t0) obj2;
                int i5 = w1t0.Z1;
                String string = ((Uri) obj).toString();
                if (((ijl1) w1t0Var).H1 != null) {
                    w1t0Var.l1(string);
                }
                break;
            case 10:
                zsc zscVar = (zsc) obj2;
                vyt0 vyt0Var = (vyt0) obj;
                int i6 = vyt0Var.a;
                String str = vyt0Var.b;
                if (i6 == 14) {
                    hma1 hma1VarEdit = ((wyt0) zscVar.b).a.edit();
                    hma1VarEdit.b(wyt0.b, i6);
                    hma1VarEdit.d(wyt0.c, str);
                    hma1VarEdit.g();
                }
                break;
            case 11:
                fno fnoVar2 = (fno) obj2;
                ns5 ns5Var = new ns5((PlayerState) obj);
                if (ns5Var != ((ns5) fnoVar2.k)) {
                    fnoVar2.k = ns5Var;
                    fnoVar2.b(ns5Var);
                }
                break;
            case 12:
                fno fnoVar3 = (fno) obj2;
                ps5 ps5Var = qs5.Companion;
                yqg yqgVar = (yqg) fnoVar3.k;
                ps5Var.getClass();
                fnoVar3.b(ps5.a((PlayerState) obj, yqgVar));
                break;
            case 13:
                ((e3v0) obj2).a.c((re70) obj);
                break;
            case 14:
                g6v0 g6v0Var = (g6v0) obj2;
                float f = ((ota1) obj).a / 100.0f;
                g6v0Var.g = f;
                g6v0Var.b(new ts5(Float.valueOf(f)));
                break;
            case 15:
                ?? r0 = (RadioFormatListService) obj2;
                int i7 = RadioFormatListService.e;
                r0.d.a(2131963281, new Object[0]);
                r0.stopSelf();
                break;
            case 16:
                fno fnoVar4 = (fno) obj2;
                zs5 zs5Var = new zs5((PlayerState) obj);
                if (!zs5Var.equals((zs5) fnoVar4.k)) {
                    fnoVar4.k = zs5Var;
                    fnoVar4.b(zs5Var);
                }
                break;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                k241 k241Var = (k241) obj2;
                o5e0 o5e0Var = (o5e0) obj;
                kdn0 kdn0Var = k241Var.b;
                if (k241Var.e && q26.e().a.c()) {
                    kdn0Var.m(o5e0Var);
                } else {
                    kdn0Var.j(o5e0Var);
                }
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                p1f0 p1f0Var = (p1f0) obj2;
                Throwable th = (Throwable) obj;
                s24 s24Var = (s24) p1f0Var.b;
                String str2 = "com.spotify.error.client_authentication_failed";
                if (th instanceof BuiltInAuthException) {
                    BuiltInAuthException builtInAuthException = (BuiltInAuthException) th;
                    String str3 = builtInAuthException.b;
                    int i8 = builtInAuthException.a;
                    int iC = l1d.C(i8);
                    if (iC == 0) {
                        str2 = "com.spotify.error.user_not_authorized";
                    } else if (iC == 1) {
                        str2 = "com.spotify.error.not_logged_in";
                    } else if (iC == 2) {
                        str2 = "com.spotify.error.offline_mode_active";
                    } else if (iC != 3 && iC != 4) {
                        eg.m("Unknown AuthError: ".concat(z5c.s(i8)));
                    }
                    IapException iapException = new IapException(new es5(str3), str2);
                    s24Var.Y((es5) iapException.a, iapException.b);
                } else {
                    s24Var.Y(new es5(th.toString()), "com.spotify.error.client_authentication_failed");
                }
                p1f0Var.r(false);
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                oh61 oh61Var = (oh61) obj2;
                g510 g510Var = oh61Var.k;
                g510Var.r(oh61Var.z, g510Var.h.a(oh61Var.f31p), (w7h1) null);
                break;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                ((dbm) obj2).b = (th61) obj;
                break;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                Logger.e((Throwable) obj, "Could not load %s", new Object[]{(String) obj2});
                break;
            case 22:
                zh61 zh61Var = (zh61) obj2;
                nmr0 nmr0Var = (nmr0) obj;
                zh61Var.g = (th61) nmr0Var.a;
                boolean zBooleanValue2 = ((Boolean) nmr0Var.b).booleanValue();
                zh61Var.h = zBooleanValue2;
                zh61Var.b(new lt5(zh61Var.g, zBooleanValue2, zh61Var.k.b()));
                break;
            case 23:
                ze41 ze41Var = (ze41) obj2;
                rt5 rt5Var = new rt5((PlayerState) obj);
                Boolean bool = rt5Var.b;
                if (!ze41Var.h.c() || !bool.equals(ze41Var.h.b())) {
                    ze41Var.h = spq0.d(bool);
                    ze41Var.b(rt5Var);
                }
                break;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                ((AtomicReference) obj2).set(obj);
                break;
            case 25:
                d6b1 d6b1Var = (d6b1) obj2;
                x610 x610Var = (x610) obj;
                Logger.g("Got EIS binder", new Object[0]);
                txh0 txh0Var = d6b1Var.c;
                txh0Var.d = x610Var;
                if (x610Var != null && (an90Var = txh0Var.e) != null) {
                    an90Var.run();
                }
                daq daqVar = d6b1Var.d.a.a.a;
                d6b1Var.c.b = new bkv(x610Var, (g510) daqVar.L5.get(), (r8l) daqVar.ff.get(), daqVar.Y1(), (d8q) daqVar.ef.get());
                h1i0 h1i0Var = d6b1Var.f;
                y490 y490VarA = d6b1Var.a();
                tyh0 tyh0Var = d6b1Var.h;
                h1i0Var.h = y490VarA;
                h1i0Var.g = null;
                Logger.g("Starting MediaSessionStateHandler", new Object[0]);
                ys4 ys4Var = h1i0Var.a;
                FlowableMap flowableMapJ = ys4Var.d.J(f331.c);
                Function function = Functions.a;
                FlowableReplay flowableReplayQ = new FlowableDoFinally(flowableMapJ.t(function).X(new ow3(ys4Var, x610Var, (byte) 4)).L(ys4Var.a), new qs4(ys4Var, (byte) 0)).t(function).Q();
                CompositeDisposable compositeDisposable = h1i0Var.f;
                ConnectConsumer connectConsumer = new ConnectConsumer();
                flowableReplayQ.d0(connectConsumer);
                compositeDisposable.b(connectConsumer.a);
                Flowable flowableX = yoi1.h(h1i0Var.d.c, o6x.a).X(new mre0(flowableReplayQ, (byte) 8));
                flowableX.getClass();
                int i9 = Flowable.a;
                ObjectHelper.a(i9, "bufferSize");
                FlowableRefCount flowableRefCount = new FlowableRefCount(new FlowablePublish(flowableX, i9));
                CompositeDisposable compositeDisposable2 = h1i0Var.f;
                ys4 ys4Var2 = h1i0Var.a;
                compositeDisposable2.b(ys4Var2.d.X(new em3(ys4Var2, x610Var, (byte) 7)).L(h1i0Var.b).subscribe(new rwa0(tyh0Var, (byte) 27)));
                h1i0Var.f.b(flowableRefCount.subscribe(new cj9(h1i0Var, y490VarA, (byte) 3), p.U0));
                h1i0Var.f.b(x610Var.c().i.x(new eea0(h1i0Var, (byte) 20)).b0(flowableRefCount, new mta((byte) 16)).subscribe(new rwa0(y490VarA, (byte) 28), zzc0.X));
                CompositeDisposable compositeDisposable3 = h1i0Var.f;
                s610 s610Var = (s610) x610Var.a.b.get();
                compositeDisposable3.b(s610Var.a.a().map(new n9v((byte) 16)).filter(new n9v((byte) 17)).mergeWith(new ObservableFromPublisher(s610Var.b)).filter(new eb80(h1i0Var, (byte) 26)).observeOn(h1i0Var.b).withLatestFrom(new ObservableFromPublisher(flowableRefCount), new zud0(h1i0Var, (byte) 11)).subscribe(new w090(h1i0Var, y490VarA, (byte) 15), zzc0.t));
                break;
            case 26:
                ((grb1) obj2).g((PlayerState) obj, 2, false);
                break;
            case 27:
                olm olmVar2 = (olm) obj2;
                xt5 xt5Var = (xt5) obj;
                xt5 xt5Var2 = (xt5) olmVar2.i;
                if (xt5Var2 == null || !xt5Var2.equals(xt5Var)) {
                    olmVar2.b(xt5Var);
                }
                olmVar2.i = xt5Var;
                break;
            case 28:
                zmf1 zmf1Var = (zmf1) obj2;
                PlayerState playerState = (PlayerState) obj;
                yqg yqgVar2 = zmf1Var.j;
                Long l = (Long) playerState.position(yqgVar2.b()).e(-1L);
                if (zmf1Var.g != l.longValue()) {
                    zmf1Var.g = l.longValue();
                    zmf1Var.b(new mu5(playerState, yqgVar2));
                }
                break;
            default:
                ((s3i1) obj2).a((Uri) obj);
                break;
        }
    }
}
