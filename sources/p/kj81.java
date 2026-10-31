package p;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kj81 extends mby {
    public final otu b;

    public /* synthetic */ kj81(tz01 tz01Var) {
        super(23);
        this.b = new otu((t7y) tz01Var.b);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt("E_T", ((mby) this).a);
        Bundle bundle2 = new Bundle();
        otu otuVar = this.b;
        bundle2.putBundle("A", ((bym1) otuVar.b).d());
        if (!TextUtils.isEmpty(null)) {
            bundle2.putString("B", null);
        }
        Uri uri = (Uri) otuVar.c;
        if (uri != null) {
            bundle2.putParcelable("C", uri);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle2.putString("D", null);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle2.putString("E", null);
        }
        bundle.putBundle("A", bundle2);
        return bundle;
    }
}
