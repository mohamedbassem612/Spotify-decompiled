package p;

import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RemoteViews;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.base.java.logging.Logger;
import com.spotify.login.adaptiveauthentication.challenge.web.NoAnimLauncherActivity;
import com.spotify.player.model.PlayerState;
import com.spotify.pses.v1.proto.Header;
import com.spotify.voiceassistants.playermodels.PlayIntent;
import com.spotify.voiceassistants.playermodels.SearchEndpointRequest;
import com.spotify.voiceassistants.playermodels.SpeakeasyDualResponse;
import com.spotify.voiceassistants.playermodels.VoiceAssistantLoggingContext;
import com.spotify.voiceassistants.playermodels.VoiceAssistantsPerformance;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.io.File;
import java.io.FileInputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mxa1 implements Function {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    /* JADX WARN: Multi-variable type inference failed */
    public mxa1(byp bypVar, mxa1 mxa1Var, List list, String str, String str2) {
        b7x linkedHashMap;
        this.a = (byte) 5;
        this.b = bypVar;
        this.d = mxa1Var;
        this.c = str;
        this.e = str2;
        s1c1 s1c1Var = (s1c1) ((ks6) bypVar.b).a;
        int i = 0;
        this.f = ((voe0) s1c1Var).b(new k0h1(this, 0 == true ? 1 : 0));
        this.g = ((voe0) s1c1Var).b(new k0h1(this, (byte) 1));
        if (list.isEmpty()) {
            linkedHashMap = b7x.a;
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                wgy0 wgy0Var = (wgy0) it.next();
                linkedHashMap.put(Integer.valueOf(wgy0Var.d), new kit((byp) this.b, wgy0Var, i));
                i++;
            }
        }
        this.h = linkedHashMap;
    }

    public static final /* synthetic */ lqo1 D(mxa1 mxa1Var) {
        return (lqo1) mxa1Var.g;
    }

    public static qx81 a(qx81 qx81Var, a8b0 a8b0Var) {
        g6b0 g6b0VarS = rzn1.s(qx81Var);
        fg5 annotations = qx81Var.getAnnotations();
        a8b0 a8b0VarC = kbb.C(qx81Var);
        List listZ = kbb.z(qx81Var);
        List listL0 = o7h.l0(1, kbb.D(qx81Var));
        ArrayList arrayList = new ArrayList(q7h.U(listL0, 10));
        Iterator it = listL0.iterator();
        while (it.hasNext()) {
            arrayList.add(((e1h1) it.next()).b());
        }
        return kbb.r(g6b0VarS, annotations, a8b0VarC, listZ, arrayList, a8b0Var, true).x0(qx81Var.u0());
    }

    public static mxa1 f(String str, d520 d520Var, uo5 uo5Var) throws Throwable {
        List listB;
        FileInputStream fileInputStream;
        Throwable th;
        dij0 dij0Var = new dij0(d520Var);
        mxa1 mxa1Var = new mxa1(str, d520Var, uo5Var);
        ((ava0) ((AtomicMarkableReference) ((wh41) mxa1Var.e).c).getReference()).c(dij0Var.c(str, false));
        ((ava0) ((AtomicMarkableReference) ((wh41) mxa1Var.f).c).getReference()).c(dij0Var.c(str, true));
        ((AtomicMarkableReference) mxa1Var.h).set(dij0Var.d(str), false);
        xaz0 xaz0Var = (xaz0) mxa1Var.g;
        File fileK = d520Var.K(str, "rollouts-state");
        if (!fileK.exists() || fileK.length() == 0) {
            dij0.g(fileK, "The file has a length of zero for session: " + str);
            listB = Collections.EMPTY_LIST;
        } else {
            FileInputStream fileInputStream2 = null;
            try {
                try {
                    fileInputStream = new FileInputStream(fileK);
                    try {
                        listB = dij0.b(eth.T(fileInputStream));
                        listB.toString();
                        Log.isLoggable("FirebaseCrashlytics", 3);
                        eth.k(fileInputStream);
                    } catch (Exception unused) {
                        fileInputStream2 = fileInputStream;
                        dij0.f(fileK);
                        eth.k(fileInputStream2);
                        listB = Collections.EMPTY_LIST;
                    } catch (Throwable th2) {
                        th = th2;
                        eth.k(fileInputStream);
                        throw th;
                    }
                } catch (Exception unused2) {
                }
            } catch (Throwable th3) {
                fileInputStream = fileInputStream2;
                th = th3;
            }
        }
        synchronized (xaz0Var) {
            ((ArrayList) xaz0Var.b).clear();
            if (listB.size() > 128) {
                ((ArrayList) xaz0Var.b).addAll(listB.subList(0, 128));
            } else {
                ((ArrayList) xaz0Var.b).addAll(listB);
            }
        }
        return mxa1Var;
    }

    public static final ArrayList k(rgy0 rgy0Var, mxa1 mxa1Var) {
        List list = rgy0Var.d;
        rgy0 rgy0VarZ = p2o1.z(rgy0Var, (l141) ((byp) mxa1Var.b).d);
        ArrayList arrayListK = rgy0VarZ != null ? k(rgy0VarZ, mxa1Var) : null;
        if (arrayListK == null) {
            arrayListK = z6x.a;
        }
        return o7h.N0(arrayListK, list);
    }

    public static e0h1 l(List list, fg5 fg5Var) {
        e0h1 e0h1VarD;
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            ((cys) it.next()).getClass();
            if (fg5Var.isEmpty()) {
                e0h1.b.getClass();
                e0h1VarD = e0h1.c;
            } else {
                ffe1 ffe1Var = e0h1.b;
                List listSingletonList = Collections.singletonList(new ig5(fg5Var));
                ffe1Var.getClass();
                e0h1VarD = ffe1.d(listSingletonList);
            }
            arrayList.add(e0h1VarD);
        }
        ArrayList arrayListV = q7h.V(arrayList);
        e0h1.b.getClass();
        return ffe1.d(arrayListV);
    }

    public static final beg n(mxa1 mxa1Var, rgy0 rgy0Var, int i) {
        byp bypVar = (byp) mxa1Var.b;
        heg hegVarX = dem1.x((zjn0) bypVar.c, i);
        ArrayList arrayListL0 = z561.l0(new sgg1(j141.Y, z561.c0(new k0h1(mxa1Var, (byte) 2), rgy0Var)));
        Iterator it = z561.c0(l0h1.b, hegVarX).iterator();
        int i2 = 0;
        while (it.hasNext()) {
            it.next();
            i2++;
            if (i2 < 0) {
                p7h.S();
                throw null;
            }
        }
        while (arrayListL0.size() < i2) {
            arrayListL0.add(0);
        }
        return ((poj0) ((ks6) bypVar.b).X).p(hegVarX, arrayListL0);
    }

    public static final WebView z(mxa1 mxa1Var, ayh ayhVar) {
        WebView webView = new WebView(new MutableContextWrapper(((Context) mxa1Var.b).getApplicationContext()));
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setHorizontalScrollBarEnabled(false);
        webView.setVerticalScrollBarEnabled(false);
        webView.setOverScrollMode(2);
        webView.addJavascriptInterface((utw0) mxa1Var.f, "zzmb");
        webView.setWebViewClient(new lp8(ayhVar, webView, mxa1Var));
        String languageTag = Locale.getDefault().toLanguageTag();
        String str = (String) ((brk1) mxa1Var.e).f;
        int length = str.length();
        int length2 = String.valueOf(languageTag).length();
        String str2 = (String) mxa1Var.c;
        StringBuilder sb = new StringBuilder(length + 4 + length2 + 3 + String.valueOf(str2).length());
        bb00.j(sb, str, "?hl=", languageTag, "&k=");
        sb.append(str2);
        webView.loadUrl(sb.toString());
        return webView;
    }

    public void A(Class cls, egp1 egp1Var) {
        HashMap map = (HashMap) this.f;
        if (!map.containsKey(cls)) {
            map.put(cls, egp1Var);
        } else {
            String string = cls.toString();
            hhg1.n(l1d.q(new StringBuilder(string.length() + 40), "ParametersSerializer for ", string, " already added."));
        }
    }

    public odn1 B() {
        i2i1 i2i1Var;
        i2i1 i2i1Var2;
        pdn1 pdn1Var = (pdn1) this.b;
        if (pdn1Var == null) {
            k220.r("Cannot build without a RSA SSA PKCS1 public key");
            return null;
        }
        i2i1 i2i1Var3 = (i2i1) this.c;
        if (i2i1Var3 == null || (i2i1Var = (i2i1) this.e) == null) {
            k220.r("Cannot build without prime factors");
            return null;
        }
        i2i1 i2i1Var4 = (i2i1) this.d;
        if (i2i1Var4 == null) {
            k220.r("Cannot build without private exponent");
            return null;
        }
        i2i1 i2i1Var5 = (i2i1) this.f;
        if (i2i1Var5 == null || (i2i1Var2 = (i2i1) this.g) == null) {
            k220.r("Cannot build without prime exponents");
            return null;
        }
        i2i1 i2i1Var6 = (i2i1) this.h;
        if (i2i1Var6 == null) {
            k220.r("Cannot build without CRT coefficient");
            return null;
        }
        BigInteger bigInteger = pdn1Var.d.b;
        BigInteger bigInteger2 = pdn1Var.e;
        BigInteger bigInteger3 = (BigInteger) i2i1Var3.b;
        BigInteger bigInteger4 = (BigInteger) i2i1Var.b;
        BigInteger bigInteger5 = (BigInteger) i2i1Var4.b;
        BigInteger bigInteger6 = (BigInteger) i2i1Var5.b;
        BigInteger bigInteger7 = (BigInteger) i2i1Var2.b;
        BigInteger bigInteger8 = (BigInteger) i2i1Var6.b;
        if (!bigInteger3.isProbablePrime(10)) {
            k220.r("p is not a prime");
            return null;
        }
        if (!bigInteger4.isProbablePrime(10)) {
            k220.r("q is not a prime");
            return null;
        }
        if (!bigInteger3.multiply(bigInteger4).equals(bigInteger2)) {
            k220.r("Prime p times prime q is not equal to the public key's modulus");
            return null;
        }
        BigInteger bigInteger9 = BigInteger.ONE;
        BigInteger bigIntegerSubtract = bigInteger3.subtract(bigInteger9);
        BigInteger bigIntegerSubtract2 = bigInteger4.subtract(bigInteger9);
        if (!bigInteger.multiply(bigInteger5).mod(bigIntegerSubtract.divide(bigIntegerSubtract.gcd(bigIntegerSubtract2)).multiply(bigIntegerSubtract2)).equals(bigInteger9)) {
            k220.r("D is invalid.");
            return null;
        }
        if (!bigInteger.multiply(bigInteger6).mod(bigIntegerSubtract).equals(bigInteger9)) {
            k220.r("dP is invalid.");
            return null;
        }
        if (!bigInteger.multiply(bigInteger7).mod(bigIntegerSubtract2).equals(bigInteger9)) {
            k220.r("dQ is invalid.");
            return null;
        }
        if (bigInteger4.multiply(bigInteger8).mod(bigInteger3).equals(bigInteger9)) {
            return new odn1((pdn1) this.b, (i2i1) this.c, (i2i1) this.e, (i2i1) this.d, (i2i1) this.f, (i2i1) this.g, (i2i1) this.h);
        }
        k220.r("qInv is invalid.");
        return null;
    }

    public xdn1 C() {
        i2i1 i2i1Var;
        i2i1 i2i1Var2;
        ydn1 ydn1Var = (ydn1) this.b;
        if (ydn1Var == null) {
            k220.r("Cannot build without a RSA SSA PKCS1 public key");
            return null;
        }
        i2i1 i2i1Var3 = (i2i1) this.c;
        if (i2i1Var3 == null || (i2i1Var = (i2i1) this.e) == null) {
            k220.r("Cannot build without prime factors");
            return null;
        }
        i2i1 i2i1Var4 = (i2i1) this.d;
        if (i2i1Var4 == null) {
            k220.r("Cannot build without private exponent");
            return null;
        }
        i2i1 i2i1Var5 = (i2i1) this.f;
        if (i2i1Var5 == null || (i2i1Var2 = (i2i1) this.g) == null) {
            k220.r("Cannot build without prime exponents");
            return null;
        }
        i2i1 i2i1Var6 = (i2i1) this.h;
        if (i2i1Var6 == null) {
            k220.r("Cannot build without CRT coefficient");
            return null;
        }
        BigInteger bigInteger = ydn1Var.d.b;
        BigInteger bigInteger2 = ydn1Var.e;
        BigInteger bigInteger3 = (BigInteger) i2i1Var3.b;
        BigInteger bigInteger4 = (BigInteger) i2i1Var.b;
        BigInteger bigInteger5 = (BigInteger) i2i1Var4.b;
        BigInteger bigInteger6 = (BigInteger) i2i1Var5.b;
        BigInteger bigInteger7 = (BigInteger) i2i1Var2.b;
        BigInteger bigInteger8 = (BigInteger) i2i1Var6.b;
        if (!bigInteger3.isProbablePrime(10)) {
            k220.r("p is not a prime");
            return null;
        }
        if (!bigInteger4.isProbablePrime(10)) {
            k220.r("q is not a prime");
            return null;
        }
        if (!bigInteger3.multiply(bigInteger4).equals(bigInteger2)) {
            k220.r("Prime p times prime q is not equal to the public key's modulus");
            return null;
        }
        BigInteger bigInteger9 = BigInteger.ONE;
        BigInteger bigIntegerSubtract = bigInteger3.subtract(bigInteger9);
        BigInteger bigIntegerSubtract2 = bigInteger4.subtract(bigInteger9);
        if (!bigInteger.multiply(bigInteger5).mod(bigIntegerSubtract.divide(bigIntegerSubtract.gcd(bigIntegerSubtract2)).multiply(bigIntegerSubtract2)).equals(bigInteger9)) {
            k220.r("D is invalid.");
            return null;
        }
        if (!bigInteger.multiply(bigInteger6).mod(bigIntegerSubtract).equals(bigInteger9)) {
            k220.r("dP is invalid.");
            return null;
        }
        if (!bigInteger.multiply(bigInteger7).mod(bigIntegerSubtract2).equals(bigInteger9)) {
            k220.r("dQ is invalid.");
            return null;
        }
        if (bigInteger4.multiply(bigInteger8).mod(bigInteger3).equals(bigInteger9)) {
            return new xdn1((ydn1) this.b, (i2i1) this.c, (i2i1) this.e, (i2i1) this.d, (i2i1) this.f, (i2i1) this.g, (i2i1) this.h);
        }
        k220.r("qInv is invalid.");
        return null;
    }

    public void E(String str, agp1 agp1Var) {
        HashMap map = (HashMap) this.g;
        if (map.containsKey(str)) {
            hhg1.n(l1d.q(new StringBuilder(str.length() + 29), "KeyParser for ", str, " already added."));
        } else {
            map.put(str, agp1Var);
        }
    }

    public void F(String str, cgp1 cgp1Var) {
        HashMap map = (HashMap) this.h;
        if (map.containsKey(str)) {
            hhg1.n(l1d.q(new StringBuilder(str.length() + 36), "ParametersParser for ", str, " already added."));
        } else {
            map.put(str, cgp1Var);
        }
    }

    public Object apply(Object obj) {
        Completable completableA;
        switch (this.a) {
            case 8:
                String str = (String) obj;
                tp7 tp7Var = (tp7) this.b;
                PlayIntent playIntent = (PlayIntent) this.d;
                m210 m210Var = (m210) this.f;
                String str2 = (String) this.c;
                String str3 = (String) this.e;
                zle1 zle1Var = (zle1) this.g;
                t45 t45Var = (t45) this.h;
                return tp7Var.e(m210Var, t45Var).map(new vi11(t45Var, playIntent, tp7Var, m210Var, str3, (byte) 25)).observeOn((Scheduler) tp7Var.d).flatMapCompletable(new mxa1((Object) tp7Var, (Object) playIntent, (Object) str2, (Object) str3, (Object) str, (Object) zle1Var, (Object) t45Var, (byte) 9));
            default:
                SearchEndpointRequest searchEndpointRequest = (SearchEndpointRequest) obj;
                tp7 tp7Var2 = (tp7) this.b;
                PlayIntent playIntent2 = (PlayIntent) this.d;
                VoiceAssistantLoggingContext voiceAssistantLoggingContext = new VoiceAssistantLoggingContext((String) this.c, playIntent2.getUri().toString(), (String) this.e, (String) this.f);
                aoa1 aoa1Var = (aoa1) tp7Var2.k;
                Uri uri = playIntent2.getUri();
                zle1 zle1Var2 = (zle1) this.g;
                t45 t45Var2 = (t45) this.h;
                bmk1 bmk1Var = aoa1Var.b;
                HashMap map = aoa1Var.f;
                gyv0 gyv0Var = (gyv0) map.get(uri);
                if (gyv0Var == null) {
                    Logger.k("playPreparedUri called without preceding searchAndPrepare. Will search and play once search returns.", new Object[0]);
                    t45.m(t45Var2, VoiceAssistantsPerformance.MEASURE_PREPARE_URI, 4);
                    completableA = aoa1Var.a(uri, searchEndpointRequest, zle1Var2, t45Var2, voiceAssistantLoggingContext);
                    gyv0 gyv0Var2 = (gyv0) map.get(uri);
                    if (gyv0Var2 != null) {
                        gyv0Var2.b = true;
                    }
                } else if (gyv0Var.a) {
                    SpeakeasyDualResponse speakeasyDualResponse = gyv0Var.c;
                    if (speakeasyDualResponse != null) {
                        completableA = ((lv41) bmk1Var).a(searchEndpointRequest, speakeasyDualResponse, zle1Var2, t45Var2, voiceAssistantLoggingContext);
                    } else {
                        Logger.d("Voice search error - playPreparedUri got a null search response. uri=%s, interactionId=%s, packageId=%s, requestedUri=%s, userId=%s", new Object[]{uri, voiceAssistantLoggingContext.getInteractionId(), voiceAssistantLoggingContext.getPackageId(), voiceAssistantLoggingContext.getRequestedUri(), voiceAssistantLoggingContext.getUserId()});
                        ((lv41) bmk1Var).c.c(voiceAssistantLoggingContext);
                        completableA = CompletableEmpty.a;
                        completableA.getClass();
                    }
                    map.remove(uri);
                } else {
                    Logger.k("playPreparedUri called before searchAndPrepare returned result. Will play once search returns.", new Object[0]);
                    gyv0Var.b = true;
                    completableA = CompletableEmpty.a;
                    completableA.getClass();
                }
                return completableA.p(new ilh1(tp7Var2, voiceAssistantLoggingContext, (byte) 14));
        }
    }

    public mxa1 b(Context context, jik1 jik1Var) {
        k670 k670VarA = l670.a();
        e670 e670Var = x970.f;
        e670Var.getClass();
        k670VarA.d = e670Var;
        k670VarA.d(k570.e);
        k670VarA.c = op71.u(k670VarA.c, x970.e);
        de70 de70VarU = op71.u(k670VarA.c, new m670());
        k670VarA.c = de70VarU;
        k670VarA.c = op71.u(de70VarU, (da70) this.f);
        k670VarA.h = (d4b1) this.h;
        k670VarA.f = new dh30(new e4b1(), new h5a1(jik1Var), (byte) 22);
        k670VarA.g = new i870(jik1Var);
        x970 x970Var = (x970) this.g;
        fe70 fe70Var = x970Var.a;
        t570 t570Var = new t570(fe70Var, h970.f);
        c670 c670Var = x970Var.b;
        t570 t570Var2 = new t570(fe70Var, eb70.Z);
        t570 t570Var3 = new t570(fe70Var, ac70.b);
        t570 t570Var4 = new t570(fe70Var, z670.g);
        c670 c670Var2 = x970Var.c;
        c670 c670Var3 = x970Var.d;
        u870[] u870VarArr = u870.c;
        t570 t570Var5 = new t570(fe70Var, t870.b);
        g870[] g870VarArr = g870.b;
        c670 c670VarP = w361.p(new c670[]{t570Var, c670Var, t570Var2, t570Var3, t570Var4, c670Var2, c670Var3, t570Var5, new t570(fe70Var, f870.c), new t570(fe70Var, z870.a)});
        SparseArray sparseArray = (SparseArray) k570.d.a();
        j3v j3vVar = new j3v();
        j3vVar.g(sparseArray);
        k670VarA.e = w361.p(new c670[]{c670VarP, new le70((SparseArray) j3vVar.b)});
        return new mxa1((Object) context, (Object) k670VarA, (Object) jik1Var, this.b, this.d, this.e, (String) this.c, (byte) 1);
    }

    public List c() {
        return o7h.l1(((Map) this.h).values());
    }

    public boolean d(int i) {
        Header header;
        return i == 1 && (header = ((wab) this.e).c) != null && header.getImageUrl().length() > 0;
    }

    public void e(ConstraintLayout constraintLayout, ImageView imageView, int i) {
        int measuredWidth = imageView.getMeasuredWidth();
        if (measuredWidth == 0) {
            return;
        }
        if (((wh41) this.h) == null) {
            gks0 gks0Var = (gks0) this.d;
            this.h = new wh41(new il00(gks0.a(gks0Var.b, gks0Var.a, v2g1.b), (byte) 13), (wab) this.e, (t0i) this.f);
        }
        String str = ((jkb1) this.b).a;
        str.getClass();
        ((ohv0) ((h5a1) this.c).b).a(new khv0((String) null, "start_screen_image_loading", sqg0.J(new mmr0[]{new mmr0("status", "loading"), new mmr0("screen_width", String.valueOf(measuredWidth)), new mmr0("image_url", str)})));
        AppCompatImageView appCompatImageViewFindViewById = constraintLayout.findViewById(2131431050);
        appCompatImageViewFindViewById.setImageResource(2131233951);
        int dimensionPixelSize = constraintLayout.getResources().getDimensionPixelSize(2131167063);
        appCompatImageViewFindViewById.getLayoutParams().width = dimensionPixelSize;
        appCompatImageViewFindViewById.getLayoutParams().height = dimensionPixelSize;
        appCompatImageViewFindViewById.requestLayout();
        kil kilVar = new kil();
        kilVar.f(constraintLayout);
        kilVar.e(2131431050, 3);
        kilVar.b(constraintLayout);
        ixg ixgVarF = ((gw70) this.g).f(str);
        ixgVarF.s(new ikb1(measuredWidth, i));
        ixgVarF.k(imageView, (wh41) this.h);
    }

    public y0h1 g(int i) {
        y0h1 y0h1Var = (y0h1) ((Map) this.h).get(Integer.valueOf(i));
        if (y0h1Var != null) {
            return y0h1Var;
        }
        mxa1 mxa1Var = (mxa1) this.d;
        if (mxa1Var != null) {
            return mxa1Var.g(i);
        }
        return null;
    }

    public void h(String str) {
        ((wh41) this.f).k("com.crashlytics.version-control-info", str);
    }

    public void i(String str) {
        Map mapUnmodifiableMap;
        List listUnmodifiableList;
        synchronized (((String) this.c)) {
            this.c = str;
            ava0 ava0Var = (ava0) ((AtomicMarkableReference) ((wh41) this.e).c).getReference();
            synchronized (ava0Var) {
                mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(ava0Var.a));
            }
            xaz0 xaz0Var = (xaz0) this.g;
            synchronized (xaz0Var) {
                listUnmodifiableList = Collections.unmodifiableList(new ArrayList((ArrayList) xaz0Var.b));
            }
            ((djn) ((uo5) this.d).c).a(new m2d(this, str, mapUnmodifiableMap, listUnmodifiableList, (byte) 28));
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:103:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:105:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:106:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:107:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:110:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:112:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:117:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:122:0x0313  */
    /* JADX WARN: Code duplicated, block: B:129:0x0330  */
    /* JADX WARN: Code duplicated, block: B:130:0x0335  */
    /* JADX WARN: Code duplicated, block: B:133:0x0341  */
    /* JADX WARN: Code duplicated, block: B:140:0x0364  */
    /* JADX WARN: Code duplicated, block: B:141:0x0367  */
    /* JADX WARN: Code duplicated, block: B:143:0x036b  */
    /* JADX WARN: Code duplicated, block: B:144:0x0370  */
    /* JADX WARN: Code duplicated, block: B:147:0x037a  */
    /* JADX WARN: Code duplicated, block: B:148:0x037f  */
    /* JADX WARN: Code duplicated, block: B:150:0x0385  */
    /* JADX WARN: Code duplicated, block: B:151:0x0391  */
    /* JADX WARN: Code duplicated, block: B:152:0x0393  */
    /* JADX WARN: Code duplicated, block: B:154:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:156:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:157:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:161:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:162:0x03be  */
    /* JADX WARN: Code duplicated, block: B:164:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:165:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:167:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:169:0x03d8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:171:0x01fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x01ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0122  */
    /* JADX WARN: Code duplicated, block: B:46:0x013b  */
    /* JADX WARN: Code duplicated, block: B:49:0x016f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0177  */
    /* JADX WARN: Code duplicated, block: B:53:0x018b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x018d  */
    /* JADX WARN: Code duplicated, block: B:55:0x019b  */
    /* JADX WARN: Code duplicated, block: B:57:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:59:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:61:0x01ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:68:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:74:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:77:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ea  */
    public qx81 j(rgy0 rgy0Var, boolean z) {
        h0h1 h0h1VarC;
        jfg jfgVarN;
        Object next;
        e0h1 e0h1VarL;
        ArrayList arrayList;
        int i;
        List listL1;
        boolean zBooleanValue;
        boolean z2;
        qx81 qx81VarI0;
        g4t g4tVarP;
        int size;
        qx81 qx81VarI1;
        jfg jfgVarS;
        yv30 yv30VarA;
        e1h1 e1h1Var;
        a8b0 a8b0VarB;
        jfg jfgVarS2;
        kf30 kf30VarG;
        a8b0 a8b0VarB2;
        hyc hycVar;
        kf30 kf30VarC;
        int size2;
        int i2;
        rgy0 rgy0VarA;
        int i3;
        pgy0 pgy0Var;
        y0h1 y0h1Var;
        ogy0 ogy0Var;
        int iOrdinal;
        int i4;
        int i5;
        rgy0 rgy0VarA2;
        e1h1 f1h1Var;
        e1h1 f1h1Var2;
        byp bypVar = (byp) this.b;
        l141 l141Var = (l141) bypVar.d;
        n9r n9rVar = (n9r) bypVar.a;
        ks6 ks6Var = (ks6) bypVar.b;
        if (rgy0Var.n()) {
            if (dem1.x((zjn0) bypVar.c, rgy0Var.i).c) {
                ((d710) ((ks6) bypVar.b).g).getClass();
            }
        } else if ((rgy0Var.c & 128) == 128) {
            if (dem1.x((zjn0) bypVar.c, rgy0Var.Y).c) {
                ((d710) ((ks6) bypVar.b).g).getClass();
            }
        }
        if (!rgy0Var.n()) {
            int i6 = rgy0Var.c;
            if ((i6 & 32) == 32) {
                jfgVarN = g(rgy0Var.t);
                if (jfgVarN == null) {
                    bkz bkzVar = bkz.a;
                    h0h1VarC = bkz.c(zjz.O0, String.valueOf(rgy0Var.t), (String) this.e);
                }
            } else if ((i6 & 64) == 64) {
                String string = ((zjn0) bypVar.c).getString(rgy0Var.X);
                Iterator it = c().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!u890.j(((y0h1) next).getName().b(), string));
                y0h1 y0h1Var2 = (y0h1) next;
                if (y0h1Var2 == null) {
                    bkz bkzVar2 = bkz.a;
                    h0h1VarC = bkz.c(zjz.P0, string, n9rVar.toString());
                } else {
                    jfgVarN = y0h1Var2;
                }
            } else if ((i6 & 128) == 128) {
                jfgVarN = (jfg) ((ffr) this.g).invoke(Integer.valueOf(rgy0Var.Y));
                if (jfgVarN == null) {
                    jfgVarN = n(this, rgy0Var, rgy0Var.Y);
                }
            } else {
                bkz bkzVar3 = bkz.a;
                h0h1VarC = bkz.c(zjz.R0, new String[0]);
            }
            boolean z3 = true;
            if (bkz.e(h0h1VarC.s())) {
                bkz bkzVar4 = bkz.a;
                return bkz.d(zjz.W0, z6x.a, h0h1VarC, (String[]) Arrays.copyOf(new String[]{h0h1VarC.toString()}, 1));
            }
            nht nhtVar = new nht((s1c1) ks6Var.a, new vqb0(this, rgy0Var, (byte) 8));
            e0h1VarL = l((List) ks6Var.Q0, nhtVar);
            ArrayList arrayListK = k(rgy0Var, this);
            arrayList = new ArrayList(q7h.U(arrayListK, 10));
            i = 0;
            for (Object obj : arrayListK) {
                i3 = i + 1;
                if (i >= 0) {
                    p7h.T();
                    throw null;
                }
                pgy0Var = (pgy0) obj;
                y0h1Var = (y0h1) o7h.t0(i, h0h1VarC.getParameters());
                ogy0Var = pgy0Var.c;
                if (ogy0Var == ogy0.STAR) {
                    iOrdinal = ogy0Var.ordinal();
                    if (iOrdinal != 0) {
                        i4 = 3;
                        if (iOrdinal != 1) {
                            if (iOrdinal != 2) {
                                if (iOrdinal != 3) {
                                    eg.o();
                                    return null;
                                }
                                hhg1.g(ogy0Var, "Only IN, OUT and INV are supported. Actual argument: ");
                                return null;
                            }
                            i4 = 1;
                        }
                    } else {
                        i4 = 2;
                    }
                    i5 = pgy0Var.b;
                    if ((i5 & 2) == 2) {
                        rgy0VarA2 = pgy0Var.d;
                    } else if ((i5 & 4) == 4) {
                        rgy0VarA2 = l141Var.a(pgy0Var.e);
                    } else {
                        rgy0VarA2 = null;
                    }
                    if (rgy0VarA2 == null) {
                        f1h1Var2 = new f1h1(1, bkz.b(zjz.b1, pgy0Var.toString()));
                    } else {
                        f1h1Var = new f1h1(i4, m(rgy0VarA2));
                        f1h1Var2 = f1h1Var;
                    }
                } else if (y0h1Var == null) {
                    f1h1Var2 = new ohb1(((zim0) ks6Var.b).e());
                } else {
                    f1h1Var = new phb1(y0h1Var);
                    f1h1Var2 = f1h1Var;
                }
                arrayList.add(f1h1Var2);
                i = i3;
            }
            listL1 = o7h.l1(arrayList);
            jfg jfgVarS3 = h0h1VarC.s();
            if (z || !(jfgVarS3 instanceof jit)) {
                zBooleanValue = no20.a.d(rgy0Var.Q0).booleanValue();
                z2 = rgy0Var.e;
                if (zBooleanValue) {
                    size = h0h1VarC.getParameters().size() - listL1.size();
                    if (size == 0) {
                        qx81VarI1 = y3o1.i0(listL1, e0h1VarL, h0h1VarC, z2);
                        jfgVarS = qx81VarI1.t0().s();
                        if (jfgVarS == null && (jfgVarS instanceof beg) && g6b0.K(jfgVarS)) {
                            int i7 = kht.a;
                            yv30VarA = kbb.A(iht.f(jfgVarS));
                        } else {
                            yv30VarA = null;
                        }
                        if (u890.j(yv30VarA, uv30.d) || (e1h1Var = (e1h1) o7h.C0(kbb.D(qx81VarI1))) == null || (a8b0VarB = e1h1Var.b()) == null) {
                            qx81VarI1 = null;
                        } else {
                            jfgVarS2 = a8b0VarB.t0().s();
                            if (jfgVarS2 != null) {
                                kf30VarG = kht.g(jfgVarS2);
                            } else {
                                kf30VarG = null;
                            }
                            if (a8b0VarB.r0().size() == 1 && (u890.j(kf30VarG, sfb1.g) || u890.j(kf30VarG, m0h1.a))) {
                                a8b0VarB2 = ((e1h1) o7h.V0(a8b0VarB.r0())).b();
                                if (n9rVar instanceof hyc) {
                                    hycVar = (hyc) n9rVar;
                                } else {
                                    hycVar = null;
                                }
                                if (hycVar != null) {
                                    kf30VarC = kht.c(hycVar);
                                } else {
                                    kf30VarC = null;
                                }
                                if (u890.j(kf30VarC, y7d1.a)) {
                                    qx81VarI1 = a(qx81VarI1, a8b0VarB2);
                                } else {
                                    qx81VarI1 = a(qx81VarI1, a8b0VarB2);
                                }
                            }
                        }
                    } else if (size != 1 && (size2 = listL1.size() - 1) >= 0) {
                        qx81VarI1 = y3o1.i0(listL1, e0h1VarL, h0h1VarC.e().w(size2).g(), z2);
                    } else {
                        qx81VarI1 = null;
                    }
                    if (qx81VarI1 == null) {
                        bkz bkzVar5 = bkz.a;
                        qx81VarI0 = bkz.d(zjz.Q0, listL1, h0h1VarC, new String[0]);
                    } else {
                        qx81VarI0 = qx81VarI1;
                    }
                } else {
                    qx81VarI0 = y3o1.i0(listL1, e0h1VarL, h0h1VarC, z2);
                    if (no20.b.d(rgy0Var.Q0).booleanValue()) {
                        g4tVarP = l7c.p(qx81VarI0, true);
                        if (g4tVarP == null) {
                            t8e1.m(qx81VarI0, "null DefinitelyNotNullType for '");
                            return null;
                        }
                        qx81VarI0 = g4tVarP;
                    }
                }
            } else {
                jit jitVar = (jit) jfgVarS3;
                sjb sjbVar = new sjb((byte) 28);
                List parameters = jitVar.i.getParameters();
                ArrayList arrayList2 = new ArrayList(q7h.U(parameters, 10));
                Iterator it2 = parameters.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((y0h1) it2.next()).w1());
                }
                zsc zscVar = new zsc((Object) null, jitVar, listL1, sqg0.T(o7h.v1(arrayList2, listL1)), (byte) 25);
                e0h1.b.getClass();
                qx81 qx81VarQ = sjbVar.q(zscVar, e0h1.c, false, 0, true);
                List list = (List) ks6Var.Q0;
                ArrayList arrayListL0 = o7h.L0(nhtVar, qx81VarQ.getAnnotations());
                e0h1 e0h1VarL2 = l(list, arrayListL0.isEmpty() ? rzs0.g : new hg5(arrayListL0, (byte) 0));
                if (!o1h1.e(qx81VarQ) && !rgy0Var.e) {
                    z3 = false;
                }
                qx81VarI0 = qx81VarQ.x0(z3).z0(e0h1VarL2);
            }
            i2 = rgy0Var.c;
            if ((i2 & 1024) == 1024) {
                rgy0VarA = rgy0Var.O0;
            } else if ((i2 & 2048) == 2048) {
                rgy0VarA = l141Var.a(rgy0Var.P0);
            } else {
                rgy0VarA = null;
            }
            if (rgy0VarA != null) {
                return mue1.Y(qx81VarI0, j(rgy0VarA, false));
            }
            return qx81VarI0;
        }
        jfgVarN = (jfg) ((ffr) this.f).invoke(Integer.valueOf(rgy0Var.i));
        if (jfgVarN == null) {
            jfgVarN = n(this, rgy0Var, rgy0Var.i);
        }
        h0h1VarC = jfgVarN.g();
        boolean z4 = true;
        if (bkz.e(h0h1VarC.s())) {
            bkz bkzVar6 = bkz.a;
            return bkz.d(zjz.W0, z6x.a, h0h1VarC, (String[]) Arrays.copyOf(new String[]{h0h1VarC.toString()}, 1));
        }
        nht nhtVar2 = new nht((s1c1) ks6Var.a, new vqb0(this, rgy0Var, (byte) 8));
        e0h1VarL = l((List) ks6Var.Q0, nhtVar2);
        ArrayList arrayListK2 = k(rgy0Var, this);
        arrayList = new ArrayList(q7h.U(arrayListK2, 10));
        i = 0;
        while (r10.hasNext()) {
            i3 = i + 1;
            if (i >= 0) {
                p7h.T();
                throw null;
            }
            pgy0Var = (pgy0) obj;
            y0h1Var = (y0h1) o7h.t0(i, h0h1VarC.getParameters());
            ogy0Var = pgy0Var.c;
            if (ogy0Var == ogy0.STAR) {
                iOrdinal = ogy0Var.ordinal();
                if (iOrdinal != 0) {
                    i4 = 3;
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            if (iOrdinal != 3) {
                                eg.o();
                                return null;
                            }
                            hhg1.g(ogy0Var, "Only IN, OUT and INV are supported. Actual argument: ");
                            return null;
                        }
                        i4 = 1;
                    }
                } else {
                    i4 = 2;
                }
                i5 = pgy0Var.b;
                if ((i5 & 2) == 2) {
                    rgy0VarA2 = pgy0Var.d;
                } else if ((i5 & 4) == 4) {
                    rgy0VarA2 = l141Var.a(pgy0Var.e);
                } else {
                    rgy0VarA2 = null;
                }
                if (rgy0VarA2 == null) {
                    f1h1Var2 = new f1h1(1, bkz.b(zjz.b1, pgy0Var.toString()));
                } else {
                    f1h1Var = new f1h1(i4, m(rgy0VarA2));
                    f1h1Var2 = f1h1Var;
                }
            } else if (y0h1Var == null) {
                f1h1Var2 = new ohb1(((zim0) ks6Var.b).e());
            } else {
                f1h1Var = new phb1(y0h1Var);
                f1h1Var2 = f1h1Var;
            }
            arrayList.add(f1h1Var2);
            i = i3;
        }
        listL1 = o7h.l1(arrayList);
        jfg jfgVarS4 = h0h1VarC.s();
        if (z) {
            zBooleanValue = no20.a.d(rgy0Var.Q0).booleanValue();
            z2 = rgy0Var.e;
            if (zBooleanValue) {
                size = h0h1VarC.getParameters().size() - listL1.size();
                if (size == 0) {
                    qx81VarI1 = y3o1.i0(listL1, e0h1VarL, h0h1VarC, z2);
                    jfgVarS = qx81VarI1.t0().s();
                    if (jfgVarS == null) {
                        yv30VarA = null;
                    } else {
                        yv30VarA = null;
                    }
                    if (u890.j(yv30VarA, uv30.d)) {
                        qx81VarI1 = null;
                    } else {
                        jfgVarS2 = a8b0VarB.t0().s();
                        if (jfgVarS2 != null) {
                            kf30VarG = kht.g(jfgVarS2);
                        } else {
                            kf30VarG = null;
                        }
                        if (a8b0VarB.r0().size() == 1) {
                            a8b0VarB2 = ((e1h1) o7h.V0(a8b0VarB.r0())).b();
                            if (n9rVar instanceof hyc) {
                                hycVar = (hyc) n9rVar;
                            } else {
                                hycVar = null;
                            }
                            if (hycVar != null) {
                                kf30VarC = kht.c(hycVar);
                            } else {
                                kf30VarC = null;
                            }
                            if (u890.j(kf30VarC, y7d1.a)) {
                                qx81VarI1 = a(qx81VarI1, a8b0VarB2);
                            } else {
                                qx81VarI1 = a(qx81VarI1, a8b0VarB2);
                            }
                        }
                    }
                } else if (size != 1) {
                    qx81VarI1 = null;
                } else {
                    qx81VarI1 = y3o1.i0(listL1, e0h1VarL, h0h1VarC.e().w(size2).g(), z2);
                }
                if (qx81VarI1 == null) {
                    bkz bkzVar7 = bkz.a;
                    qx81VarI0 = bkz.d(zjz.Q0, listL1, h0h1VarC, new String[0]);
                } else {
                    qx81VarI0 = qx81VarI1;
                }
            } else {
                qx81VarI0 = y3o1.i0(listL1, e0h1VarL, h0h1VarC, z2);
                if (no20.b.d(rgy0Var.Q0).booleanValue()) {
                    g4tVarP = l7c.p(qx81VarI0, true);
                    if (g4tVarP == null) {
                        t8e1.m(qx81VarI0, "null DefinitelyNotNullType for '");
                        return null;
                    }
                    qx81VarI0 = g4tVarP;
                }
            }
        } else {
            zBooleanValue = no20.a.d(rgy0Var.Q0).booleanValue();
            z2 = rgy0Var.e;
            if (zBooleanValue) {
                size = h0h1VarC.getParameters().size() - listL1.size();
                if (size == 0) {
                    qx81VarI1 = y3o1.i0(listL1, e0h1VarL, h0h1VarC, z2);
                    jfgVarS = qx81VarI1.t0().s();
                    if (jfgVarS == null) {
                        yv30VarA = null;
                    } else {
                        yv30VarA = null;
                    }
                    if (u890.j(yv30VarA, uv30.d)) {
                        qx81VarI1 = null;
                    } else {
                        jfgVarS2 = a8b0VarB.t0().s();
                        if (jfgVarS2 != null) {
                            kf30VarG = kht.g(jfgVarS2);
                        } else {
                            kf30VarG = null;
                        }
                        if (a8b0VarB.r0().size() == 1) {
                            a8b0VarB2 = ((e1h1) o7h.V0(a8b0VarB.r0())).b();
                            if (n9rVar instanceof hyc) {
                                hycVar = (hyc) n9rVar;
                            } else {
                                hycVar = null;
                            }
                            if (hycVar != null) {
                                kf30VarC = kht.c(hycVar);
                            } else {
                                kf30VarC = null;
                            }
                            if (u890.j(kf30VarC, y7d1.a)) {
                                qx81VarI1 = a(qx81VarI1, a8b0VarB2);
                            } else {
                                qx81VarI1 = a(qx81VarI1, a8b0VarB2);
                            }
                        }
                    }
                } else if (size != 1) {
                    qx81VarI1 = null;
                } else {
                    qx81VarI1 = y3o1.i0(listL1, e0h1VarL, h0h1VarC.e().w(size2).g(), z2);
                }
                if (qx81VarI1 == null) {
                    bkz bkzVar8 = bkz.a;
                    qx81VarI0 = bkz.d(zjz.Q0, listL1, h0h1VarC, new String[0]);
                } else {
                    qx81VarI0 = qx81VarI1;
                }
            } else {
                qx81VarI0 = y3o1.i0(listL1, e0h1VarL, h0h1VarC, z2);
                if (no20.b.d(rgy0Var.Q0).booleanValue()) {
                    g4tVarP = l7c.p(qx81VarI0, true);
                    if (g4tVarP == null) {
                        t8e1.m(qx81VarI0, "null DefinitelyNotNullType for '");
                        return null;
                    }
                    qx81VarI0 = g4tVarP;
                }
            }
        }
        i2 = rgy0Var.c;
        if ((i2 & 1024) == 1024) {
            rgy0VarA = rgy0Var.O0;
        } else if ((i2 & 2048) == 2048) {
            rgy0VarA = l141Var.a(rgy0Var.P0);
        } else {
            rgy0VarA = null;
        }
        if (rgy0VarA != null) {
            return mue1.Y(qx81VarI0, j(rgy0VarA, false));
        }
        return qx81VarI0;
    }

    public a8b0 m(rgy0 rgy0Var) {
        rgy0 rgy0VarA;
        byp bypVar = (byp) this.b;
        if ((rgy0Var.c & 2) != 2) {
            return j(rgy0Var, true);
        }
        String string = ((zjn0) bypVar.c).getString(rgy0Var.f);
        qx81 qx81VarJ = j(rgy0Var, true);
        l141 l141Var = (l141) bypVar.d;
        int i = rgy0Var.c;
        if ((i & 4) == 4) {
            rgy0VarA = rgy0Var.g;
        } else {
            rgy0VarA = (i & 8) == 8 ? l141Var.a(rgy0Var.h) : null;
        }
        rgy0VarA.getClass();
        return ((eq20) ((ks6) bypVar.b).i).c(rgy0Var, string, qx81VarJ, j(rgy0VarA, true));
    }

    public void o(Intent intent) {
        boolean booleanExtra = intent.getBooleanExtra("paused", true);
        Context context = (Context) this.b;
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), 2131626345);
        f591 f591Var = f591.n;
        r2a1.u(remoteViews, context, f591Var);
        r2a1.q(remoteViews, context, booleanExtra ? yot0.c : wot0.c);
        r2a1.s(remoteViews, context, f591Var);
        p2o1.L(context, new t7b1(remoteViews, (byte) 0));
    }

    public void p(PlayerState playerState, Bitmap bitmap) {
        vku vkuVar = (vku) this.h;
        Scheduler scheduler = (Scheduler) this.g;
        vkuVar.a(rqt0.F(w0h1.h(scheduler), new xba1(this, (lnm) null, (byte) 8)).flatMap(new ks21(this, (byte) 28)).subscribeOn(scheduler).observeOn(scheduler).subscribe(new qg7(this, playerState, bitmap, (byte) 28)));
    }

    public xq81 r(Map map) {
        k670 k670Var = (k670) this.d;
        k670Var.a = new l7m0(new h570(map), (byte) 22);
        return new xq81(k670Var, (byte) 8);
    }

    public xq81 s(vgm vgmVar) {
        in8 in8Var = (in8) this.g;
        jik1 jik1Var = (jik1) this.e;
        i8h1 i8h1Var = (i8h1) this.f;
        HashMap map = new HashMap(2);
        map.put("navigate", new xn1(in8Var.a, new hl00(jik1Var, (byte) 13), i8h1Var));
        map.put("contextMenu", new ndm(vgmVar, jik1Var, new hl00(jik1Var, (byte) 13), i8h1Var, (byte) 0));
        return r(map);
    }

    public mxa1 t() {
        Context context = (Context) this.b;
        jik1 jik1Var = (jik1) this.e;
        r630 r630Var = (r630) this.h;
        String str = (String) this.c;
        o860 o860Var = new o860(context, jik1Var, r630Var, str);
        Context context2 = (Context) this.b;
        k670 k670Var = (k670) this.d;
        k670Var.b = o860Var;
        return new mxa1((Object) context2, (Object) k670Var, this.e, this.f, this.g, (Object) r630Var, str, (byte) 1);
    }

    public String toString() {
        switch (this.a) {
            case 5:
                String str = (String) this.c;
                mxa1 mxa1Var = (mxa1) this.d;
                return str.concat(mxa1Var == null ? "" : ". Child of ".concat((String) mxa1Var.c));
            default:
                return super.toString();
        }
    }

    public void u(Class cls, tbn1 tbn1Var) {
        HashMap map = (HashMap) this.b;
        if (!map.containsKey(cls)) {
            map.put(cls, tbn1Var);
        } else {
            String string = cls.toString();
            hhg1.n(l1d.q(new StringBuilder(string.length() + 30), "KeyCreator for ", string, " already added."));
        }
    }

    public void v(Class cls, Class cls2, ufp1 ufp1Var) {
        ggp1 ggp1Var = new ggp1(cls, cls2);
        HashMap map = (HashMap) this.d;
        if (!map.containsKey(ggp1Var)) {
            map.put(ggp1Var, new sfp1(cls, cls2, ufp1Var));
            return;
        }
        String string = cls.toString();
        String string2 = cls2.toString();
        StringBuilder sb = new StringBuilder(string2.length() + string.length() + 40 + 15);
        bb00.j(sb, "PrimitiveConstructor for ", string, " and primitive ", string2);
        q58.i(" already added.", sb);
    }

    public void w(Class cls, Class cls2, igp1 igp1Var) {
        HashMap map = (HashMap) this.c;
        if (!map.containsKey(cls)) {
            map.put(cls, new kgp1(cls2, igp1Var));
        } else {
            String string = cls.toString();
            hhg1.n(l1d.q(new StringBuilder(string.length() + 36), "PrimitiveWrapper for ", string, " already added."));
        }
    }

    public void x() {
        lqo1 lqo1Var = (lqo1) this.g;
        synchronized (lqo1Var.a) {
            try {
                WebView webView = (WebView) lqo1Var.b;
                if (webView != null) {
                    Context context = webView.getContext();
                    MutableContextWrapper mutableContextWrapper = context instanceof MutableContextWrapper ? (MutableContextWrapper) context : null;
                    if (mutableContextWrapper != null) {
                        mutableContextWrapper.setBaseContext(webView.getContext().getApplicationContext());
                    }
                    webView.stopLoading();
                    ViewParent parent = webView.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        viewGroup.removeView(webView);
                    }
                    webView.destroy();
                }
                lqo1Var.b = null;
                ayh ayhVar = (ayh) lqo1Var.c;
                if (ayhVar != null) {
                    ayhVar.d((CancellationException) null);
                }
                lqo1Var.c = null;
                xab1 xab1Var = (xab1) lqo1Var.d;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                lqo1Var.d = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void y(Class cls, bgp1 bgp1Var) {
        HashMap map = (HashMap) this.e;
        if (!map.containsKey(cls)) {
            map.put(cls, bgp1Var);
        } else {
            String string = cls.toString();
            hhg1.n(l1d.q(new StringBuilder(string.length() + 33), "KeySerializer for ", string, " already added."));
        }
    }

    public /* synthetic */ mxa1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.h = obj7;
    }

    public /* synthetic */ mxa1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, String str, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
        this.h = obj6;
        this.c = str;
    }

    public mxa1(tp7 tp7Var, PlayIntent playIntent, m210 m210Var, String str, String str2, zle1 zle1Var, t45 t45Var) {
        this.a = (byte) 8;
        this.b = tp7Var;
        this.d = playIntent;
        this.f = m210Var;
        this.c = str;
        this.e = str2;
        this.g = zle1Var;
        this.h = t45Var;
    }

    public mxa1() {
        this.a = (byte) 15;
        this.b = new HashMap();
        this.d = new HashMap();
        this.c = new HashMap();
        this.e = new HashMap();
        this.f = new HashMap();
        this.g = new HashMap();
        this.h = new HashMap();
    }

    public /* synthetic */ mxa1(String str, dmj1 dmj1Var, brk1 brk1Var, utw0 utw0Var, Context context) {
        this.a = (byte) 13;
        this.c = str;
        this.d = dmj1Var;
        this.e = brk1Var;
        this.f = utw0Var;
        this.b = context;
        this.g = new lqo1();
        this.h = new AtomicBoolean(false);
    }

    public mxa1(jkb1 jkb1Var, gks0 gks0Var, h5a1 h5a1Var, wab wabVar, t0i t0iVar, gw70 gw70Var) {
        this.a = (byte) 4;
        this.b = jkb1Var;
        this.d = gks0Var;
        this.c = h5a1Var;
        this.e = wabVar;
        this.f = t0iVar;
        this.g = gw70Var;
    }

    public mxa1(Context context, xs80 xs80Var, e26 e26Var, zrj1 zrj1Var, r2a1 r2a1Var, Scheduler scheduler) {
        this.a = (byte) 3;
        this.b = context;
        this.d = xs80Var;
        this.c = e26Var;
        this.e = zrj1Var;
        this.f = r2a1Var;
        this.g = scheduler;
        this.h = new vku();
    }

    public mxa1(i8h1 i8h1Var, z4m0 z4m0Var, x4m0 x4m0Var, y4m0 y4m0Var) {
        this.a = (byte) 10;
        this.b = i8h1Var;
        this.d = z4m0Var;
        this.c = x4m0Var;
        this.e = y4m0Var;
        this.f = new idd1(wam1.X);
        this.g = new idd1(wam1.Y);
        this.h = new idd1(wam1.t);
    }

    public mxa1(NoAnimLauncherActivity noAnimLauncherActivity, Bitmap bitmap, String str, wzn wznVar, String str2) {
        this.a = (byte) 0;
        this.h = new lxa1(this);
        this.b = noAnimLauncherActivity.getApplicationContext();
        this.d = bitmap;
        this.c = str;
        this.f = wznVar;
        this.e = str2;
    }

    public mxa1(String str, d520 d520Var, uo5 uo5Var) {
        this.a = (byte) 6;
        this.e = new wh41(this, false);
        this.f = new wh41(this, true);
        this.g = new xaz0((byte) 15);
        this.h = new AtomicMarkableReference(null, false);
        this.c = str;
        this.b = new dij0(d520Var);
        this.d = uo5Var;
    }
}
