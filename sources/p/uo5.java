package p;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.os.Trace;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.startup.StartupException;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.spotify.base.java.logging.Logger;
import com.spotify.concertview.concertfeedview.v1.DateFilter;
import com.spotify.concertview.concertfeedview.v1.FeedFilter;
import com.spotify.concertview.concertfeedview.v1.GetConceptsRequest;
import com.spotify.concertview.concertfeedview.v1.GetFeedNextPageRequest;
import com.spotify.concertview.concertfeedview.v1.GetFeedRequest;
import com.spotify.image.esperanto.proto.EsImage;
import com.spotify.liveeventslocation.v1.userlocation.DeleteUserLocationRequest;
import com.spotify.liveeventsview.v2.liveeventsfeed.LocalDateRange;
import io.reactivex.rxjava3.core.Observable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class uo5 implements a6a1, m6m, f5t, rue0, kir0 {
    public static uo5 X;
    public static volatile uo5 Z;
    public static volatile uo5 e;
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;
    public static final Object f = new Object();
    public static final ehn g = new ehn((byte) 0);
    public static final fhn h = new fhn(0);
    public static final ejn i = new ejn();
    public static final m4c t = new m4c((byte) 10);
    public static final yla Y = new yla((byte) 21);

    public uo5(String str) {
        Matcher matcher;
        zzg1 zzg1Var;
        this.a = (byte) 7;
        this.b = str;
        zzg1[] zzg1VarArrValues = zzg1.values();
        int iS = zno1.s(zzg1VarArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS < 16 ? 16 : iS);
        int i2 = 0;
        for (zzg1 zzg1Var2 : zzg1VarArrValues) {
            linkedHashMap.put(zzg1Var2, Pattern.compile("(spotify:artist:([a-zA-Z0-9]+))".concat(zzg1Var2.a())));
        }
        this.d = linkedHashMap;
        zzg1[] zzg1VarArrValues2 = zzg1.values();
        int length = zzg1VarArrValues2.length;
        Matcher matcher2 = null;
        while (true) {
            if (i2 >= length) {
                matcher = matcher2;
                zzg1Var = null;
                break;
            }
            zzg1Var = zzg1VarArrValues2[i2];
            Object obj = ((LinkedHashMap) this.d).get(zzg1Var);
            obj.getClass();
            matcher = ((Pattern) obj).matcher((String) this.b);
            if (matcher.find()) {
                break;
            }
            i2++;
            matcher2 = matcher;
        }
        if (zzg1Var == null) {
            hhg1.n("Specified artistUri doesn't match any type");
            throw null;
        }
        if (matcher == null) {
            u890.C("matcher");
            throw null;
        }
        String strGroup = matcher.group(2);
        strGroup.getClass();
        this.c = strGroup;
    }

    public static uo5 F(Context context) {
        if (e == null) {
            synchronized (f) {
                try {
                    if (e == null) {
                        e = new uo5(context, (byte) 0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    public static void I(d520 d520Var, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            d520Var.K(str, "aqs.".concat(str2)).createNewFile();
        } catch (IOException unused) {
            ws10.Z.h();
        }
    }

    public static final void t() {
        if (((Boolean) new l1k((byte) 14).invoke()).booleanValue()) {
            return;
        }
        ws10 ws10Var = ws10.Z;
        Thread.currentThread().getName();
        ws10Var.c();
    }

    public static final void u() {
        if (((Boolean) new l1k((byte) 15).invoke()).booleanValue()) {
            return;
        }
        ws10 ws10Var = ws10.Z;
        Thread.currentThread().getName();
        ws10Var.c();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public boolean A(Object obj) throws NoWhenBranchMatchedException {
        tve0 tve0Var = (vve0) this.b;
        if (tve0Var instanceof tve0) {
            boolean zAccept = tve0Var.a.accept(obj);
            uo5 uo5Var = (uo5) this.c;
            if (uo5Var == null) {
                uo5 uo5Var2 = (uo5) this.d;
                if (uo5Var2 == null) {
                    return zAccept;
                }
                if (zAccept || uo5Var2.A(obj)) {
                    return true;
                }
            } else if (zAccept && uo5Var.A(obj)) {
                return true;
            }
        } else {
            if (!(tve0Var instanceof uve0)) {
                eg.o();
                return false;
            }
            boolean zA = ((uve0) tve0Var).a().A(obj);
            uo5 uo5Var3 = (uo5) this.c;
            if (uo5Var3 == null || zA) {
                uo5 uo5Var4 = (uo5) this.d;
                if (uo5Var4 != null && zA) {
                    return true;
                }
                if (uo5Var3 != null) {
                    return uo5Var3.A(obj);
                }
                return uo5Var4 != null ? uo5Var4.A(obj) : zA;
            }
        }
        return false;
    }

    public Object B(String str, gg00 gg00Var) {
        ul40 ul40VarN = GetConceptsRequest.n();
        ul40VarN.q();
        if (str != null && str.length() != 0) {
            ul40VarN.n(str);
        }
        return ((wlk) this.c).b(ul40VarN.build(), gg00Var);
    }

    public Object C(Integer num, LocalDateRange localDateRange, ArrayList arrayList, db3 db3Var) {
        in40 in40VarO = GetFeedRequest.o();
        in40VarO.r();
        in40VarO.n(nig.c);
        if (((xrk) this.d).d) {
            in40VarO.n(nig.d);
        }
        if (localDateRange != null || num != null || !arrayList.isEmpty()) {
            up10 up10VarO = FeedFilter.o();
            if (localDateRange != null) {
                g5r g5rVarN = DateFilter.n();
                g5rVarN.q(localDateRange.o());
                g5rVarN.n(localDateRange.n());
                up10VarO.r(g5rVarN.build());
            }
            if (num != null) {
                up10VarO.q(String.valueOf(num.intValue()));
            }
            if (!arrayList.isEmpty()) {
                up10VarO.n(arrayList);
            }
            in40VarO.q(up10VarO.build());
        }
        return ((wlk) this.c).a(in40VarO.build(), db3Var);
    }

    public Object D(String str, hg00 hg00Var) {
        gn40 gn40VarO = GetFeedNextPageRequest.o();
        gn40VarO.q(str);
        gn40VarO.n(nig.c);
        if (((xrk) this.d).d) {
            gn40VarO.n(nig.d);
        }
        return ((wlk) this.c).c(gn40VarO.build(), hg00Var);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public Object E(String str, int i2, int i3, ir20 ir20Var, onm onmVar) {
        c5t c5tVar;
        if (onmVar instanceof c5t) {
            c5tVar = (c5t) onmVar;
            int i4 = c5tVar.c;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c5tVar.c = i4 - Integer.MIN_VALUE;
            } else {
                c5tVar = new c5t(this, onmVar);
            }
        } else {
            c5tVar = new c5t(this, onmVar);
        }
        c5t c5tVar2 = c5tVar;
        Object objH = c5tVar2.a;
        int i5 = c5tVar2.c;
        try {
            if (i5 == 0) {
                hm5.M(objH);
                o8n o8nVar = ((llm) this.d).a;
                d5t d5tVar = new d5t(str, ir20Var, i2, i3, this, (lnm) null);
                c5tVar2.c = 1;
                objH = c921.H(o8nVar, d5tVar, c5tVar2);
                d9n d9nVar = d9n.a;
                if (objH == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i5 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objH);
            }
            return (EsImage.ImageData) objH;
        } catch (CancellationException unused) {
            return null;
        } catch (RuntimeException e2) {
            if (!(e2.getCause() instanceof InterruptedException)) {
                throw e2;
            }
            return null;
        }
    }

    public boolean G() {
        FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.c;
        swm0 swm0Var = (swm0) this.d;
        if (swm0Var.a("gcm.n.noui")) {
            return true;
        }
        if (!((KeyguardManager) firebaseMessagingService.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int iMyPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == iMyPid) {
                        if (runningAppProcessInfo.importance != 100) {
                            break;
                        }
                        return false;
                    }
                }
            }
        }
        ms70 ms70VarC = ms70.c(swm0Var.j("gcm.n.image"));
        if (ms70VarC != null) {
            ms70VarC.e((ExecutorService) this.b);
        }
        xid xidVarA = qsh.a(firebaseMessagingService, swm0Var);
        dko0 dko0Var = (dko0) xidVarA.b;
        if (ms70VarC != null) {
            try {
                Bitmap bitmap = (Bitmap) o0c.h(ms70VarC.d(), 5L, TimeUnit.SECONDS);
                dko0Var.m(bitmap);
                bko0 bko0Var = new bko0();
                bko0Var.h(bitmap);
                bko0Var.g();
                dko0Var.r(bko0Var);
            } catch (InterruptedException unused) {
                ms70VarC.close();
                Thread.currentThread().interrupt();
            } catch (ExecutionException e2) {
                Objects.toString(e2.getCause());
            } catch (TimeoutException unused2) {
                ms70VarC.close();
            }
        }
        Log.isLoggable("FirebaseMessaging", 3);
        ((NotificationManager) firebaseMessagingService.getSystemService("notification")).notify((String) xidVarA.c, 0, dko0Var.c());
        return true;
    }

    public tfj0 H() {
        tfj0 tfj0Var = (tfj0) this.d;
        if (tfj0Var == null) {
            String strE = ((dma1) this.b).e(ufj0.a(), null);
            if (strE == null || (tfj0Var = (tfj0) ((nfa0) this.c).a(strE, tfj0.Companion.serializer())) == null) {
                tfj0Var = new tfj0();
            }
            this.d = tfj0Var;
        }
        return tfj0Var;
    }

    public void J(Object[] objArr) {
        cpc1 cpc1Var = new cpc1();
        System.currentTimeMillis();
        cpc1Var.c((bpc1) this.c);
        Thread.currentThread().getName();
        cpc1Var.b(objArr);
        ((LinkedBlockingQueue) this.d).add(cpc1Var);
    }

    public void K(Object obj, Object obj2) {
        if (obj2 instanceof Throwable) {
            J(new Object[]{obj});
        } else {
            J(new Object[]{obj, obj2});
        }
    }

    public Uri L(InputStream inputStream, l420 l420Var) {
        try {
            r420 r420VarL = ((oi) this.b).l(l420Var);
            o0c.w(inputStream, r420VarL);
            r420VarL.close();
            return ((uf0) this.d).c(l420Var.b, ((y1t0) this.c).k());
        } catch (IOException e2) {
            Logger.d(e2.getMessage(), new Object[0]);
            return null;
        }
    }

    public void M(hww0 hww0Var, boolean z) {
        boolean zEquals;
        Parcelable parcelable = (hww0) this.d;
        this.d = hww0Var;
        if (z) {
            SharedPreferences sharedPreferences = ((ae) this.c).a;
            if (hww0Var != null) {
                JSONObject jSONObjectA = hww0Var.a();
                if (jSONObjectA != null) {
                    sharedPreferences.edit().putString("com.facebook.ProfileManager.CachedProfile", jSONObjectA.toString()).apply();
                }
            } else {
                sharedPreferences.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
            }
        }
        if (parcelable == null) {
            zEquals = hww0Var == null;
        } else {
            zEquals = parcelable.equals(hww0Var);
        }
        if (zEquals) {
            return;
        }
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", parcelable);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", (Parcelable) hww0Var);
        ((zce0) this.b).c(intent);
    }

    public l8o0 N(NetworkCapabilities networkCapabilities) {
        if (!networkCapabilities.hasCapability(12)) {
            return k8o0.a;
        }
        int iQ = 0;
        boolean zHasTransport = networkCapabilities.hasTransport(0);
        boolean zHasTransport2 = networkCapabilities.hasTransport(1);
        boolean zHasCapability = networkCapabilities.hasCapability(11);
        boolean z = !networkCapabilities.hasCapability(13);
        if (zHasTransport) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) ((idd1) this.c).getValue();
                if (telephonyManager != null) {
                    iQ = u2o1.q(telephonyManager.getDataNetworkType());
                }
            } catch (SecurityException unused) {
            }
        }
        return new j8o0(zHasTransport2, zHasTransport, zHasCapability, z, iQ, networkCapabilities.hasCapability(16) ? 1 : 2);
    }

    public Observable a() {
        xh81 xh81Var = (xh81) this.c;
        return Observable.merge(xh81Var.c().a, yoi1.i(xh81Var.a, o6x.a).switchMap(new upa0(this, (byte) 17)).distinctUntilChanged());
    }

    public void b(Object obj) {
        J(new Object[]{obj});
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public Object c(String str, int i2, int i3, onm onmVar) {
        e5t e5tVar;
        if (onmVar instanceof e5t) {
            e5tVar = (e5t) onmVar;
            int i4 = e5tVar.c;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                e5tVar.c = i4 - Integer.MIN_VALUE;
            } else {
                e5tVar = new e5t(this, onmVar);
            }
        } else {
            e5tVar = new e5t(this, onmVar);
        }
        e5t e5tVar2 = e5tVar;
        Object objE = e5tVar2.a;
        int i5 = e5tVar2.c;
        if (i5 == 0) {
            hm5.M(objE);
            String str2 = new String(Base64.decode(str, 0), nne.a);
            try {
                if (new URI(str2).getScheme() == null) {
                    str2 = "spotify:image:".concat(str2);
                }
            } catch (URISyntaxException unused) {
                str2 = "spotify:image:".concat(str2);
            }
            String str3 = str2;
            ir20 ir20Var = (ir20) this.c;
            e5tVar2.c = 1;
            objE = E(str3, i2, i3, ir20Var, e5tVar2);
            d9n d9nVar = d9n.a;
            if (objE == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i5 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objE);
        }
        EsImage.ImageData imageData = (EsImage.ImageData) objE;
        Float fO = imageData != null ? yah0.o(imageData.p()) : null;
        if (imageData == null || imageData.o() != 0) {
            return null;
        }
        int i6 = b5t.a[imageData.q().ordinal()];
        g5n g5nVar = g5n.d;
        if (i6 != 1) {
            if (i6 == 2) {
                g5nVar = g5n.a;
            } else if (i6 == 3) {
                g5nVar = g5n.b;
            } else if (i6 == 4) {
                g5nVar = g5n.c;
            }
        }
        return new ls70(imageData.getData().q(), g5nVar, fO);
    }

    public void cancel() {
        switch (this.a) {
            case 8:
                ((a6a1) this.b).cancel();
                break;
            case 11:
                smo1.q((llm) this.d);
                break;
            default:
                ((sl00) ((i25) this.d).e).cancel();
                break;
        }
    }

    public void d(String str, Object obj, Object obj2) {
        K(obj, obj2);
    }

    public void e(String str) {
        J(null);
    }

    public void f(String str, Object... objArr) {
        if (pwo1.o(objArr) != null) {
            J(pwo1.z(objArr));
        } else {
            J(objArr);
        }
    }

    public boolean g() {
        return true;
    }

    public Object getId() {
        return this.b;
    }

    public uyl getItem() {
        return (uyl) this.c;
    }

    public String getName() {
        return (String) this.b;
    }

    public k1r getResult() {
        return (k1r) this.d;
    }

    public fka1 getSource() {
        switch (this.a) {
            case 8:
                return (ff01) this.c;
            default:
                return (ql00) this.c;
        }
    }

    public void h(String str, Integer num, Object obj) {
        K(num, obj);
    }

    public void i(String str, Throwable th) {
        J(null);
    }

    public void j(Object obj, Exception exc) {
        K(obj, exc);
    }

    public void k(String str, Exception exc) {
        J(null);
    }

    public void l(Object obj, String str) {
        J(new Object[]{obj});
    }

    public void m(Object obj, String str) {
        J(new Object[]{obj});
    }

    public void n(Object... objArr) {
        if (pwo1.o(objArr) != null) {
            J(pwo1.z(objArr));
        } else {
            J(objArr);
        }
    }

    public void o(String str) {
        J(null);
    }

    public void p(String str) {
        J(null);
    }

    public c291 q() {
        switch (this.a) {
            case 8:
                return (df01) this.d;
            default:
                return (pl00) this.b;
        }
    }

    public uo5 r(rb rbVar) {
        uo5 uo5Var = new uo5(this.b, (byte) 16);
        uo5Var.c = new uo5(rbVar);
        return new uo5(uo5Var);
    }

    public uo5 s(uo5 uo5Var) {
        uo5 uo5Var2 = new uo5(this.b, (byte) 16);
        uo5Var2.c = uo5Var;
        return new uo5(uo5Var2);
    }

    public String toString() {
        switch (this.a) {
            case 7:
                return (String) this.b;
            default:
                return super.toString();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: retrofit2.HttpException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object v(int i2, onm onmVar) throws HttpException {
        eod0 eod0Var;
        if (onmVar instanceof eod0) {
            eod0Var = (eod0) onmVar;
            int i3 = eod0Var.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                eod0Var.c = i3 - Integer.MIN_VALUE;
            } else {
                eod0Var = new eod0(this, onmVar);
            }
        } else {
            eod0Var = new eod0(this, onmVar);
        }
        Object objC = eod0Var.a;
        int i4 = eod0Var.c;
        if (i4 == 0) {
            hm5.M(objC);
            i9t i9tVarN = DeleteUserLocationRequest.n();
            i9tVarN.n(String.valueOf(i2));
            DeleteUserLocationRequest deleteUserLocationRequestBuild = i9tVarN.build();
            cpd0 cpd0Var = (cpd0) this.b;
            deleteUserLocationRequestBuild.getClass();
            eod0Var.c = 1;
            objC = cpd0Var.c(deleteUserLocationRequestBuild, eod0Var);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i4 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objC);
        }
        sy21 sy21Var = (sy21) objC;
        if (sy21Var.a.Q0) {
            return rih1.a;
        }
        throw new HttpException(sy21Var);
    }

    public l8o0 w() {
        idd1 idd1Var = (idd1) this.b;
        try {
            Network activeNetwork = ((ConnectivityManager) idd1Var.getValue()).getActiveNetwork();
            NetworkCapabilities networkCapabilities = activeNetwork != null ? ((ConnectivityManager) idd1Var.getValue()).getNetworkCapabilities(activeNetwork) : null;
            return networkCapabilities != null ? N(networkCapabilities) : k8o0.a;
        } catch (SecurityException unused) {
            return null;
        }
    }

    public ke70 x(y570 y570Var) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.c;
        y570Var.getClass();
        ke70 ke70Var = (ke70) identityHashMap.get(y570Var);
        if (ke70Var != null) {
            return ke70Var;
        }
        ke70 ke70VarC = ke70.c(y570Var, (l670) this.b);
        identityHashMap.put(y570Var, ke70VarC);
        ((IdentityHashMap) this.d).put(ke70VarC.b(), y570Var);
        return ke70VarC;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.startup.StartupException */
    public void y(Bundle bundle) throws StartupException {
        HashSet hashSet = (HashSet) this.c;
        String string = ((Context) this.d).getString(2131952357);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (cd80.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    z((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new StartupException(e2);
            }
        }
    }

    public Object z(Class cls, HashSet hashSet) {
        Object objCreate;
        HashMap map = (HashMap) this.b;
        if (mif1.g()) {
            try {
                String simpleName = cls.getSimpleName();
                if (simpleName.length() > 127) {
                    simpleName = simpleName.substring(0, 127);
                }
                Trace.beginSection(simpleName);
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objCreate = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                cd80 cd80Var = (cd80) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listDependencies = cd80Var.dependencies();
                if (!listDependencies.isEmpty()) {
                    for (Class cls2 : listDependencies) {
                        if (!map.containsKey(cls2)) {
                            z(cls2, hashSet);
                        }
                    }
                }
                objCreate = cd80Var.create((Context) this.d);
                hashSet.remove(cls);
                map.put(cls, objCreate);
            } catch (Throwable th2) {
                throw new StartupException(th2);
            }
        }
        Trace.endSection();
        return objCreate;
    }

    public /* synthetic */ uo5(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ uo5(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ uo5(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public uo5(mwb mwbVar, jt4 jt4Var) {
        this.a = (byte) 6;
        this.b = mwbVar;
        this.c = jt4Var;
        this.d = new x6o0(this, (byte) 20);
    }

    public uo5(ccc0 ccc0Var, g7h g7hVar, c4n0 c4n0Var) {
        this.a = (byte) 9;
        this.b = ccc0Var;
        this.c = g7hVar;
        this.d = new idd1(new d4e(c4n0Var, (byte) 3));
    }

    public uo5(ViewGroup viewGroup, View view, gw70 gw70Var, List list) {
        this.a = (byte) 18;
        this.b = view;
        sb30 sb30VarB = sb30.b(LayoutInflater.from(viewGroup.getContext()));
        this.d = sb30VarB;
        z511 xb30Var = new xb30(gw70Var);
        RecyclerView recyclerView = sb30VarB.b;
        view.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(Integer.min(3, list.size())));
        recyclerView.j(new j1e(view.getResources().getDimensionPixelSize(2131167027), (byte) 12));
        recyclerView.setAdapter(xb30Var);
        xb30Var.A(list);
        PopupWindow popupWindow = new PopupWindow(sb30VarB.a(), -2, -2);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(true);
        popupWindow.setOnDismissListener(tb30.a);
        this.c = popupWindow;
        sb30VarB.a().setOnTouchListener(new lgs(this, (byte) 3));
    }

    public uo5(byte b) {
        this.a = b;
        switch (b) {
            case 14:
                break;
            default:
                this.b = new jhx(new ceo(0.3f, 0.0f, 0.0f, 1.0f), new ceo(0.3f, 0.0f, 0.4f, 1.0f), new ceo(0.0f, 0.0f, 0.0f, 1.0f));
                this.c = new jhx(new ceo(1.0f, 0.0f, 0.7f, 1.0f), new ceo(0.6f, 0.0f, 0.7f, 1.0f), new ceo(1.0f, 0.0f, 1.0f, 1.0f));
                this.d = new jhx(new ceo(0.3f, 0.0f, 0.7f, 1.0f), new ceo(0.3f, 0.0f, 0.7f, 1.0f), new ceo(0.3f, 0.0f, 0.7f, 1.0f));
                break;
        }
    }

    public uo5(HashMap map, HashMap map2, HashMap map3, String str, String str2, String str3) {
        this.a = (byte) 3;
        this.b = map;
        this.c = map2;
        this.d = map3;
    }

    public uo5(l670 l670Var) {
        this.a = (byte) 21;
        this.b = l670Var;
        this.c = new IdentityHashMap();
        this.d = new IdentityHashMap();
    }

    public uo5(ExecutorService executorService, ExecutorService executorService2) {
        this.a = (byte) 2;
        this.b = new djn(executorService);
        this.c = new djn(executorService);
        o0c.z((Object) null);
        this.d = new djn(executorService2);
    }

    public uo5(ur70 ur70Var, ir20 ir20Var, q8n q8nVar) {
        this.a = (byte) 11;
        this.b = ur70Var;
        this.c = ir20Var;
        this.d = cy30.t(q8nVar);
    }

    public uo5(t0n0 t0n0Var, xh81 xh81Var) {
        this.a = (byte) 26;
        this.b = t0n0Var;
        this.c = xh81Var;
        this.d = new zia();
    }

    public uo5(a6a1 a6a1Var) {
        this.a = (byte) 8;
        this.b = a6a1Var;
        this.c = sj1.g(a6a1Var.getSource());
        this.d = sj1.f(a6a1Var.q());
    }

    public uo5(d520 d520Var) {
        this.a = (byte) 1;
        this.c = null;
        this.d = null;
        this.b = d520Var;
    }

    public uo5(FirebaseMessagingService firebaseMessagingService, swm0 swm0Var, ExecutorService executorService) {
        this.a = (byte) 12;
        this.b = executorService;
        this.c = firebaseMessagingService;
        this.d = swm0Var;
    }

    public uo5(Context context, byte b) {
        this.a = b;
        switch (b) {
            case 29:
                this.d = context;
                this.b = new idd1(new o8o0(this, (byte) 0));
                this.c = new idd1(new o8o0(this, (byte) 1));
                break;
            default:
                this.d = context.getApplicationContext();
                this.c = new HashSet();
                this.b = new HashMap();
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public uo5(rb rbVar) {
        this((Object) new tve0(rbVar), (byte) 16);
        this.a = (byte) 16;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public uo5(uo5 uo5Var) {
        this((Object) new uve0(uo5Var), (byte) 16);
        this.a = (byte) 16;
    }

    public uo5(i25 i25Var) {
        this.a = (byte) 15;
        this.d = i25Var;
        sl00 sl00Var = (sl00) i25Var.e;
        this.b = new pl00(i25Var, sl00Var.h().q(), -1L, true);
        this.c = new ql00(i25Var, sl00Var.h().getSource(), -1L, true);
    }
}
