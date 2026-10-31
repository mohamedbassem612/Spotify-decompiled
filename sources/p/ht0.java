package p;

import android.view.View;
import android.webkit.WebView;
import com.spotify.reprise.encorethemeinstaller.EncoreThemeInstaller;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ht0 implements nku {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public ht0(EncoreThemeInstaller encoreThemeInstaller, View view, v3k v3kVar) {
        this.a = (byte) 19;
        this.b = view;
        this.c = v3kVar;
    }

    public final void dispose() {
        switch (this.a) {
            case 0:
                ((iac0) this.b).getLifecycle().d((it0) this.c);
                return;
            case 1:
                dg30 dg30Var = (dg30) this.b;
                if (dg30Var != null) {
                    ((g0i) dg30Var).Y.remove((ae0) this.c);
                    return;
                }
                return;
            case 2:
                ((iac0) this.b).getLifecycle().d((ek2) this.c);
                return;
            case 3:
                ((x8c0) this.b).d((it0) this.c);
                return;
            case 4:
                q120 q120Var = ((l96) this.b).k;
                Object obj = this.c;
                synchronized (q120Var) {
                    q120Var.a.remove(obj);
                }
                return;
            case 5:
                xf6 xf6Var = (xf6) this.b;
                t480 t480Var = (t480) this.c;
                if (t480Var != null) {
                    xf6Var.b.o(t480Var, xf6.d);
                    return;
                }
                return;
            case 6:
                mbm1 mbm1Var = ((a6d) this.b).e;
                Object obj2 = this.c;
                synchronized (mbm1Var) {
                    mbm1Var.d.remove(obj2);
                }
                return;
            case 7:
                xwa xwaVar = (xwa) this.b;
                if (xwaVar.a == ((de50) this.c)) {
                    xwaVar.a = null;
                    return;
                }
                return;
            case 8:
                ((iac0) this.b).getLifecycle().d((rjd) this.c);
                return;
            case 9:
                ewe eweVar = (ewe) this.b;
                if (((Boolean) ((ven0) this.c).getValue()).booleanValue()) {
                    return;
                }
                ((i8h1) ((ynb0) eweVar.e).get()).m(((dsk0) eweVar.h).h(), (xj61) null);
                return;
            case 10:
                ((View) this.b).getViewTreeObserver().removeOnGlobalLayoutListener((ngf) this.c);
                return;
            case 11:
                ((mmf) this.b).P0.getLifecycle().d((fmf) this.c);
                return;
            case 12:
                ven0 ven0Var = (ven0) this.c;
                Set set = xag.a;
                WebView webView = (WebView) ven0Var.getValue();
                if (webView != null) {
                    webView.stopLoading();
                    webView.removeJavascriptInterface("genUiNative");
                    webView.destroy();
                }
                gag gagVar = (gag) this.b;
                if (gagVar.n) {
                    return;
                }
                gagVar.n = true;
                smo1.p(gagVar.l, (CancellationException) null);
                gagVar.m = null;
                gagVar.k.post(new w9g(gagVar, (byte) 1));
                return;
            case 13:
                View view = (View) this.b;
                szo0 szo0Var = (szo0) this.c;
                if (u890.j(view.getTag(2131430183), szo0Var)) {
                    view.setTag(2131430183, szo0Var);
                    return;
                }
                return;
            case 14:
                rph rphVar = (rph) ((ven0) this.b).getValue();
                if (rphVar.c()) {
                    ((xmh) this.c).i.c(rphVar);
                    return;
                }
                return;
            case 15:
                ((dw91) this.b).remove((String) this.c);
                return;
            case 16:
                ((hnn0) this.b).h.d((z2u) this.c);
                return;
            case 17:
                ((vqv) this.b).e.b((zau0) this.c);
                return;
            case 18:
                Function0 function0 = (Function0) this.b;
                function0.invoke();
                ipb1 ipb1Var = (ipb1) this.c;
                hd41 hd41Var = ipb1Var instanceof hd41 ? (hd41) ipb1Var : null;
                if (hd41Var == null || hd41Var.c != function0) {
                    return;
                }
                hd41Var.c = null;
                return;
            case 19:
                View view2 = (View) this.b;
                EncoreThemeInstaller.z(view2);
                v3k v3kVar = (v3k) this.c;
                nen0 nen0Var = gtl1.a;
                view2.setTag(2131427576, v3kVar);
                return;
            case 20:
                ((iac0) this.b).getLifecycle().d((ek2) this.c);
                return;
            case 21:
                ((HashMap) this.b).remove(((ee21) this.c).a.getId());
                return;
            case 22:
                ((iac0) this.b).getLifecycle().d((s760) this.c);
                return;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                ((iac0) this.b).getLifecycle().d((it0) this.c);
                return;
            case 24:
                ((ipb1) this.b).d((jc60) this.c);
                return;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                ((db80) this.b).a.k((cb80) this.c);
                return;
            case 26:
                ((dw91) this.b).remove(((rib0) this.c).a());
                return;
            case 27:
                ((hub0) this.b).c.j(this.c);
                return;
            case 28:
                ((iac0) this.b).getLifecycle().d((zzh) this.c);
                return;
            default:
                uh0 uh0Var = (uh0) this.b;
                tob1 tob1Var = (tob1) this.c;
                List list = cbc0.a;
                n1i n1iVar = (n1i) tob1Var.getValue();
                n1i n1iVar2 = n1i.a;
                if (n1iVar != n1iVar2) {
                    if (((n1i) tob1Var.getValue()) == n1i.d) {
                        uh0Var.invoke(n1i.b);
                    }
                    uh0Var.invoke(n1iVar2);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ ht0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
