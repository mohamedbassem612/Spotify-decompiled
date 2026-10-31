package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Message;
import android.view.View;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xao0 extends WebChromeClient {
    public final WebView a;
    public final hcf1 b;
    public final FrameLayout c;
    public final View d;
    public final cir0 e;
    public final boolean f;
    public final boolean g;
    public final ArrayList h;
    public final WebView i;

    public xao0(WebView webView, hcf1 hcf1Var, FrameLayout frameLayout, View view, cir0 cir0Var, boolean z, boolean z2, l3n l3nVar, ArrayList arrayList) {
        this.a = webView;
        this.b = hcf1Var;
        this.c = frameLayout;
        this.d = view;
        this.e = cir0Var;
        this.f = z;
        this.g = z2;
        this.h = arrayList;
        WebView webView2 = new WebView(webView.getContext());
        webView2.setWebViewClient(l3nVar);
        this.i = webView2;
    }

    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
        return defaultVideoPoster == null ? Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888) : defaultVideoPoster;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        ((WebView.WebViewTransport) message.obj).setWebView(this.i);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        FrameLayout frameLayout = this.c;
        frameLayout.removeAllViews();
        frameLayout.setVisibility(8);
        this.a.setVisibility(0);
        if (this.g) {
            this.d.setVisibility(0);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        cir0 cir0Var;
        String[] resources = permissionRequest.getResources();
        ArrayList<String> arrayList = new ArrayList();
        for (String str : resources) {
            boolean zJ = u890.j(str, "android.webkit.resource.AUDIO_CAPTURE");
            boolean z = this.f;
            if (!zJ && !u890.j(str, "android.webkit.resource.VIDEO_CAPTURE")) {
                z = false;
            }
            if (z) {
                arrayList.add(str);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : arrayList) {
            r7h.W(u890.j(str2, "android.webkit.resource.AUDIO_CAPTURE") ? p7h.M(new String[]{"android.permission.MODIFY_AUDIO_SETTINGS", "android.permission.RECORD_AUDIO"}) : u890.j(str2, "android.webkit.resource.VIDEO_CAPTURE") ? Collections.singletonList("android.permission.CAMERA") : z6x.a, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            cir0Var = this.e;
            if (!zHasNext) {
                break;
            }
            Object next = it.next();
            if (x74.j((Context) ((Function0) cir0Var.k().b).invoke(), (String) next) != 0) {
                arrayList3.add(next);
            }
        }
        String[] strArr = (String[]) arrayList3.toArray(new String[0]);
        if (strArr.length != 0) {
            this.h.add(new vao0(this, arrayList, permissionRequest));
            cir0Var.k().s((String[]) Arrays.copyOf(strArr, strArr.length));
        } else if (arrayList.isEmpty()) {
            permissionRequest.deny();
        } else {
            permissionRequest.grant((String[]) arrayList.toArray(new String[0]));
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        if (this.g) {
            this.d.setVisibility(8);
        }
        this.a.setVisibility(8);
        FrameLayout frameLayout = this.c;
        frameLayout.setVisibility(0);
        frameLayout.addView(view);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        this.b.invoke(new wao0(1, valueCallback, ValueCallback.class, "onReceiveValue", "onReceiveValue(Ljava/lang/Object;)V", 0, (byte) 0));
        return true;
    }
}
