package p;

import android.os.Bundle;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ni50 {
    public final Bundle a;
    public final pnv0 b;
    public final tym0 c;
    public final oto0 d;

    public ni50(Bundle bundle, pnv0 pnv0Var, tym0 tym0Var, oto0 oto0Var) {
        this.a = bundle;
        this.b = pnv0Var;
        this.c = tym0Var;
        this.d = oto0Var;
    }

    public final m6e0 a() {
        Bundle bundle = this.a;
        bi90 parcelable = bundle.getParcelable("SELECTED_GROUP_ITEM");
        String string = bundle.getString("SELECTED_GROUP_ITEM_KEY");
        if (parcelable instanceof mh90) {
            return bbp1.g(Single.just(this.c.apply(parcelable)));
        }
        if (parcelable != null || string == null || string.length() == 0) {
            return bbp1.g(Single.error(new IllegalArgumentException("No valid group provided")));
        }
        return bbp1.g(this.b.d(upn1.m(), "NOTIFICATION_SETTINGS", nik1.H2.a, this.d.a.g()).map(new vx40(string, this, (byte) 6)));
    }
}
