package p;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dsv0 implements acr0 {
    public final gal a;
    public final Set b = dm61.z0(blc0.PREMIUM_DESTINATION, blc0.PREMIUM_DESTINATION_DRILLDOWN);

    public dsv0(gal galVar) {
        this.a = galVar;
    }

    @Override // p.acr0
    public final Set a() {
        return this.b;
    }

    @Override // p.acr0
    public final Class b() {
        return urv0.class;
    }

    @Override // p.acr0
    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        vjq0 vjq0Var;
        Uri uri = Uri.parse(String.valueOf(s4b1Var.a));
        String queryParameter = uri.getQueryParameter("imageUri");
        String queryParameter2 = uri.getQueryParameter("displayReason");
        if (queryParameter2 == null && (vjq0Var = (vjq0) intent.getParcelableExtra("push_data")) != null) {
            Set set = s4b1.f;
            queryParameter2 = Uri.parse(String.valueOf(uic.x(vjq0Var.d).a)).getQueryParameter("displayReason");
        }
        this.a.k(new anm(queryParameter2, queryParameter));
        blc0 blc0Var = s4b1Var.c;
        String strH = blc0Var == blc0.PREMIUM_DESTINATION_DRILLDOWN ? s4b1Var.h() : null;
        boolean zQ = oon1.q(s4b1Var);
        return blc0Var == blc0.PREMIUM_PREVIEW ? new bsv0(strH, c680.v(uri), zQ, (String) null, 8) : new bsv0(strH, (djw0) null, zQ, uri.getQueryParameter("override_country"), 2);
    }

    @Override // p.acr0
    public final String getDescription() {
        return "A page for loading and displaying the PDP";
    }
}
