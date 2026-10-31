package p;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.spotify.localfiles.mediastoreimpl.LocalFilesProperties$TestHelper;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CancellationException;
import spotify.collection.esperanto.proto.CollectionContainsRequest;
import spotify.collection.esperanto.proto.CollectionContainsResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gag {
    public final Context a;
    public final msm0 b;
    public final jn7 c;
    public final jn7 d;
    public final oj3 e;
    public final sd41 f;
    public final s4w0 g;
    public final xrc0 h;
    public final kag i;
    public final u9g j;
    public final Handler k = new Handler(Looper.getMainLooper());
    public final llm l;
    public volatile WebView m;
    public volatile boolean n;
    public osm0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public utm0 f4p;
    public zau0 q;
    public r091 r;
    public xab1 s;
    public xab1 t;
    public xab1 u;
    public final ajq0 v;
    public xab1 w;
    public final Object x;
    public final HashMap y;
    public static final Set z = f46.S0(new String[]{"track", "album", "show", "episode", "playlist", "artist", "chapter"});
    public static final Set A = f46.S0(new String[]{"track", "episode", "podcast-chapter"});
    public static final Set B = f46.S0(new String[]{"scdn.co", "spotifycdn.com"});

    public gag(Context context, msm0 msm0Var, jn7 jn7Var, jn7 jn7Var2, oj3 oj3Var, sd41 sd41Var, s4w0 s4w0Var, xrc0 xrc0Var, kag kagVar, u9g u9gVar, lag lagVar, jut jutVar) {
        this.a = context;
        this.b = msm0Var;
        this.c = jn7Var;
        this.d = jn7Var2;
        this.e = oj3Var;
        this.f = sd41Var;
        this.g = s4w0Var;
        this.h = xrc0Var;
        this.i = kagVar;
        this.j = u9gVar;
        fns fnsVar = igu.a;
        this.l = smo1.e(flo1.l(b3s.c, guo1.B()));
        j3v j3vVar = new j3v((Object) jn7Var, (byte) 12);
        lwe lweVar = new lwe(this, (byte) 13);
        fns fnsVar2 = igu.a;
        bs50 bs50Var = pyf0.a;
        ajq0 ajq0Var = new ajq0();
        ajq0Var.a = j3vVar;
        ajq0Var.b = lagVar;
        ajq0Var.c = lweVar;
        ajq0Var.d = jutVar;
        ajq0Var.e = bs50Var;
        this.v = ajq0Var;
        this.x = new Object();
        this.y = new HashMap();
    }

    public final boolean a(int i, String str) {
        boolean z2;
        synchronized (this.x) {
            try {
                HashMap map = this.y;
                Object n36Var = map.get(str);
                if (n36Var == null) {
                    n36Var = new n36();
                    map.put(str, n36Var);
                }
                n36 n36Var2 = (n36) n36Var;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                while (!n36Var2.isEmpty() && jElapsedRealtime - ((Number) n36Var2.first()).longValue() > 1000) {
                    n36Var2.removeFirst();
                }
                if (n36Var2.c >= i) {
                    z2 = false;
                } else {
                    n36Var2.addLast(Long.valueOf(jElapsedRealtime));
                    z2 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, onm onmVar, boolean z2) {
        x9g x9gVar;
        if (onmVar instanceof x9g) {
            x9gVar = (x9g) onmVar;
            int i = x9gVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                x9gVar.d = i - Integer.MIN_VALUE;
            } else {
                x9gVar = new x9g(this, onmVar);
            }
        } else {
            x9gVar = new x9g(this, onmVar);
        }
        Object objI = x9gVar.b;
        int i2 = x9gVar.d;
        if (i2 == 0) {
            hm5.M(objI);
            x2h x2hVarP = CollectionContainsRequest.p();
            x2hVarP.q(str);
            CollectionContainsRequest collectionContainsRequestBuild = x2hVarP.build();
            x9gVar.a = z2;
            x9gVar.d = 1;
            objI = this.d.i(collectionContainsRequestBuild, x9gVar);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = x9gVar.a;
            hm5.M(objI);
        }
        CollectionContainsResponse collectionContainsResponse = (CollectionContainsResponse) objI;
        Object objS0 = o7h.s0(collectionContainsResponse.q());
        Boolean bool = Boolean.TRUE;
        if (u890.j(objS0, bool)) {
            return z2 ? "followed" : "saved";
        }
        return u890.j(o7h.s0(collectionContainsResponse.p()), bool) ? "banned" : "none";
    }

    public final void c() {
        osm0 osm0VarA = this.o;
        if (osm0VarA == null) {
            osm0VarA = this.b.a(new fz3((byte) 2));
            this.o = osm0VarA;
        }
        utm0 utm0VarB = this.f4p;
        if (utm0VarB == null) {
            utm0VarB = osm0VarA.b(new esm0("chromeless", nyf.g), 1);
            this.f4p = utm0VarB;
        }
        if (this.q == null) {
            zau0 zau0VarC = utm0VarB.c(false);
            this.q = zau0VarC;
            utm0 utm0Var = this.f4p;
            if (utm0Var != null) {
                utm0Var.a(zau0VarC);
            }
        }
        if (this.r == null) {
            zau0 zau0Var = this.q;
            r091 r091VarA = zau0Var != null ? zau0Var.a() : null;
            this.r = r091VarA;
            if (r091VarA != null) {
                r091VarA.k();
            }
        }
    }

    @JavascriptInterface
    public final void closePage() {
        if (!this.n) {
            this.n = true;
            smo1.p(this.l, (CancellationException) null);
            this.m = null;
            this.k.post(new w9g(this, (byte) 1));
        }
        this.k.post(new w9g(this, (byte) 0));
    }

    public final void d(String str) {
        Context context = this.a;
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.setPackage(context.getPackageName());
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object e(String str, onm onmVar) {
        cag cagVar;
        Boolean boolValueOf;
        if (onmVar instanceof cag) {
            cagVar = (cag) onmVar;
            int i = cagVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cagVar.c = i - Integer.MIN_VALUE;
            } else {
                cagVar = new cag(this, onmVar);
            }
        } else {
            cagVar = new cag(this, onmVar);
        }
        Object objI = cagVar.a;
        int i2 = cagVar.c;
        if (i2 == 0) {
            hm5.M(objI);
            hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
            sku0 sku0VarP = PlaylistDecorationPolicy.p();
            sku0VarP.E();
            hru0VarS.x(sku0VarP);
            mr20 mr20VarK = this.h.k(str, new trc0(hru0VarS.build(), (g3d0) null, (Set) null, false, (src0) null, jqz0.a, (prc0) null, 0, (List) null, 478));
            cagVar.c = 1;
            objI = b5p1.i(mr20VarK, cagVar);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objI);
        }
        oy21 oy21Var = (py21) objI;
        oy21Var.getClass();
        if (oy21Var instanceof ly21) {
            boolValueOf = Boolean.FALSE;
        } else {
            if (!(oy21Var instanceof oy21)) {
                eg.o();
                return null;
            }
            boolValueOf = Boolean.valueOf(((wsc0) oy21Var.a).f.g);
        }
        return boolValueOf.booleanValue() ? "saved" : "none";
    }

    public final void f(String str, String str2) {
        WebView webView;
        if (!syo1.z(str) || this.n || (webView = this.m) == null) {
            return;
        }
        this.k.post(new hw9(this, webView, str, str2, (byte) 2));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a0, code lost:
    
        if (r8 == r5) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(java.lang.String r7, p.onm r8) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.gag.g(java.lang.String, p.onm):java.lang.Object");
    }

    @JavascriptInterface
    public final float getBottomInset() {
        if (this.n) {
            return 0.0f;
        }
        return Float.valueOf(0.0f).floatValue();
    }

    @JavascriptInterface
    public final void getCollectionStateAsync(String str, String str2) {
        if (!this.n && syo1.z(str2)) {
            if (!this.j.c || !syo1.A(str)) {
                f(str2, fga0.c("none").toString());
                return;
            }
            xab1 xab1Var = this.w;
            if (xab1Var != null) {
                xab1Var.d((CancellationException) null);
            }
            this.w = fn31.T(this.l, (o8n) null, 0, new vs0(str, this, str2, (lnm) null, (byte) 26), 3);
        }
    }

    @JavascriptInterface
    public final void hasPreciseLocationPermissionAsync(String str) {
        if (!this.n && syo1.z(str)) {
            if (this.j.e) {
                fn31.T(this.l, (o8n) null, 0, new y9g((byte) 0, str, this, null), 3);
            } else {
                f(str, LocalFilesProperties$TestHelper.FALSE);
            }
        }
    }

    @JavascriptInterface
    public final void isCurrentlyPlayingAsync(String str, String str2) {
        if (!this.n && syo1.z(str2)) {
            if (!this.j.b || !syo1.A(str)) {
                f(str2, LocalFilesProperties$TestHelper.FALSE);
                return;
            }
            xab1 xab1Var = this.t;
            if (xab1Var != null) {
                xab1Var.d((CancellationException) null);
            }
            this.t = fn31.T(this.l, (o8n) null, 0, new hff(this, str, str2, (lnm) null, (byte) 3), 3);
        }
    }

    @JavascriptInterface
    public final void navigate(String str) {
        if (!this.n && this.j.d && syo1.A(str) && a(5, "navigate")) {
            d(str);
        }
    }

    @JavascriptInterface
    public final void pausePlayback() {
        if (!this.n && this.j.b) {
            fn31.T(this.l, (o8n) null, 0, new z9g(this, (lnm) null, (byte) 0), 3);
        }
    }

    @JavascriptInterface
    public final void playBetamax(String str) {
        String host;
        if (!this.n && this.j.b && str.length() <= 2048) {
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            if (!u890.j(scheme != null ? scheme.toLowerCase(Locale.ROOT) : null, "https") || (host = uri.getHost()) == null || ihc1.y0(host)) {
                return;
            }
            String lowerCase = host.toLowerCase(Locale.ROOT);
            Set<String> set = B;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                for (String str2 : set) {
                    if (lowerCase.equals(str2)) {
                        break;
                    }
                    if (nhc1.R(lowerCase, "." + str2, false)) {
                        break;
                    }
                }
            }
            if (a(10, "playBetamax")) {
                this.k.post(new nx30(this, str, (byte) 9));
            }
        }
    }

    @JavascriptInterface
    public final void playUri(String str) {
        if (!this.n && this.j.b && syo1.A(str)) {
            List listQ0 = ihc1.Q0(str, new String[]{":"}, 0, 6);
            if (listQ0.size() >= 2 && u890.j(listQ0.get(0), "spotify") && z.contains(listQ0.get(1)) && a(5, "playUri")) {
                fn31.T(this.l, (o8n) null, 0, new aag(this, str, null), 3);
            }
        }
    }

    @JavascriptInterface
    public final void playVideo(String str) {
        ajq0 ajq0Var;
        if (this.n) {
            return;
        }
        u9g u9gVar = this.j;
        if (u9gVar.b && u9gVar.f && syo1.A(str)) {
            List listQ0 = ihc1.Q0(str, new String[]{":"}, 0, 6);
            if (listQ0.size() >= 2 && u890.j(listQ0.get(0), "spotify") && A.contains(listQ0.get(1)) && a(5, "playVideo") && (ajq0Var = this.v) != null) {
                xab1 xab1Var = this.u;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                this.u = fn31.T(this.l, (o8n) null, 0, new bag(ajq0Var, str, (lnm) null, (byte) 0), 3);
            }
        }
    }

    @JavascriptInterface
    public final void removeFromCollection(String str) {
        if (!this.n && this.j.c && syo1.A(str) && a(5, "removeFromCollection")) {
            fn31.T(this.l, (o8n) null, 0, new aag((byte) 1, str, this, null), 3);
        }
    }

    @JavascriptInterface
    public final void requestPreciseLocationPermissionAsync(String str) {
        if (!this.n && syo1.z(str)) {
            if (!this.j.e) {
                f(str, LocalFilesProperties$TestHelper.FALSE);
            } else if (a(2, "requestPreciseLocationPermission")) {
                fn31.T(this.l, (o8n) null, 0, new y9g((byte) 1, str, this, null), 3);
            } else {
                f(str, LocalFilesProperties$TestHelper.FALSE);
            }
        }
    }

    @JavascriptInterface
    public final void saveToCollection(String str) {
        if (!this.n && this.j.c && syo1.A(str) && a(5, "saveToCollection")) {
            fn31.T(this.l, (o8n) null, 0, new aag((byte) 2, str, this, null), 3);
        }
    }

    @JavascriptInterface
    public final void showContextMenu(String str) {
        if (!this.n && this.j.d && syo1.A(str) && a(5, "showContextMenu")) {
            d(str);
        }
    }

    @JavascriptInterface
    public final void stopBetamax() {
        if (!this.n && this.j.b) {
            this.k.post(new w9g(this, (byte) 2));
        }
    }

    @JavascriptInterface
    public final void stopPlayback() {
        pausePlayback();
    }

    @JavascriptInterface
    public final void subscribeToPlayerState() {
        if (!this.n && this.j.b) {
            xab1 xab1Var = this.s;
            if (xab1Var != null) {
                xab1Var.d((CancellationException) null);
            }
            this.s = fn31.T(this.l, (o8n) null, 0, new z9g(this, (lnm) null, (byte) 1), 3);
        }
    }
}
