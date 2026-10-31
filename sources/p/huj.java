package p;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.style.URLSpan;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public abstract class huj {
    public static final cqs0 a;

    static {
        pkx pkxVar = pkx.c;
        mmr0 mmr0Var = new mmr0("AUDIOBOOK", pkxVar);
        ilx ilxVar = ilx.c;
        mmr0 mmr0Var2 = new mmr0("CHECK", ilxVar);
        ktx ktxVar = ktx.c;
        mmr0 mmr0Var3 = new mmr0("TIME", ktxVar);
        mmr0 mmr0Var4 = new mmr0("add-podcast", sjx.c);
        mmr0 mmr0Var5 = new mmr0("addon", xjx.c);
        mmr0 mmr0Var6 = new mmr0("audiobook", pkxVar);
        mmr0 mmr0Var7 = new mmr0("background", skx.c);
        mmr0 mmr0Var8 = new mmr0("blocks", vkx.c);
        mmr0 mmr0Var9 = new mmr0("check", ilxVar);
        mmr0 mmr0Var10 = new mmr0("edit", xmx.c);
        mmr0 mmr0Var11 = new mmr0("exclamation-circle", cnx.c);
        mmr0 mmr0Var12 = new mmr0("group-session", tnx.c);
        mmr0 mmr0Var13 = new mmr0("headphones-sparkling", wnx.c);
        jox joxVar = jox.c;
        a = mqo1.t(new mmr0[]{mmr0Var, mmr0Var2, mmr0Var3, mmr0Var4, mmr0Var5, mmr0Var6, mmr0Var7, mmr0Var8, mmr0Var9, mmr0Var10, mmr0Var11, mmr0Var12, mmr0Var13, new mmr0("lightning", joxVar), new mmr0("lightning-active", joxVar), new mmr0("offline", mpx.c), new mmr0("payment", upx.c), new mmr0("plus", hrx.c), new mmr0("queue", qrx.c), new mmr0("released", xrx.c), new mmr0("soundwave", ssx.c), new mmr0("spotify-logo", wsx.c), new mmr0("time", ktxVar), new mmr0("tune", ptx.c)});
    }

    public static final af5 a(String str, iu30 iu30Var) {
        Spanned spannedFromHtml = Html.fromHtml(str, 0);
        String string = spannedFromHtml.toString();
        ye5 ye5Var = new ye5();
        ye5Var.g(string);
        URLSpan[] uRLSpanArr = (URLSpan[]) spannedFromHtml.getSpans(0, spannedFromHtml.length(), URLSpan.class);
        uRLSpanArr.getClass();
        for (URLSpan uRLSpan : uRLSpanArr) {
            int spanStart = spannedFromHtml.getSpanStart(uRLSpan);
            int spanEnd = spannedFromHtml.getSpanEnd(uRLSpan);
            String url = uRLSpan.getURL();
            ye5Var.d(new zma1(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.c, (Shadow) null, (PlatformSpanStyle) null, 61439), spanStart, spanEnd);
            url.getClass();
            ye5Var.b(new ljc0(url, (pae1) null, new uhg(iu30Var, url, (byte) 2), 2), spanStart, spanEnd);
        }
        return ye5Var.p();
    }

    public static final void b(lzn0 lzn0Var, Activity activity, ryf ryfVar, zxf zxfVar, String str, tv80 tv80Var) {
        if (nhc1.Y(str, "spotify:", false)) {
            lzn0Var.f(new dwn0(str, "", false, false, 0, 0, false, (a690) null, (Bundle) null, tv80Var != null ? new bwn0(tv80Var) : null));
        } else {
            if (!ihc1.h0(str, "play.google.com", false)) {
                ryfVar.b(activity, new lyf(zxfVar, iyf.a, Uri.parse(str)));
                return;
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.setFlags(268435456);
            activity.startActivity(intent);
        }
    }

    public static final long c(String str) {
        try {
            return z4p1.e(Color.parseColor(str));
        } catch (Exception unused) {
            int i = u7h.l;
            return u7h.f;
        }
    }

    public static final boolean d(String str) {
        return nhc1.R(str, "-active", false);
    }

    public static final hux e(String str) {
        return (hux) a.getOrDefault(str, skx.c);
    }
}
