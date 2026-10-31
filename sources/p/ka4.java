package p;

import android.app.Notification;
import android.media.RouteListingPreference;
import android.net.nsd.DiscoveryRequest;
import android.net.nsd.NsdManager;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.view.accessibility.AccessibilityEvent;
import android.view.inputmethod.TextAttribute;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class ka4 {
    public static boolean a(TextAttribute textAttribute) {
        return textAttribute.isTextSuggestionSelected();
    }

    public static final lbu b() {
        int i = Build.VERSION.SDK_INT;
        return (i >= 37 || (i >= 33 && SdkExtensions.getExtensionVersion(33) >= 22)) ? kbu.a : jbu.a;
    }

    public static void c(Notification.Action.Builder builder) {
        builder.setEmphasisHint(0);
    }

    public static final void d(v161 v161Var, AccessibilityEvent accessibilityEvent) {
        o161 o161Var = v161Var.d;
        Object objG = o161Var.a.g(z161.M);
        if (objG == null) {
            objG = null;
        }
        ck80 ck80Var = (ck80) objG;
        Object objG2 = o161Var.a.g(z161.I);
        int i = ((nbe1) (objG2 != null ? objG2 : null)) != null ? 1 : 0;
        if (ck80Var != null && ck80Var.b) {
            i |= 4;
        }
        if (ck80Var != null && ck80Var.a) {
            i |= 2;
        }
        accessibilityEvent.setTextChangeTypes(i | accessibilityEvent.getTextChangeTypes());
    }

    public static void e(Notification.Action.Builder builder) {
        builder.setStyleHint(0);
    }

    public static final void f(NsdManager nsdManager, wv4 wv4Var) {
        nsdManager.discoverServices(new DiscoveryRequest.Builder("_spotify-social-listening._tcp").setFlags(1L).build(), (Executor) n5u.c, (NsdManager.DiscoveryListener) wv4Var);
    }

    public static final RouteListingPreference g(cs31 cs31Var) {
        int i;
        RouteListingPreference.Builder builder = new RouteListingPreference.Builder();
        List list = cs31Var.a;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (true) {
            int i2 = 0;
            if (!it.hasNext()) {
                RouteListingPreference.Builder useSystemOrdering = builder.setItems(arrayList).setLinkedItemComponentName(cs31Var.b).setUseSystemOrdering(false);
                if (Build.VERSION.SDK_INT >= 37) {
                    useSystemOrdering.setMissingPermissionsComponentName(cs31Var.c);
                }
                return useSystemOrdering.build();
            }
            bs31 bs31Var = (bs31) it.next();
            RouteListingPreference.Item.Builder builder2 = new RouteListingPreference.Item.Builder(bs31Var.a);
            int iC = l1d.C(bs31Var.b);
            if (iC == 0) {
                i = 0;
            } else if (iC != 1) {
                i = 2;
                if (iC != 2) {
                    eg.o();
                    return null;
                }
            } else {
                i = 1;
            }
            RouteListingPreference.Item.Builder selectionBehavior = builder2.setSelectionBehavior(i);
            int iC2 = l1d.C(bs31Var.c);
            if (iC2 != 0) {
                if (iC2 != 1) {
                    eg.o();
                    return null;
                }
                i2 = 10000;
            }
            arrayList.add(selectionBehavior.setSubText(i2).setCustomSubtextMessage(bs31Var.d).setFlags(bs31Var.e).build());
        }
    }
}
