package p;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import com.google.android.recaptcha.internal.zzhm;
import com.spotify.adsdisplay.browser.inapp.InAppBrowserActivity;
import com.spotify.appauthorization.sso.AuthorizationActivity;
import com.spotify.base.java.logging.Logger;
import com.spotify.messages.InAppBrowserEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lp8 extends WebViewClient {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final /* synthetic */ Object d;

    public lp8(xil1 xil1Var) {
        this.a = (byte) 1;
        this.d = xil1Var;
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        switch (this.a) {
            case 1:
                super.doUpdateVisitedHistory(webView, str, z);
                c580 c580Var = ((xil1) this.d).b;
                if (c580Var != null) {
                    c580Var.e(str);
                }
                break;
            default:
                super.doUpdateVisitedHistory(webView, str, z);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        ValueCallback<Boolean> valueCallback;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                super.onPageFinished(webView, str);
                ((WebView) obj2).setVisibility(0);
                AuthorizationActivity authorizationActivity = (AuthorizationActivity) obj;
                if (authorizationActivity.g1) {
                    hur hurVar = authorizationActivity.s1;
                    if (hurVar == null) {
                        u890.C("authorizationLoadingIndicator");
                        throw null;
                    }
                    ProgressDialog progressDialog = (ProgressDialog) hurVar.c;
                    if (progressDialog != null) {
                        progressDialog.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                xil1 xil1Var = (xil1) this.d;
                vil1 vil1Var = (vil1) ((LinkedHashMap) obj2).get(str);
                vil1 vil1Var2 = wil1.d;
                if (vil1Var == null) {
                    vil1Var = vil1Var2;
                }
                boolean z = vil1Var instanceof vil1;
                if (z) {
                    if (vil1Var.e.equals("net::ERR_CLEARTEXT_NOT_PERMITTED")) {
                        c580 c580Var = xil1Var.b;
                        if (c580Var != null) {
                            c580Var.f(str);
                        }
                    }
                    super.onPageFinished(webView, str);
                    return;
                }
                if (!vil1Var.equals(vil1Var2)) {
                    eg.o();
                    return;
                }
                c580 c580Var2 = xil1Var.b;
                if (c580Var2 != null) {
                    t2j0 t2j0Var = c580Var2.X;
                    String str2 = c580Var2.S0;
                    InAppBrowserActivity inAppBrowserActivity = c580Var2.a;
                    inAppBrowserActivity.q0(false);
                    long jB = c580Var2.Y.b();
                    valueCallback = null;
                    if (vil1Var instanceof wil1) {
                        View view = inAppBrowserActivity.h1;
                        if (view == null) {
                            u890.C("errorView");
                            throw null;
                        }
                        view.setVisibility(8);
                        inAppBrowserActivity.H().setVisibility(0);
                        vga0 vga0Var = new vga0();
                        eqr0.K(vga0Var, "currentUrl", str);
                        uga0 uga0VarA = vga0Var.a();
                        z480 z480VarN = InAppBrowserEvent.n();
                        e4p1.u(z480VarN, 7);
                        z480VarN.y(jB);
                        z480VarN.n(c580Var2.b().b);
                        z480VarN.q(c580Var2.b().d);
                        int i = c580Var2.R0;
                        c580Var2.R0 = i + 1;
                        z480VarN.v(i);
                        z480VarN.u(inAppBrowserActivity.o0());
                        z480VarN.w(str2);
                        z480VarN.r(ihc1.c1(4600, c580Var2.b().a));
                        e4p1.t(z480VarN, uga0VarA);
                        f3o1.r(t2j0Var, z480VarN);
                    } else {
                        if (!z) {
                            eg.o();
                            return;
                        }
                        vil1 vil1Var3 = vil1Var;
                        d580 d580Var = c580Var2.h.a() instanceof twz0 ? new d580(2131963856, 2131963855) : new d580(2131963854, 2131963853);
                        TextView textView = inAppBrowserActivity.i1;
                        if (textView == null) {
                            u890.C("errorTitle");
                            throw null;
                        }
                        textView.setText(d580Var.a);
                        TextView textView2 = inAppBrowserActivity.j1;
                        if (textView2 == null) {
                            u890.C("errorMessage");
                            throw null;
                        }
                        textView2.setText(d580Var.b);
                        View view2 = inAppBrowserActivity.h1;
                        if (view2 == null) {
                            u890.C("errorView");
                            throw null;
                        }
                        view2.setVisibility(0);
                        inAppBrowserActivity.H().setVisibility(8);
                        vga0 vga0Var2 = new vga0();
                        eqr0.K(vga0Var2, "errorType", vil1Var3.f);
                        eqr0.K(vga0Var2, "errorCode", Integer.valueOf(vil1Var3.d));
                        eqr0.K(vga0Var2, "errorReason", vil1Var3.e);
                        eqr0.K(vga0Var2, "currentUrl", str);
                        uga0 uga0VarA2 = vga0Var2.a();
                        z480 z480VarN2 = InAppBrowserEvent.n();
                        e4p1.u(z480VarN2, 3);
                        z480VarN2.y(jB);
                        z480VarN2.n(c580Var2.b().b);
                        z480VarN2.r(ihc1.c1(4600, c580Var2.b().a));
                        z480VarN2.q(c580Var2.b().d);
                        int i2 = c580Var2.R0;
                        c580Var2.R0 = i2 + 1;
                        z480VarN2.v(i2);
                        z480VarN2.u(inAppBrowserActivity.o0());
                        z480VarN2.w(str2);
                        e4p1.t(z480VarN2, uga0VarA2);
                        f3o1.r(t2j0Var, z480VarN2);
                    }
                } else {
                    valueCallback = null;
                }
                y441 y441Var = xil1Var.a;
                if (((rl4) y441Var.b).a()) {
                    List<mmr0> listS = sqg0.S((Map) y441Var.c);
                    ArrayList<mmr0> arrayList = new ArrayList();
                    for (mmr0 mmr0Var : listS) {
                        String str3 = (String) mmr0Var.a;
                        List list = (List) mmr0Var.b;
                        ArrayList arrayList2 = new ArrayList(q7h.U(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(new mmr0(str3, (mmr0) it.next()));
                        }
                        r7h.W(arrayList2, arrayList);
                    }
                    for (mmr0 mmr0Var2 : arrayList) {
                        String str4 = (String) mmr0Var2.a;
                        mmr0 mmr0Var3 = (mmr0) mmr0Var2.b;
                        CookieManager cookieManager = (CookieManager) y441Var.a;
                        String str5 = (String) mmr0Var3.a;
                        String str6 = (String) mmr0Var3.b;
                        String strM = l1d.m("https://", str4);
                        if (str6 == null) {
                            str6 = "; Max-Age=-1";
                        }
                        cookieManager.setCookie(strM, xcg1.i(str5, "=", str6), valueCallback);
                    }
                }
                super.onPageFinished(webView, str);
                return;
            default:
                super.onPageFinished(webView, str);
                ((ayh) obj).m0((WebView) obj2);
                return;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                super.onPageStarted(webView, str, bitmap);
                AuthorizationActivity authorizationActivity = (AuthorizationActivity) obj;
                if (authorizationActivity.g1) {
                    hur hurVar = authorizationActivity.s1;
                    if (hurVar != null) {
                        hurVar.w();
                        return;
                    } else {
                        u890.C("authorizationLoadingIndicator");
                        throw null;
                    }
                }
                return;
            case 1:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.b;
                linkedHashMap2.clear();
                c580 c580Var = ((xil1) this.d).b;
                if (c580Var != null) {
                    c580Var.a.q0(true);
                    c580Var.U0.onNext(rih1.a);
                }
                super.onPageStarted(webView, str, bitmap);
                linkedHashMap2.putAll(linkedHashMap);
                linkedHashMap.clear();
                return;
            default:
                super.onPageStarted(webView, str, bitmap);
                return;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        CharSequence description;
        String string;
        Uri url;
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                if (webResourceError == null || (description = webResourceError.getDescription()) == null) {
                    description = "Unknown error";
                }
                if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null || (string = url.toString()) == null) {
                    string = "Unknown url";
                }
                int errorCode = webResourceError != null ? webResourceError.getErrorCode() : -1;
                Logger.d(((Object) description) + ", code: " + errorCode + ", failing url: " + string, new Object[0]);
                ((AuthorizationActivity) obj).o0(new dr8(nhz.i, ((Object) description) + ", code: " + errorCode + ", failing url: " + string, (String) null));
                break;
            case 1:
                onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
                break;
            default:
                if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                    ((ayh) obj).y0(new zzhm(tgo1.d, new ij81(webResourceError != null ? webResourceError.getErrorCode() : -1, (byte) 1), (String) null, (Exception) null));
                    break;
                }
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        switch (this.a) {
            case 1:
                ((LinkedHashMap) this.c).put(webResourceRequest.getUrl().toString(), new vil1(webResourceResponse.getStatusCode(), webResourceResponse.getReasonPhrase(), "http"));
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                break;
            default:
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        String string;
        switch (this.a) {
            case 1:
                SslCertificate certificate = sslError.getCertificate();
                if (certificate == null || (string = certificate.toString()) == null) {
                    string = "unknown";
                }
                ((LinkedHashMap) this.b).put(sslError.getUrl(), new vil1(sslError.getPrimaryError(), string, "ssl"));
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                break;
            default:
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        switch (this.a) {
            case 2:
                ij81 ij81Var = ij81.d2;
                ayh ayhVar = (ayh) this.c;
                boolean zV = ayhVar.v();
                tgo1 tgo1Var = tgo1.c;
                if (!zV) {
                    ayhVar.y0(new zzhm(tgo1Var, ij81Var, (String) null, (Exception) null));
                    return true;
                }
                mxa1 mxa1Var = (mxa1) this.d;
                mxa1Var.x();
                xrn1 xrn1Var = (xrn1) ((AtomicReference) ((utw0) mxa1Var.f).a).get();
                if (xrn1Var == null) {
                    return true;
                }
                xrn1Var.c.y0(new zzhm(tgo1Var, ij81Var, (String) null, (Exception) null));
                xrn1Var.b.g(new m95(xrn1Var, (lnm) null, (byte) 3)).q(new hf41((byte) 6), new gla0(xrn1Var, (byte) 5));
                return true;
            default:
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        switch (this.a) {
            case 0:
                AuthorizationActivity authorizationActivity = (AuthorizationActivity) this.c;
                if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) {
                    url = Uri.EMPTY;
                }
                Uri uri = Uri.parse((String) this.d);
                String string = uri.toString();
                Locale locale = Locale.ENGLISH;
                if (url.toString().toLowerCase(locale).startsWith(string.toLowerCase(locale))) {
                    String string2 = url.toString();
                    wq8 wq8Var = authorizationActivity.h1;
                    wq8Var.getClass();
                    authorizationActivity.o0(azo1.o(string2, wq8Var.e));
                    return true;
                }
                if ("accounts.spotify.com".equals(url.getAuthority())) {
                    return false;
                }
                Logger.g("Redirecting: " + uri + ", " + url, new Object[0]);
                authorizationActivity.startActivity(new Intent("android.intent.action.VIEW", url));
                return true;
            case 1:
                return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
            default:
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    public lp8(WebView webView, AuthorizationActivity authorizationActivity, String str) {
        this.a = (byte) 0;
        this.b = webView;
        this.c = authorizationActivity;
        this.d = str;
    }

    public lp8(ayh ayhVar, WebView webView, mxa1 mxa1Var) {
        this.a = (byte) 2;
        this.c = ayhVar;
        this.b = webView;
        this.d = mxa1Var;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        switch (this.a) {
            case 1:
                xil1 xil1Var = (xil1) this.d;
                if (Uri.parse(str).getScheme() != null && xil1Var.a.k(str).equals(str)) {
                    c580 c580Var = xil1Var.b;
                    if (c580Var != null ? c580Var.h(str) : false) {
                        return true;
                    }
                    if (URLUtil.isNetworkUrl(str)) {
                        return super.shouldOverrideUrlLoading(webView, str);
                    }
                    c580 c580Var2 = xil1Var.b;
                    if (c580Var2 == null) {
                        return true;
                    }
                    c580Var2.f(str);
                    return true;
                }
                xil1Var.a(str);
                return true;
            default:
                return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        switch (this.a) {
            case 1:
                super.onReceivedError(webView, i, str, str2);
                ((LinkedHashMap) this.b).put(str2, new vil1(i, str, "general"));
                break;
            default:
                super.onReceivedError(webView, i, str, str2);
                break;
        }
    }
}
