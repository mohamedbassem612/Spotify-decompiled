package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class v2l1 implements acr0 {
    public static final Set f = dm61.z0("party", "party-dev", "party-staging");
    public final Context a;
    public final r45 b;
    public final ywn0 c;
    public final w2l1 d;
    public final Set e = dm61.z0(blc0.VTEC_FEATURE, blc0.VTEC_FEATURE_MODAL, blc0.VTEC_FEATURE_WITH_DATA);

    public v2l1(Context context, r45 r45Var, ywn0 ywn0Var, w2l1 w2l1Var) {
        this.a = context;
        this.b = r45Var;
        this.c = ywn0Var;
        this.d = w2l1Var;
    }

    @Override // p.acr0
    public final Set a() {
        return this.e;
    }

    @Override // p.acr0
    public final Class b() {
        return s2l1.class;
    }

    @Override // p.acr0
    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        blc0 blc0Var = s4b1Var.c;
        Uri uri = s4b1Var.a;
        boolean booleanQueryParameter = uri != null ? uri.getBooleanQueryParameter("enable_remote_debugging", false) : false;
        blc0 blc0Var2 = blc0.VTEC_FEATURE_WITH_DATA;
        String strO = blc0Var == blc0Var2 ? s4b1Var.o(1) : s4b1Var.j();
        if (strO == null) {
            strO = "";
        }
        String str = strO;
        String strJ = blc0Var == blc0Var2 ? s4b1Var.j() : null;
        boolean z = blc0Var != blc0.VTEC_FEATURE_MODAL;
        int i = xoi1.b(this.a) ? 3 : 1;
        if (this.b.a() && f.contains(str)) {
            String strConcat = "vtec-".concat(str);
            intent.putExtra("tag", strConcat);
            if (this.d.a(str)) {
                this.c.c();
                intent.putExtra("extra_fragment_tag", strConcat);
            }
        }
        String encodedQuery = null;
        int i2 = i;
        if (uri != null) {
            encodedQuery = uri.getEncodedQuery();
        }
        return new u2l1(i2, str, strJ, encodedQuery, booleanQueryParameter, z);
    }

    @Override // p.acr0
    public final e6w0 d() {
        return a6w0.a;
    }

    @Override // p.acr0
    public final String getDescription() {
        return "Vtec feature";
    }
}
