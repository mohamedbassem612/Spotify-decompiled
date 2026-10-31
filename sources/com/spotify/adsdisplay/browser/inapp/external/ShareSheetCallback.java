package com.spotify.adsdisplay.browser.inapp.external;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.messages.InAppBrowserEvent;
import kotlin.Metadata;
import p.a580;
import p.e4p1;
import p.eqr0;
import p.f3o1;
import p.hf71;
import p.l2p;
import p.t2j0;
import p.u890;
import p.uga0;
import p.vga0;
import p.yqg;
import p.z480;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/adsdisplay/browser/inapp/external/ShareSheetCallback;", "Lp/l2p;", "<init>", "()V", "src_main_java_com_spotify_adsdisplay_browser-browser"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ShareSheetCallback extends l2p {
    public static final /* synthetic */ int d = 0;
    public t2j0 b;
    public yqg c;

    public final void b(Context context, Intent intent) {
        CharSequence applicationLabel;
        Bundle bundleExtra = intent.getBundleExtra("com.spotify.adsdisplay.browser.inapp.external.ShareSheetCallback.SHARE_SHEET_DATA");
        hf71 hf71Var = (hf71) (bundleExtra != null ? bundleExtra.getParcelable("com.spotify.adsdisplay.browser.inapp.external.ShareSheetCallback.SHARE_SHEET_DATA") : null);
        if (hf71Var == null) {
            return;
        }
        a580 a580Var = hf71Var.b;
        ComponentName componentName = (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
        if (componentName == null) {
            return;
        }
        vga0 vga0Var = new vga0();
        eqr0.K(vga0Var, "chosenPackage", componentName.getPackageName());
        eqr0.K(vga0Var, "chosenClass", componentName.getClassName());
        try {
            applicationLabel = context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(componentName.getPackageName(), 0));
        } catch (PackageManager.NameNotFoundException e) {
            Logger.e(e, "Failed to fetch app name", new Object[0]);
            applicationLabel = null;
        }
        eqr0.K(vga0Var, "chosenLabel", applicationLabel);
        eqr0.K(vga0Var, "currentUrl", hf71Var.a);
        uga0 uga0VarA = vga0Var.a();
        z480 z480VarN = InAppBrowserEvent.n();
        e4p1.u(z480VarN, 9);
        z480VarN.n(a580Var.b);
        z480VarN.r(a580Var.a);
        z480VarN.q(a580Var.d);
        yqg yqgVar = this.c;
        if (yqgVar == null) {
            u890.C("clock");
            throw null;
        }
        z480VarN.y(yqgVar.b());
        e4p1.t(z480VarN, uga0VarA);
        t2j0 t2j0Var = this.b;
        if (t2j0Var != null) {
            f3o1.r(t2j0Var, z480VarN);
        } else {
            u890.C("eventPublisherAdapter");
            throw null;
        }
    }
}
