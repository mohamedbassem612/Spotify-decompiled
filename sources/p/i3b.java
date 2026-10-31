package p;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessagePresentationStatus;
import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;
import com.spotify.player.model.ContextTrack;
import com.spotify.userinteractivityservice.usercomments.v1.proto.GetCommentCardResponse;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class i3b implements ya, ObservableOnSubscribe, qiw, Function, n2i1, fhd, Producer, myc, av30 {
    public static i3b c;
    public final /* synthetic */ byte a;
    public Object b;

    public i3b(Context context) {
        this.a = (byte) 7;
        Objects.requireNonNull(context);
        this.b = context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? new c89() : new bqd(context);
    }

    public static i3b c(Context context) {
        i3b i3bVar = c;
        if (i3bVar == null) {
            i3bVar = new i3b((byte) 2);
            i3bVar.b = null;
            try {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getAssets().open("branch.json")));
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line);
                    }
                    i3bVar.b = new JSONObject(sb.toString());
                } catch (FileNotFoundException unused) {
                }
            } catch (IOException e) {
                e.getMessage();
            } catch (JSONException e2) {
                e2.getMessage();
            }
            c = i3bVar;
        }
        return i3bVar;
    }

    public Object a(ifl1 ifl1Var, u5y u5yVar) {
        m8b0 m8b0Var = (m8b0) ifl1Var.b;
        boolean z = false;
        if ("com.spotify.queue_spotify_uri".equals(u5yVar.getUri())) {
            aos aosVar = (aos) this.b;
            zq5 zq5Var = aosVar.a;
            zq5Var.getClass();
            if ("app".equalsIgnoreCase(zq5Var.c.g)) {
                zq5 zq5Var2 = aosVar.a;
                zq5Var2.getClass();
                if (zq5Var2.f != null) {
                    zq5 zq5Var3 = aosVar.a;
                    zq5Var3.getClass();
                    String str = (String) zq5Var3.f.get("scopes");
                    if (str != null && str.contains("app-remote-control")) {
                        String[] strArr = {"0.5.0", "0.6.0"};
                        for (int i = 0; i < 2; i++) {
                            String str2 = strArr[i];
                            zq5 zq5Var4 = aosVar.a;
                            zq5Var4.getClass();
                            if (zq5Var4.c.h.startsWith(str2)) {
                                String strD = m8b0Var.d(5);
                                pu5 pu5Var = new pu5();
                                pu5Var.b = strD;
                                pu5Var.c = null;
                                return pu5Var;
                            }
                        }
                    }
                }
            }
        }
        Class clsC = u5yVar.c();
        if (m8b0Var.a.size() == 6) {
            List list = m8b0Var.a;
            if (5 < list.size() && (list.get(5) instanceof uga0) && !fga0.l((ega0) list.get(5)).a.isEmpty()) {
                z = true;
            }
            if (z) {
                return m8b0Var.c(clsC, 5);
            }
        }
        return null;
    }

    public boolean accept(Object obj) {
        switch (this.a) {
            case 0:
                return ((ksk) obj).c == le30.g && ((e3b) this.b).a.d();
            default:
                return ((ksk) obj).c == le30.h && ((ip4) this.b).a();
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 5:
                MessagePresentationStatus messagePresentationStatus = (MessagePresentationStatus) obj;
                messagePresentationStatus.toString();
                CompletableEmpty completableEmpty = (Completable) this.b;
                if (!(messagePresentationStatus instanceof MessagePresentationStatus.Presented)) {
                    completableEmpty = CompletableEmpty.a;
                }
                return completableEmpty.d(Observable.just(rih1.a));
            case 16:
                GetCommentCardResponse getCommentCardResponse = (GetCommentCardResponse) obj;
                if (getCommentCardResponse.q() != tuw.ELIGIBILITY_STATUS_HIDDEN) {
                    return Maybe.e(new mmr0(getCommentCardResponse, ((ContextTrack) this.b).uri()));
                }
                MaybeEmpty maybeEmpty = MaybeEmpty.a;
                maybeEmpty.getClass();
                return maybeEmpty;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                rmq0 rmq0Var = (rmq0) obj;
                djk djkVar = (djk) this.b;
                dto0 dto0Var = djkVar.f10p;
                return new nlk(new lto0(dto0Var.a.g(djkVar.h), new jb00(rmq0Var.a, rmq0Var.b)));
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                String str = (String) obj;
                return ((Flowable) this.b).x(new gap1(str, (byte) 7)).t(Functions.a).U(new kdn(false, str)).q(50L, TimeUnit.MILLISECONDS);
            case 22:
                return rqt0.F(o6x.a, new wt((yon) this.b, (dnh) obj, null, (byte) 26));
            default:
                ArrayList arrayListB = ((chm0) this.b).b();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : arrayListB) {
                    if (obj2 instanceof ftl) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    r7h.W(((ftl) it.next()).b(), arrayList2);
                }
                return o7h.p1(arrayList2);
        }
    }

    public String b() {
        JSONObject jSONObject = (JSONObject) this.b;
        String string = null;
        if (!h(1) && (!h(3) || !h(2) || !h(4))) {
            return null;
        }
        try {
            if (h(1)) {
                return jSONObject.getString("branchKey");
            }
            if (!e().booleanValue()) {
                if (!h(3)) {
                    return null;
                }
                try {
                    string = jSONObject.getString("liveKey");
                    return string;
                } catch (JSONException e) {
                    e.getMessage();
                    return null;
                }
            }
            if (jSONObject == null) {
                return null;
            }
            try {
                if (!jSONObject.has("testKey")) {
                    return null;
                }
                string = jSONObject.getString("testKey");
                return string;
            } catch (JSONException e2) {
                e2.getMessage();
                return null;
            }
            e.getMessage();
            return string;
        } catch (JSONException e3) {
            e3.getMessage();
            return string;
        }
    }

    public void d(Typeface typeface) {
        pzg pzgVar = (pzg) this.b;
        ghd ghdVar = pzgVar.B;
        if (ghdVar != null) {
            ghdVar.e = true;
        }
        if (pzgVar.x != typeface) {
            pzgVar.x = typeface;
            pzgVar.i(false);
        }
    }

    public Boolean e() {
        if (!h(4)) {
            return null;
        }
        try {
            return Boolean.valueOf(((JSONObject) this.b).getBoolean("useTestInstance"));
        } catch (JSONException e) {
            e.getMessage();
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object f(e0m1 e0m1Var, onm onmVar) {
        heo heoVar;
        Exception e;
        seo seoVar;
        String message;
        if (onmVar instanceof heo) {
            heoVar = (heo) onmVar;
            int i = heoVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                heoVar.d = i - Integer.MIN_VALUE;
            } else {
                heoVar = new heo(this, onmVar);
            }
        } else {
            heoVar = new heo(this, onmVar);
        }
        Object objG = heoVar.b;
        int i2 = heoVar.d;
        try {
            if (i2 == 0) {
                hm5.M(objG);
                seo seoVar2 = e0m1Var.a;
                try {
                    tz01 tz01Var = (tz01) this.b;
                    String str = seoVar2.a;
                    String str2 = seoVar2.b;
                    String str3 = seoVar2.c;
                    heoVar.a = seoVar2;
                    heoVar.d = 1;
                    objG = tz01Var.g(str, str2, str3, heoVar);
                    d9n d9nVar = d9n.a;
                    if (objG == d9nVar) {
                        return d9nVar;
                    }
                    seoVar = seoVar2;
                } catch (Exception e2) {
                    e = e2;
                    seoVar = seoVar2;
                    teo teoVarA = ueo.a(e, 6);
                    message = e.getMessage();
                    if (message == null) {
                        message = "Cue audio resolution failed";
                    }
                    return new i1m1(teoVarA.a, message, teoVarA.b, seoVar.e);
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                seoVar = heoVar.a;
                try {
                    hm5.M(objG);
                } catch (Exception e3) {
                    e = e3;
                    teo teoVarA2 = ueo.a(e, 6);
                    message = e.getMessage();
                    if (message == null) {
                        message = "Cue audio resolution failed";
                    }
                    return new i1m1(teoVarA2.a, message, teoVarA2.b, seoVar.e);
                }
            }
            return new j1m1((String) objG, seoVar.e);
        } catch (CancellationException e4) {
            throw e4;
        }
    }

    public boolean g() {
        return ((JSONObject) this.b) != null;
    }

    public Object get() {
        switch (this.a) {
            case 15:
                return new SchedulerWorkRunner(((u9h) this.b).b);
            default:
                return new DispatcherWorker(((llo) this.b).c);
        }
    }

    public boolean h(int i) {
        String str;
        JSONObject jSONObject = (JSONObject) this.b;
        if (jSONObject == null) {
            return false;
        }
        switch (i) {
            case 1:
                str = "branchKey";
                break;
            case 2:
                str = "testKey";
                break;
            case 3:
                str = "liveKey";
                break;
            case 4:
                str = "useTestInstance";
                break;
            case 5:
                str = "enableLogging";
                break;
            case 6:
                str = "deferInitForPluginRuntime";
                break;
            case 7:
                str = "apiUrl";
                break;
            case 8:
                str = "fbAppId";
                break;
            case 9:
                str = "cppLevel";
                break;
            case 10:
                str = "installReferrerFetchTimeout";
                break;
            default:
                throw null;
        }
        return jSONObject.has(str);
    }

    public void i(String str, ns60 ns60Var) {
        gmx gmxVar;
        ps60 ps60Var = ns60Var.a;
        String str2 = ps60Var.a;
        String str3 = ps60Var.b;
        if (str3 == null) {
            str3 = str2;
        }
        String str4 = ps60Var.c;
        if (str4 == null) {
            str4 = "";
        }
        ve10 ve10Var = new ve10(str2, str3, str4);
        ps60 ps60Var2 = ns60Var.b;
        String str5 = ps60Var2.a;
        String str6 = ps60Var2.b;
        if (str6 == null) {
            str6 = str5;
        }
        String str7 = ps60Var2.c;
        ve10 ve10Var2 = new ve10(str5, str6, str7 != null ? str7 : "");
        lp90 lp90Var = ns60Var.c;
        String str8 = lp90Var.b;
        switch (l1d.C(lp90Var.c)) {
            case 0:
            case 7:
            case 8:
            case 9:
            case 16:
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                gmxVar = jmx.c;
                break;
            case 1:
                gmxVar = gmx.c;
                break;
            case 2:
                gmxVar = nmx.c;
                break;
            case 3:
                gmxVar = hmx.c;
                break;
            case 4:
                gmxVar = lmx.c;
                break;
            case 5:
                gmxVar = unx.c;
                break;
            case 6:
                gmxVar = omx.c;
                break;
            case 10:
                gmxVar = jnx.c;
                break;
            case 11:
                gmxVar = omx.c;
                break;
            case 12:
                gmxVar = lmx.c;
                break;
            case 13:
                gmxVar = fmx.c;
                break;
            case 14:
                gmxVar = cux.c;
                break;
            case 15:
                gmxVar = gmx.c;
                break;
            default:
                eg.o();
                return;
        }
        ngd ngdVar = new ngd(ve10Var, ve10Var2, str8, gmxVar, ns60Var.d);
        ser serVar = (ser) this.b;
        String str9 = nik1.v5.a;
        Bundle bundle = new Bundle();
        bundle.putParcelable("cancel.join.request.sheet.args", ngdVar);
        serVar.a(str, str9, bundle);
    }

    public br21 j() {
        byp bypVar = (byp) this.b;
        Context context = (Context) bypVar.b;
        c8o.l(context);
        uu00 uu00Var = (uu00) bypVar.d;
        c8o.l(uu00Var);
        Flowable flowable = (Flowable) bypVar.h;
        c8o.l(flowable);
        q8n q8nVar = (q8n) bypVar.i;
        c8o.l(q8nVar);
        k811 k811Var = new k811(uu00Var, flowable, q8nVar, (byte) 27);
        gw70 gw70Var = (gw70) bypVar.e;
        c8o.l(gw70Var);
        c8o.l(context);
        bjx bjxVar = new bjx(context);
        zxa zxaVar = (zxa) bypVar.c;
        c8o.l(zxaVar);
        c8o.l(q8nVar);
        return new br21(context, k811Var, gw70Var, bjxVar, zxaVar, q8nVar);
    }

    public xaz0 k() {
        sj71 sj71Var = (sj71) this.b;
        Context context = sj71Var.g;
        w13 w13Var = sj71Var.b;
        xrc0 xrc0Var = sj71Var.q;
        me30 me30Var = sj71Var.m;
        npm1 npm1Var = sj71Var.H;
        boolean z = sj71Var.F;
        return new xaz0(new fdc(w13Var, new swm0(xrc0Var, (byte) 24), new pux0(xrc0Var, me30Var, (byte) 2), new fp7(context, z), npm1Var, z), (byte) 28);
    }

    public xap l() {
        sj71 sj71Var = (sj71) this.b;
        RetrofitMaker retrofitMaker = sj71Var.u;
        cxc cxcVar = sj71Var.s;
        Context context = sj71Var.g;
        zg0 zg0Var = sj71Var.a;
        r7n0 r7n0Var = sj71Var.t;
        DisplayMetrics displayMetrics = sj71Var.h;
        boolean z = sj71Var.A;
        boolean z2 = sj71Var.G;
        boolean z3 = sj71Var.E;
        boolean z4 = sj71Var.C;
        boolean z5 = sj71Var.B;
        boolean z6 = sj71Var.D;
        boolean z7 = sj71Var.z;
        int i = sj71Var.o;
        int i2 = sj71Var.y;
        eyh0 eyh0Var = sj71Var.x;
        o771 o771Var = sj71Var.w;
        cn3 cn3Var = sj71Var.l;
        uo5 uo5Var = sj71Var.k;
        t7y t7yVar = sj71Var.j;
        gya gyaVar = sj71Var.e;
        gw70 gw70Var = sj71Var.n;
        zxa zxaVar = sj71Var.d;
        jyu jyuVar = sj71Var.i;
        y1t0 y1t0Var = sj71Var.v;
        q8n q8nVar = sj71Var.r;
        q8n q8nVar2 = sj71Var.f40p;
        return new xap(new cik1(retrofitMaker, cxcVar, new xap(new mnt(context, zg0Var, r7n0Var, displayMetrics, z, z2, z3, z4, z5, z6, z7, i, i2, eyh0Var, o771Var, cn3Var, uo5Var, t7yVar, gyaVar, gw70Var, zxaVar, jyuVar, y1t0Var, q8nVar, q8nVar2, sj71Var.c), (byte) 0).g(), q8nVar2, (byte) 11), (byte) 1);
    }

    public boolean s(Uri uri) {
        return ((x8g) this.b).c(uri);
    }

    public void subscribe(ObservableEmitter observableEmitter) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            eg.m("Must subscribe to createBluetoothA2dpObservable on main thread!");
            return;
        }
        jfb jfbVar = (jfb) this.b;
        aia aiaVar = new aia(jfbVar, observableEmitter, (byte) 1);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.a2dp.profile.action.PLAYING_STATE_CHANGED");
        x74.g0(jfbVar.a, aiaVar, intentFilter, new Handler(Looper.getMainLooper()), 2);
        observableEmitter.setCancellable(new pc6(jfbVar, aiaVar, (byte) 1));
    }

    public void u(dxc dxcVar, Throwable th) {
        ((byh) this.b).completeExceptionally(th);
    }

    public void v(Object obj) {
        Set set = (Set) obj;
        b9c b9cVar = (b9c) this.b;
        set.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : set) {
            if (nhc1.Y((String) obj2, "spotify:episode", false)) {
                arrayList.add(obj2);
            }
        }
        b9cVar.a.d(o7h.p1(arrayList));
    }

    public void z(dxc dxcVar, sy21 sy21Var) {
        ((byh) this.b).complete(sy21Var);
    }

    public /* synthetic */ i3b(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ i3b(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj3;
    }

    public i3b(i4q i4qVar, xgc xgcVar) {
        this.a = (byte) 20;
        this.b = i4qVar;
    }

    public i3b(mr20 mr20Var) {
        this.a = (byte) 11;
        this.b = rqt0.u(new nwd(mr20Var, (byte) 7));
    }

    public /* synthetic */ i3b(byte b) {
        this.a = b;
    }
}
