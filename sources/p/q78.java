package p;

import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.FacebookDialogException;
import com.facebook.FacebookException;
import com.facebook.FacebookServiceException;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class q78 extends WebViewClient {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q78(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        ProgressDialog progressDialog;
        String title;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                super.onPageFinished(webView, str);
                qd8 qd8Var = ((r78) obj).b;
                kp5 kp5Var = qd8Var.b;
                if (u890.j(Uri.parse(str).getLastPathSegment(), "success")) {
                    Observable observableJust = Observable.just(ud8.a);
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    Observable observableDelay = observableJust.delay(2L, timeUnit);
                    Boolean bool = Boolean.TRUE;
                    t881 t881Var = new t881(new y381((e3z) null, new x381(Collections.singletonList(31), sqg0.J(new mmr0[]{new mmr0("link", bool), new mmr0("name", bool), new mmr0("description", bool), new mmr0("popularity", bool), new mmr0("publisher", bool), new mmr0("language", bool), new mmr0("isExplicit", bool), new mmr0("covers", bool), new mmr0("playedTime", bool), new mmr0("numEpisodes", bool), new mmr0("consumptionOrder", bool), new mmr0("mediaTypeEnum", bool), new mmr0("inCollection", bool), new mmr0("latestPlayedEpisodeLink", bool), new mmr0("copyrights", bool), new mmr0("trailerUri", bool), new mmr0("isMusicAndTalk", bool), new mmr0("isBook", bool), new mmr0("playabilityRestriction", bool), new mmr0("isPlayable", bool), new mmr0("showOfflineState", sqg0.J(new mmr0[]{new mmr0("offline", bool), new mmr0("syncProgress", bool)}))})), 5));
                    Set set = s4b1.f;
                    ((vku) kp5Var.h).a(Observable.merge(((hr00) kp5Var.e).a.a(uic.x(((od8) kp5Var.a).a).h(), t881Var).j(new w8v0(h620.b, xfa1.b, new n8z(1))).map(ios.i), observableDelay).delay(3L, timeUnit).observeOn((Scheduler) kp5Var.d).subscribe(new wd8(kp5Var, (byte) 0)));
                }
                qd8Var.t.setVisibility(8);
                break;
            case 1:
                super.onPageFinished(webView, str);
                if (webView != null) {
                    webView.postVisualStateCallback(0L, new d9s(webView, (iu30) obj));
                }
                break;
            case 2:
            default:
                super.onPageFinished(webView, str);
                break;
            case 3:
                super.onPageFinished(webView, str);
                ail1 ail1Var = (ail1) obj;
                if (!ail1Var.t && (progressDialog = ail1Var.e) != null) {
                    progressDialog.dismiss();
                }
                FrameLayout frameLayout = ail1Var.g;
                if (frameLayout != null) {
                    frameLayout.setBackgroundColor(0);
                }
                zhl1 zhl1Var = ail1Var.d;
                if (zhl1Var != null) {
                    zhl1Var.setVisibility(0);
                }
                ImageView imageView = ail1Var.f;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                ail1Var.X = true;
                break;
            case 4:
                Logger.g("Page finished loading: ".concat(str), new Object[0]);
                ijl1 ijl1Var = (ijl1) obj;
                ijl1Var.S1.onNext(Boolean.FALSE);
                if (ijl1Var.P1) {
                    ijl1Var.P1 = false;
                } else {
                    ijl1Var.Q1 = true;
                    if (ijl1Var.a1() == fjl1.e && !ijl1Var.O1) {
                        ijl1Var.Y0(fjl1.d);
                    }
                }
                ijl1Var.f1(str);
                WebView webView2 = ijl1Var.H1;
                if (webView2 != null && (title = webView2.getTitle()) != null) {
                    ijl1Var.i1(title);
                    break;
                }
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        ProgressDialog progressDialog;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                super.onPageStarted(webView, str, bitmap);
                ((r78) obj).b.t.setVisibility(0);
                break;
            case 1:
            case 2:
            default:
                super.onPageStarted(webView, str, bitmap);
                break;
            case 3:
                wf10 wf10Var = wf10.a;
                super.onPageStarted(webView, str, bitmap);
                ail1 ail1Var = (ail1) obj;
                if (!ail1Var.t && (progressDialog = ail1Var.e) != null) {
                    progressDialog.show();
                    break;
                }
                break;
            case 4:
                ijl1 ijl1Var = (ijl1) obj;
                Logger.g("Page started loading: " + str + " (error? " + ijl1Var.O1 + ")", new Object[0]);
                ijl1Var.O1 = false;
                ijl1Var.Q1 = false;
                if (ijl1Var.a1() != fjl1.e) {
                    ijl1Var.Y0(fjl1.d);
                }
                ijl1Var.e1(str);
                ijl1Var.S1.onNext(Boolean.TRUE);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                    ((iu30) obj).invoke(new mgj0(String.valueOf(webResourceError != null ? webResourceError.getDescription() : null)));
                    break;
                }
                break;
            case 2:
                if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                    ((Function0) obj).invoke();
                    break;
                }
                break;
            case 3:
            default:
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                break;
            case 4:
                ijl1 ijl1Var = (ijl1) obj;
                if (webResourceRequest.isForMainFrame()) {
                    ijl1Var.g1(webResourceRequest, webResourceError);
                    int errorCode = webResourceError.getErrorCode();
                    CharSequence description = webResourceError.getDescription();
                    Logger.k("Error " + errorCode + " " + ((Object) description) + " when loading: " + webResourceRequest.getUrl(), new Object[0]);
                    ijl1Var.Y0(fjl1.e);
                    ijl1Var.O1 = true;
                    break;
                }
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        switch (this.a) {
            case 2:
                if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                    ((Function0) this.b).invoke();
                    break;
                }
                break;
            default:
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 2:
                if (sslErrorHandler != null) {
                    sslErrorHandler.cancel();
                }
                ((Function0) obj).invoke();
                break;
            case 3:
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                sslErrorHandler.cancel();
                ((ail1) obj).e(new FacebookDialogException(null, -11, null));
                break;
            case 4:
                Logger.k("SSL error: " + sslError, new Object[0]);
                ijl1 ijl1Var = (ijl1) obj;
                ijl1Var.h1(sslError);
                ijl1Var.Y0(fjl1.e);
                ijl1Var.O1 = true;
                sslErrorHandler.cancel();
                break;
            default:
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        int i;
        switch (this.a) {
            case 3:
                ail1 ail1Var = (ail1) this.b;
                wf10 wf10Var = wf10.a;
                Uri uri = Uri.parse(str);
                boolean z = uri.getPath() != null && Pattern.matches("^/(v\\d+\\.\\d+/)??dialog/.*", uri.getPath());
                if (!nhc1.Y(str, ail1Var.b, false)) {
                    if (nhc1.Y(str, "fbconnect://cancel", false)) {
                        ail1Var.cancel();
                        return true;
                    }
                    if (!z && !ihc1.h0(str, "touch", false)) {
                        try {
                            ail1Var.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                            return true;
                        } catch (ActivityNotFoundException unused) {
                        }
                    }
                    return false;
                }
                Bundle bundleC = ail1Var.c(str);
                String string = bundleC.getString("error");
                if (string == null) {
                    string = bundleC.getString("error_type");
                }
                String string2 = bundleC.getString("error_msg");
                if (string2 == null) {
                    string2 = bundleC.getString("error_message");
                }
                if (string2 == null) {
                    string2 = bundleC.getString("error_description");
                }
                String string3 = bundleC.getString("error_code");
                if (string3 != null && !fpi1.y(string3)) {
                    try {
                        i = Integer.parseInt(string3);
                    } catch (NumberFormatException unused2) {
                        i = -1;
                    }
                    break;
                } else {
                    i = -1;
                }
                if (fpi1.y(string) && fpi1.y(string2) && i == -1) {
                    whl1 whl1Var = ail1Var.c;
                    if (whl1Var == null || ail1Var.i) {
                        return true;
                    }
                    ail1Var.i = true;
                    whl1Var.a(bundleC, (FacebookException) null);
                    ail1Var.dismiss();
                    return true;
                }
                if (string != null && (string.equals("access_denied") || string.equals("OAuthAccessDeniedException"))) {
                    ail1Var.cancel();
                    return true;
                }
                if (i == 4201) {
                    ail1Var.cancel();
                    return true;
                }
                ail1Var.e(new FacebookServiceException(new lf10(i, string, string2), string2));
                return true;
            default:
                return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        switch (this.a) {
            case 3:
                super.onReceivedError(webView, i, str, str2);
                ((ail1) this.b).e(new FacebookDialogException(str, i, str2));
                break;
            default:
                super.onReceivedError(webView, i, str, str2);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.a) {
            case 4:
                Logger.g("shouldOverrideUrlLoading(" + webResourceRequest.getUrl() + ")", new Object[0]);
                ijl1 ijl1Var = (ijl1) this.b;
                if (ijl1Var.b1(webResourceRequest.getUrl())) {
                    return true;
                }
                ijl1Var.S1.onNext(Boolean.TRUE);
                ijl1Var.e1(webResourceRequest.getUrl().toString());
                if (!ijl1Var.Q1) {
                    ijl1Var.P1 = true;
                }
                ijl1Var.Q1 = false;
                return false;
            default:
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }
}
