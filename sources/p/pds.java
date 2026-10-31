package p;

import android.os.Bundle;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pds {
    public static final Set a = f46.S0(new String[]{f4i1.e(nik1.o6.a, "?config=BLUEJAY_REQUEST_NOTIFICATIONS"), f4i1.e(nik1.o6.a, "?config=BLUEJAY_CONFIRMED_NOTIFICATIONS")});
    public static final Set b = f46.S0(new b3i1[]{qss0.d, rss0.e, lss0.d, lab.d, kab.d});
    public static final Set c = f46.S0(new b3i1[]{nss0.e, oab.d, pab.d});

    public static gfq0 a(gfq0 gfq0Var, int i) {
        Bundle bundle = gfq0Var.b;
        if (bundle == null) {
            eg.m("Required value was null.");
            return null;
        }
        Object objT = jhc1.t(bundle, "bluejay_confirm_params", pxk.class);
        if (objT == null) {
            eg.m("Missing ConfirmGeneration params parcelable in bundle");
            return null;
        }
        pxk pxkVar = (pxk) objT;
        pxk pxkVar2 = new pxk(pxkVar.a, pxkVar.b, pxkVar.c, pxkVar.d, pxkVar.e, pxkVar.f, pxkVar.g, pxkVar.h, pxkVar.i, pxkVar.t, pxkVar.X, pxkVar.Y, pxkVar.Z, i);
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("bluejay_confirm_params", pxkVar2);
        return new gfq0(gfq0Var.a, gfq0Var.c, bundle2);
    }
}
